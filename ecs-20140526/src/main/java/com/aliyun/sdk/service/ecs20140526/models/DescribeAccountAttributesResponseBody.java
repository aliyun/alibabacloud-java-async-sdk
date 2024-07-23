// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountAttributesResponseBody</p>
 */
public class DescribeAccountAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountAttributeItems")
    private AccountAttributeItems accountAttributeItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * Details about account privileges specified by AccountAttributeItem in the specified region.
         */
        public Builder accountAttributeItems(AccountAttributeItems accountAttributeItems) {
            this.accountAttributeItems = accountAttributeItems;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("DiskCategory")
        private String diskCategory;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * The number of privilege attributes in the account.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The data disk category. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: enhanced SSD (ESSD)
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * The expiration time of a privilege. This parameter is returned only when the account privilege has an expiration time. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The billing method of the instance.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The value of the resource quota in the specified region. Valid values:
             * <p>
             * 
             * The values returned for the resource quotas to which the following AttributeName values correspond are 0 or positive integers:
             * 
             * *   max-security-groups
             * *   max-elastic-network-interfaces
             * *   max-postpaid-instance-vcpu-count
             * *   max-spot-instance-vcpu-count
             * *   used-postpaid-instance-vcpu-count
             * *   used-spot-instance-vcpu-count
             * *   max-postpaid-yundisk-capacity(This value is deprecated)
             * *   used-postpaid-yundisk-capacity(This value is deprecated)
             * *   max-dedicated-hosts
             * *   max-axt-command-count
             * *   max-axt-invocation-daily
             * *   max-cloud-assistant-activation-count
             * 
             * When the AttributeName parameter is set to supported-postpay-instance-types, an instance type is returned. For more information, see [Instance families](~~25378~~).
             * 
             * When the AttributeName parameter is set to real-name-authentications, one of the following values is returned:
             * 
             * *   yes
             * *   none
             * *   unnecessary
             * 
             * When the AttributeName parameter is set to instance-network-type, one of the following values is returned:
             * 
             * *   vpc
             * *   classic
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The ID of the zone in which the resource resides.
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
        @com.aliyun.core.annotation.NameInMap("ValueItem")
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
        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("AttributeValues")
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
             * The type of the resource quota in the specified region. Valid values:
             * <p>
             * 
             * *   instance-network-type: available network types
             * *   max-security-groups: the maximum number of security groups
             * *   max-elastic-network-interfaces: the maximum number of ENIs
             * *   max-postpaid-instance-vcpu-count: the maximum number of vCPUs for pay-as-you-go instances
             * *   max-spot-instance-vcpu-count: the maximum number of vCPUs for preemptible instances
             * *   used-postpaid-instance-vcpu-count: the number of vCPUs that have been allocated to pay-as-you-go instances
             * *   used-spot-instance-vcpu-count: the number of vCPUs that have been allocated to preemptible instances
             * *   max-postpaid-yundisk-capacity: the maximum capacity of pay-as-you-go data disks(This value is deprecated)
             * *   used-postpaid-yundisk-capacity: the capacity of pay-as-you-go disks that have been created(This value is deprecated)
             * *   max-dedicated-hosts: the maximum number of dedicated hosts
             * *   supported-postpaid-instance-types: the instance types of pay-as-you-go I/O optimized instances
             * *   max-axt-command-count: the maximum number of Cloud Assistant commands
             * *   max-axt-invocation-daily: the maximum number of Cloud Assistant command executions per day
             * *   real-name-authentication: whether the account has passed the real-name verification
             * *   max-cloud-assistant-activation-count: the maximum number of activation codes that can be created to use to register managed instances
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * The specific values of resource quotas.
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
        @com.aliyun.core.annotation.NameInMap("AccountAttributeItem")
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
