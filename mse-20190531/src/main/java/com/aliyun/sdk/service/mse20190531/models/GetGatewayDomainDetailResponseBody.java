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
 * {@link GetGatewayDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayDomainDetailResponseBody</p>
 */
public class GetGatewayDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetGatewayDomainDetailResponseBody(Builder builder) {
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

    public static GetGatewayDomainDetailResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
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
         * <p>The message returned.</p>
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
         * <p>88B83302-CD88-54D3-8DF2-208BFDC73F0D</p>
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

        public GetGatewayDomainDetailResponseBody build() {
            return new GetGatewayDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayDomainDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private Long afterDate;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private Long beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtAfter")
        private String gmtAfter;

        @com.aliyun.core.annotation.NameInMap("GmtBefore")
        private String gmtBefore;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Http2")
        private String http2;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("MustHttps")
        private Boolean mustHttps;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private String sans;

        @com.aliyun.core.annotation.NameInMap("TlsMax")
        private String tlsMax;

        @com.aliyun.core.annotation.NameInMap("TlsMin")
        private String tlsMin;

        private Data(Builder builder) {
            this.afterDate = builder.afterDate;
            this.algorithm = builder.algorithm;
            this.beforeDate = builder.beforeDate;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.commonName = builder.commonName;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtAfter = builder.gmtAfter;
            this.gmtBefore = builder.gmtBefore;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.http2 = builder.http2;
            this.id = builder.id;
            this.issuer = builder.issuer;
            this.mustHttps = builder.mustHttps;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.sans = builder.sans;
            this.tlsMax = builder.tlsMax;
            this.tlsMin = builder.tlsMin;
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
        public Long getAfterDate() {
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
        public Long getBeforeDate() {
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
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return http2
         */
        public String getHttp2() {
            return this.http2;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return mustHttps
         */
        public Boolean getMustHttps() {
            return this.mustHttps;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        /**
         * @return tlsMax
         */
        public String getTlsMax() {
            return this.tlsMax;
        }

        /**
         * @return tlsMin
         */
        public String getTlsMin() {
            return this.tlsMin;
        }

        public static final class Builder {
            private Long afterDate; 
            private String algorithm; 
            private Long beforeDate; 
            private String certIdentifier; 
            private String certName; 
            private String commonName; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtAfter; 
            private String gmtBefore; 
            private String gmtCreate; 
            private String gmtModified; 
            private String http2; 
            private Long id; 
            private String issuer; 
            private Boolean mustHttps; 
            private String name; 
            private String protocol; 
            private String sans; 
            private String tlsMax; 
            private String tlsMin; 

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-01 02:35:12</p>
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-01 02:35:12</p>
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>234-cn-hangzhou</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The public domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-7ea3da97b96543e19f6c597cd4a9****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-01 02:35:12</p>
             */
            public Builder gmtAfter(String gmtAfter) {
                this.gmtAfter = gmtAfter;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-01 02:35:12</p>
             */
            public Builder gmtBefore(String gmtBefore) {
                this.gmtBefore = gmtBefore;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether <code>HTTP/2</code> is enabled.</p>
             * <ul>
             * <li><code>open</code>: <code>HTTP/2</code> is enabled.</li>
             * <li><code>close</code>: <code>HTTP/2</code> is disabled.</li>
             * <li><code>globalConfig</code>: Global configurations are used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>close</p>
             */
            public Builder http2(String http2) {
                this.http2 = http2;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>Istio</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS is forcibly used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mustHttps(Boolean mustHttps) {
                this.mustHttps = mustHttps;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The protocol of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The name of the extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The maximum version of Transport Layer Security (TLS).</p>
             * 
             * <strong>example:</strong>
             * <p>TLS 1.3</p>
             */
            public Builder tlsMax(String tlsMax) {
                this.tlsMax = tlsMax;
                return this;
            }

            /**
             * <p>The minimum version of TLS.</p>
             * 
             * <strong>example:</strong>
             * <p>TLS 1.0</p>
             */
            public Builder tlsMin(String tlsMin) {
                this.tlsMin = tlsMin;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
