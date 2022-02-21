// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>PlayInfoResponseBody</p>
 */
public class PlayInfoResponseBody extends TeaModel {
    @NameInMap("NotFoundCDNDomain")
    private NotFoundCDNDomain notFoundCDNDomain;

    @NameInMap("PlayInfoList")
    private PlayInfoList playInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private PlayInfoResponseBody(Builder builder) {
        this.notFoundCDNDomain = builder.notFoundCDNDomain;
        this.playInfoList = builder.playInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return notFoundCDNDomain
     */
    public NotFoundCDNDomain getNotFoundCDNDomain() {
        return this.notFoundCDNDomain;
    }

    /**
     * @return playInfoList
     */
    public PlayInfoList getPlayInfoList() {
        return this.playInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NotFoundCDNDomain notFoundCDNDomain; 
        private PlayInfoList playInfoList; 
        private String requestId; 

        /**
         * NotFoundCDNDomain.
         */
        public Builder notFoundCDNDomain(NotFoundCDNDomain notFoundCDNDomain) {
            this.notFoundCDNDomain = notFoundCDNDomain;
            return this;
        }

        /**
         * PlayInfoList.
         */
        public Builder playInfoList(PlayInfoList playInfoList) {
            this.playInfoList = playInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PlayInfoResponseBody build() {
            return new PlayInfoResponseBody(this);
        } 

    } 

    public static class NotFoundCDNDomain extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private NotFoundCDNDomain(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotFoundCDNDomain create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NotFoundCDNDomain build() {
                return new NotFoundCDNDomain(this);
            } 

        } 

    }
    public static class PlayInfo extends TeaModel {
        @NameInMap("Url")
        private String url;

        @NameInMap("activityName")
        private String activityName;

        @NameInMap("bitrate")
        private String bitrate;

        @NameInMap("complexity")
        private String complexity;

        @NameInMap("definition")
        private String definition;

        @NameInMap("downloadType")
        private String downloadType;

        @NameInMap("duration")
        private String duration;

        @NameInMap("encryption")
        private String encryption;

        @NameInMap("encryptionType")
        private String encryptionType;

        @NameInMap("format")
        private String format;

        @NameInMap("fps")
        private String fps;

        @NameInMap("height")
        private String height;

        @NameInMap("plaintext")
        private String plaintext;

        @NameInMap("rand")
        private String rand;

        @NameInMap("size")
        private String size;

        @NameInMap("width")
        private String width;

        private PlayInfo(Builder builder) {
            this.url = builder.url;
            this.activityName = builder.activityName;
            this.bitrate = builder.bitrate;
            this.complexity = builder.complexity;
            this.definition = builder.definition;
            this.downloadType = builder.downloadType;
            this.duration = builder.duration;
            this.encryption = builder.encryption;
            this.encryptionType = builder.encryptionType;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.plaintext = builder.plaintext;
            this.rand = builder.rand;
            this.size = builder.size;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayInfo create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return complexity
         */
        public String getComplexity() {
            return this.complexity;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return downloadType
         */
        public String getDownloadType() {
            return this.downloadType;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
        }

        /**
         * @return encryptionType
         */
        public String getEncryptionType() {
            return this.encryptionType;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return plaintext
         */
        public String getPlaintext() {
            return this.plaintext;
        }

        /**
         * @return rand
         */
        public String getRand() {
            return this.rand;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String url; 
            private String activityName; 
            private String bitrate; 
            private String complexity; 
            private String definition; 
            private String downloadType; 
            private String duration; 
            private String encryption; 
            private String encryptionType; 
            private String format; 
            private String fps; 
            private String height; 
            private String plaintext; 
            private String rand; 
            private String size; 
            private String width; 

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * activityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * complexity.
             */
            public Builder complexity(String complexity) {
                this.complexity = complexity;
                return this;
            }

            /**
             * definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * downloadType.
             */
            public Builder downloadType(String downloadType) {
                this.downloadType = downloadType;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * encryption.
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * encryptionType.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * plaintext.
             */
            public Builder plaintext(String plaintext) {
                this.plaintext = plaintext;
                return this;
            }

            /**
             * rand.
             */
            public Builder rand(String rand) {
                this.rand = rand;
                return this;
            }

            /**
             * size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public PlayInfo build() {
                return new PlayInfo(this);
            } 

        } 

    }
    public static class PlayInfoList extends TeaModel {
        @NameInMap("PlayInfo")
        private java.util.List < PlayInfo> playInfo;

        private PlayInfoList(Builder builder) {
            this.playInfo = builder.playInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayInfoList create() {
            return builder().build();
        }

        /**
         * @return playInfo
         */
        public java.util.List < PlayInfo> getPlayInfo() {
            return this.playInfo;
        }

        public static final class Builder {
            private java.util.List < PlayInfo> playInfo; 

            /**
             * PlayInfo.
             */
            public Builder playInfo(java.util.List < PlayInfo> playInfo) {
                this.playInfo = playInfo;
                return this;
            }

            public PlayInfoList build() {
                return new PlayInfoList(this);
            } 

        } 

    }
}
