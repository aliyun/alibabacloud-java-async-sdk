// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetSourceTableMetaRequest} extends {@link RequestModel}
 *
 * <p>GetSourceTableMetaRequest</p>
 */
public class GetSourceTableMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    @com.aliyun.core.annotation.Validation(required = true)
    private Context context;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private GetSourceTableMetaRequestQuery query;

    private GetSourceTableMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceTableMetaRequest create() {
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
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return query
     */
    public GetSourceTableMetaRequestQuery getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<GetSourceTableMetaRequest, Builder> {
        private String regionId; 
        private Context context; 
        private Long opTenantId; 
        private String opUserId; 
        private GetSourceTableMetaRequestQuery query; 

        private Builder() {
            super();
        } 

        private Builder(GetSourceTableMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.query = request.query;
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
         * <p>The request context.</p>
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The query conditions for the integration source table.</p>
         * <p>This parameter is required.</p>
         */
        public Builder query(GetSourceTableMetaRequestQuery query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putBodyParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        @Override
        public GetSourceTableMetaRequest build() {
            return new GetSourceTableMetaRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetSourceTableMetaRequest} extends {@link TeaModel}
     *
     * <p>GetSourceTableMetaRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Context(Builder builder) {
            this.env = builder.env;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String env; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.env = model.env;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The current operation environment. Valid values:</p>
             * <ul>
             * <li>DEV: development environment.</li>
             * <li>PROD: production environment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The ID of the project to which the integration pipeline task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSourceTableMetaRequest} extends {@link TeaModel}
     *
     * <p>GetSourceTableMetaRequest</p>
     */
    public static class GetSourceTableMetaRequestQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("QueryMode")
        private String queryMode;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private GetSourceTableMetaRequestQuery(Builder builder) {
            this.catalog = builder.catalog;
            this.id = builder.id;
            this.queryMode = builder.queryMode;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetSourceTableMetaRequestQuery create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return queryMode
         */
        public String getQueryMode() {
            return this.queryMode;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String catalog; 
            private String id; 
            private String queryMode; 
            private String schemaName; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(GetSourceTableMetaRequestQuery model) {
                this.catalog = model.catalog;
                this.id = model.id;
                this.queryMode = model.queryMode;
                this.schemaName = model.schemaName;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The catalog name.</p>
             * 
             * <strong>example:</strong>
             * <p>hive_catalog</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The identifier of the data source or compute source. If QueryMode is set to DATA_SOURCE, specify the physical data source ID. If QueryMode is set to PROJECT_COMPUTE_SOURCE, specify the data source ID bound to the compute source.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The query mode. Valid values:</p>
             * <ul>
             * <li>DATA_SOURCE: physical data source. This is the default value. It includes direct queries and automatic routing of external data source metadata.</li>
             * <li>PROJECT_COMPUTE_SOURCE: tables under the project or compute source. The data source is parsed based on the compute source of the project specified by Context.ProjectId.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_SOURCE</p>
             */
            public Builder queryMode(String queryMode) {
                this.queryMode = queryMode;
                return this;
            }

            /**
             * <p>The schema name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The table name. The schema.table format is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public GetSourceTableMetaRequestQuery build() {
                return new GetSourceTableMetaRequestQuery(this);
            } 

        } 

    }
}
