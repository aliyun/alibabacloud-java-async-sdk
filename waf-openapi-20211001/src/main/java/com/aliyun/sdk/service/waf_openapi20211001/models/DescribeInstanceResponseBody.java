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

    @com.aliyun.core.annotation.NameInMap("ProcessStatus")
    private String processStatus;

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
        this.processStatus = builder.processStatus;
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
     * @return processStatus
     */
    public String getProcessStatus() {
        return this.processStatus;
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
        private String processStatus; 
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
            this.processStatus = model.processStatus;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The instance details.</p>
         */
        public Builder details(Details details) {
            this.details = details;
            return this;
        }

        /**
         * <p>The WAF edition.</p>
         * 
         * <strong>example:</strong>
         * <p>default_version</p>
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>The time when the instance expires. The value is a UNIX timestamp. Unit: milliseconds. Format: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>4809859200000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Indicates whether the current instance has an overdue payment. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder inDebt(String inDebt) {
            this.inDebt = inDebt;
            return this;
        }

        /**
         * <p>The WAF instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The instance execution status. Valid values:</p>
         * <ul>
         * <li><p><strong>commodity_converting</strong>: The commodity is being converted.</p>
         * </li>
         * <li><p><strong>commodity_convert_check_failed</strong>: The commodity conversion check failed.</p>
         * </li>
         * <li><p><strong>commodity_convert_process_failed</strong>: The commodity conversion failed.</p>
         * </li>
         * <li><p><strong>order_create_failed</strong>: The order failed to be created.</p>
         * </li>
         * <li><p><strong>order_pending_payment</strong>: The order is pending payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>order_pending_payment</p>
         */
        public Builder processStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
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
         * <p>The purchase time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1668496310000</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The current status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Normal.</li>
         * <li><strong>2</strong>: Expired.</li>
         * <li><strong>3</strong>: Released.</li>
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

        @com.aliyun.core.annotation.NameInMap("AgenticApisec")
        private Boolean agenticApisec;

        @com.aliyun.core.annotation.NameInMap("AntiScan")
        private Boolean antiScan;

        @com.aliyun.core.annotation.NameInMap("AntiScanTemplateMaxCount")
        private Long antiScanTemplateMaxCount;

        @com.aliyun.core.annotation.NameInMap("Apisec")
        private Boolean apisec;

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

        @com.aliyun.core.annotation.NameInMap("ElasticQps")
        private Integer elasticQps;

        @com.aliyun.core.annotation.NameInMap("ExclusiveIp")
        private Boolean exclusiveIp;

        @com.aliyun.core.annotation.NameInMap("ExtendQps")
        private Integer extendQps;

        @com.aliyun.core.annotation.NameInMap("FreeQps")
        private Integer freeQps;

        @com.aliyun.core.annotation.NameInMap("Gslb")
        private Boolean gslb;

        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private String httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private String httpsPorts;

        @com.aliyun.core.annotation.NameInMap("HybridCloud")
        private Boolean hybridCloud;

        @com.aliyun.core.annotation.NameInMap("HybridCloudNodeExtend")
        private Integer hybridCloudNodeExtend;

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

        @com.aliyun.core.annotation.NameInMap("QpsBillingCap")
        private Integer qpsBillingCap;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectory")
        private Boolean resourceDirectory;

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
            this.agenticApisec = builder.agenticApisec;
            this.antiScan = builder.antiScan;
            this.antiScanTemplateMaxCount = builder.antiScanTemplateMaxCount;
            this.apisec = builder.apisec;
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
            this.elasticQps = builder.elasticQps;
            this.exclusiveIp = builder.exclusiveIp;
            this.extendQps = builder.extendQps;
            this.freeQps = builder.freeQps;
            this.gslb = builder.gslb;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.hybridCloud = builder.hybridCloud;
            this.hybridCloudNodeExtend = builder.hybridCloudNodeExtend;
            this.ipBlacklist = builder.ipBlacklist;
            this.ipBlacklistIpInRuleMaxCount = builder.ipBlacklistIpInRuleMaxCount;
            this.ipBlacklistRuleInTemplateMaxCount = builder.ipBlacklistRuleInTemplateMaxCount;
            this.ipBlacklistTemplateMaxCount = builder.ipBlacklistTemplateMaxCount;
            this.ipv6 = builder.ipv6;
            this.logService = builder.logService;
            this.majorProtection = builder.majorProtection;
            this.majorProtectionTemplateMaxCount = builder.majorProtectionTemplateMaxCount;
            this.qpsBillingCap = builder.qpsBillingCap;
            this.resourceDirectory = builder.resourceDirectory;
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
         * @return agenticApisec
         */
        public Boolean getAgenticApisec() {
            return this.agenticApisec;
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
         * @return apisec
         */
        public Boolean getApisec() {
            return this.apisec;
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
         * @return elasticQps
         */
        public Integer getElasticQps() {
            return this.elasticQps;
        }

        /**
         * @return exclusiveIp
         */
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        /**
         * @return extendQps
         */
        public Integer getExtendQps() {
            return this.extendQps;
        }

        /**
         * @return freeQps
         */
        public Integer getFreeQps() {
            return this.freeQps;
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
         * @return hybridCloud
         */
        public Boolean getHybridCloud() {
            return this.hybridCloud;
        }

        /**
         * @return hybridCloudNodeExtend
         */
        public Integer getHybridCloudNodeExtend() {
            return this.hybridCloudNodeExtend;
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
         * @return qpsBillingCap
         */
        public Integer getQpsBillingCap() {
            return this.qpsBillingCap;
        }

        /**
         * @return resourceDirectory
         */
        public Boolean getResourceDirectory() {
            return this.resourceDirectory;
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
            private Boolean agenticApisec; 
            private Boolean antiScan; 
            private Long antiScanTemplateMaxCount; 
            private Boolean apisec; 
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
            private Integer elasticQps; 
            private Boolean exclusiveIp; 
            private Integer extendQps; 
            private Integer freeQps; 
            private Boolean gslb; 
            private String httpPorts; 
            private String httpsPorts; 
            private Boolean hybridCloud; 
            private Integer hybridCloudNodeExtend; 
            private Boolean ipBlacklist; 
            private Long ipBlacklistIpInRuleMaxCount; 
            private Long ipBlacklistRuleInTemplateMaxCount; 
            private Long ipBlacklistTemplateMaxCount; 
            private Boolean ipv6; 
            private Boolean logService; 
            private Boolean majorProtection; 
            private Long majorProtectionTemplateMaxCount; 
            private Integer qpsBillingCap; 
            private Boolean resourceDirectory; 
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
                this.agenticApisec = model.agenticApisec;
                this.antiScan = model.antiScan;
                this.antiScanTemplateMaxCount = model.antiScanTemplateMaxCount;
                this.apisec = model.apisec;
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
                this.elasticQps = model.elasticQps;
                this.exclusiveIp = model.exclusiveIp;
                this.extendQps = model.extendQps;
                this.freeQps = model.freeQps;
                this.gslb = model.gslb;
                this.httpPorts = model.httpPorts;
                this.httpsPorts = model.httpsPorts;
                this.hybridCloud = model.hybridCloud;
                this.hybridCloudNodeExtend = model.hybridCloudNodeExtend;
                this.ipBlacklist = model.ipBlacklist;
                this.ipBlacklistIpInRuleMaxCount = model.ipBlacklistIpInRuleMaxCount;
                this.ipBlacklistRuleInTemplateMaxCount = model.ipBlacklistRuleInTemplateMaxCount;
                this.ipBlacklistTemplateMaxCount = model.ipBlacklistTemplateMaxCount;
                this.ipv6 = model.ipv6;
                this.logService = model.logService;
                this.majorProtection = model.majorProtection;
                this.majorProtectionTemplateMaxCount = model.majorProtectionTemplateMaxCount;
                this.qpsBillingCap = model.qpsBillingCap;
                this.resourceDirectory = model.resourceDirectory;
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
             * <p>The maximum number of IP addresses that can be added to the match content. For more information about match content, refer to <a href="https://help.aliyun.com/document_detail/374354.html">Match condition description</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder aclRuleMaxIpCount(Long aclRuleMaxIpCount) {
                this.aclRuleMaxIpCount = aclRuleMaxIpCount;
                return this;
            }

            /**
             * <p>Indicates whether Agentic API security is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder agenticApisec(Boolean agenticApisec) {
                this.agenticApisec = agenticApisec;
                return this;
            }

            /**
             * <p>Specifies whether scan protection is supported. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder antiScan(Boolean antiScan) {
                this.antiScan = antiScan;
                return this;
            }

            /**
             * <p>The maximum number of scan protection templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder antiScanTemplateMaxCount(Long antiScanTemplateMaxCount) {
                this.antiScanTemplateMaxCount = antiScanTemplateMaxCount;
                return this;
            }

            /**
             * <p>Indicates whether API security is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder apisec(Boolean apisec) {
                this.apisec = apisec;
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
             * <p>Specifies whether basic protection rules are supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Not supported.</p>
             * </li>
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
             * <p>The maximum number of protection rules that can be included in a single basic protection rule template.</p>
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
             * <p>Specifies whether bot management is supported. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bot(Boolean bot) {
                this.bot = bot;
                return this;
            }

            /**
             * <p>Indicates whether scenario-specific protection against app crawlers is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Supported.</li>
             * <li><strong>false</strong>: Not supported.</li>
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
             * <p>The maximum number of bot management protection templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder botTemplateMaxCount(Long botTemplateMaxCount) {
                this.botTemplateMaxCount = botTemplateMaxCount;
                return this;
            }

            /**
             * <p>Specifies whether scenario-specific protection against web crawlers is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Supported.</li>
             * <li><strong>false</strong>: Not supported.</li>
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
             * <p>Indicates whether custom responses are supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Not supported.</p>
             * </li>
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
             * <p>The maximum number of protection rules that a single custom response template can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder customResponseRuleInTemplateMaxCount(Long customResponseRuleInTemplateMaxCount) {
                this.customResponseRuleInTemplateMaxCount = customResponseRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of custom response templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder customResponseTemplateMaxCount(Long customResponseTemplateMaxCount) {
                this.customResponseTemplateMaxCount = customResponseTemplateMaxCount;
                return this;
            }

            /**
             * <p>Specifies whether custom rules are supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Not supported.</p>
             * </li>
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
             * <p>The strings included in custom rules.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder customRuleAction(String customRuleAction) {
                this.customRuleAction = customRuleAction;
                return this;
            }

            /**
             * <p>The match conditions for custom rules. For more information, refer to the parameter description of <strong>custom rule (custom_acl) conditions</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder customRuleCondition(String customRuleCondition) {
                this.customRuleCondition = customRuleCondition;
                return this;
            }

            /**
             * <p>The maximum number of protection rules that a single custom rule template can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder customRuleInTemplateMaxCount(Long customRuleInTemplateMaxCount) {
                this.customRuleInTemplateMaxCount = customRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The rate limiting object for custom rules.</p>
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
             * <p>The maximum number of protection groups that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defenseGroupMaxCount(Long defenseGroupMaxCount) {
                this.defenseGroupMaxCount = defenseGroupMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protection objects that a protection group can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defenseObjectInGroupMaxCount(Long defenseObjectInGroupMaxCount) {
                this.defenseObjectInGroupMaxCount = defenseObjectInGroupMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protection objects that can be associated with a single template.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defenseObjectInTemplateMaxCount(Long defenseObjectInTemplateMaxCount) {
                this.defenseObjectInTemplateMaxCount = defenseObjectInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protection objects that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder defenseObjectMaxCount(Long defenseObjectMaxCount) {
                this.defenseObjectMaxCount = defenseObjectMaxCount;
                return this;
            }

            /**
             * <p>Specifies whether data leak prevention is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Supported.</li>
             * <li><strong>false</strong>: Not supported.</li>
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
             * <p>The maximum number of protection rules that a single information leak prevention template can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder dlpRuleInTemplateMaxCount(Long dlpRuleInTemplateMaxCount) {
                this.dlpRuleInTemplateMaxCount = dlpRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of information leak prevention templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder dlpTemplateMaxCount(Long dlpTemplateMaxCount) {
                this.dlpTemplateMaxCount = dlpTemplateMaxCount;
                return this;
            }

            /**
             * <p>The burstable QPS value for the subscription instance with pay-as-you-go billing for burstable capacity. For more information, see <a href="https://help.aliyun.com/document_detail/441231.html">WAF 3.0 editions</a>.</p>
             * <blockquote>
             * <p>This parameter has no practical meaning for <strong>pay-as-you-go</strong> instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder elasticQps(Integer elasticQps) {
                this.elasticQps = elasticQps;
                return this;
            }

            /**
             * <p>Specifies whether exclusive IP addresses are supported. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * <p>The extended QPS value of the subscription instance. For more information, see <a href="https://help.aliyun.com/document_detail/441231.html">WAF 3.0 editions</a>.</p>
             * <blockquote>
             * <p>This parameter is not applicable to <strong>pay-as-you-go</strong> instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder extendQps(Integer extendQps) {
                this.extendQps = extendQps;
                return this;
            }

            /**
             * <p>The free QPS value included in the subscription plan. For more information, see <a href="https://help.aliyun.com/document_detail/441231.html">WAF 3.0 editions</a>.</p>
             * <blockquote>
             * <p>This parameter has no practical meaning for <strong>pay-as-you-go</strong> instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder freeQps(Integer freeQps) {
                this.freeQps = freeQps;
                return this;
            }

            /**
             * <p>Specifies whether Global Server Load Balancing (GSLB) is supported. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder gslb(Boolean gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * <p>The available HTTP port range. For more information, refer to <a href="https://help.aliyun.com/document_detail/385578.html">Ports supported by WAF</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The available HTTPS port range. For more information, refer to <a href="https://help.aliyun.com/document_detail/385578.html">Ports supported by WAF</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Indicates whether hybrid cloud is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hybridCloud(Boolean hybridCloud) {
                this.hybridCloud = hybridCloud;
                return this;
            }

            /**
             * <p>The number of hybrid cloud extended nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder hybridCloudNodeExtend(Integer hybridCloudNodeExtend) {
                this.hybridCloudNodeExtend = hybridCloudNodeExtend;
                return this;
            }

            /**
             * <p>Indicates whether the IP blacklist is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Not supported.</p>
             * </li>
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
             * <p>The maximum number of IP addresses that can be added to a blacklist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder ipBlacklistIpInRuleMaxCount(Long ipBlacklistIpInRuleMaxCount) {
                this.ipBlacklistIpInRuleMaxCount = ipBlacklistIpInRuleMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of protection rules that a single blacklist template can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ipBlacklistRuleInTemplateMaxCount(Long ipBlacklistRuleInTemplateMaxCount) {
                this.ipBlacklistRuleInTemplateMaxCount = ipBlacklistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of blacklist templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ipBlacklistTemplateMaxCount(Long ipBlacklistTemplateMaxCount) {
                this.ipBlacklistTemplateMaxCount = ipBlacklistTemplateMaxCount;
                return this;
            }

            /**
             * <p>Specifies whether IPv6 is supported. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ipv6(Boolean ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * <p>Specifies whether the log service is supported. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logService(Boolean logService) {
                this.logService = logService;
                return this;
            }

            /**
             * <p>Specifies whether critical event protection is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Not supported.</p>
             * </li>
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
             * <p>The maximum number of critical event protection templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder majorProtectionTemplateMaxCount(Long majorProtectionTemplateMaxCount) {
                this.majorProtectionTemplateMaxCount = majorProtectionTemplateMaxCount;
                return this;
            }

            /**
             * <p>The QPS billing protection threshold for the pay-as-you-go edition. For more information, see <a href="https://help.aliyun.com/document_detail/2249021.html">Traffic billing protection</a> for pay-as-you-go.</p>
             * <blockquote>
             * <p>This parameter has no practical meaning for <strong>subscription</strong> instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder qpsBillingCap(Integer qpsBillingCap) {
                this.qpsBillingCap = qpsBillingCap;
                return this;
            }

            /**
             * <p>Indicates whether the multi-account management feature is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder resourceDirectory(Boolean resourceDirectory) {
                this.resourceDirectory = resourceDirectory;
                return this;
            }

            /**
             * <p>Specifies whether web tamper proofing is supported. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tamperproof(Boolean tamperproof) {
                this.tamperproof = tamperproof;
                return this;
            }

            /**
             * <p>The maximum number of protection rules that a single web tamper proofing template can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder tamperproofRuleInTemplateMaxCount(Long tamperproofRuleInTemplateMaxCount) {
                this.tamperproofRuleInTemplateMaxCount = tamperproofRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of web tamper proofing protection templates that can be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder tamperproofTemplateMaxCount(Long tamperproofTemplateMaxCount) {
                this.tamperproofTemplateMaxCount = tamperproofTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of IP addresses that can be imported to the IP blacklist in a single bulk import.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder vastIpBlacklistInFileMaxCount(Long vastIpBlacklistInFileMaxCount) {
                this.vastIpBlacklistInFileMaxCount = vastIpBlacklistInFileMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of IP addresses that can be added to the IP blacklist in a single page operation.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder vastIpBlacklistInOperationMaxCount(Long vastIpBlacklistInOperationMaxCount) {
                this.vastIpBlacklistInOperationMaxCount = vastIpBlacklistInOperationMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of IP blacklist entries that a single user can configure.</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder vastIpBlacklistMaxCount(Long vastIpBlacklistMaxCount) {
                this.vastIpBlacklistMaxCount = vastIpBlacklistMaxCount;
                return this;
            }

            /**
             * <p>Specifies whether the IP whitelist is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Not supported.</p>
             * </li>
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
             * <p>The logical operators for whitelist rules. For more information, refer to the parameter description of <strong>whitelist rule (whitelist) conditions</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>contain</p>
             */
            public Builder whitelistLogical(String whitelistLogical) {
                this.whitelistLogical = whitelistLogical;
                return this;
            }

            /**
             * <p>The match fields for whitelist rules. For more information, refer to the parameter description of <strong>whitelist rule (whitelist) conditions</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder whitelistRuleCondition(String whitelistRuleCondition) {
                this.whitelistRuleCondition = whitelistRuleCondition;
                return this;
            }

            /**
             * <p>The maximum number of protection rules that a single whitelist template can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder whitelistRuleInTemplateMaxCount(Long whitelistRuleInTemplateMaxCount) {
                this.whitelistRuleInTemplateMaxCount = whitelistRuleInTemplateMaxCount;
                return this;
            }

            /**
             * <p>The maximum number of whitelist templates that can be configured.</p>
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
