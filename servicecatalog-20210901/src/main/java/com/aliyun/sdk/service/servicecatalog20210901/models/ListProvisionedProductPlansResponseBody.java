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
 * {@link ListProvisionedProductPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvisionedProductPlansResponseBody</p>
 */
public class ListProvisionedProductPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PlanDetails")
    private java.util.List<PlanDetails> planDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return planDetails
     */
    public java.util.List<PlanDetails> getPlanDetails() {
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
        private java.util.List<PlanDetails> planDetails; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProvisionedProductPlansResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.planDetails = model.planDetails;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
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
         * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>An array that consists of plans.</p>
         */
        public Builder planDetails(java.util.List<PlanDetails> planDetails) {
            this.planDetails = planDetails;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProvisionedProductPlansResponseBody build() {
            return new ListProvisionedProductPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProvisionedProductPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductPlansResponseBody</p>
     */
    public static class AssignedApprovers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
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

            private Builder() {
            } 

            private Builder(AssignedApprovers model) {
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * <p>The RAM entity name of the reviewer.</p>
             * 
             * <strong>example:</strong>
             * <p>endUser</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the RAM entity of the reviewer. Valid values:</p>
             * <ul>
             * <li>RamUser: a RAM user</li>
             * <li>RamRole: a RAM role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
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
    /**
     * 
     * {@link ListProvisionedProductPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductPlansResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
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

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterKey = model.parameterKey;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The name of the parameter in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>role_name</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-8</p>
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
    /**
     * 
     * {@link ListProvisionedProductPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductPlansResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the custom tag.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the custom tag.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
    /**
     * 
     * {@link ListProvisionedProductPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductPlansResponseBody</p>
     */
    public static class PlanDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedApprovers")
        private java.util.List<AssignedApprovers> assignedApprovers;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("OwnerPrincipalId")
        private String ownerPrincipalId;

        @com.aliyun.core.annotation.NameInMap("OwnerPrincipalName")
        private String ownerPrincipalName;

        @com.aliyun.core.annotation.NameInMap("OwnerPrincipalType")
        private String ownerPrincipalType;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("PortfolioId")
        private String portfolioId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductVersionId")
        private String productVersionId;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
        private String provisionedProductId;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductName")
        private String provisionedProductName;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("StackRegionId")
        private String stackRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
        public java.util.List<AssignedApprovers> getAssignedApprovers() {
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
        public java.util.List<Parameters> getParameters() {
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<AssignedApprovers> assignedApprovers; 
            private String createTime; 
            private String description; 
            private String operationType; 
            private String ownerPrincipalId; 
            private String ownerPrincipalName; 
            private String ownerPrincipalType; 
            private java.util.List<Parameters> parameters; 
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
            private java.util.List<Tags> tags; 
            private String uid; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(PlanDetails model) {
                this.assignedApprovers = model.assignedApprovers;
                this.createTime = model.createTime;
                this.description = model.description;
                this.operationType = model.operationType;
                this.ownerPrincipalId = model.ownerPrincipalId;
                this.ownerPrincipalName = model.ownerPrincipalName;
                this.ownerPrincipalType = model.ownerPrincipalType;
                this.parameters = model.parameters;
                this.planId = model.planId;
                this.planName = model.planName;
                this.planType = model.planType;
                this.portfolioId = model.portfolioId;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productVersionId = model.productVersionId;
                this.provisionedProductId = model.provisionedProductId;
                this.provisionedProductName = model.provisionedProductName;
                this.stackId = model.stackId;
                this.stackRegionId = model.stackRegionId;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
                this.tags = model.tags;
                this.uid = model.uid;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>An array that consists of reviewers.</p>
             */
            public Builder assignedApprovers(java.util.List<AssignedApprovers> assignedApprovers) {
                this.assignedApprovers = assignedApprovers;
                return this;
            }

            /**
             * <p>The time when the plan was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-13T02:01:22Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>For development team.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The purpose of the plan. Valid values:</p>
             * <ul>
             * <li>LaunchProduct: launches the product. This is the default value.</li>
             * <li>UpdateProvisionedProduct: updates the information about the product instance.</li>
             * <li>TerminateProvisionedProduct: terminates the product instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LaunchProduct</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The ID of the RAM entity to which the plan belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>24477111603637****</p>
             */
            public Builder ownerPrincipalId(String ownerPrincipalId) {
                this.ownerPrincipalId = ownerPrincipalId;
                return this;
            }

            /**
             * <p>The name of the RAM entity to which the plan belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>enduser</p>
             */
            public Builder ownerPrincipalName(String ownerPrincipalName) {
                this.ownerPrincipalName = ownerPrincipalName;
                return this;
            }

            /**
             * <p>The type of the RAM entity to which the plan belongs. Valid values:</p>
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
             * <p>An array that consists of the parameters in the template.</p>
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The ID of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-bp18mmdh2u****</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The name of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-Create an ECS instance-637****</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The type of the plan.</p>
             * <p>The value is fixed as Ros, which indicates Resource Orchestration Service (ROS).</p>
             * 
             * <strong>example:</strong>
             * <p>Ros</p>
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * <p>The ID of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp1438kf2j****</p>
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * <p>The ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-bp1rtrnh2c****</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>Create an ECS instance</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The ID of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>pv-bp19udk22v****</p>
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * <p>The ID of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pp-bp1c35162d****</p>
             */
            public Builder provisionedProductId(String provisionedProductId) {
                this.provisionedProductId = provisionedProductId;
                return this;
            }

            /**
             * <p>The name of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rds-MYSQL-875****</p>
             */
            public Builder provisionedProductName(String provisionedProductName) {
                this.provisionedProductName = provisionedProductName;
                return this;
            }

            /**
             * <p>The ID of the ROS stack.</p>
             * 
             * <strong>example:</strong>
             * <p>2599090a-309e-4306-b989-17ba66a9****</p>
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
             * <p>The state of the plan. Valid values:</p>
             * <ul>
             * <li>PreviewInProgress: The plan is being prechecked.</li>
             * <li>PreviewSuccess: The precheck is successful.</li>
             * <li>PreviewFailed: The precheck fails.</li>
             * <li>ApplicationInProgress: The plan is being reviewed.</li>
             * <li>ApplicationApproved: The plan is approved.</li>
             * <li>ApplicationRejected: The approval is rejected.</li>
             * <li>ExecuteInProgress: The plan is being run.</li>
             * <li>ExecuteSuccess: The plan is run.</li>
             * <li>ExecuteFailed: The plan fails to be run.</li>
             * <li>Canceled: The plan is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PreviewSuccess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The message returned for the state.</p>
             * <blockquote>
             * <p>This parameter is returned only when PreviewFailed or ExecuteFailed is returned for the Status parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Create stack failed: Resource CREATE failed: terraform stack sc-146611588617****-pp-bp1ddg1n2a**** failure...</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>An array that consists of custom tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the plan belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>146611588617****</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The last time when the task was modified.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-18T06:02:35.075Z</p>
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
