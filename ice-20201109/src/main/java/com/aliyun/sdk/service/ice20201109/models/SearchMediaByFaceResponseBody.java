// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaByFaceResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaByFaceResponseBody</p>
 */
public class SearchMediaByFaceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("MediaInfoList")
    private java.util.List < MediaInfoList> mediaInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("Total")
    private Long total;

    private SearchMediaByFaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.mediaInfoList = builder.mediaInfoList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaByFaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return mediaInfoList
     */
    public java.util.List < MediaInfoList> getMediaInfoList() {
        return this.mediaInfoList;
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
        private java.util.List < MediaInfoList> mediaInfoList; 
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
         * MediaInfoList.
         */
        public Builder mediaInfoList(java.util.List < MediaInfoList> mediaInfoList) {
            this.mediaInfoList = mediaInfoList;
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

        public SearchMediaByFaceResponseBody build() {
            return new SearchMediaByFaceResponseBody(this);
        } 

    } 

    public static class MediaInfoList extends TeaModel {
        @NameInMap("MediaId")
        private String mediaId;

        private MediaInfoList(Builder builder) {
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfoList create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private String mediaId; 

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public MediaInfoList build() {
                return new MediaInfoList(this);
            } 

        } 

    }
}
