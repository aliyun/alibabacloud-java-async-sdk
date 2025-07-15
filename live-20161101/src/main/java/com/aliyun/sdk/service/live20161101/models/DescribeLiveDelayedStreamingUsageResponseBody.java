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
 * {@link DescribeLiveDelayedStreamingUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDelayedStreamingUsageResponseBody</p>
 */
public class DescribeLiveDelayedStreamingUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DelayData")
    private DelayData delayData;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveDelayedStreamingUsageResponseBody(Builder builder) {
        this.delayData = builder.delayData;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDelayedStreamingUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delayData
     */
    public DelayData getDelayData() {
        return this.delayData;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
        private DelayData delayData; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLiveDelayedStreamingUsageResponseBody model) {
            this.delayData = model.delayData;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The details about the stream delay usage data.</p>
         */
        public Builder delayData(DelayData delayData) {
            this.delayData = delayData;
            return this;
        }

        /**
         * <p>The end of the time range during which the data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveDelayedStreamingUsageResponseBody build() {
            return new DescribeLiveDelayedStreamingUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDelayedStreamingUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDelayedStreamingUsageResponseBody</p>
     */
    public static class DelayDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DelayDataItem(Builder builder) {
            this.domainName = builder.domainName;
            this.duration = builder.duration;
            this.region = builder.region;
            this.streamName = builder.streamName;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayDataItem create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String domainName; 
            private Long duration; 
            private String region; 
            private String streamName; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(DelayDataItem model) {
                this.domainName = model.domainName;
                this.duration = model.duration;
                this.region = model.region;
                this.streamName = model.streamName;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The domain name. If SplitBy is set to domain, the data returned is grouped by domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The duration of stream delay.</p>
             * 
             * <strong>example:</strong>
             * <p>84</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the region. If SplitBy is set to region, the data returned is grouped by region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the stream. If SplitBy is set to stream, the data returned is grouped by stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public DelayDataItem build() {
                return new DelayDataItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDelayedStreamingUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDelayedStreamingUsageResponseBody</p>
     */
    public static class DelayData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelayDataItem")
        private java.util.List<DelayDataItem> delayDataItem;

        private DelayData(Builder builder) {
            this.delayDataItem = builder.delayDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayData create() {
            return builder().build();
        }

        /**
         * @return delayDataItem
         */
        public java.util.List<DelayDataItem> getDelayDataItem() {
            return this.delayDataItem;
        }

        public static final class Builder {
            private java.util.List<DelayDataItem> delayDataItem; 

            private Builder() {
            } 

            private Builder(DelayData model) {
                this.delayDataItem = model.delayDataItem;
            } 

            /**
             * DelayDataItem.
             */
            public Builder delayDataItem(java.util.List<DelayDataItem> delayDataItem) {
                this.delayDataItem = delayDataItem;
                return this;
            }

            public DelayData build() {
                return new DelayData(this);
            } 

        } 

    }
}
