// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentJobStatusResponseBody</p>
 */
public class DescribeDeploymentJobStatusResponseBody extends TeaModel {
    @NameInMap("BuyCount")
    private Integer buyCount;

    @NameInMap("CertCount")
    private Integer certCount;

    @NameInMap("CostCount")
    private Integer costCount;

    @NameInMap("FailedCount")
    private Integer failedCount;

    @NameInMap("MatchWorkerCount")
    private Integer matchWorkerCount;

    @NameInMap("ProductWorkerCount")
    private java.util.List < ProductWorkerCount> productWorkerCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceCount")
    private Integer resourceCount;

    @NameInMap("RollbackCount")
    private Integer rollbackCount;

    @NameInMap("RollbackFailedCount")
    private Integer rollbackFailedCount;

    @NameInMap("RollbackSuccessCount")
    private Integer rollbackSuccessCount;

    @NameInMap("SuccessCount")
    private Integer successCount;

    @NameInMap("UseCount")
    private Integer useCount;

    @NameInMap("WorkerCount")
    private Integer workerCount;

    private DescribeDeploymentJobStatusResponseBody(Builder builder) {
        this.buyCount = builder.buyCount;
        this.certCount = builder.certCount;
        this.costCount = builder.costCount;
        this.failedCount = builder.failedCount;
        this.matchWorkerCount = builder.matchWorkerCount;
        this.productWorkerCount = builder.productWorkerCount;
        this.requestId = builder.requestId;
        this.resourceCount = builder.resourceCount;
        this.rollbackCount = builder.rollbackCount;
        this.rollbackFailedCount = builder.rollbackFailedCount;
        this.rollbackSuccessCount = builder.rollbackSuccessCount;
        this.successCount = builder.successCount;
        this.useCount = builder.useCount;
        this.workerCount = builder.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentJobStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return buyCount
     */
    public Integer getBuyCount() {
        return this.buyCount;
    }

    /**
     * @return certCount
     */
    public Integer getCertCount() {
        return this.certCount;
    }

    /**
     * @return costCount
     */
    public Integer getCostCount() {
        return this.costCount;
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return matchWorkerCount
     */
    public Integer getMatchWorkerCount() {
        return this.matchWorkerCount;
    }

    /**
     * @return productWorkerCount
     */
    public java.util.List < ProductWorkerCount> getProductWorkerCount() {
        return this.productWorkerCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceCount
     */
    public Integer getResourceCount() {
        return this.resourceCount;
    }

    /**
     * @return rollbackCount
     */
    public Integer getRollbackCount() {
        return this.rollbackCount;
    }

    /**
     * @return rollbackFailedCount
     */
    public Integer getRollbackFailedCount() {
        return this.rollbackFailedCount;
    }

    /**
     * @return rollbackSuccessCount
     */
    public Integer getRollbackSuccessCount() {
        return this.rollbackSuccessCount;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return useCount
     */
    public Integer getUseCount() {
        return this.useCount;
    }

    /**
     * @return workerCount
     */
    public Integer getWorkerCount() {
        return this.workerCount;
    }

    public static final class Builder {
        private Integer buyCount; 
        private Integer certCount; 
        private Integer costCount; 
        private Integer failedCount; 
        private Integer matchWorkerCount; 
        private java.util.List < ProductWorkerCount> productWorkerCount; 
        private String requestId; 
        private Integer resourceCount; 
        private Integer rollbackCount; 
        private Integer rollbackFailedCount; 
        private Integer rollbackSuccessCount; 
        private Integer successCount; 
        private Integer useCount; 
        private Integer workerCount; 

        /**
         * BuyCount.
         */
        public Builder buyCount(Integer buyCount) {
            this.buyCount = buyCount;
            return this;
        }

        /**
         * CertCount.
         */
        public Builder certCount(Integer certCount) {
            this.certCount = certCount;
            return this;
        }

        /**
         * CostCount.
         */
        public Builder costCount(Integer costCount) {
            this.costCount = costCount;
            return this;
        }

        /**
         * FailedCount.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * MatchWorkerCount.
         */
        public Builder matchWorkerCount(Integer matchWorkerCount) {
            this.matchWorkerCount = matchWorkerCount;
            return this;
        }

        /**
         * ProductWorkerCount.
         */
        public Builder productWorkerCount(java.util.List < ProductWorkerCount> productWorkerCount) {
            this.productWorkerCount = productWorkerCount;
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
         * ResourceCount.
         */
        public Builder resourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }

        /**
         * RollbackCount.
         */
        public Builder rollbackCount(Integer rollbackCount) {
            this.rollbackCount = rollbackCount;
            return this;
        }

        /**
         * RollbackFailedCount.
         */
        public Builder rollbackFailedCount(Integer rollbackFailedCount) {
            this.rollbackFailedCount = rollbackFailedCount;
            return this;
        }

        /**
         * RollbackSuccessCount.
         */
        public Builder rollbackSuccessCount(Integer rollbackSuccessCount) {
            this.rollbackSuccessCount = rollbackSuccessCount;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * UseCount.
         */
        public Builder useCount(Integer useCount) {
            this.useCount = useCount;
            return this;
        }

        /**
         * WorkerCount.
         */
        public Builder workerCount(Integer workerCount) {
            this.workerCount = workerCount;
            return this;
        }

        public DescribeDeploymentJobStatusResponseBody build() {
            return new DescribeDeploymentJobStatusResponseBody(this);
        } 

    } 

    public static class ProductWorkerCount extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("ProductName")
        private String productName;

        private ProductWorkerCount(Builder builder) {
            this.count = builder.count;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductWorkerCount create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private Integer count; 
            private String productName; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ProductWorkerCount build() {
                return new ProductWorkerCount(this);
            } 

        } 

    }
}
