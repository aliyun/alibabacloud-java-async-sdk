// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
         * <p>The error code returned if a task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>mst.errorcode.success.errormessage</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the failed task. This parameter is returned if a task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0mqaj5hnyofczv****</p>
         */
        public Builder errorTaskId(String errorTaskId) {
            this.errorTaskId = errorTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2B98499B-E62B-56D4-8D7F-3D6D4DB260F2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of completed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
