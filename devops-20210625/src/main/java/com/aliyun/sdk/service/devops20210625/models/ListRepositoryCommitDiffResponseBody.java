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
 * {@link ListRepositoryCommitDiffResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepositoryCommitDiffResponseBody</p>
 */
public class ListRepositoryCommitDiffResponseBody extends TeaModel {
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

    private ListRepositoryCommitDiffResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoryCommitDiffResponseBody create() {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0EE38A4E-8991-532A-8E8B-5C22B5D2E058</p>
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

        public ListRepositoryCommitDiffResponseBody build() {
            return new ListRepositoryCommitDiffResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepositoryCommitDiffResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepositoryCommitDiffResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aMode")
        private String aMode;

        @com.aliyun.core.annotation.NameInMap("bMode")
        private String bMode;

        @com.aliyun.core.annotation.NameInMap("deletedFile")
        private Boolean deletedFile;

        @com.aliyun.core.annotation.NameInMap("diff")
        private String diff;

        @com.aliyun.core.annotation.NameInMap("isBinary")
        private Boolean isBinary;

        @com.aliyun.core.annotation.NameInMap("isNewLfs")
        private Boolean isNewLfs;

        @com.aliyun.core.annotation.NameInMap("isOldLfs")
        private Boolean isOldLfs;

        @com.aliyun.core.annotation.NameInMap("newFile")
        private Boolean newFile;

        @com.aliyun.core.annotation.NameInMap("newId")
        private String newId;

        @com.aliyun.core.annotation.NameInMap("newPath")
        private String newPath;

        @com.aliyun.core.annotation.NameInMap("oldId")
        private String oldId;

        @com.aliyun.core.annotation.NameInMap("oldPath")
        private String oldPath;

        @com.aliyun.core.annotation.NameInMap("renamedFile")
        private Boolean renamedFile;

        private Result(Builder builder) {
            this.aMode = builder.aMode;
            this.bMode = builder.bMode;
            this.deletedFile = builder.deletedFile;
            this.diff = builder.diff;
            this.isBinary = builder.isBinary;
            this.isNewLfs = builder.isNewLfs;
            this.isOldLfs = builder.isOldLfs;
            this.newFile = builder.newFile;
            this.newId = builder.newId;
            this.newPath = builder.newPath;
            this.oldId = builder.oldId;
            this.oldPath = builder.oldPath;
            this.renamedFile = builder.renamedFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return aMode
         */
        public String getAMode() {
            return this.aMode;
        }

        /**
         * @return bMode
         */
        public String getBMode() {
            return this.bMode;
        }

        /**
         * @return deletedFile
         */
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        /**
         * @return diff
         */
        public String getDiff() {
            return this.diff;
        }

        /**
         * @return isBinary
         */
        public Boolean getIsBinary() {
            return this.isBinary;
        }

        /**
         * @return isNewLfs
         */
        public Boolean getIsNewLfs() {
            return this.isNewLfs;
        }

        /**
         * @return isOldLfs
         */
        public Boolean getIsOldLfs() {
            return this.isOldLfs;
        }

        /**
         * @return newFile
         */
        public Boolean getNewFile() {
            return this.newFile;
        }

        /**
         * @return newId
         */
        public String getNewId() {
            return this.newId;
        }

        /**
         * @return newPath
         */
        public String getNewPath() {
            return this.newPath;
        }

        /**
         * @return oldId
         */
        public String getOldId() {
            return this.oldId;
        }

        /**
         * @return oldPath
         */
        public String getOldPath() {
            return this.oldPath;
        }

        /**
         * @return renamedFile
         */
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public static final class Builder {
            private String aMode; 
            private String bMode; 
            private Boolean deletedFile; 
            private String diff; 
            private Boolean isBinary; 
            private Boolean isNewLfs; 
            private Boolean isOldLfs; 
            private Boolean newFile; 
            private String newId; 
            private String newPath; 
            private String oldId; 
            private String oldPath; 
            private Boolean renamedFile; 

            /**
             * aMode.
             */
            public Builder aMode(String aMode) {
                this.aMode = aMode;
                return this;
            }

            /**
             * bMode.
             */
            public Builder bMode(String bMode) {
                this.bMode = bMode;
                return this;
            }

            /**
             * deletedFile.
             */
            public Builder deletedFile(Boolean deletedFile) {
                this.deletedFile = deletedFile;
                return this;
            }

            /**
             * diff.
             */
            public Builder diff(String diff) {
                this.diff = diff;
                return this;
            }

            /**
             * isBinary.
             */
            public Builder isBinary(Boolean isBinary) {
                this.isBinary = isBinary;
                return this;
            }

            /**
             * isNewLfs.
             */
            public Builder isNewLfs(Boolean isNewLfs) {
                this.isNewLfs = isNewLfs;
                return this;
            }

            /**
             * isOldLfs.
             */
            public Builder isOldLfs(Boolean isOldLfs) {
                this.isOldLfs = isOldLfs;
                return this;
            }

            /**
             * newFile.
             */
            public Builder newFile(Boolean newFile) {
                this.newFile = newFile;
                return this;
            }

            /**
             * newId.
             */
            public Builder newId(String newId) {
                this.newId = newId;
                return this;
            }

            /**
             * newPath.
             */
            public Builder newPath(String newPath) {
                this.newPath = newPath;
                return this;
            }

            /**
             * oldId.
             */
            public Builder oldId(String oldId) {
                this.oldId = oldId;
                return this;
            }

            /**
             * oldPath.
             */
            public Builder oldPath(String oldPath) {
                this.oldPath = oldPath;
                return this;
            }

            /**
             * renamedFile.
             */
            public Builder renamedFile(Boolean renamedFile) {
                this.renamedFile = renamedFile;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
