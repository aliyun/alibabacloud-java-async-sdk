// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyVersionResponseBody</p>
 */
public class CreatePolicyVersionResponseBody extends TeaModel {
    @NameInMap("PolicyVersion")
    private PolicyVersion policyVersion;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePolicyVersionResponseBody(Builder builder) {
        this.policyVersion = builder.policyVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyVersionResponseBody create() {
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
         * PolicyVersion.
         */
        public Builder policyVersion(PolicyVersion policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolicyVersionResponseBody build() {
            return new CreatePolicyVersionResponseBody(this);
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
}
