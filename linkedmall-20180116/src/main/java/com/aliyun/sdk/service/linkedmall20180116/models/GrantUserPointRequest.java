// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPointRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPointRequest</p>
 */
public class GrantUserPointRequest extends Request {
    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("Amount")
    @Validation(required = true)
    private Long amount;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("ExtInfo")
    private java.util.Map < String, ? > extInfo;

    @Query
    @NameInMap("IdempotentId")
    @Validation(required = true)
    private String idempotentId;

    @Query
    @NameInMap("Message")
    private String message;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    private String thirdPartyUserId;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private GrantUserPointRequest(Builder builder) {
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

    public static GrantUserPointRequest create() {
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
    public java.util.Map < String, ? > getExtInfo() {
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

    public static final class Builder extends Request.Builder<GrantUserPointRequest, Builder> {
        private String accountType; 
        private Long amount; 
        private String bizId; 
        private java.util.Map < String, ? > extInfo; 
        private String idempotentId; 
        private String message; 
        private String ruleId; 
        private String thirdPartyUserId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(GrantUserPointRequest request) {
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
         * Amount.
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(java.util.Map < String, ? > extInfo) {
            String extInfoShrink = shrink(extInfo, "ExtInfo", "json");
            this.putBodyParameter("ExtInfo", extInfoShrink);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * IdempotentId.
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
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
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
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public GrantUserPointRequest build() {
            return new GrantUserPointRequest(this);
        } 

    } 

}
