// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIPv6TranslatorsRequest</p>
 */
public class DescribeIPv6TranslatorsRequest extends Request {
    @Query
    @NameInMap("AllocateIpv4Addr")
    private String allocateIpv4Addr;

    @Query
    @NameInMap("AllocateIpv6Addr")
    private String allocateIpv6Addr;

    @Query
    @NameInMap("BusinessStatus")
    private String businessStatus;

    @Query
    @NameInMap("Ipv6TranslatorId")
    private String ipv6TranslatorId;

    @Query
    @NameInMap("Name")
    private String name;

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
    @NameInMap("PayType")
    private String payType;

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
    @NameInMap("Spec")
    private String spec;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeIPv6TranslatorsRequest(Builder builder) {
        super(builder);
        this.allocateIpv4Addr = builder.allocateIpv4Addr;
        this.allocateIpv6Addr = builder.allocateIpv6Addr;
        this.businessStatus = builder.businessStatus;
        this.ipv6TranslatorId = builder.ipv6TranslatorId;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spec = builder.spec;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPv6TranslatorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocateIpv4Addr
     */
    public String getAllocateIpv4Addr() {
        return this.allocateIpv4Addr;
    }

    /**
     * @return allocateIpv6Addr
     */
    public String getAllocateIpv6Addr() {
        return this.allocateIpv6Addr;
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return ipv6TranslatorId
     */
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeIPv6TranslatorsRequest, Builder> {
        private String allocateIpv4Addr; 
        private String allocateIpv6Addr; 
        private String businessStatus; 
        private String ipv6TranslatorId; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String payType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spec; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIPv6TranslatorsRequest request) {
            super(request);
            this.allocateIpv4Addr = request.allocateIpv4Addr;
            this.allocateIpv6Addr = request.allocateIpv6Addr;
            this.businessStatus = request.businessStatus;
            this.ipv6TranslatorId = request.ipv6TranslatorId;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spec = request.spec;
            this.status = request.status;
        } 

        /**
         * The IPv4 address allocated to the IPv6 Translation Service instance.
         */
        public Builder allocateIpv4Addr(String allocateIpv4Addr) {
            this.putQueryParameter("AllocateIpv4Addr", allocateIpv4Addr);
            this.allocateIpv4Addr = allocateIpv4Addr;
            return this;
        }

        /**
         * The IPv6 address allocated to the IPv6 Translation Service instance.
         */
        public Builder allocateIpv6Addr(String allocateIpv6Addr) {
            this.putQueryParameter("AllocateIpv6Addr", allocateIpv6Addr);
            this.allocateIpv6Addr = allocateIpv6Addr;
            return this;
        }

        /**
         * The business status of the IPv6 Translation Service instance. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **FinancialLocked**
         */
        public Builder businessStatus(String businessStatus) {
            this.putQueryParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * The ID of the IPv6 Translation Service instance.
         */
        public Builder ipv6TranslatorId(String ipv6TranslatorId) {
            this.putQueryParameter("Ipv6TranslatorId", ipv6TranslatorId);
            this.ipv6TranslatorId = ipv6TranslatorId;
            return this;
        }

        /**
         * The name of the IPv6 Translation Service instance.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The number of entries to return on each page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The billing method of the IPv6 Translation Service instance. Valid values:
         * <p>
         * 
         * *   **Prepay**: subscription
         * *   **Postpay**: pay-as-you-go
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The region of the IPv6 Translation Service instance. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The specification of the IPv6 Translation Service instance. Set the value to **small**.
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * The status of the IPv6 Translation Service instance. Valid values:
         * <p>
         * 
         * *   **init**
         * *   **provisioning**
         * *   **active**
         * *   **updating**
         * *   **upgrading**
         * *   **deleting**
         * *   **deleted**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeIPv6TranslatorsRequest build() {
            return new DescribeIPv6TranslatorsRequest(this);
        } 

    } 

}
