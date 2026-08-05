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
 * {@link CreateOfflineTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOfflineTaskRequest</p>
 */
public class CreateOfflineTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List<Processors> processors;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sink")
    private java.util.List<Sink> sink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private java.util.List<Source> source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private Status status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("draft")
    private Boolean draft;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateOfflineTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.type = builder.type;
        this.meta = builder.meta;
        this.parameters = builder.parameters;
        this.processors = builder.processors;
        this.sink = builder.sink;
        this.source = builder.source;
        this.status = builder.status;
        this.draft = builder.draft;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOfflineTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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

    /**
     * @return draft
     */
    public Boolean getDraft() {
        return this.draft;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOfflineTaskRequest, Builder> {
        private String workspaceName; 
        private String type; 
        private Meta meta; 
        private java.util.Map<String, ?> parameters; 
        private java.util.List<Processors> processors; 
        private java.util.List<Sink> sink; 
        private java.util.List<Source> source; 
        private Status status; 
        private Boolean draft; 
        private Boolean dryRun; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOfflineTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.type = request.type;
            this.meta = request.meta;
            this.parameters = request.parameters;
            this.processors = request.processors;
            this.sink = request.sink;
            this.source = request.source;
            this.status = request.status;
            this.draft = request.draft;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * meta.
         */
        public Builder meta(Meta meta) {
            this.putBodyParameter("meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * processors.
         */
        public Builder processors(java.util.List<Processors> processors) {
            this.putBodyParameter("processors", processors);
            this.processors = processors;
            return this;
        }

        /**
         * sink.
         */
        public Builder sink(java.util.List<Sink> sink) {
            this.putBodyParameter("sink", sink);
            this.sink = sink;
            return this;
        }

        /**
         * source.
         */
        public Builder source(java.util.List<Source> source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Status status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * draft.
         */
        public Builder draft(Boolean draft) {
            this.putQueryParameter("draft", draft);
            this.draft = draft;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateOfflineTaskRequest build() {
            return new CreateOfflineTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOfflineTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOfflineTaskRequest</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("computeResource")
        private String computeResource;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        private Meta(Builder builder) {
            this.apiKey = builder.apiKey;
            this.computeResource = builder.computeResource;
            this.labels = builder.labels;
            this.regionId = builder.regionId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return computeResource
         */
        public String getComputeResource() {
            return this.computeResource;
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

        public static final class Builder {
            private String apiKey; 
            private String computeResource; 
            private java.util.List<String> labels; 
            private String regionId; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.apiKey = model.apiKey;
                this.computeResource = model.computeResource;
                this.labels = model.labels;
                this.regionId = model.regionId;
                this.taskName = model.taskName;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * computeResource.
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * labels.
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
     * {@link CreateOfflineTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOfflineTaskRequest</p>
     */
    public static class Processors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("input")
        private java.util.Map<String, ?> input;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("output")
        private java.util.Map<String, ?> output;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("type")
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
         * @return output
         */
        public java.util.Map<String, ?> getOutput() {
            return this.output;
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
            private java.util.Map<String, ?> output; 
            private java.util.Map<String, ?> parameters; 
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
             * output.
             */
            public Builder output(java.util.Map<String, ?> output) {
                this.output = output;
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
     * {@link CreateOfflineTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOfflineTaskRequest</p>
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
     * {@link CreateOfflineTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOfflineTaskRequest</p>
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
     * {@link CreateOfflineTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateOfflineTaskRequest</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("deleteTime")
        private Long deleteTime;

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
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleteTime
         */
        public Long getDeleteTime() {
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
            private Long createTime; 
            private Long deleteTime; 
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
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * deleteTime.
             */
            public Builder deleteTime(Long deleteTime) {
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
}
