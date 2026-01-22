// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAlertWebhooksResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertWebhooksResponseBody</p>
 */
public class ListAlertWebhooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("webhooks")
    private java.util.List<Webhooks> webhooks;

    private ListAlertWebhooksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertWebhooksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return webhooks
     */
    public java.util.List<Webhooks> getWebhooks() {
        return this.webhooks;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 
        private java.util.List<Webhooks> webhooks; 

        private Builder() {
        } 

        private Builder(ListAlertWebhooksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
            this.webhooks = model.webhooks;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>webhooks</p>
         */
        public Builder webhooks(java.util.List<Webhooks> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public ListAlertWebhooksResponseBody build() {
            return new ListAlertWebhooksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertWebhooksResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertWebhooksResponseBody</p>
     */
    public static class Webhooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, ?> headers;

        @com.aliyun.core.annotation.NameInMap("lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("webhookId")
        private String webhookId;

        private Webhooks(Builder builder) {
            this.contentType = builder.contentType;
            this.headers = builder.headers;
            this.lang = builder.lang;
            this.method = builder.method;
            this.name = builder.name;
            this.url = builder.url;
            this.webhookId = builder.webhookId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Webhooks create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, ?> getHeaders() {
            return this.headers;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
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

        public static final class Builder {
            private String contentType; 
            private java.util.Map<String, ?> headers; 
            private String lang; 
            private String method; 
            private String name; 
            private String url; 
            private String webhookId; 

            private Builder() {
            } 

            private Builder(Webhooks model) {
                this.contentType = model.contentType;
                this.headers = model.headers;
                this.lang = model.lang;
                this.method = model.method;
                this.name = model.name;
                this.url = model.url;
                this.webhookId = model.webhookId;
            } 

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>headers</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder headers(java.util.Map<String, ?> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * method.
             */
            public Builder method(String method) {
                this.method = method;
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
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * webhookId.
             */
            public Builder webhookId(String webhookId) {
                this.webhookId = webhookId;
                return this;
            }

            public Webhooks build() {
                return new Webhooks(this);
            } 

        } 

    }
}
