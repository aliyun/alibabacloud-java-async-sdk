// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicesForUserGroupResponseBody</p>
 */
public class ListPolicesForUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserGroups")
    private java.util.List < UserGroups> userGroups;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userGroups
     */
    public java.util.List < UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UserGroups> userGroups; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserGroups.
         */
        public Builder userGroups(java.util.List < UserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public ListPolicesForUserGroupResponseBody build() {
            return new ListPolicesForUserGroupResponseBody(this);
        } 

    } 

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

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyType.
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
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Polices")
        private java.util.List < Polices> polices;

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
        public java.util.List < Polices> getPolices() {
            return this.polices;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private java.util.List < Polices> polices; 
            private String userGroupId; 

            /**
             * Polices.
             */
            public Builder polices(java.util.List < Polices> polices) {
                this.polices = polices;
                return this;
            }

            /**
             * UserGroupId.
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
