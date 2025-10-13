// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GetCertificateAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificateAttributeResponseBody</p>
 */
public class GetCertificateAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateAttributeDto")
    private CertificateAttributeDto certificateAttributeDto;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetCertificateAttributeResponseBody(Builder builder) {
        this.certificateAttributeDto = builder.certificateAttributeDto;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.success = builder.success;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateAttributeDto
     */
    public CertificateAttributeDto getCertificateAttributeDto() {
        return this.certificateAttributeDto;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CertificateAttributeDto certificateAttributeDto; 
        private String errorCode; 
        private String errorMessage; 
        private String httpStatusCode; 
        private Boolean success; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCertificateAttributeResponseBody model) {
            this.certificateAttributeDto = model.certificateAttributeDto;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.success = model.success;
            this.requestId = model.requestId;
        } 

        /**
         * CertificateAttributeDto.
         */
        public Builder certificateAttributeDto(CertificateAttributeDto certificateAttributeDto) {
            this.certificateAttributeDto = certificateAttributeDto;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCertificateAttributeResponseBody build() {
            return new GetCertificateAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCertificateAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateAttributeResponseBody</p>
     */
    public static class CertificateAttributeDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableSSL")
        private Boolean enableSSL;

        @com.aliyun.core.annotation.NameInMap("expirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private CertificateAttributeDto(Builder builder) {
            this.enableSSL = builder.enableSSL;
            this.expirationTime = builder.expirationTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateAttributeDto create() {
            return builder().build();
        }

        /**
         * @return enableSSL
         */
        public Boolean getEnableSSL() {
            return this.enableSSL;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean enableSSL; 
            private Long expirationTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(CertificateAttributeDto model) {
                this.enableSSL = model.enableSSL;
                this.expirationTime = model.expirationTime;
                this.status = model.status;
            } 

            /**
             * enableSSL.
             */
            public Builder enableSSL(Boolean enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * expirationTime.
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CertificateAttributeDto build() {
                return new CertificateAttributeDto(this);
            } 

        } 

    }
}
