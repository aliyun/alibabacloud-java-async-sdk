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

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceResponseBody(Builder builder) {
        this.details = builder.details;
        this.edition = builder.edition;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder {
        private Details details; 
        private String edition; 
        private String instanceId; 
        private String regionId; 
        private String requestId; 

        /**
         * 实例详情
         */
        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        /**
         * 套餐
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
            private Long vastIpBlacklistInFileMaxCount; 
            private Long vastIpBlacklistInOperationMaxCount; 
            private Long vastIpBlacklistMaxCount; 
            private Boolean whitelist; 
            private String whitelistLogical; 
            private String whitelistRuleCondition; 
            private Long whitelistRuleInTemplateMaxCount; 
            private Long whitelistTemplateMaxCount; 

            /**
             * AclRuleMaxIpCount.
             */
            public Builder aclRuleMaxIpCount(Long aclRuleMaxIpCount) {
                this.aclRuleMaxIpCount = aclRuleMaxIpCount;
                return this;
            }

            /**
             * 支持扫描防护
             */
            public Builder antiScan(Boolean antiScan) {
                this.antiScan = antiScan;
                return this;
            }

            /**
             * 扫描防护模板数
             */
            public Builder antiScanTemplateMaxCount(Long antiScanTemplateMaxCount) {
                this.antiScanTemplateMaxCount = antiScanTemplateMaxCount;
                return this;
            }

            /**
             * 最大回源数
             */
            public Builder backendMaxCount(Long backendMaxCount) {
                this.backendMaxCount = backendMaxCount;
                return this;
            }

            /**
             * 基础防护
             */
            public Builder baseWafGroup(Boolean baseWafGroup) {
                this.baseWafGroup = baseWafGroup;
                return this;
            }

            /**
             * 基础防护规则
             */
            public Builder baseWafGroupRuleInTemplateMaxCount(Long baseWafGroupRuleInTemplateMaxCount) {
                this.baseWafGroupRuleInTemplateMaxCount = baseWafGroupRuleInTemplateMaxCount;
                return this;
            }

            /**
             * 基础防护规则最大数量
             */
            public Builder baseWafGroupRuleTemplateMaxCount(Long baseWafGroupRuleTemplateMaxCount) {
                this.baseWafGroupRuleTemplateMaxCount = baseWafGroupRuleTemplateMaxCount;
                return this;
            }

            /**
             * 最大可添加CNAME数
             */
            public Builder cnameResourceMaxCount(Long cnameResourceMaxCount) {
                this.cnameResourceMaxCount = cnameResourceMaxCount;
                return this;
            }

            /**
             * 支持自定义响应
             */
            public Builder customResponse(Boolean customResponse) {
                this.customResponse = customResponse;
                return this;
            }

            /**
             * 自定义响应模板包含规则数
             */
            public Builder customResponseRuleInTemplateMaxCount(Long customResponseRuleInTemplateMaxCount) {
                this.customResponseRuleInTemplateMaxCount = customResponseRuleInTemplateMaxCount;
                return this;
            }

            /**
             * 自定义响应模板数
             */
            public Builder customResponseTemplateMaxCount(Long customResponseTemplateMaxCount) {
                this.customResponseTemplateMaxCount = customResponseTemplateMaxCount;
                return this;
            }

            /**
             * 支持自定义规则
             */
            public Builder customRule(Boolean customRule) {
                this.customRule = customRule;
                return this;
            }

            /**
             * 包含字符串
             */
            public Builder customRuleAction(String customRuleAction) {
                this.customRuleAction = customRuleAction;
                return this;
            }

            /**
             * 自定义规则匹配条件
             */
            public Builder customRuleCondition(String customRuleCondition) {
                this.customRuleCondition = customRuleCondition;
                return this;
            }

            /**
             * 自定义规则模板包含规则数
             */
            public Builder customRuleInTemplateMaxCount(Long customRuleInTemplateMaxCount) {
                this.customRuleInTemplateMaxCount = customRuleInTemplateMaxCount;
                return this;
            }

            /**
             * 自定义规则限速对象
             */
            public Builder customRuleRatelimitor(String customRuleRatelimitor) {
                this.customRuleRatelimitor = customRuleRatelimitor;
                return this;
            }

            /**
             * 自定义规则模板数
             */
            public Builder customRuleTemplateMaxCount(Long customRuleTemplateMaxCount) {
                this.customRuleTemplateMaxCount = customRuleTemplateMaxCount;
                return this;
            }

            /**
             * 最大防护组数量
             */
            public Builder defenseGroupMaxCount(Long defenseGroupMaxCount) {
                this.defenseGroupMaxCount = defenseGroupMaxCount;
                return this;
            }

            /**
             * 一个防护组内最大包含对象数量
             */
            public Builder defenseObjectInGroupMaxCount(Long defenseObjectInGroupMaxCount) {
                this.defenseObjectInGroupMaxCount = defenseObjectInGroupMaxCount;
                return this;
            }

            /**
             * 一个模板内关联对象的最大数量
             */
            public Builder defenseObjectInTemplateMaxCount(Long defenseObjectInTemplateMaxCount) {
                this.defenseObjectInTemplateMaxCount = defenseObjectInTemplateMaxCount;
                return this;
            }

            /**
             * 最大防护对象数量
             */
            public Builder defenseObjectMaxCount(Long defenseObjectMaxCount) {
                this.defenseObjectMaxCount = defenseObjectMaxCount;
                return this;
            }

            /**
             * 独享IP
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * Gslb
             */
            public Builder gslb(Boolean gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * HTTP端口可用范围
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * HTTPS端口可用范围
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * 支持IP黑名单
             */
            public Builder ipBlacklist(Boolean ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            /**
             * IP黑名单规则包含IP数
             */
            public Builder ipBlacklistIpInRuleMaxCount(Long ipBlacklistIpInRuleMaxCount) {
                this.ipBlacklistIpInRuleMaxCount = ipBlacklistIpInRuleMaxCount;
                return this;
            }

            /**
             * IP黑名单模板包含规则数
             */
            public Builder ipBlacklistRuleInTemplateMaxCount(Long ipBlacklistRuleInTemplateMaxCount) {
                this.ipBlacklistRuleInTemplateMaxCount = ipBlacklistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * /黑名单模板数
             */
            public Builder ipBlacklistTemplateMaxCount(Long ipBlacklistTemplateMaxCount) {
                this.ipBlacklistTemplateMaxCount = ipBlacklistTemplateMaxCount;
                return this;
            }

            /**
             * Ipv6
             */
            public Builder ipv6(Boolean ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * 日志服务是否开启
             */
            public Builder logService(Boolean logService) {
                this.logService = logService;
                return this;
            }

            /**
             * 是否支持重保
             */
            public Builder majorProtection(Boolean majorProtection) {
                this.majorProtection = majorProtection;
                return this;
            }

            /**
             * 重保模板的最大数量
             */
            public Builder majorProtectionTemplateMaxCount(Long majorProtectionTemplateMaxCount) {
                this.majorProtectionTemplateMaxCount = majorProtectionTemplateMaxCount;
                return this;
            }

            /**
             * 海量IP单次上传文件IP的最大数量
             */
            public Builder vastIpBlacklistInFileMaxCount(Long vastIpBlacklistInFileMaxCount) {
                this.vastIpBlacklistInFileMaxCount = vastIpBlacklistInFileMaxCount;
                return this;
            }

            /**
             * 海量IP单次页面操作的最大数量
             */
            public Builder vastIpBlacklistInOperationMaxCount(Long vastIpBlacklistInOperationMaxCount) {
                this.vastIpBlacklistInOperationMaxCount = vastIpBlacklistInOperationMaxCount;
                return this;
            }

            /**
             * 海量IP的最大数量（单用户）
             */
            public Builder vastIpBlacklistMaxCount(Long vastIpBlacklistMaxCount) {
                this.vastIpBlacklistMaxCount = vastIpBlacklistMaxCount;
                return this;
            }

            /**
             * 是否支持白名单
             */
            public Builder whitelist(Boolean whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * 白名单规则匹配条件
             */
            public Builder whitelistLogical(String whitelistLogical) {
                this.whitelistLogical = whitelistLogical;
                return this;
            }

            /**
             * 白名单规则匹配条件
             */
            public Builder whitelistRuleCondition(String whitelistRuleCondition) {
                this.whitelistRuleCondition = whitelistRuleCondition;
                return this;
            }

            /**
             * 白名单模板包含规则数
             */
            public Builder whitelistRuleInTemplateMaxCount(Long whitelistRuleInTemplateMaxCount) {
                this.whitelistRuleInTemplateMaxCount = whitelistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * 白名单模板数
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
