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
 * {@link CreateSecurityIdentifyResultRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityIdentifyResultRequest</p>
 */
public class CreateSecurityIdentifyResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CreateSecurityIdentifyResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityIdentifyResultRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
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

    public static final class Builder extends Request.Builder<CreateSecurityIdentifyResultRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityIdentifyResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The creation request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
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

        @Override
        public CreateSecurityIdentifyResultRequest build() {
            return new CreateSecurityIdentifyResultRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecurityIdentifyResultRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityIdentifyResultRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassifyId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long classifyId;

        @com.aliyun.core.annotation.NameInMap("ConflictStrategy")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conflictStrategy;

        @com.aliyun.core.annotation.NameInMap("DatasourceEnv")
        private String datasourceEnv;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("IsDatasourceTable")
        private Boolean isDatasourceTable;

        @com.aliyun.core.annotation.NameInMap("TableCatalog")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableCatalog;

        @com.aliyun.core.annotation.NameInMap("TableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableName;

        private CreateCommand(Builder builder) {
            this.classifyId = builder.classifyId;
            this.conflictStrategy = builder.conflictStrategy;
            this.datasourceEnv = builder.datasourceEnv;
            this.datasourceName = builder.datasourceName;
            this.enable = builder.enable;
            this.fieldName = builder.fieldName;
            this.isDatasourceTable = builder.isDatasourceTable;
            this.tableCatalog = builder.tableCatalog;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return classifyId
         */
        public Long getClassifyId() {
            return this.classifyId;
        }

        /**
         * @return conflictStrategy
         */
        public String getConflictStrategy() {
            return this.conflictStrategy;
        }

        /**
         * @return datasourceEnv
         */
        public String getDatasourceEnv() {
            return this.datasourceEnv;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return isDatasourceTable
         */
        public Boolean getIsDatasourceTable() {
            return this.isDatasourceTable;
        }

        /**
         * @return tableCatalog
         */
        public String getTableCatalog() {
            return this.tableCatalog;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long classifyId; 
            private String conflictStrategy; 
            private String datasourceEnv; 
            private String datasourceName; 
            private Boolean enable; 
            private String fieldName; 
            private Boolean isDatasourceTable; 
            private String tableCatalog; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.classifyId = model.classifyId;
                this.conflictStrategy = model.conflictStrategy;
                this.datasourceEnv = model.datasourceEnv;
                this.datasourceName = model.datasourceName;
                this.enable = model.enable;
                this.fieldName = model.fieldName;
                this.isDatasourceTable = model.isDatasourceTable;
                this.tableCatalog = model.tableCatalog;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The classification ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder classifyId(Long classifyId) {
                this.classifyId = classifyId;
                return this;
            }

            /**
             * <p>The conflict strategy. Valid values: COVER_ALL (overwrites all online tags) and COVER_UNLOCKED (overwrites only unlocked online tags).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>COVER_ALL</p>
             */
            public Builder conflictStrategy(String conflictStrategy) {
                this.conflictStrategy = conflictStrategy;
                return this;
            }

            /**
             * <p>The environment identifier of the datasource. This parameter is required only for datasource tables.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder datasourceEnv(String datasourceEnv) {
                this.datasourceEnv = datasourceEnv;
                return this;
            }

            /**
             * <p>The name of the datasource. This parameter is required only for datasource tables.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The enabled status. Valid values: true (enabled) and false (disabled). Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>col1</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Specifies whether the table is a datasource table. Default value: false (treated as a Dataphin table).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDatasourceTable(Boolean isDatasourceTable) {
                this.isDatasourceTable = isDatasourceTable;
                return this;
            }

            /**
             * <p>The catalog of the table. For a datasource table, specify the name of the database or schema to which the table belongs. For a Dataphin physical table, specify the English name of the project. For a Dataphin logical table, specify the English name of the business unit.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableCatalog(String tableCatalog) {
                this.tableCatalog = tableCatalog;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
