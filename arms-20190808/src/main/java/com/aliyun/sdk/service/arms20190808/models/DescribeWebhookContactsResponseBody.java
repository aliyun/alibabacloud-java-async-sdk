// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebhookContactsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebhookContactsResponseBody</p>
 */
public class DescribeWebhookContactsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeWebhookContactsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebhookContactsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageBean pageBean; 
        private String requestId; 

        /**
         * The returned objects.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebhookContactsResponseBody build() {
            return new DescribeWebhookContactsResponseBody(this);
        } 

    } 

    public static class Webhook extends TeaModel {
        @NameInMap("BizHeaders")
        private java.util.Map < String, ? > bizHeaders;

        @NameInMap("BizParams")
        private java.util.Map < String, ? > bizParams;

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
        public java.util.Map < String, ? > getBizHeaders() {
            return this.bizHeaders;
        }

        /**
         * @return bizParams
         */
        public java.util.Map < String, ? > getBizParams() {
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
            private java.util.Map < String, ? > bizHeaders; 
            private java.util.Map < String, ? > bizParams; 
            private String body; 
            private String method; 
            private String recoverBody; 
            private String url; 

            /**
             * The header of the HTTP request.
             */
            public Builder bizHeaders(java.util.Map < String, ? > bizHeaders) {
                this.bizHeaders = bizHeaders;
                return this;
            }

            /**
             * The parameters in the HTTP request.
             */
            public Builder bizParams(java.util.Map < String, ? > bizParams) {
                this.bizParams = bizParams;
                return this;
            }

            /**
             * The alert notification template.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * The HTTP request method.
             * <p>
             * 
             * *   Get
             * *   Post
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The notification template for clearing alerts.
             */
            public Builder recoverBody(String recoverBody) {
                this.recoverBody = recoverBody;
                return this;
            }

            /**
             * The URL of the request method.
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
    public static class WebhookContacts extends TeaModel {
        @NameInMap("Webhook")
        private Webhook webhook;

        @NameInMap("WebhookId")
        private Float webhookId;

        @NameInMap("WebhookName")
        private String webhookName;

        private WebhookContacts(Builder builder) {
            this.webhook = builder.webhook;
            this.webhookId = builder.webhookId;
            this.webhookName = builder.webhookName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookContacts create() {
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
             * The details of the webhook alert contact.
             */
            public Builder webhook(Webhook webhook) {
                this.webhook = webhook;
                return this;
            }

            /**
             * The ID of the webhook alert contact.
             */
            public Builder webhookId(Float webhookId) {
                this.webhookId = webhookId;
                return this;
            }

            /**
             * The name of the webhook alert contact.
             */
            public Builder webhookName(String webhookName) {
                this.webhookName = webhookName;
                return this;
            }

            public WebhookContacts build() {
                return new WebhookContacts(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
        private Long total;

        @NameInMap("WebhookContacts")
        private java.util.List < WebhookContacts> webhookContacts;

        private PageBean(Builder builder) {
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
            this.webhookContacts = builder.webhookContacts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return webhookContacts
         */
        public java.util.List < WebhookContacts> getWebhookContacts() {
            return this.webhookContacts;
        }

        public static final class Builder {
            private Long page; 
            private Long size; 
            private Long total; 
            private java.util.List < WebhookContacts> webhookContacts; 

            /**
             * The page number of the returned page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * The number of alert contacts displayed on each page.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The total number of alert contacts.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * The list of webhook alert contacts.
             */
            public Builder webhookContacts(java.util.List < WebhookContacts> webhookContacts) {
                this.webhookContacts = webhookContacts;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
