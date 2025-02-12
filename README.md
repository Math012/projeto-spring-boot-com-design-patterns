# [DIO](www.dio.me) - Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework

## O projeto foi implementado.

- Java 17.
- Intellij.

## Autores
- [Matheus Silva](https://github.com/Math012)

## Projeto

O projeto foi desenvolvido durante as aulas sobre design patterns com Java, implementando classes para consumir a API do ViaCep. Após finalizar o projeto, o instrutor preparou um desafio de projeto para incrementar o projeto, minha ideia inicial foi consumir outro serviço de API, agora um serviço de câmbio de moedas, implementei o FeignClient e as camadas de service e controller.


STATUS 200OK

![image](https://github.com/user-attachments/assets/e2427a78-0324-4135-b75c-d2b354c97db0)

STATUS 400 BAD REQUEST

![image](https://github.com/user-attachments/assets/73a3fa27-8497-49f0-816b-9532034e56bf)

## Classes

- FeignClient
```java
@FeignClient(name = "exchangerate", url = "https://open.er-api.com/v6/latest")
public interface ExchangeRateService {
    @GetMapping("/{de}")
    ExchangeRate consultarCambio(@PathVariable("de")String de);
}
```
- consultaCambio()
```java
@Override
    public String consultarCambio(String de, String para) {
        try {
            ExchangeRate exchangeRate = exchangeRateService.consultarCambio(de);

            Map<String, Double> rates = exchangeRate.getRates().listaDeMoedasDisponiveis();
            return "A moeda " + de + " convertida para a moeda: " + para + ", tem o valor de: " + rates.get(para)+"\n"+"data: "+exchangeRate.getTimeLastUpdateUtc();
        }catch (Exception e){
            throw new CambioException("Selecione as moedas disponíveis: MXN, EUR, BRL, BOB, CLP, CNY, COP, UYU, VEF, ARS, USD");
        }
    }
```
- ExchangeController
```java
@RestController
@RequestMapping(value = "/conversor")
public class ExchangeController {

    @Autowired
    private ExchangeServiceImpl exchangeService;

    @GetMapping("/moedas/{de}/{para}")
    public ResponseEntity<String> conversorDeMoedas(@PathVariable("de")String de, @PathVariable("para")String para){
        return ResponseEntity.ok(exchangeService.consultarCambio(de,para));
    }
}
```
