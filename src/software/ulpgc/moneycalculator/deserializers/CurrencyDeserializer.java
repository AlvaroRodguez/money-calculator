package software.ulpgc.moneycalculator.deserializers;

import software.ulpgc.moneycalculator.model.Currency;

public interface CurrencyDeserializer {
    Currency deserialize(String currency);

}
