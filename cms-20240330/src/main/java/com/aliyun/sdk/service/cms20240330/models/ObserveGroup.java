// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ObserveGroup} extends {@link TeaModel}
 *
 * <p>ObserveGroup</p>
 */
public class ObserveGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("discoverRules")
    private String discoverRules;

    @com.aliyun.core.annotation.NameInMap("entityCounts")
    private java.util.Map<String, Integer> entityCounts;

    @com.aliyun.core.annotation.NameInMap("extraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.NameInMap("favorited")
    private Boolean favorited;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.NameInMap("health")
    private Integer health;

    @com.aliyun.core.annotation.NameInMap("modifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("originGroupId")
    private String originGroupId;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("sourceOrigin")
    private String sourceOrigin;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private ObserveGroup(Builder builder) {
        this.aliUid = builder.aliUid;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.discoverRules = builder.discoverRules;
        this.entityCounts = builder.entityCounts;
        this.extraInfo = builder.extraInfo;
        this.favorited = builder.favorited;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.health = builder.health;
        this.modifyTime = builder.modifyTime;
        this.originGroupId = builder.originGroupId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceOrigin = builder.sourceOrigin;
        this.tags = builder.tags;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return discoverRules
     */
    public String getDiscoverRules() {
        return this.discoverRules;
    }

    /**
     * @return entityCounts
     */
    public java.util.Map<String, Integer> getEntityCounts() {
        return this.entityCounts;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return favorited
     */
    public Boolean getFavorited() {
        return this.favorited;
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
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return health
     */
    public Integer getHealth() {
        return this.health;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return originGroupId
     */
    public String getOriginGroupId() {
        return this.originGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceOrigin
     */
    public String getSourceOrigin() {
        return this.sourceOrigin;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String aliUid; 
        private String createTime; 
        private String description; 
        private String discoverRules; 
        private java.util.Map<String, Integer> entityCounts; 
        private String extraInfo; 
        private Boolean favorited; 
        private String groupId; 
        private String groupName; 
        private String groupType; 
        private Integer health; 
        private String modifyTime; 
        private String originGroupId; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceOrigin; 
        private java.util.List<Tags> tags; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(ObserveGroup model) {
            this.aliUid = model.aliUid;
            this.createTime = model.createTime;
            this.description = model.description;
            this.discoverRules = model.discoverRules;
            this.entityCounts = model.entityCounts;
            this.extraInfo = model.extraInfo;
            this.favorited = model.favorited;
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.groupType = model.groupType;
            this.health = model.health;
            this.modifyTime = model.modifyTime;
            this.originGroupId = model.originGroupId;
            this.regionId = model.regionId;
            this.resourceGroupId = model.resourceGroupId;
            this.sourceOrigin = model.sourceOrigin;
            this.tags = model.tags;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>分组归属的阿里云主账号 UID。</p>
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>创建时间，UTC 格式 yyyy-MM-ddTHH:mm:ssZ。</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>观测分组描述（业务用途说明）。</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>实体发现规则列表，定义分组自动匹配哪些实体。</p>
         */
        public Builder discoverRules(String discoverRules) {
            this.discoverRules = discoverRules;
            return this;
        }

        /**
         * <p>各分类实体数量。key=分类 domain（acs=云产品 / apm / rum，可扩展），value=该分类下属于本分组的实体数。仅 withEntityCount=true 时返回。</p>
         */
        public Builder entityCounts(java.util.Map<String, Integer> entityCounts) {
            this.entityCounts = entityCounts;
            return this;
        }

        /**
         * <p>扩展信息（JSON 字符串，承载告警模板/联系人组/暂停策略等）。</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>当前用户是否已关注该分组（「我的关注」筛选依据）。</p>
         */
        public Builder favorited(Boolean favorited) {
            this.favorited = favorited;
            return this;
        }

        /**
         * <p>观测分组全局唯一 ID，格式 og-&lt;16位hash&gt;，指标/告警/控制台统一使用。</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>观测分组名称（同 workspace 下唯一）。</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>观测分组类型。</p>
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>分组健康状态：-1 未知（占位）/ 1 健康 / 0 不健康。</p>
         */
        public Builder health(Integer health) {
            this.health = health;
            return this;
        }

        /**
         * <p>最后修改时间，UTC 格式 yyyy-MM-ddTHH:mm:ssZ。资源任意属性变更时自动更新。</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>仅 synced_from_1_0 时填值，存 1.0 应用分组的 product_group.id。</p>
         */
        public Builder originGroupId(String originGroupId) {
            this.originGroupId = originGroupId;
            return this;
        }

        /**
         * <p>分组所属地域 ID。</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>阿里云资源组 ID。</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>数据来源：native_2_0（2.0 原生）/ synced_from_1_0（从 1.0 应用分组同步）。</p>
         */
        public Builder sourceOrigin(String sourceOrigin) {
            this.sourceOrigin = sourceOrigin;
            return this;
        }

        /**
         * <p>资源标签（阿里云标准标签），键值对数组。</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>分组归属的 workspace ID（workspace 级归属，创建后不可变）。</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public ObserveGroup build() {
            return new ObserveGroup(this);
        } 

    } 

    /**
     * 
     * {@link ObserveGroup} extends {@link TeaModel}
     *
     * <p>ObserveGroup</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>标签键。</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>标签值。</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
