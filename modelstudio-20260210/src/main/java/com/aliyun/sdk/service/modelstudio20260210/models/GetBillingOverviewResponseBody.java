// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetBillingOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetBillingOverviewResponseBody</p>
 */
public class GetBillingOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetBillingOverviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBillingOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetBillingOverviewResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BB521414-5D38-5E66-AA66-963B2B4200E2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBillingOverviewResponseBody build() {
            return new GetBillingOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBillingOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingOverviewResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("articleCodes")
        private java.util.List<String> articleCodes;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private String percentage;

        private Groups(Builder builder) {
            this.amount = builder.amount;
            this.articleCodes = builder.articleCodes;
            this.key = builder.key;
            this.name = builder.name;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return articleCodes
         */
        public java.util.List<String> getArticleCodes() {
            return this.articleCodes;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return percentage
         */
        public String getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private String amount; 
            private java.util.List<String> articleCodes; 
            private String key; 
            private String name; 
            private String percentage; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.amount = model.amount;
                this.articleCodes = model.articleCodes;
                this.key = model.key;
                this.name = model.name;
                this.percentage = model.percentage;
            } 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * articleCodes.
             */
            public Builder articleCodes(java.util.List<String> articleCodes) {
                this.articleCodes = articleCodes;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
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
             * percentage.
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillingOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("groups")
        private java.util.List<Groups> groups;

        @com.aliyun.core.annotation.NameInMap("pretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("taxAmount")
        private String taxAmount;

        @com.aliyun.core.annotation.NameInMap("totalAmount")
        private String totalAmount;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.groups = builder.groups;
            this.pretaxAmount = builder.pretaxAmount;
            this.taxAmount = builder.taxAmount;
            this.totalAmount = builder.totalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return groups
         */
        public java.util.List<Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public static final class Builder {
            private String currency; 
            private java.util.List<Groups> groups; 
            private String pretaxAmount; 
            private String taxAmount; 
            private String totalAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currency = model.currency;
                this.groups = model.groups;
                this.pretaxAmount = model.pretaxAmount;
                this.taxAmount = model.taxAmount;
                this.totalAmount = model.totalAmount;
            } 

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * groups.
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * pretaxAmount.
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * taxAmount.
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * totalAmount.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
