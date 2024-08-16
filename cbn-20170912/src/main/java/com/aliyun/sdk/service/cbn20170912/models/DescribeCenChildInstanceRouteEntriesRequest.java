// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenChildInstanceRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenChildInstanceRouteEntriesRequest</p>
 */
public class DescribeCenChildInstanceRouteEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceRegionId")
    private String childInstanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceRouteTableId")
    private String childInstanceRouteTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeCenChildInstanceRouteEntriesRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceRouteTableId = builder.childInstanceRouteTableId;
        this.childInstanceType = builder.childInstanceType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenChildInstanceRouteEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceRegionId
     */
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    /**
     * @return childInstanceRouteTableId
     */
    public String getChildInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
    }

    /**
     * @return childInstanceType
     */
    public String getChildInstanceType() {
        return this.childInstanceType;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCenChildInstanceRouteEntriesRequest, Builder> {
        private String cenId; 
        private String childInstanceId; 
        private String childInstanceRegionId; 
        private String childInstanceRouteTableId; 
        private String childInstanceType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCenChildInstanceRouteEntriesRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.childInstanceId = request.childInstanceId;
            this.childInstanceRegionId = request.childInstanceRegionId;
            this.childInstanceRouteTableId = request.childInstanceRouteTableId;
            this.childInstanceType = request.childInstanceType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
        } 

        /**
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The ID of the network instance.
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putQueryParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * The ID of the region where the network instance is deployed.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.putQueryParameter("ChildInstanceRegionId", childInstanceRegionId);
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }

        /**
         * The ID of the route table of the network instance. If you do not specify a route table ID, the system queries the routes in the system route tables of the VPCs by default.
         */
        public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
            this.putQueryParameter("ChildInstanceRouteTableId", childInstanceRouteTableId);
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }

        /**
         * The type of the network instance. Valid values:
         * <p>
         * 
         * *   **VPC**: virtual private cloud (VPC)
         * *   **VBR**: virtual border router (VBR)
         * *   **CCN**: Cloud Connect Network (CCN) instance
         */
        public Builder childInstanceType(String childInstanceType) {
            this.putQueryParameter("ChildInstanceType", childInstanceType);
            this.childInstanceType = childInstanceType;
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
         * The number of entries per page. Valid values: **1** to **500**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The status of the route. Valid values:
         * <p>
         * 
         * *   **Active**: available
         * *   **Candidate**: standby
         * *   **Rejected**: rejected
         * *   **Prohibited**: prohibited
         * *   **All** (default): all routes
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCenChildInstanceRouteEntriesRequest build() {
            return new DescribeCenChildInstanceRouteEntriesRequest(this);
        } 

    } 

}
