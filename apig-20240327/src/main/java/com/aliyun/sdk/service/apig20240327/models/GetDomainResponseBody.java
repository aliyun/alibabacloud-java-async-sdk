// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetDomainResponseBody</p>
 */
public class GetDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDomainResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDomainResponseBody build() {
            return new GetDomainResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("caCertIndentifier")
        private String caCertIndentifier;

        @com.aliyun.core.annotation.NameInMap("certIndentifier")
        private String certIndentifier;

        @com.aliyun.core.annotation.NameInMap("certName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("createFrom")
        private String createFrom;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("forceHttps")
        private Boolean forceHttps;

        @com.aliyun.core.annotation.NameInMap("http2Option")
        private String http2Option;

        @com.aliyun.core.annotation.NameInMap("issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("notAfterTimstamp")
        private Long notAfterTimstamp;

        @com.aliyun.core.annotation.NameInMap("notBeforeTimestamp")
        private Long notBeforeTimestamp;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("sans")
        private String sans;

        @com.aliyun.core.annotation.NameInMap("tlsMax")
        private String tlsMax;

        @com.aliyun.core.annotation.NameInMap("tlsMin")
        private String tlsMin;

        @com.aliyun.core.annotation.NameInMap("updatetimestamp")
        private Long updatetimestamp;

        private Data(Builder builder) {
            this.algorithm = builder.algorithm;
            this.caCertIndentifier = builder.caCertIndentifier;
            this.certIndentifier = builder.certIndentifier;
            this.certName = builder.certName;
            this.createFrom = builder.createFrom;
            this.createTimestamp = builder.createTimestamp;
            this._default = builder._default;
            this.domainId = builder.domainId;
            this.forceHttps = builder.forceHttps;
            this.http2Option = builder.http2Option;
            this.issuer = builder.issuer;
            this.name = builder.name;
            this.notAfterTimstamp = builder.notAfterTimstamp;
            this.notBeforeTimestamp = builder.notBeforeTimestamp;
            this.protocol = builder.protocol;
            this.sans = builder.sans;
            this.tlsMax = builder.tlsMax;
            this.tlsMin = builder.tlsMin;
            this.updatetimestamp = builder.updatetimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return caCertIndentifier
         */
        public String getCaCertIndentifier() {
            return this.caCertIndentifier;
        }

        /**
         * @return certIndentifier
         */
        public String getCertIndentifier() {
            return this.certIndentifier;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return createFrom
         */
        public String getCreateFrom() {
            return this.createFrom;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return forceHttps
         */
        public Boolean getForceHttps() {
            return this.forceHttps;
        }

        /**
         * @return http2Option
         */
        public String getHttp2Option() {
            return this.http2Option;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notAfterTimstamp
         */
        public Long getNotAfterTimstamp() {
            return this.notAfterTimstamp;
        }

        /**
         * @return notBeforeTimestamp
         */
        public Long getNotBeforeTimestamp() {
            return this.notBeforeTimestamp;
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

        /**
         * @return updatetimestamp
         */
        public Long getUpdatetimestamp() {
            return this.updatetimestamp;
        }

        public static final class Builder {
            private String algorithm; 
            private String caCertIndentifier; 
            private String certIndentifier; 
            private String certName; 
            private String createFrom; 
            private Long createTimestamp; 
            private Boolean _default; 
            private String domainId; 
            private Boolean forceHttps; 
            private String http2Option; 
            private String issuer; 
            private String name; 
            private Long notAfterTimstamp; 
            private Long notBeforeTimestamp; 
            private String protocol; 
            private String sans; 
            private String tlsMax; 
            private String tlsMin; 
            private Long updatetimestamp; 

            /**
             * algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * caCertIndentifier.
             */
            public Builder caCertIndentifier(String caCertIndentifier) {
                this.caCertIndentifier = caCertIndentifier;
                return this;
            }

            /**
             * certIndentifier.
             */
            public Builder certIndentifier(String certIndentifier) {
                this.certIndentifier = certIndentifier;
                return this;
            }

            /**
             * certName.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * createFrom.
             */
            public Builder createFrom(String createFrom) {
                this.createFrom = createFrom;
                return this;
            }

            /**
             * createTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * default.
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * forceHttps.
             */
            public Builder forceHttps(Boolean forceHttps) {
                this.forceHttps = forceHttps;
                return this;
            }

            /**
             * http2Option.
             */
            public Builder http2Option(String http2Option) {
                this.http2Option = http2Option;
                return this;
            }

            /**
             * issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * notAfterTimstamp.
             */
            public Builder notAfterTimstamp(Long notAfterTimstamp) {
                this.notAfterTimstamp = notAfterTimstamp;
                return this;
            }

            /**
             * notBeforeTimestamp.
             */
            public Builder notBeforeTimestamp(Long notBeforeTimestamp) {
                this.notBeforeTimestamp = notBeforeTimestamp;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * sans.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * tlsMax.
             */
            public Builder tlsMax(String tlsMax) {
                this.tlsMax = tlsMax;
                return this;
            }

            /**
             * tlsMin.
             */
            public Builder tlsMin(String tlsMin) {
                this.tlsMin = tlsMin;
                return this;
            }

            /**
             * updatetimestamp.
             */
            public Builder updatetimestamp(Long updatetimestamp) {
                this.updatetimestamp = updatetimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
