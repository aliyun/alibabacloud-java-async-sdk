// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppServiceRequest</p>
 */
public class UpdateAppServiceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("QuotaId")
    private String quotaId;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    @Body
    @NameInMap("AppType")
    private String appType;

    @Body
    @NameInMap("AppVersion")
    private String appVersion;

    @Body
    @NameInMap("Config")
    private java.util.Map < String, ? > config;

    @Body
    @NameInMap("Replicas")
    private Integer replicas;

    @Body
    @NameInMap("ServiceSpec")
    private String serviceSpec;

    private UpdateAppServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.quotaId = builder.quotaId;
        this.workspaceId = builder.workspaceId;
        this.appType = builder.appType;
        this.appVersion = builder.appVersion;
        this.config = builder.config;
        this.replicas = builder.replicas;
        this.serviceSpec = builder.serviceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return config
     */
    public java.util.Map < String, ? > getConfig() {
        return this.config;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return serviceSpec
     */
    public String getServiceSpec() {
        return this.serviceSpec;
    }

    public static final class Builder extends Request.Builder<UpdateAppServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String quotaId; 
        private String workspaceId; 
        private String appType; 
        private String appVersion; 
        private java.util.Map < String, ? > config; 
        private Integer replicas; 
        private String serviceSpec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.quotaId = request.quotaId;
            this.workspaceId = request.workspaceId;
            this.appType = request.appType;
            this.appVersion = request.appVersion;
            this.config = request.config;
            this.replicas = request.replicas;
            this.serviceSpec = request.serviceSpec;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The quota ID.
         */
        public Builder quotaId(String quotaId) {
            this.putQueryParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The application type.
         * <p>
         * 
         * Valid values:
         * 
         * *   LLM: the large language model (LLM) application
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * The application version.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * The additional configurations that are required for service deployment.
         */
        public Builder config(java.util.Map < String, ? > config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The number of instances. This value must be greater than 0.
         */
        public Builder replicas(Integer replicas) {
            this.putBodyParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * The service specifications. Valid values:
         * <p>
         * 
         * *   llama\_7b_fp16
         * *   llama\_7b_int8
         * *   llama\_13b_fp16
         * *   llama\_7b_int8
         * *   chatglm\_6b_fp16
         * *   chatglm\_6b_int8
         * *   chatglm2\_6b_fp16
         * *   baichuan\_7b_int8
         * *   baichuan\_13b_fp16
         * *   baichuan\_7b_fp16
         */
        public Builder serviceSpec(String serviceSpec) {
            this.putBodyParameter("ServiceSpec", serviceSpec);
            this.serviceSpec = serviceSpec;
            return this;
        }

        @Override
        public UpdateAppServiceRequest build() {
            return new UpdateAppServiceRequest(this);
        } 

    } 

}
