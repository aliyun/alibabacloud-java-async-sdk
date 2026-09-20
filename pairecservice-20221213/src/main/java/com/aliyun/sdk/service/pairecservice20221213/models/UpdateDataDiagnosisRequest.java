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
 * {@link UpdateDataDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataDiagnosisRequest</p>
 */
public class UpdateDataDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataDiagnosisId;

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

    private UpdateDataDiagnosisRequest(Builder builder) {
        super(builder);
        this.dataDiagnosisId = builder.dataDiagnosisId;
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

    public static UpdateDataDiagnosisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiagnosisId
     */
    public String getDataDiagnosisId() {
        return this.dataDiagnosisId;
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

    public static final class Builder extends Request.Builder<UpdateDataDiagnosisRequest, Builder> {
        private String dataDiagnosisId; 
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

        private Builder(UpdateDataDiagnosisRequest request) {
            super(request);
            this.dataDiagnosisId = request.dataDiagnosisId;
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
         * <p>The ID of the data diagnosis task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder dataDiagnosisId(String dataDiagnosisId) {
            this.putPathParameter("DataDiagnosisId", dataDiagnosisId);
            this.dataDiagnosisId = dataDiagnosisId;
            return this;
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
         * <p>The configuration of the data diagnosis task, provided as a JSON string. The required fields vary based on the <code>Type</code> parameter. For <code>ChangeRate</code>, specify <code>AnalysisField</code> and <code>PartitionFieldFormat</code>. For <code>PreferenceStatisticsCycle</code>, specify <code>UserIdField</code>, <code>RemainDays</code>, <code>EverAppearedDays</code>, <code>RemainRatePeriods</code>, and <code>PartitionFieldFormat</code>. For <code>JoinTables</code>, specify <code>LeftTableAnalysisField</code>, <code>RightTableAnalysisField</code>, <code>LeftJoinField</code>, <code>RightJoinField</code>, <code>SampleQuantity</code>, <code>LeftTablePartitionFieldFormat</code>, and <code>RightTablePartitionFieldFormat</code>. For <code>BaseStatistics</code>, specify <code>TagField</code>, <code>TagFieldSeparator</code>, <code>KVField</code>, <code>KVFieldSeparator</code>, <code>KVPairSeparator</code>, <code>TextField</code>, <code>Quantiles</code>, <code>DefaultValueOfString</code>, <code>NullStringField</code>, and <code>PartitionFieldFormat</code>. For <code>AbnormalBehavior</code>, specify <code>UserId</code>, <code>ItemId</code>, <code>EventField</code>, <code>UpStreamBehavior</code>, <code>DownstreamBehavior</code>, <code>NumericHistogramBins</code>, and <code>PartitionFieldFormat</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AnalysisField&quot;:&quot;userid&quot;,&quot;PartitionFieldFormat&quot;:&quot;yyyymmdd&quot;}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The execution time for periodic runs. If this field is omitted, the task does not run periodically.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        public Builder cycleTime(String cycleTime) {
            this.putBodyParameter("CycleTime", cycleTime);
            this.cycleTime = cycleTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The ID of the left data table.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder leftTableMetaId(String leftTableMetaId) {
            this.putBodyParameter("LeftTableMetaId", leftTableMetaId);
            this.leftTableMetaId = leftTableMetaId;
            return this;
        }

        /**
         * <p>The partition field of the left table.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        public Builder leftTablePartitionField(String leftTablePartitionField) {
            this.putBodyParameter("LeftTablePartitionField", leftTablePartitionField);
            this.leftTablePartitionField = leftTablePartitionField;
            return this;
        }

        /**
         * <p>The name of the data diagnosis task.</p>
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
         * <p>The partition field.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        public Builder partitionField(String partitionField) {
            this.putBodyParameter("PartitionField", partitionField);
            this.partitionField = partitionField;
            return this;
        }

        /**
         * <p>The ID of the right data table.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder rightTableMetaId(String rightTableMetaId) {
            this.putBodyParameter("RightTableMetaId", rightTableMetaId);
            this.rightTableMetaId = rightTableMetaId;
            return this;
        }

        /**
         * <p>The partition field of the right table.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        public Builder rightTablePartitionField(String rightTablePartitionField) {
            this.putBodyParameter("RightTablePartitionField", rightTablePartitionField);
            this.rightTablePartitionField = rightTablePartitionField;
            return this;
        }

        /**
         * <p>The ID of the data table.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putBodyParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * <p>The number of top-ranked results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topNQuantity(Long topNQuantity) {
            this.putBodyParameter("TopNQuantity", topNQuantity);
            this.topNQuantity = topNQuantity;
            return this;
        }

        /**
         * <p>The type of the data diagnosis task. Valid values:</p>
         * <ul>
         * <li><p><code>ChangeRate</code>: item/user change rate analysis.</p>
         * </li>
         * <li><p><code>PreferenceStatisticsCycle</code>: user preference statistics cycle analysis.</p>
         * </li>
         * <li><p><code>JoinTables</code>: two-table join analysis.</p>
         * </li>
         * <li><p><code>BaseStatistics</code>: basic statistical analysis.</p>
         * </li>
         * <li><p><code>AbnormalBehavior</code>: abnormal behavior analysis.</p>
         * </li>
         * </ul>
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
        public UpdateDataDiagnosisRequest build() {
            return new UpdateDataDiagnosisRequest(this);
        } 

    } 

}
