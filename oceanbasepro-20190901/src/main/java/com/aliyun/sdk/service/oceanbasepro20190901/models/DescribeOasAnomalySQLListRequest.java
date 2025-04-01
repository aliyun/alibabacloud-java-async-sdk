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
 * {@link DescribeOasAnomalySQLListRequest} extends {@link RequestModel}
 *
 * <p>DescribeOasAnomalySQLListRequest</p>
 */
public class DescribeOasAnomalySQLListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Long current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicSql")
    private Boolean dynamicSql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterCondition")
    private String filterCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MergeDynamicSql")
    private Boolean mergeDynamicSql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIp")
    private String nodeIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKeyWord")
    private String searchKeyWord;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchParam")
    private String searchParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchRule")
    private String searchRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchValue")
    private String searchValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlId")
    private String sqlId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlTextLength")
    private Long sqlTextLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private DescribeOasAnomalySQLListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceptLanguage = builder.acceptLanguage;
        this.current = builder.current;
        this.dbName = builder.dbName;
        this.dynamicSql = builder.dynamicSql;
        this.endTime = builder.endTime;
        this.filterCondition = builder.filterCondition;
        this.instanceId = builder.instanceId;
        this.mergeDynamicSql = builder.mergeDynamicSql;
        this.nodeIp = builder.nodeIp;
        this.pageSize = builder.pageSize;
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

    public static DescribeOasAnomalySQLListRequest create() {
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
     * @return current
     */
    public Long getCurrent() {
        return this.current;
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
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeOasAnomalySQLListRequest, Builder> {
        private String regionId; 
        private String acceptLanguage; 
        private Long current; 
        private String dbName; 
        private Boolean dynamicSql; 
        private String endTime; 
        private String filterCondition; 
        private String instanceId; 
        private Boolean mergeDynamicSql; 
        private String nodeIp; 
        private Long pageSize; 
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

        private Builder(DescribeOasAnomalySQLListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceptLanguage = request.acceptLanguage;
            this.current = request.current;
            this.dbName = request.dbName;
            this.dynamicSql = request.dynamicSql;
            this.endTime = request.endTime;
            this.filterCondition = request.filterCondition;
            this.instanceId = request.instanceId;
            this.mergeDynamicSql = request.mergeDynamicSql;
            this.nodeIp = request.nodeIp;
            this.pageSize = request.pageSize;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Long current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db_****</p>
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>Specifies whether the specified SQL statements are dynamic SQL statements.</p>
         * <blockquote>
         * <p>This parameter specifies whether the values of the <code>SqlId</code> parameter are the IDs of dynamic SQL statements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dynamicSql(Boolean dynamicSql) {
            this.putBodyParameter("DynamicSql", dynamicSql);
            this.dynamicSql = dynamicSql;
            return this;
        }

        /**
         * <p>The end time of the monitoring data.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-12T05:38:38Z</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>All parameters are referenced by the symbol @. For a list of available parameters, refer to the returned parameters in <a href="https://en.oceanbase.com/docs/community-ocp-en-10000000000840290">Query performance indicators of an SQL statement</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>@avgCpuTime &gt; 20 and @executions &gt; 100</p>
         */
        public Builder filterCondition(String filterCondition) {
            this.putBodyParameter("FilterCondition", filterCondition);
            this.filterCondition = filterCondition;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
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
         * <p>Specifies whether to merge dynamic SQL statements in the return result. </p>
         * <blockquote>
         * <p>This parameter specifies whether to aggregate the results of IN queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder mergeDynamicSql(Boolean mergeDynamicSql) {
            this.putBodyParameter("MergeDynamicSql", mergeDynamicSql);
            this.mergeDynamicSql = mergeDynamicSql;
            return this;
        }

        /**
         * <p>The node IP.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp19y05uq6x*********</p>
         */
        public Builder nodeIp(String nodeIp) {
            this.putBodyParameter("NodeIp", nodeIp);
            this.nodeIp = nodeIp;
            return this;
        }

        /**
         * <p>Page size.</p>
         * <ul>
         * <li>Start value: 1</li>
         * <li>Default value: 1</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>update</p>
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putBodyParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
            return this;
        }

        /**
         * <p>The search parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cputime</p>
         */
        public Builder searchParam(String searchParam) {
            this.putBodyParameter("SearchParam", searchParam);
            this.searchParam = searchParam;
            return this;
        }

        /**
         * <p>The search rule.<br>Valid values: &quot;=&quot;, &quot;&gt;&quot;, &quot;&gt;=&quot;, &quot;&lt;&quot;, and &quot;&lt;=&quot;</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        public Builder searchRule(String searchRule) {
            this.putBodyParameter("SearchRule", searchRule);
            this.searchRule = searchRule;
            return this;
        }

        /**
         * <p>The search value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        public Builder searchValue(String searchValue) {
            this.putBodyParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * <p>SQL ID.</p>
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
         * <p>Max length of the returned SQL text.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        public Builder sqlTextLength(Long sqlTextLength) {
            this.putBodyParameter("SqlTextLength", sqlTextLength);
            this.sqlTextLength = sqlTextLength;
            return this;
        }

        /**
         * <p>The start time of the monitoring data.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-12T04:38:38Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t4louaeei****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeOasAnomalySQLListRequest build() {
            return new DescribeOasAnomalySQLListRequest(this);
        } 

    } 

}
