// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEdgeContainerAppRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeContainerAppRequest</p>
 */
public class CreateEdgeContainerAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckFailTimes")
    private Integer healthCheckFailTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
    private String healthCheckHost;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
    private Integer healthCheckPort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckSuccTimes")
    private Integer healthCheckSuccTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 6)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remarks")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String remarks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServicePort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 443, minimum = 80)
    private Integer servicePort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
    private Integer targetPort;

    private CreateEdgeContainerAppRequest(Builder builder) {
        super(builder);
        this.healthCheckFailTimes = builder.healthCheckFailTimes;
        this.healthCheckHost = builder.healthCheckHost;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckMethod = builder.healthCheckMethod;
        this.healthCheckPort = builder.healthCheckPort;
        this.healthCheckSuccTimes = builder.healthCheckSuccTimes;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckURI = builder.healthCheckURI;
        this.name = builder.name;
        this.remarks = builder.remarks;
        this.servicePort = builder.servicePort;
        this.targetPort = builder.targetPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeContainerAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthCheckFailTimes
     */
    public Integer getHealthCheckFailTimes() {
        return this.healthCheckFailTimes;
    }

    /**
     * @return healthCheckHost
     */
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    /**
     * @return healthCheckHttpCode
     */
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
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
     * @return healthCheckPort
     */
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * @return healthCheckSuccTimes
     */
    public Integer getHealthCheckSuccTimes() {
        return this.healthCheckSuccTimes;
    }

    /**
     * @return healthCheckTimeout
     */
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    /**
     * @return healthCheckType
     */
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * @return healthCheckURI
     */
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @return servicePort
     */
    public Integer getServicePort() {
        return this.servicePort;
    }

    /**
     * @return targetPort
     */
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public static final class Builder extends Request.Builder<CreateEdgeContainerAppRequest, Builder> {
        private Integer healthCheckFailTimes; 
        private String healthCheckHost; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private String healthCheckMethod; 
        private Integer healthCheckPort; 
        private Integer healthCheckSuccTimes; 
        private Integer healthCheckTimeout; 
        private String healthCheckType; 
        private String healthCheckURI; 
        private String name; 
        private String remarks; 
        private Integer servicePort; 
        private Integer targetPort; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeContainerAppRequest request) {
            super(request);
            this.healthCheckFailTimes = request.healthCheckFailTimes;
            this.healthCheckHost = request.healthCheckHost;
            this.healthCheckHttpCode = request.healthCheckHttpCode;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckMethod = request.healthCheckMethod;
            this.healthCheckPort = request.healthCheckPort;
            this.healthCheckSuccTimes = request.healthCheckSuccTimes;
            this.healthCheckTimeout = request.healthCheckTimeout;
            this.healthCheckType = request.healthCheckType;
            this.healthCheckURI = request.healthCheckURI;
            this.name = request.name;
            this.remarks = request.remarks;
            this.servicePort = request.servicePort;
            this.targetPort = request.targetPort;
        } 

        /**
         * HealthCheckFailTimes.
         */
        public Builder healthCheckFailTimes(Integer healthCheckFailTimes) {
            this.putBodyParameter("HealthCheckFailTimes", healthCheckFailTimes);
            this.healthCheckFailTimes = healthCheckFailTimes;
            return this;
        }

        /**
         * HealthCheckHost.
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.putBodyParameter("HealthCheckHost", healthCheckHost);
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * HealthCheckHttpCode.
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.putBodyParameter("HealthCheckHttpCode", healthCheckHttpCode);
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * HealthCheckInterval.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putBodyParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * HealthCheckMethod.
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.putBodyParameter("HealthCheckMethod", healthCheckMethod);
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * HealthCheckPort.
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.putBodyParameter("HealthCheckPort", healthCheckPort);
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * HealthCheckSuccTimes.
         */
        public Builder healthCheckSuccTimes(Integer healthCheckSuccTimes) {
            this.putBodyParameter("HealthCheckSuccTimes", healthCheckSuccTimes);
            this.healthCheckSuccTimes = healthCheckSuccTimes;
            return this;
        }

        /**
         * HealthCheckTimeout.
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putBodyParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * HealthCheckType.
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putBodyParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * HealthCheckURI.
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putBodyParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Remarks.
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder servicePort(Integer servicePort) {
            this.putBodyParameter("ServicePort", servicePort);
            this.servicePort = servicePort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder targetPort(Integer targetPort) {
            this.putBodyParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        @Override
        public CreateEdgeContainerAppRequest build() {
            return new CreateEdgeContainerAppRequest(this);
        } 

    } 

}
