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
        private Integer unhealthyThreshold; 

        /**
         * 状态码
         */
        public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }

        /**
         * 端口
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * 域名
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * 版本
         */
        public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }

        /**
         * 间隔时间
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * 方法
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * uri
         */
        public Builder healthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * 协议
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * 健康检查模板Id
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * 名称
         */
        public Builder healthCheckTemplateName(String healthCheckTemplateName) {
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
        }

        /**
         * 超时时间
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * 健康阈值
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 不健康阈值
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public GetHealthCheckTemplateAttributeResponseBody build() {
            return new GetHealthCheckTemplateAttributeResponseBody(this);
        } 

    } 

}
