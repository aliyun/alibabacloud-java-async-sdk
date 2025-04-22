// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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

        private Builder() {
        } 

        private Builder(GetCategoriesResponseBody model) {
            this.category = model.category;
            this.requestId = model.requestId;
            this.subCategories = model.subCategories;
            this.subTotal = model.subTotal;
        } 

        /**
         * <p>The information about the category.</p>
         */
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the subcategory.</p>
         */
        public Builder subCategories(SubCategories subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        /**
         * <p>The total number of subcategories.</p>
         * 
         * <strong>example:</strong>
         * <p>3795</p>
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

            private Builder() {
            } 

            private Builder(Category model) {
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.level = model.level;
                this.parentId = model.parentId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>film</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The level of the category. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: level 1 category</li>
             * <li><strong>1</strong>: level 2 category</li>
             * <li><strong>2</strong>: level 3 category</li>
             * </ul>
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
             * <p>100012****</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The type of the category. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: audio, video, and image files</li>
             * <li><strong>material</strong>: short video materials</li>
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

            private Builder() {
            } 

            private Builder(SubCategoriesCategory model) {
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.level = model.level;
                this.parentId = model.parentId;
                this.subTotal = model.subTotal;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>film</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The level of the category. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: level 1 category</li>
             * <li><strong>1</strong>: level 2 category</li>
             * <li><strong>2</strong>: level 3 category</li>
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
             * <p>The ID of the parent category.</p>
             * 
             * <strong>example:</strong>
             * <p>10020****</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The total number of subcategories.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subTotal(Long subTotal) {
                this.subTotal = subTotal;
                return this;
            }

            /**
             * <p>The type of the subcategory. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: audio, video, and image files</li>
             * <li><strong>material</strong>: short video materials</li>
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

            private Builder() {
            } 

            private Builder(SubCategories model) {
                this.category = model.category;
            } 

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
