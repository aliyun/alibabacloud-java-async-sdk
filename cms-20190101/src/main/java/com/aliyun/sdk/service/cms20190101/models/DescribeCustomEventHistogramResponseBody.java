// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomEventHistogramResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomEventHistogramResponseBody</p>
 */
public class DescribeCustomEventHistogramResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EventHistograms")
    private EventHistograms eventHistograms;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeCustomEventHistogramResponseBody(Builder builder) {
        this.code = builder.code;
        this.eventHistograms = builder.eventHistograms;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventHistogramResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return eventHistograms
     */
    public EventHistograms getEventHistograms() {
        return this.eventHistograms;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private EventHistograms eventHistograms; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the number of times that the custom event occurred during each interval of a time period.
         */
        public Builder eventHistograms(EventHistograms eventHistograms) {
            this.eventHistograms = eventHistograms;
            return this;
        }

        /**
         * The returned message. If the call was successful, the value success is returned. If the call failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCustomEventHistogramResponseBody build() {
            return new DescribeCustomEventHistogramResponseBody(this);
        } 

    } 

    public static class EventHistogram extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private EventHistogram(Builder builder) {
            this.count = builder.count;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventHistogram create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long count; 
            private Long endTime; 
            private Long startTime; 

            /**
             * The information about the number of times that the custom event occurred during an interval of a time period.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The end of an interval.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The beginning of an interval.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public EventHistogram build() {
                return new EventHistogram(this);
            } 

        } 

    }
    public static class EventHistograms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventHistogram")
        private java.util.List < EventHistogram> eventHistogram;

        private EventHistograms(Builder builder) {
            this.eventHistogram = builder.eventHistogram;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventHistograms create() {
            return builder().build();
        }

        /**
         * @return eventHistogram
         */
        public java.util.List < EventHistogram> getEventHistogram() {
            return this.eventHistogram;
        }

        public static final class Builder {
            private java.util.List < EventHistogram> eventHistogram; 

            /**
             * EventHistogram.
             */
            public Builder eventHistogram(java.util.List < EventHistogram> eventHistogram) {
                this.eventHistogram = eventHistogram;
                return this;
            }

            public EventHistograms build() {
                return new EventHistograms(this);
            } 

        } 

    }
}
