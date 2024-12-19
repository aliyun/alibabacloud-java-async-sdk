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
 * {@link DeleteItemLimitRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteItemLimitRuleRequest</p>
 */
public class DeleteItemLimitRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private Long itemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmActivityId")
    private Long lmActivityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmItemId")
    private String lmItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubBizCode")
    private String subBizCode;

    private DeleteItemLimitRuleRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemId = builder.itemId;
        this.lmActivityId = builder.lmActivityId;
        this.lmItemId = builder.lmItemId;
        this.ruleId = builder.ruleId;
        this.subBizCode = builder.subBizCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteItemLimitRuleRequest create() {
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
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return lmActivityId
     */
    public Long getLmActivityId() {
        return this.lmActivityId;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return subBizCode
     */
    public String getSubBizCode() {
        return this.subBizCode;
    }

    public static final class Builder extends Request.Builder<DeleteItemLimitRuleRequest, Builder> {
        private String bizId; 
        private Long itemId; 
        private Long lmActivityId; 
        private String lmItemId; 
        private Long ruleId; 
        private String subBizCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteItemLimitRuleRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemId = request.itemId;
            this.lmActivityId = request.lmActivityId;
            this.lmItemId = request.lmItemId;
            this.ruleId = request.ruleId;
            this.subBizCode = request.subBizCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL2021083****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * LmActivityId.
         */
        public Builder lmActivityId(Long lmActivityId) {
            this.putQueryParameter("LmActivityId", lmActivityId);
            this.lmActivityId = lmActivityId;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putQueryParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * SubBizCode.
         */
        public Builder subBizCode(String subBizCode) {
            this.putQueryParameter("SubBizCode", subBizCode);
            this.subBizCode = subBizCode;
            return this;
        }

        @Override
        public DeleteItemLimitRuleRequest build() {
            return new DeleteItemLimitRuleRequest(this);
        } 

    } 

}
