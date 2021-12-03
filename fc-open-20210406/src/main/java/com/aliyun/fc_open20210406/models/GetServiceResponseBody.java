// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
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

    @NameInMap("vpcConfig")
    private VPCConfig vpcConfig;


    private GetServiceResponseBody(Builder builder) {
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
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceResponseBody create() {
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
        private VPCConfig vpcConfig; 

        /**
         * <p>创建时间</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>服务描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>公网访问设置</p>
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * <p>上次更新时间</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>logConfig.</p>
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>nasConfig.</p>
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * <p>服务角色</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>服务ID</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>tracingConfig.</p>
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * <p>vpcConfig.</p>
         */
        public Builder vpcConfig(VPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

}
