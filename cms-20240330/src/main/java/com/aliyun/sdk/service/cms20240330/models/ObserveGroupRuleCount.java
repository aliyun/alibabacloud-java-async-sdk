// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ObserveGroupRuleCount} extends {@link TeaModel}
 *
 * <p>ObserveGroupRuleCount</p>
 */
public class ObserveGroupRuleCount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mainCount")
    private Long mainCount;

    @com.aliyun.core.annotation.NameInMap("relatedCount")
    private Long relatedCount;

    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ObserveGroupRuleCount(Builder builder) {
        this.mainCount = builder.mainCount;
        this.relatedCount = builder.relatedCount;
        this.ruleId = builder.ruleId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupRuleCount create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainCount
     */
    public Long getMainCount() {
        return this.mainCount;
    }

    /**
     * @return relatedCount
     */
    public Long getRelatedCount() {
        return this.relatedCount;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long mainCount; 
        private Long relatedCount; 
        private String ruleId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ObserveGroupRuleCount model) {
            this.mainCount = model.mainCount;
            this.relatedCount = model.relatedCount;
            this.ruleId = model.ruleId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of deduplicated primary entities.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder mainCount(Long mainCount) {
            this.mainCount = mainCount;
            return this;
        }

        /**
         * <p>The number of deduplicated associated child entities.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder relatedCount(Long relatedCount) {
            this.relatedCount = relatedCount;
            return this;
        }

        /**
         * <p>The stable ID of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-rocketmq-prod</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The total number of deduplicated entities.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ObserveGroupRuleCount build() {
            return new ObserveGroupRuleCount(this);
        } 

    } 

}
