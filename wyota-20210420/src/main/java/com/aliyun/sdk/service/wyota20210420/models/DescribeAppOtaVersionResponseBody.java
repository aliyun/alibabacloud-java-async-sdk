// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppOtaVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppOtaVersionResponseBody</p>
 */
public class DescribeAppOtaVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAppOtaVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppOtaVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppOtaVersionResponseBody build() {
            return new DescribeAppOtaVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppOtaVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppOtaVersionResponseBody</p>
     */
    public static class AppOtaInfoDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FullDownloadUrl")
        private String fullDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OtaType")
        private Integer otaType;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private Long versionCode;

        @com.aliyun.core.annotation.NameInMap("VersionType")
        private String versionType;

        @com.aliyun.core.annotation.NameInMap("VersionUid")
        private String versionUid;

        private AppOtaInfoDTOList(Builder builder) {
            this.appVersion = builder.appVersion;
            this.channel = builder.channel;
            this.downloadUrl = builder.downloadUrl;
            this.fullDownloadUrl = builder.fullDownloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.md5 = builder.md5;
            this.osType = builder.osType;
            this.otaType = builder.otaType;
            this.project = builder.project;
            this.protocolType = builder.protocolType;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.sessionType = builder.sessionType;
            this.size = builder.size;
            this.status = builder.status;
            this.versionCode = builder.versionCode;
            this.versionType = builder.versionType;
            this.versionUid = builder.versionUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppOtaInfoDTOList create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fullDownloadUrl
         */
        public String getFullDownloadUrl() {
            return this.fullDownloadUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
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
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
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
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return versionCode
         */
        public Long getVersionCode() {
            return this.versionCode;
        }

        /**
         * @return versionType
         */
        public String getVersionType() {
            return this.versionType;
        }

        /**
         * @return versionUid
         */
        public String getVersionUid() {
            return this.versionUid;
        }

        public static final class Builder {
            private String appVersion; 
            private String channel; 
            private String downloadUrl; 
            private String fullDownloadUrl; 
            private String gmtCreate; 
            private String md5; 
            private String osType; 
            private Integer otaType; 
            private String project; 
            private String protocolType; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private String sessionType; 
            private Long size; 
            private Integer status; 
            private Long versionCode; 
            private String versionType; 
            private String versionUid; 

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * FullDownloadUrl.
             */
            public Builder fullDownloadUrl(String fullDownloadUrl) {
                this.fullDownloadUrl = fullDownloadUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * OtaType.
             */
            public Builder otaType(Integer otaType) {
                this.otaType = otaType;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * ReleaseNoteEn.
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * SessionType.
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(Long versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * VersionType.
             */
            public Builder versionType(String versionType) {
                this.versionType = versionType;
                return this;
            }

            /**
             * VersionUid.
             */
            public Builder versionUid(String versionUid) {
                this.versionUid = versionUid;
                return this;
            }

            public AppOtaInfoDTOList build() {
                return new AppOtaInfoDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppOtaVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppOtaVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppOtaInfoDTOList")
        private java.util.List < AppOtaInfoDTOList> appOtaInfoDTOList;

        private Data(Builder builder) {
            this.appOtaInfoDTOList = builder.appOtaInfoDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appOtaInfoDTOList
         */
        public java.util.List < AppOtaInfoDTOList> getAppOtaInfoDTOList() {
            return this.appOtaInfoDTOList;
        }

        public static final class Builder {
            private java.util.List < AppOtaInfoDTOList> appOtaInfoDTOList; 

            /**
             * AppOtaInfoDTOList.
             */
            public Builder appOtaInfoDTOList(java.util.List < AppOtaInfoDTOList> appOtaInfoDTOList) {
                this.appOtaInfoDTOList = appOtaInfoDTOList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
