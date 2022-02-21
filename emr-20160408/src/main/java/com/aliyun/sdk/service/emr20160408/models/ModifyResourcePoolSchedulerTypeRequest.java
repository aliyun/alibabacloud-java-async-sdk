// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourcePoolSchedulerTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourcePoolSchedulerTypeRequest</p>
 */
public class ModifyResourcePoolSchedulerTypeRequest extends Request {
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
    @NameInMap("SchedulerType")
    @Validation(required = true)
    private String schedulerType;

    private ModifyResourcePoolSchedulerTypeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schedulerType = builder.schedulerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourcePoolSchedulerTypeRequest create() {
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
     * @return schedulerType
     */
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public static final class Builder extends Request.Builder<ModifyResourcePoolSchedulerTypeRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String schedulerType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourcePoolSchedulerTypeRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.schedulerType = response.schedulerType;
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
         * SchedulerType.
         */
        public Builder schedulerType(String schedulerType) {
            this.putQueryParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        @Override
        public ModifyResourcePoolSchedulerTypeRequest build() {
            return new ModifyResourcePoolSchedulerTypeRequest(this);
        } 

    } 

}
