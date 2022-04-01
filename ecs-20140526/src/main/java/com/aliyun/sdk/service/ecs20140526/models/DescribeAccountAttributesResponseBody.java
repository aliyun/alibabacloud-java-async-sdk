// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountAttributesResponseBody</p>
 */
public class DescribeAccountAttributesResponseBody extends TeaModel {
    @NameInMap("AccountAttributeItems")
    private AccountAttributeItems accountAttributeItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAccountAttributesResponseBody(Builder builder) {
        this.accountAttributeItems = builder.accountAttributeItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountAttributeItems
     */
    public AccountAttributeItems getAccountAttributeItems() {
        return this.accountAttributeItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountAttributeItems accountAttributeItems; 
        private String requestId; 

        /**
         * AccountAttributeItems.
         */
        public Builder accountAttributeItems(AccountAttributeItems accountAttributeItems) {
            this.accountAttributeItems = accountAttributeItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountAttributesResponseBody build() {
            return new DescribeAccountAttributesResponseBody(this);
        } 

    } 

    public static class ValueItem extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("DiskCategory")
        private String diskCategory;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Value")
        private String value;

        @NameInMap("ZoneId")
        private String zoneId;

        private ValueItem(Builder builder) {
            this.count = builder.count;
            this.diskCategory = builder.diskCategory;
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceType = builder.instanceType;
            this.value = builder.value;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueItem create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer count; 
            private String diskCategory; 
            private String expiredTime; 
            private String instanceChargeType; 
            private String instanceType; 
            private String value; 
            private String zoneId; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * DiskCategory.
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ValueItem build() {
                return new ValueItem(this);
            } 

        } 

    }
    public static class AttributeValues extends TeaModel {
        @NameInMap("ValueItem")
        private java.util.List < ValueItem> valueItem;

        private AttributeValues(Builder builder) {
            this.valueItem = builder.valueItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeValues create() {
            return builder().build();
        }

        /**
         * @return valueItem
         */
        public java.util.List < ValueItem> getValueItem() {
            return this.valueItem;
        }

        public static final class Builder {
            private java.util.List < ValueItem> valueItem; 

            /**
             * ValueItem.
             */
            public Builder valueItem(java.util.List < ValueItem> valueItem) {
                this.valueItem = valueItem;
                return this;
            }

            public AttributeValues build() {
                return new AttributeValues(this);
            } 

        } 

    }
    public static class AccountAttributeItem extends TeaModel {
        @NameInMap("AttributeName")
        private String attributeName;

        @NameInMap("AttributeValues")
        private AttributeValues attributeValues;

        private AccountAttributeItem(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValues = builder.attributeValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountAttributeItem create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValues
         */
        public AttributeValues getAttributeValues() {
            return this.attributeValues;
        }

        public static final class Builder {
            private String attributeName; 
            private AttributeValues attributeValues; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValues.
             */
            public Builder attributeValues(AttributeValues attributeValues) {
                this.attributeValues = attributeValues;
                return this;
            }

            public AccountAttributeItem build() {
                return new AccountAttributeItem(this);
            } 

        } 

    }
    public static class AccountAttributeItems extends TeaModel {
        @NameInMap("AccountAttributeItem")
        private java.util.List < AccountAttributeItem> accountAttributeItem;

        private AccountAttributeItems(Builder builder) {
            this.accountAttributeItem = builder.accountAttributeItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountAttributeItems create() {
            return builder().build();
        }

        /**
         * @return accountAttributeItem
         */
        public java.util.List < AccountAttributeItem> getAccountAttributeItem() {
            return this.accountAttributeItem;
        }

        public static final class Builder {
            private java.util.List < AccountAttributeItem> accountAttributeItem; 

            /**
             * AccountAttributeItem.
             */
            public Builder accountAttributeItem(java.util.List < AccountAttributeItem> accountAttributeItem) {
                this.accountAttributeItem = accountAttributeItem;
                return this;
            }

            public AccountAttributeItems build() {
                return new AccountAttributeItems(this);
            } 

        } 

    }
}
