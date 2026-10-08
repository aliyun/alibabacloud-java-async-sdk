// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link File} extends {@link TeaModel}
 *
 * <p>File</p>
 */
public class File extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessControlAllowOrigin")
    private String accessControlAllowOrigin;

    @com.aliyun.core.annotation.NameInMap("AccessControlRequestMethod")
    private String accessControlRequestMethod;

    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<Address> addresses;

    @com.aliyun.core.annotation.NameInMap("Album")
    private String album;

    @com.aliyun.core.annotation.NameInMap("AlbumArtist")
    private String albumArtist;

    @com.aliyun.core.annotation.NameInMap("Artist")
    private String artist;

    @com.aliyun.core.annotation.NameInMap("AudioCovers")
    private java.util.List<Image> audioCovers;

    @com.aliyun.core.annotation.NameInMap("AudioStreams")
    private java.util.List<AudioStream> audioStreams;

    @com.aliyun.core.annotation.NameInMap("Bitrate")
    private Long bitrate;

    @com.aliyun.core.annotation.NameInMap("CacheControl")
    private String cacheControl;

    @com.aliyun.core.annotation.NameInMap("Composer")
    private String composer;

    @com.aliyun.core.annotation.NameInMap("ContentDisposition")
    private String contentDisposition;

    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.NameInMap("ContentLanguage")
    private String contentLanguage;

    @com.aliyun.core.annotation.NameInMap("ContentMd5")
    private String contentMd5;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CroppingSuggestions")
    private java.util.List<CroppingSuggestion> croppingSuggestions;

    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map<String, ?> customLabels;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Double duration;

    @com.aliyun.core.annotation.NameInMap("ETag")
    private String eTag;

    @com.aliyun.core.annotation.NameInMap("EXIF")
    private String EXIF;

    @com.aliyun.core.annotation.NameInMap("Elements")
    private java.util.List<Element> elements;

    @com.aliyun.core.annotation.NameInMap("FigureCount")
    private Long figureCount;

    @com.aliyun.core.annotation.NameInMap("Figures")
    private java.util.List<Figure> figures;

    @com.aliyun.core.annotation.NameInMap("FileAccessTime")
    private String fileAccessTime;

    @com.aliyun.core.annotation.NameInMap("FileCreateTime")
    private String fileCreateTime;

    @com.aliyun.core.annotation.NameInMap("FileHash")
    private String fileHash;

    @com.aliyun.core.annotation.NameInMap("FileModifiedTime")
    private String fileModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Filename")
    private String filename;

    @com.aliyun.core.annotation.NameInMap("FormatLongName")
    private String formatLongName;

    @com.aliyun.core.annotation.NameInMap("FormatName")
    private String formatName;

    @com.aliyun.core.annotation.NameInMap("ImageHeight")
    private Long imageHeight;

    @com.aliyun.core.annotation.NameInMap("ImageScore")
    private ImageScore imageScore;

    @com.aliyun.core.annotation.NameInMap("ImageWidth")
    private Long imageWidth;

    @com.aliyun.core.annotation.NameInMap("Insights")
    private Insights insights;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("LatLong")
    private String latLong;

    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.NameInMap("OCRContents")
    private java.util.List<OCRContents> OCRContents;

    @com.aliyun.core.annotation.NameInMap("OCRTexts")
    private String OCRTexts;

    @com.aliyun.core.annotation.NameInMap("OSSCRC64")
    private String OSSCRC64;

    @com.aliyun.core.annotation.NameInMap("OSSDeleteMarker")
    private String OSSDeleteMarker;

    @com.aliyun.core.annotation.NameInMap("OSSExpiration")
    private String OSSExpiration;

    @com.aliyun.core.annotation.NameInMap("OSSObjectType")
    private String OSSObjectType;

    @com.aliyun.core.annotation.NameInMap("OSSStorageClass")
    private String OSSStorageClass;

    @com.aliyun.core.annotation.NameInMap("OSSTagging")
    private java.util.Map<String, ?> OSSTagging;

    @com.aliyun.core.annotation.NameInMap("OSSTaggingCount")
    private Long OSSTaggingCount;

    @com.aliyun.core.annotation.NameInMap("OSSURI")
    private String OSSURI;

    @com.aliyun.core.annotation.NameInMap("OSSUserMeta")
    private java.util.Map<String, ?> OSSUserMeta;

    @com.aliyun.core.annotation.NameInMap("OSSVersionId")
    private String OSSVersionId;

    @com.aliyun.core.annotation.NameInMap("ObjectACL")
    private String objectACL;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("ObjectStatus")
    private String objectStatus;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("Orientation")
    private Long orientation;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("Performer")
    private String performer;

    @com.aliyun.core.annotation.NameInMap("ProduceTime")
    private String produceTime;

    @com.aliyun.core.annotation.NameInMap("ProgramCount")
    private Long programCount;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("SceneElements")
    private java.util.List<SceneElement> sceneElements;

    @com.aliyun.core.annotation.NameInMap("SemanticTypes")
    private java.util.List<String> semanticTypes;

    @com.aliyun.core.annotation.NameInMap("ServerSideDataEncryption")
    private String serverSideDataEncryption;

    @com.aliyun.core.annotation.NameInMap("ServerSideEncryption")
    private String serverSideEncryption;

    @com.aliyun.core.annotation.NameInMap("ServerSideEncryptionCustomerAlgorithm")
    private String serverSideEncryptionCustomerAlgorithm;

    @com.aliyun.core.annotation.NameInMap("ServerSideEncryptionKeyId")
    private String serverSideEncryptionKeyId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Double startTime;

    @com.aliyun.core.annotation.NameInMap("StreamCount")
    private Long streamCount;

    @com.aliyun.core.annotation.NameInMap("Subtitles")
    private java.util.List<SubtitleStream> subtitles;

    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("TravelClusterId")
    private String travelClusterId;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("VideoHeight")
    private Long videoHeight;

    @com.aliyun.core.annotation.NameInMap("VideoStreams")
    private java.util.List<VideoStream> videoStreams;

    @com.aliyun.core.annotation.NameInMap("VideoWidth")
    private Long videoWidth;

    private File(Builder builder) {
        this.accessControlAllowOrigin = builder.accessControlAllowOrigin;
        this.accessControlRequestMethod = builder.accessControlRequestMethod;
        this.addresses = builder.addresses;
        this.album = builder.album;
        this.albumArtist = builder.albumArtist;
        this.artist = builder.artist;
        this.audioCovers = builder.audioCovers;
        this.audioStreams = builder.audioStreams;
        this.bitrate = builder.bitrate;
        this.cacheControl = builder.cacheControl;
        this.composer = builder.composer;
        this.contentDisposition = builder.contentDisposition;
        this.contentEncoding = builder.contentEncoding;
        this.contentLanguage = builder.contentLanguage;
        this.contentMd5 = builder.contentMd5;
        this.contentType = builder.contentType;
        this.createTime = builder.createTime;
        this.croppingSuggestions = builder.croppingSuggestions;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.duration = builder.duration;
        this.eTag = builder.eTag;
        this.EXIF = builder.EXIF;
        this.elements = builder.elements;
        this.figureCount = builder.figureCount;
        this.figures = builder.figures;
        this.fileAccessTime = builder.fileAccessTime;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileHash = builder.fileHash;
        this.fileModifiedTime = builder.fileModifiedTime;
        this.filename = builder.filename;
        this.formatLongName = builder.formatLongName;
        this.formatName = builder.formatName;
        this.imageHeight = builder.imageHeight;
        this.imageScore = builder.imageScore;
        this.imageWidth = builder.imageWidth;
        this.insights = builder.insights;
        this.labels = builder.labels;
        this.language = builder.language;
        this.latLong = builder.latLong;
        this.mediaType = builder.mediaType;
        this.OCRContents = builder.OCRContents;
        this.OCRTexts = builder.OCRTexts;
        this.OSSCRC64 = builder.OSSCRC64;
        this.OSSDeleteMarker = builder.OSSDeleteMarker;
        this.OSSExpiration = builder.OSSExpiration;
        this.OSSObjectType = builder.OSSObjectType;
        this.OSSStorageClass = builder.OSSStorageClass;
        this.OSSTagging = builder.OSSTagging;
        this.OSSTaggingCount = builder.OSSTaggingCount;
        this.OSSURI = builder.OSSURI;
        this.OSSUserMeta = builder.OSSUserMeta;
        this.OSSVersionId = builder.OSSVersionId;
        this.objectACL = builder.objectACL;
        this.objectId = builder.objectId;
        this.objectStatus = builder.objectStatus;
        this.objectType = builder.objectType;
        this.orientation = builder.orientation;
        this.ownerId = builder.ownerId;
        this.pageCount = builder.pageCount;
        this.performer = builder.performer;
        this.produceTime = builder.produceTime;
        this.programCount = builder.programCount;
        this.projectName = builder.projectName;
        this.reason = builder.reason;
        this.sceneElements = builder.sceneElements;
        this.semanticTypes = builder.semanticTypes;
        this.serverSideDataEncryption = builder.serverSideDataEncryption;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.serverSideEncryptionCustomerAlgorithm = builder.serverSideEncryptionCustomerAlgorithm;
        this.serverSideEncryptionKeyId = builder.serverSideEncryptionKeyId;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.streamCount = builder.streamCount;
        this.subtitles = builder.subtitles;
        this.timezone = builder.timezone;
        this.title = builder.title;
        this.travelClusterId = builder.travelClusterId;
        this.URI = builder.URI;
        this.updateTime = builder.updateTime;
        this.videoHeight = builder.videoHeight;
        this.videoStreams = builder.videoStreams;
        this.videoWidth = builder.videoWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static File create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessControlAllowOrigin
     */
    public String getAccessControlAllowOrigin() {
        return this.accessControlAllowOrigin;
    }

    /**
     * @return accessControlRequestMethod
     */
    public String getAccessControlRequestMethod() {
        return this.accessControlRequestMethod;
    }

    /**
     * @return addresses
     */
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    /**
     * @return album
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * @return albumArtist
     */
    public String getAlbumArtist() {
        return this.albumArtist;
    }

    /**
     * @return artist
     */
    public String getArtist() {
        return this.artist;
    }

    /**
     * @return audioCovers
     */
    public java.util.List<Image> getAudioCovers() {
        return this.audioCovers;
    }

    /**
     * @return audioStreams
     */
    public java.util.List<AudioStream> getAudioStreams() {
        return this.audioStreams;
    }

    /**
     * @return bitrate
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * @return cacheControl
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * @return composer
     */
    public String getComposer() {
        return this.composer;
    }

    /**
     * @return contentDisposition
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return contentLanguage
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * @return contentMd5
     */
    public String getContentMd5() {
        return this.contentMd5;
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
     * @return croppingSuggestions
     */
    public java.util.List<CroppingSuggestion> getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return duration
     */
    public Double getDuration() {
        return this.duration;
    }

    /**
     * @return eTag
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * @return EXIF
     */
    public String getEXIF() {
        return this.EXIF;
    }

    /**
     * @return elements
     */
    public java.util.List<Element> getElements() {
        return this.elements;
    }

    /**
     * @return figureCount
     */
    public Long getFigureCount() {
        return this.figureCount;
    }

    /**
     * @return figures
     */
    public java.util.List<Figure> getFigures() {
        return this.figures;
    }

    /**
     * @return fileAccessTime
     */
    public String getFileAccessTime() {
        return this.fileAccessTime;
    }

    /**
     * @return fileCreateTime
     */
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    /**
     * @return fileHash
     */
    public String getFileHash() {
        return this.fileHash;
    }

    /**
     * @return fileModifiedTime
     */
    public String getFileModifiedTime() {
        return this.fileModifiedTime;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return formatLongName
     */
    public String getFormatLongName() {
        return this.formatLongName;
    }

    /**
     * @return formatName
     */
    public String getFormatName() {
        return this.formatName;
    }

    /**
     * @return imageHeight
     */
    public Long getImageHeight() {
        return this.imageHeight;
    }

    /**
     * @return imageScore
     */
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    /**
     * @return imageWidth
     */
    public Long getImageWidth() {
        return this.imageWidth;
    }

    /**
     * @return insights
     */
    public Insights getInsights() {
        return this.insights;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return latLong
     */
    public String getLatLong() {
        return this.latLong;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return OCRContents
     */
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

    /**
     * @return OCRTexts
     */
    public String getOCRTexts() {
        return this.OCRTexts;
    }

    /**
     * @return OSSCRC64
     */
    public String getOSSCRC64() {
        return this.OSSCRC64;
    }

    /**
     * @return OSSDeleteMarker
     */
    public String getOSSDeleteMarker() {
        return this.OSSDeleteMarker;
    }

    /**
     * @return OSSExpiration
     */
    public String getOSSExpiration() {
        return this.OSSExpiration;
    }

    /**
     * @return OSSObjectType
     */
    public String getOSSObjectType() {
        return this.OSSObjectType;
    }

    /**
     * @return OSSStorageClass
     */
    public String getOSSStorageClass() {
        return this.OSSStorageClass;
    }

    /**
     * @return OSSTagging
     */
    public java.util.Map<String, ?> getOSSTagging() {
        return this.OSSTagging;
    }

    /**
     * @return OSSTaggingCount
     */
    public Long getOSSTaggingCount() {
        return this.OSSTaggingCount;
    }

    /**
     * @return OSSURI
     */
    public String getOSSURI() {
        return this.OSSURI;
    }

    /**
     * @return OSSUserMeta
     */
    public java.util.Map<String, ?> getOSSUserMeta() {
        return this.OSSUserMeta;
    }

    /**
     * @return OSSVersionId
     */
    public String getOSSVersionId() {
        return this.OSSVersionId;
    }

    /**
     * @return objectACL
     */
    public String getObjectACL() {
        return this.objectACL;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectStatus
     */
    public String getObjectStatus() {
        return this.objectStatus;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return orientation
     */
    public Long getOrientation() {
        return this.orientation;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
    }

    /**
     * @return performer
     */
    public String getPerformer() {
        return this.performer;
    }

    /**
     * @return produceTime
     */
    public String getProduceTime() {
        return this.produceTime;
    }

    /**
     * @return programCount
     */
    public Long getProgramCount() {
        return this.programCount;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sceneElements
     */
    public java.util.List<SceneElement> getSceneElements() {
        return this.sceneElements;
    }

    /**
     * @return semanticTypes
     */
    public java.util.List<String> getSemanticTypes() {
        return this.semanticTypes;
    }

    /**
     * @return serverSideDataEncryption
     */
    public String getServerSideDataEncryption() {
        return this.serverSideDataEncryption;
    }

    /**
     * @return serverSideEncryption
     */
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    /**
     * @return serverSideEncryptionCustomerAlgorithm
     */
    public String getServerSideEncryptionCustomerAlgorithm() {
        return this.serverSideEncryptionCustomerAlgorithm;
    }

    /**
     * @return serverSideEncryptionKeyId
     */
    public String getServerSideEncryptionKeyId() {
        return this.serverSideEncryptionKeyId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public Double getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamCount
     */
    public Long getStreamCount() {
        return this.streamCount;
    }

    /**
     * @return subtitles
     */
    public java.util.List<SubtitleStream> getSubtitles() {
        return this.subtitles;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return travelClusterId
     */
    public String getTravelClusterId() {
        return this.travelClusterId;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return videoHeight
     */
    public Long getVideoHeight() {
        return this.videoHeight;
    }

    /**
     * @return videoStreams
     */
    public java.util.List<VideoStream> getVideoStreams() {
        return this.videoStreams;
    }

    /**
     * @return videoWidth
     */
    public Long getVideoWidth() {
        return this.videoWidth;
    }

    public static final class Builder {
        private String accessControlAllowOrigin; 
        private String accessControlRequestMethod; 
        private java.util.List<Address> addresses; 
        private String album; 
        private String albumArtist; 
        private String artist; 
        private java.util.List<Image> audioCovers; 
        private java.util.List<AudioStream> audioStreams; 
        private Long bitrate; 
        private String cacheControl; 
        private String composer; 
        private String contentDisposition; 
        private String contentEncoding; 
        private String contentLanguage; 
        private String contentMd5; 
        private String contentType; 
        private String createTime; 
        private java.util.List<CroppingSuggestion> croppingSuggestions; 
        private String customId; 
        private java.util.Map<String, ?> customLabels; 
        private String datasetName; 
        private Double duration; 
        private String eTag; 
        private String EXIF; 
        private java.util.List<Element> elements; 
        private Long figureCount; 
        private java.util.List<Figure> figures; 
        private String fileAccessTime; 
        private String fileCreateTime; 
        private String fileHash; 
        private String fileModifiedTime; 
        private String filename; 
        private String formatLongName; 
        private String formatName; 
        private Long imageHeight; 
        private ImageScore imageScore; 
        private Long imageWidth; 
        private Insights insights; 
        private java.util.List<Label> labels; 
        private String language; 
        private String latLong; 
        private String mediaType; 
        private java.util.List<OCRContents> OCRContents; 
        private String OCRTexts; 
        private String OSSCRC64; 
        private String OSSDeleteMarker; 
        private String OSSExpiration; 
        private String OSSObjectType; 
        private String OSSStorageClass; 
        private java.util.Map<String, ?> OSSTagging; 
        private Long OSSTaggingCount; 
        private String OSSURI; 
        private java.util.Map<String, ?> OSSUserMeta; 
        private String OSSVersionId; 
        private String objectACL; 
        private String objectId; 
        private String objectStatus; 
        private String objectType; 
        private Long orientation; 
        private String ownerId; 
        private Long pageCount; 
        private String performer; 
        private String produceTime; 
        private Long programCount; 
        private String projectName; 
        private String reason; 
        private java.util.List<SceneElement> sceneElements; 
        private java.util.List<String> semanticTypes; 
        private String serverSideDataEncryption; 
        private String serverSideEncryption; 
        private String serverSideEncryptionCustomerAlgorithm; 
        private String serverSideEncryptionKeyId; 
        private Long size; 
        private Double startTime; 
        private Long streamCount; 
        private java.util.List<SubtitleStream> subtitles; 
        private String timezone; 
        private String title; 
        private String travelClusterId; 
        private String URI; 
        private String updateTime; 
        private Long videoHeight; 
        private java.util.List<VideoStream> videoStreams; 
        private Long videoWidth; 

        private Builder() {
        } 

        private Builder(File model) {
            this.accessControlAllowOrigin = model.accessControlAllowOrigin;
            this.accessControlRequestMethod = model.accessControlRequestMethod;
            this.addresses = model.addresses;
            this.album = model.album;
            this.albumArtist = model.albumArtist;
            this.artist = model.artist;
            this.audioCovers = model.audioCovers;
            this.audioStreams = model.audioStreams;
            this.bitrate = model.bitrate;
            this.cacheControl = model.cacheControl;
            this.composer = model.composer;
            this.contentDisposition = model.contentDisposition;
            this.contentEncoding = model.contentEncoding;
            this.contentLanguage = model.contentLanguage;
            this.contentMd5 = model.contentMd5;
            this.contentType = model.contentType;
            this.createTime = model.createTime;
            this.croppingSuggestions = model.croppingSuggestions;
            this.customId = model.customId;
            this.customLabels = model.customLabels;
            this.datasetName = model.datasetName;
            this.duration = model.duration;
            this.eTag = model.eTag;
            this.EXIF = model.EXIF;
            this.elements = model.elements;
            this.figureCount = model.figureCount;
            this.figures = model.figures;
            this.fileAccessTime = model.fileAccessTime;
            this.fileCreateTime = model.fileCreateTime;
            this.fileHash = model.fileHash;
            this.fileModifiedTime = model.fileModifiedTime;
            this.filename = model.filename;
            this.formatLongName = model.formatLongName;
            this.formatName = model.formatName;
            this.imageHeight = model.imageHeight;
            this.imageScore = model.imageScore;
            this.imageWidth = model.imageWidth;
            this.insights = model.insights;
            this.labels = model.labels;
            this.language = model.language;
            this.latLong = model.latLong;
            this.mediaType = model.mediaType;
            this.OCRContents = model.OCRContents;
            this.OCRTexts = model.OCRTexts;
            this.OSSCRC64 = model.OSSCRC64;
            this.OSSDeleteMarker = model.OSSDeleteMarker;
            this.OSSExpiration = model.OSSExpiration;
            this.OSSObjectType = model.OSSObjectType;
            this.OSSStorageClass = model.OSSStorageClass;
            this.OSSTagging = model.OSSTagging;
            this.OSSTaggingCount = model.OSSTaggingCount;
            this.OSSURI = model.OSSURI;
            this.OSSUserMeta = model.OSSUserMeta;
            this.OSSVersionId = model.OSSVersionId;
            this.objectACL = model.objectACL;
            this.objectId = model.objectId;
            this.objectStatus = model.objectStatus;
            this.objectType = model.objectType;
            this.orientation = model.orientation;
            this.ownerId = model.ownerId;
            this.pageCount = model.pageCount;
            this.performer = model.performer;
            this.produceTime = model.produceTime;
            this.programCount = model.programCount;
            this.projectName = model.projectName;
            this.reason = model.reason;
            this.sceneElements = model.sceneElements;
            this.semanticTypes = model.semanticTypes;
            this.serverSideDataEncryption = model.serverSideDataEncryption;
            this.serverSideEncryption = model.serverSideEncryption;
            this.serverSideEncryptionCustomerAlgorithm = model.serverSideEncryptionCustomerAlgorithm;
            this.serverSideEncryptionKeyId = model.serverSideEncryptionKeyId;
            this.size = model.size;
            this.startTime = model.startTime;
            this.streamCount = model.streamCount;
            this.subtitles = model.subtitles;
            this.timezone = model.timezone;
            this.title = model.title;
            this.travelClusterId = model.travelClusterId;
            this.URI = model.URI;
            this.updateTime = model.updateTime;
            this.videoHeight = model.videoHeight;
            this.videoStreams = model.videoStreams;
            this.videoWidth = model.videoWidth;
        } 

        /**
         * <p>The allowed origins for cross-origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        public Builder accessControlAllowOrigin(String accessControlAllowOrigin) {
            this.accessControlAllowOrigin = accessControlAllowOrigin;
            return this;
        }

        /**
         * <p>The allowed methods for the cross-origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>PUT</p>
         */
        public Builder accessControlRequestMethod(String accessControlRequestMethod) {
            this.accessControlRequestMethod = accessControlRequestMethod;
            return this;
        }

        /**
         * <p>The address information.</p>
         */
        public Builder addresses(java.util.List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The album.</p>
         * 
         * <strong>example:</strong>
         * <p>FirstAlbum</p>
         */
        public Builder album(String album) {
            this.album = album;
            return this;
        }

        /**
         * <p>The album artist.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        public Builder albumArtist(String albumArtist) {
            this.albumArtist = albumArtist;
            return this;
        }

        /**
         * <p>The artist.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        public Builder artist(String artist) {
            this.artist = artist;
            return this;
        }

        /**
         * <p>The cover images for the audio.</p>
         */
        public Builder audioCovers(java.util.List<Image> audioCovers) {
            this.audioCovers = audioCovers;
            return this;
        }

        /**
         * <p>A list of audio streams.</p>
         */
        public Builder audioStreams(java.util.List<AudioStream> audioStreams) {
            this.audioStreams = audioStreams;
            return this;
        }

        /**
         * <p>The bitrate, in bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>13091201</p>
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * <p>The web cache behavior that the browser should use when the object is downloaded.</p>
         * <p>This parameter is returned only if the Cache-Control HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>no-cache</p>
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * <p>The composer.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        public Builder composer(String composer) {
            this.composer = composer;
            return this;
        }

        /**
         * <p>The name of the object when it is downloaded.</p>
         * <p>This parameter is returned only if the Content-Disposition HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>attachment; filename =test.jpg</p>
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * <p>The content encoding format of the object when it is downloaded.</p>
         * <p>This parameter is returned only if the Content-Encoding HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>The language of the object content.</p>
         * <p>This parameter is returned only if the Content-Language HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * <p>The MD5 hash of the object content.</p>
         * 
         * <strong>example:</strong>
         * <p>HZwoCnxPZ/fvhz4oRJ2+Fw==</p>
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * <p>The content type of the file (MIME type).</p>
         * 
         * <strong>example:</strong>
         * <p>image/jpeg</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The time when the metadata was created. The time is in the RFC3339Nano format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The cropping suggestions for the image.</p>
         * <blockquote>
         * <p>This feature is not supported.</p>
         * </blockquote>
         */
        public Builder croppingSuggestions(java.util.List<CroppingSuggestion> croppingSuggestions) {
            this.croppingSuggestions = croppingSuggestions;
            return this;
        }

        /**
         * <p>The custom ID of the file, which you can use to associate the file with an ID in your business system. When the file is indexed into a dataset, this ID is stored as a metadata attribute. We recommend using a globally unique value.</p>
         * 
         * <strong>example:</strong>
         * <p>member-image-id-0001</p>
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * <p>Custom key-value labels for the file. This parameter is optional and can be used to store business-specific data and to filter queries.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;MemberName&quot;: &quot;Tim&quot;,
         *       &quot;Enabled&quot;: &quot;True&quot;,
         *       &quot;ItemCount&quot;: &quot;10&quot;
         * }</p>
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>The dataset name. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The total duration of the video, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15.263000</p>
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>An ETag is generated when an object is created. The ETag identifies the content of an object.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1D9C280A7C4F67F7EF873E28449****&quot;</p>
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * <p>The original EXIF information of the image, stored as a serialized JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/44975.html">Obtain image information</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Compression&quot;:{&quot;value&quot;:&quot;6&quot;},&quot;DateTime&quot;:{&quot;value&quot;:&quot;2020:08:19 17:11:11&quot;}}</p>
         */
        public Builder EXIF(String EXIF) {
            this.EXIF = EXIF;
            return this;
        }

        /**
         * <p>A list of document fragments that match the current search content when you use the SemanticQuery API to perform a semantic search.</p>
         */
        public Builder elements(java.util.List<Element> elements) {
            this.elements = elements;
            return this;
        }

        /**
         * <p>The number of figures.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder figureCount(Long figureCount) {
            this.figureCount = figureCount;
            return this;
        }

        /**
         * <p>A list of figures detected by the AI model.</p>
         */
        public Builder figures(java.util.List<Figure> figures) {
            this.figures = figures;
            return this;
        }

        /**
         * <p>The time when the file was last accessed. The time is in the RFC3339Nano format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder fileAccessTime(String fileAccessTime) {
            this.fileAccessTime = fileAccessTime;
            return this;
        }

        /**
         * <p>The time when the file was created. The time is in the RFC3339Nano format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder fileCreateTime(String fileCreateTime) {
            this.fileCreateTime = fileCreateTime;
            return this;
        }

        /**
         * <p>The hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1d9c280a7c4f67f7ef873e28449dbe17</p>
         */
        public Builder fileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }

        /**
         * <p>The time when the file was last modified. The time is in the RFC3339Nano format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder fileModifiedTime(String fileModifiedTime) {
            this.fileModifiedTime = fileModifiedTime;
            return this;
        }

        /**
         * <p>The name of the file. For an OSS object, this parameter is the ObjectKey.</p>
         * 
         * <strong>example:</strong>
         * <p>sampleobject.jpg</p>
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * <p>The full name of the media format.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickTime / MOV</p>
         */
        public Builder formatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }

        /**
         * <p>The name of the media format.</p>
         * 
         * <strong>example:</strong>
         * <p>mov</p>
         */
        public Builder formatName(String formatName) {
            this.formatName = formatName;
            return this;
        }

        /**
         * <p>The height of the image, in pixels (px).</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder imageHeight(Long imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        /**
         * <p>The image score information, detected by an AI model.</p>
         */
        public Builder imageScore(ImageScore imageScore) {
            this.imageScore = imageScore;
            return this;
        }

        /**
         * <p>The width of the image, in pixels (px).</p>
         * 
         * <strong>example:</strong>
         * <p>270</p>
         */
        public Builder imageWidth(Long imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        /**
         * <p>Summary and description of the file.</p>
         * <blockquote>
         * <p>Currently not supported</p>
         * </blockquote>
         */
        public Builder insights(Insights insights) {
            this.insights = insights;
            return this;
        }

        /**
         * <p>A list of AI-detected labels for the file.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The language in BCP 47 format.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The GPS latitude and longitude.</p>
         * 
         * <strong>example:</strong>
         * <p>30.134390,120.074997</p>
         */
        public Builder latLong(String latLong) {
            this.latLong = latLong;
            return this;
        }

        /**
         * <p>The media type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The OCR results.</p>
         * <blockquote>
         * <p>This feature is not supported.</p>
         * </blockquote>
         */
        public Builder OCRContents(java.util.List<OCRContents> OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }

        /**
         * <p>The text detected in the image.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云IMM</p>
         */
        public Builder OCRTexts(String OCRTexts) {
            this.OCRTexts = OCRTexts;
            return this;
        }

        /**
         * <p>The CRC-64 value of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>559890638950338001</p>
         */
        public Builder OSSCRC64(String OSSCRC64) {
            this.OSSCRC64 = OSSCRC64;
            return this;
        }

        /**
         * <p>The OSS delete marker.</p>
         * 
         * <strong>example:</strong>
         * <p>CAEQMhiBgIDXiaaB0BYiIGQzYmRkZGUxMTM1ZDRjOTZhNjk4YjRjMTAyZjhl****</p>
         */
        public Builder OSSDeleteMarker(String OSSDeleteMarker) {
            this.OSSDeleteMarker = OSSDeleteMarker;
            return this;
        }

        /**
         * <p>The expiration time of the OSS object.</p>
         * <p>This parameter is returned only if the Expires HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2120-01-01T12:00:00.000Z</p>
         */
        public Builder OSSExpiration(String OSSExpiration) {
            this.OSSExpiration = OSSExpiration;
            return this;
        }

        /**
         * <p>The type of the OSS object. A common value is <code>Normal</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder OSSObjectType(String OSSObjectType) {
            this.OSSObjectType = OSSObjectType;
            return this;
        }

        /**
         * <p>The storage class of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder OSSStorageClass(String OSSStorageClass) {
            this.OSSStorageClass = OSSStorageClass;
            return this;
        }

        /**
         * <p>The tags of the OSS object.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/106678.html">Object tagging</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;val&quot;}</p>
         */
        public Builder OSSTagging(java.util.Map<String, ?> OSSTagging) {
            this.OSSTagging = OSSTagging;
            return this;
        }

        /**
         * <p>The number of tags on the OSS object.</p>
         * <p>This parameter is returned only if tags are set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/106678.html">Object tagging</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder OSSTaggingCount(Long OSSTaggingCount) {
            this.OSSTaggingCount = OSSTaggingCount;
            return this;
        }

        /**
         * <p>The URI of the OSS file. This parameter is returned only if the URI is a PDS address.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/sampleobject.jpg</p>
         */
        public Builder OSSURI(String OSSURI) {
            this.OSSURI = OSSURI;
            return this;
        }

        /**
         * <p>The user-defined metadata of the OSS object.</p>
         * <p>This parameter is returned only if user-defined metadata is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;val&quot;}</p>
         */
        public Builder OSSUserMeta(java.util.Map<String, ?> OSSUserMeta) {
            this.OSSUserMeta = OSSUserMeta;
            return this;
        }

        /**
         * <p>The version ID of the OSS object.</p>
         * <p>This parameter is returned only if versioning is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/109695.html">Overview of versioning</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CAEQNhiBgMDJgZCA0BYiIDc4MGZjZGI2OTBjOTRmNTE5NmU5NmFhZjhjYmY0****</p>
         */
        public Builder OSSVersionId(String OSSVersionId) {
            this.OSSVersionId = OSSVersionId;
            return this;
        }

        /**
         * <p>The access control list (ACL) of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder objectACL(String objectACL) {
            this.objectACL = objectACL;
            return this;
        }

        /**
         * <p>The unique ID of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>75d5de2c50754e3dadd5c35dbca5f9949369e37eb342a73821f690c94c36c7f7</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>File index status.</p>
         * 
         * <strong>example:</strong>
         * <p>Indexed</p>
         */
        public Builder objectStatus(String objectStatus) {
            this.objectStatus = objectStatus;
            return this;
        }

        /**
         * <p>The type of the object. The value is always <strong>file</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The rotation value of the image, read from its EXIF data.</p>
         * <p>This parameter is returned only if this value is available in the EXIF data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder orientation(Long orientation) {
            this.orientation = orientation;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>102321002467****</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of pages.</p>
         * <blockquote>
         * <p>This feature is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The performer.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        public Builder performer(String performer) {
            this.performer = performer;
            return this;
        }

        /**
         * <p>The time when the photo was taken.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder produceTime(String produceTime) {
            this.produceTime = produceTime;
            return this;
        }

        /**
         * <p>The number of programs in the media container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder programCount(Long programCount) {
            this.programCount = programCount;
            return this;
        }

        /**
         * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The reason the file failed to be indexed.</p>
         * 
         * <strong>example:</strong>
         * <p>[InternalError] The request has been failed due to some unknown error. status: 500, requestId: CC5ACFBD-BB7A-496D-A9D6-****</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>A list of scene elements extracted from the video by the AI model during analysis.</p>
         */
        public Builder sceneElements(java.util.List<SceneElement> sceneElements) {
            this.sceneElements = sceneElements;
            return this;
        }

        /**
         * <p>Indicates why this file was returned when you use the SemanticQuery API to perform a semantic search.</p>
         */
        public Builder semanticTypes(java.util.List<String> semanticTypes) {
            this.semanticTypes = semanticTypes;
            return this;
        }

        /**
         * <p>The encryption algorithm of the object.</p>
         * <p>This parameter is returned only if server-side encryption is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31871.html">Server-side encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SM4</p>
         */
        public Builder serverSideDataEncryption(String serverSideDataEncryption) {
            this.serverSideDataEncryption = serverSideDataEncryption;
            return this;
        }

        /**
         * <p>The server-side encryption method.</p>
         * <p>This parameter is returned only if server-side encryption is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31871.html">Server-side encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * <p>The encryption algorithm used for server-side encryption with customer-provided keys.</p>
         * 
         * <strong>example:</strong>
         * <p>SM4</p>
         */
        public Builder serverSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
            this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
            return this;
        }

        /**
         * <p>The ID of the customer master key (CMK) that is managed by KMS.</p>
         * <p>This parameter is returned only if server-side encryption is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31871.html">Server-side encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>9468da86-3509-4f8d-a61e-6eab1eac****</p>
         */
        public Builder serverSideEncryptionKeyId(String serverSideEncryptionKeyId) {
            this.serverSideEncryptionKeyId = serverSideEncryptionKeyId;
            return this;
        }

        /**
         * <p>The size of the file, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The start time of the first frame, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The number of media streams in the media container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder streamCount(Long streamCount) {
            this.streamCount = streamCount;
            return this;
        }

        /**
         * <p>A list of subtitle streams.</p>
         */
        public Builder subtitles(java.util.List<SubtitleStream> subtitles) {
            this.subtitles = subtitles;
            return this;
        }

        /**
         * <p>The timezone.</p>
         * <blockquote>
         * <p>This feature is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The title of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * <blockquote>
         * <p>This feature is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder travelClusterId(String travelClusterId) {
            this.travelClusterId = travelClusterId;
            return this;
        }

        /**
         * <p>The address of the file.</p>
         * <p>An OSS URI must be in the <code>oss://${Bucket}/${Object}</code> format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the full path to the object, including the file extension.</p>
         * <p>A PDS URI must be in the <code>pds://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision}</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object.jpg</p>
         */
        public Builder URI(String URI) {
            this.URI = URI;
            return this;
        }

        /**
         * <p>The time when the metadata was last updated. The time is in the RFC3339Nano format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The height of the video, in pixels (px).</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        public Builder videoHeight(Long videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }

        /**
         * <p>A list of video streams.</p>
         */
        public Builder videoStreams(java.util.List<VideoStream> videoStreams) {
            this.videoStreams = videoStreams;
            return this;
        }

        /**
         * <p>The width of the video, in pixels (px).</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        public Builder videoWidth(Long videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }

        public File build() {
            return new File(this);
        } 

    } 

}
