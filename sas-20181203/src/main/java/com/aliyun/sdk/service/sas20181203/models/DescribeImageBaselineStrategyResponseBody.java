// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageBaselineStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineStrategyResponseBody</p>
 */
public class DescribeImageBaselineStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategy")
    private Strategy strategy;

    private DescribeImageBaselineStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategy
     */
    public Strategy getStrategy() {
        return this.strategy;
    }

    public static final class Builder {
        private String requestId; 
        private Strategy strategy; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9F85AC10-A1FE-54D7-935A-F28D5256****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the baseline check policy.</p>
         */
        public Builder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public DescribeImageBaselineStrategyResponseBody build() {
            return new DescribeImageBaselineStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageBaselineStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBaselineStrategyResponseBody</p>
     */
    public static class BaselineItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassKey")
        private String classKey;

        @com.aliyun.core.annotation.NameInMap("ItemKey")
        private String itemKey;

        @com.aliyun.core.annotation.NameInMap("NameKey")
        private String nameKey;

        private BaselineItemList(Builder builder) {
            this.classKey = builder.classKey;
            this.itemKey = builder.itemKey;
            this.nameKey = builder.nameKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItemList create() {
            return builder().build();
        }

        /**
         * @return classKey
         */
        public String getClassKey() {
            return this.classKey;
        }

        /**
         * @return itemKey
         */
        public String getItemKey() {
            return this.itemKey;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        public static final class Builder {
            private String classKey; 
            private String itemKey; 
            private String nameKey; 

            /**
             * <p>The key of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>identification</p>
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * <p>The key of the baseline check item.</p>
             * 
             * <strong>example:</strong>
             * <p>duplicate_pwd_hash</p>
             */
            public Builder itemKey(String itemKey) {
                this.itemKey = itemKey;
                return this;
            }

            /**
             * <p>The key of the name for the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>identification</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            public BaselineItemList build() {
                return new BaselineItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageBaselineStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBaselineStrategyResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineItem")
        private String baselineItem;

        @com.aliyun.core.annotation.NameInMap("BaselineItemList")
        private java.util.List < BaselineItemList> baselineItemList;

        @com.aliyun.core.annotation.NameInMap("SelectedItemCount")
        private Integer selectedItemCount;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("TotalItemCount")
        private Integer totalItemCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Strategy(Builder builder) {
            this.baselineItem = builder.baselineItem;
            this.baselineItemList = builder.baselineItemList;
            this.selectedItemCount = builder.selectedItemCount;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.totalItemCount = builder.totalItemCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return baselineItem
         */
        public String getBaselineItem() {
            return this.baselineItem;
        }

        /**
         * @return baselineItemList
         */
        public java.util.List < BaselineItemList> getBaselineItemList() {
            return this.baselineItemList;
        }

        /**
         * @return selectedItemCount
         */
        public Integer getSelectedItemCount() {
            return this.selectedItemCount;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return totalItemCount
         */
        public Integer getTotalItemCount() {
            return this.totalItemCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String baselineItem; 
            private java.util.List < BaselineItemList> baselineItemList; 
            private Integer selectedItemCount; 
            private Long strategyId; 
            private String strategyName; 
            private Integer totalItemCount; 
            private String type; 

            /**
             * <p>The baseline check policy for agentless detection.</p>
             * 
             * <strong>example:</strong>
             * <p>hc_win2008_cis_rules</p>
             */
            public Builder baselineItem(String baselineItem) {
                this.baselineItem = baselineItem;
                return this;
            }

            /**
             * <p>An array that contains the baselines.</p>
             */
            public Builder baselineItemList(java.util.List < BaselineItemList> baselineItemList) {
                this.baselineItemList = baselineItemList;
                return this;
            }

            /**
             * <p>The number of selected baseline check items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder selectedItemCount(Integer selectedItemCount) {
                this.selectedItemCount = selectedItemCount;
                return this;
            }

            /**
             * <p>The ID of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>8257</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The name of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The total number of baseline check items.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalItemCount(Integer totalItemCount) {
                this.totalItemCount = totalItemCount;
                return this;
            }

            /**
             * <p>The type of the baseline check policy. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: the default policy</li>
             * <li><strong>full</strong>: a policy that uses all baselines</li>
             * <li><strong>normal</strong>: a policy that uses general baselines</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
}
