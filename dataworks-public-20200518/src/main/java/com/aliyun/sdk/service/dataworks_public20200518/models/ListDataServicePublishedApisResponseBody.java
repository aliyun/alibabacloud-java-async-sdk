// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServicePublishedApisResponseBody</p>
 */
public class ListDataServicePublishedApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataServicePublishedApisResponseBody(Builder builder) {
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

    public static ListDataServicePublishedApisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDataServicePublishedApisResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The published API information returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * <p>The request ID, which is the unique identifier for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataServicePublishedApisResponseBody build() {
            return new ListDataServicePublishedApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class RegistrationErrorCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ErrorSolution")
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

            private Builder() {
            } 

            private Builder(RegistrationErrorCodes model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.errorSolution = model.errorSolution;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>fail to call</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The fault Solutions.</p>
             * 
             * <strong>example:</strong>
             * <p>retry</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class RegistrationRequestParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("IsRequiredParameter")
        private Boolean isRequiredParameter;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterOperator")
        private Integer parameterOperator;

        @com.aliyun.core.annotation.NameInMap("ParameterPosition")
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

            private Builder() {
            } 

            private Builder(RegistrationRequestParameters model) {
                this.defaultValue = model.defaultValue;
                this.exampleValue = model.exampleValue;
                this.isRequiredParameter = model.isRequiredParameter;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterOperator = model.parameterOperator;
                this.parameterPosition = model.parameterPosition;
            } 

            /**
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>default1</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>example1</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>description1</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The operator. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * <p>The parameter position. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class RegistrationDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResultSample")
        private String failedResultSample;

        @com.aliyun.core.annotation.NameInMap("RegistrationErrorCodes")
        private java.util.List<RegistrationErrorCodes> registrationErrorCodes;

        @com.aliyun.core.annotation.NameInMap("RegistrationRequestParameters")
        private java.util.List<RegistrationRequestParameters> registrationRequestParameters;

        @com.aliyun.core.annotation.NameInMap("ServiceContentType")
        private Integer serviceContentType;

        @com.aliyun.core.annotation.NameInMap("ServiceHost")
        private String serviceHost;

        @com.aliyun.core.annotation.NameInMap("ServicePath")
        private String servicePath;

        @com.aliyun.core.annotation.NameInMap("ServiceRequestBodyDescription")
        private String serviceRequestBodyDescription;

        @com.aliyun.core.annotation.NameInMap("SuccessfulResultSample")
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
        public java.util.List<RegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        /**
         * @return registrationRequestParameters
         */
        public java.util.List<RegistrationRequestParameters> getRegistrationRequestParameters() {
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
            private java.util.List<RegistrationErrorCodes> registrationErrorCodes; 
            private java.util.List<RegistrationRequestParameters> registrationRequestParameters; 
            private Integer serviceContentType; 
            private String serviceHost; 
            private String servicePath; 
            private String serviceRequestBodyDescription; 
            private String successfulResultSample; 

            private Builder() {
            } 

            private Builder(RegistrationDetails model) {
                this.failedResultSample = model.failedResultSample;
                this.registrationErrorCodes = model.registrationErrorCodes;
                this.registrationRequestParameters = model.registrationRequestParameters;
                this.serviceContentType = model.serviceContentType;
                this.serviceHost = model.serviceHost;
                this.servicePath = model.servicePath;
                this.serviceRequestBodyDescription = model.serviceRequestBodyDescription;
                this.successfulResultSample = model.successfulResultSample;
            } 

            /**
             * <p>The sample of an error response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;success&quot;: false}</p>
             */
            public Builder failedResultSample(String failedResultSample) {
                this.failedResultSample = failedResultSample;
                return this;
            }

            /**
             * <p>The list of error codes for the registration API.</p>
             */
            public Builder registrationErrorCodes(java.util.List<RegistrationErrorCodes> registrationErrorCodes) {
                this.registrationErrorCodes = registrationErrorCodes;
                return this;
            }

            /**
             * <p>The list of request parameters for the registration API.</p>
             */
            public Builder registrationRequestParameters(java.util.List<RegistrationRequestParameters> registrationRequestParameters) {
                this.registrationRequestParameters = registrationRequestParameters;
                return this;
            }

            /**
             * <p>The return data type of the API. Valid values:</p>
             * <ul>
             * <li>0: JSON.</li>
             * <li>1: XML.</li>
             * </ul>
             * <p>Wizard and script APIs support JSON. Registration APIs support JSON and XML.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceContentType(Integer serviceContentType) {
                this.serviceContentType = serviceContentType;
                return this;
            }

            /**
             * <p>The backend service address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.abc.com">http://www.abc.com</a></p>
             */
            public Builder serviceHost(String serviceHost) {
                this.serviceHost = serviceHost;
                return this;
            }

            /**
             * <p>The backend service path.</p>
             * 
             * <strong>example:</strong>
             * <p>/index</p>
             */
            public Builder servicePath(String servicePath) {
                this.servicePath = servicePath;
                return this;
            }

            /**
             * <p>The description of the backend request body content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;abc&quot;:1}</p>
             */
            public Builder serviceRequestBodyDescription(String serviceRequestBodyDescription) {
                this.serviceRequestBodyDescription = serviceRequestBodyDescription;
                return this;
            }

            /**
             * <p>The sample of a successful response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;success&quot;: true}</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class ScriptConnection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private Long connectionId;

        @com.aliyun.core.annotation.NameInMap("TableName")
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

            private Builder() {
            } 

            private Builder(ScriptConnection model) {
                this.connectionId = model.connectionId;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>The table name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>t</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class ScriptErrorCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ErrorSolution")
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

            private Builder() {
            } 

            private Builder(ScriptErrorCodes model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.errorSolution = model.errorSolution;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>fail to call</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The fault Solutions.</p>
             * 
             * <strong>example:</strong>
             * <p>retry</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class ScriptRequestParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("IsRequiredParameter")
        private Boolean isRequiredParameter;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterOperator")
        private Integer parameterOperator;

        @com.aliyun.core.annotation.NameInMap("ParameterPosition")
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

            private Builder() {
            } 

            private Builder(ScriptRequestParameters model) {
                this.defaultValue = model.defaultValue;
                this.exampleValue = model.exampleValue;
                this.isRequiredParameter = model.isRequiredParameter;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterOperator = model.parameterOperator;
                this.parameterPosition = model.parameterPosition;
            } 

            /**
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>default1</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>example1</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>description1</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The operator. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * <p>The parameter position. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class ScriptResponseParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
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

            private Builder() {
            } 

            private Builder(ScriptResponseParameters model) {
                this.exampleValue = model.exampleValue;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
            } 

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>example2</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>description2</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>param2</p>
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
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class ScriptDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResultSample")
        private String failedResultSample;

        @com.aliyun.core.annotation.NameInMap("IsPagedResponse")
        private Boolean isPagedResponse;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("ScriptConnection")
        private ScriptConnection scriptConnection;

        @com.aliyun.core.annotation.NameInMap("ScriptErrorCodes")
        private java.util.List<ScriptErrorCodes> scriptErrorCodes;

        @com.aliyun.core.annotation.NameInMap("ScriptRequestParameters")
        private java.util.List<ScriptRequestParameters> scriptRequestParameters;

        @com.aliyun.core.annotation.NameInMap("ScriptResponseParameters")
        private java.util.List<ScriptResponseParameters> scriptResponseParameters;

        @com.aliyun.core.annotation.NameInMap("SuccessfulResultSample")
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
        public java.util.List<ScriptErrorCodes> getScriptErrorCodes() {
            return this.scriptErrorCodes;
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
            private java.util.List<ScriptErrorCodes> scriptErrorCodes; 
            private java.util.List<ScriptRequestParameters> scriptRequestParameters; 
            private java.util.List<ScriptResponseParameters> scriptResponseParameters; 
            private String successfulResultSample; 

            private Builder() {
            } 

            private Builder(ScriptDetails model) {
                this.failedResultSample = model.failedResultSample;
                this.isPagedResponse = model.isPagedResponse;
                this.script = model.script;
                this.scriptConnection = model.scriptConnection;
                this.scriptErrorCodes = model.scriptErrorCodes;
                this.scriptRequestParameters = model.scriptRequestParameters;
                this.scriptResponseParameters = model.scriptResponseParameters;
                this.successfulResultSample = model.successfulResultSample;
            } 

            /**
             * <p>The sample of an error response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;success&quot;: false}</p>
             */
            public Builder failedResultSample(String failedResultSample) {
                this.failedResultSample = failedResultSample;
                return this;
            }

            /**
             * <p>Indicates whether the response is paginated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPagedResponse(Boolean isPagedResponse) {
                this.isPagedResponse = isPagedResponse;
                return this;
            }

            /**
             * <p>The SQL script.</p>
             * 
             * <strong>example:</strong>
             * <p>select a from t</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The data source information for the script API.</p>
             */
            public Builder scriptConnection(ScriptConnection scriptConnection) {
                this.scriptConnection = scriptConnection;
                return this;
            }

            /**
             * <p>The list of error codes for the script API.</p>
             */
            public Builder scriptErrorCodes(java.util.List<ScriptErrorCodes> scriptErrorCodes) {
                this.scriptErrorCodes = scriptErrorCodes;
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
             * <p>The sample of a successful response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;success&quot;: true}</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class WizardConnection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private Long connectionId;

        @com.aliyun.core.annotation.NameInMap("TableName")
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

            private Builder() {
            } 

            private Builder(WizardConnection model) {
                this.connectionId = model.connectionId;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12354</p>
             */
            public Builder connectionId(Long connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>The table name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>t</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class WizardErrorCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ErrorSolution")
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

            private Builder() {
            } 

            private Builder(WizardErrorCodes model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.errorSolution = model.errorSolution;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>fail to call</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The fault Solutions.</p>
             * 
             * <strong>example:</strong>
             * <p>retry</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class WizardRequestParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("IsRequiredParameter")
        private Boolean isRequiredParameter;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterOperator")
        private Integer parameterOperator;

        @com.aliyun.core.annotation.NameInMap("ParameterPosition")
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

            private Builder() {
            } 

            private Builder(WizardRequestParameters model) {
                this.defaultValue = model.defaultValue;
                this.exampleValue = model.exampleValue;
                this.isRequiredParameter = model.isRequiredParameter;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterOperator = model.parameterOperator;
                this.parameterPosition = model.parameterPosition;
            } 

            /**
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>default1</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>example1</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRequiredParameter(Boolean isRequiredParameter) {
                this.isRequiredParameter = isRequiredParameter;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>description1</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The operator. Valid values: 0 (Equal), 1 (Like), 2 (Const), and 3 (In). Wizard mode APIs support Equal, Like, and In. Script mode APIs support Equal. Registered APIs support Equal and Const.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterOperator(Integer parameterOperator) {
                this.parameterOperator = parameterOperator;
                return this;
            }

            /**
             * <p>The position of the parameter. Valid values: 0 (Path), 1 (Query), 2 (Head), and 3 (Body). Wizard and script APIs support only Query. For registered APIs, the GET and DELETE methods support Query and Head, and the PUT and POST methods support Query, Head, and Body.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class WizardResponseParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
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

            private Builder() {
            } 

            private Builder(WizardResponseParameters model) {
                this.exampleValue = model.exampleValue;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
            } 

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>example2</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>The data type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>description2</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>param2</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class WizardDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResultSample")
        private String failedResultSample;

        @com.aliyun.core.annotation.NameInMap("IsPagedResponse")
        private Boolean isPagedResponse;

        @com.aliyun.core.annotation.NameInMap("SuccessfulResultSample")
        private String successfulResultSample;

        @com.aliyun.core.annotation.NameInMap("WizardConnection")
        private WizardConnection wizardConnection;

        @com.aliyun.core.annotation.NameInMap("WizardErrorCodes")
        private java.util.List<WizardErrorCodes> wizardErrorCodes;

        @com.aliyun.core.annotation.NameInMap("WizardRequestParameters")
        private java.util.List<WizardRequestParameters> wizardRequestParameters;

        @com.aliyun.core.annotation.NameInMap("WizardResponseParameters")
        private java.util.List<WizardResponseParameters> wizardResponseParameters;

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
        public java.util.List<WizardErrorCodes> getWizardErrorCodes() {
            return this.wizardErrorCodes;
        }

        /**
         * @return wizardRequestParameters
         */
        public java.util.List<WizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        /**
         * @return wizardResponseParameters
         */
        public java.util.List<WizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

        public static final class Builder {
            private String failedResultSample; 
            private Boolean isPagedResponse; 
            private String successfulResultSample; 
            private WizardConnection wizardConnection; 
            private java.util.List<WizardErrorCodes> wizardErrorCodes; 
            private java.util.List<WizardRequestParameters> wizardRequestParameters; 
            private java.util.List<WizardResponseParameters> wizardResponseParameters; 

            private Builder() {
            } 

            private Builder(WizardDetails model) {
                this.failedResultSample = model.failedResultSample;
                this.isPagedResponse = model.isPagedResponse;
                this.successfulResultSample = model.successfulResultSample;
                this.wizardConnection = model.wizardConnection;
                this.wizardErrorCodes = model.wizardErrorCodes;
                this.wizardRequestParameters = model.wizardRequestParameters;
                this.wizardResponseParameters = model.wizardResponseParameters;
            } 

            /**
             * <p>The sample of an error response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;success&quot;: false}</p>
             */
            public Builder failedResultSample(String failedResultSample) {
                this.failedResultSample = failedResultSample;
                return this;
            }

            /**
             * <p>Indicates whether the response is paginated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPagedResponse(Boolean isPagedResponse) {
                this.isPagedResponse = isPagedResponse;
                return this;
            }

            /**
             * <p>The sample of a successful response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;success&quot;: true}</p>
             */
            public Builder successfulResultSample(String successfulResultSample) {
                this.successfulResultSample = successfulResultSample;
                return this;
            }

            /**
             * <p>The data source information of the wizard API.</p>
             */
            public Builder wizardConnection(WizardConnection wizardConnection) {
                this.wizardConnection = wizardConnection;
                return this;
            }

            /**
             * <p>The list of error codes for the wizard API.</p>
             */
            public Builder wizardErrorCodes(java.util.List<WizardErrorCodes> wizardErrorCodes) {
                this.wizardErrorCodes = wizardErrorCodes;
                return this;
            }

            /**
             * <p>The list of request parameters for the wizard API.</p>
             */
            public Builder wizardRequestParameters(java.util.List<WizardRequestParameters> wizardRequestParameters) {
                this.wizardRequestParameters = wizardRequestParameters;
                return this;
            }

            /**
             * <p>The list of response parameters for the wizard API.</p>
             */
            public Builder wizardResponseParameters(java.util.List<WizardResponseParameters> wizardResponseParameters) {
                this.wizardResponseParameters = wizardResponseParameters;
                return this;
            }

            public WizardDetails build() {
                return new WizardDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class Apis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiMode")
        private Integer apiMode;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiPath")
        private String apiPath;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OperatorId")
        private String operatorId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private java.util.List<Integer> protocols;

        @com.aliyun.core.annotation.NameInMap("RegistrationDetails")
        private RegistrationDetails registrationDetails;

        @com.aliyun.core.annotation.NameInMap("RequestMethod")
        private Integer requestMethod;

        @com.aliyun.core.annotation.NameInMap("ResponseContentType")
        private Integer responseContentType;

        @com.aliyun.core.annotation.NameInMap("ScriptDetails")
        private ScriptDetails scriptDetails;

        @com.aliyun.core.annotation.NameInMap("SqlMode")
        private Integer sqlMode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("VisibleRange")
        private Integer visibleRange;

        @com.aliyun.core.annotation.NameInMap("WizardDetails")
        private WizardDetails wizardDetails;

        private Apis(Builder builder) {
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
            this.sqlMode = builder.sqlMode;
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
        public java.util.List<Integer> getProtocols() {
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
         * @return sqlMode
         */
        public Integer getSqlMode() {
            return this.sqlMode;
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
            private java.util.List<Integer> protocols; 
            private RegistrationDetails registrationDetails; 
            private Integer requestMethod; 
            private Integer responseContentType; 
            private ScriptDetails scriptDetails; 
            private Integer sqlMode; 
            private Integer status; 
            private Long tenantId; 
            private Integer timeout; 
            private Integer visibleRange; 
            private WizardDetails wizardDetails; 

            private Builder() {
            } 

            private Builder(Apis model) {
                this.apiId = model.apiId;
                this.apiMode = model.apiMode;
                this.apiName = model.apiName;
                this.apiPath = model.apiPath;
                this.createdTime = model.createdTime;
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.groupId = model.groupId;
                this.modifiedTime = model.modifiedTime;
                this.operatorId = model.operatorId;
                this.projectId = model.projectId;
                this.protocols = model.protocols;
                this.registrationDetails = model.registrationDetails;
                this.requestMethod = model.requestMethod;
                this.responseContentType = model.responseContentType;
                this.scriptDetails = model.scriptDetails;
                this.sqlMode = model.sqlMode;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.timeout = model.timeout;
                this.visibleRange = model.visibleRange;
                this.wizardDetails = model.wizardDetails;
            } 

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>10002</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The type of the API. Valid values:</p>
             * <ul>
             * <li>0: wizard API.</li>
             * <li>1: script API.</li>
             * <li>2: registration API.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder apiMode(Integer apiMode) {
                this.apiMode = apiMode;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>My API name</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/1</p>
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * <p>The time when the API was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-23T00:21:01+0800</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test API description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ab123</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The time when the API was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-23T00:21:01+0800</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud ID of the user who last edited the API.</p>
             * 
             * <strong>example:</strong>
             * <p>2345678</p>
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The API protocol. Valid values:</p>
             * <ul>
             * <li>0: HTTP.</li>
             * <li>1: HTTPS.</li>
             * </ul>
             */
            public Builder protocols(java.util.List<Integer> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The details of the registration API. This is returned only for registration APIs.</p>
             */
            public Builder registrationDetails(RegistrationDetails registrationDetails) {
                this.registrationDetails = registrationDetails;
                return this;
            }

            /**
             * <p>The request method of the API. Valid values:</p>
             * <ul>
             * <li>0: GET.</li>
             * <li>1: POST.</li>
             * <li>2: PUT.</li>
             * <li>3: DELETE.</li>
             * </ul>
             * <p>Wizard and script APIs support GET and POST. Registration APIs support GET, POST, PUT, and DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The details of the script API. This is returned only for script APIs.</p>
             */
            public Builder scriptDetails(ScriptDetails scriptDetails) {
                this.scriptDetails = scriptDetails;
                return this;
            }

            /**
             * <p>The SQL mode. Valid values: 0 (basic SQL) and 1 (advanced SQL).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sqlMode(Integer sqlMode) {
                this.sqlMode = sqlMode;
                return this;
            }

            /**
             * <p>The status of the API. Valid values:</p>
             * <ul>
             * <li>0: unpublished.</li>
             * <li>1: published.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The timeout period, in milliseconds (ms).</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The visibility range. Valid values:</p>
             * <ul>
             * <li>0: workspace.</li>
             * <li>1: private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder visibleRange(Integer visibleRange) {
                this.visibleRange = visibleRange;
                return this;
            }

            /**
             * <p>The details of the wizard API. This is returned only for wizard APIs.</p>
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
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apis")
        private java.util.List<Apis> apis;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<Apis> getApis() {
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
            private java.util.List<Apis> apis; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apis = model.apis;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of published API information.</p>
             */
            public Builder apis(java.util.List<Apis> apis) {
                this.apis = apis;
                return this;
            }

            /**
             * <p>The page number, which is consistent with the PageNumber in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
