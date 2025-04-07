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

        private Builder() {
        } 

        private Builder(QueryChatappBindWabaResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryChatappBindWabaResponseBody build() {
            return new QueryChatappBindWabaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryChatappBindWabaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappBindWabaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountReviewStatus")
        private String accountReviewStatus;

        @com.aliyun.core.annotation.NameInMap("AuthInternationalRateEligibility")
        private java.util.Map<String, ?> authInternationalRateEligibility;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private String businessId;

        @com.aliyun.core.annotation.NameInMap("BusinessName")
        private String businessName;

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
            this.businessId = builder.businessId;
            this.businessName = builder.businessName;
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
        public java.util.Map<String, ?> getAuthInternationalRateEligibility() {
            return this.authInternationalRateEligibility;
        }

        /**
         * @return businessId
         */
        public String getBusinessId() {
            return this.businessId;
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
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
            private java.util.Map<String, ?> authInternationalRateEligibility; 
            private String businessId; 
            private String businessName; 
            private String currency; 
            private String id; 
            private String messageTemplateNamespace; 
            private String name; 
            private String primaryBusinessLocation; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountReviewStatus = model.accountReviewStatus;
                this.authInternationalRateEligibility = model.authInternationalRateEligibility;
                this.businessId = model.businessId;
                this.businessName = model.businessName;
                this.currency = model.currency;
                this.id = model.id;
                this.messageTemplateNamespace = model.messageTemplateNamespace;
                this.name = model.name;
                this.primaryBusinessLocation = model.primaryBusinessLocation;
            } 

            /**
             * <p>The review state of the WhatsApp Business account (WABA).</p>
             * <blockquote>
             * <p> Valid values:</p>
             * </blockquote>
             * <ul>
             * <li><p>PENDING: The WABA is to be reviewed.</p>
             * </li>
             * <li><p>APPROVED: The WABA was approved.</p>
             * </li>
             * <li><p>REJECTED: The WABA was rejected.</p>
             * </li>
             * <li><p>DISABLED: The WABA was forbidden.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder accountReviewStatus(String accountReviewStatus) {
                this.accountReviewStatus = accountReviewStatus;
                return this;
            }

            /**
             * <p>WABA related information.</p>
             */
            public Builder authInternationalRateEligibility(java.util.Map<String, ?> authInternationalRateEligibility) {
                this.authInternationalRateEligibility = authInternationalRateEligibility;
                return this;
            }

            /**
             * <p>The ID of the business platform.</p>
             * 
             * <strong>example:</strong>
             * <p>19293988***</p>
             */
            public Builder businessId(String businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The name of the business platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
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
             * <p>The ID of the WhatsApp Business account.</p>
             * 
             * <strong>example:</strong>
             * <p>20393988393993***</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The namespace of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
             */
            public Builder messageTemplateNamespace(String messageTemplateNamespace) {
                this.messageTemplateNamespace = messageTemplateNamespace;
                return this;
            }

            /**
             * <p>The name of the WhatsApp Business account.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The start time when the authentication-international rate applies.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;start_time&quot;:1721952000</p>
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
