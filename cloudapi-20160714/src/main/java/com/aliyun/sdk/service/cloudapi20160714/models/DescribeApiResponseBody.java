// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiResponseBody</p>
 */
public class DescribeApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowSignatureMethod")
    private String allowSignatureMethod;

    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.NameInMap("AppCodeAuthType")
    private String appCodeAuthType;

    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("BackendConfig")
    private BackendConfig backendConfig;

    @com.aliyun.core.annotation.NameInMap("BackendEnable")
    private Boolean backendEnable;

    @com.aliyun.core.annotation.NameInMap("ConstantParameters")
    private ConstantParameters constantParameters;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("CustomSystemParameters")
    private CustomSystemParameters customSystemParameters;

    @com.aliyun.core.annotation.NameInMap("DeployedInfos")
    private DeployedInfos deployedInfos;

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

    @com.aliyun.core.annotation.NameInMap("Mock")
    private String mock;

    @com.aliyun.core.annotation.NameInMap("MockResult")
    private String mockResult;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("OpenIdConnectConfig")
    private OpenIdConnectConfig openIdConnectConfig;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestConfig")
    private RequestConfig requestConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestParameters")
    private RequestParameters requestParameters;

    @com.aliyun.core.annotation.NameInMap("ResultBodyModel")
    private String resultBodyModel;

    @com.aliyun.core.annotation.NameInMap("ResultSample")
    private String resultSample;

    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.NameInMap("ServiceConfig")
    private ServiceConfig serviceConfig;

    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private ServiceParameters serviceParameters;

    @com.aliyun.core.annotation.NameInMap("ServiceParametersMap")
    private ServiceParametersMap serviceParametersMap;

    @com.aliyun.core.annotation.NameInMap("SystemParameters")
    private SystemParameters systemParameters;

    @com.aliyun.core.annotation.NameInMap("TagList")
    private TagList tagList;

    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    @com.aliyun.core.annotation.NameInMap("WebSocketApiType")
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
        this.tagList = builder.tagList;
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
     * @return tagList
     */
    public TagList getTagList() {
        return this.tagList;
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
        private TagList tagList; 
        private String visibility; 
        private String webSocketApiType; 

        /**
         * If **AuthType** is set to **APP**, this value must be passed to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:
         * <p>
         * 
         * *   HmacSHA256
         * *   HmacSHA1,HmacSHA256
         */
        public Builder allowSignatureMethod(String allowSignatureMethod) {
            this.allowSignatureMethod = allowSignatureMethod;
            return this;
        }

        /**
         * The ID of the API.
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * The name of the API, which is unique in the group.
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
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
        public Builder appCodeAuthType(String appCodeAuthType) {
            this.appCodeAuthType = appCodeAuthType;
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
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * Backend configurations
         */
        public Builder backendConfig(BackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * Specifies whether to enable backend services.
         */
        public Builder backendEnable(Boolean backendEnable) {
            this.backendEnable = backendEnable;
            return this;
        }

        /**
         * System parameters sent by API Gateway to the backend service
         */
        public Builder constantParameters(ConstantParameters constantParameters) {
            this.constantParameters = constantParameters;
            return this;
        }

        /**
         * The creation time of the API.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Custom system parameters
         */
        public Builder customSystemParameters(CustomSystemParameters customSystemParameters) {
            this.customSystemParameters = customSystemParameters;
            return this;
        }

        /**
         * The API publishing status.
         */
        public Builder deployedInfos(DeployedInfos deployedInfos) {
            this.deployedInfos = deployedInfos;
            return this;
        }

        /**
         * The description of the API.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to limit API calls to within the VPC. Valid values:
         * <p>
         * 
         * *   **true**: Only API calls from the VPC are supported.
         * *   **false**: API calls from the VPC and Internet are both supported.
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
         * Specifies whether to carry the header : X-Ca-Nonce when calling an API. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent reply attacks. Valid values:
         * <p>
         * 
         * *   **true**: This field is forcibly checked when an API is requested to prevent replay attacks.
         * *   **false**: This field is not checked.
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
         * Specifies whether to enable the Mock mode. Valid values:
         * <p>
         * 
         * *   OPEN: The Mock mode is enabled.
         * *   CLOSED: The Mock mode is not enabled.
         */
        public Builder mock(String mock) {
            this.mock = mock;
            return this;
        }

        /**
         * The result returned for service mocking.
         */
        public Builder mockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }

        /**
         * The last modification time of the API.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * Configuration items of the third-party OpenID Connect authentication method
         */
        public Builder openIdConnectConfig(OpenIdConnectConfig openIdConnectConfig) {
            this.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * The region ID of the API.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The configuration items of API requests sent by the consumer to API Gateway.
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
         * The parameters of API requests sent by the consumer to API Gateway.
         */
        public Builder requestParameters(RequestParameters requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * The returned description of the API.
         */
        public Builder resultBodyModel(String resultBodyModel) {
            this.resultBodyModel = resultBodyModel;
            return this;
        }

        /**
         * The sample response from the backend service.
         */
        public Builder resultSample(String resultSample) {
            this.resultSample = resultSample;
            return this;
        }

        /**
         * The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML.
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * The configuration items of API requests that API Gateway sends to the backend service.
         */
        public Builder serviceConfig(ServiceConfig serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * The parameters of API requests sent by API Gateway to the backend service.
         */
        public Builder serviceParameters(ServiceParameters serviceParameters) {
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.
         */
        public Builder serviceParametersMap(ServiceParametersMap serviceParametersMap) {
            this.serviceParametersMap = serviceParametersMap;
            return this;
        }

        /**
         * System parameters sent by API Gateway to the backend service
         */
        public Builder systemParameters(SystemParameters systemParameters) {
            this.systemParameters = systemParameters;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(TagList tagList) {
            this.tagList = tagList;
            return this;
        }

        /**
         * Specifies whether to make the API public. Valid values:
         * <p>
         * 
         * *   **PUBLIC**: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.
         * *   **PRIVATE**: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * The type of the two-way communication API.
         * <p>
         * 
         * *   **COMMON**: common API
         * *   **REGISTER**: registered API
         * *   **UNREGISTER**: unregistered API
         * *   **NOTIFY**: downstream notification API
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
        @com.aliyun.core.annotation.NameInMap("BackendId")
        private String backendId;

        @com.aliyun.core.annotation.NameInMap("BackendName")
        private String backendName;

        @com.aliyun.core.annotation.NameInMap("BackendType")
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
             * The ID of the backend service.
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * The name of the backend service.
             */
            public Builder backendName(String backendName) {
                this.backendName = backendName;
                return this;
            }

            /**
             * Backend service type
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
        @com.aliyun.core.annotation.NameInMap("ConstantValue")
        private String constantValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("ServiceParameterName")
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
             * The constant parameter value.
             */
            public Builder constantValue(String constantValue) {
                this.constantValue = constantValue;
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
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The mapped parameter name in the backend service.
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
        @com.aliyun.core.annotation.NameInMap("ConstantParameter")
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
        @com.aliyun.core.annotation.NameInMap("DemoValue")
        private String demoValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ServiceParameterName")
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
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the system parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The mapped parameter name in the backend service.
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
        @com.aliyun.core.annotation.NameInMap("CustomSystemParameter")
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
        @com.aliyun.core.annotation.NameInMap("DeployedStatus")
        private String deployedStatus;

        @com.aliyun.core.annotation.NameInMap("EffectiveVersion")
        private String effectiveVersion;

        @com.aliyun.core.annotation.NameInMap("StageName")
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
             * The deployment status. Valid values: DEPLOYED and NONDEPLOYED.
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * The effective version.
             */
            public Builder effectiveVersion(String effectiveVersion) {
                this.effectiveVersion = effectiveVersion;
                return this;
            }

            /**
             * The environment to which the API is published. Valid values: RELEASE and TEST.
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
        @com.aliyun.core.annotation.NameInMap("DeployedInfo")
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
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Model")
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

            /**
             * The model.
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
    public static class OpenIdConnectConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdTokenParamName")
        private String idTokenParamName;

        @com.aliyun.core.annotation.NameInMap("OpenIdApiType")
        private String openIdApiType;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        @com.aliyun.core.annotation.NameInMap("PublicKeyId")
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
             * The name of the parameter that corresponds to the token.
             */
            public Builder idTokenParamName(String idTokenParamName) {
                this.idTokenParamName = idTokenParamName;
                return this;
            }

            /**
             * The OpenID Connect mode. Valid values:
             * <p>
             * 
             * *   **IDTOKEN**: indicates the APIs that are called by clients to obtain tokens. If you specify this value, the PublicKeyId parameter and the PublicKey parameter are required.
             * *   **BUSINESS**: indicates business APIs. Tokens are used to call the business APIs. If you specify this value, the IdTokenParamName parameter is required.
             */
            public Builder openIdApiType(String openIdApiType) {
                this.openIdApiType = openIdApiType;
                return this;
            }

            /**
             * The public key.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * The ID of the public key.
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
        @com.aliyun.core.annotation.NameInMap("BodyFormat")
        private String bodyFormat;

        @com.aliyun.core.annotation.NameInMap("BodyModel")
        private String bodyModel;

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
             * The body model.
             */
            public Builder bodyModel(String bodyModel) {
                this.bodyModel = bodyModel;
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
             * The request mode. Valid values: MAPPING and PASSTHROUGH.
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
             * The parameter name.
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
             * The hash values that can be specified if the **ParameterType** parameter is set to Int, Long, Float, Double, or String. Separate multiple hash values with commas (,). Examples: 1,2,3,4,9 and A,B,C,E,F.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * The JSON Schema used for JSON validation when **ParameterType** is set to String.
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
             * The maximum length of the parameter value if the **ParameterType** parameter is set to String.
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * The maximum value of the parameter if the **ParameterType** parameter is set to Int, Long, Float, or Double.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * The minimum length of the parameter value if the **ParameterType** parameter is set to String.
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * The minimum value of the parameter if the **ParameterType** parameter is set to Int, Long, Float, or Double.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * The data type of the parameter. Valid values: String, Int, Long, Float, Double, and Boolean.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * The regular expression that is used to validate the parameter if the **ParameterType** parameter is set to String.
             */
            public Builder regularExpression(String regularExpression) {
                this.regularExpression = regularExpression;
                return this;
            }

            /**
             * Indicates whether the parameter is required. Valid values: **REQUIRED** and **OPTIONAL**.
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
    public static class EventBridgeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventBridgeRegionId")
        private String eventBridgeRegionId;

        @com.aliyun.core.annotation.NameInMap("EventBus")
        private String eventBus;

        @com.aliyun.core.annotation.NameInMap("EventSource")
        private String eventSource;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
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
             * The ID of the region where the EventBridge instance is located.
             */
            public Builder eventBridgeRegionId(String eventBridgeRegionId) {
                this.eventBridgeRegionId = eventBridgeRegionId;
                return this;
            }

            /**
             * The event bus.
             */
            public Builder eventBus(String eventBus) {
                this.eventBus = eventBus;
                return this;
            }

            /**
             * The event source.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The Arn that is authorized by a RAM user to EventBridge.
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
        @com.aliyun.core.annotation.NameInMap("ContentTypeCatagory")
        private String contentTypeCatagory;

        @com.aliyun.core.annotation.NameInMap("ContentTypeValue")
        private String contentTypeValue;

        @com.aliyun.core.annotation.NameInMap("FcBaseUrl")
        private String fcBaseUrl;

        @com.aliyun.core.annotation.NameInMap("FcType")
        private String fcType;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("OnlyBusinessPath")
        private Boolean onlyBusinessPath;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Qualifier")
        private String qualifier;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
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
             * The ContentType header type used when you call the backend service over HTTP.
             * <p>
             * 
             * *   **DEFAULT**: the default header type in API Gateway
             * *   **CUSTOM**: a custom header type
             * *   **CLIENT**: the ContentType header type of the client
             */
            public Builder contentTypeCatagory(String contentTypeCatagory) {
                this.contentTypeCatagory = contentTypeCatagory;
                return this;
            }

            /**
             * The value of the ContentType header when the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.
             */
            public Builder contentTypeValue(String contentTypeValue) {
                this.contentTypeValue = contentTypeValue;
                return this;
            }

            /**
             * The root path of Function Compute.
             */
            public Builder fcBaseUrl(String fcBaseUrl) {
                this.fcBaseUrl = fcBaseUrl;
                return this;
            }

            /**
             * The type of the Function Compute instance.
             */
            public Builder fcType(String fcType) {
                this.fcType = fcType;
                return this;
            }

            /**
             * The function name defined in Function Compute.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The request method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The backend only receives the service path.
             */
            public Builder onlyBusinessPath(Boolean onlyBusinessPath) {
                this.onlyBusinessPath = onlyBusinessPath;
                return this;
            }

            /**
             * The API request path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The alias of the function.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * The region where the Function Compute instance is located.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the RAM role to be assumed by API Gateway to access Function Compute.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * The service name defined in Function Compute.
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
        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("HeaderValue")
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
             * The name of the HTTP header.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * The value of the HTTP header.
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
        @com.aliyun.core.annotation.NameInMap("MockHeader")
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
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OssRegionId")
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
             * The operation options on OSS. Valid values:
             * <p>
             * 
             * *   GetObject
             * *   PostObject
             * *   DeleteObject
             * *   PutObject
             * *   HeadObject
             * *   GetObjectMeta
             * *   AppendObject
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The OSS bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The stored object or folder path.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The ID of the region where the OSS instance is located.
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
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcScheme")
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
             * The ID of the ECS or SLB instance in the VPC.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the VPC access authorization.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port number that corresponds to the instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The VPC protocol.
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
        @com.aliyun.core.annotation.NameInMap("AoneAppName")
        private String aoneAppName;

        @com.aliyun.core.annotation.NameInMap("ContentTypeCatagory")
        private String contentTypeCatagory;

        @com.aliyun.core.annotation.NameInMap("ContentTypeValue")
        private String contentTypeValue;

        @com.aliyun.core.annotation.NameInMap("EventBridgeConfig")
        private EventBridgeConfig eventBridgeConfig;

        @com.aliyun.core.annotation.NameInMap("FunctionComputeConfig")
        private FunctionComputeConfig functionComputeConfig;

        @com.aliyun.core.annotation.NameInMap("Mock")
        private String mock;

        @com.aliyun.core.annotation.NameInMap("MockHeaders")
        private MockHeaders mockHeaders;

        @com.aliyun.core.annotation.NameInMap("MockResult")
        private String mockResult;

        @com.aliyun.core.annotation.NameInMap("MockStatusCode")
        private Integer mockStatusCode;

        @com.aliyun.core.annotation.NameInMap("OssConfig")
        private OssConfig ossConfig;

        @com.aliyun.core.annotation.NameInMap("ServiceAddress")
        private String serviceAddress;

        @com.aliyun.core.annotation.NameInMap("ServiceHttpMethod")
        private String serviceHttpMethod;

        @com.aliyun.core.annotation.NameInMap("ServicePath")
        private String servicePath;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("ServiceTimeout")
        private Integer serviceTimeout;

        @com.aliyun.core.annotation.NameInMap("ServiceVpcEnable")
        private String serviceVpcEnable;

        @com.aliyun.core.annotation.NameInMap("VpcConfig")
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
             * The application name in AONE.
             */
            public Builder aoneAppName(String aoneAppName) {
                this.aoneAppName = aoneAppName;
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
            public Builder contentTypeCatagory(String contentTypeCatagory) {
                this.contentTypeCatagory = contentTypeCatagory;
                return this;
            }

            /**
             * The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.
             */
            public Builder contentTypeValue(String contentTypeValue) {
                this.contentTypeValue = contentTypeValue;
                return this;
            }

            /**
             * Configuration items of EventBridge
             */
            public Builder eventBridgeConfig(EventBridgeConfig eventBridgeConfig) {
                this.eventBridgeConfig = eventBridgeConfig;
                return this;
            }

            /**
             * Backend configuration items when the backend service is Function Compute
             */
            public Builder functionComputeConfig(FunctionComputeConfig functionComputeConfig) {
                this.functionComputeConfig = functionComputeConfig;
                return this;
            }

            /**
             * Specifies whether to enable the Mock mode. Valid values:
             * <p>
             * 
             * *   **TRUE**: The Mock mode is enabled.
             * *   **FALSE**: The Mock mode is not enabled.
             */
            public Builder mock(String mock) {
                this.mock = mock;
                return this;
            }

            /**
             * The simulated headers.
             */
            public Builder mockHeaders(MockHeaders mockHeaders) {
                this.mockHeaders = mockHeaders;
                return this;
            }

            /**
             * The result returned when the Mock mode is enabled.
             */
            public Builder mockResult(String mockResult) {
                this.mockResult = mockResult;
                return this;
            }

            /**
             * The status code returned for service mocking.
             */
            public Builder mockStatusCode(Integer mockStatusCode) {
                this.mockStatusCode = mockStatusCode;
                return this;
            }

            /**
             * The information returned when the backend service is Object Storage Service (OSS).
             */
            public Builder ossConfig(OssConfig ossConfig) {
                this.ossConfig = ossConfig;
                return this;
            }

            /**
             * The URL used to call the back-end service. If the complete back-end service URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the value of ServiceAddress is **http://api.a.com:8080**.``
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            /**
             * The HTTP method used to call a backend service. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.
             */
            public Builder serviceHttpMethod(String serviceHttpMethod) {
                this.serviceHttpMethod = serviceHttpMethod;
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
             * The protocol used by the backend service. Valid values: HTTP and HTTPS.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * The timeout period of the backend service. Unit: milliseconds.
             */
            public Builder serviceTimeout(Integer serviceTimeout) {
                this.serviceTimeout = serviceTimeout;
                return this;
            }

            /**
             * Specifies whether to enable the VPC channel. Valid values:
             * <p>
             * 
             * *   **TRUE**: The VPC channel is enabled. You must create the corresponding VPC access authorization before you can enable a VPC channel.
             * *   **FALSE**: The VPC channel is not enabled.
             */
            public Builder serviceVpcEnable(String serviceVpcEnable) {
                this.serviceVpcEnable = serviceVpcEnable;
                return this;
            }

            /**
             * Configuration items related to VPC channels
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
        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("ParameterType")
        private String parameterType;

        @com.aliyun.core.annotation.NameInMap("ServiceParameterName")
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
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The data type of the parameter. Valid values: STRING, NUMBER, and BOOLEAN.
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * The mapped parameter name in the backend service.
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
        @com.aliyun.core.annotation.NameInMap("ServiceParameter")
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
        @com.aliyun.core.annotation.NameInMap("RequestParameterName")
        private String requestParameterName;

        @com.aliyun.core.annotation.NameInMap("ServiceParameterName")
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
             * The name of the frontend parameter. The name must be included in RequestParametersObject and match ApiParameterName in RequestParameters.
             */
            public Builder requestParameterName(String requestParameterName) {
                this.requestParameterName = requestParameterName;
                return this;
            }

            /**
             * The mapped parameter name in the backend service.
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
        @com.aliyun.core.annotation.NameInMap("ServiceParameterMap")
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
        @com.aliyun.core.annotation.NameInMap("DemoValue")
        private String demoValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ServiceParameterName")
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
             * The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the system parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The mapped parameter name in the backend service.
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
        @com.aliyun.core.annotation.NameInMap("SystemParameter")
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
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private TagList(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
