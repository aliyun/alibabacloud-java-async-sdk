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
 * {@link GetHttpsBasicConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetHttpsBasicConfigurationResponseBody</p>
 */
public class GetHttpsBasicConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ciphersuite")
    private String ciphersuite;

    @com.aliyun.core.annotation.NameInMap("CiphersuiteGroup")
    private String ciphersuiteGroup;

    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("Http2")
    private String http2;

    @com.aliyun.core.annotation.NameInMap("Http3")
    private String http3;

    @com.aliyun.core.annotation.NameInMap("Https")
    private String https;

    @com.aliyun.core.annotation.NameInMap("OcspStapling")
    private String ocspStapling;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.NameInMap("Tls10")
    private String tls10;

    @com.aliyun.core.annotation.NameInMap("Tls11")
    private String tls11;

    @com.aliyun.core.annotation.NameInMap("Tls12")
    private String tls12;

    @com.aliyun.core.annotation.NameInMap("Tls13")
    private String tls13;

    private GetHttpsBasicConfigurationResponseBody(Builder builder) {
        this.ciphersuite = builder.ciphersuite;
        this.ciphersuiteGroup = builder.ciphersuiteGroup;
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.http2 = builder.http2;
        this.http3 = builder.http3;
        this.https = builder.https;
        this.ocspStapling = builder.ocspStapling;
        this.requestId = builder.requestId;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.tls10 = builder.tls10;
        this.tls11 = builder.tls11;
        this.tls12 = builder.tls12;
        this.tls13 = builder.tls13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHttpsBasicConfigurationResponseBody create() {
        return builder().build();
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
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return sequence
     */
    public Integer getSequence() {
        return this.sequence;
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

    public static final class Builder {
        private String ciphersuite; 
        private String ciphersuiteGroup; 
        private Long configId; 
        private String configType; 
        private String http2; 
        private String http3; 
        private String https; 
        private String ocspStapling; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private String tls10; 
        private String tls11; 
        private String tls12; 
        private String tls13; 

        /**
         * Ciphersuite.
         */
        public Builder ciphersuite(String ciphersuite) {
            this.ciphersuite = ciphersuite;
            return this;
        }

        /**
         * CiphersuiteGroup.
         */
        public Builder ciphersuiteGroup(String ciphersuiteGroup) {
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * Http2.
         */
        public Builder http2(String http2) {
            this.http2 = http2;
            return this;
        }

        /**
         * Http3.
         */
        public Builder http3(String http3) {
            this.http3 = http3;
            return this;
        }

        /**
         * Https.
         */
        public Builder https(String https) {
            this.https = https;
            return this;
        }

        /**
         * OcspStapling.
         */
        public Builder ocspStapling(String ocspStapling) {
            this.ocspStapling = ocspStapling;
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
         * Rule.
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * Tls10.
         */
        public Builder tls10(String tls10) {
            this.tls10 = tls10;
            return this;
        }

        /**
         * Tls11.
         */
        public Builder tls11(String tls11) {
            this.tls11 = tls11;
            return this;
        }

        /**
         * Tls12.
         */
        public Builder tls12(String tls12) {
            this.tls12 = tls12;
            return this;
        }

        /**
         * Tls13.
         */
        public Builder tls13(String tls13) {
            this.tls13 = tls13;
            return this;
        }

        public GetHttpsBasicConfigurationResponseBody build() {
            return new GetHttpsBasicConfigurationResponseBody(this);
        } 

    } 

}
