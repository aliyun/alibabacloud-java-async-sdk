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
 * {@link GetMergeRequestChangeTreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetMergeRequestChangeTreeResponseBody</p>
 */
public class GetMergeRequestChangeTreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMergeRequestChangeTreeResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMergeRequestChangeTreeResponseBody create() {
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
    public Result getResult() {
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
        private Result result; 
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
        public Builder result(Result result) {
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

        public GetMergeRequestChangeTreeResponseBody build() {
            return new GetMergeRequestChangeTreeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMergeRequestChangeTreeResponseBody} extends {@link TeaModel}
     *
     * <p>GetMergeRequestChangeTreeResponseBody</p>
     */
    public static class ChangedFilesInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addLines")
        private Long addLines;

        @com.aliyun.core.annotation.NameInMap("binaryFile")
        private Boolean binaryFile;

        @com.aliyun.core.annotation.NameInMap("delLines")
        private Long delLines;

        @com.aliyun.core.annotation.NameInMap("deletedFile")
        private Boolean deletedFile;

        @com.aliyun.core.annotation.NameInMap("newFile")
        private Boolean newFile;

        @com.aliyun.core.annotation.NameInMap("newPath")
        private String newPath;

        @com.aliyun.core.annotation.NameInMap("oldPath")
        private String oldPath;

        @com.aliyun.core.annotation.NameInMap("renamedFile")
        private Boolean renamedFile;

        private ChangedFilesInfos(Builder builder) {
            this.addLines = builder.addLines;
            this.binaryFile = builder.binaryFile;
            this.delLines = builder.delLines;
            this.deletedFile = builder.deletedFile;
            this.newFile = builder.newFile;
            this.newPath = builder.newPath;
            this.oldPath = builder.oldPath;
            this.renamedFile = builder.renamedFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangedFilesInfos create() {
            return builder().build();
        }

        /**
         * @return addLines
         */
        public Long getAddLines() {
            return this.addLines;
        }

        /**
         * @return binaryFile
         */
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        /**
         * @return delLines
         */
        public Long getDelLines() {
            return this.delLines;
        }

        /**
         * @return deletedFile
         */
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        /**
         * @return newFile
         */
        public Boolean getNewFile() {
            return this.newFile;
        }

        /**
         * @return newPath
         */
        public String getNewPath() {
            return this.newPath;
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
            private Long addLines; 
            private Boolean binaryFile; 
            private Long delLines; 
            private Boolean deletedFile; 
            private Boolean newFile; 
            private String newPath; 
            private String oldPath; 
            private Boolean renamedFile; 

            /**
             * addLines.
             */
            public Builder addLines(Long addLines) {
                this.addLines = addLines;
                return this;
            }

            /**
             * binaryFile.
             */
            public Builder binaryFile(Boolean binaryFile) {
                this.binaryFile = binaryFile;
                return this;
            }

            /**
             * delLines.
             */
            public Builder delLines(Long delLines) {
                this.delLines = delLines;
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
             * newFile.
             */
            public Builder newFile(Boolean newFile) {
                this.newFile = newFile;
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

            public ChangedFilesInfos build() {
                return new ChangedFilesInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMergeRequestChangeTreeResponseBody} extends {@link TeaModel}
     *
     * <p>GetMergeRequestChangeTreeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changedFilesCount")
        private Long changedFilesCount;

        @com.aliyun.core.annotation.NameInMap("changedFilesInfos")
        private java.util.List<ChangedFilesInfos> changedFilesInfos;

        @com.aliyun.core.annotation.NameInMap("totalAddLines")
        private Long totalAddLines;

        @com.aliyun.core.annotation.NameInMap("totalDelLines")
        private Long totalDelLines;

        private Result(Builder builder) {
            this.changedFilesCount = builder.changedFilesCount;
            this.changedFilesInfos = builder.changedFilesInfos;
            this.totalAddLines = builder.totalAddLines;
            this.totalDelLines = builder.totalDelLines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return changedFilesCount
         */
        public Long getChangedFilesCount() {
            return this.changedFilesCount;
        }

        /**
         * @return changedFilesInfos
         */
        public java.util.List<ChangedFilesInfos> getChangedFilesInfos() {
            return this.changedFilesInfos;
        }

        /**
         * @return totalAddLines
         */
        public Long getTotalAddLines() {
            return this.totalAddLines;
        }

        /**
         * @return totalDelLines
         */
        public Long getTotalDelLines() {
            return this.totalDelLines;
        }

        public static final class Builder {
            private Long changedFilesCount; 
            private java.util.List<ChangedFilesInfos> changedFilesInfos; 
            private Long totalAddLines; 
            private Long totalDelLines; 

            /**
             * changedFilesCount.
             */
            public Builder changedFilesCount(Long changedFilesCount) {
                this.changedFilesCount = changedFilesCount;
                return this;
            }

            /**
             * changedFilesInfos.
             */
            public Builder changedFilesInfos(java.util.List<ChangedFilesInfos> changedFilesInfos) {
                this.changedFilesInfos = changedFilesInfos;
                return this;
            }

            /**
             * totalAddLines.
             */
            public Builder totalAddLines(Long totalAddLines) {
                this.totalAddLines = totalAddLines;
                return this;
            }

            /**
             * totalDelLines.
             */
            public Builder totalDelLines(Long totalDelLines) {
                this.totalDelLines = totalDelLines;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
