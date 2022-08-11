// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunManualDagNodesRequest} extends {@link RequestModel}
 *
 * <p>RunManualDagNodesRequest</p>
 */
public class RunManualDagNodesRequest extends Request {
    @Body
    @NameInMap("BizDate")
    @Validation(required = true)
    private String bizDate;

    @Body
    @NameInMap("DagParameters")
    private String dagParameters;

    @Body
    @NameInMap("ExcludeNodeIds")
    private String excludeNodeIds;

    @Body
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Body
    @NameInMap("IncludeNodeIds")
    private String includeNodeIds;

    @Body
    @NameInMap("NodeParameters")
    private String nodeParameters;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RunManualDagNodesRequest(Builder builder) {
        super(builder);
        this.bizDate = builder.bizDate;
        this.dagParameters = builder.dagParameters;
        this.excludeNodeIds = builder.excludeNodeIds;
        this.flowName = builder.flowName;
        this.includeNodeIds = builder.includeNodeIds;
        this.nodeParameters = builder.nodeParameters;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunManualDagNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizDate
     */
    public String getBizDate() {
        return this.bizDate;
    }

    /**
     * @return dagParameters
     */
    public String getDagParameters() {
        return this.dagParameters;
    }

    /**
     * @return excludeNodeIds
     */
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return includeNodeIds
     */
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    /**
     * @return nodeParameters
     */
    public String getNodeParameters() {
        return this.nodeParameters;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RunManualDagNodesRequest, Builder> {
        private String bizDate; 
        private String dagParameters; 
        private String excludeNodeIds; 
        private String flowName; 
        private String includeNodeIds; 
        private String nodeParameters; 
        private String projectEnv; 
        private Long projectId; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RunManualDagNodesRequest request) {
            super(request);
            this.bizDate = request.bizDate;
            this.dagParameters = request.dagParameters;
            this.excludeNodeIds = request.excludeNodeIds;
            this.flowName = request.flowName;
            this.includeNodeIds = request.includeNodeIds;
            this.nodeParameters = request.nodeParameters;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
        } 

        /**
         * BizDate.
         */
        public Builder bizDate(String bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * DagParameters.
         */
        public Builder dagParameters(String dagParameters) {
            this.putBodyParameter("DagParameters", dagParameters);
            this.dagParameters = dagParameters;
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
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
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
         * NodeParameters.
         */
        public Builder nodeParameters(String nodeParameters) {
            this.putBodyParameter("NodeParameters", nodeParameters);
            this.nodeParameters = nodeParameters;
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
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
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

        @Override
        public RunManualDagNodesRequest build() {
            return new RunManualDagNodesRequest(this);
        } 

    } 

}
