// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupResponseBody</p>
 */
public class GetResourceGroupResponseBody extends TeaModel {
    @NameInMap("ClusterID")
    private String clusterID;

    @NameInMap("ComputingResourceProvider")
    private String computingResourceProvider;

    @NameInMap("CreatorID")
    private String creatorID;

    @NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("Status")
    private String status;

    @NameInMap("SupportRDMA")
    private Boolean supportRDMA;

    @NameInMap("UserVpc")
    private UserVpc userVpc;

    @NameInMap("WorkspaceID")
    private String workspaceID;

    private GetResourceGroupResponseBody(Builder builder) {
        this.clusterID = builder.clusterID;
        this.computingResourceProvider = builder.computingResourceProvider;
        this.creatorID = builder.creatorID;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
        this.supportRDMA = builder.supportRDMA;
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
        private String gmtCreatedTime; 
        private String gmtModifiedTime; 
        private String name; 
        private String requestId; 
        private String resourceType; 
        private String status; 
        private Boolean supportRDMA; 
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

}
