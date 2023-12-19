// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseVpnConnectionsRequest} extends {@link RequestModel}
 *
 * <p>DiagnoseVpnConnectionsRequest</p>
 */
public class DiagnoseVpnConnectionsRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TunnelIds")
    private java.util.List < String > tunnelIds;

    @Query
    @NameInMap("VpnConnectionIds")
    private java.util.List < String > vpnConnectionIds;

    @Query
    @NameInMap("VpnGatewayId")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
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
         * TunnelIds.
         */
        public Builder tunnelIds(java.util.List < String > tunnelIds) {
            this.putQueryParameter("TunnelIds", tunnelIds);
            this.tunnelIds = tunnelIds;
            return this;
        }

        /**
         * VpnConnectionIds.
         */
        public Builder vpnConnectionIds(java.util.List < String > vpnConnectionIds) {
            this.putQueryParameter("VpnConnectionIds", vpnConnectionIds);
            this.vpnConnectionIds = vpnConnectionIds;
            return this;
        }

        /**
         * VpnGatewayId.
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
