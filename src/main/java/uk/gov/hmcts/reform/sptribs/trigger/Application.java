package uk.gov.hmcts.reform.sptribs.trigger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import uk.gov.hmcts.reform.idam.client.IdamApi;

@SpringBootApplication
@ComponentScan(basePackages = {
    "uk.gov.hmcts.reform.idam.client",
    "uk.gov.hmcts.reform.ccd.client",
    "uk.gov.hmcts.reform.sptribs"})
@EnableFeignClients(clients = { IdamApi.class })
@SuppressWarnings("HideUtilityClassConstructor")
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
        System.exit(0);
    }
}
