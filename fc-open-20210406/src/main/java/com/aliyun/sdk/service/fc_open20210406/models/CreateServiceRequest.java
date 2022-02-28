// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("internetAccess")
    private Boolean internetAccess;

    @Body
    @NameInMap("logConfig")
    private LogConfig logConfig;

    @Body
    @NameInMap("nasConfig")
    private NASConfig nasConfig;

    @Body
    @NameInMap("role")
    private String role;

    @Body
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @Body
    @NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.description = builder.description;
        this.internetAccess = builder.internetAccess;
        this.logConfig = builder.logConfig;
        this.nasConfig = builder.nasConfig;
        this.role = builder.role;
        this.serviceName = builder.serviceName;
        this.tracingConfig = builder.tracingConfig;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return internetAccess
     */
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    /**
     * @return logConfig
     */
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return nasConfig
     */
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return tracingConfig
     */
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    /**
     * @return vpcConfig
     */
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String description; 
        private Boolean internetAccess; 
        private LogConfig logConfig; 
        private NASConfig nasConfig; 
        private String role; 
        private String serviceName; 
        private TracingConfig tracingConfig; 
        private VPCConfig vpcConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest response) {
            super(response);
            this.xFcAccountId = response.xFcAccountId;
            this.xFcDate = response.xFcDate;
            this.xFcTraceId = response.xFcTraceId;
            this.description = response.description;
            this.internetAccess = response.internetAccess;
            this.logConfig = response.logConfig;
            this.nasConfig = response.nasConfig;
            this.role = response.role;
            this.serviceName = response.serviceName;
            this.tracingConfig = response.tracingConfig;
            this.vpcConfig = response.vpcConfig;
        } 

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * 服务描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 公网访问设置
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.putBodyParameter("internetAccess", internetAccess);
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * logConfig.
         */
        public Builder logConfig(LogConfig logConfig) {
            this.putBodyParameter("logConfig", logConfig);
            this.logConfig = logConfig;
            return this;
        }

        /**
         * nasConfig.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.putBodyParameter("nasConfig", nasConfig);
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * 服务角色
         */
        public Builder role(String role) {
            this.putBodyParameter("role", role);
            this.role = role;
            return this;
        }

        /**
         * 服务名称
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * tracingConfig.
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.putBodyParameter("tracingConfig", tracingConfig);
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * vpcConfig.
         */
        public Builder vpcConfig(VPCConfig vpcConfig) {
            this.putBodyParameter("vpcConfig", vpcConfig);
            this.vpcConfig = vpcConfig;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

}
