// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScanTaskProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanTaskProgressResponseBody</p>
 */
public class DescribeScanTaskProgressResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskStatus")
    private String taskStatus;

    private DescribeScanTaskProgressResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanTaskProgressResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String createTime; 
        private String requestId; 
        private String taskStatus; 

        /**
         * The time when the task was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the task. Valid values:
         * <p>
         * 
         * *   init: The task is being initialized.
         * *   Processing: The task is in progress.
         * *   Success: The task is completed.
         * *   Failed: The task failed.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public DescribeScanTaskProgressResponseBody build() {
            return new DescribeScanTaskProgressResponseBody(this);
        } 

    } 

}
