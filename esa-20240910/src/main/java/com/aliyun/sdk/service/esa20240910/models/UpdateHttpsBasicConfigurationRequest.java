// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateHttpsBasicConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateHttpsBasicConfigurationRequest</p>
 */
public class UpdateHttpsBasicConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ciphersuite")
    private String ciphersuite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphersuiteGroup")
    private String ciphersuiteGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Http2")
    private String http2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Http3")
    private String http3;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Https")
    private String https;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OcspStapling")
    private String ocspStapling;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tls10")
    private String tls10;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tls11")
    private String tls11;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tls12")
    private String tls12;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tls13")
    private String tls13;

    private UpdateHttpsBasicConfigurationRequest(Builder builder) {
        super(builder);
        this.ciphersuite = builder.ciphersuite;
        this.ciphersuiteGroup = builder.ciphersuiteGroup;
        this.configId = builder.configId;
        this.http2 = builder.http2;
        this.http3 = builder.http3;
        this.https = builder.https;
        this.ocspStapling = builder.ocspStapling;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.tls10 = builder.tls10;
        this.tls11 = builder.tls11;
        this.tls12 = builder.tls12;
        this.tls13 = builder.tls13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpsBasicConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphersuite
     */
    public String getCiphersuite() {
        return this.ciphersuite;
    }

    /**
     * @return ciphersuiteGroup
     */
    public String getCiphersuiteGroup() {
        return this.ciphersuiteGroup;
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return http2
     */
    public String getHttp2() {
        return this.http2;
    }

    /**
     * @return http3
     */
    public String getHttp3() {
        return this.http3;
    }

    /**
     * @return https
     */
    public String getHttps() {
        return this.https;
    }

    /**
     * @return ocspStapling
     */
    public String getOcspStapling() {
        return this.ocspStapling;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return ruleEnable
     */
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return tls10
     */
    public String getTls10() {
        return this.tls10;
    }

    /**
     * @return tls11
     */
    public String getTls11() {
        return this.tls11;
    }

    /**
     * @return tls12
     */
    public String getTls12() {
        return this.tls12;
    }

    /**
     * @return tls13
     */
    public String getTls13() {
        return this.tls13;
    }

    public static final class Builder extends Request.Builder<UpdateHttpsBasicConfigurationRequest, Builder> {
        private String ciphersuite; 
        private String ciphersuiteGroup; 
        private Long configId; 
        private String http2; 
        private String http3; 
        private String https; 
        private String ocspStapling; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private String tls10; 
        private String tls11; 
        private String tls12; 
        private String tls13; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHttpsBasicConfigurationRequest request) {
            super(request);
            this.ciphersuite = request.ciphersuite;
            this.ciphersuiteGroup = request.ciphersuiteGroup;
            this.configId = request.configId;
            this.http2 = request.http2;
            this.http3 = request.http3;
            this.https = request.https;
            this.ocspStapling = request.ocspStapling;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.tls10 = request.tls10;
            this.tls11 = request.tls11;
            this.tls12 = request.tls12;
            this.tls13 = request.tls13;
        } 

        /**
         * <p>Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256</p>
         */
        public Builder ciphersuite(String ciphersuite) {
            this.putQueryParameter("Ciphersuite", ciphersuite);
            this.ciphersuite = ciphersuite;
            return this;
        }

        /**
         * <p>Cipher suite group. Default is all cipher suites. Value range:</p>
         * <ul>
         * <li>all: All cipher suites.</li>
         * <li>strict: Strong cipher suites.</li>
         * <li>custom: Custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder ciphersuiteGroup(String ciphersuiteGroup) {
            this.putQueryParameter("CiphersuiteGroup", ciphersuiteGroup);
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }

        /**
         * <p>Configuration ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3528160969****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>Whether to enable HTTP2. Default is enabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder http2(String http2) {
            this.putQueryParameter("Http2", http2);
            this.http2 = http2;
            return this;
        }

        /**
         * <p>Whether to enable HTTP3. Default is enabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder http3(String http3) {
            this.putQueryParameter("Http3", http3);
            this.http3 = http3;
            return this;
        }

        /**
         * <p>Whether to enable HTTPS. Default is enabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder https(String https) {
            this.putQueryParameter("Https", https);
            this.https = https;
            return this;
        }

        /**
         * <p>Whether to enable OCSP. Default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ocspStapling(String ocspStapling) {
            this.putQueryParameter("OcspStapling", ocspStapling);
            this.ocspStapling = ocspStapling;
            return this;
        }

        /**
         * <p>Rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Rule switch. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1231231221****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Whether to enable TLS1.0. Default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder tls10(String tls10) {
            this.putQueryParameter("Tls10", tls10);
            this.tls10 = tls10;
            return this;
        }

        /**
         * <p>Whether to enable TLS1.1. Default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder tls11(String tls11) {
            this.putQueryParameter("Tls11", tls11);
            this.tls11 = tls11;
            return this;
        }

        /**
         * <p>Whether to enable TLS1.2. Default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder tls12(String tls12) {
            this.putQueryParameter("Tls12", tls12);
            this.tls12 = tls12;
            return this;
        }

        /**
         * <p>Whether to enable TLS1.3. Default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder tls13(String tls13) {
            this.putQueryParameter("Tls13", tls13);
            this.tls13 = tls13;
            return this;
        }

        @Override
        public UpdateHttpsBasicConfigurationRequest build() {
            return new UpdateHttpsBasicConfigurationRequest(this);
        } 

    } 

}
