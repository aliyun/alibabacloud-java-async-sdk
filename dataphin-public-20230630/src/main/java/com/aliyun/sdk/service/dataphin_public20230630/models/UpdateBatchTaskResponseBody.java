// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateBatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBatchTaskResponseBody</p>
 */
public class UpdateBatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UpdateResult")
    private UpdateResult updateResult;

    private UpdateBatchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.updateResult = builder.updateResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBatchTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return updateResult
     */
    public UpdateResult getUpdateResult() {
        return this.updateResult;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private UpdateResult updateResult; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        /**
         * UpdateResult.
         */
        public Builder updateResult(UpdateResult updateResult) {
            this.updateResult = updateResult;
            return this;
        }

        public UpdateBatchTaskResponseBody build() {
            return new UpdateBatchTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskResponseBody</p>
     */
    public static class UpdateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        private UpdateResult(Builder builder) {
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateResult create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private Long fileId; 

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            public UpdateResult build() {
                return new UpdateResult(this);
            } 

        } 

    }
}
