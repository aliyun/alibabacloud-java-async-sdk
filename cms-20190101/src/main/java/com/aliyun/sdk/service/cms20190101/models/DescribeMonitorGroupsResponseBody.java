// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupsResponseBody</p>
 */
public class DescribeMonitorGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeMonitorGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Resources resources; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeMonitorGroupsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The value 200 indicates success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F02B299A-D374-4595-9F55-7534D604F132</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMonitorGroupsResponseBody build() {
            return new DescribeMonitorGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class ContactGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ContactGroup(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroup create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(ContactGroup model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ContactGroup build() {
                return new ContactGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
        private java.util.List<ContactGroup> contactGroup;

        private ContactGroups(Builder builder) {
            this.contactGroup = builder.contactGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroups create() {
            return builder().build();
        }

        /**
         * @return contactGroup
         */
        public java.util.List<ContactGroup> getContactGroup() {
            return this.contactGroup;
        }

        public static final class Builder {
            private java.util.List<ContactGroup> contactGroup; 

            private Builder() {
            } 

            private Builder(ContactGroups model) {
                this.contactGroup = model.contactGroup;
            } 

            /**
             * ContactGroup.
             */
            public Builder contactGroup(java.util.List<ContactGroup> contactGroup) {
                this.contactGroup = contactGroup;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class TemplateIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private java.util.List<String> templateId;

        private TemplateIds(Builder builder) {
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateIds create() {
            return builder().build();
        }

        /**
         * @return templateId
         */
        public java.util.List<String> getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private java.util.List<String> templateId; 

            private Builder() {
            } 

            private Builder(TemplateIds model) {
                this.templateId = model.templateId;
            } 

            /**
             * TemplateId.
             */
            public Builder templateId(java.util.List<String> templateId) {
                this.templateId = templateId;
                return this;
            }

            public TemplateIds build() {
                return new TemplateIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class TemplateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectTime")
        private Long effectTime;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Ver")
        private String ver;

        private TemplateInfo(Builder builder) {
            this.effectTime = builder.effectTime;
            this.templateId = builder.templateId;
            this.ver = builder.ver;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfo create() {
            return builder().build();
        }

        /**
         * @return effectTime
         */
        public Long getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return ver
         */
        public String getVer() {
            return this.ver;
        }

        public static final class Builder {
            private Long effectTime; 
            private String templateId; 
            private String ver; 

            private Builder() {
            } 

            private Builder(TemplateInfo model) {
                this.effectTime = model.effectTime;
                this.templateId = model.templateId;
                this.ver = model.ver;
            } 

            /**
             * EffectTime.
             */
            public Builder effectTime(Long effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * Ver.
             */
            public Builder ver(String ver) {
                this.ver = ver;
                return this;
            }

            public TemplateInfo build() {
                return new TemplateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class TemplateInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateInfo")
        private java.util.List<TemplateInfo> templateInfo;

        private TemplateInfos(Builder builder) {
            this.templateInfo = builder.templateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfos create() {
            return builder().build();
        }

        /**
         * @return templateInfo
         */
        public java.util.List<TemplateInfo> getTemplateInfo() {
            return this.templateInfo;
        }

        public static final class Builder {
            private java.util.List<TemplateInfo> templateInfo; 

            private Builder() {
            } 

            private Builder(TemplateInfos model) {
                this.templateInfo = model.templateInfo;
            } 

            /**
             * TemplateInfo.
             */
            public Builder templateInfo(java.util.List<TemplateInfo> templateInfo) {
                this.templateInfo = templateInfo;
                return this;
            }

            public TemplateInfos build() {
                return new TemplateInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindUrl")
        private String bindUrl;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @com.aliyun.core.annotation.NameInMap("DynamicTagRuleId")
        private String dynamicTagRuleId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupFounderTagKey")
        private String groupFounderTagKey;

        @com.aliyun.core.annotation.NameInMap("GroupFounderTagValue")
        private String groupFounderTagValue;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TemplateIds")
        private TemplateIds templateIds;

        @com.aliyun.core.annotation.NameInMap("TemplateInfos")
        private TemplateInfos templateInfos;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Resource(Builder builder) {
            this.bindUrl = builder.bindUrl;
            this.contactGroups = builder.contactGroups;
            this.dynamicTagRuleId = builder.dynamicTagRuleId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupFounderTagKey = builder.groupFounderTagKey;
            this.groupFounderTagValue = builder.groupFounderTagValue;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceId = builder.serviceId;
            this.tags = builder.tags;
            this.templateIds = builder.templateIds;
            this.templateInfos = builder.templateInfos;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return bindUrl
         */
        public String getBindUrl() {
            return this.bindUrl;
        }

        /**
         * @return contactGroups
         */
        public ContactGroups getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return dynamicTagRuleId
         */
        public String getDynamicTagRuleId() {
            return this.dynamicTagRuleId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
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
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return templateIds
         */
        public TemplateIds getTemplateIds() {
            return this.templateIds;
        }

        /**
         * @return templateInfos
         */
        public TemplateInfos getTemplateInfos() {
            return this.templateInfos;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bindUrl; 
            private ContactGroups contactGroups; 
            private String dynamicTagRuleId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String groupFounderTagKey; 
            private String groupFounderTagValue; 
            private Long groupId; 
            private String groupName; 
            private String resourceGroupId; 
            private String serviceId; 
            private Tags tags; 
            private TemplateIds templateIds; 
            private TemplateInfos templateInfos; 
            private String type; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.bindUrl = model.bindUrl;
                this.contactGroups = model.contactGroups;
                this.dynamicTagRuleId = model.dynamicTagRuleId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupFounderTagKey = model.groupFounderTagKey;
                this.groupFounderTagValue = model.groupFounderTagValue;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceId = model.serviceId;
                this.tags = model.tags;
                this.templateIds = model.templateIds;
                this.templateInfos = model.templateInfos;
                this.type = model.type;
            } 

            /**
             * BindUrl.
             */
            public Builder bindUrl(String bindUrl) {
                this.bindUrl = bindUrl;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * DynamicTagRuleId.
             */
            public Builder dynamicTagRuleId(String dynamicTagRuleId) {
                this.dynamicTagRuleId = dynamicTagRuleId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GroupFounderTagKey.
             */
            public Builder groupFounderTagKey(String groupFounderTagKey) {
                this.groupFounderTagKey = groupFounderTagKey;
                return this;
            }

            /**
             * GroupFounderTagValue.
             */
            public Builder groupFounderTagValue(String groupFounderTagValue) {
                this.groupFounderTagValue = groupFounderTagValue;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TemplateIds.
             */
            public Builder templateIds(TemplateIds templateIds) {
                this.templateIds = templateIds;
                return this;
            }

            /**
             * TemplateInfos.
             */
            public Builder templateInfos(TemplateInfos templateInfos) {
                this.templateInfos = templateInfos;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupsResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List<Resource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List<Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<Resource> resource; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.resource = model.resource;
            } 

            /**
             * Resource.
             */
            public Builder resource(java.util.List<Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
