// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayDomainDetailResponseBody</p>
 */
public class GetGatewayDomainDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The status code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayDomainDetailResponseBody build() {
            return new GetGatewayDomainDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AfterDate")
        private Long afterDate;

        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("BeforeDate")
        private Long beforeDate;

        @NameInMap("CertIdentifier")
        private String certIdentifier;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtAfter")
        private String gmtAfter;

        @NameInMap("GmtBefore")
        private String gmtBefore;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Http2")
        private String http2;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("MustHttps")
        private Boolean mustHttps;

        @NameInMap("Name")
        private String name;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Sans")
        private String sans;

        @NameInMap("TlsMax")
        private String tlsMax;

        @NameInMap("TlsMin")
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
             * The start time.
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * The algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * The ID of the certificate.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The public domain name.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The ID of the gateway.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The start time.
             */
            public Builder gmtAfter(String gmtAfter) {
                this.gmtAfter = gmtAfter;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder gmtBefore(String gmtBefore) {
                this.gmtBefore = gmtBefore;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The update time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether `HTTP/2` is enabled.
             * <p>
             * 
             * *   `open`: `HTTP/2` is enabled.
             * *   `close`: `HTTP/2` is disabled.
             * *   `globalConfig`: Global configurations are used.
             */
            public Builder http2(String http2) {
                this.http2 = http2;
                return this;
            }

            /**
             * ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * Indicates whether HTTPS is forcibly used.
             */
            public Builder mustHttps(Boolean mustHttps) {
                this.mustHttps = mustHttps;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The protocol of the gateway.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The name of the extended field.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * The maximum version of Transport Layer Security (TLS).
             */
            public Builder tlsMax(String tlsMax) {
                this.tlsMax = tlsMax;
                return this;
            }

            /**
             * The minimum version of TLS.
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
