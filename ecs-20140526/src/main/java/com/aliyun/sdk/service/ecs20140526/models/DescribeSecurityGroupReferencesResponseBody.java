// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeSecurityGroupReferencesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupReferencesResponseBody</p>
 */
public class DescribeSecurityGroupReferencesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupReferences")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the references to the specified security groups.</p>
         */
        public Builder securityGroupReferences(SecurityGroupReferences securityGroupReferences) {
            this.securityGroupReferences = securityGroupReferences;
            return this;
        }

        public DescribeSecurityGroupReferencesResponseBody build() {
            return new DescribeSecurityGroupReferencesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityGroupReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupReferencesResponseBody</p>
     */
    public static class ReferencingSecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        private ReferencingSecurityGroup(Builder builder) {
            this.aliUid = builder.aliUid;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferencingSecurityGroup create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String aliUid; 
            private String securityGroupId; 

            /**
             * <p>The ID of the Alibaba Cloud account to which the security group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4j****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public ReferencingSecurityGroup build() {
                return new ReferencingSecurityGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupReferencesResponseBody</p>
     */
    public static class ReferencingSecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReferencingSecurityGroup")
        private java.util.List<ReferencingSecurityGroup> referencingSecurityGroup;

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
        public java.util.List<ReferencingSecurityGroup> getReferencingSecurityGroup() {
            return this.referencingSecurityGroup;
        }

        public static final class Builder {
            private java.util.List<ReferencingSecurityGroup> referencingSecurityGroup; 

            /**
             * ReferencingSecurityGroup.
             */
            public Builder referencingSecurityGroup(java.util.List<ReferencingSecurityGroup> referencingSecurityGroup) {
                this.referencingSecurityGroup = referencingSecurityGroup;
                return this;
            }

            public ReferencingSecurityGroups build() {
                return new ReferencingSecurityGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupReferencesResponseBody</p>
     */
    public static class SecurityGroupReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReferencingSecurityGroups")
        private ReferencingSecurityGroups referencingSecurityGroups;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        private SecurityGroupReference(Builder builder) {
            this.referencingSecurityGroups = builder.referencingSecurityGroups;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupReference create() {
            return builder().build();
        }

        /**
         * @return referencingSecurityGroups
         */
        public ReferencingSecurityGroups getReferencingSecurityGroups() {
            return this.referencingSecurityGroups;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private ReferencingSecurityGroups referencingSecurityGroups; 
            private String securityGroupId; 

            /**
             * <p>Details about the security groups whose rules are referencing the specified security groups.</p>
             */
            public Builder referencingSecurityGroups(ReferencingSecurityGroups referencingSecurityGroups) {
                this.referencingSecurityGroups = referencingSecurityGroups;
                return this;
            }

            /**
             * <p>The ID of the specified security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4p****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupReference build() {
                return new SecurityGroupReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupReferencesResponseBody</p>
     */
    public static class SecurityGroupReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupReference")
        private java.util.List<SecurityGroupReference> securityGroupReference;

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
        public java.util.List<SecurityGroupReference> getSecurityGroupReference() {
            return this.securityGroupReference;
        }

        public static final class Builder {
            private java.util.List<SecurityGroupReference> securityGroupReference; 

            /**
             * SecurityGroupReference.
             */
            public Builder securityGroupReference(java.util.List<SecurityGroupReference> securityGroupReference) {
                this.securityGroupReference = securityGroupReference;
                return this;
            }

            public SecurityGroupReferences build() {
                return new SecurityGroupReferences(this);
            } 

        } 

    }
}
