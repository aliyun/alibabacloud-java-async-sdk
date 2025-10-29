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
         * <p>The comment. Supports fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The name. Supports fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The order in which the tables are sorted. Default value: Asc. Valid values:</p>
         * <ul>
         * <li>Asc</li>
         * <li>Desc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <li>The parent metadata entity is a database schema: The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database Name}:${Schema Name}</code>. Use an empty string (`&quot;&quot;`) as a placeholder for any non-existent level.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The schema level in <code>ParentMetaEntityId</code> is supported only for database services, such as <code>MaxCompute (with schema enabled), Hologres, PostgreSQL, SQL Server, HybridDB for PostgreSQL, and Oracle</code>.</p>
         * </li>
         * <li><p>For the MaxCompute and DLF types, use an empty string as the placeholder for the instance ID. For MaxCompute, the database name is the same as the project name.</p>
         * </li>
         * <li><p>For StarRocks, the catalog identifier is the catalog name. For DLF, it is the catalog ID. Other types do not support the catalog level and you can use an empty string as a placeholder.</p>
         * </li>
         * </ul>
         * <p>Examples of common ParentMetaEntityId formats</p>
         * <ul>
         * <li><code>maxcompute-project:::project_name</code></li>
         * <li><code>maxcompute-schema:::project_name:schema_name</code> (for MaxCompute projects with schema enabled)</li>
         * <li><code>dlf-database::catalog_id:database_name</code></li>
         * <li><code>hms-database:instance_id::database_name</code></li>
         * <li><code>holo-schema:instance_id::database_name:schema_name</code></li>
         * <li><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.</p>
         * </li>
         * <li><p><code>encoded_jdbc_url</code>: The URLEncoded JDBC connection string, which is requiredwhen the data source is registered using a connection string.</p>
         * </li>
         * <li><p><code>catalog_id</code>: The DLF catalog ID.</p>
         * </li>
         * <li><p><code>project_name</code>: The MaxCompute project name.</p>
         * </li>
         * <li><p><code>database_name</code>: The database name.</p>
         * </li>
         * <li><p><code>schema_name</code>: The schema name.</p>
         * </li>
         * </ul>
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
         * <p>The sort field. Default value: CreateTime. Valid values:</p>
         * <ul>
         * <li>CreateTime</li>
         * <li>ModifyTime</li>
         * <li>Name</li>
         * <li>TableType</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The list of table types to query. If it&quot;s left empty, all types will be queried.</p>
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
