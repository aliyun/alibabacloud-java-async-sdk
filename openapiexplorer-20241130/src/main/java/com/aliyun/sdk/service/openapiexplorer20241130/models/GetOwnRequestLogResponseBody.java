// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetOwnRequestLogResponseBody</p>
 */
public class GetOwnRequestLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logInfo")
    private LogInfo logInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetOwnRequestLogResponseBody(Builder builder) {
        this.logInfo = builder.logInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOwnRequestLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return logInfo
     */
    public LogInfo getLogInfo() {
        return this.logInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LogInfo logInfo; 
        private String requestId; 

        /**
         * logInfo.
         */
        public Builder logInfo(LogInfo logInfo) {
            this.logInfo = logInfo;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOwnRequestLogResponseBody build() {
            return new GetOwnRequestLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class AuthenticationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authenticationType")
        private String authenticationType;

        @com.aliyun.core.annotation.NameInMap("signatureMethod")
        private String signatureMethod;

        @com.aliyun.core.annotation.NameInMap("signatureVersion")
        private String signatureVersion;

        private AuthenticationInfo(Builder builder) {
            this.authenticationType = builder.authenticationType;
            this.signatureMethod = builder.signatureMethod;
            this.signatureVersion = builder.signatureVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthenticationInfo create() {
            return builder().build();
        }

        /**
         * @return authenticationType
         */
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        /**
         * @return signatureMethod
         */
        public String getSignatureMethod() {
            return this.signatureMethod;
        }

        /**
         * @return signatureVersion
         */
        public String getSignatureVersion() {
            return this.signatureVersion;
        }

        public static final class Builder {
            private String authenticationType; 
            private String signatureMethod; 
            private String signatureVersion; 

            /**
             * authenticationType.
             */
            public Builder authenticationType(String authenticationType) {
                this.authenticationType = authenticationType;
                return this;
            }

            /**
             * signatureMethod.
             */
            public Builder signatureMethod(String signatureMethod) {
                this.signatureMethod = signatureMethod;
                return this;
            }

            /**
             * signatureVersion.
             */
            public Builder signatureVersion(String signatureVersion) {
                this.signatureVersion = signatureVersion;
                return this;
            }

            public AuthenticationInfo build() {
                return new AuthenticationInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("authPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("authPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("authPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("encodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("noPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("policyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            /**
             * authAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * authPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * authPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * authPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * encodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * noPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * policyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class ApiDoc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alibabacloudSite")
        private String alibabacloudSite;

        @com.aliyun.core.annotation.NameInMap("aliyunSite")
        private String aliyunSite;

        private ApiDoc(Builder builder) {
            this.alibabacloudSite = builder.alibabacloudSite;
            this.aliyunSite = builder.aliyunSite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiDoc create() {
            return builder().build();
        }

        /**
         * @return alibabacloudSite
         */
        public String getAlibabacloudSite() {
            return this.alibabacloudSite;
        }

        /**
         * @return aliyunSite
         */
        public String getAliyunSite() {
            return this.aliyunSite;
        }

        public static final class Builder {
            private String alibabacloudSite; 
            private String aliyunSite; 

            /**
             * alibabacloudSite.
             */
            public Builder alibabacloudSite(String alibabacloudSite) {
                this.alibabacloudSite = alibabacloudSite;
                return this;
            }

            /**
             * aliyunSite.
             */
            public Builder aliyunSite(String aliyunSite) {
                this.aliyunSite = aliyunSite;
                return this;
            }

            public ApiDoc build() {
                return new ApiDoc(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class ProductName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cnName")
        private String cnName;

        @com.aliyun.core.annotation.NameInMap("enName")
        private String enName;

        private ProductName(Builder builder) {
            this.cnName = builder.cnName;
            this.enName = builder.enName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductName create() {
            return builder().build();
        }

        /**
         * @return cnName
         */
        public String getCnName() {
            return this.cnName;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        public static final class Builder {
            private String cnName; 
            private String enName; 

            /**
             * cnName.
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * enName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            public ProductName build() {
                return new ProductName(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class BasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
        private AccessDeniedDetail accessDeniedDetail;

        @com.aliyun.core.annotation.NameInMap("api")
        private String api;

        @com.aliyun.core.annotation.NameInMap("apiDoc")
        private ApiDoc apiDoc;

        @com.aliyun.core.annotation.NameInMap("apiStyle")
        private String apiStyle;

        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("gatewayProcessTime")
        private String gatewayProcessTime;

        @com.aliyun.core.annotation.NameInMap("httpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("httpStatusCode")
        private String httpStatusCode;

        @com.aliyun.core.annotation.NameInMap("logRequestId")
        private String logRequestId;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("productName")
        private ProductName productName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("requestDuration")
        private String requestDuration;

        @com.aliyun.core.annotation.NameInMap("sdkRequestTime")
        private String sdkRequestTime;

        @com.aliyun.core.annotation.NameInMap("throttlingResult")
        private String throttlingResult;

        private BasicInfo(Builder builder) {
            this.accessDeniedDetail = builder.accessDeniedDetail;
            this.api = builder.api;
            this.apiDoc = builder.apiDoc;
            this.apiStyle = builder.apiStyle;
            this.apiVersion = builder.apiVersion;
            this.endpoint = builder.endpoint;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.gatewayProcessTime = builder.gatewayProcessTime;
            this.httpMethod = builder.httpMethod;
            this.httpStatusCode = builder.httpStatusCode;
            this.logRequestId = builder.logRequestId;
            this.product = builder.product;
            this.productName = builder.productName;
            this.regionId = builder.regionId;
            this.requestDuration = builder.requestDuration;
            this.sdkRequestTime = builder.sdkRequestTime;
            this.throttlingResult = builder.throttlingResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicInfo create() {
            return builder().build();
        }

        /**
         * @return accessDeniedDetail
         */
        public AccessDeniedDetail getAccessDeniedDetail() {
            return this.accessDeniedDetail;
        }

        /**
         * @return api
         */
        public String getApi() {
            return this.api;
        }

        /**
         * @return apiDoc
         */
        public ApiDoc getApiDoc() {
            return this.apiDoc;
        }

        /**
         * @return apiStyle
         */
        public String getApiStyle() {
            return this.apiStyle;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
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
         * @return gatewayProcessTime
         */
        public String getGatewayProcessTime() {
            return this.gatewayProcessTime;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return httpStatusCode
         */
        public String getHttpStatusCode() {
            return this.httpStatusCode;
        }

        /**
         * @return logRequestId
         */
        public String getLogRequestId() {
            return this.logRequestId;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return productName
         */
        public ProductName getProductName() {
            return this.productName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requestDuration
         */
        public String getRequestDuration() {
            return this.requestDuration;
        }

        /**
         * @return sdkRequestTime
         */
        public String getSdkRequestTime() {
            return this.sdkRequestTime;
        }

        /**
         * @return throttlingResult
         */
        public String getThrottlingResult() {
            return this.throttlingResult;
        }

        public static final class Builder {
            private AccessDeniedDetail accessDeniedDetail; 
            private String api; 
            private ApiDoc apiDoc; 
            private String apiStyle; 
            private String apiVersion; 
            private String endpoint; 
            private String errorCode; 
            private String errorMessage; 
            private String gatewayProcessTime; 
            private String httpMethod; 
            private String httpStatusCode; 
            private String logRequestId; 
            private String product; 
            private ProductName productName; 
            private String regionId; 
            private String requestDuration; 
            private String sdkRequestTime; 
            private String throttlingResult; 

            /**
             * accessDeniedDetail.
             */
            public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
                this.accessDeniedDetail = accessDeniedDetail;
                return this;
            }

            /**
             * api.
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * apiDoc.
             */
            public Builder apiDoc(ApiDoc apiDoc) {
                this.apiDoc = apiDoc;
                return this;
            }

            /**
             * apiStyle.
             */
            public Builder apiStyle(String apiStyle) {
                this.apiStyle = apiStyle;
                return this;
            }

            /**
             * apiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * gatewayProcessTime.
             */
            public Builder gatewayProcessTime(String gatewayProcessTime) {
                this.gatewayProcessTime = gatewayProcessTime;
                return this;
            }

            /**
             * httpMethod.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * httpStatusCode.
             */
            public Builder httpStatusCode(String httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            /**
             * logRequestId.
             */
            public Builder logRequestId(String logRequestId) {
                this.logRequestId = logRequestId;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(ProductName productName) {
                this.productName = productName;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * requestDuration.
             */
            public Builder requestDuration(String requestDuration) {
                this.requestDuration = requestDuration;
                return this;
            }

            /**
             * sdkRequestTime.
             */
            public Builder sdkRequestTime(String sdkRequestTime) {
                this.sdkRequestTime = sdkRequestTime;
                return this;
            }

            /**
             * throttlingResult.
             */
            public Builder throttlingResult(String throttlingResult) {
                this.throttlingResult = throttlingResult;
                return this;
            }

            public BasicInfo build() {
                return new BasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class CallerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("callerAccountId")
        private String callerAccountId;

        @com.aliyun.core.annotation.NameInMap("callerIp")
        private String callerIp;

        @com.aliyun.core.annotation.NameInMap("callerType")
        private String callerType;

        @com.aliyun.core.annotation.NameInMap("masterAccountId")
        private String masterAccountId;

        @com.aliyun.core.annotation.NameInMap("userAgent")
        private String userAgent;

        private CallerInfo(Builder builder) {
            this.callerAccountId = builder.callerAccountId;
            this.callerIp = builder.callerIp;
            this.callerType = builder.callerType;
            this.masterAccountId = builder.masterAccountId;
            this.userAgent = builder.userAgent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallerInfo create() {
            return builder().build();
        }

        /**
         * @return callerAccountId
         */
        public String getCallerAccountId() {
            return this.callerAccountId;
        }

        /**
         * @return callerIp
         */
        public String getCallerIp() {
            return this.callerIp;
        }

        /**
         * @return callerType
         */
        public String getCallerType() {
            return this.callerType;
        }

        /**
         * @return masterAccountId
         */
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        /**
         * @return userAgent
         */
        public String getUserAgent() {
            return this.userAgent;
        }

        public static final class Builder {
            private String callerAccountId; 
            private String callerIp; 
            private String callerType; 
            private String masterAccountId; 
            private String userAgent; 

            /**
             * callerAccountId.
             */
            public Builder callerAccountId(String callerAccountId) {
                this.callerAccountId = callerAccountId;
                return this;
            }

            /**
             * callerIp.
             */
            public Builder callerIp(String callerIp) {
                this.callerIp = callerIp;
                return this;
            }

            /**
             * callerType.
             */
            public Builder callerType(String callerType) {
                this.callerType = callerType;
                return this;
            }

            /**
             * masterAccountId.
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * userAgent.
             */
            public Builder userAgent(String userAgent) {
                this.userAgent = userAgent;
                return this;
            }

            public CallerInfo build() {
                return new CallerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
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
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Boolean required; 
            private String type; 
            private Object value; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class Responses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("responseBody")
        private String responseBody;

        @com.aliyun.core.annotation.NameInMap("responseBodyFormat")
        private String responseBodyFormat;

        private Responses(Builder builder) {
            this.responseBody = builder.responseBody;
            this.responseBodyFormat = builder.responseBodyFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Responses create() {
            return builder().build();
        }

        /**
         * @return responseBody
         */
        public String getResponseBody() {
            return this.responseBody;
        }

        /**
         * @return responseBodyFormat
         */
        public String getResponseBodyFormat() {
            return this.responseBodyFormat;
        }

        public static final class Builder {
            private String responseBody; 
            private String responseBodyFormat; 

            /**
             * responseBody.
             */
            public Builder responseBody(String responseBody) {
                this.responseBody = responseBody;
                return this;
            }

            /**
             * responseBodyFormat.
             */
            public Builder responseBodyFormat(String responseBodyFormat) {
                this.responseBodyFormat = responseBodyFormat;
                return this;
            }

            public Responses build() {
                return new Responses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOwnRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOwnRequestLogResponseBody</p>
     */
    public static class LogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authenticationInfo")
        private AuthenticationInfo authenticationInfo;

        @com.aliyun.core.annotation.NameInMap("basicInfo")
        private BasicInfo basicInfo;

        @com.aliyun.core.annotation.NameInMap("callerInfo")
        private CallerInfo callerInfo;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("responses")
        private Responses responses;

        private LogInfo(Builder builder) {
            this.authenticationInfo = builder.authenticationInfo;
            this.basicInfo = builder.basicInfo;
            this.callerInfo = builder.callerInfo;
            this.parameters = builder.parameters;
            this.responses = builder.responses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfo create() {
            return builder().build();
        }

        /**
         * @return authenticationInfo
         */
        public AuthenticationInfo getAuthenticationInfo() {
            return this.authenticationInfo;
        }

        /**
         * @return basicInfo
         */
        public BasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        /**
         * @return callerInfo
         */
        public CallerInfo getCallerInfo() {
            return this.callerInfo;
        }

        /**
         * @return parameters
         */
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return responses
         */
        public Responses getResponses() {
            return this.responses;
        }

        public static final class Builder {
            private AuthenticationInfo authenticationInfo; 
            private BasicInfo basicInfo; 
            private CallerInfo callerInfo; 
            private java.util.List<Parameters> parameters; 
            private Responses responses; 

            /**
             * authenticationInfo.
             */
            public Builder authenticationInfo(AuthenticationInfo authenticationInfo) {
                this.authenticationInfo = authenticationInfo;
                return this;
            }

            /**
             * basicInfo.
             */
            public Builder basicInfo(BasicInfo basicInfo) {
                this.basicInfo = basicInfo;
                return this;
            }

            /**
             * callerInfo.
             */
            public Builder callerInfo(CallerInfo callerInfo) {
                this.callerInfo = callerInfo;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * responses.
             */
            public Builder responses(Responses responses) {
                this.responses = responses;
                return this;
            }

            public LogInfo build() {
                return new LogInfo(this);
            } 

        } 

    }
}
