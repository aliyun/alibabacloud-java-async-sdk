// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>If <strong>AuthType</strong> is set to <strong>APP</strong>, this value must be passed to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:</p>
         * <ul>
         * <li>HmacSHA256</li>
         * <li>HmacSHA1,HmacSHA256</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HmacSHA256</p>
         */
        public Builder allowSignatureMethod(String allowSignatureMethod) {
            this.allowSignatureMethod = allowSignatureMethod;
            return this;
        }

        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>8afff6c8c4c6447abb035812e4d66b65</p>
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The name of the API, which is unique in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiName</p>
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>If <strong>AuthType</strong> is set to <strong>APP</strong>, the valid values are:</p>
         * <ul>
         * <li><strong>DEFAULT</strong>: The default value that is used if no other values are passed. This value means that the setting of the group is used.</li>
         * <li><strong>DISABLE</strong>: The authentication is disabled.</li>
         * <li><strong>HEADER</strong>: AppCode can be placed in the Header parameter for authentication.</li>
         * <li><strong>HEADER_QUERY</strong>: AppCode can be placed in the Header or Query parameter for authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        public Builder appCodeAuthType(String appCodeAuthType) {
            this.appCodeAuthType = appCodeAuthType;
            return this;
        }

        /**
         * <p>The security authentication method of the API. Valid values:</p>
         * <ul>
         * <li><p><strong>APP</strong>: Only authorized applications can call the API.</p>
         * </li>
         * <li><p><strong>ANONYMOUS</strong>: The API can be anonymously called. In this mode, you must take note of the following rules:</p>
         * <ul>
         * <li>All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</li>
         * <li>We recommend that you do not make the API whose security authentication method is ANONYMOUS available in Alibaba Cloud Marketplace because API Gateway cannot meter calls on the caller or limit the number of calls on the API. If you want to make the API group to which the API belongs available in Alibaba Cloud Marketplace, we recommend that you move the API to another group, set its type to PRIVATE, or set its security authentication method to APP.</li>
         * </ul>
         * </li>
         * <li><p><strong>APPOPENID</strong>: The OpenID Connect account authentication method is used. Only applications authorized by OpenID Connect can call the API. If this method is selected, the OpenIdConnectConfig parameter is required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * <p>Backend configurations</p>
         */
        public Builder backendConfig(BackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable backend services.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder backendEnable(Boolean backendEnable) {
            this.backendEnable = backendEnable;
            return this;
        }

        /**
         * <p>System parameters sent by API Gateway to the backend service</p>
         */
        public Builder constantParameters(ConstantParameters constantParameters) {
            this.constantParameters = constantParameters;
            return this;
        }

        /**
         * <p>The creation time of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-28T09:50:43Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>Custom system parameters</p>
         */
        public Builder customSystemParameters(CustomSystemParameters customSystemParameters) {
            this.customSystemParameters = customSystemParameters;
            return this;
        }

        /**
         * <p>The API publishing status.</p>
         */
        public Builder deployedInfos(DeployedInfos deployedInfos) {
            this.deployedInfos = deployedInfos;
            return this;
        }

        /**
         * <p>The description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Api description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to limit API calls to within the VPC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Only API calls from the VPC are supported.</li>
         * <li><strong>false</strong>: API calls from the VPC and Internet are both supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableInternet(Boolean disableInternet) {
            this.disableInternet = disableInternet;
            return this;
        }

        /**
         * <p>The sample error codes returned by the backend service.</p>
         */
        public Builder errorCodeSamples(ErrorCodeSamples errorCodeSamples) {
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * <p>The sample error response from the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder failResultSample(String failResultSample) {
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * <p>Specifies whether to carry the header : X-Ca-Nonce when calling an API. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent reply attacks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: This field is forcibly checked when an API is requested to prevent replay attacks.</li>
         * <li><strong>false</strong>: This field is not checked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            this.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>08ae4aa0f95e4321849ee57f4e0b3077</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiTest</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Mock mode. Valid values:</p>
         * <ul>
         * <li>OPEN: The Mock mode is enabled.</li>
         * <li>CLOSED: The Mock mode is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOSED</p>
         */
        public Builder mock(String mock) {
            this.mock = mock;
            return this;
        }

        /**
         * <p>The result returned for service mocking.</p>
         * 
         * <strong>example:</strong>
         * <p>test result</p>
         */
        public Builder mockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }

        /**
         * <p>The last modification time of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-28T13:13:12Z</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>Configuration items of the third-party OpenID Connect authentication method</p>
         */
        public Builder openIdConnectConfig(OpenIdConnectConfig openIdConnectConfig) {
            this.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * <p>The region ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
         */
        public Builder requestConfig(RequestConfig requestConfig) {
            this.requestConfig = requestConfig;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D0FF585F-7966-40CF-BC60-75DB070B23D5&lt;</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
         */
        public Builder requestParameters(RequestParameters requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * <p>The returned description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder resultBodyModel(String resultBodyModel) {
            this.resultBodyModel = resultBodyModel;
            return this;
        }

        /**
         * <p>The sample response from the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder resultSample(String resultSample) {
            this.resultSample = resultSample;
            return this;
        }

        /**
         * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * <p>The configuration items of API requests that API Gateway sends to the backend service.</p>
         */
        public Builder serviceConfig(ServiceConfig serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
         */
        public Builder serviceParameters(ServiceParameters serviceParameters) {
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
         */
        public Builder serviceParametersMap(ServiceParametersMap serviceParametersMap) {
            this.serviceParametersMap = serviceParametersMap;
            return this;
        }

        /**
         * <p>System parameters sent by API Gateway to the backend service</p>
         */
        public Builder systemParameters(SystemParameters systemParameters) {
            this.systemParameters = systemParameters;
            return this;
        }

        /**
         * <p>Tag List.</p>
         */
        public Builder tagList(TagList tagList) {
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>Specifies whether to make the API public. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.</li>
         * <li><strong>PRIVATE</strong>: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * <p>The type of the two-way communication API.</p>
         * <ul>
         * <li><strong>COMMON</strong>: common API</li>
         * <li><strong>REGISTER</strong>: registered API</li>
         * <li><strong>UNREGISTER</strong>: unregistered API</li>
         * <li><strong>NOTIFY</strong>: downstream notification API</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        public Builder webSocketApiType(String webSocketApiType) {
            this.webSocketApiType = webSocketApiType;
            return this;
        }

        public DescribeApiResponseBody build() {
            return new DescribeApiResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The ID of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>0038e00c3dca44fcba3a94015d8f5bbf</p>
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * <p>The name of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>testoss</p>
             */
            public Builder backendName(String backendName) {
                this.backendName = backendName;
                return this;
            }

            /**
             * <p>Backend service type</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The constant parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>constance</p>
             */
            public Builder constantValue(String constantValue) {
                this.constantValue = constantValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>constance</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The mapped parameter name in the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>constance</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Client IP Address</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the system parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.</p>
             * 
             * <strong>example:</strong>
             * <p>CaClientIp</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The mapped parameter name in the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>clientIp</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The deployment status. Valid values: DEPLOYED and NONDEPLOYED.</p>
             * 
             * <strong>example:</strong>
             * <p>DEPLOYED</p>
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * <p>The effective version.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder effectiveVersion(String effectiveVersion) {
                this.effectiveVersion = effectiveVersion;
                return this;
            }

            /**
             * <p>The environment to which the API is published. Valid values: RELEASE and TEST.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The returned error code.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error description.</p>
             * 
             * <strong>example:</strong>
             * <p>The UserId parameter is missing from the request.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The returned error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Missing the parameter UserId</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The model.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;*&quot;]</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The name of the parameter that corresponds to the token.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder idTokenParamName(String idTokenParamName) {
                this.idTokenParamName = idTokenParamName;
                return this;
            }

            /**
             * <p>The OpenID Connect mode. Valid values:</p>
             * <ul>
             * <li><strong>IDTOKEN</strong>: indicates the APIs that are called by clients to obtain tokens. If you specify this value, the PublicKeyId parameter and the PublicKey parameter are required.</li>
             * <li><strong>BUSINESS</strong>: indicates business APIs. Tokens are used to call the business APIs. If you specify this value, the IdTokenParamName parameter is required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IDTOKEN</p>
             */
            public Builder openIdApiType(String openIdApiType) {
                this.openIdApiType = openIdApiType;
                return this;
            }

            /**
             * <p>The public key.</p>
             * 
             * <strong>example:</strong>
             * <p>EB1837F8693CCED0BF750B3AD48467BEB569E780A14591CF92</p>
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * <p>The ID of the public key.</p>
             * 
             * <strong>example:</strong>
             * <p>88483727556929326703309904351185815489</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
    public static class RequestConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyFormat")
        private String bodyFormat;

        @com.aliyun.core.annotation.NameInMap("BodyModel")
        private String bodyModel;

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
            this.bodyModel = builder.bodyModel;
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
         * @return bodyModel
         */
        public String getBodyModel() {
            return this.bodyModel;
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
            private String bodyModel; 
            private Boolean escapePathParam; 
            private String postBodyDescription; 
            private String requestHttpMethod; 
            private String requestMode; 
            private String requestPath; 
            private String requestProtocol; 

            /**
             * <p>This parameter takes effect only when the RequestMode parameter is set to MAPPING.********</p>
             * <p>The server data transmission method used for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data in key-value pairs is transmitted as forms. STREAM indicates that data is transmitted as byte streams.</p>
             * 
             * <strong>example:</strong>
             * <p>STREAM</p>
             */
            public Builder bodyFormat(String bodyFormat) {
                this.bodyFormat = bodyFormat;
                return this;
            }

            /**
             * <p>The body model.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://apigateway.aliyun.com/models/3a240a127dcc4afd9ab1bf7e947b4095/9e2df550e85b4121a79ec33e2619eaab">https://apigateway.aliyun.com/models/3a240a127dcc4afd9ab1bf7e947b4095/9e2df550e85b4121a79ec33e2619eaab</a></p>
             */
            public Builder bodyModel(String bodyModel) {
                this.bodyModel = bodyModel;
                return this;
            }

            /**
             * <p>Whether to escape the Path parameter, if true, the [param] on the Path will be treated as a regular character.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder escapePathParam(Boolean escapePathParam) {
                this.escapePathParam = escapePathParam;
                return this;
            }

            /**
             * <p>The description of the request body.</p>
             * 
             * <strong>example:</strong>
             * <p>fwefwef</p>
             */
            public Builder postBodyDescription(String postBodyDescription) {
                this.postBodyDescription = postBodyDescription;
                return this;
            }

            /**
             * <p>The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder requestHttpMethod(String requestHttpMethod) {
                this.requestHttpMethod = requestHttpMethod;
                return this;
            }

            /**
             * <p>The request mode. Valid values: MAPPING and PASSTHROUGH.</p>
             * 
             * <strong>example:</strong>
             * <p>MAPPING</p>
             */
            public Builder requestMode(String requestMode) {
                this.requestMode = requestMode;
                return this;
            }

            /**
             * <p>The API request path. If the complete API URL is <code>http://api.a.com:8080/object/add?key1=value1&amp;key2=value2</code>, the API request path is <code>/object/add </code>.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/billing/test/[type]</p>
             */
            public Builder requestPath(String requestPath) {
                this.requestPath = requestPath;
                return this;
            }

            /**
             * <p>The protocol type supported by the API. Valid values: HTTP and HTTPS. Separate multiple values with commas (,), such as &quot;HTTP,HTTPS&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder apiParameterName(String apiParameterName) {
                this.apiParameterName = apiParameterName;
                return this;
            }

            /**
             * <p>The type of the array element.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder arrayItemsType(String arrayItemsType) {
                this.arrayItemsType = arrayItemsType;
                return this;
            }

            /**
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Age</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The order in which the parameter is sorted in the document.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder docOrder(Integer docOrder) {
                this.docOrder = docOrder;
                return this;
            }

            /**
             * <p>Indicates whether the document is public. Valid values: <strong>PUBLIC</strong> and <strong>PRIVATE</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder docShow(String docShow) {
                this.docShow = docShow;
                return this;
            }

            /**
             * <p>The hash values that are supported when <strong>ParameterType</strong> is set to Int, Long, Float, Double, or String. Separate values with commas (,). Examples: 1,2,3,4,9 and A,B,C,E,F.</p>
             * 
             * <strong>example:</strong>
             * <p>boy,girl</p>
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            /**
             * <p>The JSON Schema used for JSON validation when <strong>ParameterType</strong> is set to String.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder jsonScheme(String jsonScheme) {
                this.jsonScheme = jsonScheme;
                return this;
            }

            /**
             * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The maximum parameter length when <strong>ParameterType</strong> is set to String.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * <p>The maximum parameter value when <strong>ParameterType</strong> is set to Int, Long, Float, or Double.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum parameter length when <strong>ParameterType</strong> is set to String.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder minLength(Long minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * <p>The minimum parameter value when <strong>ParameterType</strong> is set to Int, Long, Float, or Double.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The data type of the parameter. Valid values: String, Int, Long, Float, Double, and Boolean.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * <p>The regular expression that is used for parameter validation when <strong>ParameterType</strong> is set to String.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder regularExpression(String regularExpression) {
                this.regularExpression = regularExpression;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required. Valid values: <strong>REQUIRED</strong> and <strong>OPTIONAL</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>OPTIONAL</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The ID of the region where the EventBridge instance is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder eventBridgeRegionId(String eventBridgeRegionId) {
                this.eventBridgeRegionId = eventBridgeRegionId;
                return this;
            }

            /**
             * <p>The event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>testBus</p>
             */
            public Builder eventBus(String eventBus) {
                this.eventBus = eventBus;
                return this;
            }

            /**
             * <p>The event source.</p>
             * 
             * <strong>example:</strong>
             * <p>baas_driver</p>
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * <p>The Arn that is authorized by a RAM user to EventBridge.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1933122015759***:role/adminoidcaliyun</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The ContentType header type used when you call the backend service over HTTP.</p>
             * <ul>
             * <li><strong>DEFAULT</strong>: the default header type in API Gateway</li>
             * <li><strong>CUSTOM</strong>: a custom header type</li>
             * <li><strong>CLIENT</strong>: the ContentType header type of the client</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder contentTypeCatagory(String contentTypeCatagory) {
                this.contentTypeCatagory = contentTypeCatagory;
                return this;
            }

            /**
             * <p>The value of the ContentType header when the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>application/x-www-form-urlencoded; charset=UTF-8</p>
             */
            public Builder contentTypeValue(String contentTypeValue) {
                this.contentTypeValue = contentTypeValue;
                return this;
            }

            /**
             * <p>The root path of Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://1227****64334133.ap-southeast-1-int***al.fc.aliyuncs.com/201****-15/proxy/test****ice.LATEST/testHttp/">https://1227****64334133.ap-southeast-1-int***al.fc.aliyuncs.com/201****-15/proxy/test****ice.LATEST/testHttp/</a></p>
             */
            public Builder fcBaseUrl(String fcBaseUrl) {
                this.fcBaseUrl = fcBaseUrl;
                return this;
            }

            /**
             * <p>The type of the Function Compute instance.</p>
             * 
             * <strong>example:</strong>
             * <p>HttpTrigger</p>
             */
            public Builder fcType(String fcType) {
                this.fcType = fcType;
                return this;
            }

            /**
             * <p>The function name defined in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>edge_function</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The request method.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The backend only receives the service path.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder onlyBusinessPath(Boolean onlyBusinessPath) {
                this.onlyBusinessPath = onlyBusinessPath;
                return this;
            }

            /**
             * <p>The API request path.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/offline/cacheData</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The alias of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * <p>The region where the Function Compute instance is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role to be assumed by API Gateway to access Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::111***:role/aliyunserviceroleforsas</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The service name defined in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>fcservicename</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The HTTP header.</p>
             * 
             * <strong>example:</strong>
             * <p>Content-Length</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The value of the HTTP header.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The operation options on OSS. Valid values:</p>
             * <ul>
             * <li>GetObject</li>
             * <li>PostObject</li>
             * <li>DeleteObject</li>
             * <li>PutObject</li>
             * <li>HeadObject</li>
             * <li>GetObjectMeta</li>
             * <li>AppendObject</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GetObject</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>cbg-db</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The stored object or folder path.</p>
             * 
             * <strong>example:</strong>
             * <p>/folder/test.json</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the region where the OSS instance is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The ID of the ECS or SLB instance in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1h497hkijewv2***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the VPC access authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>glmall-app-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port number that corresponds to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zeafsc3fygk1***</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The application name in AONE.</p>
             * 
             * <strong>example:</strong>
             * <p>ib-blank</p>
             */
            public Builder aoneAppName(String aoneAppName) {
                this.aoneAppName = aoneAppName;
                return this;
            }

            /**
             * <p>The ContentType header type used when you call the backend service over HTTP.</p>
             * <ul>
             * <li><strong>DEFAULT</strong>: the default header type in API Gateway</li>
             * <li><strong>CUSTOM</strong>: a custom header type</li>
             * <li><strong>CLIENT</strong>: the ContentType header type of the client</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder contentTypeCatagory(String contentTypeCatagory) {
                this.contentTypeCatagory = contentTypeCatagory;
                return this;
            }

            /**
             * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>application/x-www-form-urlencoded; charset=UTF-8</p>
             */
            public Builder contentTypeValue(String contentTypeValue) {
                this.contentTypeValue = contentTypeValue;
                return this;
            }

            /**
             * <p>Configuration items of EventBridge</p>
             */
            public Builder eventBridgeConfig(EventBridgeConfig eventBridgeConfig) {
                this.eventBridgeConfig = eventBridgeConfig;
                return this;
            }

            /**
             * <p>Backend configuration items when the backend service is Function Compute</p>
             */
            public Builder functionComputeConfig(FunctionComputeConfig functionComputeConfig) {
                this.functionComputeConfig = functionComputeConfig;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Mock mode. Valid values:</p>
             * <ul>
             * <li><strong>TRUE</strong>: The Mock mode is enabled.</li>
             * <li><strong>FALSE</strong>: The Mock mode is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TRUE</p>
             */
            public Builder mock(String mock) {
                this.mock = mock;
                return this;
            }

            /**
             * <p>The simulated headers.</p>
             */
            public Builder mockHeaders(MockHeaders mockHeaders) {
                this.mockHeaders = mockHeaders;
                return this;
            }

            /**
             * <p>The result returned when the Mock mode is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>test result</p>
             */
            public Builder mockResult(String mockResult) {
                this.mockResult = mockResult;
                return this;
            }

            /**
             * <p>The status code returned for service mocking.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder mockStatusCode(Integer mockStatusCode) {
                this.mockStatusCode = mockStatusCode;
                return this;
            }

            /**
             * <p>The information returned when the backend service is Object Storage Service (OSS).</p>
             */
            public Builder ossConfig(OssConfig ossConfig) {
                this.ossConfig = ossConfig;
                return this;
            }

            /**
             * <p>The URL used to call the back-end service. If the complete back-end service URL is <code>http://api.a.com:8080/object/add?key1=value1&amp;key2=value2</code>, the value of ServiceAddress is <strong><a href="http://api.a.com:8080">http://api.a.com:8080</a></strong>.``</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://api.a.com:8080">http://api.a.com:8080</a></p>
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            /**
             * <p>The HTTP method used to call a backend service. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
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
             * <p>The protocol used by the backend service. Valid values: HTTP and HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * <p>The timeout period of the backend service. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder serviceTimeout(Integer serviceTimeout) {
                this.serviceTimeout = serviceTimeout;
                return this;
            }

            /**
             * <p>Specifies whether to enable the VPC channel. Valid values:</p>
             * <ul>
             * <li><strong>TRUE</strong>: The VPC channel is enabled. You must create the corresponding VPC access authorization before you can enable a VPC channel.</li>
             * <li><strong>FALSE</strong>: The VPC channel is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TRUE</p>
             */
            public Builder serviceVpcEnable(String serviceVpcEnable) {
                this.serviceVpcEnable = serviceVpcEnable;
                return this;
            }

            /**
             * <p>Configuration items related to VPC channels</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The data type of the parameter. Valid values: STRING, NUMBER, and BOOLEAN.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder parameterType(String parameterType) {
                this.parameterType = parameterType;
                return this;
            }

            /**
             * <p>The mapped parameter name in the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>clientIp</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The corresponding frontend parameter name. The value must be contained in RequestParametersObject and match RequestParam.ApiParameterName.</p>
             * 
             * <strong>example:</strong>
             * <p>sex</p>
             */
            public Builder requestParameterName(String requestParameterName) {
                this.requestParameterName = requestParameterName;
                return this;
            }

            /**
             * <p>The mapped parameter name in the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>sex</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Client IP Address</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The system parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.</p>
             * 
             * <strong>example:</strong>
             * <p>CaClientIp</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The mapped parameter name in the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>clientIp</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
             * <p>Label key.</p>
             * 
             * <strong>example:</strong>
             * <p>APP</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>Label value.</p>
             * 
             * <strong>example:</strong>
             * <p>value3</p>
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
    /**
     * 
     * {@link DescribeApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiResponseBody</p>
     */
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
