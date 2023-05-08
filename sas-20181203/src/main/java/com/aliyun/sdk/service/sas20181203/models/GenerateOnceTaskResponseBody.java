// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOnceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOnceTaskResponseBody</p>
 */
public class GenerateOnceTaskResponseBody extends TeaModel {
    @NameInMap("CanCreate")
    private Boolean canCreate;

    @NameInMap("CollectTime")
    private Long collectTime;

    @NameInMap("FinishCount")
    private Integer finishCount;

    @NameInMap("LastTask")
    private String lastTask;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GenerateOnceTaskResponseBody(Builder builder) {
        this.canCreate = builder.canCreate;
        this.collectTime = builder.collectTime;
        this.finishCount = builder.finishCount;
        this.lastTask = builder.lastTask;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOnceTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return canCreate
     */
    public Boolean getCanCreate() {
        return this.canCreate;
    }

    /**
     * @return collectTime
     */
    public Long getCollectTime() {
        return this.collectTime;
    }

    /**
     * @return finishCount
     */
    public Integer getFinishCount() {
        return this.finishCount;
    }

    /**
     * @return lastTask
     */
    public String getLastTask() {
        return this.lastTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Boolean canCreate; 
        private Long collectTime; 
        private Integer finishCount; 
        private String lastTask; 
        private String requestId; 
        private String taskId; 
        private Integer totalCount; 

        /**
         * The number of scan tasks that are complete.
         */
        public Builder canCreate(Boolean canCreate) {
            this.canCreate = canCreate;
            return this;
        }

        /**
         * CollectTime.
         */
        public Builder collectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }

        /**
         * FinishCount.
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }

        /**
         * LastTask.
         */
        public Builder lastTask(String lastTask) {
            this.lastTask = lastTask;
            return this;
        }

        /**
         * The ID of the scan task.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GenerateOnceTaskResponseBody build() {
            return new GenerateOnceTaskResponseBody(this);
        } 

    } 

}
