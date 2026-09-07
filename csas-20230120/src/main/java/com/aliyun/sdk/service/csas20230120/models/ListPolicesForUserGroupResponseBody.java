// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListPolicesForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicesForUserGroupResponseBody</p>
 */
public class ListPolicesForUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserGroups")
    private java.util.List<UserGroups> userGroups;

    private ListPolicesForUserGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userGroups = builder.userGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicesForUserGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userGroups
     */
    public java.util.List<UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UserGroups> userGroups; 

        private Builder() {
        } 

        private Builder(ListPolicesForUserGroupResponseBody model) {
            this.requestId = model.requestId;
            this.userGroups = model.userGroups;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5F04DFBD-3F48-5F70-AE72-474026670128</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of user groups.</p>
         */
        public Builder userGroups(java.util.List<UserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public ListPolicesForUserGroupResponseBody build() {
            return new ListPolicesForUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicesForUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForUserGroupResponseBody</p>
     */
    public static class Polices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private Polices(Builder builder) {
            this.name = builder.name;
            this.policyId = builder.policyId;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Polices create() {
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
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String name; 
            private String policyId; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(Polices model) {
                this.name = model.name;
                this.policyId = model.policyId;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>private_access_policy_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-policy-ce2bf7236fab****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The policy type. Valid values:</p>
             * <ul>
             * <li><p><strong>PrivateAccess</strong>: private network access.</p>
             * </li>
             * <li><p><strong>URLFilter</strong>: URL filtering.</p>
             * </li>
             * <li><p><strong>AppAccessControl</strong>: application control.</p>
             * </li>
             * <li><p><strong>DLP</strong>: Data Leakage Prevention.</p>
             * </li>
             * <li><p><strong>NAC</strong>: Network Access Control.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrivateAccess</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public Polices build() {
                return new Polices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPolicesForUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForUserGroupResponseBody</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Polices")
        private java.util.List<Polices> polices;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        private UserGroups(Builder builder) {
            this.polices = builder.polices;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return polices
         */
        public java.util.List<Polices> getPolices() {
            return this.polices;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private java.util.List<Polices> polices; 
            private String userGroupId; 

            private Builder() {
            } 

            private Builder(UserGroups model) {
                this.polices = model.polices;
                this.userGroupId = model.userGroupId;
            } 

            /**
             * <p>The policies.</p>
             */
            public Builder polices(java.util.List<Polices> polices) {
                this.polices = polices;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>usergroup-6f1ef2fc56b6****</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}
