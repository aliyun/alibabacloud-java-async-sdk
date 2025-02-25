// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDeviceOtaTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDeviceOtaTaskStatusRequest</p>
 */
public class SetDeviceOtaTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer operationStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskId;

    private SetDeviceOtaTaskStatusRequest(Builder builder) {
        super(builder);
        this.operationStatus = builder.operationStatus;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeviceOtaTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationStatus
     */
    public Integer getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SetDeviceOtaTaskStatusRequest, Builder> {
        private Integer operationStatus; 
        private Integer taskId; 

        private Builder() {
            super();
        } 

        private Builder(SetDeviceOtaTaskStatusRequest request) {
            super(request);
            this.operationStatus = request.operationStatus;
            this.taskId = request.taskId;
        } 

        /**
         * OperationStatus.
         */
        public Builder operationStatus(Integer operationStatus) {
            this.putBodyParameter("OperationStatus", operationStatus);
            this.operationStatus = operationStatus;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Integer taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public SetDeviceOtaTaskStatusRequest build() {
            return new SetDeviceOtaTaskStatusRequest(this);
        } 

    } 

}
