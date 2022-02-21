// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleSendSmsRequest} extends {@link RequestModel}
 *
 * <p>SingleSendSmsRequest</p>
 */
public class SingleSendSmsRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ParamString")
    @Validation(required = true)
    private String paramString;

    @Query
    @NameInMap("RecNum")
    @Validation(required = true)
    private String recNum;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SignName")
    @Validation(required = true)
    private String signName;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Query
    @NameInMap("Version")
    private String version;

    private SingleSendSmsRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.paramString = builder.paramString;
        this.recNum = builder.recNum;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.templateCode = builder.templateCode;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleSendSmsRequest create() {
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
     * @return paramString
     */
    public String getParamString() {
        return this.paramString;
    }

    /**
     * @return recNum
     */
    public String getRecNum() {
        return this.recNum;
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<SingleSendSmsRequest, Builder> {
        private Long ownerId; 
        private String paramString; 
        private String recNum; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private String templateCode; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(SingleSendSmsRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.paramString = response.paramString;
            this.recNum = response.recNum;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.signName = response.signName;
            this.templateCode = response.templateCode;
            this.version = response.version;
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
         * ParamString.
         */
        public Builder paramString(String paramString) {
            this.putQueryParameter("ParamString", paramString);
            this.paramString = paramString;
            return this;
        }

        /**
         * RecNum.
         */
        public Builder recNum(String recNum) {
            this.putQueryParameter("RecNum", recNum);
            this.recNum = recNum;
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
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public SingleSendSmsRequest build() {
            return new SingleSendSmsRequest(this);
        } 

    } 

}
