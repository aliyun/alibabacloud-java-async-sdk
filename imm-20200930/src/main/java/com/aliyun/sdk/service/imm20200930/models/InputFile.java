// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    private java.util.List < Address > addresses;

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
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.NameInMap("Figures")
    private java.util.List < Figures> figures;

    @com.aliyun.core.annotation.NameInMap("FileHash")
    private String fileHash;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

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
    public java.util.Map < String, ? > getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return figures
     */
    public java.util.List < Figures> getFigures() {
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
    public java.util.List < Label > getLabels() {
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
        private java.util.List < Address > addresses; 
        private String album; 
        private String albumArtist; 
        private String artist; 
        private String composer; 
        private String contentType; 
        private String customId; 
        private java.util.Map < String, ? > customLabels; 
        private java.util.List < Figures> figures; 
        private String fileHash; 
        private java.util.List < Label > labels; 
        private String latLong; 
        private String mediaType; 
        private String OSSURI; 
        private String performer; 
        private String produceTime; 
        private String title; 
        private String URI; 

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
         * Composer.
         */
        public Builder composer(String composer) {
            this.composer = composer;
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
         * Figures.
         */
        public Builder figures(java.util.List < Figures> figures) {
            this.figures = figures;
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
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
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
         * OSSURI.
         */
        public Builder OSSURI(String OSSURI) {
            this.OSSURI = OSSURI;
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
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * URI.
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

            /**
             * FigureClusterId.
             */
            public Builder figureClusterId(String figureClusterId) {
                this.figureClusterId = figureClusterId;
                return this;
            }

            /**
             * FigureId.
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            /**
             * FigureType.
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
