// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnatTableEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnatTableEntriesRequest</p>
 */
public class DescribeSnatTableEntriesRequest extends Request {
    @Query
    @NameInMap("NatGatewayId")
    private String natGatewayId;

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
    @Validation(maximum = 50, minimum = 1)
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
    @NameInMap("SnatEntryId")
    private String snatEntryId;

    @Query
    @NameInMap("SnatEntryName")
    private String snatEntryName;

    @Query
    @NameInMap("SnatIp")
    private String snatIp;

    @Query
    @NameInMap("SnatTableId")
    private String snatTableId;

    @Query
    @NameInMap("SourceCIDR")
    private String sourceCIDR;

    @Query
    @NameInMap("SourceVSwitchId")
    private String sourceVSwitchId;

    private DescribeSnatTableEntriesRequest(Builder builder) {
        super(builder);
        this.natGatewayId = builder.natGatewayId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snatEntryId = builder.snatEntryId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.snatTableId = builder.snatTableId;
        this.sourceCIDR = builder.sourceCIDR;
        this.sourceVSwitchId = builder.sourceVSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatTableEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return snatTableId
     */
    public String getSnatTableId() {
        return this.snatTableId;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    /**
     * @return sourceVSwitchId
     */
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribeSnatTableEntriesRequest, Builder> {
        private String natGatewayId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snatEntryId; 
        private String snatEntryName; 
        private String snatIp; 
        private String snatTableId; 
        private String sourceCIDR; 
        private String sourceVSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnatTableEntriesRequest request) {
            super(request);
            this.natGatewayId = request.natGatewayId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snatEntryId = request.snatEntryId;
            this.snatEntryName = request.snatEntryName;
            this.snatIp = request.snatIp;
            this.snatTableId = request.snatTableId;
            this.sourceCIDR = request.sourceCIDR;
            this.sourceVSwitchId = request.sourceVSwitchId;
        } 

        /**
         * The ID of the NAT gateway.
         * <p>
         * 
         * >  You must specify at least one of **SnatTableId** and **NatGatewayId**.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
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
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region where you want to create the NAT gateway.
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
         * The ID of the SNAT entry.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * The name of the SNAT entry.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * *   When you query SNAT entries of Internet NAT gateways, this parameter specifies the EIP in an SNAT entry.
         * <p>
         * *   When you query SNAT entries of VPC NAT gateways, this parameter specifies the NAT IP address in an SNAT entry.
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * The ID of the SNAT table.
         * <p>
         * 
         * >  You must specify at least one of **SnatTableId** and **NatGatewayId**.
         */
        public Builder snatTableId(String snatTableId) {
            this.putQueryParameter("SnatTableId", snatTableId);
            this.snatTableId = snatTableId;
            return this;
        }

        /**
         * The source CIDR block specified in the SNAT entry.
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.putQueryParameter("SourceCIDR", sourceCIDR);
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * The ID of the vSwitch.
         * <p>
         * 
         * *   When you query SNAT entries of Internet NAT gateways, this parameter specifies that Elastic Compute Service (ECS) instances in the vSwitch can use SNAT entries to access the Internet.
         * *   When you query SNAT entries of virtual private cloud (VPC) NAT gateways, this parameter specifies that ECS instances in the vSwitch can use SNAT entries to access external networks.
         */
        public Builder sourceVSwitchId(String sourceVSwitchId) {
            this.putQueryParameter("SourceVSwitchId", sourceVSwitchId);
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }

        @Override
        public DescribeSnatTableEntriesRequest build() {
            return new DescribeSnatTableEntriesRequest(this);
        } 

    } 

}
