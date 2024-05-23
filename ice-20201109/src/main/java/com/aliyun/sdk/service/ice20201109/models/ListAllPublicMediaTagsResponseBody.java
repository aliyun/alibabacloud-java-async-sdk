// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllPublicMediaTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllPublicMediaTagsResponseBody</p>
 */
public class ListAllPublicMediaTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaTagList")
    private java.util.List < MediaTagList> mediaTagList;

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

    /**
     * @return mediaTagList
     */
    public java.util.List < MediaTagList> getMediaTagList() {
        return this.mediaTagList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MediaTagList> mediaTagList; 
        private String requestId; 

        /**
         * MediaTagList.
         */
        public Builder mediaTagList(java.util.List < MediaTagList> mediaTagList) {
            this.mediaTagList = mediaTagList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAllPublicMediaTagsResponseBody build() {
            return new ListAllPublicMediaTagsResponseBody(this);
        } 

    } 

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

            /**
             * OptionChineseName.
             */
            public Builder optionChineseName(String optionChineseName) {
                this.optionChineseName = optionChineseName;
                return this;
            }

            /**
             * OptionEnglishName.
             */
            public Builder optionEnglishName(String optionEnglishName) {
                this.optionEnglishName = optionEnglishName;
                return this;
            }

            /**
             * OptionId.
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
    public static class MediaTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaTagId")
        private String mediaTagId;

        @com.aliyun.core.annotation.NameInMap("MediaTagNameChinese")
        private String mediaTagNameChinese;

        @com.aliyun.core.annotation.NameInMap("MediaTagNameEnglish")
        private String mediaTagNameEnglish;

        @com.aliyun.core.annotation.NameInMap("Options")
        private java.util.List < Options> options;

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
        public java.util.List < Options> getOptions() {
            return this.options;
        }

        public static final class Builder {
            private String mediaTagId; 
            private String mediaTagNameChinese; 
            private String mediaTagNameEnglish; 
            private java.util.List < Options> options; 

            /**
             * MediaTagId.
             */
            public Builder mediaTagId(String mediaTagId) {
                this.mediaTagId = mediaTagId;
                return this;
            }

            /**
             * MediaTagNameChinese.
             */
            public Builder mediaTagNameChinese(String mediaTagNameChinese) {
                this.mediaTagNameChinese = mediaTagNameChinese;
                return this;
            }

            /**
             * MediaTagNameEnglish.
             */
            public Builder mediaTagNameEnglish(String mediaTagNameEnglish) {
                this.mediaTagNameEnglish = mediaTagNameEnglish;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(java.util.List < Options> options) {
                this.options = options;
                return this;
            }

            public MediaTagList build() {
                return new MediaTagList(this);
            } 

        } 

    }
}
