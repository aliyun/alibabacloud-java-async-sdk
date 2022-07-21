// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceResponseBody</p>
 */
public class CreateServiceResponseBody extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("internetAccess")
    private Boolean internetAccess;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("logConfig")
    private LogConfig logConfig;

    @NameInMap("nasConfig")
    private NASConfig nasConfig;

    @NameInMap("role")
    private String role;

    @NameInMap("serviceId")
    private String serviceId;

    @NameInMap("serviceName")
    private String serviceName;

    @NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @NameInMap("vendorConfig")
    private VendorConfig vendorConfig;

    @NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private CreateServiceResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.internetAccess = builder.internetAccess;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.logConfig = builder.logConfig;
        this.nasConfig = builder.nasConfig;
        this.role = builder.role;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.tracingConfig = builder.tracingConfig;
        this.vendorConfig = builder.vendorConfig;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
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
     * @return vendorConfig
     */
    public VendorConfig getVendorConfig() {
        return this.vendorConfig;
    }

    /**
     * @return vpcConfig
     */
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private Boolean internetAccess; 
        private String lastModifiedTime; 
        private LogConfig logConfig; 
        private NASConfig nasConfig; 
        private String role; 
        private String serviceId; 
        private String serviceName; 
        private TracingConfig tracingConfig; 
        private VendorConfig vendorConfig; 
        private VPCConfig vpcConfig; 

        /**
         * 创建时间
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * 服务描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 公网访问设置
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * 上次更新时间
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * logConfig.
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * nasConfig.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * 服务角色
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * 服务ID
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * 服务名称
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * tracingConfig.
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * vendorConfig.
         */
        public Builder vendorConfig(VendorConfig vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }

        /**
         * vpcConfig.
         */
        public Builder vpcConfig(VPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public CreateServiceResponseBody build() {
            return new CreateServiceResponseBody(this);
        } 

    } 

}
