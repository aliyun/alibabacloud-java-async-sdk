// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorTaskId.
         */
        public Builder errorTaskId(String errorTaskId) {
            this.errorTaskId = errorTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessCount.
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
