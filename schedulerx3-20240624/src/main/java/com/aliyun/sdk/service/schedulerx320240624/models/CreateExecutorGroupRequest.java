// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateExecutorGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateExecutorGroupRequest</p>
 */
public class CreateExecutorGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoScale")
    private Boolean autoScale;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CmsWorkspaceId")
    private String cmsWorkspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrationType")
    private String integrationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Workers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("XAttrs")
    private String xAttrs;

    private CreateExecutorGroupRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.authType = builder.authType;
        this.autoScale = builder.autoScale;
        this.clusterId = builder.clusterId;
        this.cmsWorkspaceId = builder.cmsWorkspaceId;
        this.description = builder.description;
        this.integrationType = builder.integrationType;
        this.name = builder.name;
        this.network = builder.network;
        this.protocol = builder.protocol;
        this.workerType = builder.workerType;
        this.workers = builder.workers;
        this.xAttrs = builder.xAttrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExecutorGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return autoScale
     */
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cmsWorkspaceId
     */
    public String getCmsWorkspaceId() {
        return this.cmsWorkspaceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return integrationType
     */
    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return workerType
     */
    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * @return workers
     */
    public String getWorkers() {
        return this.workers;
    }

    /**
     * @return xAttrs
     */
    public String getXAttrs() {
        return this.xAttrs;
    }

    public static final class Builder extends Request.Builder<CreateExecutorGroupRequest, Builder> {
        private String apiKey; 
        private String authType; 
        private Boolean autoScale; 
        private String clusterId; 
        private String cmsWorkspaceId; 
        private String description; 
        private String integrationType; 
        private String name; 
        private String network; 
        private String protocol; 
        private String workerType; 
        private String workers; 
        private String xAttrs; 

        private Builder() {
            super();
        } 

        private Builder(CreateExecutorGroupRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.authType = request.authType;
            this.autoScale = request.autoScale;
            this.clusterId = request.clusterId;
            this.cmsWorkspaceId = request.cmsWorkspaceId;
            this.description = request.description;
            this.integrationType = request.integrationType;
            this.name = request.name;
            this.network = request.network;
            this.protocol = request.protocol;
            this.workerType = request.workerType;
            this.workers = request.workers;
            this.xAttrs = request.xAttrs;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putBodyParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * AutoScale.
         */
        public Builder autoScale(Boolean autoScale) {
            this.putBodyParameter("AutoScale", autoScale);
            this.autoScale = autoScale;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CmsWorkspaceId.
         */
        public Builder cmsWorkspaceId(String cmsWorkspaceId) {
            this.putBodyParameter("CmsWorkspaceId", cmsWorkspaceId);
            this.cmsWorkspaceId = cmsWorkspaceId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IntegrationType.
         */
        public Builder integrationType(String integrationType) {
            this.putBodyParameter("IntegrationType", integrationType);
            this.integrationType = integrationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putBodyParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>openclaw</p>
         */
        public Builder workerType(String workerType) {
            this.putBodyParameter("WorkerType", workerType);
            this.workerType = workerType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;address&quot;:&quot;<a href="http://47.111.188.191:18789%22%7D%5D">http://47.111.188.191:18789&quot;}]</a></p>
         */
        public Builder workers(String workers) {
            this.putBodyParameter("Workers", workers);
            this.workers = workers;
            return this;
        }

        /**
         * XAttrs.
         */
        public Builder xAttrs(String xAttrs) {
            this.putBodyParameter("XAttrs", xAttrs);
            this.xAttrs = xAttrs;
            return this;
        }

        @Override
        public CreateExecutorGroupRequest build() {
            return new CreateExecutorGroupRequest(this);
        } 

    } 

}
