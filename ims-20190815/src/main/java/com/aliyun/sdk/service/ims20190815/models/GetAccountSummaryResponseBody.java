// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountSummaryResponseBody</p>
 */
public class GetAccountSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SummaryMap")
    private SummaryMap summaryMap;

    private GetAccountSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.summaryMap = builder.summaryMap;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summaryMap
     */
    public SummaryMap getSummaryMap() {
        return this.summaryMap;
    }

    public static final class Builder {
        private String requestId; 
        private SummaryMap summaryMap; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The overview information of the Alibaba Cloud account.
         */
        public Builder summaryMap(SummaryMap summaryMap) {
            this.summaryMap = summaryMap;
            return this;
        }

        public GetAccountSummaryResponseBody build() {
            return new GetAccountSummaryResponseBody(this);
        } 

    } 

    public static class SummaryMap extends TeaModel {
        @NameInMap("AccessKeysPerUserQuota")
        private Integer accessKeysPerUserQuota;

        @NameInMap("AttachedPoliciesPerGroupQuota")
        private Integer attachedPoliciesPerGroupQuota;

        @NameInMap("AttachedPoliciesPerRoleQuota")
        private Integer attachedPoliciesPerRoleQuota;

        @NameInMap("AttachedPoliciesPerUserQuota")
        private Integer attachedPoliciesPerUserQuota;

        @NameInMap("AttachedSystemPoliciesPerGroupQuota")
        private Integer attachedSystemPoliciesPerGroupQuota;

        @NameInMap("AttachedSystemPoliciesPerRoleQuota")
        private Integer attachedSystemPoliciesPerRoleQuota;

        @NameInMap("AttachedSystemPoliciesPerUserQuota")
        private Integer attachedSystemPoliciesPerUserQuota;

        @NameInMap("Groups")
        private Integer groups;

        @NameInMap("GroupsPerUserQuota")
        private Integer groupsPerUserQuota;

        @NameInMap("GroupsQuota")
        private Integer groupsQuota;

        @NameInMap("MFADevices")
        private Integer MFADevices;

        @NameInMap("MFADevicesInUse")
        private Integer MFADevicesInUse;

        @NameInMap("Policies")
        private Integer policies;

        @NameInMap("PoliciesQuota")
        private Integer policiesQuota;

        @NameInMap("PolicySizeQuota")
        private Integer policySizeQuota;

        @NameInMap("Roles")
        private Integer roles;

        @NameInMap("RolesQuota")
        private Integer rolesQuota;

        @NameInMap("Users")
        private Integer users;

        @NameInMap("UsersQuota")
        private Integer usersQuota;

        @NameInMap("VersionsPerPolicyQuota")
        private Integer versionsPerPolicyQuota;

        @NameInMap("VirtualMFADevicesQuota")
        private Integer virtualMFADevicesQuota;

        private SummaryMap(Builder builder) {
            this.accessKeysPerUserQuota = builder.accessKeysPerUserQuota;
            this.attachedPoliciesPerGroupQuota = builder.attachedPoliciesPerGroupQuota;
            this.attachedPoliciesPerRoleQuota = builder.attachedPoliciesPerRoleQuota;
            this.attachedPoliciesPerUserQuota = builder.attachedPoliciesPerUserQuota;
            this.attachedSystemPoliciesPerGroupQuota = builder.attachedSystemPoliciesPerGroupQuota;
            this.attachedSystemPoliciesPerRoleQuota = builder.attachedSystemPoliciesPerRoleQuota;
            this.attachedSystemPoliciesPerUserQuota = builder.attachedSystemPoliciesPerUserQuota;
            this.groups = builder.groups;
            this.groupsPerUserQuota = builder.groupsPerUserQuota;
            this.groupsQuota = builder.groupsQuota;
            this.MFADevices = builder.MFADevices;
            this.MFADevicesInUse = builder.MFADevicesInUse;
            this.policies = builder.policies;
            this.policiesQuota = builder.policiesQuota;
            this.policySizeQuota = builder.policySizeQuota;
            this.roles = builder.roles;
            this.rolesQuota = builder.rolesQuota;
            this.users = builder.users;
            this.usersQuota = builder.usersQuota;
            this.versionsPerPolicyQuota = builder.versionsPerPolicyQuota;
            this.virtualMFADevicesQuota = builder.virtualMFADevicesQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryMap create() {
            return builder().build();
        }

        /**
         * @return accessKeysPerUserQuota
         */
        public Integer getAccessKeysPerUserQuota() {
            return this.accessKeysPerUserQuota;
        }

        /**
         * @return attachedPoliciesPerGroupQuota
         */
        public Integer getAttachedPoliciesPerGroupQuota() {
            return this.attachedPoliciesPerGroupQuota;
        }

        /**
         * @return attachedPoliciesPerRoleQuota
         */
        public Integer getAttachedPoliciesPerRoleQuota() {
            return this.attachedPoliciesPerRoleQuota;
        }

        /**
         * @return attachedPoliciesPerUserQuota
         */
        public Integer getAttachedPoliciesPerUserQuota() {
            return this.attachedPoliciesPerUserQuota;
        }

        /**
         * @return attachedSystemPoliciesPerGroupQuota
         */
        public Integer getAttachedSystemPoliciesPerGroupQuota() {
            return this.attachedSystemPoliciesPerGroupQuota;
        }

        /**
         * @return attachedSystemPoliciesPerRoleQuota
         */
        public Integer getAttachedSystemPoliciesPerRoleQuota() {
            return this.attachedSystemPoliciesPerRoleQuota;
        }

        /**
         * @return attachedSystemPoliciesPerUserQuota
         */
        public Integer getAttachedSystemPoliciesPerUserQuota() {
            return this.attachedSystemPoliciesPerUserQuota;
        }

        /**
         * @return groups
         */
        public Integer getGroups() {
            return this.groups;
        }

        /**
         * @return groupsPerUserQuota
         */
        public Integer getGroupsPerUserQuota() {
            return this.groupsPerUserQuota;
        }

        /**
         * @return groupsQuota
         */
        public Integer getGroupsQuota() {
            return this.groupsQuota;
        }

        /**
         * @return MFADevices
         */
        public Integer getMFADevices() {
            return this.MFADevices;
        }

        /**
         * @return MFADevicesInUse
         */
        public Integer getMFADevicesInUse() {
            return this.MFADevicesInUse;
        }

        /**
         * @return policies
         */
        public Integer getPolicies() {
            return this.policies;
        }

        /**
         * @return policiesQuota
         */
        public Integer getPoliciesQuota() {
            return this.policiesQuota;
        }

        /**
         * @return policySizeQuota
         */
        public Integer getPolicySizeQuota() {
            return this.policySizeQuota;
        }

        /**
         * @return roles
         */
        public Integer getRoles() {
            return this.roles;
        }

        /**
         * @return rolesQuota
         */
        public Integer getRolesQuota() {
            return this.rolesQuota;
        }

        /**
         * @return users
         */
        public Integer getUsers() {
            return this.users;
        }

        /**
         * @return usersQuota
         */
        public Integer getUsersQuota() {
            return this.usersQuota;
        }

        /**
         * @return versionsPerPolicyQuota
         */
        public Integer getVersionsPerPolicyQuota() {
            return this.versionsPerPolicyQuota;
        }

        /**
         * @return virtualMFADevicesQuota
         */
        public Integer getVirtualMFADevicesQuota() {
            return this.virtualMFADevicesQuota;
        }

        public static final class Builder {
            private Integer accessKeysPerUserQuota; 
            private Integer attachedPoliciesPerGroupQuota; 
            private Integer attachedPoliciesPerRoleQuota; 
            private Integer attachedPoliciesPerUserQuota; 
            private Integer attachedSystemPoliciesPerGroupQuota; 
            private Integer attachedSystemPoliciesPerRoleQuota; 
            private Integer attachedSystemPoliciesPerUserQuota; 
            private Integer groups; 
            private Integer groupsPerUserQuota; 
            private Integer groupsQuota; 
            private Integer MFADevices; 
            private Integer MFADevicesInUse; 
            private Integer policies; 
            private Integer policiesQuota; 
            private Integer policySizeQuota; 
            private Integer roles; 
            private Integer rolesQuota; 
            private Integer users; 
            private Integer usersQuota; 
            private Integer versionsPerPolicyQuota; 
            private Integer virtualMFADevicesQuota; 

            /**
             * The maximum number of AccessKey pairs that a RAM user can have.
             */
            public Builder accessKeysPerUserQuota(Integer accessKeysPerUserQuota) {
                this.accessKeysPerUserQuota = accessKeysPerUserQuota;
                return this;
            }

            /**
             * The maximum number of custom policies that can be added to a RAM user group.
             */
            public Builder attachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
                this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
                return this;
            }

            /**
             * The maximum number of custom policies that can be added to a RAM role.
             */
            public Builder attachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
                this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
                return this;
            }

            /**
             * The maximum number of custom policies that can be added to a RAM user.
             */
            public Builder attachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
                this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
                return this;
            }

            /**
             * The maximum number of system policies that can be added to a RAM user group.
             */
            public Builder attachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
                this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
                return this;
            }

            /**
             * The maximum number of system policies that can be added to a RAM role.
             */
            public Builder attachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
                this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
                return this;
            }

            /**
             * The maximum number of system policies that can be added to a RAM user.
             */
            public Builder attachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
                this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
                return this;
            }

            /**
             * The number of RAM user groups.
             */
            public Builder groups(Integer groups) {
                this.groups = groups;
                return this;
            }

            /**
             * The maximum number of RAM user groups to which a RAM user can be added.
             */
            public Builder groupsPerUserQuota(Integer groupsPerUserQuota) {
                this.groupsPerUserQuota = groupsPerUserQuota;
                return this;
            }

            /**
             * The maximum number of RAM user groups that can be created.
             */
            public Builder groupsQuota(Integer groupsQuota) {
                this.groupsQuota = groupsQuota;
                return this;
            }

            /**
             * The number of virtual multi-factor authentication (MFA) devices.
             */
            public Builder MFADevices(Integer MFADevices) {
                this.MFADevices = MFADevices;
                return this;
            }

            /**
             * The number of virtual MFA devices in use.
             */
            public Builder MFADevicesInUse(Integer MFADevicesInUse) {
                this.MFADevicesInUse = MFADevicesInUse;
                return this;
            }

            /**
             * The number of custom policies.
             */
            public Builder policies(Integer policies) {
                this.policies = policies;
                return this;
            }

            /**
             * The maximum number of custom policies that can be created.
             */
            public Builder policiesQuota(Integer policiesQuota) {
                this.policiesQuota = policiesQuota;
                return this;
            }

            /**
             * The maximum length of the policy content.
             */
            public Builder policySizeQuota(Integer policySizeQuota) {
                this.policySizeQuota = policySizeQuota;
                return this;
            }

            /**
             * The number of RAM roles.
             */
            public Builder roles(Integer roles) {
                this.roles = roles;
                return this;
            }

            /**
             * The maximum number of RAM roles that can be created.
             */
            public Builder rolesQuota(Integer rolesQuota) {
                this.rolesQuota = rolesQuota;
                return this;
            }

            /**
             * The number of RAM users.
             */
            public Builder users(Integer users) {
                this.users = users;
                return this;
            }

            /**
             * The maximum number of RAM users that can be created.
             */
            public Builder usersQuota(Integer usersQuota) {
                this.usersQuota = usersQuota;
                return this;
            }

            /**
             * The maximum number of policy versions.
             */
            public Builder versionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
                this.versionsPerPolicyQuota = versionsPerPolicyQuota;
                return this;
            }

            /**
             * The maximum number of virtual MFA devices that can be created.
             */
            public Builder virtualMFADevicesQuota(Integer virtualMFADevicesQuota) {
                this.virtualMFADevicesQuota = virtualMFADevicesQuota;
                return this;
            }

            public SummaryMap build() {
                return new SummaryMap(this);
            } 

        } 

    }
}
