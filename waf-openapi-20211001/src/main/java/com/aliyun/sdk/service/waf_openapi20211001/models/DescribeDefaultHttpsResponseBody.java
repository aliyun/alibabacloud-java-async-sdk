// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDefaultHttpsResponseBody model) {
            this.defaultHttps = model.defaultHttps;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The default SSL/TLS settings.</p>
         */
        public Builder defaultHttps(DefaultHttps defaultHttps) {
            this.defaultHttps = defaultHttps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefaultHttpsResponseBody build() {
            return new DescribeDefaultHttpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefaultHttpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefaultHttpsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DefaultHttps model) {
                this.certId = model.certId;
                this.cipherSuite = model.cipherSuite;
                this.customCiphers = model.customCiphers;
                this.enableTLSv3 = model.enableTLSv3;
                this.TLSVersion = model.TLSVersion;
            } 

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The type of the cipher suite. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: All cipher suites are added.</p>
             * </li>
             * <li><p><strong>2</strong>: Strong cipher suites are added. This value is available only when TLSVersion is set to tlsv1.2.</p>
             * </li>
             * <li><p><strong>99</strong>: Custom cipher suites are added. This value is available only when TLSVersion is not set to tlsv1.3.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cipherSuite(String cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * <p>The custom cipher suites.</p>
             * 
             * <strong>example:</strong>
             * <p>ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384</p>
             */
            public Builder customCiphers(String customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
             * </li>
             * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when HttpsPorts is not empty, which indicates that the domain name uses the HTTPS protocol. When TLSVersion is set to tlsv1.3, this value must be true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * <p>The TLS version. Valid values:</p>
             * <ul>
             * <li><p><strong>tlsv1</strong>: TLS 1.0 and later are supported. This value provides the highest compatibility and the lowest security.</p>
             * </li>
             * <li><p><strong>tlsv1.1</strong>: TLS 1.1 and later are supported. This value provides good compatibility and security.</p>
             * </li>
             * <li><p><strong>tlsv1.2</strong>: TLS 1.2 and later are supported. This value provides good compatibility and the highest security.</p>
             * </li>
             * <li><p><strong>tlsv1.3</strong>: Only TLS 1.3 is supported. This value provides the highest security and the lowest compatibility.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tlsv1</p>
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
