// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyWebLockStartRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockStartRequest</p>
 */
public class ModifyWebLockStartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenceMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExclusiveDir")
    private String exclusiveDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExclusiveFile")
    private String exclusiveFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExclusiveFileType")
    private String exclusiveFileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InclusiveFileType")
    private String inclusiveFileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalBackupDir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localBackupDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private ModifyWebLockStartRequest(Builder builder) {
        super(builder);
        this.defenceMode = builder.defenceMode;
        this.dir = builder.dir;
        this.exclusiveDir = builder.exclusiveDir;
        this.exclusiveFile = builder.exclusiveFile;
        this.exclusiveFileType = builder.exclusiveFileType;
        this.inclusiveFileType = builder.inclusiveFileType;
        this.localBackupDir = builder.localBackupDir;
        this.mode = builder.mode;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockStartRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenceMode
     */
    public String getDefenceMode() {
        return this.defenceMode;
    }

    /**
     * @return dir
     */
    public String getDir() {
        return this.dir;
    }

    /**
     * @return exclusiveDir
     */
    public String getExclusiveDir() {
        return this.exclusiveDir;
    }

    /**
     * @return exclusiveFile
     */
    public String getExclusiveFile() {
        return this.exclusiveFile;
    }

    /**
     * @return exclusiveFileType
     */
    public String getExclusiveFileType() {
        return this.exclusiveFileType;
    }

    /**
     * @return inclusiveFileType
     */
    public String getInclusiveFileType() {
        return this.inclusiveFileType;
    }

    /**
     * @return localBackupDir
     */
    public String getLocalBackupDir() {
        return this.localBackupDir;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyWebLockStartRequest, Builder> {
        private String defenceMode; 
        private String dir; 
        private String exclusiveDir; 
        private String exclusiveFile; 
        private String exclusiveFileType; 
        private String inclusiveFileType; 
        private String localBackupDir; 
        private String mode; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockStartRequest request) {
            super(request);
            this.defenceMode = request.defenceMode;
            this.dir = request.dir;
            this.exclusiveDir = request.exclusiveDir;
            this.exclusiveFile = request.exclusiveFile;
            this.exclusiveFileType = request.exclusiveFileType;
            this.inclusiveFileType = request.inclusiveFileType;
            this.localBackupDir = request.localBackupDir;
            this.mode = request.mode;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The defense mode. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: block</li>
         * <li><strong>audit</strong>: alert.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        public Builder defenceMode(String defenceMode) {
            this.putQueryParameter("DefenceMode", defenceMode);
            this.defenceMode = defenceMode;
            return this;
        }

        /**
         * <p>The protection directories. Separate multiple directories with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/tomcat</p>
         */
        public Builder dir(String dir) {
            this.putQueryParameter("Dir", dir);
            this.dir = dir;
            return this;
        }

        /**
         * <p>The folder that does not require web tamper proofing protection (excluded folder).</p>
         * <blockquote>
         * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to the <strong>blacklist</strong> pattern.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/java</p>
         */
        public Builder exclusiveDir(String exclusiveDir) {
            this.putQueryParameter("ExclusiveDir", exclusiveDir);
            this.exclusiveDir = exclusiveDir;
            return this;
        }

        /**
         * <p>The files that do not require web tamper proofing protection (excluded files).</p>
         * <blockquote>
         * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to the <strong>blacklist</strong> pattern.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/tomcat/localhost.log</p>
         */
        public Builder exclusiveFile(String exclusiveFile) {
            this.putQueryParameter("ExclusiveFile", exclusiveFile);
            this.exclusiveFile = exclusiveFile;
            return this;
        }

        /**
         * <p>The file types that do not require web tamper proofing protection (excluded file types). Separate multiple file types with commas (,). Valid values:</p>
         * <ul>
         * <li>php</li>
         * <li>jsp</li>
         * <li>asp</li>
         * <li>aspx</li>
         * <li>js</li>
         * <li>cgi</li>
         * <li>html</li>
         * <li>htm</li>
         * <li>xml</li>
         * <li>shtml</li>
         * <li>shtm</li>
         * <li>jpg</li>
         * <li>gif</li>
         * <li>png</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to the <strong>blacklist</strong> pattern.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        public Builder exclusiveFileType(String exclusiveFileType) {
            this.putQueryParameter("ExclusiveFileType", exclusiveFileType);
            this.exclusiveFileType = exclusiveFileType;
            return this;
        }

        /**
         * <p>The file types that require web tamper proofing protection. Separate multiple file types with commas (,). Valid values:</p>
         * <ul>
         * <li>php</li>
         * <li>jsp</li>
         * <li>asp</li>
         * <li>aspx</li>
         * <li>js</li>
         * <li>cgi</li>
         * <li>html</li>
         * <li>htm</li>
         * <li>xml</li>
         * <li>shtml</li>
         * <li>shtm</li>
         * <li>jpg</li>
         * <li>gif</li>
         * <li>png</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to the <strong>whitelist</strong> pattern.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>php</p>
         */
        public Builder inclusiveFileType(String inclusiveFileType) {
            this.putQueryParameter("InclusiveFileType", inclusiveFileType);
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }

        /**
         * <p>The local backup path used to back up the protection directories. The format of the protection directory path may differ between Linux servers and Windows servers. Make sure that you enter the path in the correct format. The following examples show the directory formats:</p>
         * <ul>
         * <li>Linux server: /usr/local/aegis/bak</li>
         * <li>Windows server: C:\Program Files (x86)\Alibaba\Aegis\bak.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/backup</p>
         */
        public Builder localBackupDir(String localBackupDir) {
            this.putQueryParameter("LocalBackupDir", localBackupDir);
            this.localBackupDir = localBackupDir;
            return this;
        }

        /**
         * <p>The protection type. Valid values:</p>
         * <ul>
         * <li><strong>whitelist</strong>: whitelist mode. Protects the specified protection directories and file types.</li>
         * <li><strong>blacklist</strong>: blacklist mode. Protects all subdirectories, file types, and specified files in the protection directories that are not excluded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>whitelist</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The UUID of the server that you want to protect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80d2f7d6-31a9-4d7f-8ff4-7ecc42f89ca****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockStartRequest build() {
            return new ModifyWebLockStartRequest(this);
        } 

    } 

}
