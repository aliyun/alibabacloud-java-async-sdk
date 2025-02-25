// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSqlFlashbackTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSqlFlashbackTaskResponseBody</p>
 */
public class SubmitSqlFlashbackTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private Long taskId;

    private SubmitSqlFlashbackTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSqlFlashbackTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private Long taskId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the database creation failure records were removed from the DRDS instance.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the replication task.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public SubmitSqlFlashbackTaskResponseBody build() {
            return new SubmitSqlFlashbackTaskResponseBody(this);
        } 

    } 

}
