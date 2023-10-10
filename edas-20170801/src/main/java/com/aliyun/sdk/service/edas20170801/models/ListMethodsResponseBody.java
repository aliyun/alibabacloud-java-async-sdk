// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMethodsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMethodsResponseBody</p>
 */
public class ListMethodsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceMethodList")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message that indicates whether the request is successful.
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
         * The information about service methods.
         */
        public Builder serviceMethodList(ServiceMethodList serviceMethodList) {
            this.serviceMethodList = serviceMethodList;
            return this;
        }

        public ListMethodsResponseBody build() {
            return new ListMethodsResponseBody(this);
        } 

    } 

    public static class InputParams extends TeaModel {
        @NameInMap("InputParam")
        private java.util.List < String > inputParam;

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
        public java.util.List < String > getInputParam() {
            return this.inputParam;
        }

        public static final class Builder {
            private java.util.List < String > inputParam; 

            /**
             * InputParam.
             */
            public Builder inputParam(java.util.List < String > inputParam) {
                this.inputParam = inputParam;
                return this;
            }

            public InputParams build() {
                return new InputParams(this);
            } 

        } 

    }
    public static class ParamTypes extends TeaModel {
        @NameInMap("ParamType")
        private java.util.List < String > paramType;

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
        public java.util.List < String > getParamType() {
            return this.paramType;
        }

        public static final class Builder {
            private java.util.List < String > paramType; 

            /**
             * ParamType.
             */
            public Builder paramType(java.util.List < String > paramType) {
                this.paramType = paramType;
                return this;
            }

            public ParamTypes build() {
                return new ParamTypes(this);
            } 

        } 

    }
    public static class ServiceMethod extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("InputParams")
        private InputParams inputParams;

        @NameInMap("MethodName")
        private String methodName;

        @NameInMap("Output")
        private String output;

        @NameInMap("ParamTypes")
        private ParamTypes paramTypes;

        @NameInMap("ServiceName")
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

            /**
             * The name of the application.
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
             * The name of the service method.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * The return type of the service method.
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
             * The name of the service.
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
    public static class ServiceMethodList extends TeaModel {
        @NameInMap("ServiceMethod")
        private java.util.List < ServiceMethod> serviceMethod;

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
        public java.util.List < ServiceMethod> getServiceMethod() {
            return this.serviceMethod;
        }

        public static final class Builder {
            private java.util.List < ServiceMethod> serviceMethod; 

            /**
             * ServiceMethod.
             */
            public Builder serviceMethod(java.util.List < ServiceMethod> serviceMethod) {
                this.serviceMethod = serviceMethod;
                return this;
            }

            public ServiceMethodList build() {
                return new ServiceMethodList(this);
            } 

        } 

    }
}
