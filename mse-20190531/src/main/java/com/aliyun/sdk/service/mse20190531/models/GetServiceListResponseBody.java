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
 * {@link GetServiceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceListResponseBody</p>
 */
public class GetServiceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetServiceListResponseBody(Builder builder) {
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

    public static GetServiceListResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data entries returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxx-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceListResponseBody build() {
            return new GetServiceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceListResponseBody</p>
     */
    public static class Methods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MethodController")
        private String methodController;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParameterTypes")
        private java.util.List<String> parameterTypes;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("RequestMethods")
        private java.util.List<String> requestMethods;

        @com.aliyun.core.annotation.NameInMap("ReturnType")
        private String returnType;

        private Methods(Builder builder) {
            this.methodController = builder.methodController;
            this.name = builder.name;
            this.parameterTypes = builder.parameterTypes;
            this.paths = builder.paths;
            this.requestMethods = builder.requestMethods;
            this.returnType = builder.returnType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Methods create() {
            return builder().build();
        }

        /**
         * @return methodController
         */
        public String getMethodController() {
            return this.methodController;
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
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return requestMethods
         */
        public java.util.List<String> getRequestMethods() {
            return this.requestMethods;
        }

        /**
         * @return returnType
         */
        public String getReturnType() {
            return this.returnType;
        }

        public static final class Builder {
            private String methodController; 
            private String name; 
            private java.util.List<String> parameterTypes; 
            private java.util.List<String> paths; 
            private java.util.List<String> requestMethods; 
            private String returnType; 

            /**
             * <p>The controller of the method.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.SayHelloController</p>
             */
            public Builder methodController(String methodController) {
                this.methodController = methodController;
                return this;
            }

            /**
             * <p>The name of the method.</p>
             * 
             * <strong>example:</strong>
             * <p>sayHello</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The data types of the parameters.</p>
             */
            public Builder parameterTypes(java.util.List<String> parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * <p>The paths.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The methods.</p>
             */
            public Builder requestMethods(java.util.List<String> requestMethods) {
                this.requestMethods = requestMethods;
                return this;
            }

            /**
             * <p>The type of the return value.</p>
             * 
             * <strong>example:</strong>
             * <p>int</p>
             */
            public Builder returnType(String returnType) {
                this.returnType = returnType;
                return this;
            }

            public Methods build() {
                return new Methods(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboApplicationName")
        private String dubboApplicationName;

        @com.aliyun.core.annotation.NameInMap("EdasAppName")
        private String edasAppName;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("Methods")
        private java.util.List<Methods> methods;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("SpringApplicationName")
        private String springApplicationName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.dubboApplicationName = builder.dubboApplicationName;
            this.edasAppName = builder.edasAppName;
            this.group = builder.group;
            this.metadata = builder.metadata;
            this.methods = builder.methods;
            this.registryType = builder.registryType;
            this.serviceName = builder.serviceName;
            this.serviceType = builder.serviceType;
            this.springApplicationName = builder.springApplicationName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dubboApplicationName
         */
        public String getDubboApplicationName() {
            return this.dubboApplicationName;
        }

        /**
         * @return edasAppName
         */
        public String getEdasAppName() {
            return this.edasAppName;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return methods
         */
        public java.util.List<Methods> getMethods() {
            return this.methods;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return springApplicationName
         */
        public String getSpringApplicationName() {
            return this.springApplicationName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String dubboApplicationName; 
            private String edasAppName; 
            private String group; 
            private java.util.Map<String, ?> metadata; 
            private java.util.List<Methods> methods; 
            private String registryType; 
            private String serviceName; 
            private String serviceType; 
            private String springApplicationName; 
            private String version; 

            /**
             * <p>The name of the Dubbo application.</p>
             * 
             * <strong>example:</strong>
             * <p>dubbo-application</p>
             */
            public Builder dubboApplicationName(String dubboApplicationName) {
                this.dubboApplicationName = dubboApplicationName;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * <p>The group.</p>
             * 
             * <strong>example:</strong>
             * <p>dubbo</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The methods.</p>
             */
            public Builder methods(java.util.List<Methods> methods) {
                this.methods = methods;
                return this;
            }

            /**
             * <p>The type of the service registry.</p>
             * 
             * <strong>example:</strong>
             * <p>nacos</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.xxx</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>dubbo</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The name of the Spring application.</p>
             * 
             * <strong>example:</strong>
             * <p>spring-application</p>
             */
            public Builder springApplicationName(String springApplicationName) {
                this.springApplicationName = springApplicationName;
                return this;
            }

            /**
             * <p>The version information.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
