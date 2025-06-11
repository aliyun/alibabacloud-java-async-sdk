// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link CreateOasOutlineTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOasOutlineTaskRequest</p>
 */
public class CreateOasOutlineTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BySqlId")
    private Boolean bySqlId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicSql")
    private Boolean dynamicSql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IndexName")
    private String indexName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsConcurrentLimit")
    private Boolean isConcurrentLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxConcurrent")
    private Integer maxConcurrent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlanData")
    private String planData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlId")
    private String sqlId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatementId")
    private String statementId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UId")
    private String uId;

    private CreateOasOutlineTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bySqlId = builder.bySqlId;
        this.databaseName = builder.databaseName;
        this.dynamicSql = builder.dynamicSql;
        this.endTime = builder.endTime;
        this.indexName = builder.indexName;
        this.instanceId = builder.instanceId;
        this.isConcurrentLimit = builder.isConcurrentLimit;
        this.maxConcurrent = builder.maxConcurrent;
        this.planData = builder.planData;
        this.sqlId = builder.sqlId;
        this.sqlText = builder.sqlText;
        this.startTime = builder.startTime;
        this.statementId = builder.statementId;
        this.tableName = builder.tableName;
        this.tenantId = builder.tenantId;
        this.uId = builder.uId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOasOutlineTaskRequest create() {
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
     * @return bySqlId
     */
    public Boolean getBySqlId() {
        return this.bySqlId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return dynamicSql
     */
    public Boolean getDynamicSql() {
        return this.dynamicSql;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isConcurrentLimit
     */
    public Boolean getIsConcurrentLimit() {
        return this.isConcurrentLimit;
    }

    /**
     * @return maxConcurrent
     */
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    /**
     * @return planData
     */
    public String getPlanData() {
        return this.planData;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return sqlText
     */
    public String getSqlText() {
        return this.sqlText;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statementId
     */
    public String getStatementId() {
        return this.statementId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return uId
     */
    public String getUId() {
        return this.uId;
    }

    public static final class Builder extends Request.Builder<CreateOasOutlineTaskRequest, Builder> {
        private String regionId; 
        private Boolean bySqlId; 
        private String databaseName; 
        private Boolean dynamicSql; 
        private String endTime; 
        private String indexName; 
        private String instanceId; 
        private Boolean isConcurrentLimit; 
        private Integer maxConcurrent; 
        private String planData; 
        private String sqlId; 
        private String sqlText; 
        private String startTime; 
        private String statementId; 
        private String tableName; 
        private String tenantId; 
        private String uId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOasOutlineTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bySqlId = request.bySqlId;
            this.databaseName = request.databaseName;
            this.dynamicSql = request.dynamicSql;
            this.endTime = request.endTime;
            this.indexName = request.indexName;
            this.instanceId = request.instanceId;
            this.isConcurrentLimit = request.isConcurrentLimit;
            this.maxConcurrent = request.maxConcurrent;
            this.planData = request.planData;
            this.sqlId = request.sqlId;
            this.sqlText = request.sqlText;
            this.startTime = request.startTime;
            this.statementId = request.statementId;
            this.tableName = request.tableName;
            this.tenantId = request.tenantId;
            this.uId = request.uId;
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
         * BySqlId.
         */
        public Builder bySqlId(Boolean bySqlId) {
            this.putBodyParameter("BySqlId", bySqlId);
            this.bySqlId = bySqlId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_data</p>
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * DynamicSql.
         */
        public Builder dynamicSql(Boolean dynamicSql) {
            this.putBodyParameter("DynamicSql", dynamicSql);
            this.dynamicSql = dynamicSql;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IndexName.
         */
        public Builder indexName(String indexName) {
            this.putBodyParameter("IndexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsConcurrentLimit.
         */
        public Builder isConcurrentLimit(Boolean isConcurrentLimit) {
            this.putBodyParameter("IsConcurrentLimit", isConcurrentLimit);
            this.isConcurrentLimit = isConcurrentLimit;
            return this;
        }

        /**
         * MaxConcurrent.
         */
        public Builder maxConcurrent(Integer maxConcurrent) {
            this.putBodyParameter("MaxConcurrent", maxConcurrent);
            this.maxConcurrent = maxConcurrent;
            return this;
        }

        /**
         * PlanData.
         */
        public Builder planData(String planData) {
            this.putBodyParameter("PlanData", planData);
            this.planData = planData;
            return this;
        }

        /**
         * <p>SQL ID</p>
         * 
         * <strong>example:</strong>
         * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC</p>
         */
        public Builder sqlText(String sqlText) {
            this.putBodyParameter("SqlText", sqlText);
            this.sqlText = sqlText;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StatementId.
         */
        public Builder statementId(String statementId) {
            this.putBodyParameter("StatementId", statementId);
            this.statementId = statementId;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob2mr3oae0****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UId.
         */
        public Builder uId(String uId) {
            this.putBodyParameter("UId", uId);
            this.uId = uId;
            return this;
        }

        @Override
        public CreateOasOutlineTaskRequest build() {
            return new CreateOasOutlineTaskRequest(this);
        } 

    } 

}
