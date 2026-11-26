// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelResponseBody</p>
 */
public class DescribeChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Channel")
    private Channel channel;

    @com.aliyun.core.annotation.NameInMap("ChannelExist")
    private Boolean channelExist;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeChannelResponseBody(Builder builder) {
        this.channel = builder.channel;
        this.channelExist = builder.channelExist;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public Channel getChannel() {
        return this.channel;
    }

    /**
     * @return channelExist
     */
    public Boolean getChannelExist() {
        return this.channelExist;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Channel channel; 
        private Boolean channelExist; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeChannelResponseBody model) {
            this.channel = model.channel;
            this.channelExist = model.channelExist;
            this.requestId = model.requestId;
        } 

        /**
         * <p>channel</p>
         */
        public Builder channel(Channel channel) {
            this.channel = channel;
            return this;
        }

        /**
         * <p>Indicates whether the channel exists. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: The channel exists.  </li>
         * <li><strong>false</strong>: The channel does not exist.</li>
         * </ul>
         */
        public Builder channelExist(Boolean channelExist) {
            this.channelExist = channelExist;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeChannelResponseBody build() {
            return new DescribeChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelResponseBody</p>
     */
    public static class Channel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Channel(Builder builder) {
            this.channelId = builder.channelId;
            this.startTime = builder.startTime;
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
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String channelId; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Channel model) {
                this.channelId = model.channelId;
                this.startTime = model.startTime;
            } 

            /**
             * <p>channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testid</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The UNIX timestamp (in seconds) indicating when the channel started (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>1557909133</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Channel build() {
                return new Channel(this);
            } 

        } 

    }
}
