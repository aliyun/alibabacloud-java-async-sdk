// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
 * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoadBalancerAttributeResponseBody</p>
 */
public class GetLoadBalancerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerBusinessStatus")
    private String loadBalancerBusinessStatus;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TrafficMode")
    private String trafficMode;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    private java.util.List<ZoneMappings> zoneMappings;

    private GetLoadBalancerAttributeResponseBody(Builder builder) {
        this.addressIpVersion = builder.addressIpVersion;
        this.createTime = builder.createTime;
        this.loadBalancerBusinessStatus = builder.loadBalancerBusinessStatus;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.trafficMode = builder.trafficMode;
        this.vpcId = builder.vpcId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoadBalancerAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressIpVersion
     */
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return loadBalancerBusinessStatus
     */
    public String getLoadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return trafficMode
     */
    public String getTrafficMode() {
        return this.trafficMode;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List<ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder {
        private String addressIpVersion; 
        private String createTime; 
        private String loadBalancerBusinessStatus; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerStatus; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String trafficMode; 
        private String vpcId; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
        } 

        private Builder(GetLoadBalancerAttributeResponseBody model) {
            this.addressIpVersion = model.addressIpVersion;
            this.createTime = model.createTime;
            this.loadBalancerBusinessStatus = model.loadBalancerBusinessStatus;
            this.loadBalancerId = model.loadBalancerId;
            this.loadBalancerName = model.loadBalancerName;
            this.loadBalancerStatus = model.loadBalancerStatus;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.tags = model.tags;
            this.trafficMode = model.trafficMode;
            this.vpcId = model.vpcId;
            this.zoneMappings = model.zoneMappings;
        } 

        /**
         * <p>The protocol version. Valid values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The time when the resource was created. The time follows the ISO 8601 standard in the <strong>yyyy-MM-ddTHH:mm:ssZ</strong> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-08T10:12:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The business status of the GWLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: running as expected</li>
         * <li><strong>FinancialLocked</strong>: locked due to overdue payments</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder loadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }

        /**
         * <p>The GWLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gwlb-9njtjmqt7zfcqm****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The GWLB instance name.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>gwlb</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The GWLB instance status. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The GWLB instance is running.</li>
         * <li><strong>Inactive</strong>: The GWLB instance is disabled. Listeners of GWLB instances in the Inactive state do not forward traffic.</li>
         * <li><strong>Provisioning</strong>: The GWLB instance is being created.</li>
         * <li><strong>Configuring</strong>: The GWLB instance is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6DC5DDC-9560-59BF-80FA-ED1E5CB417DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmx7pmxcy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TrafficMode.
         */
        public Builder trafficMode(String trafficMode) {
            this.trafficMode = trafficMode;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-k1aajsbwbaq4todet****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The mappings between zones and vSwitches. You must specify at least one zone. You can specify at most 20 zones. If the region supports two or more zones, specify at least two zones.</p>
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public GetLoadBalancerAttributeResponseBody build() {
            return new GetLoadBalancerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testTagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testTagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class LoadBalancerAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpv4Address")
        private String privateIpv4Address;

        private LoadBalancerAddresses(Builder builder) {
            this.eniId = builder.eniId;
            this.privateIpv4Address = builder.privateIpv4Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerAddresses create() {
            return builder().build();
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return privateIpv4Address
         */
        public String getPrivateIpv4Address() {
            return this.privateIpv4Address;
        }

        public static final class Builder {
            private String eniId; 
            private String privateIpv4Address; 

            private Builder() {
            } 

            private Builder(LoadBalancerAddresses model) {
                this.eniId = model.eniId;
                this.privateIpv4Address = model.privateIpv4Address;
            } 

            /**
             * <p>The ID of the elastic network interface (ENI) used by the GWLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp1iahwz3rzgvltz****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The private IPv4 address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder privateIpv4Address(String privateIpv4Address) {
                this.privateIpv4Address = privateIpv4Address;
                return this;
            }

            public LoadBalancerAddresses build() {
                return new LoadBalancerAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerAddresses")
        private java.util.List<LoadBalancerAddresses> loadBalancerAddresses;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.loadBalancerAddresses = builder.loadBalancerAddresses;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return loadBalancerAddresses
         */
        public java.util.List<LoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<LoadBalancerAddresses> loadBalancerAddresses; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.loadBalancerAddresses = model.loadBalancerAddresses;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The GWLB instance addresses.</p>
             */
            public Builder loadBalancerAddresses(java.util.List<LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * <p>The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of a GWLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6v8l7d2f1k53xrl****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
}
