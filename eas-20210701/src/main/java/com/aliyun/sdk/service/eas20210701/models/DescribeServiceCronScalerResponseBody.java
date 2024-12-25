// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeServiceCronScalerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceCronScalerResponseBody</p>
 */
public class DescribeServiceCronScalerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExcludeDates")
    private java.util.List<String> excludeDates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScaleJobs")
    private java.util.List<ScaleJobs> scaleJobs;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private DescribeServiceCronScalerResponseBody(Builder builder) {
        this.excludeDates = builder.excludeDates;
        this.requestId = builder.requestId;
        this.scaleJobs = builder.scaleJobs;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceCronScalerResponseBody create() {
        return builder().build();
    }

    /**
     * @return excludeDates
     */
    public java.util.List<String> getExcludeDates() {
        return this.excludeDates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scaleJobs
     */
    public java.util.List<ScaleJobs> getScaleJobs() {
        return this.scaleJobs;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private java.util.List<String> excludeDates; 
        private String requestId; 
        private java.util.List<ScaleJobs> scaleJobs; 
        private String serviceName; 

        /**
         * <p>The points in time that are excluded when you schedule a CronHPA job. The points in time must be specified by using a cron expression.</p>
         */
        public Builder excludeDates(java.util.List<String> excludeDates) {
            this.excludeDates = excludeDates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The CronHPA jobs.</p>
         */
        public Builder scaleJobs(java.util.List<ScaleJobs> scaleJobs) {
            this.scaleJobs = scaleJobs;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public DescribeServiceCronScalerResponseBody build() {
            return new DescribeServiceCronScalerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceCronScalerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceCronScalerResponseBody</p>
     */
    public static class ScaleJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastProbeTime")
        private String lastProbeTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TargetSize")
        private Integer targetSize;

        private ScaleJobs(Builder builder) {
            this.createTime = builder.createTime;
            this.lastProbeTime = builder.lastProbeTime;
            this.message = builder.message;
            this.name = builder.name;
            this.schedule = builder.schedule;
            this.state = builder.state;
            this.targetSize = builder.targetSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleJobs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastProbeTime
         */
        public String getLastProbeTime() {
            return this.lastProbeTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return targetSize
         */
        public Integer getTargetSize() {
            return this.targetSize;
        }

        public static final class Builder {
            private String createTime; 
            private String lastProbeTime; 
            private String message; 
            private String name; 
            private String schedule; 
            private String state; 
            private Integer targetSize; 

            /**
             * <p>The time when the most recent CronHPA job was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-24T02:11:30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the most recent CronHPA job ran. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-24T06:31:00Z</p>
             */
            public Builder lastProbeTime(String lastProbeTime) {
                this.lastProbeTime = lastProbeTime;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;cron hpa job scale-jobs-0 executed successfully. current replicas:3, desired replicas:2.&quot;</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the CronHPA job.</p>
             * 
             * <strong>example:</strong>
             * <p>scale-job-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cron expression that is used to configure the execution time of the CronHPA job.</p>
             * 
             * <strong>example:</strong>
             * <p>0 18 * * * *</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The status of the most recent CronHPA job.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeed</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The number of instances that you expect to configure for the CronHPA job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder targetSize(Integer targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            public ScaleJobs build() {
                return new ScaleJobs(this);
            } 

        } 

    }
}
