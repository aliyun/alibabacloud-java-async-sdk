// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDailyBillResponseBody} extends {@link TeaModel}
 *
 * <p>GetDailyBillResponseBody</p>
 */
public class GetDailyBillResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public GetDailyBillResponseBody build() {
            return new GetDailyBillResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BillLinkCSV")
        private String billLinkCSV;

        @NameInMap("BillLinkXLSX")
        private String billLinkXLSX;

        @NameInMap("BillOwner")
        private String billOwner;

        @NameInMap("BillType")
        private String billType;

        @NameInMap("SpendingTime")
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
             * BillLinkCSV.
             */
            public Builder billLinkCSV(String billLinkCSV) {
                this.billLinkCSV = billLinkCSV;
                return this;
            }

            /**
             * BillLinkXLSX.
             */
            public Builder billLinkXLSX(String billLinkXLSX) {
                this.billLinkXLSX = billLinkXLSX;
                return this;
            }

            /**
             * BillOwner.
             */
            public Builder billOwner(String billOwner) {
                this.billOwner = billOwner;
                return this;
            }

            /**
             * BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * SpendingTime.
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
