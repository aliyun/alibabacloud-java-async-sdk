// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSlowSQLListRequest} extends {@link RequestModel}
 *
 * <p>DescribeOasSlowSQLListRequest</p>
 */
public class DescribeOasSlowSQLListRequest extends Request {
    @Host
    @NameInMap("RegionId")
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
    @NameInMap("FilterCondition")
    private String filterCondition;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("MergeDynamicSql")
    private Boolean mergeDynamicSql;

    @Body
    @NameInMap("NodeIp")
    private String nodeIp;

    @Body
    @NameInMap("SearchKeyWord")
    private String searchKeyWord;

    @Body
    @NameInMap("SearchParam")
    private String searchParam;

    @Body
    @NameInMap("SearchRule")
    private String searchRule;

    @Body
    @NameInMap("SearchValue")
    private String searchValue;

    @Body
    @NameInMap("SqlId")
    private String sqlId;

    @Body
    @NameInMap("SqlTextLength")
    private Long sqlTextLength;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DescribeOasSlowSQLListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceptLanguage = builder.acceptLanguage;
        this.dbName = builder.dbName;
        this.dynamicSql = builder.dynamicSql;
        this.endTime = builder.endTime;
        this.filterCondition = builder.filterCondition;
        this.instanceId = builder.instanceId;
        this.mergeDynamicSql = builder.mergeDynamicSql;
        this.nodeIp = builder.nodeIp;
        this.searchKeyWord = builder.searchKeyWord;
        this.searchParam = builder.searchParam;
        this.searchRule = builder.searchRule;
        this.searchValue = builder.searchValue;
        this.sqlId = builder.sqlId;
        this.sqlTextLength = builder.sqlTextLength;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasSlowSQLListRequest create() {
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
     * @return filterCondition
     */
    public String getFilterCondition() {
        return this.filterCondition;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mergeDynamicSql
     */
    public Boolean getMergeDynamicSql() {
        return this.mergeDynamicSql;
    }

    /**
     * @return nodeIp
     */
    public String getNodeIp() {
        return this.nodeIp;
    }

    /**
     * @return searchKeyWord
     */
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    /**
     * @return searchParam
     */
    public String getSearchParam() {
        return this.searchParam;
    }

    /**
     * @return searchRule
     */
    public String getSearchRule() {
        return this.searchRule;
    }

    /**
     * @return searchValue
     */
    public String getSearchValue() {
        return this.searchValue;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return sqlTextLength
     */
    public Long getSqlTextLength() {
        return this.sqlTextLength;
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

    public static final class Builder extends Request.Builder<DescribeOasSlowSQLListRequest, Builder> {
        private String regionId; 
        private String acceptLanguage; 
        private String dbName; 
        private Boolean dynamicSql; 
        private String endTime; 
        private String filterCondition; 
        private String instanceId; 
        private Boolean mergeDynamicSql; 
        private String nodeIp; 
        private String searchKeyWord; 
        private String searchParam; 
        private String searchRule; 
        private String searchValue; 
        private String sqlId; 
        private Long sqlTextLength; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOasSlowSQLListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceptLanguage = request.acceptLanguage;
            this.dbName = request.dbName;
            this.dynamicSql = request.dynamicSql;
            this.endTime = request.endTime;
            this.filterCondition = request.filterCondition;
            this.instanceId = request.instanceId;
            this.mergeDynamicSql = request.mergeDynamicSql;
            this.nodeIp = request.nodeIp;
            this.searchKeyWord = request.searchKeyWord;
            this.searchParam = request.searchParam;
            this.searchRule = request.searchRule;
            this.searchValue = request.searchValue;
            this.sqlId = request.sqlId;
            this.sqlTextLength = request.sqlTextLength;
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
         * The language of the response.
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
         * The end time of querying slow SQL historical parameters.   
         * <p>
         * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * All parameters are referenced by the symbol @. For a list of available parameters, refer to the returned parameters in [Query performance indicators of an SQL statement](https://en.oceanbase.com/docs/community-ocp-en-10000000000840290).
         */
        public Builder filterCondition(String filterCondition) {
            this.putBodyParameter("FilterCondition", filterCondition);
            this.filterCondition = filterCondition;
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
         * MergeDynamicSql.
         */
        public Builder mergeDynamicSql(Boolean mergeDynamicSql) {
            this.putBodyParameter("MergeDynamicSql", mergeDynamicSql);
            this.mergeDynamicSql = mergeDynamicSql;
            return this;
        }

        /**
         * The IP of the database node.
         */
        public Builder nodeIp(String nodeIp) {
            this.putBodyParameter("NodeIp", nodeIp);
            this.nodeIp = nodeIp;
            return this;
        }

        /**
         * The search keyword.
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putBodyParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
            return this;
        }

        /**
         * The search parameter.
         */
        public Builder searchParam(String searchParam) {
            this.putBodyParameter("SearchParam", searchParam);
            this.searchParam = searchParam;
            return this;
        }

        /**
         * The search rule.
         */
        public Builder searchRule(String searchRule) {
            this.putBodyParameter("SearchRule", searchRule);
            this.searchRule = searchRule;
            return this;
        }

        /**
         * The search value.
         */
        public Builder searchValue(String searchValue) {
            this.putBodyParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * SQL ID, the unique identifier of the SQL.
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * Max length of the returned SQL text.
         */
        public Builder sqlTextLength(Long sqlTextLength) {
            this.putBodyParameter("SqlTextLength", sqlTextLength);
            this.sqlTextLength = sqlTextLength;
            return this;
        }

        /**
         * The start time of querying slow SQL historical parameters.   
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
        public DescribeOasSlowSQLListRequest build() {
            return new DescribeOasSlowSQLListRequest(this);
        } 

    } 

}
