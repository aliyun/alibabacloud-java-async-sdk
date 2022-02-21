// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallStatusResponseBody</p>
 */
public class QueryCallStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretCallStatusDTO")
    private SecretCallStatusDTO secretCallStatusDTO;

    private QueryCallStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretCallStatusDTO = builder.secretCallStatusDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallStatusResponseBody create() {
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
     * @return secretCallStatusDTO
     */
    public SecretCallStatusDTO getSecretCallStatusDTO() {
        return this.secretCallStatusDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretCallStatusDTO secretCallStatusDTO; 

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
         * SecretCallStatusDTO.
         */
        public Builder secretCallStatusDTO(SecretCallStatusDTO secretCallStatusDTO) {
            this.secretCallStatusDTO = secretCallStatusDTO;
            return this;
        }

        public QueryCallStatusResponseBody build() {
            return new QueryCallStatusResponseBody(this);
        } 

    } 

    public static class SecretCallStatusDTO extends TeaModel {
        @NameInMap("CalledNo")
        private String calledNo;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("Status")
        private Integer status;

        private SecretCallStatusDTO(Builder builder) {
            this.calledNo = builder.calledNo;
            this.extension = builder.extension;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretCallStatusDTO create() {
            return builder().build();
        }

        /**
         * @return calledNo
         */
        public String getCalledNo() {
            return this.calledNo;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String calledNo; 
            private String extension; 
            private Integer status; 

            /**
             * CalledNo.
             */
            public Builder calledNo(String calledNo) {
                this.calledNo = calledNo;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public SecretCallStatusDTO build() {
                return new SecretCallStatusDTO(this);
            } 

        } 

    }
}
