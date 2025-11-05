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
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
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
         * Period.
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
