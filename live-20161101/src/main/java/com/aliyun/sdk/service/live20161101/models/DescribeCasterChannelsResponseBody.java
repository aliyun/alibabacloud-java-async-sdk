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
 * {@link DescribeCasterChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterChannelsResponseBody</p>
 */
public class DescribeCasterChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Channels")
    private Channels channels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCasterChannelsResponseBody model) {
            this.channels = model.channels;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The channels.</p>
         */
        public Builder channels(Channels channels) {
            this.channels = channels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83C52866-281E-4AEA-9582-B124********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of channels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterChannelsResponseBody build() {
            return new DescribeCasterChannelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterChannelsResponseBody</p>
     */
    public static class Channel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("FaceBeauty")
        private String faceBeauty;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("RtmpUrl")
        private String rtmpUrl;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
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

            private Builder() {
            } 

            private Builder(Channel model) {
                this.channelId = model.channelId;
                this.faceBeauty = model.faceBeauty;
                this.resourceId = model.resourceId;
                this.rtmpUrl = model.rtmpUrl;
                this.streamUrl = model.streamUrl;
            } 

            /**
             * <p>The ID of the channel.</p>
             * <p>The layout references the channel ID when the channel is enabled. You can specify up to one video resource for the channel. The value of this parameter must be in the RV[Number] format, such as RV01 and RV12.</p>
             * 
             * <strong>example:</strong>
             * <p>RV01</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The face retouching effect. Valid values: 0 (all effects), 1 (skin smoothing), 2 (skin whitening), 3 (dark circles removal), and 4 (nasolabial folds removal).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder faceBeauty(String faceBeauty) {
                this.faceBeauty = faceBeauty;
                return this;
            }

            /**
             * <p>The ID of the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>87642866-281E-4AEA-9582-B124879****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The URL in the Real-Time Messaging Protocol (RTMP) format.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://demo.aliyundoc.com/caster/rtmperf?auth_key=****</p>
             */
            public Builder rtmpUrl(String rtmpUrl) {
                this.rtmpUrl = rtmpUrl;
                return this;
            }

            /**
             * <p>The URL of the output content in the channel.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://demo.aliyundoc.com/caster/streamwsx.flv?auth_key=YYYYY">http://demo.aliyundoc.com/caster/streamwsx.flv?auth_key=YYYYY</a></p>
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
    /**
     * 
     * {@link DescribeCasterChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterChannelsResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private java.util.List<Channel> channel;

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
        public java.util.List<Channel> getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private java.util.List<Channel> channel; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.channel = model.channel;
            } 

            /**
             * Channel.
             */
            public Builder channel(java.util.List<Channel> channel) {
                this.channel = channel;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
}
