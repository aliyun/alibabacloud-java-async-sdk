// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorGroupsRequest</p>
 */
public class DescribeMonitorGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicTagRuleId")
    private String dynamicTagRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupFounderTagKey")
    private String groupFounderTagKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupFounderTagValue")
    private String groupFounderTagValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeTemplateHistory")
    private Boolean includeTemplateHistory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectContactGroups")
    private Boolean selectContactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private String types;

    private DescribeMonitorGroupsRequest(Builder builder) {
        super(builder);
        this.dynamicTagRuleId = builder.dynamicTagRuleId;
        this.groupFounderTagKey = builder.groupFounderTagKey;
        this.groupFounderTagValue = builder.groupFounderTagValue;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.includeTemplateHistory = builder.includeTemplateHistory;
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.selectContactGroups = builder.selectContactGroups;
        this.tag = builder.tag;
        this.type = builder.type;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicTagRuleId
     */
    public String getDynamicTagRuleId() {
        return this.dynamicTagRuleId;
    }

    /**
     * @return groupFounderTagKey
     */
    public String getGroupFounderTagKey() {
        return this.groupFounderTagKey;
    }

    /**
     * @return groupFounderTagValue
     */
    public String getGroupFounderTagValue() {
        return this.groupFounderTagValue;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return includeTemplateHistory
     */
    public Boolean getIncludeTemplateHistory() {
        return this.includeTemplateHistory;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return selectContactGroups
     */
    public Boolean getSelectContactGroups() {
        return this.selectContactGroups;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<DescribeMonitorGroupsRequest, Builder> {
        private String dynamicTagRuleId; 
        private String groupFounderTagKey; 
        private String groupFounderTagValue; 
        private String groupId; 
        private String groupName; 
        private Boolean includeTemplateHistory; 
        private String instanceId; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean selectContactGroups; 
        private java.util.List < Tag> tag; 
        private String type; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorGroupsRequest request) {
            super(request);
            this.dynamicTagRuleId = request.dynamicTagRuleId;
            this.groupFounderTagKey = request.groupFounderTagKey;
            this.groupFounderTagValue = request.groupFounderTagValue;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.includeTemplateHistory = request.includeTemplateHistory;
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.selectContactGroups = request.selectContactGroups;
            this.tag = request.tag;
            this.type = request.type;
            this.types = request.types;
        } 

        /**
         * The ID of the tag rule.
         */
        public Builder dynamicTagRuleId(String dynamicTagRuleId) {
            this.putQueryParameter("DynamicTagRuleId", dynamicTagRuleId);
            this.dynamicTagRuleId = dynamicTagRuleId;
            return this;
        }

        /**
         * The tag key that is created for the application group by using the tag rule.
         */
        public Builder groupFounderTagKey(String groupFounderTagKey) {
            this.putQueryParameter("GroupFounderTagKey", groupFounderTagKey);
            this.groupFounderTagKey = groupFounderTagKey;
            return this;
        }

        /**
         * The tag value that is created for the application group by using the tag rule.
         */
        public Builder groupFounderTagValue(String groupFounderTagValue) {
            this.putQueryParameter("GroupFounderTagValue", groupFounderTagValue);
            this.groupFounderTagValue = groupFounderTagValue;
            return this;
        }

        /**
         * The ID of the application group. Separate multiple application group IDs with commas (,).
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the application group.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Specifies whether to include the historical alert templates that are applied to the application group in the response. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder includeTemplateHistory(Boolean includeTemplateHistory) {
            this.putQueryParameter("IncludeTemplateHistory", includeTemplateHistory);
            this.includeTemplateHistory = includeTemplateHistory;
            return this;
        }

        /**
         * The instance ID. This parameter is used to query the application group to which the specified instance belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The keyword that is used for the search.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Pages start from page 1. Default value: 30.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether to include the alert contact groups in the response. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder selectContactGroups(Boolean selectContactGroups) {
            this.putQueryParameter("SelectContactGroups", selectContactGroups);
            this.selectContactGroups = selectContactGroups;
            return this;
        }

        /**
         * The tags of the application group.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of the application group. Valid values:
         * <p>
         * 
         * *   custom: a self-managed application group
         * *   ehpc_cluster: an application group that is synchronized from an Elastic High Performance Computing (E-HPC) cluster
         * *   kubernetes: an application group that is synchronized from a Container Service for Kubernetes (ACK) cluster
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The type of the application group. Valid values:
         * <p>
         * 
         * *   custom: a self-managed application group
         * *   ehpc_cluster: an application group that is synchronized from an Elastic High Performance Computing (E-HPC) cluster
         * *   kubernetes: an application group that is synchronized from a Container Service for Kubernetes (ACK) cluster
         * *   tag: an application group that is automatically created by using tags
         * *   resMgr: an application group that is created by using resource groups
         * *   ess: an application group that is synchronized from Auto Scaling (ESS)
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public DescribeMonitorGroupsRequest build() {
            return new DescribeMonitorGroupsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key of the application group. Valid values of N: 1 to 5.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the application group. Valid values of N: 1 to 5.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
