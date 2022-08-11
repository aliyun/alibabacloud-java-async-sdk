// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServicePublishedApiResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServicePublishedApiResponseBody</p>
 */
public class GetDataServicePublishedApiResponseBody extends TeaModel {
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

    private GetDataServicePublishedApiResponseBody(Builder builder) {
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

    public static GetDataServicePublishedApiResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * RequestId.
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

        public GetDataServicePublishedApiResponseBody build() {
            return new GetDataServicePublishedApiResponseBody(this);
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ErrorSolution.
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
            private String defaultValue; 
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private Integer parameterOperator; 
            private Integer parameterPosition; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * IsRequiredParameter.
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * ParameterDataType.
             */
            public Builder parameterDataType(Integer parameterDataType) {
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
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ParameterOperator.
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * ParameterPosition.
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
             * FailedResultSample.
             */
            public Builder failedResultSample(String failedResultSample) {
                this.failedResultSample = failedResultSample;
                return this;
            }

            /**
             * RegistrationErrorCodes.
             */
            public Builder registrationErrorCodes(java.util.List < RegistrationErrorCodes> registrationErrorCodes) {
                this.registrationErrorCodes = registrationErrorCodes;
                return this;
            }

            /**
             * RegistrationRequestParameters.
             */
            public Builder registrationRequestParameters(java.util.List < RegistrationRequestParameters> registrationRequestParameters) {
                this.registrationRequestParameters = registrationRequestParameters;
                return this;
            }

            /**
             * ServiceContentType.
             */
            public Builder serviceContentType(Integer serviceContentType) {
                this.serviceContentType = serviceContentType;
                return this;
            }

            /**
             * ServiceHost.
             */
            public Builder serviceHost(String serviceHost) {
                this.serviceHost = serviceHost;
                return this;
            }

            /**
             * ServicePath.
             */
            public Builder servicePath(String servicePath) {
                this.servicePath = servicePath;
                return this;
            }

            /**
             * ServiceRequestBodyDescription.
             */
            public Builder serviceRequestBodyDescription(String serviceRequestBodyDescription) {
                this.serviceRequestBodyDescription = serviceRequestBodyDescription;
                return this;
            }

            /**
             * SuccessfulResultSample.
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
             * ConnectionId.
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * TableName.
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
    public static class ScriptErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ErrorSolution")
        private String errorSolution;

        private ScriptErrorCodes(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.errorSolution = builder.errorSolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptErrorCodes create() {
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ErrorSolution.
             */
            public Builder errorSolution(String errorSolution) {
                this.errorSolution = errorSolution;
                return this;
            }

            public ScriptErrorCodes build() {
                return new ScriptErrorCodes(this);
            } 

        } 

    }
    public static class ScriptRequestParameters extends TeaModel {
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
            private String defaultValue; 
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private Integer parameterOperator; 
            private Integer parameterPosition; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * IsRequiredParameter.
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * ParameterDataType.
             */
            public Builder parameterDataType(Integer parameterDataType) {
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
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ParameterOperator.
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * ParameterPosition.
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
        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
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
            private String exampleValue; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * ParameterDataType.
             */
            public Builder parameterDataType(Integer parameterDataType) {
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
             * ParameterName.
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
        @NameInMap("FailedResultSample")
        private String failedResultSample;

        @NameInMap("IsPagedResponse")
        private Boolean isPagedResponse;

        @NameInMap("Script")
        private String script;

        @NameInMap("ScriptConnection")
        private ScriptConnection scriptConnection;

        @NameInMap("ScriptErrorCodes")
        private java.util.List < ScriptErrorCodes> scriptErrorCodes;

        @NameInMap("ScriptRequestParameters")
        private java.util.List < ScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        private java.util.List < ScriptResponseParameters> scriptResponseParameters;

        @NameInMap("SuccessfulResultSample")
        private String successfulResultSample;

        private ScriptDetails(Builder builder) {
            this.failedResultSample = builder.failedResultSample;
            this.isPagedResponse = builder.isPagedResponse;
            this.script = builder.script;
            this.scriptConnection = builder.scriptConnection;
            this.scriptErrorCodes = builder.scriptErrorCodes;
            this.scriptRequestParameters = builder.scriptRequestParameters;
            this.scriptResponseParameters = builder.scriptResponseParameters;
            this.successfulResultSample = builder.successfulResultSample;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptDetails create() {
            return builder().build();
        }

        /**
         * @return failedResultSample
         */
        public String getFailedResultSample() {
            return this.failedResultSample;
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
         * @return scriptErrorCodes
         */
        public java.util.List < ScriptErrorCodes> getScriptErrorCodes() {
            return this.scriptErrorCodes;
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

        /**
         * @return successfulResultSample
         */
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public static final class Builder {
            private String failedResultSample; 
            private Boolean isPagedResponse; 
            private String script; 
            private ScriptConnection scriptConnection; 
            private java.util.List < ScriptErrorCodes> scriptErrorCodes; 
            private java.util.List < ScriptRequestParameters> scriptRequestParameters; 
            private java.util.List < ScriptResponseParameters> scriptResponseParameters; 
            private String successfulResultSample; 

            /**
             * FailedResultSample.
             */
            public Builder failedResultSample(String failedResultSample) {
                this.failedResultSample = failedResultSample;
                return this;
            }

            /**
             * IsPagedResponse.
             */
            public Builder isPagedResponse(Boolean isPagedResponse) {
                this.isPagedResponse = isPagedResponse;
                return this;
            }

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * ScriptConnection.
             */
            public Builder scriptConnection(ScriptConnection scriptConnection) {
                this.scriptConnection = scriptConnection;
                return this;
            }

            /**
             * ScriptErrorCodes.
             */
            public Builder scriptErrorCodes(java.util.List < ScriptErrorCodes> scriptErrorCodes) {
                this.scriptErrorCodes = scriptErrorCodes;
                return this;
            }

            /**
             * ScriptRequestParameters.
             */
            public Builder scriptRequestParameters(java.util.List < ScriptRequestParameters> scriptRequestParameters) {
                this.scriptRequestParameters = scriptRequestParameters;
                return this;
            }

            /**
             * ScriptResponseParameters.
             */
            public Builder scriptResponseParameters(java.util.List < ScriptResponseParameters> scriptResponseParameters) {
                this.scriptResponseParameters = scriptResponseParameters;
                return this;
            }

            /**
             * SuccessfulResultSample.
             */
            public Builder successfulResultSample(String successfulResultSample) {
                this.successfulResultSample = successfulResultSample;
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
             * ConnectionId.
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * TableName.
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
    public static class WizardErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ErrorSolution")
        private String errorSolution;

        private WizardErrorCodes(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.errorSolution = builder.errorSolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WizardErrorCodes create() {
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ErrorSolution.
             */
            public Builder errorSolution(String errorSolution) {
                this.errorSolution = errorSolution;
                return this;
            }

            public WizardErrorCodes build() {
                return new WizardErrorCodes(this);
            } 

        } 

    }
    public static class WizardRequestParameters extends TeaModel {
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
            private String defaultValue; 
            private String exampleValue; 
            private Boolean isRequiredParameter; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 
            private Integer parameterOperator; 
            private Integer parameterPosition; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * IsRequiredParameter.
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * ParameterDataType.
             */
            public Builder parameterDataType(Integer parameterDataType) {
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
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ParameterOperator.
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * ParameterPosition.
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
        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        private WizardResponseParameters(Builder builder) {
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
            private String exampleValue; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * ParameterDataType.
             */
            public Builder parameterDataType(Integer parameterDataType) {
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
             * ParameterName.
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
        @NameInMap("FailedResultSample")
        private String failedResultSample;

        @NameInMap("IsPagedResponse")
        private Boolean isPagedResponse;

        @NameInMap("SuccessfulResultSample")
        private String successfulResultSample;

        @NameInMap("WizardConnection")
        private WizardConnection wizardConnection;

        @NameInMap("WizardErrorCodes")
        private java.util.List < WizardErrorCodes> wizardErrorCodes;

        @NameInMap("WizardRequestParameters")
        private java.util.List < WizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        private java.util.List < WizardResponseParameters> wizardResponseParameters;

        private WizardDetails(Builder builder) {
            this.failedResultSample = builder.failedResultSample;
            this.isPagedResponse = builder.isPagedResponse;
            this.successfulResultSample = builder.successfulResultSample;
            this.wizardConnection = builder.wizardConnection;
            this.wizardErrorCodes = builder.wizardErrorCodes;
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
         * @return failedResultSample
         */
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        /**
         * @return isPagedResponse
         */
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        /**
         * @return successfulResultSample
         */
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        /**
         * @return wizardConnection
         */
        public WizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

        /**
         * @return wizardErrorCodes
         */
        public java.util.List < WizardErrorCodes> getWizardErrorCodes() {
            return this.wizardErrorCodes;
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
            private String failedResultSample; 
            private Boolean isPagedResponse; 
            private String successfulResultSample; 
            private WizardConnection wizardConnection; 
            private java.util.List < WizardErrorCodes> wizardErrorCodes; 
            private java.util.List < WizardRequestParameters> wizardRequestParameters; 
            private java.util.List < WizardResponseParameters> wizardResponseParameters; 

            /**
             * FailedResultSample.
             */
            public Builder failedResultSample(String failedResultSample) {
                this.failedResultSample = failedResultSample;
                return this;
            }

            /**
             * IsPagedResponse.
             */
            public Builder isPagedResponse(Boolean isPagedResponse) {
                this.isPagedResponse = isPagedResponse;
                return this;
            }

            /**
             * SuccessfulResultSample.
             */
            public Builder successfulResultSample(String successfulResultSample) {
                this.successfulResultSample = successfulResultSample;
                return this;
            }

            /**
             * WizardConnection.
             */
            public Builder wizardConnection(WizardConnection wizardConnection) {
                this.wizardConnection = wizardConnection;
                return this;
            }

            /**
             * WizardErrorCodes.
             */
            public Builder wizardErrorCodes(java.util.List < WizardErrorCodes> wizardErrorCodes) {
                this.wizardErrorCodes = wizardErrorCodes;
                return this;
            }

            /**
             * WizardRequestParameters.
             */
            public Builder wizardRequestParameters(java.util.List < WizardRequestParameters> wizardRequestParameters) {
                this.wizardRequestParameters = wizardRequestParameters;
                return this;
            }

            /**
             * WizardResponseParameters.
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
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.apiMode = builder.apiMode;
            this.apiName = builder.apiName;
            this.apiPath = builder.apiPath;
            this.createdTime = builder.createdTime;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
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

        public static Data create() {
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
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiMode.
             */
            public Builder apiMode(Integer apiMode) {
                this.apiMode = apiMode;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * ApiPath.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OperatorId.
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Protocols.
             */
            public Builder protocols(java.util.List < Integer > protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * RegistrationDetails.
             */
            public Builder registrationDetails(RegistrationDetails registrationDetails) {
                this.registrationDetails = registrationDetails;
                return this;
            }

            /**
             * RequestMethod.
             */
            public Builder requestMethod(Integer requestMethod) {
                this.requestMethod = requestMethod;
                return this;
            }

            /**
             * ResponseContentType.
             */
            public Builder responseContentType(Integer responseContentType) {
                this.responseContentType = responseContentType;
                return this;
            }

            /**
             * ScriptDetails.
             */
            public Builder scriptDetails(ScriptDetails scriptDetails) {
                this.scriptDetails = scriptDetails;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * VisibleRange.
             */
            public Builder visibleRange(Integer visibleRange) {
                this.visibleRange = visibleRange;
                return this;
            }

            /**
             * WizardDetails.
             */
            public Builder wizardDetails(WizardDetails wizardDetails) {
                this.wizardDetails = wizardDetails;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
