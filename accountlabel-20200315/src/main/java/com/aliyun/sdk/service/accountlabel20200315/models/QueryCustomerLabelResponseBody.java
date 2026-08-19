// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountlabel20200315.models;

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
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("EndTimeStr")
        private String endTimeStr;

        @com.aliyun.core.annotation.NameInMap("GmtCreatedStr")
        private String gmtCreatedStr;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedStr")
        private String gmtModifiedStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSeries")
        private String labelSeries;

        @com.aliyun.core.annotation.NameInMap("StartTimeStr")
        private String startTimeStr;

        private CustomerLabel(Builder builder) {
            this.creator = builder.creator;
            this.endTimeStr = builder.endTimeStr;
            this.gmtCreatedStr = builder.gmtCreatedStr;
            this.gmtModifiedStr = builder.gmtModifiedStr;
            this.id = builder.id;
            this.label = builder.label;
            this.labelSeries = builder.labelSeries;
            this.startTimeStr = builder.startTimeStr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerLabel create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return endTimeStr
         */
        public String getEndTimeStr() {
            return this.endTimeStr;
        }

        /**
         * @return gmtCreatedStr
         */
        public String getGmtCreatedStr() {
            return this.gmtCreatedStr;
        }

        /**
         * @return gmtModifiedStr
         */
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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

        /**
         * @return startTimeStr
         */
        public String getStartTimeStr() {
            return this.startTimeStr;
        }

        public static final class Builder {
            private String creator; 
            private String endTimeStr; 
            private String gmtCreatedStr; 
            private String gmtModifiedStr; 
            private String id; 
            private String label; 
            private String labelSeries; 
            private String startTimeStr; 

            private Builder() {
            } 

            private Builder(CustomerLabel model) {
                this.creator = model.creator;
                this.endTimeStr = model.endTimeStr;
                this.gmtCreatedStr = model.gmtCreatedStr;
                this.gmtModifiedStr = model.gmtModifiedStr;
                this.id = model.id;
                this.label = model.label;
                this.labelSeries = model.labelSeries;
                this.startTimeStr = model.startTimeStr;
            } 

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * EndTimeStr.
             */
            public Builder endTimeStr(String endTimeStr) {
                this.endTimeStr = endTimeStr;
                return this;
            }

            /**
             * GmtCreatedStr.
             */
            public Builder gmtCreatedStr(String gmtCreatedStr) {
                this.gmtCreatedStr = gmtCreatedStr;
                return this;
            }

            /**
             * GmtModifiedStr.
             */
            public Builder gmtModifiedStr(String gmtModifiedStr) {
                this.gmtModifiedStr = gmtModifiedStr;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
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

            /**
             * StartTimeStr.
             */
            public Builder startTimeStr(String startTimeStr) {
                this.startTimeStr = startTimeStr;
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
