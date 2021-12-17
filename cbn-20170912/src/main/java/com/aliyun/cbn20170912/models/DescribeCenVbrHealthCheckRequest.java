// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCenVbrHealthCheckRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenVbrHealthCheckRequest</p>
 */
public class DescribeCenVbrHealthCheckRequest extends Request {
    @Query
    @NameInMap("CenId")
    private String cenId;

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
    @NameInMap("VbrInstanceId")
    private String vbrInstanceId;

    @Query
    @NameInMap("VbrInstanceOwnerId")
    private Long vbrInstanceOwnerId;

    @Query
    @NameInMap("VbrInstanceRegionId")
    private String vbrInstanceRegionId;


    private DescribeCenVbrHealthCheckRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vbrInstanceId = builder.vbrInstanceId;
        this.vbrInstanceOwnerId = builder.vbrInstanceOwnerId;
        this.vbrInstanceRegionId = builder.vbrInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenVbrHealthCheckRequest create() {
        return builder().build();
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
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
     * @return vbrInstanceId
     */
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    /**
     * @return vbrInstanceOwnerId
     */
    public Long getVbrInstanceOwnerId() {
        return this.vbrInstanceOwnerId;
    }

    /**
     * @return vbrInstanceRegionId
     */
    public String getVbrInstanceRegionId() {
        return this.vbrInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String cenId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vbrInstanceId; 
        private Long vbrInstanceOwnerId; 
        private String vbrInstanceRegionId; 

        /**
         * <p>CenId.</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>OwnerAccount.</p>
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * <p>OwnerId.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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

        /**
         * <p>VbrInstanceId.</p>
         */
        public Builder vbrInstanceId(String vbrInstanceId) {
            this.putQueryParameter("VbrInstanceId", vbrInstanceId);
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }

        /**
         * <p>VbrInstanceOwnerId.</p>
         */
        public Builder vbrInstanceOwnerId(Long vbrInstanceOwnerId) {
            this.putQueryParameter("VbrInstanceOwnerId", vbrInstanceOwnerId);
            this.vbrInstanceOwnerId = vbrInstanceOwnerId;
            return this;
        }

        /**
         * <p>VbrInstanceRegionId.</p>
         */
        public Builder vbrInstanceRegionId(String vbrInstanceRegionId) {
            this.putQueryParameter("VbrInstanceRegionId", vbrInstanceRegionId);
            this.vbrInstanceRegionId = vbrInstanceRegionId;
            return this;
        }

        public DescribeCenVbrHealthCheckRequest build() {
            return new DescribeCenVbrHealthCheckRequest(this);
        } 

    } 

}
