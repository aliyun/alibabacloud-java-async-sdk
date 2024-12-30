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
 * {@link ExecuteAdHocTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecuteAdHocTaskRequest</p>
 */
public class ExecuteAdHocTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ExecuteCommand executeCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ExecuteAdHocTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.executeCommand = builder.executeCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAdHocTaskRequest create() {
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
     * @return executeCommand
     */
    public ExecuteCommand getExecuteCommand() {
        return this.executeCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<ExecuteAdHocTaskRequest, Builder> {
        private String regionId; 
        private ExecuteCommand executeCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteAdHocTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.executeCommand = request.executeCommand;
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
        public Builder executeCommand(ExecuteCommand executeCommand) {
            String executeCommandShrink = shrink(executeCommand, "ExecuteCommand", "json");
            this.putBodyParameter("ExecuteCommand", executeCommandShrink);
            this.executeCommand = executeCommand;
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
        public ExecuteAdHocTaskRequest build() {
            return new ExecuteAdHocTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAdHocTaskRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdHocTaskRequest</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private ParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteAdHocTaskRequest} extends {@link TeaModel}
     *
     * <p>ExecuteAdHocTaskRequest</p>
     */
    public static class ExecuteCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("DataSourceCatalog")
        private String dataSourceCatalog;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceSchema")
        private String dataSourceSchema;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private ExecuteCommand(Builder builder) {
            this.code = builder.code;
            this.dataSourceCatalog = builder.dataSourceCatalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSchema = builder.dataSourceSchema;
            this.operatorType = builder.operatorType;
            this.paramList = builder.paramList;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteCommand create() {
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
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return paramList
         */
        public java.util.List<ParamList> getParamList() {
            return this.paramList;
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
            private String operatorType; 
            private java.util.List<ParamList> paramList; 
            private Long projectId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>show tables;</p>
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
             * ParamList.
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123222121</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public ExecuteCommand build() {
                return new ExecuteCommand(this);
            } 

        } 

    }
}
