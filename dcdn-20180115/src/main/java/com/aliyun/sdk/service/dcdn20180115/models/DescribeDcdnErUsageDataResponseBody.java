// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnErUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnErUsageDataResponseBody</p>
 */
public class DescribeDcdnErUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ErAccData")
    private ErAccData erAccData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnErUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.erAccData = builder.erAccData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnErUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return erAccData
     */
    public ErAccData getErAccData() {
        return this.erAccData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private ErAccData erAccData; 
        private String requestId; 
        private String startTime; 

        /**
         * The end of the time range during which data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The list of the data returned.
         */
        public Builder erAccData(ErAccData erAccData) {
            this.erAccData = erAccData;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnErUsageDataResponseBody build() {
            return new DescribeDcdnErUsageDataResponseBody(this);
        } 

    } 

    public static class ErAccItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErAcc")
        private Long erAcc;

        @com.aliyun.core.annotation.NameInMap("Routine")
        private String routine;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private ErAccItem(Builder builder) {
            this.erAcc = builder.erAcc;
            this.routine = builder.routine;
            this.spec = builder.spec;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErAccItem create() {
            return builder().build();
        }

        /**
         * @return erAcc
         */
        public Long getErAcc() {
            return this.erAcc;
        }

        /**
         * @return routine
         */
        public String getRoutine() {
            return this.routine;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long erAcc; 
            private String routine; 
            private String spec; 
            private String timeStamp; 

            /**
             * The number of requests.
             */
            public Builder erAcc(Long erAcc) {
                this.erAcc = erAcc;
                return this;
            }

            /**
             * The ID of the routine. This parameter is returned only when SplitBy is set to routine.
             */
            public Builder routine(String routine) {
                this.routine = routine;
                return this;
            }

            /**
             * The specification of the routine. This parameter is returned only when SplitBy is set to spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The timestamp of the returned data.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public ErAccItem build() {
                return new ErAccItem(this);
            } 

        } 

    }
    public static class ErAccData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErAccItem")
        private java.util.List < ErAccItem> erAccItem;

        private ErAccData(Builder builder) {
            this.erAccItem = builder.erAccItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErAccData create() {
            return builder().build();
        }

        /**
         * @return erAccItem
         */
        public java.util.List < ErAccItem> getErAccItem() {
            return this.erAccItem;
        }

        public static final class Builder {
            private java.util.List < ErAccItem> erAccItem; 

            /**
             * ErAccItem.
             */
            public Builder erAccItem(java.util.List < ErAccItem> erAccItem) {
                this.erAccItem = erAccItem;
                return this;
            }

            public ErAccData build() {
                return new ErAccData(this);
            } 

        } 

    }
}
