// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiDocResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiDocResponseBody</p>
 */
public class DescribeApiDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("DeployedTime")
    private String deployedTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisableInternet")
    private Boolean disableInternet;

    @com.aliyun.core.annotation.NameInMap("ErrorCodeSamples")
    private ErrorCodeSamples errorCodeSamples;

    @com.aliyun.core.annotation.NameInMap("FailResultSample")
    private String failResultSample;

    @com.aliyun.core.annotation.NameInMap("ForceNonceCheck")
    private Boolean forceNonceCheck;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestConfig")
    private RequestConfig requestConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestParameters")
    private RequestParameters requestParameters;

    @com.aliyun.core.annotation.NameInMap("ResultSample")
    private String resultSample;

    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.NameInMap("StageName")
    private String stageName;

    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private DescribeApiDocResponseBody(Builder builder) {
        this.apiId = builder.apiId;
        this.apiName = builder.apiName;
        this.authType = builder.authType;
        this.deployedTime = builder.deployedTime;
        this.description = builder.description;
        this.disableInternet = builder.disableInternet;
        this.errorCodeSamples = builder.errorCodeSamples;
        this.failResultSample = builder.failResultSample;
        this.forceNonceCheck = builder.forceNonceCheck;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
        this.requestConfig = builder.requestConfig;
        this.requestId = builder.requestId;
        this.requestParameters = builder.requestParameters;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.stageName = builder.stageName;
        this.visibility = builder.visibility;
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
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
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
     * @return disableInternet
     */
    public Boolean getDisableInternet() {
        return this.disableInternet;
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
     * @return forceNonceCheck
     */
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestConfig
     */
    public RequestConfig getRequestConfig() {
        return this.requestConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestParameters
     */
    public RequestParameters getRequestParameters() {
        return this.requestParameters;
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
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String apiId; 
        private String apiName; 
        private String authType; 
        private String deployedTime; 
        private String description; 
        private Boolean disableInternet; 
        private ErrorCodeSamples errorCodeSamples; 
        private String failResultSample; 
        private Boolean forceNonceCheck; 
        private String groupId; 
        private String groupName; 
        private String regionId; 
        private RequestConfig requestConfig; 
        private String requestId; 
        private RequestParameters requestParameters; 
        private String resultSample; 
        private String resultType; 
        private String stageName; 
        private String visibility; 

        /**
         * The ID of the API.
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * The name of the API
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * The security authentication method. Valid values: APP, ANONYMOUS, and APPOPENID, indicating respectively Alibaba Cloud application authentication, anonymous authentication, and third-party OpenID Connect account authentication.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * The publishing time.
         */
        public Builder deployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }

        /**
         * The API description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * *   Specifies whether to set **DisableInternet** to **true** to limit API calls to within the VPC.
         * <p>
         * *   If you set **DisableInternet** to **false**, the limit is lifted. The default value is false when you create an API.
         */
        public Builder disableInternet(Boolean disableInternet) {
            this.disableInternet = disableInternet;
            return this;
        }

        /**
         * The sample error codes returned by the backend service.
         */
        public Builder errorCodeSamples(ErrorCodeSamples errorCodeSamples) {
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * The sample error response from the backend service.
         */
        public Builder failResultSample(String failResultSample) {
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * *   Specifies whether to set **ForceNonceCheck** to **true** to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.
         * <p>
         * *   If you set **ForceNonceCheck** to **false**, the check is not performed. The default value is false when you create an API.
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            this.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * The ID of the API group.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the API group.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The region ID of the API group.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The returned API frontend definition. It is an array consisting of RequestConfig data.
         */
        public Builder requestConfig(RequestConfig requestConfig) {
            this.requestConfig = requestConfig;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned frontend input parameters in the API. It is an array consisting of RequestParameter data.
         */
        public Builder requestParameters(RequestParameters requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * The sample response.
         */
        public Builder resultSample(String resultSample) {
            this.resultSample = resultSample;
            return this;
        }

        /**
         * The return value type.
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * The name of the runtime environment. Valid values:
         * <p>
         * 
         * *   **RELEASE**
         * *   **TEST**
         */
        public Builder stageName(String stageName) {
            this.stageName = stageName;
            return this;
        }

        /**
         * Indicates whether the API is public. Valid values: PUBLIC and PRIVATE.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public DescribeApiDocResponseBody build() {
            return new DescribeApiDocResponseBody(this);
        } 

    } 

    public static class ErrorCodeSample extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Message")
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
             * The returned error code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The error description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The returned error message.
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
        @com.aliyun.core.annotation.NameInMap("ErrorCodeSample")
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
    public static class RequestConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyFormat")
        private String bodyFormat;

        @com.aliyun.core.annotation.NameInMap("EscapePathParam")
        private Boolean escapePathParam;

        @com.aliyun.core.annotation.NameInMap("PostBodyDescription")
        private String postBodyDescription;

        @com.aliyun.core.annotation.NameInMap("RequestHttpMethod")
        private String requestHttpMethod;

        @com.aliyun.core.annotation.NameInMap("RequestMode")
        private String requestMode;

        @com.aliyun.core.annotation.NameInMap("RequestPath")
        private String requestPath;

        @com.aliyun.core.annotation.NameInMap("RequestProtocol")
        private String requestProtocol;

        private RequestConfig(Builder builder) {
            this.bodyFormat = builder.bodyFormat;
            this.escapePathParam = builder.escapePathParam;
            this.postBodyDescription = builder.postBodyDescription;
            this.requestHttpMethod = builder.requestHttpMethod;
            this.requestMode = builder.requestMode;
            this.requestPath = builder.requestPath;
            this.requestProtocol = builder.requestProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestConfig create() {
            return builder().build();
        }

        /**
         * @return bodyFormat
         */
        public String getBodyFormat() {
            return this.bodyFormat;
        }

        /**
         * @return escapePathParam
         */
        public Boolean getEscapePathParam() {
            return this.escapePathParam;
        }

        /**
         * @return postBodyDescription
         */
        public String getPostBodyDescription() {
            return this.postBodyDescription;
        }

        /**
         * @return requestHttpMethod
         */
        public String getRequestHttpMethod() {
            return this.requestHttpMethod;
        }

        /**
         * @return requestMode
         */
        public String getRequestMode() {
            return this.requestMode;
        }

        /**
         * @return requestPath
         */
        public String getRequestPath() {
            return this.requestPath;
        }

        /**
         * @return requestProtocol
         */
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

        public static final class Builder {
            private String bodyFormat; 
            private Boolean escapePathParam; 
            private String postBodyDescription; 
            private String requestHttpMethod; 
            private String requestMode; 
            private String requestPath; 
            private String requestProtocol; 

            /**
             * This parameter takes effect only when the RequestMode parameter is set to MAPPING.********
             * <p>
             * 
             * The server data transmission method used for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data in key-value pairs is transmitted as forms. STREAM indicates that data is transmitted as byte streams.
             */
            public Builder bodyFormat(String bodyFormat) {
                this.bodyFormat = bodyFormat;
                return this;
            }

            /**
             * EscapePathParam.
             */
            public Builder escapePathParam(Boolean escapePathParam) {
                this.escapePathParam = escapePathParam;
                return this;
            }

            /**
             * The description of the request body.
             */
            public Builder postBodyDescription(String postBodyDescription) {
                this.postBodyDescription = postBodyDescription;
                return this;
            }

            /**
             * The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.
             */
            public Builder requestHttpMethod(String requestHttpMethod) {
                this.requestHttpMethod = requestHttpMethod;
                return this;
            }

            /**
             * The request mode. Valid values:
             * <p>
             * 
             * *   MAPPING: Parameters are mapped. Unknown parameters are filtered out.
             * *   PASSTHROUGH: Parameters are passed through.
             * *   MAPPING_PASSTHROUGH: Parameters are mapped. Unknown parameters are passed through.
             */
            public Builder requestMode(String requestMode) {
                this.requestMode = requestMode;
                return this;
            }

            /**
             * The API request path. If the complete API URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the API request path is ` /object/add  `.
             */
            public Builder requestPath(String requestPath) {
                this.requestPath = requestPath;
                return this;
            }

            /**
             * The protocol type supported by the API. Valid values: HTTP and HTTPS. Separate multiple values with commas (,), such as "HTTP,HTTPS".
             */
            public Builder requestProtocol(String requestProtocol) {
                this.requestProtocol = requestProtocol;
                return this;
            }

            public RequestConfig build() {
                return new RequestConfig(this);
            } 

        } 

    }
    public static class RequestParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiParameterName")
        private String apiParameterName;

        @com.aliyun.core.annotation.NameInMap("ArrayItemsType")
        private String arrayItemsType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("DemoValue")
        private String demoValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocOrder")
        private Integer docOrder;

        @com.aliyun.core.annotation.NameInMap("DocShow")
        private String docShow;

        @com.aliyun.core.annotation.NameInMap("EnumValue")
        private String enumValue;

        @com.aliyun.core.annotation.NameInMap("JsonScheme")
        private String jsonScheme;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("MaxLength")
        private Long maxLength;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private Long maxValue;

        @com.aliyun.core.annotation.NameInMap("MinLength")
        private Long minLength;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private Long minValue;

        @com.aliyun.core.annotation.NameInMap("ParameterType")
        private String parameterType;

        @com.aliyun.core.annotation.NameInMap("RegularExpression")
        private String regularExpression;

        @com.aliyun.core.annotation.NameInMap("Required")
        private String required;

        private RequestParameter(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.arrayItemsType = builder.arrayItemsType;
            this.defaultValue = builder.defaultValue;
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.docOrder = builder.docOrder;
            this.docShow = builder.docShow;
            this.enumValue = builder.enumValue;
            this.jsonScheme = builder.jsonScheme;
            this.location = builder.location;
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

        public static RequestParameter create() {
            return builder().build();
        }

        /**
         * @return apiParameterName
         */
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        /**
         * @return arrayItemsType
         */
        public String getArrayItemsType() {
            return this.arrayItemsType;
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
         * @return docOrder
         */
        public Integer getDocOrder() {
            return this.docOrder;
        }

        /**
         * @return docShow
         */
        public String getDocShow() {
            return this.docShow;
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
         * @return location
         */
        public String getLocation() {
            return this.location;
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
            private String arrayItemsType; 
            private String defaultValue; 
            private String demoValue; 
            private String description; 
            private Integer docOrder; 
            private String docShow; 
            private String enumValue; 
            private String jsonScheme; 
            private String location; 
            private Long maxLength; 
            private Long maxValue; 
            private Long minLength; 
            private Long minValue; 
            private String parameterType; 
            private String regularExpression; 
            private String required; 

            /**
             * The name of the parameter in the API request.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
                return this;
            }

            /**
             * The type of the array element.
             */
            public Builder arrayItemsType(String arrayItemsType) {
                this.arrayItemsType = arrayItemsType;
                return this;
            }

            /**
             * The default value.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The example value.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * The parameter description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The order in which the parameter is sorted in the document.
             */
            public Builder docOrder(Integer docOrder) {
                this.docOrder = docOrder;
                return this;
            }

            /**
             * Indicates whether the document is public. Valid values: **PUBLIC** and **PRIVATE**.
             */
            public Builder docShow(String docShow) {
                this.docShow = docShow;
                return this;
            }

            /**
             * The hash values that are supported when **ParameterType** is set to Int, Long, Float, Double, or String. Separate values with commas (,). Examples: 1,2,3,4,9 and A,B,C,E,F.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * JSON scheme
             */
            public Builder jsonScheme(String jsonScheme) {
                this.jsonScheme = jsonScheme;
                return this;
            }

            /**
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The maximum length.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * The maximum value.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * The minimum length.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * The minimum value.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * The data type of the parameter.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * The regular expression that is used for parameter validation when **ParameterType** is set to String.
             */
            public Builder regularExpression(String regularExpression) {
                this.regularExpression = regularExpression;
                return this;
            }

            /**
             * Indicates whether the parameter is required.
             */
            public Builder required(String required) {
                this.required = required;
                return this;
            }

            public RequestParameter build() {
                return new RequestParameter(this);
            } 

        } 

    }
    public static class RequestParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestParameter")
        private java.util.List < RequestParameter> requestParameter;

        private RequestParameters(Builder builder) {
            this.requestParameter = builder.requestParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParameters create() {
            return builder().build();
        }

        /**
         * @return requestParameter
         */
        public java.util.List < RequestParameter> getRequestParameter() {
            return this.requestParameter;
        }

        public static final class Builder {
            private java.util.List < RequestParameter> requestParameter; 

            /**
             * RequestParameter.
             */
            public Builder requestParameter(java.util.List < RequestParameter> requestParameter) {
                this.requestParameter = requestParameter;
                return this;
            }

            public RequestParameters build() {
                return new RequestParameters(this);
            } 

        } 

    }
}
