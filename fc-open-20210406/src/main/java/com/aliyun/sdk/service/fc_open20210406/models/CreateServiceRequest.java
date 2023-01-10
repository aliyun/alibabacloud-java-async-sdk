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
    @NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

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
        this.ossMountConfig = builder.ossMountConfig;
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
        private OSSMountConfig ossMountConfig; 
        private String role; 
        private String serviceName; 
        private TracingConfig tracingConfig; 
        private VPCConfig vpcConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.description = request.description;
            this.internetAccess = request.internetAccess;
            this.logConfig = request.logConfig;
            this.nasConfig = request.nasConfig;
            this.ossMountConfig = request.ossMountConfig;
            this.role = request.role;
            this.serviceName = request.serviceName;
            this.tracingConfig = request.tracingConfig;
            this.vpcConfig = request.vpcConfig;
        } 

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time when the function is invoked. The format is **EEE,d MMM yyyy HH:mm:ss GMT**.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The custom request ID.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The description of the service.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to allow functions to access the Internet. Valid values:
         * <p>
         * 
         * - **true**: allows functions in the specified service to access the Internet. Default value: true.
         * - **false**: does not allow functions in the specified service to access the Internet.
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.putBodyParameter("internetAccess", internetAccess);
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * The log configuration. Function Compute writes function execution logs to the specified Logstore.
         */
        public Builder logConfig(LogConfig logConfig) {
            this.putBodyParameter("logConfig", logConfig);
            this.logConfig = logConfig;
            return this;
        }

        /**
         * The configuration of the Apsara File Storage NAS (NAS) file system. The configurations allow functions in the specified service to access the NAS file system.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.putBodyParameter("nasConfig", nasConfig);
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * The OSS mount configurations.
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.putBodyParameter("ossMountConfig", ossMountConfig);
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
            this.putBodyParameter("role", role);
            this.role = role;
            return this;
        }

        /**
         * The name of the service. The name contains only letters, digits, hyphens (-), and underscores (_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The configurations of Tracing Analysis. After Function Compute is integrated with Tracing Analysis, you can record the duration of a request in Function Compute, view the cold start time of a function, and record the execution duration of a function. For more information, see [Tracing Analysis](~~189804~~).
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.putBodyParameter("tracingConfig", tracingConfig);
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * The VPC configurations. The configurations allow functions in the specified service to access the specified VPC.
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
