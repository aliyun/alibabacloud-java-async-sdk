// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceMethodPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceMethodPageResponseBody</p>
 */
public class GetServiceMethodPageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetServiceMethodPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceMethodPageResponseBody create() {
        return builder().build();
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 请求响应数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求id。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 请求是否成功。
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceMethodPageResponseBody build() {
            return new GetServiceMethodPageResponseBody(this);
        } 

    } 

    public static class ParameterDefinitions extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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
             * 参数描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 参数名字。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 参数类型。
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
    public static class Result extends TeaModel {
        @NameInMap("MethodController")
        private String methodController;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameDetail")
        private String nameDetail;

        @NameInMap("ParameterDefinitions")
        private java.util.List < ParameterDefinitions> parameterDefinitions;

        @NameInMap("ParameterDetails")
        private java.util.List < String > parameterDetails;

        @NameInMap("ParameterTypes")
        private java.util.List < String > parameterTypes;

        @NameInMap("Paths")
        private java.util.List < String > paths;

        @NameInMap("RequestMethods")
        private java.util.List < String > requestMethods;

        @NameInMap("ReturnDetails")
        private String returnDetails;

        @NameInMap("ReturnType")
        private String returnType;

        private Result(Builder builder) {
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

        public static Result create() {
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
             * 接口所在的Controller类全称。
             */
            public Builder methodController(String methodController) {
                this.methodController = methodController;
                return this;
            }

            /**
             * 方法名。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 接口描述信息。
             */
            public Builder nameDetail(String nameDetail) {
                this.nameDetail = nameDetail;
                return this;
            }

            /**
             * 参数的详细定义。
             */
            public Builder parameterDefinitions(java.util.List < ParameterDefinitions> parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * 接口参数类型。
             */
            public Builder parameterDetails(java.util.List < String > parameterDetails) {
                this.parameterDetails = parameterDetails;
                return this;
            }

            /**
             * 参数类型。
             */
            public Builder parameterTypes(java.util.List < String > parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * 接口对应的请求路径列表。
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * HTTP请求方法。
             */
            public Builder requestMethods(java.util.List < String > requestMethods) {
                this.requestMethods = requestMethods;
                return this;
            }

            /**
             * 返回值类型。
             */
            public Builder returnDetails(String returnDetails) {
                this.returnDetails = returnDetails;
                return this;
            }

            /**
             * 返回值类型。
             */
            public Builder returnType(String returnType) {
                this.returnType = returnType;
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
             * 第几页。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 每页大小
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 方法描述列表。
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * 方法总数量。
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
