// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnDemandInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeOnDemandInstanceStatusRequest</p>
 */
public class DescribeOnDemandInstanceStatusRequest extends Request {
    @Query
    @NameInMap("InstanceIdList")
    @Validation(required = true)
    private java.util.List < String > instanceIdList;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeOnDemandInstanceStatusRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnDemandInstanceStatusRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeOnDemandInstanceStatusRequest, Builder> {
        private java.util.List < String > instanceIdList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOnDemandInstanceStatusRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
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
        public DescribeOnDemandInstanceStatusRequest build() {
            return new DescribeOnDemandInstanceStatusRequest(this);
        } 

    } 

}
