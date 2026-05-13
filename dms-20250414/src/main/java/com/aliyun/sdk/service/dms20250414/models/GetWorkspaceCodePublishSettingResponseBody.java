// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetWorkspaceCodePublishSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceCodePublishSettingResponseBody</p>
 */
public class GetWorkspaceCodePublishSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetWorkspaceCodePublishSettingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceCodePublishSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWorkspaceCodePublishSettingResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        public GetWorkspaceCodePublishSettingResponseBody build() {
            return new GetWorkspaceCodePublishSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceCodePublishSettingResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceCodePublishSettingResponseBody</p>
     */
    public static class Repos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Repo")
        private String repo;

        private Repos(Builder builder) {
            this.branch = builder.branch;
            this.path = builder.path;
            this.repo = builder.repo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Repos create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return repo
         */
        public String getRepo() {
            return this.repo;
        }

        public static final class Builder {
            private String branch; 
            private String path; 
            private String repo; 

            private Builder() {
            } 

            private Builder(Repos model) {
                this.branch = model.branch;
                this.path = model.path;
                this.repo = model.repo;
            } 

            /**
             * Branch.
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Repo.
             */
            public Builder repo(String repo) {
                this.repo = repo;
                return this;
            }

            public Repos build() {
                return new Repos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkspaceCodePublishSettingResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceCodePublishSettingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exclude")
        private java.util.List<String> exclude;

        @com.aliyun.core.annotation.NameInMap("LockRepoBranch")
        private Boolean lockRepoBranch;

        @com.aliyun.core.annotation.NameInMap("Repos")
        private java.util.List<Repos> repos;

        private Data(Builder builder) {
            this.exclude = builder.exclude;
            this.lockRepoBranch = builder.lockRepoBranch;
            this.repos = builder.repos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return exclude
         */
        public java.util.List<String> getExclude() {
            return this.exclude;
        }

        /**
         * @return lockRepoBranch
         */
        public Boolean getLockRepoBranch() {
            return this.lockRepoBranch;
        }

        /**
         * @return repos
         */
        public java.util.List<Repos> getRepos() {
            return this.repos;
        }

        public static final class Builder {
            private java.util.List<String> exclude; 
            private Boolean lockRepoBranch; 
            private java.util.List<Repos> repos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.exclude = model.exclude;
                this.lockRepoBranch = model.lockRepoBranch;
                this.repos = model.repos;
            } 

            /**
             * Exclude.
             */
            public Builder exclude(java.util.List<String> exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * LockRepoBranch.
             */
            public Builder lockRepoBranch(Boolean lockRepoBranch) {
                this.lockRepoBranch = lockRepoBranch;
                return this;
            }

            /**
             * Repos.
             */
            public Builder repos(java.util.List<Repos> repos) {
                this.repos = repos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
