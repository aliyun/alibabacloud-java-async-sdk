// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateServiceWorkOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceWorkOrderRequest</p>
 */
public class CreateServiceWorkOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Creator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String creator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DurationDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private String durationDay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsAttachment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isAttachment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsWorkOrderNotify")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isWorkOrderNotify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyDay")
    private String notifyDay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyId")
    private Long notifyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateRemark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateRemark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workOrderDetail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workOrderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workOrderSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workOrderStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workOrderType;

    private CreateServiceWorkOrderRequest(Builder builder) {
        super(builder);
        this.creator = builder.creator;
        this.customerId = builder.customerId;
        this.durationDay = builder.durationDay;
        this.isAttachment = builder.isAttachment;
        this.isWorkOrderNotify = builder.isWorkOrderNotify;
        this.notifyDay = builder.notifyDay;
        this.notifyId = builder.notifyId;
        this.operateRemark = builder.operateRemark;
        this.operateType = builder.operateType;
        this.operator = builder.operator;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.workOrderDetail = builder.workOrderDetail;
        this.workOrderName = builder.workOrderName;
        this.workOrderSource = builder.workOrderSource;
        this.workOrderStatus = builder.workOrderStatus;
        this.workOrderType = builder.workOrderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceWorkOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return customerId
     */
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * @return durationDay
     */
    public String getDurationDay() {
        return this.durationDay;
    }

    /**
     * @return isAttachment
     */
    public String getIsAttachment() {
        return this.isAttachment;
    }

    /**
     * @return isWorkOrderNotify
     */
    public String getIsWorkOrderNotify() {
        return this.isWorkOrderNotify;
    }

    /**
     * @return notifyDay
     */
    public String getNotifyDay() {
        return this.notifyDay;
    }

    /**
     * @return notifyId
     */
    public Long getNotifyId() {
        return this.notifyId;
    }

    /**
     * @return operateRemark
     */
    public String getOperateRemark() {
        return this.operateRemark;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return workOrderDetail
     */
    public String getWorkOrderDetail() {
        return this.workOrderDetail;
    }

    /**
     * @return workOrderName
     */
    public String getWorkOrderName() {
        return this.workOrderName;
    }

    /**
     * @return workOrderSource
     */
    public String getWorkOrderSource() {
        return this.workOrderSource;
    }

    /**
     * @return workOrderStatus
     */
    public String getWorkOrderStatus() {
        return this.workOrderStatus;
    }

    /**
     * @return workOrderType
     */
    public String getWorkOrderType() {
        return this.workOrderType;
    }

    public static final class Builder extends Request.Builder<CreateServiceWorkOrderRequest, Builder> {
        private String creator; 
        private String customerId; 
        private String durationDay; 
        private String isAttachment; 
        private String isWorkOrderNotify; 
        private String notifyDay; 
        private Long notifyId; 
        private String operateRemark; 
        private String operateType; 
        private String operator; 
        private String ownerId; 
        private Long startTime; 
        private String workOrderDetail; 
        private String workOrderName; 
        private String workOrderSource; 
        private String workOrderStatus; 
        private String workOrderType; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceWorkOrderRequest request) {
            super(request);
            this.creator = request.creator;
            this.customerId = request.customerId;
            this.durationDay = request.durationDay;
            this.isAttachment = request.isAttachment;
            this.isWorkOrderNotify = request.isWorkOrderNotify;
            this.notifyDay = request.notifyDay;
            this.notifyId = request.notifyId;
            this.operateRemark = request.operateRemark;
            this.operateType = request.operateType;
            this.operator = request.operator;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
            this.workOrderDetail = request.workOrderDetail;
            this.workOrderName = request.workOrderName;
            this.workOrderSource = request.workOrderSource;
            this.workOrderStatus = request.workOrderStatus;
            this.workOrderType = request.workOrderType;
        } 

        /**
         * <p>Creator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>426556</p>
         */
        public Builder creator(String creator) {
            this.putBodyParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>Customer ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1477832102462645</p>
         */
        public Builder customerId(String customerId) {
            this.putBodyParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * <p>Duration in days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder durationDay(String durationDay) {
            this.putBodyParameter("DurationDay", durationDay);
            this.durationDay = durationDay;
            return this;
        }

        /**
         * <p>Attachment requirement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder isAttachment(String isAttachment) {
            this.putBodyParameter("IsAttachment", isAttachment);
            this.isAttachment = isAttachment;
            return this;
        }

        /**
         * <p>Whether a reminder is needed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder isWorkOrderNotify(String isWorkOrderNotify) {
            this.putBodyParameter("IsWorkOrderNotify", isWorkOrderNotify);
            this.isWorkOrderNotify = isWorkOrderNotify;
            return this;
        }

        /**
         * <p>Number of days for advance notification.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder notifyDay(String notifyDay) {
            this.putBodyParameter("NotifyDay", notifyDay);
            this.notifyDay = notifyDay;
            return this;
        }

        /**
         * <p>Notification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder notifyId(Long notifyId) {
            this.putBodyParameter("NotifyId", notifyId);
            this.notifyId = notifyId;
            return this;
        }

        /**
         * <p>Operation remarks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>新建</p>
         */
        public Builder operateRemark(String operateRemark) {
            this.putBodyParameter("OperateRemark", operateRemark);
            this.operateRemark = operateRemark;
            return this;
        }

        /**
         * <p>Operation type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        public Builder operateType(String operateType) {
            this.putBodyParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>Operator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>426556</p>
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ownerId(String ownerId) {
            this.putBodyParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Start time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21 15:25:25</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Work order details.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;questionDetail&quot;:&quot;测试工单&quot;,&quot;answerDetail&quot;:&quot;&quot;}</p>
         */
        public Builder workOrderDetail(String workOrderDetail) {
            this.putBodyParameter("WorkOrderDetail", workOrderDetail);
            this.workOrderDetail = workOrderDetail;
            return this;
        }

        /**
         * <p>Work order name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>安全月报交付任务</p>
         */
        public Builder workOrderName(String workOrderName) {
            this.putBodyParameter("WorkOrderName", workOrderName);
            this.workOrderName = workOrderName;
            return this;
        }

        /**
         * <p>Work order source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>工单迁移</p>
         */
        public Builder workOrderSource(String workOrderSource) {
            this.putBodyParameter("WorkOrderSource", workOrderSource);
            this.workOrderSource = workOrderSource;
            return this;
        }

        /**
         * <p>Work order status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UNPROCESSED</p>
         */
        public Builder workOrderStatus(String workOrderStatus) {
            this.putBodyParameter("WorkOrderStatus", workOrderStatus);
            this.workOrderStatus = workOrderStatus;
            return this;
        }

        /**
         * <p>Work order type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTH_REPORT</p>
         */
        public Builder workOrderType(String workOrderType) {
            this.putBodyParameter("WorkOrderType", workOrderType);
            this.workOrderType = workOrderType;
            return this;
        }

        @Override
        public CreateServiceWorkOrderRequest build() {
            return new CreateServiceWorkOrderRequest(this);
        } 

    } 

}
