// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryCustomerLabelResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomerLabelResponseBody</p>
 */
public class QueryCustomerLabelResponseBody extends TeaModel {
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

    private QueryCustomerLabelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomerLabelResponseBody create() {
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

        private Builder(QueryCustomerLabelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
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

        public QueryCustomerLabelResponseBody build() {
            return new QueryCustomerLabelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCustomerLabelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomerLabelResponseBody</p>
     */
    public static class CustomerLabel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSeries")
        private String labelSeries;

        private CustomerLabel(Builder builder) {
            this.label = builder.label;
            this.labelSeries = builder.labelSeries;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerLabel create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelSeries
         */
        public String getLabelSeries() {
            return this.labelSeries;
        }

        public static final class Builder {
            private String label; 
            private String labelSeries; 

            private Builder() {
            } 

            private Builder(CustomerLabel model) {
                this.label = model.label;
                this.labelSeries = model.labelSeries;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelSeries.
             */
            public Builder labelSeries(String labelSeries) {
                this.labelSeries = labelSeries;
                return this;
            }

            public CustomerLabel build() {
                return new CustomerLabel(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCustomerLabelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomerLabelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerLabel")
        private java.util.List<CustomerLabel> customerLabel;

        private Data(Builder builder) {
            this.customerLabel = builder.customerLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customerLabel
         */
        public java.util.List<CustomerLabel> getCustomerLabel() {
            return this.customerLabel;
        }

        public static final class Builder {
            private java.util.List<CustomerLabel> customerLabel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customerLabel = model.customerLabel;
            } 

            /**
             * CustomerLabel.
             */
            public Builder customerLabel(java.util.List<CustomerLabel> customerLabel) {
                this.customerLabel = customerLabel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
