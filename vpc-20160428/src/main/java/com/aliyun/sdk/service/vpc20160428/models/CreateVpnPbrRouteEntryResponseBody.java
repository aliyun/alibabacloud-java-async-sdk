// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnPbrRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpnPbrRouteEntryResponseBody</p>
 */
public class CreateVpnPbrRouteEntryResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("NextHop")
    private String nextHop;

    @NameInMap("OverlayMode")
    private String overlayMode;

    @NameInMap("Priority")
    private Integer priority;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteDest")
    private String routeDest;

    @NameInMap("RouteSource")
    private String routeSource;

    @NameInMap("State")
    private String state;

    @NameInMap("VpnInstanceId")
    private String vpnInstanceId;

    @NameInMap("Weight")
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
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * NextHop.
         */
        public Builder nextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }

        /**
         * OverlayMode.
         */
        public Builder overlayMode(String overlayMode) {
            this.overlayMode = overlayMode;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteDest.
         */
        public Builder routeDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }

        /**
         * RouteSource.
         */
        public Builder routeSource(String routeSource) {
            this.routeSource = routeSource;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * VpnInstanceId.
         */
        public Builder vpnInstanceId(String vpnInstanceId) {
            this.vpnInstanceId = vpnInstanceId;
            return this;
        }

        /**
         * Weight.
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
