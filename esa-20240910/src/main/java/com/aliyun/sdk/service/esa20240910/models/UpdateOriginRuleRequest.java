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
 * {@link UpdateOriginRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateOriginRuleRequest</p>
 */
public class UpdateOriginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsRecord")
    private String dnsRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginHost")
    private String originHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginHttpPort")
    private String originHttpPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginHttpsPort")
    private String originHttpsPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginScheme")
    private String originScheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginSni")
    private String originSni;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Range")
    private String range;

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

    private UpdateOriginRuleRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.dnsRecord = builder.dnsRecord;
        this.originHost = builder.originHost;
        this.originHttpPort = builder.originHttpPort;
        this.originHttpsPort = builder.originHttpsPort;
        this.originScheme = builder.originScheme;
        this.originSni = builder.originSni;
        this.range = builder.range;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOriginRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return dnsRecord
     */
    public String getDnsRecord() {
        return this.dnsRecord;
    }

    /**
     * @return originHost
     */
    public String getOriginHost() {
        return this.originHost;
    }

    /**
     * @return originHttpPort
     */
    public String getOriginHttpPort() {
        return this.originHttpPort;
    }

    /**
     * @return originHttpsPort
     */
    public String getOriginHttpsPort() {
        return this.originHttpsPort;
    }

    /**
     * @return originScheme
     */
    public String getOriginScheme() {
        return this.originScheme;
    }

    /**
     * @return originSni
     */
    public String getOriginSni() {
        return this.originSni;
    }

    /**
     * @return range
     */
    public String getRange() {
        return this.range;
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

    public static final class Builder extends Request.Builder<UpdateOriginRuleRequest, Builder> {
        private Long configId; 
        private String dnsRecord; 
        private String originHost; 
        private String originHttpPort; 
        private String originHttpsPort; 
        private String originScheme; 
        private String originSni; 
        private String range; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOriginRuleRequest request) {
            super(request);
            this.configId = request.configId;
            this.dnsRecord = request.dnsRecord;
            this.originHost = request.originHost;
            this.originHttpPort = request.originHttpPort;
            this.originHttpsPort = request.originHttpsPort;
            this.originScheme = request.originScheme;
            this.originSni = request.originSni;
            this.range = request.range;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * DnsRecord.
         */
        public Builder dnsRecord(String dnsRecord) {
            this.putQueryParameter("DnsRecord", dnsRecord);
            this.dnsRecord = dnsRecord;
            return this;
        }

        /**
         * OriginHost.
         */
        public Builder originHost(String originHost) {
            this.putQueryParameter("OriginHost", originHost);
            this.originHost = originHost;
            return this;
        }

        /**
         * OriginHttpPort.
         */
        public Builder originHttpPort(String originHttpPort) {
            this.putQueryParameter("OriginHttpPort", originHttpPort);
            this.originHttpPort = originHttpPort;
            return this;
        }

        /**
         * OriginHttpsPort.
         */
        public Builder originHttpsPort(String originHttpsPort) {
            this.putQueryParameter("OriginHttpsPort", originHttpsPort);
            this.originHttpsPort = originHttpsPort;
            return this;
        }

        /**
         * OriginScheme.
         */
        public Builder originScheme(String originScheme) {
            this.putQueryParameter("OriginScheme", originScheme);
            this.originScheme = originScheme;
            return this;
        }

        /**
         * OriginSni.
         */
        public Builder originSni(String originSni) {
            this.putQueryParameter("OriginSni", originSni);
            this.originSni = originSni;
            return this;
        }

        /**
         * Range.
         */
        public Builder range(String range) {
            this.putQueryParameter("Range", range);
            this.range = range;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5407498413****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateOriginRuleRequest build() {
            return new UpdateOriginRuleRequest(this);
        } 

    } 

}
