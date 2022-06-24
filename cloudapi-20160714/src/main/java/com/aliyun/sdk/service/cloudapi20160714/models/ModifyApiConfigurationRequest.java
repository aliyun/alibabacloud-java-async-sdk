// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiConfigurationRequest</p>
 */
public class ModifyApiConfigurationRequest extends Request {
    @Query
    @NameInMap("AllowSignatureMethod")
    private String allowSignatureMethod;

    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("ApiName")
    private String apiName;

    @Query
    @NameInMap("AppCodeAuthType")
    private String appCodeAuthType;

    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("BackendName")
    private String backendName;

    @Query
    @NameInMap("BodyFormat")
    private String bodyFormat;

    @Query
    @NameInMap("BodyModel")
    private String bodyModel;

    @Query
    @NameInMap("ContentTypeCategory")
    private String contentTypeCategory;

    @Query
    @NameInMap("ContentTypeValue")
    private String contentTypeValue;

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
    @NameInMap("FunctionComputeConfig")
    private String functionComputeConfig;

    @Query
    @NameInMap("HttpConfig")
    private String httpConfig;

    @Query
    @NameInMap("MockConfig")
    private String mockConfig;

    @Query
    @NameInMap("ModelName")
    private String modelName;

    @Query
    @NameInMap("OssConfig")
    private String ossConfig;

    @Query
    @NameInMap("PostBodyDescription")
    private String postBodyDescription;

    @Query
    @NameInMap("RequestHttpMethod")
    private String requestHttpMethod;

    @Query
    @NameInMap("RequestMode")
    private String requestMode;

    @Query
    @NameInMap("RequestParameters")
    private String requestParameters;

    @Query
    @NameInMap("RequestPath")
    private String requestPath;

    @Query
    @NameInMap("RequestProtocol")
    private String requestProtocol;

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
    @NameInMap("ServiceParameters")
    private String serviceParameters;

    @Query
    @NameInMap("ServiceParametersMap")
    private String serviceParametersMap;

    @Query
    @NameInMap("ServiceProtocol")
    private String serviceProtocol;

    @Query
    @NameInMap("ServiceTimeout")
    private Integer serviceTimeout;

    @Query
    @NameInMap("UseBackendService")
    private Boolean useBackendService;

    @Query
    @NameInMap("Visibility")
    private String visibility;

