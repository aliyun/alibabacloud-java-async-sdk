// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBlackholeStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyBlackholeStatusRequest</p>
 */
public class ModifyBlackholeStatusRequest extends Request {
    @Query
    @NameInMap("BlackholeStatus")
    @Validation(required = true)
    private String blackholeStatus;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyBlackholeStatusRequest(Builder builder) {
        super(builder);
        this.blackholeStatus = builder.blackholeStatus;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBlackholeStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackholeStatus
     */
    public String getBlackholeStatus() {
        return this.blackholeStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyBlackholeStatusRequest, Builder> {
        private String blackholeStatus; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBlackholeStatusRequest response) {
            super(response);
            this.blackholeStatus = response.blackholeStatus;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * BlackholeStatus.
         */
        public Builder blackholeStatus(String blackholeStatus) {
            this.putQueryParameter("BlackholeStatus", blackholeStatus);
            this.blackholeStatus = blackholeStatus;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyBlackholeStatusRequest build() {
            return new ModifyBlackholeStatusRequest(this);
        } 

    } 

}
