// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAxgResponseBody} extends {@link TeaModel}
 *
 * <p>BindAxgResponseBody</p>
 */
public class BindAxgResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretBindDTO")
    private SecretBindDTO secretBindDTO;

    private BindAxgResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretBindDTO = builder.secretBindDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxgResponseBody create() {
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
     * @return secretBindDTO
     */
    public SecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretBindDTO secretBindDTO; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~109196~~).
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * The information returned after the phone numbers were bound.
         */
        public Builder secretBindDTO(SecretBindDTO secretBindDTO) {
            this.secretBindDTO = secretBindDTO;
            return this;
        }

        public BindAxgResponseBody build() {
            return new BindAxgResponseBody(this);
        } 

    } 

    public static class SecretBindDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("SecretNo")
        private String secretNo;

        @com.aliyun.core.annotation.NameInMap("SubsId")
        private String subsId;

        private SecretBindDTO(Builder builder) {
            this.extension = builder.extension;
            this.secretNo = builder.secretNo;
            this.subsId = builder.subsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretBindDTO create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return secretNo
         */
        public String getSecretNo() {
            return this.secretNo;
        }

        /**
         * @return subsId
         */
        public String getSubsId() {
            return this.subsId;
        }

        public static final class Builder {
            private String extension; 
            private String secretNo; 
            private String subsId; 

            /**
             * The extension of the phone number.
             * <p>
             * 
             * >  The BindAxg operation does not involve an extension. Ignore this parameter.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * The private number, that is, phone number X.
             */
            public Builder secretNo(String secretNo) {
                this.secretNo = secretNo;
                return this;
            }

            /**
             * The binding ID.
             */
            public Builder subsId(String subsId) {
                this.subsId = subsId;
                return this;
            }

            public SecretBindDTO build() {
                return new SecretBindDTO(this);
            } 

        } 

    }
}
