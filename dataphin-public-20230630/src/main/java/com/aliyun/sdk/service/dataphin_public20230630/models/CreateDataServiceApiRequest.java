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
 * {@link CreateDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceApiRequest</p>
 */
public class CreateDataServiceApiRequest extends Request {
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

    private CreateDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceApiRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDataServiceApiRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceApiRequest request) {
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
         * <p>The request for creating an API.</p>
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CreateDataServiceApiRequest build() {
            return new CreateDataServiceApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>CreateDataServiceApiRequest</p>
     */
    public static class DmlConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchInputDataSize")
        private Integer batchInputDataSize;

        @com.aliyun.core.annotation.NameInMap("DataVolumeType")
        private Integer dataVolumeType;

        @com.aliyun.core.annotation.NameInMap("ErrorHandlingType")
        private Integer errorHandlingType;

        @com.aliyun.core.annotation.NameInMap("MaxInputDataSize")
        private Integer maxInputDataSize;

        @com.aliyun.core.annotation.NameInMap("ParallelNum")
        private Integer parallelNum;

        @com.aliyun.core.annotation.NameInMap("TransactionType")
        private Integer transactionType;

        private DmlConfig(Builder builder) {
            this.batchInputDataSize = builder.batchInputDataSize;
            this.dataVolumeType = builder.dataVolumeType;
            this.errorHandlingType = builder.errorHandlingType;
            this.maxInputDataSize = builder.maxInputDataSize;
            this.parallelNum = builder.parallelNum;
            this.transactionType = builder.transactionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DmlConfig create() {
            return builder().build();
        }

        /**
         * @return batchInputDataSize
         */
        public Integer getBatchInputDataSize() {
            return this.batchInputDataSize;
        }

        /**
         * @return dataVolumeType
         */
        public Integer getDataVolumeType() {
            return this.dataVolumeType;
        }

        /**
         * @return errorHandlingType
         */
        public Integer getErrorHandlingType() {
            return this.errorHandlingType;
        }

        /**
         * @return maxInputDataSize
         */
        public Integer getMaxInputDataSize() {
            return this.maxInputDataSize;
        }

        /**
         * @return parallelNum
         */
        public Integer getParallelNum() {
            return this.parallelNum;
        }

        /**
         * @return transactionType
         */
        public Integer getTransactionType() {
            return this.transactionType;
        }

        public static final class Builder {
            private Integer batchInputDataSize; 
            private Integer dataVolumeType; 
            private Integer errorHandlingType; 
            private Integer maxInputDataSize; 
            private Integer parallelNum; 
            private Integer transactionType; 

            private Builder() {
            } 

            private Builder(DmlConfig model) {
                this.batchInputDataSize = model.batchInputDataSize;
                this.dataVolumeType = model.dataVolumeType;
                this.errorHandlingType = model.errorHandlingType;
                this.maxInputDataSize = model.maxInputDataSize;
                this.parallelNum = model.parallelNum;
                this.transactionType = model.transactionType;
            } 

            /**
             * <p>The data volume per batch. Valid values:</p>
             * <ul>
             * <li>When the data volume type is single record, this parameter cannot be set.</li>
             * <li>When the data volume type is batch:<ul>
             * <li>If the transaction processing mode is 1, this parameter cannot be set.</li>
             * <li>If the transaction processing mode is 2, the value ranges from 1 to 1000000.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder batchInputDataSize(Integer batchInputDataSize) {
                this.batchInputDataSize = batchInputDataSize;
                return this;
            }

            /**
             * <p>The data volume type. Valid values:</p>
             * <ul>
             * <li>1: single record</li>
             * <li>2: batch.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dataVolumeType(Integer dataVolumeType) {
                this.dataVolumeType = dataVolumeType;
                return this;
            }

            /**
             * <p>The error handling method. Valid values:</p>
             * <ul>
             * <li>1: partial success allowed</li>
             * <li>2: all must succeed</li>
             * </ul>
             * <p>Parameter rules:</p>
             * <ul>
             * <li>When the data volume type is single record, this parameter cannot be set.</li>
             * <li>When the data volume type is batch, the value is 1 or 2.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder errorHandlingType(Integer errorHandlingType) {
                this.errorHandlingType = errorHandlingType;
                return this;
            }

            /**
             * <p>The maximum number of input records. Valid values:</p>
             * <ul>
             * <li>When the data volume type is single record, this parameter cannot be set.</li>
             * <li>When the data volume type is batch, the value ranges from 1 to 1000000.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxInputDataSize(Integer maxInputDataSize) {
                this.maxInputDataSize = maxInputDataSize;
                return this;
            }

            /**
             * <p>The degree of parallelism. Valid values:</p>
             * <ul>
             * <li>When the data volume type is single record, this parameter cannot be set.</li>
             * <li>When the data volume type is batch:<ul>
             * <li>If the transaction processing mode is 1, this parameter cannot be set.</li>
             * <li>If the transaction processing mode is 2, the value ranges from 1 to 5.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parallelNum(Integer parallelNum) {
                this.parallelNum = parallelNum;
                return this;
            }

            /**
             * <p>The transaction processing mode. Valid values:</p>
             * <ul>
             * <li>0: no transaction</li>
             * <li>1: no batching</li>
             * <li>2: batch processing</li>
             * </ul>
             * <p>Parameter rules:</p>
             * <ul>
             * <li>When the data volume type is single record, the transaction processing mode is 0.</li>
             * <li>When the data volume type is batch:<ul>
             * <li>If the error handling method is 1, the transaction processing mode is 1 or 2.</li>
             * <li>If the error handling method is 2, the transaction processing mode can only be 1.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder transactionType(Integer transactionType) {
                this.transactionType = transactionType;
                return this;
            }

            public DmlConfig build() {
                return new DmlConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>CreateDataServiceApiRequest</p>
     */
    public static class ScriptRequestParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("IsRequiredParameter")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isRequiredParameter;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValueType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterValueType;

        private ScriptRequestParameters(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.exampleValue = builder.exampleValue;
            this.isRequiredParameter = builder.isRequiredParameter;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValueType = builder.parameterValueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptRequestParameters create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return exampleValue
         */
        public String getExampleValue() {
            return this.exampleValue;
        }

        /**
         * @return isRequiredParameter
         */
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        /**
         * @return parameterDataType
         */
        public String getParameterDataType() {
            return this.parameterDataType;
        }

        /**
         * @return parameterDescription
         */
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValueType
         */
        public String getParameterValueType() {
            return this.parameterValueType;
        }

        public static final class Builder {
            private String defaultValue; 
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private String parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValueType; 

            private Builder() {
            } 

            private Builder(ScriptRequestParameters model) {
                this.defaultValue = model.defaultValue;
                this.exampleValue = model.exampleValue;
                this.isRequiredParameter = model.isRequiredParameter;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValueType = model.parameterValueType;
            } 

            /**
             * <p>The default value of the input parameter for operation-type APIs. This parameter takes effect when the parameter is not required. If not specified, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>Specifies whether the parameter is required.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * <ul>
             * <li>&quot;STRING&quot;</li>
             * <li>&quot;DOUBLE&quot;</li>
             * <li>&quot;INT&quot;</li>
             * <li>&quot;DATE&quot;</li>
             * <li>&quot;LONG&quot;</li>
             * <li>&quot;FLOAT&quot;</li>
             * <li>&quot;BOOLEAN&quot;</li>
             * <li>&quot;SHORT&quot;</li>
             * <li>&quot;BYTE&quot;</li>
             * <li>&quot;BIGDECIMAL&quot;</li>
             * <li>&quot;BINARY&quot;</li>
             * <li>&quot;ARRAY&quot;</li>
             * <li>&quot;Array(int)&quot;</li>
             * <li>&quot;Array(string)&quot;.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder parameterDataType(String parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>字段d</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>d</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value type of the parameter. Valid values:</p>
             * <ul>
             * <li>1 (single value): A fixed value used for operators such as =, &gt;=, &lt;=, &gt;, &lt;, !=, and between. </li>
             * <li>2 (multiple values): The input parameter contains multiple values separated by commas (,). Used for In and Not In operators.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder parameterValueType(String parameterValueType) {
                this.parameterValueType = parameterValueType;
                return this;
            }

            public ScriptRequestParameters build() {
                return new ScriptRequestParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>CreateDataServiceApiRequest</p>
     */
    public static class ScriptResponseParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterLocation")
        private String parameterLocation;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterName;

        private ScriptResponseParameters(Builder builder) {
            this.exampleValue = builder.exampleValue;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterLocation = builder.parameterLocation;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptResponseParameters create() {
            return builder().build();
        }

        /**
         * @return exampleValue
         */
        public String getExampleValue() {
            return this.exampleValue;
        }

        /**
         * @return parameterDataType
         */
        public String getParameterDataType() {
            return this.parameterDataType;
        }

        /**
         * @return parameterDescription
         */
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        /**
         * @return parameterLocation
         */
        public String getParameterLocation() {
            return this.parameterLocation;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String exampleValue; 
            private String parameterDataType; 
            private String parameterDescription; 
            private String parameterLocation; 
            private String parameterName; 

            private Builder() {
            } 

            private Builder(ScriptResponseParameters model) {
                this.exampleValue = model.exampleValue;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterLocation = model.parameterLocation;
                this.parameterName = model.parameterName;
            } 

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>amazing</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * <ul>
             * <li>&quot;STRING&quot;</li>
             * <li>&quot;DOUBLE&quot;</li>
             * <li>&quot;INT&quot;</li>
             * <li>&quot;DATE&quot;</li>
             * <li>&quot;LONG&quot;</li>
             * <li>&quot;FLOAT&quot;</li>
             * <li>&quot;BOOLEAN&quot;</li>
             * <li>&quot;SHORT&quot;</li>
             * <li>&quot;BYTE&quot;</li>
             * <li>&quot;BIGDECIMAL&quot;</li>
             * <li>&quot;BINARY&quot;</li>
             * <li>&quot;ARRAY&quot;</li>
             * <li>&quot;Array(int)&quot;</li>
             * <li>&quot;Array(string)&quot;.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder parameterDataType(String parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>字段a</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The location of the response parameter for operation-type APIs. This parameter must be set when the API is an operation-type API with batch data volume. Valid values:</p>
             * <ul>
             * <li>success: the response data of a successful operation</li>
             * <li>failed: the response data of a failed operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder parameterLocation(String parameterLocation) {
                this.parameterLocation = parameterLocation;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public ScriptResponseParameters build() {
                return new ScriptResponseParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>CreateDataServiceApiRequest</p>
     */
    public static class ScriptDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasourceID")
        private Long datasourceID;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer datasourceType;

        @com.aliyun.core.annotation.NameInMap("IsPaginated")
        private Boolean isPaginated;

        @com.aliyun.core.annotation.NameInMap("Script")
        @com.aliyun.core.annotation.Validation(required = true)
        private String script;

        @com.aliyun.core.annotation.NameInMap("ScriptRequestParameters")
        private java.util.List<ScriptRequestParameters> scriptRequestParameters;

        @com.aliyun.core.annotation.NameInMap("ScriptResponseParameters")
        private java.util.List<ScriptResponseParameters> scriptResponseParameters;

        @com.aliyun.core.annotation.NameInMap("SortPriority")
        private Integer sortPriority;

        @com.aliyun.core.annotation.NameInMap("SqlMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer sqlMode;

        private ScriptDetails(Builder builder) {
            this.datasourceID = builder.datasourceID;
            this.datasourceType = builder.datasourceType;
            this.isPaginated = builder.isPaginated;
            this.script = builder.script;
            this.scriptRequestParameters = builder.scriptRequestParameters;
            this.scriptResponseParameters = builder.scriptResponseParameters;
            this.sortPriority = builder.sortPriority;
            this.sqlMode = builder.sqlMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptDetails create() {
            return builder().build();
        }

        /**
         * @return datasourceID
         */
        public Long getDatasourceID() {
            return this.datasourceID;
        }

        /**
         * @return datasourceType
         */
        public Integer getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return isPaginated
         */
        public Boolean getIsPaginated() {
            return this.isPaginated;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return scriptRequestParameters
         */
        public java.util.List<ScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        /**
         * @return scriptResponseParameters
         */
        public java.util.List<ScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        /**
         * @return sortPriority
         */
        public Integer getSortPriority() {
            return this.sortPriority;
        }

        /**
         * @return sqlMode
         */
        public Integer getSqlMode() {
            return this.sqlMode;
        }

        public static final class Builder {
            private Long datasourceID; 
            private Integer datasourceType; 
            private Boolean isPaginated; 
            private String script; 
            private java.util.List<ScriptRequestParameters> scriptRequestParameters; 
            private java.util.List<ScriptResponseParameters> scriptResponseParameters; 
            private Integer sortPriority; 
            private Integer sqlMode; 

            private Builder() {
            } 

            private Builder(ScriptDetails model) {
                this.datasourceID = model.datasourceID;
                this.datasourceType = model.datasourceType;
                this.isPaginated = model.isPaginated;
                this.script = model.script;
                this.scriptRequestParameters = model.scriptRequestParameters;
                this.scriptResponseParameters = model.scriptResponseParameters;
                this.sortPriority = model.sortPriority;
                this.sqlMode = model.sqlMode;
            } 

            /**
             * <p>The ID of the datasource. This parameter is required when the API mode is direct datasource connection.</p>
             * 
             * <strong>example:</strong>
             * <p>6668888888888812345L</p>
             */
            public Builder datasourceID(Long datasourceID) {
                this.datasourceID = datasourceID;
                return this;
            }

            /**
             * <p>The data type on which the API is based. Valid values:</p>
             * <ul>
             * <li>1: datasource.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder datasourceType(Integer datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * <p>Specifies whether to paginate the results. This parameter is required only when RequestType is set to List. Default value: false. Pagination is not supported in asynchronous call mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPaginated(Boolean isPaginated) {
                this.isPaginated = isPaginated;
                return this;
            }

            /**
             * <p>The SQL script.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>select a,b,c from table1 where d = ${d}</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The list of request parameters for the script API.</p>
             */
            public Builder scriptRequestParameters(java.util.List<ScriptRequestParameters> scriptRequestParameters) {
                this.scriptRequestParameters = scriptRequestParameters;
                return this;
            }

            /**
             * <p>The list of response parameters for the script API.</p>
             */
            public Builder scriptResponseParameters(java.util.List<ScriptResponseParameters> scriptResponseParameters) {
                this.scriptResponseParameters = scriptResponseParameters;
                return this;
            }

            /**
             * <p>The sorting priority. This parameter takes effect only when the SQL mode is basic mode. Default value: 2. Valid values:</p>
             * <ul>
             * <li>1: SQL script </li>
             * <li>2: OrderByList request parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sortPriority(Integer sortPriority) {
                this.sortPriority = sortPriority;
                return this;
            }

            /**
             * <p>The SQL mode. Valid values:</p>
             * <ul>
             * <li>1: basic mode</li>
             * <li>2: advanced mode.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sqlMode(Integer sqlMode) {
                this.sqlMode = sqlMode;
                return this;
            }

            public ScriptDetails build() {
                return new ScriptDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>CreateDataServiceApiRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long apiGroupId;

        @com.aliyun.core.annotation.NameInMap("ApiGroupName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiGroupName;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer apiType;

        @com.aliyun.core.annotation.NameInMap("BizProtocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Integer> bizProtocol;

        @com.aliyun.core.annotation.NameInMap("CacheTimeout")
        private Integer cacheTimeout;

        @com.aliyun.core.annotation.NameInMap("CallMode")
        private Integer callMode;

        @com.aliyun.core.annotation.NameInMap("CustomUpdateRate")
        private String customUpdateRate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DmlConfig")
        private DmlConfig dmlConfig;

        @com.aliyun.core.annotation.NameInMap("ExecutionTimeout")
        private Integer executionTimeout;

        @com.aliyun.core.annotation.NameInMap("Mode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RequestType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer requestType;

        @com.aliyun.core.annotation.NameInMap("ReturnSqlSwitch")
        private Boolean returnSqlSwitch;

        @com.aliyun.core.annotation.NameInMap("RowPermissionIds")
        private java.util.List<Long> rowPermissionIds;

        @com.aliyun.core.annotation.NameInMap("ScriptDetails")
        @com.aliyun.core.annotation.Validation(required = true)
        private ScriptDetails scriptDetails;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("UpdateRate")
        private Integer updateRate;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private CreateCommand(Builder builder) {
            this.apiGroupId = builder.apiGroupId;
            this.apiGroupName = builder.apiGroupName;
            this.apiName = builder.apiName;
            this.apiType = builder.apiType;
            this.bizProtocol = builder.bizProtocol;
            this.cacheTimeout = builder.cacheTimeout;
            this.callMode = builder.callMode;
            this.customUpdateRate = builder.customUpdateRate;
            this.description = builder.description;
            this.dmlConfig = builder.dmlConfig;
            this.executionTimeout = builder.executionTimeout;
            this.mode = builder.mode;
            this.projectId = builder.projectId;
            this.requestType = builder.requestType;
            this.returnSqlSwitch = builder.returnSqlSwitch;
            this.rowPermissionIds = builder.rowPermissionIds;
            this.scriptDetails = builder.scriptDetails;
            this.timeout = builder.timeout;
            this.updateRate = builder.updateRate;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return apiGroupId
         */
        public Long getApiGroupId() {
            return this.apiGroupId;
        }

        /**
         * @return apiGroupName
         */
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiType
         */
        public Integer getApiType() {
            return this.apiType;
        }

        /**
         * @return bizProtocol
         */
        public java.util.List<Integer> getBizProtocol() {
            return this.bizProtocol;
        }

        /**
         * @return cacheTimeout
         */
        public Integer getCacheTimeout() {
            return this.cacheTimeout;
        }

        /**
         * @return callMode
         */
        public Integer getCallMode() {
            return this.callMode;
        }

        /**
         * @return customUpdateRate
         */
        public String getCustomUpdateRate() {
            return this.customUpdateRate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dmlConfig
         */
        public DmlConfig getDmlConfig() {
            return this.dmlConfig;
        }

        /**
         * @return executionTimeout
         */
        public Integer getExecutionTimeout() {
            return this.executionTimeout;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return requestType
         */
        public Integer getRequestType() {
            return this.requestType;
        }

        /**
         * @return returnSqlSwitch
         */
        public Boolean getReturnSqlSwitch() {
            return this.returnSqlSwitch;
        }

        /**
         * @return rowPermissionIds
         */
        public java.util.List<Long> getRowPermissionIds() {
            return this.rowPermissionIds;
        }

        /**
         * @return scriptDetails
         */
        public ScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return updateRate
         */
        public Integer getUpdateRate() {
            return this.updateRate;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long apiGroupId; 
            private String apiGroupName; 
            private String apiName; 
            private Integer apiType; 
            private java.util.List<Integer> bizProtocol; 
            private Integer cacheTimeout; 
            private Integer callMode; 
            private String customUpdateRate; 
            private String description; 
            private DmlConfig dmlConfig; 
            private Integer executionTimeout; 
            private Integer mode; 
            private Long projectId; 
            private Integer requestType; 
            private Boolean returnSqlSwitch; 
            private java.util.List<Long> rowPermissionIds; 
            private ScriptDetails scriptDetails; 
            private Integer timeout; 
            private Integer updateRate; 
            private String version; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.apiGroupId = model.apiGroupId;
                this.apiGroupName = model.apiGroupName;
                this.apiName = model.apiName;
                this.apiType = model.apiType;
                this.bizProtocol = model.bizProtocol;
                this.cacheTimeout = model.cacheTimeout;
                this.callMode = model.callMode;
                this.customUpdateRate = model.customUpdateRate;
                this.description = model.description;
                this.dmlConfig = model.dmlConfig;
                this.executionTimeout = model.executionTimeout;
                this.mode = model.mode;
                this.projectId = model.projectId;
                this.requestType = model.requestType;
                this.returnSqlSwitch = model.returnSqlSwitch;
                this.rowPermissionIds = model.rowPermissionIds;
                this.scriptDetails = model.scriptDetails;
                this.timeout = model.timeout;
                this.updateRate = model.updateRate;
                this.version = model.version;
            } 

            /**
             * <p>The group ID of the API.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder apiGroupId(Long apiGroupId) {
                this.apiGroupId = apiGroupId;
                return this;
            }

            /**
             * <p>The group name of the API.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>默认API分组</p>
             */
            public Builder apiGroupName(String apiGroupName) {
                this.apiGroupName = apiGroupName;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>API_01</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The type of the API. Valid values:</p>
             * <ul>
             * <li>3: datasource SQL mode.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder apiType(Integer apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * <p>The protocol. Different gateway types support different protocols. For more information, see the documentation. Valid values:</p>
             * <ul>
             * <li>0: HTTP </li>
             * <li>1: HTTPS.</li>
             * </ul>
             * <p>This parameter is required.</p>
             */
            public Builder bizProtocol(java.util.List<Integer> bizProtocol) {
                this.bizProtocol = bizProtocol;
                return this;
            }

            /**
             * <p>The cache timeout period, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder cacheTimeout(Integer cacheTimeout) {
                this.cacheTimeout = cacheTimeout;
                return this;
            }

            /**
             * <p>The call mode of the API. Default value: 1. Valid values:</p>
             * <ul>
             * <li>1: synchronous call</li>
             * <li>2: asynchronous call.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callMode(Integer callMode) {
                this.callMode = callMode;
                return this;
            }

            /**
             * <p>The custom update frequency. This parameter is required when the update frequency is set to custom.</p>
             * 
             * <strong>example:</strong>
             * <p>每天8点</p>
             */
            public Builder customUpdateRate(String customUpdateRate) {
                this.customUpdateRate = customUpdateRate;
                return this;
            }

            /**
             * <p>The description of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The configuration of the operation-type API. This parameter is not required when creating a query-type API.</p>
             */
            public Builder dmlConfig(DmlConfig dmlConfig) {
                this.dmlConfig = dmlConfig;
                return this;
            }

            /**
             * <p>The execution timeout period for asynchronous API calls. This parameter takes effect only for asynchronous API calls and is required when the call mode is asynchronous.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder executionTimeout(Integer executionTimeout) {
                this.executionTimeout = executionTimeout;
                return this;
            }

            /**
             * <p>The development mode of the API. Valid values:</p>
             * <ul>
             * <li>0: Basic mode </li>
             * <li>1: Dev-Prod mode.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The ID of the data service project.</p>
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
             * <p>The request method of the API. Valid values:</p>
             * <ul>
             * <li>0 (GET): Returns a single record. The query result is unique. </li>
             * <li>1 (LIST): Returns multiple records.</li>
             * <li>2 (CREATE): Creates objects. Supports single or batch creation.</li>
             * <li>3 (UPDATE): Updates objects. Supports single or batch updates.</li>
             * <li>4 (DELETE): Deletes objects. Supports single or batch deletions.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder requestType(Integer requestType) {
                this.requestType = requestType;
                return this;
            }

            /**
             * <p>Specifies whether to return the SQL in the result.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder returnSqlSwitch(Boolean returnSqlSwitch) {
                this.returnSqlSwitch = returnSqlSwitch;
                return this;
            }

            /**
             * <p>The list of row-level permission IDs.</p>
             */
            public Builder rowPermissionIds(java.util.List<Long> rowPermissionIds) {
                this.rowPermissionIds = rowPermissionIds;
                return this;
            }

            /**
             * <p>The details of the script API.</p>
             * <p>This parameter is required.</p>
             */
            public Builder scriptDetails(ScriptDetails scriptDetails) {
                this.scriptDetails = scriptDetails;
                return this;
            }

            /**
             * <p>The timeout period, in seconds.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The update frequency. Default value: 1. Valid values:</p>
             * <ul>
             * <li>0: custom</li>
             * <li>1: day</li>
             * <li>2: hour</li>
             * <li>3: minute.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder updateRate(Integer updateRate) {
                this.updateRate = updateRate;
                return this;
            }

            /**
             * <p>The version of the API.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>V1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
