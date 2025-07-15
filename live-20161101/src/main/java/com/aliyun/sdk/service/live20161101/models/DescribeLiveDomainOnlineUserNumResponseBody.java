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
 * {@link DescribeLiveDomainOnlineUserNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainOnlineUserNumResponseBody</p>
 */
public class DescribeLiveDomainOnlineUserNumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnlineUserInfo")
    private OnlineUserInfo onlineUserInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamCount")
    private Integer streamCount;

    @com.aliyun.core.annotation.NameInMap("UserCount")
    private Integer userCount;

    private DescribeLiveDomainOnlineUserNumResponseBody(Builder builder) {
        this.onlineUserInfo = builder.onlineUserInfo;
        this.requestId = builder.requestId;
        this.streamCount = builder.streamCount;
        this.userCount = builder.userCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainOnlineUserNumResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onlineUserInfo
     */
    public OnlineUserInfo getOnlineUserInfo() {
        return this.onlineUserInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamCount
     */
    public Integer getStreamCount() {
        return this.streamCount;
    }

    /**
     * @return userCount
     */
    public Integer getUserCount() {
        return this.userCount;
    }

    public static final class Builder {
        private OnlineUserInfo onlineUserInfo; 
        private String requestId; 
        private Integer streamCount; 
        private Integer userCount; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainOnlineUserNumResponseBody model) {
            this.onlineUserInfo = model.onlineUserInfo;
            this.requestId = model.requestId;
            this.streamCount = model.streamCount;
            this.userCount = model.userCount;
        } 

        /**
         * <p>The information about the streams.</p>
         */
        public Builder onlineUserInfo(OnlineUserInfo onlineUserInfo) {
            this.onlineUserInfo = onlineUserInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3A3A8C3D-F8B2-4FBF-9319-771A11B855FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder streamCount(Integer streamCount) {
            this.streamCount = streamCount;
            return this;
        }

        /**
         * <p>The total number of online users at the specified point in time for all the live streams under the main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }

        public DescribeLiveDomainOnlineUserNumResponseBody build() {
            return new DescribeLiveDomainOnlineUserNumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainOnlineUserNumResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainOnlineUserNumResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TranscodeTemplate")
        private String transcodeTemplate;

        @com.aliyun.core.annotation.NameInMap("UserNumber")
        private Long userNumber;

        private Info(Builder builder) {
            this.transcodeTemplate = builder.transcodeTemplate;
            this.userNumber = builder.userNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return transcodeTemplate
         */
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        /**
         * @return userNumber
         */
        public Long getUserNumber() {
            return this.userNumber;
        }

        public static final class Builder {
            private String transcodeTemplate; 
            private Long userNumber; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.transcodeTemplate = model.transcodeTemplate;
                this.userNumber = model.userNumber;
            } 

            /**
             * <p>The transcoding template. A value of origin indicates that the stream is a source stream.</p>
             * 
             * <strong>example:</strong>
             * <p>origin</p>
             */
            public Builder transcodeTemplate(String transcodeTemplate) {
                this.transcodeTemplate = transcodeTemplate;
                return this;
            }

            /**
             * <p>The number of online users for the stream, which can be a source stream or transcoded stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userNumber(Long userNumber) {
                this.userNumber = userNumber;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainOnlineUserNumResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainOnlineUserNumResponseBody</p>
     */
    public static class Infos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private java.util.List<Info> info;

        private Infos(Builder builder) {
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Infos create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public java.util.List<Info> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private java.util.List<Info> info; 

            private Builder() {
            } 

            private Builder(Infos model) {
                this.info = model.info;
            } 

            /**
             * Info.
             */
            public Builder info(java.util.List<Info> info) {
                this.info = info;
                return this;
            }

            public Infos build() {
                return new Infos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainOnlineUserNumResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainOnlineUserNumResponseBody</p>
     */
    public static class LiveStreamOnlineUserNumInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Infos")
        private Infos infos;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private LiveStreamOnlineUserNumInfo(Builder builder) {
            this.infos = builder.infos;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamOnlineUserNumInfo create() {
            return builder().build();
        }

        /**
         * @return infos
         */
        public Infos getInfos() {
            return this.infos;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private Infos infos; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(LiveStreamOnlineUserNumInfo model) {
                this.infos = model.infos;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The statistics on the stream.</p>
             */
            public Builder infos(Infos infos) {
                this.infos = infos;
                return this;
            }

            /**
             * <p>The name of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://example.com/test/liveStream****_3_1</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public LiveStreamOnlineUserNumInfo build() {
                return new LiveStreamOnlineUserNumInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainOnlineUserNumResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainOnlineUserNumResponseBody</p>
     */
    public static class OnlineUserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamOnlineUserNumInfo")
        private java.util.List<LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo;

        private OnlineUserInfo(Builder builder) {
            this.liveStreamOnlineUserNumInfo = builder.liveStreamOnlineUserNumInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineUserInfo create() {
            return builder().build();
        }

        /**
         * @return liveStreamOnlineUserNumInfo
         */
        public java.util.List<LiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfo() {
            return this.liveStreamOnlineUserNumInfo;
        }

        public static final class Builder {
            private java.util.List<LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo; 

            private Builder() {
            } 

            private Builder(OnlineUserInfo model) {
                this.liveStreamOnlineUserNumInfo = model.liveStreamOnlineUserNumInfo;
            } 

            /**
             * LiveStreamOnlineUserNumInfo.
             */
            public Builder liveStreamOnlineUserNumInfo(java.util.List<LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo) {
                this.liveStreamOnlineUserNumInfo = liveStreamOnlineUserNumInfo;
                return this;
            }

            public OnlineUserInfo build() {
                return new OnlineUserInfo(this);
            } 

        } 

    }
}
