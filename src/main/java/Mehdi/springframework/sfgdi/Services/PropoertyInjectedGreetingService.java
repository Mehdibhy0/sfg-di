package Mehdi.springframework.sfgdi.Services;


import org.springframework.stereotype.Service;

@Service
public class PropoertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world Property";
    }
}
