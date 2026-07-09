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
 * {@link ObserveGroupDetail} extends {@link TeaModel}
 *
 * <p>ObserveGroupDetail</p>
 */
public class ObserveGroupDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("discoverRules")
    private String discoverRules;

    @com.aliyun.core.annotation.NameInMap("entitySummaries")
    private java.util.List<EntitySummaries> entitySummaries;

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

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private ObserveGroupDetail(Builder builder) {
        this.aliUid = builder.aliUid;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.discoverRules = builder.discoverRules;
        this.entitySummaries = builder.entitySummaries;
        this.extraInfo = builder.extraInfo;
        this.favorited = builder.favorited;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.modifyTime = builder.modifyTime;
        this.originGroupId = builder.originGroupId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceOrigin = builder.sourceOrigin;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupDetail create() {
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
     * @return entitySummaries
     */
    public java.util.List<EntitySummaries> getEntitySummaries() {
        return this.entitySummaries;
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
        private java.util.List<EntitySummaries> entitySummaries; 
        private String extraInfo; 
        private Boolean favorited; 
        private String groupId; 
        private String groupName; 
        private String groupType; 
        private String modifyTime; 
        private String originGroupId; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceOrigin; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(ObserveGroupDetail model) {
            this.aliUid = model.aliUid;
            this.createTime = model.createTime;
            this.description = model.description;
            this.discoverRules = model.discoverRules;
            this.entitySummaries = model.entitySummaries;
            this.extraInfo = model.extraInfo;
            this.favorited = model.favorited;
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.groupType = model.groupType;
            this.modifyTime = model.modifyTime;
            this.originGroupId = model.originGroupId;
            this.regionId = model.regionId;
            this.resourceGroupId = model.resourceGroupId;
            this.sourceOrigin = model.sourceOrigin;
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
         * <p>分组内实体按类型的统计。</p>
         */
        public Builder entitySummaries(java.util.List<EntitySummaries> entitySummaries) {
            this.entitySummaries = entitySummaries;
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
         * <p>当前用户是否已关注该分组。</p>
         */
        public Builder favorited(Boolean favorited) {
            this.favorited = favorited;
            return this;
        }

        /**
         * groupId.
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
         * <p>分组归属的 workspace ID（workspace 级归属，创建后不可变）。</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public ObserveGroupDetail build() {
            return new ObserveGroupDetail(this);
        } 

    } 

    /**
     * 
     * {@link ObserveGroupDetail} extends {@link TeaModel}
     *
     * <p>ObserveGroupDetail</p>
     */
    public static class EntitySummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entityCategory")
        private String entityCategory;

        @com.aliyun.core.annotation.NameInMap("entityCount")
        private Integer entityCount;

        @com.aliyun.core.annotation.NameInMap("entityDomain")
        private String entityDomain;

        @com.aliyun.core.annotation.NameInMap("entityType")
        private String entityType;

        private EntitySummaries(Builder builder) {
            this.entityCategory = builder.entityCategory;
            this.entityCount = builder.entityCount;
            this.entityDomain = builder.entityDomain;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntitySummaries create() {
            return builder().build();
        }

        /**
         * @return entityCategory
         */
        public String getEntityCategory() {
            return this.entityCategory;
        }

        /**
         * @return entityCount
         */
        public Integer getEntityCount() {
            return this.entityCount;
        }

        /**
         * @return entityDomain
         */
        public String getEntityDomain() {
            return this.entityDomain;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityCategory; 
            private Integer entityCount; 
            private String entityDomain; 
            private String entityType; 

            private Builder() {
            } 

            private Builder(EntitySummaries model) {
                this.entityCategory = model.entityCategory;
                this.entityCount = model.entityCount;
                this.entityDomain = model.entityDomain;
                this.entityType = model.entityType;
            } 

            /**
             * <p>实体分类。</p>
             */
            public Builder entityCategory(String entityCategory) {
                this.entityCategory = entityCategory;
                return this;
            }

            /**
             * <p>实体数量。</p>
             */
            public Builder entityCount(Integer entityCount) {
                this.entityCount = entityCount;
                return this;
            }

            /**
             * <p>实体域。</p>
             */
            public Builder entityDomain(String entityDomain) {
                this.entityDomain = entityDomain;
                return this;
            }

            /**
             * <p>实体类型。</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public EntitySummaries build() {
                return new EntitySummaries(this);
            } 

        } 

    }
}
