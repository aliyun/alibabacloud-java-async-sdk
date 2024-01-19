// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddItemLimitRuleRequest} extends {@link RequestModel}
 *
 * <p>AddItemLimitRuleRequest</p>
 */
public class AddItemLimitRuleRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("ItemId")
    private Long itemId;

    @Query
    @NameInMap("LmActivityId")
    private Long lmActivityId;

    @Query
    @NameInMap("LmItemId")
    private String lmItemId;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private Integer ruleType;

    @Query
    @NameInMap("SubBizCode")
    private String subBizCode;

    @Query
    @NameInMap("UpperNum")
    @Validation(required = true)
    private Integer upperNum;

    private AddItemLimitRuleRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.bizId = builder.bizId;
        this.endTime = builder.endTime;
        this.itemId = builder.itemId;
        this.lmActivityId = builder.lmActivityId;
        this.lmItemId = builder.lmItemId;
        this.ruleType = builder.ruleType;
        this.subBizCode = builder.subBizCode;
        this.upperNum = builder.upperNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddItemLimitRuleRequest create() {
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

    public static final class Builder extends Request.Builder<AddItemLimitRuleRequest, Builder> {
        private Long beginTime; 
        private String bizId; 
        private Long endTime; 
        private Long itemId; 
        private Long lmActivityId; 
        private String lmItemId; 
        private Integer ruleType; 
        private String subBizCode; 
        private Integer upperNum; 

        private Builder() {
            super();
        } 

        private Builder(AddItemLimitRuleRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.bizId = request.bizId;
            this.endTime = request.endTime;
            this.itemId = request.itemId;
            this.lmActivityId = request.lmActivityId;
            this.lmItemId = request.lmItemId;
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
         * BizId.
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
        public AddItemLimitRuleRequest build() {
            return new AddItemLimitRuleRequest(this);
        } 

    } 

}
