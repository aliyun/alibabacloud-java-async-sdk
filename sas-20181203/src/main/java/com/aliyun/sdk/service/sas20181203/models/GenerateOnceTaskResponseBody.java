// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GenerateOnceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOnceTaskResponseBody</p>
 */
public class GenerateOnceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanCreate")
    private Boolean canCreate;

    @com.aliyun.core.annotation.NameInMap("CollectTime")
    private Long collectTime;

    @com.aliyun.core.annotation.NameInMap("FinishCount")
    private Integer finishCount;

    @com.aliyun.core.annotation.NameInMap("LastTask")
    private String lastTask;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Indicates whether you can create more scan tasks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p>By default, a maximum of 10 scan tasks can be running at the same time. If 10 image scan tasks are running, you cannot create a scan task by calling this operation. You must wait for at least one of the 10 existing scan tasks to complete before you can create a scan task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canCreate(Boolean canCreate) {
            this.canCreate = canCreate;
            return this;
        }

        /**
         * <p>The collection time.</p>
         * 
         * <strong>example:</strong>
         * <p>1670307567000</p>
         */
        public Builder collectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }

        /**
         * <p>The number of scan tasks that are complete.</p>
         * 
         * <strong>example:</strong>
         * <p>61</p>
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }

        /**
         * <p>The ID of the last scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>38730bb078f4a1461d4ed283994c****</p>
         */
        public Builder lastTask(String lastTask) {
            this.lastTask = lastTask;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8BB6B8FA-39E8-5654-A309-8EED13B1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>38730bb078f4a1461d4ed283994c****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The total number of scan tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
