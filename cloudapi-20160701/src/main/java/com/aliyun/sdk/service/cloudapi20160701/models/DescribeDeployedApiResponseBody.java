// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeployedApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeployedApiResponseBody</p>
 */
public class DescribeDeployedApiResponseBody extends TeaModel {
    @NameInMap("ApiId")
    private String apiId;

    @NameInMap("ApiName")
    private String apiName;

    @NameInMap("AuthType")
    private String authType;

    @NameInMap("BodyFormat")
    private String bodyFormat;

    @NameInMap("ConstantParameters")
    private ConstantParameters constantParameters;

    @NameInMap("DeployedTime")
    private String deployedTime;

    @NameInMap("DisableInternet")
    private Boolean disableInternet;

    @NameInMap("ErrorCodeSamples")
    private ErrorCodeSamples errorCodeSamples;

    @NameInMap("FailResultSample")
    private String failResultSample;

    @NameInMap("ForceNonceCheck")
    private Boolean forceNonceCheck;

    @NameInMap("FunctionComputeConfig")
    private FunctionComputeConfig functionComputeConfig;

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

    @NameInMap("RequestMode")
    private String requestMode;

    @NameInMap("RequestQueries")
    private RequestQueries requestQueries;

    @NameInMap("ResultSample")
    private String resultSample;

    @NameInMap("ResultType")
    private String resultType;

    @NameInMap("ServiceAddress")
    private String serviceAddress;

    @NameInMap("ServiceFCEnable")
    private String serviceFCEnable;

    @NameInMap("ServiceProtocol")
    private String serviceProtocol;

    @NameInMap("ServiceTimeout")
    private Integer serviceTimeout;

    @NameInMap("ServiceVpcEnable")
    private String serviceVpcEnable;

    @NameInMap("StageName")
    private String stageName;

    @NameInMap("SystemParameters")
    private SystemParameters systemParameters;

    @NameInMap("Visibility")
    private String visibility;

    @NameInMap("VpcName")
    private String vpcName;

