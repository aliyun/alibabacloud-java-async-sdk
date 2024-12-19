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
 * {@link ModifyItemLimitRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyItemLimitRuleRequest</p>
 */
public class ModifyItemLimitRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

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
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubBizCode")
    private String subBizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpperNum")
    private Integer upperNum;

    private ModifyItemLimitRuleRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.bizId = builder.bizId;
        this.endTime = builder.endTime;
        this.itemId = builder.itemId;
        this.lmActivityId = builder.lmActivityId;
        this.lmItemId = builder.lmItemId;
        this.ruleId = builder.ruleId;
        this.ruleType = builder.ruleType;
        this.subBizCode = builder.subBizCode;
        this.upperNum = builder.upperNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyItemLimitRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return subBizCode
     */
    public String getSubBizCode() {
        return this.subBizCode;
    }

    /**
     * @return upperNum
     */
    public Integer getUpperNum() {
        return this.upperNum;
    }

    public static final class Builder extends Request.Builder<ModifyItemLimitRuleRequest, Builder> {
        private Long beginTime; 
        private String bizId; 
        private Long endTime; 
        private Long itemId; 
        private Long lmActivityId; 
        private String lmItemId; 
        private Long ruleId; 
        private Integer ruleType; 
        private String subBizCode; 
        private Integer upperNum; 

        private Builder() {
            super();
        } 

        private Builder(ModifyItemLimitRuleRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.bizId = request.bizId;
            this.endTime = request.endTime;
            this.itemId = request.itemId;
            this.lmActivityId = request.lmActivityId;
            this.lmItemId = request.lmItemId;
            this.ruleId = request.ruleId;
            this.ruleType = request.ruleType;
            this.subBizCode = request.subBizCode;
            this.upperNum = request.upperNum;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * 
         * <strong>example:</strong>
         * <p>136</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
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

        /**
         * UpperNum.
         */
        public Builder upperNum(Integer upperNum) {
            this.putQueryParameter("UpperNum", upperNum);
            this.upperNum = upperNum;
            return this;
        }

        @Override
        public ModifyItemLimitRuleRequest build() {
            return new ModifyItemLimitRuleRequest(this);
        } 

    } 

}
