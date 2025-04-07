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
 * {@link ChatappEmbedSignUpResponseBody} extends {@link TeaModel}
 *
 * <p>ChatappEmbedSignUpResponseBody</p>
 */
public class ChatappEmbedSignUpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Wabas")
    private java.util.List<Wabas> wabas;

    private ChatappEmbedSignUpResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.wabas = builder.wabas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappEmbedSignUpResponseBody create() {
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
     * @return wabas
     */
    public java.util.List<Wabas> getWabas() {
        return this.wabas;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Wabas> wabas; 

        private Builder() {
        } 

        private Builder(ChatappEmbedSignUpResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.wabas = model.wabas;
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
         * <p>The HTTP status code returned.</p>
         * <ul>
         * <li>A value of OK indicates that the call is successful.</li>
         * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
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
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of the WhatsApp Business accounts.</p>
         */
        public Builder wabas(java.util.List<Wabas> wabas) {
            this.wabas = wabas;
            return this;
        }

        public ChatappEmbedSignUpResponseBody build() {
            return new ChatappEmbedSignUpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatappEmbedSignUpResponseBody} extends {@link TeaModel}
     *
     * <p>ChatappEmbedSignUpResponseBody</p>
     */
    public static class Wabas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountReviewStatus")
        private String accountReviewStatus;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MessageTemplateNamespace")
        private String messageTemplateNamespace;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Wabas(Builder builder) {
            this.accountReviewStatus = builder.accountReviewStatus;
            this.currency = builder.currency;
            this.id = builder.id;
            this.messageTemplateNamespace = builder.messageTemplateNamespace;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Wabas create() {
            return builder().build();
        }

        /**
         * @return accountReviewStatus
         */
        public String getAccountReviewStatus() {
            return this.accountReviewStatus;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return messageTemplateNamespace
         */
        public String getMessageTemplateNamespace() {
            return this.messageTemplateNamespace;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String accountReviewStatus; 
            private String currency; 
            private String id; 
            private String messageTemplateNamespace; 
            private String name; 

            private Builder() {
            } 

            private Builder(Wabas model) {
                this.accountReviewStatus = model.accountReviewStatus;
                this.currency = model.currency;
                this.id = model.id;
                this.messageTemplateNamespace = model.messageTemplateNamespace;
                this.name = model.name;
            } 

            /**
             * <p>The review state of the WABA.</p>
             * 
             * <strong>example:</strong>
             * <p>VERIFIED</p>
             */
            public Builder accountReviewStatus(String accountReviewStatus) {
                this.accountReviewStatus = accountReviewStatus;
                return this;
            }

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The ID of the WABA.</p>
             * 
             * <strong>example:</strong>
             * <p>2939933992*****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The namespace of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>alals-lsslls-slslsos-slsl</p>
             */
            public Builder messageTemplateNamespace(String messageTemplateNamespace) {
                this.messageTemplateNamespace = messageTemplateNamespace;
                return this;
            }

            /**
             * <p>The name of the WABA.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Wabas build() {
                return new Wabas(this);
            } 

        } 

    }
}
