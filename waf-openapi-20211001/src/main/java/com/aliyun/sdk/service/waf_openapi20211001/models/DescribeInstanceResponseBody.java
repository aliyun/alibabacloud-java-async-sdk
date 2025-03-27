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
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Details")
    private Details details;

    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("InDebt")
    private String inDebt;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeInstanceResponseBody(Builder builder) {
        this.details = builder.details;
        this.edition = builder.edition;
        this.endTime = builder.endTime;
        this.inDebt = builder.inDebt;
        this.instanceId = builder.instanceId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return details
     */
    public Details getDetails() {
        return this.details;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return inDebt
     */
    public String getInDebt() {
        return this.inDebt;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Details details; 
        private String edition; 
        private Long endTime; 
        private String inDebt; 
        private String instanceId; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private Long startTime; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(DescribeInstanceResponseBody model) {
            this.details = model.details;
            this.edition = model.edition;
            this.endTime = model.endTime;
            this.inDebt = model.inDebt;
            this.instanceId = model.instanceId;
            this.payType = model.payType;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The details of the WAF instance.</p>
         */
        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        /**
         * <p>The edition of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>default_version</p>
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>The expiration time of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4809859200000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Indicates whether the WAF instance has overdue payments. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The WAF instance does not have overdue payments.</li>
         * <li><strong>1</strong>: The WAF instance has overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder inDebt(String inDebt) {
            this.inDebt = inDebt;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The billing method of the WAF instance. Valid values:</p>
         * <ul>
         * <li><strong>POSTPAY:</strong> The WAF instance uses the pay-as-you-go billing method.</li>
         * <li><strong>PREPAY:</strong> The WAF instance uses the subscription billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou:</strong> the Chinese mainland</li>
         * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The purchase time of the WAF instance. The time is in the UNIX timestamp format. The time is displayed in UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1668496310000</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the WAF instance. Valid values:</p>
         * <ul>
         * <li><strong>1:</strong> The WAF instance is in a normal state.</li>
         * <li><strong>2:</strong> The WAF instance has expired.</li>
         * <li><strong>3:</strong> The WAF instance has been released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclRuleMaxIpCount")
        private Long aclRuleMaxIpCount;

        @com.aliyun.core.annotation.NameInMap("AntiScan")
        private Boolean antiScan;

        @com.aliyun.core.annotation.NameInMap("AntiScanTemplateMaxCount")
        private Long antiScanTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("BackendMaxCount")
        private Long backendMaxCount;

        @com.aliyun.core.annotation.NameInMap("BaseWafGroup")
        private Boolean baseWafGroup;

        @com.aliyun.core.annotation.NameInMap("BaseWafGroupRuleInTemplateMaxCount")
        private Long baseWafGroupRuleInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("BaseWafGroupRuleTemplateMaxCount")
        private Long baseWafGroupRuleTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("Bot")
        private Boolean bot;

        @com.aliyun.core.annotation.NameInMap("BotApp")
        private String botApp;

        @com.aliyun.core.annotation.NameInMap("BotTemplateMaxCount")
        private Long botTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("BotWeb")
        private String botWeb;

        @com.aliyun.core.annotation.NameInMap("CnameResourceMaxCount")
        private Long cnameResourceMaxCount;

        @com.aliyun.core.annotation.NameInMap("CustomResponse")
        private Boolean customResponse;

        @com.aliyun.core.annotation.NameInMap("CustomResponseRuleInTemplateMaxCount")
        private Long customResponseRuleInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("CustomResponseTemplateMaxCount")
        private Long customResponseTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("CustomRule")
        private Boolean customRule;

        @com.aliyun.core.annotation.NameInMap("CustomRuleAction")
        private String customRuleAction;

        @com.aliyun.core.annotation.NameInMap("CustomRuleCondition")
        private String customRuleCondition;

        @com.aliyun.core.annotation.NameInMap("CustomRuleInTemplateMaxCount")
        private Long customRuleInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("CustomRuleRatelimitor")
        private String customRuleRatelimitor;

        @com.aliyun.core.annotation.NameInMap("CustomRuleTemplateMaxCount")
        private Long customRuleTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("DefenseGroupMaxCount")
        private Long defenseGroupMaxCount;

        @com.aliyun.core.annotation.NameInMap("DefenseObjectInGroupMaxCount")
        private Long defenseObjectInGroupMaxCount;

        @com.aliyun.core.annotation.NameInMap("DefenseObjectInTemplateMaxCount")
        private Long defenseObjectInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("DefenseObjectMaxCount")
        private Long defenseObjectMaxCount;

        @com.aliyun.core.annotation.NameInMap("Dlp")
        private Boolean dlp;

        @com.aliyun.core.annotation.NameInMap("DlpRuleInTemplateMaxCount")
        private Long dlpRuleInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("DlpTemplateMaxCount")
        private Long dlpTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("ExclusiveIp")
        private Boolean exclusiveIp;

        @com.aliyun.core.annotation.NameInMap("Gslb")
        private Boolean gslb;

        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private String httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private String httpsPorts;

        @com.aliyun.core.annotation.NameInMap("IpBlacklist")
        private Boolean ipBlacklist;

        @com.aliyun.core.annotation.NameInMap("IpBlacklistIpInRuleMaxCount")
        private Long ipBlacklistIpInRuleMaxCount;

        @com.aliyun.core.annotation.NameInMap("IpBlacklistRuleInTemplateMaxCount")
        private Long ipBlacklistRuleInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("IpBlacklistTemplateMaxCount")
        private Long ipBlacklistTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("Ipv6")
        private Boolean ipv6;

        @com.aliyun.core.annotation.NameInMap("LogService")
        private Boolean logService;

        @com.aliyun.core.annotation.NameInMap("MajorProtection")
        private Boolean majorProtection;

        @com.aliyun.core.annotation.NameInMap("MajorProtectionTemplateMaxCount")
        private Long majorProtectionTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("Tamperproof")
        private Boolean tamperproof;

        @com.aliyun.core.annotation.NameInMap("TamperproofRuleInTemplateMaxCount")
        private Long tamperproofRuleInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("TamperproofTemplateMaxCount")
        private Long tamperproofTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("VastIpBlacklistInFileMaxCount")
        private Long vastIpBlacklistInFileMaxCount;

        @com.aliyun.core.annotation.NameInMap("VastIpBlacklistInOperationMaxCount")
        private Long vastIpBlacklistInOperationMaxCount;

        @com.aliyun.core.annotation.NameInMap("VastIpBlacklistMaxCount")
        private Long vastIpBlacklistMaxCount;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private Boolean whitelist;

        @com.aliyun.core.annotation.NameInMap("WhitelistLogical")
        private String whitelistLogical;

        @com.aliyun.core.annotation.NameInMap("WhitelistRuleCondition")
        private String whitelistRuleCondition;

        @com.aliyun.core.annotation.NameInMap("WhitelistRuleInTemplateMaxCount")
        private Long whitelistRuleInTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("WhitelistTemplateMaxCount")
        private Long whitelistTemplateMaxCount;

        private Details(Builder builder) {
            this.aclRuleMaxIpCount = builder.aclRuleMaxIpCount;
            this.antiScan = builder.antiScan;
            this.antiScanTemplateMaxCount = builder.antiScanTemplateMaxCount;
            this.backendMaxCount = builder.backendMaxCount;
            this.baseWafGroup = builder.baseWafGroup;
            this.baseWafGroupRuleInTemplateMaxCount = builder.baseWafGroupRuleInTemplateMaxCount;
            this.baseWafGroupRuleTemplateMaxCount = builder.baseWafGroupRuleTemplateMaxCount;
            this.bot = builder.bot;
            this.botApp = builder.botApp;
            this.botTemplateMaxCount = builder.botTemplateMaxCount;
            this.botWeb = builder.botWeb;
            this.cnameResourceMaxCount = builder.cnameResourceMaxCount;
            this.customResponse = builder.customResponse;
            this.customResponseRuleInTemplateMaxCount = builder.customResponseRuleInTemplateMaxCount;
            this.customResponseTemplateMaxCount = builder.customResponseTemplateMaxCount;
            this.customRule = builder.customRule;
            this.customRuleAction = builder.customRuleAction;
            this.customRuleCondition = builder.customRuleCondition;
            this.customRuleInTemplateMaxCount = builder.customRuleInTemplateMaxCount;
            this.customRuleRatelimitor = builder.customRuleRatelimitor;
            this.customRuleTemplateMaxCount = builder.customRuleTemplateMaxCount;
            this.defenseGroupMaxCount = builder.defenseGroupMaxCount;
            this.defenseObjectInGroupMaxCount = builder.defenseObjectInGroupMaxCount;
            this.defenseObjectInTemplateMaxCount = builder.defenseObjectInTemplateMaxCount;
            this.defenseObjectMaxCount = builder.defenseObjectMaxCount;
            this.dlp = builder.dlp;
            this.dlpRuleInTemplateMaxCount = builder.dlpRuleInTemplateMaxCount;
            this.dlpTemplateMaxCount = builder.dlpTemplateMaxCount;
            this.exclusiveIp = builder.exclusiveIp;
            this.gslb = builder.gslb;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.ipBlacklist = builder.ipBlacklist;
            this.ipBlacklistIpInRuleMaxCount = builder.ipBlacklistIpInRuleMaxCount;
            this.ipBlacklistRuleInTemplateMaxCount = builder.ipBlacklistRuleInTemplateMaxCount;
            this.ipBlacklistTemplateMaxCount = builder.ipBlacklistTemplateMaxCount;
            this.ipv6 = builder.ipv6;
            this.logService = builder.logService;
            this.majorProtection = builder.majorProtection;
            this.majorProtectionTemplateMaxCount = builder.majorProtectionTemplateMaxCount;
            this.tamperproof = builder.tamperproof;
            this.tamperproofRuleInTemplateMaxCount = builder.tamperproofRuleInTemplateMaxCount;
            this.tamperproofTemplateMaxCount = builder.tamperproofTemplateMaxCount;
            this.vastIpBlacklistInFileMaxCount = builder.vastIpBlacklistInFileMaxCount;
            this.vastIpBlacklistInOperationMaxCount = builder.vastIpBlacklistInOperationMaxCount;
            this.vastIpBlacklistMaxCount = builder.vastIpBlacklistMaxCount;
            this.whitelist = builder.whitelist;
            this.whitelistLogical = builder.whitelistLogical;
            this.whitelistRuleCondition = builder.whitelistRuleCondition;
            this.whitelistRuleInTemplateMaxCount = builder.whitelistRuleInTemplateMaxCount;
            this.whitelistTemplateMaxCount = builder.whitelistTemplateMaxCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return aclRuleMaxIpCount
         */
        public Long getAclRuleMaxIpCount() {
            return this.aclRuleMaxIpCount;
        }

        /**
         * @return antiScan
         */
        public Boolean getAntiScan() {
            return this.antiScan;
        }

        /**
         * @return antiScanTemplateMaxCount
         */
        public Long getAntiScanTemplateMaxCount() {
            return this.antiScanTemplateMaxCount;
        }

        /**
         * @return backendMaxCount
         */
        public Long getBackendMaxCount() {
            return this.backendMaxCount;
        }

        /**
         * @return baseWafGroup
         */
        public Boolean getBaseWafGroup() {
            return this.baseWafGroup;
        }

        /**
         * @return baseWafGroupRuleInTemplateMaxCount
         */
        public Long getBaseWafGroupRuleInTemplateMaxCount() {
            return this.baseWafGroupRuleInTemplateMaxCount;
        }

        /**
         * @return baseWafGroupRuleTemplateMaxCount
         */
        public Long getBaseWafGroupRuleTemplateMaxCount() {
            return this.baseWafGroupRuleTemplateMaxCount;
        }

        /**
         * @return bot
         */
        public Boolean getBot() {
            return this.bot;
        }

        /**
         * @return botApp
         */
        public String getBotApp() {
            return this.botApp;
        }

        /**
         * @return botTemplateMaxCount
         */
        public Long getBotTemplateMaxCount() {
            return this.botTemplateMaxCount;
        }

        /**
         * @return botWeb
         */
        public String getBotWeb() {
            return this.botWeb;
        }

        /**
         * @return cnameResourceMaxCount
         */
        public Long getCnameResourceMaxCount() {
            return this.cnameResourceMaxCount;
        }

        /**
         * @return customResponse
         */
        public Boolean getCustomResponse() {
            return this.customResponse;
        }

        /**
         * @return customResponseRuleInTemplateMaxCount
         */
        public Long getCustomResponseRuleInTemplateMaxCount() {
            return this.customResponseRuleInTemplateMaxCount;
        }

        /**
         * @return customResponseTemplateMaxCount
         */
        public Long getCustomResponseTemplateMaxCount() {
            return this.customResponseTemplateMaxCount;
        }

        /**
         * @return customRule
         */
        public Boolean getCustomRule() {
            return this.customRule;
        }

        /**
         * @return customRuleAction
         */
        public String getCustomRuleAction() {
            return this.customRuleAction;
        }

        /**
         * @return customRuleCondition
         */
        public String getCustomRuleCondition() {
            return this.customRuleCondition;
        }

        /**
         * @return customRuleInTemplateMaxCount
         */
        public Long getCustomRuleInTemplateMaxCount() {
            return this.customRuleInTemplateMaxCount;
        }

        /**
         * @return customRuleRatelimitor
         */
        public String getCustomRuleRatelimitor() {
            return this.customRuleRatelimitor;
        }

        /**
         * @return customRuleTemplateMaxCount
         */
        public Long getCustomRuleTemplateMaxCount() {
            return this.customRuleTemplateMaxCount;
        }

        /**
         * @return defenseGroupMaxCount
         */
        public Long getDefenseGroupMaxCount() {
            return this.defenseGroupMaxCount;
        }

        /**
         * @return defenseObjectInGroupMaxCount
         */
        public Long getDefenseObjectInGroupMaxCount() {
            return this.defenseObjectInGroupMaxCount;
        }

        /**
         * @return defenseObjectInTemplateMaxCount
         */
        public Long getDefenseObjectInTemplateMaxCount() {
            return this.defenseObjectInTemplateMaxCount;
        }

        /**
         * @return defenseObjectMaxCount
         */
        public Long getDefenseObjectMaxCount() {
            return this.defenseObjectMaxCount;
        }

        /**
         * @return dlp
         */
        public Boolean getDlp() {
            return this.dlp;
        }

        /**
         * @return dlpRuleInTemplateMaxCount
         */
        public Long getDlpRuleInTemplateMaxCount() {
            return this.dlpRuleInTemplateMaxCount;
        }

        /**
         * @return dlpTemplateMaxCount
         */
        public Long getDlpTemplateMaxCount() {
            return this.dlpTemplateMaxCount;
        }

        /**
         * @return exclusiveIp
         */
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        /**
         * @return gslb
         */
        public Boolean getGslb() {
            return this.gslb;
        }

        /**
         * @return httpPorts
         */
        public String getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        /**
         * @return ipBlacklist
         */
        public Boolean getIpBlacklist() {
            return this.ipBlacklist;
        }

        /**
         * @return ipBlacklistIpInRuleMaxCount
         */
        public Long getIpBlacklistIpInRuleMaxCount() {
            return this.ipBlacklistIpInRuleMaxCount;
        }

        /**
         * @return ipBlacklistRuleInTemplateMaxCount
         */
        public Long getIpBlacklistRuleInTemplateMaxCount() {
            return this.ipBlacklistRuleInTemplateMaxCount;
        }

        /**
         * @return ipBlacklistTemplateMaxCount
         */
        public Long getIpBlacklistTemplateMaxCount() {
            return this.ipBlacklistTemplateMaxCount;
        }

        /**
         * @return ipv6
         */
        public Boolean getIpv6() {
            return this.ipv6;
        }

        /**
         * @return logService
         */
        public Boolean getLogService() {
            return this.logService;
        }

        /**
         * @return majorProtection
         */
        public Boolean getMajorProtection() {
            return this.majorProtection;
        }

        /**
         * @return majorProtectionTemplateMaxCount
         */
        public Long getMajorProtectionTemplateMaxCount() {
            return this.majorProtectionTemplateMaxCount;
        }

        /**
         * @return tamperproof
         */
        public Boolean getTamperproof() {
            return this.tamperproof;
        }

        /**
         * @return tamperproofRuleInTemplateMaxCount
         */
        public Long getTamperproofRuleInTemplateMaxCount() {
            return this.tamperproofRuleInTemplateMaxCount;
        }

        /**
         * @return tamperproofTemplateMaxCount
         */
        public Long getTamperproofTemplateMaxCount() {
            return this.tamperproofTemplateMaxCount;
        }

        /**
         * @return vastIpBlacklistInFileMaxCount
         */
        public Long getVastIpBlacklistInFileMaxCount() {
            return this.vastIpBlacklistInFileMaxCount;
        }

        /**
         * @return vastIpBlacklistInOperationMaxCount
         */
        public Long getVastIpBlacklistInOperationMaxCount() {
            return this.vastIpBlacklistInOperationMaxCount;
        }

        /**
         * @return vastIpBlacklistMaxCount
         */
        public Long getVastIpBlacklistMaxCount() {
            return this.vastIpBlacklistMaxCount;
        }

        /**
         * @return whitelist
         */
        public Boolean getWhitelist() {
            return this.whitelist;
        }

        /**
         * @return whitelistLogical
         */
        public String getWhitelistLogical() {
            return this.whitelistLogical;
        }

        /**
         * @return whitelistRuleCondition
         */
        public String getWhitelistRuleCondition() {
            return this.whitelistRuleCondition;
        }

        /**
         * @return whitelistRuleInTemplateMaxCount
         */
        public Long getWhitelistRuleInTemplateMaxCount() {
            return this.whitelistRuleInTemplateMaxCount;
        }

        /**
         * @return whitelistTemplateMaxCount
         */
        public Long getWhitelistTemplateMaxCount() {
            return this.whitelistTemplateMaxCount;
        }

        public static final class Builder {
            private Long aclRuleMaxIpCount; 
            private Boolean antiScan; 
            private Long antiScanTemplateMaxCount; 
            private Long backendMaxCount; 
            private Boolean baseWafGroup; 
            private Long baseWafGroupRuleInTemplateMaxCount; 
            private Long baseWafGroupRuleTemplateMaxCount; 
            private Boolean bot; 
            private String botApp; 
            private Long botTemplateMaxCount; 
            private String botWeb; 
            private Long cnameResourceMaxCount; 
            private Boolean customResponse; 
            private Long customResponseRuleInTemplateMaxCount; 
            private Long customResponseTemplateMaxCount; 
            private Boolean customRule; 
            private String customRuleAction; 
            private String customRuleCondition; 
            private Long customRuleInTemplateMaxCount; 
            private String customRuleRatelimitor; 
            private Long customRuleTemplateMaxCount; 
            private Long defenseGroupMaxCount; 
            private Long defenseObjectInGroupMaxCount; 
            private Long defenseObjectInTemplateMaxCount; 
            private Long defenseObjectMaxCount; 
            private Boolean dlp; 
            private Long dlpRuleInTemplateMaxCount; 
            private Long dlpTemplateMaxCount; 
            private Boolean exclusiveIp; 
            private Boolean gslb; 
            private String httpPorts; 
            private String httpsPorts; 
            private Boolean ipBlacklist; 
            private Long ipBlacklistIpInRuleMaxCount; 
            private Long ipBlacklistRuleInTemplateMaxCount; 
            private Long ipBlacklistTemplateMaxCount; 
            private Boolean ipv6; 
            private Boolean logService; 
            private Boolean majorProtection; 
            private Long majorProtectionTemplateMaxCount; 
            private Boolean tamperproof; 
            private Long tamperproofRuleInTemplateMaxCount; 
            private Long tamperproofTemplateMaxCount; 
            private Long vastIpBlacklistInFileMaxCount; 
            private Long vastIpBlacklistInOperationMaxCount; 
            private Long vastIpBlacklistMaxCount; 
            private Boolean whitelist; 
            private String whitelistLogical; 
            private String whitelistRuleCondition; 
            private Long whitelistRuleInTemplateMaxCount; 
            private Long whitelistTemplateMaxCount; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.aclRuleMaxIpCount = model.aclRuleMaxIpCount;
                this.antiScan = model.antiScan;
                this.antiScanTemplateMaxCount = model.antiScanTemplateMaxCount;
                this.backendMaxCount = model.backendMaxCount;
                this.baseWafGroup = model.baseWafGroup;
                this.baseWafGroupRuleInTemplateMaxCount = model.baseWafGroupRuleInTemplateMaxCount;
                this.baseWafGroupRuleTemplateMaxCount = model.baseWafGroupRuleTemplateMaxCount;
                this.bot = model.bot;
                this.botApp = model.botApp;
                this.botTemplateMaxCount = model.botTemplateMaxCount;
                this.botWeb = model.botWeb;
                this.cnameResourceMaxCount = model.cnameResourceMaxCount;
                this.customResponse = model.customResponse;
                this.customResponseRuleInTemplateMaxCount = model.customResponseRuleInTemplateMaxCount;
                this.customResponseTemplateMaxCount = model.customResponseTemplateMaxCount;
                this.customRule = model.customRule;
                this.customRuleAction = model.customRuleAction;
                this.customRuleCondition = model.customRuleCondition;
                this.customRuleInTemplateMaxCount = model.customRuleInTemplateMaxCount;
                this.customRuleRatelimitor = model.customRuleRatelimitor;
                this.customRuleTemplateMaxCount = model.customRuleTemplateMaxCount;
                this.defenseGroupMaxCount = model.defenseGroupMaxCount;
                this.defenseObjectInGroupMaxCount = model.defenseObjectInGroupMaxCount;
                this.defenseObjectInTemplateMaxCount = model.defenseObjectInTemplateMaxCount;
                this.defenseObjectMaxCount = model.defenseObjectMaxCount;
                this.dlp = model.dlp;
                this.dlpRuleInTemplateMaxCount = model.dlpRuleInTemplateMaxCount;
                this.dlpTemplateMaxCount = model.dlpTemplateMaxCount;
                this.exclusiveIp = model.exclusiveIp;
                this.gslb = model.gslb;
                this.httpPorts = model.httpPorts;
                this.httpsPorts = model.httpsPorts;
                this.ipBlacklist = model.ipBlacklist;
                this.ipBlacklistIpInRuleMaxCount = model.ipBlacklistIpInRuleMaxCount;
                this.ipBlacklistRuleInTemplateMaxCount = model.ipBlacklistRuleInTemplateMaxCount;
                this.ipBlacklistTemplateMaxCount = model.ipBlacklistTemplateMaxCount;
                this.ipv6 = model.ipv6;
                this.logService = model.logService;
                this.majorProtection = model.majorProtection;
                this.majorProtectionTemplateMaxCount = model.majorProtectionTemplateMaxCount;
                this.tamperproof = model.tamperproof;
                this.tamperproofRuleInTemplateMaxCount = model.tamperproofRuleInTemplateMaxCount;
                this.tamperproofTemplateMaxCount = model.tamperproofTemplateMaxCount;
                this.vastIpBlacklistInFileMaxCount = model.vastIpBlacklistInFileMaxCount;
                this.vastIpBlacklistInOperationMaxCount = model.vastIpBlacklistInOperationMaxCount;
                this.vastIpBlacklistMaxCount = model.vastIpBlacklistMaxCount;
                this.whitelist = model.whitelist;
                this.whitelistLogical = model.whitelistLogical;
                this.whitelistRuleCondition = model.whitelistRuleCondition;
                this.whitelistRuleInTemplateMaxCount = model.whitelistRuleInTemplateMaxCount;
                this.whitelistTemplateMaxCount = model.whitelistTemplateMaxCount;
            } 

            /**
             * <p>The maximum number of IP addresses that can be added to the match content of a match condition. For more information, see <a href="https://help.aliyun.com/document_detail/374354.html">Match conditions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder aclRuleMaxIpCount(Long aclRuleMaxIpCount) {
                this.aclRuleMaxIpCount = aclRuleMaxIpCount;
                return this;
            }

            /**
             * <p>Indicates whether the scan protection module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The scan protection module is supported.</li>
             * <li><strong>false:</strong> The scan protection module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder antiScan(Boolean antiScan) {
                this.antiScan = antiScan;
                return this;
            }

            /**
             * <p>The maximum number of scan protection rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder antiScanTemplateMaxCount(Long antiScanTemplateMaxCount) {
                this.antiScanTemplateMaxCount = antiScanTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of back-to-origin IP addresses that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder backendMaxCount(Long backendMaxCount) {
                this.backendMaxCount = backendMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether the basic protection rule module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The basic protection rule module is supported.</li>
             * <li><strong>false:</strong> The basic protection rule module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder baseWafGroup(Boolean baseWafGroup) {
                this.baseWafGroup = baseWafGroup;
                return this;
            }

            /**
             * <p>The maximum number of protection rules that can be included in a basic protection rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder baseWafGroupRuleInTemplateMaxCount(Long baseWafGroupRuleInTemplateMaxCount) {
                this.baseWafGroupRuleInTemplateMaxCount = baseWafGroupRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of basic protection rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder baseWafGroupRuleTemplateMaxCount(Long baseWafGroupRuleTemplateMaxCount) {
                this.baseWafGroupRuleTemplateMaxCount = baseWafGroupRuleTemplateMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether the bot management module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The bot management module is supported.</li>
             * <li><strong>false:</strong> The bot management module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bot(Boolean bot) {
                this.bot = bot;
                return this;
            }

            /**
             * <p>Indicates whether bot management for app protection is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> Bot management for app protection is supported.</li>
             * <li><strong>false:</strong> Bot management for app protection is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder botApp(String botApp) {
                this.botApp = botApp;
                return this;
            }

            /**
             * <p>The maximum number of bot management rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder botTemplateMaxCount(Long botTemplateMaxCount) {
                this.botTemplateMaxCount = botTemplateMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether bot management for website protection is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> Bot management for website protection is supported.</li>
             * <li><strong>false:</strong> Bot management for website protection is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder botWeb(String botWeb) {
                this.botWeb = botWeb;
                return this;
            }

            /**
             * <p>The maximum number of CNAMEs that can be added.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cnameResourceMaxCount(Long cnameResourceMaxCount) {
                this.cnameResourceMaxCount = cnameResourceMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether the custom response module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The custom response module is supported.</li>
             * <li><strong>false:</strong> The custom response module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder customResponse(Boolean customResponse) {
                this.customResponse = customResponse;
                return this;
            }

            /**
             * <p>The maximum number of rules that can be included in a custom response rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder customResponseRuleInTemplateMaxCount(Long customResponseRuleInTemplateMaxCount) {
                this.customResponseRuleInTemplateMaxCount = customResponseRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of custom response rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder customResponseTemplateMaxCount(Long customResponseTemplateMaxCount) {
                this.customResponseTemplateMaxCount = customResponseTemplateMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether the custom rule module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The custom rule module is supported.</li>
             * <li><strong>false:</strong> The custom rule module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder customRule(Boolean customRule) {
                this.customRule = customRule;
                return this;
            }

            /**
             * <p>The action that can be included in a custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder customRuleAction(String customRuleAction) {
                this.customRuleAction = customRuleAction;
                return this;
            }

            /**
             * <p>The match conditions that can be used in a custom rule. For more information, see <strong>Match condition parameters</strong> in the &quot;<strong>Parameters of custom rules (custom_acl)</strong>&quot; section in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder customRuleCondition(String customRuleCondition) {
                this.customRuleCondition = customRuleCondition;
                return this;
            }

            /**
             * <p>The maximum number of rules that can be included in a custom rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder customRuleInTemplateMaxCount(Long customRuleInTemplateMaxCount) {
                this.customRuleInTemplateMaxCount = customRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The statistical object for rate limiting in a custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>header</p>
             */
            public Builder customRuleRatelimitor(String customRuleRatelimitor) {
                this.customRuleRatelimitor = customRuleRatelimitor;
                return this;
            }

            /**
             * <p>The maximum number of custom rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder customRuleTemplateMaxCount(Long customRuleTemplateMaxCount) {
                this.customRuleTemplateMaxCount = customRuleTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protected object groups that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defenseGroupMaxCount(Long defenseGroupMaxCount) {
                this.defenseGroupMaxCount = defenseGroupMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protected objects that can be included in a protected object group.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defenseObjectInGroupMaxCount(Long defenseObjectInGroupMaxCount) {
                this.defenseObjectInGroupMaxCount = defenseObjectInGroupMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protected objects to which a protection rule template can be applied.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defenseObjectInTemplateMaxCount(Long defenseObjectInTemplateMaxCount) {
                this.defenseObjectInTemplateMaxCount = defenseObjectInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protected objects that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20,000</p>
             */
            public Builder defenseObjectMaxCount(Long defenseObjectMaxCount) {
                this.defenseObjectMaxCount = defenseObjectMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether the data leakage prevention module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The data leakage prevention module is supported.</li>
             * <li><strong>false:</strong> The data leakage prevention module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dlp(Boolean dlp) {
                this.dlp = dlp;
                return this;
            }

            /**
             * <p>The maximum number of rules that can be included in a data leakage prevention rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder dlpRuleInTemplateMaxCount(Long dlpRuleInTemplateMaxCount) {
                this.dlpRuleInTemplateMaxCount = dlpRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of data leakage prevention rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder dlpTemplateMaxCount(Long dlpTemplateMaxCount) {
                this.dlpTemplateMaxCount = dlpTemplateMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether exclusive IP addresses are supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> Exclusive IP addresses are supported.</li>
             * <li><strong>false:</strong> Exclusive IP addresses are not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * <p>Indicates whether global server load balancing (GSLB) is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> GSLB is supported.</li>
             * <li><strong>false:</strong> GSLB is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder gslb(Boolean gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * <p>The HTTP port range that is supported. For more information, see <a href="https://help.aliyun.com/document_detail/385578.html">View supported ports</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The HTTPS port range that is supported. For more information, see <a href="https://help.aliyun.com/document_detail/385578.html">View supported ports</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Indicates whether the IP address blacklist module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The IP address blacklist module is supported.</li>
             * <li><strong>false:</strong> The IP address blacklist module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ipBlacklist(Boolean ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            /**
             * <p>The maximum number of IP addresses that can be added to an IP address blacklist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder ipBlacklistIpInRuleMaxCount(Long ipBlacklistIpInRuleMaxCount) {
                this.ipBlacklistIpInRuleMaxCount = ipBlacklistIpInRuleMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of rules that can be included in an IP address blacklist rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ipBlacklistRuleInTemplateMaxCount(Long ipBlacklistRuleInTemplateMaxCount) {
                this.ipBlacklistRuleInTemplateMaxCount = ipBlacklistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of IP address blacklist rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ipBlacklistTemplateMaxCount(Long ipBlacklistTemplateMaxCount) {
                this.ipBlacklistTemplateMaxCount = ipBlacklistTemplateMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> IPv6 is supported.</li>
             * <li><strong>false:</strong> IPv6 is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ipv6(Boolean ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * <p>Indicates whether the log collection feature is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The log collection feature is supported.</li>
             * <li><strong>false:</strong> The log collection feature is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logService(Boolean logService) {
                this.logService = logService;
                return this;
            }

            /**
             * <p>Indicates whether major event protection is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> Major event protection is supported.</li>
             * <li><strong>false:</strong> Major event protection is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder majorProtection(Boolean majorProtection) {
                this.majorProtection = majorProtection;
                return this;
            }

            /**
             * <p>The maximum number of major event protection rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder majorProtectionTemplateMaxCount(Long majorProtectionTemplateMaxCount) {
                this.majorProtectionTemplateMaxCount = majorProtectionTemplateMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether the website tamper-proofing module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The website tamper-proofing module is supported.</li>
             * <li><strong>false:</strong> The website tamper-proofing module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tamperproof(Boolean tamperproof) {
                this.tamperproof = tamperproof;
                return this;
            }

            /**
             * <p>The maximum number of rules that can be included in a website tamper-proofing rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder tamperproofRuleInTemplateMaxCount(Long tamperproofRuleInTemplateMaxCount) {
                this.tamperproofRuleInTemplateMaxCount = tamperproofRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of website tamper-proofing rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder tamperproofTemplateMaxCount(Long tamperproofTemplateMaxCount) {
                this.tamperproofTemplateMaxCount = tamperproofTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist in a batch.</p>
             * 
             * <strong>example:</strong>
             * <p>2,000</p>
             */
            public Builder vastIpBlacklistInFileMaxCount(Long vastIpBlacklistInFileMaxCount) {
                this.vastIpBlacklistInFileMaxCount = vastIpBlacklistInFileMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist on a page.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder vastIpBlacklistInOperationMaxCount(Long vastIpBlacklistInOperationMaxCount) {
                this.vastIpBlacklistInOperationMaxCount = vastIpBlacklistInOperationMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist per Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>50,000</p>
             */
            public Builder vastIpBlacklistMaxCount(Long vastIpBlacklistMaxCount) {
                this.vastIpBlacklistMaxCount = vastIpBlacklistMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether the whitelist module is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The whitelist module is supported.</li>
             * <li><strong>false:</strong> The whitelist module is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder whitelist(Boolean whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * <p>The logical operators that can be used in a whitelist rule. For more information, see <strong>Match condition parameters</strong> in the &quot;<strong>Parameters of whitelist rules (whitelist)</strong>&quot; section in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>contain</p>
             */
            public Builder whitelistLogical(String whitelistLogical) {
                this.whitelistLogical = whitelistLogical;
                return this;
            }

            /**
             * <p>The match fields that can be used in a whitelist rule. For more information, see <strong>Match condition parameters</strong> in the &quot;<strong>Parameters of whitelist rules (whitelist)</strong>&quot; section in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder whitelistRuleCondition(String whitelistRuleCondition) {
                this.whitelistRuleCondition = whitelistRuleCondition;
                return this;
            }

            /**
             * <p>The maximum number of rules that can be included in a whitelist rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder whitelistRuleInTemplateMaxCount(Long whitelistRuleInTemplateMaxCount) {
                this.whitelistRuleInTemplateMaxCount = whitelistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of whitelist rule templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder whitelistTemplateMaxCount(Long whitelistTemplateMaxCount) {
                this.whitelistTemplateMaxCount = whitelistTemplateMaxCount;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
