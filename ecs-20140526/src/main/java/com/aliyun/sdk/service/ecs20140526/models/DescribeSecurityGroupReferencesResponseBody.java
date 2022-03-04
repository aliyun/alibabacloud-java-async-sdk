// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupReferencesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupReferencesResponseBody</p>
 */
public class DescribeSecurityGroupReferencesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupReferences")
    private SecurityGroupReferences securityGroupReferences;

    private DescribeSecurityGroupReferencesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityGroupReferences = builder.securityGroupReferences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupReferencesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupReferences
     */
    public SecurityGroupReferences getSecurityGroupReferences() {
        return this.securityGroupReferences;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityGroupReferences securityGroupReferences; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The complete authorization information of all user-specified security groups.
         */
        public Builder securityGroupReferences(SecurityGroupReferences securityGroupReferences) {
            this.securityGroupReferences = securityGroupReferences;
            return this;
        }

        public DescribeSecurityGroupReferencesResponseBody build() {
            return new DescribeSecurityGroupReferencesResponseBody(this);
        } 

    } 

    public static class ReferencingSecurityGroup extends TeaModel {
        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("AliUid")
        private String aliUid;

        private ReferencingSecurityGroup(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.aliUid = builder.aliUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferencingSecurityGroup create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String aliUid; 

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The ID of the user to which the security group belongs.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            public ReferencingSecurityGroup build() {
                return new ReferencingSecurityGroup(this);
            } 

        } 

    }
    public static class ReferencingSecurityGroups extends TeaModel {
        @NameInMap("ReferencingSecurityGroup")
        private java.util.List < ReferencingSecurityGroup> referencingSecurityGroup;

        private ReferencingSecurityGroups(Builder builder) {
            this.referencingSecurityGroup = builder.referencingSecurityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferencingSecurityGroups create() {
            return builder().build();
        }

        /**
         * @return referencingSecurityGroup
         */
        public java.util.List < ReferencingSecurityGroup> getReferencingSecurityGroup() {
            return this.referencingSecurityGroup;
        }

        public static final class Builder {
            private java.util.List < ReferencingSecurityGroup> referencingSecurityGroup; 

            /**
             * ReferencingSecurityGroup.
             */
            public Builder referencingSecurityGroup(java.util.List < ReferencingSecurityGroup> referencingSecurityGroup) {
                this.referencingSecurityGroup = referencingSecurityGroup;
                return this;
            }

            public ReferencingSecurityGroups build() {
                return new ReferencingSecurityGroups(this);
            } 

        } 

    }
    public static class SecurityGroupReference extends TeaModel {
        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("ReferencingSecurityGroups")
        private ReferencingSecurityGroups referencingSecurityGroups;

        private SecurityGroupReference(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.referencingSecurityGroups = builder.referencingSecurityGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupReference create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return referencingSecurityGroups
         */
        public ReferencingSecurityGroups getReferencingSecurityGroups() {
            return this.referencingSecurityGroups;
        }

        public static final class Builder {
            private String securityGroupId; 
            private ReferencingSecurityGroups referencingSecurityGroups; 

            /**
             * The security group that you want to query.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The information about other security groups that are being authorized to this security group.
             */
            public Builder referencingSecurityGroups(ReferencingSecurityGroups referencingSecurityGroups) {
                this.referencingSecurityGroups = referencingSecurityGroups;
                return this;
            }

            public SecurityGroupReference build() {
                return new SecurityGroupReference(this);
            } 

        } 

    }
    public static class SecurityGroupReferences extends TeaModel {
        @NameInMap("SecurityGroupReference")
        private java.util.List < SecurityGroupReference> securityGroupReference;

        private SecurityGroupReferences(Builder builder) {
            this.securityGroupReference = builder.securityGroupReference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupReferences create() {
            return builder().build();
        }

        /**
         * @return securityGroupReference
         */
        public java.util.List < SecurityGroupReference> getSecurityGroupReference() {
            return this.securityGroupReference;
        }

        public static final class Builder {
            private java.util.List < SecurityGroupReference> securityGroupReference; 

            /**
             * SecurityGroupReference.
             */
            public Builder securityGroupReference(java.util.List < SecurityGroupReference> securityGroupReference) {
                this.securityGroupReference = securityGroupReference;
                return this;
            }

            public SecurityGroupReferences build() {
                return new SecurityGroupReferences(this);
            } 

        } 

    }
}
