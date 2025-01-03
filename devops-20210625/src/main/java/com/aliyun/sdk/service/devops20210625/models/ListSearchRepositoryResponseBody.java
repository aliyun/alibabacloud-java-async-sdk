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
 * {@link ListSearchRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchRepositoryResponseBody</p>
 */
public class ListSearchRepositoryResponseBody extends TeaModel {
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

    private ListSearchRepositoryResponseBody(Builder builder) {
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

    public static ListSearchRepositoryResponseBody create() {
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

        public ListSearchRepositoryResponseBody build() {
            return new ListSearchRepositoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSearchRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchRepositoryResponseBody</p>
     */
    public static class HighlightTextMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorUserId")
        private String creatorUserId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("readMe")
        private String readMe;

        @com.aliyun.core.annotation.NameInMap("repoNameWithNamespace")
        private String repoNameWithNamespace;

        @com.aliyun.core.annotation.NameInMap("repoPath")
        private String repoPath;

        private HighlightTextMap(Builder builder) {
            this.creatorUserId = builder.creatorUserId;
            this.description = builder.description;
            this.organizationId = builder.organizationId;
            this.readMe = builder.readMe;
            this.repoNameWithNamespace = builder.repoNameWithNamespace;
            this.repoPath = builder.repoPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighlightTextMap create() {
            return builder().build();
        }

        /**
         * @return creatorUserId
         */
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return readMe
         */
        public String getReadMe() {
            return this.readMe;
        }

        /**
         * @return repoNameWithNamespace
         */
        public String getRepoNameWithNamespace() {
            return this.repoNameWithNamespace;
        }

        /**
         * @return repoPath
         */
        public String getRepoPath() {
            return this.repoPath;
        }

        public static final class Builder {
            private String creatorUserId; 
            private String description; 
            private String organizationId; 
            private String readMe; 
            private String repoNameWithNamespace; 
            private String repoPath; 

            /**
             * creatorUserId.
             */
            public Builder creatorUserId(String creatorUserId) {
                this.creatorUserId = creatorUserId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * readMe.
             */
            public Builder readMe(String readMe) {
                this.readMe = readMe;
                return this;
            }

            /**
             * repoNameWithNamespace.
             */
            public Builder repoNameWithNamespace(String repoNameWithNamespace) {
                this.repoNameWithNamespace = repoNameWithNamespace;
                return this;
            }

            /**
             * repoPath.
             */
            public Builder repoPath(String repoPath) {
                this.repoPath = repoPath;
                return this;
            }

            public HighlightTextMap build() {
                return new HighlightTextMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchRepositoryResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("lastActivityTime")
        private String lastActivityTime;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("readMe")
        private String readMe;

        @com.aliyun.core.annotation.NameInMap("repoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("repoPath")
        private String repoPath;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        private Source(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.lastActivityTime = builder.lastActivityTime;
            this.organizationId = builder.organizationId;
            this.readMe = builder.readMe;
            this.repoName = builder.repoName;
            this.repoPath = builder.repoPath;
            this.visibilityLevel = builder.visibilityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastActivityTime
         */
        public String getLastActivityTime() {
            return this.lastActivityTime;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return readMe
         */
        public String getReadMe() {
            return this.readMe;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoPath
         */
        public String getRepoPath() {
            return this.repoPath;
        }

        /**
         * @return visibilityLevel
         */
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String lastActivityTime; 
            private String organizationId; 
            private String readMe; 
            private String repoName; 
            private String repoPath; 
            private Integer visibilityLevel; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * lastActivityTime.
             */
            public Builder lastActivityTime(String lastActivityTime) {
                this.lastActivityTime = lastActivityTime;
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
             * readMe.
             */
            public Builder readMe(String readMe) {
                this.readMe = readMe;
                return this;
            }

            /**
             * repoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * repoPath.
             */
            public Builder repoPath(String repoPath) {
                this.repoPath = repoPath;
                return this;
            }

            /**
             * visibilityLevel.
             */
            public Builder visibilityLevel(Integer visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSearchRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListSearchRepositoryResponseBody</p>
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
