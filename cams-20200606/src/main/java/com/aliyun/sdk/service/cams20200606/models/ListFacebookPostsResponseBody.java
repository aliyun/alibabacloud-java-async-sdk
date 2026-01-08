// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListFacebookPostsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFacebookPostsResponseBody</p>
 */
public class ListFacebookPostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListFacebookPostsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFacebookPostsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListFacebookPostsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFacebookPostsResponseBody build() {
            return new ListFacebookPostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFacebookPostsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFacebookPostsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("FullPicture")
        private String fullPicture;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("MediaUrl")
        private String mediaUrl;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PermalinkUrl")
        private String permalinkUrl;

        @com.aliyun.core.annotation.NameInMap("RequestNo")
        private String requestNo;

        private Data(Builder builder) {
            this.createdTime = builder.createdTime;
            this.fullPicture = builder.fullPicture;
            this.id = builder.id;
            this.mediaType = builder.mediaType;
            this.mediaUrl = builder.mediaUrl;
            this.message = builder.message;
            this.permalinkUrl = builder.permalinkUrl;
            this.requestNo = builder.requestNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return fullPicture
         */
        public String getFullPicture() {
            return this.fullPicture;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return mediaUrl
         */
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return permalinkUrl
         */
        public String getPermalinkUrl() {
            return this.permalinkUrl;
        }

        /**
         * @return requestNo
         */
        public String getRequestNo() {
            return this.requestNo;
        }

        public static final class Builder {
            private String createdTime; 
            private String fullPicture; 
            private String id; 
            private String mediaType; 
            private String mediaUrl; 
            private String message; 
            private String permalinkUrl; 
            private String requestNo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdTime = model.createdTime;
                this.fullPicture = model.fullPicture;
                this.id = model.id;
                this.mediaType = model.mediaType;
                this.mediaUrl = model.mediaUrl;
                this.message = model.message;
                this.permalinkUrl = model.permalinkUrl;
                this.requestNo = model.requestNo;
            } 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * FullPicture.
             */
            public Builder fullPicture(String fullPicture) {
                this.fullPicture = fullPicture;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * MediaUrl.
             */
            public Builder mediaUrl(String mediaUrl) {
                this.mediaUrl = mediaUrl;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PermalinkUrl.
             */
            public Builder permalinkUrl(String permalinkUrl) {
                this.permalinkUrl = permalinkUrl;
                return this;
            }

            /**
             * RequestNo.
             */
            public Builder requestNo(String requestNo) {
                this.requestNo = requestNo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
