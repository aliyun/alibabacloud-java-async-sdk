// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsDomainOnlineUserNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainOnlineUserNumResponseBody</p>
 */
public class DescribeVsDomainOnlineUserNumResponseBody extends TeaModel {
    @NameInMap("OnlineUserInfo")
    private OnlineUserInfo onlineUserInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamCount")
    private Integer streamCount;

    @NameInMap("UserCount")
    private Integer userCount;

    private DescribeVsDomainOnlineUserNumResponseBody(Builder builder) {
        this.onlineUserInfo = builder.onlineUserInfo;
        this.requestId = builder.requestId;
        this.streamCount = builder.streamCount;
        this.userCount = builder.userCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainOnlineUserNumResponseBody create() {
        return builder().build();
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

        /**
         * OnlineUserInfo.
         */
        public Builder onlineUserInfo(OnlineUserInfo onlineUserInfo) {
            this.onlineUserInfo = onlineUserInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamCount.
         */
        public Builder streamCount(Integer streamCount) {
            this.streamCount = streamCount;
            return this;
        }

        /**
         * UserCount.
         */
        public Builder userCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }

        public DescribeVsDomainOnlineUserNumResponseBody build() {
            return new DescribeVsDomainOnlineUserNumResponseBody(this);
        } 

    } 

    public static class Info extends TeaModel {
        @NameInMap("TranscodeTemplate")
        private String transcodeTemplate;

        @NameInMap("UserNumber")
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

            /**
             * TranscodeTemplate.
             */
            public Builder transcodeTemplate(String transcodeTemplate) {
                this.transcodeTemplate = transcodeTemplate;
                return this;
            }

            /**
             * UserNumber.
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
    public static class Infos extends TeaModel {
        @NameInMap("Info")
        private java.util.List < Info> info;

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
        public java.util.List < Info> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private java.util.List < Info> info; 

            /**
             * Info.
             */
            public Builder info(java.util.List < Info> info) {
                this.info = info;
                return this;
            }

            public Infos build() {
                return new Infos(this);
            } 

        } 

    }
    public static class LiveStreamOnlineUserNumInfo extends TeaModel {
        @NameInMap("Infos")
        private Infos infos;

        @NameInMap("StreamName")
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

            /**
             * Infos.
             */
            public Builder infos(Infos infos) {
                this.infos = infos;
                return this;
            }

            /**
             * StreamName.
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
    public static class OnlineUserInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineUserNumInfo")
        private java.util.List < LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo;

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
        public java.util.List < LiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfo() {
            return this.liveStreamOnlineUserNumInfo;
        }

        public static final class Builder {
            private java.util.List < LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo; 

            /**
             * LiveStreamOnlineUserNumInfo.
             */
            public Builder liveStreamOnlineUserNumInfo(java.util.List < LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo) {
                this.liveStreamOnlineUserNumInfo = liveStreamOnlineUserNumInfo;
                return this;
            }

            public OnlineUserInfo build() {
                return new OnlineUserInfo(this);
            } 

        } 

    }
}
