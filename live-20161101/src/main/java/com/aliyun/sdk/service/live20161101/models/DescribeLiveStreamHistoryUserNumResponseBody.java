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
 * {@link DescribeLiveStreamHistoryUserNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamHistoryUserNumResponseBody</p>
 */
public class DescribeLiveStreamHistoryUserNumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamUserNumInfos")
    private LiveStreamUserNumInfos liveStreamUserNumInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamHistoryUserNumResponseBody(Builder builder) {
        this.liveStreamUserNumInfos = builder.liveStreamUserNumInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamHistoryUserNumResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveStreamUserNumInfos
     */
    public LiveStreamUserNumInfos getLiveStreamUserNumInfos() {
        return this.liveStreamUserNumInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveStreamUserNumInfos liveStreamUserNumInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamHistoryUserNumResponseBody model) {
            this.liveStreamUserNumInfos = model.liveStreamUserNumInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of historical online users for the live stream.</p>
         */
        public Builder liveStreamUserNumInfos(LiveStreamUserNumInfos liveStreamUserNumInfos) {
            this.liveStreamUserNumInfos = liveStreamUserNumInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F5FF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamHistoryUserNumResponseBody build() {
            return new DescribeLiveStreamHistoryUserNumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamHistoryUserNumResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamHistoryUserNumResponseBody</p>
     */
    public static class LiveStreamUserNumInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamTime")
        private String streamTime;

        @com.aliyun.core.annotation.NameInMap("UserNum")
        private String userNum;

        private LiveStreamUserNumInfo(Builder builder) {
            this.streamTime = builder.streamTime;
            this.userNum = builder.userNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamUserNumInfo create() {
            return builder().build();
        }

        /**
         * @return streamTime
         */
        public String getStreamTime() {
            return this.streamTime;
        }

        /**
         * @return userNum
         */
        public String getUserNum() {
            return this.userNum;
        }

        public static final class Builder {
            private String streamTime; 
            private String userNum; 

            private Builder() {
            } 

            private Builder(LiveStreamUserNumInfo model) {
                this.streamTime = model.streamTime;
                this.userNum = model.userNum;
            } 

            /**
             * <p>The time when the stream started. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-10-20T06:20:00Z</p>
             */
            public Builder streamTime(String streamTime) {
                this.streamTime = streamTime;
                return this;
            }

            /**
             * <p>The number of users at the current point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userNum(String userNum) {
                this.userNum = userNum;
                return this;
            }

            public LiveStreamUserNumInfo build() {
                return new LiveStreamUserNumInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamHistoryUserNumResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamHistoryUserNumResponseBody</p>
     */
    public static class LiveStreamUserNumInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamUserNumInfo")
        private java.util.List<LiveStreamUserNumInfo> liveStreamUserNumInfo;

        private LiveStreamUserNumInfos(Builder builder) {
            this.liveStreamUserNumInfo = builder.liveStreamUserNumInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamUserNumInfos create() {
            return builder().build();
        }

        /**
         * @return liveStreamUserNumInfo
         */
        public java.util.List<LiveStreamUserNumInfo> getLiveStreamUserNumInfo() {
            return this.liveStreamUserNumInfo;
        }

        public static final class Builder {
            private java.util.List<LiveStreamUserNumInfo> liveStreamUserNumInfo; 

            private Builder() {
            } 

            private Builder(LiveStreamUserNumInfos model) {
                this.liveStreamUserNumInfo = model.liveStreamUserNumInfo;
            } 

            /**
             * LiveStreamUserNumInfo.
             */
            public Builder liveStreamUserNumInfo(java.util.List<LiveStreamUserNumInfo> liveStreamUserNumInfo) {
                this.liveStreamUserNumInfo = liveStreamUserNumInfo;
                return this;
            }

            public LiveStreamUserNumInfos build() {
                return new LiveStreamUserNumInfos(this);
            } 

        } 

    }
}
