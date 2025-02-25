// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnomalySQLListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAnomalySQLListRequest</p>
 */
public class DescribeAnomalySQLListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterCondition")
    private java.util.Map < String, ? > filterCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIp")
    private String nodeIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SQLId")
    private String SQLId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKeyWord")
    private String searchKeyWord;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchParameter")
    private String searchParameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchRule")
    private String searchRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchValue")
    private String searchValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortColumn")
    private String sortColumn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private DescribeAnomalySQLListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceptLanguage = builder.acceptLanguage;
        this.dbName = builder.dbName;
        this.endTime = builder.endTime;
        this.filterCondition = builder.filterCondition;
        this.instanceId = builder.instanceId;
        this.nodeIp = builder.nodeIp;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
        private String regionId; 
        private String acceptLanguage; 
        private String dbName; 
        private String endTime; 
        private java.util.Map < String, ? > filterCondition; 
        private String instanceId; 
        private String nodeIp; 
        private Integer pageNumber; 
        private Integer pageSize; 
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

        private Builder(DescribeAnomalySQLListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceptLanguage = request.acceptLanguage;
            this.dbName = request.dbName;
            this.endTime = request.endTime;
            this.filterCondition = request.filterCondition;
            this.instanceId = request.instanceId;
            this.nodeIp = request.nodeIp;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.SQLId = request.SQLId;
            this.searchKeyWord = request.searchKeyWord;
            this.searchParameter = request.searchParameter;
            this.searchRule = request.searchRule;
            this.searchValue = request.searchValue;
            this.sortColumn = request.sortColumn;
            this.sortOrder = request.sortOrder;
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
         * The language of the returned data.   
         * <p>
         * Default value: CN for a China site and EN for an International site.
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
         * The end time of the time range for querying suspicious SQL statements.   
         * <p>
         * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The filter condition.   
         * <p>
         * > <br> - All fields in OceanBase Database support filtering. <br> - You can write the key-value pair of a parameter in a JSON string in the JSON format to filter the parameter.
         */
        public Builder filterCondition(java.util.Map < String, ? > filterCondition) {
            String filterConditionShrink = shrink(filterCondition, "FilterCondition", "json");
            this.putBodyParameter("FilterCondition", filterConditionShrink);
            this.filterCondition = filterCondition;
            return this;
        }

        /**
         * InstanceId.
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
         * The number of the page to return.    
         * <p>
         * - Start value: 1   
         * - Default value: 1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of rows to return on each page.    
         * <p>
         * - Maximum value: 100   
         * - Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SQLID.
         */
        public Builder SQLId(String SQLId) {
            this.putBodyParameter("SQLId", SQLId);
            this.SQLId = SQLId;
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
        public Builder searchParameter(String searchParameter) {
            this.putBodyParameter("SearchParameter", searchParameter);
            this.searchParameter = searchParameter;
            return this;
        }

        /**
         * The search rule.   
         * <p>
         * Valid values: "=", ">", ">=", "<", and "<="
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
         * The sorted column.
         */
        public Builder sortColumn(String sortColumn) {
            this.putBodyParameter("SortColumn", sortColumn);
            this.sortColumn = sortColumn;
            return this;
        }

        /**
         * The sorting rule.
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The start time of the time range for querying suspicious SQL statements.   
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
        public DescribeAnomalySQLListRequest build() {
            return new DescribeAnomalySQLListRequest(this);
        } 

    } 

}
