// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckResultRequest} extends {@link RequestModel}
 *
 * <p>CheckResultRequest</p>
 */
public class CheckResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraImageControlList")
    private String extraImageControlList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReturnImage")
    private String isReturnImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnFiveCategorySpoofResult")
    private String returnFiveCategorySpoofResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionId")
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
         * <p>Return additional information.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder extraImageControlList(String extraImageControlList) {
            this.putQueryParameter("ExtraImageControlList", extraImageControlList);
            this.extraImageControlList = extraImageControlList;
            return this;
        }

        /**
         * <p>Whether to return images.</p>
         * <ul>
         * <li>Y: Return</li>
         * <li>N: Do not return</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder isReturnImage(String isReturnImage) {
            this.putQueryParameter("IsReturnImage", isReturnImage);
            this.isReturnImage = isReturnImage;
            return this;
        }

        /**
         * <p>A unique business identifier defined by the merchant, used for subsequent troubleshooting. It supports a combination of letters and numbers, with a maximum length of 32 characters. Please ensure its uniqueness.</p>
         * 
         * <strong>example:</strong>
         * <p>djs20d***9-dsskc</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>Whether to return anti-fraud detection results.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder returnFiveCategorySpoofResult(String returnFiveCategorySpoofResult) {
            this.putQueryParameter("ReturnFiveCategorySpoofResult", returnFiveCategorySpoofResult);
            this.returnFiveCategorySpoofResult = returnFiveCategorySpoofResult;
            return this;
        }

        /**
         * <p>Authentication ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
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
