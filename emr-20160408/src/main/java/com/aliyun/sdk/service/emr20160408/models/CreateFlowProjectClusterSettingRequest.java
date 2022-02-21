// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowProjectClusterSettingRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowProjectClusterSettingRequest</p>
 */
public class CreateFlowProjectClusterSettingRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DefaultQueue")
    private String defaultQueue;

    @Query
    @NameInMap("DefaultUser")
    private String defaultUser;

    @Query
    @NameInMap("HostList")
    private java.util.List < String > hostList;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("QueueList")
    private java.util.List < String > queueList;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UserList")
    private java.util.List < String > userList;

    private CreateFlowProjectClusterSettingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.defaultQueue = builder.defaultQueue;
        this.defaultUser = builder.defaultUser;
        this.hostList = builder.hostList;
        this.projectId = builder.projectId;
        this.queueList = builder.queueList;
        this.regionId = builder.regionId;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowProjectClusterSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return defaultQueue
     */
    public String getDefaultQueue() {
        return this.defaultQueue;
    }

    /**
     * @return defaultUser
     */
    public String getDefaultUser() {
        return this.defaultUser;
    }

    /**
     * @return hostList
     */
    public java.util.List < String > getHostList() {
        return this.hostList;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return queueList
     */
    public java.util.List < String > getQueueList() {
        return this.queueList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userList
     */
    public java.util.List < String > getUserList() {
        return this.userList;
    }

    public static final class Builder extends Request.Builder<CreateFlowProjectClusterSettingRequest, Builder> {
        private String clusterId; 
        private String defaultQueue; 
        private String defaultUser; 
        private java.util.List < String > hostList; 
        private String projectId; 
        private java.util.List < String > queueList; 
        private String regionId; 
        private java.util.List < String > userList; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowProjectClusterSettingRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.defaultQueue = response.defaultQueue;
            this.defaultUser = response.defaultUser;
            this.hostList = response.hostList;
            this.projectId = response.projectId;
            this.queueList = response.queueList;
            this.regionId = response.regionId;
            this.userList = response.userList;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DefaultQueue.
         */
        public Builder defaultQueue(String defaultQueue) {
            this.putQueryParameter("DefaultQueue", defaultQueue);
            this.defaultQueue = defaultQueue;
            return this;
        }

        /**
         * DefaultUser.
         */
        public Builder defaultUser(String defaultUser) {
            this.putQueryParameter("DefaultUser", defaultUser);
            this.defaultUser = defaultUser;
            return this;
        }

        /**
         * HostList.
         */
        public Builder hostList(java.util.List < String > hostList) {
            this.putQueryParameter("HostList", hostList);
            this.hostList = hostList;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * QueueList.
         */
        public Builder queueList(java.util.List < String > queueList) {
            this.putQueryParameter("QueueList", queueList);
            this.queueList = queueList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UserList.
         */
        public Builder userList(java.util.List < String > userList) {
            this.putQueryParameter("UserList", userList);
            this.userList = userList;
            return this;
        }

        @Override
        public CreateFlowProjectClusterSettingRequest build() {
            return new CreateFlowProjectClusterSettingRequest(this);
        } 

    } 

}
