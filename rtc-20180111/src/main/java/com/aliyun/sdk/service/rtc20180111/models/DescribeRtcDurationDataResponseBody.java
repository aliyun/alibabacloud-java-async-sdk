// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeRtcDurationDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcDurationDataResponseBody</p>
 */
public class DescribeRtcDurationDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DurationDataPerInterval")
    private DurationDataPerInterval durationDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRtcDurationDataResponseBody(Builder builder) {
        this.durationDataPerInterval = builder.durationDataPerInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcDurationDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationDataPerInterval
     */
    public DurationDataPerInterval getDurationDataPerInterval() {
        return this.durationDataPerInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DurationDataPerInterval durationDataPerInterval; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRtcDurationDataResponseBody model) {
            this.durationDataPerInterval = model.durationDataPerInterval;
            this.requestId = model.requestId;
        } 

        /**
         * DurationDataPerInterval.
         */
        public Builder durationDataPerInterval(DurationDataPerInterval durationDataPerInterval) {
            this.durationDataPerInterval = durationDataPerInterval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRtcDurationDataResponseBody build() {
            return new DescribeRtcDurationDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcDurationDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcDurationDataResponseBody</p>
     */
    public static class DurationModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioDuration")
        private Long audioDuration;

        @com.aliyun.core.annotation.NameInMap("ContentDuration")
        private Long contentDuration;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("V1080Duration")
        private Long v1080Duration;

        @com.aliyun.core.annotation.NameInMap("V360Duration")
        private Long v360Duration;

        @com.aliyun.core.annotation.NameInMap("V720Duration")
        private Long v720Duration;

        private DurationModule(Builder builder) {
            this.audioDuration = builder.audioDuration;
            this.contentDuration = builder.contentDuration;
            this.timeStamp = builder.timeStamp;
            this.totalDuration = builder.totalDuration;
            this.v1080Duration = builder.v1080Duration;
            this.v360Duration = builder.v360Duration;
            this.v720Duration = builder.v720Duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DurationModule create() {
            return builder().build();
        }

        /**
         * @return audioDuration
         */
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        /**
         * @return contentDuration
         */
        public Long getContentDuration() {
            return this.contentDuration;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return v1080Duration
         */
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        /**
         * @return v360Duration
         */
        public Long getV360Duration() {
            return this.v360Duration;
        }

        /**
         * @return v720Duration
         */
        public Long getV720Duration() {
            return this.v720Duration;
        }

        public static final class Builder {
            private Long audioDuration; 
            private Long contentDuration; 
            private String timeStamp; 
            private Long totalDuration; 
            private Long v1080Duration; 
            private Long v360Duration; 
            private Long v720Duration; 

            private Builder() {
            } 

            private Builder(DurationModule model) {
                this.audioDuration = model.audioDuration;
                this.contentDuration = model.contentDuration;
                this.timeStamp = model.timeStamp;
                this.totalDuration = model.totalDuration;
                this.v1080Duration = model.v1080Duration;
                this.v360Duration = model.v360Duration;
                this.v720Duration = model.v720Duration;
            } 

            /**
             * AudioDuration.
             */
            public Builder audioDuration(Long audioDuration) {
                this.audioDuration = audioDuration;
                return this;
            }

            /**
             * ContentDuration.
             */
            public Builder contentDuration(Long contentDuration) {
                this.contentDuration = contentDuration;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * V1080Duration.
             */
            public Builder v1080Duration(Long v1080Duration) {
                this.v1080Duration = v1080Duration;
                return this;
            }

            /**
             * V360Duration.
             */
            public Builder v360Duration(Long v360Duration) {
                this.v360Duration = v360Duration;
                return this;
            }

            /**
             * V720Duration.
             */
            public Builder v720Duration(Long v720Duration) {
                this.v720Duration = v720Duration;
                return this;
            }

            public DurationModule build() {
                return new DurationModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcDurationDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcDurationDataResponseBody</p>
     */
    public static class DurationDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DurationModule")
        private java.util.List<DurationModule> durationModule;

        private DurationDataPerInterval(Builder builder) {
            this.durationModule = builder.durationModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DurationDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return durationModule
         */
        public java.util.List<DurationModule> getDurationModule() {
            return this.durationModule;
        }

        public static final class Builder {
            private java.util.List<DurationModule> durationModule; 

            private Builder() {
            } 

            private Builder(DurationDataPerInterval model) {
                this.durationModule = model.durationModule;
            } 

            /**
             * DurationModule.
             */
            public Builder durationModule(java.util.List<DurationModule> durationModule) {
                this.durationModule = durationModule;
                return this;
            }

            public DurationDataPerInterval build() {
                return new DurationDataPerInterval(this);
            } 

        } 

    }
}
