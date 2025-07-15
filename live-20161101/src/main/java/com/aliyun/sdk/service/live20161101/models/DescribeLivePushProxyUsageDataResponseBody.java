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
 * {@link DescribeLivePushProxyUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePushProxyUsageDataResponseBody</p>
 */
public class DescribeLivePushProxyUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PushProxyData")
    private PushProxyData pushProxyData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLivePushProxyUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.pushProxyData = builder.pushProxyData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLivePushProxyUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pushProxyData
     */
    public PushProxyData getPushProxyData() {
        return this.pushProxyData;
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
        private PushProxyData pushProxyData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLivePushProxyUsageDataResponseBody model) {
            this.endTime = model.endTime;
            this.pushProxyData = model.pushProxyData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The usage data of live center stream relay.</p>
         */
        public Builder pushProxyData(PushProxyData pushProxyData) {
            this.pushProxyData = pushProxyData;
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
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLivePushProxyUsageDataResponseBody build() {
            return new DescribeLivePushProxyUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLivePushProxyUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePushProxyUsageDataResponseBody</p>
     */
    public static class PushProxyDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StreamCount")
        private Long streamCount;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private PushProxyDataItem(Builder builder) {
            this.domainName = builder.domainName;
            this.region = builder.region;
            this.streamCount = builder.streamCount;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushProxyDataItem create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return streamCount
         */
        public Long getStreamCount() {
            return this.streamCount;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String domainName; 
            private String region; 
            private Long streamCount; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(PushProxyDataItem model) {
                this.domainName = model.domainName;
                this.region = model.region;
                this.streamCount = model.streamCount;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The domain name. If the value of SplitBy includes domain, the returned data is grouped by domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ID of the region. If the value of SplitBy includes region, the returned data is grouped by region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The peak number of live center stream relay channels.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder streamCount(Long streamCount) {
                this.streamCount = streamCount;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public PushProxyDataItem build() {
                return new PushProxyDataItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLivePushProxyUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePushProxyUsageDataResponseBody</p>
     */
    public static class PushProxyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushProxyDataItem")
        private java.util.List<PushProxyDataItem> pushProxyDataItem;

        private PushProxyData(Builder builder) {
            this.pushProxyDataItem = builder.pushProxyDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushProxyData create() {
            return builder().build();
        }

        /**
         * @return pushProxyDataItem
         */
        public java.util.List<PushProxyDataItem> getPushProxyDataItem() {
            return this.pushProxyDataItem;
        }

        public static final class Builder {
            private java.util.List<PushProxyDataItem> pushProxyDataItem; 

            private Builder() {
            } 

            private Builder(PushProxyData model) {
                this.pushProxyDataItem = model.pushProxyDataItem;
            } 

            /**
             * PushProxyDataItem.
             */
            public Builder pushProxyDataItem(java.util.List<PushProxyDataItem> pushProxyDataItem) {
                this.pushProxyDataItem = pushProxyDataItem;
                return this;
            }

            public PushProxyData build() {
                return new PushProxyData(this);
            } 

        } 

    }
}
