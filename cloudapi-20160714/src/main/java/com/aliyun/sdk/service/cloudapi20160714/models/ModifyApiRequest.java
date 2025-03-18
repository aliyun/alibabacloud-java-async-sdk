// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
         * <p>The type of the two-way communication API. Valid values:</p>
         * <ul>
         * <li><strong>COMMON</strong>: general APIs</li>
         * <li><strong>REGISTER</strong>: registered APIs</li>
         * <li><strong>UNREGISTER</strong>: unregistered APIs</li>
         * <li><strong>NOTIFY</strong>: downstream notification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HmacSHA256</p>
         */
        public Builder allowSignatureMethod(String allowSignatureMethod) {
            this.putQueryParameter("AllowSignatureMethod", allowSignatureMethod);
            this.allowSignatureMethod = allowSignatureMethod;
            return this;
        }

        /**
         * <p>The ID of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8afff6c8c4c6447abb035812e4d66b65</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The name of the API. The name must be unique within the API group. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiName</p>
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>The ID of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder appCodeAuthType(String appCodeAuthType) {
            this.putQueryParameter("AppCodeAuthType", appCodeAuthType);
            this.appCodeAuthType = appCodeAuthType;
            return this;
        }

        /**
         * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>Configuration Mode</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder backendEnable(Boolean backendEnable) {
            this.putQueryParameter("BackendEnable", backendEnable);
            this.backendEnable = backendEnable;
            return this;
        }

        /**
         * <p>Specifies whether to enable backend services.</p>
         * 
         * <strong>example:</strong>
         * <p>0d105f80a8f340408bd34954d4e4ff22</p>
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
         * <p>The description of the API. The description can be up to 180 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Api description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The AppCode authentication type supported. Valid values:</p>
         * <ul>
         * <li>DEFAULT: supported after being made available in Alibaba Cloud Marketplace</li>
         * <li>DISABLE: not supported</li>
         * <li>HEADER : supported only in the Header parameter</li>
         * <li>HEADER_QUERY: supported in the Header or Query parameter</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <ul>
         * <li>Specifies whether to set DisableInternet to <strong>true</strong> to limit API calls to within the VPC.</li>
         * <li>If you set DisableInternet to <strong>false</strong>, the limit if lifted.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not set this parameter, the original value is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            this.putQueryParameter("ForceNonceCheck", forceNonceCheck);
            this.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>927d50c0f2e54b359919923d908bb015</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The client-side request signature method of the API. Valid values:</p>
         * <ul>
         * <li>HmacSHA256</li>
         * <li>HmacSHA1,HmacSHA256</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OpenIdApiType&quot;:&quot;IDTOKEN&quot;,&quot;PublicKey&quot;:&quot;lzlj1573&quot;,&quot;IdTokenParamName&quot;:&quot;&quot;,&quot;PublicKeyId&quot;:&quot;lzljorders&quot;}</p>
         */
        public Builder openIdConnectConfig(String openIdConnectConfig) {
            this.putQueryParameter("OpenIdConnectConfig", openIdConnectConfig);
            this.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * <p>The configuration items of API requests sent by API Gateway to the backend service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestProtocol&quot;:&quot;HTTP&quot;,&quot;RequestHttpMethod&quot;:&quot;GET&quot;,&quot;RequestPath&quot;:&quot;/v3/getUserTest/[userId]&quot;,&quot;BodyFormat&quot;:&quot;FORM&quot;,&quot;PostBodyDescription&quot;:&quot;&quot;}</p>
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
         * <ul>
         * <li>Specifies whether to set <strong>ForceNonceCheck</strong> to <strong>true</strong> to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</li>
         * <li>If you set <strong>ForceNonceCheck</strong> to <strong>false</strong>, the check is not performed. If you do not set this parameter, the original value is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
         * <p>The sample response from the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML</p>
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
         * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ServiceProtocol&quot;:&quot;HTTP&quot;,&quot;ServiceHttpMethod&quot;:&quot;GET&quot;,&quot;ServiceAddress&quot;:&quot;<a href="http://www.customerdomain.com%22,%22ServiceTimeout%22:%221000%22,%22ServicePath%22:%22/v3/getUserTest/%5BuserId%5D%22%7D">http://www.customerdomain.com&quot;,&quot;ServiceTimeout&quot;:&quot;1000&quot;,&quot;ServicePath&quot;:&quot;/v3/getUserTest/[userId]&quot;}</a></p>
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
         * <p>Specifies whether the API is public. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.</li>
         * <li><strong>PRIVATE</strong>: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * <p>The returned description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
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
