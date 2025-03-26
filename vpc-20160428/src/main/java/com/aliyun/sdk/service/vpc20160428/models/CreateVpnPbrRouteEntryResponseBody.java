// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateVpnPbrRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpnPbrRouteEntryResponseBody</p>
 */
public class CreateVpnPbrRouteEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("NextHop")
    private String nextHop;

    @com.aliyun.core.annotation.NameInMap("OverlayMode")
    private String overlayMode;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteDest")
    private String routeDest;

    @com.aliyun.core.annotation.NameInMap("RouteSource")
    private String routeSource;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("VpnInstanceId")
    private String vpnInstanceId;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private CreateVpnPbrRouteEntryResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.nextHop = builder.nextHop;
        this.overlayMode = builder.overlayMode;
        this.priority = builder.priority;
        this.requestId = builder.requestId;
        this.routeDest = builder.routeDest;
        this.routeSource = builder.routeSource;
        this.state = builder.state;
        this.vpnInstanceId = builder.vpnInstanceId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnPbrRouteEntryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return routeSource
     */
    public String getRouteSource() {
        return this.routeSource;
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
        private Integer priority; 
        private String requestId; 
        private String routeDest; 
        private String routeSource; 
        private String state; 
        private String vpnInstanceId; 
        private Integer weight; 

        private Builder() {
        } 

        private Builder(CreateVpnPbrRouteEntryResponseBody model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.nextHop = model.nextHop;
            this.overlayMode = model.overlayMode;
            this.priority = model.priority;
            this.requestId = model.requestId;
            this.routeDest = model.routeDest;
            this.routeSource = model.routeSource;
            this.state = model.state;
            this.vpnInstanceId = model.vpnInstanceId;
            this.weight = model.weight;
        } 

        /**
         * <p>The time when the policy-based route was created.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492747187000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The next hop of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp15oes1py4i66rmd****</p>
         */
        public Builder nextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }

        /**
         * <p>The tunneling protocol. The value is <strong>Ipsec</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Ipsec</p>
         */
        public Builder overlayMode(String overlayMode) {
            this.overlayMode = overlayMode;
            return this;
        }

        /**
         * <p>The priority of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
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
         * <p>The destination CIDR block of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder routeDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }

        /**
         * <p>The source CIDR block of the policy-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        public Builder routeSource(String routeSource) {
            this.routeSource = routeSource;
            return this;
        }

        /**
         * <p>The status of the policy-based route. Valid values:</p>
         * <ul>
         * <li><strong>published</strong>: advertised to the VPC route table.</li>
         * <li><strong>normal</strong>: not advertised to the VPC route table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The VPN gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1cmw7jh1nfe43m9****</p>
         */
        public Builder vpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }

        /**
         * <p>The weight of the policy-based route. Valid values:</p>
         * <ul>
         * <li><strong>100</strong>: The IPsec-VPN connection associated with the policy-based route serves as an active connection.</li>
         * <li><strong>0</strong>: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public CreateVpnPbrRouteEntryResponseBody build() {
            return new CreateVpnPbrRouteEntryResponseBody(this);
        } 

    } 

}
