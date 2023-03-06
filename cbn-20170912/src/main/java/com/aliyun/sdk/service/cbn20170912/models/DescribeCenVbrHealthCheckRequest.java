// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
    @Validation(required = true)
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

    public static final class Builder extends Request.Builder<DescribeCenVbrHealthCheckRequest, Builder> {
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

        private Builder() {
            super();
        } 

        private Builder(DescribeCenVbrHealthCheckRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vbrInstanceId = request.vbrInstanceId;
            this.vbrInstanceOwnerId = request.vbrInstanceOwnerId;
            this.vbrInstanceRegionId = request.vbrInstanceRegionId;
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
         * The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.
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
         * The ID of the VBR.
         */
        public Builder vbrInstanceId(String vbrInstanceId) {
            this.putQueryParameter("VbrInstanceId", vbrInstanceId);
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that owns the VBR.
         * <p>
         * 
         * >  The parameter is required if the VBR and the CEN instance belong to different Alibaba Cloud accounts.
         */
        public Builder vbrInstanceOwnerId(Long vbrInstanceOwnerId) {
            this.putQueryParameter("VbrInstanceOwnerId", vbrInstanceOwnerId);
            this.vbrInstanceOwnerId = vbrInstanceOwnerId;
            return this;
        }

        /**
         * The ID of the region where the VBR is deployed.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
         */
        public Builder vbrInstanceRegionId(String vbrInstanceRegionId) {
            this.putQueryParameter("VbrInstanceRegionId", vbrInstanceRegionId);
            this.vbrInstanceRegionId = vbrInstanceRegionId;
            return this;
        }

        @Override
        public DescribeCenVbrHealthCheckRequest build() {
            return new DescribeCenVbrHealthCheckRequest(this);
        } 

    } 

}
