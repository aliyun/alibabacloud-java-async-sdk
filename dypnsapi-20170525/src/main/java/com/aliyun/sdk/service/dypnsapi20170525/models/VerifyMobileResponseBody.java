// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyMobileResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyMobileResponseBody</p>
 */
public class VerifyMobileResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GateVerifyResultDTO")
    private GateVerifyResultDTO gateVerifyResultDTO;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyMobileResponseBody(Builder builder) {
        this.code = builder.code;
        this.gateVerifyResultDTO = builder.gateVerifyResultDTO;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMobileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gateVerifyResultDTO
     */
    public GateVerifyResultDTO getGateVerifyResultDTO() {
        return this.gateVerifyResultDTO;
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
        private GateVerifyResultDTO gateVerifyResultDTO; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   If OK is returned, the request is successful.
         * *   For more information about other error codes, see [API response codes](~~85198~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder gateVerifyResultDTO(GateVerifyResultDTO gateVerifyResultDTO) {
            this.gateVerifyResultDTO = gateVerifyResultDTO;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyMobileResponseBody build() {
            return new VerifyMobileResponseBody(this);
        } 

    } 

    public static class GateVerifyResultDTO extends TeaModel {
        @NameInMap("VerifyId")
        private String verifyId;

        @NameInMap("VerifyResult")
        private String verifyResult;

        private GateVerifyResultDTO(Builder builder) {
            this.verifyId = builder.verifyId;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GateVerifyResultDTO create() {
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
             * The verification ID.
             */
            public Builder verifyId(String verifyId) {
                this.verifyId = verifyId;
                return this;
            }

            /**
             * The verification results. Valid values:
             * <p>
             * 
             * *   **PASS: The input phone number is consistent with the phone number that you use.**
             * *   **REJECT: The input phone number is different from the phone number that you use.**
             * *   **UNKNOWN: The system cannot judge whether the input phone number is consistent with the phone number that you use.
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public GateVerifyResultDTO build() {
                return new GateVerifyResultDTO(this);
            } 

        } 

    }
}
