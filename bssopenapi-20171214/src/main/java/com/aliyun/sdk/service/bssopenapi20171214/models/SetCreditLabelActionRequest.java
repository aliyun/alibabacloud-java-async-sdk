// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCreditLabelActionRequest} extends {@link RequestModel}
 *
 * <p>SetCreditLabelActionRequest</p>
 */
public class SetCreditLabelActionRequest extends Request {
    @Query
    @NameInMap("ActionType")
    @Validation(required = true)
    private String actionType;

    @Query
    @NameInMap("ClearCycle")
    private String clearCycle;

    @Query
    @NameInMap("CreditAmount")
    @Validation(required = true)
    private String creditAmount;

    @Query
    @NameInMap("CurrencyCode")
    private String currencyCode;

    @Query
    @NameInMap("DailyCycle")
    private String dailyCycle;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IsNeedAddSettleLabel")
    private String isNeedAddSettleLabel;

    @Query
    @NameInMap("IsNeedAdjustCreditAccount")
    private String isNeedAdjustCreditAccount;

    @Query
    @NameInMap("IsNeedSaveNotifyRule")
    private String isNeedSaveNotifyRule;

    @Query
    @NameInMap("IsNeedSetCreditAmount")
    private String isNeedSetCreditAmount;

    @Query
    @NameInMap("NeedNotice")
    private Boolean needNotice;

    @Query
    @NameInMap("NewCreateMode")
    private Boolean newCreateMode;

    @Query
    @NameInMap("Operator")
    private String operator;

    @Query
    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    @Query
    @NameInMap("SiteCode")
    private String siteCode;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private String uid;

    private SetCreditLabelActionRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.clearCycle = builder.clearCycle;
        this.creditAmount = builder.creditAmount;
        this.currencyCode = builder.currencyCode;
        this.dailyCycle = builder.dailyCycle;
        this.description = builder.description;
        this.isNeedAddSettleLabel = builder.isNeedAddSettleLabel;
        this.isNeedAdjustCreditAccount = builder.isNeedAdjustCreditAccount;
        this.isNeedSaveNotifyRule = builder.isNeedSaveNotifyRule;
        this.isNeedSetCreditAmount = builder.isNeedSetCreditAmount;
        this.needNotice = builder.needNotice;
        this.newCreateMode = builder.newCreateMode;
        this.operator = builder.operator;
        this.requestId = builder.requestId;
        this.siteCode = builder.siteCode;
        this.source = builder.source;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCreditLabelActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return clearCycle
     */
    public String getClearCycle() {
        return this.clearCycle;
    }

    /**
     * @return creditAmount
     */
    public String getCreditAmount() {
        return this.creditAmount;
    }

