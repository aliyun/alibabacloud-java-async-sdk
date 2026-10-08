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
 * {@link InputFile} extends {@link TeaModel}
 *
 * <p>InputFile</p>
 */
public class InputFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<Address> addresses;

    @com.aliyun.core.annotation.NameInMap("Album")
    private String album;

    @com.aliyun.core.annotation.NameInMap("AlbumArtist")
    private String albumArtist;

    @com.aliyun.core.annotation.NameInMap("Artist")
    private String artist;

    @com.aliyun.core.annotation.NameInMap("Composer")
    private String composer;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map<String, ?> customLabels;

    @com.aliyun.core.annotation.NameInMap("Figures")
    private java.util.List<Figures> figures;

    @com.aliyun.core.annotation.NameInMap("FileHash")
    private String fileHash;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("LatLong")
    private String latLong;

    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.NameInMap("OSSURI")
    private String OSSURI;

    @com.aliyun.core.annotation.NameInMap("Performer")
    private String performer;

    @com.aliyun.core.annotation.NameInMap("ProduceTime")
    private String produceTime;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    private InputFile(Builder builder) {
        this.addresses = builder.addresses;
        this.album = builder.album;
        this.albumArtist = builder.albumArtist;
        this.artist = builder.artist;
        this.composer = builder.composer;
        this.contentType = builder.contentType;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.figures = builder.figures;
        this.fileHash = builder.fileHash;
        this.labels = builder.labels;
        this.latLong = builder.latLong;
        this.mediaType = builder.mediaType;
        this.OSSURI = builder.OSSURI;
        this.performer = builder.performer;
        this.produceTime = builder.produceTime;
        this.title = builder.title;
        this.URI = builder.URI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InputFile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return composer
     */
    public String getComposer() {
        return this.composer;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
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
     * @return figures
     */
    public java.util.List<Figures> getFigures() {
        return this.figures;
    }

    /**
     * @return fileHash
     */
    public String getFileHash() {
        return this.fileHash;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
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
     * @return OSSURI
     */
    public String getOSSURI() {
        return this.OSSURI;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    public static final class Builder {
        private java.util.List<Address> addresses; 
        private String album; 
        private String albumArtist; 
        private String artist; 
        private String composer; 
        private String contentType; 
        private String customId; 
        private java.util.Map<String, ?> customLabels; 
        private java.util.List<Figures> figures; 
        private String fileHash; 
        private java.util.List<Label> labels; 
        private String latLong; 
        private String mediaType; 
        private String OSSURI; 
        private String performer; 
        private String produceTime; 
        private String title; 
        private String URI; 

        private Builder() {
        } 

        private Builder(InputFile model) {
            this.addresses = model.addresses;
            this.album = model.album;
            this.albumArtist = model.albumArtist;
            this.artist = model.artist;
            this.composer = model.composer;
            this.contentType = model.contentType;
            this.customId = model.customId;
            this.customLabels = model.customLabels;
            this.figures = model.figures;
            this.fileHash = model.fileHash;
            this.labels = model.labels;
            this.latLong = model.latLong;
            this.mediaType = model.mediaType;
            this.OSSURI = model.OSSURI;
            this.performer = model.performer;
            this.produceTime = model.produceTime;
            this.title = model.title;
            this.URI = model.URI;
        } 

        /**
         * <p>The addresses.</p>
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
         * <p>In most cases, you can leave this parameter empty. The Multipurpose Internet Mail Extensions (MIME) type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>image/jpeg</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The custom ID of the file. This parameter is optional. When the metadata of the file is indexed into the dataset, the custom ID is stored as the data attribute. You can map the custom ID to other data in your business system. You can configure this parameter based on your business requirements. For example, you can associate a URI with an ID in your business system. We recommend that you set this parameter to a unique value.</p>
         * <p>This parameter supports prefix searches and sorting during queries. For more information, see <a href="https://help.aliyun.com/document_detail/252856.html">Supported fields and operators</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>member-image-id-0001</p>
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * <p>The custom labels of the file. This parameter is optional. The parameter stores custom key-value labels, which can be used to filter data. For more information, see <a href="https://help.aliyun.com/document_detail/252856.html">Supported fields and operators</a>.</p>
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
         * <p>This parameter is optional. The persons. This parameter is used to remove a face from a face group or modify a face group. For more information, see <a href="https://help.aliyun.com/document_detail/477175.html">Face clustering</a>.</p>
         * <blockquote>
         * <p> This parameter takes effect only for the UpdateFileMeta or BatchUpdateFileMeta operation.</p>
         * </blockquote>
         */
        public Builder figures(java.util.List<Figures> figures) {
            this.figures = figures;
            return this;
        }

        /**
         * <p>The file hash. In most cases, you can leave this parameter empty. This parameter is required only when the URI parameter specifies a file in Photo and Drive Service.</p>
         * 
         * <strong>example:</strong>
         * <p>1d9c280a7c4f67f7ef873e28449dbe17</p>
         */
        public Builder fileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }

        /**
         * <p>The intelligent labels.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The GPS latitude and longitude information.</p>
         * 
         * <strong>example:</strong>
         * <p>30.134390,120.074997</p>
         */
        public Builder latLong(String latLong) {
            this.latLong = latLong;
            return this;
        }

        /**
         * <p>In most cases, you can leave this parameter empty. The media type of the file.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>image</li>
         * <li>other</li>
         * <li>document</li>
         * <li>archive</li>
         * <li>video</li>
         * <li>audio</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The path of the OSS object. In most cases, you can leave this parameter empty. You can specify this parameter only if the URI parameter specifies a file in Photo and Drive Service.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object.jpg</p>
         */
        public Builder OSSURI(String OSSURI) {
            this.OSSURI = OSSURI;
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
         * <p>The time when the image was taken.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder produceTime(String produceTime) {
            this.produceTime = produceTime;
            return this;
        }

        /**
         * <p>The file title.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The URI of the file for which you want to create or update an index in the request. This parameter is required. The URI can represent an object in Object Storage Service (OSS) or a file in Photo and Drive Service.</p>
         * <p>The OSS URI must be in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that is in the same region as the current project. <code>${Object}</code> specifies the full file path that contains the object name extension.</p>
         * <p>The URI of a file in Photo and Drive Service must be in the <code>pds://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision}</code> format.</p>
         * <blockquote>
         * <p> URIs that start with HTTP are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/sampleobject.jpg</p>
         */
        public Builder URI(String URI) {
            this.URI = URI;
            return this;
        }

        public InputFile build() {
            return new InputFile(this);
        } 

    } 

    /**
     * 
     * {@link InputFile} extends {@link TeaModel}
     *
     * <p>InputFile</p>
     */
    public static class Figures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FigureClusterId")
        private String figureClusterId;

        @com.aliyun.core.annotation.NameInMap("FigureId")
        private String figureId;

        @com.aliyun.core.annotation.NameInMap("FigureType")
        private String figureType;

        private Figures(Builder builder) {
            this.figureClusterId = builder.figureClusterId;
            this.figureId = builder.figureId;
            this.figureType = builder.figureType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Figures create() {
            return builder().build();
        }

        /**
         * @return figureClusterId
         */
        public String getFigureClusterId() {
            return this.figureClusterId;
        }

        /**
         * @return figureId
         */
        public String getFigureId() {
            return this.figureId;
        }

        /**
         * @return figureType
         */
        public String getFigureType() {
            return this.figureType;
        }

        public static final class Builder {
            private String figureClusterId; 
            private String figureId; 
            private String figureType; 

            private Builder() {
            } 

            private Builder(Figures model) {
                this.figureClusterId = model.figureClusterId;
                this.figureId = model.figureId;
                this.figureType = model.figureType;
            } 

            /**
             * <p>The ID of the face cluster. The following IDs of special face clusters are reserved:</p>
             * <ul>
             * <li>figure-cluster-id-independent: indicates that the face does not belong to any face cluster. The face may be added to a face cluster in subsequent face clustering tasks after new images are added to the dataset.</li>
             * <li>figure-cluster-id-unavailable: indicates that the face has not been included in a face clustering task since a new image was added to the dataset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Cluster-dbe72fec-b84c-4ab6-885b-3678e64****</p>
             */
            public Builder figureClusterId(String figureClusterId) {
                this.figureClusterId = figureClusterId;
                return this;
            }

            /**
             * <p>The person ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2cb3c51e-b406-4b0c-af1b-897d88e1****</p>
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            /**
             * <p>The figure type. Set this parameter to <code>face</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>face</p>
             */
            public Builder figureType(String figureType) {
                this.figureType = figureType;
                return this;
            }

            public Figures build() {
                return new Figures(this);
            } 

        } 

    }
}
