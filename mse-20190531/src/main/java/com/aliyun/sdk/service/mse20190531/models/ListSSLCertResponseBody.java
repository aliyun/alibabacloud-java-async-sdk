// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListSSLCertResponseBody} extends {@link TeaModel}
 *
 * <p>ListSSLCertResponseBody</p>
 */
public class ListSSLCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSSLCertResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSSLCertResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned. A value of 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to perform this operation.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CAA9A229-141D-5FBA-AC5C-516C02026A11</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSSLCertResponseBody build() {
            return new ListSSLCertResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSSLCertResponseBody} extends {@link TeaModel}
     *
     * <p>ListSSLCertResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private String afterDate;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private String beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("GmtAfter")
        private String gmtAfter;

        @com.aliyun.core.annotation.NameInMap("GmtBefore")
        private String gmtBefore;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private String sans;

        private Data(Builder builder) {
            this.afterDate = builder.afterDate;
            this.algorithm = builder.algorithm;
            this.beforeDate = builder.beforeDate;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.commonName = builder.commonName;
            this.gmtAfter = builder.gmtAfter;
            this.gmtBefore = builder.gmtBefore;
            this.issuer = builder.issuer;
            this.sans = builder.sans;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return afterDate
         */
        public String getAfterDate() {
            return this.afterDate;
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return beforeDate
         */
        public String getBeforeDate() {
            return this.beforeDate;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return gmtAfter
         */
        public String getGmtAfter() {
            return this.gmtAfter;
        }

        /**
         * @return gmtBefore
         */
        public String getGmtBefore() {
            return this.gmtBefore;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        public static final class Builder {
            private String afterDate; 
            private String algorithm; 
            private String beforeDate; 
            private String certIdentifier; 
            private String certName; 
            private String commonName; 
            private String gmtAfter; 
            private String gmtBefore; 
            private String issuer; 
            private String sans; 

            /**
             * <p>The time when the certificate expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-01 02:35:12</p>
             */
            public Builder afterDate(String afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The time when the certificate took effect. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2031-03-30 02:35:12</p>
             */
            public Builder beforeDate(String beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The domain name with which the certificate is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>*.test.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The time when the certificate expires. This value is a GMT timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-01 02:35:12</p>
             */
            public Builder gmtAfter(String gmtAfter) {
                this.gmtAfter = gmtAfter;
                return this;
            }

            /**
             * <p>The time when the certificate took effect. This value is a GMT timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2031-03-30 02:35:12</p>
             */
            public Builder gmtBefore(String gmtBefore) {
                this.gmtBefore = gmtBefore;
                return this;
            }

            /**
             * <p>The issuer of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>SSL</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
