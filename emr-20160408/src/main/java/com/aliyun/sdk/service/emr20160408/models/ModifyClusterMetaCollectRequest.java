// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterMetaCollectRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterMetaCollectRequest</p>
 */
public class ModifyClusterMetaCollectRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SwitchOn")
    @Validation(required = true)
    private Boolean switchOn;

    private ModifyClusterMetaCollectRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchOn = builder.switchOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterMetaCollectRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return switchOn
     */
    public Boolean getSwitchOn() {
        return this.switchOn;
    }

    public static final class Builder extends Request.Builder<ModifyClusterMetaCollectRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Boolean switchOn; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterMetaCollectRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.switchOn = response.switchOn;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SwitchOn.
         */
        public Builder switchOn(Boolean switchOn) {
            this.putQueryParameter("SwitchOn", switchOn);
            this.switchOn = switchOn;
            return this;
        }

        @Override
        public ModifyClusterMetaCollectRequest build() {
            return new ModifyClusterMetaCollectRequest(this);
        } 

    } 

}
