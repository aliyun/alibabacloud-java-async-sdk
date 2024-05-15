// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceModeOnDemandRequest} extends {@link RequestModel}
 *
 * <p>SetInstanceModeOnDemandRequest</p>
 */
public class SetInstanceModeOnDemandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SetInstanceModeOnDemandRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
        this.mode = builder.mode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstanceModeOnDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdList
     */
    public java.util.List < String > getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetInstanceModeOnDemandRequest, Builder> {
        private java.util.List < String > instanceIdList; 
        private String mode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetInstanceModeOnDemandRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
            this.mode = request.mode;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of on-demand instances.
         * <p>
         * 
         * >  You can call the [DescribeOnDemandInstance](~~152120~~) operation to query the IDs of all on-demand instances.
         */
        public Builder instanceIdList(java.util.List < String > instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * The scheduling mode of the on-demand instance. Valid values:
         * <p>
         * 
         * *   **manual**: manual scheduling
         * *   **netflow-auto**: automatic scheduling
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The region ID of the on-demand instance.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetInstanceModeOnDemandRequest build() {
            return new SetInstanceModeOnDemandRequest(this);
        } 

    } 

}
