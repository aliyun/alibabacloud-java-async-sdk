// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
         * <p>Details about account privileges in the specified region.</p>
         */
        public Builder accountAttributeItems(AccountAttributeItems accountAttributeItems) {
            this.accountAttributeItems = accountAttributeItems;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8CE45CD5-31FB-47C2-959D-CA8144CE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountAttributesResponseBody build() {
            return new DescribeAccountAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAttributesResponseBody</p>
     */
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
             * <p>The number of privilege attributes in the account.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The data disk category. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_essd: enhanced SSD (ESSD)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * <p>The expiration time of a privilege. This parameter is returned only when the account privilege has an expiration time. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T12:30:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The billing method of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The value of the resource quota in the specified region. Valid values:</p>
             * <p>The values returned for the resource quotas to which the following AttributeName values correspond are 0 or positive integers:</p>
             * <ul>
             * <li>max-security-groups</li>
             * <li>max-elastic-network-interfaces</li>
             * <li>max-postpaid-instance-vcpu-count</li>
             * <li>max-spot-instance-vcpu-count</li>
             * <li>used-postpaid-instance-vcpu-count</li>
             * <li>used-spot-instance-vcpu-count</li>
             * <li>max-postpaid-yundisk-capacity (the value is deprecated)</li>
             * <li>used-postpaid-yundisk-capacity (the value is deprecated)</li>
             * <li>max-dedicated-hosts</li>
             * <li>max-axt-command-count</li>
             * <li>max-axt-invocation-daily</li>
             * <li>max-cloud-assistant-activation-count</li>
             * </ul>
             * <p>When AttributeName is set to supported-postpay-instance-types, instance types are returned. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
             * <p>When AttributeName is set to real-name-authentications, one of the following values is returned:</p>
             * <ul>
             * <li>yes</li>
             * <li>none</li>
             * <li>unnecessary</li>
             * </ul>
             * <p>When AttributeName is set to instance-network-type, one of the following values is returned:</p>
             * <ul>
             * <li>vpc</li>
             * <li>classic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The ID of the zone in which the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link DescribeAccountAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAttributesResponseBody</p>
     */
    public static class AttributeValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ValueItem")
        private java.util.List<ValueItem> valueItem;

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
        public java.util.List<ValueItem> getValueItem() {
            return this.valueItem;
        }

        public static final class Builder {
            private java.util.List<ValueItem> valueItem; 

            /**
             * ValueItem.
             */
            public Builder valueItem(java.util.List<ValueItem> valueItem) {
                this.valueItem = valueItem;
                return this;
            }

            public AttributeValues build() {
                return new AttributeValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAttributesResponseBody</p>
     */
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
             * <p>The type of the resource quota in the specified region. Valid values:</p>
             * <ul>
             * <li>instance-network-type: the available network types.</li>
             * <li>max-security-groups: the maximum number of security groups.</li>
             * <li>max-elastic-network-interfaces: the maximum number of ENIs.</li>
             * <li>max-postpaid-instance-vcpu-count: the maximum number of vCPUs for pay-as-you-go instances.</li>
             * <li>max-spot-instance-vcpu-count: the maximum number of vCPUs for preemptible instances.</li>
             * <li>used-postpaid-instance-vcpu-count: the number of vCPUs that were allocated to pay-as-you-go instances.</li>
             * <li>used-spot-instance-vcpu-count: the number of vCPUs that were allocated to preemptible instances.</li>
             * <li>max-postpaid-yundisk-capacity: the maximum capacity of pay-as-you-go data disks. (The value is deprecated.)</li>
             * <li>used-postpaid-yundisk-capacity: the capacity of pay-as-you-go data disks that were created. (The value is deprecated.)</li>
             * <li>max-dedicated-hosts: the maximum number of dedicated hosts.</li>
             * <li>supported-postpaid-instance-types: the instance types of pay-as-you-go I/O optimized instances.</li>
             * <li>max-axt-command-count: the maximum number of Cloud Assistant commands.</li>
             * <li>max-axt-invocation-daily: the maximum number of Cloud Assistant command executions per day.</li>
             * <li>real-name-authentication: whether the account completed the real-name verification.</li>
             * <li>max-cloud-assistant-activation-count: the maximum number of activation codes that can be created to use to register managed instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>max-security-groups</p>
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * <p>The values of resource quotas.</p>
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
    /**
     * 
     * {@link DescribeAccountAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAttributesResponseBody</p>
     */
    public static class AccountAttributeItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountAttributeItem")
        private java.util.List<AccountAttributeItem> accountAttributeItem;

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
        public java.util.List<AccountAttributeItem> getAccountAttributeItem() {
            return this.accountAttributeItem;
        }

        public static final class Builder {
            private java.util.List<AccountAttributeItem> accountAttributeItem; 

            /**
             * AccountAttributeItem.
             */
            public Builder accountAttributeItem(java.util.List<AccountAttributeItem> accountAttributeItem) {
                this.accountAttributeItem = accountAttributeItem;
                return this;
            }

            public AccountAttributeItems build() {
                return new AccountAttributeItems(this);
            } 

        } 

    }
}
