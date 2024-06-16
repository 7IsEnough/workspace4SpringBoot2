package com.clearlove.config;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author promise
 * @date 2024/6/16 - 18:30
 */
public class CommonImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    List<String> imports = new ArrayList<>();
    try (InputStream is =
            CommonImportSelector.class.getClassLoader().getResourceAsStream("comomn.imports");
        BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      String line = null;
      while ((line = br.readLine()) != null) {
        imports.add(line);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

    return imports.toArray(new String[0]);
  }
}
