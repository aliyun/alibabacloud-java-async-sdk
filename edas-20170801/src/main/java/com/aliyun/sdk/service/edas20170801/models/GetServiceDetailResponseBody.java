// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetServiceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceDetailResponseBody</p>
 */
public class GetServiceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetServiceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetServiceDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data structure.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceDetailResponseBody build() {
            return new GetServiceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceDetailResponseBody</p>
     */
    public static class ReturnDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ReturnDefinition(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnDefinition create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(ReturnDefinition model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the return value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>foo</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ReturnDefinition build() {
                return new ReturnDefinition(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceDetailResponseBody</p>
     */
    public static class Methods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MethodController")
        private String methodController;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameDetail")
        private String nameDetail;

        @com.aliyun.core.annotation.NameInMap("ParameterDefinitions")
        private String parameterDefinitions;

        @com.aliyun.core.annotation.NameInMap("ParameterDetails")
        private String parameterDetails;

        @com.aliyun.core.annotation.NameInMap("ParameterNames")
        private String parameterNames;

        @com.aliyun.core.annotation.NameInMap("ParameterTypes")
        private String parameterTypes;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private String paths;

        @com.aliyun.core.annotation.NameInMap("RequestMethods")
        private String requestMethods;

        @com.aliyun.core.annotation.NameInMap("ReturnDefinition")
        private ReturnDefinition returnDefinition;

        @com.aliyun.core.annotation.NameInMap("ReturnDetails")
        private String returnDetails;

        @com.aliyun.core.annotation.NameInMap("ReturnType")
        private String returnType;

        private Methods(Builder builder) {
            this.methodController = builder.methodController;
            this.name = builder.name;
            this.nameDetail = builder.nameDetail;
            this.parameterDefinitions = builder.parameterDefinitions;
            this.parameterDetails = builder.parameterDetails;
            this.parameterNames = builder.parameterNames;
            this.parameterTypes = builder.parameterTypes;
            this.paths = builder.paths;
            this.requestMethods = builder.requestMethods;
            this.returnDefinition = builder.returnDefinition;
            this.returnDetails = builder.returnDetails;
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
         * @return nameDetail
         */
        public String getNameDetail() {
            return this.nameDetail;
        }

        /**
         * @return parameterDefinitions
         */
        public String getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        /**
         * @return parameterDetails
         */
        public String getParameterDetails() {
            return this.parameterDetails;
        }

        /**
         * @return parameterNames
         */
        public String getParameterNames() {
            return this.parameterNames;
        }

        /**
         * @return parameterTypes
         */
        public String getParameterTypes() {
            return this.parameterTypes;
        }

        /**
         * @return paths
         */
        public String getPaths() {
            return this.paths;
        }

        /**
         * @return requestMethods
         */
        public String getRequestMethods() {
            return this.requestMethods;
        }

        /**
         * @return returnDefinition
         */
        public ReturnDefinition getReturnDefinition() {
            return this.returnDefinition;
        }

        /**
         * @return returnDetails
         */
        public String getReturnDetails() {
            return this.returnDetails;
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
            private String nameDetail; 
            private String parameterDefinitions; 
            private String parameterDetails; 
            private String parameterNames; 
            private String parameterTypes; 
            private String paths; 
            private String requestMethods; 
            private ReturnDefinition returnDefinition; 
            private String returnDetails; 
            private String returnType; 

            private Builder() {
            } 

            private Builder(Methods model) {
                this.methodController = model.methodController;
                this.name = model.name;
                this.nameDetail = model.nameDetail;
                this.parameterDefinitions = model.parameterDefinitions;
                this.parameterDetails = model.parameterDetails;
                this.parameterNames = model.parameterNames;
                this.parameterTypes = model.parameterTypes;
                this.paths = model.paths;
                this.requestMethods = model.requestMethods;
                this.returnDefinition = model.returnDefinition;
                this.returnDetails = model.returnDetails;
                this.returnType = model.returnType;
            } 

            /**
             * <p>The controllers.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliware.edas.DemoController</p>
             */
            public Builder methodController(String methodController) {
                this.methodController = methodController;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>feign2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The specific name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nameDetail(String nameDetail) {
                this.nameDetail = nameDetail;
                return this;
            }

            /**
             * <p>The parameter definitions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;description&quot;:&quot;&quot;,&quot;name&quot;:&quot;arg0&quot;,&quot;type&quot;:&quot;java.lang.String&quot;}]</p>
             */
            public Builder parameterDefinitions(String parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * <p>The parameter details.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder parameterDetails(String parameterDetails) {
                this.parameterDetails = parameterDetails;
                return this;
            }

            /**
             * <p>The parameter names.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder parameterNames(String parameterNames) {
                this.parameterNames = parameterNames;
                return this;
            }

            /**
             * <p>The parameter types.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;java.lang.String&quot;]</p>
             */
            public Builder parameterTypes(String parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * <p>The method paths.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/consumer-echo/feign/{str}&quot;]</p>
             */
            public Builder paths(String paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The request methods.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder requestMethods(String requestMethods) {
                this.requestMethods = requestMethods;
                return this;
            }

            /**
             * <p>The definition of the value returned by the method.</p>
             */
            public Builder returnDefinition(ReturnDefinition returnDefinition) {
                this.returnDefinition = returnDefinition;
                return this;
            }

            /**
             * <p>The response details.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder returnDetails(String returnDetails) {
                this.returnDetails = returnDetails;
                return this;
            }

            /**
             * <p>The type of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.String</p>
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
     * {@link GetServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboApplicationName")
        private String dubboApplicationName;

        @com.aliyun.core.annotation.NameInMap("EdasAppName")
        private String edasAppName;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

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
        public String getMetadata() {
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
            private String metadata; 
            private java.util.List<Methods> methods; 
            private String registryType; 
            private String serviceName; 
            private String serviceType; 
            private String springApplicationName; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dubboApplicationName = model.dubboApplicationName;
                this.edasAppName = model.edasAppName;
                this.group = model.group;
                this.metadata = model.metadata;
                this.methods = model.methods;
                this.registryType = model.registryType;
                this.serviceName = model.serviceName;
                this.serviceType = model.serviceType;
                this.springApplicationName = model.springApplicationName;
                this.version = model.version;
            } 

            /**
             * <p>The name of the Dubbo application.</p>
             * 
             * <strong>example:</strong>
             * <p>cartservice</p>
             */
            public Builder dubboApplicationName(String dubboApplicationName) {
                this.dubboApplicationName = dubboApplicationName;
                return this;
            }

            /**
             * <p>The name of the Enterprise Distributed Application Service (EDAS) application.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
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
            public Builder metadata(String metadata) {
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
             * <p>agent</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>edas.service.consumer</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>springCloud</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The name of the Spring application.</p>
             * 
             * <strong>example:</strong>
             * <p>edas.service.consumer</p>
             */
            public Builder springApplicationName(String springApplicationName) {
                this.springApplicationName = springApplicationName;
                return this;
            }

            /**
             * <p>The version number.</p>
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
