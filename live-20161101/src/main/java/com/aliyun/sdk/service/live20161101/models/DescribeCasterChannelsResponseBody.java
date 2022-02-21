// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterChannelsResponseBody</p>
 */
public class DescribeCasterChannelsResponseBody extends TeaModel {
    @NameInMap("Channels")
    private Channels channels;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeCasterChannelsResponseBody(Builder builder) {
        this.channels = builder.channels;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterChannelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return channels
     */
    public Channels getChannels() {
        return this.channels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Channels channels; 
        private String requestId; 
        private Integer total; 

        /**
         * Channels.
         */
        public Builder channels(Channels channels) {
            this.channels = channels;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterChannelsResponseBody build() {
            return new DescribeCasterChannelsResponseBody(this);
        } 

    } 

    public static class Channel extends TeaModel {
        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("FaceBeauty")
        private String faceBeauty;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("RtmpUrl")
        private String rtmpUrl;

        @NameInMap("StreamUrl")
        private String streamUrl;

        private Channel(Builder builder) {
            this.channelId = builder.channelId;
            this.faceBeauty = builder.faceBeauty;
            this.resourceId = builder.resourceId;
            this.rtmpUrl = builder.rtmpUrl;
            this.streamUrl = builder.streamUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channel create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return faceBeauty
         */
        public String getFaceBeauty() {
            return this.faceBeauty;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return rtmpUrl
         */
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public static final class Builder {
            private String channelId; 
            private String faceBeauty; 
            private String resourceId; 
            private String rtmpUrl; 
            private String streamUrl; 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * FaceBeauty.
             */
            public Builder faceBeauty(String faceBeauty) {
                this.faceBeauty = faceBeauty;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * RtmpUrl.
             */
            public Builder rtmpUrl(String rtmpUrl) {
                this.rtmpUrl = rtmpUrl;
                return this;
            }

            /**
             * StreamUrl.
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            public Channel build() {
                return new Channel(this);
            } 

        } 

    }
    public static class Channels extends TeaModel {
        @NameInMap("Channel")
        private java.util.List < Channel> channel;

        private Channels(Builder builder) {
            this.channel = builder.channel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public java.util.List < Channel> getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private java.util.List < Channel> channel; 

            /**
             * Channel.
             */
            public Builder channel(java.util.List < Channel> channel) {
                this.channel = channel;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
}
