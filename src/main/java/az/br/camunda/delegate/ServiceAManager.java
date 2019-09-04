package az.br.camunda.delegate;

import az.br.camunda.entity.ServiceADTO;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class ServiceAManager implements JavaDelegate {

    Random random = new Random();
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Service A called ...");
        execution.setVariable("serviceADTO",new ServiceADTO(0,"Success","This object received from service A"));
    }
}
