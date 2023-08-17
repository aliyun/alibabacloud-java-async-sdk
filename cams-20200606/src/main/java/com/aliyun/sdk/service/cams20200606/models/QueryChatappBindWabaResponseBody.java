// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChatappBindWabaResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChatappBindWabaResponseBody</p>
 */
public class QueryChatappBindWabaResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryChatappBindWabaResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChatappBindWabaResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryChatappBindWabaResponseBody build() {
            return new QueryChatappBindWabaResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
            this.accountReviewStatus = builder.accountReviewStatus;
            this.currency = builder.currency;
            this.id = builder.id;
            this.messageTemplateNamespace = builder.messageTemplateNamespace;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