    @Query
    @NameInMap("VpcConfig")
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
         * AllowSignatureMethod.
         */
        public Builder allowSignatureMethod(String allowSignatureMethod) {
            this.putQueryParameter("AllowSignatureMethod", allowSignatureMethod);
            this.allowSignatureMethod = allowSignatureMethod;
            return this;
        }

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * AppCodeAuthType.
         */
        public Builder appCodeAuthType(String appCodeAuthType) {
            this.putQueryParameter("AppCodeAuthType", appCodeAuthType);
            this.appCodeAuthType = appCodeAuthType;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * BackendName.
         */
        public Builder backendName(String backendName) {
            this.putQueryParameter("BackendName", backendName);
            this.backendName = backendName;
            return this;
        }

        /**
         * BodyFormat.
         */
        public Builder bodyFormat(String bodyFormat) {
            this.putQueryParameter("BodyFormat", bodyFormat);
            this.bodyFormat = bodyFormat;
            return this;
        }

        /**
         * BodyModel.
         */
        public Builder bodyModel(String bodyModel) {
            this.putQueryParameter("BodyModel", bodyModel);
            this.bodyModel = bodyModel;
            return this;
        }

        /**
         * ContentTypeCategory.
         */
        public Builder contentTypeCategory(String contentTypeCategory) {
            this.putQueryParameter("ContentTypeCategory", contentTypeCategory);
            this.contentTypeCategory = contentTypeCategory;
            return this;
        }

        /**
         * ContentTypeValue.
         */
        public Builder contentTypeValue(String contentTypeValue) {
            this.putQueryParameter("ContentTypeValue", contentTypeValue);
            this.contentTypeValue = contentTypeValue;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisableInternet.
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
            this.putQueryParameter("ErrorCodeSamples", errorCodeSamples);
            this.errorCodeSamples = errorCodeSamples;
            return this;
        }

        /**
         * FailResultSample.
         */
        public Builder failResultSample(String failResultSample) {
            this.putQueryParameter("FailResultSample", failResultSample);
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * ForceNonceCheck.
         */
        public Builder forceNonceCheck(Boolean forceNonceCheck) {
            this.putQueryParameter("ForceNonceCheck", forceNonceCheck);
            this.forceNonceCheck = forceNonceCheck;
            return this;
        }

        /**
         * FunctionComputeConfig.
         */
        public Builder functionComputeConfig(String functionComputeConfig) {
            this.putQueryParameter("FunctionComputeConfig", functionComputeConfig);
            this.functionComputeConfig = functionComputeConfig;
            return this;
        }

        /**
         * HttpConfig.
         */
        public Builder httpConfig(String httpConfig) {
            this.putQueryParameter("HttpConfig", httpConfig);
            this.httpConfig = httpConfig;
            return this;
        }

        /**
         * MockConfig.
         */
        public Builder mockConfig(String mockConfig) {
            this.putQueryParameter("MockConfig", mockConfig);
            this.mockConfig = mockConfig;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * OssConfig.
         */
        public Builder ossConfig(String ossConfig) {
            this.putQueryParameter("OssConfig", ossConfig);
            this.ossConfig = ossConfig;
            return this;
        }

        /**
         * PostBodyDescription.
         */
        public Builder postBodyDescription(String postBodyDescription) {
            this.putQueryParameter("PostBodyDescription", postBodyDescription);
            this.postBodyDescription = postBodyDescription;
            return this;
        }

        /**
         * RequestHttpMethod.
         */
        public Builder requestHttpMethod(String requestHttpMethod) {
            this.putQueryParameter("RequestHttpMethod", requestHttpMethod);
            this.requestHttpMethod = requestHttpMethod;
            return this;
        }

        /**
         * RequestMode.
         */
        public Builder requestMode(String requestMode) {
            this.putQueryParameter("RequestMode", requestMode);
            this.requestMode = requestMode;
            return this;
        }

        /**
         * RequestParameters.
         */
        public Builder requestParameters(String requestParameters) {
            this.putQueryParameter("RequestParameters", requestParameters);
            this.requestParameters = requestParameters;
            return this;
        }

        /**
         * RequestPath.
         */
        public Builder requestPath(String requestPath) {
            this.putQueryParameter("RequestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * RequestProtocol.
         */
        public Builder requestProtocol(String requestProtocol) {
            this.putQueryParameter("RequestProtocol", requestProtocol);
            this.requestProtocol = requestProtocol;
            return this;
        }

        /**
         * ResultSample.
         */
        public Builder resultSample(String resultSample) {
            this.putQueryParameter("ResultSample", resultSample);
            this.resultSample = resultSample;
            return this;
        }

        /**
         * ResultType.
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
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * ServiceParametersMap.
         */
        public Builder serviceParametersMap(String serviceParametersMap) {
            this.putQueryParameter("ServiceParametersMap", serviceParametersMap);
            this.serviceParametersMap = serviceParametersMap;
            return this;
        }

        /**
         * ServiceProtocol.
         */
        public Builder serviceProtocol(String serviceProtocol) {
            this.putQueryParameter("ServiceProtocol", serviceProtocol);
            this.serviceProtocol = serviceProtocol;
            return this;
        }

        /**
         * ServiceTimeout.
         */
        public Builder serviceTimeout(Integer serviceTimeout) {
            this.putQueryParameter("ServiceTimeout", serviceTimeout);
            this.serviceTimeout = serviceTimeout;
            return this;
        }

        /**
         * UseBackendService.
         */
        public Builder useBackendService(Boolean useBackendService) {
            this.putQueryParameter("UseBackendService", useBackendService);
            this.useBackendService = useBackendService;
            return this;
        }

        /**
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * VpcConfig.
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
