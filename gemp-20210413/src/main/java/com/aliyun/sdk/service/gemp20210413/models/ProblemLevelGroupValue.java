// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProblemLevelGroupValue} extends {@link TeaModel}
 *
 * <p>ProblemLevelGroupValue</p>
 */
public class ProblemLevelGroupValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("childRuleRelation")
    private Integer childRuleRelation;

    @com.aliyun.core.annotation.NameInMap("matchCount")
    private Long matchCount;

    @com.aliyun.core.annotation.NameInMap("timeWindow")
    private Long timeWindow;

    @com.aliyun.core.annotation.NameInMap("timeWindowUnit")
    private String timeWindowUnit;

    @com.aliyun.core.annotation.NameInMap("enableUpgrade")
    private Boolean enableUpgrade;

    @com.aliyun.core.annotation.NameInMap("upgradeTimeWindow")
    private Long upgradeTimeWindow;

    @com.aliyun.core.annotation.NameInMap("upgradeTimeWindowUnit")
    private String upgradeTimeWindowUnit;

    private ProblemLevelGroupValue(Builder builder) {
        this.childRuleRelation = builder.childRuleRelation;
        this.matchCount = builder.matchCount;
        this.timeWindow = builder.timeWindow;
        this.timeWindowUnit = builder.timeWindowUnit;
        this.enableUpgrade = builder.enableUpgrade;
        this.upgradeTimeWindow = builder.upgradeTimeWindow;
        this.upgradeTimeWindowUnit = builder.upgradeTimeWindowUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProblemLevelGroupValue create() {
        return builder().build();
    }

    /**
     * @return childRuleRelation
     */
    public Integer getChildRuleRelation() {
        return this.childRuleRelation;
    }

    /**
     * @return matchCount
     */
    public Long getMatchCount() {
        return this.matchCount;
    }

    /**
     * @return timeWindow
     */
    public Long getTimeWindow() {
        return this.timeWindow;
    }

    /**
     * @return timeWindowUnit
     */
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    /**
     * @return enableUpgrade
     */
    public Boolean getEnableUpgrade() {
        return this.enableUpgrade;
    }

    /**
     * @return upgradeTimeWindow
     */
    public Long getUpgradeTimeWindow() {
        return this.upgradeTimeWindow;
    }

    /**
     * @return upgradeTimeWindowUnit
     */
    public String getUpgradeTimeWindowUnit() {
        return this.upgradeTimeWindowUnit;
    }

    public static final class Builder {
        private Integer childRuleRelation; 
        private Long matchCount; 
        private Long timeWindow; 
        private String timeWindowUnit; 
        private Boolean enableUpgrade; 
        private Long upgradeTimeWindow; 
        private String upgradeTimeWindowUnit; 

        /**
         * childRuleRelation.
         */
        public Builder childRuleRelation(Integer childRuleRelation) {
            this.childRuleRelation = childRuleRelation;
            return this;
        }

        /**
         * matchCount.
         */
        public Builder matchCount(Long matchCount) {
            this.matchCount = matchCount;
            return this;
        }

        /**
         * timeWindow.
         */
        public Builder timeWindow(Long timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }

        /**
         * timeWindowUnit.
         */
        public Builder timeWindowUnit(String timeWindowUnit) {
            this.timeWindowUnit = timeWindowUnit;
            return this;
        }

        /**
         * enableUpgrade.
         */
        public Builder enableUpgrade(Boolean enableUpgrade) {
            this.enableUpgrade = enableUpgrade;
            return this;
        }

        /**
         * upgradeTimeWindow.
         */
        public Builder upgradeTimeWindow(Long upgradeTimeWindow) {
            this.upgradeTimeWindow = upgradeTimeWindow;
            return this;
        }

        /**
         * upgradeTimeWindowUnit.
         */
        public Builder upgradeTimeWindowUnit(String upgradeTimeWindowUnit) {
            this.upgradeTimeWindowUnit = upgradeTimeWindowUnit;
            return this;
        }

        public ProblemLevelGroupValue build() {
            return new ProblemLevelGroupValue(this);
        } 

    } 

}
