// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDailyBillResponseBody} extends {@link TeaModel}
 *
 * <p>GetDailyBillResponseBody</p>
 */
public class GetDailyBillResponseBody extends TeaModel {
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

    private GetDailyBillResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDailyBillResponseBody create() {
        return builder().build();
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

        /**
         * Result Code:
         * <p>
         * * 200 OK
         * * 1109 System error
         * * 3050 Bill Type can only be DailyOrder, DailyBill or DailyInstanceBill.
         * * 3049 Incorrect format of Spending Time.
         * * 3048 Bill Owner can only be 1 or 2.
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
         * Same as Code parameters.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Request ID, the unique request identifier generated by Alibaba Cloud.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDailyBillResponseBody build() {
            return new GetDailyBillResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillLinkCSV")
        private String billLinkCSV;

        @com.aliyun.core.annotation.NameInMap("BillLinkXLSX")
        private String billLinkXLSX;

        @com.aliyun.core.annotation.NameInMap("BillOwner")
        private String billOwner;

        @com.aliyun.core.annotation.NameInMap("BillType")
        private String billType;

        @com.aliyun.core.annotation.NameInMap("SpendingTime")
        private String spendingTime;

        private Data(Builder builder) {
            this.billLinkCSV = builder.billLinkCSV;
            this.billLinkXLSX = builder.billLinkXLSX;
            this.billOwner = builder.billOwner;
            this.billType = builder.billType;
            this.spendingTime = builder.spendingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return billLinkCSV
         */
        public String getBillLinkCSV() {
            return this.billLinkCSV;
        }

        /**
         * @return billLinkXLSX
         */
        public String getBillLinkXLSX() {
            return this.billLinkXLSX;
        }

        /**
         * @return billOwner
         */
        public String getBillOwner() {
            return this.billOwner;
        }

        /**
         * @return billType
         */
        public String getBillType() {
            return this.billType;
        }

        /**
         * @return spendingTime
         */
        public String getSpendingTime() {
            return this.spendingTime;
        }

        public static final class Builder {
            private String billLinkCSV; 
            private String billLinkXLSX; 
            private String billOwner; 
            private String billType; 
            private String spendingTime; 

            /**
             * The link to download CSV file, please use HTTP Protocol.
             */
            public Builder billLinkCSV(String billLinkCSV) {
                this.billLinkCSV = billLinkCSV;
                return this;
            }

            /**
             * The link to download XLSX file, please use HTTP Protocol.
             */
            public Builder billLinkXLSX(String billLinkXLSX) {
                this.billLinkXLSX = billLinkXLSX;
                return this;
            }

            /**
             * Same as inserted parameter BillOwner.
             */
            public Builder billOwner(String billOwner) {
                this.billOwner = billOwner;
                return this;
            }

            /**
             * Same as inserted parameter BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * Spending Time, refer to the exact time of costuming.
             */
            public Builder spendingTime(String spendingTime) {
                this.spendingTime = spendingTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
