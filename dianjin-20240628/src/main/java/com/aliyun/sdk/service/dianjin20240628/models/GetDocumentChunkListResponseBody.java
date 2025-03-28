// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetDocumentChunkListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocumentChunkListResponseBody</p>
 */
public class GetDocumentChunkListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GetDocumentChunkListResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentChunkListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(GetDocumentChunkListResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetDocumentChunkListResponseBody build() {
            return new GetDocumentChunkListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDocumentChunkListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentChunkListResponseBody</p>
     */
    public static class Pos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("axisArray")
        private java.util.List<Double> axisArray;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("textHighlightArea")
        private java.util.List<Integer> textHighlightArea;

        private Pos(Builder builder) {
            this.axisArray = builder.axisArray;
            this.page = builder.page;
            this.textHighlightArea = builder.textHighlightArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pos create() {
            return builder().build();
        }

        /**
         * @return axisArray
         */
        public java.util.List<Double> getAxisArray() {
            return this.axisArray;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return textHighlightArea
         */
        public java.util.List<Integer> getTextHighlightArea() {
            return this.textHighlightArea;
        }

        public static final class Builder {
            private java.util.List<Double> axisArray; 
            private Integer page; 
            private java.util.List<Integer> textHighlightArea; 

            private Builder() {
            } 

            private Builder(Pos model) {
                this.axisArray = model.axisArray;
                this.page = model.page;
                this.textHighlightArea = model.textHighlightArea;
            } 

            /**
             * axisArray.
             */
            public Builder axisArray(java.util.List<Double> axisArray) {
                this.axisArray = axisArray;
                return this;
            }

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * textHighlightArea.
             */
            public Builder textHighlightArea(java.util.List<Integer> textHighlightArea) {
                this.textHighlightArea = textHighlightArea;
                return this;
            }

            public Pos build() {
                return new Pos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocumentChunkListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentChunkListResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("chunkMeta")
        private java.util.Map<String, ?> chunkMeta;

        @com.aliyun.core.annotation.NameInMap("chunkOssUrl")
        private String chunkOssUrl;

        @com.aliyun.core.annotation.NameInMap("chunkText")
        private String chunkText;

        @com.aliyun.core.annotation.NameInMap("chunkType")
        private String chunkType;

        @com.aliyun.core.annotation.NameInMap("docId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("libraryId")
        private String libraryId;

        @com.aliyun.core.annotation.NameInMap("libraryName")
        private String libraryName;

        @com.aliyun.core.annotation.NameInMap("nextChunkId")
        private String nextChunkId;

        @com.aliyun.core.annotation.NameInMap("pos")
        private java.util.List<Pos> pos;

        @com.aliyun.core.annotation.NameInMap("preChunkId")
        private String preChunkId;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Records(Builder builder) {
            this.chunkId = builder.chunkId;
            this.chunkMeta = builder.chunkMeta;
            this.chunkOssUrl = builder.chunkOssUrl;
            this.chunkText = builder.chunkText;
            this.chunkType = builder.chunkType;
            this.docId = builder.docId;
            this.fileType = builder.fileType;
            this.libraryId = builder.libraryId;
            this.libraryName = builder.libraryName;
            this.nextChunkId = builder.nextChunkId;
            this.pos = builder.pos;
            this.preChunkId = builder.preChunkId;
            this.score = builder.score;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return chunkId
         */
        public String getChunkId() {
            return this.chunkId;
        }

        /**
         * @return chunkMeta
         */
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        /**
         * @return chunkOssUrl
         */
        public String getChunkOssUrl() {
            return this.chunkOssUrl;
        }

        /**
         * @return chunkText
         */
        public String getChunkText() {
            return this.chunkText;
        }

        /**
         * @return chunkType
         */
        public String getChunkType() {
            return this.chunkType;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return libraryId
         */
        public String getLibraryId() {
            return this.libraryId;
        }

        /**
         * @return libraryName
         */
        public String getLibraryName() {
            return this.libraryName;
        }

        /**
         * @return nextChunkId
         */
        public String getNextChunkId() {
            return this.nextChunkId;
        }

        /**
         * @return pos
         */
        public java.util.List<Pos> getPos() {
            return this.pos;
        }

        /**
         * @return preChunkId
         */
        public String getPreChunkId() {
            return this.preChunkId;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String chunkId; 
            private java.util.Map<String, ?> chunkMeta; 
            private String chunkOssUrl; 
            private String chunkText; 
            private String chunkType; 
            private String docId; 
            private String fileType; 
            private String libraryId; 
            private String libraryName; 
            private String nextChunkId; 
            private java.util.List<Pos> pos; 
            private String preChunkId; 
            private Float score; 
            private String title; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.chunkId = model.chunkId;
                this.chunkMeta = model.chunkMeta;
                this.chunkOssUrl = model.chunkOssUrl;
                this.chunkText = model.chunkText;
                this.chunkType = model.chunkType;
                this.docId = model.docId;
                this.fileType = model.fileType;
                this.libraryId = model.libraryId;
                this.libraryName = model.libraryName;
                this.nextChunkId = model.nextChunkId;
                this.pos = model.pos;
                this.preChunkId = model.preChunkId;
                this.score = model.score;
                this.title = model.title;
            } 

            /**
             * chunkId.
             */
            public Builder chunkId(String chunkId) {
                this.chunkId = chunkId;
                return this;
            }

            /**
             * chunkMeta.
             */
            public Builder chunkMeta(java.util.Map<String, ?> chunkMeta) {
                this.chunkMeta = chunkMeta;
                return this;
            }

            /**
             * chunkOssUrl.
             */
            public Builder chunkOssUrl(String chunkOssUrl) {
                this.chunkOssUrl = chunkOssUrl;
                return this;
            }

            /**
             * chunkText.
             */
            public Builder chunkText(String chunkText) {
                this.chunkText = chunkText;
                return this;
            }

            /**
             * chunkType.
             */
            public Builder chunkType(String chunkType) {
                this.chunkType = chunkType;
                return this;
            }

            /**
             * docId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * libraryId.
             */
            public Builder libraryId(String libraryId) {
                this.libraryId = libraryId;
                return this;
            }

            /**
             * libraryName.
             */
            public Builder libraryName(String libraryName) {
                this.libraryName = libraryName;
                return this;
            }

            /**
             * nextChunkId.
             */
            public Builder nextChunkId(String nextChunkId) {
                this.nextChunkId = nextChunkId;
                return this;
            }

            /**
             * pos.
             */
            public Builder pos(java.util.List<Pos> pos) {
                this.pos = pos;
                return this;
            }

            /**
             * preChunkId.
             */
            public Builder preChunkId(String preChunkId) {
                this.preChunkId = preChunkId;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocumentChunkListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocumentChunkListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("totalPages")
        private Long totalPages;

        @com.aliyun.core.annotation.NameInMap("totalRecords")
        private Long totalRecords;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalPages = builder.totalPages;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long pageSize; 
            private java.util.List<Records> records; 
            private Long totalPages; 
            private Long totalRecords; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.totalPages = model.totalPages;
                this.totalRecords = model.totalRecords;
            } 

            /**
             * currentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * totalPages.
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            /**
             * totalRecords.
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
