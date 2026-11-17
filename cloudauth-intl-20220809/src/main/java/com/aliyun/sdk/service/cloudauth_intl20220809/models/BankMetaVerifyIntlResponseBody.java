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
 * {@link BankMetaVerifyIntlResponseBody} extends {@link TeaModel}
 *
 * <p>BankMetaVerifyIntlResponseBody</p>
 */
public class BankMetaVerifyIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private BankMetaVerifyIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BankMetaVerifyIntlResponseBody create() {
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

        private Builder(BankMetaVerifyIntlResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The return code. A value of 200 indicates success, and other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EB35****87EBA1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result information.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public BankMetaVerifyIntlResponseBody build() {
            return new BankMetaVerifyIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BankMetaVerifyIntlResponseBody} extends {@link TeaModel}
     *
     * <p>BankMetaVerifyIntlResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private ResultObject(Builder builder) {
            this.bizCode = builder.bizCode;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        public static final class Builder {
            private String bizCode; 
            private String subCode; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizCode = model.bizCode;
                this.subCode = model.subCode;
            } 

            /**
             * <p>The verification result code. Valid values:</p>
             * <ul>
             * <li>1: The verification is consistent. You are billed for this call.</li>
             * <li>2: The verification is inconsistent. You are billed for this call.</li>
             * <li>3: No record is found. You are not billed for this call.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>The verification details. Valid values:</p>
             * <ul>
             * <li><strong>101</strong>: The verification is successful.</li>
             * <li><strong>201</strong>: The authentication information is inconsistent. The cardholder information is incorrect.</li>
             * <li><strong>202</strong>: The authentication information is inconsistent. The bank card is not enabled for authenticated payment.</li>
             * <li><strong>203</strong>: The authentication information is inconsistent. The bank card has expired.</li>
             * <li><strong>204</strong>: The authentication information is inconsistent. The bank card is restricted.</li>
             * <li><strong>205</strong>: The authentication information is inconsistent. The bank card has been confiscated.</li>
             * <li><strong>206</strong>: The authentication information is inconsistent. The bank card is invalid.</li>
             * <li><strong>207</strong>: The authentication information is inconsistent. The bank card has no corresponding issuing bank.</li>
             * <li><strong>208</strong>: The authentication information is inconsistent. The bank card is not initialized or is a dormant card.</li>
             * <li><strong>209</strong>: The authentication information is inconsistent. The bank card is a fraudulent or captured card.</li>
             * <li><strong>210</strong>: The authentication information is inconsistent. The bank card has been reported as lost.</li>
             * <li><strong>211</strong>: The authentication information is inconsistent. The number of incorrect password attempts has exceeded the limit.</li>
             * <li><strong>212</strong>: The authentication information is inconsistent. The issuing bank does not support this transaction.</li>
             * <li><strong>213</strong>: The authentication information is inconsistent. The card status is abnormal or the card is invalid.</li>
             * <li><strong>214</strong>: The authentication information is inconsistent. No mobile phone number is reserved.</li>
             * <li><strong>215</strong>: The authentication information is inconsistent. The entered password, expiration date, or CVN2 is incorrect.</li>
             * <li><strong>216</strong>: The authentication information is inconsistent. Other card exceptions occurred.</li>
             * <li><strong>301</strong>: The verification cannot be performed. The bank card does not support this service.</li>
             * <li><strong>302</strong>: The verification cannot be performed. The verification failed or the bank rejected the verification. Contact the issuing bank.</li>
             * <li><strong>303</strong>: The verification cannot be performed. The bank card does not support mobile phone number verification.</li>
             * <li><strong>304</strong>: The verification cannot be performed. The bank card number is incorrect.</li>
             * <li><strong>305</strong>: The verification cannot be performed. Other reasons.</li>
             * <li><strong>306</strong>: The verification cannot be performed. The number of verification attempts has exceeded the limit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
