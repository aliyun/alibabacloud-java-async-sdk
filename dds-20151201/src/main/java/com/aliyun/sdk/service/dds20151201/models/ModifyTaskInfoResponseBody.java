// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link ModifyTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTaskInfoResponseBody</p>
 */
public class ModifyTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorTaskId")
    private String errorTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyTaskInfoResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorTaskId = model.errorTaskId;
            this.requestId = model.requestId;
            this.successCount = model.successCount;
        } 

        /**
         * <p>The error code for the failed task. It is the same as that of the ModifyTaskInfo operation.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the failed task. The operation returns results after a task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorTaskId(String errorTaskId) {
            this.errorTaskId = errorTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6163731A-XXXX-XXXX-B934-3388DE70C217</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of successful tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
