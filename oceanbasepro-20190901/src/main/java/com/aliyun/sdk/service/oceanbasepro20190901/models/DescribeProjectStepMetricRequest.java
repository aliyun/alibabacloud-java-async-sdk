// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeProjectStepMetricRequest} extends {@link RequestModel}
 *
 * <p>DescribeProjectStepMetricRequest</p>
 */
public class DescribeProjectStepMetricRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Aggregator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxPointNum")
    private Integer maxPointNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StepName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stepName;

    private DescribeProjectStepMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aggregator = builder.aggregator;
        this.beginTimestamp = builder.beginTimestamp;
        this.endTimestamp = builder.endTimestamp;
        this.maxPointNum = builder.maxPointNum;
        this.metricType = builder.metricType;
        this.projectId = builder.projectId;
        this.stepName = builder.stepName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectStepMetricRequest create() {
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
     * @return aggregator
     */
    public String getAggregator() {
        return this.aggregator;
    }

    /**
     * @return beginTimestamp
     */
    public Long getBeginTimestamp() {
        return this.beginTimestamp;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return maxPointNum
     */
    public Integer getMaxPointNum() {
        return this.maxPointNum;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    public static final class Builder extends Request.Builder<DescribeProjectStepMetricRequest, Builder> {
        private String regionId; 
        private String aggregator; 
        private Long beginTimestamp; 
        private Long endTimestamp; 
        private Integer maxPointNum; 
        private String metricType; 
        private String projectId; 
        private String stepName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProjectStepMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aggregator = request.aggregator;
            this.beginTimestamp = request.beginTimestamp;
            this.endTimestamp = request.endTimestamp;
            this.maxPointNum = request.maxPointNum;
            this.metricType = request.metricType;
            this.projectId = request.projectId;
            this.stepName = request.stepName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        public Builder aggregator(String aggregator) {
            this.putBodyParameter("Aggregator", aggregator);
            this.aggregator = aggregator;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1689244696</p>
         */
        public Builder beginTimestamp(Long beginTimestamp) {
            this.putBodyParameter("BeginTimestamp", beginTimestamp);
            this.beginTimestamp = beginTimestamp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1689254646</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putBodyParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * MaxPointNum.
         */
        public Builder maxPointNum(Integer maxPointNum) {
            this.putBodyParameter("MaxPointNum", maxPointNum);
            this.maxPointNum = maxPointNum;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RPS</p>
         */
        public Builder metricType(String metricType) {
            this.putBodyParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np_dr****</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL_TRANSFER</p>
         */
        public Builder stepName(String stepName) {
            this.putBodyParameter("StepName", stepName);
            this.stepName = stepName;
            return this;
        }

        @Override
        public DescribeProjectStepMetricRequest build() {
            return new DescribeProjectStepMetricRequest(this);
        } 

    } 

}
