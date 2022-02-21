// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveOrderRequest} extends {@link RequestModel}
 *
 * <p>ApproveOrderRequest</p>
 */
public class ApproveOrderRequest extends Request {
    @Query
    @NameInMap("ApprovalType")
    @Validation(required = true)
    private String approvalType;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    @Query
    @NameInMap("WorkflowInstanceId")
    @Validation(required = true, minimum = 1)
    private Long workflowInstanceId;

    private ApproveOrderRequest(Builder builder) {
        super(builder);
        this.approvalType = builder.approvalType;
        this.comment = builder.comment;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
        this.workflowInstanceId = builder.workflowInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalType
     */
    public String getApprovalType() {
        return this.approvalType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return workflowInstanceId
     */
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public static final class Builder extends Request.Builder<ApproveOrderRequest, Builder> {
        private String approvalType; 
        private String comment; 
        private String regionId; 
        private Long tid; 
        private Long workflowInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveOrderRequest response) {
            super(response);
            this.approvalType = response.approvalType;
            this.comment = response.comment;
            this.regionId = response.regionId;
            this.tid = response.tid;
            this.workflowInstanceId = response.workflowInstanceId;
        } 

        /**
         * ApprovalType.
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * WorkflowInstanceId.
         */
        public Builder workflowInstanceId(Long workflowInstanceId) {
            this.putQueryParameter("WorkflowInstanceId", workflowInstanceId);
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        @Override
        public ApproveOrderRequest build() {
            return new ApproveOrderRequest(this);
        } 

    } 

}
