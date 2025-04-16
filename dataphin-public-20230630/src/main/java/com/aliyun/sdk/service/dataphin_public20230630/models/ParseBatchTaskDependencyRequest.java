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
 * {@link ParseBatchTaskDependencyRequest} extends {@link RequestModel}
 *
 * <p>ParseBatchTaskDependencyRequest</p>
 */
public class ParseBatchTaskDependencyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParseCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ParseCommand parseCommand;

    private ParseBatchTaskDependencyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.parseCommand = builder.parseCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ParseBatchTaskDependencyRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return parseCommand
     */
    public ParseCommand getParseCommand() {
        return this.parseCommand;
    }

    public static final class Builder extends Request.Builder<ParseBatchTaskDependencyRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private ParseCommand parseCommand; 

        private Builder() {
            super();
        } 

        private Builder(ParseBatchTaskDependencyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.parseCommand = request.parseCommand;
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
         * <p>This parameter is required.</p>
         */
        public Builder parseCommand(ParseCommand parseCommand) {
            String parseCommandShrink = shrink(parseCommand, "ParseCommand", "json");
            this.putBodyParameter("ParseCommand", parseCommandShrink);
            this.parseCommand = parseCommand;
            return this;
        }

        @Override
        public ParseBatchTaskDependencyRequest build() {
            return new ParseBatchTaskDependencyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ParseBatchTaskDependencyRequest} extends {@link TeaModel}
     *
     * <p>ParseBatchTaskDependencyRequest</p>
     */
    public static class ParseCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("DataSourceCatalog")
        private String dataSourceCatalog;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceSchema")
        private String dataSourceSchema;

        @com.aliyun.core.annotation.NameInMap("IncludeAllInputTables")
        private Boolean includeAllInputTables;

        @com.aliyun.core.annotation.NameInMap("NeedQueryLineages")
        private Boolean needQueryLineages;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private ParseCommand(Builder builder) {
            this.code = builder.code;
            this.dataSourceCatalog = builder.dataSourceCatalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSchema = builder.dataSourceSchema;
            this.includeAllInputTables = builder.includeAllInputTables;
            this.needQueryLineages = builder.needQueryLineages;
            this.operatorType = builder.operatorType;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParseCommand create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataSourceCatalog
         */
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceSchema
         */
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        /**
         * @return includeAllInputTables
         */
        public Boolean getIncludeAllInputTables() {
            return this.includeAllInputTables;
        }

        /**
         * @return needQueryLineages
         */
        public Boolean getNeedQueryLineages() {
            return this.needQueryLineages;
        }

        /**
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String code; 
            private String dataSourceCatalog; 
            private Long dataSourceId; 
            private String dataSourceSchema; 
            private Boolean includeAllInputTables; 
            private Boolean needQueryLineages; 
            private String operatorType; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(ParseCommand model) {
                this.code = model.code;
                this.dataSourceCatalog = model.dataSourceCatalog;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceSchema = model.dataSourceSchema;
                this.includeAllInputTables = model.includeAllInputTables;
                this.needQueryLineages = model.needQueryLineages;
                this.operatorType = model.operatorType;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from t_test limit 1;</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DataSourceCatalog.
             */
            public Builder dataSourceCatalog(String dataSourceCatalog) {
                this.dataSourceCatalog = dataSourceCatalog;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceSchema.
             */
            public Builder dataSourceSchema(String dataSourceSchema) {
                this.dataSourceSchema = dataSourceSchema;
                return this;
            }

            /**
             * IncludeAllInputTables.
             */
            public Builder includeAllInputTables(Boolean includeAllInputTables) {
                this.includeAllInputTables = includeAllInputTables;
                return this;
            }

            /**
             * NeedQueryLineages.
             */
            public Builder needQueryLineages(Boolean needQueryLineages) {
                this.needQueryLineages = needQueryLineages;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute_SQL</p>
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>131211211</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public ParseCommand build() {
                return new ParseCommand(this);
            } 

        } 

    }
}
