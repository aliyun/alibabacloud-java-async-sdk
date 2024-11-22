// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDeploymentJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentJobStatusResponseBody</p>
 */
public class DescribeDeploymentJobStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuyCount")
    private Integer buyCount;

    @com.aliyun.core.annotation.NameInMap("CertCount")
    private Integer certCount;

    @com.aliyun.core.annotation.NameInMap("CostCount")
    private Integer costCount;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("MatchWorkerCount")
    private Integer matchWorkerCount;

    @com.aliyun.core.annotation.NameInMap("ProductWorkerCount")
    private java.util.List < ProductWorkerCount> productWorkerCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceCount")
    private Integer resourceCount;

    @com.aliyun.core.annotation.NameInMap("RollbackCount")
    private Integer rollbackCount;

    @com.aliyun.core.annotation.NameInMap("RollbackFailedCount")
    private Integer rollbackFailedCount;

    @com.aliyun.core.annotation.NameInMap("RollbackSuccessCount")
    private Integer rollbackSuccessCount;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("UseCount")
    private Integer useCount;

    @com.aliyun.core.annotation.NameInMap("WorkerCount")
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
         * <p>The total number of purchased resources.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder buyCount(Integer buyCount) {
            this.buyCount = buyCount;
            return this;
        }

        /**
         * <p>The number of certificates involved in the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder certCount(Integer certCount) {
            this.certCount = certCount;
            return this;
        }

        /**
         * <p>The number of resources consumed by worker tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder costCount(Integer costCount) {
            this.costCount = costCount;
            return this;
        }

        /**
         * <p>The number of failed worker tasks, excluding rollback tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The total number of worker tasks that match the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder matchWorkerCount(Integer matchWorkerCount) {
            this.matchWorkerCount = matchWorkerCount;
            return this;
        }

        /**
         * <p>The number of cloud resources to which certificates are deployed in the deployment task.</p>
         */
        public Builder productWorkerCount(java.util.List < ProductWorkerCount> productWorkerCount) {
            this.productWorkerCount = productWorkerCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>4127</p>
         */
        public Builder resourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }

        /**
         * <p>The number of worker tasks that are rolled backed.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder rollbackCount(Integer rollbackCount) {
            this.rollbackCount = rollbackCount;
            return this;
        }

        /**
         * <p>The number of worker tasks that failed to be rolled back.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder rollbackFailedCount(Integer rollbackFailedCount) {
            this.rollbackFailedCount = rollbackFailedCount;
            return this;
        }

        /**
         * <p>The number of worker tasks that are successfully rolled back.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder rollbackSuccessCount(Integer rollbackSuccessCount) {
            this.rollbackSuccessCount = rollbackSuccessCount;
            return this;
        }

        /**
         * <p>The number of successful worker tasks, excluding rollback tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>The total number of used resources.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder useCount(Integer useCount) {
            this.useCount = useCount;
            return this;
        }

        /**
         * <p>The total number of resources to which certificate are deployed in the current cloud service. The value indicates the total number of worker tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder workerCount(Integer workerCount) {
            this.workerCount = workerCount;
            return this;
        }

        public DescribeDeploymentJobStatusResponseBody build() {
            return new DescribeDeploymentJobStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeploymentJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeploymentJobStatusResponseBody</p>
     */
    public static class ProductWorkerCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("ProductName")
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
             * <p>The total number of resources of a cloud service in the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the cloud service. Valid values:</p>
             * <ul>
             * <li><strong>SLB</strong>: Classic Load Balancer (CLB). This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>LIVE</strong>: ApsaraVideo Live. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>webHosting</strong>: Cloud Web Hosting. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>VOD</strong>: ApsaraVideo VOD. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>CR</strong>: Container Registry. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>DCDN</strong>: Dynamic Content Delivery Network (DCDN).</li>
             * <li><strong>DDOS</strong>: Anti-DDoS.</li>
             * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN).</li>
             * <li><strong>ALB</strong>: Application Load Balancer (ALB).</li>
             * <li><strong>APIGateway</strong>: API Gateway.</li>
             * <li><strong>FC</strong>: Function Compute.</li>
             * <li><strong>GA</strong>: Global Accelerator (GA).</li>
             * <li><strong>MSE</strong>: Microservices Engine (MSE).</li>
             * <li><strong>NLB</strong>: Network Load Balancer (NLB).</li>
             * <li><strong>OSS</strong>: Object Storage Service (OSS).</li>
             * <li><strong>SAE</strong>: Serverless App Engine (SAE).</li>
             * <li><strong>TencentCDN</strong>: Tencent Cloud Content Delivery Network (CDN).</li>
             * <li><strong>WAF</strong>: Web Application Firewall (WAF).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NLB</p>
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
