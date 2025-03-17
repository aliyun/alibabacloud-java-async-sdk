// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DeleteAbacPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAbacPolicyResponseBody</p>
 */
public class DeleteAbacPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeletePolicyResult")
    private Boolean deletePolicyResult;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteAbacPolicyResponseBody(Builder builder) {
        this.deletePolicyResult = builder.deletePolicyResult;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAbacPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletePolicyResult
     */
    public Boolean getDeletePolicyResult() {
        return this.deletePolicyResult;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Boolean deletePolicyResult; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteAbacPolicyResponseBody model) {
            this.deletePolicyResult = model.deletePolicyResult;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * DeletePolicyResult.
         */
        public Builder deletePolicyResult(Boolean deletePolicyResult) {
            this.deletePolicyResult = deletePolicyResult;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteAbacPolicyResponseBody build() {
            return new DeleteAbacPolicyResponseBody(this);
        } 

    } 

}
