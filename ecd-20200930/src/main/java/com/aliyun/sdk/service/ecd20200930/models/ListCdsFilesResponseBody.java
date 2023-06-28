// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCdsFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCdsFilesResponseBody</p>
 */
public class ListCdsFilesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private String count;

    @NameInMap("FileModels")
    private java.util.List < FileModels> fileModels;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCdsFilesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.fileModels = builder.fileModels;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCdsFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return fileModels
     */
    public java.util.List < FileModels> getFileModels() {
        return this.fileModels;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String count; 
        private java.util.List < FileModels> fileModels; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        /**
         * The result of the operation. A value of success indicates that the operation is successful. If the operation failed, an error message is returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * The files.
         */
        public Builder fileModels(java.util.List < FileModels> fileModels) {
            this.fileModels = fileModels;
            return this;
        }

        /**
         * The error message returned if the request failed. This parameter is empty if the value of Code is success.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The token used for the next query. If this parameter is empty, all results have been returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID. An ID is the unique identifier of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCdsFilesResponseBody build() {
            return new ListCdsFilesResponseBody(this);
        } 

    } 

    public static class FileModels extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Description")
        private String description;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("FileExtension")
        private String fileExtension;

        @NameInMap("FileId")
        private String fileId;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("Name")
        private String name;

        @NameInMap("OpenTime")
        private String openTime;

        @NameInMap("OpenTimeStamp")
        private Long openTimeStamp;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Sha1")
        private String sha1;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Thumbnail")
        private String thumbnail;

        private FileModels(Builder builder) {
            this.category = builder.category;
            this.contentType = builder.contentType;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.downloadUrl = builder.downloadUrl;
            this.fileExtension = builder.fileExtension;
            this.fileId = builder.fileId;
            this.filePath = builder.filePath;
            this.fileType = builder.fileType;
            this.md5 = builder.md5;
            this.modifiedTime = builder.modifiedTime;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.openTime = builder.openTime;
            this.openTimeStamp = builder.openTimeStamp;
            this.parentId = builder.parentId;
            this.regionId = builder.regionId;
            this.sha1 = builder.sha1;
            this.size = builder.size;
            this.thumbnail = builder.thumbnail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileModels create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileExtension
         */
        public String getFileExtension() {
            return this.fileExtension;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return openTime
         */
        public String getOpenTime() {
            return this.openTime;
        }

        /**
         * @return openTimeStamp
         */
        public Long getOpenTimeStamp() {
            return this.openTimeStamp;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sha1
         */
        public String getSha1() {
            return this.sha1;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        public static final class Builder {
            private String category; 
            private String contentType; 
            private String createTime; 
            private String creator; 
            private String description; 
            private String downloadUrl; 
            private String fileExtension; 
            private String fileId; 
            private String filePath; 
            private String fileType; 
            private String md5; 
            private String modifiedTime; 
            private String modifier; 
            private String name; 
            private String openTime; 
            private Long openTimeStamp; 
            private String parentId; 
            private String regionId; 
            private String sha1; 
            private Long size; 
            private String thumbnail; 

            /**
             * The file category. PDS categorizes files based on their suffixes and MIME types. The following major categories are included: doc, image, audio, and video.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The content type of the file.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * The time when the file was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The file creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The file description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The URL that is used to download the file. The download URL is valid for only 15 minutes. If the URL is expired, you can call the GetFile operation to obtain the file.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The filename extension.
             */
            public Builder fileExtension(String fileExtension) {
                this.fileExtension = fileExtension;
                return this;
            }

            /**
             * The file ID.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The file path.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * The file type.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * The MD5 value of the file.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The time when the file was last modified.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The user who modified the file.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * The file name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The time when the file was last opened.
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * The timestamp that indicates the time when the file was last opened.
             */
            public Builder openTimeStamp(Long openTimeStamp) {
                this.openTimeStamp = openTimeStamp;
                return this;
            }

            /**
             * The ID of the parent folder.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The region ID You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The SHA 1 file.
             */
            public Builder sha1(String sha1) {
                this.sha1 = sha1;
                return this;
            }

            /**
             * The file size. Unit: bits.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The URL of the thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            public FileModels build() {
                return new FileModels(this);
            } 

        } 

    }
}
