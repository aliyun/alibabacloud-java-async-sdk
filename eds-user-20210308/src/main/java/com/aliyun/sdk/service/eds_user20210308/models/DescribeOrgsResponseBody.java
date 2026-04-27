// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeOrgsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrgsResponseBody</p>
 */
public class DescribeOrgsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Orgs")
    private java.util.List<Orgs> orgs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOrgsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.orgs = builder.orgs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrgsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orgs
     */
    public java.util.List<Orgs> getOrgs() {
        return this.orgs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Orgs> orgs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOrgsResponseBody model) {
            this.nextToken = model.nextToken;
            this.orgs = model.orgs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The token that determines the start point of the query. The return value is the value of the NextToken response parameter that was returned last time the DescribeOrgs operation was called.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The organizations.</p>
         */
        public Builder orgs(java.util.List<Orgs> orgs) {
            this.orgs = orgs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B4BB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOrgsResponseBody build() {
            return new DescribeOrgsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOrgsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOrgsResponseBody</p>
     */
    public static class ResourcePolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private ResourcePolicyList(Builder builder) {
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePolicyList create() {
            return builder().build();
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private String policyId; 
            private String policyName; 

            private Builder() {
            } 

            private Builder(ResourcePolicyList model) {
                this.policyId = model.policyId;
                this.policyName = model.policyName;
            } 

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public ResourcePolicyList build() {
                return new ResourcePolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOrgsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOrgsResponseBody</p>
     */
    public static class Orgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        @com.aliyun.core.annotation.NameInMap("OrgNamePath")
        private String orgNamePath;

        @com.aliyun.core.annotation.NameInMap("ParentOrgId")
        private String parentOrgId;

        @com.aliyun.core.annotation.NameInMap("ResourcePolicyList")
        private java.util.List<ResourcePolicyList> resourcePolicyList;

        private Orgs(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
            this.orgNamePath = builder.orgNamePath;
            this.parentOrgId = builder.parentOrgId;
            this.resourcePolicyList = builder.resourcePolicyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orgs create() {
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

        /**
         * @return orgNamePath
         */
        public String getOrgNamePath() {
            return this.orgNamePath;
        }

        /**
         * @return parentOrgId
         */
        public String getParentOrgId() {
            return this.parentOrgId;
        }

        /**
         * @return resourcePolicyList
         */
        public java.util.List<ResourcePolicyList> getResourcePolicyList() {
            return this.resourcePolicyList;
        }

        public static final class Builder {
            private String orgId; 
            private String orgName; 
            private String orgNamePath; 
            private String parentOrgId; 
            private java.util.List<ResourcePolicyList> resourcePolicyList; 

            private Builder() {
            } 

            private Builder(Orgs model) {
                this.orgId = model.orgId;
                this.orgName = model.orgName;
                this.orgNamePath = model.orgNamePath;
                this.parentOrgId = model.parentOrgId;
                this.resourcePolicyList = model.resourcePolicyList;
            } 

            /**
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>org-****</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The name of the organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>org****</p>
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            /**
             * OrgNamePath.
             */
            public Builder orgNamePath(String orgNamePath) {
                this.orgNamePath = orgNamePath;
                return this;
            }

            /**
             * <p>The parent organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>org-****</p>
             */
            public Builder parentOrgId(String parentOrgId) {
                this.parentOrgId = parentOrgId;
                return this;
            }

            /**
             * ResourcePolicyList.
             */
            public Builder resourcePolicyList(java.util.List<ResourcePolicyList> resourcePolicyList) {
                this.resourcePolicyList = resourcePolicyList;
                return this;
            }

            public Orgs build() {
                return new Orgs(this);
            } 

        } 

    }
}
