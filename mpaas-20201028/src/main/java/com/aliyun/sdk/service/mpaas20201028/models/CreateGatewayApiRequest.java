// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link CreateGatewayApiRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayApiRequest</p>
 */
public class CreateGatewayApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiStatus")
    private String apiStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthRuleName")
    private String authRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CacheRule")
    private CacheRule cacheRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Charset")
    private String charset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultLimitRule")
    private DefaultLimitRule defaultLimitRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HeaderRules")
    private java.util.List<HeaderRules> headerRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InterfaceType")
    private String interfaceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LimitRule")
    private LimitRule limitRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MethodName")
    private String methodName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MigrateRule")
    private MigrateRule migrateRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MockRule")
    private MockRule mockRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedEncrypt")
    private Boolean needEncrypt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedJsonp")
    private Boolean needJsonp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedSign")
    private Boolean needSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestBodyModel")
    private String requestBodyModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestParams")
    private java.util.List<RequestParams> requestParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseBodyModel")
    private String responseBodyModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RpcParameterTypes")
    private java.util.List<String> rpcParameterTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Serialization")
    private String serialization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateGatewayApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiName = builder.apiName;
        this.apiStatus = builder.apiStatus;
        this.apiType = builder.apiType;
        this.appId = builder.appId;
        this.authRuleName = builder.authRuleName;
        this.cacheRule = builder.cacheRule;
        this.charset = builder.charset;
        this.contentType = builder.contentType;
        this.defaultLimitRule = builder.defaultLimitRule;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.headerRules = builder.headerRules;
        this.interfaceType = builder.interfaceType;
        this.limitRule = builder.limitRule;
        this.method = builder.method;
        this.methodName = builder.methodName;
        this.migrateRule = builder.migrateRule;
        this.mockRule = builder.mockRule;
        this.needEncrypt = builder.needEncrypt;
        this.needJsonp = builder.needJsonp;
        this.needSign = builder.needSign;
        this.operationType = builder.operationType;
        this.path = builder.path;
        this.requestBodyModel = builder.requestBodyModel;
        this.requestParams = builder.requestParams;
        this.responseBodyModel = builder.responseBodyModel;
        this.rpcParameterTypes = builder.rpcParameterTypes;
        this.serialization = builder.serialization;
        this.tenantId = builder.tenantId;
        this.timeout = builder.timeout;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return apiStatus
     */
    public String getApiStatus() {
        return this.apiStatus;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return authRuleName
     */
    public String getAuthRuleName() {
        return this.authRuleName;
    }

    /**
     * @return cacheRule
     */
    public CacheRule getCacheRule() {
        return this.cacheRule;
    }

    /**
     * @return charset
     */
    public String getCharset() {
        return this.charset;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return defaultLimitRule
     */
    public DefaultLimitRule getDefaultLimitRule() {
        return this.defaultLimitRule;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return headerRules
     */
    public java.util.List<HeaderRules> getHeaderRules() {
        return this.headerRules;
    }

    /**
     * @return interfaceType
     */
    public String getInterfaceType() {
        return this.interfaceType;
    }

    /**
     * @return limitRule
     */
    public LimitRule getLimitRule() {
        return this.limitRule;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return methodName
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * @return migrateRule
     */
    public MigrateRule getMigrateRule() {
        return this.migrateRule;
    }

    /**
     * @return mockRule
     */
    public MockRule getMockRule() {
        return this.mockRule;
    }

    /**
     * @return needEncrypt
     */
    public Boolean getNeedEncrypt() {
        return this.needEncrypt;
    }

    /**
     * @return needJsonp
     */
    public Boolean getNeedJsonp() {
        return this.needJsonp;
    }

    /**
     * @return needSign
     */
    public Boolean getNeedSign() {
        return this.needSign;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return requestBodyModel
     */
    public String getRequestBodyModel() {
        return this.requestBodyModel;
    }

    /**
     * @return requestParams
     */
    public java.util.List<RequestParams> getRequestParams() {
        return this.requestParams;
    }

    /**
     * @return responseBodyModel
     */
    public String getResponseBodyModel() {
        return this.responseBodyModel;
    }

    /**
     * @return rpcParameterTypes
     */
    public java.util.List<String> getRpcParameterTypes() {
        return this.rpcParameterTypes;
    }

    /**
     * @return serialization
     */
    public String getSerialization() {
        return this.serialization;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateGatewayApiRequest, Builder> {
        private String regionId; 
        private String apiName; 
        private String apiStatus; 
        private String apiType; 
        private String appId; 
        private String authRuleName; 
        private CacheRule cacheRule; 
        private String charset; 
        private String contentType; 
        private DefaultLimitRule defaultLimitRule; 
        private String description; 
        private Long groupId; 
        private java.util.List<HeaderRules> headerRules; 
        private String interfaceType; 
        private LimitRule limitRule; 
        private String method; 
        private String methodName; 
        private MigrateRule migrateRule; 
        private MockRule mockRule; 
        private Boolean needEncrypt; 
        private Boolean needJsonp; 
        private Boolean needSign; 
        private String operationType; 
        private String path; 
        private String requestBodyModel; 
        private java.util.List<RequestParams> requestParams; 
        private String responseBodyModel; 
        private java.util.List<String> rpcParameterTypes; 
        private String serialization; 
        private String tenantId; 
        private Integer timeout; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiName = request.apiName;
            this.apiStatus = request.apiStatus;
            this.apiType = request.apiType;
            this.appId = request.appId;
            this.authRuleName = request.authRuleName;
            this.cacheRule = request.cacheRule;
            this.charset = request.charset;
            this.contentType = request.contentType;
            this.defaultLimitRule = request.defaultLimitRule;
            this.description = request.description;
            this.groupId = request.groupId;
            this.headerRules = request.headerRules;
            this.interfaceType = request.interfaceType;
            this.limitRule = request.limitRule;
            this.method = request.method;
            this.methodName = request.methodName;
            this.migrateRule = request.migrateRule;
            this.mockRule = request.mockRule;
            this.needEncrypt = request.needEncrypt;
            this.needJsonp = request.needJsonp;
            this.needSign = request.needSign;
            this.operationType = request.operationType;
            this.path = request.path;
            this.requestBodyModel = request.requestBodyModel;
            this.requestParams = request.requestParams;
            this.responseBodyModel = request.responseBodyModel;
            this.rpcParameterTypes = request.rpcParameterTypes;
            this.serialization = request.serialization;
            this.tenantId = request.tenantId;
            this.timeout = request.timeout;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiName(String apiName) {
            this.putBodyParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * ApiStatus.
         */
        public Builder apiStatus(String apiStatus) {
            this.putBodyParameter("ApiStatus", apiStatus);
            this.apiStatus = apiStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiType(String apiType) {
            this.putBodyParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AuthRuleName.
         */
        public Builder authRuleName(String authRuleName) {
            this.putBodyParameter("AuthRuleName", authRuleName);
            this.authRuleName = authRuleName;
            return this;
        }

        /**
         * CacheRule.
         */
        public Builder cacheRule(CacheRule cacheRule) {
            String cacheRuleShrink = shrink(cacheRule, "CacheRule", "json");
            this.putBodyParameter("CacheRule", cacheRuleShrink);
            this.cacheRule = cacheRule;
            return this;
        }

        /**
         * Charset.
         */
        public Builder charset(String charset) {
            this.putBodyParameter("Charset", charset);
            this.charset = charset;
            return this;
        }

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * DefaultLimitRule.
         */
        public Builder defaultLimitRule(DefaultLimitRule defaultLimitRule) {
            String defaultLimitRuleShrink = shrink(defaultLimitRule, "DefaultLimitRule", "json");
            this.putBodyParameter("DefaultLimitRule", defaultLimitRuleShrink);
            this.defaultLimitRule = defaultLimitRule;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupId(Long groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * HeaderRules.
         */
        public Builder headerRules(java.util.List<HeaderRules> headerRules) {
            String headerRulesShrink = shrink(headerRules, "HeaderRules", "json");
            this.putBodyParameter("HeaderRules", headerRulesShrink);
            this.headerRules = headerRules;
            return this;
        }

        /**
         * InterfaceType.
         */
        public Builder interfaceType(String interfaceType) {
            this.putBodyParameter("InterfaceType", interfaceType);
            this.interfaceType = interfaceType;
            return this;
        }

        /**
         * LimitRule.
         */
        public Builder limitRule(LimitRule limitRule) {
            String limitRuleShrink = shrink(limitRule, "LimitRule", "json");
            this.putBodyParameter("LimitRule", limitRuleShrink);
            this.limitRule = limitRule;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * MethodName.
         */
        public Builder methodName(String methodName) {
            this.putBodyParameter("MethodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * MigrateRule.
         */
        public Builder migrateRule(MigrateRule migrateRule) {
            String migrateRuleShrink = shrink(migrateRule, "MigrateRule", "json");
            this.putBodyParameter("MigrateRule", migrateRuleShrink);
            this.migrateRule = migrateRule;
            return this;
        }

        /**
         * MockRule.
         */
        public Builder mockRule(MockRule mockRule) {
            String mockRuleShrink = shrink(mockRule, "MockRule", "json");
            this.putBodyParameter("MockRule", mockRuleShrink);
            this.mockRule = mockRule;
            return this;
        }

        /**
         * NeedEncrypt.
         */
        public Builder needEncrypt(Boolean needEncrypt) {
            this.putBodyParameter("NeedEncrypt", needEncrypt);
            this.needEncrypt = needEncrypt;
            return this;
        }

        /**
         * NeedJsonp.
         */
        public Builder needJsonp(Boolean needJsonp) {
            this.putBodyParameter("NeedJsonp", needJsonp);
            this.needJsonp = needJsonp;
            return this;
        }

        /**
         * NeedSign.
         */
        public Builder needSign(Boolean needSign) {
            this.putBodyParameter("NeedSign", needSign);
            this.needSign = needSign;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * RequestBodyModel.
         */
        public Builder requestBodyModel(String requestBodyModel) {
            this.putBodyParameter("RequestBodyModel", requestBodyModel);
            this.requestBodyModel = requestBodyModel;
            return this;
        }

        /**
         * RequestParams.
         */
        public Builder requestParams(java.util.List<RequestParams> requestParams) {
            String requestParamsShrink = shrink(requestParams, "RequestParams", "json");
            this.putBodyParameter("RequestParams", requestParamsShrink);
            this.requestParams = requestParams;
            return this;
        }

        /**
         * ResponseBodyModel.
         */
        public Builder responseBodyModel(String responseBodyModel) {
            this.putBodyParameter("ResponseBodyModel", responseBodyModel);
            this.responseBodyModel = responseBodyModel;
            return this;
        }

        /**
         * RpcParameterTypes.
         */
        public Builder rpcParameterTypes(java.util.List<String> rpcParameterTypes) {
            String rpcParameterTypesShrink = shrink(rpcParameterTypes, "RpcParameterTypes", "json");
            this.putBodyParameter("RpcParameterTypes", rpcParameterTypesShrink);
            this.rpcParameterTypes = rpcParameterTypes;
            return this;
        }

        /**
         * Serialization.
         */
        public Builder serialization(String serialization) {
            this.putBodyParameter("Serialization", serialization);
            this.serialization = serialization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateGatewayApiRequest build() {
            return new CreateGatewayApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGatewayApiRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayApiRequest</p>
     */
    public static class CacheRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheKey")
        private String cacheKey;

        @com.aliyun.core.annotation.NameInMap("NeedCache")
        private Boolean needCache;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Long ttl;

        private CacheRule(Builder builder) {
            this.cacheKey = builder.cacheKey;
            this.needCache = builder.needCache;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CacheRule create() {
            return builder().build();
        }

        /**
         * @return cacheKey
         */
        public String getCacheKey() {
            return this.cacheKey;
        }

        /**
         * @return needCache
         */
        public Boolean getNeedCache() {
            return this.needCache;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private String cacheKey; 
            private Boolean needCache; 
            private Long ttl; 

            private Builder() {
            } 

            private Builder(CacheRule model) {
                this.cacheKey = model.cacheKey;
                this.needCache = model.needCache;
                this.ttl = model.ttl;
            } 

            /**
             * CacheKey.
             */
            public Builder cacheKey(String cacheKey) {
                this.cacheKey = cacheKey;
                return this;
            }

            /**
             * NeedCache.
             */
            public Builder needCache(Boolean needCache) {
                this.needCache = needCache;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            public CacheRule build() {
                return new CacheRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayApiRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayApiRequest</p>
     */
    public static class DefaultLimitRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultLimit")
        private Boolean defaultLimit;

        private DefaultLimitRule(Builder builder) {
            this.defaultLimit = builder.defaultLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultLimitRule create() {
            return builder().build();
        }

        /**
         * @return defaultLimit
         */
        public Boolean getDefaultLimit() {
            return this.defaultLimit;
        }

        public static final class Builder {
            private Boolean defaultLimit; 

            private Builder() {
            } 

            private Builder(DefaultLimitRule model) {
                this.defaultLimit = model.defaultLimit;
            } 

            /**
             * DefaultLimit.
             */
            public Builder defaultLimit(Boolean defaultLimit) {
                this.defaultLimit = defaultLimit;
                return this;
            }

            public DefaultLimitRule build() {
                return new DefaultLimitRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayApiRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayApiRequest</p>
     */
    public static class HeaderRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderKey")
        private String headerKey;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderRules(Builder builder) {
            this.headerKey = builder.headerKey;
            this.location = builder.location;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderRules create() {
            return builder().build();
        }

        /**
         * @return headerKey
         */
        public String getHeaderKey() {
            return this.headerKey;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String headerKey; 
            private String location; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(HeaderRules model) {
                this.headerKey = model.headerKey;
                this.location = model.location;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * HeaderKey.
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderRules build() {
                return new HeaderRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayApiRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayApiRequest</p>
     */
    public static class LimitRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultResponse")
        private String defaultResponse;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Double limit;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private LimitRule(Builder builder) {
            this.defaultResponse = builder.defaultResponse;
            this.limit = builder.limit;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimitRule create() {
            return builder().build();
        }

        /**
         * @return defaultResponse
         */
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        /**
         * @return limit
         */
        public Double getLimit() {
            return this.limit;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String defaultResponse; 
            private Double limit; 
            private String mode; 

            private Builder() {
            } 

            private Builder(LimitRule model) {
                this.defaultResponse = model.defaultResponse;
                this.limit = model.limit;
                this.mode = model.mode;
            } 

            /**
             * DefaultResponse.
             */
            public Builder defaultResponse(String defaultResponse) {
                this.defaultResponse = defaultResponse;
                return this;
            }

            /**
             * Limit.
             */
            public Builder limit(Double limit) {
                this.limit = limit;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public LimitRule build() {
                return new LimitRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayApiRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayApiRequest</p>
     */
    public static class MigrateRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowPercent")
        private Integer flowPercent;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("NeedMigrate")
        private Boolean needMigrate;

        @com.aliyun.core.annotation.NameInMap("NeedSwitchCompletely")
        private Boolean needSwitchCompletely;

        private MigrateRule(Builder builder) {
            this.flowPercent = builder.flowPercent;
            this.groupId = builder.groupId;
            this.needMigrate = builder.needMigrate;
            this.needSwitchCompletely = builder.needSwitchCompletely;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrateRule create() {
            return builder().build();
        }

        /**
         * @return flowPercent
         */
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return needMigrate
         */
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        /**
         * @return needSwitchCompletely
         */
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

        public static final class Builder {
            private Integer flowPercent; 
            private Long groupId; 
            private Boolean needMigrate; 
            private Boolean needSwitchCompletely; 

            private Builder() {
            } 

            private Builder(MigrateRule model) {
                this.flowPercent = model.flowPercent;
                this.groupId = model.groupId;
                this.needMigrate = model.needMigrate;
                this.needSwitchCompletely = model.needSwitchCompletely;
            } 

            /**
             * FlowPercent.
             */
            public Builder flowPercent(Integer flowPercent) {
                this.flowPercent = flowPercent;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * NeedMigrate.
             */
            public Builder needMigrate(Boolean needMigrate) {
                this.needMigrate = needMigrate;
                return this;
            }

            /**
             * NeedSwitchCompletely.
             */
            public Builder needSwitchCompletely(Boolean needSwitchCompletely) {
                this.needSwitchCompletely = needSwitchCompletely;
                return this;
            }

            public MigrateRule build() {
                return new MigrateRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayApiRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayApiRequest</p>
     */
    public static class MockRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MockData")
        private String mockData;

        @com.aliyun.core.annotation.NameInMap("NeedMock")
        private Boolean needMock;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MockRule(Builder builder) {
            this.mockData = builder.mockData;
            this.needMock = builder.needMock;
            this.percentage = builder.percentage;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MockRule create() {
            return builder().build();
        }

        /**
         * @return mockData
         */
        public String getMockData() {
            return this.mockData;
        }

        /**
         * @return needMock
         */
        public Boolean getNeedMock() {
            return this.needMock;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String mockData; 
            private Boolean needMock; 
            private Integer percentage; 
            private String type; 

            private Builder() {
            } 

            private Builder(MockRule model) {
                this.mockData = model.mockData;
                this.needMock = model.needMock;
                this.percentage = model.percentage;
                this.type = model.type;
            } 

            /**
             * MockData.
             */
            public Builder mockData(String mockData) {
                this.mockData = mockData;
                return this;
            }

            /**
             * NeedMock.
             */
            public Builder needMock(Boolean needMock) {
                this.needMock = needMock;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MockRule build() {
                return new MockRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGatewayApiRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayApiRequest</p>
     */
    public static class RequestParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RefType")
        private String refType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RequestParams(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.location = builder.location;
            this.name = builder.name;
            this.refType = builder.refType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParams create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return refType
         */
        public String getRefType() {
            return this.refType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String location; 
            private String name; 
            private String refType; 
            private String type; 

            private Builder() {
            } 

            private Builder(RequestParams model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.location = model.location;
                this.name = model.name;
                this.refType = model.refType;
                this.type = model.type;
            } 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RefType.
             */
            public Builder refType(String refType) {
                this.refType = refType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RequestParams build() {
                return new RequestParams(this);
            } 

        } 

    }
}
