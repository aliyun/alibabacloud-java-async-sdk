// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIceDurPeriodByDaySubTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIceDurPeriodByDaySubTypeResponseBody</p>
 */
public class DescribeIceDurPeriodByDaySubTypeResponseBody extends TeaModel {
    @NameInMap("JobInfoList")
    private java.util.List < JobInfoList> jobInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIceDurPeriodByDaySubTypeResponseBody(Builder builder) {
        this.jobInfoList = builder.jobInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIceDurPeriodByDaySubTypeResponseBody create() {
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

        public DescribeIceDurPeriodByDaySubTypeResponseBody build() {
            return new DescribeIceDurPeriodByDaySubTypeResponseBody(this);
        } 

    } 

    public static class SubJobInfoList extends TeaModel {
        @NameInMap("SubJobDuration")
        private Long subJobDuration;

        @NameInMap("SubJobType")
        private String subJobType;

        private SubJobInfoList(Builder builder) {
            this.subJobDuration = builder.subJobDuration;
            this.subJobType = builder.subJobType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubJobInfoList create() {
            return builder().build();
        }

        /**
         * @return subJobDuration
         */
        public Long getSubJobDuration() {
            return this.subJobDuration;
        }

        /**
         * @return subJobType
         */
        public String getSubJobType() {
            return this.subJobType;
        }

        public static final class Builder {
            private Long subJobDuration; 
            private String subJobType; 

            /**
             * SubJobDuration.
             */
            public Builder subJobDuration(Long subJobDuration) {
                this.subJobDuration = subJobDuration;
                return this;
            }

            /**
             * SubJobType.
             */
            public Builder subJobType(String subJobType) {
                this.subJobType = subJobType;
                return this;
            }

            public SubJobInfoList build() {
                return new SubJobInfoList(this);
            } 

        } 

    }
    public static class JobInfoList extends TeaModel {
        @NameInMap("DateTs")
        private Long dateTs;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("SubJobInfoList")
        private java.util.List < SubJobInfoList> subJobInfoList;

        private JobInfoList(Builder builder) {
            this.dateTs = builder.dateTs;
            this.duration = builder.duration;
            this.subJobInfoList = builder.subJobInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfoList create() {
            return builder().build();
        }

        /**
         * @return dateTs
         */
        public Long getDateTs() {
            return this.dateTs;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return subJobInfoList
         */
        public java.util.List < SubJobInfoList> getSubJobInfoList() {
            return this.subJobInfoList;
        }

        public static final class Builder {
            private Long dateTs; 
            private Long duration; 
            private java.util.List < SubJobInfoList> subJobInfoList; 

            /**
             * DateTs.
             */
            public Builder dateTs(Long dateTs) {
                this.dateTs = dateTs;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * SubJobInfoList.
             */
            public Builder subJobInfoList(java.util.List < SubJobInfoList> subJobInfoList) {
                this.subJobInfoList = subJobInfoList;
                return this;
            }

            public JobInfoList build() {
                return new JobInfoList(this);
            } 

        } 

    }
}
