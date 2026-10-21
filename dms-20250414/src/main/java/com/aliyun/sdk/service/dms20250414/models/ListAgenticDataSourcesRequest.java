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
 * {@link ListAgenticDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListAgenticDataSourcesRequest</p>
 */
public class ListAgenticDataSourcesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSource")
    private String instanceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    private ListAgenticDataSourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbType = builder.dbType;
        this.host = builder.host;
        this.instanceSource = builder.instanceSource;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.port = builder.port;
        this.schema = builder.schema;
        this.searchKey = builder.searchKey;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticDataSourcesRequest create() {
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
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceSource
     */
    public String getInstanceSource() {
        return this.instanceSource;
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
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListAgenticDataSourcesRequest, Builder> {
        private String regionId; 
        private String dbType; 
        private String host; 
        private String instanceSource; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer port; 
        private String schema; 
        private String searchKey; 
        private Integer state; 

        private Builder() {
            super();
        } 

        private Builder(ListAgenticDataSourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbType = request.dbType;
            this.host = request.host;
            this.instanceSource = request.instanceSource;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.port = request.port;
            this.schema = request.schema;
            this.searchKey = request.searchKey;
            this.state = request.state;
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
         * <p>Filters data sources by type. If you leave this parameter empty, no restriction is applied. Valid values: MYSQL, POSTGRESQL, ORACLE, SQLSERVER, MARIADB, POLARDB, POLARDB_POSTGRESQL, POLARDB_ORACLE, OCEANBASEX, DRDS, ADB_MYSQL, ADB_POSTGRESQL, CLICKHOUSE, SELECTDB, STARROCKS, HOLOGRES, MAXCOMPUTE, ES_REST, and TRINO.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>Filters data sources by endpoint. If you leave this parameter empty, no restriction is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.example.com</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>Filters data sources by source. If you leave this parameter empty, no restriction is applied. Valid values:</p>
         * <ul>
         * <li>RDS: ApsaraDB instance</li>
         * <li>PUBLIC_OWN: self-managed database on the public network</li>
         * <li>ECS_OWN: self-managed database on an ECS instance</li>
         * <li>GATEWAY: connected through Database Gateway</li>
         * <li>VPC_IDC: connected over a VPC or IDC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceSource(String instanceSource) {
            this.putQueryParameter("InstanceSource", instanceSource);
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * <p>The number of entries to return per page. Default value: 20. Maximum value: 200.</p>
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
         * <p>The pagination cursor. Leave this parameter empty when you query the first page. When you query subsequent pages, pass the NextToken value returned from the previous request.</p>
         * 
         * <strong>example:</strong>
         * <p>page-2-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Filters data sources by connection port. If you leave this parameter empty, no restriction is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>Filters data sources by connection target name. The meaning of this parameter varies based on the data source type. If you leave this parameter empty, no restriction is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>postgres</p>
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * <p>Performs a fuzzy search by data source name or endpoint. If you leave this parameter empty, no fuzzy search is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>Filters data sources by status. If you leave this parameter empty, no restriction is applied. Valid values:</p>
         * <ul>
         * <li>0: normal</li>
         * <li>-1: deleted</li>
         * <li>-2: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder state(Integer state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListAgenticDataSourcesRequest build() {
            return new ListAgenticDataSourcesRequest(this);
        } 

    } 

}
