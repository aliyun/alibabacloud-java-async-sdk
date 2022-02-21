// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyVersionsResponseBody</p>
 */
public class ListPolicyVersionsResponseBody extends TeaModel {
    @NameInMap("PolicyVersions")
    private PolicyVersions policyVersions;

    @NameInMap("RequestId")
    private String requestId;

    private ListPolicyVersionsResponseBody(Builder builder) {
        this.policyVersions = builder.policyVersions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyVersions
     */
    public PolicyVersions getPolicyVersions() {
        return this.policyVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PolicyVersions policyVersions; 
        private String requestId; 

        /**
         * PolicyVersions.
         */
        public Builder policyVersions(PolicyVersions policyVersions) {
            this.policyVersions = policyVersions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPolicyVersionsResponseBody build() {
            return new ListPolicyVersionsResponseBody(this);
        } 

    } 

    public static class PolicyVersion extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("IsDefaultVersion")
        private Boolean isDefaultVersion;

        @NameInMap("VersionId")
        private String versionId;

        private PolicyVersion(Builder builder) {
            this.createDate = builder.createDate;
            this.isDefaultVersion = builder.isDefaultVersion;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyVersion create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return isDefaultVersion
         */
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String createDate; 
            private Boolean isDefaultVersion; 
            private String versionId; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * IsDefaultVersion.
             */
            public Builder isDefaultVersion(Boolean isDefaultVersion) {
                this.isDefaultVersion = isDefaultVersion;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public PolicyVersion build() {
                return new PolicyVersion(this);
            } 

        } 

    }
    public static class PolicyVersions extends TeaModel {
        @NameInMap("PolicyVersion")
        private java.util.List < PolicyVersion> policyVersion;

        private PolicyVersions(Builder builder) {
            this.policyVersion = builder.policyVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyVersions create() {
            return builder().build();
        }

        /**
         * @return policyVersion
         */
        public java.util.List < PolicyVersion> getPolicyVersion() {
            return this.policyVersion;
        }

        public static final class Builder {
            private java.util.List < PolicyVersion> policyVersion; 

            /**
             * PolicyVersion.
             */
            public Builder policyVersion(java.util.List < PolicyVersion> policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            public PolicyVersions build() {
                return new PolicyVersions(this);
            } 

        } 

    }
}
