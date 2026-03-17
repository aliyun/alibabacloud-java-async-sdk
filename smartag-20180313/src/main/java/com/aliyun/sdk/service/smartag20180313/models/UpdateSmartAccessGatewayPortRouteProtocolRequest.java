// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link UpdateSmartAccessGatewayPortRouteProtocolRequest} extends {@link RequestModel}
 *
 * <p>UpdateSmartAccessGatewayPortRouteProtocolRequest</p>
 */
public class UpdateSmartAccessGatewayPortRouteProtocolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccount")
    private Boolean crossAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteAs")
    private String remoteAs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteIp")
    private String remoteIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceUid")
    private String resourceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagInsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vlan")
    private String vlan;

    private UpdateSmartAccessGatewayPortRouteProtocolRequest(Builder builder) {
        super(builder);
        this.crossAccount = builder.crossAccount;
        this.portName = builder.portName;
        this.regionId = builder.regionId;
        this.remoteAs = builder.remoteAs;
        this.remoteIp = builder.remoteIp;
        this.resourceUid = builder.resourceUid;
        this.routeProtocol = builder.routeProtocol;
        this.sagInsId = builder.sagInsId;
        this.sagSn = builder.sagSn;
        this.vlan = builder.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSmartAccessGatewayPortRouteProtocolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    /**
     * @return portName
     */
    public String getPortName() {
        return this.portName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remoteAs
     */
    public String getRemoteAs() {
        return this.remoteAs;
    }

    /**
     * @return remoteIp
     */
    public String getRemoteIp() {
        return this.remoteIp;
    }

    /**
     * @return resourceUid
     */
    public String getResourceUid() {
        return this.resourceUid;
    }

    /**
     * @return routeProtocol
     */
    public String getRouteProtocol() {
        return this.routeProtocol;
    }

    /**
     * @return sagInsId
     */
    public String getSagInsId() {
        return this.sagInsId;
    }

    /**
     * @return sagSn
     */
    public String getSagSn() {
        return this.sagSn;
    }

    /**
     * @return vlan
     */
    public String getVlan() {
        return this.vlan;
    }

    public static final class Builder extends Request.Builder<UpdateSmartAccessGatewayPortRouteProtocolRequest, Builder> {
        private Boolean crossAccount; 
        private String portName; 
        private String regionId; 
        private String remoteAs; 
        private String remoteIp; 
        private String resourceUid; 
        private String routeProtocol; 
        private String sagInsId; 
        private String sagSn; 
        private String vlan; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSmartAccessGatewayPortRouteProtocolRequest request) {
            super(request);
            this.crossAccount = request.crossAccount;
            this.portName = request.portName;
            this.regionId = request.regionId;
            this.remoteAs = request.remoteAs;
            this.remoteIp = request.remoteIp;
            this.resourceUid = request.resourceUid;
            this.routeProtocol = request.routeProtocol;
            this.sagInsId = request.sagInsId;
            this.sagSn = request.sagSn;
            this.vlan = request.vlan;
        } 

        /**
         * <p>Specifies whether to query only the SAG instances that belong to another Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder crossAccount(Boolean crossAccount) {
            this.putQueryParameter("CrossAccount", crossAccount);
            this.crossAccount = crossAccount;
            return this;
        }

        /**
         * <p>The port name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder portName(String portName) {
            this.putQueryParameter("PortName", portName);
            this.portName = portName;
            return this;
        }

        /**
         * <p>The region ID of the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The autonomous system number (ASN) of the SAG device.</p>
         * <blockquote>
         * <p>When you enable BGP, you must set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        public Builder remoteAs(String remoteAs) {
            this.putQueryParameter("RemoteAs", remoteAs);
            this.remoteAs = remoteAs;
            return this;
        }

        /**
         * <p>The IP address of the peer device.</p>
         * <blockquote>
         * <p>When you enable BGP, you must set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder remoteIp(String remoteIp) {
            this.putQueryParameter("RemoteIp", remoteIp);
            this.remoteIp = remoteIp;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>109790620697****</p>
         */
        public Builder resourceUid(String resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        /**
         * <p>The routing protocol. Valid values:</p>
         * <ul>
         * <li><strong>STATIC</strong></li>
         * <li><strong>OSPF</strong></li>
         * <li><strong>BGP</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
         */
        public Builder routeProtocol(String routeProtocol) {
            this.putQueryParameter("RouteProtocol", routeProtocol);
            this.routeProtocol = routeProtocol;
            return this;
        }

        /**
         * <p>The ID of the Smart Access Gateway (SAG) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-3manef62evrfr6****</p>
         */
        public Builder sagInsId(String sagInsId) {
            this.putQueryParameter("SagInsId", sagInsId);
            this.sagInsId = sagInsId;
            return this;
        }

        /**
         * <p>The serial number of the SAG device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sagf4dk****</p>
         */
        public Builder sagSn(String sagSn) {
            this.putQueryParameter("SagSn", sagSn);
            this.sagSn = sagSn;
            return this;
        }

        /**
         * <p>The VLAN ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vlan(String vlan) {
            this.putQueryParameter("Vlan", vlan);
            this.vlan = vlan;
            return this;
        }

        @Override
        public UpdateSmartAccessGatewayPortRouteProtocolRequest build() {
            return new UpdateSmartAccessGatewayPortRouteProtocolRequest(this);
        } 

    } 

}
