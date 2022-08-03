// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SummaryMap.
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

        @NameInMap("Policies")
        private Integer policies;

        @NameInMap("PoliciesQuota")
        private Integer policiesQuota;

        @NameInMap("PolicySizeQuota")
        private Integer policySizeQuota;

        @NameInMap("ResourceGroups")
        private Integer resourceGroups;

        @NameInMap("ResourceGroupsQuota")
        private Integer resourceGroupsQuota;

        @NameInMap("Roles")
        private Integer roles;

        @NameInMap("RolesQuota")
        private Integer rolesQuota;

        @NameInMap("VersionsPerPolicyQuota")
        private Integer versionsPerPolicyQuota;

        private SummaryMap(Builder builder) {
            this.attachedPoliciesPerGroupQuota = builder.attachedPoliciesPerGroupQuota;
            this.attachedPoliciesPerRoleQuota = builder.attachedPoliciesPerRoleQuota;
            this.attachedPoliciesPerUserQuota = builder.attachedPoliciesPerUserQuota;
            this.attachedSystemPoliciesPerGroupQuota = builder.attachedSystemPoliciesPerGroupQuota;
            this.attachedSystemPoliciesPerRoleQuota = builder.attachedSystemPoliciesPerRoleQuota;
            this.attachedSystemPoliciesPerUserQuota = builder.attachedSystemPoliciesPerUserQuota;
            this.policies = builder.policies;
            this.policiesQuota = builder.policiesQuota;
            this.policySizeQuota = builder.policySizeQuota;
            this.resourceGroups = builder.resourceGroups;
            this.resourceGroupsQuota = builder.resourceGroupsQuota;
            this.roles = builder.roles;
            this.rolesQuota = builder.rolesQuota;
            this.versionsPerPolicyQuota = builder.versionsPerPolicyQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryMap create() {
            return builder().build();
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
         * @return resourceGroups
         */
        public Integer getResourceGroups() {
            return this.resourceGroups;
        }

        /**
         * @return resourceGroupsQuota
         */
        public Integer getResourceGroupsQuota() {
            return this.resourceGroupsQuota;
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
         * @return versionsPerPolicyQuota
         */
        public Integer getVersionsPerPolicyQuota() {
            return this.versionsPerPolicyQuota;
        }

        public static final class Builder {
            private Integer attachedPoliciesPerGroupQuota; 
            private Integer attachedPoliciesPerRoleQuota; 
            private Integer attachedPoliciesPerUserQuota; 
            private Integer attachedSystemPoliciesPerGroupQuota; 
            private Integer attachedSystemPoliciesPerRoleQuota; 
            private Integer attachedSystemPoliciesPerUserQuota; 
            private Integer policies; 
            private Integer policiesQuota; 
            private Integer policySizeQuota; 
            private Integer resourceGroups; 
            private Integer resourceGroupsQuota; 
            private Integer roles; 
            private Integer rolesQuota; 
            private Integer versionsPerPolicyQuota; 

            /**
             * AttachedPoliciesPerGroupQuota.
             */
            public Builder attachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
                this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
                return this;
            }

            /**
             * AttachedPoliciesPerRoleQuota.
             */
            public Builder attachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
                this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
                return this;
            }

            /**
             * AttachedPoliciesPerUserQuota.
             */
            public Builder attachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
                this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
                return this;
            }

            /**
             * AttachedSystemPoliciesPerGroupQuota.
             */
            public Builder attachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
                this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
                return this;
            }

            /**
             * AttachedSystemPoliciesPerRoleQuota.
             */
            public Builder attachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
                this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
                return this;
            }

            /**
             * AttachedSystemPoliciesPerUserQuota.
             */
            public Builder attachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
                this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
                return this;
            }

            /**
             * Policies.
             */
            public Builder policies(Integer policies) {
                this.policies = policies;
                return this;
            }

            /**
             * PoliciesQuota.
             */
            public Builder policiesQuota(Integer policiesQuota) {
                this.policiesQuota = policiesQuota;
                return this;
            }

            /**
             * PolicySizeQuota.
             */
            public Builder policySizeQuota(Integer policySizeQuota) {
                this.policySizeQuota = policySizeQuota;
                return this;
            }

            /**
             * ResourceGroups.
             */
            public Builder resourceGroups(Integer resourceGroups) {
                this.resourceGroups = resourceGroups;
                return this;
            }

            /**
             * ResourceGroupsQuota.
             */
            public Builder resourceGroupsQuota(Integer resourceGroupsQuota) {
                this.resourceGroupsQuota = resourceGroupsQuota;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(Integer roles) {
                this.roles = roles;
                return this;
            }

            /**
             * RolesQuota.
             */
            public Builder rolesQuota(Integer rolesQuota) {
                this.rolesQuota = rolesQuota;
                return this;
            }

            /**
             * VersionsPerPolicyQuota.
             */
            public Builder versionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
                this.versionsPerPolicyQuota = versionsPerPolicyQuota;
                return this;
            }

            public SummaryMap build() {
                return new SummaryMap(this);
            } 

        } 

    }
}
