// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ResourceGroup} extends {@link TeaModel}
 *
 * <p>ResourceGroup</p>
 */
public class ResourceGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatorID")
    private String creatorID;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("WorkspaceID")
    private String workspaceID;

    private ResourceGroup(Builder builder) {
        this.creatorID = builder.creatorID;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.name = builder.name;
        this.nodeCount = builder.nodeCount;
        this.resourceGroupID = builder.resourceGroupID;
        this.userVpc = builder.userVpc;
        this.workspaceID = builder.workspaceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorID
     */
    public String getCreatorID() {
        return this.creatorID;
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return workspaceID
     */
    public String getWorkspaceID() {
        return this.workspaceID;
    }

    public static final class Builder {
        private String creatorID; 
        private String gmtCreatedTime; 
        private String gmtModifiedTime; 
        private String name; 
        private Integer nodeCount; 
        private String resourceGroupID; 
        private UserVpc userVpc; 
        private String workspaceID; 

        private Builder() {
        } 

        private Builder(ResourceGroup model) {
            this.creatorID = model.creatorID;
            this.gmtCreatedTime = model.gmtCreatedTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.name = model.name;
            this.nodeCount = model.nodeCount;
            this.resourceGroupID = model.resourceGroupID;
            this.userVpc = model.userVpc;
            this.workspaceID = model.workspaceID;
        } 

        /**
         * CreatorID.
         */
        public Builder creatorID(String creatorID) {
            this.creatorID = creatorID;
            return this;
        }

        /**
         * GmtCreatedTime.
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * WorkspaceID.
         */
        public Builder workspaceID(String workspaceID) {
            this.workspaceID = workspaceID;
            return this;
        }

        public ResourceGroup build() {
            return new ResourceGroup(this);
        } 

    } 

}
