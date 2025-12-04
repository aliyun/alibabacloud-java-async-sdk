// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveRtcRecordUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRtcRecordUsageDataResponseBody</p>
 */
public class DescribeLiveRtcRecordUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AudioSummaryDuration")
    private Double audioSummaryDuration;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RecordMode")
    private String recordMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalSummaryDuration")
    private Double totalSummaryDuration;

    @com.aliyun.core.annotation.NameInMap("V1080SummaryDuration")
    private Double v1080SummaryDuration;

    @com.aliyun.core.annotation.NameInMap("V480SummaryDuration")
    private Double v480SummaryDuration;

    @com.aliyun.core.annotation.NameInMap("V720SummaryDuration")
    private Double v720SummaryDuration;

    private DescribeLiveRtcRecordUsageDataResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.audioSummaryDuration = builder.audioSummaryDuration;
        this.data = builder.data;
        this.recordMode = builder.recordMode;
        this.requestId = builder.requestId;
        this.totalSummaryDuration = builder.totalSummaryDuration;
        this.v1080SummaryDuration = builder.v1080SummaryDuration;
        this.v480SummaryDuration = builder.v480SummaryDuration;
        this.v720SummaryDuration = builder.v720SummaryDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRtcRecordUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return audioSummaryDuration
     */
    public Double getAudioSummaryDuration() {
        return this.audioSummaryDuration;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return recordMode
     */
    public String getRecordMode() {
        return this.recordMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalSummaryDuration
     */
    public Double getTotalSummaryDuration() {
        return this.totalSummaryDuration;
    }

    /**
     * @return v1080SummaryDuration
     */
    public Double getV1080SummaryDuration() {
        return this.v1080SummaryDuration;
    }

    /**
     * @return v480SummaryDuration
     */
    public Double getV480SummaryDuration() {
        return this.v480SummaryDuration;
    }

    /**
     * @return v720SummaryDuration
     */
    public Double getV720SummaryDuration() {
        return this.v720SummaryDuration;
    }

    public static final class Builder {
        private String appId; 
        private Double audioSummaryDuration; 
        private java.util.List<Data> data; 
        private String recordMode; 
        private String requestId; 
        private Double totalSummaryDuration; 
        private Double v1080SummaryDuration; 
        private Double v480SummaryDuration; 
        private Double v720SummaryDuration; 

        private Builder() {
        } 

        private Builder(DescribeLiveRtcRecordUsageDataResponseBody model) {
            this.appId = model.appId;
            this.audioSummaryDuration = model.audioSummaryDuration;
            this.data = model.data;
            this.recordMode = model.recordMode;
            this.requestId = model.requestId;
            this.totalSummaryDuration = model.totalSummaryDuration;
            this.v1080SummaryDuration = model.v1080SummaryDuration;
            this.v480SummaryDuration = model.v480SummaryDuration;
            this.v720SummaryDuration = model.v720SummaryDuration;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AudioSummaryDuration.
         */
        public Builder audioSummaryDuration(Double audioSummaryDuration) {
            this.audioSummaryDuration = audioSummaryDuration;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RecordMode.
         */
        public Builder recordMode(String recordMode) {
            this.recordMode = recordMode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F2*************B92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalSummaryDuration.
         */
        public Builder totalSummaryDuration(Double totalSummaryDuration) {
            this.totalSummaryDuration = totalSummaryDuration;
            return this;
        }

        /**
         * V1080SummaryDuration.
         */
        public Builder v1080SummaryDuration(Double v1080SummaryDuration) {
            this.v1080SummaryDuration = v1080SummaryDuration;
            return this;
        }

        /**
         * V480SummaryDuration.
         */
        public Builder v480SummaryDuration(Double v480SummaryDuration) {
            this.v480SummaryDuration = v480SummaryDuration;
            return this;
        }

        /**
         * V720SummaryDuration.
         */
        public Builder v720SummaryDuration(Double v720SummaryDuration) {
            this.v720SummaryDuration = v720SummaryDuration;
            return this;
        }

        public DescribeLiveRtcRecordUsageDataResponseBody build() {
            return new DescribeLiveRtcRecordUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveRtcRecordUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRtcRecordUsageDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioDuration")
        private Double audioDuration;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Double totalDuration;

        @com.aliyun.core.annotation.NameInMap("V1080Duration")
        private Double v1080Duration;

        @com.aliyun.core.annotation.NameInMap("V480Duration")
        private Double v480Duration;

        @com.aliyun.core.annotation.NameInMap("V720Duration")
        private Double v720Duration;

        private Data(Builder builder) {
            this.audioDuration = builder.audioDuration;
            this.timestamp = builder.timestamp;
            this.totalDuration = builder.totalDuration;
            this.v1080Duration = builder.v1080Duration;
            this.v480Duration = builder.v480Duration;
            this.v720Duration = builder.v720Duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioDuration
         */
        public Double getAudioDuration() {
            return this.audioDuration;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalDuration
         */
        public Double getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return v1080Duration
         */
        public Double getV1080Duration() {
            return this.v1080Duration;
        }

        /**
         * @return v480Duration
         */
        public Double getV480Duration() {
            return this.v480Duration;
        }

        /**
         * @return v720Duration
         */
        public Double getV720Duration() {
            return this.v720Duration;
        }

        public static final class Builder {
            private Double audioDuration; 
            private String timestamp; 
            private Double totalDuration; 
            private Double v1080Duration; 
            private Double v480Duration; 
            private Double v720Duration; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.audioDuration = model.audioDuration;
                this.timestamp = model.timestamp;
                this.totalDuration = model.totalDuration;
                this.v1080Duration = model.v1080Duration;
                this.v480Duration = model.v480Duration;
                this.v720Duration = model.v720Duration;
            } 

            /**
             * AudioDuration.
             */
            public Builder audioDuration(Double audioDuration) {
                this.audioDuration = audioDuration;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Double totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * V1080Duration.
             */
            public Builder v1080Duration(Double v1080Duration) {
                this.v1080Duration = v1080Duration;
                return this;
            }

            /**
             * V480Duration.
             */
            public Builder v480Duration(Double v480Duration) {
                this.v480Duration = v480Duration;
                return this;
            }

            /**
             * V720Duration.
             */
            public Builder v720Duration(Double v720Duration) {
                this.v720Duration = v720Duration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
