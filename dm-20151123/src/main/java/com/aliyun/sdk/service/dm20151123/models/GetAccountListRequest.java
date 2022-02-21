// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountListRequest} extends {@link RequestModel}
 *
 * <p>GetAccountListRequest</p>
 */
public class GetAccountListRequest extends Request {
    @Query
    @NameInMap("Offset")
    private String offset;

    @Query
    @NameInMap("OffsetCreateTime")
    private String offsetCreateTime;

    @Query
    @NameInMap("OffsetCreateTimeDesc")
    private String offsetCreateTimeDesc;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Total")
    private String total;

    private GetAccountListRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.offsetCreateTime = builder.offsetCreateTime;
        this.offsetCreateTimeDesc = builder.offsetCreateTimeDesc;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * @return offsetCreateTime
     */
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    /**
     * @return offsetCreateTimeDesc
     */
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
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
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder extends Request.Builder<GetAccountListRequest, Builder> {
        private String offset; 
        private String offsetCreateTime; 
        private String offsetCreateTimeDesc; 
        private Long ownerId; 
        private String pageNumber; 
        private String pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String total; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountListRequest response) {
            super(response);
            this.offset = response.offset;
            this.offsetCreateTime = response.offsetCreateTime;
            this.offsetCreateTimeDesc = response.offsetCreateTimeDesc;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.total = response.total;
        } 

        /**
         * Offset.
         */
        public Builder offset(String offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OffsetCreateTime.
         */
        public Builder offsetCreateTime(String offsetCreateTime) {
            this.putQueryParameter("OffsetCreateTime", offsetCreateTime);
            this.offsetCreateTime = offsetCreateTime;
            return this;
        }

        /**
         * OffsetCreateTimeDesc.
         */
        public Builder offsetCreateTimeDesc(String offsetCreateTimeDesc) {
            this.putQueryParameter("OffsetCreateTimeDesc", offsetCreateTimeDesc);
            this.offsetCreateTimeDesc = offsetCreateTimeDesc;
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
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
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
         * Total.
         */
        public Builder total(String total) {
            this.putQueryParameter("Total", total);
            this.total = total;
            return this;
        }

        @Override
        public GetAccountListRequest build() {
            return new GetAccountListRequest(this);
        } 

    } 

}
