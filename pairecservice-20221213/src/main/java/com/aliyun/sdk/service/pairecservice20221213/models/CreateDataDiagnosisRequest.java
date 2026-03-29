// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateDataDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>CreateDataDiagnosisRequest</p>
 */
public class CreateDataDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleTime")
    private String cycleTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeftTableMetaId")
    private String leftTableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeftTablePartitionField")
    private String leftTablePartitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionField")
    private String partitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RightTableMetaId")
    private String rightTableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RightTablePartitionField")
    private String rightTablePartitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    private String tableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopNQuantity")
    private Long topNQuantity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateDataDiagnosisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.cycleTime = builder.cycleTime;
        this.instanceId = builder.instanceId;
        this.leftTableMetaId = builder.leftTableMetaId;
        this.leftTablePartitionField = builder.leftTablePartitionField;
        this.name = builder.name;
        this.partitionField = builder.partitionField;
        this.rightTableMetaId = builder.rightTableMetaId;
        this.rightTablePartitionField = builder.rightTablePartitionField;
        this.tableMetaId = builder.tableMetaId;
        this.topNQuantity = builder.topNQuantity;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataDiagnosisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return cycleTime
     */
    public String getCycleTime() {
        return this.cycleTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return leftTableMetaId
     */
    public String getLeftTableMetaId() {
        return this.leftTableMetaId;
    }

    /**
     * @return leftTablePartitionField
     */
    public String getLeftTablePartitionField() {
        return this.leftTablePartitionField;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return partitionField
     */
    public String getPartitionField() {
        return this.partitionField;
    }

    /**
     * @return rightTableMetaId
     */
    public String getRightTableMetaId() {
        return this.rightTableMetaId;
    }

    /**
     * @return rightTablePartitionField
     */
    public String getRightTablePartitionField() {
        return this.rightTablePartitionField;
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    /**
     * @return topNQuantity
     */
    public Long getTopNQuantity() {
        return this.topNQuantity;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateDataDiagnosisRequest, Builder> {
        private String regionId; 
        private String config; 
        private String cycleTime; 
        private String instanceId; 
        private String leftTableMetaId; 
        private String leftTablePartitionField; 
        private String name; 
        private String partitionField; 
        private String rightTableMetaId; 
        private String rightTablePartitionField; 
        private String tableMetaId; 
        private Long topNQuantity; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataDiagnosisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.cycleTime = request.cycleTime;
            this.instanceId = request.instanceId;
            this.leftTableMetaId = request.leftTableMetaId;
            this.leftTablePartitionField = request.leftTablePartitionField;
            this.name = request.name;
            this.partitionField = request.partitionField;
            this.rightTableMetaId = request.rightTableMetaId;
            this.rightTablePartitionField = request.rightTablePartitionField;
            this.tableMetaId = request.tableMetaId;
            this.topNQuantity = request.topNQuantity;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;AnalysisField&quot;: &quot;userid&quot;, &quot;PartitionFieldFormat&quot;: &quot;yyyymmdd&quot; }</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * CycleTime.
         */
        public Builder cycleTime(String cycleTime) {
            this.putBodyParameter("CycleTime", cycleTime);
            this.cycleTime = cycleTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LeftTableMetaId.
         */
        public Builder leftTableMetaId(String leftTableMetaId) {
            this.putBodyParameter("LeftTableMetaId", leftTableMetaId);
            this.leftTableMetaId = leftTableMetaId;
            return this;
        }

        /**
         * LeftTablePartitionField.
         */
        public Builder leftTablePartitionField(String leftTablePartitionField) {
            this.putBodyParameter("LeftTablePartitionField", leftTablePartitionField);
            this.leftTablePartitionField = leftTablePartitionField;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>data_diagnosis_job1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PartitionField.
         */
        public Builder partitionField(String partitionField) {
            this.putBodyParameter("PartitionField", partitionField);
            this.partitionField = partitionField;
            return this;
        }

        /**
         * RightTableMetaId.
         */
        public Builder rightTableMetaId(String rightTableMetaId) {
            this.putBodyParameter("RightTableMetaId", rightTableMetaId);
            this.rightTableMetaId = rightTableMetaId;
            return this;
        }

        /**
         * RightTablePartitionField.
         */
        public Builder rightTablePartitionField(String rightTablePartitionField) {
            this.putBodyParameter("RightTablePartitionField", rightTablePartitionField);
            this.rightTablePartitionField = rightTablePartitionField;
            return this;
        }

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putBodyParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * TopNQuantity.
         */
        public Builder topNQuantity(Long topNQuantity) {
            this.putBodyParameter("TopNQuantity", topNQuantity);
            this.topNQuantity = topNQuantity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ChangeRate</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateDataDiagnosisRequest build() {
            return new CreateDataDiagnosisRequest(this);
        } 

    } 

}
