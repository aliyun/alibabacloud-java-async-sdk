// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApsResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApsResourceGroupsRequest</p>
 */
public class DescribeApsResourceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadId")
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
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1t6rym21****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the data synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-hz1686v37sx****</p>
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
