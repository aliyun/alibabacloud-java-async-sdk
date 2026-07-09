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
 * {@link ObserveGroupInstance} extends {@link TeaModel}
 *
 * <p>ObserveGroupInstance</p>
 */
public class ObserveGroupInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("dimension")
    private java.util.Map<String, String> dimension;

    @com.aliyun.core.annotation.NameInMap("entityDomain")
    private String entityDomain;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private ObserveGroupInstance(Builder builder) {
        this.category = builder.category;
        this.dimension = builder.dimension;
        this.entityDomain = builder.entityDomain;
        this.entityType = builder.entityType;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return dimension
     */
    public java.util.Map<String, String> getDimension() {
        return this.dimension;
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

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String category; 
        private java.util.Map<String, String> dimension; 
        private String entityDomain; 
        private String entityType; 
        private String groupId; 
        private String instanceId; 
        private String instanceName; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.Map<String, String> tags; 
        private String userId; 

        private Builder() {
        } 

        private Builder(ObserveGroupInstance model) {
            this.category = model.category;
            this.dimension = model.dimension;
            this.entityDomain = model.entityDomain;
            this.entityType = model.entityType;
            this.groupId = model.groupId;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.regionId = model.regionId;
            this.resourceGroupId = model.resourceGroupId;
            this.tags = model.tags;
            this.userId = model.userId;
        } 

        /**
         * <p>实体分类（由 entityType 适配）。</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>监控维度键值对。</p>
         */
        public Builder dimension(java.util.Map<String, String> dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>实体域（如 acs）。</p>
         */
        public Builder entityDomain(String entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }

        /**
         * <p>实体类型（如 acs.ecs.instance）。</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>所属观测分组 ID。</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>实例 ID。</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>实例名称。</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>实例所属地域 ID。</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>实例所属资源组 ID。</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>实例标签键值对。</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>实例归属的用户 UID。</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public ObserveGroupInstance build() {
            return new ObserveGroupInstance(this);
        } 

    } 

}
