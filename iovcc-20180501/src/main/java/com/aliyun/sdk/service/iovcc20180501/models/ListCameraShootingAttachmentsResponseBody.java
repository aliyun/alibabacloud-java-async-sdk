// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCameraShootingAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCameraShootingAttachmentsResponseBody</p>
 */
public class ListCameraShootingAttachmentsResponseBody extends TeaModel {
    @NameInMap("Attachments")
    private java.util.List < Attachments> attachments;

    @NameInMap("RequestId")
    private String requestId;

    private ListCameraShootingAttachmentsResponseBody(Builder builder) {
        this.attachments = builder.attachments;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCameraShootingAttachmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return attachments
     */
    public java.util.List < Attachments> getAttachments() {
        return this.attachments;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Attachments> attachments; 
        private String requestId; 

        /**
         * Attachments.
         */
        public Builder attachments(java.util.List < Attachments> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCameraShootingAttachmentsResponseBody build() {
            return new ListCameraShootingAttachmentsResponseBody(this);
        } 

    } 

    public static class Attachments extends TeaModel {
        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("FileId")
        private String fileId;

        @NameInMap("FileLength")
        private Long fileLength;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileType")
        private Long fileType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ShootingTime")
        private Long shootingTime;

        private Attachments(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.fileId = builder.fileId;
            this.fileLength = builder.fileLength;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.id = builder.id;
            this.shootingTime = builder.shootingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileLength
         */
        public Long getFileLength() {
            return this.fileLength;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Long getFileType() {
            return this.fileType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return shootingTime
         */
        public Long getShootingTime() {
            return this.shootingTime;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String fileId; 
            private Long fileLength; 
            private String fileName; 
            private Long fileType; 
            private Long id; 
            private Long shootingTime; 

            /**
             * 附件地址
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * 文件id
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * 文件长度，单位为字节
             */
            public Builder fileLength(Long fileLength) {
                this.fileLength = fileLength;
                return this;
            }

            /**
             * 文件名
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 文件类型，0-图片，1-视频
             */
            public Builder fileType(Long fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * 主键id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 拍摄时间
             */
            public Builder shootingTime(Long shootingTime) {
                this.shootingTime = shootingTime;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
}
