// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaByMultimodalResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaByMultimodalResponseBody</p>
 */
public class SearchMediaByMultimodalResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("MediaList")
    private java.util.List < MediaList> mediaList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("Total")
    private Long total;

    private SearchMediaByMultimodalResponseBody(Builder builder) {
        this.code = builder.code;
        this.mediaList = builder.mediaList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaByMultimodalResponseBody create() {
        return builder().build();
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
    public java.util.List < MediaList> getMediaList() {
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
        private java.util.List < MediaList> mediaList; 
        private String requestId; 
        private String success; 
        private Long total; 

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
        public Builder mediaList(java.util.List < MediaList> mediaList) {
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

        public SearchMediaByMultimodalResponseBody build() {
            return new SearchMediaByMultimodalResponseBody(this);
        } 

    } 

    public static class ClipInfo extends TeaModel {
        @NameInMap("From")
        private Double from;

        @NameInMap("Score")
        private Double score;

        @NameInMap("To")
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
    public static class MediaList extends TeaModel {
        @NameInMap("ClipInfo")
        private java.util.List < ClipInfo> clipInfo;

        @NameInMap("MediaId")
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
        public java.util.List < ClipInfo> getClipInfo() {
            return this.clipInfo;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private java.util.List < ClipInfo> clipInfo; 
            private String mediaId; 

            /**
             * ClipInfo.
             */
            public Builder clipInfo(java.util.List < ClipInfo> clipInfo) {
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
