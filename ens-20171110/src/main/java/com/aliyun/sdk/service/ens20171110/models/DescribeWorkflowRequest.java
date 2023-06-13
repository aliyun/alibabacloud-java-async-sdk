// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowRequest} extends {@link RequestModel}
 *
 * <p>DescribeWorkflowRequest</p>
 */
public class DescribeWorkflowRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private String aliUid;

    @Query
    @NameInMap("BusinessId")
    private String businessId;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageNum")
    private String pageNum;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("WorkFlowId")
    private String workFlowId;

    @Query
    @NameInMap("WorkFlowName")
    private String workFlowName;

    private DescribeWorkflowRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.businessId = builder.businessId;
        this.endDate = builder.endDate;
        this.ensRegionId = builder.ensRegionId;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.workFlowId = builder.workFlowId;
        this.workFlowName = builder.workFlowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workFlowId
     */
    public String getWorkFlowId() {
        return this.workFlowId;
    }

    /**
     * @return workFlowName
     */
    public String getWorkFlowName() {
        return this.workFlowName;
    }

    public static final class Builder extends Request.Builder<DescribeWorkflowRequest, Builder> {
        private String aliUid; 
        private String businessId; 
        private String endDate; 
        private String ensRegionId; 
        private String id; 
        private String instanceId; 
        private String pageNum; 
        private String pageSize; 
        private String startDate; 
        private String status; 
        private String workFlowId; 
        private String workFlowName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWorkflowRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.businessId = request.businessId;
            this.endDate = request.endDate;
            this.ensRegionId = request.ensRegionId;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.status = request.status;
            this.workFlowId = request.workFlowId;
            this.workFlowName = request.workFlowName;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * BusinessId.
         */
        public Builder businessId(String businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * WorkFlowId.
         */
        public Builder workFlowId(String workFlowId) {
            this.putQueryParameter("WorkFlowId", workFlowId);
            this.workFlowId = workFlowId;
            return this;
        }

        /**
         * WorkFlowName.
         */
        public Builder workFlowName(String workFlowName) {
            this.putQueryParameter("WorkFlowName", workFlowName);
            this.workFlowName = workFlowName;
            return this;
        }

        @Override
        public DescribeWorkflowRequest build() {
            return new DescribeWorkflowRequest(this);
        } 

    } 

}
