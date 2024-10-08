// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FieldContentValue} extends {@link TeaModel}
 *
 * <p>FieldContentValue</p>
 */
public class FieldContentValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private Long sortOrder;

    @com.aliyun.core.annotation.NameInMap("FieldList")
    private java.util.List < FieldList> fieldList;

    private FieldContentValue(Builder builder) {
        this.sortOrder = builder.sortOrder;
        this.fieldList = builder.fieldList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FieldContentValue create() {
        return builder().build();
    }

    /**
     * @return sortOrder
     */
    public Long getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return fieldList
     */
    public java.util.List < FieldList> getFieldList() {
        return this.fieldList;
    }

    public static final class Builder {
        private Long sortOrder; 
        private java.util.List < FieldList> fieldList; 

        /**
         * SortOrder.
         */
        public Builder sortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * FieldList.
         */
        public Builder fieldList(java.util.List < FieldList> fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        public FieldContentValue build() {
            return new FieldContentValue(this);
        } 

    } 

    /**
     * 
     * {@link FieldContentValue} extends {@link TeaModel}
     *
     * <p>FieldContentValue</p>
     */
    public static class FieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionCn")
        private String descriptionCn;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("SortOrder")
        private Long sortOrder;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        private FieldList(Builder builder) {
            this.fieldName = builder.fieldName;
            this.description = builder.description;
            this.descriptionCn = builder.descriptionCn;
            this.category = builder.category;
            this.dataType = builder.dataType;
            this.sortOrder = builder.sortOrder;
            this.isDefault = builder.isDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldList create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionCn
         */
        public String getDescriptionCn() {
            return this.descriptionCn;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return sortOrder
         */
        public Long getSortOrder() {
            return this.sortOrder;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public static final class Builder {
            private String fieldName; 
            private String description; 
            private String descriptionCn; 
            private String category; 
            private String dataType; 
            private Long sortOrder; 
            private Boolean isDefault; 

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DescriptionCn.
             */
            public Builder descriptionCn(String descriptionCn) {
                this.descriptionCn = descriptionCn;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * SortOrder.
             */
            public Builder sortOrder(Long sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            public FieldList build() {
                return new FieldList(this);
            } 

        } 

    }
}
