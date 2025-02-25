// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSystemEventHistogramResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventHistogramResponseBody</p>
 */
public class DescribeSystemEventHistogramResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("SystemEventHistograms")
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
         * <p>The response code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>486029C9-53E1-44B4-85A8-16A571A043FD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true: The request was successful. false: The request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The information about the number of times the system event occurred during each interval of a time period.</p>
         */
        public Builder systemEventHistograms(SystemEventHistograms systemEventHistograms) {
            this.systemEventHistograms = systemEventHistograms;
            return this;
        }

        public DescribeSystemEventHistogramResponseBody build() {
            return new DescribeSystemEventHistogramResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSystemEventHistogramResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventHistogramResponseBody</p>
     */
    public static class SystemEventHistogram extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * <p>The number of times the system event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The end time.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1552225753000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1552225770000</p>
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
    /**
     * 
     * {@link DescribeSystemEventHistogramResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventHistogramResponseBody</p>
     */
    public static class SystemEventHistograms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SystemEventHistogram")
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
