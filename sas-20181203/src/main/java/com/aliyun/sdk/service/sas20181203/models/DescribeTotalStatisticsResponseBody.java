// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTotalStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTotalStatisticsResponseBody</p>
 */
public class DescribeTotalStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Account")
    private Integer account;

    @com.aliyun.core.annotation.NameInMap("Health")
    private Integer health;

    @com.aliyun.core.annotation.NameInMap("HealthTotal")
    private Integer healthTotal;

    @com.aliyun.core.annotation.NameInMap("HealthdealedTotal")
    private Integer healthdealedTotal;

    @com.aliyun.core.annotation.NameInMap("HealthhighTotal")
    private Integer healthhighTotal;

    @com.aliyun.core.annotation.NameInMap("HealthlowTotal")
    private Integer healthlowTotal;

    @com.aliyun.core.annotation.NameInMap("HealthmediumTotal")
    private Integer healthmediumTotal;

    @com.aliyun.core.annotation.NameInMap("HealthseriousTotal")
    private Integer healthseriousTotal;

    @com.aliyun.core.annotation.NameInMap("Newsuspicious")
    private Integer newsuspicious;

    @com.aliyun.core.annotation.NameInMap("Online")
    private Boolean online;

    @com.aliyun.core.annotation.NameInMap("Patch")
    private Integer patch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Suspicious")
    private Integer suspicious;

    @com.aliyun.core.annotation.NameInMap("SuspiciousTotal")
    private Integer suspiciousTotal;

    @com.aliyun.core.annotation.NameInMap("SuspiciousdealedTotal")
    private Integer suspiciousdealedTotal;

    @com.aliyun.core.annotation.NameInMap("SuspicioushighTotal")
    private Integer suspicioushighTotal;

    @com.aliyun.core.annotation.NameInMap("SuspiciouslowTotal")
    private Integer suspiciouslowTotal;

    @com.aliyun.core.annotation.NameInMap("SuspiciousmediumTotal")
    private Integer suspiciousmediumTotal;

    @com.aliyun.core.annotation.NameInMap("SuspiciousseriousTotal")
    private Integer suspiciousseriousTotal;

    @com.aliyun.core.annotation.NameInMap("Trojan")
    private Integer trojan;

    @com.aliyun.core.annotation.NameInMap("Vul")
    private Integer vul;

    @com.aliyun.core.annotation.NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @com.aliyun.core.annotation.NameInMap("VulDealedTotal")
    private Integer vulDealedTotal;

    @com.aliyun.core.annotation.NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @com.aliyun.core.annotation.NameInMap("VulNntfSum")
    private Integer vulNntfSum;

    @com.aliyun.core.annotation.NameInMap("VulTotal")
    private Integer vulTotal;

    private DescribeTotalStatisticsResponseBody(Builder builder) {
        this.account = builder.account;
        this.health = builder.health;
        this.healthTotal = builder.healthTotal;
        this.healthdealedTotal = builder.healthdealedTotal;
        this.healthhighTotal = builder.healthhighTotal;
        this.healthlowTotal = builder.healthlowTotal;
        this.healthmediumTotal = builder.healthmediumTotal;
        this.healthseriousTotal = builder.healthseriousTotal;
        this.newsuspicious = builder.newsuspicious;
        this.online = builder.online;
        this.patch = builder.patch;
        this.requestId = builder.requestId;
        this.suspicious = builder.suspicious;
        this.suspiciousTotal = builder.suspiciousTotal;
        this.suspiciousdealedTotal = builder.suspiciousdealedTotal;
        this.suspicioushighTotal = builder.suspicioushighTotal;
        this.suspiciouslowTotal = builder.suspiciouslowTotal;
        this.suspiciousmediumTotal = builder.suspiciousmediumTotal;
        this.suspiciousseriousTotal = builder.suspiciousseriousTotal;
        this.trojan = builder.trojan;
        this.vul = builder.vul;
        this.vulAsapSum = builder.vulAsapSum;
        this.vulDealedTotal = builder.vulDealedTotal;
        this.vulLaterSum = builder.vulLaterSum;
        this.vulNntfSum = builder.vulNntfSum;
        this.vulTotal = builder.vulTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTotalStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return account
     */
    public Integer getAccount() {
        return this.account;
    }

    /**
     * @return health
     */
    public Integer getHealth() {
        return this.health;
    }

    /**
     * @return healthTotal
     */
    public Integer getHealthTotal() {
        return this.healthTotal;
    }

    /**
     * @return healthdealedTotal
     */
    public Integer getHealthdealedTotal() {
        return this.healthdealedTotal;
    }

    /**
     * @return healthhighTotal
     */
    public Integer getHealthhighTotal() {
        return this.healthhighTotal;
    }

    /**
     * @return healthlowTotal
     */
    public Integer getHealthlowTotal() {
        return this.healthlowTotal;
    }

    /**
     * @return healthmediumTotal
     */
    public Integer getHealthmediumTotal() {
        return this.healthmediumTotal;
    }

    /**
     * @return healthseriousTotal
     */
    public Integer getHealthseriousTotal() {
        return this.healthseriousTotal;
    }

    /**
     * @return newsuspicious
     */
    public Integer getNewsuspicious() {
        return this.newsuspicious;
    }

    /**
     * @return online
     */
    public Boolean getOnline() {
        return this.online;
    }

    /**
     * @return patch
     */
    public Integer getPatch() {
        return this.patch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suspicious
     */
    public Integer getSuspicious() {
        return this.suspicious;
    }

    /**
     * @return suspiciousTotal
     */
    public Integer getSuspiciousTotal() {
        return this.suspiciousTotal;
    }

    /**
     * @return suspiciousdealedTotal
     */
    public Integer getSuspiciousdealedTotal() {
        return this.suspiciousdealedTotal;
    }

    /**
     * @return suspicioushighTotal
     */
    public Integer getSuspicioushighTotal() {
        return this.suspicioushighTotal;
    }

    /**
     * @return suspiciouslowTotal
     */
    public Integer getSuspiciouslowTotal() {
        return this.suspiciouslowTotal;
    }

    /**
     * @return suspiciousmediumTotal
     */
    public Integer getSuspiciousmediumTotal() {
        return this.suspiciousmediumTotal;
    }

    /**
     * @return suspiciousseriousTotal
     */
    public Integer getSuspiciousseriousTotal() {
        return this.suspiciousseriousTotal;
    }

    /**
     * @return trojan
     */
    public Integer getTrojan() {
        return this.trojan;
    }

    /**
     * @return vul
     */
    public Integer getVul() {
        return this.vul;
    }

    /**
     * @return vulAsapSum
     */
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    /**
     * @return vulDealedTotal
     */
    public Integer getVulDealedTotal() {
        return this.vulDealedTotal;
    }

    /**
     * @return vulLaterSum
     */
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    /**
     * @return vulNntfSum
     */
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

    /**
     * @return vulTotal
     */
    public Integer getVulTotal() {
        return this.vulTotal;
    }

    public static final class Builder {
        private Integer account; 
        private Integer health; 
        private Integer healthTotal; 
        private Integer healthdealedTotal; 
        private Integer healthhighTotal; 
        private Integer healthlowTotal; 
        private Integer healthmediumTotal; 
        private Integer healthseriousTotal; 
        private Integer newsuspicious; 
        private Boolean online; 
        private Integer patch; 
        private String requestId; 
        private Integer suspicious; 
        private Integer suspiciousTotal; 
        private Integer suspiciousdealedTotal; 
        private Integer suspicioushighTotal; 
        private Integer suspiciouslowTotal; 
        private Integer suspiciousmediumTotal; 
        private Integer suspiciousseriousTotal; 
        private Integer trojan; 
        private Integer vul; 
        private Integer vulAsapSum; 
        private Integer vulDealedTotal; 
        private Integer vulLaterSum; 
        private Integer vulNntfSum; 
        private Integer vulTotal; 

        /**
         * <p>The number of logons to the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder account(Integer account) {
            this.account = account;
            return this;
        }

        /**
         * <p>The total number of unfixed baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder health(Integer health) {
            this.health = health;
            return this;
        }

        /**
         * <p>The total number of baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder healthTotal(Integer healthTotal) {
            this.healthTotal = healthTotal;
            return this;
        }

        /**
         * <p>The total number of fixed baseline risk items. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder healthdealedTotal(Integer healthdealedTotal) {
            this.healthdealedTotal = healthdealedTotal;
            return this;
        }

        /**
         * <p>The number of baseline risk items whose severity is high.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder healthhighTotal(Integer healthhighTotal) {
            this.healthhighTotal = healthhighTotal;
            return this;
        }

        /**
         * <p>The number of baseline risk items whose severity is low.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder healthlowTotal(Integer healthlowTotal) {
            this.healthlowTotal = healthlowTotal;
            return this;
        }

        /**
         * <p>The number of baseline risk items whose severity is medium.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder healthmediumTotal(Integer healthmediumTotal) {
            this.healthmediumTotal = healthmediumTotal;
            return this;
        }

        /**
         * <p>The number of baseline risk items whose severity is urgent. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder healthseriousTotal(Integer healthseriousTotal) {
            this.healthseriousTotal = healthseriousTotal;
            return this;
        }

        /**
         * <p>The number of alerts that are generated by Server Guard or Security Center.</p>
         * <blockquote>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li>If you set the <strong>Type</strong> parameter to <strong>sas</strong>, this parameter indicates the number of alerts that are generated by Security Center.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li>If you set the <strong>Type</strong> parameter to <strong>aqs</strong>, this parameter indicates the number of alerts that are generated by Server Guard.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder newsuspicious(Integer newsuspicious) {
            this.newsuspicious = newsuspicious;
            return this;
        }

        /**
         * <p>Indicates whether the agent is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder online(Boolean online) {
            this.online = online;
            return this;
        }

        /**
         * <p>The number of Web-CMS vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder patch(Integer patch) {
            this.patch = patch;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of alerts that are generated by Server Guard.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suspicious(Integer suspicious) {
            this.suspicious = suspicious;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suspiciousTotal(Integer suspiciousTotal) {
            this.suspiciousTotal = suspiciousTotal;
            return this;
        }

        /**
         * <p>The number of handled alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suspiciousdealedTotal(Integer suspiciousdealedTotal) {
            this.suspiciousdealedTotal = suspiciousdealedTotal;
            return this;
        }

        /**
         * <p>This parameter is deprecated. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suspicioushighTotal(Integer suspicioushighTotal) {
            this.suspicioushighTotal = suspicioushighTotal;
            return this;
        }

        /**
         * <p>The number of alerts whose risk level is reminder.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suspiciouslowTotal(Integer suspiciouslowTotal) {
            this.suspiciouslowTotal = suspiciouslowTotal;
            return this;
        }

        /**
         * <p>The number of alerts whose risk level is suspicious.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder suspiciousmediumTotal(Integer suspiciousmediumTotal) {
            this.suspiciousmediumTotal = suspiciousmediumTotal;
            return this;
        }

        /**
         * <p>The number of alerts whose risk level is urgent.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suspiciousseriousTotal(Integer suspiciousseriousTotal) {
            this.suspiciousseriousTotal = suspiciousseriousTotal;
            return this;
        }

        /**
         * <p>The number of webshell alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder trojan(Integer trojan) {
            this.trojan = trojan;
            return this;
        }

        /**
         * <p>The number of unfixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vul(Integer vul) {
            this.vul = vul;
            return this;
        }

        /**
         * <p>The number of vulnerabilities whose severity level is high.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * <p>The total number of fixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vulDealedTotal(Integer vulDealedTotal) {
            this.vulDealedTotal = vulDealedTotal;
            return this;
        }

        /**
         * <p>The number of vulnerabilities whose severity level is medium.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * <p>The number of unfixed vulnerabilities whose severity level is low.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vulNntfSum(Integer vulNntfSum) {
            this.vulNntfSum = vulNntfSum;
            return this;
        }

        /**
         * <p>The total number of vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vulTotal(Integer vulTotal) {
            this.vulTotal = vulTotal;
            return this;
        }

        public DescribeTotalStatisticsResponseBody build() {
            return new DescribeTotalStatisticsResponseBody(this);
        } 

    } 

}
