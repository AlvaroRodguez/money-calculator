package software.ulpgc.moneycalculator.persistence;

import software.ulpgc.moneycalculator.model.Currency;

import java.io.IOException;
import java.util.List;

public interface CurrencyLoader {
    List<Currency> load() throws IOException;
}
