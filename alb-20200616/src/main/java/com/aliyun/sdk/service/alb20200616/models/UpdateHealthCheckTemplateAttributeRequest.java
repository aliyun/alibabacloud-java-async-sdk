// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHealthCheckTemplateAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateHealthCheckTemplateAttributeRequest</p>
 */
public class UpdateHealthCheckTemplateAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("HealthCheckCodes")
    private java.util.List < String > healthCheckCodes;

    @Query
    @NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @Query
    @NameInMap("HealthCheckHost")
    private String healthCheckHost;

    @Query
    @NameInMap("HealthCheckHttpVersion")
    private String healthCheckHttpVersion;

    @Query
    @NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @Query
    @NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @Query
    @NameInMap("HealthCheckPath")
    private String healthCheckPath;

    @Query
    @NameInMap("HealthCheckProtocol")
    private String healthCheckProtocol;

    @Query
    @NameInMap("HealthCheckTemplateId")
    @Validation(required = true)
    private String healthCheckTemplateId;

    @Query
    @NameInMap("HealthCheckTemplateName")
    private String healthCheckTemplateName;

    @Query
    @NameInMap("HealthCheckTimeout")
    @Validation(maximum = 300, minimum = 1)
    private Integer healthCheckTimeout;

    @Query
    @NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @Query
    @NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    private UpdateHealthCheckTemplateAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.healthCheckCodes = builder.healthCheckCodes;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckHost = builder.healthCheckHost;
        this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckMethod = builder.healthCheckMethod;
        this.healthCheckPath = builder.healthCheckPath;
        this.healthCheckProtocol = builder.healthCheckProtocol;
        this.healthCheckTemplateId = builder.healthCheckTemplateId;
        this.healthCheckTemplateName = builder.healthCheckTemplateName;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthyThreshold = builder.healthyThreshold;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHealthCheckTemplateAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return healthCheckCodes
     */
    public java.util.List < String > getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    /**
     * @return healthCheckConnectPort
     */
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    /**
     * @return healthCheckHost
     */
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    /**
     * @return healthCheckHttpVersion
     */
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    /**
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    /**
     * @return healthCheckMethod
     */
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    /**
     * @return healthCheckPath
     */
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * @return healthCheckProtocol
     */
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * @return healthCheckTemplateId
     */
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    /**
     * @return healthCheckTemplateName
     */
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    /**
     * @return healthCheckTimeout
     */
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder extends Request.Builder<UpdateHealthCheckTemplateAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > healthCheckCodes; 
        private Integer healthCheckConnectPort; 
        private String healthCheckHost; 
        private String healthCheckHttpVersion; 
        private Integer healthCheckInterval; 
        private String healthCheckMethod; 
        private String healthCheckPath; 
        private String healthCheckProtocol; 
        private String healthCheckTemplateId; 
        private String healthCheckTemplateName; 
        private Integer healthCheckTimeout; 
        private Integer healthyThreshold; 
        private Integer unhealthyThreshold; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHealthCheckTemplateAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.healthCheckCodes = request.healthCheckCodes;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckHost = request.healthCheckHost;
            this.healthCheckHttpVersion = request.healthCheckHttpVersion;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckMethod = request.healthCheckMethod;
            this.healthCheckPath = request.healthCheckPath;
            this.healthCheckProtocol = request.healthCheckProtocol;
            this.healthCheckTemplateId = request.healthCheckTemplateId;
            this.healthCheckTemplateName = request.healthCheckTemplateName;
            this.healthCheckTimeout = request.healthCheckTimeout;
            this.healthyThreshold = request.healthyThreshold;
            this.unhealthyThreshold = request.unhealthyThreshold;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a **2xx** HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The HTTP status codes that are used to determine whether the backend server passes the health check.
         * <p>
         * 
         * *   If **HealthCheckProtocol** is set to **HTTP**, **HealthCheckCodes** can be set to **http\_2xx** (default), **http\_3xx**, **http\_4xx**, and **http\_5xx**. Separate multiple HTTP status codes with a comma (,).
         * *   If **HealthCheckProtocol** is set to **gRPC**, **HealthCheckCodes** can be set to **0 to 99**. Default value: **0**. Value ranges are supported. You can enter up to 20 value ranges and separate them with a comma (,).
         * 
         * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.
         */
        public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
            this.putQueryParameter("HealthCheckCodes", healthCheckCodes);
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }

        /**
         * The port that is used for health checks. Valid values: **0 to 65535**. Default value: **0**. This value indicates that the port of a backend server is used for health checks.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * The domain name that you want to use for the health check. Valid values:
         * <p>
         * 
         * *   **$SERVER_IP** (default): the private IP addresses of backend servers. If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the Application Load Balancer (ALB) uses the private IP addresses of backend servers for health checks.
         * *   **domain**: The domain name must be 1 to 80 characters in length and can contain letters, digits, periods (.), and hyphens (-).
         * 
         * > This parameter is valid only if the `HealthCheckProtocol` parameter is set to **HTTP**.
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.putQueryParameter("HealthCheckHost", healthCheckHost);
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * The HTTP version that is used for health checks.
         * <p>
         * 
         * Valid values: **HTTP1.0** and **HTTP1.1**.
         * 
         * Default value: **HTTP1.1**.
         * 
         * > This parameter is valid only if the `HealthCheckProtocol` parameter is set to **HTTP**.
         */
        public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
            this.putQueryParameter("HealthCheckHttpVersion", healthCheckHttpVersion);
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }

        /**
         * The interval at which health checks are performed. Unit: seconds. Valid values: **1 to 50**. Default value: **2**.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * The method that you want to use for the health check. Valid values:
         * <p>
         * 
         * *   **HEAD**: By default, the ALB instance sends HEAD requests to a backend server to perform HTTP health checks.
         * *   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.
         * *   **POST**: gRPC health checks automatically use the POST method.
         * 
         * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.putQueryParameter("HealthCheckMethod", healthCheckMethod);
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * The URL path that is used for health checks.
         * <p>
         * 
         * The URL must be 1 to 80 characters in length and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URL can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \" , +`.
         * 
         * The URL must start with a forward slash (/).
         * 
         * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.
         */
        public Builder healthCheckPath(String healthCheckPath) {
            this.putQueryParameter("HealthCheckPath", healthCheckPath);
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * The protocol that you want to use for health checks. Valid values:
         * <p>
         * 
         * *   **HTTP** (default): To perform HTTP health checks, ALB sends HEAD or GET requests to a backend server to check whether the backend server is healthy.
         * *   **TCP**: To perform TCP health checks, ALB sends SYN packets to a backend server to check whether the port of the backend server is available to receive requests.
         * *   **gRPC**: To perform gRPC health checks, ALB sends POST or GET requests to a backend server to check whether the backend server is healthy.
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            this.putQueryParameter("HealthCheckProtocol", healthCheckProtocol);
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * The template ID.
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.putQueryParameter("HealthCheckTemplateId", healthCheckTemplateId);
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * The name of the health check template.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder healthCheckTemplateName(String healthCheckTemplateName) {
            this.putQueryParameter("HealthCheckTemplateName", healthCheckTemplateName);
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
        }

        /**
         * The timeout period of a health check. If a backend server does not respond within the specified timeout period, the backend server fails the health check.
         * <p>
         * 
         * Unit: seconds. Valid values: **1 to 300**. Default value: **5**.
         * 
         * > If the value of the `HealthCheckTimeout` parameter is smaller than that of the `HealthCheckInterval` parameter, the timeout period specified by the `HealthCheckTimeout` parameter is ignored and the value of the `HealthCheckInterval` parameter is used as the timeout period.
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
         * <p>
         * 
         * Valid values: **2 to 10**.
         * 
         * Default value: **3**.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
         * <p>
         * 
         * Valid values: **2 to 10**.
         * 
         * Default value: **3**.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        @Override
        public UpdateHealthCheckTemplateAttributeRequest build() {
            return new UpdateHealthCheckTemplateAttributeRequest(this);
        } 

    } 

}
