// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackholeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlackholeStatusRequest</p>
 */
public class DescribeBlackholeStatusRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeBlackholeStatusRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlackholeStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeBlackholeStatusRequest, Builder> {
        private java.util.List < String > instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlackholeStatusRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
            this.regionId = response.regionId;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
        public DescribeBlackholeStatusRequest build() {
            return new DescribeBlackholeStatusRequest(this);
        } 

    } 

}
