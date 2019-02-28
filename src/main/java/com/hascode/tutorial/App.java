package com.hascode.tutorial;

import io.ap4k.kubernetes.annotation.KubernetesApplication;
import io.ap4k.kubernetes.annotation.Mount;
import io.ap4k.kubernetes.annotation.Port;
import java.time.Instant;

@KubernetesApplication(ports = @Port(name = "http", containerPort = 8080),
    mounts = @Mount(name = "mysql-volume", path = "/var/lib/mysql")
)
public class App {

  public static void main(String[] args) {
    System.out.printf("hello world, it's %s%n", Instant.now());
  }
}
