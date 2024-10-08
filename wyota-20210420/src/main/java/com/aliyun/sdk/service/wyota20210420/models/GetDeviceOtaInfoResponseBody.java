// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceOtaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceOtaInfoResponseBody</p>
 */
public class GetDeviceOtaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceOtaInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOtaInfoResponseBody create() {
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

        public GetDeviceOtaInfoResponseBody build() {
            return new GetDeviceOtaInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceOtaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceOtaInfoResponseBody</p>
     */
    public static class Version extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidHorizontalMultiCnImageDownloadUrl")
        private String androidHorizontalMultiCnImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidHorizontalMultiEnImageDownloadUrl")
        private String androidHorizontalMultiEnImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidVerticalMultiCnImageDownloadUrl")
        private String androidVerticalMultiCnImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("AndroidVerticalMultiEnImageDownloadUrl")
        private String androidVerticalMultiEnImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("CnImageDownloadUrl")
        private String cnImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CustomForceUpgrade")
        private Boolean customForceUpgrade;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("EnImageDownloadUrl")
        private String enImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ForceUpgrade")
        private Integer forceUpgrade;

        @com.aliyun.core.annotation.NameInMap("IsAppDownloadUrl")
        private Boolean isAppDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("LocalDownloadUrl")
        private String localDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("MultiCnImageDownloadUrl")
        private String multiCnImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("MultiEnImageDownloadUrl")
        private String multiEnImageDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        @com.aliyun.core.annotation.NameInMap("VersionType")
        private String versionType;

        private Version(Builder builder) {
            this.androidHorizontalMultiCnImageDownloadUrl = builder.androidHorizontalMultiCnImageDownloadUrl;
            this.androidHorizontalMultiEnImageDownloadUrl = builder.androidHorizontalMultiEnImageDownloadUrl;
            this.androidVerticalMultiCnImageDownloadUrl = builder.androidVerticalMultiCnImageDownloadUrl;
            this.androidVerticalMultiEnImageDownloadUrl = builder.androidVerticalMultiEnImageDownloadUrl;
            this.cnImageDownloadUrl = builder.cnImageDownloadUrl;
            this.creator = builder.creator;
            this.customForceUpgrade = builder.customForceUpgrade;
            this.downloadUrl = builder.downloadUrl;
            this.enImageDownloadUrl = builder.enImageDownloadUrl;
            this.forceUpgrade = builder.forceUpgrade;
            this.isAppDownloadUrl = builder.isAppDownloadUrl;
            this.localDownloadUrl = builder.localDownloadUrl;
            this.md5 = builder.md5;
            this.model = builder.model;
            this.multiCnImageDownloadUrl = builder.multiCnImageDownloadUrl;
            this.multiEnImageDownloadUrl = builder.multiEnImageDownloadUrl;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.size = builder.size;
            this.version = builder.version;
            this.versionCode = builder.versionCode;
            this.versionType = builder.versionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Version create() {
            return builder().build();
        }

        /**
         * @return androidHorizontalMultiCnImageDownloadUrl
         */
        public String getAndroidHorizontalMultiCnImageDownloadUrl() {
            return this.androidHorizontalMultiCnImageDownloadUrl;
        }

        /**
         * @return androidHorizontalMultiEnImageDownloadUrl
         */
        public String getAndroidHorizontalMultiEnImageDownloadUrl() {
            return this.androidHorizontalMultiEnImageDownloadUrl;
        }

        /**
         * @return androidVerticalMultiCnImageDownloadUrl
         */
        public String getAndroidVerticalMultiCnImageDownloadUrl() {
            return this.androidVerticalMultiCnImageDownloadUrl;
        }

        /**
         * @return androidVerticalMultiEnImageDownloadUrl
         */
        public String getAndroidVerticalMultiEnImageDownloadUrl() {
            return this.androidVerticalMultiEnImageDownloadUrl;
        }

        /**
         * @return cnImageDownloadUrl
         */
        public String getCnImageDownloadUrl() {
            return this.cnImageDownloadUrl;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return customForceUpgrade
         */
        public Boolean getCustomForceUpgrade() {
            return this.customForceUpgrade;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return enImageDownloadUrl
         */
        public String getEnImageDownloadUrl() {
            return this.enImageDownloadUrl;
        }

        /**
         * @return forceUpgrade
         */
        public Integer getForceUpgrade() {
            return this.forceUpgrade;
        }

        /**
         * @return isAppDownloadUrl
         */
        public Boolean getIsAppDownloadUrl() {
            return this.isAppDownloadUrl;
        }

        /**
         * @return localDownloadUrl
         */
        public String getLocalDownloadUrl() {
            return this.localDownloadUrl;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return multiCnImageDownloadUrl
         */
        public String getMultiCnImageDownloadUrl() {
            return this.multiCnImageDownloadUrl;
        }

        /**
         * @return multiEnImageDownloadUrl
         */
        public String getMultiEnImageDownloadUrl() {
            return this.multiEnImageDownloadUrl;
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
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        /**
         * @return versionType
         */
        public String getVersionType() {
            return this.versionType;
        }

        public static final class Builder {
            private String androidHorizontalMultiCnImageDownloadUrl; 
            private String androidHorizontalMultiEnImageDownloadUrl; 
            private String androidVerticalMultiCnImageDownloadUrl; 
            private String androidVerticalMultiEnImageDownloadUrl; 
            private String cnImageDownloadUrl; 
            private String creator; 
            private Boolean customForceUpgrade; 
            private String downloadUrl; 
            private String enImageDownloadUrl; 
            private Integer forceUpgrade; 
            private Boolean isAppDownloadUrl; 
            private String localDownloadUrl; 
            private String md5; 
            private String model; 
            private String multiCnImageDownloadUrl; 
            private String multiEnImageDownloadUrl; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private Long size; 
            private String version; 
            private String versionCode; 
            private String versionType; 

            /**
             * AndroidHorizontalMultiCnImageDownloadUrl.
             */
            public Builder androidHorizontalMultiCnImageDownloadUrl(String androidHorizontalMultiCnImageDownloadUrl) {
                this.androidHorizontalMultiCnImageDownloadUrl = androidHorizontalMultiCnImageDownloadUrl;
                return this;
            }

            /**
             * AndroidHorizontalMultiEnImageDownloadUrl.
             */
            public Builder androidHorizontalMultiEnImageDownloadUrl(String androidHorizontalMultiEnImageDownloadUrl) {
                this.androidHorizontalMultiEnImageDownloadUrl = androidHorizontalMultiEnImageDownloadUrl;
                return this;
            }

            /**
             * AndroidVerticalMultiCnImageDownloadUrl.
             */
            public Builder androidVerticalMultiCnImageDownloadUrl(String androidVerticalMultiCnImageDownloadUrl) {
                this.androidVerticalMultiCnImageDownloadUrl = androidVerticalMultiCnImageDownloadUrl;
                return this;
            }

            /**
             * AndroidVerticalMultiEnImageDownloadUrl.
             */
            public Builder androidVerticalMultiEnImageDownloadUrl(String androidVerticalMultiEnImageDownloadUrl) {
                this.androidVerticalMultiEnImageDownloadUrl = androidVerticalMultiEnImageDownloadUrl;
                return this;
            }

            /**
             * CnImageDownloadUrl.
             */
            public Builder cnImageDownloadUrl(String cnImageDownloadUrl) {
                this.cnImageDownloadUrl = cnImageDownloadUrl;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CustomForceUpgrade.
             */
            public Builder customForceUpgrade(Boolean customForceUpgrade) {
                this.customForceUpgrade = customForceUpgrade;
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
             * EnImageDownloadUrl.
             */
            public Builder enImageDownloadUrl(String enImageDownloadUrl) {
                this.enImageDownloadUrl = enImageDownloadUrl;
                return this;
            }

            /**
             * ForceUpgrade.
             */
            public Builder forceUpgrade(Integer forceUpgrade) {
                this.forceUpgrade = forceUpgrade;
                return this;
            }

            /**
             * IsAppDownloadUrl.
             */
            public Builder isAppDownloadUrl(Boolean isAppDownloadUrl) {
                this.isAppDownloadUrl = isAppDownloadUrl;
                return this;
            }

            /**
             * LocalDownloadUrl.
             */
            public Builder localDownloadUrl(String localDownloadUrl) {
                this.localDownloadUrl = localDownloadUrl;
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
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * MultiCnImageDownloadUrl.
             */
            public Builder multiCnImageDownloadUrl(String multiCnImageDownloadUrl) {
                this.multiCnImageDownloadUrl = multiCnImageDownloadUrl;
                return this;
            }

            /**
             * MultiEnImageDownloadUrl.
             */
            public Builder multiEnImageDownloadUrl(String multiEnImageDownloadUrl) {
                this.multiEnImageDownloadUrl = multiEnImageDownloadUrl;
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
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
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

            public Version build() {
                return new Version(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeviceOtaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceOtaInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Version")
        private Version version;

        private Data(Builder builder) {
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return version
         */
        public Version getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Version version; 

            /**
             * Version.
             */
            public Builder version(Version version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
