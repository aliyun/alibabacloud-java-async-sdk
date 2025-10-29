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

    private GetTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.includeBusinessMetadata = builder.includeBusinessMetadata;
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

    public static final class Builder extends Request.Builder<GetTableRequest, Builder> {
        private String regionId; 
        private String id; 
        private Boolean includeBusinessMetadata; 

        private Builder() {
            super();
        } 

        private Builder(GetTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.includeBusinessMetadata = request.includeBusinessMetadata;
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
         * <p>The ID. You can refer to the response of the ListTables operation and the <a href="https://help.aliyun.com/document_detail/2880092.html">concepts related to metadata entities.</a></p>
         * <p>The format: <code>${EntityType}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Table name}</code>. Use empty strings as placeholders for levels that do not exist.</p>
         * <blockquote>
         * <p> For the MaxCompute and DLF types, use an empty string as the placeholder for the instance ID.</p>
         * </blockquote>
         * <blockquote>
         * <p> The catalog identifier of the StarRocks is the catalog name, and the catalog identifier of the DLF type is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
         * </blockquote>
         * <blockquote>
         * <p> For MaxCompute, the database name refers to the MaxCompute project name. If the project has schema enabled, you must specify the schema name. Otherwise, use an empty string as the placeholder for the schema name.</p>
         * </blockquote>
         * <p>Examples of common ID formats</p>
         * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
         * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
         * <p><code>hms-table:instance_id::database_name::table_name</code></p>
         * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
         * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
         * <blockquote>
         * <p><br><code>instance_id</code>: The instance ID, required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, which is required when the data source is registered via a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name. For the MaxCompute type, this is required only if the project has enabled schema. Otherwise, use an empty string as a placeholder.<br><code>table_name</code>: The table name.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:123456XXX::test_project::test_tbl
         * dlf-table:123456XXX:test_catalog:test_db::test_tbl
         * hms-table:c-abc123xxx::test_db::test_tbl
         * holo-table:h-abc123xxx::test_db:test_schema:test_tbl</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Specifies whether to include metadata. Default: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeBusinessMetadata(Boolean includeBusinessMetadata) {
            this.putQueryParameter("IncludeBusinessMetadata", includeBusinessMetadata);
            this.includeBusinessMetadata = includeBusinessMetadata;
            return this;
        }

        @Override
        public GetTableRequest build() {
            return new GetTableRequest(this);
        } 

    } 

}
