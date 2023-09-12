// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTotalStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTotalStatisticsResponseBody</p>
 */
public class DescribeTotalStatisticsResponseBody extends TeaModel {
    @NameInMap("Account")
    private Integer account;

    @NameInMap("Health")
    private Integer health;

    @NameInMap("HealthTotal")
    private Integer healthTotal;

    @NameInMap("HealthdealedTotal")
    private Integer healthdealedTotal;

    @NameInMap("HealthhighTotal")
    private Integer healthhighTotal;

    @NameInMap("HealthlowTotal")
    private Integer healthlowTotal;

    @NameInMap("HealthmediumTotal")
    private Integer healthmediumTotal;

    @NameInMap("HealthseriousTotal")
    private Integer healthseriousTotal;

    @NameInMap("Newsuspicious")
    private Integer newsuspicious;

    @NameInMap("Online")
    private Boolean online;

    @NameInMap("Patch")
    private Integer patch;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Suspicious")
    private Integer suspicious;

    @NameInMap("SuspiciousTotal")
    private Integer suspiciousTotal;

    @NameInMap("SuspiciousdealedTotal")
    private Integer suspiciousdealedTotal;

    @NameInMap("SuspicioushighTotal")
    private Integer suspicioushighTotal;

    @NameInMap("SuspiciouslowTotal")
    private Integer suspiciouslowTotal;

    @NameInMap("SuspiciousmediumTotal")
    private Integer suspiciousmediumTotal;

    @NameInMap("SuspiciousseriousTotal")
    private Integer suspiciousseriousTotal;

    @NameInMap("Trojan")
    private Integer trojan;

    @NameInMap("Vul")
    private Integer vul;

    @NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @NameInMap("VulDealedTotal")
    private Integer vulDealedTotal;

    @NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @NameInMap("VulNntfSum")
    private Integer vulNntfSum;

    @NameInMap("VulTotal")
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
         * The number of logons to the asset.
         */
        public Builder account(Integer account) {
            this.account = account;
            return this;
        }

        /**
         * The total number of unfixed baseline risks.
         */
        public Builder health(Integer health) {
            this.health = health;
            return this;
        }

        /**
         * The total number of baseline risks.
         */
        public Builder healthTotal(Integer healthTotal) {
            this.healthTotal = healthTotal;
            return this;
        }

        /**
         * The total number of fixed baseline risk items. This parameter is deprecated.
         */
        public Builder healthdealedTotal(Integer healthdealedTotal) {
            this.healthdealedTotal = healthdealedTotal;
            return this;
        }

        /**
         * The number of baseline risk items whose severity is high.
         */
        public Builder healthhighTotal(Integer healthhighTotal) {
            this.healthhighTotal = healthhighTotal;
            return this;
        }

        /**
         * The number of baseline risk items whose severity is low.
         */
        public Builder healthlowTotal(Integer healthlowTotal) {
            this.healthlowTotal = healthlowTotal;
            return this;
        }

        /**
         * The number of baseline risk items whose severity is medium.
         */
        public Builder healthmediumTotal(Integer healthmediumTotal) {
            this.healthmediumTotal = healthmediumTotal;
            return this;
        }

        /**
         * The number of baseline risk items whose severity is urgent. This parameter is deprecated.
         */
        public Builder healthseriousTotal(Integer healthseriousTotal) {
            this.healthseriousTotal = healthseriousTotal;
            return this;
        }

        /**
         * The number of alerts that are generated by Server Guard or Security Center.
         * <p>
         * 
         * > 
         * 
         * > *   If you set the **Type** parameter to **sas**, this parameter indicates the number of alerts that are generated by Security Center.
         * 
         * > *   If you set the **Type** parameter to **aqs**, this parameter indicates the number of alerts that are generated by Server Guard.
         */
        public Builder newsuspicious(Integer newsuspicious) {
            this.newsuspicious = newsuspicious;
            return this;
        }

        /**
         * Indicates whether the agent is online. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder online(Boolean online) {
            this.online = online;
            return this;
        }

        /**
         * The number of Web-CMS vulnerabilities.
         */
        public Builder patch(Integer patch) {
            this.patch = patch;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of alerts that are generated by Server Guard.
         */
        public Builder suspicious(Integer suspicious) {
            this.suspicious = suspicious;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder suspiciousTotal(Integer suspiciousTotal) {
            this.suspiciousTotal = suspiciousTotal;
            return this;
        }

        /**
         * The number of handled alerts.
         */
        public Builder suspiciousdealedTotal(Integer suspiciousdealedTotal) {
            this.suspiciousdealedTotal = suspiciousdealedTotal;
            return this;
        }

        /**
         * This parameter is deprecated. This parameter is deprecated.
         */
        public Builder suspicioushighTotal(Integer suspicioushighTotal) {
            this.suspicioushighTotal = suspicioushighTotal;
            return this;
        }

        /**
         * The number of alerts whose risk level is reminder.
         */
        public Builder suspiciouslowTotal(Integer suspiciouslowTotal) {
            this.suspiciouslowTotal = suspiciouslowTotal;
            return this;
        }

        /**
         * The number of alerts whose risk level is suspicious.
         */
        public Builder suspiciousmediumTotal(Integer suspiciousmediumTotal) {
            this.suspiciousmediumTotal = suspiciousmediumTotal;
            return this;
        }

        /**
         * The number of alerts whose risk level is urgent.
         */
        public Builder suspiciousseriousTotal(Integer suspiciousseriousTotal) {
            this.suspiciousseriousTotal = suspiciousseriousTotal;
            return this;
        }

        /**
         * The number of webshell alerts.
         */
        public Builder trojan(Integer trojan) {
            this.trojan = trojan;
            return this;
        }

        /**
         * The number of unfixed vulnerabilities.
         */
        public Builder vul(Integer vul) {
            this.vul = vul;
            return this;
        }

        /**
         * The number of vulnerabilities whose severity level is high.
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * The total number of fixed vulnerabilities.
         */
        public Builder vulDealedTotal(Integer vulDealedTotal) {
            this.vulDealedTotal = vulDealedTotal;
            return this;
        }

        /**
         * The number of vulnerabilities whose severity level is medium.
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * The number of unfixed vulnerabilities whose severity level is low.
         */
        public Builder vulNntfSum(Integer vulNntfSum) {
            this.vulNntfSum = vulNntfSum;
            return this;
        }

        /**
         * The total number of vulnerabilities.
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
