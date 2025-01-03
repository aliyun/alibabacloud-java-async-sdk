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
 * {@link ListSearchSourceCodeResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchSourceCodeResponseBody</p>
 */
public class ListSearchSourceCodeResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListSearchSourceCodeResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchSourceCodeResponseBody create() {
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

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 
        private Long total; 

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

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListSearchSourceCodeResponseBody build() {
            return new ListSearchSourceCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSearchSourceCodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchSourceCodeResponseBody</p>
     */
    public static class HighlightTextMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clob")
        private String clob;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        private HighlightTextMap(Builder builder) {
            this.clob = builder.clob;
            this.fileName = builder.fileName;
            this.language = builder.language;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighlightTextMap create() {
            return builder().build();
        }

        /**
         * @return clob
         */
        public String getClob() {
            return this.clob;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String clob; 
            private String fileName; 
            private String language; 
            private String organizationId; 

            /**
             * clob.
             */
            public Builder clob(String clob) {
                this.clob = clob;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public HighlightTextMap build() {
                return new HighlightTextMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchSourceCodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchSourceCodeResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("checkinDate")
        private String checkinDate;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("filePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("repoPath")
        private String repoPath;

        private Source(Builder builder) {
            this.branch = builder.branch;
            this.checkinDate = builder.checkinDate;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.language = builder.language;
            this.organizationId = builder.organizationId;
            this.repoPath = builder.repoPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return checkinDate
         */
        public String getCheckinDate() {
            return this.checkinDate;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return repoPath
         */
        public String getRepoPath() {
            return this.repoPath;
        }

        public static final class Builder {
            private String branch; 
            private String checkinDate; 
            private String fileName; 
            private String filePath; 
            private String language; 
            private String organizationId; 
            private String repoPath; 

            /**
             * branch.
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * checkinDate.
             */
            public Builder checkinDate(String checkinDate) {
                this.checkinDate = checkinDate;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * filePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * repoPath.
             */
            public Builder repoPath(String repoPath) {
                this.repoPath = repoPath;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchSourceCodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchSourceCodeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("highlightTextMap")
        private HighlightTextMap highlightTextMap;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        private Result(Builder builder) {
            this.docId = builder.docId;
            this.highlightTextMap = builder.highlightTextMap;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return highlightTextMap
         */
        public HighlightTextMap getHighlightTextMap() {
            return this.highlightTextMap;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        public static final class Builder {
            private String docId; 
            private HighlightTextMap highlightTextMap; 
            private Source source; 

            /**
             * docId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * highlightTextMap.
             */
            public Builder highlightTextMap(HighlightTextMap highlightTextMap) {
                this.highlightTextMap = highlightTextMap;
                return this;
            }

            /**
             * source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
