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
    @NameInMap("OrderBy")
    private String orderBy;

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
        this.orderBy = builder.orderBy;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
        private String orderBy; 
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
            this.orderBy = request.orderBy;
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
         * The parameters related to the node.
         */
        public Builder beginBizdate(String beginBizdate) {
            this.putBodyParameter("BeginBizdate", beginBizdate);
            this.beginBizdate = beginBizdate;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: 10. Maximum value: 100.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.
         */
        public Builder dagId(Long dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The ID of the workflow.
         */
        public Builder endBizdate(String endBizdate) {
            this.putBodyParameter("EndBizdate", endBizdate);
            this.endBizdate = endBizdate;
            return this;
        }

        /**
         * Indicates whether the instance is associated with a monitoring rule in Data Quality. Valid values:
         * <p>
         * 
         * *   0: The instance is associated with a monitoring rule in Data Quality.
         * *   1: The instance is not associated with a monitoring rule in Data Quality.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Indicates whether the node can be rerun.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The connection string.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The operation that you want to perform.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the node.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder programType(String programType) {
            this.putBodyParameter("ProgramType", programType);
            this.programType = programType;
            return this;
        }

        /**
         * The time when the node was last modified.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * The ID of the baseline.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The time when the instance started to wait to be scheduled.
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
