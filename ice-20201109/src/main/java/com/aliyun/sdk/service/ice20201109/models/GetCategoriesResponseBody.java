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
 * {@link GetCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>GetCategoriesResponseBody</p>
 */
public class GetCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private Category category;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCategories")
    private SubCategories subCategories;

    @com.aliyun.core.annotation.NameInMap("SubTotal")
    private Long subTotal;

    private GetCategoriesResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
        this.subCategories = builder.subCategories;
        this.subTotal = builder.subTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoriesResponseBody create() {
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

    /**
     * @return subCategories
     */
    public SubCategories getSubCategories() {
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
        private SubCategories subCategories; 
        private Long subTotal; 

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
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The subcategories in the category.</p>
         */
        public Builder subCategories(SubCategories subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        /**
         * <p>The total number of subcategories.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder subTotal(Long subTotal) {
            this.subTotal = subTotal;
            return this;
        }

        public GetCategoriesResponseBody build() {
            return new GetCategoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>GetCategoriesResponseBody</p>
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
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>46</p>
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
             * <p>The ID of the parent category.</p>
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
    /**
     * 
     * {@link GetCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>GetCategoriesResponseBody</p>
     */
    public static class SubCategoriesCategory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("SubTotal")
        private Long subTotal;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SubCategoriesCategory(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.level = builder.level;
            this.parentId = builder.parentId;
            this.subTotal = builder.subTotal;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCategoriesCategory create() {
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
         * @return subTotal
         */
        public Long getSubTotal() {
            return this.subTotal;
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
            private Long subTotal; 
            private String type; 

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>129</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The category name.</p>
             * <ul>
             * <li>The value can be up to 64 bytes in length.</li>
             * <li>The value is encoded in UTF-8.</li>
             * </ul>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The level of the category. A value of <strong>0</strong> indicates a level-1 category, a value of <strong>1</strong> indicates a level-2 category, and a value of <strong>2</strong> indicates a level-3 category.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The ID of the parent category.</p>
             * 
             * <strong>example:</strong>
             * <p>46</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The total number of subcategories.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder subTotal(Long subTotal) {
                this.subTotal = subTotal;
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

            public SubCategoriesCategory build() {
                return new SubCategoriesCategory(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>GetCategoriesResponseBody</p>
     */
    public static class SubCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private java.util.List<SubCategoriesCategory> category;

        private SubCategories(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCategories create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public java.util.List<SubCategoriesCategory> getCategory() {
            return this.category;
        }

        public static final class Builder {
            private java.util.List<SubCategoriesCategory> category; 

            /**
             * <p>The information about the category.</p>
             */
            public Builder category(java.util.List<SubCategoriesCategory> category) {
                this.category = category;
                return this;
            }

            public SubCategories build() {
                return new SubCategories(this);
            } 

        } 

    }
}
