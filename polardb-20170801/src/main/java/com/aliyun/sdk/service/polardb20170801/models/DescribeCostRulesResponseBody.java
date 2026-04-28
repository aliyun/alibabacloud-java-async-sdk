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
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * PageSize.
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
         * TotalRecordCount.
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
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.gwClusterId = model.gwClusterId;
                this.inputCostPointsPerMillion = model.inputCostPointsPerMillion;
                this.model = model.model;
                this.modelServiceId = model.modelServiceId;
                this.outputCostPointsPerMillion = model.outputCostPointsPerMillion;
            } 

            /**
             * CacheCostPointsPerMillion.
             */
            public Builder cacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
                this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
                return this;
            }

            /**
             * CostRuleId.
             */
            public Builder costRuleId(String costRuleId) {
                this.costRuleId = costRuleId;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GwClusterId.
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * InputCostPointsPerMillion.
             */
            public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
                this.inputCostPointsPerMillion = inputCostPointsPerMillion;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * ModelServiceId.
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * OutputCostPointsPerMillion.
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
