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
 * {@link DeductUserPointRequest} extends {@link RequestModel}
 *
 * <p>DeductUserPointRequest</p>
 */
public class DeductUserPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private java.util.Map<String, ?> extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idempotentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private DeductUserPointRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.amount = builder.amount;
        this.bizId = builder.bizId;
        this.extInfo = builder.extInfo;
        this.idempotentId = builder.idempotentId;
        this.message = builder.message;
        this.ruleId = builder.ruleId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeductUserPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return extInfo
     */
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<DeductUserPointRequest, Builder> {
        private String accountType; 
        private Long amount; 
        private String bizId; 
        private java.util.Map<String, ?> extInfo; 
        private String idempotentId; 
        private String message; 
        private String ruleId; 
        private String thirdPartyUserId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(DeductUserPointRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.amount = request.amount;
            this.bizId = request.bizId;
            this.extInfo = request.extInfo;
            this.idempotentId = request.idempotentId;
            this.message = request.message;
            this.ruleId = request.ruleId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.title = request.title;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******003</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(java.util.Map<String, ?> extInfo) {
            String extInfoShrink = shrink(extInfo, "ExtInfo", "json");
            this.putBodyParameter("ExtInfo", extInfoShrink);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202112******31746-1202</p>
         */
        public Builder idempotentId(String idempotentId) {
            this.putQueryParameter("IdempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>136</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22******637</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public DeductUserPointRequest build() {
            return new DeductUserPointRequest(this);
        } 

    } 

}
