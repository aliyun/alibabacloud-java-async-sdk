// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPageSmartShortUrlLogRequest} extends {@link RequestModel}
 *
 * <p>QueryPageSmartShortUrlLogRequest</p>
 */
public class QueryPageSmartShortUrlLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateDateEnd")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long createDateEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateDateStart")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long createDateStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShortUrl")
    private String shortUrl;

    private QueryPageSmartShortUrlLogRequest(Builder builder) {
        super(builder);
        this.createDateEnd = builder.createDateEnd;
        this.createDateStart = builder.createDateStart;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.shortUrl = builder.shortUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPageSmartShortUrlLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createDateEnd
     */
    public Long getCreateDateEnd() {
        return this.createDateEnd;
    }

    /**
     * @return createDateStart
     */
    public Long getCreateDateStart() {
        return this.createDateStart;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
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
     * @return shortUrl
     */
    public String getShortUrl() {
        return this.shortUrl;
    }

    public static final class Builder extends Request.Builder<QueryPageSmartShortUrlLogRequest, Builder> {
        private Long createDateEnd; 
        private Long createDateStart; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String shortUrl; 

        private Builder() {
            super();
        } 

        private Builder(QueryPageSmartShortUrlLogRequest request) {
            super(request);
            this.createDateEnd = request.createDateEnd;
            this.createDateStart = request.createDateStart;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.shortUrl = request.shortUrl;
        } 

        /**
         * CreateDateEnd.
         */
        public Builder createDateEnd(Long createDateEnd) {
            this.putQueryParameter("CreateDateEnd", createDateEnd);
            this.createDateEnd = createDateEnd;
            return this;
        }

        /**
         * CreateDateStart.
         */
        public Builder createDateStart(Long createDateStart) {
            this.putQueryParameter("CreateDateStart", createDateStart);
            this.createDateStart = createDateStart;
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
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PhoneNumber.
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
         * ShortUrl.
         */
        public Builder shortUrl(String shortUrl) {
            this.putQueryParameter("ShortUrl", shortUrl);
            this.shortUrl = shortUrl;
            return this;
        }

        @Override
        public QueryPageSmartShortUrlLogRequest build() {
            return new QueryPageSmartShortUrlLogRequest(this);
        } 

    } 

}
