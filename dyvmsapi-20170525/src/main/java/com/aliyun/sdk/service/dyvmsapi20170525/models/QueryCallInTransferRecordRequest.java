// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCallInTransferRecordRequest} extends {@link RequestModel}
 *
 * <p>QueryCallInTransferRecordRequest</p>
 */
public class QueryCallInTransferRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallInCaller")
    private String callInCaller;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryCallInTransferRecordRequest(Builder builder) {
        super(builder);
        this.callInCaller = builder.callInCaller;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.queryDate = builder.queryDate;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallInTransferRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callInCaller
     */
    public String getCallInCaller() {
        return this.callInCaller;
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
     * @return queryDate
     */
    public String getQueryDate() {
        return this.queryDate;
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

    public static final class Builder extends Request.Builder<QueryCallInTransferRecordRequest, Builder> {
        private String callInCaller; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String phoneNumber; 
        private String queryDate; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCallInTransferRecordRequest request) {
            super(request);
            this.callInCaller = request.callInCaller;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.queryDate = request.queryDate;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The calling number of the inbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>150****0000</p>
         */
        public Builder callInCaller(String callInCaller) {
            this.putQueryParameter("CallInCaller", callInCaller);
            this.callInCaller = callInCaller;
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
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The phone number to which a call is transferred.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>400****</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The time at which call transfer records are queried, in the YYYY-MM-DD hh:mm:ss format.</p>
         * <blockquote>
         * <p>The query result is all the call transfer records of the specified day.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28 00:00:00</p>
         */
        public Builder queryDate(String queryDate) {
            this.putQueryParameter("QueryDate", queryDate);
            this.queryDate = queryDate;
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
        public QueryCallInTransferRecordRequest build() {
            return new QueryCallInTransferRecordRequest(this);
        } 

    } 

}
