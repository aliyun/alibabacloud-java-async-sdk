// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ModifyOfflineTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyOfflineTaskResponseBody</p>
 */
public class ModifyOfflineTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ModifyOfflineTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfflineTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ModifyOfflineTaskResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0abb793917165176014887584e28d9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ModifyOfflineTaskResponseBody build() {
            return new ModifyOfflineTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeResource")
        private String computeResource;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        private Meta(Builder builder) {
            this.computeResource = builder.computeResource;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public String getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String computeResource; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.computeResource = model.computeResource;
                this.taskName = model.taskName;
            } 

            /**
             * computeResource.
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskResponseBody</p>
     */
    public static class Processors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("input")
        private java.util.Map<String, ?> input;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Processors(Builder builder) {
            this.input = builder.input;
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processors create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map<String, ?> input; 
            private String name; 
            private java.util.Map<String, ?> parameters; 
            private String type; 

            private Builder() {
            } 

            private Builder(Processors model) {
                this.input = model.input;
                this.name = model.name;
                this.parameters = model.parameters;
                this.type = model.type;
            } 

            /**
             * input.
             */
            public Builder input(java.util.Map<String, ?> input) {
                this.input = input;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Processors build() {
                return new Processors(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskResponseBody</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("primaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("schema")
        private java.util.List<java.util.Map<String, String>> schema;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Sink(Builder builder) {
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.primaryKey = builder.primaryKey;
            this.schema = builder.schema;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sink create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return schema
         */
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private java.util.Map<String, String> parameters; 
            private String primaryKey; 
            private java.util.List<java.util.Map<String, String>> schema; 
            private String type; 

            private Builder() {
            } 

            private Builder(Sink model) {
                this.name = model.name;
                this.parameters = model.parameters;
                this.primaryKey = model.primaryKey;
                this.schema = model.schema;
                this.type = model.type;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * primaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * schema.
             */
            public Builder schema(java.util.List<java.util.Map<String, String>> schema) {
                this.schema = schema;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sink build() {
                return new Sink(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("primaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("schema")
        private java.util.List<java.util.Map<String, String>> schema;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.primaryKey = builder.primaryKey;
            this.schema = builder.schema;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return schema
         */
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private java.util.Map<String, String> parameters; 
            private String primaryKey; 
            private java.util.List<java.util.Map<String, String>> schema; 
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.name = model.name;
                this.parameters = model.parameters;
                this.primaryKey = model.primaryKey;
                this.schema = model.schema;
                this.type = model.type;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * primaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * schema.
             */
            public Builder schema(java.util.List<java.util.Map<String, String>> schema) {
                this.schema = schema;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("deleteTime")
        private String deleteTime;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Status(Builder builder) {
            this.createTime = builder.createTime;
            this.deleteTime = builder.deleteTime;
            this.errorMessage = builder.errorMessage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleteTime
         */
        public String getDeleteTime() {
            return this.deleteTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String deleteTime; 
            private String errorMessage; 
            private String status; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.createTime = model.createTime;
                this.deleteTime = model.deleteTime;
                this.errorMessage = model.errorMessage;
                this.status = model.status;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * deleteTime.
             */
            public Builder deleteTime(String deleteTime) {
                this.deleteTime = deleteTime;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("processors")
        private java.util.List<Processors> processors;

        @com.aliyun.core.annotation.NameInMap("sink")
        private java.util.List<Sink> sink;

        @com.aliyun.core.annotation.NameInMap("source")
        private java.util.List<Source> source;

        @com.aliyun.core.annotation.NameInMap("status")
        private Status status;

        private Result(Builder builder) {
            this.meta = builder.meta;
            this.parameters = builder.parameters;
            this.processors = builder.processors;
            this.sink = builder.sink;
            this.source = builder.source;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return processors
         */
        public java.util.List<Processors> getProcessors() {
            return this.processors;
        }

        /**
         * @return sink
         */
        public java.util.List<Sink> getSink() {
            return this.sink;
        }

        /**
         * @return source
         */
        public java.util.List<Source> getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Meta meta; 
            private java.util.Map<String, ?> parameters; 
            private java.util.List<Processors> processors; 
            private java.util.List<Sink> sink; 
            private java.util.List<Source> source; 
            private Status status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.meta = model.meta;
                this.parameters = model.parameters;
                this.processors = model.processors;
                this.sink = model.sink;
                this.source = model.source;
                this.status = model.status;
            } 

            /**
             * meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * processors.
             */
            public Builder processors(java.util.List<Processors> processors) {
                this.processors = processors;
                return this;
            }

            /**
             * sink.
             */
            public Builder sink(java.util.List<Sink> sink) {
                this.sink = sink;
                return this;
            }

            /**
             * source.
             */
            public Builder source(java.util.List<Source> source) {
                this.source = source;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
