// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendDetailsRequest} extends {@link RequestModel}
 *
 * <p>QuerySendDetailsRequest</p>
 */
public class QuerySendDetailsRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Long currentPage;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SendDate")
    @Validation(required = true)
    private String sendDate;

    private QuerySendDetailsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.currentPage = builder.currentPage;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sendDate = builder.sendDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySendDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
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
     * @return sendDate
     */
    public String getSendDate() {
        return this.sendDate;
    }

    public static final class Builder extends Request.Builder<QuerySendDetailsRequest, Builder> {
        private String bizId; 
        private Long currentPage; 
        private Long ownerId; 
        private Long pageSize; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sendDate; 

        private Builder() {
            super();
        } 

        private Builder(QuerySendDetailsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.currentPage = request.currentPage;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sendDate = request.sendDate;
        } 

        /**
         * The unique ID of the business, which is provided by Alibaba Cloud.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * The number of the page on which you are reading the text message. Pages start from page 1. The value of this parameter cannot exceed the maximum page number.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The phone number.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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
         * The date when the text message was sent. You can query text messages that were sent within the last 30 days.
         * <p>
         * 
         * Specify the date in the yyyyMMdd format. Example: 20181225.
         */
        public Builder sendDate(String sendDate) {
            this.putQueryParameter("SendDate", sendDate);
            this.sendDate = sendDate;
            return this;
        }

        @Override
        public QuerySendDetailsRequest build() {
            return new QuerySendDetailsRequest(this);
        } 

    } 

}
