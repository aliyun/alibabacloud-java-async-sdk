// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSCIMServerCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSCIMServerCredentialResponseBody</p>
 */
public class CreateSCIMServerCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SCIMServerCredential")
    private SCIMServerCredential SCIMServerCredential;

    private CreateSCIMServerCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SCIMServerCredential = builder.SCIMServerCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSCIMServerCredentialResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SCIMServerCredential
     */
    public SCIMServerCredential getSCIMServerCredential() {
        return this.SCIMServerCredential;
    }

    public static final class Builder {
        private String requestId; 
        private SCIMServerCredential SCIMServerCredential; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2D2E5180-7ACF-57FF-A56C-26A49ABEBFF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the SCIM credential.</p>
         */
        public Builder SCIMServerCredential(SCIMServerCredential SCIMServerCredential) {
            this.SCIMServerCredential = SCIMServerCredential;
            return this;
        }

        public CreateSCIMServerCredentialResponseBody build() {
            return new CreateSCIMServerCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSCIMServerCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSCIMServerCredentialResponseBody</p>
     */
    public static class SCIMServerCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("CredentialSecret")
        private String credentialSecret;

        @com.aliyun.core.annotation.NameInMap("CredentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SCIMServerCredential(Builder builder) {
            this.createTime = builder.createTime;
            this.credentialId = builder.credentialId;
            this.credentialSecret = builder.credentialSecret;
            this.credentialType = builder.credentialType;
            this.directoryId = builder.directoryId;
            this.expireTime = builder.expireTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SCIMServerCredential create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return credentialSecret
         */
        public String getCredentialSecret() {
            return this.credentialSecret;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String credentialId; 
            private String credentialSecret; 
            private String credentialType; 
            private String directoryId; 
            private String expireTime; 
            private String status; 

            /**
             * <p>The time when the SCIM credential was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-09T08:12:52Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the SCIM credential.</p>
             * 
             * <strong>example:</strong>
             * <p>scimcred-004whl0kvfwcypbi****</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>The SCIM credential.</p>
             * <blockquote>
             * <p> The SCIM credential is returned only when it is created. After the SCIM credential is created, you cannot query it. Keep the SCIM credential confidential.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8aAJCtpbyPJ8saXeYDgyw****</p>
             */
            public Builder credentialSecret(String credentialSecret) {
                this.credentialSecret = credentialSecret;
                return this;
            }

            /**
             * <p>The type of the SCIM credential.</p>
             * 
             * <strong>example:</strong>
             * <p>BearerToken</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>The ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>d-00fc2p61****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The time when the SCIM credential expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-09T08:12:52Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The status of the SCIM credential. The value is fixed as Enabled, which indicates that the SCIM credential is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SCIMServerCredential build() {
                return new SCIMServerCredential(this);
            } 

        } 

    }
}
