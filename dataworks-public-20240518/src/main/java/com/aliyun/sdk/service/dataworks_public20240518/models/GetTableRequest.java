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
 * {@link GetTableRequest} extends {@link RequestModel}
 *
 * <p>GetTableRequest</p>
 */
public class GetTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeBusinessMetadata")
    private Boolean includeBusinessMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeExtendedProperties")
    private Boolean includeExtendedProperties;

    private GetTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.includeBusinessMetadata = builder.includeBusinessMetadata;
        this.includeExtendedProperties = builder.includeExtendedProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return includeBusinessMetadata
     */
    public Boolean getIncludeBusinessMetadata() {
        return this.includeBusinessMetadata;
    }

    /**
     * @return includeExtendedProperties
     */
    public Boolean getIncludeExtendedProperties() {
        return this.includeExtendedProperties;
    }

    public static final class Builder extends Request.Builder<GetTableRequest, Builder> {
        private String regionId; 
        private String id; 
        private Boolean includeBusinessMetadata; 
        private Boolean includeExtendedProperties; 

        private Builder() {
            super();
        } 

        private Builder(GetTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.includeBusinessMetadata = request.includeBusinessMetadata;
            this.includeExtendedProperties = request.includeExtendedProperties;
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
         * <p>The ID of the table. You can obtain this value from the response of the ListTables operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
         * <p>The format is <code>${EntityType}:${InstanceID or encoded URL}:${DataCatalogIdentifier}:${DatabaseName}:${SchemaName}:${TableName}</code>. Use an empty string as a placeholder for levels that do not exist.</p>
         * <blockquote>
         * <p>For MaxCompute and DLF types, use an empty string as a placeholder for the instance ID.</p>
         * </blockquote>
         * <blockquote>
         * <p>For StarRocks, the data catalog identifier is the catalog name. For DLF, the data catalog identifier is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
         * </blockquote>
         * <blockquote>
         * <p>For MaxCompute, the database name is the MaxCompute project name. Projects with the three-layer model enabled require a schema name. For projects without the three-layer model enabled, use an empty string as a placeholder for the schema name.</p>
         * </blockquote>
         * <p>The following are ID format examples for common types:</p>
         * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
         * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
         * <p><code>hms-table:instance_id::database_name::table_name</code></p>
         * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
         * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
         * <blockquote>
         * <p>Where<br><code>instance_id</code>: The instance ID. Required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. Required when the data source is registered by using a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name. For MaxCompute, this is required only when the three-layer model is enabled for the project. Otherwise, use an empty string as a placeholder.<br><code>table_name</code>: The table name.</p>
         * </blockquote>
         * <p>Recommended procedure for obtaining this parameter: First, call ListCrawlers to obtain the MetaEntityId of the metadata crawler. For types that include a data catalog level, such as DLF and StarRocks, call ListCatalogs to obtain the catalog ID. Then, call ListDatabases to obtain the database ID. If necessary, call ListSchemas to obtain the schema ID. Finally, call ListTables to obtain the target table ID, and use the returned table ID as the Id for this operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Specifies whether to include business metadata. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeBusinessMetadata(Boolean includeBusinessMetadata) {
            this.putQueryParameter("IncludeBusinessMetadata", includeBusinessMetadata);
            this.includeBusinessMetadata = includeBusinessMetadata;
            return this;
        }

        /**
         * <p>Specifies whether to return extended properties. Set this parameter to <code>true</code> to return extended properties, or <code>false</code> to not return them.</p>
         */
        public Builder includeExtendedProperties(Boolean includeExtendedProperties) {
            this.putQueryParameter("IncludeExtendedProperties", includeExtendedProperties);
            this.includeExtendedProperties = includeExtendedProperties;
            return this;
        }

        @Override
        public GetTableRequest build() {
            return new GetTableRequest(this);
        } 

    } 

}
