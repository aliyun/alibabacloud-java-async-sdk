// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunClusterServiceActionRequest} extends {@link RequestModel}
 *
 * <p>RunClusterServiceActionRequest</p>
 */
public class RunClusterServiceActionRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("ComponentNameList")
    private String componentNameList;

    @Query
    @NameInMap("CustomCommand")
    private String customCommand;

    @Query
    @NameInMap("CustomParams")
    private String customParams;

    @Query
    @NameInMap("ExecuteStrategy")
    private String executeStrategy;

    @Query
    @NameInMap("HostGroupIdList")
    private java.util.List < String > hostGroupIdList;

    @Query
    @NameInMap("HostIdList")
    private String hostIdList;

    @Query
    @NameInMap("Interval")
    private Long interval;

    @Query
    @NameInMap("IsRolling")
    private Boolean isRolling;

    @Query
    @NameInMap("NodeCountPerBatch")
    private Integer nodeCountPerBatch;

    @Query
    @NameInMap("OnlyRestartStaleConfigNodes")
    private Boolean onlyRestartStaleConfigNodes;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceActionName")
    @Validation(required = true)
    private String serviceActionName;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("TotlerateFailCount")
    private Integer totlerateFailCount;

    @Query
    @NameInMap("TurnOnMaintenanceMode")
    private Boolean turnOnMaintenanceMode;

    private RunClusterServiceActionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.comment = builder.comment;
        this.componentNameList = builder.componentNameList;
        this.customCommand = builder.customCommand;
        this.customParams = builder.customParams;
        this.executeStrategy = builder.executeStrategy;
        this.hostGroupIdList = builder.hostGroupIdList;
        this.hostIdList = builder.hostIdList;
        this.interval = builder.interval;
        this.isRolling = builder.isRolling;
        this.nodeCountPerBatch = builder.nodeCountPerBatch;
        this.onlyRestartStaleConfigNodes = builder.onlyRestartStaleConfigNodes;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceActionName = builder.serviceActionName;
        this.serviceName = builder.serviceName;
        this.totlerateFailCount = builder.totlerateFailCount;
        this.turnOnMaintenanceMode = builder.turnOnMaintenanceMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunClusterServiceActionRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return componentNameList
     */
    public String getComponentNameList() {
        return this.componentNameList;
    }

    /**
     * @return customCommand
     */
    public String getCustomCommand() {
        return this.customCommand;
    }

    /**
     * @return customParams
     */
    public String getCustomParams() {
        return this.customParams;
    }

    /**
     * @return executeStrategy
     */
    public String getExecuteStrategy() {
        return this.executeStrategy;
    }

    /**
     * @return hostGroupIdList
     */
    public java.util.List < String > getHostGroupIdList() {
        return this.hostGroupIdList;
    }

    /**
     * @return hostIdList
     */
    public String getHostIdList() {
        return this.hostIdList;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return isRolling
     */
    public Boolean getIsRolling() {
        return this.isRolling;
    }

    /**
     * @return nodeCountPerBatch
     */
    public Integer getNodeCountPerBatch() {
        return this.nodeCountPerBatch;
    }

    /**
     * @return onlyRestartStaleConfigNodes
     */
    public Boolean getOnlyRestartStaleConfigNodes() {
        return this.onlyRestartStaleConfigNodes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceActionName
     */
    public String getServiceActionName() {
        return this.serviceActionName;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return totlerateFailCount
     */
    public Integer getTotlerateFailCount() {
        return this.totlerateFailCount;
    }

    /**
     * @return turnOnMaintenanceMode
     */
    public Boolean getTurnOnMaintenanceMode() {
        return this.turnOnMaintenanceMode;
    }

    public static final class Builder extends Request.Builder<RunClusterServiceActionRequest, Builder> {
        private String clusterId; 
        private String comment; 
        private String componentNameList; 
        private String customCommand; 
        private String customParams; 
        private String executeStrategy; 
        private java.util.List < String > hostGroupIdList; 
        private String hostIdList; 
        private Long interval; 
        private Boolean isRolling; 
        private Integer nodeCountPerBatch; 
        private Boolean onlyRestartStaleConfigNodes; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceActionName; 
        private String serviceName; 
        private Integer totlerateFailCount; 
        private Boolean turnOnMaintenanceMode; 

        private Builder() {
            super();
        } 

        private Builder(RunClusterServiceActionRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.comment = response.comment;
            this.componentNameList = response.componentNameList;
            this.customCommand = response.customCommand;
            this.customParams = response.customParams;
            this.executeStrategy = response.executeStrategy;
            this.hostGroupIdList = response.hostGroupIdList;
            this.hostIdList = response.hostIdList;
            this.interval = response.interval;
            this.isRolling = response.isRolling;
            this.nodeCountPerBatch = response.nodeCountPerBatch;
            this.onlyRestartStaleConfigNodes = response.onlyRestartStaleConfigNodes;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.serviceActionName = response.serviceActionName;
            this.serviceName = response.serviceName;
            this.totlerateFailCount = response.totlerateFailCount;
            this.turnOnMaintenanceMode = response.turnOnMaintenanceMode;
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
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * ComponentNameList.
         */
        public Builder componentNameList(String componentNameList) {
            this.putQueryParameter("ComponentNameList", componentNameList);
            this.componentNameList = componentNameList;
            return this;
        }

        /**
         * CustomCommand.
         */
        public Builder customCommand(String customCommand) {
            this.putQueryParameter("CustomCommand", customCommand);
            this.customCommand = customCommand;
            return this;
        }

        /**
         * CustomParams.
         */
        public Builder customParams(String customParams) {
            this.putQueryParameter("CustomParams", customParams);
            this.customParams = customParams;
            return this;
        }

        /**
         * ExecuteStrategy.
         */
        public Builder executeStrategy(String executeStrategy) {
            this.putQueryParameter("ExecuteStrategy", executeStrategy);
            this.executeStrategy = executeStrategy;
            return this;
        }

        /**
         * HostGroupIdList.
         */
        public Builder hostGroupIdList(java.util.List < String > hostGroupIdList) {
            this.putQueryParameter("HostGroupIdList", hostGroupIdList);
            this.hostGroupIdList = hostGroupIdList;
            return this;
        }

        /**
         * HostIdList.
         */
        public Builder hostIdList(String hostIdList) {
            this.putQueryParameter("HostIdList", hostIdList);
            this.hostIdList = hostIdList;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * IsRolling.
         */
        public Builder isRolling(Boolean isRolling) {
            this.putQueryParameter("IsRolling", isRolling);
            this.isRolling = isRolling;
            return this;
        }

        /**
         * NodeCountPerBatch.
         */
        public Builder nodeCountPerBatch(Integer nodeCountPerBatch) {
            this.putQueryParameter("NodeCountPerBatch", nodeCountPerBatch);
            this.nodeCountPerBatch = nodeCountPerBatch;
            return this;
        }

        /**
         * OnlyRestartStaleConfigNodes.
         */
        public Builder onlyRestartStaleConfigNodes(Boolean onlyRestartStaleConfigNodes) {
            this.putQueryParameter("OnlyRestartStaleConfigNodes", onlyRestartStaleConfigNodes);
            this.onlyRestartStaleConfigNodes = onlyRestartStaleConfigNodes;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceActionName.
         */
        public Builder serviceActionName(String serviceActionName) {
            this.putQueryParameter("ServiceActionName", serviceActionName);
            this.serviceActionName = serviceActionName;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * TotlerateFailCount.
         */
        public Builder totlerateFailCount(Integer totlerateFailCount) {
            this.putQueryParameter("TotlerateFailCount", totlerateFailCount);
            this.totlerateFailCount = totlerateFailCount;
            return this;
        }

        /**
         * TurnOnMaintenanceMode.
         */
        public Builder turnOnMaintenanceMode(Boolean turnOnMaintenanceMode) {
            this.putQueryParameter("TurnOnMaintenanceMode", turnOnMaintenanceMode);
            this.turnOnMaintenanceMode = turnOnMaintenanceMode;
            return this;
        }

        @Override
        public RunClusterServiceActionRequest build() {
            return new RunClusterServiceActionRequest(this);
        } 

    } 

}