    private DescribeDeployedApiResponseBody(Builder builder) {
        this.apiId = builder.apiId;
        this.apiName = builder.apiName;
        this.authType = builder.authType;
        this.bodyFormat = builder.bodyFormat;
        this.constantParameters = builder.constantParameters;
        this.deployedTime = builder.deployedTime;
        this.disableInternet = builder.disableInternet;
        this.errorCodeSamples = builder.errorCodeSamples;
        this.failResultSample = builder.failResultSample;
        this.forceNonceCheck = builder.forceNonceCheck;
        this.functionComputeConfig = builder.functionComputeConfig;
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
        this.requestMode = builder.requestMode;
        this.requestQueries = builder.requestQueries;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.serviceAddress = builder.serviceAddress;
        this.serviceFCEnable = builder.serviceFCEnable;
        this.serviceProtocol = builder.serviceProtocol;
        this.serviceTimeout = builder.serviceTimeout;
        this.serviceVpcEnable = builder.serviceVpcEnable;
        this.stageName = builder.stageName;
        this.systemParameters = builder.systemParameters;
        this.visibility = builder.visibility;
        this.vpcName = builder.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeployedApiResponseBody create() {
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
     * @return bodyFormat
     */
    public String getBodyFormat() {
        return this.bodyFormat;
    }

    /**
     * @return constantParameters
     */
    public ConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    /**
     * @return deployedTime
     */
    public String getDeployedTime() {
        return this.deployedTime;
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
     * @return functionComputeConfig
     */
    public FunctionComputeConfig getFunctionComputeConfig() {
        return this.functionComputeConfig;
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
     * @return requestMode
     */
    public String getRequestMode() {
        return this.requestMode;
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
     * @return serviceAddress
     */
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    /**
     * @return serviceFCEnable
     */
    public String getServiceFCEnable() {
        return this.serviceFCEnable;
    }

    /**
     * @return serviceProtocol
     */
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    /**
     * @return serviceTimeout
     */
    public Integer getServiceTimeout() {
        return this.serviceTimeout;
    }

    /**
     * @return serviceVpcEnable
     */
    public String getServiceVpcEnable() {
        return this.serviceVpcEnable;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return systemParameters
     */
    public SystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    /**
     * @return vpcName
     */
    public String getVpcName() {
        return this.vpcName;
    }

    public static final class Builder {
        private String apiId; 
        private String apiName; 
        private String authType; 
        private String bodyFormat; 
        private ConstantParameters constantParameters; 
        private String deployedTime; 
        private Boolean disableInternet; 
        private ErrorCodeSamples errorCodeSamples; 
        private String failResultSample; 
        private Boolean forceNonceCheck; 
        private FunctionComputeConfig functionComputeConfig; 
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
        private String requestMode; 
        private RequestQueries requestQueries; 
        private String resultSample; 
        private String resultType; 
        private String serviceAddress; 
        private String serviceFCEnable; 
        private String serviceProtocol; 
        private Integer serviceTimeout; 
        private String serviceVpcEnable; 
        private String stageName; 
        private SystemParameters systemParameters; 
        private String visibility; 
        private String vpcName; 

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
         * AuthType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
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
         * ConstantParameters.
         */
        public Builder constantParameters(ConstantParameters constantParameters) {
            this.constantParameters = constantParameters;
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
         * DisableInternet.
         */
        public Builder disableInternet(Boolean disableInternet) {
            this.disableInternet = disableInternet;
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
         * ForceNonceCheck.
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            this.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * FunctionComputeConfig.
         */
        public Builder functionComputeConfig(FunctionComputeConfig functionComputeConfig) {
            this.functionComputeConfig = functionComputeConfig;
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
         * RequestMode.
         */
        public Builder requestMode(String requestMode) {
            this.requestMode = requestMode;
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
         * ServiceAddress.
         */
        public Builder serviceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }

        /**
         * ServiceFCEnable.
         */
        public Builder serviceFCEnable(String serviceFCEnable) {
            this.serviceFCEnable = serviceFCEnable;
            return this;
        }

        /**
         * ServiceProtocol.
         */
        public Builder serviceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
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
         * ServiceVpcEnable.
         */
        public Builder serviceVpcEnable(String serviceVpcEnable) {
            this.serviceVpcEnable = serviceVpcEnable;
            return this;
        }

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.stageName = stageName;
            return this;
        }

        /**
         * SystemParameters.
         */
        public Builder systemParameters(SystemParameters systemParameters) {
            this.systemParameters = systemParameters;
            return this;
        }

        /**
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * VpcName.
         */
        public Builder vpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }

        public DescribeDeployedApiResponseBody build() {
            return new DescribeDeployedApiResponseBody(this);
        } 

    } 

    public static class ConstantParameter extends TeaModel {
        @NameInMap("ConstantValue")
        private String constantValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("Location")
        private String location;

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private ConstantParameter(Builder builder) {
            this.constantValue = builder.constantValue;
            this.description = builder.description;
            this.location = builder.location;
            this.serviceParameterName = builder.serviceParameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConstantParameter create() {
            return builder().build();
        }

        /**
         * @return constantValue
         */
        public String getConstantValue() {
            return this.constantValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String constantValue; 
            private String description; 
            private String location; 
            private String serviceParameterName; 

            /**
             * ConstantValue.
             */
            public Builder constantValue(String constantValue) {
                this.constantValue = constantValue;
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
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * ServiceParameterName.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
                return this;
            }

            public ConstantParameter build() {
                return new ConstantParameter(this);
            } 

        } 

    }
    public static class ConstantParameters extends TeaModel {
        @NameInMap("ConstantParameter")
        private java.util.List < ConstantParameter> constantParameter;

        private ConstantParameters(Builder builder) {
            this.constantParameter = builder.constantParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConstantParameters create() {
            return builder().build();
        }

        /**
         * @return constantParameter
         */
        public java.util.List < ConstantParameter> getConstantParameter() {
            return this.constantParameter;
        }

        public static final class Builder {
            private java.util.List < ConstantParameter> constantParameter; 

            /**
             * ConstantParameter.
             */
            public Builder constantParameter(java.util.List < ConstantParameter> constantParameter) {
                this.constantParameter = constantParameter;
                return this;
            }

            public ConstantParameters build() {
                return new ConstantParameters(this);
            } 

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
    public static class FunctionComputeConfig extends TeaModel {
        @NameInMap("FcRegionId")
        private String fcRegionId;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("ServiceName")
        private String serviceName;

        private FunctionComputeConfig(Builder builder) {
            this.fcRegionId = builder.fcRegionId;
            this.functionName = builder.functionName;
            this.roleArn = builder.roleArn;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionComputeConfig create() {
            return builder().build();
        }

        /**
         * @return fcRegionId
         */
        public String getFcRegionId() {
            return this.fcRegionId;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String fcRegionId; 
            private String functionName; 
            private String roleArn; 
            private String serviceName; 

            /**
             * FcRegionId.
             */
            public Builder fcRegionId(String fcRegionId) {
                this.fcRegionId = fcRegionId;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FunctionComputeConfig build() {
                return new FunctionComputeConfig(this);
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

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private PathParameter(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.serviceParameterName = builder.serviceParameterName;
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

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String demoValue; 
            private String description; 
            private String serviceParameterName; 

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

            /**
             * ServiceParameterName.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
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

        @NameInMap("ArrayItemsType")
        private String arrayItemsType;

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

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private RequestParam(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.arrayItemsType = builder.arrayItemsType;
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
            this.serviceParameterName = builder.serviceParameterName;
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

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String arrayItemsType; 
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
            private String serviceParameterName; 

            /**
             * ApiParameterName.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
                return this;
            }

            /**
             * ArrayItemsType.
             */
            public Builder arrayItemsType(String arrayItemsType) {
                this.arrayItemsType = arrayItemsType;
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

            /**
             * ServiceParameterName.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
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

        @NameInMap("ArrayItemsType")
        private String arrayItemsType;

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

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private RequestHeadersRequestParam(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.arrayItemsType = builder.arrayItemsType;
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
            this.serviceParameterName = builder.serviceParameterName;
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

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String arrayItemsType; 
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
            private String serviceParameterName; 

            /**
             * ApiParameterName.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
                return this;
            }

            /**
             * ArrayItemsType.
             */
            public Builder arrayItemsType(String arrayItemsType) {
                this.arrayItemsType = arrayItemsType;
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

            /**
             * ServiceParameterName.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
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

        @NameInMap("ArrayItemsType")
        private String arrayItemsType;

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

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private RequestQueriesRequestParam(Builder builder) {
            this.apiParameterName = builder.apiParameterName;
            this.arrayItemsType = builder.arrayItemsType;
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
            this.serviceParameterName = builder.serviceParameterName;
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

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String apiParameterName; 
            private String arrayItemsType; 
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
            private String serviceParameterName; 

            /**
             * ApiParameterName.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
                return this;
            }

            /**
             * ArrayItemsType.
             */
            public Builder arrayItemsType(String arrayItemsType) {
                this.arrayItemsType = arrayItemsType;
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

            /**
             * ServiceParameterName.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
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
    public static class SystemParameter extends TeaModel {
        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("Location")
        private String location;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private SystemParameter(Builder builder) {
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.location = builder.location;
            this.parameterName = builder.parameterName;
            this.serviceParameterName = builder.serviceParameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParameter create() {
            return builder().build();
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
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String demoValue; 
            private String description; 
            private String location; 
            private String parameterName; 
            private String serviceParameterName; 

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
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * ServiceParameterName.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
                return this;
            }

            public SystemParameter build() {
                return new SystemParameter(this);
            } 

        } 

    }
    public static class SystemParameters extends TeaModel {
        @NameInMap("SystemParameter")
        private java.util.List < SystemParameter> systemParameter;

        private SystemParameters(Builder builder) {
            this.systemParameter = builder.systemParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParameters create() {
            return builder().build();
        }

        /**
         * @return systemParameter
         */
        public java.util.List < SystemParameter> getSystemParameter() {
            return this.systemParameter;
        }

        public static final class Builder {
            private java.util.List < SystemParameter> systemParameter; 

            /**
             * SystemParameter.
             */
            public Builder systemParameter(java.util.List < SystemParameter> systemParameter) {
                this.systemParameter = systemParameter;
                return this;
            }

            public SystemParameters build() {
                return new SystemParameters(this);
            } 

        } 

    }
}
