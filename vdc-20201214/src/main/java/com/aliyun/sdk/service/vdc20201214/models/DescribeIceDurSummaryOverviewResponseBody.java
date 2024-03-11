// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIceDurSummaryOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIceDurSummaryOverviewResponseBody</p>
 */
public class DescribeIceDurSummaryOverviewResponseBody extends TeaModel {
    @NameInMap("JobInfoList")
    private java.util.List < JobInfoList> jobInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIceDurSummaryOverviewResponseBody(Builder builder) {
        this.jobInfoList = builder.jobInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIceDurSummaryOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobInfoList
     */
    public java.util.List < JobInfoList> getJobInfoList() {
        return this.jobInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < JobInfoList> jobInfoList; 
        private String requestId; 

        /**
         * JobInfoList.
         */
        public Builder jobInfoList(java.util.List < JobInfoList> jobInfoList) {
            this.jobInfoList = jobInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIceDurSummaryOverviewResponseBody build() {
            return new DescribeIceDurSummaryOverviewResponseBody(this);
        } 

    } 

    public static class JobInfoList extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("TimeRange")
        private String timeRange;

        private JobInfoList(Builder builder) {
            this.duration = builder.duration;
            this.jobType = builder.jobType;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfoList create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return timeRange
         */
        public String getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private Long duration; 
            private String jobType; 
            private String timeRange; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * TimeRange.
             */
            public Builder timeRange(String timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public JobInfoList build() {
                return new JobInfoList(this);
            } 

        } 

    }
}
