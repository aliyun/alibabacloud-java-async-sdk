// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListTablesRequest} extends {@link RequestModel}
 *
 * <p>ListTablesRequest</p>
 */
public class ListTablesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentMetaEntityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentMetaEntityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableTypes")
    private java.util.List<String> tableTypes;

    private ListTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.parentMetaEntityId = builder.parentMetaEntityId;
        this.sortBy = builder.sortBy;
        this.tableTypes = builder.tableTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return parentMetaEntityId
     */
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return tableTypes
     */
    public java.util.List<String> getTableTypes() {
        return this.tableTypes;
    }

    public static final class Builder extends Request.Builder<ListTablesRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String parentMetaEntityId; 
        private String sortBy; 
        private java.util.List<String> tableTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.parentMetaEntityId = request.parentMetaEntityId;
            this.sortBy = request.sortBy;
            this.tableTypes = request.tableTypes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The parent metadata entity ID. You can refer to the responses of the ListDatabases or ListSchemas operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Description of concepts related to metadata entities.</a></p>
         * <ul>
         * <li>The parent metadata entity is a database: The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database Name}</code>. Use an empty string (`&quot;&quot;`) as a placeholder for any non-existent level.</li>
         * <li>The parent metadata entity is a database schema:. The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database Name}:${Schema Name}</code>. Use an empty string (`&quot;&quot;`) as a placeholder for any non-existent level.</li>
         * </ul>
         * <blockquote>
         * <p> The schema level in <code>ParentMetaEntityId</code> is supported only for database types that support schemas, such as MaxCompute (with schema enabled), Hologres, PostgreSQL, SQL Server, HybridDB for PostgreSQL, and Oracle.``</p>
         * </blockquote>
         * <blockquote>
         * <p> For MaxCompute and DLF types, use empty strings as the instance ID. For MaxCompute, the database name is the same as the project name.</p>
         * </blockquote>
         * <blockquote>
         * <p> For the StarRocks type, the catalog identifier is the catalog name. For the DLF type, it refers to the catalog ID. Other types do not support a catalog-level hierarchy and the catalog identifier must be replaced with an empty string as a placeholder.</p>
         * </blockquote>
         * <p>Examples of common ParentMetaEntityId formats</p>
         * <p><code>maxcompute-project:::project_name</code></p>
         * <p><code>maxcompute-schema:::project_name:schema_name</code> (for MaxCompute projects with schema enabled)</p>
         * <p><code>dlf-database::catalog_id:database_name</code></p>
         * <p><code>hms-database:instance_id::database_name</code></p>
         * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
         * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
         * <blockquote>
         * <p><br><code>instance_id</code>: The instance ID, required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The JDBC connection string that has been URL encoded, required for the data source registered via a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-schema:123456XXX::test_project_with_schema:default
         * maxcompute-project:123456XXX::test_project_without_schema
         * dlf-database:123456XXX:test_catalog:test_db
         * hms-database:c-abc123xxx::test_db
         * holo-schema:h-abc123xxx::test_db:test_schema
         * mysql-database:jdbc%3Amysql%3A%2F%2F127.0.0.1%3A3306%2Ftest_db::test_db</p>
         */
        public Builder parentMetaEntityId(String parentMetaEntityId) {
            this.putQueryParameter("ParentMetaEntityId", parentMetaEntityId);
            this.parentMetaEntityId = parentMetaEntityId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * TableTypes.
         */
        public Builder tableTypes(java.util.List<String> tableTypes) {
            String tableTypesShrink = shrink(tableTypes, "TableTypes", "simple");
            this.putQueryParameter("TableTypes", tableTypesShrink);
            this.tableTypes = tableTypes;
            return this;
        }

        @Override
        public ListTablesRequest build() {
            return new ListTablesRequest(this);
        } 

    } 

}
