// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link AddDataCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>AddDataCheckConfigRequest</p>
 */
public class AddDataCheckConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isFullTableCount")
    private Integer isFullTableCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceColumns")
    private String sourceColumns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceGroupClause")
    private String sourceGroupClause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceHint")
    private String sourceHint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourcePartition")
    private String sourcePartition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTable")
    private String sourceTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceWhereClause")
    private String sourceWhereClause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetColumns")
    private String targetColumns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetGroupClause")
    private String targetGroupClause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetHint")
    private String targetHint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetPartition")
    private String targetPartition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetTable")
    private String targetTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetWhereClause")
    private String targetWhereClause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskConfigInfo")
    private String taskConfigInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("totalCountThreshold")
    private Float totalCountThreshold;

    private AddDataCheckConfigRequest(Builder builder) {
        super(builder);
        this.isFullTableCount = builder.isFullTableCount;
        this.sourceColumns = builder.sourceColumns;
        this.sourceGroupClause = builder.sourceGroupClause;
        this.sourceHint = builder.sourceHint;
        this.sourcePartition = builder.sourcePartition;
        this.sourceTable = builder.sourceTable;
        this.sourceWhereClause = builder.sourceWhereClause;
        this.targetColumns = builder.targetColumns;
        this.targetGroupClause = builder.targetGroupClause;
        this.targetHint = builder.targetHint;
        this.targetPartition = builder.targetPartition;
        this.targetTable = builder.targetTable;
        this.targetWhereClause = builder.targetWhereClause;
        this.taskConfigInfo = builder.taskConfigInfo;
        this.taskId = builder.taskId;
        this.totalCountThreshold = builder.totalCountThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataCheckConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isFullTableCount
     */
    public Integer getIsFullTableCount() {
        return this.isFullTableCount;
    }

    /**
     * @return sourceColumns
     */
    public String getSourceColumns() {
        return this.sourceColumns;
    }

    /**
     * @return sourceGroupClause
     */
    public String getSourceGroupClause() {
        return this.sourceGroupClause;
    }

    /**
     * @return sourceHint
     */
    public String getSourceHint() {
        return this.sourceHint;
    }

    /**
     * @return sourcePartition
     */
    public String getSourcePartition() {
        return this.sourcePartition;
    }

    /**
     * @return sourceTable
     */
    public String getSourceTable() {
        return this.sourceTable;
    }

    /**
     * @return sourceWhereClause
     */
    public String getSourceWhereClause() {
        return this.sourceWhereClause;
    }

    /**
     * @return targetColumns
     */
    public String getTargetColumns() {
        return this.targetColumns;
    }

    /**
     * @return targetGroupClause
     */
    public String getTargetGroupClause() {
        return this.targetGroupClause;
    }

    /**
     * @return targetHint
     */
    public String getTargetHint() {
        return this.targetHint;
    }

    /**
     * @return targetPartition
     */
    public String getTargetPartition() {
        return this.targetPartition;
    }

    /**
     * @return targetTable
     */
    public String getTargetTable() {
        return this.targetTable;
    }

    /**
     * @return targetWhereClause
     */
    public String getTargetWhereClause() {
        return this.targetWhereClause;
    }

    /**
     * @return taskConfigInfo
     */
    public String getTaskConfigInfo() {
        return this.taskConfigInfo;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCountThreshold
     */
    public Float getTotalCountThreshold() {
        return this.totalCountThreshold;
    }

    public static final class Builder extends Request.Builder<AddDataCheckConfigRequest, Builder> {
        private Integer isFullTableCount; 
        private String sourceColumns; 
        private String sourceGroupClause; 
        private String sourceHint; 
        private String sourcePartition; 
        private String sourceTable; 
        private String sourceWhereClause; 
        private String targetColumns; 
        private String targetGroupClause; 
        private String targetHint; 
        private String targetPartition; 
        private String targetTable; 
        private String targetWhereClause; 
        private String taskConfigInfo; 
        private Long taskId; 
        private Float totalCountThreshold; 

        private Builder() {
            super();
        } 

        private Builder(AddDataCheckConfigRequest request) {
            super(request);
            this.isFullTableCount = request.isFullTableCount;
            this.sourceColumns = request.sourceColumns;
            this.sourceGroupClause = request.sourceGroupClause;
            this.sourceHint = request.sourceHint;
            this.sourcePartition = request.sourcePartition;
            this.sourceTable = request.sourceTable;
            this.sourceWhereClause = request.sourceWhereClause;
            this.targetColumns = request.targetColumns;
            this.targetGroupClause = request.targetGroupClause;
            this.targetHint = request.targetHint;
            this.targetPartition = request.targetPartition;
            this.targetTable = request.targetTable;
            this.targetWhereClause = request.targetWhereClause;
            this.taskConfigInfo = request.taskConfigInfo;
            this.taskId = request.taskId;
            this.totalCountThreshold = request.totalCountThreshold;
        } 

        /**
         * <p>Specifies whether to perform full-table validation. Valid values:</p>
         * <ul>
         * <li>0: partition-level comparison.</li>
         * <li>1: full-table comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isFullTableCount(Integer isFullTableCount) {
            this.putBodyParameter("isFullTableCount", isFullTableCount);
            this.isFullTableCount = isFullTableCount;
            return this;
        }

        /**
         * <p>The columns of the source table. You can specify multiple columns separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        public Builder sourceColumns(String sourceColumns) {
            this.putBodyParameter("sourceColumns", sourceColumns);
            this.sourceColumns = sourceColumns;
            return this;
        }

        /**
         * <p>The GROUP condition of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        public Builder sourceGroupClause(String sourceGroupClause) {
            this.putBodyParameter("sourceGroupClause", sourceGroupClause);
            this.sourceGroupClause = sourceGroupClause;
            return this;
        }

        /**
         * <p>The hint for the source.</p>
         */
        public Builder sourceHint(String sourceHint) {
            this.putBodyParameter("sourceHint", sourceHint);
            this.sourceHint = sourceHint;
            return this;
        }

        /**
         * <p>The partition of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        public Builder sourcePartition(String sourcePartition) {
            this.putBodyParameter("sourcePartition", sourcePartition);
            this.sourcePartition = sourcePartition;
            return this;
        }

        /**
         * <p>The name of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        public Builder sourceTable(String sourceTable) {
            this.putBodyParameter("sourceTable", sourceTable);
            this.sourceTable = sourceTable;
            return this;
        }

        /**
         * <p>The WHERE condition of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
         */
        public Builder sourceWhereClause(String sourceWhereClause) {
            this.putBodyParameter("sourceWhereClause", sourceWhereClause);
            this.sourceWhereClause = sourceWhereClause;
            return this;
        }

        /**
         * <p>The columns of the target table. You can specify multiple columns separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        public Builder targetColumns(String targetColumns) {
            this.putBodyParameter("targetColumns", targetColumns);
            this.targetColumns = targetColumns;
            return this;
        }

        /**
         * <p>The GROUP condition of the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        public Builder targetGroupClause(String targetGroupClause) {
            this.putBodyParameter("targetGroupClause", targetGroupClause);
            this.targetGroupClause = targetGroupClause;
            return this;
        }

        /**
         * <p>The hint for the target.</p>
         */
        public Builder targetHint(String targetHint) {
            this.putBodyParameter("targetHint", targetHint);
            this.targetHint = targetHint;
            return this;
        }

        /**
         * <p>The partition of the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        public Builder targetPartition(String targetPartition) {
            this.putBodyParameter("targetPartition", targetPartition);
            this.targetPartition = targetPartition;
            return this;
        }

        /**
         * <p>The name of the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        public Builder targetTable(String targetTable) {
            this.putBodyParameter("targetTable", targetTable);
            this.targetTable = targetTable;
            return this;
        }

        /**
         * <p>The WHERE condition of the target table.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
         */
        public Builder targetWhereClause(String targetWhereClause) {
            this.putBodyParameter("targetWhereClause", targetWhereClause);
            this.targetWhereClause = targetWhereClause;
            return this;
        }

        /**
         * <p>The batch table configurations for same-pattern creation (<code>taskMode=1</code>). Separate multiple configurations with a line break (<code> </code>).</p>
         * 
         * <strong>example:</strong>
         * <p>lhm|lhm_dw|*</p>
         */
        public Builder taskConfigInfo(String taskConfigInfo) {
            this.putBodyParameter("taskConfigInfo", taskConfigInfo);
            this.taskConfigInfo = taskConfigInfo;
            return this;
        }

        /**
         * <p>The ID of the validation task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The total data volume comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder totalCountThreshold(Float totalCountThreshold) {
            this.putBodyParameter("totalCountThreshold", totalCountThreshold);
            this.totalCountThreshold = totalCountThreshold;
            return this;
        }

        @Override
        public AddDataCheckConfigRequest build() {
            return new AddDataCheckConfigRequest(this);
        } 

    } 

}
