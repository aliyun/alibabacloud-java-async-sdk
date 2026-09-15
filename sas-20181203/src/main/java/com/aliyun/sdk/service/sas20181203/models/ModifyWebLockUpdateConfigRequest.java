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
 * {@link ModifyWebLockUpdateConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockUpdateConfigRequest</p>
 */
public class ModifyWebLockUpdateConfigRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InclusiveFile")
    private String inclusiveFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InclusiveFileType")
    private String inclusiveFileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalBackupDir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localBackupDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private ModifyWebLockUpdateConfigRequest(Builder builder) {
        super(builder);
        this.defenceMode = builder.defenceMode;
        this.dir = builder.dir;
        this.exclusiveDir = builder.exclusiveDir;
        this.exclusiveFile = builder.exclusiveFile;
        this.exclusiveFileType = builder.exclusiveFileType;
        this.id = builder.id;
        this.inclusiveFile = builder.inclusiveFile;
        this.inclusiveFileType = builder.inclusiveFileType;
        this.lang = builder.lang;
        this.localBackupDir = builder.localBackupDir;
        this.mode = builder.mode;
        this.sourceIp = builder.sourceIp;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockUpdateConfigRequest create() {
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
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return inclusiveFile
     */
    public String getInclusiveFile() {
        return this.inclusiveFile;
    }

    /**
     * @return inclusiveFileType
     */
    public String getInclusiveFileType() {
        return this.inclusiveFileType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyWebLockUpdateConfigRequest, Builder> {
        private String defenceMode; 
        private String dir; 
        private String exclusiveDir; 
        private String exclusiveFile; 
        private String exclusiveFileType; 
        private Integer id; 
        private String inclusiveFile; 
        private String inclusiveFileType; 
        private String lang; 
        private String localBackupDir; 
        private String mode; 
        private String sourceIp; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockUpdateConfigRequest request) {
            super(request);
            this.defenceMode = request.defenceMode;
            this.dir = request.dir;
            this.exclusiveDir = request.exclusiveDir;
            this.exclusiveFile = request.exclusiveFile;
            this.exclusiveFileType = request.exclusiveFileType;
            this.id = request.id;
            this.inclusiveFile = request.inclusiveFile;
            this.inclusiveFileType = request.inclusiveFileType;
            this.lang = request.lang;
            this.localBackupDir = request.localBackupDir;
            this.mode = request.mode;
            this.sourceIp = request.sourceIp;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The defense mode. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Block.</li>
         * <li><strong>audit</strong>: Alert.</li>
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
         * <p>The full path of the directory that you want to protect.</p>
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
         * <p>The directory that does not require web tamper-proofing protection (excluded directory).</p>
         * <blockquote>
         * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>blacklist</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/test</p>
         */
        public Builder exclusiveDir(String exclusiveDir) {
            this.putQueryParameter("ExclusiveDir", exclusiveDir);
            this.exclusiveDir = exclusiveDir;
            return this;
        }

        /**
         * <p>The file that does not require web tamper-proofing protection (excluded file).</p>
         * <blockquote>
         * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>blacklist</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/apache.log</p>
         */
        public Builder exclusiveFile(String exclusiveFile) {
            this.putQueryParameter("ExclusiveFile", exclusiveFile);
            this.exclusiveFile = exclusiveFile;
            return this;
        }

        /**
         * <p>The file types that do not require web tamper-proofing protection (excluded file types). Separate multiple file types with semicolons (;). Valid values:</p>
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
         * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>blacklist</strong>.</p>
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
         * <p>The ID of the protected directory configuration that you want to modify.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeWebLockConfigList~~">DescribeWebLockConfigList</a> operation to obtain the ID of the protected directory.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>312077</p>
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The file that requires protection.</p>
         * <blockquote>
         * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>whitelist</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/test.log</p>
         */
        public Builder inclusiveFile(String inclusiveFile) {
            this.putQueryParameter("InclusiveFile", inclusiveFile);
            this.inclusiveFile = inclusiveFile;
            return this;
        }

        /**
         * <p>The file types that require web tamper-proofing protection. Separate multiple file types with semicolons (;). Valid values:</p>
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
         * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>whitelist</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        public Builder inclusiveFileType(String inclusiveFileType) {
            this.putQueryParameter("InclusiveFileType", inclusiveFileType);
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The local backup path for securely backing up the protected directory.<br>The format of the directory path may differ between Linux servers and Windows servers. Make sure that you enter the correct format. Refer to the following directory formats:</p>
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
         * <p>The protection pattern. Valid values:</p>
         * <ul>
         * <li><strong>whitelist</strong>: whitelist mode. Protects only the specified directories and file types.</li>
         * <li><strong>blacklist</strong>: blacklist mode. Protects all subdirectories, file types, and files under the specified directory except those that are excluded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blacklist</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>36.112.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The UUID of the server whose protected directory you want to modify.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockUpdateConfigRequest build() {
            return new ModifyWebLockUpdateConfigRequest(this);
        } 

    } 

}
