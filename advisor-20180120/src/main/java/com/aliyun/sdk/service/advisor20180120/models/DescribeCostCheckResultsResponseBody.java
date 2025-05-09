// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link DescribeCostCheckResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCostCheckResultsResponseBody</p>
 */
public class DescribeCostCheckResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCostCheckResultsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>566331F9-****-550F-B745-A730331F97A9</p>
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

    /**
     * 
     * {@link DescribeCostCheckResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostCheckResultsResponseBody</p>
     */
    public static class CheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdviceCount")
        private Integer adviceCount;

        @com.aliyun.core.annotation.NameInMap("AdviceResourceCount")
        private Integer adviceResourceCount;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("CurrentCost")
        private Float currentCost;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpectedSavingCost")
        private Float expectedSavingCost;

        @com.aliyun.core.annotation.NameInMap("OptimizedCost")
        private Float optimizedCost;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private Integer severity;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Tips")
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

            private Builder() {
            } 

            private Builder(CheckItems model) {
                this.adviceCount = model.adviceCount;
                this.adviceResourceCount = model.adviceResourceCount;
                this.category = model.category;
                this.checkId = model.checkId;
                this.checkName = model.checkName;
                this.currentCost = model.currentCost;
                this.description = model.description;
                this.expectedSavingCost = model.expectedSavingCost;
                this.optimizedCost = model.optimizedCost;
                this.product = model.product;
                this.severity = model.severity;
                this.summary = model.summary;
                this.tips = model.tips;
            } 

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
    /**
     * 
     * {@link DescribeCostCheckResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostCheckResultsResponseBody</p>
     */
    public static class ViewGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItems")
        private java.util.List<CheckItems> checkItems;

        @com.aliyun.core.annotation.NameInMap("GroupCode")
        private String groupCode;

        @com.aliyun.core.annotation.NameInMap("GroupCount")
        private Integer groupCount;

        @com.aliyun.core.annotation.NameInMap("GroupExpectedSavingCost")
        private Float groupExpectedSavingCost;

        @com.aliyun.core.annotation.NameInMap("GroupName")
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
        public java.util.List<CheckItems> getCheckItems() {
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
            private java.util.List<CheckItems> checkItems; 
            private String groupCode; 
            private Integer groupCount; 
            private Float groupExpectedSavingCost; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(ViewGroup model) {
                this.checkItems = model.checkItems;
                this.groupCode = model.groupCode;
                this.groupCount = model.groupCount;
                this.groupExpectedSavingCost = model.groupExpectedSavingCost;
                this.groupName = model.groupName;
            } 

            /**
             * CheckItems.
             */
            public Builder checkItems(java.util.List<CheckItems> checkItems) {
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
    /**
     * 
     * {@link DescribeCostCheckResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostCheckResultsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdviceResourceCount")
        private Integer adviceResourceCount;

        @com.aliyun.core.annotation.NameInMap("GroupBy")
        private String groupBy;

        @com.aliyun.core.annotation.NameInMap("NormalCount")
        private Integer normalCount;

        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Integer resourceCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("ViewGroup")
        private java.util.List<ViewGroup> viewGroup;

        @com.aliyun.core.annotation.NameInMap("WarningCount")
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
        public java.util.List<ViewGroup> getViewGroup() {
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
            private java.util.List<ViewGroup> viewGroup; 
            private Integer warningCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adviceResourceCount = model.adviceResourceCount;
                this.groupBy = model.groupBy;
                this.normalCount = model.normalCount;
                this.resourceCount = model.resourceCount;
                this.totalCount = model.totalCount;
                this.viewGroup = model.viewGroup;
                this.warningCount = model.warningCount;
            } 

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
            public Builder viewGroup(java.util.List<ViewGroup> viewGroup) {
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
