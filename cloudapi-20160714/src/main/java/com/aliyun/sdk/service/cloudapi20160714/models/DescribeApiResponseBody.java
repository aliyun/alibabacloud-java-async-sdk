// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiResponseBody</p>
 */
public class DescribeApiResponseBody extends TeaModel {
    @NameInMap("AllowSignatureMethod")
    private String allowSignatureMethod;

    @NameInMap("ApiId")
    private String apiId;

    @NameInMap("ApiName")
    private String apiName;

    @NameInMap("AppCodeAuthType")
    private String appCodeAuthType;

    @NameInMap("AuthType")
    private String authType;

    @NameInMap("BackendConfig")
    private BackendConfig backendConfig;

    @NameInMap("BackendEnable")
    private Boolean backendEnable;

    @NameInMap("ConstantParameters")
    private ConstantParameters constantParameters;

    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("CustomSystemParameters")
    private CustomSystemParameters customSystemParameters;

    @NameInMap("DeployedInfos")
    private DeployedInfos deployedInfos;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisableInternet")
    private Boolean disableInternet;

    @NameInMap("ErrorCodeSamples")
    private ErrorCodeSamples errorCodeSamples;

    @NameInMap("FailResultSample")
    private String failResultSample;

    @NameInMap("ForceNonceCheck")
    private Boolean forceNonceCheck;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("Mock")
    private String mock;

    @NameInMap("MockResult")
    private String mockResult;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

    @NameInMap("OpenIdConnectConfig")
    private OpenIdConnectConfig openIdConnectConfig;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestConfig")
    private RequestConfig requestConfig;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestParameters")
    private RequestParameters requestParameters;

    @NameInMap("ResultBodyModel")
    private String resultBodyModel;

    @NameInMap("ResultSample")
    private String resultSample;

    @NameInMap("ResultType")
    private String resultType;

    @NameInMap("ServiceConfig")
    private ServiceConfig serviceConfig;

    @NameInMap("ServiceParameters")
    private ServiceParameters serviceParameters;

    @NameInMap("ServiceParametersMap")
    private ServiceParametersMap serviceParametersMap;

    @NameInMap("SystemParameters")
    private SystemParameters systemParameters;

    @NameInMap("Visibility")
    private String visibility;

    @NameInMap("WebSocketApiType")
    private String webSocketApiType;

