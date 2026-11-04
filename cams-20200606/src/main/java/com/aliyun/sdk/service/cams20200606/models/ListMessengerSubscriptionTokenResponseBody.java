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
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The request status code.</p>
         * <ul>
         * <li><p>A value of OK indicates that the request is successful.</p>
         * </li>
         * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The next page token. Pass this value to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>3399***</p>
         */
        public Builder nextPage(String nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ei**</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation is successful.</p>
         * </li>
         * <li><p>false: The operation fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The creation time of the token.</p>
             * 
             * <strong>example:</strong>
             * <p>172546854885</p>
             */
            public Builder creationTimestamp(Long creationTimestamp) {
                this.creationTimestamp = creationTimestamp;
                return this;
            }

            /**
             * <p>The custom audience ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Example</p>
             */
            public Builder customAudienceId(String customAudienceId) {
                this.customAudienceId = customAudienceId;
                return this;
            }

            /**
             * <p>The time when the application can send the next marketing message to the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>172546854885</p>
             */
            public Builder nextEligibleTime(Long nextEligibleTime) {
                this.nextEligibleTime = nextEligibleTime;
                return this;
            }

            /**
             * <p>The resubscription status.</p>
             * 
             * <strong>example:</strong>
             * <p>Example</p>
             */
            public Builder notificationMessagesReoptin(String notificationMessagesReoptin) {
                this.notificationMessagesReoptin = notificationMessagesReoptin;
                return this;
            }

            /**
             * <p>The time zone of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>Example</p>
             */
            public Builder notificationMessagesTimezone(String notificationMessagesTimezone) {
                this.notificationMessagesTimezone = notificationMessagesTimezone;
                return this;
            }

            /**
             * <p>The page-scoped ID of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>Example</p>
             */
            public Builder notificationMessagesToken(String notificationMessagesToken) {
                this.notificationMessagesToken = notificationMessagesToken;
                return this;
            }

            /**
             * <p>The page ID of Messenger.</p>
             * 
             * <strong>example:</strong>
             * <p>239***</p>
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * <p>The customer\&quot;s Page-scoped ID (PSID)</p>
             * 
             * <strong>example:</strong>
             * <p>Example</p>
             */
            public Builder recipientId(String recipientId) {
                this.recipientId = recipientId;
                return this;
            }

            /**
             * <p>The expiration time of the token.</p>
             * 
             * <strong>example:</strong>
             * <p>172546854885</p>
             */
            public Builder tokenExpiryTimestamp(Long tokenExpiryTimestamp) {
                this.tokenExpiryTimestamp = tokenExpiryTimestamp;
                return this;
            }

            /**
             * <p>The message\&quot;s title</p>
             * 
             * <strong>example:</strong>
             * <p>Example</p>
             */
            public Builder topicTitle(String topicTitle) {
                this.topicTitle = topicTitle;
                return this;
            }

            /**
             * <p>The token status.</p>
             * 
             * <strong>example:</strong>
             * <p>Example</p>
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
