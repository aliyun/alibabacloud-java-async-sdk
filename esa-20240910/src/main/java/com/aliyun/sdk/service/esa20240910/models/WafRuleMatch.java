// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link WafRuleMatch} extends {@link TeaModel}
 *
 * <p>WafRuleMatch</p>
 */
public class WafRuleMatch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConvertToLower")
    private Boolean convertToLower;

    @com.aliyun.core.annotation.NameInMap("Criteria")
    private java.util.List<WafRuleMatch> criteria;

    @com.aliyun.core.annotation.NameInMap("Logic")
    private String logic;

    @com.aliyun.core.annotation.NameInMap("MatchOperator")
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.NameInMap("MatchValue")
    private Object matchValue;

    @com.aliyun.core.annotation.NameInMap("Negate")
    private Boolean negate;

    private WafRuleMatch(Builder builder) {
        this.convertToLower = builder.convertToLower;
        this.criteria = builder.criteria;
        this.logic = builder.logic;
        this.matchOperator = builder.matchOperator;
        this.matchType = builder.matchType;
        this.matchValue = builder.matchValue;
        this.negate = builder.negate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafRuleMatch create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return convertToLower
     */
    public Boolean getConvertToLower() {
        return this.convertToLower;
    }

    /**
     * @return criteria
     */
    public java.util.List<WafRuleMatch> getCriteria() {
        return this.criteria;
    }

    /**
     * @return logic
     */
    public String getLogic() {
        return this.logic;
    }

    /**
     * @return matchOperator
     */
    public String getMatchOperator() {
        return this.matchOperator;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return matchValue
     */
    public Object getMatchValue() {
        return this.matchValue;
    }

    /**
     * @return negate
     */
    public Boolean getNegate() {
        return this.negate;
    }

    public static final class Builder {
        private Boolean convertToLower; 
        private java.util.List<WafRuleMatch> criteria; 
        private String logic; 
        private String matchOperator; 
        private String matchType; 
        private Object matchValue; 
        private Boolean negate; 

        private Builder() {
        } 

        private Builder(WafRuleMatch model) {
            this.convertToLower = model.convertToLower;
            this.criteria = model.criteria;
            this.logic = model.logic;
            this.matchOperator = model.matchOperator;
            this.matchType = model.matchType;
            this.matchValue = model.matchValue;
            this.negate = model.negate;
        } 

        /**
         * ConvertToLower.
         */
        public Builder convertToLower(Boolean convertToLower) {
            this.convertToLower = convertToLower;
            return this;
        }

        /**
         * Criteria.
         */
        public Builder criteria(java.util.List<WafRuleMatch> criteria) {
            this.criteria = criteria;
            return this;
        }

        /**
         * Logic.
         */
        public Builder logic(String logic) {
            this.logic = logic;
            return this;
        }

        /**
         * MatchOperator.
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * MatchType.
         */
        public Builder matchType(String matchType) {
            this.matchType = matchType;
            return this;
        }

        /**
         * MatchValue.
         */
        public Builder matchValue(Object matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * Negate.
         */
        public Builder negate(Boolean negate) {
            this.negate = negate;
            return this;
        }

        public WafRuleMatch build() {
            return new WafRuleMatch(this);
        } 

    } 

}
