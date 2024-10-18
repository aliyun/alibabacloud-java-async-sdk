// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyMobileResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyMobileResponseBody</p>
 */
public class VerifyMobileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GateVerifyResultDTO")
    private GateVerifyResultDTO gateVerifyResultDTO;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
        public Builder gateVerifyResultDTO(GateVerifyResultDTO gateVerifyResultDTO) {
            this.gateVerifyResultDTO = gateVerifyResultDTO;
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

        public VerifyMobileResponseBody build() {
            return new VerifyMobileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyMobileResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyMobileResponseBody</p>
     */
    public static class GateVerifyResultDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VerifyId")
        private String verifyId;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
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
             * <p>The verification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>121343241</p>
             */
            public Builder verifyId(String verifyId) {
                this.verifyId = verifyId;
                return this;
            }

            /**
             * <p>The verification results. Valid values:</p>
             * <ul>
             * <li><strong>PASS: The input phone number is consistent with the phone number that you use.</strong></li>
             * <li><strong>REJECT: The input phone number is different from the phone number that you use.</strong></li>
             * <li>**UNKNOWN: The system cannot judge whether the input phone number is consistent with the phone number that you use.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASS</p>
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
