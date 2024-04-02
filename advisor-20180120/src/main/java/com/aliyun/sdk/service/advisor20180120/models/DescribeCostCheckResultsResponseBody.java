// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCostCheckResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCostCheckResultsResponseBody</p>
 */
public class DescribeCostCheckResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeCostCheckResultsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostCheckResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCostCheckResultsResponseBody build() {
            return new DescribeCostCheckResultsResponseBody(this);
        } 

    } 

    public static class CheckItems extends TeaModel {
        @NameInMap("AdviceCount")
        private Integer adviceCount;

        @NameInMap("AdviceResourceCount")
        private Integer adviceResourceCount;

        @NameInMap("Category")
        private String category;

        @NameInMap("CheckId")
        private String checkId;

        @NameInMap("CheckName")
        private String checkName;

        @NameInMap("CurrentCost")
        private Float currentCost;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpectedSavingCost")
        private Float expectedSavingCost;

        @NameInMap("OptimizedCost")
        private Float optimizedCost;

        @NameInMap("Product")
        private String product;

        @NameInMap("Severity")
        private Integer severity;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("Tips")
        private String tips;

        private CheckItems(Builder builder) {
            this.adviceCount = builder.adviceCount;
            this.adviceResourceCount = builder.adviceResourceCount;
            this.category = builder.category;
            this.checkId = builder.checkId;
            this.checkName = builder.checkName;
            this.currentCost = builder.currentCost;
            this.description = builder.description;
            this.expectedSavingCost = builder.expectedSavingCost;
            this.optimizedCost = builder.optimizedCost;
            this.product = builder.product;
            this.severity = builder.severity;
            this.summary = builder.summary;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItems create() {
            return builder().build();
        }

        /**
         * @return adviceCount
         */
        public Integer getAdviceCount() {
            return this.adviceCount;
        }

        /**
         * @return adviceResourceCount
         */
        public Integer getAdviceResourceCount() {
            return this.adviceResourceCount;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return currentCost
         */
        public Float getCurrentCost() {
            return this.currentCost;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expectedSavingCost
         */
        public Float getExpectedSavingCost() {
            return this.expectedSavingCost;
        }

        /**
         * @return optimizedCost
         */
        public Float getOptimizedCost() {
            return this.optimizedCost;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return severity
         */
        public Integer getSeverity() {
            return this.severity;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private Integer adviceCount; 
            private Integer adviceResourceCount; 
            private String category; 
            private String checkId; 
            private String checkName; 
            private Float currentCost; 
            private String description; 
            private Float expectedSavingCost; 
            private Float optimizedCost; 
            private String product; 
            private Integer severity; 
            private String summary; 
            private String tips; 

            /**
             * AdviceCount.
             */
            public Builder adviceCount(Integer adviceCount) {
                this.adviceCount = adviceCount;
                return this;
            }

            /**
             * AdviceResourceCount.
             */
            public Builder adviceResourceCount(Integer adviceResourceCount) {
                this.adviceResourceCount = adviceResourceCount;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * CurrentCost.
             */
            public Builder currentCost(Float currentCost) {
                this.currentCost = currentCost;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExpectedSavingCost.
             */
            public Builder expectedSavingCost(Float expectedSavingCost) {
                this.expectedSavingCost = expectedSavingCost;
                return this;
            }

            /**
             * OptimizedCost.
             */
            public Builder optimizedCost(Float optimizedCost) {
                this.optimizedCost = optimizedCost;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(Integer severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public CheckItems build() {
                return new CheckItems(this);
            } 

        } 

    }
    public static class ViewGroup extends TeaModel {
        @NameInMap("CheckItems")
        private java.util.List < CheckItems> checkItems;

        @NameInMap("GroupCode")
        private String groupCode;

        @NameInMap("GroupCount")
        private Integer groupCount;

        @NameInMap("GroupExpectedSavingCost")
        private Float groupExpectedSavingCost;

        @NameInMap("GroupName")
        private String groupName;

        private ViewGroup(Builder builder) {
            this.checkItems = builder.checkItems;
            this.groupCode = builder.groupCode;
            this.groupCount = builder.groupCount;
            this.groupExpectedSavingCost = builder.groupExpectedSavingCost;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewGroup create() {
            return builder().build();
        }

        /**
         * @return checkItems
         */
        public java.util.List < CheckItems> getCheckItems() {
            return this.checkItems;
        }

        /**
         * @return groupCode
         */
        public String getGroupCode() {
            return this.groupCode;
        }

        /**
         * @return groupCount
         */
        public Integer getGroupCount() {
            return this.groupCount;
        }

        /**
         * @return groupExpectedSavingCost
         */
        public Float getGroupExpectedSavingCost() {
            return this.groupExpectedSavingCost;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private java.util.List < CheckItems> checkItems; 
            private String groupCode; 
            private Integer groupCount; 
            private Float groupExpectedSavingCost; 
            private String groupName; 

            /**
             * CheckItems.
             */
            public Builder checkItems(java.util.List < CheckItems> checkItems) {
                this.checkItems = checkItems;
                return this;
            }

            /**
             * GroupCode.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * GroupCount.
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * GroupExpectedSavingCost.
             */
            public Builder groupExpectedSavingCost(Float groupExpectedSavingCost) {
                this.groupExpectedSavingCost = groupExpectedSavingCost;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public ViewGroup build() {
                return new ViewGroup(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AdviceResourceCount")
        private Integer adviceResourceCount;

        @NameInMap("GroupBy")
        private String groupBy;

        @NameInMap("NormalCount")
        private Integer normalCount;

        @NameInMap("ResourceCount")
        private Integer resourceCount;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("ViewGroup")
        private java.util.List < ViewGroup> viewGroup;

        @NameInMap("WarningCount")
        private Integer warningCount;

        private Data(Builder builder) {
            this.adviceResourceCount = builder.adviceResourceCount;
            this.groupBy = builder.groupBy;
            this.normalCount = builder.normalCount;
            this.resourceCount = builder.resourceCount;
            this.totalCount = builder.totalCount;
            this.viewGroup = builder.viewGroup;
            this.warningCount = builder.warningCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adviceResourceCount
         */
        public Integer getAdviceResourceCount() {
            return this.adviceResourceCount;
        }

        /**
         * @return groupBy
         */
        public String getGroupBy() {
            return this.groupBy;
        }

        /**
         * @return normalCount
         */
        public Integer getNormalCount() {
            return this.normalCount;
        }

        /**
         * @return resourceCount
         */
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return viewGroup
         */
        public java.util.List < ViewGroup> getViewGroup() {
            return this.viewGroup;
        }

        /**
         * @return warningCount
         */
        public Integer getWarningCount() {
            return this.warningCount;
        }

        public static final class Builder {
            private Integer adviceResourceCount; 
            private String groupBy; 
            private Integer normalCount; 
            private Integer resourceCount; 
            private Integer totalCount; 
            private java.util.List < ViewGroup> viewGroup; 
            private Integer warningCount; 

            /**
             * AdviceResourceCount.
             */
            public Builder adviceResourceCount(Integer adviceResourceCount) {
                this.adviceResourceCount = adviceResourceCount;
                return this;
            }

            /**
             * GroupBy.
             */
            public Builder groupBy(String groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * NormalCount.
             */
            public Builder normalCount(Integer normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * ViewGroup.
             */
            public Builder viewGroup(java.util.List < ViewGroup> viewGroup) {
                this.viewGroup = viewGroup;
                return this;
            }

            /**
             * WarningCount.
             */
            public Builder warningCount(Integer warningCount) {
                this.warningCount = warningCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
