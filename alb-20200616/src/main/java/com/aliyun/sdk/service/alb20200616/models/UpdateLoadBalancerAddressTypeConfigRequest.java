// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link UpdateLoadBalancerAddressTypeConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoadBalancerAddressTypeConfigRequest</p>
 */
public class UpdateLoadBalancerAddressTypeConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainResourceType")
    private java.util.List<String> retainResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    private java.util.List<ZoneMappings> zoneMappings;

    private UpdateLoadBalancerAddressTypeConfigRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.retainResourceType = builder.retainResourceType;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerAddressTypeConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return retainResourceType
     */
    public java.util.List<String> getRetainResourceType() {
        return this.retainResourceType;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List<ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<UpdateLoadBalancerAddressTypeConfigRequest, Builder> {
        private String addressType; 
        private String clientToken; 
        private String dryRun; 
        private String loadBalancerId; 
        private java.util.List<String> retainResourceType; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoadBalancerAddressTypeConfigRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.loadBalancerId = request.loadBalancerId;
            this.retainResourceType = request.retainResourceType;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * <p>The target network type. Valid values:</p>
         * <ul>
         * <li><p><strong>Internet</strong>: The load balancing instance has a public IP address, and its DNS domain name is resolved to the public IP address. The load balancing instance can be accessed over the Internet.</p>
         * </li>
         * <li><p><strong>Intranet</strong>: The load balancing instance has only a private IP address, and its DNS domain name is resolved to the private IP address. The load balancing instance can be accessed only within the internal network environment of the VPC where it resides.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>Generate a unique value from your client for this parameter. ClientToken supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sends a dry run request. The network type of the instance is not changed. The system checks whether the required parameters are specified, the request format is valid, and the business limits are met. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
         * <li><strong>false</strong> (default): Sends a regular request. If the check passes, the system returns an HTTP 2xx status code and performs the operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance ID of the load balancing instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-bp1o94dp5i6ea****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The types of resources that are automatically created by ALB and need to be retained. Settings can currently be configured as eip, which indicates EIPs. Automatic creation and attach operations apply to these resource types.</p>
         */
        public Builder retainResourceType(java.util.List<String> retainResourceType) {
            this.putQueryParameter("RetainResourceType", retainResourceType);
            this.retainResourceType = retainResourceType;
            return this;
        }

        /**
         * <p>The list of zone and vSwitch mappings. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.putQueryParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public UpdateLoadBalancerAddressTypeConfigRequest build() {
            return new UpdateLoadBalancerAddressTypeConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLoadBalancerAddressTypeConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoadBalancerAddressTypeConfigRequest</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("EipType")
        private String eipType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.allocationId = builder.allocationId;
            this.eipType = builder.eipType;
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
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return eipType
         */
        public String getEipType() {
            return this.eipType;
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
            private String allocationId; 
            private String eipType; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.allocationId = model.allocationId;
                this.eipType = model.eipType;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The instance ID of the EIP. You can add up to 10 active zones.</p>
             * <blockquote>
             * <p>This parameter is required when you invoke this operation to transform the network type from private network to public network.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1aedxso6u80u0qf****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The type of the EIP. Valid values:</p>
             * <ul>
             * <li><p>Common (default): a standard EIP.</p>
             * </li>
             * <li><p>Anycast: an Anycast EIP.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>For the regions that support binding Anycast EIPs to ALB instances, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder eipType(String eipType) {
                this.eipType = eipType;
                return this;
            }

            /**
             * <p>The vSwitch that corresponds to the zone. Each zone can use only one vSwitch and one subnet. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp10ttov87felojcn****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID of the load balancing instance. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
             * <p>You can invoke <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> to query the active zone information that corresponds to a zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
