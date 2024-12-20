// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DescribeWebhookContactsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebhookContactsResponseBody</p>
 */
public class DescribeWebhookContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned objects.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4D6C358A-A58B-4F4B-94CE-F5AAF023****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebhookContactsResponseBody build() {
            return new DescribeWebhookContactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebhookContactsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebhookContactsResponseBody</p>
     */
    public static class Webhook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizHeaders")
        private java.util.Map<String, ?> bizHeaders;

        @com.aliyun.core.annotation.NameInMap("BizParams")
        private java.util.Map<String, ?> bizParams;

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
        public java.util.Map<String, ?> getBizHeaders() {
            return this.bizHeaders;
        }

        /**
         * @return bizParams
         */
        public java.util.Map<String, ?> getBizParams() {
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
            private java.util.Map<String, ?> bizHeaders; 
            private java.util.Map<String, ?> bizParams; 
            private String body; 
            private String method; 
            private String recoverBody; 
            private String url; 

            /**
             * <p>The header of the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Content-Type&quot;:&quot;application/json&quot;}]</p>
             */
            public Builder bizHeaders(java.util.Map<String, ?> bizHeaders) {
                this.bizHeaders = bizHeaders;
                return this;
            }

            /**
             * <p>The parameters in the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;content:&quot;mike&quot;}]</p>
             */
            public Builder bizParams(java.util.Map<String, ?> bizParams) {
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
             * <li>Get</li>
             * <li>Post</li>
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
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=91f2f6">https://oapi.dingtalk.com/robot/send?access_token=91f2f6</a>****</p>
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
     * {@link DescribeWebhookContactsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebhookContactsResponseBody</p>
     */
    public static class WebhookContacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Webhook")
        private Webhook webhook;

        @com.aliyun.core.annotation.NameInMap("WebhookId")
        private Float webhookId;

        @com.aliyun.core.annotation.NameInMap("WebhookName")
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
             * <p>The details of the webhook alert contact.</p>
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
             * <p>Webhook name</p>
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
    /**
     * 
     * {@link DescribeWebhookContactsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebhookContactsResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("WebhookContacts")
        private java.util.List<WebhookContacts> webhookContacts;

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
        public java.util.List<WebhookContacts> getWebhookContacts() {
            return this.webhookContacts;
        }

        public static final class Builder {
            private Long page; 
            private Long size; 
            private Long total; 
            private java.util.List<WebhookContacts> webhookContacts; 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of alert contacts displayed on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of alert contacts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The list of webhook alert contacts.</p>
             */
            public Builder webhookContacts(java.util.List<WebhookContacts> webhookContacts) {
                this.webhookContacts = webhookContacts;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
