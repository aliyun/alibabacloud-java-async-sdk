// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceValiditySchemaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceValiditySchemaResponseBody</p>
 */
public class DescribeDeviceValiditySchemaResponseBody extends TeaModel {
    @NameInMap("ItemList")
    private java.util.List < ItemList> itemList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeviceValiditySchemaResponseBody(Builder builder) {
        this.itemList = builder.itemList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceValiditySchemaResponseBody create() {
        return builder().build();
    }

    /**
     * @return itemList
     */
    public java.util.List < ItemList> getItemList() {
        return this.itemList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ItemList> itemList; 
        private String requestId; 

        /**
         * ItemList.
         */
        public Builder itemList(java.util.List < ItemList> itemList) {
            this.itemList = itemList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeviceValiditySchemaResponseBody build() {
            return new DescribeDeviceValiditySchemaResponseBody(this);
        } 

    } 

    public static class ItemList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("EnumListStr")
        private String enumListStr;

        @NameInMap("ExclusiveMaximum")
        private Boolean exclusiveMaximum;

        @NameInMap("ExclusiveMinimum")
        private Boolean exclusiveMinimum;

        @NameInMap("ItemType")
        private String itemType;

        @NameInMap("MaxLength")
        private Integer maxLength;

        @NameInMap("Maximum")
        private Float maximum;

        @NameInMap("MinLength")
        private Integer minLength;

        @NameInMap("Minimum")
        private Float minimum;

        @NameInMap("Path")
        private String path;

        @NameInMap("Required")
        private String required;

        @NameInMap("Type")
        private String type;

        private ItemList(Builder builder) {
            this.description = builder.description;
            this.enumListStr = builder.enumListStr;
            this.exclusiveMaximum = builder.exclusiveMaximum;
            this.exclusiveMinimum = builder.exclusiveMinimum;
            this.itemType = builder.itemType;
            this.maxLength = builder.maxLength;
            this.maximum = builder.maximum;
            this.minLength = builder.minLength;
            this.minimum = builder.minimum;
            this.path = builder.path;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enumListStr
         */
        public String getEnumListStr() {
            return this.enumListStr;
        }

        /**
         * @return exclusiveMaximum
         */
        public Boolean getExclusiveMaximum() {
            return this.exclusiveMaximum;
        }

        /**
         * @return exclusiveMinimum
         */
        public Boolean getExclusiveMinimum() {
            return this.exclusiveMinimum;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maximum
         */
        public Float getMaximum() {
            return this.maximum;
        }

        /**
         * @return minLength
         */
        public Integer getMinLength() {
            return this.minLength;
        }

        /**
         * @return minimum
         */
        public Float getMinimum() {
            return this.minimum;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String enumListStr; 
            private Boolean exclusiveMaximum; 
            private Boolean exclusiveMinimum; 
            private String itemType; 
            private Integer maxLength; 
            private Float maximum; 
            private Integer minLength; 
            private Float minimum; 
            private String path; 
            private String required; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnumListStr.
             */
            public Builder enumListStr(String enumListStr) {
                this.enumListStr = enumListStr;
                return this;
            }

            /**
             * ExclusiveMaximum.
             */
            public Builder exclusiveMaximum(Boolean exclusiveMaximum) {
                this.exclusiveMaximum = exclusiveMaximum;
                return this;
            }

            /**
             * ExclusiveMinimum.
             */
            public Builder exclusiveMinimum(Boolean exclusiveMinimum) {
                this.exclusiveMinimum = exclusiveMinimum;
                return this;
            }

            /**
             * ItemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * Maximum.
             */
            public Builder maximum(Float maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * Minimum.
             */
            public Builder minimum(Float minimum) {
                this.minimum = minimum;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
