// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link CreatePlayingListOAuth2ResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePlayingListOAuth2ResponseBody</p>
 */
public class CreatePlayingListOAuth2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreatePlayingListOAuth2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePlayingListOAuth2ResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String success; 

        private Builder() {
        } 

        private Builder(CreatePlayingListOAuth2ResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Return code of the invocation</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Additional information, typically used to briefly describe a failed invocation to help the caller identify the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10002398812</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Actual return result from the service</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the invocation succeeded. true indicates success, and false indicates failure. When the value is false, check the Message field.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreatePlayingListOAuth2ResponseBody build() {
            return new CreatePlayingListOAuth2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePlayingListOAuth2ResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePlayingListOAuth2ResponseBody</p>
     */
    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanResize")
        private Boolean canResize;

        @com.aliyun.core.annotation.NameInMap("Img")
        private String img;

        @com.aliyun.core.annotation.NameInMap("Large")
        private String large;

        @com.aliyun.core.annotation.NameInMap("Mediam")
        private String mediam;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private String medium;

        @com.aliyun.core.annotation.NameInMap("Small")
        private String small;

        private Cover(Builder builder) {
            this.canResize = builder.canResize;
            this.img = builder.img;
            this.large = builder.large;
            this.mediam = builder.mediam;
            this.medium = builder.medium;
            this.small = builder.small;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cover create() {
            return builder().build();
        }

        /**
         * @return canResize
         */
        public Boolean getCanResize() {
            return this.canResize;
        }

        /**
         * @return img
         */
        public String getImg() {
            return this.img;
        }

        /**
         * @return large
         */
        public String getLarge() {
            return this.large;
        }

        /**
         * @return mediam
         */
        public String getMediam() {
            return this.mediam;
        }

        /**
         * @return medium
         */
        public String getMedium() {
            return this.medium;
        }

        /**
         * @return small
         */
        public String getSmall() {
            return this.small;
        }

        public static final class Builder {
            private Boolean canResize; 
            private String img; 
            private String large; 
            private String mediam; 
            private String medium; 
            private String small; 

            private Builder() {
            } 

            private Builder(Cover model) {
                this.canResize = model.canResize;
                this.img = model.img;
                this.large = model.large;
                this.mediam = model.mediam;
                this.medium = model.medium;
                this.small = model.small;
            } 

            /**
             * <p>Indicates whether cropping using OSS rules is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canResize(Boolean canResize) {
                this.canResize = canResize;
                return this;
            }

            /**
             * <p>default image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder img(String img) {
                this.img = img;
                return this;
            }

            /**
             * <p>Large image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder large(String large) {
                this.large = large;
                return this;
            }

            /**
             * <p>Medium image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder mediam(String mediam) {
                this.mediam = mediam;
                return this;
            }

            /**
             * <p>medium image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>small image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder small(String small) {
                this.small = small;
                return this;
            }

            public Cover build() {
                return new Cover(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePlayingListOAuth2ResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePlayingListOAuth2ResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbumName")
        private String albumName;

        @com.aliyun.core.annotation.NameInMap("AlbumRawId")
        private String albumRawId;

        @com.aliyun.core.annotation.NameInMap("AudioLength")
        private Integer audioLength;

        @com.aliyun.core.annotation.NameInMap("Copyright")
        private Integer copyright;

        @com.aliyun.core.annotation.NameInMap("Cover")
        private Cover cover;

        @com.aliyun.core.annotation.NameInMap("DefaultPlayOrder")
        private Integer defaultPlayOrder;

        @com.aliyun.core.annotation.NameInMap("ItemUrl")
        private String itemUrl;

        @com.aliyun.core.annotation.NameInMap("Liked")
        private Boolean liked;

        @com.aliyun.core.annotation.NameInMap("LyricUrl")
        private String lyricUrl;

        @com.aliyun.core.annotation.NameInMap("PlayMode")
        private String playMode;

        @com.aliyun.core.annotation.NameInMap("Pos")
        private Integer pos;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("RawId")
        private String rawId;

        @com.aliyun.core.annotation.NameInMap("Singer")
        private String singer;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Valid")
        private String valid;

        private Result(Builder builder) {
            this.albumName = builder.albumName;
            this.albumRawId = builder.albumRawId;
            this.audioLength = builder.audioLength;
            this.copyright = builder.copyright;
            this.cover = builder.cover;
            this.defaultPlayOrder = builder.defaultPlayOrder;
            this.itemUrl = builder.itemUrl;
            this.liked = builder.liked;
            this.lyricUrl = builder.lyricUrl;
            this.playMode = builder.playMode;
            this.pos = builder.pos;
            this.progress = builder.progress;
            this.rawId = builder.rawId;
            this.singer = builder.singer;
            this.source = builder.source;
            this.title = builder.title;
            this.type = builder.type;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return albumName
         */
        public String getAlbumName() {
            return this.albumName;
        }

        /**
         * @return albumRawId
         */
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        /**
         * @return audioLength
         */
        public Integer getAudioLength() {
            return this.audioLength;
        }

        /**
         * @return copyright
         */
        public Integer getCopyright() {
            return this.copyright;
        }

        /**
         * @return cover
         */
        public Cover getCover() {
            return this.cover;
        }

        /**
         * @return defaultPlayOrder
         */
        public Integer getDefaultPlayOrder() {
            return this.defaultPlayOrder;
        }

        /**
         * @return itemUrl
         */
        public String getItemUrl() {
            return this.itemUrl;
        }

        /**
         * @return liked
         */
        public Boolean getLiked() {
            return this.liked;
        }

        /**
         * @return lyricUrl
         */
        public String getLyricUrl() {
            return this.lyricUrl;
        }

        /**
         * @return playMode
         */
        public String getPlayMode() {
            return this.playMode;
        }

        /**
         * @return pos
         */
        public Integer getPos() {
            return this.pos;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return rawId
         */
        public String getRawId() {
            return this.rawId;
        }

        /**
         * @return singer
         */
        public String getSinger() {
            return this.singer;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return valid
         */
        public String getValid() {
            return this.valid;
        }

        public static final class Builder {
            private String albumName; 
            private String albumRawId; 
            private Integer audioLength; 
            private Integer copyright; 
            private Cover cover; 
            private Integer defaultPlayOrder; 
            private String itemUrl; 
            private Boolean liked; 
            private String lyricUrl; 
            private String playMode; 
            private Integer pos; 
            private Integer progress; 
            private String rawId; 
            private String singer; 
            private String source; 
            private String title; 
            private String type; 
            private String valid; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.albumName = model.albumName;
                this.albumRawId = model.albumRawId;
                this.audioLength = model.audioLength;
                this.copyright = model.copyright;
                this.cover = model.cover;
                this.defaultPlayOrder = model.defaultPlayOrder;
                this.itemUrl = model.itemUrl;
                this.liked = model.liked;
                this.lyricUrl = model.lyricUrl;
                this.playMode = model.playMode;
                this.pos = model.pos;
                this.progress = model.progress;
                this.rawId = model.rawId;
                this.singer = model.singer;
                this.source = model.source;
                this.title = model.title;
                this.type = model.type;
                this.valid = model.valid;
            } 

            /**
             * <p>Third-party album name</p>
             * 
             * <strong>example:</strong>
             * <p>晚安妈妈睡前故事</p>
             */
            public Builder albumName(String albumName) {
                this.albumName = albumName;
                return this;
            }

            /**
             * <p>Third-party album ID</p>
             * 
             * <strong>example:</strong>
             * <p>260744</p>
             */
            public Builder albumRawId(String albumRawId) {
                this.albumRawId = albumRawId;
                return this;
            }

            /**
             * <p>Length</p>
             * 
             * <strong>example:</strong>
             * <p>190</p>
             */
            public Builder audioLength(Integer audioLength) {
                this.audioLength = audioLength;
                return this;
            }

            /**
             * <p>The copyright field has been upgraded to indicate whether the content is playable: 0 means playable, 1 or 2 means not playable.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder copyright(Integer copyright) {
                this.copyright = copyright;
                return this;
            }

            /**
             * <p>thumbnail image object</p>
             */
            public Builder cover(Cover cover) {
                this.cover = cover;
                return this;
            }

            /**
             * <p>Default playback order for the package: 0 for sequential, 1 for reverse order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultPlayOrder(Integer defaultPlayOrder) {
                this.defaultPlayOrder = defaultPlayOrder;
                return this;
            }

            /**
             * <p>Playback URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://openaudio.cos.tx.xmcdn.com/storages/587f-audiofreehighqps/15/CE/GKwRIJIGnb11ABc6SwF59DNb.mp3">https://openaudio.cos.tx.xmcdn.com/storages/587f-audiofreehighqps/15/CE/GKwRIJIGnb11ABc6SwF59DNb.mp3</a></p>
             */
            public Builder itemUrl(String itemUrl) {
                this.itemUrl = itemUrl;
                return this;
            }

            /**
             * <p>is collected</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder liked(Boolean liked) {
                this.liked = liked;
                return this;
            }

            /**
             * <p>Lyrics URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aicontent.alibabausercontent.com/lyric/thirdsource/6f4c8408073db134b0d097c122b5a1a1.lrc">https://aicontent.alibabausercontent.com/lyric/thirdsource/6f4c8408073db134b0d097c122b5a1a1.lrc</a></p>
             */
            public Builder lyricUrl(String lyricUrl) {
                this.lyricUrl = lyricUrl;
                return this;
            }

            /**
             * <p>Playback mode (Repeat, Shuffle, RepeatOne, Normal)</p>
             * 
             * <strong>example:</strong>
             * <p>Repeat</p>
             */
            public Builder playMode(String playMode) {
                this.playMode = playMode;
                return this;
            }

            /**
             * <p>Position of this item in the playlist.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pos(Integer pos) {
                this.pos = pos;
                return this;
            }

            /**
             * <p>Song playback progress</p>
             * 
             * <strong>example:</strong>
             * <p>96.0</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>third-party ID</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder rawId(String rawId) {
                this.rawId = rawId;
                return this;
            }

            /**
             * <p>Author</p>
             * 
             * <strong>example:</strong>
             * <p>晚安妈妈</p>
             */
            public Builder singer(String singer) {
                this.singer = singer;
                return this;
            }

            /**
             * <p>Source</p>
             * 
             * <strong>example:</strong>
             * <p>qignting</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>title</p>
             * 
             * <strong>example:</strong>
             * <p>超能狂少在都市</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>type (such as music, program, joke, news, children_song, radio, etc.)</p>
             * 
             * <strong>example:</strong>
             * <p>program</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Playback availability status: VALID(10), UNKNOWN(20), NOT_VALID(30).</p>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder valid(String valid) {
                this.valid = valid;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
