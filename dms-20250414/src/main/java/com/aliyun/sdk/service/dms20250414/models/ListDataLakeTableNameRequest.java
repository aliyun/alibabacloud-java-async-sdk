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
 * {@link ListDataLakeTableNameRequest} extends {@link RequestModel}
 *
 * <p>ListDataLakeTableNameRequest</p>
 */
public class ListDataLakeTableNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableNamePattern")
    private String tableNamePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private ListDataLakeTableNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogName = builder.catalogName;
        this.dbName = builder.dbName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.tableNamePattern = builder.tableNamePattern;
        this.tableType = builder.tableType;
        this.tid = builder.tid;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataLakeTableNameRequest create() {
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
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
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
     * @return tableNamePattern
     */
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDataLakeTableNameRequest, Builder> {
        private String regionId; 
        private String catalogName; 
        private String dbName; 
        private Integer maxResults; 
        private String nextToken; 
        private String tableNamePattern; 
        private String tableType; 
        private Long tid; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataLakeTableNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogName = request.catalogName;
            this.dbName = request.dbName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.tableNamePattern = request.tableNamePattern;
            this.tableType = request.tableType;
            this.tid = request.tid;
            this.workspaceId = request.workspaceId;
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
         * <p>The name of the data catalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. The maximum value is 100.</p>
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
         * <p>The token that is used to retrieve the next page of results. Set this parameter to the value of NextToken that is returned from the last call. You do not need to specify this parameter for the first call.</p>
         * <ul>
         * <li><p>If <strong>NextToken</strong> is empty, no subsequent query is required.</p>
         * </li>
         * <li><p>If <strong>NextToken</strong> has a return value, the value is the token for the next query.</p>
         * </li>
         * </ul>
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
         * <p>The regular expression used to match table names.</p>
         * 
         * <strong>example:</strong>
         * <p>.*</p>
         */
        public Builder tableNamePattern(String tableNamePattern) {
            this.putQueryParameter("TableNamePattern", tableNamePattern);
            this.tableNamePattern = tableNamePattern;
            return this;
        }

        /**
         * <p>The type of the table. Valid values:</p>
         * <ul>
         * <li><p>MANAGED_TABLE: Internal table.</p>
         * </li>
         * <li><p>EXTERNAL_TABLE: Foreign table.</p>
         * </li>
         * <li><p>VIRTUAL_VIEW: Virtual view.</p>
         * </li>
         * <li><p>INDEX_TABLE: Index table.</p>
         * </li>
         * <li><p>MATERIALIZED_VIEW: Materialized view.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANAGED_TABLE</p>
         */
        public Builder tableType(String tableType) {
            this.putQueryParameter("TableType", tableType);
            this.tableType = tableType;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <blockquote>
         * <p>Hover over your profile picture in the upper-right corner of the DMS console to obtain the tenant ID. For details, see <a href="https://help.aliyun.com/document_detail/181330.html">View tenant information</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3****</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDataLakeTableNameRequest build() {
            return new ListDataLakeTableNameRequest(this);
        } 

    } 

}
