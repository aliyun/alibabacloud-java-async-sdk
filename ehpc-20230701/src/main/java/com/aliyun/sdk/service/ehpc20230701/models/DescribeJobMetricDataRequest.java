// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobMetricDataRequest</p>
 */
public class DescribeJobMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArrayIndex")
    private java.util.List < Integer > arrayIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private DescribeJobMetricDataRequest(Builder builder) {
        super(builder);
        this.arrayIndex = builder.arrayIndex;
        this.jobId = builder.jobId;
        this.metricName = builder.metricName;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMetricDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrayIndex
     */
    public java.util.List < Integer > getArrayIndex() {
        return this.arrayIndex;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DescribeJobMetricDataRequest, Builder> {
        private java.util.List < Integer > arrayIndex; 
        private String jobId; 
        private String metricName; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobMetricDataRequest request) {
            super(request);
            this.arrayIndex = request.arrayIndex;
            this.jobId = request.jobId;
            this.metricName = request.metricName;
            this.taskName = request.taskName;
        } 

        /**
         * ArrayIndex.
         */
        public Builder arrayIndex(java.util.List < Integer > arrayIndex) {
            String arrayIndexShrink = shrink(arrayIndex, "ArrayIndex", "json");
            this.putQueryParameter("ArrayIndex", arrayIndexShrink);
            this.arrayIndex = arrayIndex;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DescribeJobMetricDataRequest build() {
            return new DescribeJobMetricDataRequest(this);
        } 

    } 

}
