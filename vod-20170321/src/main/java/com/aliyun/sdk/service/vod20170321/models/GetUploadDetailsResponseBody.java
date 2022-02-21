// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadDetailsResponseBody</p>
 */
public class GetUploadDetailsResponseBody extends TeaModel {
    @NameInMap("ForbiddenMediaIds")
    private java.util.List < String > forbiddenMediaIds;

    @NameInMap("NonExistMediaIds")
    private java.util.List < String > nonExistMediaIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadDetails")
    private java.util.List < UploadDetails> uploadDetails;

    private GetUploadDetailsResponseBody(Builder builder) {
        this.forbiddenMediaIds = builder.forbiddenMediaIds;
        this.nonExistMediaIds = builder.nonExistMediaIds;
        this.requestId = builder.requestId;
        this.uploadDetails = builder.uploadDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return forbiddenMediaIds
     */
    public java.util.List < String > getForbiddenMediaIds() {
        return this.forbiddenMediaIds;
    }

    /**
     * @return nonExistMediaIds
     */
    public java.util.List < String > getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadDetails
     */
    public java.util.List < UploadDetails> getUploadDetails() {
        return this.uploadDetails;
    }

    public static final class Builder {
        private java.util.List < String > forbiddenMediaIds; 
        private java.util.List < String > nonExistMediaIds; 
        private String requestId; 
        private java.util.List < UploadDetails> uploadDetails; 

        /**
         * ForbiddenMediaIds.
         */
        public Builder forbiddenMediaIds(java.util.List < String > forbiddenMediaIds) {
            this.forbiddenMediaIds = forbiddenMediaIds;
            return this;
        }

        /**
         * NonExistMediaIds.
         */
        public Builder nonExistMediaIds(java.util.List < String > nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadDetails.
         */
        public Builder uploadDetails(java.util.List < UploadDetails> uploadDetails) {
            this.uploadDetails = uploadDetails;
            return this;
        }

        public GetUploadDetailsResponseBody build() {
            return new GetUploadDetailsResponseBody(this);
        } 

    } 

    public static class UploadDetails extends TeaModel {
        @NameInMap("CompletionTime")
        private String completionTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("UploadIP")
        private String uploadIP;

        @NameInMap("UploadRatio")
        private Float uploadRatio;

        @NameInMap("UploadSize")
        private Long uploadSize;

        @NameInMap("UploadSource")
        private String uploadSource;

        @NameInMap("UploadStatus")
        private String uploadStatus;

        private UploadDetails(Builder builder) {
            this.completionTime = builder.completionTime;
            this.creationTime = builder.creationTime;
            this.deviceModel = builder.deviceModel;
            this.fileSize = builder.fileSize;
            this.mediaId = builder.mediaId;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.title = builder.title;
            this.uploadIP = builder.uploadIP;
            this.uploadRatio = builder.uploadRatio;
            this.uploadSize = builder.uploadSize;
            this.uploadSource = builder.uploadSource;
            this.uploadStatus = builder.uploadStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadDetails create() {
            return builder().build();
        }

        /**
         * @return completionTime
         */
        public String getCompletionTime() {
            return this.completionTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return uploadIP
         */
        public String getUploadIP() {
            return this.uploadIP;
        }

        /**
         * @return uploadRatio
         */
        public Float getUploadRatio() {
            return this.uploadRatio;
        }

        /**
         * @return uploadSize
         */
        public Long getUploadSize() {
            return this.uploadSize;
        }

        /**
         * @return uploadSource
         */
        public String getUploadSource() {
            return this.uploadSource;
        }

        /**
         * @return uploadStatus
         */
        public String getUploadStatus() {
            return this.uploadStatus;
        }

        public static final class Builder {
            private String completionTime; 
            private String creationTime; 
            private String deviceModel; 
            private Long fileSize; 
            private String mediaId; 
            private String modificationTime; 
            private String status; 
            private String title; 
            private String uploadIP; 
            private Float uploadRatio; 
            private Long uploadSize; 
            private String uploadSource; 
            private String uploadStatus; 

            /**
             * CompletionTime.
             */
            public Builder completionTime(String completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UploadIP.
             */
            public Builder uploadIP(String uploadIP) {
                this.uploadIP = uploadIP;
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
             * UploadSize.
             */
            public Builder uploadSize(Long uploadSize) {
                this.uploadSize = uploadSize;
                return this;
            }

            /**
             * UploadSource.
             */
            public Builder uploadSource(String uploadSource) {
                this.uploadSource = uploadSource;
                return this;
            }

            /**
             * UploadStatus.
             */
            public Builder uploadStatus(String uploadStatus) {
                this.uploadStatus = uploadStatus;
                return this;
            }

            public UploadDetails build() {
                return new UploadDetails(this);
            } 

        } 

    }
}
