// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetUploadProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadProgressResponseBody</p>
 */
public class GetUploadProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadProgress")
    private UploadProgress uploadProgress;

    private GetUploadProgressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadProgress = builder.uploadProgress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadProgressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadProgress
     */
    public UploadProgress getUploadProgress() {
        return this.uploadProgress;
    }

    public static final class Builder {
        private String requestId; 
        private UploadProgress uploadProgress; 

        private Builder() {
        } 

        private Builder(GetUploadProgressResponseBody model) {
            this.requestId = model.requestId;
            this.uploadProgress = model.uploadProgress;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadProgress.
         */
        public Builder uploadProgress(UploadProgress uploadProgress) {
            this.uploadProgress = uploadProgress;
            return this;
        }

        public GetUploadProgressResponseBody build() {
            return new GetUploadProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUploadProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetUploadProgressResponseBody</p>
     */
    public static class UploadProgressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AuthInfo")
        private String authInfo;

        @com.aliyun.core.annotation.NameInMap("AuthTimestamp")
        private String authTimestamp;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("DonePartsCount")
        private Integer donePartsCount;

        @com.aliyun.core.annotation.NameInMap("FileCreateTime")
        private String fileCreateTime;

        @com.aliyun.core.annotation.NameInMap("FileHash")
        private String fileHash;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("PartSize")
        private Long partSize;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("TerminalType")
        private String terminalType;

        @com.aliyun.core.annotation.NameInMap("TotalPart")
        private String totalPart;

        @com.aliyun.core.annotation.NameInMap("UploadAddress")
        private String uploadAddress;

        @com.aliyun.core.annotation.NameInMap("UploadId")
        private String uploadId;

        @com.aliyun.core.annotation.NameInMap("UploadPoint")
        private String uploadPoint;

        @com.aliyun.core.annotation.NameInMap("UploadRatio")
        private Float uploadRatio;

        @com.aliyun.core.annotation.NameInMap("UploadSpeed")
        private Float uploadSpeed;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private UploadProgressList(Builder builder) {
            this.appVersion = builder.appVersion;
            this.authInfo = builder.authInfo;
            this.authTimestamp = builder.authTimestamp;
            this.businessType = builder.businessType;
            this.clientId = builder.clientId;
            this.deviceModel = builder.deviceModel;
            this.donePartsCount = builder.donePartsCount;
            this.fileCreateTime = builder.fileCreateTime;
            this.fileHash = builder.fileHash;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.partSize = builder.partSize;
            this.source = builder.source;
            this.terminalType = builder.terminalType;
            this.totalPart = builder.totalPart;
            this.uploadAddress = builder.uploadAddress;
            this.uploadId = builder.uploadId;
            this.uploadPoint = builder.uploadPoint;
            this.uploadRatio = builder.uploadRatio;
            this.uploadSpeed = builder.uploadSpeed;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadProgressList create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return authInfo
         */
        public String getAuthInfo() {
            return this.authInfo;
        }

        /**
         * @return authTimestamp
         */
        public String getAuthTimestamp() {
            return this.authTimestamp;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return donePartsCount
         */
        public Integer getDonePartsCount() {
            return this.donePartsCount;
        }

        /**
         * @return fileCreateTime
         */
        public String getFileCreateTime() {
            return this.fileCreateTime;
        }

        /**
         * @return fileHash
         */
        public String getFileHash() {
            return this.fileHash;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return partSize
         */
        public Long getPartSize() {
            return this.partSize;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return terminalType
         */
        public String getTerminalType() {
            return this.terminalType;
        }

        /**
         * @return totalPart
         */
        public String getTotalPart() {
            return this.totalPart;
        }

        /**
         * @return uploadAddress
         */
        public String getUploadAddress() {
            return this.uploadAddress;
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        /**
         * @return uploadPoint
         */
        public String getUploadPoint() {
            return this.uploadPoint;
        }

        /**
         * @return uploadRatio
         */
        public Float getUploadRatio() {
            return this.uploadRatio;
        }

        /**
         * @return uploadSpeed
         */
        public Float getUploadSpeed() {
            return this.uploadSpeed;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String appVersion; 
            private String authInfo; 
            private String authTimestamp; 
            private String businessType; 
            private String clientId; 
            private String deviceModel; 
            private Integer donePartsCount; 
            private String fileCreateTime; 
            private String fileHash; 
            private String fileName; 
            private Long fileSize; 
            private Long partSize; 
            private String source; 
            private String terminalType; 
            private String totalPart; 
            private String uploadAddress; 
            private String uploadId; 
            private String uploadPoint; 
            private Float uploadRatio; 
            private Float uploadSpeed; 
            private String videoId; 

            private Builder() {
            } 

            private Builder(UploadProgressList model) {
                this.appVersion = model.appVersion;
                this.authInfo = model.authInfo;
                this.authTimestamp = model.authTimestamp;
                this.businessType = model.businessType;
                this.clientId = model.clientId;
                this.deviceModel = model.deviceModel;
                this.donePartsCount = model.donePartsCount;
                this.fileCreateTime = model.fileCreateTime;
                this.fileHash = model.fileHash;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.partSize = model.partSize;
                this.source = model.source;
                this.terminalType = model.terminalType;
                this.totalPart = model.totalPart;
                this.uploadAddress = model.uploadAddress;
                this.uploadId = model.uploadId;
                this.uploadPoint = model.uploadPoint;
                this.uploadRatio = model.uploadRatio;
                this.uploadSpeed = model.uploadSpeed;
                this.videoId = model.videoId;
            } 

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * AuthInfo.
             */
            public Builder authInfo(String authInfo) {
                this.authInfo = authInfo;
                return this;
            }

            /**
             * AuthTimestamp.
             */
            public Builder authTimestamp(String authTimestamp) {
                this.authTimestamp = authTimestamp;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * DonePartsCount.
             */
            public Builder donePartsCount(Integer donePartsCount) {
                this.donePartsCount = donePartsCount;
                return this;
            }

            /**
             * FileCreateTime.
             */
            public Builder fileCreateTime(String fileCreateTime) {
                this.fileCreateTime = fileCreateTime;
                return this;
            }

            /**
             * FileHash.
             */
            public Builder fileHash(String fileHash) {
                this.fileHash = fileHash;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * PartSize.
             */
            public Builder partSize(Long partSize) {
                this.partSize = partSize;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * TerminalType.
             */
            public Builder terminalType(String terminalType) {
                this.terminalType = terminalType;
                return this;
            }

            /**
             * TotalPart.
             */
            public Builder totalPart(String totalPart) {
                this.totalPart = totalPart;
                return this;
            }

            /**
             * UploadAddress.
             */
            public Builder uploadAddress(String uploadAddress) {
                this.uploadAddress = uploadAddress;
                return this;
            }

            /**
             * UploadId.
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            /**
             * UploadPoint.
             */
            public Builder uploadPoint(String uploadPoint) {
                this.uploadPoint = uploadPoint;
                return this;
            }

            /**
             * UploadRatio.
             */
            public Builder uploadRatio(Float uploadRatio) {
                this.uploadRatio = uploadRatio;
                return this;
            }

            /**
             * UploadSpeed.
             */
            public Builder uploadSpeed(Float uploadSpeed) {
                this.uploadSpeed = uploadSpeed;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public UploadProgressList build() {
                return new UploadProgressList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUploadProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetUploadProgressResponseBody</p>
     */
    public static class UploadProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UploadProgressList")
        private java.util.List<UploadProgressList> uploadProgressList;

        private UploadProgress(Builder builder) {
            this.uploadProgressList = builder.uploadProgressList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadProgress create() {
            return builder().build();
        }

        /**
         * @return uploadProgressList
         */
        public java.util.List<UploadProgressList> getUploadProgressList() {
            return this.uploadProgressList;
        }

        public static final class Builder {
            private java.util.List<UploadProgressList> uploadProgressList; 

            private Builder() {
            } 

            private Builder(UploadProgress model) {
                this.uploadProgressList = model.uploadProgressList;
            } 

            /**
             * UploadProgressList.
             */
            public Builder uploadProgressList(java.util.List<UploadProgressList> uploadProgressList) {
                this.uploadProgressList = uploadProgressList;
                return this;
            }

            public UploadProgress build() {
                return new UploadProgress(this);
            } 

        } 

    }
}
