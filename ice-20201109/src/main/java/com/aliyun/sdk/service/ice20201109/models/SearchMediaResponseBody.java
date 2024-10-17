// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchMediaResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaResponseBody</p>
 */
public class SearchMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MediaInfoList")
    private java.util.List < MediaInfoList> mediaInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScrollToken")
    private String scrollToken;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private SearchMediaResponseBody(Builder builder) {
        this.code = builder.code;
        this.mediaInfoList = builder.mediaInfoList;
        this.requestId = builder.requestId;
        this.scrollToken = builder.scrollToken;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return mediaInfoList
     */
    public java.util.List < MediaInfoList> getMediaInfoList() {
        return this.mediaInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scrollToken
     */
    public String getScrollToken() {
        return this.scrollToken;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < MediaInfoList> mediaInfoList; 
        private String requestId; 
        private String scrollToken; 
        private String success; 
        private Long total; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The media assets that meet the requirements.</p>
         */
        public Builder mediaInfoList(java.util.List < MediaInfoList> mediaInfoList) {
            this.mediaInfoList = mediaInfoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6F61C357-ACC0-57FB-876E-D58795335E59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The pagination identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>F8C4F642184DBDA5D93907A70AAE****</p>
         */
        public Builder scrollToken(String scrollToken) {
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of media assets that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>163</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaResponseBody build() {
            return new SearchMediaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class Tracks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Double size;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Double timestamp;

        private Tracks(Builder builder) {
            this.position = builder.position;
            this.size = builder.size;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tracks create() {
            return builder().build();
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return size
         */
        public Double getSize() {
            return this.size;
        }

        /**
         * @return timestamp
         */
        public Double getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String position; 
            private Double size; 
            private Double timestamp; 

            /**
             * <p>The coordinates of the bounding box.</p>
             * 
             * <strong>example:</strong>
             * <p>468.0;67.0;615.0;267.0</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * <p>The size of the bounding box.</p>
             * 
             * <strong>example:</strong>
             * <p>50.2</p>
             */
            public Builder size(Double size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The timestamp of the track.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder timestamp(Double timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Tracks build() {
                return new Tracks(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class Occurrences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FinegrainId")
        private String finegrainId;

        @com.aliyun.core.annotation.NameInMap("FinegrainName")
        private String finegrainName;

        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("TableBatchSeqId")
        private String tableBatchSeqId;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        @com.aliyun.core.annotation.NameInMap("Tracks")
        private java.util.List < Tracks> tracks;

        @com.aliyun.core.annotation.NameInMap("clipId")
        private String clipId;

        private Occurrences(Builder builder) {
            this.content = builder.content;
            this.finegrainId = builder.finegrainId;
            this.finegrainName = builder.finegrainName;
            this.from = builder.from;
            this.image = builder.image;
            this.score = builder.score;
            this.tableBatchSeqId = builder.tableBatchSeqId;
            this.to = builder.to;
            this.tracks = builder.tracks;
            this.clipId = builder.clipId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Occurrences create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return finegrainId
         */
        public String getFinegrainId() {
            return this.finegrainId;
        }

        /**
         * @return finegrainName
         */
        public String getFinegrainName() {
            return this.finegrainName;
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return tableBatchSeqId
         */
        public String getTableBatchSeqId() {
            return this.tableBatchSeqId;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        /**
         * @return tracks
         */
        public java.util.List < Tracks> getTracks() {
            return this.tracks;
        }

        /**
         * @return clipId
         */
        public String getClipId() {
            return this.clipId;
        }

        public static final class Builder {
            private String content; 
            private String finegrainId; 
            private String finegrainName; 
            private Double from; 
            private String image; 
            private Double score; 
            private String tableBatchSeqId; 
            private Double to; 
            private java.util.List < Tracks> tracks; 
            private String clipId; 

            /**
             * <p>The text content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The fine-grained ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>10310250338</p>
             */
            public Builder finegrainId(String finegrainId) {
                this.finegrainId = finegrainId;
                return this;
            }

            /**
             * <p>The fine-grained name of the entity.</p>
             */
            public Builder finegrainName(String finegrainName) {
                this.finegrainName = finegrainName;
                return this;
            }

            /**
             * <p>The start time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The optimal face image encoded in Base64.</p>
             * 
             * <strong>example:</strong>
             * <p>99C64F6287</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.75287705</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The sequence ID of the vector table.</p>
             * 
             * <strong>example:</strong>
             * <p>85010D1</p>
             */
            public Builder tableBatchSeqId(String tableBatchSeqId) {
                this.tableBatchSeqId = tableBatchSeqId;
                return this;
            }

            /**
             * <p>The end time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5</p>
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * <p>The track sequence.</p>
             */
            public Builder tracks(java.util.List < Tracks> tracks) {
                this.tracks = tracks;
                return this;
            }

            /**
             * <p>The ID of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            public Occurrences build() {
                return new Occurrences(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class AiLabelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("FaceId")
        private String faceId;

        @com.aliyun.core.annotation.NameInMap("LabelId")
        private String labelId;

        @com.aliyun.core.annotation.NameInMap("LabelName")
        private String labelName;

        @com.aliyun.core.annotation.NameInMap("LabelType")
        private String labelType;

        @com.aliyun.core.annotation.NameInMap("Occurrences")
        private java.util.List < Occurrences> occurrences;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private AiLabelInfo(Builder builder) {
            this.category = builder.category;
            this.faceId = builder.faceId;
            this.labelId = builder.labelId;
            this.labelName = builder.labelName;
            this.labelType = builder.labelType;
            this.occurrences = builder.occurrences;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiLabelInfo create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return labelId
         */
        public String getLabelId() {
            return this.labelId;
        }

        /**
         * @return labelName
         */
        public String getLabelName() {
            return this.labelName;
        }

        /**
         * @return labelType
         */
        public String getLabelType() {
            return this.labelType;
        }

        /**
         * @return occurrences
         */
        public java.util.List < Occurrences> getOccurrences() {
            return this.occurrences;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String category; 
            private String faceId; 
            private String labelId; 
            private String labelName; 
            private String labelType; 
            private java.util.List < Occurrences> occurrences; 
            private String source; 

            /**
             * <p>The category.</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The face ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * <p>The ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>10310250338</p>
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * <p>The name of the entity.</p>
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * <p>The type of the tag.</p>
             */
            public Builder labelType(String labelType) {
                this.labelType = labelType;
                return this;
            }

            /**
             * <p>The clips.</p>
             */
            public Builder occurrences(java.util.List < Occurrences> occurrences) {
                this.occurrences = occurrences;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>vision</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public AiLabelInfo build() {
                return new AiLabelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class AsrInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipId")
        private String clipId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Double timestamp;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        private AsrInfo(Builder builder) {
            this.clipId = builder.clipId;
            this.content = builder.content;
            this.from = builder.from;
            this.timestamp = builder.timestamp;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrInfo create() {
            return builder().build();
        }

        /**
         * @return clipId
         */
        public String getClipId() {
            return this.clipId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return timestamp
         */
        public Double getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        public static final class Builder {
            private String clipId; 
            private String content; 
            private Double from; 
            private Double timestamp; 
            private Double to; 

            /**
             * <p>The ID of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            /**
             * <p>The text content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The start time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The timestamp of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder timestamp(Double timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The end time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5</p>
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            public AsrInfo build() {
                return new AsrInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class OcrInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipId")
        private String clipId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Double timestamp;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        private OcrInfo(Builder builder) {
            this.clipId = builder.clipId;
            this.content = builder.content;
            this.from = builder.from;
            this.timestamp = builder.timestamp;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OcrInfo create() {
            return builder().build();
        }

        /**
         * @return clipId
         */
        public String getClipId() {
            return this.clipId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return timestamp
         */
        public Double getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        public static final class Builder {
            private String clipId; 
            private String content; 
            private Double from; 
            private Double timestamp; 
            private Double to; 

            /**
             * <p>The ID of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>5FE19530C7A422197535FE74F5DB2B9F</p>
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            /**
             * <p>The text content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The start time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The timestamp of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder timestamp(Double timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The end time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5</p>
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            public OcrInfo build() {
                return new OcrInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class AiData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiLabelInfo")
        private java.util.List < AiLabelInfo> aiLabelInfo;

        @com.aliyun.core.annotation.NameInMap("AsrInfo")
        private java.util.List < AsrInfo> asrInfo;

        @com.aliyun.core.annotation.NameInMap("OcrInfo")
        private java.util.List < OcrInfo> ocrInfo;

        private AiData(Builder builder) {
            this.aiLabelInfo = builder.aiLabelInfo;
            this.asrInfo = builder.asrInfo;
            this.ocrInfo = builder.ocrInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiData create() {
            return builder().build();
        }

        /**
         * @return aiLabelInfo
         */
        public java.util.List < AiLabelInfo> getAiLabelInfo() {
            return this.aiLabelInfo;
        }

        /**
         * @return asrInfo
         */
        public java.util.List < AsrInfo> getAsrInfo() {
            return this.asrInfo;
        }

        /**
         * @return ocrInfo
         */
        public java.util.List < OcrInfo> getOcrInfo() {
            return this.ocrInfo;
        }

        public static final class Builder {
            private java.util.List < AiLabelInfo> aiLabelInfo; 
            private java.util.List < AsrInfo> asrInfo; 
            private java.util.List < OcrInfo> ocrInfo; 

            /**
             * <p>The tags of the intelligent AI job.</p>
             */
            public Builder aiLabelInfo(java.util.List < AiLabelInfo> aiLabelInfo) {
                this.aiLabelInfo = aiLabelInfo;
                return this;
            }

            /**
             * <p>The information about audio files.</p>
             */
            public Builder asrInfo(java.util.List < AsrInfo> asrInfo) {
                this.asrInfo = asrInfo;
                return this;
            }

            /**
             * <p>The subtitles.</p>
             */
            public Builder ocrInfo(java.util.List < OcrInfo> ocrInfo) {
                this.ocrInfo = ocrInfo;
                return this;
            }

            public AiData build() {
                return new AiData(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class AiRoughData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiCategory")
        private String aiCategory;

        @com.aliyun.core.annotation.NameInMap("AiJobId")
        private String aiJobId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("SaveType")
        private String saveType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AiRoughData(Builder builder) {
            this.aiCategory = builder.aiCategory;
            this.aiJobId = builder.aiJobId;
            this.result = builder.result;
            this.saveType = builder.saveType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiRoughData create() {
            return builder().build();
        }

        /**
         * @return aiCategory
         */
        public String getAiCategory() {
            return this.aiCategory;
        }

        /**
         * @return aiJobId
         */
        public String getAiJobId() {
            return this.aiJobId;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return saveType
         */
        public String getSaveType() {
            return this.saveType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aiCategory; 
            private String aiJobId; 
            private String result; 
            private String saveType; 
            private String status; 

            /**
             * <p>TV Series</p>
             * 
             * <strong>example:</strong>
             * <p>TV series</p>
             */
            public Builder aiCategory(String aiCategory) {
                this.aiCategory = aiCategory;
                return this;
            }

            /**
             * <p>The ID of the AI job.</p>
             * 
             * <strong>example:</strong>
             * <p>cd35b0b0025f71edbfcb472190a9xxxx</p>
             */
            public Builder aiJobId(String aiJobId) {
                this.aiJobId = aiJobId;
                return this;
            }

            /**
             * <p>The results of the AI job.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.json">http://xxxx.json</a></p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The save type.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            /**
             * <p>The data status.</p>
             * 
             * <strong>example:</strong>
             * <p>SaveSuccess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AiRoughData build() {
                return new AiRoughData(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class FileBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("FileStatus")
        private String fileStatus;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("FormatName")
        private String formatName;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private FileBasicInfo(Builder builder) {
            this.bitrate = builder.bitrate;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileStatus = builder.fileStatus;
            this.fileType = builder.fileType;
            this.fileUrl = builder.fileUrl;
            this.formatName = builder.formatName;
            this.height = builder.height;
            this.modifiedTime = builder.modifiedTime;
            this.region = builder.region;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileBasicInfo create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileStatus
         */
        public String getFileStatus() {
            return this.fileStatus;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private String createTime; 
            private String duration; 
            private String fileName; 
            private String fileSize; 
            private String fileStatus; 
            private String fileType; 
            private String fileUrl; 
            private String formatName; 
            private String height; 
            private String modifiedTime; 
            private String region; 
            private String width; 

            /**
             * <p>The bitrate of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1912.13</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The time when the file was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-30T02:02:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The duration of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>60.00000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>164265080291300080527050.wav</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The size of the file in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>324784</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The status of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder fileStatus(String fileStatus) {
                this.fileStatus = fileStatus;
                return this;
            }

            /**
             * <p>The type of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>source_file</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outin-d3f4681ddfd911ec99a600163e1403e7.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-18180984899.mp4">https://outin-d3f4681ddfd911ec99a600163e1403e7.oss-cn-shanghai.aliyuncs.com/sv/23d5cdd1-18180984899/23d5cdd1-18180984899.mp4</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The encapsulation format of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * <p>The height of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>480</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The time when the file was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-10T12:19Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The region in which the file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The width of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public FileBasicInfo build() {
                return new FileBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class FileInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileBasicInfo")
        private FileBasicInfo fileBasicInfo;

        private FileInfoList(Builder builder) {
            this.fileBasicInfo = builder.fileBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfoList create() {
            return builder().build();
        }

        /**
         * @return fileBasicInfo
         */
        public FileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public static final class Builder {
            private FileBasicInfo fileBasicInfo; 

            /**
             * <p>The basic information about the file, such as the duration and size.</p>
             */
            public Builder fileBasicInfo(FileBasicInfo fileBasicInfo) {
                this.fileBasicInfo = fileBasicInfo;
                return this;
            }

            public FileInfoList build() {
                return new FileInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class IndexStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndexStatus")
        private String indexStatus;

        @com.aliyun.core.annotation.NameInMap("IndexType")
        private String indexType;

        private IndexStatusList(Builder builder) {
            this.indexStatus = builder.indexStatus;
            this.indexType = builder.indexType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexStatusList create() {
            return builder().build();
        }

        /**
         * @return indexStatus
         */
        public String getIndexStatus() {
            return this.indexStatus;
        }

        /**
         * @return indexType
         */
        public String getIndexType() {
            return this.indexType;
        }

        public static final class Builder {
            private String indexStatus; 
            private String indexType; 

            /**
             * IndexStatus.
             */
            public Builder indexStatus(String indexStatus) {
                this.indexStatus = indexStatus;
                return this;
            }

            /**
             * IndexType.
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            public IndexStatusList build() {
                return new IndexStatusList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class MediaBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Biz")
        private String biz;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeletedTime")
        private String deletedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InputURL")
        private String inputURL;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaTags")
        private String mediaTags;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private String snapshots;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SpriteImages")
        private String spriteImages;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TranscodeStatus")
        private String transcodeStatus;

        @com.aliyun.core.annotation.NameInMap("UploadSource")
        private String uploadSource;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private MediaBasicInfo(Builder builder) {
            this.biz = builder.biz;
            this.businessType = builder.businessType;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.category = builder.category;
            this.coverURL = builder.coverURL;
            this.createTime = builder.createTime;
            this.deletedTime = builder.deletedTime;
            this.description = builder.description;
            this.inputURL = builder.inputURL;
            this.mediaId = builder.mediaId;
            this.mediaTags = builder.mediaTags;
            this.mediaType = builder.mediaType;
            this.modifiedTime = builder.modifiedTime;
            this.referenceId = builder.referenceId;
            this.snapshots = builder.snapshots;
            this.source = builder.source;
            this.spriteImages = builder.spriteImages;
            this.status = builder.status;
            this.title = builder.title;
            this.transcodeStatus = builder.transcodeStatus;
            this.uploadSource = builder.uploadSource;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaBasicInfo create() {
            return builder().build();
        }

        /**
         * @return biz
         */
        public String getBiz() {
            return this.biz;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deletedTime
         */
        public String getDeletedTime() {
            return this.deletedTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputURL
         */
        public String getInputURL() {
            return this.inputURL;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaTags
         */
        public String getMediaTags() {
            return this.mediaTags;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        /**
         * @return snapshots
         */
        public String getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return spriteImages
         */
        public String getSpriteImages() {
            return this.spriteImages;
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
         * @return transcodeStatus
         */
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        /**
         * @return uploadSource
         */
        public String getUploadSource() {
            return this.uploadSource;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String biz; 
            private String businessType; 
            private Long cateId; 
            private String cateName; 
            private String category; 
            private String coverURL; 
            private String createTime; 
            private String deletedTime; 
            private String description; 
            private String inputURL; 
            private String mediaId; 
            private String mediaTags; 
            private String mediaType; 
            private String modifiedTime; 
            private String referenceId; 
            private String snapshots; 
            private String source; 
            private String spriteImages; 
            private String status; 
            private String title; 
            private String transcodeStatus; 
            private String uploadSource; 
            private String userData; 

            /**
             * <p>The business to which the media asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>IMS</p>
             */
            public Builder biz(String biz) {
                this.biz = biz;
                return this;
            }

            /**
             * <p>The business type of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>opening</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The category of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The thumbnail URL of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/e694372e-4f5b-4821-ae09-efd064f27b63_large_cover_url.jpg">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/e694372e-4f5b-4821-ae09-efd064f27b63_large_cover_url.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the media asset was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-01T19:48Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the media asset was deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-01T19:48Z</p>
             */
            public Builder deletedTime(String deletedTime) {
                this.deletedTime = deletedTime;
                return this;
            }

            /**
             * <p>The description of the media asset.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The address of the media asset that is waiting to be registered.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://clipres/longvideo/material/voice/prod/20220418/07d7c799f6054dc3bbef250854cf84981650248140427</p>
             */
            public Builder inputURL(String inputURL) {
                this.inputURL = inputURL;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>132bd600fc3c71ec99476732a78f6402</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The tags of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>tags,tags2</p>
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
                return this;
            }

            /**
             * <p>The type of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The time when the media asset was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-01T19:48Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The custom ID of the media asset. The ID is a string that contains 6 to 64 characters. Only letters, digits, hyphens (-), and underscores (_) are supported. Each custom ID is unique.</p>
             * 
             * <strong>example:</strong>
             * <p>123-123</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>The snapshots of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;3&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>f48f0e4154976b2b8c45</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-beijing&quot;,&quot;snapshotRegular&quot;:&quot;example.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e6a6440b29eb60bd7c</strong></strong></strong>&quot;}]</p>
             */
            public Builder snapshots(String snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The source of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The image sprite of the media asset</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;32&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>83ec44d58b2069def2e</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example/example-{Count}.jpg&quot;,&quot;spriteRegular&quot;:&quot;example/example-{TileCount}.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e438b14ff39293eaec25</strong></strong></strong>&quot;,&quot;tileCount&quot;:&quot;1&quot;}]</p>
             */
            public Builder spriteImages(String spriteImages) {
                this.spriteImages = spriteImages;
                return this;
            }

            /**
             * <p>The state of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title of the media asset.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The transcoding status of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Init</p>
             */
            public Builder transcodeStatus(String transcodeStatus) {
                this.transcodeStatus = transcodeStatus;
                return this;
            }

            /**
             * <p>The upload source of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder uploadSource(String uploadSource) {
                this.uploadSource = uploadSource;
                return this;
            }

            /**
             * <p>The user data.</p>
             * 
             * <strong>example:</strong>
             * <p>userData</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MediaBasicInfo build() {
                return new MediaBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
    public static class MediaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiData")
        private AiData aiData;

        @com.aliyun.core.annotation.NameInMap("AiRoughData")
        private AiRoughData aiRoughData;

        @com.aliyun.core.annotation.NameInMap("FileInfoList")
        private java.util.List < FileInfoList> fileInfoList;

        @com.aliyun.core.annotation.NameInMap("IndexStatusList")
        private java.util.List < IndexStatusList> indexStatusList;

        @com.aliyun.core.annotation.NameInMap("MediaBasicInfo")
        private MediaBasicInfo mediaBasicInfo;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private MediaInfoList(Builder builder) {
            this.aiData = builder.aiData;
            this.aiRoughData = builder.aiRoughData;
            this.fileInfoList = builder.fileInfoList;
            this.indexStatusList = builder.indexStatusList;
            this.mediaBasicInfo = builder.mediaBasicInfo;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfoList create() {
            return builder().build();
        }

        /**
         * @return aiData
         */
        public AiData getAiData() {
            return this.aiData;
        }

        /**
         * @return aiRoughData
         */
        public AiRoughData getAiRoughData() {
            return this.aiRoughData;
        }

        /**
         * @return fileInfoList
         */
        public java.util.List < FileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        /**
         * @return indexStatusList
         */
        public java.util.List < IndexStatusList> getIndexStatusList() {
            return this.indexStatusList;
        }

        /**
         * @return mediaBasicInfo
         */
        public MediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private AiData aiData; 
            private AiRoughData aiRoughData; 
            private java.util.List < FileInfoList> fileInfoList; 
            private java.util.List < IndexStatusList> indexStatusList; 
            private MediaBasicInfo mediaBasicInfo; 
            private String mediaId; 

            /**
             * <p>The details of the intelligent AI job.</p>
             */
            public Builder aiData(AiData aiData) {
                this.aiData = aiData;
                return this;
            }

            /**
             * <p>The description of the AI job.</p>
             */
            public Builder aiRoughData(AiRoughData aiRoughData) {
                this.aiRoughData = aiRoughData;
                return this;
            }

            /**
             * <p>The information about the files.</p>
             */
            public Builder fileInfoList(java.util.List < FileInfoList> fileInfoList) {
                this.fileInfoList = fileInfoList;
                return this;
            }

            /**
             * IndexStatusList.
             */
            public Builder indexStatusList(java.util.List < IndexStatusList> indexStatusList) {
                this.indexStatusList = indexStatusList;
                return this;
            }

            /**
             * <p>The basic information about the media asset.</p>
             */
            public Builder mediaBasicInfo(MediaBasicInfo mediaBasicInfo) {
                this.mediaBasicInfo = mediaBasicInfo;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>3b187b3620c8490886cfc2a9578c3ce6</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public MediaInfoList build() {
                return new MediaInfoList(this);
            } 

        } 

    }
}
