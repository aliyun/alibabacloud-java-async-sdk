// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAccountSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountSummaryResponseBody</p>
 */
public class GetAccountSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SummaryMap")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81313F5E-3C85-478F-BCC9-E1B70E4556DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The overview information about the Alibaba Cloud account.</p>
         */
        public Builder summaryMap(SummaryMap summaryMap) {
            this.summaryMap = summaryMap;
            return this;
        }

        public GetAccountSummaryResponseBody build() {
            return new GetAccountSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountSummaryResponseBody</p>
     */
    public static class SummaryMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeysPerUserQuota")
        private Integer accessKeysPerUserQuota;

        @com.aliyun.core.annotation.NameInMap("AttachedPoliciesPerGroupQuota")
        private Integer attachedPoliciesPerGroupQuota;

        @com.aliyun.core.annotation.NameInMap("AttachedPoliciesPerRoleQuota")
        private Integer attachedPoliciesPerRoleQuota;

        @com.aliyun.core.annotation.NameInMap("AttachedPoliciesPerUserQuota")
        private Integer attachedPoliciesPerUserQuota;

        @com.aliyun.core.annotation.NameInMap("AttachedSystemPoliciesPerGroupQuota")
        private Integer attachedSystemPoliciesPerGroupQuota;

        @com.aliyun.core.annotation.NameInMap("AttachedSystemPoliciesPerRoleQuota")
        private Integer attachedSystemPoliciesPerRoleQuota;

        @com.aliyun.core.annotation.NameInMap("AttachedSystemPoliciesPerUserQuota")
        private Integer attachedSystemPoliciesPerUserQuota;

        @com.aliyun.core.annotation.NameInMap("ConditionsPerAKPolicyQuota")
        private Integer conditionsPerAKPolicyQuota;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private Integer groups;

        @com.aliyun.core.annotation.NameInMap("GroupsPerUserQuota")
        private Integer groupsPerUserQuota;

        @com.aliyun.core.annotation.NameInMap("GroupsQuota")
        private Integer groupsQuota;

        @com.aliyun.core.annotation.NameInMap("IPItemsPerAKPolicyQuota")
        private Integer IPItemsPerAKPolicyQuota;

        @com.aliyun.core.annotation.NameInMap("MFADevices")
        private Integer MFADevices;

        @com.aliyun.core.annotation.NameInMap("MFADevicesInUse")
        private Integer MFADevicesInUse;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private Integer policies;

        @com.aliyun.core.annotation.NameInMap("PoliciesQuota")
        private Integer policiesQuota;

        @com.aliyun.core.annotation.NameInMap("PolicySizeQuota")
        private Integer policySizeQuota;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private Integer roles;

        @com.aliyun.core.annotation.NameInMap("RolesQuota")
        private Integer rolesQuota;

        @com.aliyun.core.annotation.NameInMap("Users")
        private Integer users;

        @com.aliyun.core.annotation.NameInMap("UsersQuota")
        private Integer usersQuota;

        @com.aliyun.core.annotation.NameInMap("VersionsPerPolicyQuota")
        private Integer versionsPerPolicyQuota;

        @com.aliyun.core.annotation.NameInMap("VirtualMFADevicesQuota")
        private Integer virtualMFADevicesQuota;

        private SummaryMap(Builder builder) {
            this.accessKeysPerUserQuota = builder.accessKeysPerUserQuota;
            this.attachedPoliciesPerGroupQuota = builder.attachedPoliciesPerGroupQuota;
            this.attachedPoliciesPerRoleQuota = builder.attachedPoliciesPerRoleQuota;
            this.attachedPoliciesPerUserQuota = builder.attachedPoliciesPerUserQuota;
            this.attachedSystemPoliciesPerGroupQuota = builder.attachedSystemPoliciesPerGroupQuota;
            this.attachedSystemPoliciesPerRoleQuota = builder.attachedSystemPoliciesPerRoleQuota;
            this.attachedSystemPoliciesPerUserQuota = builder.attachedSystemPoliciesPerUserQuota;
            this.conditionsPerAKPolicyQuota = builder.conditionsPerAKPolicyQuota;
            this.groups = builder.groups;
            this.groupsPerUserQuota = builder.groupsPerUserQuota;
            this.groupsQuota = builder.groupsQuota;
            this.IPItemsPerAKPolicyQuota = builder.IPItemsPerAKPolicyQuota;
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
         * @return conditionsPerAKPolicyQuota
         */
        public Integer getConditionsPerAKPolicyQuota() {
            return this.conditionsPerAKPolicyQuota;
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
         * @return IPItemsPerAKPolicyQuota
         */
        public Integer getIPItemsPerAKPolicyQuota() {
            return this.IPItemsPerAKPolicyQuota;
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
            private Integer conditionsPerAKPolicyQuota; 
            private Integer groups; 
            private Integer groupsPerUserQuota; 
            private Integer groupsQuota; 
            private Integer IPItemsPerAKPolicyQuota; 
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
             * <p>The maximum number of AccessKey pairs that a Resource Access Management (RAM) user can have.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder accessKeysPerUserQuota(Integer accessKeysPerUserQuota) {
                this.accessKeysPerUserQuota = accessKeysPerUserQuota;
                return this;
            }

            /**
             * <p>The maximum number of custom policies that can be added to a RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder attachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
                this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
                return this;
            }

            /**
             * <p>The maximum number of custom policies that can be added to a RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder attachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
                this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
                return this;
            }

            /**
             * <p>The maximum number of custom policies that can be added to a RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder attachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
                this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
                return this;
            }

            /**
             * <p>The maximum number of system policies that can be added to a RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder attachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
                this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
                return this;
            }

            /**
             * <p>The maximum number of system policies that can be added to a RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder attachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
                this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
                return this;
            }

            /**
             * <p>The maximum number of system policies that can be added to a RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder attachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
                this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
                return this;
            }

            /**
             * <p>The number of network access control policies that can be configured for an account or AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder conditionsPerAKPolicyQuota(Integer conditionsPerAKPolicyQuota) {
                this.conditionsPerAKPolicyQuota = conditionsPerAKPolicyQuota;
                return this;
            }

            /**
             * <p>The number of RAM user groups.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder groups(Integer groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The maximum number of RAM user groups to which a RAM user can be added.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder groupsPerUserQuota(Integer groupsPerUserQuota) {
                this.groupsPerUserQuota = groupsPerUserQuota;
                return this;
            }

            /**
             * <p>The maximum number of RAM user groups that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder groupsQuota(Integer groupsQuota) {
                this.groupsQuota = groupsQuota;
                return this;
            }

            /**
             * <p>The total number of IP addresses that can be configured in a network access control policy of an account or AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder IPItemsPerAKPolicyQuota(Integer IPItemsPerAKPolicyQuota) {
                this.IPItemsPerAKPolicyQuota = IPItemsPerAKPolicyQuota;
                return this;
            }

            /**
             * <p>The number of virtual multi-factor authentication (MFA) devices.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder MFADevices(Integer MFADevices) {
                this.MFADevices = MFADevices;
                return this;
            }

            /**
             * <p>The number of virtual MFA devices in use.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder MFADevicesInUse(Integer MFADevicesInUse) {
                this.MFADevicesInUse = MFADevicesInUse;
                return this;
            }

            /**
             * <p>The number of custom policies.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder policies(Integer policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The maximum number of custom policies that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder policiesQuota(Integer policiesQuota) {
                this.policiesQuota = policiesQuota;
                return this;
            }

            /**
             * <p>The maximum length of the policy content.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder policySizeQuota(Integer policySizeQuota) {
                this.policySizeQuota = policySizeQuota;
                return this;
            }

            /**
             * <p>The number of RAM roles.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder roles(Integer roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The maximum number of RAM roles that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder rolesQuota(Integer rolesQuota) {
                this.rolesQuota = rolesQuota;
                return this;
            }

            /**
             * <p>The number of RAM users.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder users(Integer users) {
                this.users = users;
                return this;
            }

            /**
             * <p>The maximum number of RAM users that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder usersQuota(Integer usersQuota) {
                this.usersQuota = usersQuota;
                return this;
            }

            /**
             * <p>The maximum number of policy versions.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder versionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
                this.versionsPerPolicyQuota = versionsPerPolicyQuota;
                return this;
            }

            /**
             * <p>The maximum number of virtual MFA devices that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
