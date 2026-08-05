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
 * {@link ListOfflineTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListOfflineTaskResponseBody</p>
 */
public class ListOfflineTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOfflineTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfflineTaskResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOfflineTaskResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOfflineTaskResponseBody build() {
            return new ListOfflineTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineTaskResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Meta(Builder builder) {
            this.labels = builder.labels;
            this.regionId = builder.regionId;
            this.taskName = builder.taskName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.List<String> labels; 
            private String regionId; 
            private String taskName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.labels = model.labels;
                this.regionId = model.regionId;
                this.taskName = model.taskName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * Labels.
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineTaskResponseBody</p>
     */
    public static class Processors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private java.util.Map<String, String> input;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Output")
        private java.util.Map<String, String> output;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Processors(Builder builder) {
            this.input = builder.input;
            this.name = builder.name;
            this.output = builder.output;
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
        public java.util.Map<String, String> getInput() {
            return this.input;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public java.util.Map<String, String> getOutput() {
            return this.output;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map<String, String> input; 
            private String name; 
            private java.util.Map<String, String> output; 
            private java.util.Map<String, String> parameters; 
            private String type; 

            private Builder() {
            } 

            private Builder(Processors model) {
                this.input = model.input;
                this.name = model.name;
                this.output = model.output;
                this.parameters = model.parameters;
                this.type = model.type;
            } 

            /**
             * Input.
             */
            public Builder input(java.util.Map<String, String> input) {
                this.input = input;
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
             * Output.
             */
            public Builder output(java.util.Map<String, String> output) {
                this.output = output;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Type.
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
     * {@link ListOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineTaskResponseBody</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private java.util.List<java.util.Map<String, String>> schema;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(java.util.List<java.util.Map<String, String>> schema) {
                this.schema = schema;
                return this;
            }

            /**
             * Type.
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
     * {@link ListOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineTaskResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private java.util.List<java.util.Map<String, String>> schema;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(java.util.List<java.util.Map<String, String>> schema) {
                this.schema = schema;
                return this;
            }

            /**
             * Type.
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
     * {@link ListOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineTaskResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("MetricData")
        private java.util.Map<String, String> metricData;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Status(Builder builder) {
            this.createTime = builder.createTime;
            this.metricData = builder.metricData;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
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
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return metricData
         */
        public java.util.Map<String, String> getMetricData() {
            return this.metricData;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.Map<String, String> metricData; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.createTime = model.createTime;
                this.metricData = model.metricData;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MetricData.
             */
            public Builder metricData(java.util.Map<String, String> metricData) {
                this.metricData = metricData;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOfflineTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("Processors")
        private java.util.List<Processors> processors;

        @com.aliyun.core.annotation.NameInMap("Sink")
        private java.util.List<Sink> sink;

        @com.aliyun.core.annotation.NameInMap("Source")
        private java.util.List<Source> source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        private Result(Builder builder) {
            this.meta = builder.meta;
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
            private java.util.List<Processors> processors; 
            private java.util.List<Sink> sink; 
            private java.util.List<Source> source; 
            private Status status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.meta = model.meta;
                this.processors = model.processors;
                this.sink = model.sink;
                this.source = model.source;
                this.status = model.status;
            } 

            /**
             * Meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Processors.
             */
            public Builder processors(java.util.List<Processors> processors) {
                this.processors = processors;
                return this;
            }

            /**
             * Sink.
             */
            public Builder sink(java.util.List<Sink> sink) {
                this.sink = sink;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(java.util.List<Source> source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
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
