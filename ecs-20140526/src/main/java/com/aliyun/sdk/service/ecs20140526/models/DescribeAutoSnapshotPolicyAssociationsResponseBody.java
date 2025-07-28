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
 * {@link DescribeAutoSnapshotPolicyAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotPolicyAssociationsResponseBody</p>
 */
public class DescribeAutoSnapshotPolicyAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyAssociations")
    private AutoSnapshotPolicyAssociations autoSnapshotPolicyAssociations;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAutoSnapshotPolicyAssociationsResponseBody(Builder builder) {
        this.autoSnapshotPolicyAssociations = builder.autoSnapshotPolicyAssociations;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoSnapshotPolicyAssociationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSnapshotPolicyAssociations
     */
    public AutoSnapshotPolicyAssociations getAutoSnapshotPolicyAssociations() {
        return this.autoSnapshotPolicyAssociations;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AutoSnapshotPolicyAssociations autoSnapshotPolicyAssociations; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAutoSnapshotPolicyAssociationsResponseBody model) {
            this.autoSnapshotPolicyAssociations = model.autoSnapshotPolicyAssociations;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * AutoSnapshotPolicyAssociations.
         */
        public Builder autoSnapshotPolicyAssociations(AutoSnapshotPolicyAssociations autoSnapshotPolicyAssociations) {
            this.autoSnapshotPolicyAssociations = autoSnapshotPolicyAssociations;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAutoSnapshotPolicyAssociationsResponseBody build() {
            return new DescribeAutoSnapshotPolicyAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoSnapshotPolicyAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyAssociationsResponseBody</p>
     */
    public static class AutoSnapshotPolicyAssociation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        private AutoSnapshotPolicyAssociation(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.diskId = builder.diskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicyAssociation create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private String diskId; 

            private Builder() {
            } 

            private Builder(AutoSnapshotPolicyAssociation model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.diskId = model.diskId;
            } 

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            public AutoSnapshotPolicyAssociation build() {
                return new AutoSnapshotPolicyAssociation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoSnapshotPolicyAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyAssociationsResponseBody</p>
     */
    public static class AutoSnapshotPolicyAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyAssociation")
        private java.util.List<AutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociation;

        private AutoSnapshotPolicyAssociations(Builder builder) {
            this.autoSnapshotPolicyAssociation = builder.autoSnapshotPolicyAssociation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicyAssociations create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyAssociation
         */
        public java.util.List<AutoSnapshotPolicyAssociation> getAutoSnapshotPolicyAssociation() {
            return this.autoSnapshotPolicyAssociation;
        }

        public static final class Builder {
            private java.util.List<AutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociation; 

            private Builder() {
            } 

            private Builder(AutoSnapshotPolicyAssociations model) {
                this.autoSnapshotPolicyAssociation = model.autoSnapshotPolicyAssociation;
            } 

            /**
             * AutoSnapshotPolicyAssociation.
             */
            public Builder autoSnapshotPolicyAssociation(java.util.List<AutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociation) {
                this.autoSnapshotPolicyAssociation = autoSnapshotPolicyAssociation;
                return this;
            }

            public AutoSnapshotPolicyAssociations build() {
                return new AutoSnapshotPolicyAssociations(this);
            } 

        } 

    }
}
