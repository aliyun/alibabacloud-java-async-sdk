// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link SetSavingPlanUserDeductRuleRequest} extends {@link RequestModel}
 *
 * <p>SetSavingPlanUserDeductRuleRequest</p>
 */
public class SetSavingPlanUserDeductRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpnInstanceCode")
    private String spnInstanceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserDeductRules")
    private java.util.List<UserDeductRules> userDeductRules;

    private SetSavingPlanUserDeductRuleRequest(Builder builder) {
        super(builder);
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.nbid = builder.nbid;
        this.spnInstanceCode = builder.spnInstanceCode;
        this.userDeductRules = builder.userDeductRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSavingPlanUserDeductRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return spnInstanceCode
     */
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

    /**
     * @return userDeductRules
     */
    public java.util.List<UserDeductRules> getUserDeductRules() {
        return this.userDeductRules;
    }

    public static final class Builder extends Request.Builder<SetSavingPlanUserDeductRuleRequest, Builder> {
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String nbid; 
        private String spnInstanceCode; 
        private java.util.List<UserDeductRules> userDeductRules; 

        private Builder() {
            super();
        } 

        private Builder(SetSavingPlanUserDeductRuleRequest request) {
            super(request);
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.nbid = request.nbid;
            this.spnInstanceCode = request.spnInstanceCode;
            this.userDeductRules = request.userDeductRules;
        } 

        /**
         * EcIdAccountIds.
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            String ecIdAccountIdsShrink = shrink(ecIdAccountIds, "EcIdAccountIds", "json");
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIdsShrink);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * SpnInstanceCode.
         */
        public Builder spnInstanceCode(String spnInstanceCode) {
            this.putBodyParameter("SpnInstanceCode", spnInstanceCode);
            this.spnInstanceCode = spnInstanceCode;
            return this;
        }

        /**
         * UserDeductRules.
         */
        public Builder userDeductRules(java.util.List<UserDeductRules> userDeductRules) {
            String userDeductRulesShrink = shrink(userDeductRules, "UserDeductRules", "json");
            this.putBodyParameter("UserDeductRules", userDeductRulesShrink);
            this.userDeductRules = userDeductRules;
            return this;
        }

        @Override
        public SetSavingPlanUserDeductRuleRequest build() {
            return new SetSavingPlanUserDeductRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetSavingPlanUserDeductRuleRequest} extends {@link TeaModel}
     *
     * <p>SetSavingPlanUserDeductRuleRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        private EcIdAccountIds(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIds create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        public static final class Builder {
            private java.util.List<Long> accountIds; 
            private String ecId; 

            /**
             * AccountIds.
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            public EcIdAccountIds build() {
                return new EcIdAccountIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link SetSavingPlanUserDeductRuleRequest} extends {@link TeaModel}
     *
     * <p>SetSavingPlanUserDeductRuleRequest</p>
     */
    public static class UserDeductRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("SkipDeduct")
        private Boolean skipDeduct;

        private UserDeductRules(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.moduleCode = builder.moduleCode;
            this.skipDeduct = builder.skipDeduct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDeductRules create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return skipDeduct
         */
        public Boolean getSkipDeduct() {
            return this.skipDeduct;
        }

        public static final class Builder {
            private String commodityCode; 
            private String moduleCode; 
            private Boolean skipDeduct; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * SkipDeduct.
             */
            public Builder skipDeduct(Boolean skipDeduct) {
                this.skipDeduct = skipDeduct;
                return this;
            }

            public UserDeductRules build() {
                return new UserDeductRules(this);
            } 

        } 

    }
}
