// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetProvisionedProductPlanResponseBody</p>
 */
public class GetProvisionedProductPlanResponseBody extends TeaModel {
    @NameInMap("PlanDetail")
    private PlanDetail planDetail;

    @NameInMap("ProductDetail")
    private ProductDetail productDetail;

    @NameInMap("ProductVersionDetail")
    private ProductVersionDetail productVersionDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceChanges")
    private java.util.List < ResourceChanges> resourceChanges;

    private GetProvisionedProductPlanResponseBody(Builder builder) {
        this.planDetail = builder.planDetail;
        this.productDetail = builder.productDetail;
        this.productVersionDetail = builder.productVersionDetail;
        this.requestId = builder.requestId;
        this.resourceChanges = builder.resourceChanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProvisionedProductPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return planDetail
     */
    public PlanDetail getPlanDetail() {
        return this.planDetail;
    }

    /**
     * @return productDetail
     */
    public ProductDetail getProductDetail() {
        return this.productDetail;
    }

    /**
     * @return productVersionDetail
     */
    public ProductVersionDetail getProductVersionDetail() {
        return this.productVersionDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceChanges
     */
    public java.util.List < ResourceChanges> getResourceChanges() {
        return this.resourceChanges;
    }

    public static final class Builder {
        private PlanDetail planDetail; 
        private ProductDetail productDetail; 
        private ProductVersionDetail productVersionDetail; 
        private String requestId; 
        private java.util.List < ResourceChanges> resourceChanges; 

        /**
         * The details of the plan.
         */
        public Builder planDetail(PlanDetail planDetail) {
            this.planDetail = planDetail;
            return this;
        }

        /**
         * The details of the product.
         */
        public Builder productDetail(ProductDetail productDetail) {
            this.productDetail = productDetail;
            return this;
        }

        /**
         * The details of the product version.
         */
        public Builder productVersionDetail(ProductVersionDetail productVersionDetail) {
            this.productVersionDetail = productVersionDetail;
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
         * An array that consists of the resources to be changed in the plan.
         */
        public Builder resourceChanges(java.util.List < ResourceChanges> resourceChanges) {
            this.resourceChanges = resourceChanges;
            return this;
        }

        public GetProvisionedProductPlanResponseBody build() {
            return new GetProvisionedProductPlanResponseBody(this);
        } 

    } 

    public static class Operator extends TeaModel {
        @NameInMap("PrincipalId")
        private String principalId;

        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
        private String principalType;

        private Operator(Builder builder) {
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operator create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
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
            private String principalId; 
            private String principalName; 
            private String principalType; 

            /**
             * The RAM entity ID of the operator.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * The RAM entity name of the operator.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * The RAM entity type of the operator. Valid values:
             * <p>
             * 
             * *   RamUser: a RAM user
             * *   RamRole: a RAM role
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Operator build() {
                return new Operator(this);
            } 

        } 

    }
    public static class OperationRecords extends TeaModel {
        @NameInMap("ApprovalAction")
        private String approvalAction;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Operator")
        private Operator operator;

        private OperationRecords(Builder builder) {
            this.approvalAction = builder.approvalAction;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationRecords create() {
            return builder().build();
        }

        /**
         * @return approvalAction
         */
        public String getApprovalAction() {
            return this.approvalAction;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return operator
         */
        public Operator getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String approvalAction; 
            private String comment; 
            private String createTime; 
            private Operator operator; 

            /**
             * The operation that is performed by the operator on the plan. Valid values:
             * <p>
             * 
             * *   Submit: submits the plan.
             * *   Cancel: cancels the plan.
             * *   Approve: approves the plan.
             * *   reject: rejects the plan.
             */
            public Builder approvalAction(String approvalAction) {
                this.approvalAction = approvalAction;
                return this;
            }

            /**
             * The review comment of the operator.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The time when the operation was performed.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The operator who performs operations on the plan.
             */
            public Builder operator(Operator operator) {
                this.operator = operator;
                return this;
            }

            public OperationRecords build() {
                return new OperationRecords(this);
            } 

        } 

    }
    public static class TasksOperator extends TeaModel {
        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
        private String principalType;

        private TasksOperator(Builder builder) {
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksOperator create() {
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
             * The RAM entity name of the operator.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * The RAM entity type of the operator. Valid values:
             * <p>
             * 
             * *   RamUser: a RAM user
             * *   RamRole: a RAM role
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public TasksOperator build() {
                return new TasksOperator(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("Operator")
        private TasksOperator operator;

        private Tasks(Builder builder) {
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public TasksOperator getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private TasksOperator operator; 

            /**
             * The operator who performs operations on the plan.
             */
            public Builder operator(TasksOperator operator) {
                this.operator = operator;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    public static class TodoTaskActivities extends TeaModel {
        @NameInMap("ActivityName")
        private String activityName;

        @NameInMap("Tasks")
        private java.util.List < Tasks> tasks;

        private TodoTaskActivities(Builder builder) {
            this.activityName = builder.activityName;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodoTaskActivities create() {
            return builder().build();
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return tasks
         */
        public java.util.List < Tasks> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private String activityName; 
            private java.util.List < Tasks> tasks; 

            /**
             * The name of the operation that is being performed by the plan.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * An array consisting of tasks that are pending for review.
             */
            public Builder tasks(java.util.List < Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public TodoTaskActivities build() {
                return new TodoTaskActivities(this);
            } 

        } 

    }
    public static class ApprovalDetail extends TeaModel {
        @NameInMap("OperationRecords")
        private java.util.List < OperationRecords> operationRecords;

        @NameInMap("TodoTaskActivities")
        private java.util.List < TodoTaskActivities> todoTaskActivities;

        private ApprovalDetail(Builder builder) {
            this.operationRecords = builder.operationRecords;
            this.todoTaskActivities = builder.todoTaskActivities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalDetail create() {
            return builder().build();
        }

        /**
         * @return operationRecords
         */
        public java.util.List < OperationRecords> getOperationRecords() {
            return this.operationRecords;
        }

        /**
         * @return todoTaskActivities
         */
        public java.util.List < TodoTaskActivities> getTodoTaskActivities() {
            return this.todoTaskActivities;
        }

        public static final class Builder {
            private java.util.List < OperationRecords> operationRecords; 
            private java.util.List < TodoTaskActivities> todoTaskActivities; 

            /**
             * An array that consists of operations that are performed by the operator.
             */
            public Builder operationRecords(java.util.List < OperationRecords> operationRecords) {
                this.operationRecords = operationRecords;
                return this;
            }

            /**
             * An array that consists of operations that are being performed by the plan.
             */
            public Builder todoTaskActivities(java.util.List < TodoTaskActivities> todoTaskActivities) {
                this.todoTaskActivities = todoTaskActivities;
                return this;
            }

            public ApprovalDetail build() {
                return new ApprovalDetail(this);
            } 

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
             * The type of the Resource Access Management (RAM) entity of the reviewer. Valid values:
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
    public static class PlanDetail extends TeaModel {
        @NameInMap("ApprovalDetail")
        private ApprovalDetail approvalDetail;

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

        private PlanDetail(Builder builder) {
            this.approvalDetail = builder.approvalDetail;
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

        public static PlanDetail create() {
            return builder().build();
        }

        /**
         * @return approvalDetail
         */
        public ApprovalDetail getApprovalDetail() {
            return this.approvalDetail;
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
            private ApprovalDetail approvalDetail; 
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
             * The review details of the plan.
             */
            public Builder approvalDetail(ApprovalDetail approvalDetail) {
                this.approvalDetail = approvalDetail;
                return this;
            }

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
             * *   LaunchProduct: launches the product.
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
             * *   ExecuteInProgress: The plan is being run.
             * *   ExecuteSuccess: The plan is run.
             * *   ExecuteFailed: The plan fails to be run.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The message returned for the state.
             * <p>
             * 
             * > This parameter is returned only when PreviewFailed or ExecuteFailed is returned for Status.
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

            public PlanDetail build() {
                return new PlanDetail(this);
            } 

        } 

    }
    public static class ProductDetail extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ProductArn")
        private String productArn;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("ProviderName")
        private String providerName;

        private ProductDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.productArn = builder.productArn;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.providerName = builder.providerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductDetail create() {
            return builder().build();
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
         * @return productArn
         */
        public String getProductArn() {
            return this.productArn;
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
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String productArn; 
            private String productId; 
            private String productName; 
            private String productType; 
            private String providerName; 

            /**
             * The creation time.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the product.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the product.
             */
            public Builder productArn(String productArn) {
                this.productArn = productArn;
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
             * The type of the product.
             * <p>
             * 
             * The value is fixed as Ros, which indicates ROS.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * The provider of the product.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            public ProductDetail build() {
                return new ProductDetail(this);
            } 

        } 

    }
    public static class ProductVersionDetail extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Guidance")
        private String guidance;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductVersionId")
        private String productVersionId;

        @NameInMap("ProductVersionName")
        private String productVersionName;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("TemplateUrl")
        private String templateUrl;

        private ProductVersionDetail(Builder builder) {
            this.active = builder.active;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.guidance = builder.guidance;
            this.productId = builder.productId;
            this.productVersionId = builder.productVersionId;
            this.productVersionName = builder.productVersionName;
            this.templateType = builder.templateType;
            this.templateUrl = builder.templateUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductVersionDetail create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
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
         * @return guidance
         */
        public String getGuidance() {
            return this.guidance;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
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
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return templateUrl
         */
        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public static final class Builder {
            private Boolean active; 
            private String createTime; 
            private String description; 
            private String guidance; 
            private String productId; 
            private String productVersionId; 
            private String productVersionName; 
            private String templateType; 
            private String templateUrl; 

            /**
             * Indicates whether the product version is visible to end users. Valid values:
             * <p>
             * 
             * *   true (default)
             * *   false
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The time when the product version was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the product version.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The recommendation information. Valid values:
             * <p>
             * 
             * *   Default: No recommendation information is provided. This is the default value.
             * *   Recommended: the recommendation version.
             * *   Latest: the latest version.
             * *   Deprecated: the version that is about to be deprecated.
             */
            public Builder guidance(String guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * The ID of the product to which the product version belongs.
             */
            public Builder productId(String productId) {
                this.productId = productId;
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
             * The name for the version of the product.
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * The type of the template.
             * <p>
             * 
             * The value is fixed as RosTerraformTemplate, which indicates that the Terraform template is supported by ROS.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * The URL of the template.
             */
            public Builder templateUrl(String templateUrl) {
                this.templateUrl = templateUrl;
                return this;
            }

            public ProductVersionDetail build() {
                return new ProductVersionDetail(this);
            } 

        } 

    }
    public static class ResourceChanges extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @NameInMap("Replacement")
        private String replacement;

        @NameInMap("ResourceType")
        private String resourceType;

        private ResourceChanges(Builder builder) {
            this.action = builder.action;
            this.logicalResourceId = builder.logicalResourceId;
            this.physicalResourceId = builder.physicalResourceId;
            this.replacement = builder.replacement;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceChanges create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return physicalResourceId
         */
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String action; 
            private String logicalResourceId; 
            private String physicalResourceId; 
            private String replacement; 
            private String resourceType; 

            /**
             * The action that is performed on the resource. Valid values:
             * <p>
             * 
             * *   Add
             * *   Modify
             * *   Remove
             * *   None
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The logical ID of the resource.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * The physical ID of the resource.
             * <p>
             * 
             * > This parameter is returned only when Action is set to Modify or Remove.
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * Indicates whether a replacement update is performed on the template. Valid values:
             * <p>
             * 
             * *   True: A replacement update is performed on the template.
             * *   False: A change is made on the template.
             * *   Conditional: A replacement update may be performed on the template. You can check whether a replacement update is performed when the template is in use.
             * 
             * > This parameter is returned only when Action is set to Modify.
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceChanges build() {
                return new ResourceChanges(this);
            } 

        } 

    }
}
