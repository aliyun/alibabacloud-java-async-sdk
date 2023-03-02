// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BeginBizdate")
    private String beginBizdate;

    @Body
    @NameInMap("BizName")
    private String bizName;

    @Body
    @NameInMap("Bizdate")
    private String bizdate;

    @Body
    @NameInMap("DagId")
    private Long dagId;

    @Body
    @NameInMap("EndBizdate")
    private String endBizdate;

    @Body
    @NameInMap("NodeId")
    private Long nodeId;

    @Body
    @NameInMap("NodeName")
    private String nodeName;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ProgramType")
    private String programType;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("Status")
    private String status;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginBizdate = builder.beginBizdate;
        this.bizName = builder.bizName;
        this.bizdate = builder.bizdate;
        this.dagId = builder.dagId;
        this.endBizdate = builder.endBizdate;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.programType = builder.programType;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
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
     * @return beginBizdate
     */
    public String getBeginBizdate() {
        return this.beginBizdate;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return bizdate
     */
    public String getBizdate() {
        return this.bizdate;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return endBizdate
     */
    public String getEndBizdate() {
        return this.endBizdate;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return programType
     */
    public String getProgramType() {
        return this.programType;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String regionId; 
        private String beginBizdate; 
        private String bizName; 
        private String bizdate; 
        private Long dagId; 
        private String endBizdate; 
        private Long nodeId; 
        private String nodeName; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String programType; 
        private String projectEnv; 
        private Long projectId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginBizdate = request.beginBizdate;
            this.bizName = request.bizName;
            this.bizdate = request.bizdate;
            this.dagId = request.dagId;
            this.endBizdate = request.endBizdate;
            this.nodeId = request.nodeId;
            this.nodeName = request.nodeName;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.programType = request.programType;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
            this.status = request.status;
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
         * The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         */
        public Builder beginBizdate(String beginBizdate) {
            this.putBodyParameter("BeginBizdate", beginBizdate);
            this.beginBizdate = beginBizdate;
            return this;
        }

        /**
         * The name of the workflow. You can call the [ListBusiness](~~173945~~) operation to query the name of the workflow.
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * The data timestamp of the instances that you want to query. Specify the timestamp in the yyyy-MM-dd HH:mm:ss format.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * The ID of the directed acyclic graph (DAG). You can set this parameter to the value of the DagId parameter returned by the [RunCycleDagNodes](~~212961~~), [RunSmokeTest](~~212949~~), or [RunManualDagNodes](~~212830~~) operation based on your business requirements. The RunManualDagNodes operation is used to backfill data, the RunSmokeTest operation is used to perform smoke testing, and the RunManualDagNodes operation is used to run nodes in a manually triggered workflow.
         */
        public Builder dagId(Long dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         */
        public Builder endBizdate(String endBizdate) {
            this.putBodyParameter("EndBizdate", endBizdate);
            this.endBizdate = endBizdate;
            return this;
        }

        /**
         * The ID of the node. You can call the [ListNodes](~~173979~~) operation to query the ID of the node.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The name of the node. You can call the [ListNodes](~~173979~~) operation to query the name of the node.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the workspace administrator. You can log on to the Alibaba Cloud Management Console and view the ID on the Security Settings page of the Account Center console.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The number of the page to return. Minimum value:1. Maximum value: 100.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         * <p>
         * 
         * You cannot specify the sorting method for the instances to be returned by this operation. By default, the instances are sorted in descending order of the time when the instances were created.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the node. You can call the [ListNodes](~~173979~~) operation to query the type of the node.
         */
        public Builder programType(String programType) {
            this.putBodyParameter("ProgramType", programType);
            this.programType = programType;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * The ID of the workspace. You can call the [ListProjects](~~178393~~) operation to query the ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The status of the node. Valid values:
         * <p>
         * 
         * *   NOT_RUN: The node is not run.
         * *   WAIT_TIME: The node is waiting for the scheduling time to arrive.
         * *   WAIT_RESOURCE: The node is waiting for resources.
         * *   RUNNING: The node is running.
         * *   CHECKING: Data quality is being checked for the node.
         * *   CHECKING_CONDITION: Branch conditions are being checked for the node.
         * *   FAILURE: The node fails to run.
         * *   SUCCESS: The node is successfully run.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
