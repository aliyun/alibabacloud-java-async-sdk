// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link Permission} extends {@link TeaModel}
 *
 * <p>Permission</p>
 */
public class Permission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action_list")
    private java.util.List<ActionList> actionList;

    @com.aliyun.core.annotation.NameInMap("collection")
    private String collection;

    @com.aliyun.core.annotation.NameInMap("condition")
    private PermissionCondition condition;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("effect")
    private String effect;

    @com.aliyun.core.annotation.NameInMap("identity_id")
    private String identityId;

    @com.aliyun.core.annotation.NameInMap("identity_type")
    private String identityType;

    @com.aliyun.core.annotation.NameInMap("resource")
    private String resource;

    @com.aliyun.core.annotation.NameInMap("resource_type")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("user_tags")
    private java.util.List<String> userTags;

    private Permission(Builder builder) {
        this.actionList = builder.actionList;
        this.collection = builder.collection;
        this.condition = builder.condition;
        this.createdAt = builder.createdAt;
        this.effect = builder.effect;
        this.identityId = builder.identityId;
        this.identityType = builder.identityType;
        this.resource = builder.resource;
        this.resourceType = builder.resourceType;
        this.updatedAt = builder.updatedAt;
        this.userTags = builder.userTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Permission create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionList
     */
    public java.util.List<ActionList> getActionList() {
        return this.actionList;
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return condition
     */
    public PermissionCondition getCondition() {
        return this.condition;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userTags
     */
    public java.util.List<String> getUserTags() {
        return this.userTags;
    }

    public static final class Builder {
        private java.util.List<ActionList> actionList; 
        private String collection; 
        private PermissionCondition condition; 
        private Long createdAt; 
        private String effect; 
        private String identityId; 
        private String identityType; 
        private String resource; 
        private String resourceType; 
        private Long updatedAt; 
        private java.util.List<String> userTags; 

        private Builder() {
        } 

        private Builder(Permission model) {
            this.actionList = model.actionList;
            this.collection = model.collection;
            this.condition = model.condition;
            this.createdAt = model.createdAt;
            this.effect = model.effect;
            this.identityId = model.identityId;
            this.identityType = model.identityType;
            this.resource = model.resource;
            this.resourceType = model.resourceType;
            this.updatedAt = model.updatedAt;
            this.userTags = model.userTags;
        } 

        /**
         * action_list.
         */
        public Builder actionList(java.util.List<ActionList> actionList) {
            this.actionList = actionList;
            return this;
        }

        /**
         * collection.
         */
        public Builder collection(String collection) {
            this.collection = collection;
            return this;
        }

        /**
         * condition.
         */
        public Builder condition(PermissionCondition condition) {
            this.condition = condition;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * effect.
         */
        public Builder effect(String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * identity_id.
         */
        public Builder identityId(String identityId) {
            this.identityId = identityId;
            return this;
        }

        /**
         * identity_type.
         */
        public Builder identityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        /**
         * resource.
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * resource_type.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_tags.
         */
        public Builder userTags(java.util.List<String> userTags) {
            this.userTags = userTags;
            return this;
        }

        public Permission build() {
            return new Permission(this);
        } 

    } 

    /**
     * 
     * {@link Permission} extends {@link TeaModel}
     *
     * <p>Permission</p>
     */
    public static class ActionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        private ActionList(Builder builder) {
            this.action = builder.action;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        public static final class Builder {
            private String action; 

            private Builder() {
            } 

            private Builder(ActionList model) {
                this.action = model.action;
            } 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
}
