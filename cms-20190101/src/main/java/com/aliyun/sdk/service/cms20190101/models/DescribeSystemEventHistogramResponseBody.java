// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventHistogramResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventHistogramResponseBody</p>
 */
public class DescribeSystemEventHistogramResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("SystemEventHistograms")
    private SystemEventHistograms systemEventHistograms;

    private DescribeSystemEventHistogramResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.systemEventHistograms = builder.systemEventHistograms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemEventHistogramResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return systemEventHistograms
     */
    public SystemEventHistograms getSystemEventHistograms() {
        return this.systemEventHistograms;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String success; 
        private SystemEventHistograms systemEventHistograms; 

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
         * Message.
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

        /**
         * The information about the number of times that the system event occurred during each interval of a time period.
         */
        public Builder systemEventHistograms(SystemEventHistograms systemEventHistograms) {
            this.systemEventHistograms = systemEventHistograms;
            return this;
        }

        public DescribeSystemEventHistogramResponseBody build() {
            return new DescribeSystemEventHistogramResponseBody(this);
        } 

    } 

    public static class SystemEventHistogram extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("StartTime")
        private Long startTime;

        private SystemEventHistogram(Builder builder) {
            this.count = builder.count;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEventHistogram create() {
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
             * The number of times that the system event occurred.
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

            public SystemEventHistogram build() {
                return new SystemEventHistogram(this);
            } 

        } 

    }
    public static class SystemEventHistograms extends TeaModel {
        @NameInMap("SystemEventHistogram")
        private java.util.List < SystemEventHistogram> systemEventHistogram;

        private SystemEventHistograms(Builder builder) {
            this.systemEventHistogram = builder.systemEventHistogram;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEventHistograms create() {
            return builder().build();
        }

        /**
         * @return systemEventHistogram
         */
        public java.util.List < SystemEventHistogram> getSystemEventHistogram() {
            return this.systemEventHistogram;
        }

        public static final class Builder {
            private java.util.List < SystemEventHistogram> systemEventHistogram; 

            /**
             * SystemEventHistogram.
             */
            public Builder systemEventHistogram(java.util.List < SystemEventHistogram> systemEventHistogram) {
                this.systemEventHistogram = systemEventHistogram;
                return this;
            }

            public SystemEventHistograms build() {
                return new SystemEventHistograms(this);
            } 

        } 

    }
}
