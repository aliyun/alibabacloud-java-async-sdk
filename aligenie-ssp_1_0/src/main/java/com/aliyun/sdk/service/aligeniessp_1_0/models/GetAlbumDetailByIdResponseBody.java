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
 * {@link GetAlbumDetailByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlbumDetailByIdResponseBody</p>
 */
public class GetAlbumDetailByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetAlbumDetailByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlbumDetailByIdResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetAlbumDetailByIdResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Additional information</p>
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
         * <p>A0B7CACD-485B-14E2-854F-39EACB09E45B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Album content</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetAlbumDetailByIdResponseBody build() {
            return new GetAlbumDetailByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlbumDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlbumDetailByIdResponseBody</p>
     */
    public static class AlbumContentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OrderIndex")
        private String orderIndex;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private AlbumContentList(Builder builder) {
            this.duration = builder.duration;
            this.id = builder.id;
            this.orderIndex = builder.orderIndex;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbumContentList create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return orderIndex
         */
        public String getOrderIndex() {
            return this.orderIndex;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String duration; 
            private String id; 
            private String orderIndex; 
            private String title; 

            private Builder() {
            } 

            private Builder(AlbumContentList model) {
                this.duration = model.duration;
                this.id = model.id;
                this.orderIndex = model.orderIndex;
                this.title = model.title;
            } 

            /**
             * <p>Album content duration</p>
             * 
             * <strong>example:</strong>
             * <p>3分24秒</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Album content ID</p>
             * 
             * <strong>example:</strong>
             * <p>468009044</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Album content sorting</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder orderIndex(String orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * <p>Album content title</p>
             * 
             * <strong>example:</strong>
             * <p>001为什么肚子饿时会咕咕叫</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public AlbumContentList build() {
                return new AlbumContentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlbumDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlbumDetailByIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbumContentList")
        private java.util.List<AlbumContentList> albumContentList;

        @com.aliyun.core.annotation.NameInMap("AlbumCoverUrl")
        private String albumCoverUrl;

        @com.aliyun.core.annotation.NameInMap("AlbumDescription")
        private String albumDescription;

        @com.aliyun.core.annotation.NameInMap("AlbumId")
        private String albumId;

        @com.aliyun.core.annotation.NameInMap("AlbumTitle")
        private String albumTitle;

        private Result(Builder builder) {
            this.albumContentList = builder.albumContentList;
            this.albumCoverUrl = builder.albumCoverUrl;
            this.albumDescription = builder.albumDescription;
            this.albumId = builder.albumId;
            this.albumTitle = builder.albumTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return albumContentList
         */
        public java.util.List<AlbumContentList> getAlbumContentList() {
            return this.albumContentList;
        }

        /**
         * @return albumCoverUrl
         */
        public String getAlbumCoverUrl() {
            return this.albumCoverUrl;
        }

        /**
         * @return albumDescription
         */
        public String getAlbumDescription() {
            return this.albumDescription;
        }

        /**
         * @return albumId
         */
        public String getAlbumId() {
            return this.albumId;
        }

        /**
         * @return albumTitle
         */
        public String getAlbumTitle() {
            return this.albumTitle;
        }

        public static final class Builder {
            private java.util.List<AlbumContentList> albumContentList; 
            private String albumCoverUrl; 
            private String albumDescription; 
            private String albumId; 
            private String albumTitle; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.albumContentList = model.albumContentList;
                this.albumCoverUrl = model.albumCoverUrl;
                this.albumDescription = model.albumDescription;
                this.albumId = model.albumId;
                this.albumTitle = model.albumTitle;
            } 

            /**
             * <p>Album content list</p>
             */
            public Builder albumContentList(java.util.List<AlbumContentList> albumContentList) {
                this.albumContentList = albumContentList;
                return this;
            }

            /**
             * <p>Album thumbnail</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ailabs.alibabausercontent.com/images/8838/1600839452498.jpg">https://ailabs.alibabausercontent.com/images/8838/1600839452498.jpg</a></p>
             */
            public Builder albumCoverUrl(String albumCoverUrl) {
                this.albumCoverUrl = albumCoverUrl;
                return this;
            }

            /**
             * <p>Album Description</p>
             * 
             * <strong>example:</strong>
             * <p>每次一个百科知识或者故事\n丰富孩子的视野，拓展眼界和知识面，培养和孩子的探究能力和好奇心\n\n</p>
             */
            public Builder albumDescription(String albumDescription) {
                this.albumDescription = albumDescription;
                return this;
            }

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>51999575</p>
             */
            public Builder albumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            /**
             * <p>Album Title</p>
             * 
             * <strong>example:</strong>
             * <p>小科学家探索</p>
             */
            public Builder albumTitle(String albumTitle) {
                this.albumTitle = albumTitle;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
