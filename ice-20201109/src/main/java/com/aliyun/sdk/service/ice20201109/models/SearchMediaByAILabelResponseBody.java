// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaByAILabelResponseBody</p>
 */
public class SearchMediaByAILabelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MediaList")
    private java.util.List<MediaList> mediaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private SearchMediaByAILabelResponseBody(Builder builder) {
        this.code = builder.code;
        this.mediaList = builder.mediaList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaByAILabelResponseBody create() {
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
     * @return mediaList
     */
    public java.util.List<MediaList> getMediaList() {
        return this.mediaList;
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
        private java.util.List<MediaList> mediaList; 
        private String requestId; 
        private String success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(SearchMediaByAILabelResponseBody model) {
            this.code = model.code;
            this.mediaList = model.mediaList;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

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
         * <p>The media assets that contain the specified content.</p>
         */
        public Builder mediaList(java.util.List<MediaList> mediaList) {
            this.mediaList = mediaList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of audio and video files that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaByAILabelResponseBody build() {
            return new SearchMediaByAILabelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByAILabelResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tracks model) {
                this.position = model.position;
                this.size = model.size;
                this.timestamp = model.timestamp;
            } 

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
             * <p>50</p>
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
     * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByAILabelResponseBody</p>
     */
    public static class Occurrences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipId")
        private String clipId;

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
        private java.util.List<Tracks> tracks;

        private Occurrences(Builder builder) {
            this.clipId = builder.clipId;
            this.content = builder.content;
            this.finegrainId = builder.finegrainId;
            this.finegrainName = builder.finegrainName;
            this.from = builder.from;
            this.image = builder.image;
            this.score = builder.score;
            this.tableBatchSeqId = builder.tableBatchSeqId;
            this.to = builder.to;
            this.tracks = builder.tracks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Occurrences create() {
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
        public java.util.List<Tracks> getTracks() {
            return this.tracks;
        }

        public static final class Builder {
            private String clipId; 
            private String content; 
            private String finegrainId; 
            private String finegrainName; 
            private Double from; 
            private String image; 
            private Double score; 
            private String tableBatchSeqId; 
            private Double to; 
            private java.util.List<Tracks> tracks; 

            private Builder() {
            } 

            private Builder(Occurrences model) {
                this.clipId = model.clipId;
                this.content = model.content;
                this.finegrainId = model.finegrainId;
                this.finegrainName = model.finegrainName;
                this.from = model.from;
                this.image = model.image;
                this.score = model.score;
                this.tableBatchSeqId = model.tableBatchSeqId;
                this.to = model.to;
                this.tracks = model.tracks;
            } 

            /**
             * <p>The ID of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>158730355E4B82257D8AA1583A58****</p>
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            /**
             * <p>The content of the text.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The fine-grained ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>103102503**</p>
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
             * <p>The image that contains the most face information.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://service-****-public.oss-cn-hangzhou.aliyuncs.com/1563457****438522/service-image/f788974f-9595-43b2-a478-7c7a1afb****.jpg">https://service-****-public.oss-cn-hangzhou.aliyuncs.com/1563457****438522/service-image/f788974f-9595-43b2-a478-7c7a1afb****.jpg</a></p>
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
             * <p>85010D1**</p>
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
             * <p>The tracks.</p>
             */
            public Builder tracks(java.util.List<Tracks> tracks) {
                this.tracks = tracks;
                return this;
            }

            public Occurrences build() {
                return new Occurrences(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByAILabelResponseBody</p>
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
        private java.util.List<Occurrences> occurrences;

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
        public java.util.List<Occurrences> getOccurrences() {
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
            private java.util.List<Occurrences> occurrences; 
            private String source; 

            private Builder() {
            } 

            private Builder(AiLabelInfo model) {
                this.category = model.category;
                this.faceId = model.faceId;
                this.labelId = model.labelId;
                this.labelName = model.labelName;
                this.labelType = model.labelType;
                this.occurrences = model.occurrences;
                this.source = model.source;
            } 

            /**
             * <p>The category.</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the face.</p>
             * 
             * <strong>example:</strong>
             * <p>5FE19530C7A422197535FE74F5DB****</p>
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * <p>The ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>103102503**</p>
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
             * <p>The information about the clips.</p>
             */
            public Builder occurrences(java.util.List<Occurrences> occurrences) {
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
     * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByAILabelResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AsrInfo model) {
                this.clipId = model.clipId;
                this.content = model.content;
                this.from = model.from;
                this.timestamp = model.timestamp;
                this.to = model.to;
            } 

            /**
             * <p>The ID of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>5FE19530C7A422197535FE74F5DB****</p>
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            /**
             * <p>The content of the audio.</p>
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
     * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByAILabelResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OcrInfo model) {
                this.clipId = model.clipId;
                this.content = model.content;
                this.from = model.from;
                this.timestamp = model.timestamp;
                this.to = model.to;
            } 

            /**
             * <p>The ID of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>5FE19530C7A422197535FE74F5DB****</p>
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            /**
             * <p>The content of the text.</p>
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
     * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByAILabelResponseBody</p>
     */
    public static class AiData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiLabelInfo")
        private java.util.List<AiLabelInfo> aiLabelInfo;

        @com.aliyun.core.annotation.NameInMap("AsrInfo")
        private java.util.List<AsrInfo> asrInfo;

        @com.aliyun.core.annotation.NameInMap("OcrInfo")
        private java.util.List<OcrInfo> ocrInfo;

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
        public java.util.List<AiLabelInfo> getAiLabelInfo() {
            return this.aiLabelInfo;
        }

        /**
         * @return asrInfo
         */
        public java.util.List<AsrInfo> getAsrInfo() {
            return this.asrInfo;
        }

        /**
         * @return ocrInfo
         */
        public java.util.List<OcrInfo> getOcrInfo() {
            return this.ocrInfo;
        }

        public static final class Builder {
            private java.util.List<AiLabelInfo> aiLabelInfo; 
            private java.util.List<AsrInfo> asrInfo; 
            private java.util.List<OcrInfo> ocrInfo; 

            private Builder() {
            } 

            private Builder(AiData model) {
                this.aiLabelInfo = model.aiLabelInfo;
                this.asrInfo = model.asrInfo;
                this.ocrInfo = model.ocrInfo;
            } 

            /**
             * <p>The tags of the AI job.</p>
             */
            public Builder aiLabelInfo(java.util.List<AiLabelInfo> aiLabelInfo) {
                this.aiLabelInfo = aiLabelInfo;
                return this;
            }

            /**
             * <p>The information about audio files.</p>
             */
            public Builder asrInfo(java.util.List<AsrInfo> asrInfo) {
                this.asrInfo = asrInfo;
                return this;
            }

            /**
             * <p>The information about subtitle files.</p>
             */
            public Builder ocrInfo(java.util.List<OcrInfo> ocrInfo) {
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
     * {@link SearchMediaByAILabelResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByAILabelResponseBody</p>
     */
    public static class MediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiData")
        private AiData aiData;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private java.util.List<String> snapshots;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private MediaList(Builder builder) {
            this.aiData = builder.aiData;
            this.appId = builder.appId;
            this.coverUrl = builder.coverUrl;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.mediaId = builder.mediaId;
            this.modificationTime = builder.modificationTime;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaList create() {
            return builder().build();
        }

        /**
         * @return aiData
         */
        public AiData getAiData() {
            return this.aiData;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshots
         */
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private AiData aiData; 
            private String appId; 
            private String coverUrl; 
            private String creationTime; 
            private String description; 
            private Float duration; 
            private String mediaId; 
            private String modificationTime; 
            private Long size; 
            private java.util.List<String> snapshots; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 

            private Builder() {
            } 

            private Builder(MediaList model) {
                this.aiData = model.aiData;
                this.appId = model.appId;
                this.coverUrl = model.coverUrl;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.duration = model.duration;
                this.mediaId = model.mediaId;
                this.modificationTime = model.modificationTime;
                this.size = model.size;
                this.snapshots = model.snapshots;
                this.status = model.status;
                this.storageLocation = model.storageLocation;
                this.tags = model.tags;
                this.title = model.title;
            } 

            /**
             * <p>The details of the AI job.</p>
             */
            public Builder aiData(AiData aiData) {
                this.aiData = aiData;
                return this;
            }

            /**
             * <p>The ID of the application. Default value: app-1000000.</p>
             * 
             * <strong>example:</strong>
             * <p>app-1000000</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The URL of the thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.aliyundoc.com/snapshot/****.jpg?auth_key=1498476426-0-0-f00b9455c49a423ce69cf4e27333">http://example.aliyundoc.com/snapshot/****.jpg?auth_key=1498476426-0-0-f00b9455c49a423ce69cf4e27333</a>****</p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>The time when the media asset was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T09:15:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * <p>The duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12.2</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1c6ce34007d571ed94667630a6bc****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The time when the media asset was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T09:15:50Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The size of the source file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10897890</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The array of video snapshot URLs.</p>
             */
            public Builder snapshots(java.util.List<String> snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The status of the video.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>PrepareFail</li>
             * <li>UploadFail</li>
             * <li>Init</li>
             * <li>UploadSucc</li>
             * <li>Transcoding</li>
             * <li>TranscodeFail</li>
             * <li>Deleted</li>
             * <li>Normal</li>
             * <li>Uploading</li>
             * <li>Preparing</li>
             * <li>Blocked</li>
             * <li>Checking</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage address.</p>
             * 
             * <strong>example:</strong>
             * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the media asset.</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the media asset.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public MediaList build() {
                return new MediaList(this);
            } 

        } 

    }
}
