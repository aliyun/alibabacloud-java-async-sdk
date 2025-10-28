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
 * {@link ListMethodsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMethodsResponseBody</p>
 */
public class ListMethodsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceMethodList")
    private ServiceMethodList serviceMethodList;

    private ListMethodsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.serviceMethodList = builder.serviceMethodList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMethodsResponseBody create() {
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
     * @return serviceMethodList
     */
    public ServiceMethodList getServiceMethodList() {
        return this.serviceMethodList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private ServiceMethodList serviceMethodList; 

        private Builder() {
        } 

        private Builder(ListMethodsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.serviceMethodList = model.serviceMethodList;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message that indicates whether the request is successful.</p>
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
         * <p>69AD2AA7-DB47-449B-941B-B14409DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about service methods.</p>
         */
        public Builder serviceMethodList(ServiceMethodList serviceMethodList) {
            this.serviceMethodList = serviceMethodList;
            return this;
        }

        public ListMethodsResponseBody build() {
            return new ListMethodsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMethodsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMethodsResponseBody</p>
     */
    public static class InputParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputParam")
        private java.util.List<String> inputParam;

        private InputParams(Builder builder) {
            this.inputParam = builder.inputParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputParams create() {
            return builder().build();
        }

        /**
         * @return inputParam
         */
        public java.util.List<String> getInputParam() {
            return this.inputParam;
        }

        public static final class Builder {
            private java.util.List<String> inputParam; 

            private Builder() {
            } 

            private Builder(InputParams model) {
                this.inputParam = model.inputParam;
            } 

            /**
             * InputParam.
             */
            public Builder inputParam(java.util.List<String> inputParam) {
                this.inputParam = inputParam;
                return this;
            }

            public InputParams build() {
                return new InputParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMethodsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMethodsResponseBody</p>
     */
    public static class ParamTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamType")
        private java.util.List<String> paramType;

        private ParamTypes(Builder builder) {
            this.paramType = builder.paramType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamTypes create() {
            return builder().build();
        }

        /**
         * @return paramType
         */
        public java.util.List<String> getParamType() {
            return this.paramType;
        }

        public static final class Builder {
            private java.util.List<String> paramType; 

            private Builder() {
            } 

            private Builder(ParamTypes model) {
                this.paramType = model.paramType;
            } 

            /**
             * ParamType.
             */
            public Builder paramType(java.util.List<String> paramType) {
                this.paramType = paramType;
                return this;
            }

            public ParamTypes build() {
                return new ParamTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMethodsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMethodsResponseBody</p>
     */
    public static class ServiceMethod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private InputParams inputParams;

        @com.aliyun.core.annotation.NameInMap("MethodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("ParamTypes")
        private ParamTypes paramTypes;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private ServiceMethod(Builder builder) {
            this.appName = builder.appName;
            this.inputParams = builder.inputParams;
            this.methodName = builder.methodName;
            this.output = builder.output;
            this.paramTypes = builder.paramTypes;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceMethod create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return inputParams
         */
        public InputParams getInputParams() {
            return this.inputParams;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return paramTypes
         */
        public ParamTypes getParamTypes() {
            return this.paramTypes;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String appName; 
            private InputParams inputParams; 
            private String methodName; 
            private String output; 
            private ParamTypes paramTypes; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(ServiceMethod model) {
                this.appName = model.appName;
                this.inputParams = model.inputParams;
                this.methodName = model.methodName;
                this.output = model.output;
                this.paramTypes = model.paramTypes;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>App</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * InputParams.
             */
            public Builder inputParams(InputParams inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * <p>The name of the service method.</p>
             * 
             * <strong>example:</strong>
             * <p>echo</p>
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * <p>The return type of the service method.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.string</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * ParamTypes.
             */
            public Builder paramTypes(ParamTypes paramTypes) {
                this.paramTypes = paramTypes;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.edas.demo.EchoService</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServiceMethod build() {
                return new ServiceMethod(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMethodsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMethodsResponseBody</p>
     */
    public static class ServiceMethodList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceMethod")
        private java.util.List<ServiceMethod> serviceMethod;

        private ServiceMethodList(Builder builder) {
            this.serviceMethod = builder.serviceMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceMethodList create() {
            return builder().build();
        }

        /**
         * @return serviceMethod
         */
        public java.util.List<ServiceMethod> getServiceMethod() {
            return this.serviceMethod;
        }

        public static final class Builder {
            private java.util.List<ServiceMethod> serviceMethod; 

            private Builder() {
            } 

            private Builder(ServiceMethodList model) {
                this.serviceMethod = model.serviceMethod;
            } 

            /**
             * ServiceMethod.
             */
            public Builder serviceMethod(java.util.List<ServiceMethod> serviceMethod) {
                this.serviceMethod = serviceMethod;
                return this;
            }

            public ServiceMethodList build() {
                return new ServiceMethodList(this);
            } 

        } 

    }
}
