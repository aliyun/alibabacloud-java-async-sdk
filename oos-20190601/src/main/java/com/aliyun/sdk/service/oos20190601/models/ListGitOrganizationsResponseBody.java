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
 * {@link ListGitOrganizationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGitOrganizationsResponseBody</p>
 */
public class ListGitOrganizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("GitOrgs")
    private java.util.List<GitOrgs> gitOrgs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGitOrganizationsResponseBody(Builder builder) {
        this.count = builder.count;
        this.gitOrgs = builder.gitOrgs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGitOrganizationsResponseBody create() {
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
     * @return gitOrgs
     */
    public java.util.List<GitOrgs> getGitOrgs() {
        return this.gitOrgs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<GitOrgs> gitOrgs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGitOrganizationsResponseBody model) {
            this.count = model.count;
            this.gitOrgs = model.gitOrgs;
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
         * GitOrgs.
         */
        public Builder gitOrgs(java.util.List<GitOrgs> gitOrgs) {
            this.gitOrgs = gitOrgs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGitOrganizationsResponseBody build() {
            return new ListGitOrganizationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGitOrganizationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGitOrganizationsResponseBody</p>
     */
    public static class GitOrgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        private GitOrgs(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GitOrgs create() {
            return builder().build();
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        public static final class Builder {
            private String orgId; 
            private String orgName; 

            private Builder() {
            } 

            private Builder(GitOrgs model) {
                this.orgId = model.orgId;
                this.orgName = model.orgName;
            } 

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * OrgName.
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            public GitOrgs build() {
                return new GitOrgs(this);
            } 

        } 

    }
}
