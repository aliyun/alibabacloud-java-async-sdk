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
 * {@link DescribeLiveStreamsControlHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsControlHistoryResponseBody</p>
 */
public class DescribeLiveStreamsControlHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ControlInfo")
    private ControlInfo controlInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamsControlHistoryResponseBody model) {
            this.controlInfo = model.controlInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The operation records.</p>
         */
        public Builder controlInfo(ControlInfo controlInfo) {
            this.controlInfo = controlInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9C31856F-386D-4DB3-BE79-A0AA493D702A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamsControlHistoryResponseBody build() {
            return new DescribeLiveStreamsControlHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamsControlHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsControlHistoryResponseBody</p>
     */
    public static class LiveStreamControlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(LiveStreamControlInfo model) {
                this.action = model.action;
                this.clientIP = model.clientIP;
                this.streamName = model.streamName;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The name of the operation performed.</p>
             * 
             * <strong>example:</strong>
             * <p>DescribeLiveStreamsControlHistory</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The IP address that is used by the client for live streaming.</p>
             * 
             * <strong>example:</strong>
             * <p>10.207.XX.XX</p>
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The time when the operation was performed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-01T16:36:18Z</p>
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
    /**
     * 
     * {@link DescribeLiveStreamsControlHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsControlHistoryResponseBody</p>
     */
    public static class ControlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamControlInfo")
        private java.util.List<LiveStreamControlInfo> liveStreamControlInfo;

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
        public java.util.List<LiveStreamControlInfo> getLiveStreamControlInfo() {
            return this.liveStreamControlInfo;
        }

        public static final class Builder {
            private java.util.List<LiveStreamControlInfo> liveStreamControlInfo; 

            private Builder() {
            } 

            private Builder(ControlInfo model) {
                this.liveStreamControlInfo = model.liveStreamControlInfo;
            } 

            /**
             * LiveStreamControlInfo.
             */
            public Builder liveStreamControlInfo(java.util.List<LiveStreamControlInfo> liveStreamControlInfo) {
                this.liveStreamControlInfo = liveStreamControlInfo;
                return this;
            }

            public ControlInfo build() {
                return new ControlInfo(this);
            } 

        } 

    }
}
