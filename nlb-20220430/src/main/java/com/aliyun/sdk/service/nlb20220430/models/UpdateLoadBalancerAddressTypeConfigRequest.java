// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    private java.util.List<ZoneMappings> zoneMappings;

    private UpdateLoadBalancerAddressTypeConfigRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.regionId = builder.regionId;
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
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private Boolean dryRun; 
        private String loadBalancerId; 
        private String regionId; 
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
            this.regionId = request.regionId;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * <p>The new network type. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. The NLB instance is accessible over the Internet.</li>
         * <li><strong>Intranet</strong>: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. The NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder addressType(String addressType) {
            this.putBodyParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate this value. Ensure that the value is unique among all requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** <strong>RequestId</strong> of each request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run, without sending the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the NLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-83ckzc8d4xlp8o****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putBodyParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The mappings between zones and vSwitches. You can specify up to 10 zones.</p>
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.putBodyParameter("ZoneMappings", zoneMappings);
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
             * <p>The ID of the elastic IP address (EIP).</p>
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
             * <li><strong>Common</strong>: an EIP</li>
             * <li><strong>Anycast</strong>: an Anycast EIP</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required only if <strong>AddressType</strong> is set to <strong>Internet</strong>.</p>
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
             * <p>The ID of the vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp10ttov87felojcn****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID of the NLB instance.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query the most recent zone list.</p>
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
