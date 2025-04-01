// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListAppServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppServicesResponseBody</p>
 */
public class ListAppServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListAppServicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ListAppServicesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code that is returned. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The request was successful.</li>
         * <li><strong>3xx</strong>: The request was redirected.</li>
         * <li><strong>4xx</strong>: The request failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the microservice.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status code. Valid values:</p>
         * <ul>
         * <li>If the request was successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned. Valid values:</p>
         * <ul>
         * <li>If the request was successful, <strong>success</strong> is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the trace. The ID is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListAppServicesResponseBody build() {
            return new ListAppServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppServicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private String instanceCount;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceGroup")
        private String serviceGroup;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePortAndProtocol")
        private java.util.Map<String, String> servicePortAndProtocol;

        @com.aliyun.core.annotation.NameInMap("ServicePorts")
        private java.util.List<Integer> servicePorts;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("ServiceVersion")
        private String serviceVersion;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.instanceCount = builder.instanceCount;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.registryType = builder.registryType;
            this.securityGroupId = builder.securityGroupId;
            this.serviceGroup = builder.serviceGroup;
            this.serviceName = builder.serviceName;
            this.servicePortAndProtocol = builder.servicePortAndProtocol;
            this.servicePorts = builder.servicePorts;
            this.serviceProtocol = builder.serviceProtocol;
            this.serviceType = builder.serviceType;
            this.serviceVersion = builder.serviceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return instanceCount
         */
        public String getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return serviceGroup
         */
        public String getServiceGroup() {
            return this.serviceGroup;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePortAndProtocol
         */
        public java.util.Map<String, String> getServicePortAndProtocol() {
            return this.servicePortAndProtocol;
        }

        /**
         * @return servicePorts
         */
        public java.util.List<Integer> getServicePorts() {
            return this.servicePorts;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String instanceCount; 
            private String namespaceId; 
            private String namespaceName; 
            private String registryType; 
            private String securityGroupId; 
            private String serviceGroup; 
            private String serviceName; 
            private java.util.Map<String, String> servicePortAndProtocol; 
            private java.util.List<Integer> servicePorts; 
            private String serviceProtocol; 
            private String serviceType; 
            private String serviceVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.instanceCount = model.instanceCount;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
                this.registryType = model.registryType;
                this.securityGroupId = model.securityGroupId;
                this.serviceGroup = model.serviceGroup;
                this.serviceName = model.serviceName;
                this.servicePortAndProtocol = model.servicePortAndProtocol;
                this.servicePorts = model.servicePorts;
                this.serviceProtocol = model.serviceProtocol;
                this.serviceType = model.serviceType;
                this.serviceVersion = model.serviceVersion;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The number of instances of the microservice.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(String instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The ID of the namespace to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The registry type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>：SAE Nacos</li>
             * <li><strong>1</strong>: SAE built-in Nacos</li>
             * <li><strong>2</strong>: MSE Nacos</li>
             * <li><strong>9</strong>: SAE Kubernets service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The IDs of the security groups.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz969ngg2e49q5i4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The group to which the microservice belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_GROUP</p>
             */
            public Builder serviceGroup(String serviceGroup) {
                this.serviceGroup = serviceGroup;
                return this;
            }

            /**
             * <p>The name of the microservice.</p>
             * 
             * <strong>example:</strong>
             * <p>frontend</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The ports and protocols.</p>
             */
            public Builder servicePortAndProtocol(java.util.Map<String, String> servicePortAndProtocol) {
                this.servicePortAndProtocol = servicePortAndProtocol;
                return this;
            }

            /**
             * <p>The list of ports.</p>
             */
            public Builder servicePorts(java.util.List<Integer> servicePorts) {
                this.servicePorts = servicePorts;
                return this;
            }

            /**
             * <p>The protocol used by the microservice.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * <p>The type of the microservice. Valid values:</p>
             * <ul>
             * <li><strong>dubbo</strong></li>
             * <li><strong>springCloud</strong></li>
             * <li><strong>hsf</strong></li>
             * <li><strong>k8sService</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>springCloud</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The version of the microservice.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
