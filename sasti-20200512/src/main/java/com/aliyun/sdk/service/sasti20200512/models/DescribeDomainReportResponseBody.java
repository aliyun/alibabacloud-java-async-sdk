// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainReportResponseBody</p>
 */
public class DescribeDomainReportResponseBody extends TeaModel {
    @NameInMap("AttackCntByThreatType")
    private String attackCntByThreatType;

    @NameInMap("AttackPreferenceTop5")
    private String attackPreferenceTop5;

    @NameInMap("Basic")
    private String basic;

    @NameInMap("Confidence")
    private String confidence;

    @NameInMap("Context")
    private String context;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("Group")
    private String group;

    @NameInMap("Intelligences")
    private String intelligences;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scenario")
    private String scenario;

    @NameInMap("SslCert")
    private String sslCert;

    @NameInMap("ThreatLevel")
    private String threatLevel;

    @NameInMap("ThreatTypes")
    private String threatTypes;

    @NameInMap("Whois")
    private String whois;

    private DescribeDomainReportResponseBody(Builder builder) {
        this.attackCntByThreatType = builder.attackCntByThreatType;
        this.attackPreferenceTop5 = builder.attackPreferenceTop5;
        this.basic = builder.basic;
        this.confidence = builder.confidence;
        this.context = builder.context;
        this.domain = builder.domain;
        this.group = builder.group;
        this.intelligences = builder.intelligences;
        this.requestId = builder.requestId;
        this.scenario = builder.scenario;
        this.sslCert = builder.sslCert;
        this.threatLevel = builder.threatLevel;
        this.threatTypes = builder.threatTypes;
        this.whois = builder.whois;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackCntByThreatType
     */
    public String getAttackCntByThreatType() {
        return this.attackCntByThreatType;
    }

    /**
     * @return attackPreferenceTop5
     */
    public String getAttackPreferenceTop5() {
        return this.attackPreferenceTop5;
    }

    /**
     * @return basic
     */
    public String getBasic() {
        return this.basic;
    }

    /**
     * @return confidence
     */
    public String getConfidence() {
        return this.confidence;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return intelligences
     */
    public String getIntelligences() {
        return this.intelligences;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return sslCert
     */
    public String getSslCert() {
        return this.sslCert;
    }

    /**
     * @return threatLevel
     */
    public String getThreatLevel() {
        return this.threatLevel;
    }

    /**
     * @return threatTypes
     */
    public String getThreatTypes() {
        return this.threatTypes;
    }

    /**
     * @return whois
     */
    public String getWhois() {
        return this.whois;
    }

    public static final class Builder {
        private String attackCntByThreatType; 
        private String attackPreferenceTop5; 
        private String basic; 
        private String confidence; 
        private String context; 
        private String domain; 
        private String group; 
        private String intelligences; 
        private String requestId; 
        private String scenario; 
        private String sslCert; 
        private String threatLevel; 
        private String threatTypes; 
        private String whois; 

        /**
         * AttackCntByThreatType.
         */
        public Builder attackCntByThreatType(String attackCntByThreatType) {
            this.attackCntByThreatType = attackCntByThreatType;
            return this;
        }

        /**
         * AttackPreferenceTop5.
         */
        public Builder attackPreferenceTop5(String attackPreferenceTop5) {
            this.attackPreferenceTop5 = attackPreferenceTop5;
            return this;
        }

        /**
         * Basic.
         */
        public Builder basic(String basic) {
            this.basic = basic;
            return this;
        }

        /**
         * Confidence.
         */
        public Builder confidence(String confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * Context.
         */
        public Builder context(String context) {
            this.context = context;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.group = group;
            return this;
        }

        /**
         * Intelligences.
         */
        public Builder intelligences(String intelligences) {
            this.intelligences = intelligences;
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
         * Scenario.
         */
        public Builder scenario(String scenario) {
            this.scenario = scenario;
            return this;
        }

        /**
         * SslCert.
         */
        public Builder sslCert(String sslCert) {
            this.sslCert = sslCert;
            return this;
        }

        /**
         * ThreatLevel.
         */
        public Builder threatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }

        /**
         * ThreatTypes.
         */
        public Builder threatTypes(String threatTypes) {
            this.threatTypes = threatTypes;
            return this;
        }

        /**
         * Whois.
         */
        public Builder whois(String whois) {
            this.whois = whois;
            return this;
        }

        public DescribeDomainReportResponseBody build() {
            return new DescribeDomainReportResponseBody(this);
        } 

    } 

}
