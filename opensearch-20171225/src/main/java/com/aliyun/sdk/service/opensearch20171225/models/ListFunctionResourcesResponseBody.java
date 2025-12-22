// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListFunctionResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionResourcesResponseBody</p>
 */
public class ListFunctionResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("Latency")
    private Double latency;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListFunctionResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.latency = builder.latency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionResourcesResponseBody create() {
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
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return latency
     */
    public Double getLatency() {
        return this.latency;
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Long httpCode; 
        private Double latency; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private String status; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListFunctionResourcesResponseBody model) {
            this.code = model.code;
            this.httpCode = model.httpCode;
            this.latency = model.latency;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The error code returned. If no error occurs, this value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource.InvalidResourceName</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The amount of time consumed for the request. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder latency(Double latency) {
            this.latency = latency;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid resource name.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;3A809095-C554-5CF5-8FCE-BE19D4673790&quot;</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The results returned.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The status of the request. Valid values: OK and FAIL.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total number of records that meet the requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFunctionResourcesResponseBody build() {
            return new ListFunctionResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFunctionResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionResourcesResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Features(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
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
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>system_item_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>item</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>user</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>item</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionResourcesResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<Features> features;

        private Input(Builder builder) {
            this.features = builder.features;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public java.util.List<Features> getFeatures() {
            return this.features;
        }

        public static final class Builder {
            private java.util.List<Features> features; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.features = model.features;
            } 

            /**
             * <p>The input features.</p>
             */
            public Builder features(java.util.List<Features> features) {
                this.features = features;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionResourcesResponseBody</p>
     */
    public static class Generators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Generator")
        private String generator;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private Generators(Builder builder) {
            this.generator = builder.generator;
            this.input = builder.input;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Generators create() {
            return builder().build();
        }

        /**
         * @return generator
         */
        public String getGenerator() {
            return this.generator;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String generator; 
            private Input input; 
            private String output; 

            private Builder() {
            } 

            private Builder(Generators model) {
                this.generator = model.generator;
                this.input = model.input;
                this.output = model.output;
            } 

            /**
             * <p>The type of the feature generator.</p>
             * 
             * <strong>example:</strong>
             * <p>combo</p>
             */
            public Builder generator(String generator) {
                this.generator = generator;
                return this;
            }

            /**
             * <p>The input.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The name of the output feature.</p>
             * 
             * <strong>example:</strong>
             * <p>feature1</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Generators build() {
                return new Generators(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Generators")
        private java.util.List<Generators> generators;

        private Data(Builder builder) {
            this.content = builder.content;
            this.generators = builder.generators;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return generators
         */
        public java.util.List<Generators> getGenerators() {
            return this.generators;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<Generators> generators; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.generators = model.generators;
            } 

            /**
             * <p>The content of the file that corresponds to a resource of the raw_file type.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;abc&quot;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The feature generators that correspond to resources of the feature_generator type.</p>
             */
            public Builder generators(java.util.List<Generators> generators) {
                this.generators = generators;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionResourcesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ReferencedInstances")
        private java.util.List<String> referencedInstances;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.data = builder.data;
            this.description = builder.description;
            this.functionName = builder.functionName;
            this.modifyTime = builder.modifyTime;
            this.referencedInstances = builder.referencedInstances;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return referencedInstances
         */
        public java.util.List<String> getReferencedInstances() {
            return this.referencedInstances;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long createTime; 
            private Data data; 
            private String description; 
            private String functionName; 
            private Long modifyTime; 
            private java.util.List<String> referencedInstances; 
            private String resourceName; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.data = model.data;
                this.description = model.description;
                this.functionName = model.functionName;
                this.modifyTime = model.modifyTime;
                this.referencedInstances = model.referencedInstances;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The time when the resource was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The resource data. The data structure varies with the resource type.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The description of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>resource description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>rank</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The time when the resource was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The algorithm instances that are referenced.</p>
             */
            public Builder referencedInstances(java.util.List<String> referencedInstances) {
                this.referencedInstances = referencedInstances;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>fg_json</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>feature_generator</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
