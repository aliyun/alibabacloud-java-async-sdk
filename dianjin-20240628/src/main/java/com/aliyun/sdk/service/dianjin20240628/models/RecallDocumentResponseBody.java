// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecallDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>RecallDocumentResponseBody</p>
 */
public class RecallDocumentResponseBody extends TeaModel {
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

    private RecallDocumentResponseBody(Builder builder) {
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

    public static RecallDocumentResponseBody create() {
        return builder().build();
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

        public RecallDocumentResponseBody build() {
            return new RecallDocumentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class Pos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("axisArray")
        private java.util.List < Double > axisArray;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("textHighlightArea")
        private java.util.List < Integer > textHighlightArea;

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
        public java.util.List < Double > getAxisArray() {
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
        public java.util.List < Integer > getTextHighlightArea() {
            return this.textHighlightArea;
        }

        public static final class Builder {
            private java.util.List < Double > axisArray; 
            private Integer page; 
            private java.util.List < Integer > textHighlightArea; 

            /**
             * axisArray.
             */
            public Builder axisArray(java.util.List < Double > axisArray) {
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
            public Builder textHighlightArea(java.util.List < Integer > textHighlightArea) {
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
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class ChunkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("chunkMeta")
        private java.util.Map < String, ? > chunkMeta;

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
        private java.util.List < Pos> pos;

        @com.aliyun.core.annotation.NameInMap("preChunkId")
        private String preChunkId;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private ChunkList(Builder builder) {
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

        public static ChunkList create() {
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
        public java.util.Map < String, ? > getChunkMeta() {
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
        public java.util.List < Pos> getPos() {
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
            private java.util.Map < String, ? > chunkMeta; 
            private String chunkOssUrl; 
            private String chunkText; 
            private String chunkType; 
            private String docId; 
            private String fileType; 
            private String libraryId; 
            private String libraryName; 
            private String nextChunkId; 
            private java.util.List < Pos> pos; 
            private String preChunkId; 
            private Float score; 
            private String title; 

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
            public Builder chunkMeta(java.util.Map < String, ? > chunkMeta) {
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
            public Builder pos(java.util.List < Pos> pos) {
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

            public ChunkList build() {
                return new ChunkList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class ChunkPartListPos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("axisArray")
        private java.util.List < Double > axisArray;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("textHighlightArea")
        private java.util.List < Integer > textHighlightArea;

        private ChunkPartListPos(Builder builder) {
            this.axisArray = builder.axisArray;
            this.page = builder.page;
            this.textHighlightArea = builder.textHighlightArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkPartListPos create() {
            return builder().build();
        }

        /**
         * @return axisArray
         */
        public java.util.List < Double > getAxisArray() {
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
        public java.util.List < Integer > getTextHighlightArea() {
            return this.textHighlightArea;
        }

        public static final class Builder {
            private java.util.List < Double > axisArray; 
            private Integer page; 
            private java.util.List < Integer > textHighlightArea; 

            /**
             * axisArray.
             */
            public Builder axisArray(java.util.List < Double > axisArray) {
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
            public Builder textHighlightArea(java.util.List < Integer > textHighlightArea) {
                this.textHighlightArea = textHighlightArea;
                return this;
            }

            public ChunkPartListPos build() {
                return new ChunkPartListPos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class ChunkPartList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("chunkMeta")
        private java.util.Map < String, ? > chunkMeta;

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
        private java.util.List < ChunkPartListPos> pos;

        @com.aliyun.core.annotation.NameInMap("preChunkId")
        private String preChunkId;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private ChunkPartList(Builder builder) {
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

        public static ChunkPartList create() {
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
        public java.util.Map < String, ? > getChunkMeta() {
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
        public java.util.List < ChunkPartListPos> getPos() {
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
            private java.util.Map < String, ? > chunkMeta; 
            private String chunkOssUrl; 
            private String chunkText; 
            private String chunkType; 
            private String docId; 
            private String fileType; 
            private String libraryId; 
            private String libraryName; 
            private String nextChunkId; 
            private java.util.List < ChunkPartListPos> pos; 
            private String preChunkId; 
            private Float score; 
            private String title; 

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
            public Builder chunkMeta(java.util.Map < String, ? > chunkMeta) {
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
            public Builder pos(java.util.List < ChunkPartListPos> pos) {
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

            public ChunkPartList build() {
                return new ChunkPartList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("documentMeta")
        private java.util.Map < String, ? > documentMeta;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("libraryId")
        private String libraryId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Documents(Builder builder) {
            this.docId = builder.docId;
            this.documentMeta = builder.documentMeta;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.libraryId = builder.libraryId;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return documentMeta
         */
        public java.util.Map < String, ? > getDocumentMeta() {
            return this.documentMeta;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return libraryId
         */
        public String getLibraryId() {
            return this.libraryId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String docId; 
            private java.util.Map < String, ? > documentMeta; 
            private String fileType; 
            private String gmtCreate; 
            private String libraryId; 
            private String title; 
            private String url; 

            /**
             * docId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * documentMeta.
             */
            public Builder documentMeta(java.util.Map < String, ? > documentMeta) {
                this.documentMeta = documentMeta;
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
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class TextChunkListPos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("axisArray")
        private java.util.List < Double > axisArray;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("textHighlightArea")
        private java.util.List < Integer > textHighlightArea;

        private TextChunkListPos(Builder builder) {
            this.axisArray = builder.axisArray;
            this.page = builder.page;
            this.textHighlightArea = builder.textHighlightArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextChunkListPos create() {
            return builder().build();
        }

        /**
         * @return axisArray
         */
        public java.util.List < Double > getAxisArray() {
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
        public java.util.List < Integer > getTextHighlightArea() {
            return this.textHighlightArea;
        }

        public static final class Builder {
            private java.util.List < Double > axisArray; 
            private Integer page; 
            private java.util.List < Integer > textHighlightArea; 

            /**
             * axisArray.
             */
            public Builder axisArray(java.util.List < Double > axisArray) {
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
            public Builder textHighlightArea(java.util.List < Integer > textHighlightArea) {
                this.textHighlightArea = textHighlightArea;
                return this;
            }

            public TextChunkListPos build() {
                return new TextChunkListPos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class TextChunkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("chunkMeta")
        private java.util.Map < String, ? > chunkMeta;

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
        private java.util.List < TextChunkListPos> pos;

        @com.aliyun.core.annotation.NameInMap("preChunkId")
        private String preChunkId;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private TextChunkList(Builder builder) {
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

        public static TextChunkList create() {
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
        public java.util.Map < String, ? > getChunkMeta() {
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
        public java.util.List < TextChunkListPos> getPos() {
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
            private java.util.Map < String, ? > chunkMeta; 
            private String chunkOssUrl; 
            private String chunkText; 
            private String chunkType; 
            private String docId; 
            private String fileType; 
            private String libraryId; 
            private String libraryName; 
            private String nextChunkId; 
            private java.util.List < TextChunkListPos> pos; 
            private String preChunkId; 
            private Float score; 
            private String title; 

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
            public Builder chunkMeta(java.util.Map < String, ? > chunkMeta) {
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
            public Builder pos(java.util.List < TextChunkListPos> pos) {
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

            public TextChunkList build() {
                return new TextChunkList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class VectorChunkListPos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("axisArray")
        private java.util.List < Double > axisArray;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("textHighlightArea")
        private java.util.List < Integer > textHighlightArea;

        private VectorChunkListPos(Builder builder) {
            this.axisArray = builder.axisArray;
            this.page = builder.page;
            this.textHighlightArea = builder.textHighlightArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorChunkListPos create() {
            return builder().build();
        }

        /**
         * @return axisArray
         */
        public java.util.List < Double > getAxisArray() {
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
        public java.util.List < Integer > getTextHighlightArea() {
            return this.textHighlightArea;
        }

        public static final class Builder {
            private java.util.List < Double > axisArray; 
            private Integer page; 
            private java.util.List < Integer > textHighlightArea; 

            /**
             * axisArray.
             */
            public Builder axisArray(java.util.List < Double > axisArray) {
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
            public Builder textHighlightArea(java.util.List < Integer > textHighlightArea) {
                this.textHighlightArea = textHighlightArea;
                return this;
            }

            public VectorChunkListPos build() {
                return new VectorChunkListPos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class VectorChunkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkId")
        private String chunkId;

        @com.aliyun.core.annotation.NameInMap("chunkMeta")
        private java.util.Map < String, ? > chunkMeta;

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
        private java.util.List < VectorChunkListPos> pos;

        @com.aliyun.core.annotation.NameInMap("preChunkId")
        private String preChunkId;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private VectorChunkList(Builder builder) {
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

        public static VectorChunkList create() {
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
        public java.util.Map < String, ? > getChunkMeta() {
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
        public java.util.List < VectorChunkListPos> getPos() {
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
            private java.util.Map < String, ? > chunkMeta; 
            private String chunkOssUrl; 
            private String chunkText; 
            private String chunkType; 
            private String docId; 
            private String fileType; 
            private String libraryId; 
            private String libraryName; 
            private String nextChunkId; 
            private java.util.List < VectorChunkListPos> pos; 
            private String preChunkId; 
            private Float score; 
            private String title; 

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
            public Builder chunkMeta(java.util.Map < String, ? > chunkMeta) {
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
            public Builder pos(java.util.List < VectorChunkListPos> pos) {
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

            public VectorChunkList build() {
                return new VectorChunkList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecallDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>RecallDocumentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkList")
        private java.util.List < ChunkList> chunkList;

        @com.aliyun.core.annotation.NameInMap("chunkPartList")
        private java.util.List < ChunkPartList> chunkPartList;

        @com.aliyun.core.annotation.NameInMap("chunkTextList")
        private java.util.List < String > chunkTextList;

        @com.aliyun.core.annotation.NameInMap("documents")
        private java.util.List < Documents> documents;

        @com.aliyun.core.annotation.NameInMap("embeddingElapsedMs")
        private Long embeddingElapsedMs;

        @com.aliyun.core.annotation.NameInMap("textChunkList")
        private java.util.List < TextChunkList> textChunkList;

        @com.aliyun.core.annotation.NameInMap("textSearchElapsedMs")
        private Long textSearchElapsedMs;

        @com.aliyun.core.annotation.NameInMap("totalElapsedMs")
        private Long totalElapsedMs;

        @com.aliyun.core.annotation.NameInMap("vectorChunkList")
        private java.util.List < VectorChunkList> vectorChunkList;

        @com.aliyun.core.annotation.NameInMap("vectorSearchElapsedMs")
        private Long vectorSearchElapsedMs;

        private Data(Builder builder) {
            this.chunkList = builder.chunkList;
            this.chunkPartList = builder.chunkPartList;
            this.chunkTextList = builder.chunkTextList;
            this.documents = builder.documents;
            this.embeddingElapsedMs = builder.embeddingElapsedMs;
            this.textChunkList = builder.textChunkList;
            this.textSearchElapsedMs = builder.textSearchElapsedMs;
            this.totalElapsedMs = builder.totalElapsedMs;
            this.vectorChunkList = builder.vectorChunkList;
            this.vectorSearchElapsedMs = builder.vectorSearchElapsedMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chunkList
         */
        public java.util.List < ChunkList> getChunkList() {
            return this.chunkList;
        }

        /**
         * @return chunkPartList
         */
        public java.util.List < ChunkPartList> getChunkPartList() {
            return this.chunkPartList;
        }

        /**
         * @return chunkTextList
         */
        public java.util.List < String > getChunkTextList() {
            return this.chunkTextList;
        }

        /**
         * @return documents
         */
        public java.util.List < Documents> getDocuments() {
            return this.documents;
        }

        /**
         * @return embeddingElapsedMs
         */
        public Long getEmbeddingElapsedMs() {
            return this.embeddingElapsedMs;
        }

        /**
         * @return textChunkList
         */
        public java.util.List < TextChunkList> getTextChunkList() {
            return this.textChunkList;
        }

        /**
         * @return textSearchElapsedMs
         */
        public Long getTextSearchElapsedMs() {
            return this.textSearchElapsedMs;
        }

        /**
         * @return totalElapsedMs
         */
        public Long getTotalElapsedMs() {
            return this.totalElapsedMs;
        }

        /**
         * @return vectorChunkList
         */
        public java.util.List < VectorChunkList> getVectorChunkList() {
            return this.vectorChunkList;
        }

        /**
         * @return vectorSearchElapsedMs
         */
        public Long getVectorSearchElapsedMs() {
            return this.vectorSearchElapsedMs;
        }

        public static final class Builder {
            private java.util.List < ChunkList> chunkList; 
            private java.util.List < ChunkPartList> chunkPartList; 
            private java.util.List < String > chunkTextList; 
            private java.util.List < Documents> documents; 
            private Long embeddingElapsedMs; 
            private java.util.List < TextChunkList> textChunkList; 
            private Long textSearchElapsedMs; 
            private Long totalElapsedMs; 
            private java.util.List < VectorChunkList> vectorChunkList; 
            private Long vectorSearchElapsedMs; 

            /**
             * chunkList.
             */
            public Builder chunkList(java.util.List < ChunkList> chunkList) {
                this.chunkList = chunkList;
                return this;
            }

            /**
             * chunkPartList.
             */
            public Builder chunkPartList(java.util.List < ChunkPartList> chunkPartList) {
                this.chunkPartList = chunkPartList;
                return this;
            }

            /**
             * chunkTextList.
             */
            public Builder chunkTextList(java.util.List < String > chunkTextList) {
                this.chunkTextList = chunkTextList;
                return this;
            }

            /**
             * documents.
             */
            public Builder documents(java.util.List < Documents> documents) {
                this.documents = documents;
                return this;
            }

            /**
             * embeddingElapsedMs.
             */
            public Builder embeddingElapsedMs(Long embeddingElapsedMs) {
                this.embeddingElapsedMs = embeddingElapsedMs;
                return this;
            }

            /**
             * textChunkList.
             */
            public Builder textChunkList(java.util.List < TextChunkList> textChunkList) {
                this.textChunkList = textChunkList;
                return this;
            }

            /**
             * textSearchElapsedMs.
             */
            public Builder textSearchElapsedMs(Long textSearchElapsedMs) {
                this.textSearchElapsedMs = textSearchElapsedMs;
                return this;
            }

            /**
             * totalElapsedMs.
             */
            public Builder totalElapsedMs(Long totalElapsedMs) {
                this.totalElapsedMs = totalElapsedMs;
                return this;
            }

            /**
             * vectorChunkList.
             */
            public Builder vectorChunkList(java.util.List < VectorChunkList> vectorChunkList) {
                this.vectorChunkList = vectorChunkList;
                return this;
            }

            /**
             * vectorSearchElapsedMs.
             */
            public Builder vectorSearchElapsedMs(Long vectorSearchElapsedMs) {
                this.vectorSearchElapsedMs = vectorSearchElapsedMs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
