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
 * {@link ListAllPublicMediaTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllPublicMediaTagsResponseBody</p>
 */
public class ListAllPublicMediaTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaTagList")
    private java.util.List<MediaTagList> mediaTagList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAllPublicMediaTagsResponseBody(Builder builder) {
        this.mediaTagList = builder.mediaTagList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllPublicMediaTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaTagList
     */
    public java.util.List<MediaTagList> getMediaTagList() {
        return this.mediaTagList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MediaTagList> mediaTagList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAllPublicMediaTagsResponseBody model) {
            this.mediaTagList = model.mediaTagList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The tags of media assets in the public media library.</p>
         */
        public Builder mediaTagList(java.util.List<MediaTagList> mediaTagList) {
            this.mediaTagList = mediaTagList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B45F83B7-7F87-4792-BFE9-63CD2137CAF0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAllPublicMediaTagsResponseBody build() {
            return new ListAllPublicMediaTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllPublicMediaTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllPublicMediaTagsResponseBody</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionChineseName")
        private String optionChineseName;

        @com.aliyun.core.annotation.NameInMap("OptionEnglishName")
        private String optionEnglishName;

        @com.aliyun.core.annotation.NameInMap("OptionId")
        private String optionId;

        private Options(Builder builder) {
            this.optionChineseName = builder.optionChineseName;
            this.optionEnglishName = builder.optionEnglishName;
            this.optionId = builder.optionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return optionChineseName
         */
        public String getOptionChineseName() {
            return this.optionChineseName;
        }

        /**
         * @return optionEnglishName
         */
        public String getOptionEnglishName() {
            return this.optionEnglishName;
        }

        /**
         * @return optionId
         */
        public String getOptionId() {
            return this.optionId;
        }

        public static final class Builder {
            private String optionChineseName; 
            private String optionEnglishName; 
            private String optionId; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.optionChineseName = model.optionChineseName;
                this.optionEnglishName = model.optionEnglishName;
                this.optionId = model.optionId;
            } 

            /**
             * <p>The option name in Chinese.</p>
             */
            public Builder optionChineseName(String optionChineseName) {
                this.optionChineseName = optionChineseName;
                return this;
            }

            /**
             * <p>The option name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Angry</p>
             */
            public Builder optionEnglishName(String optionEnglishName) {
                this.optionEnglishName = optionEnglishName;
                return this;
            }

            /**
             * <p>The option ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Angry</p>
             */
            public Builder optionId(String optionId) {
                this.optionId = optionId;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllPublicMediaTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllPublicMediaTagsResponseBody</p>
     */
    public static class MediaTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaTagId")
        private String mediaTagId;

        @com.aliyun.core.annotation.NameInMap("MediaTagNameChinese")
        private String mediaTagNameChinese;

        @com.aliyun.core.annotation.NameInMap("MediaTagNameEnglish")
        private String mediaTagNameEnglish;

        @com.aliyun.core.annotation.NameInMap("Options")
        private java.util.List<Options> options;

        private MediaTagList(Builder builder) {
            this.mediaTagId = builder.mediaTagId;
            this.mediaTagNameChinese = builder.mediaTagNameChinese;
            this.mediaTagNameEnglish = builder.mediaTagNameEnglish;
            this.options = builder.options;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaTagList create() {
            return builder().build();
        }

        /**
         * @return mediaTagId
         */
        public String getMediaTagId() {
            return this.mediaTagId;
        }

        /**
         * @return mediaTagNameChinese
         */
        public String getMediaTagNameChinese() {
            return this.mediaTagNameChinese;
        }

        /**
         * @return mediaTagNameEnglish
         */
        public String getMediaTagNameEnglish() {
            return this.mediaTagNameEnglish;
        }

        /**
         * @return options
         */
        public java.util.List<Options> getOptions() {
            return this.options;
        }

        public static final class Builder {
            private String mediaTagId; 
            private String mediaTagNameChinese; 
            private String mediaTagNameEnglish; 
            private java.util.List<Options> options; 

            private Builder() {
            } 

            private Builder(MediaTagList model) {
                this.mediaTagId = model.mediaTagId;
                this.mediaTagNameChinese = model.mediaTagNameChinese;
                this.mediaTagNameEnglish = model.mediaTagNameEnglish;
                this.options = model.options;
            } 

            /**
             * <p>The ID of the media tag.</p>
             * 
             * <strong>example:</strong>
             * <p>sticker-gif</p>
             */
            public Builder mediaTagId(String mediaTagId) {
                this.mediaTagId = mediaTagId;
                return this;
            }

            /**
             * <p>The name of the media tag in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>Gif</p>
             */
            public Builder mediaTagNameChinese(String mediaTagNameChinese) {
                this.mediaTagNameChinese = mediaTagNameChinese;
                return this;
            }

            /**
             * <p>The name of the material tag in English.</p>
             */
            public Builder mediaTagNameEnglish(String mediaTagNameEnglish) {
                this.mediaTagNameEnglish = mediaTagNameEnglish;
                return this;
            }

            /**
             * <p>The options.</p>
             */
            public Builder options(java.util.List<Options> options) {
                this.options = options;
                return this;
            }

            public MediaTagList build() {
                return new MediaTagList(this);
            } 

        } 

    }
}
