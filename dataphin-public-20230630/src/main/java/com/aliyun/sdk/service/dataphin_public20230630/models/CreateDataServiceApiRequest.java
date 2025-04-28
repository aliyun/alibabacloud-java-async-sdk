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

    private CreateDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
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

    public static final class Builder extends Request.Builder<CreateDataServiceApiRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceApiRequest request) {
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
    public static class ScriptRequestParameters extends TeaModel {
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
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private String parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValueType; 

            private Builder() {
            } 

            private Builder(ScriptRequestParameters model) {
                this.exampleValue = model.exampleValue;
                this.isRequiredParameter = model.isRequiredParameter;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValueType = model.parameterValueType;
            } 

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
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
             * ParameterDescription.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
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

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterName;

        private ScriptResponseParameters(Builder builder) {
            this.exampleValue = builder.exampleValue;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
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
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String exampleValue; 
            private String parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 

            private Builder() {
            } 

            private Builder(ScriptResponseParameters model) {
                this.exampleValue = model.exampleValue;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
            } 

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
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
             * ParameterDescription.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
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
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ScriptRequestParameters> scriptRequestParameters;

        @com.aliyun.core.annotation.NameInMap("ScriptResponseParameters")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * DatasourceID.
             */
            public Builder datasourceID(Long datasourceID) {
                this.datasourceID = datasourceID;
                return this;
            }

            /**
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
             * IsPaginated.
             */
            public Builder isPaginated(Boolean isPaginated) {
                this.isPaginated = isPaginated;
                return this;
            }

            /**
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
             * <p>This parameter is required.</p>
             */
            public Builder scriptRequestParameters(java.util.List<ScriptRequestParameters> scriptRequestParameters) {
                this.scriptRequestParameters = scriptRequestParameters;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder scriptResponseParameters(java.util.List<ScriptResponseParameters> scriptResponseParameters) {
                this.scriptResponseParameters = scriptResponseParameters;
                return this;
            }

            /**
             * SortPriority.
             */
            public Builder sortPriority(Integer sortPriority) {
                this.sortPriority = sortPriority;
                return this;
            }

            /**
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
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cacheTimeout;

        @com.aliyun.core.annotation.NameInMap("CallMode")
        private Integer callMode;

        @com.aliyun.core.annotation.NameInMap("CustomUpdateRate")
        private String customUpdateRate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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
            this.executionTimeout = builder.executionTimeout;
            this.mode = builder.mode;
            this.projectId = builder.projectId;
            this.requestType = builder.requestType;
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
            private Integer executionTimeout; 
            private Integer mode; 
            private Long projectId; 
            private Integer requestType; 
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
                this.executionTimeout = model.executionTimeout;
                this.mode = model.mode;
                this.projectId = model.projectId;
                this.requestType = model.requestType;
                this.scriptDetails = model.scriptDetails;
                this.timeout = model.timeout;
                this.updateRate = model.updateRate;
                this.version = model.version;
            } 

            /**
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
             * <p>This parameter is required.</p>
             */
            public Builder apiGroupName(String apiGroupName) {
                this.apiGroupName = apiGroupName;
                return this;
            }

            /**
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
             * <p>This parameter is required.</p>
             */
            public Builder bizProtocol(java.util.List<Integer> bizProtocol) {
                this.bizProtocol = bizProtocol;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder cacheTimeout(Integer cacheTimeout) {
                this.cacheTimeout = cacheTimeout;
                return this;
            }

            /**
             * CallMode.
             */
            public Builder callMode(Integer callMode) {
                this.callMode = callMode;
                return this;
            }

            /**
             * CustomUpdateRate.
             */
            public Builder customUpdateRate(String customUpdateRate) {
                this.customUpdateRate = customUpdateRate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExecutionTimeout.
             */
            public Builder executionTimeout(Integer executionTimeout) {
                this.executionTimeout = executionTimeout;
                return this;
            }

            /**
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
             * <p>This parameter is required.</p>
             */
            public Builder scriptDetails(ScriptDetails scriptDetails) {
                this.scriptDetails = scriptDetails;
                return this;
            }

            /**
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
             * UpdateRate.
             */
            public Builder updateRate(Integer updateRate) {
                this.updateRate = updateRate;
                return this;
            }

            /**
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
