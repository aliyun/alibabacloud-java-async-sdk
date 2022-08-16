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
    @Body
    @NameInMap("BizBeginTime")
    private String bizBeginTime;

    @Body
    @NameInMap("BizEndTime")
    private String bizEndTime;

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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        this.bizBeginTime = builder.bizBeginTime;
        this.bizEndTime = builder.bizEndTime;
        this.endBizDate = builder.endBizDate;
        this.excludeNodeIds = builder.excludeNodeIds;
        this.includeNodeIds = builder.includeNodeIds;
        this.name = builder.name;
        this.nodeParams = builder.nodeParams;
        this.parallelism = builder.parallelism;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String bizBeginTime; 
        private String bizEndTime; 
        private String endBizDate; 
        private String excludeNodeIds; 
        private String includeNodeIds; 
        private String name; 
        private String nodeParams; 
        private Boolean parallelism; 
        private String projectEnv; 
        private String regionId; 
        private Long rootNodeId; 
        private String startBizDate; 
        private Boolean startFutureInstanceImmediately; 

        private Builder() {
            super();
        } 

        private Builder(RunCycleDagNodesRequest request) {
            super(request);
            this.bizBeginTime = request.bizBeginTime;
            this.bizEndTime = request.bizEndTime;
            this.endBizDate = request.endBizDate;
            this.excludeNodeIds = request.excludeNodeIds;
            this.includeNodeIds = request.includeNodeIds;
            this.name = request.name;
            this.nodeParams = request.nodeParams;
            this.parallelism = request.parallelism;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
            this.rootNodeId = request.rootNodeId;
            this.startBizDate = request.startBizDate;
            this.startFutureInstanceImmediately = request.startFutureInstanceImmediately;
        } 

        /**
         * BizBeginTime.
         */
        public Builder bizBeginTime(String bizBeginTime) {
            this.putBodyParameter("BizBeginTime", bizBeginTime);
            this.bizBeginTime = bizBeginTime;
            return this;
        }

        /**
         * BizEndTime.
         */
        public Builder bizEndTime(String bizEndTime) {
            this.putBodyParameter("BizEndTime", bizEndTime);
            this.bizEndTime = bizEndTime;
            return this;
        }

        /**
         * EndBizDate.
         */
        public Builder endBizDate(String endBizDate) {
            this.putBodyParameter("EndBizDate", endBizDate);
            this.endBizDate = endBizDate;
            return this;
        }

        /**
         * ExcludeNodeIds.
         */
        public Builder excludeNodeIds(String excludeNodeIds) {
            this.putBodyParameter("ExcludeNodeIds", excludeNodeIds);
            this.excludeNodeIds = excludeNodeIds;
            return this;
        }

        /**
         * IncludeNodeIds.
         */
        public Builder includeNodeIds(String includeNodeIds) {
            this.putBodyParameter("IncludeNodeIds", includeNodeIds);
            this.includeNodeIds = includeNodeIds;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NodeParams.
         */
        public Builder nodeParams(String nodeParams) {
            this.putBodyParameter("NodeParams", nodeParams);
            this.nodeParams = nodeParams;
            return this;
        }

        /**
         * Parallelism.
         */
        public Builder parallelism(Boolean parallelism) {
            this.putBodyParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
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
         * RootNodeId.
         */
        public Builder rootNodeId(Long rootNodeId) {
            this.putBodyParameter("RootNodeId", rootNodeId);
            this.rootNodeId = rootNodeId;
            return this;
        }

        /**
         * StartBizDate.
         */
        public Builder startBizDate(String startBizDate) {
            this.putBodyParameter("StartBizDate", startBizDate);
            this.startBizDate = startBizDate;
            return this;
        }

        /**
         * StartFutureInstanceImmediately.
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
