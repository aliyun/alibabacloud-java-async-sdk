// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSmoothExpandPreCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSmoothExpandPreCheckResponseBody</p>
 */
public class SubmitSmoothExpandPreCheckResponseBody extends TeaModel {
    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private Long taskId;

    private SubmitSmoothExpandPreCheckResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSmoothExpandPreCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 
        private Boolean success; 
        private Long taskId; 

        /**
         * The result of the precheck task.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the precheck task.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public SubmitSmoothExpandPreCheckResponseBody build() {
            return new SubmitSmoothExpandPreCheckResponseBody(this);
        } 

    } 

}
