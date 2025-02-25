// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatsInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceStatsInfoRequest</p>
 */
public class DescribeInstanceStatsInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistrictIds")
    private java.util.List < String > districtIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    private java.util.List < String > projectIds;

    private DescribeInstanceStatsInfoRequest(Builder builder) {
        super(builder);
        this.districtIds = builder.districtIds;
        this.instanceTypes = builder.instanceTypes;
        this.projectIds = builder.projectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatsInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return districtIds
     */
    public java.util.List < String > getDistrictIds() {
        return this.districtIds;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return projectIds
     */
    public java.util.List < String > getProjectIds() {
        return this.projectIds;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceStatsInfoRequest, Builder> {
        private java.util.List < String > districtIds; 
        private java.util.List < String > instanceTypes; 
        private java.util.List < String > projectIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceStatsInfoRequest request) {
            super(request);
            this.districtIds = request.districtIds;
            this.instanceTypes = request.instanceTypes;
            this.projectIds = request.projectIds;
        } 

        /**
         * DistrictIds.
         */
        public Builder districtIds(java.util.List < String > districtIds) {
            this.putQueryParameter("DistrictIds", districtIds);
            this.districtIds = districtIds;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * ProjectIds.
         */
        public Builder projectIds(java.util.List < String > projectIds) {
            this.putQueryParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        @Override
        public DescribeInstanceStatsInfoRequest build() {
            return new DescribeInstanceStatsInfoRequest(this);
        } 

    } 

}