    private DescribeApiResponseBody(Builder builder) {
        this.allowSignatureMethod = builder.allowSignatureMethod;
        this.apiId = builder.apiId;
        this.apiName = builder.apiName;
        this.appCodeAuthType = builder.appCodeAuthType;
        this.authType = builder.authType;
        this.backendConfig = builder.backendConfig;
        this.backendEnable = builder.backendEnable;
        this.constantParameters = builder.constantParameters;
        this.createdTime = builder.createdTime;
        this.customSystemParameters = builder.customSystemParameters;
        this.deployedInfos = builder.deployedInfos;
        this.description = builder.description;
        this.disableInternet = builder.disableInternet;
        this.errorCodeSamples = builder.errorCodeSamples;
        this.failResultSample = builder.failResultSample;
        this.forceNonceCheck = builder.forceNonceCheck;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.mock = builder.mock;
        this.mockResult = builder.mockResult;
        this.modifiedTime = builder.modifiedTime;
        this.openIdConnectConfig = builder.openIdConnectConfig;
        this.regionId = builder.regionId;
        this.requestConfig = builder.requestConfig;
        this.requestId = builder.requestId;
        this.requestParameters = builder.requestParameters;
        this.resultBodyModel = builder.resultBodyModel;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.serviceConfig = builder.serviceConfig;
        this.serviceParameters = builder.serviceParameters;
        this.serviceParametersMap = builder.serviceParametersMap;
        this.systemParameters = builder.systemParameters;
        this.visibility = builder.visibility;
        this.webSocketApiType = builder.webSocketApiType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowSignatureMethod
     */
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
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
     * @return appCodeAuthType
     */
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return backendConfig
     */
    public BackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    /**
     * @return backendEnable
     */
    public Boolean getBackendEnable() {
        return this.backendEnable;
    }

    /**
     * @return constantParameters
     */
    public ConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return customSystemParameters
     */
    public CustomSystemParameters getCustomSystemParameters() {
        return this.customSystemParameters;
    }

    /**
     * @return deployedInfos
     */
    public DeployedInfos getDeployedInfos() {
        return this.deployedInfos;
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
     * @return openIdConnectConfig
     */
    public OpenIdConnectConfig getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
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
     * @return resultBodyModel
     */
    public String getResultBodyModel() {
        return this.resultBodyModel;
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
     * @return serviceConfig
     */
    public ServiceConfig getServiceConfig() {
        return this.serviceConfig;
    }

    /**
     * @return serviceParameters
     */
    public ServiceParameters getServiceParameters() {
        return this.serviceParameters;
    }

    /**
     * @return serviceParametersMap
     */
    public ServiceParametersMap getServiceParametersMap() {
        return this.serviceParametersMap;
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
     * @return webSocketApiType
     */
    public String getWebSocketApiType() {
        return this.webSocketApiType;
    }

    public static final class Builder {
        private String allowSignatureMethod; 
        private String apiId; 
        private String apiName; 
        private String appCodeAuthType; 
        private String authType; 
        private BackendConfig backendConfig; 
        private Boolean backendEnable; 
        private ConstantParameters constantParameters; 
        private String createdTime; 
        private CustomSystemParameters customSystemParameters; 
        private DeployedInfos deployedInfos; 
        private String description; 
        private Boolean disableInternet; 
        private ErrorCodeSamples errorCodeSamples; 
        private String failResultSample; 
        private Boolean forceNonceCheck; 
        private String groupId; 
        private String groupName; 
        private String mock; 
        private String mockResult; 
        private String modifiedTime; 
        private OpenIdConnectConfig openIdConnectConfig; 
        private String regionId; 
        private RequestConfig requestConfig; 
        private String requestId; 
        private RequestParameters requestParameters; 
        private String resultBodyModel; 
        private String resultSample; 
        private String resultType; 
        private ServiceConfig serviceConfig; 
        private ServiceParameters serviceParameters; 
        private ServiceParametersMap serviceParametersMap; 
        private SystemParameters systemParameters; 
        private String visibility; 
        private String webSocketApiType; 

        /**
         * The region ID of the API.
         */
        public Builder allowSignatureMethod(String allowSignatureMethod) {
            this.allowSignatureMethod = allowSignatureMethod;
            return this;
        }

        /**
         * The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML.
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * Specifies whether to enable backend services.
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * If **AuthType** is set to **APP**, this value must be passed to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:
         * <p>
         * 
         * *   HmacSHA256
         * *   HmacSHA1,HmacSHA256
         */
        public Builder appCodeAuthType(String appCodeAuthType) {
            this.appCodeAuthType = appCodeAuthType;
            return this;
        }

        /**
         * The last modification time of the API.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * The ID of the backend service.
         */
        public Builder backendConfig(BackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * Backend configurations
         */
        public Builder backendEnable(Boolean backendEnable) {
            this.backendEnable = backendEnable;
            return this;
        }

        /**
         * Description
         */
        public Builder constantParameters(ConstantParameters constantParameters) {
            this.constantParameters = constantParameters;
            return this;
        }

        /**
         * The name of the API, which is unique in the group.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Examples
         */
        public Builder customSystemParameters(CustomSystemParameters customSystemParameters) {
            this.customSystemParameters = customSystemParameters;
            return this;
        }

        /**
         * The name of the runtime environment. Valid values: RELEASE and TEST.
         */
        public Builder deployedInfos(DeployedInfos deployedInfos) {
            this.deployedInfos = deployedInfos;
            return this;
        }

        /**
         * The name of the API group.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The returned description of the API.
         */
        public Builder disableInternet(Boolean disableInternet) {
            this.disableInternet = disableInternet;
            return this;
        }

        /**
         * Error codes
         */
        public Builder errorCodeSamples(ErrorCodeSamples errorCodeSamples) {
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * The security authentication method of the API. Valid values:
         * <p>
         * 
         * *   **APP**: Only authorized applications can call the API.
         * 
         * *   **ANONYMOUS**: The API can be anonymously called. In this mode, you must take note of the following rules:
         * 
         *     *   All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.
         *     *   We recommend that you do not make the API whose security authentication method is ANONYMOUS available in Alibaba Cloud Marketplace because API Gateway cannot meter calls on the caller or limit the number of calls on the API. If you want to make the API group to which the API belongs available in Alibaba Cloud Marketplace, we recommend that you move the API to another group, set its type to PRIVATE, or set its security authentication method to APP.
         * 
         * *   **APPOPENID**: The OpenID Connect account authentication method is used. Only applications authorized by OpenID Connect can call the API. If this method is selected, the OpenIdConnectConfig parameter is required.
         */
        public Builder failResultSample(String failResultSample) {
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * Specifies whether to make the API public. Valid values:
         * <p>
         * 
         * *   **PUBLIC**: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.
         * *   **PRIVATE**: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            this.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * Specifies whether to enable the Mock mode. Valid values:
         * <p>
         * 
         * *   OPEN: The Mock mode is enabled.
         * *   CLOSED: The Mock mode is not enabled.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the API group.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The result returned for service mocking.
         */
        public Builder mock(String mock) {
            this.mock = mock;
            return this;
        }

        /**
         * The creation time of the API.
         */
        public Builder mockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * The OpenID Connect mode. Valid values:
         * <p>
         * 
         * *   **IDTOKEN**: indicates the APIs that are called by clients to obtain tokens. If you specify this value, the PublicKeyId parameter and the PublicKey parameter are required.
         * *   **BUSINESS**: indicates business APIs. Tokens are used to call the business APIs. If you specify this value, the IdTokenParamName parameter is required.
         */
        public Builder openIdConnectConfig(OpenIdConnectConfig openIdConnectConfig) {
            this.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * Specifies whether to carry the header : X-Ca-Nonce when calling an API. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent reply attacks. Valid values:
         * <p>
         * 
         * *   **true**: This field is forcibly checked when an API is requested to prevent replay attacks.
         * *   **false**: This field is not checked.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The body model.
         */
        public Builder requestConfig(RequestConfig requestConfig) {
            this.requestConfig = requestConfig;
            return this;
        }

        /**
         * The description of the API.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The JSON Schema used for JSON validation when **ParameterType** is set to String.
         */
        public Builder requestParameters(RequestParameters requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * The sample response from the backend service.
         */
        public Builder resultBodyModel(String resultBodyModel) {
            this.resultBodyModel = resultBodyModel;
            return this;
        }

        /**
         * If **AuthType** is set to **APP**, the valid values are:
         * <p>
         * 
         * *   **DEFAULT**: The default value that is used if no other values are passed. This value means that the setting of the group is used.
         * *   **DISABLE**: The authentication is disabled.
         * *   **HEADER**: AppCode can be placed in the Header parameter for authentication.
         * *   **HEADER_QUERY**: AppCode can be placed in the Header or Query parameter for authentication.
         */
        public Builder resultSample(String resultSample) {
            this.resultSample = resultSample;
            return this;
        }

        /**
         * The type of the two-way communication API. Valid values:
         * <p>
         * 
         * *   **COMMON**: general APIs
         * *   **REGISTER**: registered APIs
         * *   **UNREGISTER**: unregistered APIs
         * *   **NOTIFY**: downstream notification
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * The application name in AONE.
         */
        public Builder serviceConfig(ServiceConfig serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
         */
        public Builder serviceParameters(ServiceParameters serviceParameters) {
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * The corresponding frontend parameter name. It must be included in RequestParametersObject and matches ApiParameterName in RequestParameter data.
         */
        public Builder serviceParametersMap(ServiceParametersMap serviceParametersMap) {
            this.serviceParametersMap = serviceParametersMap;
            return this;
        }

        /**
         * Examples
         */
        public Builder systemParameters(SystemParameters systemParameters) {
            this.systemParameters = systemParameters;
            return this;
        }

        /**
         * The sample error response from the backend service.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Specifies whether to limit API calls to within the VPC. Valid values:
         * <p>
         * 
         * *   **true**: Only API calls from the VPC are supported.
         * *   **false**: API calls from the VPC and Internet are both supported.
         */
        public Builder webSocketApiType(String webSocketApiType) {
            this.webSocketApiType = webSocketApiType;
            return this;
        }

        public DescribeApiResponseBody build() {
            return new DescribeApiResponseBody(this);
        } 

    } 

    public static class BackendConfig extends TeaModel {
        @NameInMap("BackendId")
        private String backendId;

        @NameInMap("BackendName")
        private String backendName;

        @NameInMap("BackendType")
        private String backendType;

        private BackendConfig(Builder builder) {
            this.backendId = builder.backendId;
            this.backendName = builder.backendName;
            this.backendType = builder.backendType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendConfig create() {
            return builder().build();
        }

        /**
         * @return backendId
         */
        public String getBackendId() {
            return this.backendId;
        }

        /**
         * @return backendName
         */
        public String getBackendName() {
            return this.backendName;
        }

        /**
         * @return backendType
         */
        public String getBackendType() {
            return this.backendType;
        }

        public static final class Builder {
            private String backendId; 
            private String backendName; 
            private String backendType; 

            /**
             * Backend service type
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * The configuration items of API requests sent by the consumer to API Gateway.
             */
            public Builder backendName(String backendName) {
                this.backendName = backendName;
                return this;
            }

            /**
             * The name of the backend service.
             */
            public Builder backendType(String backendType) {
                this.backendType = backendType;
                return this;
            }

            public BackendConfig build() {
                return new BackendConfig(this);
            } 

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
             * The parameters of API requests sent by the consumer to API Gateway.
             */
            public Builder constantValue(String constantValue) {
                this.constantValue = constantValue;
                return this;
            }

            /**
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the backend service parameter.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The value of the parameter.
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
    public static class CustomSystemParameter extends TeaModel {
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

        private CustomSystemParameter(Builder builder) {
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.location = builder.location;
            this.parameterName = builder.parameterName;
            this.serviceParameterName = builder.serviceParameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomSystemParameter create() {
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
             * Description
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * Client IP Address
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the corresponding backend parameter.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * System parameters sent by API Gateway to the backend service
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
                return this;
            }

            public CustomSystemParameter build() {
                return new CustomSystemParameter(this);
            } 

        } 

    }
    public static class CustomSystemParameters extends TeaModel {
        @NameInMap("CustomSystemParameter")
        private java.util.List < CustomSystemParameter> customSystemParameter;

        private CustomSystemParameters(Builder builder) {
            this.customSystemParameter = builder.customSystemParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomSystemParameters create() {
            return builder().build();
        }

        /**
         * @return customSystemParameter
         */
        public java.util.List < CustomSystemParameter> getCustomSystemParameter() {
            return this.customSystemParameter;
        }

        public static final class Builder {
            private java.util.List < CustomSystemParameter> customSystemParameter; 

            /**
             * CustomSystemParameter.
             */
            public Builder customSystemParameter(java.util.List < CustomSystemParameter> customSystemParameter) {
                this.customSystemParameter = customSystemParameter;
                return this;
            }

            public CustomSystemParameters build() {
                return new CustomSystemParameters(this);
            } 

        } 

    }
    public static class DeployedInfo extends TeaModel {
        @NameInMap("DeployedStatus")
        private String deployedStatus;

        @NameInMap("EffectiveVersion")
        private String effectiveVersion;

        @NameInMap("StageName")
        private String stageName;

        private DeployedInfo(Builder builder) {
            this.deployedStatus = builder.deployedStatus;
            this.effectiveVersion = builder.effectiveVersion;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedInfo create() {
            return builder().build();
        }

        /**
         * @return deployedStatus
         */
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        /**
         * @return effectiveVersion
         */
        public String getEffectiveVersion() {
            return this.effectiveVersion;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String deployedStatus; 
            private String effectiveVersion; 
            private String stageName; 

            /**
             * auditing
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * The deployment status. Valid values: DEPLOYED and NONDEPLOYED.
             */
            public Builder effectiveVersion(String effectiveVersion) {
                this.effectiveVersion = effectiveVersion;
                return this;
            }

            /**
             * The effective version.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public DeployedInfo build() {
                return new DeployedInfo(this);
            } 

        } 

    }
    public static class DeployedInfos extends TeaModel {
        @NameInMap("DeployedInfo")
        private java.util.List < DeployedInfo> deployedInfo;

        private DeployedInfos(Builder builder) {
            this.deployedInfo = builder.deployedInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedInfos create() {
            return builder().build();
        }

        /**
         * @return deployedInfo
         */
        public java.util.List < DeployedInfo> getDeployedInfo() {
            return this.deployedInfo;
        }

        public static final class Builder {
            private java.util.List < DeployedInfo> deployedInfo; 

            /**
             * DeployedInfo.
             */
            public Builder deployedInfo(java.util.List < DeployedInfo> deployedInfo) {
                this.deployedInfo = deployedInfo;
                return this;
            }

            public DeployedInfos build() {
                return new DeployedInfos(this);
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

        @NameInMap("Model")
        private String model;

        private ErrorCodeSample(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.message = builder.message;
            this.model = builder.model;
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

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String message; 
            private String model; 

            /**
             * Model
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The UserId parameter is missing from the request.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Description
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Error message
             */
            public Builder model(String model) {
                this.model = model;
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
    public static class OpenIdConnectConfig extends TeaModel {
        @NameInMap("IdTokenParamName")
        private String idTokenParamName;

        @NameInMap("OpenIdApiType")
        private String openIdApiType;

        @NameInMap("PublicKey")
        private String publicKey;

        @NameInMap("PublicKeyId")
        private String publicKeyId;

        private OpenIdConnectConfig(Builder builder) {
            this.idTokenParamName = builder.idTokenParamName;
            this.openIdApiType = builder.openIdApiType;
            this.publicKey = builder.publicKey;
            this.publicKeyId = builder.publicKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenIdConnectConfig create() {
            return builder().build();
        }

        /**
         * @return idTokenParamName
         */
        public String getIdTokenParamName() {
            return this.idTokenParamName;
        }

        /**
         * @return openIdApiType
         */
        public String getOpenIdApiType() {
            return this.openIdApiType;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        /**
         * @return publicKeyId
         */
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

        public static final class Builder {
            private String idTokenParamName; 
            private String openIdApiType; 
            private String publicKey; 
            private String publicKeyId; 

            /**
             * The ID of the public key.
             */
            public Builder idTokenParamName(String idTokenParamName) {
                this.idTokenParamName = idTokenParamName;
                return this;
            }

            /**
             * The name of the parameter that corresponds to the token.
             */
            public Builder openIdApiType(String openIdApiType) {
                this.openIdApiType = openIdApiType;
                return this;
            }

            /**
             * The sample error codes returned by the backend service.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * The public key.
             */
            public Builder publicKeyId(String publicKeyId) {
                this.publicKeyId = publicKeyId;
                return this;
            }

            public OpenIdConnectConfig build() {
                return new OpenIdConnectConfig(this);
            } 

        } 

    }
    public static class RequestConfig extends TeaModel {
        @NameInMap("BodyFormat")
        private String bodyFormat;

        @NameInMap("BodyModel")
        private String bodyModel;

        @NameInMap("PostBodyDescription")
        private String postBodyDescription;

        @NameInMap("RequestHttpMethod")
        private String requestHttpMethod;

        @NameInMap("RequestMode")
        private String requestMode;

        @NameInMap("RequestPath")
        private String requestPath;

        @NameInMap("RequestProtocol")
        private String requestProtocol;

        private RequestConfig(Builder builder) {
            this.bodyFormat = builder.bodyFormat;
            this.bodyModel = builder.bodyModel;
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
         * @return bodyModel
         */
        public String getBodyModel() {
            return this.bodyModel;
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
            private String bodyModel; 
            private String postBodyDescription; 
            private String requestHttpMethod; 
            private String requestMode; 
            private String requestPath; 
            private String requestProtocol; 

            /**
             * The request mode. Valid values: MAPPING and PASSTHROUGH.
             */
            public Builder bodyFormat(String bodyFormat) {
                this.bodyFormat = bodyFormat;
                return this;
            }

            /**
             * The API request path. If the complete API URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the API request path is ` /object/add  `.
             */
            public Builder bodyModel(String bodyModel) {
                this.bodyModel = bodyModel;
                return this;
            }

            /**
             * The protocol type supported by the API. Valid values: HTTP and HTTPS. Separate multiple values with commas (,), such as "HTTP,HTTPS".
             */
            public Builder postBodyDescription(String postBodyDescription) {
                this.postBodyDescription = postBodyDescription;
                return this;
            }

            /**
             * This parameter takes effect only when the RequestMode parameter is set to MAPPING.********
             * <p>
             * 
             * The server data transmission method used for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data in key-value pairs is transmitted as forms. STREAM indicates that data is transmitted as byte streams.
             */
            public Builder requestHttpMethod(String requestHttpMethod) {
                this.requestHttpMethod = requestHttpMethod;
                return this;
            }

            /**
             * The description of the request body.
             */
            public Builder requestMode(String requestMode) {
                this.requestMode = requestMode;
                return this;
            }

            /**
             * The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.
             */
            public Builder requestPath(String requestPath) {
                this.requestPath = requestPath;
                return this;
            }

            /**
             * The configuration items of API requests sent by API Gateway to the backend service.
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
        private Integer docOrder;

        @NameInMap("DocShow")
        private String docShow;

        @NameInMap("EnumValue")
        private String enumValue;

        @NameInMap("JsonScheme")
        private String jsonScheme;

        @NameInMap("Location")
        private String location;

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
             * The hash values that can be entered when **ParameterType** is set to Int, Long, Float, Double, or String. Separate different values with commas (,), such as 1,2,3,4,9 or A,B,C,E,F.
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
                return this;
            }

            /**
             * The minimum parameter value when **ParameterType** is set to Int, Long, Float, or Double.
             */
            public Builder arrayItemsType(String arrayItemsType) {
                this.arrayItemsType = arrayItemsType;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Indicates whether the parameter is required. Valid values: **REQUIRED** and **OPTIONAL**.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * Age
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder docOrder(Integer docOrder) {
                this.docOrder = docOrder;
                return this;
            }

            /**
             * The maximum parameter length when **ParameterType** is set to String.
             */
            public Builder docShow(String docShow) {
                this.docShow = docShow;
                return this;
            }

            /**
             * Examples
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * The maximum parameter value when **ParameterType** is set to Int, Long, Float, or Double.
             */
            public Builder jsonScheme(String jsonScheme) {
                this.jsonScheme = jsonScheme;
                return this;
            }

            /**
             * The parameters of API requests sent by API Gateway to the backend service.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The default value.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * The type of the array element.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * The order in the document.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * Indicates whether the document is public. Valid values: **PUBLIC** and **PRIVATE**.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * The regular expression used for parameter validation when **ParameterType** is set to String.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * The minimum parameter length when **ParameterType** is set to String.
             */
            public Builder regularExpression(String regularExpression) {
                this.regularExpression = regularExpression;
                return this;
            }

            /**
             * Description
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
        @NameInMap("RequestParameter")
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
    public static class EventBridgeConfig extends TeaModel {
        @NameInMap("EventBridgeRegionId")
        private String eventBridgeRegionId;

        @NameInMap("EventBus")
        private String eventBus;

        @NameInMap("EventSource")
        private String eventSource;

        @NameInMap("RoleArn")
        private String roleArn;

        private EventBridgeConfig(Builder builder) {
            this.eventBridgeRegionId = builder.eventBridgeRegionId;
            this.eventBus = builder.eventBus;
            this.eventSource = builder.eventSource;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBridgeConfig create() {
            return builder().build();
        }

        /**
         * @return eventBridgeRegionId
         */
        public String getEventBridgeRegionId() {
            return this.eventBridgeRegionId;
        }

        /**
         * @return eventBus
         */
        public String getEventBus() {
            return this.eventBus;
        }

        /**
         * @return eventSource
         */
        public String getEventSource() {
            return this.eventSource;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String eventBridgeRegionId; 
            private String eventBus; 
            private String eventSource; 
            private String roleArn; 

            /**
             * The Arn that is authorized by a RAM user to EventBridge.
             */
            public Builder eventBridgeRegionId(String eventBridgeRegionId) {
                this.eventBridgeRegionId = eventBridgeRegionId;
                return this;
            }

            /**
             * The event source.
             */
            public Builder eventBus(String eventBus) {
                this.eventBus = eventBus;
                return this;
            }

            /**
             * The ID of the region where the EventBridge instance is located.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * Configuration items of the third-party OpenID Connect authentication method
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public EventBridgeConfig build() {
                return new EventBridgeConfig(this);
            } 

        } 

    }
    public static class FunctionComputeConfig extends TeaModel {
        @NameInMap("ContentTypeCatagory")
        private String contentTypeCatagory;

        @NameInMap("ContentTypeValue")
        private String contentTypeValue;

        @NameInMap("FcBaseUrl")
        private String fcBaseUrl;

        @NameInMap("FcType")
        private String fcType;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Method")
        private String method;

        @NameInMap("OnlyBusinessPath")
        private Boolean onlyBusinessPath;

        @NameInMap("Path")
        private String path;

        @NameInMap("Qualifier")
        private String qualifier;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("ServiceName")
        private String serviceName;

        private FunctionComputeConfig(Builder builder) {
            this.contentTypeCatagory = builder.contentTypeCatagory;
            this.contentTypeValue = builder.contentTypeValue;
            this.fcBaseUrl = builder.fcBaseUrl;
            this.fcType = builder.fcType;
            this.functionName = builder.functionName;
            this.method = builder.method;
            this.onlyBusinessPath = builder.onlyBusinessPath;
            this.path = builder.path;
            this.qualifier = builder.qualifier;
            this.regionId = builder.regionId;
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
         * @return contentTypeCatagory
         */
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        /**
         * @return contentTypeValue
         */
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        /**
         * @return fcBaseUrl
         */
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        /**
         * @return fcType
         */
        public String getFcType() {
            return this.fcType;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return onlyBusinessPath
         */
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String contentTypeCatagory; 
            private String contentTypeValue; 
            private String fcBaseUrl; 
            private String fcType; 
            private String functionName; 
            private String method; 
            private Boolean onlyBusinessPath; 
            private String path; 
            private String qualifier; 
            private String regionId; 
            private String roleArn; 
            private String serviceName; 

            /**
             * The API request path.
             */
            public Builder contentTypeCatagory(String contentTypeCatagory) {
                this.contentTypeCatagory = contentTypeCatagory;
                return this;
            }

            /**
             * The region where the Function Compute instance is located.
             */
            public Builder contentTypeValue(String contentTypeValue) {
                this.contentTypeValue = contentTypeValue;
                return this;
            }

            /**
             * The value of the ContentType header when the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.
             */
            public Builder fcBaseUrl(String fcBaseUrl) {
                this.fcBaseUrl = fcBaseUrl;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the RAM role to be assumed by API Gateway to access Function Compute.
             */
            public Builder fcType(String fcType) {
                this.fcType = fcType;
                return this;
            }

            /**
             * The ContentType header type used when you call the backend service over HTTP.
             * <p>
             * 
             * *   **DEFAULT**: the default header type in API Gateway
             * *   **CUSTOM**: a custom header type
             * *   **CLIENT**: the ContentType header type of the client
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The root path of Function Compute.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The function name defined in Function Compute.
             */
            public Builder onlyBusinessPath(Boolean onlyBusinessPath) {
                this.onlyBusinessPath = onlyBusinessPath;
                return this;
            }

            /**
             * The service name defined in Function Compute.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Information when the backend service is OSS
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * The backend only receives the service path.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The request method.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * The alias of the function.
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
    public static class MockHeader extends TeaModel {
        @NameInMap("HeaderName")
        private String headerName;

        @NameInMap("HeaderValue")
        private String headerValue;

        private MockHeader(Builder builder) {
            this.headerName = builder.headerName;
            this.headerValue = builder.headerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MockHeader create() {
            return builder().build();
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return headerValue
         */
        public String getHeaderValue() {
            return this.headerValue;
        }

        public static final class Builder {
            private String headerName; 
            private String headerValue; 

            /**
             * Configuration items related to VPC channels
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * The name of the HTTP header.
             */
            public Builder headerValue(String headerValue) {
                this.headerValue = headerValue;
                return this;
            }

            public MockHeader build() {
                return new MockHeader(this);
            } 

        } 

    }
    public static class MockHeaders extends TeaModel {
        @NameInMap("MockHeader")
        private java.util.List < MockHeader> mockHeader;

        private MockHeaders(Builder builder) {
            this.mockHeader = builder.mockHeader;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MockHeaders create() {
            return builder().build();
        }

        /**
         * @return mockHeader
         */
        public java.util.List < MockHeader> getMockHeader() {
            return this.mockHeader;
        }

        public static final class Builder {
            private java.util.List < MockHeader> mockHeader; 

            /**
             * MockHeader.
             */
            public Builder mockHeader(java.util.List < MockHeader> mockHeader) {
                this.mockHeader = mockHeader;
                return this;
            }

            public MockHeaders build() {
                return new MockHeaders(this);
            } 

        } 

    }
    public static class OssConfig extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("Key")
        private String key;

        @NameInMap("OssRegionId")
        private String ossRegionId;

        private OssConfig(Builder builder) {
            this.action = builder.action;
            this.bucketName = builder.bucketName;
            this.key = builder.key;
            this.ossRegionId = builder.ossRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssConfig create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return ossRegionId
         */
        public String getOssRegionId() {
            return this.ossRegionId;
        }

        public static final class Builder {
            private String action; 
            private String bucketName; 
            private String key; 
            private String ossRegionId; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Configuration items of EventBridge
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
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
             * The OSS bucket.
             */
            public Builder ossRegionId(String ossRegionId) {
                this.ossRegionId = ossRegionId;
                return this;
            }

            public OssConfig build() {
                return new OssConfig(this);
            } 

        } 

    }
    public static class VpcConfig extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcScheme")
        private String vpcScheme;

        private VpcConfig(Builder builder) {
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.port = builder.port;
            this.vpcId = builder.vpcId;
            this.vpcScheme = builder.vpcScheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfig create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcScheme
         */
        public String getVpcScheme() {
            return this.vpcScheme;
        }

        public static final class Builder {
            private String instanceId; 
            private String name; 
            private Integer port; 
            private String vpcId; 
            private String vpcScheme; 

            /**
             * The port number that corresponds to the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Backend configuration items when the backend service is Function Compute
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the VPC access authorization.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The VPC protocol.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the ECS or SLB instance in the VPC.
             */
            public Builder vpcScheme(String vpcScheme) {
                this.vpcScheme = vpcScheme;
                return this;
            }

            public VpcConfig build() {
                return new VpcConfig(this);
            } 

        } 

    }
    public static class ServiceConfig extends TeaModel {
        @NameInMap("AoneAppName")
        private String aoneAppName;

        @NameInMap("ContentTypeCatagory")
        private String contentTypeCatagory;

        @NameInMap("ContentTypeValue")
        private String contentTypeValue;

        @NameInMap("EventBridgeConfig")
        private EventBridgeConfig eventBridgeConfig;

        @NameInMap("FunctionComputeConfig")
        private FunctionComputeConfig functionComputeConfig;

        @NameInMap("Mock")
        private String mock;

        @NameInMap("MockHeaders")
        private MockHeaders mockHeaders;

        @NameInMap("MockResult")
        private String mockResult;

        @NameInMap("MockStatusCode")
        private Integer mockStatusCode;

        @NameInMap("OssConfig")
        private OssConfig ossConfig;

        @NameInMap("ServiceAddress")
        private String serviceAddress;

        @NameInMap("ServiceHttpMethod")
        private String serviceHttpMethod;

        @NameInMap("ServicePath")
        private String servicePath;

        @NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @NameInMap("ServiceTimeout")
        private Integer serviceTimeout;

        @NameInMap("ServiceVpcEnable")
        private String serviceVpcEnable;

        @NameInMap("VpcConfig")
        private VpcConfig vpcConfig;

        private ServiceConfig(Builder builder) {
            this.aoneAppName = builder.aoneAppName;
            this.contentTypeCatagory = builder.contentTypeCatagory;
            this.contentTypeValue = builder.contentTypeValue;
            this.eventBridgeConfig = builder.eventBridgeConfig;
            this.functionComputeConfig = builder.functionComputeConfig;
            this.mock = builder.mock;
            this.mockHeaders = builder.mockHeaders;
            this.mockResult = builder.mockResult;
            this.mockStatusCode = builder.mockStatusCode;
            this.ossConfig = builder.ossConfig;
            this.serviceAddress = builder.serviceAddress;
            this.serviceHttpMethod = builder.serviceHttpMethod;
            this.servicePath = builder.servicePath;
            this.serviceProtocol = builder.serviceProtocol;
            this.serviceTimeout = builder.serviceTimeout;
            this.serviceVpcEnable = builder.serviceVpcEnable;
            this.vpcConfig = builder.vpcConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfig create() {
            return builder().build();
        }

        /**
         * @return aoneAppName
         */
        public String getAoneAppName() {
            return this.aoneAppName;
        }

        /**
         * @return contentTypeCatagory
         */
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        /**
         * @return contentTypeValue
         */
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        /**
         * @return eventBridgeConfig
         */
        public EventBridgeConfig getEventBridgeConfig() {
            return this.eventBridgeConfig;
        }

        /**
         * @return functionComputeConfig
         */
        public FunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        /**
         * @return mock
         */
        public String getMock() {
            return this.mock;
        }

        /**
         * @return mockHeaders
         */
        public MockHeaders getMockHeaders() {
            return this.mockHeaders;
        }

        /**
         * @return mockResult
         */
        public String getMockResult() {
            return this.mockResult;
        }

        /**
         * @return mockStatusCode
         */
        public Integer getMockStatusCode() {
            return this.mockStatusCode;
        }

        /**
         * @return ossConfig
         */
        public OssConfig getOssConfig() {
            return this.ossConfig;
        }

        /**
         * @return serviceAddress
         */
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        /**
         * @return serviceHttpMethod
         */
        public String getServiceHttpMethod() {
            return this.serviceHttpMethod;
        }

        /**
         * @return servicePath
         */
        public String getServicePath() {
            return this.servicePath;
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
         * @return vpcConfig
         */
        public VpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public static final class Builder {
            private String aoneAppName; 
            private String contentTypeCatagory; 
            private String contentTypeValue; 
            private EventBridgeConfig eventBridgeConfig; 
            private FunctionComputeConfig functionComputeConfig; 
            private String mock; 
            private MockHeaders mockHeaders; 
            private String mockResult; 
            private Integer mockStatusCode; 
            private OssConfig ossConfig; 
            private String serviceAddress; 
            private String serviceHttpMethod; 
            private String servicePath; 
            private String serviceProtocol; 
            private Integer serviceTimeout; 
            private String serviceVpcEnable; 
            private VpcConfig vpcConfig; 

            /**
             * The status code returned for service mocking.
             */
            public Builder aoneAppName(String aoneAppName) {
                this.aoneAppName = aoneAppName;
                return this;
            }

            /**
             * The URL used to call the back-end service. If the complete back-end service URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the value of **ServiceAddress** is `http://api.a.com:8080`.
             */
            public Builder contentTypeCatagory(String contentTypeCatagory) {
                this.contentTypeCatagory = contentTypeCatagory;
                return this;
            }

            /**
             * The protocol used by the backend service. Valid values: HTTP and HTTPS.
             */
            public Builder contentTypeValue(String contentTypeValue) {
                this.contentTypeValue = contentTypeValue;
                return this;
            }

            /**
             * The event bus.
             */
            public Builder eventBridgeConfig(EventBridgeConfig eventBridgeConfig) {
                this.eventBridgeConfig = eventBridgeConfig;
                return this;
            }

            /**
             * The type of the Function Compute instance.
             */
            public Builder functionComputeConfig(FunctionComputeConfig functionComputeConfig) {
                this.functionComputeConfig = functionComputeConfig;
                return this;
            }

            /**
             * Specifies whether to enable the VPC channel. Valid values:
             * <p>
             * 
             * *   **TRUE**: The VPC channel is enabled. You must create the corresponding VPC access authorization before you can enable a VPC channel.
             * *   **FALSE**: The VPC channel is not enabled.
             */
            public Builder mock(String mock) {
                this.mock = mock;
                return this;
            }

            /**
             * The value of the HTTP header.
             */
            public Builder mockHeaders(MockHeaders mockHeaders) {
                this.mockHeaders = mockHeaders;
                return this;
            }

            /**
             * The HTTP method used to call a backend service. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.
             */
            public Builder mockResult(String mockResult) {
                this.mockResult = mockResult;
                return this;
            }

            /**
             * The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.
             */
            public Builder mockStatusCode(Integer mockStatusCode) {
                this.mockStatusCode = mockStatusCode;
                return this;
            }

            /**
             * The ID of the region where the OSS instance is located.
             */
            public Builder ossConfig(OssConfig ossConfig) {
                this.ossConfig = ossConfig;
                return this;
            }

            /**
             * Specifies whether to enable the Mock mode. Valid values:
             * <p>
             * 
             * *   **TRUE**: The Mock mode is enabled.
             * *   **FALSE**: The Mock mode is not enabled.
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            /**
             * The timeout period of the backend service. Unit: milliseconds.
             */
            public Builder serviceHttpMethod(String serviceHttpMethod) {
                this.serviceHttpMethod = serviceHttpMethod;
                return this;
            }

            /**
             * The ContentType header type used when you call the backend service over HTTP.
             * <p>
             * 
             * *   **DEFAULT**: the default header type in API Gateway
             * *   **CUSTOM**: a custom header type
             * *   **CLIENT**: the ContentType header type of the client
             */
            public Builder servicePath(String servicePath) {
                this.servicePath = servicePath;
                return this;
            }

            /**
             * The path used to call the back-end service. If the complete back-end service path is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, **ServicePath** is `/object/add`.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * The simulated headers.
             */
            public Builder serviceTimeout(Integer serviceTimeout) {
                this.serviceTimeout = serviceTimeout;
                return this;
            }

            /**
             * The result returned when the Mock mode is enabled.
             */
            public Builder serviceVpcEnable(String serviceVpcEnable) {
                this.serviceVpcEnable = serviceVpcEnable;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcConfig(VpcConfig vpcConfig) {
                this.vpcConfig = vpcConfig;
                return this;
            }

            public ServiceConfig build() {
                return new ServiceConfig(this);
            } 

        } 

    }
    public static class ServiceParameter extends TeaModel {
        @NameInMap("Location")
        private String location;

        @NameInMap("ParameterType")
        private String parameterType;

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private ServiceParameter(Builder builder) {
            this.location = builder.location;
            this.parameterType = builder.parameterType;
            this.serviceParameterName = builder.serviceParameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceParameter create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return parameterType
         */
        public String getParameterType() {
            return this.parameterType;
        }

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String location; 
            private String parameterType; 
            private String serviceParameterName; 

            /**
             * The data type of the back-end service parameter.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the backend service parameter.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
                return this;
            }

            public ServiceParameter build() {
                return new ServiceParameter(this);
            } 

        } 

    }
    public static class ServiceParameters extends TeaModel {
        @NameInMap("ServiceParameter")
        private java.util.List < ServiceParameter> serviceParameter;

        private ServiceParameters(Builder builder) {
            this.serviceParameter = builder.serviceParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceParameters create() {
            return builder().build();
        }

        /**
         * @return serviceParameter
         */
        public java.util.List < ServiceParameter> getServiceParameter() {
            return this.serviceParameter;
        }

        public static final class Builder {
            private java.util.List < ServiceParameter> serviceParameter; 

            /**
             * ServiceParameter.
             */
            public Builder serviceParameter(java.util.List < ServiceParameter> serviceParameter) {
                this.serviceParameter = serviceParameter;
                return this;
            }

            public ServiceParameters build() {
                return new ServiceParameters(this);
            } 

        } 

    }
    public static class ServiceParameterMap extends TeaModel {
        @NameInMap("RequestParameterName")
        private String requestParameterName;

        @NameInMap("ServiceParameterName")
        private String serviceParameterName;

        private ServiceParameterMap(Builder builder) {
            this.requestParameterName = builder.requestParameterName;
            this.serviceParameterName = builder.serviceParameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceParameterMap create() {
            return builder().build();
        }

        /**
         * @return requestParameterName
         */
        public String getRequestParameterName() {
            return this.requestParameterName;
        }

        /**
         * @return serviceParameterName
         */
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public static final class Builder {
            private String requestParameterName; 
            private String serviceParameterName; 

            /**
             * The name of the backend service parameter.
             */
            public Builder requestParameterName(String requestParameterName) {
                this.requestParameterName = requestParameterName;
                return this;
            }

            /**
             * The API publishing status.
             */
            public Builder serviceParameterName(String serviceParameterName) {
                this.serviceParameterName = serviceParameterName;
                return this;
            }

            public ServiceParameterMap build() {
                return new ServiceParameterMap(this);
            } 

        } 

    }
    public static class ServiceParametersMap extends TeaModel {
        @NameInMap("ServiceParameterMap")
        private java.util.List < ServiceParameterMap> serviceParameterMap;

        private ServiceParametersMap(Builder builder) {
            this.serviceParameterMap = builder.serviceParameterMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceParametersMap create() {
            return builder().build();
        }

        /**
         * @return serviceParameterMap
         */
        public java.util.List < ServiceParameterMap> getServiceParameterMap() {
            return this.serviceParameterMap;
        }

        public static final class Builder {
            private java.util.List < ServiceParameterMap> serviceParameterMap; 

            /**
             * ServiceParameterMap.
             */
            public Builder serviceParameterMap(java.util.List < ServiceParameterMap> serviceParameterMap) {
                this.serviceParameterMap = serviceParameterMap;
                return this;
            }

            public ServiceParametersMap build() {
                return new ServiceParametersMap(this);
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
             * Description
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * Client IP Address
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the corresponding backend parameter.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * Custom system parameters
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
