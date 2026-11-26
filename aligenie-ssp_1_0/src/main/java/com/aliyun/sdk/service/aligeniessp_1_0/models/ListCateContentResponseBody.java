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
 * {@link ListCateContentResponseBody} extends {@link TeaModel}
 *
 * <p>ListCateContentResponseBody</p>
 */
public class ListCateContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListCateContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCateContentResponseBody create() {
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

        private Builder(ListCateContentResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>code encoding</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>message information</p>
         * 
         * <strong>example:</strong>
         * <p>sucess</p>
         */
        public Builder message(String message) {
            this.message = message;
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

        /**
         * <p>Return Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListCateContentResponseBody build() {
            return new ListCateContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCateContentResponseBody} extends {@link TeaModel}
     *
     * <p>ListCateContentResponseBody</p>
     */
    public static class Cover extends TeaModel {
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

        private Cover(Builder builder) {
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

            private Builder(Cover model) {
                this.canResize = model.canResize;
                this.img = model.img;
                this.large = model.large;
                this.mediam = model.mediam;
                this.medium = model.medium;
                this.small = model.small;
            } 

            /**
             * <p>Indicates whether the image can be cropped using OSS rules.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canResize(Boolean canResize) {
                this.canResize = canResize;
                return this;
            }

            /**
             * <p>default image</p>
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
             * <p>Medium image (Deprecated)</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://a.jpg">https://a.jpg</a></p>
             */
            public Builder mediam(String mediam) {
                this.mediam = mediam;
                return this;
            }

            /**
             * <p>medium image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://a.jpg">https://a.jpg</a></p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>small image</p>
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
     * {@link ListCateContentResponseBody} extends {@link TeaModel}
     *
     * <p>ListCateContentResponseBody</p>
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
             * <p>Author type</p>
             */
            public Builder authorTypes(java.util.List<String> authorTypes) {
                this.authorTypes = authorTypes;
                return this;
            }

            /**
             * <p>profile picture</p>
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
             * <p>Primary key ID of the author information</p>
             * 
             * <strong>example:</strong>
             * <p>13597709</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Whether it is online</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>third-party author ID</p>
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
     * {@link ListCateContentResponseBody} extends {@link TeaModel}
     *
     * <p>ListCateContentResponseBody</p>
     */
    public static class OpenDataItemListCover extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("canResize")
        private Boolean canResize;

        private OpenDataItemListCover(Builder builder) {
            this.img = builder.img;
            this.large = builder.large;
            this.mediam = builder.mediam;
            this.medium = builder.medium;
            this.small = builder.small;
            this.canResize = builder.canResize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenDataItemListCover create() {
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

        /**
         * @return canResize
         */
        public Boolean getCanResize() {
            return this.canResize;
        }

        public static final class Builder {
            private String img; 
            private String large; 
            private String mediam; 
            private String medium; 
            private String small; 
            private Boolean canResize; 

            private Builder() {
            } 

            private Builder(OpenDataItemListCover model) {
                this.img = model.img;
                this.large = model.large;
                this.mediam = model.mediam;
                this.medium = model.medium;
                this.small = model.small;
                this.canResize = model.canResize;
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
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718275.jpg">http://pic.qtfm.cn/2017/0207/2017020718275.jpg</a></p>
             */
            public Builder large(String large) {
                this.large = large;
                return this;
            }

            /**
             * <p>Medium image (Deprecated)</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718275.jpg">http://pic.qtfm.cn/2017/0207/2017020718275.jpg</a></p>
             */
            public Builder mediam(String mediam) {
                this.mediam = mediam;
                return this;
            }

            /**
             * <p>Medium image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/20170207175.jpg">http://pic.qtfm.cn/2017/0207/20170207175.jpg</a></p>
             */
            public Builder medium(String medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>Small image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pic.qtfm.cn/2017/0207/2017020675.jpg">http://pic.qtfm.cn/2017/0207/2017020675.jpg</a></p>
             */
            public Builder small(String small) {
                this.small = small;
                return this;
            }

            /**
             * <p>Indicates whether cropping can be performed using OSS rules.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canResize(Boolean canResize) {
                this.canResize = canResize;
                return this;
            }

            public OpenDataItemListCover build() {
                return new OpenDataItemListCover(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCateContentResponseBody} extends {@link TeaModel}
     *
     * <p>ListCateContentResponseBody</p>
     */
    public static class OpenDataItemList extends TeaModel {
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
        private String commCateId;

        @com.aliyun.core.annotation.NameInMap("Cover")
        private OpenDataItemListCover cover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HotScore")
        private Double hotScore;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("RawId")
        private String rawId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Valid")
        private String valid;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        private OpenDataItemList(Builder builder) {
            this.alias = builder.alias;
            this.audition = builder.audition;
            this.authors = builder.authors;
            this.category = builder.category;
            this.charge = builder.charge;
            this.commCateId = builder.commCateId;
            this.cover = builder.cover;
            this.description = builder.description;
            this.hotScore = builder.hotScore;
            this.itemType = builder.itemType;
            this.rawId = builder.rawId;
            this.source = builder.source;
            this.title = builder.title;
            this.type = builder.type;
            this.valid = builder.valid;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenDataItemList create() {
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
        public String getCommCateId() {
            return this.commCateId;
        }

        /**
         * @return cover
         */
        public OpenDataItemListCover getCover() {
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

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> alias; 
            private Boolean audition; 
            private java.util.List<Authors> authors; 
            private String category; 
            private Boolean charge; 
            private String commCateId; 
            private OpenDataItemListCover cover; 
            private String description; 
            private Double hotScore; 
            private String itemType; 
            private String rawId; 
            private String source; 
            private String title; 
            private String type; 
            private String valid; 
            private Long id; 

            private Builder() {
            } 

            private Builder(OpenDataItemList model) {
                this.alias = model.alias;
                this.audition = model.audition;
                this.authors = model.authors;
                this.category = model.category;
                this.charge = model.charge;
                this.commCateId = model.commCateId;
                this.cover = model.cover;
                this.description = model.description;
                this.hotScore = model.hotScore;
                this.itemType = model.itemType;
                this.rawId = model.rawId;
                this.source = model.source;
                this.title = model.title;
                this.type = model.type;
                this.valid = model.valid;
                this.id = model.id;
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
             * <p>true</p>
             */
            public Builder audition(Boolean audition) {
                this.audition = audition;
                return this;
            }

            /**
             * <p>author information</p>
             */
            public Builder authors(java.util.List<Authors> authors) {
                this.authors = authors;
                return this;
            }

            /**
             * <p>Transform controlType based on the assigned public category</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Whether it is charged</p>
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
            public Builder commCateId(String commCateId) {
                this.commCateId = commCateId;
                return this;
            }

            /**
             * <p>Album thumbnail image</p>
             */
            public Builder cover(OpenDataItemListCover cover) {
                this.cover = cover;
                return this;
            }

            /**
             * <p>Content description</p>
             * 
             * <strong>example:</strong>
             * <p>作者：月不醉 简介：啥，假冒你男友？退役兵王回归都市后做了一名小保安，机缘巧合下却被冷艳女总拉去客串男友，从此之后，他与冷艳老总开始纠缠不清···拳打恶一代，脚踩高富帅，哥哥我专治各种不服。面对各类的阴谋阳谋，面对各种黑恶势力，且看哥如何称霸都市，踏上巅峰！</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Popularity score</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hotScore(Double hotScore) {
                this.hotScore = hotScore;
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
             * <p>Third-party ID of the album</p>
             * 
             * <strong>example:</strong>
             * <p>206775</p>
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
             * <p>Transform favoriteType based on the associated public category.</p>
             * 
             * <strong>example:</strong>
             * <p>program</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Indicates whether the content is playable.</p>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder valid(String valid) {
                this.valid = valid;
                return this;
            }

            /**
             * <p>Primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>26152778</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public OpenDataItemList build() {
                return new OpenDataItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCateContentResponseBody} extends {@link TeaModel}
     *
     * <p>ListCateContentResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
        private Integer currentPageNum;

        @com.aliyun.core.annotation.NameInMap("OpenDataItemList")
        private java.util.List<OpenDataItemList> openDataItemList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Result(Builder builder) {
            this.currentPageNum = builder.currentPageNum;
            this.openDataItemList = builder.openDataItemList;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return currentPageNum
         */
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        /**
         * @return openDataItemList
         */
        public java.util.List<OpenDataItemList> getOpenDataItemList() {
            return this.openDataItemList;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer currentPageNum; 
            private java.util.List<OpenDataItemList> openDataItemList; 
            private Integer pageSize; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.currentPageNum = model.currentPageNum;
                this.openDataItemList = model.openDataItemList;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>Current page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * <p>Data information</p>
             */
            public Builder openDataItemList(java.util.List<OpenDataItemList> openDataItemList) {
                this.openDataItemList = openDataItemList;
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
             * <p>Total number of records</p>
             * 
             * <strong>example:</strong>
             * <p>12002</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
