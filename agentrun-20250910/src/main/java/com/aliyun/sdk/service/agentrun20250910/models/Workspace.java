// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link Workspace} extends {@link TeaModel}
 *
 * <p>Workspace</p>
 */
public class Workspace extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("isDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("workspaceArn")
    private String workspaceArn;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private Workspace(Builder builder) {
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.isDefault = builder.isDefault;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.updatedAt = builder.updatedAt;
        this.workspaceArn = builder.workspaceArn;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Workspace create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return workspaceArn
     */
    public String getWorkspaceArn() {
        return this.workspaceArn;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String createdAt; 
        private String description; 
        private Boolean isDefault; 
        private String name; 
        private String resourceGroupId; 
        private String updatedAt; 
        private String workspaceArn; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Workspace model) {
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.isDefault = model.isDefault;
            this.name = model.name;
            this.resourceGroupId = model.resourceGroupId;
            this.updatedAt = model.updatedAt;
            this.workspaceArn = model.workspaceArn;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * isDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * workspaceArn.
         */
        public Builder workspaceArn(String workspaceArn) {
            this.workspaceArn = workspaceArn;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Workspace build() {
            return new Workspace(this);
        } 

    } 

}
