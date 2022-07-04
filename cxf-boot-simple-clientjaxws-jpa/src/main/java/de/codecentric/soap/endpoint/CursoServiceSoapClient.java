package de.codecentric.soap.endpoint;

import org.jlsanchez.webapp.jaxws.services.Curso;
import org.jlsanchez.webapp.jaxws.services.CursoServicioWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cursoServicio")
public class CursoServiceSoapClient {


    private static final Logger LOG = LoggerFactory.getLogger(CursoServiceSoapClient.class);

    @Autowired
    private CursoServicioWs cursoServicioWs ;
    
    @Value("${webservice.client.url}")
    private String clientUrl;

    @RequestMapping(value = {"/crear", "/"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Curso crearCurso (@RequestBody Curso cursoRequest) {

        LOG.info("GET called on /cursoServicio/crear" );

        LOG.info("Calling SOAP service with URL: '" + clientUrl + "'");

       // ForecastReturn forecastReturn = weatherServiceClient.getCityForecastByZIP(GetCityForecastByZIPOutMapper.mapWeatherRequestToForecastRequest(weatherRequest));
        
        Curso respuesta = cursoServicioWs.crear(cursoRequest);
        LOG.info("Successfully called SOAP service!");
		return respuesta;

        //return GetCityForecastByZIPInMapper.mapForecastResponseToWeatherResponse(forecastReturn);
    }


   

}
