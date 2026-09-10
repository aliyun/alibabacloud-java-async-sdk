// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ListSSLDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSSLDetailsResponseBody</p>
 */
public class ListSSLDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSSLDetailsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSSLDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSSLDetailsResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The http status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request id.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSSLDetailsResponseBody build() {
            return new ListSSLDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSSLDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSSLDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliases")
        private String aliases;

        @com.aliyun.core.annotation.NameInMap("CustomCert")
        private Boolean customCert;

        @com.aliyun.core.annotation.NameInMap("EnableSSL")
        private Boolean enableSSL;

        @com.aliyun.core.annotation.NameInMap("IsValid")
        private Boolean isValid;

        @com.aliyun.core.annotation.NameInMap("IssuerDN")
        private String issuerDN;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private Long notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        @com.aliyun.core.annotation.NameInMap("SslCertificateText")
        private String sslCertificateText;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubjectDN")
        private String subjectDN;

        private Data(Builder builder) {
            this.aliases = builder.aliases;
            this.customCert = builder.customCert;
            this.enableSSL = builder.enableSSL;
            this.isValid = builder.isValid;
            this.issuerDN = builder.issuerDN;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.sslCertificateText = builder.sslCertificateText;
            this.status = builder.status;
            this.subjectDN = builder.subjectDN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliases
         */
        public String getAliases() {
            return this.aliases;
        }

        /**
         * @return customCert
         */
        public Boolean getCustomCert() {
            return this.customCert;
        }

        /**
         * @return enableSSL
         */
        public Boolean getEnableSSL() {
            return this.enableSSL;
        }

        /**
         * @return isValid
         */
        public Boolean getIsValid() {
            return this.isValid;
        }

        /**
         * @return issuerDN
         */
        public String getIssuerDN() {
            return this.issuerDN;
        }

        /**
         * @return notAfter
         */
        public Long getNotAfter() {
            return this.notAfter;
        }

        /**
         * @return notBefore
         */
        public Long getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return sslCertificateText
         */
        public String getSslCertificateText() {
            return this.sslCertificateText;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subjectDN
         */
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public static final class Builder {
            private String aliases; 
            private Boolean customCert; 
            private Boolean enableSSL; 
            private Boolean isValid; 
            private String issuerDN; 
            private Long notAfter; 
            private Long notBefore; 
            private String sslCertificateText; 
            private String status; 
            private String subjectDN; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliases = model.aliases;
                this.customCert = model.customCert;
                this.enableSSL = model.enableSSL;
                this.isValid = model.isValid;
                this.issuerDN = model.issuerDN;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.sslCertificateText = model.sslCertificateText;
                this.status = model.status;
                this.subjectDN = model.subjectDN;
            } 

            /**
             * <p>The certificate alias.</p>
             * 
             * <strong>example:</strong>
             * <p>starrocks-ssl</p>
             */
            public Builder aliases(String aliases) {
                this.aliases = aliases;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is a custom certificate (<code>true</code>) or was generated by the system (<code>false</code>).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder customCert(Boolean customCert) {
                this.customCert = customCert;
                return this;
            }

            /**
             * <p>Indicates whether SSL is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSSL(Boolean enableSSL) {
                this.enableSSL = enableSSL;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is valid.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isValid(Boolean isValid) {
                this.isValid = isValid;
                return this;
            }

            /**
             * <p>The Distinguished Name (DN) of the certificate\&quot;s issuer. For a system-generated certificate, this value matches the <code>SubjectDN</code>. For a custom certificate, it identifies the Certificate Authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>CN=fe-sr-cn-xxx123-internal.starrocks.aliyuncs.com, OU=Aliyun Big Data Platform EMR StarRocks, O=Aliyun, L=BJ, ST=CN, C=CN</p>
             */
            public Builder issuerDN(String issuerDN) {
                this.issuerDN = issuerDN;
                return this;
            }

            /**
             * <p>The end time of the certificate\&quot;s validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>1751010702000</p>
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The start time of the certificate\&quot;s validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>1751000702000</p>
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The Base64-encoded content of the certificate file in PKCS#12 (.p12) format. For a system-generated certificate, this is the content of the generated file. For a custom certificate, this is the content that was provided during upload.</p>
             * 
             * <strong>example:</strong>
             * <p>MIIJkAIBAzCCCVYGCSqGSIb3DQEHAaCCCUcEgglDMIIJPzCCA+8GCSqGSIb3DQEHBqCCA+AwggPc
             * AgEAMIID1QYJKoZIhvcNAQcBMBwGCiqGSIb3DQEMAQYwDgQI3e4V2eXgGFMCAggAgIIDqJ/L8sA
             * ......
             * AB3eKpMa7rQc==</p>
             */
            public Builder sslCertificateText(String sslCertificateText) {
                this.sslCertificateText = sslCertificateText;
                return this;
            }

            /**
             * <p>The status of the certificate. Valid values:</p>
             * <ul>
             * <li><p>valid</p>
             * </li>
             * <li><p>expired</p>
             * </li>
             * <li><p>unknown</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subject\&quot;s Distinguished Name (DN), which includes the following information:</p>
             * <ul>
             * <li><p><strong>C</strong>: The country code where the organization is located.</p>
             * </li>
             * <li><p><strong>O</strong>: The name of the organization.</p>
             * </li>
             * <li><p><strong>OU</strong>: The department within the organization.</p>
             * </li>
             * <li><p><strong>L</strong>: The city where the organization is located.</p>
             * </li>
             * <li><p><strong>CN</strong>: The common name or abbreviation of the organization.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CN=fe-{clusterId}-internal.starrocks.aliyuncs.com, OU=Aliyun Big Data Platform EMR StarRocks, O=Aliyun, L=BJ, ST=CN, C=CN</p>
             */
            public Builder subjectDN(String subjectDN) {
                this.subjectDN = subjectDN;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
