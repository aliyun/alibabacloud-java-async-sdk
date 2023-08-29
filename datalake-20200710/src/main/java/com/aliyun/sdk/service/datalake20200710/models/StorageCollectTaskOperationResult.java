// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StorageCollectTaskOperationResult} extends {@link TeaModel}
 *
 * <p>StorageCollectTaskOperationResult</p>
 */
public class StorageCollectTaskOperationResult extends TeaModel {
    @NameInMap("DlfCreated")
    private Boolean dlfCreated;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskType")
    private String taskType;

    private StorageCollectTaskOperationResult(Builder builder) {
        this.dlfCreated = builder.dlfCreated;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorageCollectTaskOperationResult create() {
        return builder().build();
    }

    /**
     * @return dlfCreated
     */
    public Boolean getDlfCreated() {
        return this.dlfCreated;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private Boolean dlfCreated; 
        private String errCode; 
        private String errMessage; 
        private Boolean success; 
        private String taskId; 
        private String taskType; 

        /**
         * DlfCreated.
         */
        public Builder dlfCreated(Boolean dlfCreated) {
            this.dlfCreated = dlfCreated;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public StorageCollectTaskOperationResult build() {
            return new StorageCollectTaskOperationResult(this);
        } 

    } 

}
