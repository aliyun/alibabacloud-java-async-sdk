// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnomalySQLListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAnomalySQLListRequest</p>
 */
public class DescribeAnomalySQLListRequest extends Request {
    @Body
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Body
    @NameInMap("DbName")
    private String dbName;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("FilterCondition")
    private java.util.Map < String, ? > filterCondition;

    @Body
    @NameInMap("NodeIp")
    private String nodeIp;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("SQLId")
    private String SQLId;

    @Body
    @NameInMap("SearchKeyWord")
    private String searchKeyWord;

    @Body
    @NameInMap("SearchParameter")
    private String searchParameter;

    @Body
    @NameInMap("SearchRule")
    private String searchRule;

    @Body
    @NameInMap("SearchValue")
    private String searchValue;

    @Body
    @NameInMap("SortColumn")
    private String sortColumn;

    @Body
    @NameInMap("SortOrder")
    private String sortOrder;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DescribeAnomalySQLListRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.dbName = builder.dbName;
        this.endTime = builder.endTime;
        this.filterCondition = builder.filterCondition;
        this.nodeIp = builder.nodeIp;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.SQLId = builder.SQLId;
        this.searchKeyWord = builder.searchKeyWord;
        this.searchParameter = builder.searchParameter;
        this.searchRule = builder.searchRule;
        this.searchValue = builder.searchValue;
        this.sortColumn = builder.sortColumn;
        this.sortOrder = builder.sortOrder;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnomalySQLListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return filterCondition
     */
    public java.util.Map < String, ? > getFilterCondition() {
        return this.filterCondition;
    }

    /**
     * @return nodeIp
     */
    public String getNodeIp() {
        return this.nodeIp;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return SQLId
     */
    public String getSQLId() {
        return this.SQLId;
    }

    /**
     * @return searchKeyWord
     */
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    /**
     * @return searchParameter
     */
    public String getSearchParameter() {
        return this.searchParameter;
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
     * @return sortColumn
     */
    public String getSortColumn() {
        return this.sortColumn;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
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

    public static final class Builder extends Request.Builder<DescribeAnomalySQLListRequest, Builder> {
        private String acceptLanguage; 
        private String dbName; 
        private String endTime; 
        private java.util.Map < String, ? > filterCondition; 
        private String nodeIp; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String SQLId; 
        private String searchKeyWord; 
        private String searchParameter; 
        private String searchRule; 
        private String searchValue; 
        private String sortColumn; 
        private String sortOrder; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAnomalySQLListRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.dbName = response.dbName;
            this.endTime = response.endTime;
            this.filterCondition = response.filterCondition;
            this.nodeIp = response.nodeIp;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.SQLId = response.SQLId;
            this.searchKeyWord = response.searchKeyWord;
            this.searchParameter = response.searchParameter;
            this.searchRule = response.searchRule;
            this.searchValue = response.searchValue;
            this.sortColumn = response.sortColumn;
            this.sortOrder = response.sortOrder;
            this.startTime = response.startTime;
            this.tenantId = response.tenantId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * 数据库名称
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 过滤条件
         */
        public Builder filterCondition(java.util.Map < String, ? > filterCondition) {
            this.putBodyParameter("FilterCondition", filterCondition);
            this.filterCondition = filterCondition;
            return this;
        }

        /**
         * 节点ip
         */
        public Builder nodeIp(String nodeIp) {
            this.putBodyParameter("NodeIp", nodeIp);
            this.nodeIp = nodeIp;
            return this;
        }

        /**
         * 分页查询的页码。 起始值：1 默认值：1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页查询时设置的每页行数。 最大值：100 默认值：10
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 地域ID
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SQLID
         */
        public Builder SQLId(String SQLId) {
            this.putBodyParameter("SQLId", SQLId);
            this.SQLId = SQLId;
            return this;
        }

        /**
         * 关键字查询
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putBodyParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
            return this;
        }

        /**
         * 参数查询
         */
        public Builder searchParameter(String searchParameter) {
            this.putBodyParameter("SearchParameter", searchParameter);
            this.searchParameter = searchParameter;
            return this;
        }

        /**
         * 查询规则
         */
        public Builder searchRule(String searchRule) {
            this.putBodyParameter("SearchRule", searchRule);
            this.searchRule = searchRule;
            return this;
        }

        /**
         * 查询值
         */
        public Builder searchValue(String searchValue) {
            this.putBodyParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * 排序列
         */
        public Builder sortColumn(String sortColumn) {
            this.putBodyParameter("SortColumn", sortColumn);
            this.sortColumn = sortColumn;
            return this;
        }

        /**
         * 排序规则
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * 起始时间
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 租户ID
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeAnomalySQLListRequest build() {
            return new DescribeAnomalySQLListRequest(this);
        } 

    } 

}
