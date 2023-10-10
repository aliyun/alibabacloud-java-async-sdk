// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceDetailResponseBody</p>
 */
public class GetServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Success")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned for the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceDetailResponseBody build() {
            return new GetServiceDetailResponseBody(this);
        } 

    } 

    public static class ReturnDefinition extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Type")
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

            /**
             * The ID of the return value.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type.
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
    public static class Methods extends TeaModel {
        @NameInMap("MethodController")
        private String methodController;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameDetail")
        private String nameDetail;

        @NameInMap("ParameterDefinitions")
        private String parameterDefinitions;

        @NameInMap("ParameterDetails")
        private String parameterDetails;

        @NameInMap("ParameterNames")
        private String parameterNames;

        @NameInMap("ParameterTypes")
        private String parameterTypes;

        @NameInMap("Paths")
        private String paths;

        @NameInMap("RequestMethods")
        private String requestMethods;

        @NameInMap("ReturnDefinition")
        private ReturnDefinition returnDefinition;

        @NameInMap("ReturnDetails")
        private String returnDetails;

        @NameInMap("ReturnType")
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

            /**
             * The controllers.
             */
            public Builder methodController(String methodController) {
                this.methodController = methodController;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The specific name.
             */
            public Builder nameDetail(String nameDetail) {
                this.nameDetail = nameDetail;
                return this;
            }

            /**
             * The definition of the parameter.
             */
            public Builder parameterDefinitions(String parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * The details of the parameters.
             */
            public Builder parameterDetails(String parameterDetails) {
                this.parameterDetails = parameterDetails;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterNames(String parameterNames) {
                this.parameterNames = parameterNames;
                return this;
            }

            /**
             * The data type of the parameter.
             */
            public Builder parameterTypes(String parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * The method path.
             */
            public Builder paths(String paths) {
                this.paths = paths;
                return this;
            }

            /**
             * The request method.
             */
            public Builder requestMethods(String requestMethods) {
                this.requestMethods = requestMethods;
                return this;
            }

            /**
             * The definition of the value returned by the method.
             */
            public Builder returnDefinition(ReturnDefinition returnDefinition) {
                this.returnDefinition = returnDefinition;
                return this;
            }

            /**
             * The details of the response.
             */
            public Builder returnDetails(String returnDetails) {
                this.returnDetails = returnDetails;
                return this;
            }

            /**
             * The data format of the response.
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
    public static class Data extends TeaModel {
        @NameInMap("DubboApplicationName")
        private String dubboApplicationName;

        @NameInMap("EdasAppName")
        private String edasAppName;

        @NameInMap("Group")
        private String group;

        @NameInMap("Metadata")
        private String metadata;

        @NameInMap("Methods")
        private java.util.List < Methods> methods;

        @NameInMap("RegistryType")
        private String registryType;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("SpringApplicationName")
        private String springApplicationName;

        @NameInMap("Version")
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
        public java.util.List < Methods> getMethods() {
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
            private java.util.List < Methods> methods; 
            private String registryType; 
            private String serviceName; 
            private String serviceType; 
            private String springApplicationName; 
            private String version; 

            /**
             * The name of the Dubbo application.
             */
            public Builder dubboApplicationName(String dubboApplicationName) {
                this.dubboApplicationName = dubboApplicationName;
                return this;
            }

            /**
             * The name of the Enterprise Distributed Application Service (EDAS) application.
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * The group to which the service belongs.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The metadata.
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * The methods.
             */
            public Builder methods(java.util.List < Methods> methods) {
                this.methods = methods;
                return this;
            }

            /**
             * The type of the service registry.
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The type of the service.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The name of the Spring application.
             */
            public Builder springApplicationName(String springApplicationName) {
                this.springApplicationName = springApplicationName;
                return this;
            }

            /**
             * The version number.
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
