// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSearchCodePreviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetSearchCodePreviewResponseBody</p>
 */
public class GetSearchCodePreviewResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    @NameInMap("success")
    private Boolean success;

    private GetSearchCodePreviewResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSearchCodePreviewResponseBody create() {
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
         * Id of the request
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

        public GetSearchCodePreviewResponseBody build() {
            return new GetSearchCodePreviewResponseBody(this);
        } 

    } 

    public static class HighlightTextMap extends TeaModel {
        @NameInMap("clob")
        private String clob;

        @NameInMap("fileName")
        private String fileName;

        @NameInMap("organizationId")
        private String organizationId;

        private HighlightTextMap(Builder builder) {
            this.clob = builder.clob;
            this.fileName = builder.fileName;
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
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String clob; 
            private String fileName; 
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
    public static class Source extends TeaModel {
        @NameInMap("branch")
        private String branch;

        @NameInMap("checkinDate")
        private String checkinDate;

        @NameInMap("fileName")
        private String fileName;

        @NameInMap("filePath")
        private String filePath;

        @NameInMap("language")
        private String language;

        @NameInMap("organizationId")
        private String organizationId;

        @NameInMap("repoPath")
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
    public static class Result extends TeaModel {
        @NameInMap("docId")
        private String docId;

        @NameInMap("highlightTextMap")
        private HighlightTextMap highlightTextMap;

        @NameInMap("source")
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
