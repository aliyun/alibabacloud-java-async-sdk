// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiDocResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiDocResponseBody</p>
 */
public class DescribeApiDocResponseBody extends TeaModel {
    @NameInMap("ApiId")
    private String apiId;

    @NameInMap("ApiName")
    private String apiName;

    @NameInMap("BodyFormat")
    private String bodyFormat;

    @NameInMap("DeployedTime")
    private String deployedTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("ErrorCodeSamples")
    private ErrorCodeSamples errorCodeSamples;

    @NameInMap("FailResultSample")
    private String failResultSample;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("HttpMethod")
    private String httpMethod;

    @NameInMap("HttpProtocol")
    private String httpProtocol;

    @NameInMap("Path")
    private String path;

    @NameInMap("PathParameters")
    private PathParameters pathParameters;

    @NameInMap("PostBodyDescription")
    private String postBodyDescription;

    @NameInMap("PostBodyType")
    private String postBodyType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestBody")
    private RequestBody requestBody;

    @NameInMap("RequestHeaders")
    private RequestHeaders requestHeaders;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestQueries")
    private RequestQueries requestQueries;

    @NameInMap("ResultDescriptions")
    private ResultDescriptions resultDescriptions;

    @NameInMap("ResultSample")
    private String resultSample;

    @NameInMap("ResultType")
    private String resultType;

    @NameInMap("SdkDemos")
    private SdkDemos sdkDemos;

    @NameInMap("ServiceTimeout")
    private Integer serviceTimeout;

    @NameInMap("StageName")
    private String stageName;

