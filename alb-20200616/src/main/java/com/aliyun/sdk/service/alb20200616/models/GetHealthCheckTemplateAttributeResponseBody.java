// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetHealthCheckTemplateAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHealthCheckTemplateAttributeResponseBody</p>
 */
public class GetHealthCheckTemplateAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckCodes")
    private java.util.List<String> healthCheckCodes;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
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
        this.resourceGroupId = builder.resourceGroupId;
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
    public java.util.List<String> getHealthCheckCodes() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder {
        private java.util.List<String> healthCheckCodes; 
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
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private Integer unhealthyThreshold; 

        /**
         * <p>The HTTP status codes that indicate a healthy backend server.</p>
         */
        public Builder healthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }

        /**
         * <p>The port that is used for health checks.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
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
         * <li><strong>$SERVER_IP</strong>: the private IP addresses of backend servers. If an IP address is specified, or this parameter is not specified, the ALB instance uses the private IP addresses of backend servers as domain names for health checks.</li>
         * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$SERVER_IP</p>
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * <p>The HTTP version for health checks.</p>
         * <p>Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <code>HealthCheckProtocol</code> to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.0</p>
         */
        public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }

        /**
         * <p>The interval at which health checks are performed. Unit: seconds. Valid values: <strong>1 to 50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>GET</p>
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * <p>The URL that is used for health checks.</p>
         * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, the following special characters: - / . % ? # &amp;, and the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \&quot; , +</code>. The URL must start with a forward slash (/).</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>HealthCheckProtocol</strong> to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
         * </blockquote>
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
         * <li><strong>HTTP</strong> (default): HTTP health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers.</li>
         * <li><strong>HTTPS</strong>: The ALB instance sends HEAD or GET requests, which simulate browser requests, to check whether the backend server is healthy. HTTPS supports encryption and provides higher security than HTTP.</li>
         * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to probe the availability of backend servers.</li>
         * <li><strong>gRPC</strong>: gRPC health checks send POST or GET requests to a backend server to probe the availability of backend servers.</li>
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
         * <p>hct-x4jazoyi6tvsq9****</p>
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * <p>The name of the health check template.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>HealthCheckTemplate1</p>
         */
        public Builder healthCheckTemplateName(String healthCheckTemplateName) {
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
        }

        /**
         * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the backend server is declared unhealthy. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DB1AFC33-DAE8-528E-AA4D-4A6AABE71945</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public GetHealthCheckTemplateAttributeResponseBody build() {
            return new GetHealthCheckTemplateAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHealthCheckTemplateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetHealthCheckTemplateAttributeResponseBody</p>
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
             * <p>The tag value. The tag value can be up to 128 characters in length, and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
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
}
