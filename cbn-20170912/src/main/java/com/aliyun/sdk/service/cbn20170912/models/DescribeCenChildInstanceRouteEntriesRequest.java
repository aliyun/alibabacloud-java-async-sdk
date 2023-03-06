// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenChildInstanceRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenChildInstanceRouteEntriesRequest</p>
 */
public class DescribeCenChildInstanceRouteEntriesRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("ChildInstanceId")
    @Validation(required = true)
    private String childInstanceId;

    @Query
    @NameInMap("ChildInstanceRegionId")
    private String childInstanceRegionId;

    @Query
    @NameInMap("ChildInstanceRouteTableId")
    private String childInstanceRouteTableId;

    @Query
    @NameInMap("ChildInstanceType")
    @Validation(required = true)
    private String childInstanceType;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
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
         * ChildInstanceRouteTableId.
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
         * *   **VPC**
         * *   **VBR**
         * *   **CCN**
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
         * The number of entries to return on each page. Default value: **10**. Valid values: **1** to **50**.
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
         * The status of the routes that you want to query. Valid values:
         * <p>
         * 
         * *   **Active**: active routes
         * *   **Candidate**: standby routes
         * *   **Rejected**: rejected routes
         * *   **Prohibited**: prohibited routes
         * *   **All** (default value): all routes
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
