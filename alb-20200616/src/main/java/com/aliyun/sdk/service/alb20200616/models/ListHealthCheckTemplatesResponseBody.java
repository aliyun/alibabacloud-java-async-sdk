// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHealthCheckTemplatesResponseBody</p>
 */
public class ListHealthCheckTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplates")
    private java.util.List < HealthCheckTemplates> healthCheckTemplates;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The health check templates.</p>
         */
        public Builder healthCheckTemplates(java.util.List < HealthCheckTemplates> healthCheckTemplates) {
            this.healthCheckTemplates = healthCheckTemplates;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHealthCheckTemplatesResponseBody build() {
            return new ListHealthCheckTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHealthCheckTemplatesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key. The tag key can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
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
    /**
     * 
     * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHealthCheckTemplatesResponseBody</p>
     */
    public static class HealthCheckTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheckCodes")
        private java.util.List < String > healthCheckCodes;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateId")
        private String healthCheckTemplateId;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateName")
        private String healthCheckTemplateName;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
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
             * <p>The HTTP status codes that indicate healthy backend servers.</p>
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * <p>The port that is used for health checks.</p>
             * <p>Valid values: ** 0 to 65535**.</p>
             * <p>The default value is <strong>0</strong>, which specifies that the port of a backend server is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>$SERVER_IP</strong> (default): the private IP address of a backend server. If an IP address is specified, or this parameter is not specified, the ALB instance uses the private IP address of each backend server as the domain name for health checks.</li>
             * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if you set <code>HealthCheckProtocol</code> to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$_ip</p>
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * <p>The HTTP version for health checks.</p>
             * <p>Valid values: <strong>HTTP 1.0</strong> and <strong>HTTP 1.1</strong>.</p>
             * <p>Default value: <strong>HTTP 1.1</strong>.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you set <code>HealthCheckProtocol</code> to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP 1.0</p>
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed. Unit: seconds. Valid values: <strong>1 to 50</strong>. Default value: <strong>2</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The HTTP method that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>HEAD</strong> (default): By default, HTTP and HTTPS health checks use the HEAD method.</li>
             * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
             * <li><strong>POST</strong>: gRPC health checks use the POST method by default.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if you set <strong>HealthCheckProtocol</strong> to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * <p>The URL path that you want to use for health checks.</p>
             * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, the following special characters: - / . % ? # &amp;, and the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \&quot; , +</code>. The URL must start with a forward slash (/).</p>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * <p>The protocol that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong> (default): The ALB instance sends HEAD or GET requests, which simulate browser requests, to check whether the backend server is healthy.</li>
             * <li><strong>HTTPS</strong>: HTTPS health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers. HTTPS provides higher security because HTTPS supports data encryption.</li>
             * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to check whether the port of the backend server is reachable.</li>
             * <li><strong>gRPC</strong>: gRPC health checks send POST or GET requests to a backend server to check whether the backend server is healthy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * <p>The ID of the health check template.</p>
             * 
             * <strong>example:</strong>
             * <p>hct-bp1qjwo61pqz3ahltv****</p>
             */
            public Builder healthCheckTemplateId(String healthCheckTemplateId) {
                this.healthCheckTemplateId = healthCheckTemplateId;
                return this;
            }

            /**
             * <p>The name of the health check template.</p>
             * <p>The name must be 2 to 128 character characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>HealthCheckTemplate1</p>
             */
            public Builder healthCheckTemplateName(String healthCheckTemplateName) {
                this.healthCheckTemplateName = healthCheckTemplateName;
                return this;
            }

            /**
             * <p>The timeout period of a health check response. If a backend Elastic Compute Service (ECS) instance does not respond within the specified timeout period, the ECS instance fails to pass the health check.</p>
             * <p>Valid values: <strong>1 to 300</strong>. Unit: seconds.</p>
             * <p>Default value: <strong>5</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2 to 10</strong>.</p>
             * <p>Default value: <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2 to 10</strong>.</p>
             * <p>Default value: <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
