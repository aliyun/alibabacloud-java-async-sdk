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
         * The information about the ACL feature.
         */
        public Builder acl(Acl acl) {
            this.acl = acl;
            return this;
        }

        /**
         * The request ID.
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
            private Boolean enableAnonymousAccess; 
            private Boolean enabled; 
            private Boolean encryptData; 
            private String homeDirPath; 
            private Boolean rejectUnencryptedAccess; 
            private String superAdminSid; 

            /**
             * Indicates whether the file system allows anonymous access. Valid values:
             * <p>
             * 
             * *   true: The file system allows anonymous access.
             * *   false: The file system does not allow anonymous access.
             */
            public Builder enableAnonymousAccess(Boolean enableAnonymousAccess) {
                this.enableAnonymousAccess = enableAnonymousAccess;
                return this;
            }

            /**
             * Indicates whether the ACL feature is enabled. Valid values:
             * <p>
             * 
             * *   true: The ACL feature is enabled.
             * *   false: The ACL feature is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Indicates whether encryption in transit is enabled. Valid values:
             * <p>
             * 
             * *   true: Encryption in transit is enabled.
             * *   false: Encryption in transit is disabled.
             */
            public Builder encryptData(Boolean encryptData) {
                this.encryptData = encryptData;
                return this;
            }

            /**
             * The home directory of each user.
             */
            public Builder homeDirPath(String homeDirPath) {
                this.homeDirPath = homeDirPath;
                return this;
            }

            /**
             * Indicates whether the file system denies access from non-encrypted clients. Valid values:
             * <p>
             * 
             * *   true: The file system denies access from non-encrypted clients.
             * *   false: The file system allows access from non-encrypted clients.
             */
            public Builder rejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
                this.rejectUnencryptedAccess = rejectUnencryptedAccess;
                return this;
            }

            /**
             * The ID of a super admin.
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
