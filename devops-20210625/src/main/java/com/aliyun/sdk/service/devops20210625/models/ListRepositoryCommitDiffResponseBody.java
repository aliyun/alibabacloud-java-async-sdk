// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryCommitDiffResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepositoryCommitDiffResponseBody</p>
 */
public class ListRepositoryCommitDiffResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("success")
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
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

    public static class Result extends TeaModel {
        @NameInMap("aMode")
        private String aMode;

        @NameInMap("bMode")
        private String bMode;

        @NameInMap("deletedFile")
        private Boolean deletedFile;

        @NameInMap("diff")
        private String diff;

        @NameInMap("isBinary")
        private Boolean isBinary;

        @NameInMap("isNewLfs")
        private Boolean isNewLfs;

        @NameInMap("isOldLfs")
        private Boolean isOldLfs;

        @NameInMap("newFile")
        private Boolean newFile;

        @NameInMap("newId")
        private String newId;

        @NameInMap("newPath")
        private String newPath;

        @NameInMap("oldId")
        private String oldId;

        @NameInMap("oldPath")
        private String oldPath;

        @NameInMap("renamedFile")
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
