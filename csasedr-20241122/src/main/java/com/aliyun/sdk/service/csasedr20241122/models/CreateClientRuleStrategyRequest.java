// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link CreateClientRuleStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateClientRuleStrategyRequest</p>
 */
public class CreateClientRuleStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllGroup")
    private Integer allGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalId")
    private String approvalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cmdline")
    private String cmdline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeUserNameList")
    private java.util.List<String> excludeUserNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InSwitch")
    private Boolean inSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeGroupIdList")
    private java.util.List<String> includeGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainButtonTextCh")
    private String mainButtonTextCh;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainButtonTextEn")
    private String mainButtonTextEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchTargetIds")
    private java.util.List<String> matchTargetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5List")
    private String md5List;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorButtonTextCh")
    private String minorButtonTextCh;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorButtonTextEn")
    private String minorButtonTextEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewFilePath")
    private String newFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutSwitch")
    private Boolean outSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentCmdline")
    private String parentCmdline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentProcPath")
    private String parentProcPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortOnList")
    private java.util.List<String> portOnList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcPath")
    private String procPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryContent")
    private String registryContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryKey")
    private String registryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    private String selectionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftWareOnList")
    private java.util.List<String> softWareOnList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategySourceType")
    private String strategySourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportsApproval")
    private Integer supportsApproval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsContent")
    private String usContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsTitle")
    private String usTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhContent")
    private String zhContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhTitle")
    private String zhTitle;

    private CreateClientRuleStrategyRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.allGroup = builder.allGroup;
        this.approvalId = builder.approvalId;
        this.cmdline = builder.cmdline;
        this.description = builder.description;
        this.excludeUserNameList = builder.excludeUserNameList;
        this.filePath = builder.filePath;
        this.inSwitch = builder.inSwitch;
        this.includeGroupIdList = builder.includeGroupIdList;
        this.ip = builder.ip;
        this.mainButtonTextCh = builder.mainButtonTextCh;
        this.mainButtonTextEn = builder.mainButtonTextEn;
        this.matchMode = builder.matchMode;
        this.matchTargetIds = builder.matchTargetIds;
        this.md5List = builder.md5List;
        this.minorButtonTextCh = builder.minorButtonTextCh;
        this.minorButtonTextEn = builder.minorButtonTextEn;
        this.name = builder.name;
        this.newFilePath = builder.newFilePath;
        this.outSwitch = builder.outSwitch;
        this.parentCmdline = builder.parentCmdline;
        this.parentProcPath = builder.parentProcPath;
        this.platform = builder.platform;
        this.policyType = builder.policyType;
        this.port = builder.port;
        this.portOnList = builder.portOnList;
        this.priority = builder.priority;
        this.procPath = builder.procPath;
        this.registryContent = builder.registryContent;
        this.registryKey = builder.registryKey;
        this.ruleType = builder.ruleType;
        this.selectionKey = builder.selectionKey;
        this.softWareOnList = builder.softWareOnList;
        this.status = builder.status;
        this.strategySourceType = builder.strategySourceType;
        this.supportsApproval = builder.supportsApproval;
        this.usContent = builder.usContent;
        this.usTitle = builder.usTitle;
        this.zhContent = builder.zhContent;
        this.zhTitle = builder.zhTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientRuleStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public Integer getActionType() {
        return this.actionType;
    }

    /**
     * @return allGroup
     */
    public Integer getAllGroup() {
        return this.allGroup;
    }

    /**
     * @return approvalId
     */
    public String getApprovalId() {
        return this.approvalId;
    }

    /**
     * @return cmdline
     */
    public String getCmdline() {
        return this.cmdline;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return excludeUserNameList
     */
    public java.util.List<String> getExcludeUserNameList() {
        return this.excludeUserNameList;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return inSwitch
     */
    public Boolean getInSwitch() {
        return this.inSwitch;
    }

    /**
     * @return includeGroupIdList
     */
    public java.util.List<String> getIncludeGroupIdList() {
        return this.includeGroupIdList;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return mainButtonTextCh
     */
    public String getMainButtonTextCh() {
        return this.mainButtonTextCh;
    }

    /**
     * @return mainButtonTextEn
     */
    public String getMainButtonTextEn() {
        return this.mainButtonTextEn;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return matchTargetIds
     */
    public java.util.List<String> getMatchTargetIds() {
        return this.matchTargetIds;
    }

    /**
     * @return md5List
     */
    public String getMd5List() {
        return this.md5List;
    }

    /**
     * @return minorButtonTextCh
     */
    public String getMinorButtonTextCh() {
        return this.minorButtonTextCh;
    }

    /**
     * @return minorButtonTextEn
     */
    public String getMinorButtonTextEn() {
        return this.minorButtonTextEn;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return newFilePath
     */
    public String getNewFilePath() {
        return this.newFilePath;
    }

    /**
     * @return outSwitch
     */
    public Boolean getOutSwitch() {
        return this.outSwitch;
    }

    /**
     * @return parentCmdline
     */
    public String getParentCmdline() {
        return this.parentCmdline;
    }

    /**
     * @return parentProcPath
     */
    public String getParentProcPath() {
        return this.parentProcPath;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return policyType
     */
    public Integer getPolicyType() {
        return this.policyType;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return portOnList
     */
    public java.util.List<String> getPortOnList() {
        return this.portOnList;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return procPath
     */
    public String getProcPath() {
        return this.procPath;
    }

    /**
     * @return registryContent
     */
    public String getRegistryContent() {
        return this.registryContent;
    }

    /**
     * @return registryKey
     */
    public String getRegistryKey() {
        return this.registryKey;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    /**
     * @return softWareOnList
     */
    public java.util.List<String> getSoftWareOnList() {
        return this.softWareOnList;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return strategySourceType
     */
    public String getStrategySourceType() {
        return this.strategySourceType;
    }

    /**
     * @return supportsApproval
     */
    public Integer getSupportsApproval() {
        return this.supportsApproval;
    }

    /**
     * @return usContent
     */
    public String getUsContent() {
        return this.usContent;
    }

    /**
     * @return usTitle
     */
    public String getUsTitle() {
        return this.usTitle;
    }

    /**
     * @return zhContent
     */
    public String getZhContent() {
        return this.zhContent;
    }

    /**
     * @return zhTitle
     */
    public String getZhTitle() {
        return this.zhTitle;
    }

    public static final class Builder extends Request.Builder<CreateClientRuleStrategyRequest, Builder> {
        private Integer actionType; 
        private Integer allGroup; 
        private String approvalId; 
        private String cmdline; 
        private String description; 
        private java.util.List<String> excludeUserNameList; 
        private String filePath; 
        private Boolean inSwitch; 
        private java.util.List<String> includeGroupIdList; 
        private String ip; 
        private String mainButtonTextCh; 
        private String mainButtonTextEn; 
        private String matchMode; 
        private java.util.List<String> matchTargetIds; 
        private String md5List; 
        private String minorButtonTextCh; 
        private String minorButtonTextEn; 
        private String name; 
        private String newFilePath; 
        private Boolean outSwitch; 
        private String parentCmdline; 
        private String parentProcPath; 
        private String platform; 
        private Integer policyType; 
        private String port; 
        private java.util.List<String> portOnList; 
        private Integer priority; 
        private String procPath; 
        private String registryContent; 
        private String registryKey; 
        private Integer ruleType; 
        private String selectionKey; 
        private java.util.List<String> softWareOnList; 
        private Integer status; 
        private String strategySourceType; 
        private Integer supportsApproval; 
        private String usContent; 
        private String usTitle; 
        private String zhContent; 
        private String zhTitle; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientRuleStrategyRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.allGroup = request.allGroup;
            this.approvalId = request.approvalId;
            this.cmdline = request.cmdline;
            this.description = request.description;
            this.excludeUserNameList = request.excludeUserNameList;
            this.filePath = request.filePath;
            this.inSwitch = request.inSwitch;
            this.includeGroupIdList = request.includeGroupIdList;
            this.ip = request.ip;
            this.mainButtonTextCh = request.mainButtonTextCh;
            this.mainButtonTextEn = request.mainButtonTextEn;
            this.matchMode = request.matchMode;
            this.matchTargetIds = request.matchTargetIds;
            this.md5List = request.md5List;
            this.minorButtonTextCh = request.minorButtonTextCh;
            this.minorButtonTextEn = request.minorButtonTextEn;
            this.name = request.name;
            this.newFilePath = request.newFilePath;
            this.outSwitch = request.outSwitch;
            this.parentCmdline = request.parentCmdline;
            this.parentProcPath = request.parentProcPath;
            this.platform = request.platform;
            this.policyType = request.policyType;
            this.port = request.port;
            this.portOnList = request.portOnList;
            this.priority = request.priority;
            this.procPath = request.procPath;
            this.registryContent = request.registryContent;
            this.registryKey = request.registryKey;
            this.ruleType = request.ruleType;
            this.selectionKey = request.selectionKey;
            this.softWareOnList = request.softWareOnList;
            this.status = request.status;
            this.strategySourceType = request.strategySourceType;
            this.supportsApproval = request.supportsApproval;
            this.usContent = request.usContent;
            this.usTitle = request.usTitle;
            this.zhContent = request.zhContent;
            this.zhTitle = request.zhTitle;
        } 

        /**
         * <p>The action of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: monitor mode.</li>
         * <li><strong>1</strong>: block startup.</li>
         * <li><strong>2</strong>: Block Mode.
         * Valid values for custom rules of proactive defense (PolicyType=2):</li>
         * <li><strong>0</strong>: add to allowlist and allow.</li>
         * <li><strong>1</strong>: add to blocklist and block.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>Specifies whether the policy takes effect for all user groups. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allGroup(Integer allGroup) {
            this.putQueryParameter("AllGroup", allGroup);
            this.allGroup = allGroup;
            return this;
        }

        /**
         * <p>The ID of the reporting and approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-b567d830cd17674c</p>
         */
        public Builder approvalId(String approvalId) {
            this.putQueryParameter("ApprovalId", approvalId);
            this.approvalId = approvalId;
            return this;
        }

        /**
         * <p>The matched process command line.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Windows\System32\RuntimeBroker.exe -Embedding</p>
         */
        public Builder cmdline(String cmdline) {
            this.putQueryParameter("Cmdline", cmdline);
            this.cmdline = cmdline;
            return this;
        }

        /**
         * <p>The description of the policy.</p>
         * <blockquote>
         * <p>The maximum length is 128 characters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of usernames for which the policy does not take effect.</p>
         */
        public Builder excludeUserNameList(java.util.List<String> excludeUserNameList) {
            String excludeUserNameListShrink = shrink(excludeUserNameList, "ExcludeUserNameList", "json");
            this.putQueryParameter("ExcludeUserNameList", excludeUserNameListShrink);
            this.excludeUserNameList = excludeUserNameList;
            return this;
        }

        /**
         * <p>The matched file path.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Program Files\Example\example.exe</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The inbound network switch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder inSwitch(Boolean inSwitch) {
            this.putQueryParameter("InSwitch", inSwitch);
            this.inSwitch = inSwitch;
            return this;
        }

        /**
         * <p>The list of IDs of the user groups for which the policy takes effect.</p>
         */
        public Builder includeGroupIdList(java.util.List<String> includeGroupIdList) {
            String includeGroupIdListShrink = shrink(includeGroupIdList, "IncludeGroupIdList", "json");
            this.putQueryParameter("IncludeGroupIdList", includeGroupIdListShrink);
            this.includeGroupIdList = includeGroupIdList;
            return this;
        }

        /**
         * <p>The matched IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.1</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The text of the primary button in the Chinese button configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder mainButtonTextCh(String mainButtonTextCh) {
            this.putQueryParameter("MainButtonTextCh", mainButtonTextCh);
            this.mainButtonTextCh = mainButtonTextCh;
            return this;
        }

        /**
         * <p>The text of the primary button in the English button configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder mainButtonTextEn(String mainButtonTextEn) {
            this.putQueryParameter("MainButtonTextEn", mainButtonTextEn);
            this.mainButtonTextEn = mainButtonTextEn;
            return this;
        }

        /**
         * <p>The effective scope mode. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: all user groups.</li>
         * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
         * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
         * <li><strong>DevTagNormal</strong>: specified device tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The list of effective scope targets. The meaning of the targets is determined by MatchMode.</p>
         */
        public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
            this.putQueryParameter("MatchTargetIds", matchTargetIds);
            this.matchTargetIds = matchTargetIds;
            return this;
        }

        /**
         * <p>The MD5 match string of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>d41d8cd98f00b204e9800998ecf8427e</p>
         */
        public Builder md5List(String md5List) {
            this.putQueryParameter("Md5List", md5List);
            this.md5List = md5List;
            return this;
        }

        /**
         * <p>The text of the secondary button in the Chinese button configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder minorButtonTextCh(String minorButtonTextCh) {
            this.putQueryParameter("MinorButtonTextCh", minorButtonTextCh);
            this.minorButtonTextCh = minorButtonTextCh;
            return this;
        }

        /**
         * <p>The text of the secondary button in the English button configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder minorButtonTextEn(String minorButtonTextEn) {
            this.putQueryParameter("MinorButtonTextEn", minorButtonTextEn);
            this.minorButtonTextEn = minorButtonTextEn;
            return this;
        }

        /**
         * <p>The Policy Name.</p>
         * <blockquote>
         * <p>The maximum length is 128 characters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The matched new file path.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Program Files\Example\renamed.exe</p>
         */
        public Builder newFilePath(String newFilePath) {
            this.putQueryParameter("NewFilePath", newFilePath);
            this.newFilePath = newFilePath;
            return this;
        }

        /**
         * <p>The outbound network switch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder outSwitch(Boolean outSwitch) {
            this.putQueryParameter("OutSwitch", outSwitch);
            this.outSwitch = outSwitch;
            return this;
        }

        /**
         * <p>The matched parent process command line.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Windows\System32\svchost.exe -k DcomLaunch -p</p>
         */
        public Builder parentCmdline(String parentCmdline) {
            this.putQueryParameter("ParentCmdline", parentCmdline);
            this.parentCmdline = parentCmdline;
            return this;
        }

        /**
         * <p>The matched parent process path.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Windows\System32\svchost.exe</p>
         */
        public Builder parentProcPath(String parentProcPath) {
            this.putQueryParameter("ParentProcPath", parentProcPath);
            this.parentProcPath = parentProcPath;
            return this;
        }

        /**
         * <p>The platform to which the rule applies. Valid values:</p>
         * <ul>
         * <li><strong>linux</strong></li>
         * <li><strong>windows</strong></li>
         * <li><strong>mac</strong></li>
         * <li><strong>all</strong>: all platforms.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: software hardening.</li>
         * <li><strong>1</strong>: firewall.</li>
         * <li><strong>2</strong>: proactive defense.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder policyType(Integer policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The matched port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The list of enabled ports.</p>
         * <blockquote>
         * <p>This parameter is valid only when the policy type is firewall.</p>
         * </blockquote>
         */
        public Builder portOnList(java.util.List<String> portOnList) {
            String portOnListShrink = shrink(portOnList, "PortOnList", "json");
            this.putQueryParameter("PortOnList", portOnListShrink);
            this.portOnList = portOnList;
            return this;
        }

        /**
         * <p>The policy priority. A smaller value indicates a higher priority. Valid values: greater than 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The matched process path.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Windows\System32\RuntimeBroker.exe</p>
         */
        public Builder procPath(String procPath) {
            this.putQueryParameter("ProcPath", procPath);
            this.procPath = procPath;
            return this;
        }

        /**
         * <p>The matched registry content.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleValue</p>
         */
        public Builder registryContent(String registryContent) {
            this.putQueryParameter("RegistryContent", registryContent);
            this.registryContent = registryContent;
            return this;
        }

        /**
         * <p>The matched registry key.</p>
         * 
         * <strong>example:</strong>
         * <p>HKEY_LOCAL_MACHINE\Software\Example</p>
         */
        public Builder registryKey(String registryKey) {
            this.putQueryParameter("RegistryKey", registryKey);
            this.registryKey = registryKey;
            return this;
        }

        /**
         * <p>The type of the defense rule. Valid values: 1 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The key of the switch configuration for the rule associated with the policy. This key can be used in ListSystemConfigRules and OperateTargetConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>a8d64565-ab8b-41a6-bd3d-14d0fc639285</p>
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        /**
         * <p>The list of main process names of the software for which integrity check is enabled. The elements correspond to the Process returned by GetSwitchInfoListByType.</p>
         */
        public Builder softWareOnList(java.util.List<String> softWareOnList) {
            String softWareOnListShrink = shrink(softWareOnList, "SoftWareOnList", "json");
            this.putQueryParameter("SoftWareOnList", softWareOnListShrink);
            this.softWareOnList = softWareOnList;
            return this;
        }

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The rule source for proactive defense (PolicyType=2). Valid values:</p>
         * <ul>
         * <li><strong>SYSTEM</strong>: system rules.</li>
         * <li><strong>CUSTOM</strong>: custom rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        public Builder strategySourceType(String strategySourceType) {
            this.putQueryParameter("StrategySourceType", strategySourceType);
            this.strategySourceType = strategySourceType;
            return this;
        }

        /**
         * <p>Specifies whether reporting and approval are supported. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not supported.</li>
         * <li><strong>1</strong>: supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder supportsApproval(Integer supportsApproval) {
            this.putQueryParameter("SupportsApproval", supportsApproval);
            this.supportsApproval = supportsApproval;
            return this;
        }

        /**
         * <p>The English content in the pop-up prompt configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder usContent(String usContent) {
            this.putQueryParameter("UsContent", usContent);
            this.usContent = usContent;
            return this;
        }

        /**
         * <p>The English title in the pop-up prompt configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder usTitle(String usTitle) {
            this.putQueryParameter("UsTitle", usTitle);
            this.usTitle = usTitle;
            return this;
        }

        /**
         * <p>The Chinese content in the pop-up prompt configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder zhContent(String zhContent) {
            this.putQueryParameter("ZhContent", zhContent);
            this.zhContent = zhContent;
            return this;
        }

        /**
         * <p>The Chinese title in the pop-up prompt configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder zhTitle(String zhTitle) {
            this.putQueryParameter("ZhTitle", zhTitle);
            this.zhTitle = zhTitle;
            return this;
        }

        @Override
        public CreateClientRuleStrategyRequest build() {
            return new CreateClientRuleStrategyRequest(this);
        } 

    } 

}
