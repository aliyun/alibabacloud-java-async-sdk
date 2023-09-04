// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSCIMServerCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSCIMServerCredentialResponseBody</p>
 */
public class CreateSCIMServerCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SCIMServerCredential")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the SCIM credential.
         */
        public Builder SCIMServerCredential(SCIMServerCredential SCIMServerCredential) {
            this.SCIMServerCredential = SCIMServerCredential;
            return this;
        }

        public CreateSCIMServerCredentialResponseBody build() {
            return new CreateSCIMServerCredentialResponseBody(this);
        } 

    } 

    public static class SCIMServerCredential extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CredentialId")
        private String credentialId;

        @NameInMap("CredentialSecret")
        private String credentialSecret;

        @NameInMap("CredentialType")
        private String credentialType;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Status")
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
             * The time when the SCIM credential was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the SCIM credential.
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * The SCIM credential.
             * <p>
             * 
             * >  The SCIM credential is returned only when it is created. After the SCIM credential is created, you cannot query it. Keep the SCIM credential confidential.
             */
            public Builder credentialSecret(String credentialSecret) {
                this.credentialSecret = credentialSecret;
                return this;
            }

            /**
             * The type of the SCIM credential.
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * The ID of the directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The time when the SCIM credential expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The status of the SCIM credential. The value is fixed as Enabled, which indicates that the SCIM credential is enabled.
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
