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
 * {@link GetStyleLearningResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetStyleLearningResultResponseBody</p>
 */
public class GetStyleLearningResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStyleLearningResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStyleLearningResultResponseBody create() {
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
     * @return data
     */
    public Data getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStyleLearningResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStyleLearningResultResponseBody build() {
            return new GetStyleLearningResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStyleLearningResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStyleLearningResultResponseBody</p>
     */
    public static class ContentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateUser")
        private String updateUser;

        private ContentList(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.id = builder.id;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.updateUser = builder.updateUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String createUser; 
            private Long id; 
            private String title; 
            private String updateTime; 
            private String updateUser; 

            private Builder() {
            } 

            private Builder(ContentList model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.id = model.id;
                this.title = model.title;
                this.updateTime = model.updateTime;
                this.updateUser = model.updateUser;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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

            public ContentList build() {
                return new ContentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStyleLearningResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStyleLearningResultResponseBody</p>
     */
    public static class MaterialInfoList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("FileLength")
        private Integer fileLength;

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

        private MaterialInfoList(Builder builder) {
            this.author = builder.author;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.createUserName = builder.createUserName;
            this.docKeywords = builder.docKeywords;
            this.docType = builder.docType;
            this.externalUrl = builder.externalUrl;
            this.fileLength = builder.fileLength;
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

        public static MaterialInfoList create() {
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
         * @return fileLength
         */
        public Integer getFileLength() {
            return this.fileLength;
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
            private Integer fileLength; 
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

            private Builder(MaterialInfoList model) {
                this.author = model.author;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.createUserName = model.createUserName;
                this.docKeywords = model.docKeywords;
                this.docType = model.docType;
                this.externalUrl = model.externalUrl;
                this.fileLength = model.fileLength;
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
             * FileLength.
             */
            public Builder fileLength(Integer fileLength) {
                this.fileLength = fileLength;
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

            public MaterialInfoList build() {
                return new MaterialInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStyleLearningResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStyleLearningResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AigcResult")
        private String aigcResult;

        @com.aliyun.core.annotation.NameInMap("ContentList")
        private java.util.List<ContentList> contentList;

        @com.aliyun.core.annotation.NameInMap("CustomTextIdList")
        private java.util.List<Long> customTextIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MaterialIdList")
        private java.util.List<Long> materialIdList;

        @com.aliyun.core.annotation.NameInMap("MaterialInfoList")
        private java.util.List<MaterialInfoList> materialInfoList;

        @com.aliyun.core.annotation.NameInMap("RewriteResult")
        private String rewriteResult;

        @com.aliyun.core.annotation.NameInMap("StyleName")
        private String styleName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.aigcResult = builder.aigcResult;
            this.contentList = builder.contentList;
            this.customTextIdList = builder.customTextIdList;
            this.id = builder.id;
            this.materialIdList = builder.materialIdList;
            this.materialInfoList = builder.materialInfoList;
            this.rewriteResult = builder.rewriteResult;
            this.styleName = builder.styleName;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aigcResult
         */
        public String getAigcResult() {
            return this.aigcResult;
        }

        /**
         * @return contentList
         */
        public java.util.List<ContentList> getContentList() {
            return this.contentList;
        }

        /**
         * @return customTextIdList
         */
        public java.util.List<Long> getCustomTextIdList() {
            return this.customTextIdList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return materialIdList
         */
        public java.util.List<Long> getMaterialIdList() {
            return this.materialIdList;
        }

        /**
         * @return materialInfoList
         */
        public java.util.List<MaterialInfoList> getMaterialInfoList() {
            return this.materialInfoList;
        }

        /**
         * @return rewriteResult
         */
        public String getRewriteResult() {
            return this.rewriteResult;
        }

        /**
         * @return styleName
         */
        public String getStyleName() {
            return this.styleName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String aigcResult; 
            private java.util.List<ContentList> contentList; 
            private java.util.List<Long> customTextIdList; 
            private Long id; 
            private java.util.List<Long> materialIdList; 
            private java.util.List<MaterialInfoList> materialInfoList; 
            private String rewriteResult; 
            private String styleName; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aigcResult = model.aigcResult;
                this.contentList = model.contentList;
                this.customTextIdList = model.customTextIdList;
                this.id = model.id;
                this.materialIdList = model.materialIdList;
                this.materialInfoList = model.materialInfoList;
                this.rewriteResult = model.rewriteResult;
                this.styleName = model.styleName;
                this.taskId = model.taskId;
            } 

            /**
             * AigcResult.
             */
            public Builder aigcResult(String aigcResult) {
                this.aigcResult = aigcResult;
                return this;
            }

            /**
             * ContentList.
             */
            public Builder contentList(java.util.List<ContentList> contentList) {
                this.contentList = contentList;
                return this;
            }

            /**
             * CustomTextIdList.
             */
            public Builder customTextIdList(java.util.List<Long> customTextIdList) {
                this.customTextIdList = customTextIdList;
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
             * MaterialIdList.
             */
            public Builder materialIdList(java.util.List<Long> materialIdList) {
                this.materialIdList = materialIdList;
                return this;
            }

            /**
             * MaterialInfoList.
             */
            public Builder materialInfoList(java.util.List<MaterialInfoList> materialInfoList) {
                this.materialInfoList = materialInfoList;
                return this;
            }

            /**
             * RewriteResult.
             */
            public Builder rewriteResult(String rewriteResult) {
                this.rewriteResult = rewriteResult;
                return this;
            }

            /**
             * StyleName.
             */
            public Builder styleName(String styleName) {
                this.styleName = styleName;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
