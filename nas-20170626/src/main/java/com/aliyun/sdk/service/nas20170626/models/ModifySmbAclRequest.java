// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Specifies whether to allow anonymous access. Valid values:</p>
         * <ul>
         * <li>true: The file system allows anonymous access.</li>
         * <li>false (default): The file system denies anonymous access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAnonymousAccess(Boolean enableAnonymousAccess) {
            this.putQueryParameter("EnableAnonymousAccess", enableAnonymousAccess);
            this.enableAnonymousAccess = enableAnonymousAccess;
            return this;
        }

        /**
         * <p>Specifies whether to enable encryption in transit. Valid values:</p>
         * <ul>
         * <li>true: enables encryption in transit.</li>
         * <li>false (default): disables encryption in transit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encryptData(Boolean encryptData) {
            this.putQueryParameter("EncryptData", encryptData);
            this.encryptData = encryptData;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The home directory of each user. Each user-specific home directory must meet the following requirements:</p>
         * <ul>
         * <li>Each segment starts with a forward slash (/) or a backward slash (\).</li>
         * <li>Each segment does not contain the following special characters: <code>&lt;&gt;&quot;:|?*</code>.</li>
         * <li>Each segment is 0 to 255 characters in length.</li>
         * <li>The total length is 0 to 32,767 characters.</li>
         * </ul>
         * <p>For example, if you create a user named A and the home directory is <code>/home</code>, the file system automatically creates a directory named <code>/home/A</code> when User A logs on to the file system. If the <code>/home/A</code> directory already exists, the file system does not create the directory.</p>
         * <blockquote>
         * <p>User A must have the permissions to create folders in the \home directory. Otherwise, the file system cannot create the <code>/home/A</code> directory when User A logs on to the file system.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        public Builder homeDirPath(String homeDirPath) {
            this.putQueryParameter("HomeDirPath", homeDirPath);
            this.homeDirPath = homeDirPath;
            return this;
        }

        /**
         * <p>The string that is generated after the system encodes the keytab file by using Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>BQIAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAQAIqIx6v7p11oUAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAwAIqIx6v7p11oUAAABPAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAFwAQnQZWB3RAPHU7PMIJyBWePAAAAF8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQASACAGJ7F0s+bcBjf6jD5HlvlRLmPSOW+qDZe0Qk0lQcf8WwAAAE8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQARABDdFmanrSIatnDDh****</p>
         */
        public Builder keytab(String keytab) {
            this.putQueryParameter("Keytab", keytab);
            this.keytab = keytab;
            return this;
        }

        /**
         * <p>The string that is generated after the system encodes the keytab file by using MD5.</p>
         * 
         * <strong>example:</strong>
         * <p>E3CCF7E2416DF04FA958AA4513EA****</p>
         */
        public Builder keytabMd5(String keytabMd5) {
            this.putQueryParameter("KeytabMd5", keytabMd5);
            this.keytabMd5 = keytabMd5;
            return this;
        }

        /**
         * <p>Specifies whether to deny access from non-encrypted clients. Valid values:</p>
         * <ul>
         * <li>true: The file system denies access from non-encrypted clients.</li>
         * <li>false (default): The file system allows access from non-encrypted clients.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder rejectUnencryptedAccess(Boolean rejectUnencryptedAccess) {
            this.putQueryParameter("RejectUnencryptedAccess", rejectUnencryptedAccess);
            this.rejectUnencryptedAccess = rejectUnencryptedAccess;
            return this;
        }

        /**
         * <p>The ID of a super admin. The ID must meet the following requirements:</p>
         * <ul>
         * <li>The ID starts with <code>S</code> and does not contain letters except S.</li>
         * <li>The ID contains at least three hyphens (-) as delimiters.</li>
         * </ul>
         * <p>Examples: <code>S-1-5-22</code> and <code>S-1-5-22-23</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>S-1-5-22</p>
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
