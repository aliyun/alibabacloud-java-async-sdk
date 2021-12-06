// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateSCIMServerCredentialStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSCIMServerCredentialStatusResponseBody</p>
 */
public class UpdateSCIMServerCredentialStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SCIMServerCredential")
    private SCIMServerCredential SCIMServerCredential;


    private UpdateSCIMServerCredentialStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SCIMServerCredential = builder.SCIMServerCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSCIMServerCredentialStatusResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SCIMServerCredential.</p>
         */
        public Builder SCIMServerCredential(SCIMServerCredential SCIMServerCredential) {
            this.SCIMServerCredential = SCIMServerCredential;
            return this;
        }

        public UpdateSCIMServerCredentialStatusResponseBody build() {
            return new UpdateSCIMServerCredentialStatusResponseBody(this);
        } 

    } 

    public static class SCIMServerCredential extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CredentialId")
        private String credentialId;

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
            private String credentialType; 
            private String directoryId; 
            private String expireTime; 
            private String status; 

            /**
             * <p>CreateTime.</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>CredentialId.</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>CredentialType.</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>DirectoryId.</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>ExpireTime.</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Status.</p>
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
