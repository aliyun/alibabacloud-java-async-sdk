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
 * {@link ModifyApiConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiConfigurationRequest</p>
 */
public class ModifyApiConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowSignatureMethod")
    private String allowSignatureMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCodeAuthType")
    private String appCodeAuthType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendName")
    private String backendName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BodyFormat")
    private String bodyFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BodyModel")
    private String bodyModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentTypeCategory")
    private String contentTypeCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentTypeValue")
    private String contentTypeValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableInternet")
    private Boolean disableInternet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorCodeSamples")
    private String errorCodeSamples;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailResultSample")
    private String failResultSample;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceNonceCheck")
    private Boolean forceNonceCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionComputeConfig")
    private String functionComputeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpConfig")
    private String httpConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MockConfig")
    private String mockConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssConfig")
    private String ossConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostBodyDescription")
    private String postBodyDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestHttpMethod")
    private String requestHttpMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestMode")
    private String requestMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestParameters")
    private String requestParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestProtocol")
    private String requestProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultSample")
    private String resultSample;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParametersMap")
    private String serviceParametersMap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
    private String serviceProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceTimeout")
    private Integer serviceTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseBackendService")
    private Boolean useBackendService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcConfig")
    private String vpcConfig;

    private ModifyApiConfigurationRequest(Builder builder) {
        super(builder);
        this.allowSignatureMethod = builder.allowSignatureMethod;
        this.apiId = builder.apiId;
        this.apiName = builder.apiName;
        this.appCodeAuthType = builder.appCodeAuthType;
        this.authType = builder.authType;
        this.backendName = builder.backendName;
        this.bodyFormat = builder.bodyFormat;
        this.bodyModel = builder.bodyModel;
        this.contentTypeCategory = builder.contentTypeCategory;
        this.contentTypeValue = builder.contentTypeValue;
        this.description = builder.description;
        this.disableInternet = builder.disableInternet;
        this.errorCodeSamples = builder.errorCodeSamples;
        this.failResultSample = builder.failResultSample;
        this.forceNonceCheck = builder.forceNonceCheck;
        this.functionComputeConfig = builder.functionComputeConfig;
        this.httpConfig = builder.httpConfig;
        this.mockConfig = builder.mockConfig;
        this.modelName = builder.modelName;
        this.ossConfig = builder.ossConfig;
        this.postBodyDescription = builder.postBodyDescription;
        this.requestHttpMethod = builder.requestHttpMethod;
        this.requestMode = builder.requestMode;
        this.requestParameters = builder.requestParameters;
        this.requestPath = builder.requestPath;
        this.requestProtocol = builder.requestProtocol;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.securityToken = builder.securityToken;
        this.serviceParameters = builder.serviceParameters;
        this.serviceParametersMap = builder.serviceParametersMap;
        this.serviceProtocol = builder.serviceProtocol;
        this.serviceTimeout = builder.serviceTimeout;
        this.useBackendService = builder.useBackendService;
        this.visibility = builder.visibility;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiConfigurationRequest create() {
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
     * @return backendName
     */
    public String getBackendName() {
        return this.backendName;
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
     * @return contentTypeCategory
     */
    public String getContentTypeCategory() {
        return this.contentTypeCategory;
    }

    /**
     * @return contentTypeValue
     */
    public String getContentTypeValue() {
        return this.contentTypeValue;
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
     * @return functionComputeConfig
     */
    public String getFunctionComputeConfig() {
        return this.functionComputeConfig;
    }

    /**
     * @return httpConfig
     */
    public String getHttpConfig() {
        return this.httpConfig;
    }

    /**
     * @return mockConfig
     */
    public String getMockConfig() {
        return this.mockConfig;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return ossConfig
     */
    public String getOssConfig() {
        return this.ossConfig;
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
     * @return requestParameters
     */
    public String getRequestParameters() {
        return this.requestParameters;
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
     * @return useBackendService
     */
    public Boolean getUseBackendService() {
        return this.useBackendService;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    /**
     * @return vpcConfig
     */
    public String getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder extends Request.Builder<ModifyApiConfigurationRequest, Builder> {
        private String allowSignatureMethod; 
        private String apiId; 
        private String apiName; 
        private String appCodeAuthType; 
        private String authType; 
        private String backendName; 
        private String bodyFormat; 
        private String bodyModel; 
        private String contentTypeCategory; 
        private String contentTypeValue; 
        private String description; 
        private Boolean disableInternet; 
        private String errorCodeSamples; 
        private String failResultSample; 
        private Boolean forceNonceCheck; 
        private String functionComputeConfig; 
        private String httpConfig; 
        private String mockConfig; 
        private String modelName; 
        private String ossConfig; 
        private String postBodyDescription; 
        private String requestHttpMethod; 
        private String requestMode; 
        private String requestParameters; 
        private String requestPath; 
        private String requestProtocol; 
        private String resultSample; 
        private String resultType; 
        private String securityToken; 
        private String serviceParameters; 
        private String serviceParametersMap; 
        private String serviceProtocol; 
        private Integer serviceTimeout; 
        private Boolean useBackendService; 
        private String visibility; 
        private String vpcConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiConfigurationRequest request) {
            super(request);
            this.allowSignatureMethod = request.allowSignatureMethod;
            this.apiId = request.apiId;
            this.apiName = request.apiName;
            this.appCodeAuthType = request.appCodeAuthType;
            this.authType = request.authType;
            this.backendName = request.backendName;
            this.bodyFormat = request.bodyFormat;
            this.bodyModel = request.bodyModel;
            this.contentTypeCategory = request.contentTypeCategory;
            this.contentTypeValue = request.contentTypeValue;
            this.description = request.description;
            this.disableInternet = request.disableInternet;
            this.errorCodeSamples = request.errorCodeSamples;
            this.failResultSample = request.failResultSample;
            this.forceNonceCheck = request.forceNonceCheck;
            this.functionComputeConfig = request.functionComputeConfig;
            this.httpConfig = request.httpConfig;
            this.mockConfig = request.mockConfig;
            this.modelName = request.modelName;
            this.ossConfig = request.ossConfig;
            this.postBodyDescription = request.postBodyDescription;
            this.requestHttpMethod = request.requestHttpMethod;
            this.requestMode = request.requestMode;
            this.requestParameters = request.requestParameters;
            this.requestPath = request.requestPath;
            this.requestProtocol = request.requestProtocol;
            this.resultSample = request.resultSample;
            this.resultType = request.resultType;
            this.securityToken = request.securityToken;
            this.serviceParameters = request.serviceParameters;
            this.serviceParametersMap = request.serviceParametersMap;
            this.serviceProtocol = request.serviceProtocol;
            this.serviceTimeout = request.serviceTimeout;
            this.useBackendService = request.useBackendService;
            this.visibility = request.visibility;
            this.vpcConfig = request.vpcConfig;
        } 

        /**
         * <p>If the <strong>AuthType</strong> parameter is set to <strong>APP</strong>, you must include this parameter to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:</p>
         * <ul>
         * <li>HmacSHA256</li>
         * <li>HmacSHA1,HmacSHA256</li>
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
         * <p>baacc592e63a4cb6a41920d9d3f91f38</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>testModifyApiName</p>
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>If the <strong>AuthType</strong> parameter is set to <strong>APP</strong>, the valid values are:</p>
         * <ul>
         * <li><strong>DEFAULT</strong>: The default value that is used if no other values are passed. This value indicates that the settings of the group are used.</li>
         * <li><strong>DISABLE</strong>: The authentication is disabled.</li>
         * <li><strong>HEADER</strong>: AppCode can be placed in the Header parameter for authentication.</li>
         * <li><strong>HEADER_QUERY</strong>: AppCode can be placed in the Header or Query parameter for authentication.</li>
         * </ul>
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
         * <p>API安全认证类型，目前可以取值：</p>
         * <ul>
         * <li><strong>APP</strong>：只允许已授权的APP调用</li>
         * <li><strong>ANONYMOUS</strong>：允许匿名调用，设置为允许匿名调用需要注意：<ul>
         * <li>任何能够获取该API服务信息的人，都将能够调用该API。网关不会对调用者做身份认证，也无法设置按用户的流量控制，若开放该API请设置好按API的流量控制；</li>
         * <li>AppCodeAuthType的值不会生效。</li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The name of the backend service. This parameter takes effect only when the UseBackendService parameter is set to TRUE.</p>
         * 
         * <strong>example:</strong>
         * <p>testBackendService</p>
         */
        public Builder backendName(String backendName) {
            this.putQueryParameter("BackendName", backendName);
            this.backendName = backendName;
            return this;
        }

        /**
         * <p>This parameter takes effect only when the <strong>RequestMode</strong> parameter is set to <strong>MAPPING</strong>.</p>
         * <p>The format in which data is transmitted to the server for POST and PUT requests. Valid values: <strong>FORM</strong> and <strong>STREAM</strong>. FORM indicates that data is transmitted in the key-value pair format. STREAM indicates that data is transmitted as byte streams.</p>
         * 
         * <strong>example:</strong>
         * <p>STREAM</p>
         */
        public Builder bodyFormat(String bodyFormat) {
            this.putQueryParameter("BodyFormat", bodyFormat);
            this.bodyFormat = bodyFormat;
            return this;
        }

        /**
         * <p>The body model.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://apigateway.aliyun.com/models/f4e7333c****40dcbaf7c9da553ccd8d/3ab61f775b****d4bc35e993****87aa8">https://apigateway.aliyun.com/models/f4e7333c****40dcbaf7c9da553ccd8d/3ab61f775b****d4bc35e993****87aa8</a></p>
         */
        public Builder bodyModel(String bodyModel) {
            this.putQueryParameter("BodyModel", bodyModel);
            this.bodyModel = bodyModel;
            return this;
        }

        /**
         * <p>The ContentType configuration of the backend request.</p>
         * <ul>
         * <li>DEFAULT: the default configuration in API Gateway</li>
         * <li>CUSTOM: a custom configuration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder contentTypeCategory(String contentTypeCategory) {
            this.putQueryParameter("ContentTypeCategory", contentTypeCategory);
            this.contentTypeCategory = contentTypeCategory;
            return this;
        }

        /**
         * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>application/x-www-form-urlencoded; charset=UTF-8</p>
         */
        public Builder contentTypeValue(String contentTypeValue) {
            this.putQueryParameter("ContentTypeValue", contentTypeValue);
            this.contentTypeValue = contentTypeValue;
            return this;
        }

        /**
         * <p>The description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>TestModifyDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <ul>
         * <li>Specifies whether to call the API only in an internal network. If the <strong>DisableInternet</strong> parameter is set to <strong>true</strong>, the API can be called only in an internal network.</li>
         * <li>If the <strong>DisableInternet</strong> parameter is set to <strong>false</strong>, the API can be called over the Internet and in an internal network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableInternet(Boolean disableInternet) {
            this.putQueryParameter("DisableInternet", disableInternet);
            this.disableInternet = disableInternet;
            return this;
        }

        /**
         * <p>The sample error codes returned by the backend service.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/44392.html">ErrorCodeSample</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Code&quot;:&quot;400&quot;,&quot;Message&quot;:&quot;Missing the userId&quot;,&quot;Description&quot;:&quot;param invalid&quot;}]</p>
         */
        public Builder errorCodeSamples(String errorCodeSamples) {
            this.putQueryParameter("ErrorCodeSamples", errorCodeSamples);
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * <p>The sample error response from the backend service. This value is used only to generate documents. It does not affect the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;errorCode&quot;:&quot;fail&quot;,&quot;errorMessage&quot;:&quot;param invalid&quot;}</p>
         */
        public Builder failResultSample(String failResultSample) {
            this.putQueryParameter("FailResultSample", failResultSample);
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * <ul>
         * <li>Specifies whether to forcibly check X-Ca-Nonce. If the <strong>ForceNonceCheck</strong> parameter is set to <strong>true</strong>, X-Ca-Nonce is forcibly checked. X-Ca-Nonce is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</li>
         * <li>If the <strong>ForceNonceCheck</strong> parameter is set to <strong>false</strong>, X-Ca-Nonce is not checked. If you do not modify this parameter when you modify an API, the original value is used.</li>
         * </ul>
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
         * <p>The Function Compute configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FcType&quot;:&quot;FCEvent&quot;,&quot;FcRegionId&quot;:&quot;cn-hangzhou&quot;,&quot;RoleArn&quot;:&quot;acs:ram::xxxxxxxx:role/aliyunserviceroleforapigateway&quot;,&quot;selectServiceName&quot;:&quot;fcTest&quot;,&quot;FunctionName&quot;:&quot;funcTest&quot;,&quot;selectFunctionName&quot;:&quot;funcTest&quot;,&quot;Qualifier&quot;:&quot;LATEST&quot;,&quot;Path&quot;:&quot;&quot;,&quot;FcBaseUrl&quot;:&quot;&quot;,&quot;ServiceName&quot;:&quot;fcTest&quot;}</p>
         */
        public Builder functionComputeConfig(String functionComputeConfig) {
            this.putQueryParameter("FunctionComputeConfig", functionComputeConfig);
            this.functionComputeConfig = functionComputeConfig;
            return this;
        }

        /**
         * <p>The HTTP configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;serviceAddress&quot;:&quot;<a href="http://test.api.com%22,%22servicePath%22:%22/test/api%22,%22serviceHttpMethod%22:%22GET%22%7D">http://test.api.com&quot;,&quot;servicePath&quot;:&quot;/test/api&quot;,&quot;serviceHttpMethod&quot;:&quot;GET&quot;}</a></p>
         */
        public Builder httpConfig(String httpConfig) {
            this.putQueryParameter("HttpConfig", httpConfig);
            this.httpConfig = httpConfig;
            return this;
        }

        /**
         * <p>The Mock configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MockResult&quot;:&quot;test&quot;,&quot;MockHeaders&quot;:[{&quot;HeaderName&quot;:&quot;testHeader&quot;,&quot;HeaderValue&quot;:&quot;testHeader&quot;}],&quot;MockStatusCode&quot;:&quot;400&quot;}</p>
         */
        public Builder mockConfig(String mockConfig) {
            this.putQueryParameter("MockConfig", mockConfig);
            this.mockConfig = mockConfig;
            return this;
        }

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The OSS configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OssRegionId&quot;:&quot;cn-hangzhou&quot;,&quot;Key&quot;:&quot;/test.html&quot;,&quot;BucketName&quot;:&quot;test-api-oss&quot;,&quot;Action&quot;:&quot;GetObject&quot;}</p>
         */
        public Builder ossConfig(String ossConfig) {
            this.putQueryParameter("OssConfig", ossConfig);
            this.ossConfig = ossConfig;
            return this;
        }

        /**
         * <p>The description of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the request body</p>
         */
        public Builder postBodyDescription(String postBodyDescription) {
            this.putQueryParameter("PostBodyDescription", postBodyDescription);
            this.postBodyDescription = postBodyDescription;
            return this;
        }

        /**
         * <p>The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        public Builder requestHttpMethod(String requestHttpMethod) {
            this.putQueryParameter("RequestHttpMethod", requestHttpMethod);
            this.requestHttpMethod = requestHttpMethod;
            return this;
        }

        /**
         * <p>The request mode. Valid values:</p>
         * <ul>
         * <li>MAPPING: Parameters are mapped. Unknown parameters are filtered out.</li>
         * <li>PASSTHROUGH: Parameters are passed through.</li>
         * <li>MAPPING_PASSTHROUGH: Parameters are mapped. Unknown parameters are passed through.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MAPPING</p>
         */
        public Builder requestMode(String requestMode) {
            this.putQueryParameter("RequestMode", requestMode);
            this.requestMode = requestMode;
            return this;
        }

        /**
         * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43986.html">RequestParameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Head&quot;,&quot;orderNumber&quot;:2},&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;OPTIONAL&quot;,&quot;isHide&quot;:false,&quot;ApiParameterName&quot;:&quot;header1&quot;,&quot;DefaultValue&quot;:&quot;123124&quot;,&quot;Location&quot;:&quot;Head&quot;},{&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Head&quot;,&quot;orderNumber&quot;:2},&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;REQUIRED&quot;,&quot;isHide&quot;:false,&quot;ApiParameterName&quot;:&quot;header2&quot;,&quot;DefaultValue&quot;:&quot;&quot;,&quot;Location&quot;:&quot;Head&quot;},{&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Query&quot;,&quot;orderNumber&quot;:3},&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;OPTIONAL&quot;,&quot;isHide&quot;:false,&quot;ApiParameterName&quot;:&quot;query1&quot;,&quot;DefaultValue&quot;:&quot;1245&quot;,&quot;Location&quot;:&quot;Query&quot;},{&quot;ApiParameterName&quot;:&quot;CaClientIp&quot;,&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Query&quot;,&quot;orderNumber&quot;:0},&quot;Location&quot;:&quot;Query&quot;,&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;REQUIRED&quot;,&quot;Description&quot;:&quot;ClientIP&quot;},{&quot;ApiParameterName&quot;:&quot;testConstant&quot;,&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Head&quot;,&quot;orderNumber&quot;:0},&quot;Location&quot;:&quot;Head&quot;,&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;REQUIRED&quot;,&quot;DefaultValue&quot;:&quot;111&quot;}]</p>
         */
        public Builder requestParameters(String requestParameters) {
            this.putQueryParameter("RequestParameters", requestParameters);
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * <p>The path of the API request. If the complete API URL is <code>http://api.a.com:8080/object/add?key1=value1&amp;key2=value2</code>, the path of the API request is <code>/object/add</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/api</p>
         */
        public Builder requestPath(String requestPath) {
            this.putQueryParameter("RequestPath", requestPath);
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
            this.putQueryParameter("RequestProtocol", requestProtocol);
            this.requestProtocol = requestProtocol;
            return this;
        }

        /**
         * <p>The sample response from the backend service. This value is used only to generate documents. It does not affect the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  &quot;status&quot;: 0,\n  &quot;data&quot;: {\n    &quot;count&quot;: 1,\n    &quot;list&quot;: [\n      &quot;352&quot;\n    ]\n  },\n  &quot;message&quot;: &quot;success&quot;\n}</p>
         */
        public Builder resultSample(String resultSample) {
            this.putQueryParameter("ResultSample", resultSample);
            this.resultSample = resultSample;
            return this;
        }

        /**
         * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML. This value is used only to generate documents. It does not affect the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
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
         * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43988.html">ServiceParameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ServiceParameterName&quot;:&quot;header1&quot;,&quot;Location&quot;:&quot;Head&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;REQUEST&quot;},{&quot;ServiceParameterName&quot;:&quot;header2&quot;,&quot;Location&quot;:&quot;Query&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;REQUEST&quot;},{&quot;ServiceParameterName&quot;:&quot;query1&quot;,&quot;Location&quot;:&quot;Head&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;REQUEST&quot;},{&quot;ServiceParameterName&quot;:&quot;ipp&quot;,&quot;Location&quot;:&quot;Query&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;SYSTEM&quot;},{&quot;ServiceParameterName&quot;:&quot;testConstant&quot;,&quot;Location&quot;:&quot;Head&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;CONSTANT&quot;}]</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43989.html">ServiceParameterMap</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ServiceParameterName&quot;:&quot;header1&quot;,&quot;RequestParameterName&quot;:&quot;header1&quot;},{&quot;ServiceParameterName&quot;:&quot;header2&quot;,&quot;RequestParameterName&quot;:&quot;header2&quot;},{&quot;ServiceParameterName&quot;:&quot;query1&quot;,&quot;RequestParameterName&quot;:&quot;query1&quot;},{&quot;ServiceParameterName&quot;:&quot;ipp&quot;,&quot;RequestParameterName&quot;:&quot;CaClientIp&quot;},{&quot;ServiceParameterName&quot;:&quot;testConstant&quot;,&quot;RequestParameterName&quot;:&quot;testConstant&quot;}]</p>
         */
        public Builder serviceParametersMap(String serviceParametersMap) {
            this.putQueryParameter("ServiceParametersMap", serviceParametersMap);
            this.serviceParametersMap = serviceParametersMap;
            return this;
        }

        /**
         * <p>The protocol that is used to access backend services. Valid values:</p>
         * <ul>
         * <li>Http: for backend services that use HTTP or HTTPS</li>
         * <li>Vpc: for backend services that use VPC</li>
         * <li>FC: for Function Compute</li>
         * <li>OSS: for Object Storage Service</li>
         * <li>Mock: for backend services that use the Mock mode</li>
         * <li>EventBridge: for EventBridge</li>
         * </ul>
         * <p>You must specify the config value for the corresponding backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder serviceProtocol(String serviceProtocol) {
            this.putQueryParameter("ServiceProtocol", serviceProtocol);
            this.serviceProtocol = serviceProtocol;
            return this;
        }

        /**
         * <p>The timeout period of the backend service. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder serviceTimeout(Integer serviceTimeout) {
            this.putQueryParameter("ServiceTimeout", serviceTimeout);
            this.serviceTimeout = serviceTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to use the information about the created backend service. Valid values:</p>
         * <ul>
         * <li>TRUE: uses the information about the created backend service.</li>
         * <li>FALSE: uses the information about the custom backend service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRUE</p>
         */
        public Builder useBackendService(Boolean useBackendService) {
            this.putQueryParameter("UseBackendService", useBackendService);
            this.useBackendService = useBackendService;
            return this;
        }

        /**
         * <p>Specifies whether to make the API public. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC:</strong> The API is public. If this parameter is set to PUBLIC, the API is displayed on the APIs page for all users after the API is published to the production environment.</li>
         * <li><strong>PRIVATE:</strong> The API is private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</li>
         * </ul>
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
         * <p>The VPC configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VpcId&quot;:&quot;vpc-xxxxxxx&quot;,&quot;Name&quot;:&quot;testVpc&quot;,&quot;InstanceId&quot;:&quot;i-p0ssssss&quot;,&quot;Port&quot;:80,&quot;servicePath&quot;:&quot;/test/vpc&quot;,&quot;serviceHttpMethod&quot;:&quot;HEAD&quot;}</p>
         */
        public Builder vpcConfig(String vpcConfig) {
            this.putQueryParameter("VpcConfig", vpcConfig);
            this.vpcConfig = vpcConfig;
            return this;
        }

        @Override
        public ModifyApiConfigurationRequest build() {
            return new ModifyApiConfigurationRequest(this);
        } 

    } 

}
