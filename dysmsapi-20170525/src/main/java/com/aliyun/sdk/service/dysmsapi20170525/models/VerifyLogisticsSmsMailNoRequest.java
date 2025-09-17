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
 * {@link VerifyLogisticsSmsMailNoRequest} extends {@link RequestModel}
 *
 * <p>VerifyLogisticsSmsMailNoRequest</p>
 */
public class VerifyLogisticsSmsMailNoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpressCompanyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expressCompanyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MailNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mailNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformCompanyCode")
    private String platformCompanyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private VerifyLogisticsSmsMailNoRequest(Builder builder) {
        super(builder);
        this.expressCompanyCode = builder.expressCompanyCode;
        this.mailNo = builder.mailNo;
        this.ownerId = builder.ownerId;
        this.platformCompanyCode = builder.platformCompanyCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyLogisticsSmsMailNoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressCompanyCode
     */
    public String getExpressCompanyCode() {
        return this.expressCompanyCode;
    }

    /**
     * @return mailNo
     */
    public String getMailNo() {
        return this.mailNo;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return platformCompanyCode
     */
    public String getPlatformCompanyCode() {
        return this.platformCompanyCode;
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

    public static final class Builder extends Request.Builder<VerifyLogisticsSmsMailNoRequest, Builder> {
        private String expressCompanyCode; 
        private String mailNo; 
        private Long ownerId; 
        private String platformCompanyCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyLogisticsSmsMailNoRequest request) {
            super(request);
            this.expressCompanyCode = request.expressCompanyCode;
            this.mailNo = request.mailNo;
            this.ownerId = request.ownerId;
            this.platformCompanyCode = request.platformCompanyCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder expressCompanyCode(String expressCompanyCode) {
            this.putQueryParameter("ExpressCompanyCode", expressCompanyCode);
            this.expressCompanyCode = expressCompanyCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder mailNo(String mailNo) {
            this.putQueryParameter("MailNo", mailNo);
            this.mailNo = mailNo;
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
         * PlatformCompanyCode.
         */
        public Builder platformCompanyCode(String platformCompanyCode) {
            this.putQueryParameter("PlatformCompanyCode", platformCompanyCode);
            this.platformCompanyCode = platformCompanyCode;
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
        public VerifyLogisticsSmsMailNoRequest build() {
            return new VerifyLogisticsSmsMailNoRequest(this);
        } 

    } 

}
