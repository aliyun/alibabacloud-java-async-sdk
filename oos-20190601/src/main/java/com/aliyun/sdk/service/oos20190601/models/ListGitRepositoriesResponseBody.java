// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGitRepositoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGitRepositoriesResponseBody</p>
 */
public class ListGitRepositoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("GitRepos")
    private java.util.List < GitRepos> gitRepos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGitRepositoriesResponseBody(Builder builder) {
        this.count = builder.count;
        this.gitRepos = builder.gitRepos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGitRepositoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return gitRepos
     */
    public java.util.List < GitRepos> getGitRepos() {
        return this.gitRepos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < GitRepos> gitRepos; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * GitRepos.
         */
        public Builder gitRepos(java.util.List < GitRepos> gitRepos) {
            this.gitRepos = gitRepos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGitRepositoriesResponseBody build() {
            return new ListGitRepositoriesResponseBody(this);
        } 

    } 

    public static class GitRepos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("HtmlUrl")
        private String htmlUrl;

        @com.aliyun.core.annotation.NameInMap("IsPrivate")
        private Boolean isPrivate;

        private GitRepos(Builder builder) {
            this.description = builder.description;
            this.fullName = builder.fullName;
            this.htmlUrl = builder.htmlUrl;
            this.isPrivate = builder.isPrivate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GitRepos create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return htmlUrl
         */
        public String getHtmlUrl() {
            return this.htmlUrl;
        }

        /**
         * @return isPrivate
         */
        public Boolean getIsPrivate() {
            return this.isPrivate;
        }

        public static final class Builder {
            private String description; 
            private String fullName; 
            private String htmlUrl; 
            private Boolean isPrivate; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * HtmlUrl.
             */
            public Builder htmlUrl(String htmlUrl) {
                this.htmlUrl = htmlUrl;
                return this;
            }

            /**
             * IsPrivate.
             */
            public Builder isPrivate(Boolean isPrivate) {
                this.isPrivate = isPrivate;
                return this;
            }

            public GitRepos build() {
                return new GitRepos(this);
            } 

        } 

    }
}
