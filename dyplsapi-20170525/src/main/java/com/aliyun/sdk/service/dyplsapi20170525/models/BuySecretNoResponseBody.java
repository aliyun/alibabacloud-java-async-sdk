// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuySecretNoResponseBody} extends {@link TeaModel}
 *
 * <p>BuySecretNoResponseBody</p>
 */
public class BuySecretNoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretBuyInfoDTO")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * SecretBuyInfoDTO.
         */
        public Builder secretBuyInfoDTO(SecretBuyInfoDTO secretBuyInfoDTO) {
            this.secretBuyInfoDTO = secretBuyInfoDTO;
            return this;
        }

        public BuySecretNoResponseBody build() {
            return new BuySecretNoResponseBody(this);
        } 

    } 

    public static class SecretBuyInfoDTO extends TeaModel {
        @NameInMap("SecretNo")
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
             * SecretNo.
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
