// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListMaterialDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMaterialDocumentsResponseBody</p>
 */
public class ListMaterialDocumentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListMaterialDocumentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.current = builder.current;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMaterialDocumentsResponseBody create() {
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
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer current; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Integer size; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListMaterialDocumentsResponseBody model) {
            this.code = model.code;
            this.current = model.current;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.size = model.size;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.current = current;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListMaterialDocumentsResponseBody build() {
            return new ListMaterialDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMaterialDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMaterialDocumentsResponseBody</p>
     */
    public static class FileAttr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("FileLength")
        private Long fileLength;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("MimeType")
        private String mimeType;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private FileAttr(Builder builder) {
            this.duration = builder.duration;
            this.fileLength = builder.fileLength;
            this.fileName = builder.fileName;
            this.height = builder.height;
            this.mimeType = builder.mimeType;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileAttr create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
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
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Double duration; 
            private Long fileLength; 
            private String fileName; 
            private Integer height; 
            private String mimeType; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(FileAttr model) {
                this.duration = model.duration;
                this.fileLength = model.fileLength;
                this.fileName = model.fileName;
                this.height = model.height;
                this.mimeType = model.mimeType;
                this.width = model.width;
            } 

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileLength.
             */
            public Builder fileLength(Long fileLength) {
                this.fileLength = fileLength;
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
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * MimeType.
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public FileAttr build() {
                return new FileAttr(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMaterialDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMaterialDocumentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("DocKeywords")
        private java.util.List<String> docKeywords;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("ExternalUrl")
        private String externalUrl;

        @com.aliyun.core.annotation.NameInMap("FileAttr")
        private FileAttr fileAttr;

        @com.aliyun.core.annotation.NameInMap("FileKey")
        private String fileKey;

        @com.aliyun.core.annotation.NameInMap("HtmlContent")
        private String htmlContent;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("PublicUrl")
        private String publicUrl;

        @com.aliyun.core.annotation.NameInMap("ShareAttr")
        private Integer shareAttr;

        @com.aliyun.core.annotation.NameInMap("SrcFrom")
        private String srcFrom;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TextContent")
        private String textContent;

        @com.aliyun.core.annotation.NameInMap("ThumbnailInBase64")
        private String thumbnailInBase64;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateUser")
        private String updateUser;

        @com.aliyun.core.annotation.NameInMap("UpdateUserName")
        private String updateUserName;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.author = builder.author;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.createUserName = builder.createUserName;
            this.docKeywords = builder.docKeywords;
            this.docType = builder.docType;
            this.externalUrl = builder.externalUrl;
            this.fileAttr = builder.fileAttr;
            this.fileKey = builder.fileKey;
            this.htmlContent = builder.htmlContent;
            this.id = builder.id;
            this.pubTime = builder.pubTime;
            this.publicUrl = builder.publicUrl;
            this.shareAttr = builder.shareAttr;
            this.srcFrom = builder.srcFrom;
            this.summary = builder.summary;
            this.textContent = builder.textContent;
            this.thumbnailInBase64 = builder.thumbnailInBase64;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.updateUser = builder.updateUser;
            this.updateUserName = builder.updateUserName;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return docKeywords
         */
        public java.util.List<String> getDocKeywords() {
            return this.docKeywords;
        }

        /**
         * @return docType
         */
        public String getDocType() {
            return this.docType;
        }

        /**
         * @return externalUrl
         */
        public String getExternalUrl() {
            return this.externalUrl;
        }

        /**
         * @return fileAttr
         */
        public FileAttr getFileAttr() {
            return this.fileAttr;
        }

        /**
         * @return fileKey
         */
        public String getFileKey() {
            return this.fileKey;
        }

        /**
         * @return htmlContent
         */
        public String getHtmlContent() {
            return this.htmlContent;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return publicUrl
         */
        public String getPublicUrl() {
            return this.publicUrl;
        }

        /**
         * @return shareAttr
         */
        public Integer getShareAttr() {
            return this.shareAttr;
        }

        /**
         * @return srcFrom
         */
        public String getSrcFrom() {
            return this.srcFrom;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return textContent
         */
        public String getTextContent() {
            return this.textContent;
        }

        /**
         * @return thumbnailInBase64
         */
        public String getThumbnailInBase64() {
            return this.thumbnailInBase64;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUser
         */
        public String getUpdateUser() {
            return this.updateUser;
        }

        /**
         * @return updateUserName
         */
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String author; 
            private String createTime; 
            private String createUser; 
            private String createUserName; 
            private java.util.List<String> docKeywords; 
            private String docType; 
            private String externalUrl; 
            private FileAttr fileAttr; 
            private String fileKey; 
            private String htmlContent; 
            private Long id; 
            private String pubTime; 
            private String publicUrl; 
            private Integer shareAttr; 
            private String srcFrom; 
            private String summary; 
            private String textContent; 
            private String thumbnailInBase64; 
            private String title; 
            private String updateTime; 
            private String updateUser; 
            private String updateUserName; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.author = model.author;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.createUserName = model.createUserName;
                this.docKeywords = model.docKeywords;
                this.docType = model.docType;
                this.externalUrl = model.externalUrl;
                this.fileAttr = model.fileAttr;
                this.fileKey = model.fileKey;
                this.htmlContent = model.htmlContent;
                this.id = model.id;
                this.pubTime = model.pubTime;
                this.publicUrl = model.publicUrl;
                this.shareAttr = model.shareAttr;
                this.srcFrom = model.srcFrom;
                this.summary = model.summary;
                this.textContent = model.textContent;
                this.thumbnailInBase64 = model.thumbnailInBase64;
                this.title = model.title;
                this.updateTime = model.updateTime;
                this.updateUser = model.updateUser;
                this.updateUserName = model.updateUserName;
                this.url = model.url;
            } 

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * DocKeywords.
             */
            public Builder docKeywords(java.util.List<String> docKeywords) {
                this.docKeywords = docKeywords;
                return this;
            }

            /**
             * DocType.
             */
            public Builder docType(String docType) {
                this.docType = docType;
                return this;
            }

            /**
             * ExternalUrl.
             */
            public Builder externalUrl(String externalUrl) {
                this.externalUrl = externalUrl;
                return this;
            }

            /**
             * FileAttr.
             */
            public Builder fileAttr(FileAttr fileAttr) {
                this.fileAttr = fileAttr;
                return this;
            }

            /**
             * FileKey.
             */
            public Builder fileKey(String fileKey) {
                this.fileKey = fileKey;
                return this;
            }

            /**
             * HtmlContent.
             */
            public Builder htmlContent(String htmlContent) {
                this.htmlContent = htmlContent;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * PublicUrl.
             */
            public Builder publicUrl(String publicUrl) {
                this.publicUrl = publicUrl;
                return this;
            }

            /**
             * ShareAttr.
             */
            public Builder shareAttr(Integer shareAttr) {
                this.shareAttr = shareAttr;
                return this;
            }

            /**
             * SrcFrom.
             */
            public Builder srcFrom(String srcFrom) {
                this.srcFrom = srcFrom;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * TextContent.
             */
            public Builder textContent(String textContent) {
                this.textContent = textContent;
                return this;
            }

            /**
             * ThumbnailInBase64.
             */
            public Builder thumbnailInBase64(String thumbnailInBase64) {
                this.thumbnailInBase64 = thumbnailInBase64;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUser.
             */
            public Builder updateUser(String updateUser) {
                this.updateUser = updateUser;
                return this;
            }

            /**
             * UpdateUserName.
             */
            public Builder updateUserName(String updateUserName) {
                this.updateUserName = updateUserName;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
