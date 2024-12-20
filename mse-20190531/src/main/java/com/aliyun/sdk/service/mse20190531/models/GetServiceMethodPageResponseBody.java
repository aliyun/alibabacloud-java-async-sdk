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
 * {@link GetServiceMethodPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceMethodPageResponseBody</p>
 */
public class GetServiceMethodPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceMethodPageResponseBody build() {
            return new GetServiceMethodPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceMethodPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceMethodPageResponseBody</p>
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

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
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
     * {@link GetServiceMethodPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceMethodPageResponseBody</p>
     */
    public static class Result extends TeaModel {
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

            /**
             * MethodController.
             */
            public Builder methodController(String methodController) {
                this.methodController = methodController;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NameDetail.
             */
            public Builder nameDetail(String nameDetail) {
                this.nameDetail = nameDetail;
                return this;
            }

            /**
             * ParameterDefinitions.
             */
            public Builder parameterDefinitions(java.util.List<ParameterDefinitions> parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * ParameterDetails.
             */
            public Builder parameterDetails(java.util.List<String> parameterDetails) {
                this.parameterDetails = parameterDetails;
                return this;
            }

            /**
             * ParameterTypes.
             */
            public Builder parameterTypes(java.util.List<String> parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * RequestMethods.
             */
            public Builder requestMethods(java.util.List<String> requestMethods) {
                this.requestMethods = requestMethods;
                return this;
            }

            /**
             * ReturnDetails.
             */
            public Builder returnDetails(String returnDetails) {
                this.returnDetails = returnDetails;
                return this;
            }

            /**
             * ReturnType.
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
    /**
     * 
     * {@link GetServiceMethodPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceMethodPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
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
        public java.util.List<Result> getResult() {
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
            private java.util.List<Result> result; 
            private Integer totalSize; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * TotalSize.
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
