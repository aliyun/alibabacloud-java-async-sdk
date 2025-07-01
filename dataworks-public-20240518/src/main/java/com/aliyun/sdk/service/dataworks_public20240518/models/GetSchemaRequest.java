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
         * <p>The schema ID. You can call the ListSchemas operation to query the ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
         * <p>The common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Schema name}</code>. If a level does not exist, specify an empty string as a placeholder.</p>
         * <blockquote>
         * <p> For MaxCompute tables, specify an empty string at the Instance ID level and a MaxCompute project name at the Database name level. Make sure that the three-layer model is enabled for the MaxCompute project.</p>
         * </blockquote>
         * <p>You can configure this parameter in one of the following formats based on your data source type:</p>
         * <p><code>maxcompute-schema:::project_name:schema_name</code> (Three-layer model is enabled for the MaxCompute project.)</p>
         * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
         * <blockquote>
         * <p><br><code>instance_id</code>: the ID of a Hologres instance<br><code>database_name</code>: the name of a database<br><code>project_name</code>: the name of a MaxCompute project<br><code>schema_name</code>: the name of a schema</p>
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
