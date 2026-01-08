// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link BindDmAccountRequest} extends {@link RequestModel}
 *
 * <p>BindDmAccountRequest</p>
 */
public class BindDmAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendAttr")
    @com.aliyun.core.annotation.Validation(required = true)
    private ExtendAttr extendAttr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private BindDmAccountRequest(Builder builder) {
        super(builder);
        this.accountCode = builder.accountCode;
        this.custSpaceId = builder.custSpaceId;
        this.extendAttr = builder.extendAttr;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindDmAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountCode
     */
    public String getAccountCode() {
        return this.accountCode;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return extendAttr
     */
    public ExtendAttr getExtendAttr() {
        return this.extendAttr;
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

    public static final class Builder extends Request.Builder<BindDmAccountRequest, Builder> {
        private String accountCode; 
        private String custSpaceId; 
        private ExtendAttr extendAttr; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(BindDmAccountRequest request) {
            super(request);
            this.accountCode = request.accountCode;
            this.custSpaceId = request.custSpaceId;
            this.extendAttr = request.extendAttr;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder accountCode(String accountCode) {
            this.putQueryParameter("AccountCode", accountCode);
            this.accountCode = accountCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder extendAttr(ExtendAttr extendAttr) {
            String extendAttrShrink = shrink(extendAttr, "ExtendAttr", "json");
            this.putQueryParameter("ExtendAttr", extendAttrShrink);
            this.extendAttr = extendAttr;
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
        public BindDmAccountRequest build() {
            return new BindDmAccountRequest(this);
        } 

    } 

    /**
     * 
     * {@link BindDmAccountRequest} extends {@link TeaModel}
     *
     * <p>BindDmAccountRequest</p>
     */
    public static class ExtendAttr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("SendType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sendType;

        private ExtendAttr(Builder builder) {
            this.accountName = builder.accountName;
            this.sendType = builder.sendType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendAttr create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return sendType
         */
        public String getSendType() {
            return this.sendType;
        }

        public static final class Builder {
            private String accountName; 
            private String sendType; 

            private Builder() {
            } 

            private Builder(ExtendAttr model) {
                this.accountName = model.accountName;
                this.sendType = model.sendType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder sendType(String sendType) {
                this.sendType = sendType;
                return this;
            }

            public ExtendAttr build() {
                return new ExtendAttr(this);
            } 

        } 

    }
}
