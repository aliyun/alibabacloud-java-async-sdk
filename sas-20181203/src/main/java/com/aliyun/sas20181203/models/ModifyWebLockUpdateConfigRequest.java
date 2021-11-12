// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyWebLockUpdateConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockUpdateConfigRequest</p>
 */
public class ModifyWebLockUpdateConfigRequest extends Request {
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
    @NameInMap("Id")
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

    public static final class Builder extends Request.Builder {
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

        /**
         * <p>DefenceMode.</p>
         */
        public Builder defenceMode(String defenceMode) {
            this.putQueryParameter("DefenceMode", defenceMode);
            this.defenceMode = defenceMode;
            return this;
        }

        /**
         * <p>Dir.</p>
         */
        public Builder dir(String dir) {
            this.putQueryParameter("Dir", dir);
            this.dir = dir;
            return this;
        }

        /**
         * <p>ExclusiveDir.</p>
         */
        public Builder exclusiveDir(String exclusiveDir) {
            this.putQueryParameter("ExclusiveDir", exclusiveDir);
            this.exclusiveDir = exclusiveDir;
            return this;
        }

        /**
         * <p>ExclusiveFile.</p>
         */
        public Builder exclusiveFile(String exclusiveFile) {
            this.putQueryParameter("ExclusiveFile", exclusiveFile);
            this.exclusiveFile = exclusiveFile;
            return this;
        }

        /**
         * <p>ExclusiveFileType.</p>
         */
        public Builder exclusiveFileType(String exclusiveFileType) {
            this.putQueryParameter("ExclusiveFileType", exclusiveFileType);
            this.exclusiveFileType = exclusiveFileType;
            return this;
        }

        /**
         * <p>Id.</p>
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>InclusiveFile.</p>
         */
        public Builder inclusiveFile(String inclusiveFile) {
            this.putQueryParameter("InclusiveFile", inclusiveFile);
            this.inclusiveFile = inclusiveFile;
            return this;
        }

        /**
         * <p>InclusiveFileType.</p>
         */
        public Builder inclusiveFileType(String inclusiveFileType) {
            this.putQueryParameter("InclusiveFileType", inclusiveFileType);
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>LocalBackupDir.</p>
         */
        public Builder localBackupDir(String localBackupDir) {
            this.putQueryParameter("LocalBackupDir", localBackupDir);
            this.localBackupDir = localBackupDir;
            return this;
        }

        /**
         * <p>Mode.</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public ModifyWebLockUpdateConfigRequest build() {
            return new ModifyWebLockUpdateConfigRequest(this);
        } 

    } 

}
