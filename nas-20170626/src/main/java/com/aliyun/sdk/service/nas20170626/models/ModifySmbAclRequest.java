// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySmbAclRequest} extends {@link RequestModel}
 *
 * <p>ModifySmbAclRequest</p>
 */
public class ModifySmbAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAnonymousAccess")
    private Boolean enableAnonymousAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptData")
    private Boolean encryptData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HomeDirPath")
    private String homeDirPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keytab")
    private String keytab;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeytabMd5")
    private String keytabMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RejectUnencryptedAccess")
    private Boolean rejectUnencryptedAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuperAdminSid")
    private String superAdminSid;

    private ModifySmbAclRequest(Builder builder) {
        super(builder);
        this.enableAnonymousAccess = builder.enableAnonymousAccess;
        this.encryptData = builder.encryptData;
        this.fileSystemId = builder.fileSystemId;
        this.homeDirPath = builder.homeDirPath;
        this.keytab = builder.keytab;
        this.keytabMd5 = builder.keytabMd5;
        this.rejectUnencryptedAccess = builder.rejectUnencryptedAccess;
        this.superAdminSid = builder.superAdminSid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySmbAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableAnonymousAccess
     */
    public Boolean getEnableAnonymousAccess() {
        return this.enableAnonymousAccess;
    }

    /**
     * @return encryptData
     */
    public Boolean getEncryptData() {
        return this.encryptData;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return homeDirPath
     */
    public String getHomeDirPath() {
        return this.homeDirPath;
    }

    /**
     * @return keytab
     */
    public String getKeytab() {
        return this.keytab;
    }

    /**
     * @return keytabMd5
     */
    public String getKeytabMd5() {
        return this.keytabMd5;
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

    public static final class Builder extends Request.Builder<ModifySmbAclRequest, Builder> {
        private Boolean enableAnonymousAccess; 
        private Boolean encryptData; 
        private String fileSystemId; 
        private String homeDirPath; 
        private String keytab; 
        private String keytabMd5; 
        private Boolean rejectUnencryptedAccess; 
        private String superAdminSid; 

        private Builder() {
            super();
        } 

        private Builder(ModifySmbAclRequest request) {
            super(request);
            this.enableAnonymousAccess = request.enableAnonymousAccess;
            this.encryptData = request.encryptData;
            this.fileSystemId = request.fileSystemId;
            this.homeDirPath = request.homeDirPath;
            this.keytab = request.keytab;
            this.keytabMd5 = request.keytabMd5;
            this.rejectUnencryptedAccess = request.rejectUnencryptedAccess;
            this.superAdminSid = request.superAdminSid;
        } 

        /**
         * Specifies whether to allow anonymous access. Valid values:
         * <p>
         * 
         * *   true: The file system allows anonymous access.
         * *   false (default): The file system denies anonymous access.
         */
        public Builder enableAnonymousAccess(Boolean enableAnonymousAccess) {
            this.putQueryParameter("EnableAnonymousAccess", enableAnonymousAccess);
            this.enableAnonymousAccess = enableAnonymousAccess;
            return this;
        }

        /**
         * Specifies whether to enable encryption in transit. Valid values:
         * <p>
         * 
         * *   true: enables encryption in transit.
         * *   false (default): disables encryption in transit.
         */
        public Builder encryptData(Boolean encryptData) {
            this.putQueryParameter("EncryptData", encryptData);
            this.encryptData = encryptData;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The home directory of each user. Each user-specific home directory must meet the following requirements:
         * <p>
         * 
         * *   Each segment starts with a forward slash (/) or a backward slash (\\).
         * *   Each segment does not contain the following special characters: `<>":|?*`.
         * *   Each segment is 0 to 255 characters in length.
         * *   The total length is 0 to 32,767 characters.
         * 
         * For example, if you create a user named A and the home directory is `/home`, the file system automatically creates a directory named `/home/A` when User A logs on to the file system. If the `/home/A` directory already exists, the file system does not create the directory.
         * 
         * > User A must have the permissions to create folders in the \home directory. Otherwise, the file system cannot create the `/home/A` directory when User A logs on to the file system.
         */
        public Builder homeDirPath(String homeDirPath) {
            this.putQueryParameter("HomeDirPath", homeDirPath);
            this.homeDirPath = homeDirPath;
            return this;
        }

        /**
         * The string that is generated after the system encodes the keytab file by using Base64.
         */
        public Builder keytab(String keytab) {
            this.putQueryParameter("Keytab", keytab);
            this.keytab = keytab;
            return this;
        }

        /**
         * The string that is generated after the system encodes the keytab file by using MD5.
         */
        public Builder keytabMd5(String keytabMd5) {
            this.putQueryParameter("KeytabMd5", keytabMd5);
            this.keytabMd5 = keytabMd5;
            return this;
        }

        /**
         * Specifies whether to deny access from non-encrypted clients. Valid values:
         * <p>
         * 
         * *   true: The file system denies access from non-encrypted clients.
         * *   false (default): The file system allows access from non-encrypted clients.
         */
        public Builder rejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
            this.putQueryParameter("RejectUnencryptedAccess", rejectUnencryptedAccess);
            this.rejectUnencryptedAccess = rejectUnencryptedAccess;
            return this;
        }

        /**
         * The ID of a super admin. The ID must meet the following requirements:
         * <p>
         * 
         * *   The ID starts with `S` and does not contain letters except S.
         * *   The ID contains at least three hyphens (-) as delimiters.
         * 
         * Examples: `S-1-5-22` and `S-1-5-22-23`.
         */
        public Builder superAdminSid(String superAdminSid) {
            this.putQueryParameter("SuperAdminSid", superAdminSid);
            this.superAdminSid = superAdminSid;
            return this;
        }

        @Override
        public ModifySmbAclRequest build() {
            return new ModifySmbAclRequest(this);
        } 

    } 

}
