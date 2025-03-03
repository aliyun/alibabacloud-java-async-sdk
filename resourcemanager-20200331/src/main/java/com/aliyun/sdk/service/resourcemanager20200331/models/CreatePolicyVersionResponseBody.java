// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link CreatePolicyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyVersionResponseBody</p>
 */
public class CreatePolicyVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    private PolicyVersion policyVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information of the policy version.</p>
         */
        public Builder policyVersion(PolicyVersion policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolicyVersionResponseBody build() {
            return new CreatePolicyVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolicyVersionResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolicyVersionResponseBody</p>
     */
    public static class PolicyVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("IsDefaultVersion")
        private Boolean isDefaultVersion;

        @com.aliyun.core.annotation.NameInMap("VersionId")
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
             * <p>The time when the policy version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>Indicates whether the policy version is the default version.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefaultVersion(Boolean isDefaultVersion) {
                this.isDefaultVersion = isDefaultVersion;
                return this;
            }

            /**
             * <p>The ID of the policy version.</p>
             * 
             * <strong>example:</strong>
             * <p>v3</p>
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
