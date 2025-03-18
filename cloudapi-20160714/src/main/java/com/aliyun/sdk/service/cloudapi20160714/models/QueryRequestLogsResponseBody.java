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
 * {@link QueryRequestLogsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRequestLogsResponseBody</p>
 */
public class QueryRequestLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestLogs")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryRequestLogsResponseBody model) {
            this.requestId = model.requestId;
            this.requestLogs = model.requestLogs;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE5722A6-AE78-4741-A9B0-6C81********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request logs.</p>
         */
        public Builder requestLogs(RequestLogs requestLogs) {
            this.requestLogs = requestLogs;
            return this;
        }

        public QueryRequestLogsResponseBody build() {
            return new QueryRequestLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRequestLogsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRequestLogsResponseBody</p>
     */
    public static class RequestLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BackendRequestEnd")
        private Long backendRequestEnd;

        @com.aliyun.core.annotation.NameInMap("BackendRequestStart")
        private Long backendRequestStart;

        @com.aliyun.core.annotation.NameInMap("BackendResponseEnd")
        private Long backendResponseEnd;

        @com.aliyun.core.annotation.NameInMap("BackendResponseStart")
        private Long backendResponseStart;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientNonce")
        private String clientNonce;

        @com.aliyun.core.annotation.NameInMap("ConsumerAppId")
        private String consumerAppId;

        @com.aliyun.core.annotation.NameInMap("ConsumerAppKey")
        private String consumerAppKey;

        @com.aliyun.core.annotation.NameInMap("CustomTraceId")
        private String customTraceId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Exception")
        private String exception;

        @com.aliyun.core.annotation.NameInMap("FrontRequestEnd")
        private Long frontRequestEnd;

        @com.aliyun.core.annotation.NameInMap("FrontRequestStart")
        private Long frontRequestStart;

        @com.aliyun.core.annotation.NameInMap("FrontResponseEnd")
        private Long frontResponseEnd;

        @com.aliyun.core.annotation.NameInMap("FrontResponseStart")
        private Long frontResponseStart;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("HttpPath")
        private String httpPath;

        @com.aliyun.core.annotation.NameInMap("InitialRequestId")
        private String initialRequestId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JwtClaims")
        private String jwtClaims;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RequestBody")
        private String requestBody;

        @com.aliyun.core.annotation.NameInMap("RequestHeaders")
        private String requestHeaders;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RequestProtocol")
        private String requestProtocol;

        @com.aliyun.core.annotation.NameInMap("RequestQueryString")
        private String requestQueryString;

        @com.aliyun.core.annotation.NameInMap("RequestSize")
        private String requestSize;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private String requestTime;

        @com.aliyun.core.annotation.NameInMap("ResponseBody")
        private String responseBody;

        @com.aliyun.core.annotation.NameInMap("ResponseHeaders")
        private String responseHeaders;

        @com.aliyun.core.annotation.NameInMap("ResponseSize")
        private String responseSize;

        @com.aliyun.core.annotation.NameInMap("ServiceLatency")
        private String serviceLatency;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TotalLatency")
        private String totalLatency;

        @com.aliyun.core.annotation.NameInMap("plugin")
        private String plugin;

        private RequestLog(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.appName = builder.appName;
            this.backendRequestEnd = builder.backendRequestEnd;
            this.backendRequestStart = builder.backendRequestStart;
            this.backendResponseEnd = builder.backendResponseEnd;
            this.backendResponseStart = builder.backendResponseStart;
            this.clientIp = builder.clientIp;
            this.clientNonce = builder.clientNonce;
            this.consumerAppId = builder.consumerAppId;
            this.consumerAppKey = builder.consumerAppKey;
            this.customTraceId = builder.customTraceId;
            this.domain = builder.domain;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.exception = builder.exception;
            this.frontRequestEnd = builder.frontRequestEnd;
            this.frontRequestStart = builder.frontRequestStart;
            this.frontResponseEnd = builder.frontResponseEnd;
            this.frontResponseStart = builder.frontResponseStart;
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
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return backendRequestEnd
         */
        public Long getBackendRequestEnd() {
            return this.backendRequestEnd;
        }

        /**
         * @return backendRequestStart
         */
        public Long getBackendRequestStart() {
            return this.backendRequestStart;
        }

        /**
         * @return backendResponseEnd
         */
        public Long getBackendResponseEnd() {
            return this.backendResponseEnd;
        }

        /**
         * @return backendResponseStart
         */
        public Long getBackendResponseStart() {
            return this.backendResponseStart;
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
         * @return frontRequestEnd
         */
        public Long getFrontRequestEnd() {
            return this.frontRequestEnd;
        }

        /**
         * @return frontRequestStart
         */
        public Long getFrontRequestStart() {
            return this.frontRequestStart;
        }

        /**
         * @return frontResponseEnd
         */
        public Long getFrontResponseEnd() {
            return this.frontResponseEnd;
        }

        /**
         * @return frontResponseStart
         */
        public Long getFrontResponseStart() {
            return this.frontResponseStart;
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
            private String appName; 
            private Long backendRequestEnd; 
            private Long backendRequestStart; 
            private Long backendResponseEnd; 
            private Long backendResponseStart; 
            private String clientIp; 
            private String clientNonce; 
            private String consumerAppId; 
            private String consumerAppKey; 
            private String customTraceId; 
            private String domain; 
            private String errorCode; 
            private String errorMessage; 
            private String exception; 
            private Long frontRequestEnd; 
            private Long frontRequestStart; 
            private Long frontResponseEnd; 
            private Long frontResponseStart; 
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

            private Builder() {
            } 

            private Builder(RequestLog model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.appName = model.appName;
                this.backendRequestEnd = model.backendRequestEnd;
                this.backendRequestStart = model.backendRequestStart;
                this.backendResponseEnd = model.backendResponseEnd;
                this.backendResponseStart = model.backendResponseStart;
                this.clientIp = model.clientIp;
                this.clientNonce = model.clientNonce;
                this.consumerAppId = model.consumerAppId;
                this.consumerAppKey = model.consumerAppKey;
                this.customTraceId = model.customTraceId;
                this.domain = model.domain;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.exception = model.exception;
                this.frontRequestEnd = model.frontRequestEnd;
                this.frontRequestStart = model.frontRequestStart;
                this.frontResponseEnd = model.frontResponseEnd;
                this.frontResponseStart = model.frontResponseStart;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.httpMethod = model.httpMethod;
                this.httpPath = model.httpPath;
                this.initialRequestId = model.initialRequestId;
                this.instanceId = model.instanceId;
                this.jwtClaims = model.jwtClaims;
                this.region = model.region;
                this.requestBody = model.requestBody;
                this.requestHeaders = model.requestHeaders;
                this.requestId = model.requestId;
                this.requestProtocol = model.requestProtocol;
                this.requestQueryString = model.requestQueryString;
                this.requestSize = model.requestSize;
                this.requestTime = model.requestTime;
                this.responseBody = model.responseBody;
                this.responseHeaders = model.responseHeaders;
                this.responseSize = model.responseSize;
                this.serviceLatency = model.serviceLatency;
                this.stageId = model.stageId;
                this.stageName = model.stageName;
                this.statusCode = model.statusCode;
                this.totalLatency = model.totalLatency;
                this.plugin = model.plugin;
            } 

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4b83229ebcab4ecd88956fb3********</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>ApiName</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>VIPROOM_VIPROOM</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The time when API Gateway finished forwarding the request to the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224969</p>
             */
            public Builder backendRequestEnd(Long backendRequestEnd) {
                this.backendRequestEnd = backendRequestEnd;
                return this;
            }

            /**
             * <p>The time when API Gateway started to forward the request to the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224969</p>
             */
            public Builder backendRequestStart(Long backendRequestStart) {
                this.backendRequestStart = backendRequestStart;
                return this;
            }

            /**
             * <p>The time when API Gateway finished receiving the response from the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224989</p>
             */
            public Builder backendResponseEnd(Long backendResponseEnd) {
                this.backendResponseEnd = backendResponseEnd;
                return this;
            }

            /**
             * <p>The time when API Gateway started to receive the response from the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224989</p>
             */
            public Builder backendResponseStart(Long backendResponseStart) {
                this.backendResponseStart = backendResponseStart;
                return this;
            }

            /**
             * <p>The IP address of the client that sends the request.</p>
             * 
             * <strong>example:</strong>
             * <p>21.237.XXX.XXX</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The X-Ca-Nonce header included in the request from the client.</p>
             * 
             * <strong>example:</strong>
             * <p>d43df9db-3b05-4cd6-888a-1c0b********</p>
             */
            public Builder clientNonce(String clientNonce) {
                this.clientNonce = clientNonce;
                return this;
            }

            /**
             * <p>The application ID that is used by the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>11096****</p>
             */
            public Builder consumerAppId(String consumerAppId) {
                this.consumerAppId = consumerAppId;
                return this;
            }

            /**
             * <p>The App Key that is used by the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>20412****</p>
             */
            public Builder consumerAppKey(String consumerAppKey) {
                this.consumerAppKey = consumerAppKey;
                return this;
            }

            /**
             * <p>The custom trace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>95657ED9-2F6F-426F-BD99-79C8********</p>
             */
            public Builder customTraceId(String customTraceId) {
                this.customTraceId = customTraceId;
                return this;
            }

            /**
             * <p>The requested domain name in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>360bdd88695c48ae8085c7f2********-ap-southeast-1.alicloudapi.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The error code that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>X500ER</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned if the call fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Backend service connect failed <code>Timeout connecting to [/1XX.20.0.XX:8080]</code></p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The specific error message returned by the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>error msg</p>
             */
            public Builder exception(String exception) {
                this.exception = exception;
                return this;
            }

            /**
             * <p>The time when API Gateway finished receiving the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224968</p>
             */
            public Builder frontRequestEnd(Long frontRequestEnd) {
                this.frontRequestEnd = frontRequestEnd;
                return this;
            }

            /**
             * <p>The time when API Gateway started to receive the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224968</p>
             */
            public Builder frontRequestStart(Long frontRequestStart) {
                this.frontRequestStart = frontRequestStart;
                return this;
            }

            /**
             * <p>The time when API Gateway finished forwarding the response to the client.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224989</p>
             */
            public Builder frontResponseEnd(Long frontResponseEnd) {
                this.frontResponseEnd = frontResponseEnd;
                return this;
            }

            /**
             * <p>The time when API Gateway started to forward the response to the client.</p>
             * 
             * <strong>example:</strong>
             * <p>1731487224989</p>
             */
            public Builder frontResponseStart(Long frontResponseStart) {
                this.frontResponseStart = frontResponseStart;
                return this;
            }

            /**
             * <p>The ID of the API group to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dc024277fe6c4cada79ba0bd6********</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>GroupName</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The HTTP method that is used to send the request.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The path of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>/testPath</p>
             */
            public Builder httpPath(String httpPath) {
                this.httpPath = httpPath;
                return this;
            }

            /**
             * <p>The initial request ID when API Gateway calls an API. For example, if API-1 calls API-2, the initialRequestId parameter in the log of API-2 indicates the ID of the request from API-1.</p>
             * 
             * <strong>example:</strong>
             * <p>95657ED9-2F6F-426F-BD99-79C8********</p>
             */
            public Builder initialRequestId(String initialRequestId) {
                this.initialRequestId = initialRequestId;
                return this;
            }

            /**
             * <p>The ID of the API Gateway instance to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>apigateway-bj-ab2b********</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The JSON web token (JWT) claims. The claims can be configured at the group level.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder jwtClaims(String jwtClaims) {
                this.jwtClaims = jwtClaims;
                return this;
            }

            /**
             * <p>The region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The request body. A request body cannot exceed 1,024 bytes in size.</p>
             * 
             * <strong>example:</strong>
             * <p>param=paramName</p>
             */
            public Builder requestBody(String requestBody) {
                this.requestBody = requestBody;
                return this;
            }

            /**
             * <p>The request headers.</p>
             * 
             * <strong>example:</strong>
             * <p>content-type: application/x-www-form-urlencoded</p>
             */
            public Builder requestHeaders(String requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>95657ED9-2F6F-426F-BD99-79C8********</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The protocol used by the client to send the request. Valid values: HTTP, HTTPS, and WS.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder requestProtocol(String requestProtocol) {
                this.requestProtocol = requestProtocol;
                return this;
            }

            /**
             * <p>The query string for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>username=name</p>
             */
            public Builder requestQueryString(String requestQueryString) {
                this.requestQueryString = requestQueryString;
                return this;
            }

            /**
             * <p>The size of the request. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1923</p>
             */
            public Builder requestSize(String requestSize) {
                this.requestSize = requestSize;
                return this;
            }

            /**
             * <p>The request time, in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-29T03:59:59Z</p>
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * <p>The response body. A response body cannot exceed 1,024 bytes in size.</p>
             * 
             * <strong>example:</strong>
             * <p>param=paramName</p>
             */
            public Builder responseBody(String responseBody) {
                this.responseBody = responseBody;
                return this;
            }

            /**
             * <p>The headers in the API response.</p>
             * 
             * <strong>example:</strong>
             * <p>content-type: application/x-www-form-urlencoded</p>
             */
            public Builder responseHeaders(String responseHeaders) {
                this.responseHeaders = responseHeaders;
                return this;
            }

            /**
             * <p>The size of returned data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>23441</p>
             */
            public Builder responseSize(String responseSize) {
                this.responseSize = responseSize;
                return this;
            }

            /**
             * <p>The total time consumed to access the backend resources. The total time includes the time consumed to request a connection to the resources, the time consumed to establish the connection, and the time consumed to call the backend service. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>324</p>
             */
            public Builder serviceLatency(String serviceLatency) {
                this.serviceLatency = serviceLatency;
                return this;
            }

            /**
             * <p>The ID of the API environment.</p>
             * 
             * <strong>example:</strong>
             * <p>8a305b7f10334052a52d9156********</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The name of the API environment.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The total time consumed by the request. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1345</p>
             */
            public Builder totalLatency(String totalLatency) {
                this.totalLatency = totalLatency;
                return this;
            }

            /**
             * <p>The plug-in hit by the request and the relevant context.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
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
    /**
     * 
     * {@link QueryRequestLogsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRequestLogsResponseBody</p>
     */
    public static class RequestLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestLog")
        private java.util.List<RequestLog> requestLog;

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
        public java.util.List<RequestLog> getRequestLog() {
            return this.requestLog;
        }

        public static final class Builder {
            private java.util.List<RequestLog> requestLog; 

            private Builder() {
            } 

            private Builder(RequestLogs model) {
                this.requestLog = model.requestLog;
            } 

            /**
             * RequestLog.
             */
            public Builder requestLog(java.util.List<RequestLog> requestLog) {
                this.requestLog = requestLog;
                return this;
            }

            public RequestLogs build() {
                return new RequestLogs(this);
            } 

        } 

    }
}
