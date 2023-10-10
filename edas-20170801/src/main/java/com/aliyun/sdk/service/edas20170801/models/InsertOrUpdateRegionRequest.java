// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertOrUpdateRegionRequest} extends {@link RequestModel}
 *
 * <p>InsertOrUpdateRegionRequest</p>
 */
public class InsertOrUpdateRegionRequest extends Request {
    @Query
    @NameInMap("DebugEnable")
    private Boolean debugEnable;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("MseInstanceId")
    private String mseInstanceId;

    @Query
    @NameInMap("RegionName")
    @Validation(required = true)
    private String regionName;

    @Query
    @NameInMap("RegionTag")
    @Validation(required = true)
    private String regionTag;

    @Query
    @NameInMap("RegistryType")
    private String registryType;

    private InsertOrUpdateRegionRequest(Builder builder) {
        super(builder);
        this.debugEnable = builder.debugEnable;
        this.description = builder.description;
        this.id = builder.id;
        this.mseInstanceId = builder.mseInstanceId;
        this.regionName = builder.regionName;
        this.regionTag = builder.regionTag;
        this.registryType = builder.registryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertOrUpdateRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return debugEnable
     */
    public Boolean getDebugEnable() {
        return this.debugEnable;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mseInstanceId
     */
    public String getMseInstanceId() {
        return this.mseInstanceId;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * @return regionTag
     */
    public String getRegionTag() {
        return this.regionTag;
    }

    /**
     * @return registryType
     */
    public String getRegistryType() {
        return this.registryType;
    }

    public static final class Builder extends Request.Builder<InsertOrUpdateRegionRequest, Builder> {
        private Boolean debugEnable; 
        private String description; 
        private Long id; 
        private String mseInstanceId; 
        private String regionName; 
        private String regionTag; 
        private String registryType; 

        private Builder() {
            super();
        } 

        private Builder(InsertOrUpdateRegionRequest request) {
            super(request);
            this.debugEnable = request.debugEnable;
            this.description = request.description;
            this.id = request.id;
            this.mseInstanceId = request.mseInstanceId;
            this.regionName = request.regionName;
            this.regionTag = request.regionTag;
            this.registryType = request.registryType;
        } 

        /**
         * Specifies whether to enable remote debugging. Valid values:
         * <p>
         * 
         * *   true: enables remote debugging.
         * *   false: disables remote debugging.
         */
        public Builder debugEnable(Boolean debugEnable) {
            this.putQueryParameter("DebugEnable", debugEnable);
            this.debugEnable = debugEnable;
            return this;
        }

        /**
         * The description of the namespace. The description can be up to 128 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to create or modify the namespace. If this parameter is left empty or is set to 0, the namespace is created. Otherwise, the namespace is modified.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The ID of the MSE registry.
         */
        public Builder mseInstanceId(String mseInstanceId) {
            this.putQueryParameter("MseInstanceId", mseInstanceId);
            this.mseInstanceId = mseInstanceId;
            return this;
        }

        /**
         * The name of the namespace. The name can be up to 63 characters in length.
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        /**
         * The ID of the namespace.
         * <p>
         * 
         * *   The ID of a custom namespace is in the `Region ID:Namespace identifier` format. Example: cn-beijing:tdy218.
         * *   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.
         */
        public Builder regionTag(String regionTag) {
            this.putQueryParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        /**
         * The type of the registry.
         * <p>
         * 
         * *   default: the shared registry of Enterprise Distributed Application Service (EDAS)
         * *   exclusive_mse: a Microservices Engine (MSE) registry
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        @Override
        public InsertOrUpdateRegionRequest build() {
            return new InsertOrUpdateRegionRequest(this);
        } 

    } 

}
