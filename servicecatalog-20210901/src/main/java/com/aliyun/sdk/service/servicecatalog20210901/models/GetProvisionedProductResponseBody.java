// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProvisionedProductResponseBody} extends {@link TeaModel}
 *
 * <p>GetProvisionedProductResponseBody</p>
 */
public class GetProvisionedProductResponseBody extends TeaModel {
    @NameInMap("ProvisionedProductDetail")
    private ProvisionedProductDetail provisionedProductDetail;

    @NameInMap("RequestId")
    private String requestId;

    private GetProvisionedProductResponseBody(Builder builder) {
        this.provisionedProductDetail = builder.provisionedProductDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProvisionedProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return provisionedProductDetail
     */
    public ProvisionedProductDetail getProvisionedProductDetail() {
        return this.provisionedProductDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProvisionedProductDetail provisionedProductDetail; 
        private String requestId; 

        /**
         * The details of the product instance.
         */
        public Builder provisionedProductDetail(ProvisionedProductDetail provisionedProductDetail) {
            this.provisionedProductDetail = provisionedProductDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProvisionedProductResponseBody build() {
            return new GetProvisionedProductResponseBody(this);
        } 

    } 

    public static class ProvisionedProductDetail extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("LastProvisioningTaskId")
        private String lastProvisioningTaskId;

        @NameInMap("LastSuccessfulProvisioningTaskId")
        private String lastSuccessfulProvisioningTaskId;

        @NameInMap("LastTaskId")
        private String lastTaskId;

        @NameInMap("OwnerPrincipalId")
        private String ownerPrincipalId;

        @NameInMap("OwnerPrincipalType")
        private String ownerPrincipalType;

        @NameInMap("PortfolioId")
        private String portfolioId;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductVersionId")
        private String productVersionId;

        @NameInMap("ProductVersionName")
        private String productVersionName;

        @NameInMap("ProvisionedProductArn")
        private String provisionedProductArn;

        @NameInMap("ProvisionedProductId")
        private String provisionedProductId;

        @NameInMap("ProvisionedProductName")
        private String provisionedProductName;

        @NameInMap("ProvisionedProductType")
        private String provisionedProductType;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackRegionId")
        private String stackRegionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        private ProvisionedProductDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.lastProvisioningTaskId = builder.lastProvisioningTaskId;
            this.lastSuccessfulProvisioningTaskId = builder.lastSuccessfulProvisioningTaskId;
            this.lastTaskId = builder.lastTaskId;
            this.ownerPrincipalId = builder.ownerPrincipalId;
            this.ownerPrincipalType = builder.ownerPrincipalType;
            this.portfolioId = builder.portfolioId;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productVersionId = builder.productVersionId;
            this.productVersionName = builder.productVersionName;
            this.provisionedProductArn = builder.provisionedProductArn;
            this.provisionedProductId = builder.provisionedProductId;
            this.provisionedProductName = builder.provisionedProductName;
            this.provisionedProductType = builder.provisionedProductType;
            this.stackId = builder.stackId;
            this.stackRegionId = builder.stackRegionId;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProvisionedProductDetail create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastProvisioningTaskId
         */
        public String getLastProvisioningTaskId() {
            return this.lastProvisioningTaskId;
        }

        /**
         * @return lastSuccessfulProvisioningTaskId
         */
        public String getLastSuccessfulProvisioningTaskId() {
            return this.lastSuccessfulProvisioningTaskId;
        }

        /**
         * @return lastTaskId
         */
        public String getLastTaskId() {
            return this.lastTaskId;
        }

        /**
         * @return ownerPrincipalId
         */
        public String getOwnerPrincipalId() {
            return this.ownerPrincipalId;
        }

        /**
         * @return ownerPrincipalType
         */
        public String getOwnerPrincipalType() {
            return this.ownerPrincipalType;
        }

        /**
         * @return portfolioId
         */
        public String getPortfolioId() {
            return this.portfolioId;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productVersionId
         */
        public String getProductVersionId() {
            return this.productVersionId;
        }

        /**
         * @return productVersionName
         */
        public String getProductVersionName() {
            return this.productVersionName;
        }

        /**
         * @return provisionedProductArn
         */
        public String getProvisionedProductArn() {
            return this.provisionedProductArn;
        }

        /**
         * @return provisionedProductId
         */
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        /**
         * @return provisionedProductName
         */
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        /**
         * @return provisionedProductType
         */
        public String getProvisionedProductType() {
            return this.provisionedProductType;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackRegionId
         */
        public String getStackRegionId() {
            return this.stackRegionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public static final class Builder {
            private String createTime; 
            private String lastProvisioningTaskId; 
            private String lastSuccessfulProvisioningTaskId; 
            private String lastTaskId; 
            private String ownerPrincipalId; 
            private String ownerPrincipalType; 
            private String portfolioId; 
            private String productId; 
            private String productName; 
            private String productVersionId; 
            private String productVersionName; 
            private String provisionedProductArn; 
            private String provisionedProductId; 
            private String provisionedProductName; 
            private String provisionedProductType; 
            private String stackId; 
            private String stackRegionId; 
            private String status; 
            private String statusMessage; 

            /**
             * The time when the product instance was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the task that was last run on the product instance.
             * <p>
             * 
             * The task can be one of the following types:
             * 
             * *   LaunchProduct: a task that launches the product.
             * *   UpdateProvisionedProduct: a task that updates the information about the product instance.
             * *   TerminateProvisionedProduct: a task that terminates the product instance.
             */
            public Builder lastProvisioningTaskId(String lastProvisioningTaskId) {
                this.lastProvisioningTaskId = lastProvisioningTaskId;
                return this;
            }

            /**
             * The ID of the last task that was successfully run on the product instance.
             * <p>
             * 
             * The task can be one of the following types:
             * 
             * *   LaunchProduct: a task that launches the product.
             * *   UpdateProvisionedProduct: a task that updates the information about the product instance.
             * *   TerminateProvisionedProduct: a task that terminates the product instance.
             */
            public Builder lastSuccessfulProvisioningTaskId(String lastSuccessfulProvisioningTaskId) {
                this.lastSuccessfulProvisioningTaskId = lastSuccessfulProvisioningTaskId;
                return this;
            }

            /**
             * The ID of the task that was last run.
             */
            public Builder lastTaskId(String lastTaskId) {
                this.lastTaskId = lastTaskId;
                return this;
            }

            /**
             * The ID of the RAM entity to which the product instance belongs.
             */
            public Builder ownerPrincipalId(String ownerPrincipalId) {
                this.ownerPrincipalId = ownerPrincipalId;
                return this;
            }

            /**
             * The type of the Resource Access Management (RAM) entity to which the product instance belongs. Valid values:
             * <p>
             * 
             * *   RamUser: a RAM user
             * *   RamRole: a RAM role
             */
            public Builder ownerPrincipalType(String ownerPrincipalType) {
                this.ownerPrincipalType = ownerPrincipalType;
                return this;
            }

            /**
             * The ID of the product portfolio.
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * The ID of the product.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The name of the product.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * The ID of the product version.
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * The name of the product version.
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the product instance.
             */
            public Builder provisionedProductArn(String provisionedProductArn) {
                this.provisionedProductArn = provisionedProductArn;
                return this;
            }

            /**
             * The ID of the product instance.
             */
            public Builder provisionedProductId(String provisionedProductId) {
                this.provisionedProductId = provisionedProductId;
                return this;
            }

            /**
             * The name of the product instance.
             */
            public Builder provisionedProductName(String provisionedProductName) {
                this.provisionedProductName = provisionedProductName;
                return this;
            }

            /**
             * The type of the product instance.
             * <p>
             * 
             * The value is fixed as RosStack, which indicates an ROS stack.
             */
            public Builder provisionedProductType(String provisionedProductType) {
                this.provisionedProductType = provisionedProductType;
                return this;
            }

            /**
             * The ID of the Resource Orchestration Service (ROS) stack.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * The ID of the region to which the ROS stack belongs.
             */
            public Builder stackRegionId(String stackRegionId) {
                this.stackRegionId = stackRegionId;
                return this;
            }

            /**
             * The state of the product instance. Valid values:
             * <p>
             * 
             * *   Available: The product instance was available.
             * *   UnderChange: The information about the product instance was being changed.
             * *   Error: An exception occurred on the product instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The message that is returned for the status of the product instance.
             * <p>
             * 
             * > This parameter is returned only when Error is returned for the Status parameter.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public ProvisionedProductDetail build() {
                return new ProvisionedProductDetail(this);
            } 

        } 

    }
}
