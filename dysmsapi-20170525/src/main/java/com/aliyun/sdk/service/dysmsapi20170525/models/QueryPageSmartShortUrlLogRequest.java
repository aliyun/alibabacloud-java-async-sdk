// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPageSmartShortUrlLogRequest} extends {@link RequestModel}
 *
 * <p>QueryPageSmartShortUrlLogRequest</p>
 */
public class QueryPageSmartShortUrlLogRequest extends Request {
    @Query
    @NameInMap("ClickState")
    private Long clickState;

    @Query
    @NameInMap("CreateDateEnd")
    private Long createDateEnd;

    @Query
    @NameInMap("CreateDateStart")
    private Long createDateStart;

    @Query
    @NameInMap("EndId")
    private Long endId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ShortName")
    private String shortName;

    @Query
    @NameInMap("ShortUrl")
    private String shortUrl;

    @Query
    @NameInMap("StartId")
    private Long startId;

    private QueryPageSmartShortUrlLogRequest(Builder builder) {
        super(builder);
        this.clickState = builder.clickState;
        this.createDateEnd = builder.createDateEnd;
        this.createDateStart = builder.createDateStart;
        this.endId = builder.endId;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.shortName = builder.shortName;
        this.shortUrl = builder.shortUrl;
        this.startId = builder.startId;
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
     * @return clickState
     */
    public Long getClickState() {
        return this.clickState;
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
     * @return endId
     */
    public Long getEndId() {
        return this.endId;
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
     * @return shortName
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * @return shortUrl
     */
    public String getShortUrl() {
        return this.shortUrl;
    }

    /**
     * @return startId
     */
    public Long getStartId() {
        return this.startId;
    }

    public static final class Builder extends Request.Builder<QueryPageSmartShortUrlLogRequest, Builder> {
        private Long clickState; 
        private Long createDateEnd; 
        private Long createDateStart; 
        private Long endId; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String shortName; 
        private String shortUrl; 
        private Long startId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPageSmartShortUrlLogRequest request) {
            super(request);
            this.clickState = request.clickState;
            this.createDateEnd = request.createDateEnd;
            this.createDateStart = request.createDateStart;
            this.endId = request.endId;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.shortName = request.shortName;
            this.shortUrl = request.shortUrl;
            this.startId = request.startId;
        } 

        /**
         * ClickState.
         */
        public Builder clickState(Long clickState) {
            this.putQueryParameter("ClickState", clickState);
            this.clickState = clickState;
            return this;
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
         * EndId.
         */
        public Builder endId(Long endId) {
            this.putQueryParameter("EndId", endId);
            this.endId = endId;
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
         * ShortName.
         */
        public Builder shortName(String shortName) {
            this.putQueryParameter("ShortName", shortName);
            this.shortName = shortName;
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

        /**
         * StartId.
         */
        public Builder startId(Long startId) {
            this.putQueryParameter("StartId", startId);
            this.startId = startId;
            return this;
        }

        @Override
        public QueryPageSmartShortUrlLogRequest build() {
            return new QueryPageSmartShortUrlLogRequest(this);
        } 

    } 

}
