// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateDataQualityScanRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataQualityScanRequest</p>
 */
public class UpdateDataQualityScanRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private ComputeResource computeResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hooks")
    private java.util.List<Hooks> hooks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeResource")
    private RuntimeResource runtimeResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Trigger")
    private Trigger trigger;

    private UpdateDataQualityScanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.computeResource = builder.computeResource;
        this.description = builder.description;
        this.hooks = builder.hooks;
        this.id = builder.id;
        this.name = builder.name;
        this.owner = builder.owner;
        this.parameters = builder.parameters;
        this.projectId = builder.projectId;
        this.runtimeResource = builder.runtimeResource;
        this.spec = builder.spec;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataQualityScanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return computeResource
     */
    public ComputeResource getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hooks
     */
    public java.util.List<Hooks> getHooks() {
        return this.hooks;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return runtimeResource
     */
    public RuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return trigger
     */
    public Trigger getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<UpdateDataQualityScanRequest, Builder> {
        private String regionId; 
        private ComputeResource computeResource; 
        private String description; 
        private java.util.List<Hooks> hooks; 
        private Long id; 
        private String name; 
        private String owner; 
        private java.util.List<Parameters> parameters; 
        private Long projectId; 
        private RuntimeResource runtimeResource; 
        private String spec; 
        private Trigger trigger; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataQualityScanRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.computeResource = request.computeResource;
            this.description = request.description;
            this.hooks = request.hooks;
            this.id = request.id;
            this.name = request.name;
            this.owner = request.owner;
            this.parameters = request.parameters;
            this.projectId = request.projectId;
            this.runtimeResource = request.runtimeResource;
            this.spec = request.spec;
            this.trigger = request.trigger;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ComputeResource.
         */
        public Builder computeResource(ComputeResource computeResource) {
            String computeResourceShrink = shrink(computeResource, "ComputeResource", "json");
            this.putBodyParameter("ComputeResource", computeResourceShrink);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Hooks.
         */
        public Builder hooks(java.util.List<Hooks> hooks) {
            String hooksShrink = shrink(hooks, "Hooks", "json");
            this.putBodyParameter("Hooks", hooksShrink);
            this.hooks = hooks;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RuntimeResource.
         */
        public Builder runtimeResource(RuntimeResource runtimeResource) {
            String runtimeResourceShrink = shrink(runtimeResource, "RuntimeResource", "json");
            this.putBodyParameter("RuntimeResource", runtimeResourceShrink);
            this.runtimeResource = runtimeResource;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * Trigger.
         */
        public Builder trigger(Trigger trigger) {
            String triggerShrink = shrink(trigger, "Trigger", "json");
            this.putBodyParameter("Trigger", triggerShrink);
            this.trigger = trigger;
            return this;
        }

        @Override
        public UpdateDataQualityScanRequest build() {
            return new UpdateDataQualityScanRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataQualityScanRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityScanRequest</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("HiveConf")
        private java.util.Map<String, ?> hiveConf;

        @com.aliyun.core.annotation.NameInMap("SparkConf")
        private java.util.Map<String, ?> sparkConf;

        private Runtime(Builder builder) {
            this.engine = builder.engine;
            this.hiveConf = builder.hiveConf;
            this.sparkConf = builder.sparkConf;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return hiveConf
         */
        public java.util.Map<String, ?> getHiveConf() {
            return this.hiveConf;
        }

        /**
         * @return sparkConf
         */
        public java.util.Map<String, ?> getSparkConf() {
            return this.sparkConf;
        }

        public static final class Builder {
            private String engine; 
            private java.util.Map<String, ?> hiveConf; 
            private java.util.Map<String, ?> sparkConf; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.engine = model.engine;
                this.hiveConf = model.hiveConf;
                this.sparkConf = model.sparkConf;
            } 

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * HiveConf.
             */
            public Builder hiveConf(java.util.Map<String, ?> hiveConf) {
                this.hiveConf = hiveConf;
                return this;
            }

            /**
             * SparkConf.
             */
            public Builder sparkConf(java.util.Map<String, ?> sparkConf) {
                this.sparkConf = sparkConf;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataQualityScanRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityScanRequest</p>
     */
    public static class ComputeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private Runtime runtime;

        private ComputeResource(Builder builder) {
            this.envType = builder.envType;
            this.name = builder.name;
            this.runtime = builder.runtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeResource create() {
            return builder().build();
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        public static final class Builder {
            private String envType; 
            private String name; 
            private Runtime runtime; 

            private Builder() {
            } 

            private Builder(ComputeResource model) {
                this.envType = model.envType;
                this.name = model.name;
                this.runtime = model.runtime;
            } 

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
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
             * Runtime.
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            public ComputeResource build() {
                return new ComputeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataQualityScanRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityScanRequest</p>
     */
    public static class Hooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Hooks(Builder builder) {
            this.condition = builder.condition;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hooks create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String condition; 
            private String type; 

            private Builder() {
            } 

            private Builder(Hooks model) {
                this.condition = model.condition;
                this.type = model.type;
            } 

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Hooks build() {
                return new Hooks(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataQualityScanRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityScanRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataQualityScanRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityScanRequest</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Float cu;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        private RuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.id = builder.id;
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Float getCu() {
            return this.cu;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        public static final class Builder {
            private Float cu; 
            private String id; 
            private String image; 

            private Builder() {
            } 

            private Builder(RuntimeResource model) {
                this.cu = model.cu;
                this.id = model.id;
                this.image = model.image;
            } 

            /**
             * Cu.
             */
            public Builder cu(Float cu) {
                this.cu = cu;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDataQualityScanRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityScanRequest</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskIds")
        private java.util.List<Long> taskIds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Trigger(Builder builder) {
            this.taskIds = builder.taskIds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return taskIds
         */
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Long> taskIds; 
            private String type; 

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.taskIds = model.taskIds;
                this.type = model.type;
            } 

            /**
             * TaskIds.
             */
            public Builder taskIds(java.util.List<Long> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
}
