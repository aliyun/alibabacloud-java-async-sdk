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
 * {@link SearchMediaByHybridResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaByHybridResponseBody</p>
 */
public class SearchMediaByHybridResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MediaList")
    private java.util.List<MediaList> mediaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private SearchMediaByHybridResponseBody(Builder builder) {
        this.code = builder.code;
        this.mediaList = builder.mediaList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaByHybridResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return mediaList
     */
    public java.util.List<MediaList> getMediaList() {
        return this.mediaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<MediaList> mediaList; 
        private String requestId; 
        private String success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(SearchMediaByHybridResponseBody model) {
            this.code = model.code;
            this.mediaList = model.mediaList;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * MediaList.
         */
        public Builder mediaList(java.util.List<MediaList> mediaList) {
            this.mediaList = mediaList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaByHybridResponseBody build() {
            return new SearchMediaByHybridResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaByHybridResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByHybridResponseBody</p>
     */
    public static class ClipInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        private ClipInfo(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipInfo create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private Double to; 

            private Builder() {
            } 

            private Builder(ClipInfo model) {
                this.from = model.from;
                this.score = model.score;
                this.to = model.to;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            public ClipInfo build() {
                return new ClipInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMediaByHybridResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByHybridResponseBody</p>
     */
    public static class MediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipInfo")
        private java.util.List<ClipInfo> clipInfo;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private MediaList(Builder builder) {
            this.clipInfo = builder.clipInfo;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaList create() {
            return builder().build();
        }

        /**
         * @return clipInfo
         */
        public java.util.List<ClipInfo> getClipInfo() {
            return this.clipInfo;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private java.util.List<ClipInfo> clipInfo; 
            private String mediaId; 

            private Builder() {
            } 

            private Builder(MediaList model) {
                this.clipInfo = model.clipInfo;
                this.mediaId = model.mediaId;
            } 

            /**
             * ClipInfo.
             */
            public Builder clipInfo(java.util.List<ClipInfo> clipInfo) {
                this.clipInfo = clipInfo;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public MediaList build() {
                return new MediaList(this);
            } 

        } 

    }
}
