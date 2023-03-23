// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApiRequest} extends {@link RequestModel}
 *
 * <p>CreateApiRequest</p>
 */
public class CreateApiRequest extends Request {
    @Query
    @NameInMap("AllowSignatureMethod")
    private String allowSignatureMethod;

    @Query
    @NameInMap("ApiName")
    @Validation(required = true)
    private String apiName;

    @Query
    @NameInMap("AppCodeAuthType")
    private String appCodeAuthType;

    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("BackendEnable")
    private Boolean backendEnable;

    @Query
    @NameInMap("BackendId")
    private String backendId;

    @Query
    @NameInMap("ConstantParameters")
    private String constantParameters;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DisableInternet")
    private Boolean disableInternet;

    @Query
    @NameInMap("ErrorCodeSamples")
    private String errorCodeSamples;

    @Query
    @NameInMap("FailResultSample")
    private String failResultSample;

    @Query
    @NameInMap("ForceNonceCheck")
    private Boolean forceNonceCheck;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("OpenIdConnectConfig")
    private String openIdConnectConfig;

    @Query
    @NameInMap("RequestConfig")
    @Validation(required = true)
    private String requestConfig;

    @Query
    @NameInMap("RequestParameters")
    private String requestParameters;

    @Query
    @NameInMap("ResultBodyModel")
    private String resultBodyModel;

    @Query
    @NameInMap("ResultDescriptions")
    private String resultDescriptions;

    @Query
    @NameInMap("ResultSample")
    private String resultSample;

    @Query
    @NameInMap("ResultType")
    private String resultType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ServiceConfig")
    @Validation(required = true)
    private String serviceConfig;

    @Query
    @NameInMap("ServiceParameters")
    private String serviceParameters;

    @Query
    @NameInMap("ServiceParametersMap")
    private String serviceParametersMap;

    @Query
    @NameInMap("SystemParameters")
    private String systemParameters;

    @Query
    @NameInMap("Visibility")
    @Validation(required = true)
    private String visibility;

    @Query
    @NameInMap("WebSocketApiType")
    private String webSocketApiType;

