// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListAgenticTableBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>ListAgenticTableBaseInfoRequest</p>
 */
public class ListAgenticTableBaseInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortFieldName")
    private String sortFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    private ListAgenticTableBaseInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseUuid = builder.databaseUuid;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchKey = builder.searchKey;
        this.sortFieldName = builder.sortFieldName;
        this.sortOrder = builder.sortOrder;
        this.tableType = builder.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticTableBaseInfoRequest create() {
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
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return sortFieldName
     */
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    public static final class Builder extends Request.Builder<ListAgenticTableBaseInfoRequest, Builder> {
        private String regionId; 
        private String databaseUuid; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchKey; 
        private String sortFieldName; 
        private String sortOrder; 
        private String tableType; 

        private Builder() {
            super();
        } 

        private Builder(ListAgenticTableBaseInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseUuid = request.databaseUuid;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchKey = request.searchKey;
            this.sortFieldName = request.sortFieldName;
            this.sortOrder = request.sortOrder;
            this.tableType = request.tableType;
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
         * <p>The UUID of the database to which the table belongs. You can obtain the UUID by calling the ListAgenticDatabase or SearchAgenticDatabase operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-fp9K7r***</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.putQueryParameter("DatabaseUuid", databaseUuid);
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the NextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>f056501ada12****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The search keyword. The system matches the keyword against table names. The results are sorted by exact match, prefix match, and contains match. Within the same match level, the results are sorted by the field specified by SortFieldName.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The field by which to sort the results. This parameter is case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>name</strong>: Sorts the results by table name. This value is recommended.</li>
         * <li><strong>numRows</strong>: Sorts the results by the number of rows.</li>
         * <li><strong>storeCapacity</strong>: Sorts the results by the storage capacity.</li>
         * </ul>
         * <p>If you specify other values, the request fails. If you do not specify this parameter, the results are returned in the default order, and the SortOrder parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder sortFieldName(String sortFieldName) {
            this.putQueryParameter("SortFieldName", sortFieldName);
            this.sortFieldName = sortFieldName;
            return this;
        }

        /**
         * <p>The sort order. This parameter takes effect only when SortFieldName is specified. This parameter is not case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>ASC</strong>: Sorts the results in ascending order. This is the default value and is recommended.</li>
         * <li><strong>DESC</strong>: Sorts the results in descending order.</li>
         * </ul>
         * <p>If you specify other values, the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The table type. The results are strictly filtered by this type. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: Regular table.</li>
         * <li><strong>VIEW</strong>: View.</li>
         * <li><strong>FOREIGN</strong>: Foreign table.</li>
         * <li><strong>SYNONYM</strong>: Synonym. This value is supported only for Oracle data sources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder tableType(String tableType) {
            this.putQueryParameter("TableType", tableType);
            this.tableType = tableType;
            return this;
        }

        @Override
        public ListAgenticTableBaseInfoRequest build() {
            return new ListAgenticTableBaseInfoRequest(this);
        } 

    } 

}
