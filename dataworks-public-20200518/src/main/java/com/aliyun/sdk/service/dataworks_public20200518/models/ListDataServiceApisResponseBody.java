// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceApisResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApisResponseBody</p>
 */
public class ListDataServiceApisResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDataServiceApisResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApisResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the creator of the API. The ID can be used to search for the API created by the creator.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The error message.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataServiceApisResponseBody build() {
            return new ListDataServiceApisResponseBody(this);
        } 

    } 

    public static class RegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ErrorSolution")
        private String errorSolution;

        private RegistrationErrorCodes(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.errorSolution = builder.errorSolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistrationErrorCodes create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return errorSolution
         */
        public String getErrorSolution() {
            return this.errorSolution;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String errorSolution; 

            /**
             * The error message.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error codes returned for the API generated by registration.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The error code.
             */
            public Builder errorSolution(String errorSolution) {
                this.errorSolution = errorSolution;
                return this;
            }

            public RegistrationErrorCodes build() {
                return new RegistrationErrorCodes(this);
            } 

        } 

    }
    public static class RegistrationRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("IsRequiredParameter")
        private Boolean isRequiredParameter;

        @NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterOperator")
        private Integer parameterOperator;

        @NameInMap("ParameterPosition")
        private Integer parameterPosition;

        private RegistrationRequestParameters(Builder builder) {
            this.columnName = builder.columnName;
            this.defaultValue = builder.defaultValue;
            this.exampleValue = builder.exampleValue;
            this.isRequiredParameter = builder.isRequiredParameter;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterOperator = builder.parameterOperator;
            this.parameterPosition = builder.parameterPosition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistrationRequestParameters create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
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
        public Integer getParameterDataType() {
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
         * @return parameterOperator
         */
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        /**
         * @return parameterPosition
         */
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public static final class Builder {
            private String columnName; 
            private String defaultValue; 
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private Integer parameterOperator; 
            private Integer parameterPosition; 

            /**
             * The request parameters of the API generated by registration.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. A value of 0 indicates the STRING data type. A value of 1 indicates the INT data type. A value of 2 indicates the LONG data type. A value of 3 indicates the FLOAT data type. A value of 4 indicates the DOUBLE data type. A value of 5 indicates the BOOLEAN data type.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * The sample value of the parameter.
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. A value of 0 indicates that the operator is Equal. A value of 1 indicates that the operator is Like. A value of 2 indicates that the operator is Const. A value of 3 indicates that the operator is In. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * The position of the parameter. Valid values: 0, 1, 2, and 3. A value of 0 indicates that the parameter is in the URL path of the request. A value of 1 indicates that the parameter is in the Query parameter of the request URL. A value of 2 indicates that the parameter is in the request header. A value of 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the associated field. This parameter is supported only if the API is generated in wizard mode.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The default value of the parameter.
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterPosition(Integer parameterPosition) {
                this.parameterPosition = parameterPosition;
                return this;
            }

            public RegistrationRequestParameters build() {
                return new RegistrationRequestParameters(this);
            } 

        } 

    }
    public static class RegistrationDetails extends TeaModel {
        @NameInMap("FailedResultSample")
        private String failedResultSample;

        @NameInMap("RegistrationErrorCodes")
        private java.util.List < RegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        private java.util.List < RegistrationRequestParameters> registrationRequestParameters;

        @NameInMap("ServiceContentType")
        private Integer serviceContentType;

        @NameInMap("ServiceHost")
        private String serviceHost;

        @NameInMap("ServicePath")
        private String servicePath;

        @NameInMap("ServiceRequestBodyDescription")
        private String serviceRequestBodyDescription;

        @NameInMap("SuccessfulResultSample")
        private String successfulResultSample;

        private RegistrationDetails(Builder builder) {
            this.failedResultSample = builder.failedResultSample;
            this.registrationErrorCodes = builder.registrationErrorCodes;
            this.registrationRequestParameters = builder.registrationRequestParameters;
            this.serviceContentType = builder.serviceContentType;
            this.serviceHost = builder.serviceHost;
            this.servicePath = builder.servicePath;
            this.serviceRequestBodyDescription = builder.serviceRequestBodyDescription;
            this.successfulResultSample = builder.successfulResultSample;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistrationDetails create() {
            return builder().build();
        }

        /**
         * @return failedResultSample
         */
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        /**
         * @return registrationErrorCodes
         */
        public java.util.List < RegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        /**
         * @return registrationRequestParameters
         */
        public java.util.List < RegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

        /**
         * @return serviceContentType
         */
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        /**
         * @return serviceHost
         */
        public String getServiceHost() {
            return this.serviceHost;
        }

        /**
         * @return servicePath
         */
        public String getServicePath() {
            return this.servicePath;
        }

        /**
         * @return serviceRequestBodyDescription
         */
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        /**
         * @return successfulResultSample
         */
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public static final class Builder {
            private String failedResultSample; 
            private java.util.List < RegistrationErrorCodes> registrationErrorCodes; 
            private java.util.List < RegistrationRequestParameters> registrationRequestParameters; 
            private Integer serviceContentType; 
            private String serviceHost; 
            private String servicePath; 
            private String serviceRequestBodyDescription; 
            private String successfulResultSample; 

            /**
             * The sample success response of the API.
             */
            public Builder failedResultSample(String failedResultSample) {
                this.failedResultSample = failedResultSample;
                return this;
            }

            /**
             * The body of the request initiated to call the backend service.
             */
            public Builder registrationErrorCodes(java.util.List < RegistrationErrorCodes> registrationErrorCodes) {
                this.registrationErrorCodes = registrationErrorCodes;
                return this;
            }

            /**
             * The solution used to resolve the issue.
             */
            public Builder registrationRequestParameters(java.util.List < RegistrationRequestParameters> registrationRequestParameters) {
                this.registrationRequestParameters = registrationRequestParameters;
                return this;
            }

            /**
             * The URL of the backend service.
             */
            public Builder serviceContentType(Integer serviceContentType) {
                this.serviceContentType = serviceContentType;
                return this;
            }

            /**
             * The details of the API generated by registration. This parameter is returned only if the API is generated by registration.
             */
            public Builder serviceHost(String serviceHost) {
                this.serviceHost = serviceHost;
                return this;
            }

            /**
             * The format in which the response of the API request is returned. Valid values: 0 and 1. A value of 0 indicates the JSON format. A value of 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.
             */
            public Builder servicePath(String servicePath) {
                this.servicePath = servicePath;
                return this;
            }

            /**
             * The sample error response of the API.
             */
            public Builder serviceRequestBodyDescription(String serviceRequestBodyDescription) {
                this.serviceRequestBodyDescription = serviceRequestBodyDescription;
                return this;
            }

            /**
             * The path of the backend service.
             */
            public Builder successfulResultSample(String successfulResultSample) {
                this.successfulResultSample = successfulResultSample;
                return this;
            }

            public RegistrationDetails build() {
                return new RegistrationDetails(this);
            } 

        } 

    }
    public static class ScriptConnection extends TeaModel {
        @NameInMap("ConnectionId")
        private Long connectionId;

        @NameInMap("TableName")
        private String tableName;

        private ScriptConnection(Builder builder) {
            this.connectionId = builder.connectionId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptConnection create() {
            return builder().build();
        }

        /**
         * @return connectionId
         */
        public Long getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long connectionId; 
            private String tableName; 

            /**
             * The ID of the data source.
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * The name of the table in the data source.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public ScriptConnection build() {
                return new ScriptConnection(this);
            } 

        } 

    }
    public static class ScriptRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("IsRequiredParameter")
        private Boolean isRequiredParameter;

        @NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterOperator")
        private Integer parameterOperator;

        @NameInMap("ParameterPosition")
        private Integer parameterPosition;

        private ScriptRequestParameters(Builder builder) {
            this.columnName = builder.columnName;
            this.defaultValue = builder.defaultValue;
            this.exampleValue = builder.exampleValue;
            this.isRequiredParameter = builder.isRequiredParameter;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterOperator = builder.parameterOperator;
            this.parameterPosition = builder.parameterPosition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptRequestParameters create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
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
        public Integer getParameterDataType() {
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
         * @return parameterOperator
         */
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        /**
         * @return parameterPosition
         */
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public static final class Builder {
            private String columnName; 
            private String defaultValue; 
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private Integer parameterOperator; 
            private Integer parameterPosition; 

            /**
             * The name of the associated field. This parameter is supported only if the API is generated in wizard mode.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The default value of the parameter.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The sample value of the parameter.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * Indicates whether the request parameter is required.
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * The data type of the parameter. Valid values:
             * <p>
             * 
             * - 0: STRING
             * - 1: INT
             * - 2: LONG
             * - 3: FLOAT
             * - 4: DOUBLE
             * - 5: BOOLEAN
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The operator used for the value of the parameter. Valid values:
             * <p>
             * 
             * - 0: Equal
             * - 1: Like
             * - 2: Const
             * - 3: In
             * 
             * APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * The position of the parameter. Valid values:
             * <p>
             * 
             * - 0: Path
             * - 1: Query
             * - 2: Head
             * - 3: Body
             * 
             * APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.
             */
            public Builder parameterPosition(Integer parameterPosition) {
                this.parameterPosition = parameterPosition;
                return this;
            }

            public ScriptRequestParameters build() {
                return new ScriptRequestParameters(this);
            } 

        } 

    }
    public static class ScriptResponseParameters extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        private ScriptResponseParameters(Builder builder) {
            this.columnName = builder.columnName;
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
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
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
        public Integer getParameterDataType() {
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
            private String columnName; 
            private String exampleValue; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 

            /**
             * The name of the associated field. This parameter is supported only if the API is generated in wizard mode.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The sample value of the parameter.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * The data type of the parameter. Valid values:
             * <p>
             * 
             * - 0: STRING
             * - 1: INT
             * - 2: LONG
             * - 3: FLOAT
             * - 4: DOUBLE
             * - 5: BOOLEAN
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the parameter.
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
    public static class ScriptDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        private Boolean isPagedResponse;

        @NameInMap("Script")
        private String script;

        @NameInMap("ScriptConnection")
        private ScriptConnection scriptConnection;

        @NameInMap("ScriptRequestParameters")
        private java.util.List < ScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        private java.util.List < ScriptResponseParameters> scriptResponseParameters;

        private ScriptDetails(Builder builder) {
            this.isPagedResponse = builder.isPagedResponse;
            this.script = builder.script;
            this.scriptConnection = builder.scriptConnection;
            this.scriptRequestParameters = builder.scriptRequestParameters;
            this.scriptResponseParameters = builder.scriptResponseParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptDetails create() {
            return builder().build();
        }

        /**
         * @return isPagedResponse
         */
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return scriptConnection
         */
        public ScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

        /**
         * @return scriptRequestParameters
         */
        public java.util.List < ScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        /**
         * @return scriptResponseParameters
         */
        public java.util.List < ScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public static final class Builder {
            private Boolean isPagedResponse; 
            private String script; 
            private ScriptConnection scriptConnection; 
            private java.util.List < ScriptRequestParameters> scriptRequestParameters; 
            private java.util.List < ScriptResponseParameters> scriptResponseParameters; 

            /**
             * Indicates whether the entries are returned by page.
             */
            public Builder isPagedResponse(Boolean isPagedResponse) {
                this.isPagedResponse = isPagedResponse;
                return this;
            }

            /**
             * The SQL script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * The data source information of the API generated in script mode.
             */
            public Builder scriptConnection(ScriptConnection scriptConnection) {
                this.scriptConnection = scriptConnection;
                return this;
            }

            /**
             * The request parameters of the API generated in script mode.
             */
            public Builder scriptRequestParameters(java.util.List < ScriptRequestParameters> scriptRequestParameters) {
                this.scriptRequestParameters = scriptRequestParameters;
                return this;
            }

            /**
             * The response parameters of the API generated in script mode.
             */
            public Builder scriptResponseParameters(java.util.List < ScriptResponseParameters> scriptResponseParameters) {
                this.scriptResponseParameters = scriptResponseParameters;
                return this;
            }

            public ScriptDetails build() {
                return new ScriptDetails(this);
            } 

        } 

    }
    public static class WizardConnection extends TeaModel {
        @NameInMap("ConnectionId")
        private Long connectionId;

        @NameInMap("TableName")
        private String tableName;

        private WizardConnection(Builder builder) {
            this.connectionId = builder.connectionId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WizardConnection create() {
            return builder().build();
        }

        /**
         * @return connectionId
         */
        public Long getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long connectionId; 
            private String tableName; 

            /**
             * The ID of the data source.
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * The name of the table in the data source.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public WizardConnection build() {
                return new WizardConnection(this);
            } 

        } 

    }
    public static class WizardRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("IsRequiredParameter")
        private Boolean isRequiredParameter;

        @NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterOperator")
        private Integer parameterOperator;

        @NameInMap("ParameterPosition")
        private Integer parameterPosition;

        private WizardRequestParameters(Builder builder) {
            this.columnName = builder.columnName;
            this.defaultValue = builder.defaultValue;
            this.exampleValue = builder.exampleValue;
            this.isRequiredParameter = builder.isRequiredParameter;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterOperator = builder.parameterOperator;
            this.parameterPosition = builder.parameterPosition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WizardRequestParameters create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
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
        public Integer getParameterDataType() {
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
         * @return parameterOperator
         */
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        /**
         * @return parameterPosition
         */
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public static final class Builder {
            private String columnName; 
            private String defaultValue; 
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private Integer parameterOperator; 
            private Integer parameterPosition; 

            /**
             * The name of the associated field. This parameter is supported only if the API is generated in wizard mode.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The default value of the parameter.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The sample value of the parameter.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * Indicates whether the request parameter is required.
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. A value of 0 indicates the STRING data type. A value of 1 indicates the INT data type. A value of 2 indicates the LONG data type. A value of 3 indicates the FLOAT data type. A value of 4 indicates the DOUBLE data type. A value of 5 indicates the BOOLEAN data type.
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. A value of 0 indicates that the operator is Equal. A value of 1 indicates that the operator is Like. A value of 2 indicates that the operator is Const. A value of 3 indicates that the operator is In. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * The position of the parameter. Valid values: 0, 1, 2, and 3. A value of 0 indicates that the parameter is in the URL path of the request. A value of 1 indicates that the parameter is in the Query parameter of the request URL. A value of 2 indicates that the parameter is in the request header. A value of 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.
             */
            public Builder parameterPosition(Integer parameterPosition) {
                this.parameterPosition = parameterPosition;
                return this;
            }

            public WizardRequestParameters build() {
                return new WizardRequestParameters(this);
            } 

        } 

    }
    public static class WizardResponseParameters extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        private WizardResponseParameters(Builder builder) {
            this.columnName = builder.columnName;
            this.exampleValue = builder.exampleValue;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WizardResponseParameters create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
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
        public Integer getParameterDataType() {
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
            private String columnName; 
            private String exampleValue; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 

            /**
             * The name of the associated field. This parameter is supported only if the API is generated in wizard mode.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The sample value of the parameter.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. A value of 0 indicates the STRING data type. A value of 1 indicates the INT data type. A value of 2 indicates the LONG data type. A value of 3 indicates the FLOAT data type. A value of 4 indicates the DOUBLE data type. A value of 5 indicates the BOOLEAN data type.
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public WizardResponseParameters build() {
                return new WizardResponseParameters(this);
            } 

        } 

    }
    public static class WizardDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        private Boolean isPagedResponse;

        @NameInMap("WizardConnection")
        private WizardConnection wizardConnection;

        @NameInMap("WizardRequestParameters")
        private java.util.List < WizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        private java.util.List < WizardResponseParameters> wizardResponseParameters;

        private WizardDetails(Builder builder) {
            this.isPagedResponse = builder.isPagedResponse;
            this.wizardConnection = builder.wizardConnection;
            this.wizardRequestParameters = builder.wizardRequestParameters;
            this.wizardResponseParameters = builder.wizardResponseParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WizardDetails create() {
            return builder().build();
        }

        /**
         * @return isPagedResponse
         */
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        /**
         * @return wizardConnection
         */
        public WizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

        /**
         * @return wizardRequestParameters
         */
        public java.util.List < WizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        /**
         * @return wizardResponseParameters
         */
        public java.util.List < WizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

        public static final class Builder {
            private Boolean isPagedResponse; 
            private WizardConnection wizardConnection; 
            private java.util.List < WizardRequestParameters> wizardRequestParameters; 
            private java.util.List < WizardResponseParameters> wizardResponseParameters; 

            /**
             * Indicates whether the entries are returned by page.
             */
            public Builder isPagedResponse(Boolean isPagedResponse) {
                this.isPagedResponse = isPagedResponse;
                return this;
            }

            /**
             * The data source information of the API generated in wizard mode.
             */
            public Builder wizardConnection(WizardConnection wizardConnection) {
                this.wizardConnection = wizardConnection;
                return this;
            }

            /**
             * The request parameters of the API generated in wizard mode.
             */
            public Builder wizardRequestParameters(java.util.List < WizardRequestParameters> wizardRequestParameters) {
                this.wizardRequestParameters = wizardRequestParameters;
                return this;
            }

            /**
             * The response parameters of the API generated in wizard mode.
             */
            public Builder wizardResponseParameters(java.util.List < WizardResponseParameters> wizardResponseParameters) {
                this.wizardResponseParameters = wizardResponseParameters;
                return this;
            }

            public WizardDetails build() {
                return new WizardDetails(this);
            } 

        } 

    }
    public static class Apis extends TeaModel {
        @NameInMap("ApiId")
        private Long apiId;

        @NameInMap("ApiMode")
        private Integer apiMode;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiPath")
        private String apiPath;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("FolderId")
        private Long folderId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OperatorId")
        private String operatorId;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Protocols")
        private java.util.List < Integer > protocols;

        @NameInMap("RegistrationDetails")
        private RegistrationDetails registrationDetails;

        @NameInMap("RequestMethod")
        private Integer requestMethod;

        @NameInMap("ResponseContentType")
        private Integer responseContentType;

        @NameInMap("ScriptDetails")
        private ScriptDetails scriptDetails;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TenantId")
        private Long tenantId;

        @NameInMap("Timeout")
        private Integer timeout;

        @NameInMap("VisibleRange")
        private Integer visibleRange;

        @NameInMap("WizardDetails")
        private WizardDetails wizardDetails;

        private Apis(Builder builder) {
            this.apiId = builder.apiId;
            this.apiMode = builder.apiMode;
            this.apiName = builder.apiName;
            this.apiPath = builder.apiPath;
            this.createdTime = builder.createdTime;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.folderId = builder.folderId;
            this.groupId = builder.groupId;
            this.modifiedTime = builder.modifiedTime;
            this.operatorId = builder.operatorId;
            this.projectId = builder.projectId;
            this.protocols = builder.protocols;
            this.registrationDetails = builder.registrationDetails;
            this.requestMethod = builder.requestMethod;
            this.responseContentType = builder.responseContentType;
            this.scriptDetails = builder.scriptDetails;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.timeout = builder.timeout;
            this.visibleRange = builder.visibleRange;
            this.wizardDetails = builder.wizardDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apis create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiMode
         */
        public Integer getApiMode() {
            return this.apiMode;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiPath
         */
        public String getApiPath() {
            return this.apiPath;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return folderId
         */
        public Long getFolderId() {
            return this.folderId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return operatorId
         */
        public String getOperatorId() {
            return this.operatorId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return protocols
         */
        public java.util.List < Integer > getProtocols() {
            return this.protocols;
        }

        /**
         * @return registrationDetails
         */
        public RegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        /**
         * @return requestMethod
         */
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        /**
         * @return responseContentType
         */
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        /**
         * @return scriptDetails
         */
        public ScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return visibleRange
         */
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        /**
         * @return wizardDetails
         */
        public WizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

        public static final class Builder {
            private Long apiId; 
            private Integer apiMode; 
            private String apiName; 
            private String apiPath; 
            private String createdTime; 
            private String creatorId; 
            private String description; 
            private Long folderId; 
            private String groupId; 
            private String modifiedTime; 
            private String operatorId; 
            private Long projectId; 
            private java.util.List < Integer > protocols; 
            private RegistrationDetails registrationDetails; 
            private Integer requestMethod; 
            private Integer responseContentType; 
            private ScriptDetails scriptDetails; 
            private Integer status; 
            private Long tenantId; 
            private Integer timeout; 
            private Integer visibleRange; 
            private WizardDetails wizardDetails; 

            /**
             * The status of the API. Valid values: 0 and 1. A value of 0 indicates that the API is not published. A value of 1 indicates that the API is published.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The ID of the API.
             */
            public Builder apiMode(Integer apiMode) {
                this.apiMode = apiMode;
                return this;
            }

            /**
             * The time when the API was created.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * The request method of the API. Valid values: 0, 1, 2, and 3. A value of 0 indicates the GET method. A value of 1 indicates the POST method. A value of 2 indicates the PUT method. A value of 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The format in which the response of the API request is returned. Valid values: 0 and 1. A value of 0 indicates the JSON format. A value of 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The description of the API.
             */
            public Builder folderId(Long folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the user who last modified the API.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The scope in which the API is visible. Valid values: 0 and 1. A value of 0 indicates that the API is visible within the workspace. A value of 1 indicates that the API is visible only to the API creator.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The time when the API was last modified.
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * The type of the API. Valid values: 0, 1, and 2. A value of 0 indicates that the API is generated in wizard mode. A value of 1 indicates that the API is generated in script mode. A value of 2 indicates that the API is generated by registration.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The path of the API.
             */
            public Builder protocols(java.util.List < Integer > protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * The protocols used by the API. Valid values: 0 and 1. A value of 0 indicates that the API uses HTTP. A value of 1 indicates that the API uses HTTPS. Multiple protocols are presented in a list.
             */
            public Builder registrationDetails(RegistrationDetails registrationDetails) {
                this.registrationDetails = registrationDetails;
                return this;
            }

            /**
             * The ID of the folder in which the API is stored.
             */
            public Builder requestMethod(Integer requestMethod) {
                this.requestMethod = requestMethod;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder responseContentType(Integer responseContentType) {
                this.responseContentType = responseContentType;
                return this;
            }

            /**
             * The details of the API generated in script mode. This parameter is returned only if the API is generated in script mode.
             */
            public Builder scriptDetails(ScriptDetails scriptDetails) {
                this.scriptDetails = scriptDetails;
                return this;
            }

            /**
             * The timeout period of the API request. Unit: milliseconds.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the API.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The APIs in the development state.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the creator of the API.
             */
            public Builder visibleRange(Integer visibleRange) {
                this.visibleRange = visibleRange;
                return this;
            }

            /**
             * The details of the API generated in wizard mode. This parameter is returned only if the API is generated in wizard mode.
             */
            public Builder wizardDetails(WizardDetails wizardDetails) {
                this.wizardDetails = wizardDetails;
                return this;
            }

            public Apis build() {
                return new Apis(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Apis")
        private java.util.List < Apis> apis;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.apis = builder.apis;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apis
         */
        public java.util.List < Apis> getApis() {
            return this.apis;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Apis> apis; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The total number of entries.
             */
            public Builder apis(java.util.List < Apis> apis) {
                this.apis = apis;
                return this;
            }

            /**
             * The information about the APIs in the development state.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. A maximum of 100 entries can be returned on each page.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
