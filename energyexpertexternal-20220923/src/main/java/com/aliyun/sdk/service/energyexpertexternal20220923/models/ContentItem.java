// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ContentItem} extends {@link TeaModel}
 *
 * <p>ContentItem</p>
 */
public class ContentItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("extInfo")
    private java.util.List < ExtInfo> extInfo;

    @com.aliyun.core.annotation.NameInMap("score")
    private Double score;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ContentItem(Builder builder) {
        this.extInfo = builder.extInfo;
        this.score = builder.score;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContentItem create() {
        return builder().build();
    }

    /**
     * @return extInfo
     */
    public java.util.List < ExtInfo> getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < ExtInfo> extInfo; 
        private Double score; 
        private String text; 
        private String type; 

        /**
         * extInfo.
         */
        public Builder extInfo(java.util.List < ExtInfo> extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        /**
         * score.
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ContentItem build() {
            return new ContentItem(this);
        } 

    } 

    /**
     * 
     * {@link ContentItem} extends {@link TeaModel}
     *
     * <p>ContentItem</p>
     */
    public static class Pos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private Pos(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pos create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public Pos build() {
                return new Pos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ContentItem} extends {@link TeaModel}
     *
     * <p>ContentItem</p>
     */
    public static class ExtInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alignment")
        private String alignment;

        @com.aliyun.core.annotation.NameInMap("index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private java.util.List < Long > pageNum;

        @com.aliyun.core.annotation.NameInMap("pos")
        private java.util.List < Pos> pos;

        @com.aliyun.core.annotation.NameInMap("subType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("uniqueId")
        private String uniqueId;

        private ExtInfo(Builder builder) {
            this.alignment = builder.alignment;
            this.index = builder.index;
            this.level = builder.level;
            this.pageNum = builder.pageNum;
            this.pos = builder.pos;
            this.subType = builder.subType;
            this.text = builder.text;
            this.type = builder.type;
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtInfo create() {
            return builder().build();
        }

        /**
         * @return alignment
         */
        public String getAlignment() {
            return this.alignment;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return pageNum
         */
        public java.util.List < Long > getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pos
         */
        public java.util.List < Pos> getPos() {
            return this.pos;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private String alignment; 
            private Long index; 
            private Long level; 
            private java.util.List < Long > pageNum; 
            private java.util.List < Pos> pos; 
            private String subType; 
            private String text; 
            private String type; 
            private String uniqueId; 

            /**
             * alignment.
             */
            public Builder alignment(String alignment) {
                this.alignment = alignment;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(java.util.List < Long > pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pos.
             */
            public Builder pos(java.util.List < Pos> pos) {
                this.pos = pos;
                return this;
            }

            /**
             * subType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * uniqueId.
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public ExtInfo build() {
                return new ExtInfo(this);
            } 

        } 

    }
}
