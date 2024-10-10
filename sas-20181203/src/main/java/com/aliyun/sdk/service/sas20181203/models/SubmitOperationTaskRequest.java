// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitOperationTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitOperationTaskRequest</p>
 */
public class SubmitOperationTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DimensionType")
    private String dimensionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTaskInstances")
    private java.util.List < OperationTaskInstances> operationTaskInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationKey")
    private String relationKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepairTempParam")
    private java.util.List < RepairTempParam> repairTempParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private SubmitOperationTaskRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.dimensionType = builder.dimensionType;
        this.operationTaskInstances = builder.operationTaskInstances;
        this.relationKey = builder.relationKey;
        this.repairTempParam = builder.repairTempParam;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitOperationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return dimensionType
     */
    public String getDimensionType() {
        return this.dimensionType;
    }

    /**
     * @return operationTaskInstances
     */
    public java.util.List < OperationTaskInstances> getOperationTaskInstances() {
        return this.operationTaskInstances;
    }

    /**
     * @return relationKey
     */
    public String getRelationKey() {
        return this.relationKey;
    }

    /**
     * @return repairTempParam
     */
    public java.util.List < RepairTempParam> getRepairTempParam() {
        return this.repairTempParam;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SubmitOperationTaskRequest, Builder> {
        private Long checkId; 
        private String dimensionType; 
        private java.util.List < OperationTaskInstances> operationTaskInstances; 
        private String relationKey; 
        private java.util.List < RepairTempParam> repairTempParam; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SubmitOperationTaskRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.dimensionType = request.dimensionType;
            this.operationTaskInstances = request.operationTaskInstances;
            this.relationKey = request.relationKey;
            this.repairTempParam = request.repairTempParam;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * DimensionType.
         */
        public Builder dimensionType(String dimensionType) {
            this.putQueryParameter("DimensionType", dimensionType);
            this.dimensionType = dimensionType;
            return this;
        }

        /**
         * OperationTaskInstances.
         */
        public Builder operationTaskInstances(java.util.List < OperationTaskInstances> operationTaskInstances) {
            this.putQueryParameter("OperationTaskInstances", operationTaskInstances);
            this.operationTaskInstances = operationTaskInstances;
            return this;
        }

        /**
         * RelationKey.
         */
        public Builder relationKey(String relationKey) {
            this.putQueryParameter("RelationKey", relationKey);
            this.relationKey = relationKey;
            return this;
        }

        /**
         * RepairTempParam.
         */
        public Builder repairTempParam(java.util.List < RepairTempParam> repairTempParam) {
            this.putQueryParameter("RepairTempParam", repairTempParam);
            this.repairTempParam = repairTempParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REPAIR</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SubmitOperationTaskRequest build() {
            return new SubmitOperationTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitOperationTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitOperationTaskRequest</p>
     */
    public static class OperationTaskInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private OperationTaskInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.taskId = builder.taskId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationTaskInstances create() {
            return builder().build();
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 
            private String taskId; 
            private String vendor; 

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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public OperationTaskInstances build() {
                return new OperationTaskInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitOperationTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitOperationTaskRequest</p>
     */
    public static class RepairTempParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RepairTempParam(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairTempParam create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RepairTempParam build() {
                return new RepairTempParam(this);
            } 

        } 

    }
}
