// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineStrategyResponseBody</p>
 */
public class DescribeImageBaselineStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Strategy")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the baseline check policy.
         */
        public Builder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public DescribeImageBaselineStrategyResponseBody build() {
            return new DescribeImageBaselineStrategyResponseBody(this);
        } 

    } 

    public static class BaselineItemList extends TeaModel {
        @NameInMap("ClassKey")
        private String classKey;

        @NameInMap("ItemKey")
        private String itemKey;

        @NameInMap("NameKey")
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
             * The key of the baseline type.
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * The key of the baseline check item.
             */
            public Builder itemKey(String itemKey) {
                this.itemKey = itemKey;
                return this;
            }

            /**
             * The key of the name for the baseline.
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
    public static class Strategy extends TeaModel {
        @NameInMap("BaselineItem")
        private String baselineItem;

        @NameInMap("BaselineItemList")
        private java.util.List < BaselineItemList> baselineItemList;

        @NameInMap("SelectedItemCount")
        private Integer selectedItemCount;

        @NameInMap("StrategyId")
        private Long strategyId;

        @NameInMap("StrategyName")
        private String strategyName;

        @NameInMap("TotalItemCount")
        private Integer totalItemCount;

        @NameInMap("Type")
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
             * BaselineItem.
             */
            public Builder baselineItem(String baselineItem) {
                this.baselineItem = baselineItem;
                return this;
            }

            /**
             * An array that contains the baselines.
             */
            public Builder baselineItemList(java.util.List < BaselineItemList> baselineItemList) {
                this.baselineItemList = baselineItemList;
                return this;
            }

            /**
             * The number of selected baseline check items.
             */
            public Builder selectedItemCount(Integer selectedItemCount) {
                this.selectedItemCount = selectedItemCount;
                return this;
            }

            /**
             * The ID of the baseline check policy.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * The name of the baseline check policy.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * The total number of baseline check items.
             */
            public Builder totalItemCount(Integer totalItemCount) {
                this.totalItemCount = totalItemCount;
                return this;
            }

            /**
             * The type of the baseline check policy. Valid values:
             * <p>
             * 
             * *   **default**: the default policy
             * *   **full**: a policy that uses all baselines
             * *   **normal**: a policy that uses general baselines
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
