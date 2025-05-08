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
 * {@link ListDatasetDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetDocumentsResponseBody</p>
 */
public class ListDatasetDocumentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDatasetDocumentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetDocumentsResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDatasetDocumentsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatasetDocumentsResponseBody build() {
            return new ListDatasetDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatasetDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetDocumentsResponseBody</p>
     */
    public static class MultimodalMedias extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private MultimodalMedias(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalMedias create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        public static final class Builder {
            private String fileUrl; 
            private String mediaId; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(MultimodalMedias model) {
                this.fileUrl = model.fileUrl;
                this.mediaId = model.mediaId;
                this.mediaType = model.mediaType;
            } 

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
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
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            public MultimodalMedias build() {
                return new MultimodalMedias(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasetDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasetDocumentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryUuid")
        private String categoryUuid;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DisableHandleMultimodalMedia")
        private Boolean disableHandleMultimodalMedia;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("Extend1")
        private String extend1;

        @com.aliyun.core.annotation.NameInMap("Extend2")
        private String extend2;

        @com.aliyun.core.annotation.NameInMap("Extend3")
        private String extend3;

        @com.aliyun.core.annotation.NameInMap("MultimodalMedias")
        private java.util.List<MultimodalMedias> multimodalMedias;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SourceFrom")
        private String sourceFrom;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.categoryUuid = builder.categoryUuid;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.disableHandleMultimodalMedia = builder.disableHandleMultimodalMedia;
            this.docId = builder.docId;
            this.docType = builder.docType;
            this.docUuid = builder.docUuid;
            this.extend1 = builder.extend1;
            this.extend2 = builder.extend2;
            this.extend3 = builder.extend3;
            this.multimodalMedias = builder.multimodalMedias;
            this.pubTime = builder.pubTime;
            this.sourceFrom = builder.sourceFrom;
            this.status = builder.status;
            this.summary = builder.summary;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryUuid
         */
        public String getCategoryUuid() {
            return this.categoryUuid;
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
         * @return disableHandleMultimodalMedia
         */
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docType
         */
        public String getDocType() {
            return this.docType;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return extend1
         */
        public String getExtend1() {
            return this.extend1;
        }

        /**
         * @return extend2
         */
        public String getExtend2() {
            return this.extend2;
        }

        /**
         * @return extend3
         */
        public String getExtend3() {
            return this.extend3;
        }

        /**
         * @return multimodalMedias
         */
        public java.util.List<MultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return sourceFrom
         */
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
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
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String categoryUuid; 
            private String content; 
            private String createTime; 
            private Boolean disableHandleMultimodalMedia; 
            private String docId; 
            private String docType; 
            private String docUuid; 
            private String extend1; 
            private String extend2; 
            private String extend3; 
            private java.util.List<MultimodalMedias> multimodalMedias; 
            private String pubTime; 
            private String sourceFrom; 
            private Integer status; 
            private String summary; 
            private String title; 
            private String updateTime; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryUuid = model.categoryUuid;
                this.content = model.content;
                this.createTime = model.createTime;
                this.disableHandleMultimodalMedia = model.disableHandleMultimodalMedia;
                this.docId = model.docId;
                this.docType = model.docType;
                this.docUuid = model.docUuid;
                this.extend1 = model.extend1;
                this.extend2 = model.extend2;
                this.extend3 = model.extend3;
                this.multimodalMedias = model.multimodalMedias;
                this.pubTime = model.pubTime;
                this.sourceFrom = model.sourceFrom;
                this.status = model.status;
                this.summary = model.summary;
                this.title = model.title;
                this.updateTime = model.updateTime;
                this.url = model.url;
            } 

            /**
             * CategoryUuid.
             */
            public Builder categoryUuid(String categoryUuid) {
                this.categoryUuid = categoryUuid;
                return this;
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
             * DisableHandleMultimodalMedia.
             */
            public Builder disableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
                this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
                return this;
            }

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
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
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * Extend1.
             */
            public Builder extend1(String extend1) {
                this.extend1 = extend1;
                return this;
            }

            /**
             * Extend2.
             */
            public Builder extend2(String extend2) {
                this.extend2 = extend2;
                return this;
            }

            /**
             * Extend3.
             */
            public Builder extend3(String extend3) {
                this.extend3 = extend3;
                return this;
            }

            /**
             * MultimodalMedias.
             */
            public Builder multimodalMedias(java.util.List<MultimodalMedias> multimodalMedias) {
                this.multimodalMedias = multimodalMedias;
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
             * SourceFrom.
             */
            public Builder sourceFrom(String sourceFrom) {
                this.sourceFrom = sourceFrom;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
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
             * <p>url</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx/xx">https://xxx/xx</a></p>
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
