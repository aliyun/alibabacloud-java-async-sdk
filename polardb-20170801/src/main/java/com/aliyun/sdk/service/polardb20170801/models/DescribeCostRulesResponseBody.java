// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeCostRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCostRulesResponseBody</p>
 */
public class DescribeCostRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeCostRulesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeCostRulesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of cost rules.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 30, 50, and 100. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCostRulesResponseBody build() {
            return new DescribeCostRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCostRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostRulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheCostPointsPerMillion")
        private String cacheCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("CostRuleId")
        private String costRuleId;

        @com.aliyun.core.annotation.NameInMap("EffectiveTargetType")
        private String effectiveTargetType;

        @com.aliyun.core.annotation.NameInMap("EffectiveTargetValue")
        private String effectiveTargetValue;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
        private String inputCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ModelServiceId")
        private String modelServiceId;

        @com.aliyun.core.annotation.NameInMap("OutputCostPointsPerMillion")
        private String outputCostPointsPerMillion;

        private Items(Builder builder) {
            this.cacheCostPointsPerMillion = builder.cacheCostPointsPerMillion;
            this.costRuleId = builder.costRuleId;
            this.effectiveTargetType = builder.effectiveTargetType;
            this.effectiveTargetValue = builder.effectiveTargetValue;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.gwClusterId = builder.gwClusterId;
            this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
            this.model = builder.model;
            this.modelServiceId = builder.modelServiceId;
            this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cacheCostPointsPerMillion
         */
        public String getCacheCostPointsPerMillion() {
            return this.cacheCostPointsPerMillion;
        }

        /**
         * @return costRuleId
         */
        public String getCostRuleId() {
            return this.costRuleId;
        }

        /**
         * @return effectiveTargetType
         */
        public String getEffectiveTargetType() {
            return this.effectiveTargetType;
        }

        /**
         * @return effectiveTargetValue
         */
        public String getEffectiveTargetValue() {
            return this.effectiveTargetValue;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return inputCostPointsPerMillion
         */
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelServiceId
         */
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        /**
         * @return outputCostPointsPerMillion
         */
        public String getOutputCostPointsPerMillion() {
            return this.outputCostPointsPerMillion;
        }

        public static final class Builder {
            private String cacheCostPointsPerMillion; 
            private String costRuleId; 
            private String effectiveTargetType; 
            private String effectiveTargetValue; 
            private String gmtCreated; 
            private String gmtModified; 
            private String gwClusterId; 
            private String inputCostPointsPerMillion; 
            private String model; 
            private String modelServiceId; 
            private String outputCostPointsPerMillion; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cacheCostPointsPerMillion = model.cacheCostPointsPerMillion;
                this.costRuleId = model.costRuleId;
                this.effectiveTargetType = model.effectiveTargetType;
                this.effectiveTargetValue = model.effectiveTargetValue;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.gwClusterId = model.gwClusterId;
                this.inputCostPointsPerMillion = model.inputCostPointsPerMillion;
                this.model = model.model;
                this.modelServiceId = model.modelServiceId;
                this.outputCostPointsPerMillion = model.outputCostPointsPerMillion;
            } 

            /**
             * <p>The cost points per million cache tokens. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
                this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The cost rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>924d450014e64e88ac6e8486f8e990**</p>
             */
            public Builder costRuleId(String costRuleId) {
                this.costRuleId = costRuleId;
                return this;
            }

            /**
             * <p>The effective target type.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder effectiveTargetType(String effectiveTargetType) {
                this.effectiveTargetType = effectiveTargetType;
                return this;
            }

            /**
             * <p>The effective target value.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder effectiveTargetValue(String effectiveTargetValue) {
                this.effectiveTargetValue = effectiveTargetValue;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-04T16:09:29+08:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16 16:46:20</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The gateway instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxxxxxxx</p>
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * <p>The cost points per million input tokens. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
                this.inputCostPointsPerMillion = inputCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>gpt-4</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The model service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ms-xxxxxxxxx</p>
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * <p>The cost points per million output tokens. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
                this.outputCostPointsPerMillion = outputCostPointsPerMillion;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
