// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckResultRequest} extends {@link RequestModel}
 *
 * <p>CheckResultRequest</p>
 */
public class CheckResultRequest extends Request {
    @Query
    @NameInMap("ExtraImageControlList")
    private String extraImageControlList;

    @Query
    @NameInMap("IsReturnImage")
    private String isReturnImage;

    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("ReturnFiveCategorySpoofResult")
    private String returnFiveCategorySpoofResult;

    @Query
    @NameInMap("TransactionId")
    private String transactionId;

    private CheckResultRequest(Builder builder) {
        super(builder);
        this.extraImageControlList = builder.extraImageControlList;
        this.isReturnImage = builder.isReturnImage;
        this.merchantBizId = builder.merchantBizId;
        this.returnFiveCategorySpoofResult = builder.returnFiveCategorySpoofResult;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraImageControlList
     */
    public String getExtraImageControlList() {
        return this.extraImageControlList;
    }

    /**
     * @return isReturnImage
     */
    public String getIsReturnImage() {
        return this.isReturnImage;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return returnFiveCategorySpoofResult
     */
    public String getReturnFiveCategorySpoofResult() {
        return this.returnFiveCategorySpoofResult;
    }

    /**
     * @return transactionId
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder extends Request.Builder<CheckResultRequest, Builder> {
        private String extraImageControlList; 
        private String isReturnImage; 
        private String merchantBizId; 
        private String returnFiveCategorySpoofResult; 
        private String transactionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckResultRequest request) {
            super(request);
            this.extraImageControlList = request.extraImageControlList;
            this.isReturnImage = request.isReturnImage;
            this.merchantBizId = request.merchantBizId;
            this.returnFiveCategorySpoofResult = request.returnFiveCategorySpoofResult;
            this.transactionId = request.transactionId;
        } 

        /**
         * ExtraImageControlList.
         */
        public Builder extraImageControlList(String extraImageControlList) {
            this.putQueryParameter("ExtraImageControlList", extraImageControlList);
            this.extraImageControlList = extraImageControlList;
            return this;
        }

        /**
         * IsReturnImage.
         */
        public Builder isReturnImage(String isReturnImage) {
            this.putQueryParameter("IsReturnImage", isReturnImage);
            this.isReturnImage = isReturnImage;
            return this;
        }

        /**
         * MerchantBizId.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * ReturnFiveCategorySpoofResult.
         */
        public Builder returnFiveCategorySpoofResult(String returnFiveCategorySpoofResult) {
            this.putQueryParameter("ReturnFiveCategorySpoofResult", returnFiveCategorySpoofResult);
            this.returnFiveCategorySpoofResult = returnFiveCategorySpoofResult;
            return this;
        }

        /**
         * TransactionId.
         */
        public Builder transactionId(String transactionId) {
            this.putQueryParameter("TransactionId", transactionId);
            this.transactionId = transactionId;
            return this;
        }

        @Override
        public CheckResultRequest build() {
            return new CheckResultRequest(this);
        } 

    } 

}
