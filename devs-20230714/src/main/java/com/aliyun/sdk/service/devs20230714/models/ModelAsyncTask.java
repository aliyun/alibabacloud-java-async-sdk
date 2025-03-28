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
 * {@link ModelAsyncTask} extends {@link TeaModel}
 *
 * <p>ModelAsyncTask</p>
 */
public class ModelAsyncTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("finished")
    private Boolean finished;

    @com.aliyun.core.annotation.NameInMap("finishedTime")
    private Long finishedTime;

    @com.aliyun.core.annotation.NameInMap("result")
    private Object result;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private ModelAsyncTask(Builder builder) {
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.finished = builder.finished;
        this.finishedTime = builder.finishedTime;
        this.result = builder.result;
        this.startTime = builder.startTime;
        this.taskType = builder.taskType;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelAsyncTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return finished
     */
    public Boolean getFinished() {
        return this.finished;
    }

    /**
     * @return finishedTime
     */
    public Long getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * @return result
     */
    public Object getResult() {
        return this.result;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String errCode; 
        private String errMsg; 
        private Boolean finished; 
        private Long finishedTime; 
        private Object result; 
        private Long startTime; 
        private String taskType; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(ModelAsyncTask model) {
            this.errCode = model.errCode;
            this.errMsg = model.errMsg;
            this.finished = model.finished;
            this.finishedTime = model.finishedTime;
            this.result = model.result;
            this.startTime = model.startTime;
            this.taskType = model.taskType;
            this.updateTime = model.updateTime;
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
         * finished.
         */
        public Builder finished(Boolean finished) {
            this.finished = finished;
            return this;
        }

        /**
         * finishedTime.
         */
        public Builder finishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
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
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
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
         * updateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ModelAsyncTask build() {
            return new ModelAsyncTask(this);
        } 

    } 

}
