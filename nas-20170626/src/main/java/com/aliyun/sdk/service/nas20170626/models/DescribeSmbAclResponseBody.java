// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeSmbAclResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmbAclResponseBody</p>
 */
public class DescribeSmbAclResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acl")
    private Acl acl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the ACL feature.</p>
         */
        public Builder acl(Acl acl) {
            this.acl = acl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSmbAclResponseBody build() {
            return new DescribeSmbAclResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSmbAclResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmbAclResponseBody</p>
     */
    public static class Acl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableAnonymousAccess")
        private Boolean enableAnonymousAccess;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EncryptData")
        private Boolean encryptData;

        @com.aliyun.core.annotation.NameInMap("HomeDirPath")
        private String homeDirPath;

        @com.aliyun.core.annotation.NameInMap("RejectUnencryptedAccess")
        private Boolean rejectUnencryptedAccess;

        @com.aliyun.core.annotation.NameInMap("SuperAdminSid")
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
             * <p>Indicates whether the file system allows anonymous access. Valid values:</p>
             * <ul>
             * <li>true: The file system allows anonymous access.</li>
             * <li>false: The file system does not allow anonymous access.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAnonymousAccess(Boolean enableAnonymousAccess) {
                this.enableAnonymousAccess = enableAnonymousAccess;
                return this;
            }

            /**
             * <p>Indicates whether the ACL feature is enabled. Valid values:</p>
             * <ul>
             * <li>true: The ACL feature is enabled.</li>
             * <li>false: The ACL feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Indicates whether encryption in transit is enabled. Valid values:</p>
             * <ul>
             * <li>true: Encryption in transit is enabled.</li>
             * <li>false: Encryption in transit is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encryptData(Boolean encryptData) {
                this.encryptData = encryptData;
                return this;
            }

            /**
             * <p>The home directory of each user.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
             */
            public Builder homeDirPath(String homeDirPath) {
                this.homeDirPath = homeDirPath;
                return this;
            }

            /**
             * <p>Indicates whether the file system denies access from non-encrypted clients. Valid values:</p>
             * <ul>
             * <li>true: The file system denies access from non-encrypted clients.</li>
             * <li>false: The file system allows access from non-encrypted clients.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder rejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
                this.rejectUnencryptedAccess = rejectUnencryptedAccess;
                return this;
            }

            /**
             * <p>The ID of a super admin.</p>
             * 
             * <strong>example:</strong>
             * <p>S-1-0-0</p>
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
