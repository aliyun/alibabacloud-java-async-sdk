// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RetryKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
 *
 * <p>RetryKnowledgeBaseFilesResponseBody</p>
 */
public class RetryKnowledgeBaseFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SucceededCount")
    private Integer succeededCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private RetryKnowledgeBaseFilesResponseBody(Builder builder) {
        this.failedCount = builder.failedCount;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.succeededCount = builder.succeededCount;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryKnowledgeBaseFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return succeededCount
     */
    public Integer getSucceededCount() {
        return this.succeededCount;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer failedCount; 
        private java.util.List<Items> items; 
        private String requestId; 
        private Integer succeededCount; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(RetryKnowledgeBaseFilesResponseBody model) {
            this.failedCount = model.failedCount;
            this.items = model.items;
            this.requestId = model.requestId;
            this.succeededCount = model.succeededCount;
            this.totalCount = model.totalCount;
        } 

        /**
         * FailedCount.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SucceededCount.
         */
        public Builder succeededCount(Integer succeededCount) {
            this.succeededCount = succeededCount;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public RetryKnowledgeBaseFilesResponseBody build() {
            return new RetryKnowledgeBaseFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetryKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>RetryKnowledgeBaseFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Items(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.fileId = builder.fileId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String fileId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.fileId = model.fileId;
                this.success = model.success;
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
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
