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
 * {@link ListPlayHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListPlayHistoryResponseBody</p>
 */
public class ListPlayHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPlayHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.result = builder.result;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlayHistoryResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private java.util.List<Result> result; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPlayHistoryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.result = model.result;
            this.requestId = model.requestId;
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
         * <p>Message information</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Return Result</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPlayHistoryResponseBody build() {
            return new ListPlayHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPlayHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlayHistoryResponseBody</p>
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
             * <p>Indicates whether OSS rules can be used for cropping</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canResize(Boolean canResize) {
                this.canResize = canResize;
                return this;
            }

            /**
             * <p>Default image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://a.jpg">https://a.jpg</a></p>
             */
            public Builder img(String img) {
                this.img = img;
                return this;
            }

            /**
             * <p>Large image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://a.jpg">https://a.jpg</a></p>
             */
            public Builder large(String large) {
                this.large = large;
                return this;
            }

            /**
             * <p>Medium image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://a.jpg">https://a.jpg</a></p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>Small image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://a.jpg">https://a.jpg</a></p>
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
     * {@link ListPlayHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlayHistoryResponseBody</p>
     */
    public static class Authors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorTypes")
        private java.util.List<String> authorTypes;

        @com.aliyun.core.annotation.NameInMap("Cover")
        private Cover cover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("RawId")
        private String rawId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Authors(Builder builder) {
            this.authorTypes = builder.authorTypes;
            this.cover = builder.cover;
            this.description = builder.description;
            this.gender = builder.gender;
            this.id = builder.id;
            this.online = builder.online;
            this.rawId = builder.rawId;
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

        public static final class Builder {
            private java.util.List<String> authorTypes; 
            private Cover cover; 
            private String description; 
            private String gender; 
            private Long id; 
            private Boolean online; 
            private String rawId; 
            private String source; 
            private String title; 

            private Builder() {
            } 

            private Builder(Authors model) {
                this.authorTypes = model.authorTypes;
                this.cover = model.cover;
                this.description = model.description;
                this.gender = model.gender;
                this.id = model.id;
                this.online = model.online;
                this.rawId = model.rawId;
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
             * <p>Profile picture</p>
             */
            public Builder cover(Cover cover) {
                this.cover = cover;
                return this;
            }

            /**
             * <p>Author description</p>
             * 
             * <strong>example:</strong>
             * <p>播音呆瓜小贼</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>13597709</p>
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
             * <p>Third-party author ID</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder rawId(String rawId) {
                this.rawId = rawId;
                return this;
            }

            /**
             * <p>Source</p>
             * 
             * <strong>example:</strong>
             * <p>qingting</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Author title</p>
             * 
             * <strong>example:</strong>
             * <p>播音呆瓜小贼</p>
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
     * {@link ListPlayHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlayHistoryResponseBody</p>
     */
    public static class ResultCover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanResize")
        private Boolean canResize;

        @com.aliyun.core.annotation.NameInMap("Img")
        private String img;

        @com.aliyun.core.annotation.NameInMap("Large")
        private String large;

        @com.aliyun.core.annotation.NameInMap("Mediam")
        private String mediam;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private String medium;

        @com.aliyun.core.annotation.NameInMap("Small")
        private String small;

        private ResultCover(Builder builder) {
            this.canResize = builder.canResize;
            this.img = builder.img;
            this.large = builder.large;
            this.mediam = builder.mediam;
            this.medium = builder.medium;
            this.small = builder.small;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultCover create() {
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
         * @return mediam
         */
        public String getMediam() {
            return this.mediam;
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
            private String mediam; 
            private String medium; 
            private String small; 

            private Builder() {
            } 

            private Builder(ResultCover model) {
                this.canResize = model.canResize;
                this.img = model.img;
                this.large = model.large;
                this.mediam = model.mediam;
                this.medium = model.medium;
                this.small = model.small;
            } 

            /**
             * <p>Indicates whether OSS rules can be used for cropping</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canResize(Boolean canResize) {
                this.canResize = canResize;
                return this;
            }

            /**
             * <p>Default image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder img(String img) {
                this.img = img;
                return this;
            }

            /**
             * <p>Large image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder large(String large) {
                this.large = large;
                return this;
            }

            /**
             * <p>Medium image (Deprecated)</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder mediam(String mediam) {
                this.mediam = mediam;
                return this;
            }

            /**
             * <p>Medium image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>Small image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
             */
            public Builder small(String small) {
                this.small = small;
                return this;
            }

            public ResultCover build() {
                return new ResultCover(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPlayHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlayHistoryResponseBody</p>
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
        private ResultCover cover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HotScore")
        private Double hotScore;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

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
            this.hotScore = builder.hotScore;
            this.id = builder.id;
            this.itemType = builder.itemType;
            this.source = builder.source;
            this.title = builder.title;
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
        public ResultCover getCover() {
            return this.cover;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private ResultCover cover; 
            private String description; 
            private Double hotScore; 
            private Long id; 
            private String itemType; 
            private String source; 
            private String title; 
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
                this.hotScore = model.hotScore;
                this.id = model.id;
                this.itemType = model.itemType;
                this.source = model.source;
                this.title = model.title;
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
             * <p>Is audition available</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder audition(Boolean audition) {
                this.audition = audition;
                return this;
            }

            /**
             * <p>Authors of the content</p>
             */
            public Builder authors(java.util.List<Authors> authors) {
                this.authors = authors;
                return this;
            }

            /**
             * <p>Transform controlType based on the category</p>
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
            public Builder cover(ResultCover cover) {
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
             * <p>Hot Score</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hotScore(Double hotScore) {
                this.hotScore = hotScore;
                return this;
            }

            /**
             * <p>Content ID</p>
             * 
             * <strong>example:</strong>
             * <p>13597709</p>
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
             * <p>Source</p>
             * 
             * <strong>example:</strong>
             * <p>qingting</p>
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
             * <p>Convert to favoriteType based on the associated public category</p>
             * 
             * <strong>example:</strong>
             * <p>program</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Indicates whether the content is playable</p>
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
