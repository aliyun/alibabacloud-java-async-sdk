// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockUpdateConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockUpdateConfigRequest</p>
 */
public class ModifyWebLockUpdateConfigRequest extends Request {
    @Query
    @NameInMap("DefenceMode")
    @Validation(required = true)
    private String defenceMode;

    @Query
    @NameInMap("Dir")
    @Validation(required = true)
    private String dir;

    @Query
    @NameInMap("ExclusiveDir")
    private String exclusiveDir;

    @Query
    @NameInMap("ExclusiveFile")
    private String exclusiveFile;

    @Query
    @NameInMap("ExclusiveFileType")
    private String exclusiveFileType;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Integer id;

    @Query
    @NameInMap("InclusiveFile")
    private String inclusiveFile;

    @Query
    @NameInMap("InclusiveFileType")
    private String inclusiveFileType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LocalBackupDir")
    @Validation(required = true)
    private String localBackupDir;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
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
         * The directory for which you want to enable web tamper proofing.
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
         * The ID of the protected directory for which you want to change the status of web tamper proofing.
         * <p>
         * 
         * > You can call the [DescribeWebLockConfigList](~~DescribeWebLockConfigList~~) operation to query the IDs of protected directories.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The file for which you want to enable web tamper proofing.
         * <p>
         * 
         * > If you set **Mode** to **whitelist**, you must specify this parameter.
         */
        public Builder inclusiveFile(String inclusiveFile) {
            this.putQueryParameter("InclusiveFile", inclusiveFile);
            this.inclusiveFile = inclusiveFile;
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
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The UUID of the server on which the protected directory is located.
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
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
