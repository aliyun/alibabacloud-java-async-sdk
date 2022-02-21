// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("AccountAttributeItems")
    private AccountAttributeItems accountAttributeItems;

    private DescribeAccountAttributesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.accountAttributeItems = builder.accountAttributeItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return accountAttributeItems
     */
    public AccountAttributeItems getAccountAttributeItems() {
        return this.accountAttributeItems;
    }

    public static final class Builder {
        private String requestId; 
        private AccountAttributeItems accountAttributeItems; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Specify geographical lower account privileges AccountAttributeItem collection of information.
         */
        public Builder accountAttributeItems(AccountAttributeItems accountAttributeItems) {
            this.accountAttributeItems = accountAttributeItems;
            return this;
        }

        public DescribeAccountAttributesResponseBody build() {
            return new DescribeAccountAttributesResponseBody(this);
        } 

    } 

    public static class ValueItem extends TeaModel {
        @NameInMap("DiskCategory")
        private String diskCategory;

        @NameInMap("Value")
        private String value;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        private ValueItem(Builder builder) {
            this.diskCategory = builder.diskCategory;
            this.value = builder.value;
            this.expiredTime = builder.expiredTime;
            this.zoneId = builder.zoneId;
            this.instanceType = builder.instanceType;
            this.count = builder.count;
            this.instanceChargeType = builder.instanceChargeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueItem create() {
            return builder().build();
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public static final class Builder {
            private String diskCategory; 
            private String value; 
            private String expiredTime; 
            private String zoneId; 
            private String instanceType; 
            private Integer count; 
            private String instanceChargeType; 

            /**
             * The type of the data disk. Possible values:
             * <p>
             * -cloud_efficiency: Ultra disk.
             * -cloud_ssd:SSD cloud disk.
             * -cloud_essd:ESSD.
             * 
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * The quota of a type of resource in the current region or all regions. Possible values:
             * <p>
             * 
             * The following classification return value 0 or a positive integer:
             * 
             * -max-security-groups
             * -max-elastic-network-interfaces
             * -max-postpaid-instance-vcpu-count
             * -max-spot-instance-vcpu-count
             * -used-postpaid-instance-vcpu-count
             * -used-spot-instance-vcpu-count
             * -max-postpaid-yundisk-capacity
             * -used-postpaid-yundisk-capacity
             * -max-dedicated-hosts
             * -max-axt-command-count
             * -max-axt-invocation-daily
             * 
             * Assortment for supported-postpay-instance-types when return value: instance dimension value. See [instance dimension family](~~ 25378 ~~).
             * 
             * Returns the value when the type is real-name-authentications:
             * 
             * -Yes
             * -none
             * -unnecessary
             * 
             * Return value of instance-network-type:
             * 
             * -vpc
             * -classic
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The expiration time of the privilege. This parameter is returned only for account privileges that have the Expiration Time. In accordance with [ISO 8601](~~ 25696 ~~) Standard said, and use UTC +0 time. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Privilege attribute, type the number.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The billing method of the instance.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * The quota category of resources in the specified region. Possible values:
             * <p>
             * 
             * -instance-network-type: optional network type.
             * -max-security-groups: the number of security groups.
             * -max-elastic-network-interfaces: the number of Enis.
             * -max-postpaid-instance-vcpu-count: the maximum number of vCPU cores for a pay-as-you-go instance.
             * -max-spot-instance-vcpu-count: the maximum number of VCPUs in a preemptible instance.
             * -used-postpaid-instance-vcpu-count: the number of vCPU cores of a pay-as-you-go instance.
             * -used-spot-instance-vcpu-count: the number of vCPU cores of a preemptible instance.
             * -max-postpaid-yundisk-capacity: the maximum capacity of a pay-as-you-go cloud disk used as a data disk.
             * -used-postpaid-yundisk-capacity: the capacity of a pay-as-you-go cloud disk used as a data disk.
             * -max-dedicated-hosts: the number of dedicated hosts.
             * -supported-postpaid-instance-types: pay-as-you-go I/O optimized instance types.
             * -max-axt-command-count: the number of cloud assistant commands.
             * -max-axt-invocation-daily: the number of cloud assistant commands that can be executed per day.
             * -real-name-authentication: indicates whether the account has completed real-name authentication.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * The number of resource quotas.
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
