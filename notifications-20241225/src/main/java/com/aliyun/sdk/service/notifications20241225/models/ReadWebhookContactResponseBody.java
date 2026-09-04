// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadWebhookContactResponseBody} extends {@link TeaModel}
 *
 * <p>ReadWebhookContactResponseBody</p>
 */
public class ReadWebhookContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadWebhookContactResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadWebhookContactResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadWebhookContactResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(Data data) {
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

        public ReadWebhookContactResponseBody build() {
            return new ReadWebhookContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadWebhookContactResponseBody} extends {@link TeaModel}
     *
     * <p>ReadWebhookContactResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotSecurityToken")
        private String botSecurityToken;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        @Deprecated
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("ServerUrl")
        private String serverUrl;

        @com.aliyun.core.annotation.NameInMap("WebhookType")
        private String webhookType;

        private Data(Builder builder) {
            this.botSecurityToken = builder.botSecurityToken;
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.securityToken = builder.securityToken;
            this.serverUrl = builder.serverUrl;
            this.webhookType = builder.webhookType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return botSecurityToken
         */
        public String getBotSecurityToken() {
            return this.botSecurityToken;
        }

        /**
         * @return contactId
         */
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return serverUrl
         */
        public String getServerUrl() {
            return this.serverUrl;
        }

        /**
         * @return webhookType
         */
        public String getWebhookType() {
            return this.webhookType;
        }

        public static final class Builder {
            private String botSecurityToken; 
            private Long contactId; 
            private String contactName; 
            private String securityToken; 
            private String serverUrl; 
            private String webhookType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.botSecurityToken = model.botSecurityToken;
                this.contactId = model.contactId;
                this.contactName = model.contactName;
                this.securityToken = model.securityToken;
                this.serverUrl = model.serverUrl;
                this.webhookType = model.webhookType;
            } 

            /**
             * BotSecurityToken.
             */
            public Builder botSecurityToken(String botSecurityToken) {
                this.botSecurityToken = botSecurityToken;
                return this;
            }

            /**
             * <p>webhook id</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * ServerUrl.
             */
            public Builder serverUrl(String serverUrl) {
                this.serverUrl = serverUrl;
                return this;
            }

            /**
             * WebhookType.
             */
            public Builder webhookType(String webhookType) {
                this.webhookType = webhookType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
