// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyVersionResponseBody</p>
 */
public class GetPolicyVersionResponseBody extends TeaModel {
    @NameInMap("PolicyVersion")
    private PolicyVersion policyVersion;

    @NameInMap("RequestId")
    private String requestId;

    private GetPolicyVersionResponseBody(Builder builder) {
        this.policyVersion = builder.policyVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyVersion
     */
    public PolicyVersion getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PolicyVersion policyVersion; 
        private String requestId; 

        /**
         * The information of the policy version.
         */
        public Builder policyVersion(PolicyVersion policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicyVersionResponseBody build() {
            return new GetPolicyVersionResponseBody(this);
        } 

    } 

    public static class PolicyVersion extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("IsDefaultVersion")
        private Boolean isDefaultVersion;

        @NameInMap("PolicyDocument")
        private String policyDocument;

        @NameInMap("VersionId")
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
             * The time when the policy version was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Indicates whether the policy version is the default version.
             */
            public Builder isDefaultVersion(Boolean isDefaultVersion) {
                this.isDefaultVersion = isDefaultVersion;
                return this;
            }

            /**
             * The document of the policy.
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * The ID of the policy version.
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
}
