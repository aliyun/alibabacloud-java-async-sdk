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
 * {@link ScgSearchResponseBody} extends {@link TeaModel}
 *
 * <p>ScgSearchResponseBody</p>
 */
public class ScgSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ScgSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScgSearchResponseBody create() {
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
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ScgSearchResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
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
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>Number of records per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Detailed returned information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sourceId&quot;:0,&quot;copyright&quot;:0,&quot;releaseTime&quot;:1196438400000,&quot;hotScore&quot;:0.9546929544543479,&quot;tppExtendInfo&quot;:&quot;{&quot;userEvent&quot;:&quot;前台投放&quot;,&quot;scgTopicName&quot;:&quot;inside民族中国风曲风音乐库&quot;,&quot;scgTopicId&quot;:&quot;MC201132&quot;}&quot;,&quot;source&quot;:&quot;xiami&quot;,&quot;title&quot;:&quot;题帕三绝&quot;,&quot;type&quot;:&quot;music&quot;,&quot;x1Pv30d&quot;:10307,&quot;valid&quot;:10,&quot;cover&quot;:{&quot;img&quot;:&quot;<a href="http://img.xiami.net/qianxun/07d8ec1a38a5462c3afbfac41413b8af/47244c25fcf3a8f67442d02e3127d023-500x432.jpg%22,%22canResize%22:false%7D,%22duration%22:0,%22rawId%22:%221771626071%22,%22albumType%22:0,%22alias%22:%5B%22%E9%A2%98%E5%B8%95%E4%B8%89%E7%BB%9D%22%5D,%22id%22:268033175,%22supportAudition%22:false,%22contentType%22:%22MUSIC_CONTENT%22,%22authorIds%22:%5B%5D,%22singers%22:%22%E9%99%88%E5%8A%9B%22,%22albumRawId%22:%221771626071%22,%22album%22:false,%22x1PvTotal%22:14676,%22commCateId%22:80021001,%22finished%22:0,%22isAudition%22:false,%22appIds%22:%5B%5D,%22authorNames%22:%5B%22%E9%99%88%E5%8A%9B%22,%22%E7%8E%8B%E7%AB%8B%E5%B9%B3%22,%22%E6%9B%B9%E9%9B%AA%E8%8A%B9%22%5D,%22needCharge%22:false,%22isCharge%22:false,%22category%22:%22audio%22%7D">http://img.xiami.net/qianxun/07d8ec1a38a5462c3afbfac41413b8af/47244c25fcf3a8f67442d02e3127d023-500x432.jpg&quot;,&quot;canResize&quot;:false},&quot;duration&quot;:0,&quot;rawId&quot;:&quot;1771626071&quot;,&quot;albumType&quot;:0,&quot;alias&quot;:[&quot;题帕三绝&quot;],&quot;id&quot;:268033175,&quot;supportAudition&quot;:false,&quot;contentType&quot;:&quot;MUSIC_CONTENT&quot;,&quot;authorIds&quot;:[],&quot;singers&quot;:&quot;陈力&quot;,&quot;albumRawId&quot;:&quot;1771626071&quot;,&quot;album&quot;:false,&quot;x1PvTotal&quot;:14676,&quot;commCateId&quot;:80021001,&quot;finished&quot;:0,&quot;isAudition&quot;:false,&quot;appIds&quot;:[],&quot;authorNames&quot;:[&quot;陈力&quot;,&quot;王立平&quot;,&quot;曹雪芹&quot;],&quot;needCharge&quot;:false,&quot;isCharge&quot;:false,&quot;category&quot;:&quot;audio&quot;}</a></p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ScgSearchResponseBody build() {
            return new ScgSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ScgSearchResponseBody} extends {@link TeaModel}
     *
     * <p>ScgSearchResponseBody</p>
     */
    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Img")
        private String img;

        @com.aliyun.core.annotation.NameInMap("Large")
        private String large;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private String medium;

