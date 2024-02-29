// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCycleDagNodesRequest} extends {@link RequestModel}
 *
 * <p>RunCycleDagNodesRequest</p>
 */
public class RunCycleDagNodesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AlertNoticeType")
    private String alertNoticeType;

    @Body
    @NameInMap("AlertType")
    private String alertType;

    @Body
    @NameInMap("BizBeginTime")
    private String bizBeginTime;

    @Body
    @NameInMap("BizEndTime")
    private String bizEndTime;

    @Body
    @NameInMap("ConcurrentRuns")
    @Validation(maximum = 10, minimum = 2)
    private Integer concurrentRuns;

    @Body
    @NameInMap("EndBizDate")
    @Validation(required = true)
    private String endBizDate;

    @Body
    @NameInMap("ExcludeNodeIds")
    private String excludeNodeIds;

    @Body
    @NameInMap("IncludeNodeIds")
    @Validation(required = true)
    private String includeNodeIds;

    @Body
    @NameInMap("Name")
    @Validation(required = true, maxLength = 128)
    private String name;

    @Body
    @NameInMap("NodeParams")
    private String nodeParams;

    @Body
    @NameInMap("Parallelism")
    @Validation(required = true)
    private Boolean parallelism;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Body
    @NameInMap("RootNodeId")
    @Validation(required = true)
    private Long rootNodeId;

    @Body
    @NameInMap("StartBizDate")
    @Validation(required = true)
    private String startBizDate;

    @Body
    @NameInMap("StartFutureInstanceImmediately")
    private Boolean startFutureInstanceImmediately;

    private RunCycleDagNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertNoticeType = builder.alertNoticeType;
        this.alertType = builder.alertType;
        this.bizBeginTime = builder.bizBeginTime;
        this.bizEndTime = builder.bizEndTime;
        this.concurrentRuns = builder.concurrentRuns;
        this.endBizDate = builder.endBizDate;
        this.excludeNodeIds = builder.excludeNodeIds;
        this.includeNodeIds = builder.includeNodeIds;
        this.name = builder.name;
        this.nodeParams = builder.nodeParams;
        this.parallelism = builder.parallelism;
        this.projectEnv = builder.projectEnv;
        this.rootNodeId = builder.rootNodeId;
        this.startBizDate = builder.startBizDate;
        this.startFutureInstanceImmediately = builder.startFutureInstanceImmediately;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCycleDagNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alertNoticeType
     */
    public String getAlertNoticeType() {
        return this.alertNoticeType;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return bizBeginTime
     */
    public String getBizBeginTime() {
        return this.bizBeginTime;
    }

    /**
     * @return bizEndTime
     */
    public String getBizEndTime() {
        return this.bizEndTime;
    }

    /**
     * @return concurrentRuns
     */
    public Integer getConcurrentRuns() {
        return this.concurrentRuns;
    }

    /**
     * @return endBizDate
     */
    public String getEndBizDate() {
        return this.endBizDate;
    }

    /**
     * @return excludeNodeIds
     */
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    /**
     * @return includeNodeIds
     */
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeParams
     */
    public String getNodeParams() {
        return this.nodeParams;
    }

    /**
     * @return parallelism
     */
    public Boolean getParallelism() {
        return this.parallelism;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return rootNodeId
     */
    public Long getRootNodeId() {
        return this.rootNodeId;
    }

    /**
     * @return startBizDate
     */
    public String getStartBizDate() {
        return this.startBizDate;
    }

    /**
     * @return startFutureInstanceImmediately
     */
    public Boolean getStartFutureInstanceImmediately() {
        return this.startFutureInstanceImmediately;
    }

    public static final class Builder extends Request.Builder<RunCycleDagNodesRequest, Builder> {
        private String regionId; 
        private String alertNoticeType; 
        private String alertType; 
        private String bizBeginTime; 
        private String bizEndTime; 
        private Integer concurrentRuns; 
        private String endBizDate; 
        private String excludeNodeIds; 
        private String includeNodeIds; 
        private String name; 
        private String nodeParams; 
        private Boolean parallelism; 
        private String projectEnv; 
        private Long rootNodeId; 
        private String startBizDate; 
        private Boolean startFutureInstanceImmediately; 

        private Builder() {
            super();
        } 

        private Builder(RunCycleDagNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertNoticeType = request.alertNoticeType;
            this.alertType = request.alertType;
            this.bizBeginTime = request.bizBeginTime;
            this.bizEndTime = request.bizEndTime;
            this.concurrentRuns = request.concurrentRuns;
            this.endBizDate = request.endBizDate;
            this.excludeNodeIds = request.excludeNodeIds;
            this.includeNodeIds = request.includeNodeIds;
            this.name = request.name;
            this.nodeParams = request.nodeParams;
            this.parallelism = request.parallelism;
            this.projectEnv = request.projectEnv;
            this.rootNodeId = request.rootNodeId;
            this.startBizDate = request.startBizDate;
            this.startFutureInstanceImmediately = request.startFutureInstanceImmediately;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AlertNoticeType.
         */
        public Builder alertNoticeType(String alertNoticeType) {
            this.putBodyParameter("AlertNoticeType", alertNoticeType);
            this.alertNoticeType = alertNoticeType;
            return this;
        }

        /**
         * AlertType.
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * The time when the node started to run. This parameter is required only for auto triggered nodes that are scheduled by hour. Specify the value in the HH:mm:ss format. Valid values: 00:00:00 to 23:59:59.
         */
        public Builder bizBeginTime(String bizBeginTime) {
            this.putBodyParameter("BizBeginTime", bizBeginTime);
            this.bizBeginTime = bizBeginTime;
            return this;
        }

        /**
         * The time when the node stopped running. This parameter is required only for auto triggered nodes that are scheduled by hour. Specify the value in the HH:mm:ss format. Valid values: 00:00:00 to 23:59:59.
         */
        public Builder bizEndTime(String bizEndTime) {
            this.putBodyParameter("BizEndTime", bizEndTime);
            this.bizEndTime = bizEndTime;
            return this;
        }

        /**
         * ConcurrentRuns.
         */
        public Builder concurrentRuns(Integer concurrentRuns) {
            this.putBodyParameter("ConcurrentRuns", concurrentRuns);
            this.concurrentRuns = concurrentRuns;
            return this;
        }

        /**
         * The data timestamp at which data is no longer backfilled. Specify the value in the yyyy-MM-dd 00:00:00 format.
         */
        public Builder endBizDate(String endBizDate) {
            this.putBodyParameter("EndBizDate", endBizDate);
            this.endBizDate = endBizDate;
            return this;
        }

        /**
         * The IDs of the nodes for which no data needs to be backfilled. The system generates dry-run instances for all these nodes. After these dry-run instances are scheduled, the statuses of these instances are directly set to successful, but the script is not run.
         */
        public Builder excludeNodeIds(String excludeNodeIds) {
            this.putBodyParameter("ExcludeNodeIds", excludeNodeIds);
            this.excludeNodeIds = excludeNodeIds;
            return this;
        }

        /**
         * The ID of the node for which you want to backfill data. If you want to backfill data for multiple nodes, separate the IDs of the nodes with commas (,). You can call the [ListNodes](~~173979~~) operation to query the ID.
         */
        public Builder includeNodeIds(String includeNodeIds) {
            this.putBodyParameter("IncludeNodeIds", includeNodeIds);
            this.includeNodeIds = includeNodeIds;
            return this;
        }

        /**
         * The name of the workflow.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The parameters that need to be configured for the node. Set this parameter to a JSON string. The key indicates the ID of the node, and the value indicates the actual values of the parameters.
         */
        public Builder nodeParams(String nodeParams) {
            this.putBodyParameter("NodeParams", nodeParams);
            this.nodeParams = nodeParams;
            return this;
        }

        /**
         * Specifies whether data can be backfilled for multiple nodes at the same time.
         */
        public Builder parallelism(Boolean parallelism) {
            this.putBodyParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * The ID of the node for which data is first backfilled. You can call the [ListNodes](~~173979~~) operation to query the ID.
         */
        public Builder rootNodeId(Long rootNodeId) {
            this.putBodyParameter("RootNodeId", rootNodeId);
            this.rootNodeId = rootNodeId;
            return this;
        }

        /**
         * The data timestamp at which data starts to be backfilled. Specify the value in the yyyy-MM-dd 00:00:00 format.
         */
        public Builder startBizDate(String startBizDate) {
            this.putBodyParameter("StartBizDate", startBizDate);
            this.startBizDate = startBizDate;
            return this;
        }

        /**
         * Specifies whether to immediately run an instance that is scheduled to run in the future. If you set this parameter to true, the instance that is scheduled to run in the future is run immediately. Otherwise, the instance is run as scheduled.
         */
        public Builder startFutureInstanceImmediately(Boolean startFutureInstanceImmediately) {
            this.putBodyParameter("StartFutureInstanceImmediately", startFutureInstanceImmediately);
            this.startFutureInstanceImmediately = startFutureInstanceImmediately;
            return this;
        }

        @Override
        public RunCycleDagNodesRequest build() {
            return new RunCycleDagNodesRequest(this);
        } 

    } 

}
