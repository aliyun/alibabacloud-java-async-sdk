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
 * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityScanResponseBody</p>
 */
public class GetDataQualityScanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityScan")
    private DataQualityScan dataQualityScan;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityScanResponseBody(Builder builder) {
        this.dataQualityScan = builder.dataQualityScan;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityScanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataQualityScan
     */
    public DataQualityScan getDataQualityScan() {
        return this.dataQualityScan;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityScan dataQualityScan; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataQualityScanResponseBody model) {
            this.dataQualityScan = model.dataQualityScan;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Data quality monitoring details.</p>
         */
        public Builder dataQualityScan(DataQualityScan dataQualityScan) {
            this.dataQualityScan = dataQualityScan;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>204EAF68-CCE3-5112-8DA0-E7A60F02XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityScanResponseBody build() {
            return new GetDataQualityScanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanResponseBody</p>
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
             * <p>The type of the compute engine. Only EMR compute engines support these settings.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Hive: Hive SQL</li>
             * <li>Spark: Spark SQL</li>
             * <li>Kyuubi</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>Additional Hive engine parameters. Currently, only the mapreduce.job.queuename parameter is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>mapreduce.job.queuename=dq_queue</p>
             */
            public Builder hiveConf(java.util.Map<String, ?> hiveConf) {
                this.hiveConf = hiveConf;
                return this;
            }

            /**
             * <p>Additional Spark engine parameters. Currently, only the spark.yarn.queue parameter is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>spark.yarn.queue=dq_queue</p>
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
     * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanResponseBody</p>
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
             * <p>The workspace environment to which the compute engine belongs.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Prod: production environment .</li>
             * <li>Dev: development environment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The name of the compute engine, which is a unique identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb_to_holo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>More settings for data quality monitor at runtime.</p>
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
     * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanResponseBody</p>
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
             * <p>The Hook trigger condition. The hook will run if the condition is met. Currently, only one type of expression syntax is supported:</p>
             * <ul>
             * <li>You can specify multiple combinations of rule severity levels and validation statuses using an expression such as <code>results.any { r -&gt; r.status == \&quot;Fail\&quot; &amp;&amp; r.rule.severity == \&quot;Normal\&quot; || r.status == \&quot;Error\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; || r.status == \&quot;Warn\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</code>. This expression means the condition is met if any executed rule has a result of Fail with severity Normal, Error with severity High, or Warn with severity High. In the condition expression, the values of severity and status are predefined enums. The values of severity must match those defined in the Spec, and the values of status must match those in DataQualityResult.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>results.any { r -&gt; r.status == &quot;Fail&quot; &amp;&amp; r.rule.severity == &quot;Normal&quot; || r.status == &quot;Error&quot; &amp;&amp; r.rule.severity == &quot;High&quot; || r.status == &quot;Warn&quot; &amp;&amp; r.rule.severity == &quot;High&quot; }</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The type of the Hook.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>BlockTaskInstance: BlockTaskInstance: Blocks the scheduling of the task instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BlockTaskInstance</p>
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
     * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanResponseBody</p>
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
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>e2e_autolabel</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanResponseBody</p>
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
             * <p>Reserved compute units (CU) for the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cu(Float cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>122878</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The image ID used in the runtime configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>hp-tlp-e2e-repo-registry-vpc.cn-heyuan-acdr-1.cr.aliyuncs.com/hp-service/worker:9b28b6d-202506091008</p>
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
     * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanResponseBody</p>
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
             * <p>If the trigger mode is set to BySchedule, the scheduling task ID must be specified.</p>
             */
            public Builder taskIds(java.util.List<Long> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>The trigger mode of the monitoring task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ByManual: Manual trigger. This is the default setting.</li>
             * <li>BySchedule: Triggered by a scheduled task instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BySchedule</p>
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
     * {@link GetDataQualityScanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanResponseBody</p>
     */
    public static class DataQualityScan extends TeaModel {
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
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private DataQualityScan(Builder builder) {
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

        public static DataQualityScan create() {
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
            private java.util.List<Parameters> parameters; 
            private Long projectId; 
            private RuntimeResource runtimeResource; 
            private String spec; 
            private Trigger trigger; 

            private Builder() {
            } 

            private Builder(DataQualityScan model) {
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
             * <p>The compute engine used at runtime. Optional. If not specified, the data source defined in the Spec is used.</p>
             */
            public Builder computeResource(ComputeResource computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * <p>The creation time of the data quality monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>1731550150000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who creates the data quality monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>2374924198591250</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The data quality monitor description.</p>
             * 
             * <strong>example:</strong>
             * <p>aily data quality scanning of ods tables.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Hook configurations after the data quality monitoring run ends.</p>
             */
            public Builder hooks(java.util.List<Hooks> hooks) {
                this.hooks = hooks;
                return this;
            }

            /**
             * <p>The data quality monitoring ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Last modified time of the data quality monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>1731550150000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the user who last modifies the data quality monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>23482597582479</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The data quality monitor name.</p>
             * 
             * <strong>example:</strong>
             * <p>data_quality_scan_001</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the user who owns the data quality monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>231263586109857423</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The definition of execution parameters for the data quality monitor.</p>
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The workspace ID where the data quality monitor resides. You can obtain the workspace ID by calling the <a href="https://help.aliyun.com/document_detail/2780068.html">ListProjects</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The resource group used during the running of the data quality monitor.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>Spec code for the content of the data quality monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;datasets&quot;: [
             *         {
             *             &quot;type&quot;: &quot;Table&quot;,
             *             &quot;dataSource&quot;: {
             *                 &quot;name&quot;: &quot;odps_first&quot;,
             *                 &quot;envType&quot;: &quot;Prod&quot;
             *             },
             *             &quot;tables&quot;: [
             *                 &quot;ods_d_user_info&quot;
             *             ],
             *             &quot;filter&quot;: &quot;pt = $[yyyymmdd-1]&quot;
             *         }
             *     ],
             *     &quot;rules&quot;: [
             *         {
             *             &quot;assertion&quot;: &quot;row_count &gt; 0&quot;
             *         }, {
             *             &quot;templateId&quot;: &quot;SYSTEM:field:null_value:fixed&quot;,
             *             &quot;pass&quot;: &quot;when = 0&quot;,
             *             &quot;name&quot;: &quot;The id cannot be empty.&quot;,
             *             &quot;severity&quot;: &quot;High&quot;,
             *              &quot;identity&quot;: &quot;a-customized-data-quality-rule-uuid&quot;
             *         }
             *     ]
             * }</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The trigger configurations of the data quality monitoring task.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            public DataQualityScan build() {
                return new DataQualityScan(this);
            } 

        } 

    }
}
