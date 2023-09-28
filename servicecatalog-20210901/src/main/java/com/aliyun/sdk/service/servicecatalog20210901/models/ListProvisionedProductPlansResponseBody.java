// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionedProductPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvisionedProductPlansResponseBody</p>
 */
public class ListProvisionedProductPlansResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PlanDetails")
    private java.util.List < PlanDetails> planDetails;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListProvisionedProductPlansResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.planDetails = builder.planDetails;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionedProductPlansResponseBody create() {
        return builder().build();
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
     * @return planDetails
     */
    public java.util.List < PlanDetails> getPlanDetails() {
        return this.planDetails;
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
        private java.util.List < PlanDetails> planDetails; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         * <p>
         * 
         * Valid values: 1 to 100. Minimum value: 1. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * An array that consists of plans.
         */
        public Builder planDetails(java.util.List < PlanDetails> planDetails) {
            this.planDetails = planDetails;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProvisionedProductPlansResponseBody build() {
            return new ListProvisionedProductPlansResponseBody(this);
        } 

    } 

    public static class AssignedApprovers extends TeaModel {
        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
        private String principalType;

        private AssignedApprovers(Builder builder) {
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignedApprovers create() {
            return builder().build();
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalName; 
            private String principalType; 

            /**
             * The RAM entity name of the reviewer.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * The type of the RAM entity of the reviewer. Valid values:
             * <p>
             * 
             * *   RamUser: a RAM user
             * *   RamRole: a RAM role
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public AssignedApprovers build() {
                return new AssignedApprovers(this);
            } 

        } 

    }
    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * The name of the parameter in the template.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter in the template.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the custom tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the custom tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class PlanDetails extends TeaModel {
        @NameInMap("AssignedApprovers")
        private java.util.List < AssignedApprovers> assignedApprovers;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("OwnerPrincipalId")
        private String ownerPrincipalId;

        @NameInMap("OwnerPrincipalName")
        private String ownerPrincipalName;

        @NameInMap("OwnerPrincipalType")
        private String ownerPrincipalType;

        @NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PlanName")
        private String planName;

        @NameInMap("PlanType")
        private String planType;

        @NameInMap("PortfolioId")
        private String portfolioId;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductVersionId")
        private String productVersionId;

        @NameInMap("ProvisionedProductId")
        private String provisionedProductId;

        @NameInMap("ProvisionedProductName")
        private String provisionedProductName;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackRegionId")
        private String stackRegionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("UpdateTime")
        private String updateTime;

        private PlanDetails(Builder builder) {
            this.assignedApprovers = builder.assignedApprovers;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.operationType = builder.operationType;
            this.ownerPrincipalId = builder.ownerPrincipalId;
            this.ownerPrincipalName = builder.ownerPrincipalName;
            this.ownerPrincipalType = builder.ownerPrincipalType;
            this.parameters = builder.parameters;
            this.planId = builder.planId;
            this.planName = builder.planName;
            this.planType = builder.planType;
            this.portfolioId = builder.portfolioId;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productVersionId = builder.productVersionId;
            this.provisionedProductId = builder.provisionedProductId;
            this.provisionedProductName = builder.provisionedProductName;
            this.stackId = builder.stackId;
            this.stackRegionId = builder.stackRegionId;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.tags = builder.tags;
            this.uid = builder.uid;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanDetails create() {
            return builder().build();
        }

        /**
         * @return assignedApprovers
         */
        public java.util.List < AssignedApprovers> getAssignedApprovers() {
            return this.assignedApprovers;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return ownerPrincipalId
         */
        public String getOwnerPrincipalId() {
            return this.ownerPrincipalId;
        }

        /**
         * @return ownerPrincipalName
         */
        public String getOwnerPrincipalName() {
            return this.ownerPrincipalName;
        }

        /**
         * @return ownerPrincipalType
         */
        public String getOwnerPrincipalType() {
            return this.ownerPrincipalType;
        }

        /**
         * @return parameters
         */
        public java.util.List < Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
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

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < AssignedApprovers> assignedApprovers; 
            private String createTime; 
            private String description; 
            private String operationType; 
            private String ownerPrincipalId; 
            private String ownerPrincipalName; 
            private String ownerPrincipalType; 
            private java.util.List < Parameters> parameters; 
            private String planId; 
            private String planName; 
            private String planType; 
            private String portfolioId; 
            private String productId; 
            private String productName; 
            private String productVersionId; 
            private String provisionedProductId; 
            private String provisionedProductName; 
            private String stackId; 
            private String stackRegionId; 
            private String status; 
            private String statusMessage; 
            private java.util.List < Tags> tags; 
            private String uid; 
            private String updateTime; 

            /**
             * An array that consists of reviewers.
             */
            public Builder assignedApprovers(java.util.List < AssignedApprovers> assignedApprovers) {
                this.assignedApprovers = assignedApprovers;
                return this;
            }

            /**
             * The time when the plan was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the plan.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The purpose of the plan. Valid values:
             * <p>
             * 
             * *   LaunchProduct: launches the product. This is the default value.
             * *   UpdateProvisionedProduct: updates the information about the product instance.
             * *   TerminateProvisionedProduct: terminates the product instance.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * The ID of the RAM entity to which the plan belongs.
             */
            public Builder ownerPrincipalId(String ownerPrincipalId) {
                this.ownerPrincipalId = ownerPrincipalId;
                return this;
            }

            /**
             * The name of the RAM entity to which the plan belongs.
             */
            public Builder ownerPrincipalName(String ownerPrincipalName) {
                this.ownerPrincipalName = ownerPrincipalName;
                return this;
            }

            /**
             * The type of the RAM entity to which the plan belongs. Valid values:
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
             * An array that consists of the parameters in the template.
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The ID of the plan.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * The name of the plan.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * The type of the plan.
             * <p>
             * 
             * The value is fixed as Ros, which indicates Resource Orchestration Service (ROS).
             */
            public Builder planType(String planType) {
                this.planType = planType;
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
             * The ID of the ROS stack.
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
             * The state of the plan. Valid values:
             * <p>
             * 
             * *   PreviewInProgress: The plan is being prechecked.
             * *   PreviewSuccess: The precheck is successful.
             * *   PreviewFailed: The precheck fails.
             * *   ApplicationInProgress: The plan is being reviewed.
             * *   ApplicationApproved: The plan is approved.
             * *   ApplicationRejected: The approval is rejected.
             * *   ExecuteInProgress: The plan is being run.
             * *   ExecuteSuccess: The plan is run.
             * *   ExecuteFailed: The plan fails to be run.
             * *   Canceled: The plan is canceled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The message returned for the state.
             * <p>
             * 
             * > This parameter is returned only when PreviewFailed or ExecuteFailed is returned for the Status parameter.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * An array that consists of custom tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the plan belongs.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * The last time when the task was modified.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PlanDetails build() {
                return new PlanDetails(this);
            } 

        } 

    }
}
