// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link DescribeMetricListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricListRequest</p>
 */
public class DescribeMetricListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private DescribeMetricListRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instance = builder.instance;
        this.metricName = builder.metricName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMetricListRequest, Builder> {
        private Long endTime; 
        private String instance; 
        private String metricName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricListRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instance = request.instance;
            this.metricName = request.metricName;
            this.startTime = request.startTime;
        } 

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * instance.
         */
        public Builder instance(String instance) {
            this.putQueryParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * metricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("metricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricListRequest build() {
            return new DescribeMetricListRequest(this);
        } 

    } 

}
