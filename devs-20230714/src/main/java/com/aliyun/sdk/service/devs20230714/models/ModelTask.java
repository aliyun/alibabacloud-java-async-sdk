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
    @com.aliyun.core.annotation.NameInMap("currentBytes")
    private String currentBytes;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("extra")
    private Object extra;

    @com.aliyun.core.annotation.NameInMap("fileSize")
    @Deprecated
    private Double fileSize;

    @com.aliyun.core.annotation.NameInMap("finishTime")
    @Deprecated
    private Double finishTime;

    @com.aliyun.core.annotation.NameInMap("finished")
    private Boolean finished;

    @com.aliyun.core.annotation.NameInMap("finishedTime")
    private Double finishedTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("params")
    private String params;

    @com.aliyun.core.annotation.NameInMap("result")
    private Object result;

    @com.aliyun.core.annotation.NameInMap("speed")
    private String speed;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Double startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("total")
    @Deprecated
    private Float total;

    @com.aliyun.core.annotation.NameInMap("totalBytes")
    private String totalBytes;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Double updateTime;

    private ModelTask(Builder builder) {
        this.currentBytes = builder.currentBytes;
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.extra = builder.extra;
        this.fileSize = builder.fileSize;
        this.finishTime = builder.finishTime;
        this.finished = builder.finished;
        this.finishedTime = builder.finishedTime;
        this.id = builder.id;
        this.params = builder.params;
        this.result = builder.result;
        this.speed = builder.speed;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
        this.total = builder.total;
        this.totalBytes = builder.totalBytes;
        this.updateTime = builder.updateTime;
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
     * @return currentBytes
     */
    public String getCurrentBytes() {
        return this.currentBytes;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return extra
     */
    public Object getExtra() {
        return this.extra;
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
     * @return finishedTime
     */
    public Double getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return result
     */
    public Object getResult() {
        return this.result;
    }

    /**
     * @return speed
     */
    public String getSpeed() {
        return this.speed;
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
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return total
     */
    public Float getTotal() {
        return this.total;
    }

    /**
     * @return totalBytes
     */
    public String getTotalBytes() {
        return this.totalBytes;
    }

    /**
     * @return updateTime
     */
    public Double getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String currentBytes; 
        private String errCode; 
        private String errMsg; 
        private Object extra; 
        private Double fileSize; 
        private Double finishTime; 
        private Boolean finished; 
        private Double finishedTime; 
        private String id; 
        private String params; 
        private Object result; 
        private String speed; 
        private Double startTime; 
        private String status; 
        private String taskId; 
        private String taskType; 
        private Float total; 
        private String totalBytes; 
        private Double updateTime; 

        private Builder() {
        } 

        private Builder(ModelTask model) {
            this.currentBytes = model.currentBytes;
            this.errCode = model.errCode;
            this.errMsg = model.errMsg;
            this.extra = model.extra;
            this.fileSize = model.fileSize;
            this.finishTime = model.finishTime;
            this.finished = model.finished;
            this.finishedTime = model.finishedTime;
            this.id = model.id;
            this.params = model.params;
            this.result = model.result;
            this.speed = model.speed;
            this.startTime = model.startTime;
            this.status = model.status;
            this.taskId = model.taskId;
            this.taskType = model.taskType;
            this.total = model.total;
            this.totalBytes = model.totalBytes;
            this.updateTime = model.updateTime;
        } 

        /**
         * currentBytes.
         */
        public Builder currentBytes(String currentBytes) {
            this.currentBytes = currentBytes;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(Object extra) {
            this.extra = extra;
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
         * finishedTime.
         */
        public Builder finishedTime(Double finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * params.
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        /**
         * speed.
         */
        public Builder speed(String speed) {
            this.speed = speed;
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
         * taskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Float total) {
            this.total = total;
            return this;
        }

        /**
         * totalBytes.
         */
        public Builder totalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(Double updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ModelTask build() {
            return new ModelTask(this);
        } 

    } 

}
