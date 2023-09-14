// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHealthCheckTemplateAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHealthCheckTemplateAttributeResponseBody</p>
 */
public class GetHealthCheckTemplateAttributeResponseBody extends TeaModel {
    @NameInMap("HealthCheckCodes")
    private java.util.List < String > healthCheckCodes;

    @NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @NameInMap("HealthCheckHost")
    private String healthCheckHost;

    @NameInMap("HealthCheckHttpVersion")
    private String healthCheckHttpVersion;

    @NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @NameInMap("HealthCheckPath")
    private String healthCheckPath;

    @NameInMap("HealthCheckProtocol")
    private String healthCheckProtocol;

    @NameInMap("HealthCheckTemplateId")
    private String healthCheckTemplateId;

    @NameInMap("HealthCheckTemplateName")
    private String healthCheckTemplateName;

    @NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    private GetHealthCheckTemplateAttributeResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
        this.tags = builder.tags;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHealthCheckTemplateAttributeResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder {
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
        private String requestId; 
        private java.util.List < Tags> tags; 
        private Integer unhealthyThreshold; 

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
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }

        /**
         * The port that is used for health checks.
         * <p>
         * 
         * Valid values: **0** to **65535**.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * The domain name that you want to use for health checks. Valid values:
         * <p>
         * 
         * *   **$SERVER_IP**: the private IP addresses of backend servers. If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the Application Load Balancer (ALB) instance uses the private IP addresses of backend servers for health checks.
         * *   **domain**: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).
         * 
         * > This parameter takes effect only when the `HealthCheckProtocol` parameter is set to **HTTP**.
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * The HTTP version that is used for health checks.
         * <p>
         * 
         * Valid values: **HTTP1.0** and **HTTP1.1**.
         * 
         * > This parameter takes effect only when the `HealthCheckProtocol` parameter is set to **HTTP**.
         */
        public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }

        /**
         * The interval at which health checks are performed. Unit: seconds. Valid values: **1 to 50**.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
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
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * The URL that is used for health checks.
         * <p>
         * 
         * The URL must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URL can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \" , +`. The URL must start with a forward slash (/).
         * 
         * > This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.
         */
        public Builder healthCheckPath(String healthCheckPath) {
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
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * The ID of the health check template.
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
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
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
        }

        /**
         * The timeout period of a health check. If a backend server does not respond within the specified timeout period, the backend server fails the health check. Unit: seconds.
         * <p>
         * 
         * Valid values: **1** to **300**.
         * 
         * > If the value of the `HealthCheckTimeout` parameter is smaller than that of the `HealthCheckInterval` parameter, the timeout period specified by the `HealthCheckTimeout` parameter is ignored and the value of the `HealthCheckInterval` parameter is used as the timeout period.
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
         * <p>
         * 
         * Valid values: **2** to **10**.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
         * <p>
         * 
         * Valid values: **2** to **10**.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public GetHealthCheckTemplateAttributeResponseBody build() {
            return new GetHealthCheckTemplateAttributeResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
