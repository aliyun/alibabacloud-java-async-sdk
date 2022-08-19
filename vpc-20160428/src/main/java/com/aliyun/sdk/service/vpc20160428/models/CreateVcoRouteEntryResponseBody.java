// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVcoRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVcoRouteEntryResponseBody</p>
 */
public class CreateVcoRouteEntryResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("NextHop")
    private String nextHop;

    @NameInMap("OverlayMode")
    private String overlayMode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteDest")
    private String routeDest;

    @NameInMap("State")
    private String state;

    @NameInMap("VpnConnectionId")
    private String vpnConnectionId;

    @NameInMap("Weight")
    private Integer weight;

    private CreateVcoRouteEntryResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.nextHop = builder.nextHop;
        this.overlayMode = builder.overlayMode;
        this.requestId = builder.requestId;
        this.routeDest = builder.routeDest;
        this.state = builder.state;
        this.vpnConnectionId = builder.vpnConnectionId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVcoRouteEntryResponseBody create() {
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
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
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
        private String vpnConnectionId; 
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
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * VpnConnectionId.
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public CreateVcoRouteEntryResponseBody build() {
            return new CreateVcoRouteEntryResponseBody(this);
        } 

    } 

}
