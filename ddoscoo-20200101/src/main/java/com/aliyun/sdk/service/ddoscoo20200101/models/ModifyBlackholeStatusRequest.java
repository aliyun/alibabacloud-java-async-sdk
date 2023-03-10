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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BlackholeStatus")
    @Validation(required = true)
    private String blackholeStatus;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ModifyBlackholeStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blackholeStatus = builder.blackholeStatus;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyBlackholeStatusRequest, Builder> {
        private String regionId; 
        private String blackholeStatus; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBlackholeStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blackholeStatus = request.blackholeStatus;
            this.instanceId = request.instanceId;
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
         * The action that you want to perform on the instance. Set the value to **undo**, which indicates that you want to deactivate blackhole filtering.
         */
        public Builder blackholeStatus(String blackholeStatus) {
            this.putQueryParameter("BlackholeStatus", blackholeStatus);
            this.blackholeStatus = blackholeStatus;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyBlackholeStatusRequest build() {
            return new ModifyBlackholeStatusRequest(this);
        } 

    } 

}
