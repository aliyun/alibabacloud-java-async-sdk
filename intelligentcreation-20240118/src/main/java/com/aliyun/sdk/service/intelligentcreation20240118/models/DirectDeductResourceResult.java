// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DirectDeductResourceResult} extends {@link TeaModel}
 *
 * <p>DirectDeductResourceResult</p>
 */
public class DirectDeductResourceResult extends TeaModel {
    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("errorcode")
    private String errorcode;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private DirectDeductResourceResult(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.errorcode = builder.errorcode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DirectDeductResourceResult create() {
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

    public static final class Builder {
        private String errorMessage; 
        private String errorcode; 
        private String requestId; 
        private Boolean success; 

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

        public DirectDeductResourceResult build() {
            return new DirectDeductResourceResult(this);
        } 

    } 

}
