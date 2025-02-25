// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link CreateOrderPayUrlForOutDiscountRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderPayUrlForOutDiscountRequest</p>
 */
public class CreateOrderPayUrlForOutDiscountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuyInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private CreateOrderPayUrlForOutDiscountRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.buyInfo = builder.buyInfo;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderPayUrlForOutDiscountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return buyInfo
     */
    public String getBuyInfo() {
        return this.buyInfo;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<CreateOrderPayUrlForOutDiscountRequest, Builder> {
        private String bizId; 
        private String bizUid; 
        private String buyInfo; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderPayUrlForOutDiscountRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.buyInfo = request.buyInfo;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20****201229</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20882****3220453</p>
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;addressId&quot;:&quot;158<em><strong><strong>11&quot;,&quot;deliveryInfoId&quot;:&quot;20&quot;,&quot;extJson&quot;:{&quot;subBizCode&quot;:&quot;defaultSubBizCode&quot;},&quot;orderItems&quot;:[{&quot;lmItemId&quot;:&quot;1002</strong></strong>123-67150<strong><strong>12&quot;,&quot;number&quot;:1,&quot;outDiscountFee&quot;:&quot;0&quot;,&quot;price&quot;:&quot;1&quot;,&quot;skuId&quot;:4830321</strong></strong></em>}],&quot;outDiscountInfos&quot;:{&quot;promotionInfos&quot;:[],&quot;totalDiscountFee&quot;:&quot;0&quot;},&quot;postFee&quot;:0,&quot;serviceType&quot;:-4}</p>
         */
        public Builder buyInfo(String buyInfo) {
            this.putBodyParameter("BuyInfo", buyInfo);
            this.buyInfo = buyInfo;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public CreateOrderPayUrlForOutDiscountRequest build() {
            return new CreateOrderPayUrlForOutDiscountRequest(this);
        } 

    } 

}
