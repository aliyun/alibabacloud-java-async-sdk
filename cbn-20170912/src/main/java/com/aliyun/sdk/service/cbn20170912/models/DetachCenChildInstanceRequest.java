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
 * {@link DetachCenChildInstanceRequest} extends {@link RequestModel}
 *
 * <p>DetachCenChildInstanceRequest</p>
 */
public class DetachCenChildInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenOwnerId")
    private Long cenOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceOwnerId")
    private Long childInstanceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceRegionId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DetachCenChildInstanceRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.cenOwnerId = builder.cenOwnerId;
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceOwnerId = builder.childInstanceOwnerId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceType = builder.childInstanceType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachCenChildInstanceRequest create() {
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
     * @return cenOwnerId
     */
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceOwnerId
     */
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    /**
     * @return childInstanceRegionId
     */
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
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

    public static final class Builder extends Request.Builder<DetachCenChildInstanceRequest, Builder> {
        private String cenId; 
        private Long cenOwnerId; 
        private String childInstanceId; 
        private Long childInstanceOwnerId; 
        private String childInstanceRegionId; 
        private String childInstanceType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DetachCenChildInstanceRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.cenOwnerId = request.cenOwnerId;
            this.childInstanceId = request.childInstanceId;
            this.childInstanceOwnerId = request.childInstanceOwnerId;
            this.childInstanceRegionId = request.childInstanceRegionId;
            this.childInstanceType = request.childInstanceType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the CEN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-7qthudw0ll6jmx****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1688000000000000</p>
         */
        public Builder cenOwnerId(Long cenOwnerId) {
            this.putQueryParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * <p>The ID of the network instance that you want to detach from the CEN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp18sth14qii3pnvx****</p>
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putQueryParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1699000000000000</p>
         */
        public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
            this.putQueryParameter("ChildInstanceOwnerId", childInstanceOwnerId);
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the region where the network instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.putQueryParameter("ChildInstanceRegionId", childInstanceRegionId);
            this.childInstanceRegionId = childInstanceRegionId;
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
         * <p>VPC</p>
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
        public DetachCenChildInstanceRequest build() {
            return new DetachCenChildInstanceRequest(this);
        } 

    } 

}
