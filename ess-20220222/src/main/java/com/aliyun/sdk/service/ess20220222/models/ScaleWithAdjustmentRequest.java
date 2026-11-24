// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link ScaleWithAdjustmentRequest} extends {@link RequestModel}
 *
 * <p>ScaleWithAdjustmentRequest</p>
 */
public class ScaleWithAdjustmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityMetadata")
    private String activityMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdjustmentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adjustmentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private Integer adjustmentValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHookContext")
    private LifecycleHookContext lifecycleHookContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAdjustmentMagnitude")
    private Integer minAdjustmentMagnitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overrides")
    private Overrides overrides;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParallelTask")
    private Boolean parallelTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncActivity")
    private Boolean syncActivity;

    private ScaleWithAdjustmentRequest(Builder builder) {
        super(builder);
        this.activityMetadata = builder.activityMetadata;
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.clientToken = builder.clientToken;
        this.executionMode = builder.executionMode;
        this.lifecycleHookContext = builder.lifecycleHookContext;
        this.minAdjustmentMagnitude = builder.minAdjustmentMagnitude;
        this.overrides = builder.overrides;
        this.ownerId = builder.ownerId;
        this.parallelTask = builder.parallelTask;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.syncActivity = builder.syncActivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleWithAdjustmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityMetadata
     */
    public String getActivityMetadata() {
        return this.activityMetadata;
    }

    /**
     * @return adjustmentType
     */
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * @return adjustmentValue
     */
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return lifecycleHookContext
     */
    public LifecycleHookContext getLifecycleHookContext() {
        return this.lifecycleHookContext;
    }

    /**
     * @return minAdjustmentMagnitude
     */
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    /**
     * @return overrides
     */
    public Overrides getOverrides() {
        return this.overrides;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parallelTask
     */
    public Boolean getParallelTask() {
        return this.parallelTask;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return syncActivity
     */
    public Boolean getSyncActivity() {
        return this.syncActivity;
    }

    public static final class Builder extends Request.Builder<ScaleWithAdjustmentRequest, Builder> {
        private String activityMetadata; 
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private String clientToken; 
        private String executionMode; 
        private LifecycleHookContext lifecycleHookContext; 
        private Integer minAdjustmentMagnitude; 
        private Overrides overrides; 
        private Long ownerId; 
        private Boolean parallelTask; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private Boolean syncActivity; 

        private Builder() {
            super();
        } 

        private Builder(ScaleWithAdjustmentRequest request) {
            super(request);
            this.activityMetadata = request.activityMetadata;
            this.adjustmentType = request.adjustmentType;
            this.adjustmentValue = request.adjustmentValue;
            this.clientToken = request.clientToken;
            this.executionMode = request.executionMode;
            this.lifecycleHookContext = request.lifecycleHookContext;
            this.minAdjustmentMagnitude = request.minAdjustmentMagnitude;
            this.overrides = request.overrides;
            this.ownerId = request.ownerId;
            this.parallelTask = request.parallelTask;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.syncActivity = request.syncActivity;
        } 

        /**
         * <p>The metadata of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder activityMetadata(String activityMetadata) {
            this.putQueryParameter("ActivityMetadata", activityMetadata);
            this.activityMetadata = activityMetadata;
            return this;
        }

        /**
         * <p>The adjustment method for the scaling activity. Valid values:</p>
         * <ul>
         * <li>QuantityChangeInCapacity: Increases or decreases a specified number of ECS instances.</li>
         * <li>PercentChangeInCapacity: Increases or decreases a specified percentage of ECS instances.</li>
         * <li>TotalCapacity: Adjusts the number of ECS instances in the current scaling group to a specified number.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>QuantityChangeInCapacity</p>
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * <p>The adjustment value for the scaling activity. In all cases, the number of ECS instances adjusted in a single operation cannot exceed 1,000. Otherwise, the adjustment fails. Valid values vary based on the adjustment method:</p>
         * <ul>
         * <li>QuantityChangeInCapacity: -1,000 to 1,000.</li>
         * <li>PercentChangeInCapacity: -100 to 10,000.</li>
         * <li>TotalCapacity: 0 to 2,000.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The execution mode. Valid values:</p>
         * <ul>
         * <li>None: Not specified. Normal scaling is performed.</li>
         * <li>PlanOnly: Does not trigger scaling. Only elastic planning is executed. The planning results, including instance types, zone IDs, billing methods, and the number of instances to be created, are returned in PlanResult.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>PlanOnly</p>
         */
        public Builder executionMode(String executionMode) {
            this.putQueryParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * <p>The context information of the lifecycle hook.</p>
         */
        public Builder lifecycleHookContext(LifecycleHookContext lifecycleHookContext) {
            String lifecycleHookContextShrink = shrink(lifecycleHookContext, "LifecycleHookContext", "json");
            this.putQueryParameter("LifecycleHookContext", lifecycleHookContextShrink);
            this.lifecycleHookContext = lifecycleHookContext;
            return this;
        }

        /**
         * <p>The minimum number of instances to be adjusted in the scaling activity. This parameter takes effect only when <code>AdjustmentType</code> is set to <code>PercentChangeInCapacity</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
            this.putQueryParameter("MinAdjustmentMagnitude", minAdjustmentMagnitude);
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }

        /**
         * <p>The override parameters specified for scaling out an Elastic Container Instance (ECI) scaling group.</p>
         */
        public Builder overrides(Overrides overrides) {
            String overridesShrink = shrink(overrides, "Overrides", "json");
            this.putQueryParameter("Overrides", overridesShrink);
            this.overrides = overrides;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Specifies whether the current scaling task supports concurrent execution.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder parallelTask(Boolean parallelTask) {
            this.putQueryParameter("ParallelTask", parallelTask);
            this.parallelTask = parallelTask;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-j6c1o397427hyjdc****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to synchronously execute the scaling activity. This parameter is valid only for scaling groups that have the expected number of instances configured. Valid values:</p>
         * <ul>
         * <li>true: Synchronous process. When the scaling rule is executed, the scale-out or scale-in activity of the scaling group is directly triggered.</li>
         * <li>false: Asynchronous process. When the expected number of instances in the scaling group is modified, the actual scale-out or scale-in activity of the scaling group is not immediately triggered. The system automatically detects the difference between the expected number of instances and the current number of instances in the scaling group, and then triggers the scale-out or scale-in activity.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the expected number of instances, see <a href="https://help.aliyun.com/document_detail/146231.html">Expected number of instances</a>.</p>
         * </blockquote>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder syncActivity(Boolean syncActivity) {
            this.putQueryParameter("SyncActivity", syncActivity);
            this.syncActivity = syncActivity;
            return this;
        }

        @Override
        public ScaleWithAdjustmentRequest build() {
            return new ScaleWithAdjustmentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ScaleWithAdjustmentRequest} extends {@link TeaModel}
     *
     * <p>ScaleWithAdjustmentRequest</p>
     */
    public static class LifecycleHookContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisableLifecycleHook")
        private Boolean disableLifecycleHook;

        @com.aliyun.core.annotation.NameInMap("IgnoredLifecycleHookIds")
        private java.util.List<String> ignoredLifecycleHookIds;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookResult")
        private String lifecycleHookResult;

        private LifecycleHookContext(Builder builder) {
            this.disableLifecycleHook = builder.disableLifecycleHook;
            this.ignoredLifecycleHookIds = builder.ignoredLifecycleHookIds;
            this.lifecycleHookResult = builder.lifecycleHookResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleHookContext create() {
            return builder().build();
        }

        /**
         * @return disableLifecycleHook
         */
        public Boolean getDisableLifecycleHook() {
            return this.disableLifecycleHook;
        }

        /**
         * @return ignoredLifecycleHookIds
         */
        public java.util.List<String> getIgnoredLifecycleHookIds() {
            return this.ignoredLifecycleHookIds;
        }

        /**
         * @return lifecycleHookResult
         */
        public String getLifecycleHookResult() {
            return this.lifecycleHookResult;
        }

        public static final class Builder {
            private Boolean disableLifecycleHook; 
            private java.util.List<String> ignoredLifecycleHookIds; 
            private String lifecycleHookResult; 

            private Builder() {
            } 

            private Builder(LifecycleHookContext model) {
                this.disableLifecycleHook = model.disableLifecycleHook;
                this.ignoredLifecycleHookIds = model.ignoredLifecycleHookIds;
                this.lifecycleHookResult = model.lifecycleHookResult;
            } 

            /**
             * <p>Specifies whether to disable all lifecycle hooks for the scaling activity. Valid values:</p>
             * <ul>
             * <li>true: Disables all lifecycle hooks.</li>
             * <li>false: Does not disable lifecycle hooks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disableLifecycleHook(Boolean disableLifecycleHook) {
                this.disableLifecycleHook = disableLifecycleHook;
                return this;
            }

            /**
             * <p>The list of IDs of the lifecycle hooks that are disabled for the scaling activity.</p>
             */
            public Builder ignoredLifecycleHookIds(java.util.List<String> ignoredLifecycleHookIds) {
                this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
                return this;
            }

            /**
             * <p>The default execution result of the lifecycle hook in this scaling activity. If specified, this value overrides the original default execution result of the hook.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTINUE</p>
             */
            public Builder lifecycleHookResult(String lifecycleHookResult) {
                this.lifecycleHookResult = lifecycleHookResult;
                return this;
            }

            public LifecycleHookContext build() {
                return new LifecycleHookContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScaleWithAdjustmentRequest} extends {@link TeaModel}
     *
     * <p>ScaleWithAdjustmentRequest</p>
     */
    public static class EnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EnvironmentVars(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVars create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(EnvironmentVars model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable. The name must be 1 to 128 characters in length. It can contain letters, digits, and underscores (_), and cannot start with a digit.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable. The value can be 0 to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/tomcat</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EnvironmentVars build() {
                return new EnvironmentVars(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScaleWithAdjustmentRequest} extends {@link TeaModel}
     *
     * <p>ScaleWithAdjustmentRequest</p>
     */
    public static class ContainerOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List<String> args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<String> commands;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List<EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ContainerOverrides(Builder builder) {
            this.args = builder.args;
            this.commands = builder.commands;
            this.cpu = builder.cpu;
            this.environmentVars = builder.environmentVars;
            this.memory = builder.memory;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerOverrides create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public java.util.List<String> getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return environmentVars
         */
        public java.util.List<EnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> args; 
            private java.util.List<String> commands; 
            private Float cpu; 
            private java.util.List<EnvironmentVars> environmentVars; 
            private Float memory; 
            private String name; 

            private Builder() {
            } 

            private Builder(ContainerOverrides model) {
                this.args = model.args;
                this.commands = model.commands;
                this.cpu = model.cpu;
                this.environmentVars = model.environmentVars;
                this.memory = model.memory;
                this.name = model.name;
            } 

            /**
             * <p>The arguments for the container startup command. A maximum of 10 arguments can be specified.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands for the container. A maximum of 20 commands can be specified. Each command can contain up to 256 characters.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs for the container. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The list of environment variables.</p>
             */
            public Builder environmentVars(java.util.List<EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The memory size of the container. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container. When you need to override container parameters, you must specify the container name. The container parameters can be overridden only when the container name matches the container name in the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>container-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ContainerOverrides build() {
                return new ContainerOverrides(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScaleWithAdjustmentRequest} extends {@link TeaModel}
     *
     * <p>ScaleWithAdjustmentRequest</p>
     */
    public static class Overrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerOverrides")
        private java.util.List<ContainerOverrides> containerOverrides;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Overrides(Builder builder) {
            this.containerOverrides = builder.containerOverrides;
            this.cpu = builder.cpu;
            this.memory = builder.memory;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Overrides create() {
            return builder().build();
        }

        /**
         * @return containerOverrides
         */
        public java.util.List<ContainerOverrides> getContainerOverrides() {
            return this.containerOverrides;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private java.util.List<ContainerOverrides> containerOverrides; 
            private Float cpu; 
            private Float memory; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Overrides model) {
                this.containerOverrides = model.containerOverrides;
                this.cpu = model.cpu;
                this.memory = model.memory;
                this.userData = model.userData;
            } 

            /**
             * <p>The override parameters for the container list.</p>
             */
            public Builder containerOverrides(java.util.List<ContainerOverrides> containerOverrides) {
                this.containerOverrides = containerOverrides;
                return this;
            }

            /**
             * <p>The number of vCPUs at the instance level. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory size at the instance level. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The user data of the ECS instance. The user data must be encoded in Base64. The maximum size of the raw data before encoding is 32 KB.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBoZWxsbyBlY3Mh</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Overrides build() {
                return new Overrides(this);
            } 

        } 

    }
}
