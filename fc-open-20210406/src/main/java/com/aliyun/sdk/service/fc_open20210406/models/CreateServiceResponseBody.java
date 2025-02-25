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

    @NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @NameInMap("role")
    private String role;

    @NameInMap("serviceId")
    private String serviceId;

    @NameInMap("serviceName")
    private String serviceName;

    @NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @NameInMap("useSLRAuthentication")
    private Boolean useSLRAuthentication;

    @NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private CreateServiceResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.internetAccess = builder.internetAccess;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.logConfig = builder.logConfig;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.role = builder.role;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.tracingConfig = builder.tracingConfig;
        this.useSLRAuthentication = builder.useSLRAuthentication;
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
     * @return ossMountConfig
     */
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
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
     * @return useSLRAuthentication
     */
    public Boolean getUseSLRAuthentication() {
        return this.useSLRAuthentication;
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
        private OSSMountConfig ossMountConfig; 
        private String role; 
        private String serviceId; 
        private String serviceName; 
        private TracingConfig tracingConfig; 
        private Boolean useSLRAuthentication; 
        private VPCConfig vpcConfig; 

        /**
         * The time when the service was created.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The description of the service.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to allow functions to access the Internet. Valid values:
         * <p>
         * 
         * *   **true**: allows functions in the specified service to access the Internet.
         * *   **false**: does not allow functions in the specified service to access the Internet.
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * The time when the service was last modified.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * The log configuration. Function Compute writes function execution logs to the specified Logstore.
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * The configuration of the NAS file system. The configurations allow functions in the specified service to access the NAS file system.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * The OSS mount configurations.
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * The RAM role that is used to grant required permissions to Function Compute. The RAM role is used in the following scenarios:
         * <p>
         * 
         * *   Sends function execution logs to your Logstore.
         * *   Generates a token for a function to access other cloud resources during function execution.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * The unique ID generated by the system for the service.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The configuration of Tracing Analysis. After Function Compute is integrated with Tracing Analysis, you can record the duration of a request in Function Compute, view the cold start time of a function, and record the execution duration of a function. For more information, see [Tracing Analysis](~~189804~~).
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * useSLRAuthentication.
         */
        public Builder useSLRAuthentication(Boolean useSLRAuthentication) {
            this.useSLRAuthentication = useSLRAuthentication;
            return this;
        }

        /**
         * The VPC configurations. The configurations allow functions in the specified service to access the specified VPC.
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
