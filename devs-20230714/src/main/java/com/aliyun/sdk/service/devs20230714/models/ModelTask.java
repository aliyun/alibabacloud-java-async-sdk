// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ModelTask} extends {@link TeaModel}
 *
 * <p>ModelTask</p>
 */
public class ModelTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("fileSize")
    private Double fileSize;

    @com.aliyun.core.annotation.NameInMap("finishTime")
    private Double finishTime;

    @com.aliyun.core.annotation.NameInMap("finished")
    private Boolean finished;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Double startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Float total;

    private ModelTask(Builder builder) {
        this.errMsg = builder.errMsg;
        this.fileSize = builder.fileSize;
        this.finishTime = builder.finishTime;
        this.finished = builder.finished;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return fileSize
     */
    public Double getFileSize() {
        return this.fileSize;
    }

    /**
     * @return finishTime
     */
    public Double getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return finished
     */
    public Boolean getFinished() {
        return this.finished;
    }

    /**
     * @return startTime
     */
    public Double getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return total
     */
    public Float getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errMsg; 
        private Double fileSize; 
        private Double finishTime; 
        private Boolean finished; 
        private Double startTime; 
        private String status; 
        private String taskId; 
        private Float total; 

        private Builder() {
        } 

        private Builder(ModelTask model) {
            this.errMsg = model.errMsg;
            this.fileSize = model.fileSize;
            this.finishTime = model.finishTime;
            this.finished = model.finished;
            this.startTime = model.startTime;
            this.status = model.status;
            this.taskId = model.taskId;
            this.total = model.total;
        } 

        /**
         * errMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * fileSize.
         */
        public Builder fileSize(Double fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * finishTime.
         */
        public Builder finishTime(Double finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * finished.
         */
        public Builder finished(Boolean finished) {
            this.finished = finished;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Float total) {
            this.total = total;
            return this;
        }

        public ModelTask build() {
            return new ModelTask(this);
        } 

    } 

}
