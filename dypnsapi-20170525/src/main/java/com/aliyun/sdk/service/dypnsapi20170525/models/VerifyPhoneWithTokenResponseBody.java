// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyPhoneWithTokenResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyPhoneWithTokenResponseBody</p>
 */
public class VerifyPhoneWithTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GateVerify")
    private GateVerify gateVerify;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GateVerify.
         */
        public Builder gateVerify(GateVerify gateVerify) {
            this.gateVerify = gateVerify;
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

        public VerifyPhoneWithTokenResponseBody build() {
            return new VerifyPhoneWithTokenResponseBody(this);
        } 

    } 

    public static class GateVerify extends TeaModel {
        @NameInMap("VerifyId")
        private String verifyId;

        @NameInMap("VerifyResult")
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
             * VerifyId.
             */
            public Builder verifyId(String verifyId) {
                this.verifyId = verifyId;
                return this;
            }

            /**
             * VerifyResult.
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
