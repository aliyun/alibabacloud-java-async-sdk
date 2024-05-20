// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppServiceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppServiceDetailResponseBody</p>
 */
public class DescribeAppServiceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private DescribeAppServiceDetailResponseBody(Builder builder) {
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

    public static DescribeAppServiceDetailResponseBody create() {
        return builder().build();
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
    public Data getData() {
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
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * - **2xx**: indicates that the call was successful.
         * - **3xx**: indicates that the call was redirected.
         * - **4xx**: indicates that the call failed.
         * - **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error code. Valid values:
         * <p>
         * 
         * - If the call is successful, the **ErrorCode** parameter is not returned.
         * - If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned information.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the meta data was obtained. Valid values:
         * <p>
         * 
         * *   **true**: The metadata was obtained.
         * *   **false**: The metadata failed to be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. The ID is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeAppServiceDetailResponseBody build() {
            return new DescribeAppServiceDetailResponseBody(this);
        } 

    } 

    public static class ParameterDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ParameterDefinitions(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterDefinitions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String type; 

            /**
             * The description of the parameter.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ParameterDefinitions build() {
                return new ParameterDefinitions(this);
            } 

        } 

    }
    public static class Methods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MethodController")
        private String methodController;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameDetail")
        private String nameDetail;

        @com.aliyun.core.annotation.NameInMap("ParameterDefinitions")
        private java.util.List < ParameterDefinitions> parameterDefinitions;

        @com.aliyun.core.annotation.NameInMap("ParameterDetails")
        private java.util.List < String > parameterDetails;

        @com.aliyun.core.annotation.NameInMap("ParameterTypes")
        private java.util.List < String > parameterTypes;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List < String > paths;

        @com.aliyun.core.annotation.NameInMap("RequestMethods")
        private java.util.List < String > requestMethods;

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
            this.parameterTypes = builder.parameterTypes;
            this.paths = builder.paths;
            this.requestMethods = builder.requestMethods;
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
        public java.util.List < ParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        /**
         * @return parameterDetails
         */
        public java.util.List < String > getParameterDetails() {
            return this.parameterDetails;
        }

        /**
         * @return parameterTypes
         */
        public java.util.List < String > getParameterTypes() {
            return this.parameterTypes;
        }

        /**
         * @return paths
         */
        public java.util.List < String > getPaths() {
            return this.paths;
        }

        /**
         * @return requestMethods
         */
        public java.util.List < String > getRequestMethods() {
            return this.requestMethods;
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
            private java.util.List < ParameterDefinitions> parameterDefinitions; 
            private java.util.List < String > parameterDetails; 
            private java.util.List < String > parameterTypes; 
            private java.util.List < String > paths; 
            private java.util.List < String > requestMethods; 
            private String returnDetails; 
            private String returnType; 

            /**
             * The class to which the method belongs.
             */
            public Builder methodController(String methodController) {
                this.methodController = methodController;
                return this;
            }

            /**
             * The name of the method.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The details of the method.
             */
            public Builder nameDetail(String nameDetail) {
                this.nameDetail = nameDetail;
                return this;
            }

            /**
             * The definition of the parameter.
             */
            public Builder parameterDefinitions(java.util.List < ParameterDefinitions> parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * The details of the parameters.
             */
            public Builder parameterDetails(java.util.List < String > parameterDetails) {
                this.parameterDetails = parameterDetails;
                return this;
            }

            /**
             * The types of the parameters.
             */
            public Builder parameterTypes(java.util.List < String > parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * The request paths. Format:
             * <p>
             * 
             * `/path`
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * The request methods. Valid values:
             * <p>
             * 
             * *   **GET**
             * *   **ALL**
             */
            public Builder requestMethods(java.util.List < String > requestMethods) {
                this.requestMethods = requestMethods;
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
        @com.aliyun.core.annotation.NameInMap("DubboApplicationName")
        private String dubboApplicationName;

        @com.aliyun.core.annotation.NameInMap("EdasAppName")
        private String edasAppName;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @com.aliyun.core.annotation.NameInMap("Methods")
        private java.util.List < Methods> methods;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePorts")
        private java.util.List < Long > servicePorts;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("ServiceTags")
        private java.util.List < String > serviceTags;

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
            this.serviceName = builder.serviceName;
            this.servicePorts = builder.servicePorts;
            this.serviceProtocol = builder.serviceProtocol;
            this.serviceTags = builder.serviceTags;
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
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        /**
         * @return methods
         */
        public java.util.List < Methods> getMethods() {
            return this.methods;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePorts
         */
        public java.util.List < Long > getServicePorts() {
            return this.servicePorts;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        /**
         * @return serviceTags
         */
        public java.util.List < String > getServiceTags() {
            return this.serviceTags;
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
            private java.util.Map < String, ? > metadata; 
            private java.util.List < Methods> methods; 
            private String serviceName; 
            private java.util.List < Long > servicePorts; 
            private String serviceProtocol; 
            private java.util.List < String > serviceTags; 
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
             * The name of the application.
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * The group to which the service belongs. You can create a custom group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The metadata. Example: `{side: "provider", port: "18081", preserved: {register: {source: "SPRING_CLOUD"}},…}`.
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
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
             * The name of the service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServicePorts.
             */
            public Builder servicePorts(java.util.List < Long > servicePorts) {
                this.servicePorts = servicePorts;
                return this;
            }

            /**
             * ServiceProtocol.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * ServiceTags.
             */
            public Builder serviceTags(java.util.List < String > serviceTags) {
                this.serviceTags = serviceTags;
                return this;
            }

            /**
             * The type of the service. Valid values:
             * <p>
             * 
             * *   **dubbo**
             * *   **springCloud**
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The name of the Spring Cloud application.
             */
            public Builder springApplicationName(String springApplicationName) {
                this.springApplicationName = springApplicationName;
                return this;
            }

            /**
             * The version of the service. You can create a custom version.
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
