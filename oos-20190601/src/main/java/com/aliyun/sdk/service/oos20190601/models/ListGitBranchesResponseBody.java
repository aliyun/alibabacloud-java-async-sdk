// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListGitBranchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGitBranchesResponseBody</p>
 */
public class ListGitBranchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("GitBranches")
    private java.util.List<GitBranches> gitBranches;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGitBranchesResponseBody(Builder builder) {
        this.count = builder.count;
        this.gitBranches = builder.gitBranches;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGitBranchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return gitBranches
     */
    public java.util.List<GitBranches> getGitBranches() {
        return this.gitBranches;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<GitBranches> gitBranches; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGitBranchesResponseBody model) {
            this.count = model.count;
            this.gitBranches = model.gitBranches;
            this.requestId = model.requestId;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * GitBranches.
         */
        public Builder gitBranches(java.util.List<GitBranches> gitBranches) {
            this.gitBranches = gitBranches;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGitBranchesResponseBody build() {
            return new ListGitBranchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGitBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGitBranchesResponseBody</p>
     */
    public static class GitBranches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private GitBranches(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GitBranches create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(GitBranches model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GitBranches build() {
                return new GitBranches(this);
            } 

        } 

    }
}
