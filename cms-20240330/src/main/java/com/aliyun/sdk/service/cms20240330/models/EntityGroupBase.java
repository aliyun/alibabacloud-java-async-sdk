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
 * {@link EntityGroupBase} extends {@link TeaModel}
 *
 * <p>EntityGroupBase</p>
 */
public class EntityGroupBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("entityGroupId")
    private String entityGroupId;

    @com.aliyun.core.annotation.NameInMap("entityGroupName")
    private String entityGroupName;

    @com.aliyun.core.annotation.NameInMap("entityQueries")
    private java.util.List<EntityQueries> entityQueries;

    @com.aliyun.core.annotation.NameInMap("entityRules")
    private EntityDiscoverRule entityRules;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private EntityGroupBase(Builder builder) {
        this.description = builder.description;
        this.entityGroupId = builder.entityGroupId;
        this.entityGroupName = builder.entityGroupName;
        this.entityQueries = builder.entityQueries;
        this.entityRules = builder.entityRules;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityGroupBase create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entityGroupId
     */
    public String getEntityGroupId() {
        return this.entityGroupId;
    }

    /**
     * @return entityGroupName
     */
    public String getEntityGroupName() {
        return this.entityGroupName;
    }

    /**
     * @return entityQueries
     */
    public java.util.List<EntityQueries> getEntityQueries() {
        return this.entityQueries;
    }

    /**
     * @return entityRules
     */
    public EntityDiscoverRule getEntityRules() {
        return this.entityRules;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String description; 
        private String entityGroupId; 
        private String entityGroupName; 
        private java.util.List<EntityQueries> entityQueries; 
        private EntityDiscoverRule entityRules; 
        private String regionId; 
        private String userId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(EntityGroupBase model) {
            this.description = model.description;
            this.entityGroupId = model.entityGroupId;
            this.entityGroupName = model.entityGroupName;
            this.entityQueries = model.entityQueries;
            this.entityRules = model.entityRules;
            this.regionId = model.regionId;
            this.userId = model.userId;
            this.workspace = model.workspace;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * entityGroupId.
         */
        public Builder entityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }

        /**
         * entityGroupName.
         */
        public Builder entityGroupName(String entityGroupName) {
            this.entityGroupName = entityGroupName;
            return this;
        }

        /**
         * entityQueries.
         */
        public Builder entityQueries(java.util.List<EntityQueries> entityQueries) {
            this.entityQueries = entityQueries;
            return this;
        }

        /**
         * entityRules.
         */
        public Builder entityRules(EntityDiscoverRule entityRules) {
            this.entityRules = entityRules;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public EntityGroupBase build() {
            return new EntityGroupBase(this);
        } 

    } 

    /**
     * 
     * {@link EntityGroupBase} extends {@link TeaModel}
     *
     * <p>EntityGroupBase</p>
     */
    public static class EntityQueries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("spl")
        private String spl;

        private EntityQueries(Builder builder) {
            this.entityType = builder.entityType;
            this.spl = builder.spl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityQueries create() {
            return builder().build();
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return spl
         */
        public String getSpl() {
            return this.spl;
        }

        public static final class Builder {
            private String entityType; 
            private String spl; 

            private Builder() {
            } 

            private Builder(EntityQueries model) {
                this.entityType = model.entityType;
                this.spl = model.spl;
            } 

            /**
             * entityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * spl.
             */
            public Builder spl(String spl) {
                this.spl = spl;
                return this;
            }

            public EntityQueries build() {
                return new EntityQueries(this);
            } 

        } 

    }
}
