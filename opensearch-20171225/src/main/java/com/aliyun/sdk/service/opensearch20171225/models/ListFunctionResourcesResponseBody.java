// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Result> result;

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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
        private String status; 
        private Long totalCount; 

        /**
         * The error code returned. If no error occurs, this value is empty.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The amount of time consumed for the request. Unit: milliseconds.
         */
        public Builder latency(Double latency) {
            this.latency = latency;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The results returned.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * The status of the request. Valid values: OK and FAIL.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The total number of records that meet the requirements.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFunctionResourcesResponseBody build() {
            return new ListFunctionResourcesResponseBody(this);
        } 

    } 

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

            /**
             * The name of the feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the feature.
             * <p>
             * 
             * Valid values:
             * 
             * *   item
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   user
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List < Features> features;

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
        public java.util.List < Features> getFeatures() {
            return this.features;
        }

        public static final class Builder {
            private java.util.List < Features> features; 

            /**
             * The input features.
             */
            public Builder features(java.util.List < Features> features) {
                this.features = features;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
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

            /**
             * The type of the feature generator.
             */
            public Builder generator(String generator) {
                this.generator = generator;
                return this;
            }

            /**
             * The input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * The name of the output feature.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Generators")
        private java.util.List < Generators> generators;

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
        public java.util.List < Generators> getGenerators() {
            return this.generators;
        }

        public static final class Builder {
            private String content; 
            private java.util.List < Generators> generators; 

            /**
             * The content of the file that corresponds to a resource of the raw_file type.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The feature generators that correspond to resources of the feature_generator type.
             */
            public Builder generators(java.util.List < Generators> generators) {
                this.generators = generators;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
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
        private java.util.List < String > referencedInstances;

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
        public java.util.List < String > getReferencedInstances() {
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
            private java.util.List < String > referencedInstances; 
            private String resourceName; 
            private String resourceType; 

            /**
             * The time when the resource was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The resource data. The data structure varies with the resource type.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * The description of the resource.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the feature.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The time when the resource was modified. Unit: milliseconds.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The algorithm instances that are referenced.
             */
            public Builder referencedInstances(java.util.List < String > referencedInstances) {
                this.referencedInstances = referencedInstances;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The type of the resource.
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
