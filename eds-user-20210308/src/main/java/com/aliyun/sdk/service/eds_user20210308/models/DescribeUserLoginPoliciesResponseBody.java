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
 * {@link DescribeUserLoginPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserLoginPoliciesResponseBody</p>
 */
public class DescribeUserLoginPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserLoginPoliciesResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLoginPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policies
     */
    public java.util.List<Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Policies> policies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserLoginPoliciesResponseBody model) {
            this.policies = model.policies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserLoginPoliciesResponseBody build() {
            return new DescribeUserLoginPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserLoginPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserLoginPoliciesResponseBody</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private UserGroups(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String groupId; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(UserGroups model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ug-ilu90mhsduf****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The user group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Developers</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserLoginPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserLoginPoliciesResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private java.util.List<UserGroups> userGroups;

        private Policies(Builder builder) {
            this.name = builder.name;
            this.policyId = builder.policyId;
            this.userGroups = builder.userGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return userGroups
         */
        public java.util.List<UserGroups> getUserGroups() {
            return this.userGroups;
        }

        public static final class Builder {
            private String name; 
            private String policyId; 
            private java.util.List<UserGroups> userGroups; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.name = model.name;
                this.policyId = model.policyId;
                this.userGroups = model.userGroups;
            } 

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>deveoper-policy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>up-89unlabdl****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The associated user group information.</p>
             */
            public Builder userGroups(java.util.List<UserGroups> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
