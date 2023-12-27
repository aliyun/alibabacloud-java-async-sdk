// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTaskInfoResponseBody</p>
 */
public class ModifyTaskInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorTaskId")
    private String errorTaskId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessCount")
    private String successCount;

    private ModifyTaskInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorTaskId = builder.errorTaskId;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorTaskId
     */
    public String getErrorTaskId() {
        return this.errorTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public String getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorTaskId; 
        private String requestId; 
        private String successCount; 

        /**
         * The error code for the failed task. It is the same as that of the ModifyTaskInfo operation.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the failed task. The operation returns results after a task fails.
         */
        public Builder errorTaskId(String errorTaskId) {
            this.errorTaskId = errorTaskId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of successful tasks.
         */
        public Builder successCount(String successCount) {
            this.successCount = successCount;
            return this;
        }

        public ModifyTaskInfoResponseBody build() {
            return new ModifyTaskInfoResponseBody(this);
        } 

    } 

}
