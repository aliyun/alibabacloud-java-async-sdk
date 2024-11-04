// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BuySecretNoResponseBody} extends {@link TeaModel}
 *
 * <p>BuySecretNoResponseBody</p>
 */
public class BuySecretNoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretBuyInfoDTO")
    private SecretBuyInfoDTO secretBuyInfoDTO;

    private BuySecretNoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretBuyInfoDTO = builder.secretBuyInfoDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuySecretNoResponseBody create() {
        return builder().build();
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
     * @return secretBuyInfoDTO
     */
    public SecretBuyInfoDTO getSecretBuyInfoDTO() {
        return this.secretBuyInfoDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretBuyInfoDTO secretBuyInfoDTO; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D1AEB96-96D0-454E-B0DC-AE2A8DF08020</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information returned after the operation was called.</p>
         */
        public Builder secretBuyInfoDTO(SecretBuyInfoDTO secretBuyInfoDTO) {
            this.secretBuyInfoDTO = secretBuyInfoDTO;
            return this;
        }

        public BuySecretNoResponseBody build() {
            return new BuySecretNoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BuySecretNoResponseBody} extends {@link TeaModel}
     *
     * <p>BuySecretNoResponseBody</p>
     */
    public static class SecretBuyInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecretNo")
        private String secretNo;

        private SecretBuyInfoDTO(Builder builder) {
            this.secretNo = builder.secretNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretBuyInfoDTO create() {
            return builder().build();
        }

        /**
         * @return secretNo
         */
        public String getSecretNo() {
            return this.secretNo;
        }

        public static final class Builder {
            private String secretNo; 

            /**
             * <p>The private number, that is, phone number X.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder secretNo(String secretNo) {
                this.secretNo = secretNo;
                return this;
            }

            public SecretBuyInfoDTO build() {
                return new SecretBuyInfoDTO(this);
            } 

        } 

    }
}
