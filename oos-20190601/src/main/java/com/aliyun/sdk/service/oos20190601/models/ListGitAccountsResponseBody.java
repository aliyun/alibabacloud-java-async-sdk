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
 * {@link ListGitAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGitAccountsResponseBody</p>
 */
public class ListGitAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("GitAccounts")
    private java.util.List<GitAccounts> gitAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGitAccountsResponseBody(Builder builder) {
        this.count = builder.count;
        this.gitAccounts = builder.gitAccounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGitAccountsResponseBody create() {
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
     * @return gitAccounts
     */
    public java.util.List<GitAccounts> getGitAccounts() {
        return this.gitAccounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<GitAccounts> gitAccounts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGitAccountsResponseBody model) {
            this.count = model.count;
            this.gitAccounts = model.gitAccounts;
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
         * GitAccounts.
         */
        public Builder gitAccounts(java.util.List<GitAccounts> gitAccounts) {
            this.gitAccounts = gitAccounts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGitAccountsResponseBody build() {
            return new ListGitAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGitAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGitAccountsResponseBody</p>
     */
    public static class GitAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsActive")
        private Boolean isActive;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        private GitAccounts(Builder builder) {
            this.isActive = builder.isActive;
            this.owner = builder.owner;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GitAccounts create() {
            return builder().build();
        }

        /**
         * @return isActive
         */
        public Boolean getIsActive() {
            return this.isActive;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        public static final class Builder {
            private Boolean isActive; 
            private String owner; 

            private Builder() {
            } 

            private Builder(GitAccounts model) {
                this.isActive = model.isActive;
                this.owner = model.owner;
            } 

            /**
             * IsActive.
             */
            public Builder isActive(Boolean isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            public GitAccounts build() {
                return new GitAccounts(this);
            } 

        } 

    }
}
