// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaResponseBody} extends {@link TeaModel}
 *
 * <p>AddMediaResponseBody</p>
 */
public class AddMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Media")
    private Media media;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddMediaResponseBody(Builder builder) {
        this.media = builder.media;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return media
     */
    public Media getMedia() {
        return this.media;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Media media; 
        private String requestId; 

        /**
         * Media.
         */
        public Builder media(Media media) {
            this.media = media;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddMediaResponseBody build() {
            return new AddMediaResponseBody(this);
        } 

    } 

    public static class File extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private File(Builder builder) {
            this.state = builder.state;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static File create() {
            return builder().build();
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String state; 
            private String URL; 

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * URL.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public File build() {
                return new File(this);
            } 

        } 

    }
    public static class RunIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RunId")
        private java.util.List < String > runId;

        private RunIdList(Builder builder) {
            this.runId = builder.runId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunIdList create() {
            return builder().build();
        }

        /**
         * @return runId
         */
        public java.util.List < String > getRunId() {
            return this.runId;
        }

        public static final class Builder {
            private java.util.List < String > runId; 

            /**
             * RunId.
             */
            public Builder runId(java.util.List < String > runId) {
                this.runId = runId;
                return this;
            }

            public RunIdList build() {
                return new RunIdList(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < String > tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < String > tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Media extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CensorState")
        private String censorState;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("File")
        private File file;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("PublishState")
        private String publishState;

        @com.aliyun.core.annotation.NameInMap("RunIdList")
        private RunIdList runIdList;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Media(Builder builder) {
            this.bitrate = builder.bitrate;
            this.cateId = builder.cateId;
            this.censorState = builder.censorState;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.file = builder.file;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.mediaId = builder.mediaId;
            this.publishState = builder.publishState;
            this.runIdList = builder.runIdList;
            this.size = builder.size;
            this.tags = builder.tags;
            this.title = builder.title;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Media create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return censorState
         */
        public String getCensorState() {
            return this.censorState;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
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
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return file
         */
        public File getFile() {
            return this.file;
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
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return publishState
         */
        public String getPublishState() {
            return this.publishState;
        }

        /**
         * @return runIdList
         */
        public RunIdList getRunIdList() {
            return this.runIdList;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private Long cateId; 
            private String censorState; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String duration; 
            private File file; 
            private String format; 
            private String fps; 
            private String height; 
            private String mediaId; 
            private String publishState; 
            private RunIdList runIdList; 
            private String size; 
            private Tags tags; 
            private String title; 
            private String width; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
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
             * CensorState.
             */
            public Builder censorState(String censorState) {
                this.censorState = censorState;
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * File.
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
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
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * PublishState.
             */
            public Builder publishState(String publishState) {
                this.publishState = publishState;
                return this;
            }

            /**
             * RunIdList.
             */
            public Builder runIdList(RunIdList runIdList) {
                this.runIdList = runIdList;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Media build() {
                return new Media(this);
            } 

        } 

    }
}
