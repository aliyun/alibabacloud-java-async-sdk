// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppOtaVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateAppOtaVersionRequest</p>
 */
public class CreateAppOtaVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arch")
    private String arch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5")
    private String md5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtaType")
    private Integer otaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseNote")
    private String releaseNote;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
    private String releaseNoteEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseNoteJp")
    private String releaseNoteJp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Long size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotRegionId")
    private String snapshotRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionType")
    private String versionType;

    private CreateAppOtaVersionRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.arch = builder.arch;
        this.channel = builder.channel;
        this.clientType = builder.clientType;
        this.creator = builder.creator;
        this.downloadUrl = builder.downloadUrl;
        this.md5 = builder.md5;
        this.os = builder.os;
        this.osType = builder.osType;
        this.otaType = builder.otaType;
        this.project = builder.project;
        this.releaseNote = builder.releaseNote;
        this.releaseNoteEn = builder.releaseNoteEn;
        this.releaseNoteJp = builder.releaseNoteJp;
        this.size = builder.size;
        this.snapshotId = builder.snapshotId;
        this.snapshotRegionId = builder.snapshotRegionId;
        this.status = builder.status;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppOtaVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return arch
     */
    public String getArch() {
        return this.arch;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return otaType
     */
    public Integer getOtaType() {
        return this.otaType;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return releaseNote
     */
    public String getReleaseNote() {
        return this.releaseNote;
    }

    /**
     * @return releaseNoteEn
     */
    public String getReleaseNoteEn() {
        return this.releaseNoteEn;
    }

    /**
     * @return releaseNoteJp
     */
    public String getReleaseNoteJp() {
        return this.releaseNoteJp;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return snapshotRegionId
     */
    public String getSnapshotRegionId() {
        return this.snapshotRegionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return versionType
     */
    public String getVersionType() {
        return this.versionType;
    }

    public static final class Builder extends Request.Builder<CreateAppOtaVersionRequest, Builder> {
        private String appVersion; 
        private String arch; 
        private String channel; 
        private Integer clientType; 
        private String creator; 
        private String downloadUrl; 
        private String md5; 
        private String os; 
        private String osType; 
        private Integer otaType; 
        private String project; 
        private String releaseNote; 
        private String releaseNoteEn; 
        private String releaseNoteJp; 
        private Long size; 
        private String snapshotId; 
        private String snapshotRegionId; 
        private Integer status; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppOtaVersionRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.arch = request.arch;
            this.channel = request.channel;
            this.clientType = request.clientType;
            this.creator = request.creator;
            this.downloadUrl = request.downloadUrl;
            this.md5 = request.md5;
            this.os = request.os;
            this.osType = request.osType;
            this.otaType = request.otaType;
            this.project = request.project;
            this.releaseNote = request.releaseNote;
            this.releaseNoteEn = request.releaseNoteEn;
            this.releaseNoteJp = request.releaseNoteJp;
            this.size = request.size;
            this.snapshotId = request.snapshotId;
            this.snapshotRegionId = request.snapshotRegionId;
            this.status = request.status;
            this.versionType = request.versionType;
        } 

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * Arch.
         */
        public Builder arch(String arch) {
            this.putQueryParameter("Arch", arch);
            this.arch = arch;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putQueryParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * Md5.
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * OtaType.
         */
        public Builder otaType(Integer otaType) {
            this.putQueryParameter("OtaType", otaType);
            this.otaType = otaType;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * ReleaseNote.
         */
        public Builder releaseNote(String releaseNote) {
            this.putQueryParameter("ReleaseNote", releaseNote);
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * ReleaseNoteEn.
         */
        public Builder releaseNoteEn(String releaseNoteEn) {
            this.putQueryParameter("ReleaseNoteEn", releaseNoteEn);
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }

        /**
         * ReleaseNoteJp.
         */
        public Builder releaseNoteJp(String releaseNoteJp) {
            this.putQueryParameter("ReleaseNoteJp", releaseNoteJp);
            this.releaseNoteJp = releaseNoteJp;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * SnapshotRegionId.
         */
        public Builder snapshotRegionId(String snapshotRegionId) {
            this.putQueryParameter("SnapshotRegionId", snapshotRegionId);
            this.snapshotRegionId = snapshotRegionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VersionType.
         */
        public Builder versionType(String versionType) {
            this.putQueryParameter("VersionType", versionType);
            this.versionType = versionType;
            return this;
        }

        @Override
        public CreateAppOtaVersionRequest build() {
            return new CreateAppOtaVersionRequest(this);
        } 

    } 

}
