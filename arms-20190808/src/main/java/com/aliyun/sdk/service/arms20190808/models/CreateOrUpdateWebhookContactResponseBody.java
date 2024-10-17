// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOrUpdateWebhookContactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateWebhookContactResponseBody</p>
 */
public class CreateOrUpdateWebhookContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebhookContact")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16AF921B-8187-489F-9913-43C808B4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned webhook alert contact.</p>
         */
        public Builder webhookContact(WebhookContact webhookContact) {
            this.webhookContact = webhookContact;
            return this;
        }

        public CreateOrUpdateWebhookContactResponseBody build() {
            return new CreateOrUpdateWebhookContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateWebhookContactResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateWebhookContactResponseBody</p>
     */
    public static class Webhook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizHeaders")
        private String bizHeaders;

        @com.aliyun.core.annotation.NameInMap("BizParams")
        private String bizParams;

        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("RecoverBody")
        private String recoverBody;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The HTTP request headers.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Content-Type&quot;:&quot;application/json;charset=utf-8&quot;}]</p>
             */
            public Builder bizHeaders(String bizHeaders) {
                this.bizHeaders = bizHeaders;
                return this;
            }

            /**
             * <p>The parameters in the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;content&quot;:&quot;mike&quot;}]</p>
             */
            public Builder bizParams(String bizParams) {
                this.bizParams = bizParams;
                return this;
            }

            /**
             * <p>The alert notification template.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Alert name&quot;:&quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster name&quot;:&quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application name&quot;:&quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification policy&quot;:&quot;{{ .dispatchRuleName }}&quot;, &quot;Alert time&quot;:&quot;{{ .startTime }}&quot;, &quot;Alert content&quot;:&quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The HTTP request method.</p>
             * <ul>
             * <li>Post</li>
             * <li>Get</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Post</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The notification template for clearing alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Alert name&quot;:&quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster name&quot;:&quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application name&quot;:&quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification policy&quot;:&quot;{{ .dispatchRuleName }}&quot;, &quot;Recovery time&quot;:&quot;{{ .endTime }}&quot;, &quot;Alert content&quot;:&quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
             */
            public Builder recoverBody(String recoverBody) {
                this.recoverBody = recoverBody;
                return this;
            }

            /**
             * <p>The URL of the request method.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121">https://oapi.dingtalk.com/robot/send?access_token=e1a049121</a>******</p>
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
    /**
     * 
     * {@link CreateOrUpdateWebhookContactResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateWebhookContactResponseBody</p>
     */
    public static class WebhookContact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Webhook")
        private Webhook webhook;

        @com.aliyun.core.annotation.NameInMap("WebhookId")
        private Float webhookId;

        @com.aliyun.core.annotation.NameInMap("WebhookName")
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
             * <p>The information about the webhook alert contact.</p>
             */
            public Builder webhook(Webhook webhook) {
                this.webhook = webhook;
                return this;
            }

            /**
             * <p>The ID of the webhook alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder webhookId(Float webhookId) {
                this.webhookId = webhookId;
                return this;
            }

            /**
             * <p>The name of the webhook alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Webhook alert</p>
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
