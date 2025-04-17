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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * ListResult.
         */
        public Builder listResult(ListResult listResult) {
            this.listResult = listResult;
            return this;
        }

        /**
         * Message.
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
         * Success.
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
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
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
             * DatasourceType.
             */
            public Builder datasourceType(Long datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * DatasourceUrl.
             */
            public Builder datasourceUrl(String datasourceUrl) {
                this.datasourceUrl = datasourceUrl;
                return this;
            }

            /**
             * TableName.
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
             * DateFormat.
             */
            public Builder dateFormat(String dateFormat) {
                this.dateFormat = dateFormat;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * DescriptionCode.
             */
            public Builder descriptionCode(String descriptionCode) {
                this.descriptionCode = descriptionCode;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InitialValue.
             */
            public Builder initialValue(String initialValue) {
                this.initialValue = initialValue;
                return this;
            }

            /**
             * MappingColumn.
             */
            public Builder mappingColumn(String mappingColumn) {
                this.mappingColumn = mappingColumn;
                return this;
            }

            /**
             * Must.
             */
            public Builder must(Long must) {
                this.must = must;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Optional.
             */
            public Builder optional(Long optional) {
                this.optional = optional;
                return this;
            }

            /**
             * OriginalColumn.
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * ParameterLocation.
             */
            public Builder parameterLocation(String parameterLocation) {
                this.parameterLocation = parameterLocation;
                return this;
            }

            /**
             * Sample.
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
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * AuthenticationMode.
             */
            public Builder authenticationMode(String authenticationMode) {
                this.authenticationMode = authenticationMode;
                return this;
            }

            /**
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
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
             * FailExample.
             */
            public Builder failExample(String failExample) {
                this.failExample = failExample;
                return this;
            }

            /**
             * HttpMethod.
             */
            public Builder httpMethod(Long httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(Long modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SuccessExample.
             */
            public Builder successExample(String successExample) {
                this.successExample = successExample;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Url.
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
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
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
             * DatasourceType.
             */
            public Builder datasourceType(Long datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * DatasourceUrl.
             */
            public Builder datasourceUrl(String datasourceUrl) {
                this.datasourceUrl = datasourceUrl;
                return this;
            }

            /**
             * TableName.
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
             * DateFormat.
             */
            public Builder dateFormat(String dateFormat) {
                this.dateFormat = dateFormat;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * DescriptionCode.
             */
            public Builder descriptionCode(String descriptionCode) {
                this.descriptionCode = descriptionCode;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InitialValue.
             */
            public Builder initialValue(String initialValue) {
                this.initialValue = initialValue;
                return this;
            }

            /**
             * MappingColumn.
             */
            public Builder mappingColumn(String mappingColumn) {
                this.mappingColumn = mappingColumn;
                return this;
            }

            /**
             * Must.
             */
            public Builder must(Long must) {
                this.must = must;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Optional.
             */
            public Builder optional(Long optional) {
                this.optional = optional;
                return this;
            }

            /**
             * OriginalColumn.
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * ParameterLocation.
             */
            public Builder parameterLocation(String parameterLocation) {
                this.parameterLocation = parameterLocation;
                return this;
            }

            /**
             * Sample.
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
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
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
             * DatasourceType.
             */
            public Builder datasourceType(Long datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * DatasourceUrl.
             */
            public Builder datasourceUrl(String datasourceUrl) {
                this.datasourceUrl = datasourceUrl;
                return this;
            }

            /**
             * TableName.
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
             * DateFormat.
             */
            public Builder dateFormat(String dateFormat) {
                this.dateFormat = dateFormat;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * DescriptionCode.
             */
            public Builder descriptionCode(String descriptionCode) {
                this.descriptionCode = descriptionCode;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InitialValue.
             */
            public Builder initialValue(String initialValue) {
                this.initialValue = initialValue;
                return this;
            }

            /**
             * MappingColumn.
             */
            public Builder mappingColumn(String mappingColumn) {
                this.mappingColumn = mappingColumn;
                return this;
            }

            /**
             * Must.
             */
            public Builder must(Long must) {
                this.must = must;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Optional.
             */
            public Builder optional(Long optional) {
                this.optional = optional;
                return this;
            }

            /**
             * OriginalColumn.
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * ParameterLocation.
             */
            public Builder parameterLocation(String parameterLocation) {
                this.parameterLocation = parameterLocation;
                return this;
            }

            /**
             * Sample.
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
             * ApiNo.
             */
            public Builder apiNo(Long apiNo) {
                this.apiNo = apiNo;
                return this;
            }

            /**
             * ApiTimeout.
             */
            public Builder apiTimeout(Long apiTimeout) {
                this.apiTimeout = apiTimeout;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BizModuleEnName.
             */
            public Builder bizModuleEnName(String bizModuleEnName) {
                this.bizModuleEnName = bizModuleEnName;
                return this;
            }

            /**
             * CacheSwitch.
             */
            public Builder cacheSwitch(String cacheSwitch) {
                this.cacheSwitch = cacheSwitch;
                return this;
            }

            /**
             * CacheTime.
             */
            public Builder cacheTime(String cacheTime) {
                this.cacheTime = cacheTime;
                return this;
            }

            /**
             * CreateType.
             */
            public Builder createType(Long createType) {
                this.createType = createType;
                return this;
            }

            /**
             * DbEnv.
             */
            public Builder dbEnv(Long dbEnv) {
                this.dbEnv = dbEnv;
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
             * DirectDatasourceId.
             */
            public Builder directDatasourceId(Long directDatasourceId) {
                this.directDatasourceId = directDatasourceId;
                return this;
            }

            /**
             * DirectDatasourceName.
             */
            public Builder directDatasourceName(String directDatasourceName) {
                this.directDatasourceName = directDatasourceName;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsLogicalTable.
             */
            public Builder isLogicalTable(Boolean isLogicalTable) {
                this.isLogicalTable = isLogicalTable;
                return this;
            }

            /**
             * IsPagedQuery.
             */
            public Builder isPagedQuery(Long isPagedQuery) {
                this.isPagedQuery = isPagedQuery;
                return this;
            }

            /**
             * MaxReturnNum.
             */
            public Builder maxReturnNum(Long maxReturnNum) {
                this.maxReturnNum = maxReturnNum;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(Long modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjId.
             */
            public Builder projId(Long projId) {
                this.projId = projId;
                return this;
            }

            /**
             * ProjName.
             */
            public Builder projName(String projName) {
                this.projName = projName;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(Long protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * ProtocolName.
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
             * RegisterApi.
             */
            public Builder registerApi(RegisterApi registerApi) {
                this.registerApi = registerApi;
                return this;
            }

            /**
             * RequestMethod.
             */
            public Builder requestMethod(Long requestMethod) {
                this.requestMethod = requestMethod;
                return this;
            }

            /**
             * RequestMethodName.
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
             * ResourceGroupName.
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
             * ResultSample.
             */
            public Builder resultSample(String resultSample) {
                this.resultSample = resultSample;
                return this;
            }

            /**
             * ReturnType.
             */
            public Builder returnType(Long returnType) {
                this.returnType = returnType;
                return this;
            }

            /**
             * ReturnTypeName.
             */
            public Builder returnTypeName(String returnTypeName) {
                this.returnTypeName = returnTypeName;
                return this;
            }

            /**
             * RsGrpId.
             */
            public Builder rsGrpId(String rsGrpId) {
                this.rsGrpId = rsGrpId;
                return this;
            }

            /**
             * ScriptType.
             */
            public Builder scriptType(String scriptType) {
                this.scriptType = scriptType;
                return this;
            }

            /**
             * SpecialSql.
             */
            public Builder specialSql(Long specialSql) {
                this.specialSql = specialSql;
                return this;
            }

            /**
             * SqlStatement.
             */
            public Builder sqlStatement(String sqlStatement) {
                this.sqlStatement = sqlStatement;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * UpdateRate.
             */
            public Builder updateRate(Long updateRate) {
                this.updateRate = updateRate;
                return this;
            }

            /**
             * UpdateRateName.
             */
            public Builder updateRateName(String updateRateName) {
                this.updateRateName = updateRateName;
                return this;
            }

            /**
             * Version.
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
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * TotalCount.
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
