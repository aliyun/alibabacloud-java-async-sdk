// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetServiceMethodPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
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
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
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
        private String code; 
        private Data data; 
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(String code) {
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
         * The HTTP status code that is returned.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The additional information that is returned.
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceMethodPageResponseBody build() {
            return new GetServiceMethodPageResponseBody(this);
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
             * The data format of the response.
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
    public static class Result extends TeaModel {
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

        private Result(Builder builder) {
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
             * The method.
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
             * The return value.
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
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The data about the method.
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
