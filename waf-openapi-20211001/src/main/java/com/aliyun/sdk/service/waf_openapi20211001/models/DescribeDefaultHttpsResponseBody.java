// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefaultHttpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefaultHttpsResponseBody</p>
 */
public class DescribeDefaultHttpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultHttps")
    private DefaultHttps defaultHttps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDefaultHttpsResponseBody(Builder builder) {
        this.defaultHttps = builder.defaultHttps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultHttpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return defaultHttps
     */
    public DefaultHttps getDefaultHttps() {
        return this.defaultHttps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DefaultHttps defaultHttps; 
        private String requestId; 

        /**
         * DefaultHttps.
         */
        public Builder defaultHttps(DefaultHttps defaultHttps) {
            this.defaultHttps = defaultHttps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefaultHttpsResponseBody build() {
            return new DescribeDefaultHttpsResponseBody(this);
        } 

    } 

    public static class DefaultHttps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CipherSuite")
        private String cipherSuite;

        @com.aliyun.core.annotation.NameInMap("CustomCiphers")
        private String customCiphers;

        @com.aliyun.core.annotation.NameInMap("EnableTLSv3")
        private Boolean enableTLSv3;

        @com.aliyun.core.annotation.NameInMap("TLSVersion")
        private String TLSVersion;

        private DefaultHttps(Builder builder) {
            this.certId = builder.certId;
            this.cipherSuite = builder.cipherSuite;
            this.customCiphers = builder.customCiphers;
            this.enableTLSv3 = builder.enableTLSv3;
            this.TLSVersion = builder.TLSVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultHttps create() {
            return builder().build();
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return cipherSuite
         */
        public String getCipherSuite() {
            return this.cipherSuite;
        }

        /**
         * @return customCiphers
         */
        public String getCustomCiphers() {
            return this.customCiphers;
        }

        /**
         * @return enableTLSv3
         */
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        /**
         * @return TLSVersion
         */
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public static final class Builder {
            private String certId; 
            private String cipherSuite; 
            private String customCiphers; 
            private Boolean enableTLSv3; 
            private String TLSVersion; 

            /**
             * CertId.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * CipherSuite.
             */
            public Builder cipherSuite(String cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * CustomCiphers.
             */
            public Builder customCiphers(String customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * EnableTLSv3.
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * TLSVersion.
             */
            public Builder TLSVersion(String TLSVersion) {
                this.TLSVersion = TLSVersion;
                return this;
            }

            public DefaultHttps build() {
                return new DefaultHttps(this);
            } 

        } 

    }
}