    private CreateApiRequest(Builder builder) {
        super(builder);
        this.allowSignatureMethod = builder.allowSignatureMethod;
        this.apiName = builder.apiName;
        this.appCodeAuthType = builder.appCodeAuthType;
        this.authType = builder.authType;
        this.backendEnable = builder.backendEnable;
        this.backendId = builder.backendId;
        this.constantParameters = builder.constantParameters;
        this.description = builder.description;
        this.disableInternet = builder.disableInternet;
        this.errorCodeSamples = builder.errorCodeSamples;
        this.failResultSample = builder.failResultSample;
        this.forceNonceCheck = builder.forceNonceCheck;
        this.groupId = builder.groupId;
        this.openIdConnectConfig = builder.openIdConnectConfig;
        this.requestConfig = builder.requestConfig;
        this.requestParameters = builder.requestParameters;
        this.resultBodyModel = builder.resultBodyModel;
        this.resultDescriptions = builder.resultDescriptions;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.securityToken = builder.securityToken;
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

    public static CreateApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowSignatureMethod
     */
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
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
     * @return backendEnable
     */
    public Boolean getBackendEnable() {
        return this.backendEnable;
    }

    /**
     * @return backendId
     */
    public String getBackendId() {
        return this.backendId;
    }

    /**
     * @return constantParameters
     */
    public String getConstantParameters() {
        return this.constantParameters;
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
    public String getErrorCodeSamples() {
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
     * @return openIdConnectConfig
     */
    public String getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    /**
     * @return requestConfig
     */
    public String getRequestConfig() {
        return this.requestConfig;
    }

    /**
     * @return requestParameters
     */
    public String getRequestParameters() {
        return this.requestParameters;
    }

    /**
     * @return resultBodyModel
     */
    public String getResultBodyModel() {
        return this.resultBodyModel;
    }

    /**
     * @return resultDescriptions
     */
    public String getResultDescriptions() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return serviceConfig
     */
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    /**
     * @return serviceParametersMap
     */
    public String getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    /**
     * @return systemParameters
     */
    public String getSystemParameters() {
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

    public static final class Builder extends Request.Builder<CreateApiRequest, Builder> {
        private String allowSignatureMethod; 
        private String apiName; 
        private String appCodeAuthType; 
        private String authType; 
        private Boolean backendEnable; 
        private String backendId; 
        private String constantParameters; 
        private String description; 
        private Boolean disableInternet; 
        private String errorCodeSamples; 
        private String failResultSample; 
        private Boolean forceNonceCheck; 
        private String groupId; 
        private String openIdConnectConfig; 
        private String requestConfig; 
        private String requestParameters; 
        private String resultBodyModel; 
        private String resultDescriptions; 
        private String resultSample; 
        private String resultType; 
        private String securityToken; 
        private String serviceConfig; 
        private String serviceParameters; 
        private String serviceParametersMap; 
        private String systemParameters; 
        private String visibility; 
        private String webSocketApiType; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiRequest request) {
            super(request);
            this.allowSignatureMethod = request.allowSignatureMethod;
            this.apiName = request.apiName;
            this.appCodeAuthType = request.appCodeAuthType;
            this.authType = request.authType;
            this.backendEnable = request.backendEnable;
            this.backendId = request.backendId;
            this.constantParameters = request.constantParameters;
            this.description = request.description;
            this.disableInternet = request.disableInternet;
            this.errorCodeSamples = request.errorCodeSamples;
            this.failResultSample = request.failResultSample;
            this.forceNonceCheck = request.forceNonceCheck;
            this.groupId = request.groupId;
            this.openIdConnectConfig = request.openIdConnectConfig;
            this.requestConfig = request.requestConfig;
            this.requestParameters = request.requestParameters;
            this.resultBodyModel = request.resultBodyModel;
            this.resultDescriptions = request.resultDescriptions;
            this.resultSample = request.resultSample;
            this.resultType = request.resultType;
            this.securityToken = request.securityToken;
            this.serviceConfig = request.serviceConfig;
            this.serviceParameters = request.serviceParameters;
            this.serviceParametersMap = request.serviceParametersMap;
            this.systemParameters = request.systemParameters;
            this.visibility = request.visibility;
            this.webSocketApiType = request.webSocketApiType;
        } 

        /**
         * If the **AuthType** is **APP** authentication, you need to pass this value to specify the signature algorithm. If you do not specify this parameter, the default value HmacSHA256 is used. Valid values:
         * <p>
         * 
         * *   HmacSHA256
         * *   HmacSHA1,HmacSHA256
         */
        public Builder allowSignatureMethod(String allowSignatureMethod) {
            this.putQueryParameter("AllowSignatureMethod", allowSignatureMethod);
            this.allowSignatureMethod = allowSignatureMethod;
            return this;
        }

        /**
         * The name of the API that you want to create. The name must be unique within the API group. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (\_).
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
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
            this.putQueryParameter("AppCodeAuthType", appCodeAuthType);
            this.appCodeAuthType = appCodeAuthType;
            return this;
        }

        /**
         * API安全认证类型，目前可以取值：
         * <p>
         * 
         * - **APP**：只允许已授权的APP调用
         * - **ANONYMOUS**：允许匿名调用，设置为允许匿名调用需要注意：
         *   任何能够获取该API服务信息的人，都将能够调用该API。网关不会对调用者做身份认证，也无法设置按用户的流量控制，若开放该API请设置好按API的流量控制。
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * Specifies whether to enable backend services.
         */
        public Builder backendEnable(Boolean backendEnable) {
            this.putQueryParameter("BackendEnable", backendEnable);
            this.backendEnable = backendEnable;
            return this;
        }

        /**
         * The IDof the backend service
         */
        public Builder backendId(String backendId) {
            this.putQueryParameter("BackendId", backendId);
            this.backendId = backendId;
            return this;
        }

        /**
         * The parameters of the API.
         */
        public Builder constantParameters(String constantParameters) {
            this.putQueryParameter("ConstantParameters", constantParameters);
            this.constantParameters = constantParameters;
            return this;
        }

        /**
         * The description of the API. The description can be up to 180 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * *   Specifies whether to set **DisableInternet** to **true** to limit API calls to within the VPC.
         * <p>
         * *   If you set **DisableInternet** to **false**, the limit is lifted. The default value is false when you create an API.
         */
        public Builder disableInternet(Boolean disableInternet) {
            this.putQueryParameter("DisableInternet", disableInternet);
            this.disableInternet = disableInternet;
            return this;
        }

        /**
         * The sample error codes returned by the backend service.
         * <p>
         * 
         * For more information, see [ErrorCodeSample](~~44392~~).
         */
        public Builder errorCodeSamples(String errorCodeSamples) {
            this.putQueryParameter("ErrorCodeSamples", errorCodeSamples);
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * The sample error response from the backend service.
         */
        public Builder failResultSample(String failResultSample) {
            this.putQueryParameter("FailResultSample", failResultSample);
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * *   Specifies whether to set **ForceNonceCheck** to **true** to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.
         * <p>
         * *   If you set **ForceNonceCheck** to **false**, the check is not performed. The default value is false when you create an API.
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            this.putQueryParameter("ForceNonceCheck", forceNonceCheck);
            this.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * The ID of the API group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The switch status of ACL. Valid values:- **on** and **off**.
         */
        public Builder openIdConnectConfig(String openIdConnectConfig) {
            this.putQueryParameter("OpenIdConnectConfig", openIdConnectConfig);
            this.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * The configuration items of API requests sent by the consumer to API Gateway.
         * <p>
         * 
         * For more information, see [RequestConfig](~~43985~~).
         */
        public Builder requestConfig(String requestConfig) {
            this.putQueryParameter("RequestConfig", requestConfig);
            this.requestConfig = requestConfig;
            return this;
        }

        /**
         * The parameters of API requests sent by the consumer to API Gateway.
         * <p>
         * 
         * For more information, see [RequestParameter](~~43986~~).
         */
        public Builder requestParameters(String requestParameters) {
            this.putQueryParameter("RequestParameters", requestParameters);
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * The return description of the API.
         */
        public Builder resultBodyModel(String resultBodyModel) {
            this.putQueryParameter("ResultBodyModel", resultBodyModel);
            this.resultBodyModel = resultBodyModel;
            return this;
        }

        /**
         * The return description of the API.
         */
        public Builder resultDescriptions(String resultDescriptions) {
            this.putQueryParameter("ResultDescriptions", resultDescriptions);
            this.resultDescriptions = resultDescriptions;
            return this;
        }

        /**
         * The sample response from the backend service.
         */
        public Builder resultSample(String resultSample) {
            this.putQueryParameter("ResultSample", resultSample);
            this.resultSample = resultSample;
            return this;
        }

        /**
         * The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML. Default value: JSON.
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The configuration items of API requests sent by API Gateway to the backend service.
         * <p>
         * 
         * For more information, see [ServiceConfig](~~43987~~).
         */
        public Builder serviceConfig(String serviceConfig) {
            this.putQueryParameter("ServiceConfig", serviceConfig);
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * The parameters of API requests sent by API Gateway to the backend service.
         * <p>
         * 
         * For more information, see [ServiceParameter](~~43988~~).
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.
         * <p>
         * 
         * For more information, see [ServiceParameterMap](~~43989~~).
         */
        public Builder serviceParametersMap(String serviceParametersMap) {
            this.putQueryParameter("ServiceParametersMap", serviceParametersMap);
            this.serviceParametersMap = serviceParametersMap;
            return this;
        }

        /**
         * The common parameters of APIs in JSON format.
         */
        public Builder systemParameters(String systemParameters) {
            this.putQueryParameter("SystemParameters", systemParameters);
            this.systemParameters = systemParameters;
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
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * The type of the two-way communication API.
         * <p>
         * 
         * *   **COMMON**: normal APIs
         * *   **REGISTER**: registered APIs
         * *   **UNREGISTER**: unregistered APIs
         * *   **NOTIFY**: downstream notification APIs
         */
        public Builder webSocketApiType(String webSocketApiType) {
            this.putQueryParameter("WebSocketApiType", webSocketApiType);
            this.webSocketApiType = webSocketApiType;
            return this;
        }

        @Override
        public CreateApiRequest build() {
            return new CreateApiRequest(this);
        } 

    } 

}
