package software.ulpgc.moneycalculator.persistence.files;

import software.ulpgc.moneycalculator.deserializers.CurrencyDeserializer;
import software.ulpgc.moneycalculator.deserializers.TsvCurrencyDeserializer;
import software.ulpgc.moneycalculator.model.Currency;
import software.ulpgc.moneycalculator.persistence.CurrencyLoader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TsvFileCurrencyLoader implements CurrencyLoader {
    private final File file;
    private final  CurrencyDeserializer deserializer;


    public TsvFileCurrencyLoader(File file) {
        this.file = file;
        this.deserializer = new TsvCurrencyDeserializer();
    }

    @Override
    public List<Currency> load() throws IOException {
        List<Currency> result = new ArrayList<>();
        List<String> lines = Files.readAllLines(file.toPath());
        for (String line : lines)
            result.add(deserializer.deserialize(line));
        return result;
    }
}
