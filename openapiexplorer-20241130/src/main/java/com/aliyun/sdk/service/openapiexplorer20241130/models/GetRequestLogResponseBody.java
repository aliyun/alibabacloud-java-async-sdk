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
 * {@link GetRequestLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetRequestLogResponseBody</p>
 */
public class GetRequestLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logInfo")
    private LogInfo logInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRequestLogResponseBody(Builder builder) {
        this.logInfo = builder.logInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRequestLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRequestLogResponseBody model) {
            this.logInfo = model.logInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information about the log of the API call.</p>
         */
        public Builder logInfo(LogInfo logInfo) {
            this.logInfo = logInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRequestLogResponseBody build() {
            return new GetRequestLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AuthenticationInfo model) {
                this.authenticationType = model.authenticationType;
                this.signatureMethod = model.signatureMethod;
                this.signatureVersion = model.signatureVersion;
            } 

            /**
             * <p>The authentication type. Valid values:</p>
             * <ul>
             * <li>AK: includes a permanent AccessKey pair, a temporary AccessKey pair, and a STS token.</li>
             * <li>PRIVATEKEY: an AccessKey pair for an asymmetric cryptography algorithm.</li>
             * <li>BEARETOKEN: an authentication mechanism that is widely used in the OAuth 2.0 framework and cloud services.</li>
             * <li>CUSTOM_SPI: an efficient and secure authentication method that is suitable for the delivery and management of Software as a Service (SaaS) services in Alibaba Cloud Marketplace.</li>
             * <li>Anonymous: anonymous access.</li>
             * <li>DPS: an authentication method that is similar to AK. Its signature algorithm is different from that of Alibaba Cloud services and is exclusive to specific products.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AK</p>
             */
            public Builder authenticationType(String authenticationType) {
                this.authenticationType = authenticationType;
                return this;
            }

            /**
             * <p>The signature algorithm. Valid values:</p>
             * <ul>
             * <li>HMAC-SHA1</li>
             * <li>HMAC-SHA256</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HMAC-SHA256</p>
             */
            public Builder signatureMethod(String signatureMethod) {
                this.signatureMethod = signatureMethod;
                return this;
            }

            /**
             * <p>The signature version.</p>
             * 
             * <strong>example:</strong>
             * <p>unknown</p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The operation that the operator does not have permissions to perform.</p>
             * 
             * <strong>example:</strong>
             * <p>openapiexplorer:GetRequestLog</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The identity.</p>
             * 
             * <strong>example:</strong>
             * <p>205618123456123456</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the current identity belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1001234561234567</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The identity type of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>SubUser</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The information after encoding, which can be used for troubleshooting. You can call the DecodeDiagnosticMessage operation of Resource Access Management (RAM) for further diagnostics.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The cause of the permission-related error.</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The type of the policy that causes the permission-related error.</p>
             * 
             * <strong>example:</strong>
             * <p>AccountLevelIdentityBasedPolicy</p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ApiDoc model) {
                this.alibabacloudSite = model.alibabacloudSite;
                this.aliyunSite = model.aliyunSite;
            } 

            /**
             * <p>The documentation URL on the international site (alibabacloud.com).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://api.alibabacloud.com/document/Ecs/2014-05-26/RunInstances">https://api.alibabacloud.com/document/Ecs/2014-05-26/RunInstances</a></p>
             */
            public Builder alibabacloudSite(String alibabacloudSite) {
                this.alibabacloudSite = alibabacloudSite;
                return this;
            }

            /**
             * <p>The documentation URL on the China site (aliyun.com).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://api.aliyun.com/document/Ecs/2014-05-26/RunInstances">https://api.aliyun.com/document/Ecs/2014-05-26/RunInstances</a></p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ProductName model) {
                this.cnName = model.cnName;
                this.enName = model.enName;
            } 

            /**
             * <p>The product name in Chinese.</p>
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * <p>The product name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service</p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BasicInfo model) {
                this.accessDeniedDetail = model.accessDeniedDetail;
                this.api = model.api;
                this.apiDoc = model.apiDoc;
                this.apiStyle = model.apiStyle;
                this.apiVersion = model.apiVersion;
                this.endpoint = model.endpoint;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.gatewayProcessTime = model.gatewayProcessTime;
                this.httpMethod = model.httpMethod;
                this.httpStatusCode = model.httpStatusCode;
                this.logRequestId = model.logRequestId;
                this.product = model.product;
                this.productName = model.productName;
                this.regionId = model.regionId;
                this.requestDuration = model.requestDuration;
                this.sdkRequestTime = model.sdkRequestTime;
                this.throttlingResult = model.throttlingResult;
            } 

            /**
             * <p>The error message returned if the operator does not have the required permissions. This parameter is available only if an authentication error is reported for the request ID.</p>
             */
            public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
                this.accessDeniedDetail = accessDeniedDetail;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>RunInstances</p>
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * <p>The information about the API documentation.</p>
             */
            public Builder apiDoc(ApiDoc apiDoc) {
                this.apiDoc = apiDoc;
                return this;
            }

            /**
             * <p>The API style. Valid values: roa and rpc.</p>
             * 
             * <strong>example:</strong>
             * <p>roa</p>
             */
            public Builder apiStyle(String apiStyle) {
                this.apiStyle = apiStyle;
                return this;
            }

            /**
             * <p>The version of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-30</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>The endpoint of the service region.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The error code in the log. This parameter is left empty if no error is reported in the API call.</p>
             * 
             * <strong>example:</strong>
             * <p>IncorrectStatus.TransitRouter</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message in the log. This parameter is left empty if no error is reported in the API call.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource is not in a valid state for the operation.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time when the gateway receives the request. Indicate the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-21T07:43:06Z</p>
             */
            public Builder gatewayProcessTime(String gatewayProcessTime) {
                this.gatewayProcessTime = gatewayProcessTime;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values: GET, PUT, and POST.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The HTTP status code in the log.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder httpStatusCode(String httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123E4567-E89B-12D3-A456-426614174000</p>
             */
            public Builder logRequestId(String logRequestId) {
                this.logRequestId = logRequestId;
                return this;
            }

            /**
             * <p>The product code.</p>
             * 
             * <strong>example:</strong>
             * <p>Ecs</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The product name, which includes the Chinese name and English name.</p>
             */
            public Builder productName(ProductName productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The service region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The duration from when the gateway receives the request to when the client receives a response. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>188</p>
             */
            public Builder requestDuration(String requestDuration) {
                this.requestDuration = requestDuration;
                return this;
            }

            /**
             * <p>The time when the request is initiated. Indicate the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-21T07:43:06Z</p>
             */
            public Builder sdkRequestTime(String sdkRequestTime) {
                this.sdkRequestTime = sdkRequestTime;
                return this;
            }

            /**
             * <p>The throttling result. Valid values: FC.PASS: The task is not blocked by throttling. FC.DENY: The task is blocked by throttling.</p>
             * 
             * <strong>example:</strong>
             * <p>FC.PASS</p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CallerInfo model) {
                this.callerAccountId = model.callerAccountId;
                this.callerIp = model.callerIp;
                this.callerType = model.callerType;
                this.masterAccountId = model.masterAccountId;
                this.userAgent = model.userAgent;
            } 

            /**
             * <p>The account ID of the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>241009849925897811</p>
             */
            public Builder callerAccountId(String callerAccountId) {
                this.callerAccountId = callerAccountId;
                return this;
            }

            /**
             * <p>The IP address of the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>100.68.xxx.xxx</p>
             */
            public Builder callerIp(String callerIp) {
                this.callerIp = callerIp;
                return this;
            }

            /**
             * <p>The type of the caller. Valid values:</p>
             * <ol>
             * <li>customer: an Alibaba Cloud account</li>
             * <li>sub: a RAM user</li>
             * <li>AssumedRoleUser: a user that uses a temporary Security Token Service (STS) token</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>sub</p>
             */
            public Builder callerType(String callerType) {
                this.callerType = callerType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1973374733454118</p>
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * <p>The information about the user agent.</p>
             * 
             * <strong>example:</strong>
             * <p>AlibabaCloud API Workbench</p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.required = model.required;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The name of the request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceType</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the request parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The type of the request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.large</p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Responses model) {
                this.responseBody = model.responseBody;
                this.responseBodyFormat = model.responseBodyFormat;
            } 

            /**
             * <p>The response body.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder responseBody(String responseBody) {
                this.responseBody = responseBody;
                return this;
            }

            /**
             * <p>The type of the response body. Valid values: JSON, XML, and HTML.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
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
     * {@link GetRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestLogResponseBody</p>
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

            private Builder() {
            } 

            private Builder(LogInfo model) {
                this.authenticationInfo = model.authenticationInfo;
                this.basicInfo = model.basicInfo;
                this.callerInfo = model.callerInfo;
                this.parameters = model.parameters;
                this.responses = model.responses;
            } 

            /**
             * <p>The authentication information.</p>
             */
            public Builder authenticationInfo(AuthenticationInfo authenticationInfo) {
                this.authenticationInfo = authenticationInfo;
                return this;
            }

            /**
             * <p>The basic information about the log of the API call.</p>
             */
            public Builder basicInfo(BasicInfo basicInfo) {
                this.basicInfo = basicInfo;
                return this;
            }

            /**
             * <p>The information about the caller.</p>
             */
            public Builder callerInfo(CallerInfo callerInfo) {
                this.callerInfo = callerInfo;
                return this;
            }

            /**
             * <p>The information about the request parameters.</p>
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The information that is returned for the request.</p>
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