    /**
     * @return currencyCode
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * @return dailyCycle
     */
    public String getDailyCycle() {
        return this.dailyCycle;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isNeedAddSettleLabel
     */
    public String getIsNeedAddSettleLabel() {
        return this.isNeedAddSettleLabel;
    }

    /**
     * @return isNeedAdjustCreditAccount
     */
    public String getIsNeedAdjustCreditAccount() {
        return this.isNeedAdjustCreditAccount;
    }

    /**
     * @return isNeedSaveNotifyRule
     */
    public String getIsNeedSaveNotifyRule() {
        return this.isNeedSaveNotifyRule;
    }

    /**
     * @return isNeedSetCreditAmount
     */
    public String getIsNeedSetCreditAmount() {
        return this.isNeedSetCreditAmount;
    }

    /**
     * @return needNotice
     */
    public Boolean getNeedNotice() {
        return this.needNotice;
    }

    /**
     * @return newCreateMode
     */
    public Boolean getNewCreateMode() {
        return this.newCreateMode;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteCode
     */
    public String getSiteCode() {
        return this.siteCode;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<SetCreditLabelActionRequest, Builder> {
        private String actionType; 
        private String clearCycle; 
        private String creditAmount; 
        private String currencyCode; 
        private String dailyCycle; 
        private String description; 
        private String isNeedAddSettleLabel; 
        private String isNeedAdjustCreditAccount; 
        private String isNeedSaveNotifyRule; 
        private String isNeedSetCreditAmount; 
        private Boolean needNotice; 
        private Boolean newCreateMode; 
        private String operator; 
        private String requestId; 
        private String siteCode; 
        private String source; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(SetCreditLabelActionRequest response) {
            super(response);
            this.actionType = response.actionType;
            this.clearCycle = response.clearCycle;
            this.creditAmount = response.creditAmount;
            this.currencyCode = response.currencyCode;
            this.dailyCycle = response.dailyCycle;
            this.description = response.description;
            this.isNeedAddSettleLabel = response.isNeedAddSettleLabel;
            this.isNeedAdjustCreditAccount = response.isNeedAdjustCreditAccount;
            this.isNeedSaveNotifyRule = response.isNeedSaveNotifyRule;
            this.isNeedSetCreditAmount = response.isNeedSetCreditAmount;
            this.needNotice = response.needNotice;
            this.newCreateMode = response.newCreateMode;
            this.operator = response.operator;
            this.requestId = response.requestId;
            this.siteCode = response.siteCode;
            this.source = response.source;
            this.uid = response.uid;
        } 

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * ClearCycle.
         */
        public Builder clearCycle(String clearCycle) {
            this.putQueryParameter("ClearCycle", clearCycle);
            this.clearCycle = clearCycle;
            return this;
        }

        /**
         * CreditAmount.
         */
        public Builder creditAmount(String creditAmount) {
            this.putQueryParameter("CreditAmount", creditAmount);
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * CurrencyCode.
         */
        public Builder currencyCode(String currencyCode) {
            this.putQueryParameter("CurrencyCode", currencyCode);
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * DailyCycle.
         */
        public Builder dailyCycle(String dailyCycle) {
            this.putQueryParameter("DailyCycle", dailyCycle);
            this.dailyCycle = dailyCycle;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IsNeedAddSettleLabel.
         */
        public Builder isNeedAddSettleLabel(String isNeedAddSettleLabel) {
            this.putQueryParameter("IsNeedAddSettleLabel", isNeedAddSettleLabel);
            this.isNeedAddSettleLabel = isNeedAddSettleLabel;
            return this;
        }

        /**
         * IsNeedAdjustCreditAccount.
         */
        public Builder isNeedAdjustCreditAccount(String isNeedAdjustCreditAccount) {
            this.putQueryParameter("IsNeedAdjustCreditAccount", isNeedAdjustCreditAccount);
            this.isNeedAdjustCreditAccount = isNeedAdjustCreditAccount;
            return this;
        }

        /**
         * IsNeedSaveNotifyRule.
         */
        public Builder isNeedSaveNotifyRule(String isNeedSaveNotifyRule) {
            this.putQueryParameter("IsNeedSaveNotifyRule", isNeedSaveNotifyRule);
            this.isNeedSaveNotifyRule = isNeedSaveNotifyRule;
            return this;
        }

        /**
         * IsNeedSetCreditAmount.
         */
        public Builder isNeedSetCreditAmount(String isNeedSetCreditAmount) {
            this.putQueryParameter("IsNeedSetCreditAmount", isNeedSetCreditAmount);
            this.isNeedSetCreditAmount = isNeedSetCreditAmount;
            return this;
        }

        /**
         * NeedNotice.
         */
        public Builder needNotice(Boolean needNotice) {
            this.putQueryParameter("NeedNotice", needNotice);
            this.needNotice = needNotice;
            return this;
        }

        /**
         * NewCreateMode.
         */
        public Builder newCreateMode(Boolean newCreateMode) {
            this.putQueryParameter("NewCreateMode", newCreateMode);
            this.newCreateMode = newCreateMode;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteCode.
         */
        public Builder siteCode(String siteCode) {
            this.putQueryParameter("SiteCode", siteCode);
            this.siteCode = siteCode;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public SetCreditLabelActionRequest build() {
            return new SetCreditLabelActionRequest(this);
        } 

    } 

}
