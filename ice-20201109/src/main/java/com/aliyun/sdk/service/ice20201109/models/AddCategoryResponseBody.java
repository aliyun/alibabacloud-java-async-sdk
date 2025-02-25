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
 * {@link AddCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>AddCategoryResponseBody</p>
 */
public class AddCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private Category category;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCategoryResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Category category; 
        private String requestId; 

        /**
         * <p>The information about the category.</p>
         */
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCategoryResponseBody build() {
            return new AddCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>AddCategoryResponseBody</p>
     */
    public static class Category extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Category(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.level = builder.level;
            this.parentId = builder.parentId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long cateId; 
            private String cateName; 
            private Long level; 
            private Long parentId; 
            private String type; 

            /**
             * <p>The ID of the created category.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The category name.</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The level of the category. A value of <strong>0</strong> indicates a level-1 category, a value of <strong>1</strong> indicates a level-2 category, and a value of <strong>2</strong> indicates a level-3 category.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The ID of the parent category. By default, if ParentId is left empty or less than 1, -1 is returned, which indicates that the created category is the root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The type of the category. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: audio, video, and image files. This is the default value.</li>
             * <li><strong>material</strong>: short video materials.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
}
