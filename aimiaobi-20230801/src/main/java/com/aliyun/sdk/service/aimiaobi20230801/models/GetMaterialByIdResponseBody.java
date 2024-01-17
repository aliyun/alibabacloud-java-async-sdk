// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMaterialByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetMaterialByIdResponseBody</p>
 */
public class GetMaterialByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMaterialByIdResponseBody(Builder builder) {
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

    public static GetMaterialByIdResponseBody create() {
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

        public GetMaterialByIdResponseBody build() {
            return new GetMaterialByIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Author")
        private String author;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("DocKeywords")
        private java.util.List < String > docKeywords;

        @NameInMap("DocType")
        private String docType;

        @NameInMap("ExternalUrl")
        private String externalUrl;

        @NameInMap("HtmlContent")
        private String htmlContent;

        @NameInMap("Id")
        private Long id;

        @NameInMap("PubTime")
        private String pubTime;

        @NameInMap("PublicUrl")
        private String publicUrl;

        @NameInMap("ShareAttr")
        private Integer shareAttr;

        @NameInMap("SrcFrom")
        private String srcFrom;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("TextContent")
        private String textContent;

        @NameInMap("ThumbnailInBase64")
        private String thumbnailInBase64;

        @NameInMap("Title")
        private String title;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateUser")
        private String updateUser;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.author = builder.author;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.docKeywords = builder.docKeywords;
            this.docType = builder.docType;
            this.externalUrl = builder.externalUrl;
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
         * @return docKeywords
         */
        public java.util.List < String > getDocKeywords() {
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
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String author; 
            private String createTime; 
            private String createUser; 
            private java.util.List < String > docKeywords; 
            private String docType; 
            private String externalUrl; 
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
            private String url; 

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
             * DocKeywords.
             */
            public Builder docKeywords(java.util.List < String > docKeywords) {
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
