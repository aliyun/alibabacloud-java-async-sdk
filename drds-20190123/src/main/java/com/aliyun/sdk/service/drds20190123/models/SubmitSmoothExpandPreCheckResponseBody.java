// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SubmitSmoothExpandPreCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSmoothExpandPreCheckResponseBody</p>
 */
public class SubmitSmoothExpandPreCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
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
         * <p>The result of the precheck task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FE104D26-AC19-49B5-AC67-947F69******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the precheck task.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
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
