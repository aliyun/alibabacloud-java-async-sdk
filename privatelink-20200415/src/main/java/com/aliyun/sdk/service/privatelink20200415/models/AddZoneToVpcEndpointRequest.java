// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link AddZoneToVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>AddZoneToVpcEndpointRequest</p>
 */
public class AddZoneToVpcEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Address")
    private String ipv6Address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    private AddZoneToVpcEndpointRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointId = builder.endpointId;
        this.ipv6Address = builder.ipv6Address;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddZoneToVpcEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return ipv6Address
     */
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder extends Request.Builder<AddZoneToVpcEndpointRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String endpointId; 
        private String ipv6Address; 
        private String regionId; 
        private String vSwitchId; 
        private String zoneId; 
        private String ip; 

        private Builder() {
            super();
        } 

        private Builder(AddZoneToVpcEndpointRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.endpointId = request.endpointId;
            this.ipv6Address = request.ipv6Address;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.ip = request.ip;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the endpoint to which you want to add the zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * Ipv6Address.
         */
        public Builder ipv6Address(String ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * <p>The region ID of the endpoint.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the zone that you want to add. The system automatically creates an endpoint ENI in the vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hjkshjvdkdvd****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the zone that you want to add.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The IP address of the endpoint elastic network interface (ENI) in the zone that you want to add.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.32</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        @Override
        public AddZoneToVpcEndpointRequest build() {
            return new AddZoneToVpcEndpointRequest(this);
        } 

    } 

}
