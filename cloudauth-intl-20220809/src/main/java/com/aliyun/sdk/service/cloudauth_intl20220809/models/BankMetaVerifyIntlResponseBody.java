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
         * <p>Return code: 200 for success, others for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message</p>
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
         * <p>4EB35****87EBA1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
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
             * <p>Verification result code.</p>
             * <ul>
             * <li>1: Consistent (charged)</li>
             * <li>2: Inconsistent (charged)</li>
             * <li>3: No record found (not charged)</li>
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
             * <p>Verification details:</p>
             * <ul>
             * <li><strong>101</strong>: Verification passed.</li>
             * <li><strong>201</strong>: Authentication information does not match, cardholder information is incorrect.</li>
             * <li><strong>202</strong>: Authentication information does not match, bank card has not been activated for authenticated payments.</li>
             * <li><strong>203</strong>: Authentication information does not match, bank card has expired.</li>
             * <li><strong>204</strong>: Authentication information does not match, bank card is a restricted card.</li>
             * <li><strong>205</strong>: Authentication information does not match, this card has been confiscated.</li>
             * <li><strong>206</strong>: Authentication information does not match, bank card is invalid.</li>
             * <li><strong>207</strong>: Authentication information does not match, this card has no corresponding issuing bank.</li>
             * <li><strong>208</strong>: Authentication information does not match, this card is uninitialized or dormant.</li>
             * <li><strong>209</strong>: Authentication information does not match, this card is a cheating card or swallowed card.</li>
             * <li><strong>210</strong>: Authentication information does not match, this card has been reported lost.</li>
             * <li><strong>211</strong>: Authentication information does not match, password error limit exceeded.</li>
             * <li><strong>212</strong>: Authentication information does not match, issuing bank does not support this transaction.</li>
             * <li><strong>213</strong>: Authentication information does not match, card status is abnormal or card is invalid.</li>
             * <li><strong>214</strong>: Authentication information does not match, no phone number reserved.</li>
             * <li><strong>215</strong>: Authentication information does not match, entered password, expiration date, or CVN2 is incorrect.</li>
             * <li><strong>216</strong>: Authentication information does not match, other card anomalies.</li>
             * <li><strong>301</strong>: Unable to verify, bank card does not support this service.</li>
             * <li><strong>302</strong>: Unable to verify, verification failed or bank refused verification, please contact the issuing bank.</li>
             * <li><strong>303</strong>: Unable to verify, bank card does not currently support phone number verification.</li>
             * <li><strong>304</strong>: Unable to verify, bank card number is incorrect.</li>
             * <li><strong>305</strong>: Unable to verify, other reasons.</li>
             * <li><strong>306</strong>: Unable to verify, verification attempt limit exceeded.</li>
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
