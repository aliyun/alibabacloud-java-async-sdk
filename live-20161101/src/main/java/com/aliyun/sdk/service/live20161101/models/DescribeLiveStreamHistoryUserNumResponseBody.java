// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamHistoryUserNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamHistoryUserNumResponseBody</p>
 */
public class DescribeLiveStreamHistoryUserNumResponseBody extends TeaModel {
    @NameInMap("LiveStreamUserNumInfos")
    private LiveStreamUserNumInfos liveStreamUserNumInfos;

    @NameInMap("RequestId")
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

        /**
         * LiveStreamUserNumInfos.
         */
        public Builder liveStreamUserNumInfos(LiveStreamUserNumInfos liveStreamUserNumInfos) {
            this.liveStreamUserNumInfos = liveStreamUserNumInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamHistoryUserNumResponseBody build() {
            return new DescribeLiveStreamHistoryUserNumResponseBody(this);
        } 

    } 

    public static class LiveStreamUserNumInfo extends TeaModel {
        @NameInMap("StreamTime")
        private String streamTime;

        @NameInMap("UserNum")
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

            /**
             * StreamTime.
             */
            public Builder streamTime(String streamTime) {
                this.streamTime = streamTime;
                return this;
            }

            /**
             * UserNum.
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
    public static class LiveStreamUserNumInfos extends TeaModel {
        @NameInMap("LiveStreamUserNumInfo")
        private java.util.List < LiveStreamUserNumInfo> liveStreamUserNumInfo;

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
        public java.util.List < LiveStreamUserNumInfo> getLiveStreamUserNumInfo() {
            return this.liveStreamUserNumInfo;
        }

        public static final class Builder {
            private java.util.List < LiveStreamUserNumInfo> liveStreamUserNumInfo; 

            /**
             * LiveStreamUserNumInfo.
             */
            public Builder liveStreamUserNumInfo(java.util.List < LiveStreamUserNumInfo> liveStreamUserNumInfo) {
                this.liveStreamUserNumInfo = liveStreamUserNumInfo;
                return this;
            }

            public LiveStreamUserNumInfos build() {
                return new LiveStreamUserNumInfos(this);
            } 

        } 

    }
}
