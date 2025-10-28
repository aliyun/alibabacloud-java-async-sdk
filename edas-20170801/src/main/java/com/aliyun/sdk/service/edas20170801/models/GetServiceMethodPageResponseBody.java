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
 * {@link GetServiceMethodPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceMethodPageResponseBody</p>
 */
public class GetServiceMethodPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetServiceMethodPageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
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
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
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
         * <p>BDC0C0FE-D63B-4FC8-<strong><strong>-4081C57E</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The data format of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.String</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
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
             * <p>The method.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliware.edas.EchoController</p>
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
             * <p>name</p>
             */
            public Builder nameDetail(String nameDetail) {
                this.nameDetail = nameDetail;
                return this;
            }

            /**
             * <p>The definition of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;description&quot;:&quot;&quot;,&quot;name&quot;:&quot;arg0&quot;,&quot;type&quot;:&quot;java.lang.String&quot;}]</p>
             */
            public Builder parameterDefinitions(String parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * <p>The details of the parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder parameterDetails(String parameterDetails) {
                this.parameterDetails = parameterDetails;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>echo</p>
             */
            public Builder parameterNames(String parameterNames) {
                this.parameterNames = parameterNames;
                return this;
            }

            /**
             * <p>The data type of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.String</p>
             */
            public Builder parameterTypes(String parameterTypes) {
                this.parameterTypes = parameterTypes;
                return this;
            }

            /**
             * <p>The method path.</p>
             * 
             * <strong>example:</strong>
             * <p>/consumer/alive</p>
             */
            public Builder paths(String paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The request method.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder requestMethods(String requestMethods) {
                this.requestMethods = requestMethods;
                return this;
            }

            /**
             * <p>The return value.</p>
             */
            public Builder returnDefinition(ReturnDefinition returnDefinition) {
                this.returnDefinition = returnDefinition;
                return this;
            }

            /**
             * <p>The details of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.String</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The data about the method.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
