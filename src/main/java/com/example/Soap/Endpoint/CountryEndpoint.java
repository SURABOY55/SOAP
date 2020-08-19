package com.example.Soap.Endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import localhost._8090.producing_web_service.Country;
import localhost._8090.producing_web_service.Currency;
import localhost._8090.producing_web_service.GetCountryRequest;
import localhost._8090.producing_web_service.GetCountryResponse;


@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8090/producing-web-service";

//    private CountryRepository countryRepository;
//
//    @Autowired
//    public CountryEndpoint(CountryRepository countryRepository) {
//        this.countryRepository = countryRepository;
//    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country nn = new Country();
        nn.setCapital("XXX");
        nn.setCurrency(Currency.GBP);
        nn.setName("XXX");
        nn.setPopulation(11111);
        response.setCountry(nn);

        return response;
    }
}