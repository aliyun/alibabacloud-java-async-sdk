// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelUserResponseBody</p>
 */
public class DescribeChannelUserResponseBody extends TeaModel {
    @NameInMap("ChannelExist")
    private Boolean channelExist;

    @NameInMap("InChannel")
    private Boolean inChannel;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sessions")
    private java.util.List < Sessions> sessions;

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
    public java.util.List < Sessions> getSessions() {
        return this.sessions;
    }

    public static final class Builder {
        private Boolean channelExist; 
        private Boolean inChannel; 
        private String requestId; 
        private java.util.List < Sessions> sessions; 

        /**
         * ChannelExist.
         */
        public Builder channelExist(Boolean channelExist) {
            this.channelExist = channelExist;
            return this;
        }

        /**
         * InChannel.
         */
        public Builder inChannel(Boolean inChannel) {
            this.inChannel = inChannel;
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
         * Sessions.
         */
        public Builder sessions(java.util.List < Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        public DescribeChannelUserResponseBody build() {
            return new DescribeChannelUserResponseBody(this);
        } 

    } 

    public static class Sessions extends TeaModel {
        @NameInMap("Joined")
        private Long joined;

        @NameInMap("SessionId")
        private String sessionId;

        @NameInMap("UserId")
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

            /**
             * Joined.
             */
            public Builder joined(Long joined) {
                this.joined = joined;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * UserId.
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
