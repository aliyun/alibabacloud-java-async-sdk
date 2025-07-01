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
         * <p>The table ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
         * <p>The common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Schema name}:${Table name}</code>. If a level does not exist, specify an empty string as a placeholder.</p>
         * <blockquote>
         * <p> For MaxCompute and DLF data sources, specify an empty string at the Instance ID level.</p>
         * </blockquote>
         * <blockquote>
         * <p> For StarRocks data sources, specify a catalog name at the Catalog identifier level. For DLF data sources, specify a catalog ID at the Catalog identifier level. Other types of data sources do not support the Catalog identifier level. You can specify an empty string as a placeholder.</p>
         * </blockquote>
         * <blockquote>
         * <p> For MaxCompute data sources, specify a MaxCompute project name at the Database name level. If the three-layer model is enabled for your MaxCompute project, you must specify a schema name at the Schema name level. Otherwise, you can specify an empty string as a placeholder.</p>
         * </blockquote>
         * <p>You can configure this parameter in one of the following formats based on your data source type:</p>
         * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
         * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
         * <p><code>hms-table:instance_id::database_name::table_name</code></p>
         * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
         * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
         * <blockquote>
         * <p><br><code>instance_id</code>: the ID of an instance. If the related data source is added to DataWorks in Alibaba Cloud instance mode, you must configure this parameter.<br><code>encoded_jdbc_url</code>: the JDBC connection string that is URL-encoded. If the related data source is added to DataWorks in connection string mode, you must configure this parameter.<br><code>catalog_id</code>: the ID of a DLF catalog.<br><code>project_name</code>: the name of a MaxCompute project.<br><code>database_name</code>: the name of a database.<br><code>schema_name</code>: the name of a schema. For a MaxCompute table, if the three-layer model is enabled for the MaxCompute project to which the table belongs, you must configure this parameter. Otherwise, you can specify an empty string for schema_name as a placeholder.<br><code>table_name</code>: the name of a table.</p>
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
         * IncludeBusinessMetadata.
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
