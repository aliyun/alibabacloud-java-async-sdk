// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscribedCalendarResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscribedCalendarResponseBody</p>
 */
public class GetSubscribedCalendarResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("author")
    private String author;

    @com.aliyun.core.annotation.NameInMap("calendarId")
    private String calendarId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("managers")
    private java.util.List < String > managers;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("subscribeScope")
    private SubscribeScope subscribeScope;

    private GetSubscribedCalendarResponseBody(Builder builder) {
        this.author = builder.author;
        this.calendarId = builder.calendarId;
        this.description = builder.description;
        this.managers = builder.managers;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.subscribeScope = builder.subscribeScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscribedCalendarResponseBody create() {
        return builder().build();
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return calendarId
     */
    public String getCalendarId() {
        return this.calendarId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return managers
     */
    public java.util.List < String > getManagers() {
        return this.managers;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscribeScope
     */
    public SubscribeScope getSubscribeScope() {
        return this.subscribeScope;
    }

    public static final class Builder {
        private String author; 
        private String calendarId; 
        private String description; 
        private java.util.List < String > managers; 
        private String name; 
        private String requestId; 
        private SubscribeScope subscribeScope; 

        /**
         * author.
         */
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        /**
         * calendarId.
         */
        public Builder calendarId(String calendarId) {
            this.calendarId = calendarId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * managers.
         */
        public Builder managers(java.util.List < String > managers) {
            this.managers = managers;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * subscribeScope.
         */
        public Builder subscribeScope(SubscribeScope subscribeScope) {
            this.subscribeScope = subscribeScope;
            return this;
        }

        public GetSubscribedCalendarResponseBody build() {
            return new GetSubscribedCalendarResponseBody(this);
        } 

    } 

    public static class SubscribeScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpIds")
        private java.util.List < String > corpIds;

        @com.aliyun.core.annotation.NameInMap("OpenConversationIds")
        private java.util.List < String > openConversationIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List < String > userIds;

        private SubscribeScope(Builder builder) {
            this.corpIds = builder.corpIds;
            this.openConversationIds = builder.openConversationIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeScope create() {
            return builder().build();
        }

        /**
         * @return corpIds
         */
        public java.util.List < String > getCorpIds() {
            return this.corpIds;
        }

        /**
         * @return openConversationIds
         */
        public java.util.List < String > getOpenConversationIds() {
            return this.openConversationIds;
        }

        /**
         * @return userIds
         */
        public java.util.List < String > getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List < String > corpIds; 
            private java.util.List < String > openConversationIds; 
            private java.util.List < String > userIds; 

            /**
             * CorpIds.
             */
            public Builder corpIds(java.util.List < String > corpIds) {
                this.corpIds = corpIds;
                return this;
            }

            /**
             * OpenConversationIds.
             */
            public Builder openConversationIds(java.util.List < String > openConversationIds) {
                this.openConversationIds = openConversationIds;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List < String > userIds) {
                this.userIds = userIds;
                return this;
            }

            public SubscribeScope build() {
                return new SubscribeScope(this);
            } 

        } 

    }
}
