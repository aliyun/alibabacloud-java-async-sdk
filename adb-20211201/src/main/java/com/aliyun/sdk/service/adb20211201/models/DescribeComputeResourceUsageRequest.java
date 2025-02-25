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
 * {@link DescribeComputeResourceUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeComputeResourceUsageRequest</p>
 */
public class DescribeComputeResourceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeComputeResourceUsageRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.resourceGroupName = builder.resourceGroupName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComputeResourceUsageRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeComputeResourceUsageRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String resourceGroupName; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComputeResourceUsageRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.resourceGroupName = request.resourceGroupName;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1xxxxxxxx47</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-05T03:45:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-04T03:45:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeComputeResourceUsageRequest build() {
            return new DescribeComputeResourceUsageRequest(this);
        } 

    } 

}
