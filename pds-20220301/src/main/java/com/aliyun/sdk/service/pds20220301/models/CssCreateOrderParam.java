// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CssCreateOrderParam} extends {@link TeaModel}
 *
 * <p>CssCreateOrderParam</p>
 */
public class CssCreateOrderParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("autoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.NameInMap("autoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.NameInMap("bid")
    private String bid;

    @com.aliyun.core.annotation.NameInMap("buyerId")
    private Long buyerId;

    @com.aliyun.core.annotation.NameInMap("certificate")
    private String certificate;

    @com.aliyun.core.annotation.NameInMap("childId")
    private Long childId;

    @com.aliyun.core.annotation.NameInMap("cilentIp")
    private String cilentIp;

    @com.aliyun.core.annotation.NameInMap("commodities")
    private java.util.List<CssInstanceCommodity> commodities;

    @com.aliyun.core.annotation.NameInMap("createrNick")
    private String createrNick;

    @com.aliyun.core.annotation.NameInMap("cssAuthRequestParam")
    private Object cssAuthRequestParam;

    @com.aliyun.core.annotation.NameInMap("fromApp")
    private String fromApp;

    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("marketType")
    private Long marketType;

    @com.aliyun.core.annotation.NameInMap("memo")
    private String memo;

    @com.aliyun.core.annotation.NameInMap("orderOrigin")
    private String orderOrigin;

    @com.aliyun.core.annotation.NameInMap("orderParams")
    private java.util.Map<String, String> orderParams;

    @com.aliyun.core.annotation.NameInMap("payerId")
    private Long payerId;

    @com.aliyun.core.annotation.NameInMap("planGroupId")
    private Long planGroupId;

    @com.aliyun.core.annotation.NameInMap("planId")
    private Long planId;

    @com.aliyun.core.annotation.NameInMap("planInstanceId")
    private String planInstanceId;

    @com.aliyun.core.annotation.NameInMap("promotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.NameInMap("promotionInputParam")
    private Object promotionInputParam;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skipChannel")
    private Boolean skipChannel;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("transientAccess")
    private Object transientAccess;

    @com.aliyun.core.annotation.NameInMap("umidToken")
    private String umidToken;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private CssCreateOrderParam(Builder builder) {
        this.agentId = builder.agentId;
        this.autoPay = builder.autoPay;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.bid = builder.bid;
        this.buyerId = builder.buyerId;
        this.certificate = builder.certificate;
        this.childId = builder.childId;
        this.cilentIp = builder.cilentIp;
        this.commodities = builder.commodities;
        this.createrNick = builder.createrNick;
        this.cssAuthRequestParam = builder.cssAuthRequestParam;
        this.fromApp = builder.fromApp;
        this.language = builder.language;
        this.marketType = builder.marketType;
        this.memo = builder.memo;
        this.orderOrigin = builder.orderOrigin;
        this.orderParams = builder.orderParams;
        this.payerId = builder.payerId;
        this.planGroupId = builder.planGroupId;
        this.planId = builder.planId;
        this.planInstanceId = builder.planInstanceId;
        this.promotionCode = builder.promotionCode;
        this.promotionInputParam = builder.promotionInputParam;
        this.requestId = builder.requestId;
        this.skipChannel = builder.skipChannel;
        this.token = builder.token;
        this.transientAccess = builder.transientAccess;
        this.umidToken = builder.umidToken;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CssCreateOrderParam create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return buyerId
     */
    public Long getBuyerId() {
        return this.buyerId;
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return childId
     */
    public Long getChildId() {
        return this.childId;
    }

    /**
     * @return cilentIp
     */
    public String getCilentIp() {
        return this.cilentIp;
    }

    /**
     * @return commodities
     */
    public java.util.List<CssInstanceCommodity> getCommodities() {
        return this.commodities;
    }

    /**
     * @return createrNick
     */
    public String getCreaterNick() {
        return this.createrNick;
    }

    /**
     * @return cssAuthRequestParam
     */
    public Object getCssAuthRequestParam() {
        return this.cssAuthRequestParam;
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return marketType
     */
    public Long getMarketType() {
        return this.marketType;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return orderOrigin
     */
    public String getOrderOrigin() {
        return this.orderOrigin;
    }

    /**
     * @return orderParams
     */
    public java.util.Map<String, String> getOrderParams() {
        return this.orderParams;
    }

    /**
     * @return payerId
     */
    public Long getPayerId() {
        return this.payerId;
    }

    /**
     * @return planGroupId
     */
    public Long getPlanGroupId() {
        return this.planGroupId;
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * @return planInstanceId
     */
    public String getPlanInstanceId() {
        return this.planInstanceId;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return promotionInputParam
     */
    public Object getPromotionInputParam() {
        return this.promotionInputParam;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skipChannel
     */
    public Boolean getSkipChannel() {
        return this.skipChannel;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return transientAccess
     */
    public Object getTransientAccess() {
        return this.transientAccess;
    }

    /**
     * @return umidToken
     */
    public String getUmidToken() {
        return this.umidToken;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String agentId; 
        private Boolean autoPay; 
        private Boolean autoUseCoupon; 
        private String bid; 
        private Long buyerId; 
        private String certificate; 
        private Long childId; 
        private String cilentIp; 
        private java.util.List<CssInstanceCommodity> commodities; 
        private String createrNick; 
        private Object cssAuthRequestParam; 
        private String fromApp; 
        private String language; 
        private Long marketType; 
        private String memo; 
        private String orderOrigin; 
        private java.util.Map<String, String> orderParams; 
        private Long payerId; 
        private Long planGroupId; 
        private Long planId; 
        private String planInstanceId; 
        private String promotionCode; 
        private Object promotionInputParam; 
        private String requestId; 
        private Boolean skipChannel; 
        private String token; 
        private Object transientAccess; 
        private String umidToken; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(CssCreateOrderParam model) {
            this.agentId = model.agentId;
            this.autoPay = model.autoPay;
            this.autoUseCoupon = model.autoUseCoupon;
            this.bid = model.bid;
            this.buyerId = model.buyerId;
            this.certificate = model.certificate;
            this.childId = model.childId;
            this.cilentIp = model.cilentIp;
            this.commodities = model.commodities;
            this.createrNick = model.createrNick;
            this.cssAuthRequestParam = model.cssAuthRequestParam;
            this.fromApp = model.fromApp;
            this.language = model.language;
            this.marketType = model.marketType;
            this.memo = model.memo;
            this.orderOrigin = model.orderOrigin;
            this.orderParams = model.orderParams;
            this.payerId = model.payerId;
            this.planGroupId = model.planGroupId;
            this.planId = model.planId;
            this.planInstanceId = model.planInstanceId;
            this.promotionCode = model.promotionCode;
            this.promotionInputParam = model.promotionInputParam;
            this.requestId = model.requestId;
            this.skipChannel = model.skipChannel;
            this.token = model.token;
            this.transientAccess = model.transientAccess;
            this.umidToken = model.umidToken;
            this.userId = model.userId;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * autoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }

        /**
         * autoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * bid.
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * buyerId.
         */
        public Builder buyerId(Long buyerId) {
            this.buyerId = buyerId;
            return this;
        }

        /**
         * certificate.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * childId.
         */
        public Builder childId(Long childId) {
            this.childId = childId;
            return this;
        }

        /**
         * cilentIp.
         */
        public Builder cilentIp(String cilentIp) {
            this.cilentIp = cilentIp;
            return this;
        }

        /**
         * commodities.
         */
        public Builder commodities(java.util.List<CssInstanceCommodity> commodities) {
            this.commodities = commodities;
            return this;
        }

        /**
         * createrNick.
         */
        public Builder createrNick(String createrNick) {
            this.createrNick = createrNick;
            return this;
        }

        /**
         * cssAuthRequestParam.
         */
        public Builder cssAuthRequestParam(Object cssAuthRequestParam) {
            this.cssAuthRequestParam = cssAuthRequestParam;
            return this;
        }

        /**
         * fromApp.
         */
        public Builder fromApp(String fromApp) {
            this.fromApp = fromApp;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * marketType.
         */
        public Builder marketType(Long marketType) {
            this.marketType = marketType;
            return this;
        }

        /**
         * memo.
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * orderOrigin.
         */
        public Builder orderOrigin(String orderOrigin) {
            this.orderOrigin = orderOrigin;
            return this;
        }

        /**
         * orderParams.
         */
        public Builder orderParams(java.util.Map<String, String> orderParams) {
            this.orderParams = orderParams;
            return this;
        }

        /**
         * payerId.
         */
        public Builder payerId(Long payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * planGroupId.
         */
        public Builder planGroupId(Long planGroupId) {
            this.planGroupId = planGroupId;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(Long planId) {
            this.planId = planId;
            return this;
        }

        /**
         * planInstanceId.
         */
        public Builder planInstanceId(String planInstanceId) {
            this.planInstanceId = planInstanceId;
            return this;
        }

        /**
         * promotionCode.
         */
        public Builder promotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * promotionInputParam.
         */
        public Builder promotionInputParam(Object promotionInputParam) {
            this.promotionInputParam = promotionInputParam;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * skipChannel.
         */
        public Builder skipChannel(Boolean skipChannel) {
            this.skipChannel = skipChannel;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * transientAccess.
         */
        public Builder transientAccess(Object transientAccess) {
            this.transientAccess = transientAccess;
            return this;
        }

        /**
         * umidToken.
         */
        public Builder umidToken(String umidToken) {
            this.umidToken = umidToken;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public CssCreateOrderParam build() {
            return new CssCreateOrderParam(this);
        } 

    } 

}
