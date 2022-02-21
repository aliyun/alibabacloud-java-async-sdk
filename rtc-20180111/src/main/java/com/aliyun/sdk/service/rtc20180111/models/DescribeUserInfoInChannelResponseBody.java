// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserInfoInChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserInfoInChannelResponseBody</p>
 */
public class DescribeUserInfoInChannelResponseBody extends TeaModel {
    @NameInMap("IsChannelExist")
    private Boolean isChannelExist;

    @NameInMap("IsInChannel")
    private Boolean isInChannel;

    @NameInMap("Property")
    private java.util.List < Property> property;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Timestamp")
    private Integer timestamp;

    private DescribeUserInfoInChannelResponseBody(Builder builder) {
        this.isChannelExist = builder.isChannelExist;
        this.isInChannel = builder.isInChannel;
        this.property = builder.property;
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserInfoInChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return isChannelExist
     */
    public Boolean getIsChannelExist() {
        return this.isChannelExist;
    }

    /**
     * @return isInChannel
     */
    public Boolean getIsInChannel() {
        return this.isInChannel;
    }

    /**
     * @return property
     */
    public java.util.List < Property> getProperty() {
        return this.property;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timestamp
     */
    public Integer getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Boolean isChannelExist; 
        private Boolean isInChannel; 
        private java.util.List < Property> property; 
        private String requestId; 
        private Integer timestamp; 

        /**
         * IsChannelExist.
         */
        public Builder isChannelExist(Boolean isChannelExist) {
            this.isChannelExist = isChannelExist;
            return this;
        }

        /**
         * IsInChannel.
         */
        public Builder isInChannel(Boolean isInChannel) {
            this.isInChannel = isInChannel;
            return this;
        }

        /**
         * Property.
         */
        public Builder property(java.util.List < Property> property) {
            this.property = property;
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
         * Timestamp.
         */
        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public DescribeUserInfoInChannelResponseBody build() {
            return new DescribeUserInfoInChannelResponseBody(this);
        } 

    } 

    public static class Property extends TeaModel {
        @NameInMap("Join")
        private Integer join;

        @NameInMap("Role")
        private Integer role;

        @NameInMap("Session")
        private String session;

        private Property(Builder builder) {
            this.join = builder.join;
            this.role = builder.role;
            this.session = builder.session;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Property create() {
            return builder().build();
        }

        /**
         * @return join
         */
        public Integer getJoin() {
            return this.join;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        /**
         * @return session
         */
        public String getSession() {
            return this.session;
        }

        public static final class Builder {
            private Integer join; 
            private Integer role; 
            private String session; 

            /**
             * Join.
             */
            public Builder join(Integer join) {
                this.join = join;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            /**
             * Session.
             */
            public Builder session(String session) {
                this.session = session;
                return this;
            }

            public Property build() {
                return new Property(this);
            } 

        } 

    }
}
