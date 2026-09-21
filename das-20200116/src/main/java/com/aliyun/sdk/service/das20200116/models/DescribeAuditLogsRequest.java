// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeAuditLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditLogsRequest</p>
 */
public class DescribeAuditLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsyncRequestId")
    private String asyncRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUa")
    private String clientUa;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectRowRange")
    private String effectRowRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteTimeRange")
    private String executeTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    private String ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadWhiteList")
    private Boolean loadWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogQueryOpJson")
    private String logQueryOpJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogSource")
    private String logSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectKey")
    private String ossObjectKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAggQuery")
    private Boolean ruleAggQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleCategory")
    private String ruleCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlText")
    private String sqlText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private DescribeAuditLogsRequest(Builder builder) {
        super(builder);
        this.asyncRequestId = builder.asyncRequestId;
        this.clientIp = builder.clientIp;
        this.clientUa = builder.clientUa;
        this.currentPage = builder.currentPage;
        this.databaseName = builder.databaseName;
        this.effectRowRange = builder.effectRowRange;
        this.endTime = builder.endTime;
        this.executeTimeRange = builder.executeTimeRange;
        this.instanceName = builder.instanceName;
        this.ipType = builder.ipType;
        this.lang = builder.lang;
        this.loadWhiteList = builder.loadWhiteList;
        this.logQueryOpJson = builder.logQueryOpJson;
        this.logSource = builder.logSource;
        this.operateType = builder.operateType;
        this.ossObjectKey = builder.ossObjectKey;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.ruleAggQuery = builder.ruleAggQuery;
        this.ruleCategory = builder.ruleCategory;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.sqlText = builder.sqlText;
        this.startTime = builder.startTime;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncRequestId
     */
    public String getAsyncRequestId() {
        return this.asyncRequestId;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientUa
     */
    public String getClientUa() {
        return this.clientUa;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return effectRowRange
     */
    public String getEffectRowRange() {
        return this.effectRowRange;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return executeTimeRange
     */
    public String getExecuteTimeRange() {
        return this.executeTimeRange;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return loadWhiteList
     */
    public Boolean getLoadWhiteList() {
        return this.loadWhiteList;
    }

    /**
     * @return logQueryOpJson
     */
    public String getLogQueryOpJson() {
        return this.logQueryOpJson;
    }

    /**
     * @return logSource
     */
    public String getLogSource() {
        return this.logSource;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return ossObjectKey
     */
    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return ruleAggQuery
     */
    public Boolean getRuleAggQuery() {
        return this.ruleAggQuery;
    }

    /**
     * @return ruleCategory
     */
    public String getRuleCategory() {
        return this.ruleCategory;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
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
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DescribeAuditLogsRequest, Builder> {
        private String asyncRequestId; 
        private String clientIp; 
        private String clientUa; 
        private Integer currentPage; 
        private String databaseName; 
        private String effectRowRange; 
        private Long endTime; 
        private String executeTimeRange; 
        private String instanceName; 
        private String ipType; 
        private String lang; 
        private Boolean loadWhiteList; 
        private String logQueryOpJson; 
        private String logSource; 
        private String operateType; 
        private String ossObjectKey; 
        private Integer pageSize; 
        private String productCode; 
        private Long productId; 
        private Boolean ruleAggQuery; 
        private String ruleCategory; 
        private String ruleId; 
        private String ruleName; 
        private String sqlText; 
        private Long startTime; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditLogsRequest request) {
            super(request);
            this.asyncRequestId = request.asyncRequestId;
            this.clientIp = request.clientIp;
            this.clientUa = request.clientUa;
            this.currentPage = request.currentPage;
            this.databaseName = request.databaseName;
            this.effectRowRange = request.effectRowRange;
            this.endTime = request.endTime;
            this.executeTimeRange = request.executeTimeRange;
            this.instanceName = request.instanceName;
            this.ipType = request.ipType;
            this.lang = request.lang;
            this.loadWhiteList = request.loadWhiteList;
            this.logQueryOpJson = request.logQueryOpJson;
            this.logSource = request.logSource;
            this.operateType = request.operateType;
            this.ossObjectKey = request.ossObjectKey;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.ruleAggQuery = request.ruleAggQuery;
            this.ruleCategory = request.ruleCategory;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.sqlText = request.sqlText;
            this.startTime = request.startTime;
            this.userName = request.userName;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2c548e83-1473-4fda-b3dc-5a189074ead5</p>
         */
        public Builder asyncRequestId(String asyncRequestId) {
            this.putQueryParameter("AsyncRequestId", asyncRequestId);
            this.asyncRequestId = asyncRequestId;
            return this;
        }

        /**
         * <p>The IP address of the request client.</p>
         * 
         * <strong>example:</strong>
         * <p>11.26.118.7</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The client type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder clientUa(String clientUa) {
            this.putQueryParameter("ClientUa", clientUa);
            this.clientUa = clientUa;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDB</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The range of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>in[1 33]</p>
         */
        public Builder effectRowRange(String effectRowRange) {
            this.putQueryParameter("EffectRowRange", effectRowRange);
            this.effectRowRange = effectRowRange;
            return this;
        }

        /**
         * <p>The end time of the alert log. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15682887991222</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The range of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>in[1000 2000]</p>
         */
        public Builder executeTimeRange(String executeTimeRange) {
            this.putQueryParameter("ExecuteTimeRange", executeTimeRange);
            this.executeTimeRange = executeTimeRange;
            return this;
        }

        /**
         * <p>The name of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4ni1cezz5y3xxxx</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong> (default): non-Alibaba Cloud service.</p>
         * </li>
         * <li><p><strong>aliyun</strong>: Alibaba Cloud service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * <p>The language of the request and response. Default value: zh_cn. Valid values:</p>
         * <ul>
         * <li>zh_cn: Chinese.</li>
         * <li>en_us: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies whether to load the whitelist status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder loadWhiteList(Boolean loadWhiteList) {
            this.putQueryParameter("LoadWhiteList", loadWhiteList);
            this.loadWhiteList = loadWhiteList;
            return this;
        }

        /**
         * LogQueryOpJson.
         */
        public Builder logQueryOpJson(String logQueryOpJson) {
            this.putQueryParameter("LogQueryOpJson", logQueryOpJson);
            this.logQueryOpJson = logQueryOpJson;
            return this;
        }

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>SLOW_SQL</p>
         */
        public Builder logSource(String logSource) {
            this.putQueryParameter("LogSource", logSource);
            this.logSource = logSource;
            return this;
        }

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>Insert</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The key of the OSS storage object.</p>
         * 
         * <strong>example:</strong>
         * <p>N.A</p>
         */
        public Builder ossObjectKey(String ossObjectKey) {
            this.putQueryParameter("OssObjectKey", ossObjectKey);
            this.ossObjectKey = ossObjectKey;
            return this;
        }

        /**
         * <p>The maximum number of records per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the product to which the data asset belongs. Valid values: <strong>RDS, PolarDB, PolarDB-X 2.0</strong>, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID that corresponds to the product name to which the data object belongs. Valid values:</p>
         * <ul>
         * <li>3: ADB-MYSQL</li>
         * <li>5: RDS</li>
         * <li>7: PolarDB-X</li>
         * <li>8: PolarDB</li>
         * <li>9: ADB-PG</li>
         * <li>11: MongoDB</li>
         * <li>25: Redis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>Specifies whether to use aggregate query.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ruleAggQuery(Boolean ruleAggQuery) {
            this.putQueryParameter("RuleAggQuery", ruleAggQuery);
            this.ruleAggQuery = ruleAggQuery;
            return this;
        }

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder ruleCategory(String ruleCategory) {
            this.putQueryParameter("RuleCategory", ruleCategory);
            this.ruleCategory = ruleCategory;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>867028</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the audit policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The content of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM test where name = \&quot;das\&quot;</p>
         */
        public Builder sqlText(String sqlText) {
            this.putQueryParameter("SqlText", sqlText);
            this.sqlText = sqlText;
            return this;
        }

        /**
         * <p>The start time of the alert log, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DescribeAuditLogsRequest build() {
            return new DescribeAuditLogsRequest(this);
        } 

    } 

}
