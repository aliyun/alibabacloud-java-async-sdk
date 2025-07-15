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
 * {@link ListEventSubResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventSubResponseBody</p>
 */
public class ListEventSubResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Subscribers")
    private java.util.List<Subscribers> subscribers;

    private ListEventSubResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subscribers = builder.subscribers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventSubResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscribers
     */
    public java.util.List<Subscribers> getSubscribers() {
        return this.subscribers;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Subscribers> subscribers; 

        private Builder() {
        } 

        private Builder(ListEventSubResponseBody model) {
            this.requestId = model.requestId;
            this.subscribers = model.subscribers;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE050E24-BE9B-1E79-BB30-7EA0BBAE7F08</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The events.</p>
         */
        public Builder subscribers(java.util.List<Subscribers> subscribers) {
            this.subscribers = subscribers;
            return this;
        }

        public ListEventSubResponseBody build() {
            return new ListEventSubResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventSubResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventSubResponseBody</p>
     */
    public static class Subscribers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List<String> events;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Roles")
        @Deprecated
        private Integer roles;

        @com.aliyun.core.annotation.NameInMap("SubId")
        private String subId;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List<String> users;

        private Subscribers(Builder builder) {
            this.callbackUrl = builder.callbackUrl;
            this.channelId = builder.channelId;
            this.createTime = builder.createTime;
            this.events = builder.events;
            this.modifyTime = builder.modifyTime;
            this.roles = builder.roles;
            this.subId = builder.subId;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscribers create() {
            return builder().build();
        }

        /**
         * @return callbackUrl
         */
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return events
         */
        public java.util.List<String> getEvents() {
            return this.events;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return roles
         */
        public Integer getRoles() {
            return this.roles;
        }

        /**
         * @return subId
         */
        public String getSubId() {
            return this.subId;
        }

        /**
         * @return users
         */
        public java.util.List<String> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String callbackUrl; 
            private String channelId; 
            private String createTime; 
            private java.util.List<String> events; 
            private String modifyTime; 
            private Integer roles; 
            private String subId; 
            private java.util.List<String> users; 

            private Builder() {
            } 

            private Builder(Subscribers model) {
                this.callbackUrl = model.callbackUrl;
                this.channelId = model.channelId;
                this.createTime = model.createTime;
                this.events = model.events;
                this.modifyTime = model.modifyTime;
                this.roles = model.roles;
                this.subId = model.subId;
                this.users = model.users;
            } 

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p>http://****.com/callback</p>
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * <p>The ID of the channel to which you subscribe.</p>
             * 
             * <strong>example:</strong>
             * <p>testmodify</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The time when the subscription was created. The time is displayed in UTC+8. Format: yyyy-MM-dd hh:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-18 10:14:49</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the event. Valid values:</p>
             * <ul>
             * <li>ChannelEvent: channel event. For example, the channel is opened or closed.</li>
             * <li>UserEvent: user event. For example, a user joins or leaves the channel.</li>
             * </ul>
             */
            public Builder events(java.util.List<String> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The time when the subscription was modified. The time is displayed in UTC+8. Format: yyyy-MM-dd hh:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-18 10:14:49</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The role of the user whose events are returned. Valid values:</p>
             * <ul>
             * <li>1: streamer</li>
             * <li>2: viewer</li>
             * </ul>
             * <p>An empty value or a value other than 1 and 2 indicates that events of all users in the channel are returned.</p>
             * <blockquote>
             * <p> This parameter is deprecated. When you create a subscription, this parameter is no longer supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder roles(Integer roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>09be0d2254cb5a89f4cbd86403ec****</p>
             */
            public Builder subId(String subId) {
                this.subId = subId;
                return this;
            }

            /**
             * <p>The user whose events are returned. We recommend that you use either this parameter or Roles.</p>
             */
            public Builder users(java.util.List<String> users) {
                this.users = users;
                return this;
            }

            public Subscribers build() {
                return new Subscribers(this);
            } 

        } 

    }
}
