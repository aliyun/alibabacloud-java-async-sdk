// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The prevention mode. Valid values:
         * <p>
         * 
         * *   **block**: Interception Mode
         * *   **audit**: Alert Mode
         */
        public Builder defenceMode(String defenceMode) {
            this.putQueryParameter("DefenceMode", defenceMode);
            this.defenceMode = defenceMode;
            return this;
        }

        /**
         * The directory for which you want to enable web tamper proofing. Separate multiple directories with commas (,).
         */
        public Builder dir(String dir) {
            this.putQueryParameter("Dir", dir);
            this.dir = dir;
            return this;
        }

        /**
         * The directory for which you want to disable web tamper proofing.
         * <p>
         * 
         * > If you set **Mode** to **blacklist**, you must specify this parameter.
         */
        public Builder exclusiveDir(String exclusiveDir) {
            this.putQueryParameter("ExclusiveDir", exclusiveDir);
            this.exclusiveDir = exclusiveDir;
            return this;
        }

        /**
         * The file for which you want to disable web tamper proofing.
         * <p>
         * 
         * > If you set **Mode** to **blacklist**, you must specify this parameter.
         */
        public Builder exclusiveFile(String exclusiveFile) {
            this.putQueryParameter("ExclusiveFile", exclusiveFile);
            this.exclusiveFile = exclusiveFile;
            return this;
        }

        /**
         * The type of the file for which you want to disable web tamper proofing. Separate multiple types with semicolons (;). Valid values:
         * <p>
         * 
         * *   php
         * *   jsp
         * *   asp
         * *   aspx
         * *   js
         * *   cgi
         * *   html
         * *   htm
         * *   xml
         * *   shtml
         * *   shtm
         * *   jpg
         * *   gif
         * *   png
         * 
         * > If you set **Mode** to **blacklist**, you must specify this parameter.
         */
        public Builder exclusiveFileType(String exclusiveFileType) {
            this.putQueryParameter("ExclusiveFileType", exclusiveFileType);
            this.exclusiveFileType = exclusiveFileType;
            return this;
        }

        /**
         * The type of the file for which you want to enable web tamper proofing. Separate multiple types with semicolons (;). Valid values:
         * <p>
         * 
         * *   php
         * *   jsp
         * *   asp
         * *   aspx
         * *   js
         * *   cgi
         * *   html
         * *   htm
         * *   xml
         * *   shtml
         * *   shtm
         * *   jpg
         * *   gif
         * *   png
         * 
         * > If you set **Mode** to **whitelist**, you must specify this parameter.
         */
        public Builder inclusiveFileType(String inclusiveFileType) {
            this.putQueryParameter("InclusiveFileType", inclusiveFileType);
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }

        /**
         * The local path to the backup files of the protected directory.\
         * <p>
         * The directory format of a Linux server is different from that of a Windows server. You must enter the directory in the required format based on your operating system. Examples:
         * 
         * *   Linux server: /usr/local/aegis/bak
         * *   Windows server: C:\Program Files (x86)\Alibaba\Aegis\bak
         */
        public Builder localBackupDir(String localBackupDir) {
            this.putQueryParameter("LocalBackupDir", localBackupDir);
            this.localBackupDir = localBackupDir;
            return this;
        }

        /**
         * The protection mode of web tamper proofing. Valid values:
         * <p>
         * 
         * *   **whitelist**: In this mode, web tamper proofing is enabled for the specified directories and file types.
         * *   **blacklist**: In this mode, web tamper proofing is enabled for the unspecified subdirectories, file types, and files in the protected directory.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The UUID of the server for which you want to enable web tamper proofing.
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
