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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListInstancesRequest(Builder builder) {
        super(builder);
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
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
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
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
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
            this.regionId = request.regionId;
        } 

        /**
         * BeginBizdate.
         */
        public Builder beginBizdate(String beginBizdate) {
            this.putBodyParameter("BeginBizdate", beginBizdate);
            this.beginBizdate = beginBizdate;
            return this;
        }

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * Bizdate.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * DagId.
         */
        public Builder dagId(Long dagId) {
            this.putBodyParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * EndBizdate.
         */
        public Builder endBizdate(String endBizdate) {
            this.putBodyParameter("EndBizdate", endBizdate);
            this.endBizdate = endBizdate;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProgramType.
         */
        public Builder programType(String programType) {
            this.putBodyParameter("ProgramType", programType);
            this.programType = programType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
