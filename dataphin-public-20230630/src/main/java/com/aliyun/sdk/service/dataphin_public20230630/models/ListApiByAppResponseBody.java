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
 * {@link ListApiByAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiByAppResponseBody</p>
 */
public class ListApiByAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ListResult")
    private ListResult listResult;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListApiByAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.listResult = builder.listResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiByAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return listResult
     */
    public ListResult getListResult() {
        return this.listResult;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private ListResult listResult; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListApiByAppResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.listResult = model.listResult;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder listResult(ListResult listResult) {
            this.listResult = listResult;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListApiByAppResponseBody build() {
            return new ListApiByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class TableAndDsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private String datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        private Long datasourceType;

        @com.aliyun.core.annotation.NameInMap("DatasourceUrl")
        private String datasourceUrl;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TableAndDsList(Builder builder) {
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.datasourceType = builder.datasourceType;
            this.datasourceUrl = builder.datasourceUrl;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableAndDsList create() {
            return builder().build();
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return datasourceType
         */
        public Long getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return datasourceUrl
         */
        public String getDatasourceUrl() {
            return this.datasourceUrl;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String datasourceId; 
            private String datasourceName; 
            private Long datasourceType; 
            private String datasourceUrl; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(TableAndDsList model) {
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.datasourceType = model.datasourceType;
                this.datasourceUrl = model.datasourceUrl;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The datasource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds54321</p>
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The datasource name.</p>
             * 
             * <strong>example:</strong>
             * <p>publicDatasource</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The datasource type.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder datasourceType(Long datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * <p>The datasource URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/public_datasource">https://example.com/public_datasource</a></p>
             */
            public Builder datasourceUrl(String datasourceUrl) {
                this.datasourceUrl = datasourceUrl;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>public_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableAndDsList build() {
                return new TableAndDsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class PublicParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateFormat")
        private String dateFormat;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionCode")
        private String descriptionCode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InitialValue")
        private String initialValue;

        @com.aliyun.core.annotation.NameInMap("MappingColumn")
        private String mappingColumn;

        @com.aliyun.core.annotation.NameInMap("Must")
        private Long must;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private Long optional;

        @com.aliyun.core.annotation.NameInMap("OriginalColumn")
        private String originalColumn;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParameterLocation")
        private String parameterLocation;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("TableAndDsList")
        private java.util.List<TableAndDsList> tableAndDsList;

        private PublicParamList(Builder builder) {
            this.dateFormat = builder.dateFormat;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.descriptionCode = builder.descriptionCode;
            this.id = builder.id;
            this.initialValue = builder.initialValue;
            this.mappingColumn = builder.mappingColumn;
            this.must = builder.must;
            this.operator = builder.operator;
            this.optional = builder.optional;
            this.originalColumn = builder.originalColumn;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
            this.parameterLocation = builder.parameterLocation;
            this.sample = builder.sample;
            this.tableAndDsList = builder.tableAndDsList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicParamList create() {
            return builder().build();
        }

        /**
         * @return dateFormat
         */
        public String getDateFormat() {
            return this.dateFormat;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionCode
         */
        public String getDescriptionCode() {
            return this.descriptionCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return initialValue
         */
        public String getInitialValue() {
            return this.initialValue;
        }

        /**
         * @return mappingColumn
         */
        public String getMappingColumn() {
            return this.mappingColumn;
        }

        /**
         * @return must
         */
        public Long getMust() {
            return this.must;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return optional
         */
        public Long getOptional() {
            return this.optional;
        }

        /**
         * @return originalColumn
         */
        public String getOriginalColumn() {
            return this.originalColumn;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return parameterLocation
         */
        public String getParameterLocation() {
            return this.parameterLocation;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return tableAndDsList
         */
        public java.util.List<TableAndDsList> getTableAndDsList() {
            return this.tableAndDsList;
        }

        public static final class Builder {
            private String dateFormat; 
            private String defaultValue; 
            private String description; 
            private String descriptionCode; 
            private Long id; 
            private String initialValue; 
            private String mappingColumn; 
            private Long must; 
            private String operator; 
            private Long optional; 
            private String originalColumn; 
            private String paramName; 
            private String paramType; 
            private String parameterLocation; 
            private String sample; 
            private java.util.List<TableAndDsList> tableAndDsList; 

            private Builder() {
            } 

            private Builder(PublicParamList model) {
                this.dateFormat = model.dateFormat;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.descriptionCode = model.descriptionCode;
                this.id = model.id;
                this.initialValue = model.initialValue;
                this.mappingColumn = model.mappingColumn;
                this.must = model.must;
                this.operator = model.operator;
                this.optional = model.optional;
                this.originalColumn = model.originalColumn;
                this.paramName = model.paramName;
                this.paramType = model.paramType;
                this.parameterLocation = model.parameterLocation;
                this.sample = model.sample;
                this.tableAndDsList = model.tableAndDsList;
            } 

            /**
             * <p>The date format.</p>
             * 
             * <strong>example:</strong>
             * <p>yyyy-MM-dd</p>
             */
            public Builder dateFormat(String dateFormat) {
                this.dateFormat = dateFormat;
                return this;
            }

            /**
             * <p>The default value for registered APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>default_public_value</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个示例公共参数</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter description code.</p>
             * 
             * <strong>example:</strong>
             * <p>CODE_003</p>
             */
            public Builder descriptionCode(String descriptionCode) {
                this.descriptionCode = descriptionCode;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The initial value.</p>
             * 
             * <strong>example:</strong>
             * <p>app_key_value</p>
             */
            public Builder initialValue(String initialValue) {
                this.initialValue = initialValue;
                return this;
            }

            /**
             * <p>The frontend binding field.</p>
             * 
             * <strong>example:</strong>
             * <p>publicColumn1</p>
             */
            public Builder mappingColumn(String mappingColumn) {
                this.mappingColumn = mappingColumn;
                return this;
            }

            /**
             * <p>Indicates whether the request parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder must(Long must) {
                this.must = must;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is editable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder optional(Long optional) {
                this.optional = optional;
                return this;
            }

            /**
             * <p>The original field name.</p>
             * 
             * <strong>example:</strong>
             * <p>original_public_column</p>
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * <p>The frontend parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>publicParam1</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The parameter type.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The request parameter location for registered APIs or the value path for response parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>/path/to/public_param</p>
             */
            public Builder parameterLocation(String parameterLocation) {
                this.parameterLocation = parameterLocation;
                return this;
            }

            /**
             * <p>The parameter example.</p>
             * 
             * <strong>example:</strong>
             * <p>publicValue1</p>
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder tableAndDsList(java.util.List<TableAndDsList> tableAndDsList) {
                this.tableAndDsList = tableAndDsList;
                return this;
            }

            public PublicParamList build() {
                return new PublicParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class RegisterApi extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("AuthenticationMode")
        private String authenticationMode;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private String datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("FailExample")
        private String failExample;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private Long httpMethod;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private Long modelType;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SuccessExample")
        private String successExample;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private RegisterApi(Builder builder) {
            this.apiId = builder.apiId;
            this.authenticationMode = builder.authenticationMode;
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.failExample = builder.failExample;
            this.httpMethod = builder.httpMethod;
            this.modelType = builder.modelType;
            this.path = builder.path;
            this.protocol = builder.protocol;
            this.successExample = builder.successExample;
            this.timeout = builder.timeout;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegisterApi create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return authenticationMode
         */
        public String getAuthenticationMode() {
            return this.authenticationMode;
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return failExample
         */
        public String getFailExample() {
            return this.failExample;
        }

        /**
         * @return httpMethod
         */
        public Long getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return modelType
         */
        public Long getModelType() {
            return this.modelType;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return successExample
         */
        public String getSuccessExample() {
            return this.successExample;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long apiId; 
            private String authenticationMode; 
            private String datasourceId; 
            private String datasourceName; 
            private String failExample; 
            private Long httpMethod; 
            private Long modelType; 
            private String path; 
            private String protocol; 
            private String successExample; 
            private Long timeout; 
            private String url; 

            private Builder() {
            } 

            private Builder(RegisterApi model) {
                this.apiId = model.apiId;
                this.authenticationMode = model.authenticationMode;
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.failExample = model.failExample;
                this.httpMethod = model.httpMethod;
                this.modelType = model.modelType;
                this.path = model.path;
                this.protocol = model.protocol;
                this.successExample = model.successExample;
                this.timeout = model.timeout;
                this.url = model.url;
            } 

            /**
             * <p>The primary key of data_api.</p>
             * 
             * <strong>example:</strong>
             * <p>67890</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API datasource authentication mode.</p>
             * 
             * <strong>example:</strong>
             * <p>OAuth2</p>
             */
            public Builder authenticationMode(String authenticationMode) {
                this.authenticationMode = authenticationMode;
                return this;
            }

            /**
             * <p>The API datasource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds67890</p>
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The API datasource name.</p>
             * 
             * <strong>example:</strong>
             * <p>registerDatasource</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The failure example.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;status&quot;:&quot;error&quot;,&quot;message&quot;:&quot;Invalid request&quot;}</p>
             */
            public Builder failExample(String failExample) {
                this.failExample = failExample;
                return this;
            }

            /**
             * <p>The HTTP method of the registered API.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder httpMethod(Long httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The model type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder modelType(Long modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>The service path.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/v1/register</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The API datasource request protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The success example.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;status&quot;:&quot;success&quot;,&quot;data&quot;:[]}</p>
             */
            public Builder successExample(String successExample) {
                this.successExample = successExample;
                return this;
            }

            /**
             * <p>The timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The API datasource URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/register_api">https://example.com/register_api</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RegisterApi build() {
                return new RegisterApi(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class RequestParamListTableAndDsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private String datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        private Long datasourceType;

        @com.aliyun.core.annotation.NameInMap("DatasourceUrl")
        private String datasourceUrl;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private RequestParamListTableAndDsList(Builder builder) {
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.datasourceType = builder.datasourceType;
            this.datasourceUrl = builder.datasourceUrl;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParamListTableAndDsList create() {
            return builder().build();
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return datasourceType
         */
        public Long getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return datasourceUrl
         */
        public String getDatasourceUrl() {
            return this.datasourceUrl;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String datasourceId; 
            private String datasourceName; 
            private Long datasourceType; 
            private String datasourceUrl; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(RequestParamListTableAndDsList model) {
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.datasourceType = model.datasourceType;
                this.datasourceUrl = model.datasourceUrl;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The datasource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds12345</p>
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The datasource name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleDatasource</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The datasource type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder datasourceType(Long datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * <p>The datasource URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/datasource">https://example.com/datasource</a></p>
             */
            public Builder datasourceUrl(String datasourceUrl) {
                this.datasourceUrl = datasourceUrl;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>example_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public RequestParamListTableAndDsList build() {
                return new RequestParamListTableAndDsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class RequestParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateFormat")
        private String dateFormat;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionCode")
        private String descriptionCode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InitialValue")
        private String initialValue;

        @com.aliyun.core.annotation.NameInMap("MappingColumn")
        private String mappingColumn;

        @com.aliyun.core.annotation.NameInMap("Must")
        private Long must;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private Long optional;

        @com.aliyun.core.annotation.NameInMap("OriginalColumn")
        private String originalColumn;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParameterLocation")
        private String parameterLocation;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("TableAndDsList")
        private java.util.List<RequestParamListTableAndDsList> tableAndDsList;

        private RequestParamList(Builder builder) {
            this.dateFormat = builder.dateFormat;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.descriptionCode = builder.descriptionCode;
            this.id = builder.id;
            this.initialValue = builder.initialValue;
            this.mappingColumn = builder.mappingColumn;
            this.must = builder.must;
            this.operator = builder.operator;
            this.optional = builder.optional;
            this.originalColumn = builder.originalColumn;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
            this.parameterLocation = builder.parameterLocation;
            this.sample = builder.sample;
            this.tableAndDsList = builder.tableAndDsList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParamList create() {
            return builder().build();
        }

        /**
         * @return dateFormat
         */
        public String getDateFormat() {
            return this.dateFormat;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionCode
         */
        public String getDescriptionCode() {
            return this.descriptionCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return initialValue
         */
        public String getInitialValue() {
            return this.initialValue;
        }

        /**
         * @return mappingColumn
         */
        public String getMappingColumn() {
            return this.mappingColumn;
        }

        /**
         * @return must
         */
        public Long getMust() {
            return this.must;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return optional
         */
        public Long getOptional() {
            return this.optional;
        }

        /**
         * @return originalColumn
         */
        public String getOriginalColumn() {
            return this.originalColumn;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return parameterLocation
         */
        public String getParameterLocation() {
            return this.parameterLocation;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return tableAndDsList
         */
        public java.util.List<RequestParamListTableAndDsList> getTableAndDsList() {
            return this.tableAndDsList;
        }

        public static final class Builder {
            private String dateFormat; 
            private String defaultValue; 
            private String description; 
            private String descriptionCode; 
            private Long id; 
            private String initialValue; 
            private String mappingColumn; 
            private Long must; 
            private String operator; 
            private Long optional; 
            private String originalColumn; 
            private String paramName; 
            private String paramType; 
            private String parameterLocation; 
            private String sample; 
            private java.util.List<RequestParamListTableAndDsList> tableAndDsList; 

            private Builder() {
            } 

            private Builder(RequestParamList model) {
                this.dateFormat = model.dateFormat;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.descriptionCode = model.descriptionCode;
                this.id = model.id;
                this.initialValue = model.initialValue;
                this.mappingColumn = model.mappingColumn;
                this.must = model.must;
                this.operator = model.operator;
                this.optional = model.optional;
                this.originalColumn = model.originalColumn;
                this.paramName = model.paramName;
                this.paramType = model.paramType;
                this.parameterLocation = model.parameterLocation;
                this.sample = model.sample;
                this.tableAndDsList = model.tableAndDsList;
            } 

            /**
             * <p>The date format.</p>
             * 
             * <strong>example:</strong>
             * <p>yyyy-MM-dd</p>
             */
            public Builder dateFormat(String dateFormat) {
                this.dateFormat = dateFormat;
                return this;
            }

            /**
             * <p>The default value for registered APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>default_value</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个示例参数</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter description code.</p>
             * 
             * <strong>example:</strong>
             * <p>CODE_001</p>
             */
            public Builder descriptionCode(String descriptionCode) {
                this.descriptionCode = descriptionCode;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The initial value.</p>
             * 
             * <strong>example:</strong>
             * <p>app_key_value</p>
             */
            public Builder initialValue(String initialValue) {
                this.initialValue = initialValue;
                return this;
            }

            /**
             * <p>The frontend binding field.</p>
             * 
             * <strong>example:</strong>
             * <p>column1</p>
             */
            public Builder mappingColumn(String mappingColumn) {
                this.mappingColumn = mappingColumn;
                return this;
            }

            /**
             * <p>Indicates whether the request parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder must(Long must) {
                this.must = must;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is editable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder optional(Long optional) {
                this.optional = optional;
                return this;
            }

            /**
             * <p>The original field name.</p>
             * 
             * <strong>example:</strong>
             * <p>original_column</p>
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * <p>The frontend parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The parameter type.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The request parameter location for registered APIs or the value path for response parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>/path/to/param</p>
             */
            public Builder parameterLocation(String parameterLocation) {
                this.parameterLocation = parameterLocation;
                return this;
            }

            /**
             * <p>The parameter example.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder tableAndDsList(java.util.List<RequestParamListTableAndDsList> tableAndDsList) {
                this.tableAndDsList = tableAndDsList;
                return this;
            }

            public RequestParamList build() {
                return new RequestParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class ResponseParamListTableAndDsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private String datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        private Long datasourceType;

        @com.aliyun.core.annotation.NameInMap("DatasourceUrl")
        private String datasourceUrl;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private ResponseParamListTableAndDsList(Builder builder) {
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.datasourceType = builder.datasourceType;
            this.datasourceUrl = builder.datasourceUrl;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseParamListTableAndDsList create() {
            return builder().build();
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return datasourceType
         */
        public Long getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return datasourceUrl
         */
        public String getDatasourceUrl() {
            return this.datasourceUrl;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String datasourceId; 
            private String datasourceName; 
            private Long datasourceType; 
            private String datasourceUrl; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(ResponseParamListTableAndDsList model) {
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.datasourceType = model.datasourceType;
                this.datasourceUrl = model.datasourceUrl;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The datasource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds67890</p>
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The datasource name.</p>
             * 
             * <strong>example:</strong>
             * <p>responseDatasource</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The datasource type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder datasourceType(Long datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * <p>The datasource URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/response_datasource">https://example.com/response_datasource</a></p>
             */
            public Builder datasourceUrl(String datasourceUrl) {
                this.datasourceUrl = datasourceUrl;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>response_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public ResponseParamListTableAndDsList build() {
                return new ResponseParamListTableAndDsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class ResponseParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateFormat")
        private String dateFormat;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionCode")
        private String descriptionCode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InitialValue")
        private String initialValue;

        @com.aliyun.core.annotation.NameInMap("MappingColumn")
        private String mappingColumn;

        @com.aliyun.core.annotation.NameInMap("Must")
        private Long must;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private Long optional;

        @com.aliyun.core.annotation.NameInMap("OriginalColumn")
        private String originalColumn;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParameterLocation")
        private String parameterLocation;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("TableAndDsList")
        private java.util.List<ResponseParamListTableAndDsList> tableAndDsList;

        private ResponseParamList(Builder builder) {
            this.dateFormat = builder.dateFormat;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.descriptionCode = builder.descriptionCode;
            this.id = builder.id;
            this.initialValue = builder.initialValue;
            this.mappingColumn = builder.mappingColumn;
            this.must = builder.must;
            this.operator = builder.operator;
            this.optional = builder.optional;
            this.originalColumn = builder.originalColumn;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
            this.parameterLocation = builder.parameterLocation;
            this.sample = builder.sample;
            this.tableAndDsList = builder.tableAndDsList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseParamList create() {
            return builder().build();
        }

        /**
         * @return dateFormat
         */
        public String getDateFormat() {
            return this.dateFormat;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionCode
         */
        public String getDescriptionCode() {
            return this.descriptionCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return initialValue
         */
        public String getInitialValue() {
            return this.initialValue;
        }

        /**
         * @return mappingColumn
         */
        public String getMappingColumn() {
            return this.mappingColumn;
        }

        /**
         * @return must
         */
        public Long getMust() {
            return this.must;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return optional
         */
        public Long getOptional() {
            return this.optional;
        }

        /**
         * @return originalColumn
         */
        public String getOriginalColumn() {
            return this.originalColumn;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return parameterLocation
         */
        public String getParameterLocation() {
            return this.parameterLocation;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return tableAndDsList
         */
        public java.util.List<ResponseParamListTableAndDsList> getTableAndDsList() {
            return this.tableAndDsList;
        }

        public static final class Builder {
            private String dateFormat; 
            private String defaultValue; 
            private String description; 
            private String descriptionCode; 
            private Long id; 
            private String initialValue; 
            private String mappingColumn; 
            private Long must; 
            private String operator; 
            private Long optional; 
            private String originalColumn; 
            private String paramName; 
            private String paramType; 
            private String parameterLocation; 
            private String sample; 
            private java.util.List<ResponseParamListTableAndDsList> tableAndDsList; 

            private Builder() {
            } 

            private Builder(ResponseParamList model) {
                this.dateFormat = model.dateFormat;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.descriptionCode = model.descriptionCode;
                this.id = model.id;
                this.initialValue = model.initialValue;
                this.mappingColumn = model.mappingColumn;
                this.must = model.must;
                this.operator = model.operator;
                this.optional = model.optional;
                this.originalColumn = model.originalColumn;
                this.paramName = model.paramName;
                this.paramType = model.paramType;
                this.parameterLocation = model.parameterLocation;
                this.sample = model.sample;
                this.tableAndDsList = model.tableAndDsList;
            } 

            /**
             * <p>The date format.</p>
             * 
             * <strong>example:</strong>
             * <p>yyyy-MM-dd</p>
             */
            public Builder dateFormat(String dateFormat) {
                this.dateFormat = dateFormat;
                return this;
            }

            /**
             * <p>The default value for registered APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>default_response_value</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个示例响应参数</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter description code.</p>
             * 
             * <strong>example:</strong>
             * <p>CODE_002</p>
             */
            public Builder descriptionCode(String descriptionCode) {
                this.descriptionCode = descriptionCode;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The initial value.</p>
             * 
             * <strong>example:</strong>
             * <p>app_key_value</p>
             */
            public Builder initialValue(String initialValue) {
                this.initialValue = initialValue;
                return this;
            }

            /**
             * <p>The frontend binding field.</p>
             * 
             * <strong>example:</strong>
             * <p>responseColumn1</p>
             */
            public Builder mappingColumn(String mappingColumn) {
                this.mappingColumn = mappingColumn;
                return this;
            }

            /**
             * <p>Indicates whether the request parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder must(Long must) {
                this.must = must;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is editable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder optional(Long optional) {
                this.optional = optional;
                return this;
            }

            /**
             * <p>The original field name.</p>
             * 
             * <strong>example:</strong>
             * <p>original_response_column</p>
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * <p>The frontend parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>responseParam1</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The parameter type.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The request parameter location for registered APIs or the value path for response parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>/path/to/response_param</p>
             */
            public Builder parameterLocation(String parameterLocation) {
                this.parameterLocation = parameterLocation;
                return this;
            }

            /**
             * <p>The parameter example.</p>
             * 
             * <strong>example:</strong>
             * <p>responseValue1</p>
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder tableAndDsList(java.util.List<ResponseParamListTableAndDsList> tableAndDsList) {
                this.tableAndDsList = tableAndDsList;
                return this;
            }

            public ResponseParamList build() {
                return new ResponseParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiNo")
        private Long apiNo;

        @com.aliyun.core.annotation.NameInMap("ApiTimeout")
        private Long apiTimeout;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AuthTypes")
        private java.util.List<String> authTypes;

        @com.aliyun.core.annotation.NameInMap("BizModuleEnName")
        private String bizModuleEnName;

        @com.aliyun.core.annotation.NameInMap("CacheSwitch")
        private String cacheSwitch;

        @com.aliyun.core.annotation.NameInMap("CacheTime")
        private String cacheTime;

        @com.aliyun.core.annotation.NameInMap("CreateType")
        private Long createType;

        @com.aliyun.core.annotation.NameInMap("DbEnv")
        private Long dbEnv;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirectDatasourceId")
        private Long directDatasourceId;

        @com.aliyun.core.annotation.NameInMap("DirectDatasourceName")
        private String directDatasourceName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsLogicalTable")
        private Boolean isLogicalTable;

        @com.aliyun.core.annotation.NameInMap("IsPagedQuery")
        private Long isPagedQuery;

        @com.aliyun.core.annotation.NameInMap("MaxReturnNum")
        private Long maxReturnNum;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private Long modelType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjId")
        private Long projId;

        @com.aliyun.core.annotation.NameInMap("ProjName")
        private String projName;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private Long protocol;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        @com.aliyun.core.annotation.NameInMap("PublicParamList")
        private java.util.List<PublicParamList> publicParamList;

        @com.aliyun.core.annotation.NameInMap("RegisterApi")
        private RegisterApi registerApi;

        @com.aliyun.core.annotation.NameInMap("RequestMethod")
        private Long requestMethod;

        @com.aliyun.core.annotation.NameInMap("RequestMethodName")
        private String requestMethodName;

        @com.aliyun.core.annotation.NameInMap("RequestParamList")
        private java.util.List<RequestParamList> requestParamList;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("ResponseParamList")
        private java.util.List<ResponseParamList> responseParamList;

        @com.aliyun.core.annotation.NameInMap("ResultSample")
        private String resultSample;

        @com.aliyun.core.annotation.NameInMap("ReturnType")
        private Long returnType;

        @com.aliyun.core.annotation.NameInMap("ReturnTypeName")
        private String returnTypeName;

        @com.aliyun.core.annotation.NameInMap("RsGrpId")
        private String rsGrpId;

        @com.aliyun.core.annotation.NameInMap("ScriptType")
        private String scriptType;

        @com.aliyun.core.annotation.NameInMap("SpecialSql")
        private Long specialSql;

        @com.aliyun.core.annotation.NameInMap("SqlStatement")
        private String sqlStatement;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private String timeout;

        @com.aliyun.core.annotation.NameInMap("UpdateRate")
        private Long updateRate;

        @com.aliyun.core.annotation.NameInMap("UpdateRateName")
        private String updateRateName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.apiNo = builder.apiNo;
            this.apiTimeout = builder.apiTimeout;
            this.appName = builder.appName;
            this.authTypes = builder.authTypes;
            this.bizModuleEnName = builder.bizModuleEnName;
            this.cacheSwitch = builder.cacheSwitch;
            this.cacheTime = builder.cacheTime;
            this.createType = builder.createType;
            this.dbEnv = builder.dbEnv;
            this.description = builder.description;
            this.directDatasourceId = builder.directDatasourceId;
            this.directDatasourceName = builder.directDatasourceName;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.isLogicalTable = builder.isLogicalTable;
            this.isPagedQuery = builder.isPagedQuery;
            this.maxReturnNum = builder.maxReturnNum;
            this.modelType = builder.modelType;
            this.name = builder.name;
            this.projId = builder.projId;
            this.projName = builder.projName;
            this.protocol = builder.protocol;
            this.protocolName = builder.protocolName;
            this.publicParamList = builder.publicParamList;
            this.registerApi = builder.registerApi;
            this.requestMethod = builder.requestMethod;
            this.requestMethodName = builder.requestMethodName;
            this.requestParamList = builder.requestParamList;
            this.resourceGroupName = builder.resourceGroupName;
            this.responseParamList = builder.responseParamList;
            this.resultSample = builder.resultSample;
            this.returnType = builder.returnType;
            this.returnTypeName = builder.returnTypeName;
            this.rsGrpId = builder.rsGrpId;
            this.scriptType = builder.scriptType;
            this.specialSql = builder.specialSql;
            this.sqlStatement = builder.sqlStatement;
            this.tableName = builder.tableName;
            this.timeout = builder.timeout;
            this.updateRate = builder.updateRate;
            this.updateRateName = builder.updateRateName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiNo
         */
        public Long getApiNo() {
            return this.apiNo;
        }

        /**
         * @return apiTimeout
         */
        public Long getApiTimeout() {
            return this.apiTimeout;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return authTypes
         */
        public java.util.List<String> getAuthTypes() {
            return this.authTypes;
        }

        /**
         * @return bizModuleEnName
         */
        public String getBizModuleEnName() {
            return this.bizModuleEnName;
        }

        /**
         * @return cacheSwitch
         */
        public String getCacheSwitch() {
            return this.cacheSwitch;
        }

        /**
         * @return cacheTime
         */
        public String getCacheTime() {
            return this.cacheTime;
        }

        /**
         * @return createType
         */
        public Long getCreateType() {
            return this.createType;
        }

        /**
         * @return dbEnv
         */
        public Long getDbEnv() {
            return this.dbEnv;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directDatasourceId
         */
        public Long getDirectDatasourceId() {
            return this.directDatasourceId;
        }

        /**
         * @return directDatasourceName
         */
        public String getDirectDatasourceName() {
            return this.directDatasourceName;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isLogicalTable
         */
        public Boolean getIsLogicalTable() {
            return this.isLogicalTable;
        }

        /**
         * @return isPagedQuery
         */
        public Long getIsPagedQuery() {
            return this.isPagedQuery;
        }

        /**
         * @return maxReturnNum
         */
        public Long getMaxReturnNum() {
            return this.maxReturnNum;
        }

        /**
         * @return modelType
         */
        public Long getModelType() {
            return this.modelType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projId
         */
        public Long getProjId() {
            return this.projId;
        }

        /**
         * @return projName
         */
        public String getProjName() {
            return this.projName;
        }

        /**
         * @return protocol
         */
        public Long getProtocol() {
            return this.protocol;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        /**
         * @return publicParamList
         */
        public java.util.List<PublicParamList> getPublicParamList() {
            return this.publicParamList;
        }

        /**
         * @return registerApi
         */
        public RegisterApi getRegisterApi() {
            return this.registerApi;
        }

        /**
         * @return requestMethod
         */
        public Long getRequestMethod() {
            return this.requestMethod;
        }

        /**
         * @return requestMethodName
         */
        public String getRequestMethodName() {
            return this.requestMethodName;
        }

        /**
         * @return requestParamList
         */
        public java.util.List<RequestParamList> getRequestParamList() {
            return this.requestParamList;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return responseParamList
         */
        public java.util.List<ResponseParamList> getResponseParamList() {
            return this.responseParamList;
        }

        /**
         * @return resultSample
         */
        public String getResultSample() {
            return this.resultSample;
        }

        /**
         * @return returnType
         */
        public Long getReturnType() {
            return this.returnType;
        }

        /**
         * @return returnTypeName
         */
        public String getReturnTypeName() {
            return this.returnTypeName;
        }

        /**
         * @return rsGrpId
         */
        public String getRsGrpId() {
            return this.rsGrpId;
        }

        /**
         * @return scriptType
         */
        public String getScriptType() {
            return this.scriptType;
        }

        /**
         * @return specialSql
         */
        public Long getSpecialSql() {
            return this.specialSql;
        }

        /**
         * @return sqlStatement
         */
        public String getSqlStatement() {
            return this.sqlStatement;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        /**
         * @return updateRate
         */
        public Long getUpdateRate() {
            return this.updateRate;
        }

        /**
         * @return updateRateName
         */
        public String getUpdateRateName() {
            return this.updateRateName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long apiNo; 
            private Long apiTimeout; 
            private String appName; 
            private java.util.List<String> authTypes; 
            private String bizModuleEnName; 
            private String cacheSwitch; 
            private String cacheTime; 
            private Long createType; 
            private Long dbEnv; 
            private String description; 
            private Long directDatasourceId; 
            private String directDatasourceName; 
            private Long groupId; 
            private String groupName; 
            private Long id; 
            private Boolean isLogicalTable; 
            private Long isPagedQuery; 
            private Long maxReturnNum; 
            private Long modelType; 
            private String name; 
            private Long projId; 
            private String projName; 
            private Long protocol; 
            private String protocolName; 
            private java.util.List<PublicParamList> publicParamList; 
            private RegisterApi registerApi; 
            private Long requestMethod; 
            private String requestMethodName; 
            private java.util.List<RequestParamList> requestParamList; 
            private String resourceGroupName; 
            private java.util.List<ResponseParamList> responseParamList; 
            private String resultSample; 
            private Long returnType; 
            private String returnTypeName; 
            private String rsGrpId; 
            private String scriptType; 
            private Long specialSql; 
            private String sqlStatement; 
            private String tableName; 
            private String timeout; 
            private Long updateRate; 
            private String updateRateName; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiNo = model.apiNo;
                this.apiTimeout = model.apiTimeout;
                this.appName = model.appName;
                this.authTypes = model.authTypes;
                this.bizModuleEnName = model.bizModuleEnName;
                this.cacheSwitch = model.cacheSwitch;
                this.cacheTime = model.cacheTime;
                this.createType = model.createType;
                this.dbEnv = model.dbEnv;
                this.description = model.description;
                this.directDatasourceId = model.directDatasourceId;
                this.directDatasourceName = model.directDatasourceName;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.id = model.id;
                this.isLogicalTable = model.isLogicalTable;
                this.isPagedQuery = model.isPagedQuery;
                this.maxReturnNum = model.maxReturnNum;
                this.modelType = model.modelType;
                this.name = model.name;
                this.projId = model.projId;
                this.projName = model.projName;
                this.protocol = model.protocol;
                this.protocolName = model.protocolName;
                this.publicParamList = model.publicParamList;
                this.registerApi = model.registerApi;
                this.requestMethod = model.requestMethod;
                this.requestMethodName = model.requestMethodName;
                this.requestParamList = model.requestParamList;
                this.resourceGroupName = model.resourceGroupName;
                this.responseParamList = model.responseParamList;
                this.resultSample = model.resultSample;
                this.returnType = model.returnType;
                this.returnTypeName = model.returnTypeName;
                this.rsGrpId = model.rsGrpId;
                this.scriptType = model.scriptType;
                this.specialSql = model.specialSql;
                this.sqlStatement = model.sqlStatement;
                this.tableName = model.tableName;
                this.timeout = model.timeout;
                this.updateRate = model.updateRate;
                this.updateRateName = model.updateRateName;
                this.version = model.version;
            } 

            /**
             * <p>The API number.</p>
             * 
             * <strong>example:</strong>
             * <p>987654321</p>
             */
            public Builder apiNo(Long apiNo) {
                this.apiNo = apiNo;
                return this;
            }

            /**
             * <p>The API timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder apiTimeout(Long apiTimeout) {
                this.apiTimeout = apiTimeout;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleApp</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The list of permission types.</p>
             */
            public Builder authTypes(java.util.List<String> authTypes) {
                this.authTypes = authTypes;
                return this;
            }

            /**
             * <p>The business module name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleModule</p>
             */
            public Builder bizModuleEnName(String bizModuleEnName) {
                this.bizModuleEnName = bizModuleEnName;
                return this;
            }

            /**
             * <p>The API cache switch.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cacheSwitch(String cacheSwitch) {
                this.cacheSwitch = cacheSwitch;
                return this;
            }

            /**
             * <p>The cache duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder cacheTime(String cacheTime) {
                this.cacheTime = cacheTime;
                return this;
            }

            /**
             * <p>The creation type. Valid values:
             * SQL_MODE(0, &quot;Logical table API - SQL mode&quot;),
             * WIZARD_MODE(1, &quot;Logical table API - wizard mode&quot;),
             * DIRECT_API_MODE(2, &quot;Direct datasource - SQL mode&quot;),
             * REGISTER_API_MODE(3, &quot;Registered API mode&quot;),
             * COMPOSITE_API_MODE(4, &quot;Composite API mode&quot;).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createType(Long createType) {
                this.createType = createType;
                return this;
            }

            /**
             * <p>The data environment.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dbEnv(Long dbEnv) {
                this.dbEnv = dbEnv;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个示例API</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The datasource ID of the direct API.</p>
             * 
             * <strong>example:</strong>
             * <p>54321</p>
             */
            public Builder directDatasourceId(Long directDatasourceId) {
                this.directDatasourceId = directDatasourceId;
                return this;
            }

            /**
             * <p>The datasource name of the direct API.</p>
             * 
             * <strong>example:</strong>
             * <p>directDatasource</p>
             */
            public Builder directDatasourceName(String directDatasourceName) {
                this.directDatasourceName = directDatasourceName;
                return this;
            }

            /**
             * <p>The API group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>67890</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The API group name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the table is a logical table.</p>
             */
            public Builder isLogicalTable(Boolean isLogicalTable) {
                this.isLogicalTable = isLogicalTable;
                return this;
            }

            /**
             * <p>Indicates whether the query is a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isPagedQuery(Long isPagedQuery) {
                this.isPagedQuery = isPagedQuery;
                return this;
            }

            /**
             * <p>The maximum number of returned records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxReturnNum(Long maxReturnNum) {
                this.maxReturnNum = maxReturnNum;
                return this;
            }

            /**
             * <p>The model type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder modelType(Long modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleApi</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The service project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>112233</p>
             */
            public Builder projId(Long projId) {
                this.projId = projId;
                return this;
            }

            /**
             * <p>The service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleProject</p>
             */
            public Builder projName(String projName) {
                this.projName = projName;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder protocol(Long protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The protocol name.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP和HTTPS</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder publicParamList(java.util.List<PublicParamList> publicParamList) {
                this.publicParamList = publicParamList;
                return this;
            }

            /**
             * <p>The registered API information.</p>
             */
            public Builder registerApi(RegisterApi registerApi) {
                this.registerApi = registerApi;
                return this;
            }

            /**
             * <p>The request method.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder requestMethod(Long requestMethod) {
                this.requestMethod = requestMethod;
                return this;
            }

            /**
             * <p>The request method name.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder requestMethodName(String requestMethodName) {
                this.requestMethodName = requestMethodName;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder requestParamList(java.util.List<RequestParamList> requestParamList) {
                this.requestParamList = requestParamList;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleResourceGroup</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder responseParamList(java.util.List<ResponseParamList> responseParamList) {
                this.responseParamList = responseParamList;
                return this;
            }

            /**
             * <p>The sample call result.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;status&quot;:&quot;success&quot;,&quot;data&quot;:[]}</p>
             */
            public Builder resultSample(String resultSample) {
                this.resultSample = resultSample;
                return this;
            }

            /**
             * <p>The return type.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder returnType(Long returnType) {
                this.returnType = returnType;
                return this;
            }

            /**
             * <p>The return type name.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder returnTypeName(String returnTypeName) {
                this.returnTypeName = returnTypeName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>grp12345</p>
             */
            public Builder rsGrpId(String rsGrpId) {
                this.rsGrpId = rsGrpId;
                return this;
            }

            /**
             * <p>The script type.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder scriptType(String scriptType) {
                this.scriptType = scriptType;
                return this;
            }

            /**
             * <p>The special SQL flag.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder specialSql(Long specialSql) {
                this.specialSql = specialSql;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM example_table</p>
             */
            public Builder sqlStatement(String sqlStatement) {
                this.sqlStatement = sqlStatement;
                return this;
            }

            /**
             * <p>The logical table name.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleTable</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The timeout duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The update frequency.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder updateRate(Long updateRate) {
                this.updateRate = updateRate;
                return this;
            }

            /**
             * <p>The update frequency name.</p>
             * 
             * <strong>example:</strong>
             * <p>每日更新</p>
             */
            public Builder updateRateName(String updateRateName) {
                this.updateRateName = updateRateName;
                return this;
            }

            /**
             * <p>The API version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiByAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiByAppResponseBody</p>
     */
    public static class ListResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ListResult(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(ListResult model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The API list.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListResult build() {
                return new ListResult(this);
            } 

        } 

    }
}
