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

    private CreateSecurityIdentifyResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
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

    public static final class Builder extends Request.Builder<CreateSecurityIdentifyResultRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityIdentifyResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
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
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
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
             * DatasourceEnv.
             */
            public Builder datasourceEnv(String datasourceEnv) {
                this.datasourceEnv = datasourceEnv;
                return this;
            }

            /**
             * DatasourceName.
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
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
             * IsDatasourceTable.
             */
            public Builder isDatasourceTable(Boolean isDatasourceTable) {
                this.isDatasourceTable = isDatasourceTable;
                return this;
            }

            /**
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
