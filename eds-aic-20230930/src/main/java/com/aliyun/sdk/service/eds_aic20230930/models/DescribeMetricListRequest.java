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
 * {@link DescribeMetricListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricListRequest</p>
 */
public class DescribeMetricListRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ProcessInfos")
    private java.util.List<ProcessInfos> processInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeMetricListRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.endTime = builder.endTime;
        this.instanceIds = builder.instanceIds;
        this.length = builder.length;
        this.metricNames = builder.metricNames;
        this.nextToken = builder.nextToken;
        this.period = builder.period;
        this.processInfos = builder.processInfos;
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
     * @return processInfos
     */
    public java.util.List<ProcessInfos> getProcessInfos() {
        return this.processInfos;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMetricListRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private String endTime; 
        private java.util.List<String> instanceIds; 
        private String length; 
        private java.util.List<String> metricNames; 
        private String nextToken; 
        private Integer period; 
        private java.util.List<ProcessInfos> processInfos; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricListRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.endTime = request.endTime;
            this.instanceIds = request.instanceIds;
            this.length = request.length;
            this.metricNames = request.metricNames;
            this.nextToken = request.nextToken;
            this.period = request.period;
            this.processInfos = request.processInfos;
            this.startTime = request.startTime;
        } 

        /**
         * <p>For instance-level monitoring, enter a list of Cloud Phone instance IDs.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For matrix-level monitoring, enter a list of matrix IDs.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putBodyParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * <p>The end time for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-31 11:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>A list of instance IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The number of entries to return on each page for a paged query.</p>
         * <p>Default value: 1000. This means that 1000 monitoring data records are returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder length(String length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>The monitoring metrics.</p>
         * <p>This parameter is required.</p>
         */
        public Builder metricNames(java.util.List<String> metricNames) {
            this.putBodyParameter("MetricNames", metricNames);
            this.metricNames = metricNames;
            return this;
        }

        /**
         * <p>A token that marks the position from which the query starts. Leave it empty to start from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The statistic period of the monitoring data.</p>
         * <p>Valid values: 60, 900, and 3600.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>A list of process monitoring metrics.</p>
         */
        public Builder processInfos(java.util.List<ProcessInfos> processInfos) {
            this.putBodyParameter("ProcessInfos", processInfos);
            this.processInfos = processInfos;
            return this;
        }

        /**
         * <p>The start time for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-31 10:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricListRequest build() {
            return new DescribeMetricListRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricListRequest} extends {@link TeaModel}
     *
     * <p>DescribeMetricListRequest</p>
     */
    public static class ProcessInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessIds")
        private java.util.List<Integer> processIds;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        private ProcessInfos(Builder builder) {
            this.processIds = builder.processIds;
            this.processName = builder.processName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessInfos create() {
            return builder().build();
        }

        /**
         * @return processIds
         */
        public java.util.List<Integer> getProcessIds() {
            return this.processIds;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        public static final class Builder {
            private java.util.List<Integer> processIds; 
            private String processName; 

            private Builder() {
            } 

            private Builder(ProcessInfos model) {
                this.processIds = model.processIds;
                this.processName = model.processName;
            } 

            /**
             * <p>A list of process IDs.</p>
             */
            public Builder processIds(java.util.List<Integer> processIds) {
                this.processIds = processIds;
                return this;
            }

            /**
             * <p>The process name.</p>
             * 
             * <strong>example:</strong>
             * <p>php-fpm</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            public ProcessInfos build() {
                return new ProcessInfos(this);
            } 

        } 

    }
}
