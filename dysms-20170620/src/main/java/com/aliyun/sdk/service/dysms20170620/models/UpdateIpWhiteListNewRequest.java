// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link UpdateIpWhiteListNewRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpWhiteListNewRequest</p>
 */
public class UpdateIpWhiteListNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureCode")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private Integer featureCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpWhiteList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealNameInsId")
    private Long realNameInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private UpdateIpWhiteListNewRequest(Builder builder) {
        super(builder);
        this.featureCode = builder.featureCode;
        this.ipWhiteList = builder.ipWhiteList;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.realNameInsId = builder.realNameInsId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpWhiteListNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureCode
     */
    public Integer getFeatureCode() {
        return this.featureCode;
    }

    /**
     * @return ipWhiteList
     */
    public String getIpWhiteList() {
        return this.ipWhiteList;
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
     * @return realNameInsId
     */
    public Long getRealNameInsId() {
        return this.realNameInsId;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UpdateIpWhiteListNewRequest, Builder> {
        private Integer featureCode; 
        private String ipWhiteList; 
        private Long ownerId; 
        private String prodCode; 
        private Long realNameInsId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpWhiteListNewRequest request) {
            super(request);
            this.featureCode = request.featureCode;
            this.ipWhiteList = request.ipWhiteList;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.realNameInsId = request.realNameInsId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.userName = request.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder featureCode(Integer featureCode) {
            this.putQueryParameter("FeatureCode", featureCode);
            this.featureCode = featureCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ipWhiteList(String ipWhiteList) {
            this.putQueryParameter("IpWhiteList", ipWhiteList);
            this.ipWhiteList = ipWhiteList;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * RealNameInsId.
         */
        public Builder realNameInsId(Long realNameInsId) {
            this.putQueryParameter("RealNameInsId", realNameInsId);
            this.realNameInsId = realNameInsId;
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
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateIpWhiteListNewRequest build() {
            return new UpdateIpWhiteListNewRequest(this);
        } 

    } 

}
