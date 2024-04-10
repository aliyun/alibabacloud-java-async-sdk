// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApsResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApsResourceGroupsRequest</p>
 */
public class DescribeApsResourceGroupsRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("WorkloadId")
    private String workloadId;

    private DescribeApsResourceGroupsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.workloadId = builder.workloadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsResourceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
    }

    public static final class Builder extends Request.Builder<DescribeApsResourceGroupsRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private String workloadId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApsResourceGroupsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.workloadId = request.workloadId;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~612397~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * WorkloadId.
         */
        public Builder workloadId(String workloadId) {
            this.putBodyParameter("WorkloadId", workloadId);
            this.workloadId = workloadId;
            return this;
        }

        @Override
        public DescribeApsResourceGroupsRequest build() {
            return new DescribeApsResourceGroupsRequest(this);
        } 

    } 

}
