// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListProvisionedProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvisionedProductsResponseBody</p>
 */
public class ListProvisionedProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ProvisionedProductDetails")
    private java.util.List<ProvisionedProductDetails> provisionedProductDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProvisionedProductsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.provisionedProductDetails = builder.provisionedProductDetails;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionedProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return provisionedProductDetails
     */
    public java.util.List<ProvisionedProductDetails> getProvisionedProductDetails() {
        return this.provisionedProductDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<ProvisionedProductDetails> provisionedProductDetails; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProvisionedProductsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.provisionedProductDetails = model.provisionedProductDetails;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product instances.</p>
         */
        public Builder provisionedProductDetails(java.util.List<ProvisionedProductDetails> provisionedProductDetails) {
            this.provisionedProductDetails = provisionedProductDetails;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProvisionedProductsResponseBody build() {
            return new ListProvisionedProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProvisionedProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductsResponseBody</p>
     */
    public static class ProvisionedProductDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastProvisioningTaskId")
        private String lastProvisioningTaskId;

        @com.aliyun.core.annotation.NameInMap("LastSuccessfulProvisioningTaskId")
        private String lastSuccessfulProvisioningTaskId;

        @com.aliyun.core.annotation.NameInMap("LastTaskId")
        private String lastTaskId;

        @com.aliyun.core.annotation.NameInMap("OwnerPrincipalId")
        private String ownerPrincipalId;

        @com.aliyun.core.annotation.NameInMap("OwnerPrincipalType")
        private String ownerPrincipalType;

        @com.aliyun.core.annotation.NameInMap("PortfolioId")
        private String portfolioId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductVersionId")
        private String productVersionId;

        @com.aliyun.core.annotation.NameInMap("ProductVersionName")
        private String productVersionName;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductArn")
        private String provisionedProductArn;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
        private String provisionedProductId;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductName")
        private String provisionedProductName;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductType")
        private String provisionedProductType;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("StackRegionId")
        private String stackRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        private ProvisionedProductDetails(Builder builder) {
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

        public static ProvisionedProductDetails create() {
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

            private Builder() {
            } 

            private Builder(ProvisionedProductDetails model) {
                this.createTime = model.createTime;
                this.lastProvisioningTaskId = model.lastProvisioningTaskId;
                this.lastSuccessfulProvisioningTaskId = model.lastSuccessfulProvisioningTaskId;
                this.lastTaskId = model.lastTaskId;
                this.ownerPrincipalId = model.ownerPrincipalId;
                this.ownerPrincipalType = model.ownerPrincipalType;
                this.portfolioId = model.portfolioId;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productVersionId = model.productVersionId;
                this.productVersionName = model.productVersionName;
                this.provisionedProductArn = model.provisionedProductArn;
                this.provisionedProductId = model.provisionedProductId;
                this.provisionedProductName = model.provisionedProductName;
                this.provisionedProductType = model.provisionedProductType;
                this.stackId = model.stackId;
                this.stackRegionId = model.stackRegionId;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
            } 

            /**
             * <p>The time when the product instance was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-23T09:46:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the task that was last run on the product instance.</p>
             * <p>The task can be one of the following types:</p>
             * <ul>
             * <li>LaunchProduct: a task that launches the product.</li>
             * <li>UpdateProvisionedProduct: a task that updates the information about the product instance.</li>
             * <li>TerminateProvisionedProduct: a task that terminates the product instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>task-bp1dmg242c****</p>
             */
            public Builder lastProvisioningTaskId(String lastProvisioningTaskId) {
                this.lastProvisioningTaskId = lastProvisioningTaskId;
                return this;
            }

            /**
             * <p>The ID of the last task that was successfully run on the product instance.</p>
             * <p>The task can be one of the following types:</p>
             * <ul>
             * <li>LaunchProduct: a task that launches the product.</li>
             * <li>UpdateProvisionedProduct: a task that updates the information about the product instance.</li>
             * <li>TerminateProvisionedProduct: a task that terminates the product instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>task-bp1dmg242c****</p>
             */
            public Builder lastSuccessfulProvisioningTaskId(String lastSuccessfulProvisioningTaskId) {
                this.lastSuccessfulProvisioningTaskId = lastSuccessfulProvisioningTaskId;
                return this;
            }

            /**
             * <p>The ID of the task that was last run.</p>
             * 
             * <strong>example:</strong>
             * <p>task-bp1dmg242c****</p>
             */
            public Builder lastTaskId(String lastTaskId) {
                this.lastTaskId = lastTaskId;
                return this;
            }

            /**
             * <p>The ID of the RAM entity to which the product instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>24477111603637****</p>
             */
            public Builder ownerPrincipalId(String ownerPrincipalId) {
                this.ownerPrincipalId = ownerPrincipalId;
                return this;
            }

            /**
             * <p>The type of the Resource Access Management (RAM) entity to which the product instance belongs. Valid values:</p>
             * <ul>
             * <li>RamUser: a RAM user</li>
             * <li>RamRole: a RAM role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
             */
            public Builder ownerPrincipalType(String ownerPrincipalType) {
                this.ownerPrincipalType = ownerPrincipalType;
                return this;
            }

            /**
             * <p>The ID of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp1yt7582g****</p>
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * <p>The ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-bp18r7q127****</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-Create an ECS instance</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The ID of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>pv-bp15e79d26****</p>
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * <p>The name of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:servicecatalog:cn-hangzhou:146611588617****:provisionedproduct/pp-bp1ddg1n2a****</p>
             */
            public Builder provisionedProductArn(String provisionedProductArn) {
                this.provisionedProductArn = provisionedProductArn;
                return this;
            }

            /**
             * <p>The ID of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pp-bp1ddg1n2a****</p>
             */
            public Builder provisionedProductId(String provisionedProductId) {
                this.provisionedProductId = provisionedProductId;
                return this;
            }

            /**
             * <p>The name of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-ECS instance</p>
             */
            public Builder provisionedProductName(String provisionedProductName) {
                this.provisionedProductName = provisionedProductName;
                return this;
            }

            /**
             * <p>The type of the product instance.</p>
             * <p>The value is fixed as RosStack, which indicates an ROS stack.</p>
             * 
             * <strong>example:</strong>
             * <p>RosStack</p>
             */
            public Builder provisionedProductType(String provisionedProductType) {
                this.provisionedProductType = provisionedProductType;
                return this;
            }

            /**
             * <p>The ID of the Resource Orchestration Service (ROS) stack.</p>
             * 
             * <strong>example:</strong>
             * <p>137e31df-3754-40b4-be2f-c793ad84****</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The ID of the region to which the ROS stack belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder stackRegionId(String stackRegionId) {
                this.stackRegionId = stackRegionId;
                return this;
            }

            /**
             * <p>The state of the product instance. Valid values:</p>
             * <ul>
             * <li>Available: The product instance was available.</li>
             * <li>UnderChange: The information about the product instance was being changed.</li>
             * <li>Error: An exception occurred on the product instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The message that is returned for the status of the product instance.</p>
             * <blockquote>
             * <p>This parameter is returned only when Error is returned for the Status parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Resource CREATE failed: terraform stack sc-146611588617****-pp-bp1ddg1n2a**** failure...</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public ProvisionedProductDetails build() {
                return new ProvisionedProductDetails(this);
            } 

        } 

    }
}
