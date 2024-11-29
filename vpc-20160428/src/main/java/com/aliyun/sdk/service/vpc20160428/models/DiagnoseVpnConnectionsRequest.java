// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DiagnoseVpnConnectionsRequest} extends {@link RequestModel}
 *
 * <p>DiagnoseVpnConnectionsRequest</p>
 */
public class DiagnoseVpnConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TunnelIds")
    private java.util.List < String > tunnelIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnConnectionIds")
    private java.util.List < String > vpnConnectionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private DiagnoseVpnConnectionsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tunnelIds = builder.tunnelIds;
        this.vpnConnectionIds = builder.vpnConnectionIds;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnoseVpnConnectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tunnelIds
     */
    public java.util.List < String > getTunnelIds() {
        return this.tunnelIds;
    }

    /**
     * @return vpnConnectionIds
     */
    public java.util.List < String > getVpnConnectionIds() {
        return this.vpnConnectionIds;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<DiagnoseVpnConnectionsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private java.util.List < String > tunnelIds; 
        private java.util.List < String > vpnConnectionIds; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DiagnoseVpnConnectionsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tunnelIds = request.tunnelIds;
            this.vpnConnectionIds = request.vpnConnectionIds;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the IPsec-VPN connection.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The list of tunnel IDs.</p>
         */
        public Builder tunnelIds(java.util.List < String > tunnelIds) {
            this.putQueryParameter("TunnelIds", tunnelIds);
            this.tunnelIds = tunnelIds;
            return this;
        }

        /**
         * <p>The IDs of IPsec-VPN connections.</p>
         */
        public Builder vpnConnectionIds(java.util.List < String > vpnConnectionIds) {
            this.putQueryParameter("VpnConnectionIds", vpnConnectionIds);
            this.vpnConnectionIds = vpnConnectionIds;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp10hz6b0mbp39flt****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public DiagnoseVpnConnectionsRequest build() {
            return new DiagnoseVpnConnectionsRequest(this);
        } 

    } 

}
