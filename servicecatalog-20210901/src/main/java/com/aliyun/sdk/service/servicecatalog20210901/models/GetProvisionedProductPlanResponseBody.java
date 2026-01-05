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
 * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetProvisionedProductPlanResponseBody</p>
 */
public class GetProvisionedProductPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlanDetail")
    private PlanDetail planDetail;

    @com.aliyun.core.annotation.NameInMap("ProductDetail")
    private ProductDetail productDetail;

    @com.aliyun.core.annotation.NameInMap("ProductVersionDetail")
    private ProductVersionDetail productVersionDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceChanges")
    private java.util.List<ResourceChanges> resourceChanges;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ResourceChanges> getResourceChanges() {
        return this.resourceChanges;
    }

    public static final class Builder {
        private PlanDetail planDetail; 
        private ProductDetail productDetail; 
        private ProductVersionDetail productVersionDetail; 
        private String requestId; 
        private java.util.List<ResourceChanges> resourceChanges; 

        private Builder() {
        } 

        private Builder(GetProvisionedProductPlanResponseBody model) {
            this.planDetail = model.planDetail;
            this.productDetail = model.productDetail;
            this.productVersionDetail = model.productVersionDetail;
            this.requestId = model.requestId;
            this.resourceChanges = model.resourceChanges;
        } 

        /**
         * <p>The details of the plan.</p>
         */
        public Builder planDetail(PlanDetail planDetail) {
            this.planDetail = planDetail;
            return this;
        }

        /**
         * <p>The details of the product.</p>
         */
        public Builder productDetail(ProductDetail productDetail) {
            this.productDetail = productDetail;
            return this;
        }

        /**
         * <p>The details of the product version.</p>
         */
        public Builder productVersionDetail(ProductVersionDetail productVersionDetail) {
            this.productVersionDetail = productVersionDetail;
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
         * <p>An array that consists of the resources to be changed in the plan.</p>
         */
        public Builder resourceChanges(java.util.List<ResourceChanges> resourceChanges) {
            this.resourceChanges = resourceChanges;
            return this;
        }

        public GetProvisionedProductPlanResponseBody build() {
            return new GetProvisionedProductPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class Operator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
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

            private Builder() {
            } 

            private Builder(Operator model) {
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * <p>The ID of the RAM entity.</p>
             * 
             * <strong>example:</strong>
             * <p>277401963826235***</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The name RAM entity that servers as the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>approver</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the RAM entity. Valid values:</p>
             * <ul>
             * <li>RamUser: a RAM user.</li>
             * <li>RamRole: a RAM role.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
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
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class OperationRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalAction")
        private String approvalAction;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Operator")
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

            private Builder() {
            } 

            private Builder(OperationRecords model) {
                this.approvalAction = model.approvalAction;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.operator = model.operator;
            } 

            /**
             * <p>The operation that is performed by the operator on the plan. Valid values:</p>
             * <ul>
             * <li>Submit: submits the plan.</li>
             * <li>Cancel: cancels the plan.</li>
             * <li>Approve: approves the plan.</li>
             * <li>reject: rejectes the plan.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Approve</p>
             */
            public Builder approvalAction(String approvalAction) {
                this.approvalAction = approvalAction;
                return this;
            }

            /**
             * <p>The approval comment of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Agreed.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the operation was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-22T05:56:14Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The RAM entities that have performed operations on the plan.</p>
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
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class TasksOperator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
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

            private Builder() {
            } 

            private Builder(TasksOperator model) {
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * <p>The name of the RAM entity.</p>
             * 
             * <strong>example:</strong>
             * <p>approver</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the RAM entity. Valid values:</p>
             * <ul>
             * <li>RamUser: a RAM user.</li>
             * <li>RamRole: a RAM role.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
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
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operator")
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

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.operator = model.operator;
            } 

            /**
             * <p>The RAM entities that can perform operations on the plan.</p>
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
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class TodoTaskActivities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<Tasks> tasks;

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
        public java.util.List<Tasks> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private String activityName; 
            private java.util.List<Tasks> tasks; 

            private Builder() {
            } 

            private Builder(TodoTaskActivities model) {
                this.activityName = model.activityName;
                this.tasks = model.tasks;
            } 

            /**
             * <p>The name of the operation that is being performed by the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>ApproverNode-1</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The tasks that are pending for review.</p>
             */
            public Builder tasks(java.util.List<Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public TodoTaskActivities build() {
                return new TodoTaskActivities(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class ApprovalDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationRecords")
        private java.util.List<OperationRecords> operationRecords;

        @com.aliyun.core.annotation.NameInMap("TodoTaskActivities")
        private java.util.List<TodoTaskActivities> todoTaskActivities;

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
        public java.util.List<OperationRecords> getOperationRecords() {
            return this.operationRecords;
        }

        /**
         * @return todoTaskActivities
         */
        public java.util.List<TodoTaskActivities> getTodoTaskActivities() {
            return this.todoTaskActivities;
        }

        public static final class Builder {
            private java.util.List<OperationRecords> operationRecords; 
            private java.util.List<TodoTaskActivities> todoTaskActivities; 

            private Builder() {
            } 

            private Builder(ApprovalDetail model) {
                this.operationRecords = model.operationRecords;
                this.todoTaskActivities = model.todoTaskActivities;
            } 

            /**
             * <p>The operation records.</p>
             */
            public Builder operationRecords(java.util.List<OperationRecords> operationRecords) {
                this.operationRecords = operationRecords;
                return this;
            }

            /**
             * <p>The operations that are being performed by the plan.</p>
             */
            public Builder todoTaskActivities(java.util.List<TodoTaskActivities> todoTaskActivities) {
                this.todoTaskActivities = todoTaskActivities;
                return this;
            }

            public ApprovalDetail build() {
                return new ApprovalDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
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
             * <p>The name of the RAM entity of the plan approver.</p>
             * 
             * <strong>example:</strong>
             * <p>approver</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the Resource Access Management (RAM) entity of the plan approver. Valid values:</p>
             * <ul>
             * <li>RamUser: a RAM user.</li>
             * <li>RamRole: a RAM role.</li>
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
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
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
             * <p>The name of the input parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_type</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the input parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.s6-c1m1.small</p>
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
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
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
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class PlanDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalDetail")
        private ApprovalDetail approvalDetail;

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
            private ApprovalDetail approvalDetail; 
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

            private Builder(PlanDetail model) {
                this.approvalDetail = model.approvalDetail;
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
             * <p>The approval details of the plan.</p>
             */
            public Builder approvalDetail(ApprovalDetail approvalDetail) {
                this.approvalDetail = approvalDetail;
                return this;
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
             * <p>2022-05-23T09:46:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>Create an ECS instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The purpose of the plan. Valid values:</p>
             * <ul>
             * <li>LaunchProduct: launches the product.</li>
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
             * <p>27740196382623****</p>
             */
            public Builder ownerPrincipalId(String ownerPrincipalId) {
                this.ownerPrincipalId = ownerPrincipalId;
                return this;
            }

            /**
             * <p>The name of the RAM entity to which the plan belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>endUser</p>
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
             * <p>plan-bp1jvmdk2k****</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The name of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-ECS instance</p>
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
             * <p>The ID of the ROS stack.</p>
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
             * <p>The state of the plan. Valid values:</p>
             * <ul>
             * <li>PreviewInProgress: The plan is being prechecked.</li>
             * <li>PreviewSuccess: The precheck is successful.</li>
             * <li>PreviewFailed: The precheck fails.</li>
             * <li>ApplicationInProgress: The plan is being approved.</li>
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
             * <p>This parameter is returned only when PreviewFailed or ExecuteFailed is returned for Status.</p>
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
             * <p>2022-05-23T09:47:29Z</p>
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
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class ProductDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProductArn")
        private String productArn;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
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

            private Builder() {
            } 

            private Builder(ProductDetail model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.productArn = model.productArn;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productType = model.productType;
                this.providerName = model.providerName;
            } 

            /**
             * <p>The creation time.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:10:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a product description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:servicecatalog:cn-hangzhou:146611588617****:product/prod-bp18r7q127****</p>
             */
            public Builder productArn(String productArn) {
                this.productArn = productArn;
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
             * <p>The type of the product.</p>
             * <p>The value is fixed as Ros, which indicates ROS.</p>
             * 
             * <strong>example:</strong>
             * <p>Ros</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The provider of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>IT team</p>
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
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class ProductVersionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Guidance")
        private String guidance;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductVersionId")
        private String productVersionId;

        @com.aliyun.core.annotation.NameInMap("ProductVersionName")
        private String productVersionName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TemplateUrl")
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

            private Builder() {
            } 

            private Builder(ProductVersionDetail model) {
                this.active = model.active;
                this.createTime = model.createTime;
                this.description = model.description;
                this.guidance = model.guidance;
                this.productId = model.productId;
                this.productVersionId = model.productVersionId;
                this.productVersionName = model.productVersionName;
                this.templateType = model.templateType;
                this.templateUrl = model.templateUrl;
            } 

            /**
             * <p>Indicates whether the product version is visible to end users. Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The time when the product version was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:10:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the product version.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The recommendation information. Valid values:</p>
             * <ul>
             * <li>Default: No recommendation information is provided. This is the default value.</li>
             * <li>Recommended: the recommendation version.</li>
             * <li>Latest: the latest version.</li>
             * <li>Deprecated: the version that is about to be deprecated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder guidance(String guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * <p>The ID of the product to which the product version belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-bp18r7q127****</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
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
             * <p>The name for the version of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * <p>The type of the template.</p>
             * <p>The value is fixed as RosTerraformTemplate, which indicates that the Terraform template is supported by ROS.</p>
             * 
             * <strong>example:</strong>
             * <p>RosTerraformTemplate</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The URL of the template.</p>
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
    /**
     * 
     * {@link GetProvisionedProductPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetProvisionedProductPlanResponseBody</p>
     */
    public static class ResourceChanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @com.aliyun.core.annotation.NameInMap("Replacement")
        private String replacement;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
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

            private Builder() {
            } 

            private Builder(ResourceChanges model) {
                this.action = model.action;
                this.logicalResourceId = model.logicalResourceId;
                this.physicalResourceId = model.physicalResourceId;
                this.replacement = model.replacement;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The action that is performed on the resource. Valid values:</p>
             * <ul>
             * <li>Add</li>
             * <li>Modify</li>
             * <li>Remove</li>
             * <li>None</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Add</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The logical ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The physical ID of the resource.</p>
             * <blockquote>
             * <p> This parameter is returned if the value of Action is Modify or Remove.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-bp13lmam3qd9q6il****</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>Indicates whether a replacement update is performed on the template. Valid values:</p>
             * <ul>
             * <li>True: A replacement update is performed on the template.</li>
             * <li>False: A change is made on the template.</li>
             * <li>Conditional: A replacement update may be performed on the template. You can check whether a replacement update is performed when the template is in use.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned if the value of Action is Modify.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud_instance</p>
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
