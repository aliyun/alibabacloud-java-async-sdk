// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDataSharePerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSharePerformanceRequest</p>
 */
public class DescribeDataSharePerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDataSharePerformanceRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSharePerformanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDataSharePerformanceRequest, Builder> {
        private String endTime; 
        private String key; 
        private String regionId; 
        private String resourceGroupId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSharePerformanceRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.key = request.key;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-03T15:10Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the performance metric. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>adbpg_datashare_topic_count</strong>: the number of shared topics.</li>
         * <li><strong>adbpg_datashare_data_size_mb</strong>: the amount of data shared.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg_datashare_topic_count</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-03T15:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDataSharePerformanceRequest build() {
            return new DescribeDataSharePerformanceRequest(this);
        } 

    } 

}
