// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceCronScalerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceCronScalerResponseBody</p>
 */
public class DescribeServiceCronScalerResponseBody extends TeaModel {
    @NameInMap("ExcludeDates")
    private java.util.List < String > excludeDates;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScaleJobs")
    private java.util.List < ScaleJobs> scaleJobs;

    @NameInMap("ServiceName")
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
    public java.util.List < String > getExcludeDates() {
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
    public java.util.List < ScaleJobs> getScaleJobs() {
        return this.scaleJobs;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private java.util.List < String > excludeDates; 
        private String requestId; 
        private java.util.List < ScaleJobs> scaleJobs; 
        private String serviceName; 

        /**
         * ExcludeDates.
         */
        public Builder excludeDates(java.util.List < String > excludeDates) {
            this.excludeDates = excludeDates;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScaleJobs.
         */
        public Builder scaleJobs(java.util.List < ScaleJobs> scaleJobs) {
            this.scaleJobs = scaleJobs;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public DescribeServiceCronScalerResponseBody build() {
            return new DescribeServiceCronScalerResponseBody(this);
        } 

    } 

    public static class ScaleJobs extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("LastProbeTime")
        private String lastProbeTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("Schedule")
        private String schedule;

        @NameInMap("State")
        private String state;

        @NameInMap("TargetSize")
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LastProbeTime.
             */
            public Builder lastProbeTime(String lastProbeTime) {
                this.lastProbeTime = lastProbeTime;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Schedule.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TargetSize.
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
