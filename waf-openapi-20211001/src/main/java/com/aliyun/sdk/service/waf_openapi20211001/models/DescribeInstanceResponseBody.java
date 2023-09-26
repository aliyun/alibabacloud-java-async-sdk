// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Details")
    private Details details;

    @NameInMap("Edition")
    private String edition;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("InDebt")
    private String inDebt;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
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

        /**
         * The details of the WAF instance.
         */
        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        /**
         * The edition of the WAF instance.
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * The expiration time of the WAF instance.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Indicates whether the WAF instance has overdue payments. Valid values:
         * <p>
         * 
         * *   **0**: The WAF instance does not have overdue payments.
         * *   **1**: The WAF instance has overdue payments.
         */
        public Builder inDebt(String inDebt) {
            this.inDebt = inDebt;
            return this;
        }

        /**
         * The ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The billing method of the WAF instance. Valid values:
         * <p>
         * 
         * *   **POSTPAY:** The WAF instance uses the pay-as-you-go billing method.
         * *   **PREPAY:** The WAF instance uses the subscription billing method.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The purchase time of the WAF instance. The time is in the UNIX timestamp format. The time is displayed in UTC. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the WAF instance. Valid values:
         * <p>
         * 
         * *   **1:** The WAF instance is in a normal state.
         * *   **2:** The WAF instance has expired.
         * *   **3:** The WAF instance has been released.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("AclRuleMaxIpCount")
        private Long aclRuleMaxIpCount;

        @NameInMap("AntiScan")
        private Boolean antiScan;

        @NameInMap("AntiScanTemplateMaxCount")
        private Long antiScanTemplateMaxCount;

        @NameInMap("BackendMaxCount")
        private Long backendMaxCount;

        @NameInMap("BaseWafGroup")
        private Boolean baseWafGroup;

        @NameInMap("BaseWafGroupRuleInTemplateMaxCount")
        private Long baseWafGroupRuleInTemplateMaxCount;

        @NameInMap("BaseWafGroupRuleTemplateMaxCount")
        private Long baseWafGroupRuleTemplateMaxCount;

        @NameInMap("Bot")
        private Boolean bot;

        @NameInMap("BotApp")
        private String botApp;

        @NameInMap("BotTemplateMaxCount")
        private Long botTemplateMaxCount;

        @NameInMap("BotWeb")
        private String botWeb;

        @NameInMap("CnameResourceMaxCount")
        private Long cnameResourceMaxCount;

        @NameInMap("CustomResponse")
        private Boolean customResponse;

        @NameInMap("CustomResponseRuleInTemplateMaxCount")
        private Long customResponseRuleInTemplateMaxCount;

        @NameInMap("CustomResponseTemplateMaxCount")
        private Long customResponseTemplateMaxCount;

        @NameInMap("CustomRule")
        private Boolean customRule;

        @NameInMap("CustomRuleAction")
        private String customRuleAction;

        @NameInMap("CustomRuleCondition")
        private String customRuleCondition;

        @NameInMap("CustomRuleInTemplateMaxCount")
        private Long customRuleInTemplateMaxCount;

        @NameInMap("CustomRuleRatelimitor")
        private String customRuleRatelimitor;

        @NameInMap("CustomRuleTemplateMaxCount")
        private Long customRuleTemplateMaxCount;

        @NameInMap("DefenseGroupMaxCount")
        private Long defenseGroupMaxCount;

        @NameInMap("DefenseObjectInGroupMaxCount")
        private Long defenseObjectInGroupMaxCount;

        @NameInMap("DefenseObjectInTemplateMaxCount")
        private Long defenseObjectInTemplateMaxCount;

        @NameInMap("DefenseObjectMaxCount")
        private Long defenseObjectMaxCount;

        @NameInMap("Dlp")
        private Boolean dlp;

        @NameInMap("DlpRuleInTemplateMaxCount")
        private Long dlpRuleInTemplateMaxCount;

        @NameInMap("DlpTemplateMaxCount")
        private Long dlpTemplateMaxCount;

        @NameInMap("ExclusiveIp")
        private Boolean exclusiveIp;

        @NameInMap("Gslb")
        private Boolean gslb;

        @NameInMap("HttpPorts")
        private String httpPorts;

        @NameInMap("HttpsPorts")
        private String httpsPorts;

        @NameInMap("IpBlacklist")
        private Boolean ipBlacklist;

        @NameInMap("IpBlacklistIpInRuleMaxCount")
        private Long ipBlacklistIpInRuleMaxCount;

        @NameInMap("IpBlacklistRuleInTemplateMaxCount")
        private Long ipBlacklistRuleInTemplateMaxCount;

        @NameInMap("IpBlacklistTemplateMaxCount")
        private Long ipBlacklistTemplateMaxCount;

        @NameInMap("Ipv6")
        private Boolean ipv6;

        @NameInMap("LogService")
        private Boolean logService;

        @NameInMap("MajorProtection")
        private Boolean majorProtection;

        @NameInMap("MajorProtectionTemplateMaxCount")
        private Long majorProtectionTemplateMaxCount;

        @NameInMap("Tamperproof")
        private Boolean tamperproof;

        @NameInMap("TamperproofRuleInTemplateMaxCount")
        private Long tamperproofRuleInTemplateMaxCount;

        @NameInMap("TamperproofTemplateMaxCount")
        private Long tamperproofTemplateMaxCount;

        @NameInMap("VastIpBlacklistInFileMaxCount")
        private Long vastIpBlacklistInFileMaxCount;

        @NameInMap("VastIpBlacklistInOperationMaxCount")
        private Long vastIpBlacklistInOperationMaxCount;

        @NameInMap("VastIpBlacklistMaxCount")
        private Long vastIpBlacklistMaxCount;

        @NameInMap("Whitelist")
        private Boolean whitelist;

        @NameInMap("WhitelistLogical")
        private String whitelistLogical;

        @NameInMap("WhitelistRuleCondition")
        private String whitelistRuleCondition;

        @NameInMap("WhitelistRuleInTemplateMaxCount")
        private Long whitelistRuleInTemplateMaxCount;

        @NameInMap("WhitelistTemplateMaxCount")
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

            /**
             * The maximum number of IP addresses that can be added to the match content of a match condition. For more information, see [Match conditions](~~374354~~).
             */
            public Builder aclRuleMaxIpCount(Long aclRuleMaxIpCount) {
                this.aclRuleMaxIpCount = aclRuleMaxIpCount;
                return this;
            }

            /**
             * Indicates whether the scan protection module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The scan protection module is supported.
             * *   **false:** The scan protection module is not supported.
             */
            public Builder antiScan(Boolean antiScan) {
                this.antiScan = antiScan;
                return this;
            }

            /**
             * The maximum number of scan protection rule templates that can be configured.
             */
            public Builder antiScanTemplateMaxCount(Long antiScanTemplateMaxCount) {
                this.antiScanTemplateMaxCount = antiScanTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of back-to-origin IP addresses that can be configured.
             */
            public Builder backendMaxCount(Long backendMaxCount) {
                this.backendMaxCount = backendMaxCount;
                return this;
            }

            /**
             * Indicates whether the basic protection rule module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The basic protection rule module is supported.
             * *   **false:** The basic protection rule module is not supported.
             */
            public Builder baseWafGroup(Boolean baseWafGroup) {
                this.baseWafGroup = baseWafGroup;
                return this;
            }

            /**
             * The maximum number of protection rules that can be included in a basic protection rule template.
             */
            public Builder baseWafGroupRuleInTemplateMaxCount(Long baseWafGroupRuleInTemplateMaxCount) {
                this.baseWafGroupRuleInTemplateMaxCount = baseWafGroupRuleInTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of basic protection rule templates that can be configured.
             */
            public Builder baseWafGroupRuleTemplateMaxCount(Long baseWafGroupRuleTemplateMaxCount) {
                this.baseWafGroupRuleTemplateMaxCount = baseWafGroupRuleTemplateMaxCount;
                return this;
            }

            /**
             * Indicates whether the bot management module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The bot management module is supported.
             * *   **false:** The bot management module is not supported.
             */
            public Builder bot(Boolean bot) {
                this.bot = bot;
                return this;
            }

            /**
             * Indicates whether bot management for app protection is supported. Valid values:
             * <p>
             * 
             * *   **true:** Bot management for app protection is supported.
             * *   **false:** Bot management for app protection is not supported.
             */
            public Builder botApp(String botApp) {
                this.botApp = botApp;
                return this;
            }

            /**
             * The maximum number of bot management rule templates that can be configured.
             */
            public Builder botTemplateMaxCount(Long botTemplateMaxCount) {
                this.botTemplateMaxCount = botTemplateMaxCount;
                return this;
            }

            /**
             * Indicates whether bot management for website protection is supported. Valid values:
             * <p>
             * 
             * *   **true:** Bot management for website protection is supported.
             * *   **false:** Bot management for website protection is not supported.
             */
            public Builder botWeb(String botWeb) {
                this.botWeb = botWeb;
                return this;
            }

            /**
             * The maximum number of CNAMEs that can be added.
             */
            public Builder cnameResourceMaxCount(Long cnameResourceMaxCount) {
                this.cnameResourceMaxCount = cnameResourceMaxCount;
                return this;
            }

            /**
             * Indicates whether the custom response module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The custom response module is supported.
             * *   **false:** The custom response module is not supported.
             */
            public Builder customResponse(Boolean customResponse) {
                this.customResponse = customResponse;
                return this;
            }

            /**
             * The maximum number of rules that can be included in a custom response rule template.
             */
            public Builder customResponseRuleInTemplateMaxCount(Long customResponseRuleInTemplateMaxCount) {
                this.customResponseRuleInTemplateMaxCount = customResponseRuleInTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of custom response rule templates that can be configured.
             */
            public Builder customResponseTemplateMaxCount(Long customResponseTemplateMaxCount) {
                this.customResponseTemplateMaxCount = customResponseTemplateMaxCount;
                return this;
            }

            /**
             * Indicates whether the custom rule module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The custom rule module is supported.
             * *   **false:** The custom rule module is not supported.
             */
            public Builder customRule(Boolean customRule) {
                this.customRule = customRule;
                return this;
            }

            /**
             * The action that can be included in a custom rule.
             */
            public Builder customRuleAction(String customRuleAction) {
                this.customRuleAction = customRuleAction;
                return this;
            }

            /**
             * The match conditions that can be used in a custom rule. For more information, see **Match condition parameters** in the "**Parameters of custom rules (custom_acl)**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
             */
            public Builder customRuleCondition(String customRuleCondition) {
                this.customRuleCondition = customRuleCondition;
                return this;
            }

            /**
             * The maximum number of rules that can be included in a custom rule template.
             */
            public Builder customRuleInTemplateMaxCount(Long customRuleInTemplateMaxCount) {
                this.customRuleInTemplateMaxCount = customRuleInTemplateMaxCount;
                return this;
            }

            /**
             * The statistical object for rate limiting in a custom rule.
             */
            public Builder customRuleRatelimitor(String customRuleRatelimitor) {
                this.customRuleRatelimitor = customRuleRatelimitor;
                return this;
            }

            /**
             * The maximum number of custom rule templates that can be configured.
             */
            public Builder customRuleTemplateMaxCount(Long customRuleTemplateMaxCount) {
                this.customRuleTemplateMaxCount = customRuleTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of protected object groups that can be configured.
             */
            public Builder defenseGroupMaxCount(Long defenseGroupMaxCount) {
                this.defenseGroupMaxCount = defenseGroupMaxCount;
                return this;
            }

            /**
             * The maximum number of protected objects that can be included in a protected object group.
             */
            public Builder defenseObjectInGroupMaxCount(Long defenseObjectInGroupMaxCount) {
                this.defenseObjectInGroupMaxCount = defenseObjectInGroupMaxCount;
                return this;
            }

            /**
             * The maximum number of protected objects to which a protection rule template can be applied.
             */
            public Builder defenseObjectInTemplateMaxCount(Long defenseObjectInTemplateMaxCount) {
                this.defenseObjectInTemplateMaxCount = defenseObjectInTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of protected objects that can be configured.
             */
            public Builder defenseObjectMaxCount(Long defenseObjectMaxCount) {
                this.defenseObjectMaxCount = defenseObjectMaxCount;
                return this;
            }

            /**
             * Indicates whether the data leakage prevention module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The data leakage prevention module is supported.
             * *   **false:** The data leakage prevention module is not supported.
             */
            public Builder dlp(Boolean dlp) {
                this.dlp = dlp;
                return this;
            }

            /**
             * The maximum number of rules that can be included in a data leakage prevention rule template.
             */
            public Builder dlpRuleInTemplateMaxCount(Long dlpRuleInTemplateMaxCount) {
                this.dlpRuleInTemplateMaxCount = dlpRuleInTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of data leakage prevention rule templates that can be configured.
             */
            public Builder dlpTemplateMaxCount(Long dlpTemplateMaxCount) {
                this.dlpTemplateMaxCount = dlpTemplateMaxCount;
                return this;
            }

            /**
             * Indicates whether exclusive IP addresses are supported. Valid values:
             * <p>
             * 
             * *   **true:** Exclusive IP addresses are supported.
             * *   **false:** Exclusive IP addresses are not supported.
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * Indicates whether global server load balancing (GSLB) is supported. Valid values:
             * <p>
             * 
             * *   **true:** GSLB is supported.
             * *   **false:** GSLB is not supported.
             */
            public Builder gslb(Boolean gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * The HTTP port range that is supported. For more information, see [View supported ports](~~385578~~).
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * The HTTPS port range that is supported. For more information, see [View supported ports](~~385578~~).
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * Indicates whether the IP address blacklist module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The IP address blacklist module is supported.
             * *   **false:** The IP address blacklist module is not supported.
             */
            public Builder ipBlacklist(Boolean ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            /**
             * The maximum number of IP addresses that can be added to an IP address blacklist rule.
             */
            public Builder ipBlacklistIpInRuleMaxCount(Long ipBlacklistIpInRuleMaxCount) {
                this.ipBlacklistIpInRuleMaxCount = ipBlacklistIpInRuleMaxCount;
                return this;
            }

            /**
             * The maximum number of rules that can be included in an IP address blacklist rule template.
             */
            public Builder ipBlacklistRuleInTemplateMaxCount(Long ipBlacklistRuleInTemplateMaxCount) {
                this.ipBlacklistRuleInTemplateMaxCount = ipBlacklistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of IP address blacklist rule templates that can be configured.
             */
            public Builder ipBlacklistTemplateMaxCount(Long ipBlacklistTemplateMaxCount) {
                this.ipBlacklistTemplateMaxCount = ipBlacklistTemplateMaxCount;
                return this;
            }

            /**
             * Indicates whether IPv6 is supported. Valid values:
             * <p>
             * 
             * *   **true:** IPv6 is supported.
             * *   **false:** IPv6 is not supported.
             */
            public Builder ipv6(Boolean ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * Indicates whether the log collection feature is supported. Valid values:
             * <p>
             * 
             * *   **true:** The log collection feature is supported.
             * *   **false:** The log collection feature is not supported.
             */
            public Builder logService(Boolean logService) {
                this.logService = logService;
                return this;
            }

            /**
             * Indicates whether major event protection is supported. Valid values:
             * <p>
             * 
             * *   **true:** Major event protection is supported.
             * *   **false:** Major event protection is not supported.
             */
            public Builder majorProtection(Boolean majorProtection) {
                this.majorProtection = majorProtection;
                return this;
            }

            /**
             * The maximum number of major event protection rule templates that can be configured.
             */
            public Builder majorProtectionTemplateMaxCount(Long majorProtectionTemplateMaxCount) {
                this.majorProtectionTemplateMaxCount = majorProtectionTemplateMaxCount;
                return this;
            }

            /**
             * Indicates whether the website tamper-proofing module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The website tamper-proofing module is supported.
             * *   **false:** The website tamper-proofing module is not supported.
             */
            public Builder tamperproof(Boolean tamperproof) {
                this.tamperproof = tamperproof;
                return this;
            }

            /**
             * The maximum number of rules that can be included in a website tamper-proofing rule template.
             */
            public Builder tamperproofRuleInTemplateMaxCount(Long tamperproofRuleInTemplateMaxCount) {
                this.tamperproofRuleInTemplateMaxCount = tamperproofRuleInTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of website tamper-proofing rule templates that can be configured.
             */
            public Builder tamperproofTemplateMaxCount(Long tamperproofTemplateMaxCount) {
                this.tamperproofTemplateMaxCount = tamperproofTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist in a batch.
             */
            public Builder vastIpBlacklistInFileMaxCount(Long vastIpBlacklistInFileMaxCount) {
                this.vastIpBlacklistInFileMaxCount = vastIpBlacklistInFileMaxCount;
                return this;
            }

            /**
             * The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist on a page.
             */
            public Builder vastIpBlacklistInOperationMaxCount(Long vastIpBlacklistInOperationMaxCount) {
                this.vastIpBlacklistInOperationMaxCount = vastIpBlacklistInOperationMaxCount;
                return this;
            }

            /**
             * The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist per Alibaba Cloud account.
             */
            public Builder vastIpBlacklistMaxCount(Long vastIpBlacklistMaxCount) {
                this.vastIpBlacklistMaxCount = vastIpBlacklistMaxCount;
                return this;
            }

            /**
             * Indicates whether the whitelist module is supported. Valid values:
             * <p>
             * 
             * *   **true:** The whitelist module is supported.
             * *   **false:** The whitelist module is not supported.
             */
            public Builder whitelist(Boolean whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * The logical operators that can be used in a whitelist rule. For more information, see **Match condition parameters** in the "**Parameters of whitelist rules (whitelist)**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
             */
            public Builder whitelistLogical(String whitelistLogical) {
                this.whitelistLogical = whitelistLogical;
                return this;
            }

            /**
             * The match fields that can be used in a whitelist rule. For more information, see **Match condition parameters** in the "**Parameters of whitelist rules (whitelist)**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
             */
            public Builder whitelistRuleCondition(String whitelistRuleCondition) {
                this.whitelistRuleCondition = whitelistRuleCondition;
                return this;
            }

            /**
             * The maximum number of rules that can be included in a whitelist rule template.
             */
            public Builder whitelistRuleInTemplateMaxCount(Long whitelistRuleInTemplateMaxCount) {
                this.whitelistRuleInTemplateMaxCount = whitelistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * The maximum number of whitelist rule templates that can be configured.
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
