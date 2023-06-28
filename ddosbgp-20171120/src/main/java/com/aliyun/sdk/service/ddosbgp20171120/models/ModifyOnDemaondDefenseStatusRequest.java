// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOnDemaondDefenseStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyOnDemaondDefenseStatusRequest</p>
 */
public class ModifyOnDemaondDefenseStatusRequest extends Request {
    @Query
    @NameInMap("DefenseStatus")
    @Validation(required = true)
    private String defenseStatus;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyOnDemaondDefenseStatusRequest(Builder builder) {
        super(builder);
        this.defenseStatus = builder.defenseStatus;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOnDemaondDefenseStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseStatus
     */
    public String getDefenseStatus() {
        return this.defenseStatus;
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

    public static final class Builder extends Request.Builder<ModifyOnDemaondDefenseStatusRequest, Builder> {
        private String defenseStatus; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOnDemaondDefenseStatusRequest request) {
            super(request);
            this.defenseStatus = request.defenseStatus;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The protection status of the on-demand instance. Valid values:
         * <p>
         * 
         * *   **Defense**: enables the on-demand instance.
         * *   **UnDefense**: disables the on-demand instance.
         */
        public Builder defenseStatus(String defenseStatus) {
            this.putQueryParameter("DefenseStatus", defenseStatus);
            this.defenseStatus = defenseStatus;
            return this;
        }

        /**
         * The ID of the on-demand instance.
         * <p>
         * 
         * >  You can call the [DescribeOnDemandInstance](~~152120~~) operation to query the IDs of all on-demand instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the on-demand instance.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyOnDemaondDefenseStatusRequest build() {
            return new ModifyOnDemaondDefenseStatusRequest(this);
        } 

    } 

}
