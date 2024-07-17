// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGrantPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGrantPermissionsResponseBody</p>
 */
public class BatchGrantPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchGrantRevokeFailureResult")
    private java.util.List < GrantRevokeFailureEntry > batchGrantRevokeFailureResult;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchGrantPermissionsResponseBody(Builder builder) {
        this.batchGrantRevokeFailureResult = builder.batchGrantRevokeFailureResult;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGrantPermissionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchGrantRevokeFailureResult
     */
    public java.util.List < GrantRevokeFailureEntry > getBatchGrantRevokeFailureResult() {
        return this.batchGrantRevokeFailureResult;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private java.util.List < GrantRevokeFailureEntry > batchGrantRevokeFailureResult; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * result
         */
        public Builder batchGrantRevokeFailureResult(java.util.List < GrantRevokeFailureEntry > batchGrantRevokeFailureResult) {
            this.batchGrantRevokeFailureResult = batchGrantRevokeFailureResult;
            return this;
        }

        /**
         * Response Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchGrantPermissionsResponseBody build() {
            return new BatchGrantPermissionsResponseBody(this);
        } 

    } 

}
