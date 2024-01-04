// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpectDeductResourceResult} extends {@link TeaModel}
 *
 * <p>ExpectDeductResourceResult</p>
 */
public class ExpectDeductResourceResult extends TeaModel {
    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("errorcode")
    private String errorcode;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("taskId")
    private String taskId;

    private ExpectDeductResourceResult(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.errorcode = builder.errorcode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpectDeductResourceResult create() {
        return builder().build();
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return errorcode
     */
    public String getErrorcode() {
        return this.errorcode;
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
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String errorMessage; 
        private String errorcode; 
        private String requestId; 
        private Boolean success; 
        private String taskId; 

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * errorcode.
         */
        public Builder errorcode(String errorcode) {
            this.errorcode = errorcode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ExpectDeductResourceResult build() {
            return new ExpectDeductResourceResult(this);
        } 

    } 

}
