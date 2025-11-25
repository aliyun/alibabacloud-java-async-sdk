// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListResourceGroupMetricDataRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupMetricDataRequest</p>
 */
public class ListResourceGroupMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Length")
    @com.aliyun.core.annotation.Validation(maximum = 1440)
    private Integer length;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    private ListResourceGroupMetricDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.length = builder.length;
        this.metricName = builder.metricName;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupMetricDataRequest create() {
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
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListResourceGroupMetricDataRequest, Builder> {
        private String regionId; 
        private Long beginTime; 
        private Long endTime; 
        private Integer length; 
        private String metricName; 
        private String nextToken; 
        private String period; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupMetricDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.length = request.length;
            this.metricName = request.metricName;
            this.nextToken = request.nextToken;
            this.period = request.period;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Start Time</p>
         * <p>Supported format:</p>
         * <ul>
         * <li>Unix timestamp, representing the number of milliseconds that have elapsed since January 1, 1970.</li>
         * </ul>
         * <p>The interval between BeginTime and EndTime must be 31 days or less.</p>
         * <p>Default: The current time minus 2 hours, expressed as a millisecond Unix timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1593950832000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>End Time</p>
         * <p>Supported format:</p>
         * <ul>
         * <li>Unix timestamp, representing the number of milliseconds that have elapsed since January 1, 1970.</li>
         * </ul>
         * <p>The interval between BeginTime and EndTime must be 31 days or less.</p>
         * <p>Default: The current time, expressed as a millisecond Unix timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1750176000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>The metric name. Available metrics include:</p>
         * <ul>
         * <li>CUSpec: Maximum CU capacity of the resource group, in CUs.</li>
         * <li>CUUsage: CU usage of the resource group, in CUs.</li>
         * <li>CUUtilization: CU utilization of the resource group, in %.</li>
         * <li>SlotSpec: Maximum concurrency for resource group scheduling, in slots.</li>
         * <li>SlotUsage: Used concurrency for resource group scheduling, in slots.</li>
         * <li>SchedulerCUMaxSpec: Maximum CU quota for data computing, in CUs.</li>
         * <li>SchedulerCUUsage: CU usage for data computing, in CUs.</li>
         * <li>SchedulerCUMinSpec: Minimum guaranteed CUs for data computing, in CUs.</li>
         * <li>DataIntegrationCUMaxSpec: Maximum CU quota for Data Integration, in CUs.</li>
         * <li>DataIntegrationCUUsage: CU usage for Data Integration, in CUs.</li>
         * <li>DataIntegrationCUMinSpec: Minimum guaranteed CUs for Data Integration, in CUs.</li>
         * <li>DataServiceCUMaxSpec: Maximum CU quota for dataservice, in CUs.</li>
         * <li>DataServiceCUUsage: CU usage for DataService Studio, in CUs.</li>
         * <li>DataServiceCUMinSpec: Minimum guaranteed CUs for DataService Studio, in CUs.</li>
         * <li>ServerIdeCUMaxSpec: Maximum CU quota for personal development environment, in CUs.</li>
         * <li>ServerIdeCUUsage: CU usage for personal development environment, in CUs.</li>
         * <li>ServerIdeCUMinSpec: Minimum guaranteed CUs for personal development environment, in CUs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSpec</p>
         */
        public Builder metricName(String metricName) {
            this.putBodyParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The statistical period for monitoring data.</p>
         * <p>Value: A multiple of 60.</p>
         * <p>Unit: Seconds.</p>
         * <p>Default: 60</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(String period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListResourceGroupMetricDataRequest build() {
            return new ListResourceGroupMetricDataRequest(this);
        } 

    } 

}
