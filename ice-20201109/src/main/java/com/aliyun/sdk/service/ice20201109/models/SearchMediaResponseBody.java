// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaResponseBody</p>
 */
public class SearchMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("MediaInfoList")
    private java.util.List < MediaInfoList> mediaInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScrollToken")
    private String scrollToken;

    @NameInMap("Success")
    private String success;

    @NameInMap("Total")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * MediaInfoList.
         */
        public Builder mediaInfoList(java.util.List < MediaInfoList> mediaInfoList) {
            this.mediaInfoList = mediaInfoList;
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
         * ScrollToken.
         */
        public Builder scrollToken(String scrollToken) {
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaResponseBody build() {
            return new SearchMediaResponseBody(this);
        } 

    } 

    public static class Tracks extends TeaModel {
        @NameInMap("Position")
        private String position;

        @NameInMap("Size")
        private Double size;

        @NameInMap("Timestamp")
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
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Double size) {
                this.size = size;
                return this;
            }

            /**
             * Timestamp.
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
    public static class Occurrences extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("FinegrainId")
        private String finegrainId;

        @NameInMap("FinegrainName")
        private String finegrainName;

        @NameInMap("From")
        private Double from;

        @NameInMap("Image")
        private String image;

        @NameInMap("Score")
        private Double score;

        @NameInMap("TableBatchSeqId")
        private String tableBatchSeqId;

        @NameInMap("To")
        private Double to;

        @NameInMap("Tracks")
        private java.util.List < Tracks> tracks;

        @NameInMap("clipId")
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FinegrainId.
             */
            public Builder finegrainId(String finegrainId) {
                this.finegrainId = finegrainId;
                return this;
            }

            /**
             * FinegrainName.
             */
            public Builder finegrainName(String finegrainName) {
                this.finegrainName = finegrainName;
                return this;
            }

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * TableBatchSeqId.
             */
            public Builder tableBatchSeqId(String tableBatchSeqId) {
                this.tableBatchSeqId = tableBatchSeqId;
                return this;
            }

            /**
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            /**
             * Tracks.
             */
            public Builder tracks(java.util.List < Tracks> tracks) {
                this.tracks = tracks;
                return this;
            }

            /**
             * clipId.
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
    public static class AiLabelInfo extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("LabelId")
        private String labelId;

        @NameInMap("LabelName")
        private String labelName;

        @NameInMap("LabelType")
        private String labelType;

        @NameInMap("Occurrences")
        private java.util.List < Occurrences> occurrences;

        @NameInMap("Source")
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * LabelId.
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * LabelName.
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * LabelType.
             */
            public Builder labelType(String labelType) {
                this.labelType = labelType;
                return this;
            }

            /**
             * Occurrences.
             */
            public Builder occurrences(java.util.List < Occurrences> occurrences) {
                this.occurrences = occurrences;
                return this;
            }

            /**
             * Source.
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
    public static class AsrInfo extends TeaModel {
        @NameInMap("ClipId")
        private String clipId;

        @NameInMap("Content")
        private String content;

        @NameInMap("From")
        private Double from;

        @NameInMap("Timestamp")
        private Double timestamp;

        @NameInMap("To")
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
             * ClipId.
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
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
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Double timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * To.
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
    public static class OcrInfo extends TeaModel {
        @NameInMap("ClipId")
        private String clipId;

        @NameInMap("Content")
        private String content;

        @NameInMap("From")
        private Double from;

        @NameInMap("Timestamp")
        private Double timestamp;

        @NameInMap("To")
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
             * ClipId.
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
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
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Double timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * To.
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
    public static class AiData extends TeaModel {
        @NameInMap("AiLabelInfo")
        private java.util.List < AiLabelInfo> aiLabelInfo;

        @NameInMap("AsrInfo")
        private java.util.List < AsrInfo> asrInfo;

        @NameInMap("OcrInfo")
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
             * AiLabelInfo.
             */
            public Builder aiLabelInfo(java.util.List < AiLabelInfo> aiLabelInfo) {
                this.aiLabelInfo = aiLabelInfo;
                return this;
            }

            /**
             * AsrInfo.
             */
            public Builder asrInfo(java.util.List < AsrInfo> asrInfo) {
                this.asrInfo = asrInfo;
                return this;
            }

            /**
             * OcrInfo.
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
    public static class AiRoughData extends TeaModel {
        @NameInMap("AiCategory")
        private String aiCategory;

        @NameInMap("AiJobId")
        private String aiJobId;

        @NameInMap("Result")
        private String result;

        @NameInMap("SaveType")
        private String saveType;

        @NameInMap("Status")
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
             * 电视剧
             */
            public Builder aiCategory(String aiCategory) {
                this.aiCategory = aiCategory;
                return this;
            }

            /**
             * AiJobId.
             */
            public Builder aiJobId(String aiJobId) {
                this.aiJobId = aiJobId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * SaveType.
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            /**
             * Status.
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
    public static class FileBasicInfo extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("FileStatus")
        private String fileStatus;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("FormatName")
        private String formatName;

        @NameInMap("Height")
        private String height;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Region")
        private String region;

        @NameInMap("Width")
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
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
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
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileStatus.
             */
            public Builder fileStatus(String fileStatus) {
                this.fileStatus = fileStatus;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * FormatName.
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Width.
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
    public static class FileInfoList extends TeaModel {
        @NameInMap("FileBasicInfo")
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
             * FileBasicInfo.
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
    public static class MediaBasicInfo extends TeaModel {
        @NameInMap("Biz")
        private String biz;

        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("Category")
        private String category;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeletedTime")
        private String deletedTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InputURL")
        private String inputURL;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaTags")
        private String mediaTags;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ReferenceId")
        private String referenceId;

        @NameInMap("Snapshots")
        private String snapshots;

        @NameInMap("Source")
        private String source;

        @NameInMap("SpriteImages")
        private String spriteImages;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("TranscodeStatus")
        private String transcodeStatus;

        @NameInMap("UploadSource")
        private String uploadSource;

        @NameInMap("UserData")
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
             * Biz.
             */
            public Builder biz(String biz) {
                this.biz = biz;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * CateId.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
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
             * DeletedTime.
             */
            public Builder deletedTime(String deletedTime) {
                this.deletedTime = deletedTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InputURL.
             */
            public Builder inputURL(String inputURL) {
                this.inputURL = inputURL;
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
             * MediaTags.
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ReferenceId.
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * Snapshots.
             */
            public Builder snapshots(String snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SpriteImages.
             */
            public Builder spriteImages(String spriteImages) {
                this.spriteImages = spriteImages;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * TranscodeStatus.
             */
            public Builder transcodeStatus(String transcodeStatus) {
                this.transcodeStatus = transcodeStatus;
                return this;
            }

            /**
             * UploadSource.
             */
            public Builder uploadSource(String uploadSource) {
                this.uploadSource = uploadSource;
                return this;
            }

            /**
             * UserData.
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
    public static class MediaInfoList extends TeaModel {
        @NameInMap("AiData")
        private AiData aiData;

        @NameInMap("AiRoughData")
        private AiRoughData aiRoughData;

        @NameInMap("FileInfoList")
        private java.util.List < FileInfoList> fileInfoList;

        @NameInMap("MediaBasicInfo")
        private MediaBasicInfo mediaBasicInfo;

        @NameInMap("MediaId")
        private String mediaId;

        private MediaInfoList(Builder builder) {
            this.aiData = builder.aiData;
            this.aiRoughData = builder.aiRoughData;
            this.fileInfoList = builder.fileInfoList;
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
            private MediaBasicInfo mediaBasicInfo; 
            private String mediaId; 

            /**
             * AiData.
             */
            public Builder aiData(AiData aiData) {
                this.aiData = aiData;
                return this;
            }

            /**
             * AiRoughData.
             */
            public Builder aiRoughData(AiRoughData aiRoughData) {
                this.aiRoughData = aiRoughData;
                return this;
            }

            /**
             * FileInfos。
             */
            public Builder fileInfoList(java.util.List < FileInfoList> fileInfoList) {
                this.fileInfoList = fileInfoList;
                return this;
            }

            /**
             * MediaBasicInfo.
             */
            public Builder mediaBasicInfo(MediaBasicInfo mediaBasicInfo) {
                this.mediaBasicInfo = mediaBasicInfo;
                return this;
            }

            /**
             * MediaId.
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
