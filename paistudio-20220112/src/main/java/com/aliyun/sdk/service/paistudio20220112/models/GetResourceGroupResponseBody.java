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
 * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupResponseBody</p>
 */
public class GetResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterID")
    private String clusterID;

    @com.aliyun.core.annotation.NameInMap("ComputingResourceProvider")
    private String computingResourceProvider;

    @com.aliyun.core.annotation.NameInMap("CreatorID")
    private String creatorID;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportRDMA")
    private Boolean supportRDMA;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("WorkspaceID")
    private String workspaceID;

    private GetResourceGroupResponseBody(Builder builder) {
        this.clusterID = builder.clusterID;
        this.computingResourceProvider = builder.computingResourceProvider;
        this.creatorID = builder.creatorID;
        this.description = builder.description;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
        this.supportRDMA = builder.supportRDMA;
        this.tags = builder.tags;
        this.userVpc = builder.userVpc;
        this.workspaceID = builder.workspaceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterID
     */
    public String getClusterID() {
        return this.clusterID;
    }

    /**
     * @return computingResourceProvider
     */
    public String getComputingResourceProvider() {
        return this.computingResourceProvider;
    }

    /**
     * @return creatorID
     */
    public String getCreatorID() {
        return this.creatorID;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportRDMA
     */
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
        private String clusterID; 
        private String computingResourceProvider; 
        private String creatorID; 
        private String description; 
        private String gmtCreatedTime; 
        private String gmtModifiedTime; 
        private String name; 
        private String requestId; 
        private String resourceType; 
        private String status; 
        private Boolean supportRDMA; 
        private java.util.List<Tags> tags; 
        private UserVpc userVpc; 
        private String workspaceID; 

        /**
         * ClusterID.
         */
        public Builder clusterID(String clusterID) {
            this.clusterID = clusterID;
            return this;
        }

        /**
         * ComputingResourceProvider.
         */
        public Builder computingResourceProvider(String computingResourceProvider) {
            this.computingResourceProvider = computingResourceProvider;
            return this;
        }

        /**
         * CreatorID.
         */
        public Builder creatorID(String creatorID) {
            this.creatorID = creatorID;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupportRDMA.
         */
        public Builder supportRDMA(Boolean supportRDMA) {
            this.supportRDMA = supportRDMA;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
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

        public GetResourceGroupResponseBody build() {
            return new GetResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
