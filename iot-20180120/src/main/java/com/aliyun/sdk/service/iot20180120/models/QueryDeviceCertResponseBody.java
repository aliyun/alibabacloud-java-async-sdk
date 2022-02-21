// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceCertResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceCertResponseBody</p>
 */
public class QueryDeviceCertResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DeviceCertInfo")
    private DeviceCertInfo deviceCertInfo;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDeviceCertResponseBody(Builder builder) {
        this.code = builder.code;
        this.deviceCertInfo = builder.deviceCertInfo;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceCertResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceCertInfo
     */
    public DeviceCertInfo getDeviceCertInfo() {
        return this.deviceCertInfo;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private DeviceCertInfo deviceCertInfo; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DeviceCertInfo.
         */
        public Builder deviceCertInfo(DeviceCertInfo deviceCertInfo) {
            this.deviceCertInfo = deviceCertInfo;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceCertResponseBody build() {
            return new QueryDeviceCertResponseBody(this);
        } 

    } 

    public static class DeviceCertInfo extends TeaModel {
        @NameInMap("CertSN")
        private String certSN;

        @NameInMap("Certificate")
        private String certificate;

        @NameInMap("PrivateKey")
        private String privateKey;

        @NameInMap("Status")
        private Integer status;

        private DeviceCertInfo(Builder builder) {
            this.certSN = builder.certSN;
            this.certificate = builder.certificate;
            this.privateKey = builder.privateKey;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceCertInfo create() {
            return builder().build();
        }

        /**
         * @return certSN
         */
        public String getCertSN() {
            return this.certSN;
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return privateKey
         */
        public String getPrivateKey() {
            return this.privateKey;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certSN; 
            private String certificate; 
            private String privateKey; 
            private Integer status; 

            /**
             * CertSN.
             */
            public Builder certSN(String certSN) {
                this.certSN = certSN;
                return this;
            }

            /**
             * Certificate.
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * PrivateKey.
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DeviceCertInfo build() {
                return new DeviceCertInfo(this);
            } 

        } 

    }
}
