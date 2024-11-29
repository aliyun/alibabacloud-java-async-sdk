// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVpnRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpnRouteEntryResponseBody</p>
 */
public class CreateVpnRouteEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("NextHop")
    private String nextHop;

    @com.aliyun.core.annotation.NameInMap("OverlayMode")
    private String overlayMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteDest")
    private String routeDest;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("VpnInstanceId")
    private String vpnInstanceId;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private CreateVpnRouteEntryResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.nextHop = builder.nextHop;
        this.overlayMode = builder.overlayMode;
        this.requestId = builder.requestId;
        this.routeDest = builder.routeDest;
        this.state = builder.state;
        this.vpnInstanceId = builder.vpnInstanceId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnRouteEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nextHop
     */
    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * @return overlayMode
     */
    public String getOverlayMode() {
        return this.overlayMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeDest
     */
    public String getRouteDest() {
        return this.routeDest;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return vpnInstanceId
     */
    public String getVpnInstanceId() {
        return this.vpnInstanceId;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String nextHop; 
        private String overlayMode; 
        private String requestId; 
        private String routeDest; 
        private String state; 
        private String vpnInstanceId; 
        private Integer weight; 

        /**
         * <p>The timestamp when the destination-based route was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492747187000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the destination-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>mytest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The next hop of the destination-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp15oes1py4i66rmd****</p>
         */
        public Builder nextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }

        /**
         * <p>The tunneling protocol. The value is set to <strong>Ipsec</strong>, which indicates the IPsec tunneling protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>Ipsec</p>
         */
        public Builder overlayMode(String overlayMode) {
            this.overlayMode = overlayMode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The destination CIDR block of the destination-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder routeDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }

        /**
         * <p>The status of the destination-based route.</p>
         * <ul>
         * <li><strong>published</strong>: advertised to the VPC route table.</li>
         * <li><strong>normal</strong>: not advertised to the VPC route table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>published</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1a3kqjiiq9legfx****</p>
         */
        public Builder vpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }

        /**
         * <p>The weight of the destination-based route. Valid values:</p>
         * <ul>
         * <li><strong>100</strong>: a high priority</li>
         * <li><strong>0</strong>: a low priority</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public CreateVpnRouteEntryResponseBody build() {
            return new CreateVpnRouteEntryResponseBody(this);
        } 

    } 

}
