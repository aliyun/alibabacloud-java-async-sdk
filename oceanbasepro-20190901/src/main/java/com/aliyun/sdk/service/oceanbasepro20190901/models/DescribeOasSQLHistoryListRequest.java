// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSQLHistoryListRequest} extends {@link RequestModel}
 *
 * <p>DescribeOasSQLHistoryListRequest</p>
 */
public class DescribeOasSQLHistoryListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Body
    @NameInMap("DbName")
    private String dbName;

    @Body
    @NameInMap("DynamicSql")
    private Boolean dynamicSql;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("NodeIp")
    private String nodeIp;

    @Body
    @NameInMap("SqlId")
    @Validation(required = true)
    private String sqlId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DescribeOasSQLHistoryListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceptLanguage = builder.acceptLanguage;
        this.dbName = builder.dbName;
        this.dynamicSql = builder.dynamicSql;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.nodeIp = builder.nodeIp;
        this.sqlId = builder.sqlId;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasSQLHistoryListRequest create() {
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
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
     * @return nodeIp
     */
    public String getNodeIp() {
        return this.nodeIp;
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

    public static final class Builder extends Request.Builder<DescribeOasSQLHistoryListRequest, Builder> {
        private String regionId; 
        private String acceptLanguage; 
        private String dbName; 
        private Boolean dynamicSql; 
        private String endTime; 
        private String instanceId; 
        private String nodeIp; 
        private String sqlId; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOasSQLHistoryListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceptLanguage = request.acceptLanguage;
            this.dbName = request.dbName;
            this.dynamicSql = request.dynamicSql;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.nodeIp = request.nodeIp;
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
         * The language of the response. Valid values:
         * <p>
         * - zh: Chinese
         * - en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
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
         * The end time of querying the execution history of the SQL statement.   
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
         * The IP address of the node.
         */
        public Builder nodeIp(String nodeIp) {
            this.putBodyParameter("NodeIp", nodeIp);
            this.nodeIp = nodeIp;
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
         * The start time of querying the execution history of the SQL statement.   
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
        public DescribeOasSQLHistoryListRequest build() {
            return new DescribeOasSQLHistoryListRequest(this);
        } 

    } 

}
