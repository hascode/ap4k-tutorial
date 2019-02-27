package com.hascode.tutorial;

import io.ap4k.kubernetes.annotation.KubernetesApplication;
import java.time.Instant;

@KubernetesApplication
public class App {

  public static void main(String[] args) {
    System.out.printf("hello world, it's %s%n", Instant.now());
  }
}
