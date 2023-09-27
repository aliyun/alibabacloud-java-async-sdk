// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

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
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ErrorCodeSamples")
    private String errorCodeSamples;

    @Query
    @NameInMap("FailResultSample")
    private String failResultSample;

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
    @NameInMap("RequestParamters")
    private String requestParamters;

    @Query
    @NameInMap("ResultDescriptions")
    private String resultDescriptions;

    @Query
    @NameInMap("ResultSample")
    @Validation(required = true)
    private String resultSample;

    @Query
    @NameInMap("ResultType")
    @Validation(required = true)
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
        this.authType = builder.authType;
        this.description = builder.description;
        this.errorCodeSamples = builder.errorCodeSamples;
        this.failResultSample = builder.failResultSample;
        this.groupId = builder.groupId;
        this.openIdConnectConfig = builder.openIdConnectConfig;
        this.requestConfig = builder.requestConfig;
        this.requestParamters = builder.requestParamters;
        this.resultDescriptions = builder.resultDescriptions;
        this.resultSample = builder.resultSample;
        this.resultType = builder.resultType;
        this.securityToken = builder.securityToken;
        this.serviceConfig = builder.serviceConfig;
        this.serviceParameters = builder.serviceParameters;
        this.serviceParametersMap = builder.serviceParametersMap;
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
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return requestParamters
     */
    public String getRequestParamters() {
        return this.requestParamters;
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
        private String authType; 
        private String description; 
        private String errorCodeSamples; 
        private String failResultSample; 
        private String groupId; 
        private String openIdConnectConfig; 
        private String requestConfig; 
        private String requestParamters; 
        private String resultDescriptions; 
        private String resultSample; 
        private String resultType; 
        private String securityToken; 
        private String serviceConfig; 
        private String serviceParameters; 
        private String serviceParametersMap; 
        private String visibility; 
        private String webSocketApiType; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiRequest request) {
            super(request);
            this.allowSignatureMethod = request.allowSignatureMethod;
            this.apiName = request.apiName;
            this.authType = request.authType;
            this.description = request.description;
            this.errorCodeSamples = request.errorCodeSamples;
            this.failResultSample = request.failResultSample;
            this.groupId = request.groupId;
            this.openIdConnectConfig = request.openIdConnectConfig;
            this.requestConfig = request.requestConfig;
            this.requestParamters = request.requestParamters;
            this.resultDescriptions = request.resultDescriptions;
            this.resultSample = request.resultSample;
            this.resultType = request.resultType;
            this.securityToken = request.securityToken;
            this.serviceConfig = request.serviceConfig;
            this.serviceParameters = request.serviceParameters;
            this.serviceParametersMap = request.serviceParametersMap;
            this.visibility = request.visibility;
            this.webSocketApiType = request.webSocketApiType;
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
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * OpenIdConnectConfig.
         */
        public Builder openIdConnectConfig(String openIdConnectConfig) {
            this.putQueryParameter("OpenIdConnectConfig", openIdConnectConfig);
            this.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * RequestConfig.
         */
        public Builder requestConfig(String requestConfig) {
            this.putQueryParameter("RequestConfig", requestConfig);
            this.requestConfig = requestConfig;
            return this;
        }

        /**
         * RequestParamters.
         */
        public Builder requestParamters(String requestParamters) {
            this.putQueryParameter("RequestParamters", requestParamters);
            this.requestParamters = requestParamters;
            return this;
        }

        /**
         * ResultDescriptions.
         */
        public Builder resultDescriptions(String resultDescriptions) {
            this.putQueryParameter("ResultDescriptions", resultDescriptions);
            this.resultDescriptions = resultDescriptions;
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
         * ServiceConfig.
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
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * WebSocketApiType.
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
