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
 * {@link ExecuteDDLRequest} extends {@link RequestModel}
 *
 * <p>ExecuteDDLRequest</p>
 */
public class ExecuteDDLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    @com.aliyun.core.annotation.Validation(required = true)
    private Context context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DDLCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DDLCommand DDLCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ExecuteDDLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.DDLCommand = builder.DDLCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteDDLRequest create() {
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
     * @return DDLCommand
     */
    public DDLCommand getDDLCommand() {
        return this.DDLCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<ExecuteDDLRequest, Builder> {
        private String regionId; 
        private Context context; 
        private DDLCommand DDLCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteDDLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.DDLCommand = request.DDLCommand;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder DDLCommand(DDLCommand DDLCommand) {
            String DDLCommandShrink = shrink(DDLCommand, "DDLCommand", "json");
            this.putBodyParameter("DDLCommand", DDLCommandShrink);
            this.DDLCommand = DDLCommand;
            return this;
        }

        /**
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

        @Override
        public ExecuteDDLRequest build() {
            return new ExecuteDDLRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteDDLRequest} extends {@link TeaModel}
     *
     * <p>ExecuteDDLRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link ExecuteDDLRequest} extends {@link TeaModel}
     *
     * <p>ExecuteDDLRequest</p>
     */
    public static class DatasourceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("DsCategory")
        private String dsCategory;

        @com.aliyun.core.annotation.NameInMap("DsId")
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("OneCatalogType")
        private String oneCatalogType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DatasourceId(Builder builder) {
            this.catalog = builder.catalog;
            this.dsCategory = builder.dsCategory;
            this.dsId = builder.dsId;
            this.env = builder.env;
            this.oneCatalogType = builder.oneCatalogType;
            this.projectId = builder.projectId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatasourceId create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return dsCategory
         */
        public String getDsCategory() {
            return this.dsCategory;
        }

        /**
         * @return dsId
         */
        public String getDsId() {
            return this.dsId;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return oneCatalogType
         */
        public String getOneCatalogType() {
            return this.oneCatalogType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String catalog; 
            private String dsCategory; 
            private String dsId; 
            private String env; 
            private String oneCatalogType; 
            private Long projectId; 
            private String version; 

            private Builder() {
            } 

            private Builder(DatasourceId model) {
                this.catalog = model.catalog;
                this.dsCategory = model.dsCategory;
                this.dsId = model.dsId;
                this.env = model.env;
                this.oneCatalogType = model.oneCatalogType;
                this.projectId = model.projectId;
                this.version = model.version;
            } 

            /**
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * DsCategory.
             */
            public Builder dsCategory(String dsCategory) {
                this.dsCategory = dsCategory;
                return this;
            }

            /**
             * DsId.
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * OneCatalogType.
             */
            public Builder oneCatalogType(String oneCatalogType) {
                this.oneCatalogType = oneCatalogType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DatasourceId build() {
                return new DatasourceId(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteDDLRequest} extends {@link TeaModel}
     *
     * <p>ExecuteDDLRequest</p>
     */
    public static class DDLCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private DatasourceId datasourceId;

        @com.aliyun.core.annotation.NameInMap("Ddl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ddl;

        @com.aliyun.core.annotation.NameInMap("DropTable")
        private Boolean dropTable;

        private DDLCommand(Builder builder) {
            this.datasourceId = builder.datasourceId;
            this.ddl = builder.ddl;
            this.dropTable = builder.dropTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DDLCommand create() {
            return builder().build();
        }

        /**
         * @return datasourceId
         */
        public DatasourceId getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return ddl
         */
        public String getDdl() {
            return this.ddl;
        }

        /**
         * @return dropTable
         */
        public Boolean getDropTable() {
            return this.dropTable;
        }

        public static final class Builder {
            private DatasourceId datasourceId; 
            private String ddl; 
            private Boolean dropTable; 

            private Builder() {
            } 

            private Builder(DDLCommand model) {
                this.datasourceId = model.datasourceId;
                this.ddl = model.ddl;
                this.dropTable = model.dropTable;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder datasourceId(DatasourceId datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE test (id bigint)</p>
             */
            public Builder ddl(String ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * DropTable.
             */
            public Builder dropTable(Boolean dropTable) {
                this.dropTable = dropTable;
                return this;
            }

            public DDLCommand build() {
                return new DDLCommand(this);
            } 

        } 

    }
}
