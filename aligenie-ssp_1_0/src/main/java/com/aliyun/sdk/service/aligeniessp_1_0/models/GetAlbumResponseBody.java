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
 * {@link GetAlbumResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlbumResponseBody</p>
 */
public class GetAlbumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetAlbumResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlbumResponseBody create() {
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
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetAlbumResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Code encoding</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetAlbumResponseBody build() {
            return new GetAlbumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlbumResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlbumResponseBody</p>
     */
    public static class Authors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorTypes")
        private java.util.List<String> authorTypes;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Authors(Builder builder) {
            this.authorTypes = builder.authorTypes;
            this.gender = builder.gender;
            this.id = builder.id;
            this.online = builder.online;
            this.source = builder.source;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authors create() {
            return builder().build();
        }

        /**
         * @return authorTypes
         */
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<String> authorTypes; 
            private String gender; 
            private Long id; 
            private Boolean online; 
            private String source; 
            private String title; 

            private Builder() {
            } 

            private Builder(Authors model) {
                this.authorTypes = model.authorTypes;
                this.gender = model.gender;
                this.id = model.id;
                this.online = model.online;
                this.source = model.source;
                this.title = model.title;
            } 

            /**
             * <p>Author types</p>
             */
            public Builder authorTypes(java.util.List<String> authorTypes) {
                this.authorTypes = authorTypes;
                return this;
            }

            /**
             * <p>Gender</p>
             * 
             * <strong>example:</strong>
             * <p>MALE</p>
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * <p>Author primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>13123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Is online</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>Source</p>
             * 
             * <strong>example:</strong>
             * <p>qignting</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Author title</p>
             * 
             * <strong>example:</strong>
             * <p>超能狂少在都市</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Authors build() {
                return new Authors(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlbumResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlbumResponseBody</p>
     */
    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanResize")
        private Boolean canResize;

        @com.aliyun.core.annotation.NameInMap("Img")
        private String img;

        @com.aliyun.core.annotation.NameInMap("Large")
        private String large;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private String medium;

        @com.aliyun.core.annotation.NameInMap("Small")
        private String small;

        private Cover(Builder builder) {
            this.canResize = builder.canResize;
            this.img = builder.img;
            this.large = builder.large;
            this.medium = builder.medium;
            this.small = builder.small;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cover create() {
            return builder().build();
        }

        /**
         * @return canResize
         */
        public Boolean getCanResize() {
            return this.canResize;
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

        public static final class Builder {
            private Boolean canResize; 
            private String img; 
            private String large; 
            private String medium; 
            private String small; 

            private Builder() {
            } 

            private Builder(Cover model) {
                this.canResize = model.canResize;
                this.img = model.img;
                this.large = model.large;
                this.medium = model.medium;
                this.small = model.small;
            } 

            /**
             * <p>Indicates whether OSS rules can be used for cropping.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canResize(Boolean canResize) {
                this.canResize = canResize;
                return this;
            }

            /**
             * <p>Default Image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder img(String img) {
                this.img = img;
                return this;
            }

            /**
             * <p>Large Image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder large(String large) {
                this.large = large;
                return this;
            }

            /**
             * <p>Medium Image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>Small Image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder small(String small) {
                this.small = small;
                return this;
            }

            public Cover build() {
                return new Cover(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlbumResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlbumResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private java.util.List<String> alias;

        @com.aliyun.core.annotation.NameInMap("Audition")
        private Boolean audition;

        @com.aliyun.core.annotation.NameInMap("Authors")
        private java.util.List<Authors> authors;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Charge")
        private Boolean charge;

        @com.aliyun.core.annotation.NameInMap("CommCateId")
        private Long commCateId;

        @com.aliyun.core.annotation.NameInMap("Cover")
        private Cover cover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Finished")
        private String finished;

        @com.aliyun.core.annotation.NameInMap("HotScore")
        private Double hotScore;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("RawId")
        private String rawId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TotalEpisode")
        private Integer totalEpisode;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Valid")
        private String valid;

        private Result(Builder builder) {
            this.alias = builder.alias;
            this.audition = builder.audition;
            this.authors = builder.authors;
            this.category = builder.category;
            this.charge = builder.charge;
            this.commCateId = builder.commCateId;
            this.cover = builder.cover;
            this.description = builder.description;
            this.finished = builder.finished;
            this.hotScore = builder.hotScore;
            this.id = builder.id;
            this.itemType = builder.itemType;
            this.rawId = builder.rawId;
            this.source = builder.source;
            this.title = builder.title;
            this.totalEpisode = builder.totalEpisode;
            this.type = builder.type;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        /**
         * @return audition
         */
        public Boolean getAudition() {
            return this.audition;
        }

        /**
         * @return authors
         */
        public java.util.List<Authors> getAuthors() {
            return this.authors;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return charge
         */
        public Boolean getCharge() {
            return this.charge;
        }

        /**
         * @return commCateId
         */
        public Long getCommCateId() {
            return this.commCateId;
        }

        /**
         * @return cover
         */
        public Cover getCover() {
            return this.cover;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return finished
         */
        public String getFinished() {
            return this.finished;
        }

        /**
         * @return hotScore
         */
        public Double getHotScore() {
            return this.hotScore;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return rawId
         */
        public String getRawId() {
            return this.rawId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return totalEpisode
         */
        public Integer getTotalEpisode() {
            return this.totalEpisode;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return valid
         */
        public String getValid() {
            return this.valid;
        }

        public static final class Builder {
            private java.util.List<String> alias; 
            private Boolean audition; 
            private java.util.List<Authors> authors; 
            private String category; 
            private Boolean charge; 
            private Long commCateId; 
            private Cover cover; 
            private String description; 
            private String finished; 
            private Double hotScore; 
            private Long id; 
            private String itemType; 
            private String rawId; 
            private String source; 
            private String title; 
            private Integer totalEpisode; 
            private String type; 
            private String valid; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.alias = model.alias;
                this.audition = model.audition;
                this.authors = model.authors;
                this.category = model.category;
                this.charge = model.charge;
                this.commCateId = model.commCateId;
                this.cover = model.cover;
                this.description = model.description;
                this.finished = model.finished;
                this.hotScore = model.hotScore;
                this.id = model.id;
                this.itemType = model.itemType;
                this.rawId = model.rawId;
                this.source = model.source;
                this.title = model.title;
                this.totalEpisode = model.totalEpisode;
                this.type = model.type;
                this.valid = model.valid;
            } 

            /**
             * <p>Alias</p>
             */
            public Builder alias(java.util.List<String> alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>Is auditionable</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder audition(Boolean audition) {
                this.audition = audition;
                return this;
            }

            /**
             * <p>Author information</p>
             */
            public Builder authors(java.util.List<Authors> authors) {
                this.authors = authors;
                return this;
            }

            /**
             * <p>Transform controlType based on the public category it belongs to</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Is charged</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder charge(Boolean charge) {
                this.charge = charge;
                return this;
            }

            /**
             * <p>Category ID</p>
             * 
             * <strong>example:</strong>
             * <p>80012017</p>
             */
            public Builder commCateId(Long commCateId) {
                this.commCateId = commCateId;
                return this;
            }

            /**
             * <p>Album cover image</p>
             */
            public Builder cover(Cover cover) {
                this.cover = cover;
                return this;
            }

            /**
             * <p>Content description</p>
             * 
             * <strong>example:</strong>
             * <p>内容描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Is finished</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder finished(String finished) {
                this.finished = finished;
                return this;
            }

            /**
             * <p>Popularity Score</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hotScore(Double hotScore) {
                this.hotScore = hotScore;
                return this;
            }

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>1231231</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of content, such as music, audio, radio, jokes, etc.</p>
             * 
             * <strong>example:</strong>
             * <p>ALBUM</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>Third-party ID</p>
             * 
             * <strong>example:</strong>
             * <p>23242</p>
             */
            public Builder rawId(String rawId) {
                this.rawId = rawId;
                return this;
            }

            /**
             * <p>Source</p>
             * 
             * <strong>example:</strong>
             * <p>qignting</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>超能狂少在都市</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Total number of episodes</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalEpisode(Integer totalEpisode) {
                this.totalEpisode = totalEpisode;
                return this;
            }

            /**
             * <p>Transform to favoriteType based on the associated public category</p>
             * 
             * <strong>example:</strong>
             * <p>program</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Indicates whether the album is playable.</p>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder valid(String valid) {
                this.valid = valid;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
