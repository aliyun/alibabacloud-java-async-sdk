// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListMergeRequestPatchSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMergeRequestPatchSetsResponseBody</p>
 */
public class ListMergeRequestPatchSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListMergeRequestPatchSetsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMergeRequestPatchSetsResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListMergeRequestPatchSetsResponseBody build() {
            return new ListMergeRequestPatchSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMergeRequestPatchSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMergeRequestPatchSetsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commitId")
        private String commitId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("patchSetBizId")
        private String patchSetBizId;

        @com.aliyun.core.annotation.NameInMap("patchSetName")
        private String patchSetName;

        @com.aliyun.core.annotation.NameInMap("patchSetNo")
        private Long patchSetNo;

        @com.aliyun.core.annotation.NameInMap("relatedMergeItemType")
        private String relatedMergeItemType;

        @com.aliyun.core.annotation.NameInMap("shortCommitId")
        private String shortCommitId;

        private Result(Builder builder) {
            this.commitId = builder.commitId;
            this.createdAt = builder.createdAt;
            this.patchSetBizId = builder.patchSetBizId;
            this.patchSetName = builder.patchSetName;
            this.patchSetNo = builder.patchSetNo;
            this.relatedMergeItemType = builder.relatedMergeItemType;
            this.shortCommitId = builder.shortCommitId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return patchSetBizId
         */
        public String getPatchSetBizId() {
            return this.patchSetBizId;
        }

        /**
         * @return patchSetName
         */
        public String getPatchSetName() {
            return this.patchSetName;
        }

        /**
         * @return patchSetNo
         */
        public Long getPatchSetNo() {
            return this.patchSetNo;
        }

        /**
         * @return relatedMergeItemType
         */
        public String getRelatedMergeItemType() {
            return this.relatedMergeItemType;
        }

        /**
         * @return shortCommitId
         */
        public String getShortCommitId() {
            return this.shortCommitId;
        }

        public static final class Builder {
            private String commitId; 
            private String createdAt; 
            private String patchSetBizId; 
            private String patchSetName; 
            private Long patchSetNo; 
            private String relatedMergeItemType; 
            private String shortCommitId; 

            /**
             * commitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * patchSetBizId.
             */
            public Builder patchSetBizId(String patchSetBizId) {
                this.patchSetBizId = patchSetBizId;
                return this;
            }

            /**
             * patchSetName.
             */
            public Builder patchSetName(String patchSetName) {
                this.patchSetName = patchSetName;
                return this;
            }

            /**
             * patchSetNo.
             */
            public Builder patchSetNo(Long patchSetNo) {
                this.patchSetNo = patchSetNo;
                return this;
            }

            /**
             * relatedMergeItemType.
             */
            public Builder relatedMergeItemType(String relatedMergeItemType) {
                this.relatedMergeItemType = relatedMergeItemType;
                return this;
            }

            /**
             * shortCommitId.
             */
            public Builder shortCommitId(String shortCommitId) {
                this.shortCommitId = shortCommitId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
