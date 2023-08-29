// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMgsApipageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMgsApipageResponseBody</p>
 */
public class QueryMgsApipageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultContent")
    private ResultContent resultContent;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private QueryMgsApipageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMgsApipageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryMgsApipageResponseBody build() {
            return new QueryMgsApipageResponseBody(this);
        } 

    } 

    public static class HttpInvoker extends TeaModel {
        @NameInMap("Charset")
        private String charset;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("Host")
        private String host;

        @NameInMap("Method")
        private String method;

        @NameInMap("Path")
        private String path;

        private HttpInvoker(Builder builder) {
            this.charset = builder.charset;
            this.contentType = builder.contentType;
            this.host = builder.host;
            this.method = builder.method;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpInvoker create() {
            return builder().build();
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
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String charset; 
            private String contentType; 
            private String host; 
            private String method; 
            private String path; 

            /**
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public HttpInvoker build() {
                return new HttpInvoker(this);
            } 

        } 

    }
    public static class ApiInvoker extends TeaModel {
        @NameInMap("HttpInvoker")
        private HttpInvoker httpInvoker;

        @NameInMap("RpcInvoker")
        private String rpcInvoker;

        private ApiInvoker(Builder builder) {
            this.httpInvoker = builder.httpInvoker;
            this.rpcInvoker = builder.rpcInvoker;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiInvoker create() {
            return builder().build();
        }

        /**
         * @return httpInvoker
         */
        public HttpInvoker getHttpInvoker() {
            return this.httpInvoker;
        }

        /**
         * @return rpcInvoker
         */
        public String getRpcInvoker() {
            return this.rpcInvoker;
        }

        public static final class Builder {
            private HttpInvoker httpInvoker; 
            private String rpcInvoker; 

            /**
             * HttpInvoker.
             */
            public Builder httpInvoker(HttpInvoker httpInvoker) {
                this.httpInvoker = httpInvoker;
                return this;
            }

            /**
             * RpcInvoker.
             */
            public Builder rpcInvoker(String rpcInvoker) {
                this.rpcInvoker = rpcInvoker;
                return this;
            }

            public ApiInvoker build() {
                return new ApiInvoker(this);
            } 

        } 

    }
    public static class CacheRule extends TeaModel {
        @NameInMap("CacheKey")
        private String cacheKey;

        @NameInMap("NeedCache")
        private Boolean needCache;

        @NameInMap("Ttl")
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
    public static class CircuitBreakerRule extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("DefaultResponse")
        private String defaultResponse;

        @NameInMap("ErrorThreshold")
        private Long errorThreshold;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Model")
        private String model;

        @NameInMap("OpenTimeoutSeconds")
        private Long openTimeoutSeconds;

        @NameInMap("SlowRatioThreshold")
        private Double slowRatioThreshold;

        @NameInMap("SwitchStatus")
        private String switchStatus;

        @NameInMap("WindowsInSeconds")
        private Long windowsInSeconds;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        private CircuitBreakerRule(Builder builder) {
            this.appId = builder.appId;
            this.defaultResponse = builder.defaultResponse;
            this.errorThreshold = builder.errorThreshold;
            this.id = builder.id;
            this.model = builder.model;
            this.openTimeoutSeconds = builder.openTimeoutSeconds;
            this.slowRatioThreshold = builder.slowRatioThreshold;
            this.switchStatus = builder.switchStatus;
            this.windowsInSeconds = builder.windowsInSeconds;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CircuitBreakerRule create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return defaultResponse
         */
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        /**
         * @return errorThreshold
         */
        public Long getErrorThreshold() {
            return this.errorThreshold;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return openTimeoutSeconds
         */
        public Long getOpenTimeoutSeconds() {
            return this.openTimeoutSeconds;
        }

        /**
         * @return slowRatioThreshold
         */
        public Double getSlowRatioThreshold() {
            return this.slowRatioThreshold;
        }

        /**
         * @return switchStatus
         */
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        /**
         * @return windowsInSeconds
         */
        public Long getWindowsInSeconds() {
            return this.windowsInSeconds;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String appId; 
            private String defaultResponse; 
            private Long errorThreshold; 
            private Long id; 
            private String model; 
            private Long openTimeoutSeconds; 
            private Double slowRatioThreshold; 
            private String switchStatus; 
            private Long windowsInSeconds; 
            private String workspaceId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * DefaultResponse.
             */
            public Builder defaultResponse(String defaultResponse) {
                this.defaultResponse = defaultResponse;
                return this;
            }

            /**
             * ErrorThreshold.
             */
            public Builder errorThreshold(Long errorThreshold) {
                this.errorThreshold = errorThreshold;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * OpenTimeoutSeconds.
             */
            public Builder openTimeoutSeconds(Long openTimeoutSeconds) {
                this.openTimeoutSeconds = openTimeoutSeconds;
                return this;
            }

            /**
             * SlowRatioThreshold.
             */
            public Builder slowRatioThreshold(Double slowRatioThreshold) {
                this.slowRatioThreshold = slowRatioThreshold;
                return this;
            }

            /**
             * SwitchStatus.
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * WindowsInSeconds.
             */
            public Builder windowsInSeconds(Long windowsInSeconds) {
                this.windowsInSeconds = windowsInSeconds;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public CircuitBreakerRule build() {
                return new CircuitBreakerRule(this);
            } 

        } 

    }
    public static class HeaderRule extends TeaModel {
        @NameInMap("HeaderKey")
        private String headerKey;

        @NameInMap("Location")
        private String location;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private HeaderRule(Builder builder) {
            this.headerKey = builder.headerKey;
            this.location = builder.location;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderRule create() {
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

            public HeaderRule build() {
                return new HeaderRule(this);
            } 

        } 

    }
    public static class HeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        private String headerKey;

        @NameInMap("Location")
        private String location;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
    public static class LimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        private String defaultResponse;

        @NameInMap("I18nResponse")
        private String i18nResponse;

        @NameInMap("Interval")
        private Long interval;

        @NameInMap("Limit")
        private Long limit;

        @NameInMap("Mode")
        private String mode;

        private LimitRule(Builder builder) {
            this.defaultResponse = builder.defaultResponse;
            this.i18nResponse = builder.i18nResponse;
            this.interval = builder.interval;
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
         * @return i18nResponse
         */
        public String getI18nResponse() {
            return this.i18nResponse;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return limit
         */
        public Long getLimit() {
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
            private String i18nResponse; 
            private Long interval; 
            private Long limit; 
            private String mode; 

            /**
             * DefaultResponse.
             */
            public Builder defaultResponse(String defaultResponse) {
                this.defaultResponse = defaultResponse;
                return this;
            }

            /**
             * I18nResponse.
             */
            public Builder i18nResponse(String i18nResponse) {
                this.i18nResponse = i18nResponse;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Limit.
             */
            public Builder limit(Long limit) {
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
    public static class MigrateRule extends TeaModel {
        @NameInMap("FlowPercent")
        private Long flowPercent;

        @NameInMap("NeedMigrate")
        private Boolean needMigrate;

        @NameInMap("NeedSwitchCompletely")
        private Boolean needSwitchCompletely;

        @NameInMap("SysId")
        private Long sysId;

        @NameInMap("SysName")
        private String sysName;

        @NameInMap("UpstreamType")
        private String upstreamType;

        private MigrateRule(Builder builder) {
            this.flowPercent = builder.flowPercent;
            this.needMigrate = builder.needMigrate;
            this.needSwitchCompletely = builder.needSwitchCompletely;
            this.sysId = builder.sysId;
            this.sysName = builder.sysName;
            this.upstreamType = builder.upstreamType;
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
        public Long getFlowPercent() {
            return this.flowPercent;
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

        /**
         * @return sysId
         */
        public Long getSysId() {
            return this.sysId;
        }

        /**
         * @return sysName
         */
        public String getSysName() {
            return this.sysName;
        }

        /**
         * @return upstreamType
         */
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public static final class Builder {
            private Long flowPercent; 
            private Boolean needMigrate; 
            private Boolean needSwitchCompletely; 
            private Long sysId; 
            private String sysName; 
            private String upstreamType; 

            /**
             * FlowPercent.
             */
            public Builder flowPercent(Long flowPercent) {
                this.flowPercent = flowPercent;
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

            /**
             * SysId.
             */
            public Builder sysId(Long sysId) {
                this.sysId = sysId;
                return this;
            }

            /**
             * SysName.
             */
            public Builder sysName(String sysName) {
                this.sysName = sysName;
                return this;
            }

            /**
             * UpstreamType.
             */
            public Builder upstreamType(String upstreamType) {
                this.upstreamType = upstreamType;
                return this;
            }

            public MigrateRule build() {
                return new MigrateRule(this);
            } 

        } 

    }
    public static class MockRule extends TeaModel {
        @NameInMap("MockData")
        private String mockData;

        @NameInMap("NeedMock")
        private Boolean needMock;

        @NameInMap("Percentage")
        private Long percentage;

        @NameInMap("Type")
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
        public Long getPercentage() {
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
            private Long percentage; 
            private String type; 

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
            public Builder percentage(Long percentage) {
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
    public static class RequestParams extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Location")
        private String location;

        @NameInMap("Name")
        private String name;

        @NameInMap("RefType")
        private String refType;

        @NameInMap("Type")
        private String type;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        private RequestParams(Builder builder) {
            this.apiId = builder.apiId;
            this.appId = builder.appId;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
            this.refType = builder.refType;
            this.type = builder.type;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParams create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String apiId; 
            private String appId; 
            private String defaultValue; 
            private String description; 
            private Long id; 
            private String location; 
            private String name; 
            private String refType; 
            private String type; 
            private String workspaceId; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public RequestParams build() {
                return new RequestParams(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("ApiInvoker")
        private ApiInvoker apiInvoker;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiStatus")
        private String apiStatus;

        @NameInMap("ApiType")
        private String apiType;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AuthRuleName")
        private String authRuleName;

        @NameInMap("CacheRule")
        private CacheRule cacheRule;

        @NameInMap("Charset")
        private String charset;

        @NameInMap("CircuitBreakerRule")
        private CircuitBreakerRule circuitBreakerRule;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HeaderRule")
        private java.util.List < HeaderRule> headerRule;

        @NameInMap("HeaderRules")
        private java.util.List < HeaderRules> headerRules;

        @NameInMap("Host")
        private String host;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InterfaceType")
        private String interfaceType;

        @NameInMap("LimitRule")
        private LimitRule limitRule;

        @NameInMap("Method")
        private String method;

        @NameInMap("MethodName")
        private String methodName;

        @NameInMap("MigrateRule")
        private MigrateRule migrateRule;

        @NameInMap("MockRule")
        private MockRule mockRule;

        @NameInMap("NeedETag")
        private String needETag;

        @NameInMap("NeedEncrypt")
        private String needEncrypt;

        @NameInMap("NeedJsonp")
        private String needJsonp;

        @NameInMap("NeedSign")
        private String needSign;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("ParamGetMethod")
        private String paramGetMethod;

        @NameInMap("Path")
        private String path;

        @NameInMap("RequestBodyModel")
        private String requestBodyModel;

        @NameInMap("RequestParams")
        private java.util.List < RequestParams> requestParams;

        @NameInMap("ResponseBodyModel")
        private String responseBodyModel;

        @NameInMap("SysId")
        private Long sysId;

        @NameInMap("SysName")
        private String sysName;

        @NameInMap("Timeout")
        private String timeout;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        private List(Builder builder) {
            this.apiInvoker = builder.apiInvoker;
            this.apiName = builder.apiName;
            this.apiStatus = builder.apiStatus;
            this.apiType = builder.apiType;
            this.appId = builder.appId;
            this.authRuleName = builder.authRuleName;
            this.cacheRule = builder.cacheRule;
            this.charset = builder.charset;
            this.circuitBreakerRule = builder.circuitBreakerRule;
            this.contentType = builder.contentType;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.headerRule = builder.headerRule;
            this.headerRules = builder.headerRules;
            this.host = builder.host;
            this.id = builder.id;
            this.interfaceType = builder.interfaceType;
            this.limitRule = builder.limitRule;
            this.method = builder.method;
            this.methodName = builder.methodName;
            this.migrateRule = builder.migrateRule;
            this.mockRule = builder.mockRule;
            this.needETag = builder.needETag;
            this.needEncrypt = builder.needEncrypt;
            this.needJsonp = builder.needJsonp;
            this.needSign = builder.needSign;
            this.operationType = builder.operationType;
            this.paramGetMethod = builder.paramGetMethod;
            this.path = builder.path;
            this.requestBodyModel = builder.requestBodyModel;
            this.requestParams = builder.requestParams;
            this.responseBodyModel = builder.responseBodyModel;
            this.sysId = builder.sysId;
            this.sysName = builder.sysName;
            this.timeout = builder.timeout;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return apiInvoker
         */
        public ApiInvoker getApiInvoker() {
            return this.apiInvoker;
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
         * @return circuitBreakerRule
         */
        public CircuitBreakerRule getCircuitBreakerRule() {
            return this.circuitBreakerRule;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return headerRule
         */
        public java.util.List < HeaderRule> getHeaderRule() {
            return this.headerRule;
        }

        /**
         * @return headerRules
         */
        public java.util.List < HeaderRules> getHeaderRules() {
            return this.headerRules;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return needETag
         */
        public String getNeedETag() {
            return this.needETag;
        }

        /**
         * @return needEncrypt
         */
        public String getNeedEncrypt() {
            return this.needEncrypt;
        }

        /**
         * @return needJsonp
         */
        public String getNeedJsonp() {
            return this.needJsonp;
        }

        /**
         * @return needSign
         */
        public String getNeedSign() {
            return this.needSign;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return paramGetMethod
         */
        public String getParamGetMethod() {
            return this.paramGetMethod;
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
        public java.util.List < RequestParams> getRequestParams() {
            return this.requestParams;
        }

        /**
         * @return responseBodyModel
         */
        public String getResponseBodyModel() {
            return this.responseBodyModel;
        }

        /**
         * @return sysId
         */
        public Long getSysId() {
            return this.sysId;
        }

        /**
         * @return sysName
         */
        public String getSysName() {
            return this.sysName;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private ApiInvoker apiInvoker; 
            private String apiName; 
            private String apiStatus; 
            private String apiType; 
            private String appId; 
            private String authRuleName; 
            private CacheRule cacheRule; 
            private String charset; 
            private CircuitBreakerRule circuitBreakerRule; 
            private String contentType; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List < HeaderRule> headerRule; 
            private java.util.List < HeaderRules> headerRules; 
            private String host; 
            private Long id; 
            private String interfaceType; 
            private LimitRule limitRule; 
            private String method; 
            private String methodName; 
            private MigrateRule migrateRule; 
            private MockRule mockRule; 
            private String needETag; 
            private String needEncrypt; 
            private String needJsonp; 
            private String needSign; 
            private String operationType; 
            private String paramGetMethod; 
            private String path; 
            private String requestBodyModel; 
            private java.util.List < RequestParams> requestParams; 
            private String responseBodyModel; 
            private Long sysId; 
            private String sysName; 
            private String timeout; 
            private String workspaceId; 

            /**
             * ApiInvoker.
             */
            public Builder apiInvoker(ApiInvoker apiInvoker) {
                this.apiInvoker = apiInvoker;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * ApiStatus.
             */
            public Builder apiStatus(String apiStatus) {
                this.apiStatus = apiStatus;
                return this;
            }

            /**
             * ApiType.
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AuthRuleName.
             */
            public Builder authRuleName(String authRuleName) {
                this.authRuleName = authRuleName;
                return this;
            }

            /**
             * CacheRule.
             */
            public Builder cacheRule(CacheRule cacheRule) {
                this.cacheRule = cacheRule;
                return this;
            }

            /**
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * CircuitBreakerRule.
             */
            public Builder circuitBreakerRule(CircuitBreakerRule circuitBreakerRule) {
                this.circuitBreakerRule = circuitBreakerRule;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HeaderRule.
             */
            public Builder headerRule(java.util.List < HeaderRule> headerRule) {
                this.headerRule = headerRule;
                return this;
            }

            /**
             * HeaderRules.
             */
            public Builder headerRules(java.util.List < HeaderRules> headerRules) {
                this.headerRules = headerRules;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InterfaceType.
             */
            public Builder interfaceType(String interfaceType) {
                this.interfaceType = interfaceType;
                return this;
            }

            /**
             * LimitRule.
             */
            public Builder limitRule(LimitRule limitRule) {
                this.limitRule = limitRule;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * MethodName.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * MigrateRule.
             */
            public Builder migrateRule(MigrateRule migrateRule) {
                this.migrateRule = migrateRule;
                return this;
            }

            /**
             * MockRule.
             */
            public Builder mockRule(MockRule mockRule) {
                this.mockRule = mockRule;
                return this;
            }

            /**
             * NeedETag.
             */
            public Builder needETag(String needETag) {
                this.needETag = needETag;
                return this;
            }

            /**
             * NeedEncrypt.
             */
            public Builder needEncrypt(String needEncrypt) {
                this.needEncrypt = needEncrypt;
                return this;
            }

            /**
             * NeedJsonp.
             */
            public Builder needJsonp(String needJsonp) {
                this.needJsonp = needJsonp;
                return this;
            }

            /**
             * NeedSign.
             */
            public Builder needSign(String needSign) {
                this.needSign = needSign;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * ParamGetMethod.
             */
            public Builder paramGetMethod(String paramGetMethod) {
                this.paramGetMethod = paramGetMethod;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * RequestBodyModel.
             */
            public Builder requestBodyModel(String requestBodyModel) {
                this.requestBodyModel = requestBodyModel;
                return this;
            }

            /**
             * RequestParams.
             */
            public Builder requestParams(java.util.List < RequestParams> requestParams) {
                this.requestParams = requestParams;
                return this;
            }

            /**
             * ResponseBodyModel.
             */
            public Builder responseBodyModel(String responseBodyModel) {
                this.responseBodyModel = responseBodyModel;
                return this;
            }

            /**
             * SysId.
             */
            public Builder sysId(Long sysId) {
                this.sysId = sysId;
                return this;
            }

            /**
             * SysName.
             */
            public Builder sysName(String sysName) {
                this.sysName = sysName;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class ResultContent extends TeaModel {
        @NameInMap("Current")
        private Long current;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Total")
        private Long total;

        private ResultContent(Builder builder) {
            this.current = builder.current;
            this.list = builder.list;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Long getCurrent() {
            return this.current;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long current; 
            private java.util.List < List> list; 
            private Long pageSize; 
            private Long total; 

            /**
             * Current.
             */
            public Builder current(Long current) {
                this.current = current;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
