// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateChainRequest} extends {@link RequestModel}
 *
 * <p>UpdateChainRequest</p>
 */
public class UpdateChainRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ChainConfig")
    @Validation(required = true)
    private String chainConfig;

    @Query
    @NameInMap("ChainId")
    @Validation(required = true)
    private String chainId;

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

    @Query
    @NameInMap("ScopeExclude")
    private java.util.List < String > scopeExclude;

    private UpdateChainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chainConfig = builder.chainConfig;
        this.chainId = builder.chainId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.scopeExclude = builder.scopeExclude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChainRequest create() {
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
     * @return chainId
     */
    public String getChainId() {
        return this.chainId;
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
     * @return scopeExclude
     */
    public java.util.List < String > getScopeExclude() {
        return this.scopeExclude;
    }

    public static final class Builder extends Request.Builder<UpdateChainRequest, Builder> {
        private String regionId; 
        private String chainConfig; 
        private String chainId; 
        private String description; 
        private String instanceId; 
        private String name; 
        private java.util.List < String > scopeExclude; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chainConfig = request.chainConfig;
            this.chainId = request.chainId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.scopeExclude = request.scopeExclude;
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
         * The configuration of the delivery chain in the JSON format.
         */
        public Builder chainConfig(String chainConfig) {
            this.putQueryParameter("ChainConfig", chainConfig);
            this.chainConfig = chainConfig;
            return this;
        }

        /**
         * The ID of the delivery chain.
         */
        public Builder chainId(String chainId) {
            this.putQueryParameter("ChainId", chainId);
            this.chainId = chainId;
            return this;
        }

        /**
         * The description of the delivery chain.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the delivery chain.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Repositories in which the delivery chain does not take effect.
         */
        public Builder scopeExclude(java.util.List < String > scopeExclude) {
            this.putQueryParameter("ScopeExclude", scopeExclude);
            this.scopeExclude = scopeExclude;
            return this;
        }

        @Override
        public UpdateChainRequest build() {
            return new UpdateChainRequest(this);
        } 

    } 

}
