// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrgsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrgsResponseBody</p>
 */
public class DescribeOrgsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Orgs")
    private java.util.List < Orgs> orgs;

    @NameInMap("RequestId")
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

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orgs
     */
    public java.util.List < Orgs> getOrgs() {
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
        private java.util.List < Orgs> orgs; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Orgs.
         */
        public Builder orgs(java.util.List < Orgs> orgs) {
            this.orgs = orgs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOrgsResponseBody build() {
            return new DescribeOrgsResponseBody(this);
        } 

    } 

    public static class Orgs extends TeaModel {
        @NameInMap("OrgId")
        private String orgId;

        @NameInMap("OrgName")
        private String orgName;

        @NameInMap("ParentOrgId")
        private String parentOrgId;

        private Orgs(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
            this.parentOrgId = builder.parentOrgId;
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
         * @return parentOrgId
         */
        public String getParentOrgId() {
            return this.parentOrgId;
        }

        public static final class Builder {
            private String orgId; 
            private String orgName; 
            private String parentOrgId; 

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

            /**
             * ParentOrgId.
             */
            public Builder parentOrgId(String parentOrgId) {
                this.parentOrgId = parentOrgId;
                return this;
            }

            public Orgs build() {
                return new Orgs(this);
            } 

        } 

    }
}
