// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAppServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppServiceRequest</p>
 */
public class UpdateAppServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private java.util.Map < String, ? > config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
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
         * <p>The region ID of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef</p>
         */
        public Builder quotaId(String quotaId) {
            this.putQueryParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The application type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>LLM: the large language model (LLM) application</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>The additional configurations that are required for service deployment.</p>
         */
        public Builder config(java.util.Map < String, ? > config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The number of instances. This value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder replicas(Integer replicas) {
            this.putBodyParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The service specifications. Valid values:</p>
         * <ul>
         * <li>llama_7b_fp16</li>
         * <li>llama_7b_int8</li>
         * <li>llama_13b_fp16</li>
         * <li>llama_7b_int8</li>
         * <li>chatglm_6b_fp16</li>
         * <li>chatglm_6b_int8</li>
         * <li>chatglm2_6b_fp16</li>
         * <li>baichuan_7b_int8</li>
         * <li>baichuan_13b_fp16</li>
         * <li>baichuan_7b_fp16</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>llama_7b_fp16</p>
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
