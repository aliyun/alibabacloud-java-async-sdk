// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSQLDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOasSQLDetailsRequest</p>
 */
public class DescribeOasSQLDetailsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicSql")
    private Boolean dynamicSql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParseTable")
    private Boolean parseTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private DescribeOasSQLDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbName = builder.dbName;
        this.dynamicSql = builder.dynamicSql;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.parseTable = builder.parseTable;
        this.sqlId = builder.sqlId;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasSQLDetailsRequest create() {
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
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return parseTable
     */
    public Boolean getParseTable() {
        return this.parseTable;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeOasSQLDetailsRequest, Builder> {
        private String regionId; 
        private String dbName; 
        private Boolean dynamicSql; 
        private String endTime; 
        private String instanceId; 
        private Boolean parseTable; 
        private String sqlId; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOasSQLDetailsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbName = request.dbName;
            this.dynamicSql = request.dynamicSql;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.parseTable = request.parseTable;
            this.sqlId = request.sqlId;
            this.startTime = request.startTime;
            this.tenantId = request.tenantId;
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
         * The name of the database.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
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
         * The end time of querying the SQL execution plan.   
         * <p>
         * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ParseTable.
         */
        public Builder parseTable(Boolean parseTable) {
            this.putBodyParameter("ParseTable", parseTable);
            this.parseTable = parseTable;
            return this;
        }

        /**
         * SQL ID.
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The start time of querying the SQL execution plan.   
         * <p>
         * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeOasSQLDetailsRequest build() {
            return new DescribeOasSQLDetailsRequest(this);
        } 

    } 

}
