// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUploadDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadDetailsResponseBody</p>
 */
public class GetUploadDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenMediaIds")
    private java.util.List < String > forbiddenMediaIds;

    @com.aliyun.core.annotation.NameInMap("NonExistMediaIds")
    private java.util.List < String > nonExistMediaIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadDetails")
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
         * <p>The IDs of the media files that cannot be accessed.</p>
         */
        public Builder forbiddenMediaIds(java.util.List < String > forbiddenMediaIds) {
            this.forbiddenMediaIds = forbiddenMediaIds;
            return this;
        }

        /**
         * <p>The IDs of the media files that do not exist.</p>
         */
        public Builder nonExistMediaIds(java.util.List < String > nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9E290613-04F4-47F4-795D30732077****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The upload details.</p>
         */
        public Builder uploadDetails(java.util.List < UploadDetails> uploadDetails) {
            this.uploadDetails = uploadDetails;
            return this;
        }

        public GetUploadDetailsResponseBody build() {
            return new GetUploadDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUploadDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetUploadDetailsResponseBody</p>
     */
    public static class UploadDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletionTime")
        private String completionTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UploadIP")
        private String uploadIP;

        @com.aliyun.core.annotation.NameInMap("UploadRatio")
        private Float uploadRatio;

        @com.aliyun.core.annotation.NameInMap("UploadSize")
        private Long uploadSize;

        @com.aliyun.core.annotation.NameInMap("UploadSource")
        private String uploadSource;

        @com.aliyun.core.annotation.NameInMap("UploadStatus")
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
             * <p>The time when the upload job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-28T09:45:07Z</p>
             */
            public Builder completionTime(String completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * <p>The time when the upload job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-28T09:42:07Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The device model.</p>
             * 
             * <strong>example:</strong>
             * <p>Chrome</p>
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * <p>The size of the uploaded file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>46</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The ID of the uploaded audio or video.</p>
             * 
             * <strong>example:</strong>
             * <p>61ccbdb06fa83012be4d8083f6****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The time when the information about the media file was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-28T09:43:12Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The status of the video. For more information about the valid values and value description of the parameter, see the &quot;Status: the status of a video&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Uploading</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>Test details</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The IP address of the server that uploads the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder uploadIP(String uploadIP) {
                this.uploadIP = uploadIP;
                return this;
            }

            /**
             * <p>The upload ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>0.038</p>
             */
            public Builder uploadRatio(Float uploadRatio) {
                this.uploadRatio = uploadRatio;
                return this;
            }

            /**
             * <p>The upload size. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>346</p>
             */
            public Builder uploadSize(Long uploadSize) {
                this.uploadSize = uploadSize;
                return this;
            }

            /**
             * <p>The method that is used to upload the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>WebSDK</p>
             */
            public Builder uploadSource(String uploadSource) {
                this.uploadSource = uploadSource;
                return this;
            }

            /**
             * <p>The status of the upload job. For more information about the valid values and value description of the parameter, see the &quot;Status: the status of a URL-based upload job&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Uploading</p>
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
