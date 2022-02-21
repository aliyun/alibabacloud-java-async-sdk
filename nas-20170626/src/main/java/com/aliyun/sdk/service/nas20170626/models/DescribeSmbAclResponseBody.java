// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmbAclResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmbAclResponseBody</p>
 */
public class DescribeSmbAclResponseBody extends TeaModel {
    @NameInMap("Acl")
    private Acl acl;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSmbAclResponseBody(Builder builder) {
        this.acl = builder.acl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmbAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return acl
     */
    public Acl getAcl() {
        return this.acl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Acl acl; 
        private String requestId; 

        /**
         * Acl.
         */
        public Builder acl(Acl acl) {
            this.acl = acl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSmbAclResponseBody build() {
            return new DescribeSmbAclResponseBody(this);
        } 

    } 

    public static class Acl extends TeaModel {
        @NameInMap("AuthMethod")
        private String authMethod;

        @NameInMap("EnableAnonymousAccess")
        private Boolean enableAnonymousAccess;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("EncryptData")
        private Boolean encryptData;

        @NameInMap("HomeDirPath")
        private String homeDirPath;

        @NameInMap("RejectUnencryptedAccess")
        private Boolean rejectUnencryptedAccess;

        @NameInMap("SuperAdminSid")
        private String superAdminSid;

        private Acl(Builder builder) {
            this.authMethod = builder.authMethod;
            this.enableAnonymousAccess = builder.enableAnonymousAccess;
            this.enabled = builder.enabled;
            this.encryptData = builder.encryptData;
            this.homeDirPath = builder.homeDirPath;
            this.rejectUnencryptedAccess = builder.rejectUnencryptedAccess;
            this.superAdminSid = builder.superAdminSid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acl create() {
            return builder().build();
        }

        /**
         * @return authMethod
         */
        public String getAuthMethod() {
            return this.authMethod;
        }

        /**
         * @return enableAnonymousAccess
         */
        public Boolean getEnableAnonymousAccess() {
            return this.enableAnonymousAccess;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return encryptData
         */
        public Boolean getEncryptData() {
            return this.encryptData;
        }

        /**
         * @return homeDirPath
         */
        public String getHomeDirPath() {
            return this.homeDirPath;
        }

        /**
         * @return rejectUnencryptedAccess
         */
        public Boolean getRejectUnencryptedAccess() {
            return this.rejectUnencryptedAccess;
        }

        /**
         * @return superAdminSid
         */
        public String getSuperAdminSid() {
            return this.superAdminSid;
        }

        public static final class Builder {
            private String authMethod; 
            private Boolean enableAnonymousAccess; 
            private Boolean enabled; 
            private Boolean encryptData; 
            private String homeDirPath; 
            private Boolean rejectUnencryptedAccess; 
            private String superAdminSid; 

            /**
             * AuthMethod.
             */
            public Builder authMethod(String authMethod) {
                this.authMethod = authMethod;
                return this;
            }

            /**
             * EnableAnonymousAccess.
             */
            public Builder enableAnonymousAccess(Boolean enableAnonymousAccess) {
                this.enableAnonymousAccess = enableAnonymousAccess;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * EncryptData.
             */
            public Builder encryptData(Boolean encryptData) {
                this.encryptData = encryptData;
                return this;
            }

            /**
             * HomeDirPath.
             */
            public Builder homeDirPath(String homeDirPath) {
                this.homeDirPath = homeDirPath;
                return this;
            }

            /**
             * RejectUnencryptedAccess.
             */
            public Builder rejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
                this.rejectUnencryptedAccess = rejectUnencryptedAccess;
                return this;
            }

            /**
             * SuperAdminSid.
             */
            public Builder superAdminSid(String superAdminSid) {
                this.superAdminSid = superAdminSid;
                return this;
            }

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
}
