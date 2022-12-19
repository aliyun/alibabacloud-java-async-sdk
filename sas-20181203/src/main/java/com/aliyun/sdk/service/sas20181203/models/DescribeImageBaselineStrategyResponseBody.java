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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Strategy.
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
             * ClassKey.
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * ItemKey.
             */
            public Builder itemKey(String itemKey) {
                this.itemKey = itemKey;
                return this;
            }

            /**
             * NameKey.
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
            private java.util.List < BaselineItemList> baselineItemList; 
            private Integer selectedItemCount; 
            private Long strategyId; 
            private String strategyName; 
            private Integer totalItemCount; 
            private String type; 

            /**
             * BaselineItemList.
             */
            public Builder baselineItemList(java.util.List < BaselineItemList> baselineItemList) {
                this.baselineItemList = baselineItemList;
                return this;
            }

            /**
             * SelectedItemCount.
             */
            public Builder selectedItemCount(Integer selectedItemCount) {
                this.selectedItemCount = selectedItemCount;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * TotalItemCount.
             */
            public Builder totalItemCount(Integer totalItemCount) {
                this.totalItemCount = totalItemCount;
                return this;
            }

            /**
             * Type.
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
