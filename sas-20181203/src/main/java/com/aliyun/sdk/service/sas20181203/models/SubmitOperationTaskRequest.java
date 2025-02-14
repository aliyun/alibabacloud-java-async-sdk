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
    private java.util.List<OperationTaskInstances> operationTaskInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationKey")
    private String relationKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepairTempParam")
    private java.util.List<RepairTempParam> repairTempParam;

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
    public java.util.List<OperationTaskInstances> getOperationTaskInstances() {
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
    public java.util.List<RepairTempParam> getRepairTempParam() {
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
        private java.util.List<OperationTaskInstances> operationTaskInstances; 
        private String relationKey; 
        private java.util.List<RepairTempParam> repairTempParam; 
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
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the ID of the check item.</p>
         * </blockquote>
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
         * <p>The dimension of the task that you want to submit. Valid values:</p>
         * <ul>
         * <li>Instance dimension: INSTANCE</li>
         * <li>Check item dimension: CHECK_ID</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHECK_ID</p>
         */
        public Builder dimensionType(String dimensionType) {
            this.putQueryParameter("DimensionType", dimensionType);
            this.dimensionType = dimensionType;
            return this;
        }

        /**
         * <p>The asset information required to submit the tasks for instances.</p>
         */
        public Builder operationTaskInstances(java.util.List<OperationTaskInstances> operationTaskInstances) {
            this.putQueryParameter("OperationTaskInstances", operationTaskInstances);
            this.operationTaskInstances = operationTaskInstances;
            return this;
        }

        /**
         * <p>The key linked to cross-page selections during task submission.</p>
         * <blockquote>
         * <p> You can call the <a href="~~CreateAssetSelectionConfig~~">CreateAssetSelectionConfig</a> operation to query the associated key from the BusinessType field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CSPM_OPERATION_RELATION_KEY_173***</p>
         */
        public Builder relationKey(String relationKey) {
            this.putQueryParameter("RelationKey", relationKey);
            this.relationKey = relationKey;
            return this;
        }

        /**
         * <p>The temporary parameters required for the repair task.</p>
         */
        public Builder repairTempParam(java.util.List<RepairTempParam> repairTempParam) {
            this.putQueryParameter("RepairTempParam", repairTempParam);
            this.repairTempParam = repairTempParam;
            return this;
        }

        /**
         * <p>The type of the task that you want to submit. Valid values:</p>
         * <ul>
         * <li>Repair task: REPAIR</li>
         * <li>Rollback task: ROLLBACK</li>
         * </ul>
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
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6533m4vuo3oa33****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the task that you want to roll back</p>
             * 
             * <strong>example:</strong>
             * <p>7d0b10e35e80c9e5ebac5f1054****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The service provider of the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
             * <li><strong>1</strong>: an asset outside Alibaba Cloud.</li>
             * <li><strong>2</strong>: an asset in a data center.</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset from a third-party cloud service provider.</li>
             * <li><strong>8</strong>: a lightweight asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
             * <p>The name of the temporary repair parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>IPPort</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the temporary repair parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1XX.1XX</p>
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
