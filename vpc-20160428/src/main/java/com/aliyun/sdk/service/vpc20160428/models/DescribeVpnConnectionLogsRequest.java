// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnConnectionLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpnConnectionLogsRequest</p>
 */
public class DescribeVpnConnectionLogsRequest extends Request {
    @Query
    @NameInMap("From")
    private Integer from;

    @Query
    @NameInMap("MinutePeriod")
    private Integer minutePeriod;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("To")
    private Integer to;

    @Query
    @NameInMap("TunnelId")
    private String tunnelId;

    @Query
    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    private String vpnConnectionId;

    private DescribeVpnConnectionLogsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.minutePeriod = builder.minutePeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.to = builder.to;
        this.tunnelId = builder.tunnelId;
        this.vpnConnectionId = builder.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnConnectionLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return minutePeriod
     */
    public Integer getMinutePeriod() {
        return this.minutePeriod;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    /**
     * @return tunnelId
     */
    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static final class Builder extends Request.Builder<DescribeVpnConnectionLogsRequest, Builder> {
        private Integer from; 
        private Integer minutePeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer to; 
        private String tunnelId; 
        private String vpnConnectionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpnConnectionLogsRequest request) {
            super(request);
            this.from = request.from;
            this.minutePeriod = request.minutePeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.to = request.to;
            this.tunnelId = request.tunnelId;
            this.vpnConnectionId = request.vpnConnectionId;
        } 

        /**
         * The beginning of the time range to query. The value must be a UNIX timestamp. For example, 1671003744 specifies 15:42:24 (UTC+8) on December 14, 2022.
         * <p>
         * 
         * >  If you specify **From**, you must also specify **To** or **MinutePeriod**.
         */
        public Builder from(Integer from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The interval at which log data is queried. Valid values: **1** to **10**. Unit: minutes.
         * <p>
         * 
         * >  If both **From** and **To** are not specified, you must specify **MinutePeriod**.
         */
        public Builder minutePeriod(Integer minutePeriod) {
            this.putQueryParameter("MinutePeriod", minutePeriod);
            this.minutePeriod = minutePeriod;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region to which the IPsec-VPN connection belongs.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * The end of the time range to query. The value must be a UNIX timestamp. For example, 1671004344 specifies 15:52:24 (UTC+8) on December 14, 2022.
         * <p>
         * 
         * >  If you specify **To**, you must also specify **From** or **MinutePeriod**.
         */
        public Builder to(Integer to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * The tunnel ID of the IPsec-VPN connection. You can specify this parameter only for IPsec-VPN connections in dual-tunnel mode.
         */
        public Builder tunnelId(String tunnelId) {
            this.putQueryParameter("TunnelId", tunnelId);
            this.tunnelId = tunnelId;
            return this;
        }

        /**
         * The ID of the IPsec-VPN connection.
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.putQueryParameter("VpnConnectionId", vpnConnectionId);
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        @Override
        public DescribeVpnConnectionLogsRequest build() {
            return new DescribeVpnConnectionLogsRequest(this);
        } 

    } 

}
