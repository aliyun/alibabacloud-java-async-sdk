// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChatappBindWabaResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChatappBindWabaResponseBody</p>
 */
public class QueryChatappBindWabaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

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

    private QueryChatappBindWabaResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details about the access denial.
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
         * The returned data.
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryChatappBindWabaResponseBody build() {
            return new QueryChatappBindWabaResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountReviewStatus")
        private String accountReviewStatus;

        @com.aliyun.core.annotation.NameInMap("AuthInternationalRateEligibility")
        private java.util.Map < String, ? > authInternationalRateEligibility;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MessageTemplateNamespace")
        private String messageTemplateNamespace;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrimaryBusinessLocation")
        private String primaryBusinessLocation;

        private Data(Builder builder) {
            this.accountReviewStatus = builder.accountReviewStatus;
            this.authInternationalRateEligibility = builder.authInternationalRateEligibility;
            this.currency = builder.currency;
            this.id = builder.id;
            this.messageTemplateNamespace = builder.messageTemplateNamespace;
            this.name = builder.name;
            this.primaryBusinessLocation = builder.primaryBusinessLocation;
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
         * @return authInternationalRateEligibility
         */
        public java.util.Map < String, ? > getAuthInternationalRateEligibility() {
            return this.authInternationalRateEligibility;
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

        /**
         * @return primaryBusinessLocation
         */
        public String getPrimaryBusinessLocation() {
            return this.primaryBusinessLocation;
        }

        public static final class Builder {
            private String accountReviewStatus; 
            private java.util.Map < String, ? > authInternationalRateEligibility; 
            private String currency; 
            private String id; 
            private String messageTemplateNamespace; 
            private String name; 
            private String primaryBusinessLocation; 

            /**
             * The review state of the WhatsApp Business account (WABA).
             * <p>
             * 
             * >  Valid values:
             * 
             * *   PENDING: The WABA is to be reviewed.
             * 
             * *   APPROVED: The WABA was approved.
             * 
             * *   REJECTED: The WABA was rejected.
             * 
             * *   DISABLED: The WABA was forbidden.
             */
            public Builder accountReviewStatus(String accountReviewStatus) {
                this.accountReviewStatus = accountReviewStatus;
                return this;
            }

            /**
             * AuthInternationalRateEligibility.
             */
            public Builder authInternationalRateEligibility(java.util.Map < String, ? > authInternationalRateEligibility) {
                this.authInternationalRateEligibility = authInternationalRateEligibility;
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

            /**
             * PrimaryBusinessLocation.
             */
            public Builder primaryBusinessLocation(String primaryBusinessLocation) {
                this.primaryBusinessLocation = primaryBusinessLocation;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
