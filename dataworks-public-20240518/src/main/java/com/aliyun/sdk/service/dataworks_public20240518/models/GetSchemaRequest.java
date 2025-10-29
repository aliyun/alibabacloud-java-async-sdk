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
 * {@link GetSchemaRequest} extends {@link RequestModel}
 *
 * <p>GetSchemaRequest</p>
 */
public class GetSchemaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private GetSchemaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSchemaRequest create() {
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

    public static final class Builder extends Request.Builder<GetSchemaRequest, Builder> {
        private String regionId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetSchemaRequest request) {
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
         * <p>The ID. You can refer to the ListSchemas operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
         * <p>The format is <code>${EntityType}:${Instance ID or escaped URL}:${Catalog ID}:${Database name}:${Schema name}&lt;/code&gt;</code>. Use empty strings as placeholders for missing levels.</p>
         * <blockquote>
         * <p> For the MaxCompute type, use an empty string as the placeholder for the instance ID level. The database name is the MaxCompute project name, and the project must have the three-level model enabled.</p>
         * </blockquote>
         * <p>Examples:</p>
         * <p><code>maxcompute-schema:::project_name:schema_name</code> (The three-level model is enabled for the MaxCompute project.)</p>
         * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
         * <blockquote>
         * <p><br><code>instance_id</code>: The Hologres instance ID<br>. <code>database_name</code>: The database name<br>. <code>database_name</code>: The MaxCompute project name<br>. <code>schema_name</code>: The schema name.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-schema:123456XXX::test_project:default
         * holo-schema:h-abc123xxx::test_db:test_schema</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetSchemaRequest build() {
            return new GetSchemaRequest(this);
        } 

    } 

}
