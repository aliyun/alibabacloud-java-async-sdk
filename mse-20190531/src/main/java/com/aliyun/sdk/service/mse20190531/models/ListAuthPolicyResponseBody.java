// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListAuthPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthPolicyResponseBody</p>
 */
public class ListAuthPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAuthPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05A5A150-4A5F-5A8C-97D6-710776CC8408</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAuthPolicyResponseBody build() {
            return new ListAuthPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthPolicyResponseBody</p>
     */
    public static class Method extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParameterTypes")
        private java.util.List<String> parameterTypes;

        @com.aliyun.core.annotation.NameInMap("ReturnType")
        private String returnType;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Method(Builder builder) {
            this.group = builder.group;
            this.name = builder.name;
            this.parameterTypes = builder.parameterTypes;
            this.returnType = builder.returnType;
            this.serviceName = builder.serviceName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Method create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameterTypes
         */
        public java.util.List<String> getParameterTypes() {
            return this.parameterTypes;
        }

        /**
         * @return returnType
         */
        public String getReturnType() {
            return this.returnType;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String group; 
            private String name; 
            private java.util.List<String> parameterTypes; 
            private String returnType; 
            private String serviceName; 
            private String version; 

            /**
             * <p>The group.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The method name.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The types of request parameters.</p>
             */
            public Builder parameterTypes(java.util.List<String> parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * <p>The type of the return value.</p>
             * 
             * <strong>example:</strong>
             * <p>Boolean</p>
             */
            public Builder returnType(String returnType) {
                this.returnType = returnType;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>spring-cloud-a</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The method version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Method build() {
                return new Method(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthPolicyResponseBody</p>
     */
    public static class AuthRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppIds")
        private java.util.List<String> appIds;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private Integer authType;

        @com.aliyun.core.annotation.NameInMap("Black")
        private Boolean black;

        @com.aliyun.core.annotation.NameInMap("K8sNamespaces")
        private java.util.List<String> k8sNamespaces;

        @com.aliyun.core.annotation.NameInMap("Method")
        private Method method;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private AuthRule(Builder builder) {
            this.appIds = builder.appIds;
            this.authType = builder.authType;
            this.black = builder.black;
            this.k8sNamespaces = builder.k8sNamespaces;
            this.method = builder.method;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthRule create() {
            return builder().build();
        }

        /**
         * @return appIds
         */
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        /**
         * @return authType
         */
        public Integer getAuthType() {
            return this.authType;
        }

        /**
         * @return black
         */
        public Boolean getBlack() {
            return this.black;
        }

        /**
         * @return k8sNamespaces
         */
        public java.util.List<String> getK8sNamespaces() {
            return this.k8sNamespaces;
        }

        /**
         * @return method
         */
        public Method getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List<String> appIds; 
            private Integer authType; 
            private Boolean black; 
            private java.util.List<String> k8sNamespaces; 
            private Method method; 
            private String path; 

            /**
             * <p>The IDs of applications.</p>
             */
            public Builder appIds(java.util.List<String> appIds) {
                this.appIds = appIds;
                return this;
            }

            /**
             * <p>The rule type. Valid values:</p>
             * <ul>
             * <li>0: by application</li>
             * <li>1: by namespace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder authType(Integer authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>Indicates whether the rule is a blacklist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder black(Boolean black) {
                this.black = black;
                return this;
            }

            /**
             * <p>The queried namespaces.</p>
             */
            public Builder k8sNamespaces(java.util.List<String> k8sNamespaces) {
                this.k8sNamespaces = k8sNamespaces;
                return this;
            }

            /**
             * <p>The request method.</p>
             */
            public Builder method(Method method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The service path.</p>
             * 
             * <strong>example:</strong>
             * <p>/a</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public AuthRule build() {
                return new AuthRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthPolicyResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AuthRule")
        private java.util.List<AuthRule> authRule;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private Integer authType;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("K8sNamespace")
        private String k8sNamespace;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Result(Builder builder) {
            this.accountId = builder.accountId;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.authRule = builder.authRule;
            this.authType = builder.authType;
            this.enable = builder.enable;
            this.id = builder.id;
            this.k8sNamespace = builder.k8sNamespace;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.protocol = builder.protocol;
            this.regionId = builder.regionId;
            this.source = builder.source;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return authRule
         */
        public java.util.List<AuthRule> getAuthRule() {
            return this.authRule;
        }

        /**
         * @return authType
         */
        public Integer getAuthType() {
            return this.authType;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return k8sNamespace
         */
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountId; 
            private String appId; 
            private String appName; 
            private java.util.List<AuthRule> authRule; 
            private Integer authType; 
            private Boolean enable; 
            private Integer id; 
            private String k8sNamespace; 
            private String name; 
            private String namespaceId; 
            private String protocol; 
            private String regionId; 
            private String source; 
            private Integer status; 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>19039813784***</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hkhon1po62@5f1b08becb*****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>spring-cloud-a</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The content of the service authentication rule.</p>
             */
            public Builder authRule(java.util.List<AuthRule> authRule) {
                this.authRule = authRule;
                return this;
            }

            /**
             * <p>The rule type. Valid values:</p>
             * <ul>
             * <li>0: by application</li>
             * <li>1: by namespace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder authType(Integer authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>Indicates whether the rule was enabled or disabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: enabled</li>
             * <li><code>false</code>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>204</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>c19c6c500e1ff4d7abc7bed9b8236***</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>The name of the authentication rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ced54a95-4e33-4bda-be7e-37e95868***</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li><strong>SPRING_CLOUD</strong></li>
             * <li><strong>DUBBO</strong></li>
             * <li><strong>istio</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SPRING_CLOUD</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The source of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>edasmsc</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Result> result; 
            private Integer totalSize; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The data returned.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
