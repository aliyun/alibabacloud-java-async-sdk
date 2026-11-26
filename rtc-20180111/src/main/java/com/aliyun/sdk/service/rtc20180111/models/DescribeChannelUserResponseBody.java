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
 * {@link DescribeChannelUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelUserResponseBody</p>
 */
public class DescribeChannelUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelExist")
    private Boolean channelExist;

    @com.aliyun.core.annotation.NameInMap("InChannel")
    private Boolean inChannel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sessions")
    private java.util.List<Sessions> sessions;

    private DescribeChannelUserResponseBody(Builder builder) {
        this.channelExist = builder.channelExist;
        this.inChannel = builder.inChannel;
        this.requestId = builder.requestId;
        this.sessions = builder.sessions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelExist
     */
    public Boolean getChannelExist() {
        return this.channelExist;
    }

    /**
     * @return inChannel
     */
    public Boolean getInChannel() {
        return this.inChannel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessions
     */
    public java.util.List<Sessions> getSessions() {
        return this.sessions;
    }

    public static final class Builder {
        private Boolean channelExist; 
        private Boolean inChannel; 
        private String requestId; 
        private java.util.List<Sessions> sessions; 

        private Builder() {
        } 

        private Builder(DescribeChannelUserResponseBody model) {
            this.channelExist = model.channelExist;
            this.inChannel = model.inChannel;
            this.requestId = model.requestId;
            this.sessions = model.sessions;
        } 

        /**
         * <p>Indicates whether the channel exists. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The channel exists.</li>
         * <li><strong>false</strong>: The channel does not exist.</li>
         * </ul>
         */
        public Builder channelExist(Boolean channelExist) {
            this.channelExist = channelExist;
            return this;
        }

        /**
         * <p>Indicates whether the user is currently in the channel. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The user is in the channel.</li>
         * <li><strong>false</strong>: The user is not in the channel.</li>
         * </ul>
         */
        public Builder inChannel(Boolean inChannel) {
            this.inChannel = inChannel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of session information.</p>
         */
        public Builder sessions(java.util.List<Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        public DescribeChannelUserResponseBody build() {
            return new DescribeChannelUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelUserResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Joined")
        private Long joined;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Sessions(Builder builder) {
            this.joined = builder.joined;
            this.sessionId = builder.sessionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return joined
         */
        public Long getJoined() {
            return this.joined;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long joined; 
            private String sessionId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.joined = model.joined;
                this.sessionId = model.sessionId;
                this.userId = model.userId;
            } 

            /**
             * <p>The UNIX timestamp in seconds when the user joined the channel. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1557909133</p>
             */
            public Builder joined(Long joined) {
                this.joined = joined;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xa744sxx8rtobgj****</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1811****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
