// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Address > addresses;

    @com.aliyun.core.annotation.NameInMap("Album")
    private String album;

    @com.aliyun.core.annotation.NameInMap("AlbumArtist")
    private String albumArtist;

    @com.aliyun.core.annotation.NameInMap("Artist")
    private String artist;

    @com.aliyun.core.annotation.NameInMap("AudioCovers")
    private java.util.List < Image > audioCovers;

    @com.aliyun.core.annotation.NameInMap("AudioStreams")
    private java.util.List < AudioStream > audioStreams;

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
    private java.util.List < CroppingSuggestion > croppingSuggestions;

    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Double duration;

    @com.aliyun.core.annotation.NameInMap("ETag")
    private String eTag;

    @com.aliyun.core.annotation.NameInMap("EXIF")
    private String EXIF;

    @com.aliyun.core.annotation.NameInMap("Elements")
    private java.util.List < Element > elements;

    @com.aliyun.core.annotation.NameInMap("FigureCount")
    private Long figureCount;

    @com.aliyun.core.annotation.NameInMap("Figures")
    private java.util.List < Figure > figures;

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

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("LatLong")
    private String latLong;

    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.NameInMap("OCRContents")
    private java.util.List < OCRContents > OCRContents;

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
    private java.util.Map < String, ? > OSSTagging;

    @com.aliyun.core.annotation.NameInMap("OSSTaggingCount")
    private Long OSSTaggingCount;

    @com.aliyun.core.annotation.NameInMap("OSSURI")
    private String OSSURI;

    @com.aliyun.core.annotation.NameInMap("OSSUserMeta")
    private java.util.Map < String, ? > OSSUserMeta;

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
    private java.util.List < SceneElement > sceneElements;

    @com.aliyun.core.annotation.NameInMap("SemanticTypes")
    private java.util.List < String > semanticTypes;

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
    private java.util.List < SubtitleStream > subtitles;

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
    private java.util.List < VideoStream > videoStreams;

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
    public java.util.List < Address > getAddresses() {
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
    public java.util.List < Image > getAudioCovers() {
        return this.audioCovers;
    }

    /**
     * @return audioStreams
     */
    public java.util.List < AudioStream > getAudioStreams() {
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
    public java.util.List < CroppingSuggestion > getCroppingSuggestions() {
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
    public java.util.Map < String, ? > getCustomLabels() {
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
    public java.util.List < Element > getElements() {
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
    public java.util.List < Figure > getFigures() {
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
     * @return labels
     */
    public java.util.List < Label > getLabels() {
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
    public java.util.List < OCRContents > getOCRContents() {
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
    public java.util.Map < String, ? > getOSSTagging() {
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
    public java.util.Map < String, ? > getOSSUserMeta() {
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
    public java.util.List < SceneElement > getSceneElements() {
        return this.sceneElements;
    }

    /**
     * @return semanticTypes
     */
    public java.util.List < String > getSemanticTypes() {
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
    public java.util.List < SubtitleStream > getSubtitles() {
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
    public java.util.List < VideoStream > getVideoStreams() {
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
        private java.util.List < Address > addresses; 
        private String album; 
        private String albumArtist; 
        private String artist; 
        private java.util.List < Image > audioCovers; 
        private java.util.List < AudioStream > audioStreams; 
        private Long bitrate; 
        private String cacheControl; 
        private String composer; 
        private String contentDisposition; 
        private String contentEncoding; 
        private String contentLanguage; 
        private String contentMd5; 
        private String contentType; 
        private String createTime; 
        private java.util.List < CroppingSuggestion > croppingSuggestions; 
        private String customId; 
        private java.util.Map < String, ? > customLabels; 
        private String datasetName; 
        private Double duration; 
        private String eTag; 
        private String EXIF; 
        private java.util.List < Element > elements; 
        private Long figureCount; 
        private java.util.List < Figure > figures; 
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
        private java.util.List < Label > labels; 
        private String language; 
        private String latLong; 
        private String mediaType; 
        private java.util.List < OCRContents > OCRContents; 
        private String OCRTexts; 
        private String OSSCRC64; 
        private String OSSDeleteMarker; 
        private String OSSExpiration; 
        private String OSSObjectType; 
        private String OSSStorageClass; 
        private java.util.Map < String, ? > OSSTagging; 
        private Long OSSTaggingCount; 
        private String OSSURI; 
        private java.util.Map < String, ? > OSSUserMeta; 
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
        private java.util.List < SceneElement > sceneElements; 
        private java.util.List < String > semanticTypes; 
        private String serverSideDataEncryption; 
        private String serverSideEncryption; 
        private String serverSideEncryptionCustomerAlgorithm; 
        private String serverSideEncryptionKeyId; 
        private Long size; 
        private Double startTime; 
        private Long streamCount; 
        private java.util.List < SubtitleStream > subtitles; 
        private String timezone; 
        private String title; 
        private String travelClusterId; 
        private String URI; 
        private String updateTime; 
        private Long videoHeight; 
        private java.util.List < VideoStream > videoStreams; 
        private Long videoWidth; 

        /**
         * AccessControlAllowOrigin.
         */
        public Builder accessControlAllowOrigin(String accessControlAllowOrigin) {
            this.accessControlAllowOrigin = accessControlAllowOrigin;
            return this;
        }

        /**
         * AccessControlRequestMethod.
         */
        public Builder accessControlRequestMethod(String accessControlRequestMethod) {
            this.accessControlRequestMethod = accessControlRequestMethod;
            return this;
        }

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List < Address > addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Album.
         */
        public Builder album(String album) {
            this.album = album;
            return this;
        }

        /**
         * AlbumArtist.
         */
        public Builder albumArtist(String albumArtist) {
            this.albumArtist = albumArtist;
            return this;
        }

        /**
         * Artist.
         */
        public Builder artist(String artist) {
            this.artist = artist;
            return this;
        }

        /**
         * AudioCovers.
         */
        public Builder audioCovers(java.util.List < Image > audioCovers) {
            this.audioCovers = audioCovers;
            return this;
        }

        /**
         * AudioStreams.
         */
        public Builder audioStreams(java.util.List < AudioStream > audioStreams) {
            this.audioStreams = audioStreams;
            return this;
        }

        /**
         * Bitrate.
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * CacheControl.
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * Composer.
         */
        public Builder composer(String composer) {
            this.composer = composer;
            return this;
        }

        /**
         * ContentDisposition.
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * ContentEncoding.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * ContentLanguage.
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * ContentMd5.
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
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
         * CroppingSuggestions.
         */
        public Builder croppingSuggestions(java.util.List < CroppingSuggestion > croppingSuggestions) {
            this.croppingSuggestions = croppingSuggestions;
            return this;
        }

        /**
         * CustomId.
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * ETag.
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * EXIF.
         */
        public Builder EXIF(String EXIF) {
            this.EXIF = EXIF;
            return this;
        }

        /**
         * Elements.
         */
        public Builder elements(java.util.List < Element > elements) {
            this.elements = elements;
            return this;
        }

        /**
         * FigureCount.
         */
        public Builder figureCount(Long figureCount) {
            this.figureCount = figureCount;
            return this;
        }

        /**
         * Figures.
         */
        public Builder figures(java.util.List < Figure > figures) {
            this.figures = figures;
            return this;
        }

        /**
         * FileAccessTime.
         */
        public Builder fileAccessTime(String fileAccessTime) {
            this.fileAccessTime = fileAccessTime;
            return this;
        }

        /**
         * FileCreateTime.
         */
        public Builder fileCreateTime(String fileCreateTime) {
            this.fileCreateTime = fileCreateTime;
            return this;
        }

        /**
         * FileHash.
         */
        public Builder fileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }

        /**
         * FileModifiedTime.
         */
        public Builder fileModifiedTime(String fileModifiedTime) {
            this.fileModifiedTime = fileModifiedTime;
            return this;
        }

        /**
         * Filename.
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * FormatLongName.
         */
        public Builder formatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
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
         * ImageHeight.
         */
        public Builder imageHeight(Long imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        /**
         * ImageScore.
         */
        public Builder imageScore(ImageScore imageScore) {
            this.imageScore = imageScore;
            return this;
        }

        /**
         * ImageWidth.
         */
        public Builder imageWidth(Long imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * LatLong.
         */
        public Builder latLong(String latLong) {
            this.latLong = latLong;
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
         * OCRContents.
         */
        public Builder OCRContents(java.util.List < OCRContents > OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }

        /**
         * OCRTexts.
         */
        public Builder OCRTexts(String OCRTexts) {
            this.OCRTexts = OCRTexts;
            return this;
        }

        /**
         * OSSCRC64.
         */
        public Builder OSSCRC64(String OSSCRC64) {
            this.OSSCRC64 = OSSCRC64;
            return this;
        }

        /**
         * OSSDeleteMarker.
         */
        public Builder OSSDeleteMarker(String OSSDeleteMarker) {
            this.OSSDeleteMarker = OSSDeleteMarker;
            return this;
        }

        /**
         * OSSExpiration.
         */
        public Builder OSSExpiration(String OSSExpiration) {
            this.OSSExpiration = OSSExpiration;
            return this;
        }

        /**
         * OSSObjectType.
         */
        public Builder OSSObjectType(String OSSObjectType) {
            this.OSSObjectType = OSSObjectType;
            return this;
        }

        /**
         * OSSStorageClass.
         */
        public Builder OSSStorageClass(String OSSStorageClass) {
            this.OSSStorageClass = OSSStorageClass;
            return this;
        }

        /**
         * OSSTagging.
         */
        public Builder OSSTagging(java.util.Map < String, ? > OSSTagging) {
            this.OSSTagging = OSSTagging;
            return this;
        }

        /**
         * OSSTaggingCount.
         */
        public Builder OSSTaggingCount(Long OSSTaggingCount) {
            this.OSSTaggingCount = OSSTaggingCount;
            return this;
        }

        /**
         * OSSURI.
         */
        public Builder OSSURI(String OSSURI) {
            this.OSSURI = OSSURI;
            return this;
        }

        /**
         * OSSUserMeta.
         */
        public Builder OSSUserMeta(java.util.Map < String, ? > OSSUserMeta) {
            this.OSSUserMeta = OSSUserMeta;
            return this;
        }

        /**
         * OSSVersionId.
         */
        public Builder OSSVersionId(String OSSVersionId) {
            this.OSSVersionId = OSSVersionId;
            return this;
        }

        /**
         * ObjectACL.
         */
        public Builder objectACL(String objectACL) {
            this.objectACL = objectACL;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * ObjectStatus.
         */
        public Builder objectStatus(String objectStatus) {
            this.objectStatus = objectStatus;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * Orientation.
         */
        public Builder orientation(Long orientation) {
            this.orientation = orientation;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * Performer.
         */
        public Builder performer(String performer) {
            this.performer = performer;
            return this;
        }

        /**
         * ProduceTime.
         */
        public Builder produceTime(String produceTime) {
            this.produceTime = produceTime;
            return this;
        }

        /**
         * ProgramCount.
         */
        public Builder programCount(Long programCount) {
            this.programCount = programCount;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * SceneElements.
         */
        public Builder sceneElements(java.util.List < SceneElement > sceneElements) {
            this.sceneElements = sceneElements;
            return this;
        }

        /**
         * SemanticTypes.
         */
        public Builder semanticTypes(java.util.List < String > semanticTypes) {
            this.semanticTypes = semanticTypes;
            return this;
        }

        /**
         * ServerSideDataEncryption.
         */
        public Builder serverSideDataEncryption(String serverSideDataEncryption) {
            this.serverSideDataEncryption = serverSideDataEncryption;
            return this;
        }

        /**
         * ServerSideEncryption.
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * ServerSideEncryptionCustomerAlgorithm.
         */
        public Builder serverSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
            this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
            return this;
        }

        /**
         * ServerSideEncryptionKeyId.
         */
        public Builder serverSideEncryptionKeyId(String serverSideEncryptionKeyId) {
            this.serverSideEncryptionKeyId = serverSideEncryptionKeyId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * StreamCount.
         */
        public Builder streamCount(Long streamCount) {
            this.streamCount = streamCount;
            return this;
        }

        /**
         * Subtitles.
         */
        public Builder subtitles(java.util.List < SubtitleStream > subtitles) {
            this.subtitles = subtitles;
            return this;
        }

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
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
         * TravelClusterId.
         */
        public Builder travelClusterId(String travelClusterId) {
            this.travelClusterId = travelClusterId;
            return this;
        }

        /**
         * URI.
         */
        public Builder URI(String URI) {
            this.URI = URI;
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
         * VideoHeight.
         */
        public Builder videoHeight(Long videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }

        /**
         * VideoStreams.
         */
        public Builder videoStreams(java.util.List < VideoStream > videoStreams) {
            this.videoStreams = videoStreams;
            return this;
        }

        /**
         * VideoWidth.
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
