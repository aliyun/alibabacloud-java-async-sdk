// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeRouteConflictRequest} extends {@link RequestModel}
 *
 * <p>DescribeRouteConflictRequest</p>
 */
public class DescribeRouteConflictRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceRouteTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

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

    private DescribeRouteConflictRequest(Builder builder) {
        super(builder);
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceRouteTableId = builder.childInstanceRouteTableId;
        this.childInstanceType = builder.childInstanceType;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteConflictRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
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

    public static final class Builder extends Request.Builder<DescribeRouteConflictRequest, Builder> {
        private String childInstanceId; 
        private String childInstanceRegionId; 
        private String childInstanceRouteTableId; 
        private String childInstanceType; 
        private String destinationCidrBlock; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRouteConflictRequest request) {
            super(request);
            this.childInstanceId = request.childInstanceId;
            this.childInstanceRegionId = request.childInstanceRegionId;
            this.childInstanceRouteTableId = request.childInstanceRouteTableId;
            this.childInstanceType = request.childInstanceType;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the network instance that you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-0q3b7oviikmm9h****</p>
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putQueryParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region where the network instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-cn-shanghai</p>
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.putQueryParameter("ChildInstanceRegionId", childInstanceRegionId);
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }

        /**
         * <p>The ID of the route table that is configured on the network instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp174d1gje79u1g4t****</p>
         */
        public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
            this.putQueryParameter("ChildInstanceRouteTableId", childInstanceRouteTableId);
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
         * <li><strong>VBR</strong>: virtual border router (VBR)</li>
         * <li><strong>CCN</strong>: Cloud Connect Network (CCN) instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CCN</p>
         */
        public Builder childInstanceType(String childInstanceType) {
            this.putQueryParameter("ChildInstanceType", childInstanceType);
            this.childInstanceType = childInstanceType;
            return this;
        }

        /**
         * <p>The destination CIDR block of the conflicting route.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/16</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
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

        @Override
        public DescribeRouteConflictRequest build() {
            return new DescribeRouteConflictRequest(this);
        } 

    } 

}
