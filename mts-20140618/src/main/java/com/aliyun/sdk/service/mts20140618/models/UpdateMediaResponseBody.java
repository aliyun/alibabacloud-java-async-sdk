// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaResponseBody</p>
 */
public class UpdateMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Media")
    private Media media;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateMediaResponseBody(Builder builder) {
        this.media = builder.media;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaResponseBody create() {
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
         * The information about the media file.
         */
        public Builder media(Media media) {
            this.media = media;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMediaResponseBody build() {
            return new UpdateMediaResponseBody(this);
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
             * The state of the input file. Valid values:
             * <p>
             * 
             * *   **Normal**: The input file is normal.
             * *   **Deleted**: The input file is deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The name of the OSS bucket in which the input media file is stored.
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
             * The bitrate of the media file.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The ID of the category to which the media file belongs.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The review state of the media file. Valid values:
             * <p>
             * 
             * *   **Initiated**: The media file is uploaded but not reviewed.
             * *   **Pass**: The media file is uploaded and passes the review.
             */
            public Builder censorState(String censorState) {
                this.censorState = censorState;
                return this;
            }

            /**
             * The URL of the thumbnail.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the media file was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the media file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The duration of the media file.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The information about the input file.
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * The format of the media file. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The frame rate of the media file.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The height of the media file.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The ID of the media file.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The publishing state of the media file. Valid values:
             * <p>
             * 
             * *   **Initiated**: The media file is in the initial state.
             * *   **UnPublish**: The media file has not been published, and the playback permission on the OSS object is Private.
             * *   **Published**: The media file has been published, and the playback permission on the OSS object is Default.
             * *   **Deleted**: The media file is deleted.
             */
            public Builder publishState(String publishState) {
                this.publishState = publishState;
                return this;
            }

            /**
             * The IDs of the media workflow execution instances.
             */
            public Builder runIdList(RunIdList runIdList) {
                this.runIdList = runIdList;
                return this;
            }

            /**
             * The size of the media file.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The information about the tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the media file.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The width of the media file.
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
