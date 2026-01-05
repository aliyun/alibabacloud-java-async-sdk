// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CreateSmsTrademarkRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsTrademarkRequest</p>
 */
public class CreateSmsTrademarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrademarkApplicantName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trademarkApplicantName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrademarkEffExpDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trademarkEffExpDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrademarkName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trademarkName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrademarkPic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trademarkPic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrademarkRegistrationNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trademarkRegistrationNumber;

    private CreateSmsTrademarkRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trademarkApplicantName = builder.trademarkApplicantName;
        this.trademarkEffExpDate = builder.trademarkEffExpDate;
        this.trademarkName = builder.trademarkName;
        this.trademarkPic = builder.trademarkPic;
        this.trademarkRegistrationNumber = builder.trademarkRegistrationNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsTrademarkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return trademarkApplicantName
     */
    public String getTrademarkApplicantName() {
        return this.trademarkApplicantName;
    }

    /**
     * @return trademarkEffExpDate
     */
    public String getTrademarkEffExpDate() {
        return this.trademarkEffExpDate;
    }

    /**
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    /**
     * @return trademarkPic
     */
    public String getTrademarkPic() {
        return this.trademarkPic;
    }

    /**
     * @return trademarkRegistrationNumber
     */
    public String getTrademarkRegistrationNumber() {
        return this.trademarkRegistrationNumber;
    }

    public static final class Builder extends Request.Builder<CreateSmsTrademarkRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trademarkApplicantName; 
        private String trademarkEffExpDate; 
        private String trademarkName; 
        private String trademarkPic; 
        private String trademarkRegistrationNumber; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsTrademarkRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trademarkApplicantName = request.trademarkApplicantName;
            this.trademarkEffExpDate = request.trademarkEffExpDate;
            this.trademarkName = request.trademarkName;
            this.trademarkPic = request.trademarkPic;
            this.trademarkRegistrationNumber = request.trademarkRegistrationNumber;
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
         * <p>申请人名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder trademarkApplicantName(String trademarkApplicantName) {
            this.putQueryParameter("TrademarkApplicantName", trademarkApplicantName);
            this.trademarkApplicantName = trademarkApplicantName;
            return this;
        }

        /**
         * <p>专用权生失效日期</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2010-12-14~2030-12-13</p>
         */
        public Builder trademarkEffExpDate(String trademarkEffExpDate) {
            this.putQueryParameter("TrademarkEffExpDate", trademarkEffExpDate);
            this.trademarkEffExpDate = trademarkEffExpDate;
            return this;
        }

        /**
         * <p>商标名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder trademarkName(String trademarkName) {
            this.putQueryParameter("TrademarkName", trademarkName);
            this.trademarkName = trademarkName;
            return this;
        }

        /**
         * <p>商标详情截图osskey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456/test1719383196031.jpg</p>
         */
        public Builder trademarkPic(String trademarkPic) {
            this.putQueryParameter("TrademarkPic", trademarkPic);
            this.trademarkPic = trademarkPic;
            return this;
        }

        /**
         * <p>商标注册号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>766905</p>
         */
        public Builder trademarkRegistrationNumber(String trademarkRegistrationNumber) {
            this.putQueryParameter("TrademarkRegistrationNumber", trademarkRegistrationNumber);
            this.trademarkRegistrationNumber = trademarkRegistrationNumber;
            return this;
        }

        @Override
        public CreateSmsTrademarkRequest build() {
            return new CreateSmsTrademarkRequest(this);
        } 

    } 

}
