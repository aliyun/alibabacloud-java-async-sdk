// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListMessengerSubscriptionTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessengerSubscriptionTokenResponseBody</p>
 */
public class ListMessengerSubscriptionTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private String nextPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListMessengerSubscriptionTokenResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.nextPage = builder.nextPage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessengerSubscriptionTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextPage
     */
    public String getNextPage() {
        return this.nextPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String nextPage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListMessengerSubscriptionTokenResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.nextPage = model.nextPage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextPage.
         */
        public Builder nextPage(String nextPage) {
            this.nextPage = nextPage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListMessengerSubscriptionTokenResponseBody build() {
            return new ListMessengerSubscriptionTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessengerSubscriptionTokenResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessengerSubscriptionTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTimestamp")
        private Long creationTimestamp;

        @com.aliyun.core.annotation.NameInMap("CustomAudienceId")
        private String customAudienceId;

        @com.aliyun.core.annotation.NameInMap("NextEligibleTime")
        private Long nextEligibleTime;

        @com.aliyun.core.annotation.NameInMap("NotificationMessagesReoptin")
        private String notificationMessagesReoptin;

        @com.aliyun.core.annotation.NameInMap("NotificationMessagesTimezone")
        private String notificationMessagesTimezone;

        @com.aliyun.core.annotation.NameInMap("NotificationMessagesToken")
        private String notificationMessagesToken;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private String pageId;

        @com.aliyun.core.annotation.NameInMap("RecipientId")
        private String recipientId;

        @com.aliyun.core.annotation.NameInMap("TokenExpiryTimestamp")
        private Long tokenExpiryTimestamp;

        @com.aliyun.core.annotation.NameInMap("TopicTitle")
        private String topicTitle;

        @com.aliyun.core.annotation.NameInMap("UserTokenStatus")
        private String userTokenStatus;

        private Data(Builder builder) {
            this.creationTimestamp = builder.creationTimestamp;
            this.customAudienceId = builder.customAudienceId;
            this.nextEligibleTime = builder.nextEligibleTime;
            this.notificationMessagesReoptin = builder.notificationMessagesReoptin;
            this.notificationMessagesTimezone = builder.notificationMessagesTimezone;
            this.notificationMessagesToken = builder.notificationMessagesToken;
            this.pageId = builder.pageId;
            this.recipientId = builder.recipientId;
            this.tokenExpiryTimestamp = builder.tokenExpiryTimestamp;
            this.topicTitle = builder.topicTitle;
            this.userTokenStatus = builder.userTokenStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creationTimestamp
         */
        public Long getCreationTimestamp() {
            return this.creationTimestamp;
        }

        /**
         * @return customAudienceId
         */
        public String getCustomAudienceId() {
            return this.customAudienceId;
        }

        /**
         * @return nextEligibleTime
         */
        public Long getNextEligibleTime() {
            return this.nextEligibleTime;
        }

        /**
         * @return notificationMessagesReoptin
         */
        public String getNotificationMessagesReoptin() {
            return this.notificationMessagesReoptin;
        }

        /**
         * @return notificationMessagesTimezone
         */
        public String getNotificationMessagesTimezone() {
            return this.notificationMessagesTimezone;
        }

        /**
         * @return notificationMessagesToken
         */
        public String getNotificationMessagesToken() {
            return this.notificationMessagesToken;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return recipientId
         */
        public String getRecipientId() {
            return this.recipientId;
        }

        /**
         * @return tokenExpiryTimestamp
         */
        public Long getTokenExpiryTimestamp() {
            return this.tokenExpiryTimestamp;
        }

        /**
         * @return topicTitle
         */
        public String getTopicTitle() {
            return this.topicTitle;
        }

        /**
         * @return userTokenStatus
         */
        public String getUserTokenStatus() {
            return this.userTokenStatus;
        }

        public static final class Builder {
            private Long creationTimestamp; 
            private String customAudienceId; 
            private Long nextEligibleTime; 
            private String notificationMessagesReoptin; 
            private String notificationMessagesTimezone; 
            private String notificationMessagesToken; 
            private String pageId; 
            private String recipientId; 
            private Long tokenExpiryTimestamp; 
            private String topicTitle; 
            private String userTokenStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.creationTimestamp = model.creationTimestamp;
                this.customAudienceId = model.customAudienceId;
                this.nextEligibleTime = model.nextEligibleTime;
                this.notificationMessagesReoptin = model.notificationMessagesReoptin;
                this.notificationMessagesTimezone = model.notificationMessagesTimezone;
                this.notificationMessagesToken = model.notificationMessagesToken;
                this.pageId = model.pageId;
                this.recipientId = model.recipientId;
                this.tokenExpiryTimestamp = model.tokenExpiryTimestamp;
                this.topicTitle = model.topicTitle;
                this.userTokenStatus = model.userTokenStatus;
            } 

            /**
             * CreationTimestamp.
             */
            public Builder creationTimestamp(Long creationTimestamp) {
                this.creationTimestamp = creationTimestamp;
                return this;
            }

            /**
             * CustomAudienceId.
             */
            public Builder customAudienceId(String customAudienceId) {
                this.customAudienceId = customAudienceId;
                return this;
            }

            /**
             * NextEligibleTime.
             */
            public Builder nextEligibleTime(Long nextEligibleTime) {
                this.nextEligibleTime = nextEligibleTime;
                return this;
            }

            /**
             * NotificationMessagesReoptin.
             */
            public Builder notificationMessagesReoptin(String notificationMessagesReoptin) {
                this.notificationMessagesReoptin = notificationMessagesReoptin;
                return this;
            }

            /**
             * NotificationMessagesTimezone.
             */
            public Builder notificationMessagesTimezone(String notificationMessagesTimezone) {
                this.notificationMessagesTimezone = notificationMessagesTimezone;
                return this;
            }

            /**
             * NotificationMessagesToken.
             */
            public Builder notificationMessagesToken(String notificationMessagesToken) {
                this.notificationMessagesToken = notificationMessagesToken;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * <p>The customer&quot;s Page-scoped ID (PSID)</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder recipientId(String recipientId) {
                this.recipientId = recipientId;
                return this;
            }

            /**
             * TokenExpiryTimestamp.
             */
            public Builder tokenExpiryTimestamp(Long tokenExpiryTimestamp) {
                this.tokenExpiryTimestamp = tokenExpiryTimestamp;
                return this;
            }

            /**
             * <p>The message&quot;s title</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder topicTitle(String topicTitle) {
                this.topicTitle = topicTitle;
                return this;
            }

            /**
             * UserTokenStatus.
             */
            public Builder userTokenStatus(String userTokenStatus) {
                this.userTokenStatus = userTokenStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
