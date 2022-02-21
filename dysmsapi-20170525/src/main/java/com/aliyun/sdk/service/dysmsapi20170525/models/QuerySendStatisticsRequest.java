// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendStatisticsRequest} extends {@link RequestModel}
 *
 * <p>QuerySendStatisticsRequest</p>
 */
public class QuerySendStatisticsRequest extends Request {
    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("IsGlobe")
    @Validation(required = true, maxLength = 2, minLength = 1, maximum = 2, minimum = 1)
    private Integer isGlobe;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true, minLength = 1, minimum = 1)
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maxLength = 50, minLength = 1, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private QuerySendStatisticsRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.isGlobe = builder.isGlobe;
        this.ownerId = builder.ownerId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySendStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return isGlobe
     */
    public Integer getIsGlobe() {
        return this.isGlobe;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QuerySendStatisticsRequest, Builder> {
        private String endDate; 
        private Integer isGlobe; 
        private Long ownerId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QuerySendStatisticsRequest response) {
            super(response);
            this.endDate = response.endDate;
            this.isGlobe = response.isGlobe;
            this.ownerId = response.ownerId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.startDate = response.startDate;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * IsGlobe.
         */
        public Builder isGlobe(Integer isGlobe) {
            this.putQueryParameter("IsGlobe", isGlobe);
            this.isGlobe = isGlobe;
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
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QuerySendStatisticsRequest build() {
            return new QuerySendStatisticsRequest(this);
        } 

    } 

}
