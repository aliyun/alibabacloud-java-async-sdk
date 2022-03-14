// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockCreateConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockCreateConfigRequest</p>
 */
public class ModifyWebLockCreateConfigRequest extends Request {
    @Query
    @NameInMap("DefenceMode")
    private String defenceMode;

    @Query
    @NameInMap("Dir")
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
    private String localBackupDir;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private ModifyWebLockCreateConfigRequest(Builder builder) {
        super(builder);
        this.defenceMode = builder.defenceMode;
        this.dir = builder.dir;
        this.exclusiveDir = builder.exclusiveDir;
        this.exclusiveFile = builder.exclusiveFile;
        this.exclusiveFileType = builder.exclusiveFileType;
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

    public static ModifyWebLockCreateConfigRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyWebLockCreateConfigRequest, Builder> {
        private String defenceMode; 
        private String dir; 
        private String exclusiveDir; 
        private String exclusiveFile; 
        private String exclusiveFileType; 
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

        private Builder(ModifyWebLockCreateConfigRequest request) {
            super(request);
            this.defenceMode = request.defenceMode;
            this.dir = request.dir;
            this.exclusiveDir = request.exclusiveDir;
            this.exclusiveFile = request.exclusiveFile;
            this.exclusiveFileType = request.exclusiveFileType;
            this.inclusiveFile = request.inclusiveFile;
            this.inclusiveFileType = request.inclusiveFileType;
            this.lang = request.lang;
            this.localBackupDir = request.localBackupDir;
            this.mode = request.mode;
            this.sourceIp = request.sourceIp;
            this.uuid = request.uuid;
        } 

        /**
         * DefenceMode.
         */
        public Builder defenceMode(String defenceMode) {
            this.putQueryParameter("DefenceMode", defenceMode);
            this.defenceMode = defenceMode;
            return this;
        }

        /**
         * Dir.
         */
        public Builder dir(String dir) {
            this.putQueryParameter("Dir", dir);
            this.dir = dir;
            return this;
        }

        /**
         * ExclusiveDir.
         */
        public Builder exclusiveDir(String exclusiveDir) {
            this.putQueryParameter("ExclusiveDir", exclusiveDir);
            this.exclusiveDir = exclusiveDir;
            return this;
        }

        /**
         * ExclusiveFile.
         */
        public Builder exclusiveFile(String exclusiveFile) {
            this.putQueryParameter("ExclusiveFile", exclusiveFile);
            this.exclusiveFile = exclusiveFile;
            return this;
        }

        /**
         * ExclusiveFileType.
         */
        public Builder exclusiveFileType(String exclusiveFileType) {
            this.putQueryParameter("ExclusiveFileType", exclusiveFileType);
            this.exclusiveFileType = exclusiveFileType;
            return this;
        }

        /**
         * InclusiveFile.
         */
        public Builder inclusiveFile(String inclusiveFile) {
            this.putQueryParameter("InclusiveFile", inclusiveFile);
            this.inclusiveFile = inclusiveFile;
            return this;
        }

        /**
         * InclusiveFileType.
         */
        public Builder inclusiveFileType(String inclusiveFileType) {
            this.putQueryParameter("InclusiveFileType", inclusiveFileType);
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LocalBackupDir.
         */
        public Builder localBackupDir(String localBackupDir) {
            this.putQueryParameter("LocalBackupDir", localBackupDir);
            this.localBackupDir = localBackupDir;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockCreateConfigRequest build() {
            return new ModifyWebLockCreateConfigRequest(this);
        } 

    } 

}
