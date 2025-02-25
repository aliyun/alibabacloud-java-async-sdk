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
 * {@link CreateVcoRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVcoRouteEntryResponseBody</p>
 */
public class CreateVcoRouteEntryResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
    private String vpnConnectionId;

    @com.aliyun.core.annotation.NameInMap("Weight")
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
         * <p>The timestamp when the destination-based route was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1658387202664</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the destination-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The next hop of the destination-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0w2jpkhi2eeop6q6****</p>
         */
        public Builder nextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }

        /**
         * <p>The tunneling protocol.</p>
         * <p>The value is set to <strong>Ipsec</strong>, which indicates the IPsec tunneling protocol.</p>
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
         * <p>CFC4D13B-E680-3985-95B1-87AA155481DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The destination CIDR block of the destination-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        public Builder routeDest(String routeDest) {
            this.routeDest = routeDest;
            return this;
        }

        /**
         * <p>The status of the destination-based route.</p>
         * <p>Only <strong>published</strong> is returned, which indicates that the current route is published to the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>published</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0w2jpkhi2eeop6q6****</p>
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        /**
         * <p>The weight of the destination-based route. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: a low priority.</li>
         * <li><strong>100</strong>: a high priority.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
