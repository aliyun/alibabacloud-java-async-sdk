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
 * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityScanRunResponseBody</p>
 */
public class GetDataQualityScanRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityScanRun")
    private DataQualityScanRun dataQualityScanRun;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityScanRunResponseBody(Builder builder) {
        this.dataQualityScanRun = builder.dataQualityScanRun;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityScanRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataQualityScanRun
     */
    public DataQualityScanRun getDataQualityScanRun() {
        return this.dataQualityScanRun;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityScanRun dataQualityScanRun; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataQualityScanRunResponseBody model) {
            this.dataQualityScanRun = model.dataQualityScanRun;
            this.requestId = model.requestId;
        } 

        /**
         * DataQualityScanRun.
         */
        public Builder dataQualityScanRun(DataQualityScanRun dataQualityScanRun) {
            this.dataQualityScanRun = dataQualityScanRun;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityScanRunResponseBody build() {
            return new GetDataQualityScanRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
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
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckValue")
        private String checkValue;

        @com.aliyun.core.annotation.NameInMap("ReferenceValue")
        private String referenceValue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Details(Builder builder) {
            this.checkValue = builder.checkValue;
            this.referenceValue = builder.referenceValue;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return checkValue
         */
        public String getCheckValue() {
            return this.checkValue;
        }

        /**
         * @return referenceValue
         */
        public String getReferenceValue() {
            return this.referenceValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String checkValue; 
            private String referenceValue; 
            private String status; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.checkValue = model.checkValue;
                this.referenceValue = model.referenceValue;
                this.status = model.status;
            } 

            /**
             * CheckValue.
             */
            public Builder checkValue(String checkValue) {
                this.checkValue = checkValue;
                return this;
            }

            /**
             * ReferenceValue.
             */
            public Builder referenceValue(String referenceValue) {
                this.referenceValue = referenceValue;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Results(Builder builder) {
            this.createTime = builder.createTime;
            this.details = builder.details;
            this.rule = builder.rule;
            this.sample = builder.sample;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.List<Details> details; 
            private String rule; 
            private String sample; 
            private String status; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.createTime = model.createTime;
                this.details = model.details;
                this.rule = model.rule;
                this.sample = model.sample;
                this.status = model.status;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Details.
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
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
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
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
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
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
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
     */
    public static class ScanParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ScanParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanParameters create() {
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

            private Builder(ScanParameters model) {
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

            public ScanParameters build() {
                return new ScanParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
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
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
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
    /**
     * 
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
     */
    public static class Scan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private ComputeResource computeResource;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Hooks")
        private java.util.List<Hooks> hooks;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<ScanParameters> parameters;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private Scan(Builder builder) {
            this.computeResource = builder.computeResource;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.description = builder.description;
            this.hooks = builder.hooks;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
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

        public static Scan create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public ComputeResource getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
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
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
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
        public java.util.List<ScanParameters> getParameters() {
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

        public static final class Builder {
            private ComputeResource computeResource; 
            private Long createTime; 
            private String createUser; 
            private String description; 
            private java.util.List<Hooks> hooks; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private String owner; 
            private java.util.List<ScanParameters> parameters; 
            private Long projectId; 
            private RuntimeResource runtimeResource; 
            private String spec; 
            private Trigger trigger; 

            private Builder() {
            } 

            private Builder(Scan model) {
                this.computeResource = model.computeResource;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.description = model.description;
                this.hooks = model.hooks;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.name = model.name;
                this.owner = model.owner;
                this.parameters = model.parameters;
                this.projectId = model.projectId;
                this.runtimeResource = model.runtimeResource;
                this.spec = model.spec;
                this.trigger = model.trigger;
            } 

            /**
             * ComputeResource.
             */
            public Builder computeResource(ComputeResource computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Hooks.
             */
            public Builder hooks(java.util.List<Hooks> hooks) {
                this.hooks = hooks;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<ScanParameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * RuntimeResource.
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Trigger.
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            public Scan build() {
                return new Scan(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityScanRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunResponseBody</p>
     */
    public static class DataQualityScanRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("Scan")
        private Scan scan;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataQualityScanRun(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.parameters = builder.parameters;
            this.results = builder.results;
            this.scan = builder.scan;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityScanRun create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return parameters
         */
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return scan
         */
        public Scan getScan() {
            return this.scan;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private Long finishTime; 
            private Long id; 
            private java.util.List<Parameters> parameters; 
            private java.util.List<Results> results; 
            private Scan scan; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataQualityScanRun model) {
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.id = model.id;
                this.parameters = model.parameters;
                this.results = model.results;
                this.scan = model.scan;
                this.status = model.status;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * Scan.
             */
            public Builder scan(Scan scan) {
                this.scan = scan;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataQualityScanRun build() {
                return new DataQualityScanRun(this);
            } 

        } 

    }
}
