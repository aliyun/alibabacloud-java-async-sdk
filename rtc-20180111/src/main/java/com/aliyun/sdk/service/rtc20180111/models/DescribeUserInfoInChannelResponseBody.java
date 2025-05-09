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
 * {@link DescribeUserInfoInChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserInfoInChannelResponseBody</p>
 */
public class DescribeUserInfoInChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsChannelExist")
    private Boolean isChannelExist;

    @com.aliyun.core.annotation.NameInMap("IsInChannel")
    private Boolean isInChannel;

    @com.aliyun.core.annotation.NameInMap("Property")
    private java.util.List<Property> property;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Property> getProperty() {
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
        private java.util.List<Property> property; 
        private String requestId; 
        private Integer timestamp; 

        private Builder() {
        } 

        private Builder(DescribeUserInfoInChannelResponseBody model) {
            this.isChannelExist = model.isChannelExist;
            this.isInChannel = model.isInChannel;
            this.property = model.property;
            this.requestId = model.requestId;
            this.timestamp = model.timestamp;
        } 

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
        public Builder property(java.util.List<Property> property) {
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

    /**
     * 
     * {@link DescribeUserInfoInChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserInfoInChannelResponseBody</p>
     */
    public static class Property extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Join")
        private Integer join;

        @com.aliyun.core.annotation.NameInMap("Role")
        private Integer role;

        @com.aliyun.core.annotation.NameInMap("Session")
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

            private Builder() {
            } 

            private Builder(Property model) {
                this.join = model.join;
                this.role = model.role;
                this.session = model.session;
            } 

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