        @com.aliyun.core.annotation.NameInMap("Small")
        private String small;

        @com.aliyun.core.annotation.NameInMap("canResize")
        private Boolean canResize;

        private Cover(Builder builder) {
            this.img = builder.img;
            this.large = builder.large;
            this.medium = builder.medium;
            this.small = builder.small;
            this.canResize = builder.canResize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cover create() {
            return builder().build();
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

        /**
         * @return canResize
         */
        public Boolean getCanResize() {
            return this.canResize;
        }

        public static final class Builder {
            private String img; 
            private String large; 
            private String medium; 
            private String small; 
            private Boolean canResize; 

            private Builder() {
            } 

            private Builder(Cover model) {
                this.img = model.img;
                this.large = model.large;
                this.medium = model.medium;
                this.small = model.small;
                this.canResize = model.canResize;
            } 

            /**
             * <p>Thumbnail image (Img, Large, Medium, and Small may not appear simultaneously; only one of them may be present)</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
             */
            public Builder img(String img) {
                this.img = img;
                return this;
            }

            /**
             * <p>Large graph</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
             */
            public Builder large(String large) {
                this.large = large;
                return this;
            }

            /**
             * <p>Medium image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>Small image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
             */
            public Builder small(String small) {
                this.small = small;
                return this;
            }

            /**
             * <p>Whether scaling is supported</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canResize(Boolean canResize) {
                this.canResize = canResize;
                return this;
            }

            public Cover build() {
                return new Cover(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScgSearchResponseBody} extends {@link TeaModel}
     *
     * <p>ScgSearchResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Album")
        private Boolean album;

        @com.aliyun.core.annotation.NameInMap("AlbumRawId")
        private String albumRawId;

        @com.aliyun.core.annotation.NameInMap("AlbumType")
        private Integer albumType;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private java.util.List<String> alias;

        @com.aliyun.core.annotation.NameInMap("AuthorIds")
        private java.util.List<Long> authorIds;

        @com.aliyun.core.annotation.NameInMap("AuthorNames")
        private java.util.List<String> authorNames;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Cover")
        private Cover cover;

        @com.aliyun.core.annotation.NameInMap("IsAudition")
        private Boolean isAudition;

        @com.aliyun.core.annotation.NameInMap("IsCharge")
        private String isCharge;

        @com.aliyun.core.annotation.NameInMap("NeedCharge")
        private Boolean needCharge;

        @com.aliyun.core.annotation.NameInMap("RawId")
        private String rawId;

        @com.aliyun.core.annotation.NameInMap("Singers")
        private String singers;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SupportAudition")
        private Boolean supportAudition;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.album = builder.album;
            this.albumRawId = builder.albumRawId;
            this.albumType = builder.albumType;
            this.alias = builder.alias;
            this.authorIds = builder.authorIds;
            this.authorNames = builder.authorNames;
            this.category = builder.category;
            this.contentType = builder.contentType;
            this.cover = builder.cover;
            this.isAudition = builder.isAudition;
            this.isCharge = builder.isCharge;
            this.needCharge = builder.needCharge;
            this.rawId = builder.rawId;
            this.singers = builder.singers;
            this.source = builder.source;
            this.supportAudition = builder.supportAudition;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return album
         */
        public Boolean getAlbum() {
            return this.album;
        }

        /**
         * @return albumRawId
         */
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        /**
         * @return albumType
         */
        public Integer getAlbumType() {
            return this.albumType;
        }

        /**
         * @return alias
         */
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        /**
         * @return authorIds
         */
        public java.util.List<Long> getAuthorIds() {
            return this.authorIds;
        }

        /**
         * @return authorNames
         */
        public java.util.List<String> getAuthorNames() {
            return this.authorNames;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return cover
         */
        public Cover getCover() {
            return this.cover;
        }

        /**
         * @return isAudition
         */
        public Boolean getIsAudition() {
            return this.isAudition;
        }

        /**
         * @return isCharge
         */
        public String getIsCharge() {
            return this.isCharge;
        }

        /**
         * @return needCharge
         */
        public Boolean getNeedCharge() {
            return this.needCharge;
        }

        /**
         * @return rawId
         */
        public String getRawId() {
            return this.rawId;
        }

        /**
         * @return singers
         */
        public String getSingers() {
            return this.singers;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return supportAudition
         */
        public Boolean getSupportAudition() {
            return this.supportAudition;
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

        public static final class Builder {
            private Boolean album; 
            private String albumRawId; 
            private Integer albumType; 
            private java.util.List<String> alias; 
            private java.util.List<Long> authorIds; 
            private java.util.List<String> authorNames; 
            private String category; 
            private String contentType; 
            private Cover cover; 
            private Boolean isAudition; 
            private String isCharge; 
            private Boolean needCharge; 
            private String rawId; 
            private String singers; 
            private String source; 
            private Boolean supportAudition; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.album = model.album;
                this.albumRawId = model.albumRawId;
                this.albumType = model.albumType;
                this.alias = model.alias;
                this.authorIds = model.authorIds;
                this.authorNames = model.authorNames;
                this.category = model.category;
                this.contentType = model.contentType;
                this.cover = model.cover;
                this.isAudition = model.isAudition;
                this.isCharge = model.isCharge;
                this.needCharge = model.needCharge;
                this.rawId = model.rawId;
                this.singers = model.singers;
                this.source = model.source;
                this.supportAudition = model.supportAudition;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>Whether it is an album</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder album(Boolean album) {
                this.album = album;
                return this;
            }

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>1795716629</p>
             */
            public Builder albumRawId(String albumRawId) {
                this.albumRawId = albumRawId;
                return this;
            }

            /**
             * <p>Album type</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder albumType(Integer albumType) {
                this.albumType = albumType;
                return this;
            }

            /**
             * <p>Alias</p>
             */
            public Builder alias(java.util.List<String> alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>Author ID</p>
             */
            public Builder authorIds(java.util.List<Long> authorIds) {
                this.authorIds = authorIds;
                return this;
            }

            /**
             * <p>Author names</p>
             */
            public Builder authorNames(java.util.List<String> authorNames) {
                this.authorNames = authorNames;
                return this;
            }

            /**
             * <p>Category</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Content type</p>
             * 
             * <strong>example:</strong>
             * <p>MUSIC_CONTENT</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>Thumbnail</p>
             */
            public Builder cover(Cover cover) {
                this.cover = cover;
                return this;
            }

            /**
             * <p>Whether audition is available</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAudition(Boolean isAudition) {
                this.isAudition = isAudition;
                return this;
            }

            /**
             * <p>Is charged</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCharge(String isCharge) {
                this.isCharge = isCharge;
                return this;
            }

            /**
             * <p>Whether charging is required</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needCharge(Boolean needCharge) {
                this.needCharge = needCharge;
                return this;
            }

            /**
             * <p>Third-party content ID</p>
             * 
             * <strong>example:</strong>
             * <p>1795716629</p>
             */
            public Builder rawId(String rawId) {
                this.rawId = rawId;
                return this;
            }

            /**
             * <p>Singer name</p>
             * 
             * <strong>example:</strong>
             * <p>黎偌天</p>
             */
            public Builder singers(String singers) {
                this.singers = singers;
                return this;
            }

            /**
             * <p>Content source</p>
             * 
             * <strong>example:</strong>
             * <p>xiami</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Whether audition is supported</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportAudition(Boolean supportAudition) {
                this.supportAudition = supportAudition;
                return this;
            }

            /**
             * <p>Content title</p>
             * 
             * <strong>example:</strong>
             * <p>那个人</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Content type</p>
             * 
             * <strong>example:</strong>
             * <p>music</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
