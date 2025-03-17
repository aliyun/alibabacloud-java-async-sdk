// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ListCdsFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCdsFilesResponseBody</p>
 */
public class ListCdsFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("FileModels")
    private java.util.List<FileModels> fileModels;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<FileModels> getFileModels() {
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
        private java.util.List<FileModels> fileModels; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCdsFilesResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.fileModels = model.fileModels;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result of the operation. A value of success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The files.</p>
         */
        public Builder fileModels(java.util.List<FileModels> fileModels) {
            this.fileModels = fileModels;
            return this;
        }

        /**
         * <p>The error message returned if the request failed. This parameter is empty if the value of Code is success.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token used for the next query. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>WyI2MzhmMjA2ZTFmZGZlZGVjZDk3OTRlNzVhZmIwMDFiZmM5NWQ3YTgwIiwibiIsIm4iLDEsLTEsMTY3MDMyNDMzNTAzMSwiNjM4ZjIwNmZjNDFkMzIwOTZmZWU0NGYxODkwY2I5ZjI0Mjg0NzM2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID. An ID is the unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>40D86754-20FD-53DC-A9B8-25F7FECC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><!-- -->
         * 
         * <p>false</p>
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCdsFilesResponseBody build() {
            return new ListCdsFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCdsFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCdsFilesResponseBody</p>
     */
    public static class FileModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FileExtension")
        private String fileExtension;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpenTime")
        private String openTime;

        @com.aliyun.core.annotation.NameInMap("OpenTimeStamp")
        private Long openTimeStamp;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Sha1")
        private String sha1;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
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

            private Builder() {
            } 

            private Builder(FileModels model) {
                this.category = model.category;
                this.contentType = model.contentType;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.downloadUrl = model.downloadUrl;
                this.fileExtension = model.fileExtension;
                this.fileId = model.fileId;
                this.filePath = model.filePath;
                this.fileType = model.fileType;
                this.md5 = model.md5;
                this.modifiedTime = model.modifiedTime;
                this.modifier = model.modifier;
                this.name = model.name;
                this.openTime = model.openTime;
                this.openTimeStamp = model.openTimeStamp;
                this.parentId = model.parentId;
                this.regionId = model.regionId;
                this.sha1 = model.sha1;
                this.size = model.size;
                this.thumbnail = model.thumbnail;
            } 

            /**
             * <p>The file category. PDS categorizes files based on their suffixes and MIME types. The following major categories are included: doc, image, audio, and video.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The content type of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The time when the file was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T07:27:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The file creator.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The file description.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL that is used to download the file. The download URL is valid for only 15 minutes. If the URL is expired, you can call the GetFile operation to obtain the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The filename extension.</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder fileExtension(String fileExtension) {
                this.fileExtension = fileExtension;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>637725ff2f63db8470984e6c92c692b87d52****</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>isv/1019236948660053/temp/</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The MD5 value of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>63c83ececb4e6926c51448fc5ecb****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The time when the file was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T07:27:08Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The user who modified the file.</p>
             * 
             * <strong>example:</strong>
             * <p>user02</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>fvt-appcenterp4qwa</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the file was last opened.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T07:27:08Z</p>
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * <p>The timestamp that indicates the time when the file was last opened.</p>
             * 
             * <strong>example:</strong>
             * <p>168951245231</p>
             */
            public Builder openTimeStamp(Long openTimeStamp) {
                this.openTimeStamp = openTimeStamp;
                return this;
            }

            /**
             * <p>The ID of the parent folder.</p>
             * 
             * <strong>example:</strong>
             * <p>3343213ff2f63db8470984e6c92c3213dfdw****</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The region ID You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The SHA 1 file.</p>
             * 
             * <strong>example:</strong>
             * <p>EA4942AA8761213890A5C386F88E6464D2C3****</p>
             */
            public Builder sha1(String sha1) {
                this.sha1 = sha1;
                return this;
            }

            /**
             * <p>The file size. Unit: bits.</p>
             * 
             * <strong>example:</strong>
             * <p>102400</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The URL of the thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
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
