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
 * {@link DescribeCenGeographicSpanRemainingBandwidthRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenGeographicSpanRemainingBandwidthRequest</p>
 */
public class DescribeCenGeographicSpanRemainingBandwidthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GeographicRegionAId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String geographicRegionAId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GeographicRegionBId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String geographicRegionBId;

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

    private DescribeCenGeographicSpanRemainingBandwidthRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.geographicRegionAId = builder.geographicRegionAId;
        this.geographicRegionBId = builder.geographicRegionBId;
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

    public static DescribeCenGeographicSpanRemainingBandwidthRequest create() {
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
     * @return geographicRegionAId
     */
    public String getGeographicRegionAId() {
        return this.geographicRegionAId;
    }

    /**
     * @return geographicRegionBId
     */
    public String getGeographicRegionBId() {
        return this.geographicRegionBId;
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

    public static final class Builder extends Request.Builder<DescribeCenGeographicSpanRemainingBandwidthRequest, Builder> {
        private String cenId; 
        private String geographicRegionAId; 
        private String geographicRegionBId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCenGeographicSpanRemainingBandwidthRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.geographicRegionAId = request.geographicRegionAId;
            this.geographicRegionBId = request.geographicRegionBId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the bandwidth plan is associated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-nh98vzx8gfhlwn****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The ID of one of the connected areas of the bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>China</strong>: Chinese mainland</li>
         * <li><strong>North-America</strong>: North America</li>
         * <li><strong>Asia-Pacific</strong>: Asia Pacific</li>
         * <li><strong>Europe</strong>: Europe</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        public Builder geographicRegionAId(String geographicRegionAId) {
            this.putQueryParameter("GeographicRegionAId", geographicRegionAId);
            this.geographicRegionAId = geographicRegionAId;
            return this;
        }

        /**
         * <p>The ID of the other area connected by the bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>China</strong>: Chinese mainland</li>
         * <li><strong>North-America</strong>: North America</li>
         * <li><strong>Asia-Pacific</strong>: Asia Pacific</li>
         * <li><strong>Europe</strong>: Europe</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>North-America</p>
         */
        public Builder geographicRegionBId(String geographicRegionBId) {
            this.putQueryParameter("GeographicRegionBId", geographicRegionBId);
            this.geographicRegionBId = geographicRegionBId;
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
        public DescribeCenGeographicSpanRemainingBandwidthRequest build() {
            return new DescribeCenGeographicSpanRemainingBandwidthRequest(this);
        } 

    } 

}
