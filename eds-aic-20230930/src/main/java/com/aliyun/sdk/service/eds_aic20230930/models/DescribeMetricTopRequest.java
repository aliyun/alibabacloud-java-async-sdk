// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeMetricTopRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricTopRequest</p>
 */
public class DescribeMetricTopRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Length")
    private String length;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> metricNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeMetricTopRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.endTime = builder.endTime;
        this.instanceIds = builder.instanceIds;
        this.length = builder.length;
        this.metricNames = builder.metricNames;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricTopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return length
     */
    public String getLength() {
        return this.length;
    }

    /**
     * @return metricNames
     */
    public java.util.List<String> getMetricNames() {
        return this.metricNames;
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
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMetricTopRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private String endTime; 
        private java.util.List<String> instanceIds; 
        private String length; 
        private java.util.List<String> metricNames; 
        private String nextToken; 
        private Integer period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricTopRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.endTime = request.endTime;
            this.instanceIds = request.instanceIds;
            this.length = request.length;
            this.metricNames = request.metricNames;
            this.nextToken = request.nextToken;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * AndroidInstanceIds.
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putBodyParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(String length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metricNames(java.util.List<String> metricNames) {
            this.putBodyParameter("MetricNames", metricNames);
            this.metricNames = metricNames;
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
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricTopRequest build() {
            return new DescribeMetricTopRequest(this);
        } 

    } 

}
