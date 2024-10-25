// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLicenseOrdersRequest} extends {@link RequestModel}
 *
 * <p>DescribeLicenseOrdersRequest</p>
 */
public class DescribeLicenseOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunOrderId")
    private String aliyunOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PurchaseChannel")
    private String purchaseChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualOrder")
    private Boolean virtualOrder;

    private DescribeLicenseOrdersRequest(Builder builder) {
        super(builder);
        this.aliyunOrderId = builder.aliyunOrderId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.packageType = builder.packageType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.purchaseChannel = builder.purchaseChannel;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.virtualOrder = builder.virtualOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLicenseOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunOrderId
     */
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
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
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
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
     * @return purchaseChannel
     */
    public String getPurchaseChannel() {
        return this.purchaseChannel;
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
     * @return virtualOrder
     */
    public Boolean getVirtualOrder() {
        return this.virtualOrder;
    }

    public static final class Builder extends Request.Builder<DescribeLicenseOrdersRequest, Builder> {
        private String aliyunOrderId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String packageType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String purchaseChannel; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean virtualOrder; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLicenseOrdersRequest request) {
            super(request);
            this.aliyunOrderId = request.aliyunOrderId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.packageType = request.packageType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.purchaseChannel = request.purchaseChannel;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.virtualOrder = request.virtualOrder;
        } 

        /**
         * AliyunOrderId.
         */
        public Builder aliyunOrderId(String aliyunOrderId) {
            this.putQueryParameter("AliyunOrderId", aliyunOrderId);
            this.aliyunOrderId = aliyunOrderId;
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
         * PackageType.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
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
         * PurchaseChannel.
         */
        public Builder purchaseChannel(String purchaseChannel) {
            this.putQueryParameter("PurchaseChannel", purchaseChannel);
            this.purchaseChannel = purchaseChannel;
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
         * VirtualOrder.
         */
        public Builder virtualOrder(Boolean virtualOrder) {
            this.putQueryParameter("VirtualOrder", virtualOrder);
            this.virtualOrder = virtualOrder;
            return this;
        }

        @Override
        public DescribeLicenseOrdersRequest build() {
            return new DescribeLicenseOrdersRequest(this);
        } 

    } 

}
