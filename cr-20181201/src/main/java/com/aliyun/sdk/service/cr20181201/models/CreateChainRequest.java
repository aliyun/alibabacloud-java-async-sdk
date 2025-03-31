// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateChainRequest} extends {@link RequestModel}
 *
 * <p>CreateChainRequest</p>
 */
public class CreateChainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChainConfig")
    private String chainConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeExclude")
    private java.util.List<String> scopeExclude;

    private CreateChainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chainConfig = builder.chainConfig;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.scopeExclude = builder.scopeExclude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return chainConfig
     */
    public String getChainConfig() {
        return this.chainConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return scopeExclude
     */
    public java.util.List<String> getScopeExclude() {
        return this.scopeExclude;
    }

    public static final class Builder extends Request.Builder<CreateChainRequest, Builder> {
        private String regionId; 
        private String chainConfig; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String repoName; 
        private String repoNamespaceName; 
        private java.util.List<String> scopeExclude; 

        private Builder() {
            super();
        } 

        private Builder(CreateChainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chainConfig = request.chainConfig;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.repoName = request.repoName;
            this.repoNamespaceName = request.repoNamespaceName;
            this.scopeExclude = request.scopeExclude;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The configuration of the delivery chain in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>chainconfig</p>
         */
        public Builder chainConfig(String chainConfig) {
            this.putQueryParameter("ChainConfig", chainConfig);
            this.chainConfig = chainConfig;
            return this;
        }

        /**
         * <p>The description of the delivery chain.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-4cdrlqmhn4gm****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the delivery chain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>repo1</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>Repositories in which the delivery chain does not take effect.</p>
         */
        public Builder scopeExclude(java.util.List<String> scopeExclude) {
            this.putQueryParameter("ScopeExclude", scopeExclude);
            this.scopeExclude = scopeExclude;
            return this;
        }

        @Override
        public CreateChainRequest build() {
            return new CreateChainRequest(this);
        } 

    } 

}
