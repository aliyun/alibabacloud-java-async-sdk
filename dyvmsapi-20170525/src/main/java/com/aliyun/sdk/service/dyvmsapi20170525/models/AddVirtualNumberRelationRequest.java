// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddVirtualNumberRelationRequest} extends {@link RequestModel}
 *
 * <p>AddVirtualNumberRelationRequest</p>
 */
public class AddVirtualNumberRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorpNameList")
    private String corpNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String numberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999)
    private Integer routeType;

    private AddVirtualNumberRelationRequest(Builder builder) {
        super(builder);
        this.corpNameList = builder.corpNameList;
        this.numberList = builder.numberList;
        this.ownerId = builder.ownerId;
        this.phoneNum = builder.phoneNum;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeType = builder.routeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVirtualNumberRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpNameList
     */
    public String getCorpNameList() {
        return this.corpNameList;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNum
     */
    public String getPhoneNum() {
        return this.phoneNum;
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

    /**
     * @return routeType
     */
    public Integer getRouteType() {
        return this.routeType;
    }

    public static final class Builder extends Request.Builder<AddVirtualNumberRelationRequest, Builder> {
        private String corpNameList; 
        private String numberList; 
        private Long ownerId; 
        private String phoneNum; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer routeType; 

        private Builder() {
            super();
        } 

        private Builder(AddVirtualNumberRelationRequest request) {
            super(request);
            this.corpNameList = request.corpNameList;
            this.numberList = request.numberList;
            this.ownerId = request.ownerId;
            this.phoneNum = request.phoneNum;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeType = request.routeType;
        } 

        /**
         * <p>The company names. Separate multiple company names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>Company 1</p>
         */
        public Builder corpNameList(String corpNameList) {
            this.putQueryParameter("CorpNameList", corpNameList);
            this.corpNameList = corpNameList;
            return this;
        }

        /**
         * <p>The real numbers. Separate multiple real numbers with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1321111****,1322222****</p>
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
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
         * <p>The virtual number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>05516214****</p>
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * <p>The service name. Default value: <strong>dyvms</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>dyvms</p>
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

        /**
         * <p>The route type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: number location first.</li>
         * <li><strong>1</strong>: random.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder routeType(Integer routeType) {
            this.putQueryParameter("RouteType", routeType);
            this.routeType = routeType;
            return this;
        }

        @Override
        public AddVirtualNumberRelationRequest build() {
            return new AddVirtualNumberRelationRequest(this);
        } 

    } 

}
