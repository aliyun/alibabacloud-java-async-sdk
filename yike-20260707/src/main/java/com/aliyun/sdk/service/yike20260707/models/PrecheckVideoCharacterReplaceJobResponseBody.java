// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link PrecheckVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
 *
 * <p>PrecheckVideoCharacterReplaceJobResponseBody</p>
 */
public class PrecheckVideoCharacterReplaceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private PrecheckVideoCharacterReplaceJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckVideoCharacterReplaceJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private String status; 

        private Builder() {
        } 

        private Builder(PrecheckVideoCharacterReplaceJobResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of items that failed the validation. This is an empty array if the validation passes.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The pre-validation status. A value of Success indicates that the validation passed. A value of Failed indicates that one or more items failed the validation.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public PrecheckVideoCharacterReplaceJobResponseBody build() {
            return new PrecheckVideoCharacterReplaceJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PrecheckVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
     *
     * <p>PrecheckVideoCharacterReplaceJobResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Result(Builder builder) {
            this.errorCode = builder.errorCode;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String errorCode; 
            private String key; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.errorCode = model.errorCode;
                this.key = model.key;
            } 

            /**
             * <p>The validation error code for the input item. For example, ImageCheckFailed indicates that the image validation failed, and AudioCheckFailed indicates that the audio validation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>ImageCheckFailed</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The name of the input parameter that failed the validation, which matches the corresponding field name in AppParams.</p>
             * 
             * <strong>example:</strong>
             * <p>LoadImage.1.TargetImage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
