// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHealthCheckTemplatesResponseBody</p>
 */
public class ListHealthCheckTemplatesResponseBody extends TeaModel {
    @NameInMap("HealthCheckTemplates")
    private java.util.List < HealthCheckTemplates> healthCheckTemplates;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListHealthCheckTemplatesResponseBody(Builder builder) {
        this.healthCheckTemplates = builder.healthCheckTemplates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHealthCheckTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthCheckTemplates
     */
    public java.util.List < HealthCheckTemplates> getHealthCheckTemplates() {
        return this.healthCheckTemplates;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < HealthCheckTemplates> healthCheckTemplates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The health check templates.
         */
        public Builder healthCheckTemplates(java.util.List < HealthCheckTemplates> healthCheckTemplates) {
            this.healthCheckTemplates = healthCheckTemplates;
            return this;
        }

        /**
         * The number of entries returned per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value of **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHealthCheckTemplatesResponseBody build() {
            return new ListHealthCheckTemplatesResponseBody(this);
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class HealthCheckTemplates extends TeaModel {
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

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckTemplates(Builder builder) {
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
            this.tags = builder.tags;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckTemplates create() {
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
            private java.util.List < Tags> tags; 
            private Integer unhealthyThreshold; 

            /**
             * The HTTP status codes.
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * The port that is used for health checks.
             * <p>
             * 
             * Valid values: \*\* 0 to 65535\*\*.
             * 
             * Default value: **0**. This value indicates that the port on a backend server is used for health checks.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * The domain name that is used for health checks. Valid values:
             * <p>
             * 
             * **$SERVER_IP** (default): the private IP addresses of backend servers. If HealthCheckHost is not specified or set to $SERVER_IP, SLB uses the private IP addresses of backend servers for health checks.
             * 
             * **domain**: The domain name must be 1 to 80 characters in length and can contain letters, digits, periods (.), and hyphens (-).
             * 
             * >  This parameter takes effect only if `HealthCheckProtocol` is set to **HTTP**.
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * The HTTP version that is used for health checks.
             * <p>
             * 
             * Valid values: **HTTP 1.0** and **HTTP 1.1**.
             * 
             * Default value: **HTTP 1.1**.
             * 
             * >  This parameter takes effect only if `HealthCheckProtocol` is set to **HTTP**.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * The interval at which health checks are performed. Unit: seconds. Valid values: **1 to 50**. Default value: **2**.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The HTTP method that is used for health checks. Valid values:
             * <p>
             * 
             * *   **HEAD** (default): By default, HTTP health checks use the HEAD method.
             * *   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.
             * *   **POST**: By default, gRPC health checks use the POST method.
             * 
             * >  This parameter takes effect only if **HealthCheckProtocol** is set to **HTTP** or **gRPC**.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * The URL that is used for health checks.
             * <p>
             * 
             * The URL must be 1 to 80 characters in length and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URL can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \" , +`. The URL must start with a forward slash (/).
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * The protocol that is used for health checks. Valid values:
             * <p>
             * 
             * *   **HTTP** (default): The SLB instance sends HEAD or GET requests to a backend server to simulate access from a browser and check whether the backend server is healthy.
             * *   **TCP**: To perform TCP health checks, SLB sends SYN packets to the backend server to check whether the port of the backend server is available to receive requests.
             * *   **gRPC**: To perform gRPC health checks, SLB sends POST or GET requests to a backend server to check whether the backend server is healthy.
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
             * The timeout period for a health check response. If a backend Elastic Compute Service (ECS) instance does not return a health check response within the specified timeout period, the backend server fails the health check.
             * <p>
             * 
             * Valid values: **1 to 300**. Unit: seconds.
             * 
             * Default value: **5**.
             * 
             * >  If the value of **HealthCHeckTimeout** is smaller than the value of **HealthCheckInterval**, the value of **HealthCHeckTimeout** is ignored and the value of **HealthCheckInterval** is used.
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from **fail** to **success**.
             * <p>
             * 
             * Valid values: **2 to 10**.
             * 
             * Default value: **3**.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from **success** to **fail**.
             * <p>
             * 
             * Valid values: **2 to 10**.
             * 
             * Default value: **3**.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheckTemplates build() {
                return new HealthCheckTemplates(this);
            } 

        } 

    }
}
