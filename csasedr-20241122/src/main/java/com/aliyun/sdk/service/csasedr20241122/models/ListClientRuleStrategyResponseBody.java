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
 * {@link ListClientRuleStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientRuleStrategyResponseBody</p>
 */
public class ListClientRuleStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClientRuleStrategyResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientRuleStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClientRuleStrategyResponseBody model) {
            this.list = model.list;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of policies.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>45B2D3AF-0E5F-5D67-944C-2AD5E354B5C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientRuleStrategyResponseBody build() {
            return new ListClientRuleStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClientRuleStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientRuleStrategyResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("AllGroup")
        private Integer allGroup;

        @com.aliyun.core.annotation.NameInMap("ApprovalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExcludeUserNameList")
        private java.util.List<String> excludeUserNameList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InSwitch")
        private Boolean inSwitch;

        @com.aliyun.core.annotation.NameInMap("IncludeGroupIdList")
        private java.util.List<String> includeGroupIdList;

        @com.aliyun.core.annotation.NameInMap("MainButtonTextCh")
        private String mainButtonTextCh;

        @com.aliyun.core.annotation.NameInMap("MainButtonTextEn")
        private String mainButtonTextEn;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("MatchTargetIds")
        private java.util.List<String> matchTargetIds;

        @com.aliyun.core.annotation.NameInMap("MinorButtonTextCh")
        private String minorButtonTextCh;

        @com.aliyun.core.annotation.NameInMap("MinorButtonTextEn")
        private String minorButtonTextEn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutSwitch")
        private Boolean outSwitch;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private Integer policyType;

        @com.aliyun.core.annotation.NameInMap("PortOnList")
        private java.util.List<String> portOnList;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("SelectionKey")
        private String selectionKey;

        @com.aliyun.core.annotation.NameInMap("SoftWareOnList")
        private java.util.List<String> softWareOnList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StrategySourceType")
        private String strategySourceType;

        @com.aliyun.core.annotation.NameInMap("SupportsApproval")
        private Integer supportsApproval;

        @com.aliyun.core.annotation.NameInMap("UsContent")
        private String usContent;

        @com.aliyun.core.annotation.NameInMap("UsTitle")
        private String usTitle;

        @com.aliyun.core.annotation.NameInMap("ZhContent")
        private String zhContent;

        @com.aliyun.core.annotation.NameInMap("ZhTitle")
        private String zhTitle;

        private List(Builder builder) {
            this.actionType = builder.actionType;
            this.allGroup = builder.allGroup;
            this.approvalId = builder.approvalId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.excludeUserNameList = builder.excludeUserNameList;
            this.id = builder.id;
            this.inSwitch = builder.inSwitch;
            this.includeGroupIdList = builder.includeGroupIdList;
            this.mainButtonTextCh = builder.mainButtonTextCh;
            this.mainButtonTextEn = builder.mainButtonTextEn;
            this.matchMode = builder.matchMode;
            this.matchTargetIds = builder.matchTargetIds;
            this.minorButtonTextCh = builder.minorButtonTextCh;
            this.minorButtonTextEn = builder.minorButtonTextEn;
            this.name = builder.name;
            this.outSwitch = builder.outSwitch;
            this.policyType = builder.policyType;
            this.portOnList = builder.portOnList;
            this.priority = builder.priority;
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

        public static List create() {
            return builder().build();
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return outSwitch
         */
        public Boolean getOutSwitch() {
            return this.outSwitch;
        }

        /**
         * @return policyType
         */
        public Integer getPolicyType() {
            return this.policyType;
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

        public static final class Builder {
            private Integer actionType; 
            private Integer allGroup; 
            private String approvalId; 
            private Long createTime; 
            private String description; 
            private java.util.List<String> excludeUserNameList; 
            private Long id; 
            private Boolean inSwitch; 
            private java.util.List<String> includeGroupIdList; 
            private String mainButtonTextCh; 
            private String mainButtonTextEn; 
            private String matchMode; 
            private java.util.List<String> matchTargetIds; 
            private String minorButtonTextCh; 
            private String minorButtonTextEn; 
            private String name; 
            private Boolean outSwitch; 
            private Integer policyType; 
            private java.util.List<String> portOnList; 
            private Integer priority; 
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
            } 

            private Builder(List model) {
                this.actionType = model.actionType;
                this.allGroup = model.allGroup;
                this.approvalId = model.approvalId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.excludeUserNameList = model.excludeUserNameList;
                this.id = model.id;
                this.inSwitch = model.inSwitch;
                this.includeGroupIdList = model.includeGroupIdList;
                this.mainButtonTextCh = model.mainButtonTextCh;
                this.mainButtonTextEn = model.mainButtonTextEn;
                this.matchMode = model.matchMode;
                this.matchTargetIds = model.matchTargetIds;
                this.minorButtonTextCh = model.minorButtonTextCh;
                this.minorButtonTextEn = model.minorButtonTextEn;
                this.name = model.name;
                this.outSwitch = model.outSwitch;
                this.policyType = model.policyType;
                this.portOnList = model.portOnList;
                this.priority = model.priority;
                this.selectionKey = model.selectionKey;
                this.softWareOnList = model.softWareOnList;
                this.status = model.status;
                this.strategySourceType = model.strategySourceType;
                this.supportsApproval = model.supportsApproval;
                this.usContent = model.usContent;
                this.usTitle = model.usTitle;
                this.zhContent = model.zhContent;
                this.zhTitle = model.zhTitle;
            } 

            /**
             * <p>The policy action. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Monitor mode.</li>
             * <li><strong>1</strong>: Block startup.</li>
             * <li><strong>2</strong>: Block mode.</li>
             * </ul>
             * <p>Valid values for custom rules of proactive defense (PolicyType=2):</p>
             * <ul>
             * <li><strong>0</strong>: Allow.</li>
             * <li><strong>1</strong>: Block.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>Specifies whether the policy applies to all user groups. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No.</li>
             * <li><strong>1</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder allGroup(Integer allGroup) {
                this.allGroup = allGroup;
                return this;
            }

            /**
             * <p>The instance ID of the approval.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-3f9bcedb9643b956</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>The timestamp when the policy was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792627200000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of usernames to which the policy does not apply.</p>
             */
            public Builder excludeUserNameList(java.util.List<String> excludeUserNameList) {
                this.excludeUserNameList = excludeUserNameList;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1938</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The switch for inbound network traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder inSwitch(Boolean inSwitch) {
                this.inSwitch = inSwitch;
                return this;
            }

            /**
             * <p>The list of targets in the effective scope.</p>
             */
            public Builder includeGroupIdList(java.util.List<String> includeGroupIdList) {
                this.includeGroupIdList = includeGroupIdList;
                return this;
            }

            /**
             * <p>The text of the primary button in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder mainButtonTextCh(String mainButtonTextCh) {
                this.mainButtonTextCh = mainButtonTextCh;
                return this;
            }

            /**
             * <p>The text of the primary button in English.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder mainButtonTextEn(String mainButtonTextEn) {
                this.mainButtonTextEn = mainButtonTextEn;
                return this;
            }

            /**
             * <p>The effective scope mode. Valid values:</p>
             * <ul>
             * <li><strong>UserGroupAll</strong>: All user groups.</li>
             * <li><strong>UserGroupNormal</strong>: Specified user groups.</li>
             * <li><strong>DeviceGroupNormal</strong>: Specified device groups.</li>
             * <li><strong>DevTagNormal</strong>: Specified device tags.</li>
             * </ul>
             * <p>The meaning of MatchTargetIds is determined by this field.</p>
             * 
             * <strong>example:</strong>
             * <p>UserGroupNormal</p>
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * <p>The list of targets in the effective scope. UserGroupNormal corresponds to user group IDs, DeviceGroupNormal corresponds to device group IDs, and DevTagNormal corresponds to device tags. If MatchMode is set to UserGroupAll, you do not need to specify targets.</p>
             */
            public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
                this.matchTargetIds = matchTargetIds;
                return this;
            }

            /**
             * <p>The text of the secondary button in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder minorButtonTextCh(String minorButtonTextCh) {
                this.minorButtonTextCh = minorButtonTextCh;
                return this;
            }

            /**
             * <p>The text of the secondary button in English.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder minorButtonTextEn(String minorButtonTextEn) {
                this.minorButtonTextEn = minorButtonTextEn;
                return this;
            }

            /**
             * <p>The Policy Name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The switch for outbound network traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder outSwitch(Boolean outSwitch) {
                this.outSwitch = outSwitch;
                return this;
            }

            /**
             * <p>The policy type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Software hardening.</li>
             * <li><strong>1</strong>: Firewall.</li>
             * <li><strong>2</strong>: Proactive defense.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder policyType(Integer policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The list of enabled ports.</p>
             */
            public Builder portOnList(java.util.List<String> portOnList) {
                this.portOnList = portOnList;
                return this;
            }

            /**
             * <p>The policy priority. A smaller value indicates a higher priority. Valid values: greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The association key of the policy configuration, which is used to associate the policy with its process or switch configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>a8d64565-ab8b-41a6-bd3d-14d0fc639285</p>
             */
            public Builder selectionKey(String selectionKey) {
                this.selectionKey = selectionKey;
                return this;
            }

            /**
             * <p>The list of main process names of the software for which integrity check is enabled. The elements correspond to the Process field returned by GetSwitchInfoListByType.</p>
             */
            public Builder softWareOnList(java.util.List<String> softWareOnList) {
                this.softWareOnList = softWareOnList;
                return this;
            }

            /**
             * <p>The status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Disabled.</li>
             * <li><strong>1</strong>: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The source of the rule for proactive defense (PolicyType=2). Valid values:</p>
             * <ul>
             * <li><strong>SYSTEM</strong>: System rule.</li>
             * <li><strong>CUSTOM</strong>: Custom rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder strategySourceType(String strategySourceType) {
                this.strategySourceType = strategySourceType;
                return this;
            }

            /**
             * <p>Specifies whether reporting and approval are supported. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not supported.</li>
             * <li><strong>1</strong>: Supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder supportsApproval(Integer supportsApproval) {
                this.supportsApproval = supportsApproval;
                return this;
            }

            /**
             * <p>The content of the pop-up prompt in English.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder usContent(String usContent) {
                this.usContent = usContent;
                return this;
            }

            /**
             * <p>The title of the pop-up prompt in English.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder usTitle(String usTitle) {
                this.usTitle = usTitle;
                return this;
            }

            /**
             * <p>The content of the pop-up prompt in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder zhContent(String zhContent) {
                this.zhContent = zhContent;
                return this;
            }

            /**
             * <p>The title of the pop-up prompt in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder zhTitle(String zhTitle) {
                this.zhTitle = zhTitle;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClientRuleStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientRuleStrategyResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number of the current page for the paged query with paging.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The maximum number of entries returned per page for the paged query with paging.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
