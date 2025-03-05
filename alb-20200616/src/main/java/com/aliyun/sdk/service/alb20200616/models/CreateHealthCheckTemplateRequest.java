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
 * {@link CreateHealthCheckTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateHealthCheckTemplateRequest</p>
 */
public class CreateHealthCheckTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckCodes")
    private java.util.List<String> healthCheckCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
    private String healthCheckHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
    private String healthCheckHttpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
    private String healthCheckPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
    private String healthCheckProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String healthCheckTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    private CreateHealthCheckTemplateRequest(Builder builder) {
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
        this.healthCheckTemplateName = builder.healthCheckTemplateName;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthyThreshold = builder.healthyThreshold;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHealthCheckTemplateRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder extends Request.Builder<CreateHealthCheckTemplateRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<String> healthCheckCodes; 
        private Integer healthCheckConnectPort; 
        private String healthCheckHost; 
        private String healthCheckHttpVersion; 
        private Integer healthCheckInterval; 
        private String healthCheckMethod; 
        private String healthCheckPath; 
        private String healthCheckProtocol; 
        private String healthCheckTemplateName; 
        private Integer healthCheckTimeout; 
        private Integer healthyThreshold; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private Integer unhealthyThreshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateHealthCheckTemplateRequest request) {
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
            this.healthCheckTemplateName = request.healthCheckTemplateName;
            this.healthCheckTimeout = request.healthCheckTimeout;
            this.healthyThreshold = request.healthyThreshold;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.unhealthyThreshold = request.unhealthyThreshold;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <strong>2xx</strong> HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The HTTP status codes that indicate a healthy backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.putQueryParameter("HealthCheckCodes", healthCheckCodes);
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }

        /**
         * <p>The port that is used for health checks.</p>
         * <p>Valid values: <strong>0 to 65535</strong>.</p>
         * <p>Default value: <strong>0</strong>. If you set the value to 0, the port of a backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
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
         * <p>$_ip</p>
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.putQueryParameter("HealthCheckHost", healthCheckHost);
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * <p>The HTTP version for health checks.</p>
         * <p>Valid values: <strong>HTTP 1.0</strong> and <strong>HTTP 1.1</strong>.</p>
         * <p>Default value: <strong>HTTP 1.1</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only if <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP 1.0</p>
         */
        public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
            this.putQueryParameter("HealthCheckHttpVersion", healthCheckHttpVersion);
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }

        /**
         * <p>The interval at which health checks are performed.</p>
         * <p>Valid values: <strong>1 to 50</strong>.</p>
         * <p>Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The HTTP method that is used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>HEAD</strong> (default): By default, HTTP and HTTPS health checks use the HEAD method.</li>
         * <li><strong>POST</strong>: gRPC health checks use the POST method by default.</li>
         * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.putQueryParameter("HealthCheckMethod", healthCheckMethod);
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * <p>The URL that is used for health checks.</p>
         * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, the following special characters: - / . % ? # &amp;, and the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \&quot; , +</code>. The URL must start with a forward slash (/).</p>
         * <blockquote>
         * <p> This parameter is available only if <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        public Builder healthCheckPath(String healthCheckPath) {
            this.putQueryParameter("HealthCheckPath", healthCheckPath);
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * <p>The protocol that is used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong> (default): HTTP health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers.</li>
         * <li><strong>HTTPS</strong>: The ALB instance sends HEAD or GET requests, which simulate browser requests, to check whether the backend server is healthy. HTTPS supports encryption and provides higher security than HTTP.</li>
         * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to check whether the port of the backend server is reachable.</li>
         * <li><strong>gRPC</strong>: gRPC health checks send POST or GET requests to a backend server to check whether the backend server is healthy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            this.putQueryParameter("HealthCheckProtocol", healthCheckProtocol);
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * <p>The name of the health check template.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HealthCheckTemplate1</p>
         */
        public Builder healthCheckTemplateName(String healthCheckTemplateName) {
            this.putQueryParameter("HealthCheckTemplateName", healthCheckTemplateName);
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
        }

        /**
         * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the backend server is declared unhealthy.</p>
         * <p>Valid values: <strong>1 to 300</strong>. Unit: seconds.</p>
         * <p>Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2 to 10</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2 to 10</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        @Override
        public CreateHealthCheckTemplateRequest build() {
            return new CreateHealthCheckTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateHealthCheckTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateHealthCheckTemplateRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
