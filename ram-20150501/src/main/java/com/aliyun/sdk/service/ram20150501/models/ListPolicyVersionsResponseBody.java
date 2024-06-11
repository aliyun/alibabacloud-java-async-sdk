// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyVersionsResponseBody</p>
 */
public class ListPolicyVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyVersions")
    private PolicyVersions policyVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The list of the policy versions.
         */
        public Builder policyVersions(PolicyVersions policyVersions) {
            this.policyVersions = policyVersions;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("IsDefaultVersion")
        private Boolean isDefaultVersion;

        @com.aliyun.core.annotation.NameInMap("PolicyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private PolicyVersion(Builder builder) {
            this.createDate = builder.createDate;
            this.isDefaultVersion = builder.isDefaultVersion;
            this.policyDocument = builder.policyDocument;
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
         * @return policyDocument
         */
        public String getPolicyDocument() {
            return this.policyDocument;
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
            private String policyDocument; 
            private String versionId; 

            /**
             * The time when the version was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Indicates whether the version is the default version.
             */
            public Builder isDefaultVersion(Boolean isDefaultVersion) {
                this.isDefaultVersion = isDefaultVersion;
                return this;
            }

            /**
             * The script of the policy.
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * The ID of the version.
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
        @com.aliyun.core.annotation.NameInMap("PolicyVersion")
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
