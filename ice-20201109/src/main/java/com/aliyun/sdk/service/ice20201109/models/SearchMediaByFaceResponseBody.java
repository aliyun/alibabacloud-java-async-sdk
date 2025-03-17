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
 * {@link SearchMediaByFaceResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaByFaceResponseBody</p>
 */
public class SearchMediaByFaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MediaInfoList")
    private java.util.List<MediaInfoList> mediaInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
     * @return mediaInfoList
     */
    public java.util.List<MediaInfoList> getMediaInfoList() {
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
        private java.util.List<MediaInfoList> mediaInfoList; 
        private String requestId; 
        private String success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(SearchMediaByFaceResponseBody model) {
            this.code = model.code;
            this.mediaInfoList = model.mediaInfoList;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

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
         * <p>The media assets that meet the conditions.</p>
         */
        public Builder mediaInfoList(java.util.List<MediaInfoList> mediaInfoList) {
            this.mediaInfoList = mediaInfoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7CA7D615-CFB1-5437-9A12-2D185C3EE6CB</p>
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
         * <p>163</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaByFaceResponseBody build() {
            return new SearchMediaByFaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaByFaceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaByFaceResponseBody</p>
     */
    public static class MediaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
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

            private Builder() {
            } 

            private Builder(MediaInfoList model) {
                this.mediaId = model.mediaId;
            } 

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>3b187b3620c8490886cfc2a9578c****</p>
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
