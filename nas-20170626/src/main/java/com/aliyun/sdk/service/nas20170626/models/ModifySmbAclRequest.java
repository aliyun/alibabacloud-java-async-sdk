// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySmbAclRequest} extends {@link RequestModel}
 *
 * <p>ModifySmbAclRequest</p>
 */
public class ModifySmbAclRequest extends Request {
    @Query
    @NameInMap("EnableAnonymousAccess")
    @Validation(required = true)
    private Boolean enableAnonymousAccess;

    @Query
    @NameInMap("EncryptData")
    @Validation(required = true)
    private Boolean encryptData;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("HomeDirPath")
    private String homeDirPath;

    @Query
    @NameInMap("Keytab")
    private String keytab;

    @Query
    @NameInMap("KeytabMd5")
    private String keytabMd5;

    @Query
    @NameInMap("RejectUnencryptedAccess")
    @Validation(required = true)
    private Boolean rejectUnencryptedAccess;

    @Query
    @NameInMap("SuperAdminSid")
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

        private Builder(ModifySmbAclRequest response) {
            super(response);
            this.enableAnonymousAccess = response.enableAnonymousAccess;
            this.encryptData = response.encryptData;
            this.fileSystemId = response.fileSystemId;
            this.homeDirPath = response.homeDirPath;
            this.keytab = response.keytab;
            this.keytabMd5 = response.keytabMd5;
            this.rejectUnencryptedAccess = response.rejectUnencryptedAccess;
            this.superAdminSid = response.superAdminSid;
        } 

        /**
         * EnableAnonymousAccess.
         */
        public Builder enableAnonymousAccess(Boolean enableAnonymousAccess) {
            this.putQueryParameter("EnableAnonymousAccess", enableAnonymousAccess);
            this.enableAnonymousAccess = enableAnonymousAccess;
            return this;
        }

        /**
         * EncryptData.
         */
        public Builder encryptData(Boolean encryptData) {
            this.putQueryParameter("EncryptData", encryptData);
            this.encryptData = encryptData;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * HomeDirPath.
         */
        public Builder homeDirPath(String homeDirPath) {
            this.putQueryParameter("HomeDirPath", homeDirPath);
            this.homeDirPath = homeDirPath;
            return this;
        }

        /**
         * Keytab.
         */
        public Builder keytab(String keytab) {
            this.putQueryParameter("Keytab", keytab);
            this.keytab = keytab;
            return this;
        }

        /**
         * KeytabMd5.
         */
        public Builder keytabMd5(String keytabMd5) {
            this.putQueryParameter("KeytabMd5", keytabMd5);
            this.keytabMd5 = keytabMd5;
            return this;
        }

        /**
         * RejectUnencryptedAccess.
         */
        public Builder rejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
            this.putQueryParameter("RejectUnencryptedAccess", rejectUnencryptedAccess);
            this.rejectUnencryptedAccess = rejectUnencryptedAccess;
            return this;
        }

        /**
         * SuperAdminSid.
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
