// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
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
    private String serviceName;

    @Body
    @NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @Body
    @NameInMap("vpcConfig")
    private VPCConfig vpcConfig;


    private CreateServiceRequest(Builder builder) {
        super(builder);
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

    public static final class Builder extends Request.Builder {
        private String description; 
        private Boolean internetAccess; 
        private LogConfig logConfig; 
        private NASConfig nasConfig; 
        private String role; 
        private String serviceName; 
        private TracingConfig tracingConfig; 
        private VPCConfig vpcConfig; 

        /**
         * <p>服务描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>公网访问设置</p>
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.putBodyParameter("internetAccess", internetAccess);
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * <p>logConfig.</p>
         */
        public Builder logConfig(LogConfig logConfig) {
            this.putBodyParameter("logConfig", logConfig);
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>nasConfig.</p>
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.putBodyParameter("nasConfig", nasConfig);
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * <p>服务角色</p>
         */
        public Builder role(String role) {
            this.putBodyParameter("role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>tracingConfig.</p>
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.putBodyParameter("tracingConfig", tracingConfig);
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * <p>vpcConfig.</p>
         */
        public Builder vpcConfig(VPCConfig vpcConfig) {
            this.putBodyParameter("vpcConfig", vpcConfig);
            this.vpcConfig = vpcConfig;
            return this;
        }

        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

}
