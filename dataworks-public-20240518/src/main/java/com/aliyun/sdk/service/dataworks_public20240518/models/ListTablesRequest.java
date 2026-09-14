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
    @com.aliyun.core.annotation.NameInMap("IncludeExtendedProperties")
    private Boolean includeExtendedProperties;

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
        this.includeExtendedProperties = builder.includeExtendedProperties;
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
     * @return includeExtendedProperties
     */
    public Boolean getIncludeExtendedProperties() {
        return this.includeExtendedProperties;
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
        private Boolean includeExtendedProperties; 
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
            this.includeExtendedProperties = request.includeExtendedProperties;
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
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The comment. Fuzzy match is supported.</p>
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
         * <p>Specifies whether to return extended properties. Set this parameter to <code>true</code> to return extended properties or <code>false</code> to not return them.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeExtendedProperties(Boolean includeExtendedProperties) {
            this.putQueryParameter("IncludeExtendedProperties", includeExtendedProperties);
            this.includeExtendedProperties = includeExtendedProperties;
            return this;
        }

        /**
         * <p>The name. Fuzzy match is supported.</p>
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
         * <p>The sort order. Default value: Asc. Valid values:</p>
         * <ul>
         * <li>Asc: ascending order</li>
         * <li>Desc: descending order</li>
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
         * <p>The page size. Default value: 10. Maximum value: 100.</p>
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
         * <p>The ID of the parent-level metadata entity. You can obtain this value from the response of the ListDatabases or ListSchemas operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
         * <ul>
         * <li><p>The value can be the database to which the table belongs. The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${InstanceID or encoded URL}:${DataCatalogIdentifier}:${DatabaseName}</code>. Use an empty string as a placeholder for levels that do not exist.</p>
         * </li>
         * <li><p>The value can also be the database schema to which the table belongs. The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${InstanceID or encoded URL}:${DataCatalogIdentifier}:${DatabaseName}:${SchemaName}</code>. Use an empty string as a placeholder for levels that do not exist.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can set <code>ParentMetaEntityId</code> to a database schema only when the database type supports schemas (<code>maxcompute/holo/postgresql/sqlserver/hybriddb_for_postgresql/oracle</code>, where the three-layer model must be enabled for the maxcompute type). Otherwise, you can set it only to a database.</li>
         * <li>For the maxcompute and dlf types, use an empty string as a placeholder for the instance ID. For the maxcompute type, the database name is the MaxCompute project name.</li>
         * <li>For the starrocks type, the data catalog identifier is the catalog name. For the dlf type, the data catalog identifier is the catalog ID. Other types do not support the catalog level, and you can use an empty string as a placeholder.</li>
         * </ul>
         * </blockquote>
         * <p>The following examples show the format of ParentMetaEntityId for common types:</p>
         * <ul>
         * <li><p><code>maxcompute-project:::project_name</code></p>
         * </li>
         * <li><p><code>maxcompute-schema:::project_name:schema_name</code> (only when the three-layer model is enabled for the project)</p>
         * </li>
         * <li><p><code>dlf-database::catalog_id:database_name</code></p>
         * </li>
         * <li><p><code>hms-database:instance_id::database_name</code></p>
         * </li>
         * <li><p><code>holo-schema:instance_id::database_name:schema_name</code></p>
         * </li>
         * <li><p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Where:  </p>
         * <ul>
         * <li><code>instance_id</code>: The instance ID. This value is required when the data source is registered in instance mode.</li>
         * <li><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This value is required when the data source is registered by using a connection string.</li>
         * <li><code>catalog_id</code>: The DLF catalog ID.</li>
         * <li><code>project_name</code>: The MaxCompute project name.</li>
         * <li><code>database_name</code>: The database name.</li>
         * <li><code>schema_name</code>: The schema name.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-project:::project_name</p>
         */
        public Builder parentMetaEntityId(String parentMetaEntityId) {
            this.putQueryParameter("ParentMetaEntityId", parentMetaEntityId);
            this.parentMetaEntityId = parentMetaEntityId;
            return this;
        }

        /**
         * <p>The field by which to sort the results. Default value: CreateTime. Valid values:</p>
         * <ul>
         * <li>CreateTime: creation time</li>
         * <li>ModifyTime: modification time</li>
         * <li>Name: name</li>
         * <li>TableType: table type</li>
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
         * <p>The list of table types to query. If this parameter is left empty, all types are queried.</p>
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
