// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallRecordingListRequest} extends {@link RequestModel}
 *
 * <p>QueryCallRecordingListRequest</p>
 */
public class QueryCallRecordingListRequest extends Request {
    @Query
    @NameInMap("BillId")
    @Validation(required = true)
    private String billId;

    @Query
    @NameInMap("CallDate")
    @Validation(required = true)
    private String callDate;

    @Query
    @NameInMap("CallId")
    private String callId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PhoneNoA")
    private String phoneNoA;

    @Query
    @NameInMap("PhoneNoB")
    private String phoneNoB;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResType")
    @Validation(required = true)
    private Integer resType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecretNo")
    private String secretNo;

    private QueryCallRecordingListRequest(Builder builder) {
        super(builder);
        this.billId = builder.billId;
        this.callDate = builder.callDate;
        this.callId = builder.callId;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.phoneNoA = builder.phoneNoA;
        this.phoneNoB = builder.phoneNoB;
        this.prodCode = builder.prodCode;
        this.resType = builder.resType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretNo = builder.secretNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallRecordingListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return callDate
     */
    public String getCallDate() {
        return this.callDate;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
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
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return phoneNoA
     */
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    /**
     * @return phoneNoB
     */
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resType
     */
    public Integer getResType() {
        return this.resType;
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
     * @return secretNo
     */
    public String getSecretNo() {
        return this.secretNo;
    }

    public static final class Builder extends Request.Builder<QueryCallRecordingListRequest, Builder> {
        private String billId; 
        private String callDate; 
        private String callId; 
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String phoneNoA; 
        private String phoneNoB; 
        private String prodCode; 
        private Integer resType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secretNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryCallRecordingListRequest request) {
            super(request);
            this.billId = request.billId;
            this.callDate = request.callDate;
            this.callId = request.callId;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.phoneNoA = request.phoneNoA;
            this.phoneNoB = request.phoneNoB;
            this.prodCode = request.prodCode;
            this.resType = request.resType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretNo = request.secretNo;
        } 

        /**
         * BillId.
         */
        public Builder billId(String billId) {
            this.putQueryParameter("BillId", billId);
            this.billId = billId;
            return this;
        }

        /**
         * CallDate.
         */
        public Builder callDate(String callDate) {
            this.putQueryParameter("CallDate", callDate);
            this.callDate = callDate;
            return this;
        }

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
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
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * PhoneNoA.
         */
        public Builder phoneNoA(String phoneNoA) {
            this.putQueryParameter("PhoneNoA", phoneNoA);
            this.phoneNoA = phoneNoA;
            return this;
        }

        /**
         * PhoneNoB.
         */
        public Builder phoneNoB(String phoneNoB) {
            this.putQueryParameter("PhoneNoB", phoneNoB);
            this.phoneNoB = phoneNoB;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ResType.
         */
        public Builder resType(Integer resType) {
            this.putQueryParameter("ResType", resType);
            this.resType = resType;
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
         * SecretNo.
         */
        public Builder secretNo(String secretNo) {
            this.putQueryParameter("SecretNo", secretNo);
            this.secretNo = secretNo;
            return this;
        }

        @Override
        public QueryCallRecordingListRequest build() {
            return new QueryCallRecordingListRequest(this);
        } 

    } 

}
