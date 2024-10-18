// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyPhoneWithTokenResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyPhoneWithTokenResponseBody</p>
 */
public class VerifyPhoneWithTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GateVerify")
    private GateVerify gateVerify;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifyPhoneWithTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.gateVerify = builder.gateVerify;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPhoneWithTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gateVerify
     */
    public GateVerify getGateVerify() {
        return this.gateVerify;
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

    public static final class Builder {
        private String code; 
        private GateVerify gateVerify; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
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
         * <p>The response parameters.</p>
         */
        public Builder gateVerify(GateVerify gateVerify) {
            this.gateVerify = gateVerify;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8906582E-6722</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyPhoneWithTokenResponseBody build() {
            return new VerifyPhoneWithTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyPhoneWithTokenResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyPhoneWithTokenResponseBody</p>
     */
    public static class GateVerify extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VerifyId")
        private String verifyId;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private String verifyResult;

        private GateVerify(Builder builder) {
            this.verifyId = builder.verifyId;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GateVerify create() {
            return builder().build();
        }

        /**
         * @return verifyId
         */
        public String getVerifyId() {
            return this.verifyId;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String verifyId; 
            private String verifyResult; 

            /**
             * <p>The external ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12134****</p>
             */
            public Builder verifyId(String verifyId) {
                this.verifyId = verifyId;
                return this;
            }

            /**
             * <p>The verification results. Valid values:</p>
             * <ul>
             * <li>PASS: The input phone number is consistent with the phone number used in HTML5 pages.</li>
             * <li>REJECT: The input phone number is different from the phone number used in HTML5 pages.</li>
             * <li>UNKNOWN: The system cannot judge whether the input phone number is consistent with the phone number used in HTML5 pages.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASS</p>
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public GateVerify build() {
                return new GateVerify(this);
            } 

        } 

    }
}
