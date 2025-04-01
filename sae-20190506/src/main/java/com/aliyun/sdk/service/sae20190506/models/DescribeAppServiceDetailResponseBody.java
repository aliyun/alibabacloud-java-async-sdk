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

        private Builder() {
        } 

        private Builder(DescribeAppServiceDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the call was successful.</li>
         * <li><strong>3xx</strong>: indicates that the call was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the call failed.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
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
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error code. Valid values:</p>
         * <ul>
         * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned information.</p>
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
         * <p>B2C7874F-F109-5B34-8618-2C10BBA2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the meta data was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The metadata was obtained.</li>
         * <li><strong>false</strong>: The metadata failed to be obtained.</li>
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
         * <p>0b16399316402420740034918e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeAppServiceDetailResponseBody build() {
            return new DescribeAppServiceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppServiceDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ParameterDefinitions model) {
                this.description = model.description;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>arg0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.String</p>
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
    /**
     * 
     * {@link DescribeAppServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppServiceDetailResponseBody</p>
     */
    public static class Methods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MethodController")
        private String methodController;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameDetail")
        private String nameDetail;

        @com.aliyun.core.annotation.NameInMap("ParameterDefinitions")
        private java.util.List<ParameterDefinitions> parameterDefinitions;

        @com.aliyun.core.annotation.NameInMap("ParameterDetails")
        private java.util.List<String> parameterDetails;

        @com.aliyun.core.annotation.NameInMap("ParameterTypes")
        private java.util.List<String> parameterTypes;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("RequestMethods")
        private java.util.List<String> requestMethods;

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
        public java.util.List<ParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        /**
         * @return parameterDetails
         */
        public java.util.List<String> getParameterDetails() {
            return this.parameterDetails;
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
            private java.util.List<ParameterDefinitions> parameterDefinitions; 
            private java.util.List<String> parameterDetails; 
            private java.util.List<String> parameterTypes; 
            private java.util.List<String> paths; 
            private java.util.List<String> requestMethods; 
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
                this.parameterTypes = model.parameterTypes;
                this.paths = model.paths;
                this.requestMethods = model.requestMethods;
                this.returnDetails = model.returnDetails;
                this.returnType = model.returnType;
            } 

            /**
             * <p>The class to which the method belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>com.serverless.sae.controller.EchoController</p>
             */
            public Builder methodController(String methodController) {
                this.methodController = methodController;
                return this;
            }

            /**
             * <p>The name of the method.</p>
             * 
             * <strong>example:</strong>
             * <p>echo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The details of the method.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder nameDetail(String nameDetail) {
                this.nameDetail = nameDetail;
                return this;
            }

            /**
             * <p>The definition of the parameter.</p>
             */
            public Builder parameterDefinitions(java.util.List<ParameterDefinitions> parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * <p>The details of the parameters.</p>
             */
            public Builder parameterDetails(java.util.List<String> parameterDetails) {
                this.parameterDetails = parameterDetails;
                return this;
            }

            /**
             * <p>The types of the parameters.</p>
             */
            public Builder parameterTypes(java.util.List<String> parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * <p>The request paths. Format:</p>
             * <p><code>/path</code></p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The request methods. Valid values:</p>
             * <ul>
             * <li><strong>GET</strong></li>
             * <li><strong>ALL</strong></li>
             * </ul>
             */
            public Builder requestMethods(java.util.List<String> requestMethods) {
                this.requestMethods = requestMethods;
                return this;
            }

            /**
             * <p>The details of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder returnDetails(String returnDetails) {
                this.returnDetails = returnDetails;
                return this;
            }

            /**
             * <p>The data format of the response.</p>
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
     * {@link DescribeAppServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppServiceDetailResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePorts")
        private java.util.List<Long> servicePorts;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("ServiceTags")
        private java.util.List<String> serviceTags;

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
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePorts
         */
        public java.util.List<Long> getServicePorts() {
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
        public java.util.List<String> getServiceTags() {
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
            private java.util.Map<String, ?> metadata; 
            private java.util.List<Methods> methods; 
            private String serviceName; 
            private java.util.List<Long> servicePorts; 
            private String serviceProtocol; 
            private java.util.List<String> serviceTags; 
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
                this.serviceName = model.serviceName;
                this.servicePorts = model.servicePorts;
                this.serviceProtocol = model.serviceProtocol;
                this.serviceTags = model.serviceTags;
                this.serviceType = model.serviceType;
                this.springApplicationName = model.springApplicationName;
                this.version = model.version;
            } 

            /**
             * <p>The name of the Dubbo application.</p>
             * 
             * <strong>example:</strong>
             * <p>service-consumer</p>
             */
            public Builder dubboApplicationName(String dubboApplicationName) {
                this.dubboApplicationName = dubboApplicationName;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-micro-service-******</p>
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * <p>The group to which the service belongs. You can create a custom group.</p>
             * 
             * <strong>example:</strong>
             * <p>springCloud</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The metadata. Example: <code>{side: &quot;provider&quot;, port: &quot;18081&quot;, preserved: {register: {source: &quot;SPRING_CLOUD&quot;}},…}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{side: &quot;provider&quot;, port: &quot;18081&quot;, preserved: {register: {source: &quot;SPRING_CLOUD&quot;}},…}</p>
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
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>service-provider</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The port used by the service.</p>
             */
            public Builder servicePorts(java.util.List<Long> servicePorts) {
                this.servicePorts = servicePorts;
                return this;
            }

            /**
             * <p>The protocol used by the service.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * <p>The tag of the service.</p>
             */
            public Builder serviceTags(java.util.List<String> serviceTags) {
                this.serviceTags = serviceTags;
                return this;
            }

            /**
             * <p>The type of the service. Valid values:</p>
             * <ul>
             * <li><strong>dubbo</strong></li>
             * <li><strong>springCloud</strong></li>
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
             * <p>The name of the Spring Cloud application.</p>
             * 
             * <strong>example:</strong>
             * <p>service-provider</p>
             */
            public Builder springApplicationName(String springApplicationName) {
                this.springApplicationName = springApplicationName;
                return this;
            }

            /**
             * <p>The version of the service. You can create a custom version.</p>
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
