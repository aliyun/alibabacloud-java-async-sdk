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
 * {@link ExecDataCheckSqlPreviewRequest} extends {@link RequestModel}
 *
 * <p>ExecDataCheckSqlPreviewRequest</p>
 */
public class ExecDataCheckSqlPreviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkColumn")
    private String checkColumn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("engineId")
    private String engineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fullTableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fullTableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partitionCondition")
    private String partitionCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("whereClause")
    private String whereClause;

    private ExecDataCheckSqlPreviewRequest(Builder builder) {
        super(builder);
        this.checkColumn = builder.checkColumn;
        this.dataSourceId = builder.dataSourceId;
        this.engineId = builder.engineId;
        this.fullTableName = builder.fullTableName;
        this.partitionCondition = builder.partitionCondition;
        this.taskId = builder.taskId;
        this.whereClause = builder.whereClause;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDataCheckSqlPreviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkColumn
     */
    public String getCheckColumn() {
        return this.checkColumn;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return engineId
     */
    public String getEngineId() {
        return this.engineId;
    }

    /**
     * @return fullTableName
     */
    public String getFullTableName() {
        return this.fullTableName;
    }

    /**
     * @return partitionCondition
     */
    public String getPartitionCondition() {
        return this.partitionCondition;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return whereClause
     */
    public String getWhereClause() {
        return this.whereClause;
    }

    public static final class Builder extends Request.Builder<ExecDataCheckSqlPreviewRequest, Builder> {
        private String checkColumn; 
        private String dataSourceId; 
        private String engineId; 
        private String fullTableName; 
        private String partitionCondition; 
        private Long taskId; 
        private String whereClause; 

        private Builder() {
            super();
        } 

        private Builder(ExecDataCheckSqlPreviewRequest request) {
            super(request);
            this.checkColumn = request.checkColumn;
            this.dataSourceId = request.dataSourceId;
            this.engineId = request.engineId;
            this.fullTableName = request.fullTableName;
            this.partitionCondition = request.partitionCondition;
            this.taskId = request.taskId;
            this.whereClause = request.whereClause;
        } 

        /**
         * <p>The columns to check.</p>
         * 
         * <strong>example:</strong>
         * <p>id,name</p>
         */
        public Builder checkColumn(String checkColumn) {
            this.putBodyParameter("checkColumn", checkColumn);
            this.checkColumn = checkColumn;
            return this;
        }

        /**
         * <p>The ID of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>230</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The ID of the check engine. Used in Spark scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>230</p>
         */
        public Builder engineId(String engineId) {
            this.putBodyParameter("engineId", engineId);
            this.engineId = engineId;
            return this;
        }

        /**
         * <p>The name of the table to check, in the format <code>schema.table</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db.test_table</p>
         */
        public Builder fullTableName(String fullTableName) {
            this.putBodyParameter("fullTableName", fullTableName);
            this.fullTableName = fullTableName;
            return this;
        }

        /**
         * <p>The partition condition.</p>
         * 
         * <strong>example:</strong>
         * <p>date_part=20240719</p>
         */
        public Builder partitionCondition(String partitionCondition) {
            this.putBodyParameter("partitionCondition", partitionCondition);
            this.partitionCondition = partitionCondition;
            return this;
        }

        /**
         * <p>The ID of the check task.</p>
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
         * <p>The WHERE condition.</p>
         * 
         * <strong>example:</strong>
         * <p>id &gt; 100</p>
         */
        public Builder whereClause(String whereClause) {
            this.putBodyParameter("whereClause", whereClause);
            this.whereClause = whereClause;
            return this;
        }

        @Override
        public ExecDataCheckSqlPreviewRequest build() {
            return new ExecDataCheckSqlPreviewRequest(this);
        } 

    } 

}
