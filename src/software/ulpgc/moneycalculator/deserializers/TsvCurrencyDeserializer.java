package software.ulpgc.moneycalculator.deserializers;

import software.ulpgc.moneycalculator.model.Currency;

public class TsvCurrencyDeserializer implements CurrencyDeserializer{
    @Override
    public Currency deserialize(String currency) {
        return deserialize(currency.split("\t"));
    }

    private Currency deserialize(String[] fields) {
        return fields.length > 2 ?
                new Currency(fields[0], fields[1], fields[2]) :
                new Currency(fields[0], fields[1]);
    }

}
