// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopSQLListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTopSQLListRequest</p>
 */
public class DescribeTopSQLListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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

    private DescribeTopSQLListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbName = builder.dbName;
        this.endTime = builder.endTime;
        this.filterCondition = builder.filterCondition;
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

    public static DescribeTopSQLListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTopSQLListRequest, Builder> {
        private String regionId; 
        private String dbName; 
        private String endTime; 
        private java.util.Map < String, ? > filterCondition; 
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

        private Builder(DescribeTopSQLListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbName = request.dbName;
            this.endTime = request.endTime;
            this.filterCondition = request.filterCondition;
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
         * The number of block index cache hits.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The SQL type.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The average number of logical reads of the SQL statement during the specified period of time.   
         * <p>
         * The value covers the numbers of reads of different caches and the number of disk I/Os. It is an important metric for measuring the SQL filtering performance.   
         * 
         * > <br> A higher ratio of the number of logical reads to the number of returned rows indicates poorer filtering performance. General causes include non-standard content written by SQL statements, non-standard table indexes created, and non-standard SQL execution plans.
         */
        public Builder filterCondition(java.util.Map < String, ? > filterCondition) {
            String filterConditionShrink = shrink(filterCondition, "FilterCondition", "json");
            this.putBodyParameter("FilterCondition", filterConditionShrink);
            this.filterCondition = filterCondition;
            return this;
        }

        /**
         * The number of failures.
         */
        public Builder nodeIp(String nodeIp) {
            this.putBodyParameter("NodeIp", nodeIp);
            this.nodeIp = nodeIp;
            return this;
        }

        /**
         * The queuing time, in ms.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of row cache hits.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The I/O wait time, in ms.
         */
        public Builder SQLId(String SQLId) {
            this.putBodyParameter("SQLId", SQLId);
            this.SQLId = SQLId;
            return this;
        }

        /**
         * The number of retries.
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putBodyParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
            return this;
        }

        /**
         * SQLID.
         */
        public Builder searchParameter(String searchParameter) {
            this.putBodyParameter("SearchParameter", searchParameter);
            this.searchParameter = searchParameter;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder searchRule(String searchRule) {
            this.putBodyParameter("SearchRule", searchRule);
            this.searchRule = searchRule;
            return this;
        }

        /**
         * The number of Bloom filter cache hits.
         */
        public Builder searchValue(String searchValue) {
            this.putBodyParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * The number of rows read from the disk.
         */
        public Builder sortColumn(String sortColumn) {
            this.putBodyParameter("SortColumn", sortColumn);
            this.sortColumn = sortColumn;
            return this;
        }

        /**
         * The list of top SQL statements.
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The maximum response time, in ms.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The average CPU time, in ms.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeTopSQLListRequest build() {
            return new DescribeTopSQLListRequest(this);
        } 

    } 

}
