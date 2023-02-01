// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRequestLogsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRequestLogsResponseBody</p>
 */
public class QueryRequestLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestLogs")
    private RequestLogs requestLogs;

    private QueryRequestLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.requestLogs = builder.requestLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRequestLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestLogs
     */
    public RequestLogs getRequestLogs() {
        return this.requestLogs;
    }

    public static final class Builder {
        private String requestId; 
        private RequestLogs requestLogs; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details about request logs returned.
         */
        public Builder requestLogs(RequestLogs requestLogs) {
            this.requestLogs = requestLogs;
            return this;
        }

        public QueryRequestLogsResponseBody build() {
            return new QueryRequestLogsResponseBody(this);
        } 

    } 

    public static class RequestLog extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("ClientNonce")
        private String clientNonce;

        @NameInMap("ConsumerAppId")
        private String consumerAppId;

        @NameInMap("ConsumerAppKey")
        private String consumerAppKey;

        @NameInMap("CustomTraceId")
        private String customTraceId;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Exception")
        private String exception;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("HttpPath")
        private String httpPath;

        @NameInMap("InitialRequestId")
        private String initialRequestId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JwtClaims")
        private String jwtClaims;

        @NameInMap("Region")
        private String region;

        @NameInMap("RequestBody")
        private String requestBody;

        @NameInMap("RequestHeaders")
        private String requestHeaders;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("RequestProtocol")
        private String requestProtocol;

        @NameInMap("RequestQueryString")
        private String requestQueryString;

        @NameInMap("RequestSize")
        private String requestSize;

        @NameInMap("RequestTime")
        private String requestTime;

        @NameInMap("ResponseBody")
        private String responseBody;

        @NameInMap("ResponseHeaders")
        private String responseHeaders;

        @NameInMap("ResponseSize")
        private String responseSize;

        @NameInMap("ServiceLatency")
        private String serviceLatency;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("StatusCode")
        private String statusCode;

        @NameInMap("TotalLatency")
        private String totalLatency;

        @NameInMap("plugin")
        private String plugin;

        private RequestLog(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.clientIp = builder.clientIp;
            this.clientNonce = builder.clientNonce;
            this.consumerAppId = builder.consumerAppId;
            this.consumerAppKey = builder.consumerAppKey;
            this.customTraceId = builder.customTraceId;
            this.domain = builder.domain;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.exception = builder.exception;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.httpMethod = builder.httpMethod;
            this.httpPath = builder.httpPath;
            this.initialRequestId = builder.initialRequestId;
            this.instanceId = builder.instanceId;
            this.jwtClaims = builder.jwtClaims;
            this.region = builder.region;
            this.requestBody = builder.requestBody;
            this.requestHeaders = builder.requestHeaders;
            this.requestId = builder.requestId;
            this.requestProtocol = builder.requestProtocol;
            this.requestQueryString = builder.requestQueryString;
            this.requestSize = builder.requestSize;
            this.requestTime = builder.requestTime;
            this.responseBody = builder.responseBody;
            this.responseHeaders = builder.responseHeaders;
            this.responseSize = builder.responseSize;
            this.serviceLatency = builder.serviceLatency;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
            this.statusCode = builder.statusCode;
            this.totalLatency = builder.totalLatency;
            this.plugin = builder.plugin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestLog create() {
            return builder().build();
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
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientNonce
         */
        public String getClientNonce() {
            return this.clientNonce;
        }

        /**
         * @return consumerAppId
         */
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        /**
         * @return consumerAppKey
         */
        public String getConsumerAppKey() {
            return this.consumerAppKey;
        }

        /**
         * @return customTraceId
         */
        public String getCustomTraceId() {
            return this.customTraceId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return exception
         */
        public String getException() {
            return this.exception;
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
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return httpPath
         */
        public String getHttpPath() {
            return this.httpPath;
        }

        /**
         * @return initialRequestId
         */
        public String getInitialRequestId() {
            return this.initialRequestId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jwtClaims
         */
        public String getJwtClaims() {
            return this.jwtClaims;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return requestBody
         */
        public String getRequestBody() {
            return this.requestBody;
        }

        /**
         * @return requestHeaders
         */
        public String getRequestHeaders() {
            return this.requestHeaders;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return requestProtocol
         */
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

        /**
         * @return requestQueryString
         */
        public String getRequestQueryString() {
            return this.requestQueryString;
        }

        /**
         * @return requestSize
         */
        public String getRequestSize() {
            return this.requestSize;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return responseBody
         */
        public String getResponseBody() {
            return this.responseBody;
        }

        /**
         * @return responseHeaders
         */
        public String getResponseHeaders() {
            return this.responseHeaders;
        }

        /**
         * @return responseSize
         */
        public String getResponseSize() {
            return this.responseSize;
        }

        /**
         * @return serviceLatency
         */
        public String getServiceLatency() {
            return this.serviceLatency;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return totalLatency
         */
        public String getTotalLatency() {
            return this.totalLatency;
        }

        /**
         * @return plugin
         */
        public String getPlugin() {
            return this.plugin;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String clientIp; 
            private String clientNonce; 
            private String consumerAppId; 
            private String consumerAppKey; 
            private String customTraceId; 
            private String domain; 
            private String errorCode; 
            private String errorMessage; 
            private String exception; 
            private String groupId; 
            private String groupName; 
            private String httpMethod; 
            private String httpPath; 
            private String initialRequestId; 
            private String instanceId; 
            private String jwtClaims; 
            private String region; 
            private String requestBody; 
            private String requestHeaders; 
            private String requestId; 
            private String requestProtocol; 
            private String requestQueryString; 
            private String requestSize; 
            private String requestTime; 
            private String responseBody; 
            private String responseHeaders; 
            private String responseSize; 
            private String serviceLatency; 
            private String stageId; 
            private String stageName; 
            private String statusCode; 
            private String totalLatency; 
            private String plugin; 

            /**
             * The ID of the API.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The name of the API.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The IP address of the client that sent the request.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The X-Ca-Nonce header included in the request from the client.
             */
            public Builder clientNonce(String clientNonce) {
                this.clientNonce = clientNonce;
                return this;
            }

            /**
             * The ID of the application from which an API request is sent.
             */
            public Builder consumerAppId(String consumerAppId) {
                this.consumerAppId = consumerAppId;
                return this;
            }

            /**
             * The application key used by the caller.
             */
            public Builder consumerAppKey(String consumerAppKey) {
                this.consumerAppKey = consumerAppKey;
                return this;
            }

            /**
             * The ID of the custom trace.
             */
            public Builder customTraceId(String customTraceId) {
                this.customTraceId = customTraceId;
                return this;
            }

            /**
             * The requested domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The error code.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned if the request fails.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The specific error message that was returned by the backend service.
             */
            public Builder exception(String exception) {
                this.exception = exception;
                return this;
            }

            /**
             * The ID of the group to which the API belongs.
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
             * The HTTP method used to send the request.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The path of the request.
             */
            public Builder httpPath(String httpPath) {
                this.httpPath = httpPath;
                return this;
            }

            /**
             * The initial request ID when API Gateway calls an API. For example, if API-1 calls API-2, initialRequestId in the log of API-2 represents the ID of the request from API-1.
             */
            public Builder initialRequestId(String initialRequestId) {
                this.initialRequestId = initialRequestId;
                return this;
            }

            /**
             * The ID of the gateway instance to which the API belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The JSON web token (JWT) claims. The claims can be configured at the group level.
             */
            public Builder jwtClaims(String jwtClaims) {
                this.jwtClaims = jwtClaims;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The request body. The maximum size of the request body is 1,024 bytes.
             */
            public Builder requestBody(String requestBody) {
                this.requestBody = requestBody;
                return this;
            }

            /**
             * The request headers.
             */
            public Builder requestHeaders(String requestHeaders) {
                this.requestHeaders = requestHeaders;
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
             * The protocol used by the client to send the request. Valid values: HTTP, HTTPS, and WS.
             */
            public Builder requestProtocol(String requestProtocol) {
                this.requestProtocol = requestProtocol;
                return this;
            }

            /**
             * The query string for the request.
             */
            public Builder requestQueryString(String requestQueryString) {
                this.requestQueryString = requestQueryString;
                return this;
            }

            /**
             * The size of the request. Unit: bytes.
             */
            public Builder requestSize(String requestSize) {
                this.requestSize = requestSize;
                return this;
            }

            /**
             * The request time. The time is displayed in UTC.
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * The response body. The maximum size of the response body is 1,024 bytes.
             */
            public Builder responseBody(String responseBody) {
                this.responseBody = responseBody;
                return this;
            }

            /**
             * The response headers.
             */
            public Builder responseHeaders(String responseHeaders) {
                this.responseHeaders = responseHeaders;
                return this;
            }

            /**
             * The size of returned data. Unit: bytes.
             */
            public Builder responseSize(String responseSize) {
                this.responseSize = responseSize;
                return this;
            }

            /**
             * The total time that was consumed to access backend resources. The total time includes the time consumed to request a connection to the resources, the time consumed to establish the connection, and the time consumed to call the backend service. Unit: milliseconds.
             */
            public Builder serviceLatency(String serviceLatency) {
                this.serviceLatency = serviceLatency;
                return this;
            }

            /**
             * The ID of the API environment.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The name of the API environment.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * The HTTP status code.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The total period of time that the request consumed. Unit: milliseconds.
             */
            public Builder totalLatency(String totalLatency) {
                this.totalLatency = totalLatency;
                return this;
            }

            /**
             * The list of plug-ins hit by the request and the relevant context.
             */
            public Builder plugin(String plugin) {
                this.plugin = plugin;
                return this;
            }

            public RequestLog build() {
                return new RequestLog(this);
            } 

        } 

    }
    public static class RequestLogs extends TeaModel {
        @NameInMap("RequestLog")
        private java.util.List < RequestLog> requestLog;

        private RequestLogs(Builder builder) {
            this.requestLog = builder.requestLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestLogs create() {
            return builder().build();
        }

        /**
         * @return requestLog
         */
        public java.util.List < RequestLog> getRequestLog() {
            return this.requestLog;
        }

        public static final class Builder {
            private java.util.List < RequestLog> requestLog; 

            /**
             * RequestLog.
             */
            public Builder requestLog(java.util.List < RequestLog> requestLog) {
                this.requestLog = requestLog;
                return this;
            }

            public RequestLogs build() {
                return new RequestLogs(this);
            } 

        } 

    }
}
