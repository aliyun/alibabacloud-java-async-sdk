// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchMediaByMultimodalResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaByMultimodalResponseBody</p>
 */
public class SearchMediaByMultimodalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MediaList")
    private java.util.List < MediaList> mediaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The media assets that contain the specified content.</p>
         */
        public Builder mediaList(java.util.List < MediaList> mediaList) {
            this.mediaList = mediaList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of data records that meet the specified filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaByMultimodalResponseBody build() {
            return new SearchMediaByMultimodalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaByMultimodalResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByMultimodalResponseBody</p>
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

            /**
             * <p>The start time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The end time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
     * {@link SearchMediaByMultimodalResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByMultimodalResponseBody</p>
     */
    public static class MediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipInfo")
        private java.util.List < ClipInfo> clipInfo;

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
             * <p>The information about the clip.</p>
             */
            public Builder clipInfo(java.util.List < ClipInfo> clipInfo) {
                this.clipInfo = clipInfo;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>a18936e0e28771edb59ae6f6f47a****</p>
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
