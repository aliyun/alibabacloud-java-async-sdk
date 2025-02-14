// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListOperationCheckResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationCheckResponseBody</p>
 */
public class ListOperationCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationTaskInstanceDetails")
    private java.util.List<OperationTaskInstanceDetails> operationTaskInstanceDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListOperationCheckResponseBody(Builder builder) {
        this.operationTaskInstanceDetails = builder.operationTaskInstanceDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return operationTaskInstanceDetails
     */
    public java.util.List<OperationTaskInstanceDetails> getOperationTaskInstanceDetails() {
        return this.operationTaskInstanceDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OperationTaskInstanceDetails> operationTaskInstanceDetails; 
        private String requestId; 

        /**
         * OperationTaskInstanceDetails.
         */
        public Builder operationTaskInstanceDetails(java.util.List<OperationTaskInstanceDetails> operationTaskInstanceDetails) {
            this.operationTaskInstanceDetails = operationTaskInstanceDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOperationCheckResponseBody build() {
            return new ListOperationCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationCheckResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationCheckResponseBody</p>
     */
    public static class RepairConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("TypeDefine")
        private String typeDefine;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RepairConfigs(Builder builder) {
            this.flowId = builder.flowId;
            this.name = builder.name;
            this.showName = builder.showName;
            this.typeDefine = builder.typeDefine;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairConfigs create() {
            return builder().build();
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return typeDefine
         */
        public String getTypeDefine() {
            return this.typeDefine;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String flowId; 
            private String name; 
            private String showName; 
            private String typeDefine; 
            private String value; 

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * TypeDefine.
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RepairConfigs build() {
                return new RepairConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOperationCheckResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationCheckResponseBody</p>
     */
    public static class Repair extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private Long operateTime;

        @com.aliyun.core.annotation.NameInMap("RepairConfigs")
        private java.util.List<RepairConfigs> repairConfigs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusShowName")
        private String statusShowName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Repair(Builder builder) {
            this.operateTime = builder.operateTime;
            this.repairConfigs = builder.repairConfigs;
            this.status = builder.status;
            this.statusShowName = builder.statusShowName;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Repair create() {
            return builder().build();
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return repairConfigs
         */
        public java.util.List<RepairConfigs> getRepairConfigs() {
            return this.repairConfigs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusShowName
         */
        public String getStatusShowName() {
            return this.statusShowName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long operateTime; 
            private java.util.List<RepairConfigs> repairConfigs; 
            private String status; 
            private String statusShowName; 
            private String taskId; 

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * RepairConfigs.
             */
            public Builder repairConfigs(java.util.List<RepairConfigs> repairConfigs) {
                this.repairConfigs = repairConfigs;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusShowName.
             */
            public Builder statusShowName(String statusShowName) {
                this.statusShowName = statusShowName;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Repair build() {
                return new Repair(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOperationCheckResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationCheckResponseBody</p>
     */
    public static class OperationTaskInstanceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Repair")
        private java.util.List<Repair> repair;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OperationTaskInstanceDetails(Builder builder) {
            this.checkId = builder.checkId;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.repair = builder.repair;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationTaskInstanceDetails create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repair
         */
        public java.util.List<Repair> getRepair() {
            return this.repair;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long checkId; 
            private String instanceId; 
            private String regionId; 
            private java.util.List<Repair> repair; 
            private String type; 

            /**
             * CheckId.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Repair.
             */
            public Builder repair(java.util.List<Repair> repair) {
                this.repair = repair;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OperationTaskInstanceDetails build() {
                return new OperationTaskInstanceDetails(this);
            } 

        } 

    }
}
