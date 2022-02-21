// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChainRequest} extends {@link RequestModel}
 *
 * <p>CreateChainRequest</p>
 */
public class CreateChainRequest extends Request {
    @Query
    @NameInMap("ChainConfig")
    private String chainConfig;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    private CreateChainRequest(Builder builder) {
        super(builder);
        this.chainConfig = builder.chainConfig;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateChainRequest, Builder> {
        private String chainConfig; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String regionId; 
        private String repoName; 
        private String repoNamespaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateChainRequest response) {
            super(response);
            this.chainConfig = response.chainConfig;
            this.description = response.description;
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.regionId = response.regionId;
            this.repoName = response.repoName;
            this.repoNamespaceName = response.repoNamespaceName;
        } 

        /**
         * ChainConfig.
         */
        public Builder chainConfig(String chainConfig) {
            this.putQueryParameter("ChainConfig", chainConfig);
            this.chainConfig = chainConfig;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * RepoNamespaceName.
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        @Override
        public CreateChainRequest build() {
            return new CreateChainRequest(this);
        } 

    } 

}
