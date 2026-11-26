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
 * {@link UpdateHealthCheckTemplateAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateHealthCheckTemplateAttributeRequest</p>
 */
public class UpdateHealthCheckTemplateAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String healthCheckTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateName")
    private String healthCheckTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
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
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder extends Request.Builder<UpdateHealthCheckTemplateAttributeRequest, Builder> {
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
         * <p>A client token used to ensure the idempotence of the request.</p>
         * <p>You must generate a unique value on your client for each request. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <code>RequestId</code> of the request as the <code>ClientToken</code>. The <code>RequestId</code> of each request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Performs a dry run to check the request. The system checks for required parameters, request syntax, and business constraints without performing the operation. If the request is invalid, an error is returned. If the request is valid, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Sends a normal request. If the request is valid, a <strong>2xx HTTP</strong> status code is returned and the operation is performed.</p>
         * </li>
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
         * <p>The list of status codes that indicate a healthy state.</p>
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
         * <p>The port used for health checks. Valid values: <strong>0</strong> to <strong>65535</strong>.
         * The default value is <strong>0</strong>, which means the health check uses the backend server&quot;s port.</p>
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
         * <p>The domain name used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>$SERVER_IP</strong> (default): The private IP of a backend server. If you specify this value or leave the parameter empty, the load balancing service uses the private IP of the backend server for health checks.</p>
         * </li>
         * <li><p><strong>domain</strong>: A domain name that is 1 to 80 characters long and can contain letters, digits, periods (.), and hyphens (-).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$SERVER_IP</p>
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.putQueryParameter("HealthCheckHost", healthCheckHost);
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * <p>The HTTP version used for health checks.</p>
         * <p>Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
         * <p>Default value: <strong>HTTP1.1</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.0</p>
         */
        public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
            this.putQueryParameter("HealthCheckHttpVersion", healthCheckHttpVersion);
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }

        /**
         * <p>The interval between health checks, in seconds. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The method used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>HEAD</strong> (default): The default method for health checks on HTTP and HTTPS listeners.</p>
         * </li>
         * <li><p><strong>GET</strong>: If the response body is larger than 8 KB, it is truncated. This does not affect the health check result.</p>
         * </li>
         * <li><p><strong>POST</strong>: The default method for health checks on gRPC listeners.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the <strong>HealthCheckProtocol</strong> parameter is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
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
         * <p>The URL used for health checks.</p>
         * <p>The URL must be 1 to 80 characters long. It can contain letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), ampersands (&amp;), and the following extended characters: <code>_;~!()*[]@$^:\&quot;,+</code>.</p>
         * <p>The URL must start with a forward slash (/).</p>
         * <blockquote>
         * <p>This parameter takes effect only when the <strong>HealthCheckProtocol</strong> parameter is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
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
         * <p>The protocol used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong> (default): Checks the health of a backend server by sending an HTTP HEAD or GET request.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: Checks the health of a backend server by sending an HTTPS HEAD or GET request. HTTPS is more secure than HTTP because it encrypts data.</p>
         * </li>
         * <li><p><strong>TCP</strong>: Checks if a backend server port is reachable by sending a TCP SYN packet.</p>
         * </li>
         * <li><p><strong>gRPC</strong>: Checks the health of a backend server by sending a POST or GET request.</p>
         * </li>
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
         * <p>The health check template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hct-bp1qjwo61******</p>
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.putQueryParameter("HealthCheckTemplateId", healthCheckTemplateId);
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * <p>The name of the health check template.</p>
         * <p>The name must be 2 to 128 characters long, start with a letter, a Chinese character, or a digit, and can contain letters, Chinese characters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
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
         * <p>The timeout period, in seconds, for a health check response. A health check fails if a backend server does not respond within this period.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The number of consecutive successful health checks required to change a backend server&quot;s status from <strong>unhealthy</strong> to <strong>healthy</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
         * <p>The number of consecutive failed health checks required to change a backend server&quot;s status from <strong>healthy</strong> to <strong>unhealthy</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
        public UpdateHealthCheckTemplateAttributeRequest build() {
            return new UpdateHealthCheckTemplateAttributeRequest(this);
        } 

    } 

}