    private DescribeApiDocResponseBody(Builder builder) {
        this.apiId = builder.apiId;
        this.apiName = builder.apiName;
        this.bodyFormat = builder.bodyFormat;
        this.deployedTime = builder.deployedTime;
        this.description = builder.description;
        this.errorCodeSamples = builder.errorCodeSamples;
        this.failResultSample = builder.failResultSample;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.httpMethod = builder.httpMethod;
        this.httpProtocol = builder.httpProtocol;
        this.path = builder.path;
        this.pathParameters = builder.pathParameters;
        this.postBodyDescription = builder.postBodyDescription;
        this.postBodyType = builder.postBodyType;
        this.regionId = builder.regionId;
        this.requestBody = builder.requestBody;
        this.requestHeaders = builder.requestHeaders;
        this.requestId = builder.requestId;
        this.requestQueries = builder.requestQueries;
        this.resultDescriptions = builder.resultDescriptions;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.sdkDemos = builder.sdkDemos;
        this.serviceTimeout = builder.serviceTimeout;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiDocResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return bodyFormat
     */
    public String getBodyFormat() {
        return this.bodyFormat;
    }

    /**
     * @return deployedTime
     */
    public String getDeployedTime() {
        return this.deployedTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return errorCodeSamples
     */
    public ErrorCodeSamples getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    /**
     * @return failResultSample
     */
    public String getFailResultSample() {
        return this.failResultSample;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return httpMethod
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * @return httpProtocol
     */
    public String getHttpProtocol() {
        return this.httpProtocol;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return pathParameters
     */
    public PathParameters getPathParameters() {
        return this.pathParameters;
    }

    /**
     * @return postBodyDescription
     */
    public String getPostBodyDescription() {
        return this.postBodyDescription;
    }

    /**
     * @return postBodyType
     */
    public String getPostBodyType() {
        return this.postBodyType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestBody
     */
    public RequestBody getRequestBody() {
        return this.requestBody;
    }

    /**
     * @return requestHeaders
     */
    public RequestHeaders getRequestHeaders() {
        return this.requestHeaders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestQueries
     */
    public RequestQueries getRequestQueries() {
        return this.requestQueries;
    }

    /**
     * @return resultDescriptions
     */
    public ResultDescriptions getResultDescriptions() {
        return this.resultDescriptions;
    }

    /**
     * @return resultSample
     */
    public String getResultSample() {
        return this.resultSample;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return sdkDemos
     */
    public SdkDemos getSdkDemos() {
        return this.sdkDemos;
    }

    /**
     * @return serviceTimeout
     */
    public Integer getServiceTimeout() {
        return this.serviceTimeout;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder {
        private String apiId; 
        private String apiName; 
        private String bodyFormat; 
        private String deployedTime; 
        private String description; 
        private ErrorCodeSamples errorCodeSamples; 
        private String failResultSample; 
        private String groupId; 
        private String groupName; 
        private String httpMethod; 
        private String httpProtocol; 
        private String path; 
        private PathParameters pathParameters; 
        private String postBodyDescription; 
        private String postBodyType; 
        private String regionId; 
        private RequestBody requestBody; 
        private RequestHeaders requestHeaders; 
        private String requestId; 
        private RequestQueries requestQueries; 
        private ResultDescriptions resultDescriptions; 
        private String resultSample; 
        private String resultType; 
        private SdkDemos sdkDemos; 
        private Integer serviceTimeout; 
        private String stageName; 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
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
         * BodyFormat.
         */
        public Builder bodyFormat(String bodyFormat) {
            this.bodyFormat = bodyFormat;
            return this;
        }

        /**
         * DeployedTime.
         */
        public Builder deployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
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
         * ErrorCodeSamples.
         */
        public Builder errorCodeSamples(ErrorCodeSamples errorCodeSamples) {
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * FailResultSample.
         */
        public Builder failResultSample(String failResultSample) {
            this.failResultSample = failResultSample;
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
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * HttpMethod.
         */
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        /**
         * HttpProtocol.
         */
        public Builder httpProtocol(String httpProtocol) {
            this.httpProtocol = httpProtocol;
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
         * PathParameters.
         */
        public Builder pathParameters(PathParameters pathParameters) {
            this.pathParameters = pathParameters;
            return this;
        }

        /**
         * PostBodyDescription.
         */
        public Builder postBodyDescription(String postBodyDescription) {
            this.postBodyDescription = postBodyDescription;
            return this;
        }

        /**
         * PostBodyType.
         */
        public Builder postBodyType(String postBodyType) {
            this.postBodyType = postBodyType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestBody.
         */
        public Builder requestBody(RequestBody requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        /**
         * RequestHeaders.
         */
        public Builder requestHeaders(RequestHeaders requestHeaders) {
            this.requestHeaders = requestHeaders;
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
         * RequestQueries.
         */
        public Builder requestQueries(RequestQueries requestQueries) {
            this.requestQueries = requestQueries;
            return this;
        }

        /**
         * ResultDescriptions.
         */
        public Builder resultDescriptions(ResultDescriptions resultDescriptions) {
            this.resultDescriptions = resultDescriptions;
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
         * ResultType.
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * SdkDemos.
         */
        public Builder sdkDemos(SdkDemos sdkDemos) {
            this.sdkDemos = sdkDemos;
            return this;
        }

        /**
         * ServiceTimeout.
         */
        public Builder serviceTimeout(Integer serviceTimeout) {
            this.serviceTimeout = serviceTimeout;
            return this;
        }

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.stageName = stageName;
            return this;
        }

        public DescribeApiDocResponseBody build() {
            return new DescribeApiDocResponseBody(this);
        } 

    } 

    public static class ErrorCodeSample extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Description")
        private String description;

        @NameInMap("Message")
        private String message;

        private ErrorCodeSample(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorCodeSample create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String message; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ErrorCodeSample build() {
                return new ErrorCodeSample(this);
            } 

        } 

    }
    public static class ErrorCodeSamples extends TeaModel {
        @NameInMap("ErrorCodeSample")
        private java.util.List < ErrorCodeSample> errorCodeSample;

        private ErrorCodeSamples(Builder builder) {
            this.errorCodeSample = builder.errorCodeSample;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorCodeSamples create() {
            return builder().build();
        }

        /**
         * @return errorCodeSample
         */
        public java.util.List < ErrorCodeSample> getErrorCodeSample() {
            return this.errorCodeSample;
        }

        public static final class Builder {
            private java.util.List < ErrorCodeSample> errorCodeSample; 

            /**
             * ErrorCodeSample.
             */
            public Builder errorCodeSample(java.util.List < ErrorCodeSample> errorCodeSample) {
                this.errorCodeSample = errorCodeSample;
                return this;
            }

            public ErrorCodeSamples build() {
                return new ErrorCodeSamples(this);
            } 

        } 

    }
    public static class PathParameter extends TeaModel {
        @NameInMap("ApiParameterName")
        private String apiParameterName;

        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        private PathParameter(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.demoValue = builder.demoValue;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathParameter create() {
            return builder().build();
        }

        /**
         * @return apiParameterName
         */
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        /**
         * @return demoValue
         */
        public String getDemoValue() {
            return this.demoValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String demoValue; 
            private String description; 

            /**
             * ApiParameterName.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
                return this;
            }

            /**
             * DemoValue.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public PathParameter build() {
                return new PathParameter(this);
            } 

        } 

    }
    public static class PathParameters extends TeaModel {
        @NameInMap("PathParameter")
        private java.util.List < PathParameter> pathParameter;

        private PathParameters(Builder builder) {
            this.pathParameter = builder.pathParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathParameters create() {
            return builder().build();
        }

        /**
         * @return pathParameter
         */
        public java.util.List < PathParameter> getPathParameter() {
            return this.pathParameter;
        }

        public static final class Builder {
            private java.util.List < PathParameter> pathParameter; 

            /**
             * PathParameter.
             */
            public Builder pathParameter(java.util.List < PathParameter> pathParameter) {
                this.pathParameter = pathParameter;
                return this;
            }

            public PathParameters build() {
                return new PathParameters(this);
            } 

        } 

    }
    public static class RequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        private String apiParameterName;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnumValue")
        private String enumValue;

        @NameInMap("JsonScheme")
        private String jsonScheme;

        @NameInMap("MaxLength")
        private Long maxLength;

        @NameInMap("MaxValue")
        private Long maxValue;

        @NameInMap("MinLength")
        private Long minLength;

        @NameInMap("MinValue")
        private Long minValue;

        @NameInMap("ParameterType")
        private String parameterType;

        @NameInMap("RegularExpression")
        private String regularExpression;

        @NameInMap("Required")
        private String required;

        private RequestParam(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.defaultValue = builder.defaultValue;
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.enumValue = builder.enumValue;
            this.jsonScheme = builder.jsonScheme;
            this.maxLength = builder.maxLength;
            this.maxValue = builder.maxValue;
            this.minLength = builder.minLength;
            this.minValue = builder.minValue;
            this.parameterType = builder.parameterType;
            this.regularExpression = builder.regularExpression;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParam create() {
            return builder().build();
        }

        /**
         * @return apiParameterName
         */
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return demoValue
         */
        public String getDemoValue() {
            return this.demoValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enumValue
         */
        public String getEnumValue() {
            return this.enumValue;
        }

        /**
         * @return jsonScheme
         */
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        /**
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maxValue
         */
        public Long getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minLength
         */
        public Long getMinLength() {
            return this.minLength;
        }

        /**
         * @return minValue
         */
        public Long getMinValue() {
            return this.minValue;
        }

        /**
         * @return parameterType
         */
        public String getParameterType() {
            return this.parameterType;
        }

        /**
         * @return regularExpression
         */
        public String getRegularExpression() {
            return this.regularExpression;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String defaultValue; 
            private String demoValue; 
            private String description; 
            private String enumValue; 
            private String jsonScheme; 
            private Long maxLength; 
            private Long maxValue; 
            private Long minLength; 
            private Long minValue; 
            private String parameterType; 
            private String regularExpression; 
            private String required; 

            /**
             * ApiParameterName.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
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
             * DemoValue.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
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
             * EnumValue.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * JsonScheme.
             */
            public Builder jsonScheme(String jsonScheme) {
                this.jsonScheme = jsonScheme;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * ParameterType.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * RegularExpression.
             */
            public Builder regularExpression(String regularExpression) {
                this.regularExpression = regularExpression;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            public RequestParam build() {
                return new RequestParam(this);
            } 

        } 

    }
    public static class RequestBody extends TeaModel {
        @NameInMap("RequestParam")
        private java.util.List < RequestParam> requestParam;

        private RequestBody(Builder builder) {
            this.requestParam = builder.requestParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestBody create() {
            return builder().build();
        }

        /**
         * @return requestParam
         */
        public java.util.List < RequestParam> getRequestParam() {
            return this.requestParam;
        }

        public static final class Builder {
            private java.util.List < RequestParam> requestParam; 

            /**
             * RequestParam.
             */
            public Builder requestParam(java.util.List < RequestParam> requestParam) {
                this.requestParam = requestParam;
                return this;
            }

            public RequestBody build() {
                return new RequestBody(this);
            } 

        } 

    }
    public static class RequestHeadersRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        private String apiParameterName;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnumValue")
        private String enumValue;

        @NameInMap("JsonScheme")
        private String jsonScheme;

        @NameInMap("MaxLength")
        private Long maxLength;

        @NameInMap("MaxValue")
        private Long maxValue;

        @NameInMap("MinLength")
        private Long minLength;

        @NameInMap("MinValue")
        private Long minValue;

        @NameInMap("ParameterType")
        private String parameterType;

        @NameInMap("RegularExpression")
        private String regularExpression;

        @NameInMap("Required")
        private String required;

        private RequestHeadersRequestParam(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.defaultValue = builder.defaultValue;
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.enumValue = builder.enumValue;
            this.jsonScheme = builder.jsonScheme;
            this.maxLength = builder.maxLength;
            this.maxValue = builder.maxValue;
            this.minLength = builder.minLength;
            this.minValue = builder.minValue;
            this.parameterType = builder.parameterType;
            this.regularExpression = builder.regularExpression;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestHeadersRequestParam create() {
            return builder().build();
        }

        /**
         * @return apiParameterName
         */
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return demoValue
         */
        public String getDemoValue() {
            return this.demoValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enumValue
         */
        public String getEnumValue() {
            return this.enumValue;
        }

        /**
         * @return jsonScheme
         */
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        /**
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maxValue
         */
        public Long getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minLength
         */
        public Long getMinLength() {
            return this.minLength;
        }

        /**
         * @return minValue
         */
        public Long getMinValue() {
            return this.minValue;
        }

        /**
         * @return parameterType
         */
        public String getParameterType() {
            return this.parameterType;
        }

        /**
         * @return regularExpression
         */
        public String getRegularExpression() {
            return this.regularExpression;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String defaultValue; 
            private String demoValue; 
            private String description; 
            private String enumValue; 
            private String jsonScheme; 
            private Long maxLength; 
            private Long maxValue; 
            private Long minLength; 
            private Long minValue; 
            private String parameterType; 
            private String regularExpression; 
            private String required; 

            /**
             * ApiParameterName.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
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
             * DemoValue.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
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
             * EnumValue.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * JsonScheme.
             */
            public Builder jsonScheme(String jsonScheme) {
                this.jsonScheme = jsonScheme;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * ParameterType.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * RegularExpression.
             */
            public Builder regularExpression(String regularExpression) {
                this.regularExpression = regularExpression;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            public RequestHeadersRequestParam build() {
                return new RequestHeadersRequestParam(this);
            } 

        } 

    }
    public static class RequestHeaders extends TeaModel {
        @NameInMap("RequestParam")
        private java.util.List < RequestHeadersRequestParam> requestParam;

        private RequestHeaders(Builder builder) {
            this.requestParam = builder.requestParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestHeaders create() {
            return builder().build();
        }

        /**
         * @return requestParam
         */
        public java.util.List < RequestHeadersRequestParam> getRequestParam() {
            return this.requestParam;
        }

        public static final class Builder {
            private java.util.List < RequestHeadersRequestParam> requestParam; 

            /**
             * RequestParam.
             */
            public Builder requestParam(java.util.List < RequestHeadersRequestParam> requestParam) {
                this.requestParam = requestParam;
                return this;
            }

            public RequestHeaders build() {
                return new RequestHeaders(this);
            } 

        } 

    }
    public static class RequestQueriesRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        private String apiParameterName;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnumValue")
        private String enumValue;

        @NameInMap("JsonScheme")
        private String jsonScheme;

        @NameInMap("MaxLength")
        private Long maxLength;

        @NameInMap("MaxValue")
        private Long maxValue;

        @NameInMap("MinLength")
        private Long minLength;

        @NameInMap("MinValue")
        private Long minValue;

        @NameInMap("ParameterType")
        private String parameterType;

        @NameInMap("RegularExpression")
        private String regularExpression;

        @NameInMap("Required")
        private String required;

        private RequestQueriesRequestParam(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.defaultValue = builder.defaultValue;
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.enumValue = builder.enumValue;
            this.jsonScheme = builder.jsonScheme;
            this.maxLength = builder.maxLength;
            this.maxValue = builder.maxValue;
            this.minLength = builder.minLength;
            this.minValue = builder.minValue;
            this.parameterType = builder.parameterType;
            this.regularExpression = builder.regularExpression;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestQueriesRequestParam create() {
            return builder().build();
        }

        /**
         * @return apiParameterName
         */
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return demoValue
         */
        public String getDemoValue() {
            return this.demoValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enumValue
         */
        public String getEnumValue() {
            return this.enumValue;
        }

        /**
         * @return jsonScheme
         */
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        /**
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maxValue
         */
        public Long getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minLength
         */
        public Long getMinLength() {
            return this.minLength;
        }

        /**
         * @return minValue
         */
        public Long getMinValue() {
            return this.minValue;
        }

        /**
         * @return parameterType
         */
        public String getParameterType() {
            return this.parameterType;
        }

        /**
         * @return regularExpression
         */
        public String getRegularExpression() {
            return this.regularExpression;
        }

        /**
         * @return required
         */
        public String getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String defaultValue; 
            private String demoValue; 
            private String description; 
            private String enumValue; 
            private String jsonScheme; 
            private Long maxLength; 
            private Long maxValue; 
            private Long minLength; 
            private Long minValue; 
            private String parameterType; 
            private String regularExpression; 
            private String required; 

            /**
             * ApiParameterName.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
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
             * DemoValue.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
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
             * EnumValue.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * JsonScheme.
             */
            public Builder jsonScheme(String jsonScheme) {
                this.jsonScheme = jsonScheme;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * ParameterType.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * RegularExpression.
             */
            public Builder regularExpression(String regularExpression) {
                this.regularExpression = regularExpression;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            public RequestQueriesRequestParam build() {
                return new RequestQueriesRequestParam(this);
            } 

        } 

    }
    public static class RequestQueries extends TeaModel {
        @NameInMap("RequestParam")
        private java.util.List < RequestQueriesRequestParam> requestParam;

        private RequestQueries(Builder builder) {
            this.requestParam = builder.requestParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestQueries create() {
            return builder().build();
        }

        /**
         * @return requestParam
         */
        public java.util.List < RequestQueriesRequestParam> getRequestParam() {
            return this.requestParam;
        }

        public static final class Builder {
            private java.util.List < RequestQueriesRequestParam> requestParam; 

            /**
             * RequestParam.
             */
            public Builder requestParam(java.util.List < RequestQueriesRequestParam> requestParam) {
                this.requestParam = requestParam;
                return this;
            }

            public RequestQueries build() {
                return new RequestQueries(this);
            } 

        } 

    }
    public static class ResultDescription extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("HasChild")
        private Boolean hasChild;

        @NameInMap("Id")
        private String id;

        @NameInMap("Key")
        private String key;

        @NameInMap("Mandatory")
        private Boolean mandatory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("Type")
        private String type;

        private ResultDescription(Builder builder) {
            this.description = builder.description;
            this.hasChild = builder.hasChild;
            this.id = builder.id;
            this.key = builder.key;
            this.mandatory = builder.mandatory;
            this.name = builder.name;
            this.pid = builder.pid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultDescription create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hasChild
         */
        public Boolean getHasChild() {
            return this.hasChild;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mandatory
         */
        public Boolean getMandatory() {
            return this.mandatory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private Boolean hasChild; 
            private String id; 
            private String key; 
            private Boolean mandatory; 
            private String name; 
            private String pid; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HasChild.
             */
            public Builder hasChild(Boolean hasChild) {
                this.hasChild = hasChild;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Mandatory.
             */
            public Builder mandatory(Boolean mandatory) {
                this.mandatory = mandatory;
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
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultDescription build() {
                return new ResultDescription(this);
            } 

        } 

    }
    public static class ResultDescriptions extends TeaModel {
        @NameInMap("ResultDescription")
        private java.util.List < ResultDescription> resultDescription;

        private ResultDescriptions(Builder builder) {
            this.resultDescription = builder.resultDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultDescriptions create() {
            return builder().build();
        }

        /**
         * @return resultDescription
         */
        public java.util.List < ResultDescription> getResultDescription() {
            return this.resultDescription;
        }

        public static final class Builder {
            private java.util.List < ResultDescription> resultDescription; 

            /**
             * ResultDescription.
             */
            public Builder resultDescription(java.util.List < ResultDescription> resultDescription) {
                this.resultDescription = resultDescription;
                return this;
            }

            public ResultDescriptions build() {
                return new ResultDescriptions(this);
            } 

        } 

    }
    public static class SdkDemo extends TeaModel {
        @NameInMap("CallDemo")
        private String callDemo;

        @NameInMap("IdeKey")
        private String ideKey;

        private SdkDemo(Builder builder) {
            this.callDemo = builder.callDemo;
            this.ideKey = builder.ideKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkDemo create() {
            return builder().build();
        }

        /**
         * @return callDemo
         */
        public String getCallDemo() {
            return this.callDemo;
        }

        /**
         * @return ideKey
         */
        public String getIdeKey() {
            return this.ideKey;
        }

        public static final class Builder {
            private String callDemo; 
            private String ideKey; 

            /**
             * CallDemo.
             */
            public Builder callDemo(String callDemo) {
                this.callDemo = callDemo;
                return this;
            }

            /**
             * IdeKey.
             */
            public Builder ideKey(String ideKey) {
                this.ideKey = ideKey;
                return this;
            }

            public SdkDemo build() {
                return new SdkDemo(this);
            } 

        } 

    }
    public static class SdkDemos extends TeaModel {
        @NameInMap("SdkDemo")
        private java.util.List < SdkDemo> sdkDemo;

        private SdkDemos(Builder builder) {
            this.sdkDemo = builder.sdkDemo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkDemos create() {
            return builder().build();
        }

        /**
         * @return sdkDemo
         */
        public java.util.List < SdkDemo> getSdkDemo() {
            return this.sdkDemo;
        }

        public static final class Builder {
            private java.util.List < SdkDemo> sdkDemo; 

            /**
             * SdkDemo.
             */
            public Builder sdkDemo(java.util.List < SdkDemo> sdkDemo) {
                this.sdkDemo = sdkDemo;
                return this;
            }

            public SdkDemos build() {
                return new SdkDemos(this);
            } 

        } 

    }
}
