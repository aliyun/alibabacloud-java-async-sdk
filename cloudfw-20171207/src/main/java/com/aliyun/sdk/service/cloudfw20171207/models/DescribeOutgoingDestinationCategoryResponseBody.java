// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeOutgoingDestinationCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDestinationCategoryResponseBody</p>
 */
public class DescribeOutgoingDestinationCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TypeList")
    private java.util.List<TypeList> typeList;

    private DescribeOutgoingDestinationCategoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.typeList = builder.typeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDestinationCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return typeList
     */
    public java.util.List<TypeList> getTypeList() {
        return this.typeList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TypeList> typeList; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingDestinationCategoryResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.typeList = model.typeList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TypeList.
         */
        public Builder typeList(java.util.List<TypeList> typeList) {
            this.typeList = typeList;
            return this;
        }

        public DescribeOutgoingDestinationCategoryResponseBody build() {
            return new DescribeOutgoingDestinationCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutgoingDestinationCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationCategoryResponseBody</p>
     */
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryDescribe")
        private String categoryDescribe;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ClassId")
        private String classId;

        private CategoryList(Builder builder) {
            this.categoryDescribe = builder.categoryDescribe;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.classId = builder.classId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
            return builder().build();
        }

        /**
         * @return categoryDescribe
         */
        public String getCategoryDescribe() {
            return this.categoryDescribe;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return classId
         */
        public String getClassId() {
            return this.classId;
        }

        public static final class Builder {
            private String categoryDescribe; 
            private String categoryId; 
            private String categoryName; 
            private String classId; 

            private Builder() {
            } 

            private Builder(CategoryList model) {
                this.categoryDescribe = model.categoryDescribe;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.classId = model.classId;
            } 

            /**
             * CategoryDescribe.
             */
            public Builder categoryDescribe(String categoryDescribe) {
                this.categoryDescribe = categoryDescribe;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ClassId.
             */
            public Builder classId(String classId) {
                this.classId = classId;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOutgoingDestinationCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationCategoryResponseBody</p>
     */
    public static class TypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryList")
        private java.util.List<CategoryList> categoryList;

        @com.aliyun.core.annotation.NameInMap("TypeDescribe")
        private String typeDescribe;

        @com.aliyun.core.annotation.NameInMap("TypeId")
        private String typeId;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private TypeList(Builder builder) {
            this.categoryList = builder.categoryList;
            this.typeDescribe = builder.typeDescribe;
            this.typeId = builder.typeId;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeList create() {
            return builder().build();
        }

        /**
         * @return categoryList
         */
        public java.util.List<CategoryList> getCategoryList() {
            return this.categoryList;
        }

        /**
         * @return typeDescribe
         */
        public String getTypeDescribe() {
            return this.typeDescribe;
        }

        /**
         * @return typeId
         */
        public String getTypeId() {
            return this.typeId;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private java.util.List<CategoryList> categoryList; 
            private String typeDescribe; 
            private String typeId; 
            private String typeName; 

            private Builder() {
            } 

            private Builder(TypeList model) {
                this.categoryList = model.categoryList;
                this.typeDescribe = model.typeDescribe;
                this.typeId = model.typeId;
                this.typeName = model.typeName;
            } 

            /**
             * CategoryList.
             */
            public Builder categoryList(java.util.List<CategoryList> categoryList) {
                this.categoryList = categoryList;
                return this;
            }

            /**
             * TypeDescribe.
             */
            public Builder typeDescribe(String typeDescribe) {
                this.typeDescribe = typeDescribe;
                return this;
            }

            /**
             * TypeId.
             */
            public Builder typeId(String typeId) {
                this.typeId = typeId;
                return this;
            }

            /**
             * TypeName.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public TypeList build() {
                return new TypeList(this);
            } 

        } 

    }
}
