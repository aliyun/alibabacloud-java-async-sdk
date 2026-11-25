// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link SwitchSecurityProxyRequest} extends {@link RequestModel}
 *
 * <p>SwitchSecurityProxyRequest</p>
 */
public class SwitchSecurityProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatRouteEntryList")
    private java.util.List<NatRouteEntryList> natRouteEntryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteAction")
    private String routeAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Switch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String _switch;

    private SwitchSecurityProxyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.natRouteEntryList = builder.natRouteEntryList;
        this.proxyId = builder.proxyId;
        this.routeAction = builder.routeAction;
        this._switch = builder._switch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchSecurityProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return natRouteEntryList
     */
    public java.util.List<NatRouteEntryList> getNatRouteEntryList() {
        return this.natRouteEntryList;
    }

    /**
     * @return proxyId
     */
    public String getProxyId() {
        return this.proxyId;
    }

    /**
     * @return routeAction
     */
    public String getRouteAction() {
        return this.routeAction;
    }

    /**
     * @return _switch
     */
    public String get_switch() {
        return this._switch;
    }

    public static final class Builder extends Request.Builder<SwitchSecurityProxyRequest, Builder> {
        private String lang; 
        private java.util.List<NatRouteEntryList> natRouteEntryList; 
        private String proxyId; 
        private String routeAction; 
        private String _switch; 

        private Builder() {
            super();
        } 

        private Builder(SwitchSecurityProxyRequest request) {
            super(request);
            this.lang = request.lang;
            this.natRouteEntryList = request.natRouteEntryList;
            this.proxyId = request.proxyId;
            this.routeAction = request.routeAction;
            this._switch = request._switch;
        } 

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The route entry list for routing to be redirected or un-redirected. Maximum number of entries: 10,000. When RouteAction (divert or undivert) is specified, a non-empty list must be provided and used according to the incremental semantics. Each entry must include the RouteTableId, DestinationCidr, NextHopId, and NextHopType fields, and the combination of RouteTableId and DestinationCidr must be unique. In the Gateway Load Balancer (GWLB) architecture, when committed together with Switch=open, this parameter is used to specify the route entry for which traffic redirection is enabled in the current request. If no list is provided, the saved list is used. If no active list exists, a parameter error is returned.</p>
         */
        public Builder natRouteEntryList(java.util.List<NatRouteEntryList> natRouteEntryList) {
            this.putQueryParameter("NatRouteEntryList", natRouteEntryList);
            this.natRouteEntryList = natRouteEntryList;
            return this;
        }

        /**
         * <p>The ID of the NAT firewall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-natbf******</p>
         */
        public Builder proxyId(String proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
            return this;
        }

        /**
         * <p>Makes incremental traffic redirection changes to the route entry passed in this request. Other redirected route tables in the list are not affected. Valid values: divert (enables traffic redirection for the passed route entry) and undivert (shutdown of traffic redirection for the passed route entry). This parameter is active only when the firewall is in the traffic redirection state (normal). This parameter and Switch are mutually exclusive and cannot be both set to non-empty values at the same time. If this parameter is not specified or is set to an empty string, the incremental semantics are not used.</p>
         * 
         * <strong>example:</strong>
         * <p>divert</p>
         */
        public Builder routeAction(String routeAction) {
            this.putQueryParameter("RouteAction", routeAction);
            this.routeAction = routeAction;
            return this;
        }

        /**
         * <p>The security protection switch. Valid values:</p>
         * <ul>
         * <li>open: Enabled.</li>
         * <li>close: Disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder _switch(String _switch) {
            this.putQueryParameter("Switch", _switch);
            this._switch = _switch;
            return this;
        }

        @Override
        public SwitchSecurityProxyRequest build() {
            return new SwitchSecurityProxyRequest(this);
        } 

    } 

    /**
     * 
     * {@link SwitchSecurityProxyRequest} extends {@link TeaModel}
     *
     * <p>SwitchSecurityProxyRequest</p>
     */
    public static class NatRouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        @com.aliyun.core.annotation.Validation(required = true)
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String routeTableId;

        private NatRouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatRouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHopId; 
            private String nextHopType; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(NatRouteEntryList model) {
                this.destinationCidr = model.destinationCidr;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>The destination CIDR block of the route entry. When RouteAction is specified, only the default route 0.0.0.0/0 is supported. If other CIDR blocks are passed, a parameter error is returned.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway to which the route entry pointed before traffic redirection. You can obtain the ID by calling the DescribeSecurityProxyResources operation. When RouteAction is specified, this value must be consistent with the NAT gateway involved in the current operation. When traffic redirection is disabled, you must still pass this NAT gateway ID instead of the current next hop ID of the firewall.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1a2b3c4d5e6f7g8h9i0</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The next hop type of the route entry before traffic redirection. When RouteAction is specified, this value is fixed to NatGateway and must be passed in pairs with NextHopId. If other values are passed, a parameter error is returned.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>NatGateway</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The ID of the route table to which the route entry belongs. The route table must exist in the user&quot;s VPC. This parameter and DestinationCidr are used together to locate a route. If the route does not exist, the task fails and a message indicating that the route entry does not exist is returned.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp1a2b3c4d5e6f7g8h9i0</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public NatRouteEntryList build() {
                return new NatRouteEntryList(this);
            } 

        } 

    }
}
