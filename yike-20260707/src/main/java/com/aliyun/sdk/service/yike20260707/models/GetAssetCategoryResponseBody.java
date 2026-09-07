// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetAssetCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetCategoryResponseBody</p>
 */
public class GetAssetCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private Category category;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCategories")
    private java.util.List<SubCategories> subCategories;

    @com.aliyun.core.annotation.NameInMap("SubTotal")
    private Long subTotal;

    private GetAssetCategoryResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
        this.subCategories = builder.subCategories;
        this.subTotal = builder.subTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return subCategories
     */
    public java.util.List<SubCategories> getSubCategories() {
        return this.subCategories;
    }

    /**
     * @return subTotal
     */
    public Long getSubTotal() {
        return this.subTotal;
    }

    public static final class Builder {
        private Category category; 
        private String requestId; 
        private java.util.List<SubCategories> subCategories; 
        private Long subTotal; 

        private Builder() {
        } 

        private Builder(GetAssetCategoryResponseBody model) {
            this.category = model.category;
            this.requestId = model.requestId;
            this.subCategories = model.subCategories;
            this.subTotal = model.subTotal;
        } 

        /**
         * <p>The category details.</p>
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

        /**
         * <p>The list of subcategories.</p>
         */
        public Builder subCategories(java.util.List<SubCategories> subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        /**
         * <p>The number of subcategories.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder subTotal(Long subTotal) {
            this.subTotal = subTotal;
            return this;
        }

        public GetAssetCategoryResponseBody build() {
            return new GetAssetCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetCategoryResponseBody</p>
     */
    public static class Category extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        private Category(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.level = builder.level;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
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

        public static final class Builder {
            private Long categoryId; 
            private String categoryName; 
            private Long level; 
            private Long parentId; 

            private Builder() {
            } 

            private Builder(Category model) {
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.level = model.level;
                this.parentId = model.parentId;
            } 

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The category name.</p>
             * 
             * <strong>example:</strong>
             * <p>scenery</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The category level. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: level-1 category.</li>
             * <li><strong>1</strong>: level-2 category.</li>
             * <li><strong>2</strong>: level-3 category.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The parent category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAssetCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetCategoryResponseBody</p>
     */
    public static class SubCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("SubTotal")
        private Long subTotal;

        private SubCategories(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.level = builder.level;
            this.parentId = builder.parentId;
            this.subTotal = builder.subTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCategories create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
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
         * @return subTotal
         */
        public Long getSubTotal() {
            return this.subTotal;
        }

        public static final class Builder {
            private Long categoryId; 
            private String categoryName; 
            private Long level; 
            private Long parentId; 
            private Long subTotal; 

            private Builder() {
            } 

            private Builder(SubCategories model) {
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.level = model.level;
                this.parentId = model.parentId;
                this.subTotal = model.subTotal;
            } 

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The category name.</p>
             * 
             * <strong>example:</strong>
             * <p>sea</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The category level.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The parent category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The total number of subcategories.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subTotal(Long subTotal) {
                this.subTotal = subTotal;
                return this;
            }

            public SubCategories build() {
                return new SubCategories(this);
            } 

        } 

    }
}
