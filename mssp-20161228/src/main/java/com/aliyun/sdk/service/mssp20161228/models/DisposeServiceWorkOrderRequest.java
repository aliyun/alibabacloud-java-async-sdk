// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisposeServiceWorkOrderRequest} extends {@link RequestModel}
 *
 * <p>DisposeServiceWorkOrderRequest</p>
 */
public class DisposeServiceWorkOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttachmentName")
    private String attachmentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForwardOwnerId")
    private String forwardOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsAttachment")
    private String isAttachment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsWorkOrderNotify")
    private String isWorkOrderNotify;

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
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeOwnerId")
    private String upgradeOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderDetail")
    private String workOrderDetail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workOrderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkOrderStatus")
    private String workOrderStatus;

    private DisposeServiceWorkOrderRequest(Builder builder) {
        super(builder);
        this.attachmentName = builder.attachmentName;
        this.endTime = builder.endTime;
        this.forwardOwnerId = builder.forwardOwnerId;
        this.id = builder.id;
        this.isAttachment = builder.isAttachment;
        this.isWorkOrderNotify = builder.isWorkOrderNotify;
        this.notifyId = builder.notifyId;
        this.operateRemark = builder.operateRemark;
        this.operateType = builder.operateType;
        this.operator = builder.operator;
        this.startTime = builder.startTime;
        this.upgradeOwnerId = builder.upgradeOwnerId;
        this.workOrderDetail = builder.workOrderDetail;
        this.workOrderName = builder.workOrderName;
        this.workOrderStatus = builder.workOrderStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisposeServiceWorkOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachmentName
     */
    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return forwardOwnerId
     */
    public String getForwardOwnerId() {
        return this.forwardOwnerId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return upgradeOwnerId
     */
    public String getUpgradeOwnerId() {
        return this.upgradeOwnerId;
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
     * @return workOrderStatus
     */
    public String getWorkOrderStatus() {
        return this.workOrderStatus;
    }

    public static final class Builder extends Request.Builder<DisposeServiceWorkOrderRequest, Builder> {
        private String attachmentName; 
        private Long endTime; 
        private String forwardOwnerId; 
        private Long id; 
        private String isAttachment; 
        private String isWorkOrderNotify; 
        private Long notifyId; 
        private String operateRemark; 
        private String operateType; 
        private String operator; 
        private Long startTime; 
        private String upgradeOwnerId; 
        private String workOrderDetail; 
        private String workOrderName; 
        private String workOrderStatus; 

        private Builder() {
            super();
        } 

        private Builder(DisposeServiceWorkOrderRequest request) {
            super(request);
            this.attachmentName = request.attachmentName;
            this.endTime = request.endTime;
            this.forwardOwnerId = request.forwardOwnerId;
            this.id = request.id;
            this.isAttachment = request.isAttachment;
            this.isWorkOrderNotify = request.isWorkOrderNotify;
            this.notifyId = request.notifyId;
            this.operateRemark = request.operateRemark;
            this.operateType = request.operateType;
            this.operator = request.operator;
            this.startTime = request.startTime;
            this.upgradeOwnerId = request.upgradeOwnerId;
            this.workOrderDetail = request.workOrderDetail;
            this.workOrderName = request.workOrderName;
            this.workOrderStatus = request.workOrderStatus;
        } 

        /**
         * <p>Attachment name.</p>
         * 
         * <strong>example:</strong>
         * <p>bbaa133c-0ac2-489f-9fc8-39f91c2e770c_20230301-20240403-服务工单列表.xlsx</p>
         */
        public Builder attachmentName(String attachmentName) {
            this.putBodyParameter("AttachmentName", attachmentName);
            this.attachmentName = attachmentName;
            return this;
        }

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-14 00:00:00</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Forward to owner.</p>
         * 
         * <strong>example:</strong>
         * <p>405639</p>
         */
        public Builder forwardOwnerId(String forwardOwnerId) {
            this.putBodyParameter("ForwardOwnerId", forwardOwnerId);
            this.forwardOwnerId = forwardOwnerId;
            return this;
        }

        /**
         * <p>Work order ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23172</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Attachment requirement.</p>
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
         * <p>Work order notification.</p>
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
         * <p>处理完成</p>
         */
        public Builder operateRemark(String operateRemark) {
            this.putBodyParameter("OperateRemark", operateRemark);
            this.operateRemark = operateRemark;
            return this;
        }

        /**
         * <p>Processing type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSED</p>
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
         * <p>396120</p>
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-02 00:00:00</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Upgrade owner.</p>
         * 
         * <strong>example:</strong>
         * <p>336333</p>
         */
        public Builder upgradeOwnerId(String upgradeOwnerId) {
            this.putBodyParameter("UpgradeOwnerId", upgradeOwnerId);
            this.upgradeOwnerId = upgradeOwnerId;
            return this;
        }

        /**
         * <p>Work order details.</p>
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
         * <p>安全产品配置问题与超量提醒</p>
         */
        public Builder workOrderName(String workOrderName) {
            this.putBodyParameter("WorkOrderName", workOrderName);
            this.workOrderName = workOrderName;
            return this;
        }

        /**
         * <p>Work order status.</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSED</p>
         */
        public Builder workOrderStatus(String workOrderStatus) {
            this.putBodyParameter("WorkOrderStatus", workOrderStatus);
            this.workOrderStatus = workOrderStatus;
            return this;
        }

        @Override
        public DisposeServiceWorkOrderRequest build() {
            return new DisposeServiceWorkOrderRequest(this);
        } 

    } 

}
