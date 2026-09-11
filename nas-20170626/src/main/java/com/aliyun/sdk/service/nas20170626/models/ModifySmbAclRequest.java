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
         * <p>Specifies whether to allow anonymous access. </p>
         * <ul>
         * <li><p>true: Anonymous access is allowed.</p>
         * </li>
         * <li><p>false (default): Anonymous access is not allowed.</p>
         * </li>
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
         * <p>Specifies whether to enable encryption in transit.</p>
         * <ul>
         * <li><p>true: Encryption in transit is enabled.</p>
         * </li>
         * <li><p>false (default): Encryption in transit is not enabled.</p>
         * </li>
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
         * <p>The file system ID.</p>
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
         * <p>The home folder path for each user. The file path format is as follows:</p>
         * <ul>
         * <li><p>Use a forward slash (/) or backslash (\) as the separator.</p>
         * </li>
         * <li><p>Each segment cannot contain <code>&lt;&gt;&quot;:|?*</code>.</p>
         * </li>
         * <li><p>The length of each segment ranges from 0 to 255.</p>
         * </li>
         * <li><p>The total length ranges from 0 to 32767.</p>
         * </li>
         * </ul>
         * <p>For example, if the user folder is <code>/home</code>, the file system performs automatic creation of the <code>/home/A</code> folder when user A performs logon. If <code>/home/A</code> already exists, this step is skipped.</p>
         * <blockquote>
         * <p>User A must have the permission to create folders. Otherwise, the <code>/home/A</code> folder cannot be created.</p>
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
         * <p>The Base64-encoded string of the keytab file content.</p>
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
         * <p>The MD5-encrypted string of the keytab file content.</p>
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
         * <p>Specifies whether to reject unencrypted clients.</p>
         * <ul>
         * <li><p>true: Unencrypted clients are rejected.</p>
         * </li>
         * <li><p>false (default): Unencrypted clients are not rejected.</p>
         * </li>
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
         * <p>The ID of the superuser. The ID must follow these rules:</p>
         * <ul>
         * <li><p>Must start with <code>S</code>, and no other letters are allowed after the initial S.</p>
         * </li>
         * <li><p>Must contain at least three hyphens (-) as separators.</p>
         * </li>
         * </ul>
         * <p>For example, <code>S-1-5-22</code> or <code>S-1-5-22-23</code>.</p>
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
