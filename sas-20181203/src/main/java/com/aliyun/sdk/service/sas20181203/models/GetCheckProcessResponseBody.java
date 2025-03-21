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
 * {@link GetCheckProcessResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckProcessResponseBody</p>
 */
public class GetCheckProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FinishCount")
    private Integer finishCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private String statusCode;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetCheckProcessResponseBody(Builder builder) {
        this.finishCount = builder.finishCount;
        this.requestId = builder.requestId;
        this.statusCode = builder.statusCode;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckProcessResponseBody create() {
        return builder().build();
    }

    /**
     * @return finishCount
     */
    public Integer getFinishCount() {
        return this.finishCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusCode
     */
    public String getStatusCode() {
        return this.statusCode;
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
        private Integer finishCount; 
        private String requestId; 
        private String statusCode; 
        private String taskId; 
        private Integer totalCount; 

        /**
         * <p>The total number of assets on which the task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D18B5DAD-BA97-5552-AE48-83F59D5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code of the Cloud Security Posture Management (CSPM) task. Valid values:</p>
         * <ul>
         * <li>0: The task is being initialized. The system is calculating the total number of subtasks.</li>
         * <li>1: The task is being executed. You can query the total number of tasks and the number of completed tasks.</li>
         * <li>2: The task is successful.</li>
         * <li>3: The task times out.</li>
         * <li>4: The task is invalid. Check whether assets exist.</li>
         * <li>5: No task record is found. Check whether the TaskId parameter is valid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder statusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>5347c7b6-c85c-4070-846a-3029e08e****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The total number of assets on which the task is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>113</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetCheckProcessResponseBody build() {
            return new GetCheckProcessResponseBody(this);
        } 

    } 

}
