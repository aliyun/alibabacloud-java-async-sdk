// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GetPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyResponseBody</p>
 */
public class GetPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultPolicyVersion")
    private DefaultPolicyVersion defaultPolicyVersion;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPolicyResponseBody(Builder builder) {
        this.defaultPolicyVersion = builder.defaultPolicyVersion;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return defaultPolicyVersion
     */
    public DefaultPolicyVersion getDefaultPolicyVersion() {
        return this.defaultPolicyVersion;
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DefaultPolicyVersion defaultPolicyVersion; 
        private Policy policy; 
        private String requestId; 

        /**
         * <p>The information of the default policy version.</p>
         */
        public Builder defaultPolicyVersion(DefaultPolicyVersion defaultPolicyVersion) {
            this.defaultPolicyVersion = defaultPolicyVersion;
            return this;
        }

        /**
         * <p>The basic information of the policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>697852FB-50D7-44D9-9774-530C31EAC572</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicyResponseBody build() {
            return new GetPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class DefaultPolicyVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("IsDefaultVersion")
        private Boolean isDefaultVersion;

        @com.aliyun.core.annotation.NameInMap("PolicyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private DefaultPolicyVersion(Builder builder) {
            this.createDate = builder.createDate;
            this.isDefaultVersion = builder.isDefaultVersion;
            this.policyDocument = builder.policyDocument;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultPolicyVersion create() {
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
             * <p>The time when the default policy version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>An attribute in the <code>DefaultPolicyVersion</code> parameter. The value of the <code>IsDefaultVersion</code> parameter is <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefaultVersion(Boolean isDefaultVersion) {
                this.isDefaultVersion = isDefaultVersion;
                return this;
            }

            /**
             * <p>The script of the default policy version.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Statement&quot;: [{ &quot;Action&quot;: [&quot;oss:<em>&quot;], &quot;Effect&quot;: &quot;Allow&quot;, &quot;Resource&quot;: [&quot;acs:oss:</em>:<em>:</em>&quot;]}], &quot;Version&quot;: &quot;1&quot;}</p>
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * <p>The ID of the default policy version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public DefaultPolicyVersion build() {
                return new DefaultPolicyVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentCount")
        private Integer attachmentCount;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PolicyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private Policy(Builder builder) {
            this.attachmentCount = builder.attachmentCount;
            this.createDate = builder.createDate;
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.policyDocument = builder.policyDocument;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return attachmentCount
         */
        public Integer getAttachmentCount() {
            return this.attachmentCount;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return policyDocument
         */
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private Integer attachmentCount; 
            private String createDate; 
            private String defaultVersion; 
            private String description; 
            private String policyDocument; 
            private String policyName; 
            private String policyType; 
            private String updateDate; 

            /**
             * <p>The number of references to the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attachmentCount(Integer attachmentCount) {
                this.attachmentCount = attachmentCount;
                return this;
            }

            /**
             * <p>The time when the policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The default version ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS administrator</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS-Administrator</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The type of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The time when the policy was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
