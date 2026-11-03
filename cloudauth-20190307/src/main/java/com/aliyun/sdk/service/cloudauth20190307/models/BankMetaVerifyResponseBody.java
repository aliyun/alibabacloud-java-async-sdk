// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link BankMetaVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>BankMetaVerifyResponseBody</p>
 */
public class BankMetaVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private BankMetaVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BankMetaVerifyResponseBody create() {
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

        private Builder(BankMetaVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The response code. 200 indicates success. Other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>473469C7-A***B-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The verification result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public BankMetaVerifyResponseBody build() {
            return new BankMetaVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BankMetaVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>BankMetaVerifyResponseBody</p>
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
             * <p>The verification result.</p>
             * <ul>
             * <li>1: verification passed (billed).</li>
             * <li>2: verification failed (billed).</li>
             * <li>3: no records found (not billed).</li>
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
             * <p>The verification details.</p>
             * <ul>
             * <li><strong>101</strong>: verification passed.</li>
             * <li><strong>201</strong>: verification failed. The cardholder information is incorrect.</li>
             * <li><strong>202</strong>: verification failed. Authentication payment is not enabled for the bank card.</li>
             * <li><strong>203</strong>: verification failed. The bank card has expired.</li>
             * <li><strong>204</strong>: verification failed. The bank card is restricted.</li>
             * <li><strong>205</strong>: verification failed. The card has been confiscated.</li>
             * <li><strong>206</strong>: verification failed. The bank card is invalid.</li>
             * <li><strong>207</strong>: verification failed. No matching issuing bank exists.</li>
             * <li><strong>208</strong>: verification failed. The card is not initialized or is a dormant card.</li>
             * <li><strong>209</strong>: verification failed. The card is fraudulent or has been retained.</li>
             * <li><strong>210</strong>: verification failed. The card has been reported lost.</li>
             * <li><strong>211</strong>: verification failed. The maximum number of password attempts has been exceeded.</li>
             * <li><strong>212</strong>: verification failed. The issuing bank does not support this transaction.</li>
             * <li><strong>213</strong>: verification failed. The card status is abnormal or the card is invalid.</li>
             * <li><strong>214</strong>: verification failed. No mobile phone number is registered.</li>
             * <li><strong>215</strong>: verification failed. The password, expiration date, or CVN2 is incorrect.</li>
             * <li><strong>216</strong>: verification failed. Other card exceptions.</li>
             * <li><strong>301</strong>: unable to verify. The bank card does not support this service.</li>
             * <li><strong>302</strong>: unable to verify. Verification failed or the bank refused verification. Contact the issuing bank.</li>
             * <li><strong>303</strong>: unable to verify. The bank card does not support mobile phone number verification.</li>
             * <li><strong>304</strong>: unable to verify. The bank card number is incorrect.</li>
             * <li><strong>305</strong>: unable to verify. Other reasons.</li>
             * <li><strong>306</strong>: unable to verify. The maximum number of verification attempts has been exceeded.</li>
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
