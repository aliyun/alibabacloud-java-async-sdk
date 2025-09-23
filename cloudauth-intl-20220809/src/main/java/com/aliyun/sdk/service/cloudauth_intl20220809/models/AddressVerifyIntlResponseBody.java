// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link AddressVerifyIntlResponseBody} extends {@link TeaModel}
 *
 * <p>AddressVerifyIntlResponseBody</p>
 */
public class AddressVerifyIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private AddressVerifyIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressVerifyIntlResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(AddressVerifyIntlResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public AddressVerifyIntlResponseBody build() {
            return new AddressVerifyIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddressVerifyIntlResponseBody} extends {@link TeaModel}
     *
     * <p>AddressVerifyIntlResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressInfo")
        private String addressInfo;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private ResultObject(Builder builder) {
            this.addressInfo = builder.addressInfo;
            this.ispName = builder.ispName;
            this.passed = builder.passed;
            this.subCode = builder.subCode;
            this.transactionId = builder.transactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return addressInfo
         */
        public String getAddressInfo() {
            return this.addressInfo;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        public static final class Builder {
            private String addressInfo; 
            private String ispName; 
            private String passed; 
            private String subCode; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.addressInfo = model.addressInfo;
                this.ispName = model.ispName;
                this.passed = model.passed;
                this.subCode = model.subCode;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>Address verification details.</p>
             * 
             * <strong>example:</strong>
             * <p>0-3000</p>
             */
            public Builder addressInfo(String addressInfo) {
                this.addressInfo = addressInfo;
                return this;
            }

            /**
             * <p>Operator name:</p>
             * <ul>
             * <li>CMCC: China Mobile</li>
             * <li>CTCC: China Telecom</li>
             * <li>CUCC: China Unicom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CMCC</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>Verification result, values:</p>
             * <ul>
             * <li>Y: Yes, the verified address distance is less than or equal to 10KM.</li>
             * <li>N: No, the verified address distance is greater than 10KM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder passed(String passed) {
                this.passed = passed;
                return this;
            }

            /**
             * <p>Authentication result description.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>Unique identifier for the authentication request.</p>
             * 
             * <strong>example:</strong>
             * <p>hksb7ba1b28130d24e015d69********</p>
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
