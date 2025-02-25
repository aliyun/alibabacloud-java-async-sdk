// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginBizdate")
    private String beginBizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    private String bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagId")
    private Long dagId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndBizdate")
    private String endBizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProgramType")
    private String programType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The parameters related to the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02 00:00:00</p>
         */
        public Builder beginBizdate(String beginBizdate) {
            this.putBodyParameter("BeginBizdate", beginBizdate);
            this.beginBizdate = beginBizdate;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test_bizName</p>
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02 00:00:00</p>
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder dagId(Long dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * <p>The ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-03 00:00:00</p>
         */
        public Builder endBizdate(String endBizdate) {
            this.putBodyParameter("EndBizdate", endBizdate);
            this.endBizdate = endBizdate;
            return this;
        }

        /**
         * <p>Indicates whether the instance is associated with a monitoring rule in Data Quality. Valid values:</p>
         * <ul>
         * <li>0: The instance is associated with a monitoring rule in Data Quality.</li>
         * <li>1: The instance is not associated with a monitoring rule in Data Quality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100000000000</p>
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>Indicates whether the node can be rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>openmr_8****</p>
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The sorting rule of the instances to be returned. Valid values:</p>
         * <ul>
         * <li>CREATE_TIME_DESC: The instances are sorted in descending order of their creation time.</li>
         * <li>INSTANCE_ID_DESC (default): The instances are sorted in descending order of their IDs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE_ID_DESC</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>193379****</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The operation that you want to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        public Builder programType(String programType) {
            this.putBodyParameter("ProgramType", programType);
            this.programType = programType;
            return this;
        }

        /**
         * <p>The environment in which the node runs. Valid values: DEV and PROD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The ID of the baseline.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: The node is not run.</li>
         * <li>WAIT_TIME: The node is waiting for the scheduling time to arrive.</li>
         * <li>WAIT_RESOURCE: The node is waiting for resources.</li>
         * <li>RUNNING: The node is running.</li>
         * <li>CHECKING: Data quality is being checked for the node.</li>
         * <li>CHECKING_CONDITION: Branch conditions are being checked for the node.</li>
         * <li>FAILURE: The node fails to run.</li>
         * <li>SUCCESS: The node is successfully run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_RUN</p>
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
