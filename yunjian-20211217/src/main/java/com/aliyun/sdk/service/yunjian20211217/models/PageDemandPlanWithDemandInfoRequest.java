// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link PageDemandPlanWithDemandInfoRequest} extends {@link RequestModel}
 *
 * <p>PageDemandPlanWithDemandInfoRequest</p>
 */
public class PageDemandPlanWithDemandInfoRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("approvalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createTimeStart")
    private String createTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creatorStaffId")
    private String creatorStaffId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("demandDeliveryStatus")
    private String demandDeliveryStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("demandId")
    private java.util.List<Long> demandId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("demandPlanId")
    private java.util.List<Long> demandPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("demandPlanStatus")
    private String demandPlanStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roCode")
    private String roCode;

    private PageDemandPlanWithDemandInfoRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.approvalStatus = builder.approvalStatus;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.creatorStaffId = builder.creatorStaffId;
        this.demandDeliveryStatus = builder.demandDeliveryStatus;
        this.demandId = builder.demandId;
        this.demandPlanId = builder.demandPlanId;
        this.demandPlanStatus = builder.demandPlanStatus;
        this.operator = builder.operator;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.roCode = builder.roCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageDemandPlanWithDemandInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return creatorStaffId
     */
    public String getCreatorStaffId() {
        return this.creatorStaffId;
    }

    /**
     * @return demandDeliveryStatus
     */
    public String getDemandDeliveryStatus() {
        return this.demandDeliveryStatus;
    }

    /**
     * @return demandId
     */
    public java.util.List<Long> getDemandId() {
        return this.demandId;
    }

    /**
     * @return demandPlanId
     */
    public java.util.List<Long> getDemandPlanId() {
        return this.demandPlanId;
    }

    /**
     * @return demandPlanStatus
     */
    public String getDemandPlanStatus() {
        return this.demandPlanStatus;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return roCode
     */
    public String getRoCode() {
        return this.roCode;
    }

    public static final class Builder extends Request.Builder<PageDemandPlanWithDemandInfoRequest, Builder> {
        private String yunUserId; 
        private String approvalStatus; 
        private String createTimeEnd; 
        private String createTimeStart; 
        private String creatorStaffId; 
        private String demandDeliveryStatus; 
        private java.util.List<Long> demandId; 
        private java.util.List<Long> demandPlanId; 
        private String demandPlanStatus; 
        private String operator; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String roCode; 

        private Builder() {
            super();
        } 

        private Builder(PageDemandPlanWithDemandInfoRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.approvalStatus = request.approvalStatus;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.creatorStaffId = request.creatorStaffId;
            this.demandDeliveryStatus = request.demandDeliveryStatus;
            this.demandId = request.demandId;
            this.demandPlanId = request.demandPlanId;
            this.demandPlanStatus = request.demandPlanStatus;
            this.operator = request.operator;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.roCode = request.roCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * approvalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.putBodyParameter("approvalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * createTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putBodyParameter("createTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * createTimeStart.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putBodyParameter("createTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * creatorStaffId.
         */
        public Builder creatorStaffId(String creatorStaffId) {
            this.putBodyParameter("creatorStaffId", creatorStaffId);
            this.creatorStaffId = creatorStaffId;
            return this;
        }

        /**
         * demandDeliveryStatus.
         */
        public Builder demandDeliveryStatus(String demandDeliveryStatus) {
            this.putBodyParameter("demandDeliveryStatus", demandDeliveryStatus);
            this.demandDeliveryStatus = demandDeliveryStatus;
            return this;
        }

        /**
         * demandId.
         */
        public Builder demandId(java.util.List<Long> demandId) {
            this.putBodyParameter("demandId", demandId);
            this.demandId = demandId;
            return this;
        }

        /**
         * demandPlanId.
         */
        public Builder demandPlanId(java.util.List<Long> demandPlanId) {
            this.putBodyParameter("demandPlanId", demandPlanId);
            this.demandPlanId = demandPlanId;
            return this;
        }

        /**
         * demandPlanStatus.
         */
        public Builder demandPlanStatus(String demandPlanStatus) {
            this.putBodyParameter("demandPlanStatus", demandPlanStatus);
            this.demandPlanStatus = demandPlanStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operator(String operator) {
            this.putBodyParameter("operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * roCode.
         */
        public Builder roCode(String roCode) {
            this.putBodyParameter("roCode", roCode);
            this.roCode = roCode;
            return this;
        }

        @Override
        public PageDemandPlanWithDemandInfoRequest build() {
            return new PageDemandPlanWithDemandInfoRequest(this);
        } 

    } 

}
