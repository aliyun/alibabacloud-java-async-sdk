// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappEmbedSignUpResponseBody} extends {@link TeaModel}
 *
 * <p>ChatappEmbedSignUpResponseBody</p>
 */
public class ChatappEmbedSignUpResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Wabas")
    private java.util.List < Wabas> wabas;

    private ChatappEmbedSignUpResponseBody(Builder builder) {
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
    public java.util.List < Wabas> getWabas() {
        return this.wabas;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Wabas> wabas; 

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of the WhatsApp Business accounts.
         */
        public Builder wabas(java.util.List < Wabas> wabas) {
            this.wabas = wabas;
            return this;
        }

        public ChatappEmbedSignUpResponseBody build() {
            return new ChatappEmbedSignUpResponseBody(this);
        } 

    } 

    public static class Wabas extends TeaModel {
        @NameInMap("AccountReviewStatus")
        private String accountReviewStatus;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("Id")
        private String id;

        @NameInMap("MessageTemplateNamespace")
        private String messageTemplateNamespace;

        @NameInMap("Name")
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

            /**
             * The review status of the WhatsApp Business account.
             */
            public Builder accountReviewStatus(String accountReviewStatus) {
                this.accountReviewStatus = accountReviewStatus;
                return this;
            }

            /**
             * The currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The ID of the WhatsApp Business account.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The namespace of the message template.
             */
            public Builder messageTemplateNamespace(String messageTemplateNamespace) {
                this.messageTemplateNamespace = messageTemplateNamespace;
                return this;
            }

            /**
             * The name of the WhatsApp Business account.
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
