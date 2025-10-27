// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListApsWebhookResponseBody} extends {@link TeaModel}
 *
 * <p>ListApsWebhookResponseBody</p>
 */
public class ListApsWebhookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Webhook")
    private java.util.List<Webhook> webhook;

    private ListApsWebhookResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApsWebhookResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return webhook
     */
    public java.util.List<Webhook> getWebhook() {
        return this.webhook;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<Webhook> webhook; 

        private Builder() {
        } 

        private Builder(ListApsWebhookResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.webhook = model.webhook;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Webhook.
         */
        public Builder webhook(java.util.List<Webhook> webhook) {
            this.webhook = webhook;
            return this;
        }

        public ListApsWebhookResponseBody build() {
            return new ListApsWebhookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApsWebhookResponseBody} extends {@link TeaModel}
     *
     * <p>ListApsWebhookResponseBody</p>
     */
    public static class Webhook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("WebhookId")
        private String webhookId;

        @com.aliyun.core.annotation.NameInMap("WebhookType")
        private String webhookType;

        private Webhook(Builder builder) {
            this.key = builder.key;
            this.name = builder.name;
            this.url = builder.url;
            this.webhookId = builder.webhookId;
            this.webhookType = builder.webhookType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Webhook create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return webhookId
         */
        public String getWebhookId() {
            return this.webhookId;
        }

        /**
         * @return webhookType
         */
        public String getWebhookType() {
            return this.webhookType;
        }

        public static final class Builder {
            private String key; 
            private String name; 
            private String url; 
            private String webhookId; 
            private String webhookType; 

            private Builder() {
            } 

            private Builder(Webhook model) {
                this.key = model.key;
                this.name = model.name;
                this.url = model.url;
                this.webhookId = model.webhookId;
                this.webhookType = model.webhookType;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * WebhookId.
             */
            public Builder webhookId(String webhookId) {
                this.webhookId = webhookId;
                return this;
            }

            /**
             * WebhookType.
             */
            public Builder webhookType(String webhookType) {
                this.webhookType = webhookType;
                return this;
            }

            public Webhook build() {
                return new Webhook(this);
            } 

        } 

    }
}
