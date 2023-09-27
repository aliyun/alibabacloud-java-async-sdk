// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApiResponseBody</p>
 */
public class DescribePurchasedApiResponseBody extends TeaModel {
    @NameInMap("ApiId")
    private String apiId;

    @NameInMap("ApiName")
    private String apiName;

    @NameInMap("BodyFormat")
    private String bodyFormat;

    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("HttpMethod")
    private String httpMethod;

    @NameInMap("HttpProtocol")
    private String httpProtocol;

    @NameInMap("Mock")
    private String mock;

    @NameInMap("MockResult")
    private String mockResult;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

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

    @NameInMap("ResultSample")
    private String resultSample;

    @NameInMap("ResultType")
    private String resultType;

    @NameInMap("Visibility")
    private String visibility;

    private DescribePurchasedApiResponseBody(Builder builder) {
        this.apiId = builder.apiId;
        this.apiName = builder.apiName;
        this.bodyFormat = builder.bodyFormat;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.httpMethod = builder.httpMethod;
        this.httpProtocol = builder.httpProtocol;
        this.mock = builder.mock;
        this.mockResult = builder.mockResult;
        this.modifiedTime = builder.modifiedTime;
        this.path = builder.path;
        this.pathParameters = builder.pathParameters;
        this.postBodyDescription = builder.postBodyDescription;
        this.postBodyType = builder.postBodyType;
        this.regionId = builder.regionId;
        this.requestBody = builder.requestBody;
        this.requestHeaders = builder.requestHeaders;
        this.requestId = builder.requestId;
        this.requestQueries = builder.requestQueries;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurchasedApiResponseBody create() {
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
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return mock
     */
    public String getMock() {
        return this.mock;
    }

    /**
     * @return mockResult
     */
    public String getMockResult() {
        return this.mockResult;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
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
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String apiId; 
        private String apiName; 
        private String bodyFormat; 
        private String createdTime; 
        private String description; 
        private String groupId; 
        private String groupName; 
        private String httpMethod; 
        private String httpProtocol; 
        private String mock; 
        private String mockResult; 
        private String modifiedTime; 
        private String path; 
        private PathParameters pathParameters; 
        private String postBodyDescription; 
        private String postBodyType; 
        private String regionId; 
        private RequestBody requestBody; 
        private RequestHeaders requestHeaders; 
        private String requestId; 
        private RequestQueries requestQueries; 
        private String resultSample; 
        private String resultType; 
        private String visibility; 

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
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * Mock.
         */
        public Builder mock(String mock) {
            this.mock = mock;
            return this;
        }

        /**
         * MockResult.
         */
        public Builder mockResult(String mockResult) {
            this.mockResult = mockResult;
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
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public DescribePurchasedApiResponseBody build() {
            return new DescribePurchasedApiResponseBody(this);
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

        @NameInMap("DocOrder")
        private String docOrder;

        @NameInMap("DocShow")
        private String docShow;

        @NameInMap("EnumValue")
        private String enumValue;

        @NameInMap("JsonScheme")
        private String jsonScheme;

        @NameInMap("MaxLength")
        private Long maxLength;

        @NameInMap("MaxValue")
        private String maxValue;

        @NameInMap("MinLength")
        private Long minLength;

        @NameInMap("MinValue")
        private String minValue;

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
            this.docOrder = builder.docOrder;
            this.docShow = builder.docShow;
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
         * @return docOrder
         */
        public String getDocOrder() {
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
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
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
        public String getMinValue() {
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
            private String docOrder; 
            private String docShow; 
            private String enumValue; 
            private String jsonScheme; 
            private Long maxLength; 
            private String maxValue; 
            private Long minLength; 
            private String minValue; 
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
             * DocOrder.
             */
            public Builder docOrder(String docOrder) {
                this.docOrder = docOrder;
                return this;
            }

            /**
             * DocShow.
             */
            public Builder docShow(String docShow) {
                this.docShow = docShow;
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
            public Builder maxValue(String maxValue) {
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
            public Builder minValue(String minValue) {
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

        @NameInMap("DocOrder")
        private String docOrder;

        @NameInMap("DocShow")
        private String docShow;

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
            this.docOrder = builder.docOrder;
            this.docShow = builder.docShow;
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
         * @return docOrder
         */
        public String getDocOrder() {
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
            private String docOrder; 
            private String docShow; 
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
             * DocOrder.
             */
            public Builder docOrder(String docOrder) {
                this.docOrder = docOrder;
                return this;
            }

            /**
             * DocShow.
             */
            public Builder docShow(String docShow) {
                this.docShow = docShow;
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

        @NameInMap("DocOrder")
        private String docOrder;

        @NameInMap("DocShow")
        private String docShow;

        @NameInMap("EnumValue")
        private String enumValue;

        @NameInMap("JsonScheme")
        private String jsonScheme;

        @NameInMap("MaxLength")
        private Long maxLength;

        @NameInMap("MaxValue")
        private String maxValue;

        @NameInMap("MinLength")
        private Long minLength;

        @NameInMap("MinValue")
        private String minValue;

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
            this.docOrder = builder.docOrder;
            this.docShow = builder.docShow;
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
         * @return docOrder
         */
        public String getDocOrder() {
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
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
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
        public String getMinValue() {
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
            private String docOrder; 
            private String docShow; 
            private String enumValue; 
            private String jsonScheme; 
            private Long maxLength; 
            private String maxValue; 
            private Long minLength; 
            private String minValue; 
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
             * DocOrder.
             */
            public Builder docOrder(String docOrder) {
                this.docOrder = docOrder;
                return this;
            }

            /**
             * DocShow.
             */
            public Builder docShow(String docShow) {
                this.docShow = docShow;
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
            public Builder maxValue(String maxValue) {
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
            public Builder minValue(String minValue) {
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
}
