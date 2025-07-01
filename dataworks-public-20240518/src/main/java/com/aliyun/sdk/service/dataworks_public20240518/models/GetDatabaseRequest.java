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
 * {@link GetDatabaseRequest} extends {@link RequestModel}
 *
 * <p>GetDatabaseRequest</p>
 */
public class GetDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private GetDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseRequest create() {
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

    public static final class Builder extends Request.Builder<GetDatabaseRequest, Builder> {
        private String regionId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
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
         * <p>Database entity ID. You can refer to the response of the ListDatabases operation and <a href="https://help.aliyun.com/document_detail/2880092.html">the description of metadata entity concepts.</a></p>
         * <p>The format is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog identifier}:${Database name}</code>. Use empty strings as placeholders for non-existent levels.</p>
         * <blockquote>
         * <p> For StarRocks, the catalog identifier is the catalog name. For DLF, the catalog identifier is the catalog ID. For other types, catalog hierarchy is not supported, and an empty string can be used as a placeholder.</p>
         * </blockquote>
         * <p>Examples of common ID formats</p>
         * <p><code>dlf-database::catalog_id:database_name</code></p>
         * <p><code>holo-database:instance_id::database_name</code></p>
         * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
         * <blockquote>
         * <p> Parameter descriptions<br><code>catalog_id</code>: The DLF catalog ID.<br><code>instance_id</code>: The instance ID, required for a data source registered in instance mode.<br><code>encoded_jdbc_url</code>: The JDBC connection string that has been URL encoded. This parameter is required for the data source registered via a connection string.<br><code>database_name</code>: The database name.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-database:rm-abc123xxx::test_db</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetDatabaseRequest build() {
            return new GetDatabaseRequest(this);
        } 

    } 

}
