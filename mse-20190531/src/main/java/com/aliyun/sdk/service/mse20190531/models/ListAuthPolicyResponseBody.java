// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthPolicyResponseBody</p>
 */
public class ListAuthPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The response code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAuthPolicyResponseBody build() {
            return new ListAuthPolicyResponseBody(this);
        } 

    } 

    public static class Method extends TeaModel {
        @NameInMap("Group")
        private String group;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParameterTypes")
        private java.util.List < String > parameterTypes;

        @NameInMap("ReturnType")
        private String returnType;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Version")
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
        public java.util.List < String > getParameterTypes() {
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
            private java.util.List < String > parameterTypes; 
            private String returnType; 
            private String serviceName; 
            private String version; 

            /**
             * The group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The method name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The types of request parameters.
             */
            public Builder parameterTypes(java.util.List < String > parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * The type of the return value.
             */
            public Builder returnType(String returnType) {
                this.returnType = returnType;
                return this;
            }

            /**
             * The service name.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The method version.
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
    public static class AuthRule extends TeaModel {
        @NameInMap("AppIds")
        private java.util.List < String > appIds;

        @NameInMap("AuthType")
        private Integer authType;

        @NameInMap("Black")
        private Boolean black;

        @NameInMap("K8sNamespaces")
        private java.util.List < String > k8sNamespaces;

        @NameInMap("Method")
        private Method method;

        @NameInMap("Path")
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
        public java.util.List < String > getAppIds() {
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
        public java.util.List < String > getK8sNamespaces() {
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
            private java.util.List < String > appIds; 
            private Integer authType; 
            private Boolean black; 
            private java.util.List < String > k8sNamespaces; 
            private Method method; 
            private String path; 

            /**
             * The IDs of applications.
             */
            public Builder appIds(java.util.List < String > appIds) {
                this.appIds = appIds;
                return this;
            }

            /**
             * The rule type. Valid values:
             * <p>
             * 
             * *   0: by application
             * *   1: by namespace
             */
            public Builder authType(Integer authType) {
                this.authType = authType;
                return this;
            }

            /**
             * Indicates whether the rule is a blacklist rule.
             */
            public Builder black(Boolean black) {
                this.black = black;
                return this;
            }

            /**
             * The queried namespaces.
             */
            public Builder k8sNamespaces(java.util.List < String > k8sNamespaces) {
                this.k8sNamespaces = k8sNamespaces;
                return this;
            }

            /**
             * The request method.
             */
            public Builder method(Method method) {
                this.method = method;
                return this;
            }

            /**
             * The service path.
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
    public static class Result extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AuthRule")
        private java.util.List < AuthRule> authRule;

        @NameInMap("AuthType")
        private Integer authType;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("K8sNamespace")
        private String k8sNamespace;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
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
        public java.util.List < AuthRule> getAuthRule() {
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
            private java.util.List < AuthRule> authRule; 
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
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The application ID.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The application name.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The content of the service authentication rule.
             */
            public Builder authRule(java.util.List < AuthRule> authRule) {
                this.authRule = authRule;
                return this;
            }

            /**
             * The rule type. Valid values:
             * <p>
             * 
             * *   0: by application
             * *   1: by namespace
             */
            public Builder authType(Integer authType) {
                this.authType = authType;
                return this;
            }

            /**
             * Indicates whether the rule was enabled or disabled. Valid values:
             * <p>
             * 
             * *   `true`: enabled
             * *   `false`: disabled
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The rule ID.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * The name of the authentication rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace ID.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The protocol type. Valid values:
             * <p>
             * 
             * *   **SPRING_CLOUD**
             * *   **DUBBO**
             * *   **istio**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The source of the application.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The status.
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
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
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
        public java.util.List < Result> getResult() {
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
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The data returned.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The total number of entries.
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
