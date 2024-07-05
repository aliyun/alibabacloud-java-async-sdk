// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The information about the category.
         */
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCategoryResponseBody build() {
            return new AddCategoryResponseBody(this);
        } 

    } 

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
             * The ID of the category. You can use the value of this parameter when you call the [UpdateCategory](~~UpdateCategory~~), [DeleteCategory](~~DeleteCategory~~), and [GetCategories](~~GetCategories~~) operations.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The level of the category. Valid values:
             * <p>
             * 
             * *   **0**: level 1 category
             * *   **1**: level 2 category
             * *   **1**: level 3 category
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * The ID of the parent category.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The type of the category. Valid values:
             * <p>
             * 
             * *   **default**: audio, video, and image files
             * *   **material**: short video materials
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
