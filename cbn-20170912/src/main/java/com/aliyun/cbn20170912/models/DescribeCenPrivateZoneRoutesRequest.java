// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCenPrivateZoneRoutesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenPrivateZoneRoutesRequest</p>
 */
public class DescribeCenPrivateZoneRoutesRequest extends Request {
    @Query
    @NameInMap("AccessRegionId")
    private String accessRegionId;

    @Query
    @NameInMap("CenId")
    private String cenId;

    @Query
    @NameInMap("HostRegionId")
    private String hostRegionId;

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


    private DescribeCenPrivateZoneRoutesRequest(Builder builder) {
        super(builder);
        this.accessRegionId = builder.accessRegionId;
        this.cenId = builder.cenId;
        this.hostRegionId = builder.hostRegionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenPrivateZoneRoutesRequest create() {
        return builder().build();
    }

    /**
     * @return accessRegionId
     */
    public String getAccessRegionId() {
        return this.accessRegionId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return hostRegionId
     */
    public String getHostRegionId() {
        return this.hostRegionId;
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

    public static final class Builder extends Request.Builder<Builder> {
        private String accessRegionId; 
        private String cenId; 
        private String hostRegionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        /**
         * <p>AccessRegionId.</p>
         */
        public Builder accessRegionId(String accessRegionId) {
            this.putQueryParameter("AccessRegionId", accessRegionId);
            this.accessRegionId = accessRegionId;
            return this;
        }

        /**
         * <p>CenId.</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>HostRegionId.</p>
         */
        public Builder hostRegionId(String hostRegionId) {
            this.putQueryParameter("HostRegionId", hostRegionId);
            this.hostRegionId = hostRegionId;
            return this;
        }

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ResourceOwnerAccount.</p>
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        public DescribeCenPrivateZoneRoutesRequest build() {
            return new DescribeCenPrivateZoneRoutesRequest(this);
        } 

    } 

}
