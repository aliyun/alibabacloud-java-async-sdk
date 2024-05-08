// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiRequest</p>
 */
public class ModifyApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowSignatureMethod")
    private String allowSignatureMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCodeAuthType")
    private String appCodeAuthType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendEnable")
    private Boolean backendEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendId")
    private String backendId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConstantParameters")
    private String constantParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableInternet")
    private Boolean disableInternet;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorCodeSamples")
    private String errorCodeSamples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FailResultSample")
    private String failResultSample;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceNonceCheck")
    private Boolean forceNonceCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenIdConnectConfig")
    private String openIdConnectConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestParameters")
    private String requestParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultBodyModel")
    private String resultBodyModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResultDescriptions")
    private String resultDescriptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResultSample")
    private String resultSample;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParametersMap")
    private String serviceParametersMap;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemParameters")
    private String systemParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    @com.aliyun.core.annotation.Validation(required = true)
    private String visibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebSocketApiType")
    private String webSocketApiType;

    private ModifyApiRequest(Builder builder) {
        super(builder);
        this.allowSignatureMethod = builder.allowSignatureMethod;
        this.apiId = builder.apiId;
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

    public static ModifyApiRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyApiRequest, Builder> {
        private String allowSignatureMethod; 
        private String apiId; 
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

        private Builder(ModifyApiRequest request) {
            super(request);
            this.allowSignatureMethod = request.allowSignatureMethod;
            this.apiId = request.apiId;
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
         * The type of the two-way communication API. Valid values:
         * <p>
         * 
         * *   **COMMON**: general APIs
         * *   **REGISTER**: registered APIs
         * *   **UNREGISTER**: unregistered APIs
         * *   **NOTIFY**: downstream notification
         */
        public Builder allowSignatureMethod(String allowSignatureMethod) {
            this.putQueryParameter("AllowSignatureMethod", allowSignatureMethod);
            this.allowSignatureMethod = allowSignatureMethod;
            return this;
        }

        /**
         * The ID of the API.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The name of the API. The name must be unique within the API group. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (\_).
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * The ID of the backend service.
         */
        public Builder appCodeAuthType(String appCodeAuthType) {
            this.putQueryParameter("AppCodeAuthType", appCodeAuthType);
            this.appCodeAuthType = appCodeAuthType;
            return this;
        }

        /**
         * The configuration items of API requests sent by the consumer to API Gateway.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * Configuration Mode
         */
        public Builder backendEnable(Boolean backendEnable) {
            this.putQueryParameter("BackendEnable", backendEnable);
            this.backendEnable = backendEnable;
            return this;
        }

        /**
         * Specifies whether to enable backend services.
         */
        public Builder backendId(String backendId) {
            this.putQueryParameter("BackendId", backendId);
            this.backendId = backendId;
            return this;
        }

        /**
         * ConstantParameters.
         */
        public Builder constantParameters(String constantParameters) {
            this.putBodyParameter("ConstantParameters", constantParameters);
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
         * The AppCode authentication type supported. Valid values:
         * <p>
         * 
         * *   DEFAULT: supported after being made available in Alibaba Cloud Marketplace
         * *   DISABLE: not supported
         * *   HEADER : supported only in the Header parameter
         * *   HEADER_QUERY: supported in the Header or Query parameter
         */
        public Builder disableInternet(Boolean disableInternet) {
            this.putQueryParameter("DisableInternet", disableInternet);
            this.disableInternet = disableInternet;
            return this;
        }

        /**
         * ErrorCodeSamples.
         */
        public Builder errorCodeSamples(String errorCodeSamples) {
            this.putBodyParameter("ErrorCodeSamples", errorCodeSamples);
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * FailResultSample.
         */
        public Builder failResultSample(String failResultSample) {
            this.putBodyParameter("FailResultSample", failResultSample);
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * *   Specifies whether to set DisableInternet to **true** to limit API calls to within the VPC.
         * <p>
         * *   If you set DisableInternet to **false**, the limit if lifted.
         * 
         * >  If you do not set this parameter, the original value is used.
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
         * The client-side request signature method of the API. Valid values:
         * <p>
         * 
         * *   HmacSHA256
         * *   HmacSHA1,HmacSHA256
         */
        public Builder openIdConnectConfig(String openIdConnectConfig) {
            this.putQueryParameter("OpenIdConnectConfig", openIdConnectConfig);
            this.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * The configuration items of API requests sent by API Gateway to the backend service.
         */
        public Builder requestConfig(String requestConfig) {
            this.putQueryParameter("RequestConfig", requestConfig);
            this.requestConfig = requestConfig;
            return this;
        }

        /**
         * RequestParameters.
         */
        public Builder requestParameters(String requestParameters) {
            this.putBodyParameter("RequestParameters", requestParameters);
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * *   Specifies whether to set **ForceNonceCheck** to **true** to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.
         * <p>
         * *   If you set **ForceNonceCheck** to **false**, the check is not performed. If you do not set this parameter, the original value is used.
         */
        public Builder resultBodyModel(String resultBodyModel) {
            this.putQueryParameter("ResultBodyModel", resultBodyModel);
            this.resultBodyModel = resultBodyModel;
            return this;
        }

        /**
         * ResultDescriptions.
         */
        public Builder resultDescriptions(String resultDescriptions) {
            this.putBodyParameter("ResultDescriptions", resultDescriptions);
            this.resultDescriptions = resultDescriptions;
            return this;
        }

        /**
         * ResultSample.
         */
        public Builder resultSample(String resultSample) {
            this.putBodyParameter("ResultSample", resultSample);
            this.resultSample = resultSample;
            return this;
        }

        /**
         * The sample response from the backend service.
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
         * The parameters of API requests sent by the consumer to API Gateway.
         */
        public Builder serviceConfig(String serviceConfig) {
            this.putQueryParameter("ServiceConfig", serviceConfig);
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * ServiceParametersMap.
         */
        public Builder serviceParametersMap(String serviceParametersMap) {
            this.putBodyParameter("ServiceParametersMap", serviceParametersMap);
            this.serviceParametersMap = serviceParametersMap;
            return this;
        }

        /**
         * SystemParameters.
         */
        public Builder systemParameters(String systemParameters) {
            this.putBodyParameter("SystemParameters", systemParameters);
            this.systemParameters = systemParameters;
            return this;
        }

        /**
         * Specifies whether the API is public. Valid values:
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
         * The returned description of the API.
         */
        public Builder webSocketApiType(String webSocketApiType) {
            this.putQueryParameter("WebSocketApiType", webSocketApiType);
            this.webSocketApiType = webSocketApiType;
            return this;
        }

        @Override
        public ModifyApiRequest build() {
            return new ModifyApiRequest(this);
        } 

    } 

}
