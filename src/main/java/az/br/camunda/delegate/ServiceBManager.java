package az.br.camunda.delegate;

import az.br.camunda.entity.ServiceADTO;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceBManager implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        ServiceADTO serviceADTO =(ServiceADTO) execution.getVariable("serviceADTO");
        System.out.println(serviceADTO.getObj());
    }
}
