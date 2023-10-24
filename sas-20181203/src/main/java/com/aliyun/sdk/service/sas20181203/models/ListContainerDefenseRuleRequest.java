// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContainerDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>ListContainerDefenseRuleRequest</p>
 */
public class ListContainerDefenseRuleRequest extends Request {
    @Query
    @NameInMap("Conditions")
    private java.util.List < Conditions> conditions;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("IsDefaultRule")
    private Integer isDefaultRule;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RuleType")
    private Integer ruleType;

    private ListContainerDefenseRuleRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.currentPage = builder.currentPage;
        this.isDefaultRule = builder.isDefaultRule;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContainerDefenseRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List < Conditions> getConditions() {
        return this.conditions;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return isDefaultRule
     */
    public Integer getIsDefaultRule() {
        return this.isDefaultRule;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<ListContainerDefenseRuleRequest, Builder> {
        private java.util.List < Conditions> conditions; 
        private Integer currentPage; 
        private Integer isDefaultRule; 
        private String lang; 
        private Integer pageSize; 
        private Integer ruleType; 

        private Builder() {
            super();
        } 

        private Builder(ListContainerDefenseRuleRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.currentPage = request.currentPage;
            this.isDefaultRule = request.isDefaultRule;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ruleType = request.ruleType;
        } 

        /**
         * Conditions.
         */
        public Builder conditions(java.util.List < Conditions> conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IsDefaultRule.
         */
        public Builder isDefaultRule(Integer isDefaultRule) {
            this.putQueryParameter("IsDefaultRule", isDefaultRule);
            this.isDefaultRule = isDefaultRule;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public ListContainerDefenseRuleRequest build() {
            return new ListContainerDefenseRuleRequest(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
}
