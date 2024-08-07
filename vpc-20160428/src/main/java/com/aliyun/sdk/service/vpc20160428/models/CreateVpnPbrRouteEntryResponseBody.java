// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The time when the policy-based route was created.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The description of the policy-based route.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The next hop of the policy-based route.
         */
        public Builder nextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }

        /**
         * The tunneling protocol. The value is **Ipsec**.
         */
        public Builder overlayMode(String overlayMode) {
            this.overlayMode = overlayMode;
            return this;
        }

        /**
         * The priority of the policy-based route.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The destination CIDR block of the policy-based route.
         */
        public Builder routeDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }

        /**
         * The source CIDR block of the policy-based route.
         */
        public Builder routeSource(String routeSource) {
            this.routeSource = routeSource;
            return this;
        }

        /**
         * The status of the policy-based route. Valid values:
         * <p>
         * 
         * *   **published**: advertised to the VPC route table.
         * *   **normal**: not advertised to the VPC route table.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The VPN gateway ID.
         */
        public Builder vpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }

        /**
         * The weight of the policy-based route. Valid values:
         * <p>
         * 
         * *   **100**: The IPsec-VPN connection associated with the policy-based route serves as an active connection.
         * *   **0**: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.
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
