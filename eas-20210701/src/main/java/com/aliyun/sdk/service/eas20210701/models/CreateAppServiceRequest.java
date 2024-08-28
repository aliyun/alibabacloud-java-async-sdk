// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateAppServiceRequest</p>
 */
public class CreateAppServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private java.util.Map < String, ? > config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Replicas")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer replicas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceSpec;

    private CreateAppServiceRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.workspaceId = builder.workspaceId;
        this.appType = builder.appType;
        this.appVersion = builder.appVersion;
        this.config = builder.config;
        this.replicas = builder.replicas;
        this.serviceName = builder.serviceName;
        this.serviceSpec = builder.serviceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceSpec
     */
    public String getServiceSpec() {
        return this.serviceSpec;
    }

    public static final class Builder extends Request.Builder<CreateAppServiceRequest, Builder> {
        private String quotaId; 
        private String workspaceId; 
        private String appType; 
        private String appVersion; 
        private java.util.Map < String, ? > config; 
        private Integer replicas; 
        private String serviceName; 
        private String serviceSpec; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppServiceRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.workspaceId = request.workspaceId;
            this.appType = request.appType;
            this.appVersion = request.appVersion;
            this.config = request.config;
            this.replicas = request.replicas;
            this.serviceName = request.serviceName;
            this.serviceSpec = request.serviceSpec;
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
         * The application service type.
         * <p>
         * 
         * Valid values:
         * 
         * *   LLM
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
         * The number of instances.
         */
        public Builder replicas(Integer replicas) {
            this.putBodyParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * The service name.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
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
        public CreateAppServiceRequest build() {
            return new CreateAppServiceRequest(this);
        } 

    } 

}
