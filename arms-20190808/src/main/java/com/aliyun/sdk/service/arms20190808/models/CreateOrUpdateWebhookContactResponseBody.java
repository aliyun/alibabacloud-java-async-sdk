// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateWebhookContactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateWebhookContactResponseBody</p>
 */
public class CreateOrUpdateWebhookContactResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WebhookContact")
    private WebhookContact webhookContact;

    private CreateOrUpdateWebhookContactResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webhookContact = builder.webhookContact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateWebhookContactResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webhookContact
     */
    public WebhookContact getWebhookContact() {
        return this.webhookContact;
    }

    public static final class Builder {
        private String requestId; 
        private WebhookContact webhookContact; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WebhookContact.
         */
        public Builder webhookContact(WebhookContact webhookContact) {
            this.webhookContact = webhookContact;
            return this;
        }

        public CreateOrUpdateWebhookContactResponseBody build() {
            return new CreateOrUpdateWebhookContactResponseBody(this);
        } 

    } 

    public static class Webhook extends TeaModel {
        @NameInMap("BizHeaders")
        private String bizHeaders;

        @NameInMap("BizParams")
        private String bizParams;

        @NameInMap("Body")
        private String body;

        @NameInMap("Method")
        private String method;

        @NameInMap("RecoverBody")
        private String recoverBody;

        @NameInMap("Url")
        private String url;

        private Webhook(Builder builder) {
            this.bizHeaders = builder.bizHeaders;
            this.bizParams = builder.bizParams;
            this.body = builder.body;
            this.method = builder.method;
            this.recoverBody = builder.recoverBody;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Webhook create() {
            return builder().build();
        }

        /**
         * @return bizHeaders
         */
        public String getBizHeaders() {
            return this.bizHeaders;
        }

        /**
         * @return bizParams
         */
        public String getBizParams() {
            return this.bizParams;
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return recoverBody
         */
        public String getRecoverBody() {
            return this.recoverBody;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String bizHeaders; 
            private String bizParams; 
            private String body; 
            private String method; 
            private String recoverBody; 
            private String url; 

            /**
             * http请求头
             */
            public Builder bizHeaders(String bizHeaders) {
                this.bizHeaders = bizHeaders;
                return this;
            }

            /**
             * http请求参数
             */
            public Builder bizParams(String bizParams) {
                this.bizParams = bizParams;
                return this;
            }

            /**
             * 告警通知模板
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * Http请求方法
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * 告警恢复模板
             */
            public Builder recoverBody(String recoverBody) {
                this.recoverBody = recoverBody;
                return this;
            }

            /**
             * url
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Webhook build() {
                return new Webhook(this);
            } 

        } 

    }
    public static class WebhookContact extends TeaModel {
        @NameInMap("Webhook")
        private Webhook webhook;

        @NameInMap("WebhookId")
        private Float webhookId;

        @NameInMap("WebhookName")
        private String webhookName;

        private WebhookContact(Builder builder) {
            this.webhook = builder.webhook;
            this.webhookId = builder.webhookId;
            this.webhookName = builder.webhookName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookContact create() {
            return builder().build();
        }

        /**
         * @return webhook
         */
        public Webhook getWebhook() {
            return this.webhook;
        }

        /**
         * @return webhookId
         */
        public Float getWebhookId() {
            return this.webhookId;
        }

        /**
         * @return webhookName
         */
        public String getWebhookName() {
            return this.webhookName;
        }

        public static final class Builder {
            private Webhook webhook; 
            private Float webhookId; 
            private String webhookName; 

            /**
             * Webhook.
             */
            public Builder webhook(Webhook webhook) {
                this.webhook = webhook;
                return this;
            }

            /**
             * 告警webhook ID
             */
            public Builder webhookId(Float webhookId) {
                this.webhookId = webhookId;
                return this;
            }

            /**
             * 告警webhook名称
             */
            public Builder webhookName(String webhookName) {
                this.webhookName = webhookName;
                return this;
            }

            public WebhookContact build() {
                return new WebhookContact(this);
            } 

        } 

    }
}
