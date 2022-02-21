// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAxbResponseBody} extends {@link TeaModel}
 *
 * <p>BindAxbResponseBody</p>
 */
public class BindAxbResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretBindDTO")
    private SecretBindDTO secretBindDTO;

    private BindAxbResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretBindDTO = builder.secretBindDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxbResponseBody create() {
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
         * SecretBindDTO.
         */
        public Builder secretBindDTO(SecretBindDTO secretBindDTO) {
            this.secretBindDTO = secretBindDTO;
            return this;
        }

        public BindAxbResponseBody build() {
            return new BindAxbResponseBody(this);
        } 

    } 

    public static class SecretBindDTO extends TeaModel {
        @NameInMap("Extension")
        private String extension;

        @NameInMap("SecretNo")
        private String secretNo;

        @NameInMap("SubsId")
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
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * SecretNo.
             */
            public Builder secretNo(String secretNo) {
                this.secretNo = secretNo;
                return this;
            }

            /**
             * SubsId.
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
