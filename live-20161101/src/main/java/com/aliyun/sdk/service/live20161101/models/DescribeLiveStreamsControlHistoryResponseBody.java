// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamsControlHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsControlHistoryResponseBody</p>
 */
public class DescribeLiveStreamsControlHistoryResponseBody extends TeaModel {
    @NameInMap("ControlInfo")
    private ControlInfo controlInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamsControlHistoryResponseBody(Builder builder) {
        this.controlInfo = builder.controlInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamsControlHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return controlInfo
     */
    public ControlInfo getControlInfo() {
        return this.controlInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ControlInfo controlInfo; 
        private String requestId; 

        /**
         * ControlInfo.
         */
        public Builder controlInfo(ControlInfo controlInfo) {
            this.controlInfo = controlInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamsControlHistoryResponseBody build() {
            return new DescribeLiveStreamsControlHistoryResponseBody(this);
        } 

    } 

    public static class LiveStreamControlInfo extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ClientIP")
        private String clientIP;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private LiveStreamControlInfo(Builder builder) {
            this.action = builder.action;
            this.clientIP = builder.clientIP;
            this.streamName = builder.streamName;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamControlInfo create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return clientIP
         */
        public String getClientIP() {
            return this.clientIP;
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
            private String action; 
            private String clientIP; 
            private String streamName; 
            private String timeStamp; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ClientIP.
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public LiveStreamControlInfo build() {
                return new LiveStreamControlInfo(this);
            } 

        } 

    }
    public static class ControlInfo extends TeaModel {
        @NameInMap("LiveStreamControlInfo")
        private java.util.List < LiveStreamControlInfo> liveStreamControlInfo;

        private ControlInfo(Builder builder) {
            this.liveStreamControlInfo = builder.liveStreamControlInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlInfo create() {
            return builder().build();
        }

        /**
         * @return liveStreamControlInfo
         */
        public java.util.List < LiveStreamControlInfo> getLiveStreamControlInfo() {
            return this.liveStreamControlInfo;
        }

        public static final class Builder {
            private java.util.List < LiveStreamControlInfo> liveStreamControlInfo; 

            /**
             * LiveStreamControlInfo.
             */
            public Builder liveStreamControlInfo(java.util.List < LiveStreamControlInfo> liveStreamControlInfo) {
                this.liveStreamControlInfo = liveStreamControlInfo;
                return this;
            }

            public ControlInfo build() {
                return new ControlInfo(this);
            } 

        } 

    }
}
