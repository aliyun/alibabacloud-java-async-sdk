// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link StartMicroOutboundRequest} extends {@link RequestModel}
 *
 * <p>StartMicroOutboundRequest</p>
 */
public class StartMicroOutboundRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandCode")
    private String commandCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private StartMicroOutboundRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountType = builder.accountType;
        this.appName = builder.appName;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.commandCode = builder.commandCode;
        this.extInfo = builder.extInfo;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartMicroOutboundRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return commandCode
     */
    public String getCommandCode() {
        return this.commandCode;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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

    public static final class Builder extends Request.Builder<StartMicroOutboundRequest, Builder> {
        private String accountId; 
        private String accountType; 
        private String appName; 
        private String calledNumber; 
        private String callingNumber; 
        private String commandCode; 
        private String extInfo; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(StartMicroOutboundRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.accountType = request.accountType;
            this.appName = request.appName;
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.commandCode = request.commandCode;
            this.extInfo = request.extInfo;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>Account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>223457****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>Account type.</p>
         * 
         * <strong>example:</strong>
         * <p>BUC_TYPE</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>Custom AppName for the business.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Called number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571456****</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>Calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>1367123****</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>Instruction code.</p>
         * 
         * <strong>example:</strong>
         * <p>outBound_Call</p>
         */
        public Builder commandCode(String commandCode) {
            this.putQueryParameter("CommandCode", commandCode);
            this.commandCode = commandCode;
            return this;
        }

        /**
         * <p>Business information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;caseId&quot;:23232****}</p>
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
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
         * <p>Product name. Default value: <strong>aiccs</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aiccs</p>
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
        public StartMicroOutboundRequest build() {
            return new StartMicroOutboundRequest(this);
        } 

    } 

}
