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
        this.lifecycleHookContext = builder.lifecycleHookContext;
        this.minAdjustmentMagnitude = builder.minAdjustmentMagnitude;
        this.overrides = builder.overrides;
        this.ownerId = builder.ownerId;
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
        private LifecycleHookContext lifecycleHookContext; 
        private Integer minAdjustmentMagnitude; 
        private Overrides overrides; 
        private Long ownerId; 
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
            this.lifecycleHookContext = request.lifecycleHookContext;
            this.minAdjustmentMagnitude = request.minAdjustmentMagnitude;
            this.overrides = request.overrides;
            this.ownerId = request.ownerId;
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
         * <p>The type of the scaling policy. Valid values:</p>
         * <ul>
         * <li>QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</li>
         * <li>PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</li>
         * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
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
         * <p>The number of instances in each adjustment. The number of ECS instances in each adjustment cannot exceed 1,000.</p>
         * <ul>
         * <li>Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.</li>
         * <li>Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.</li>
         * <li>Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.</li>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The context of the lifecycle hook.</p>
         */
        public Builder lifecycleHookContext(LifecycleHookContext lifecycleHookContext) {
            String lifecycleHookContextShrink = shrink(lifecycleHookContext, "LifecycleHookContext", "json");
            this.putQueryParameter("LifecycleHookContext", lifecycleHookContextShrink);
            this.lifecycleHookContext = lifecycleHookContext;
            return this;
        }

        /**
         * <p>The minimum number of instances allowed in each adjustment. This parameter takes effect only if you set the <code>AdjustmentType</code> parameter to <code>PercentChangeInCapacity</code>.</p>
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
         * <p>The overrides that allow you to adjust the scaling group of the Elastic Container Instance type during a scale-out event.</p>
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
         * <p>Specifies whether to trigger the scaling activity in a synchronous manner. This parameter takes effect only on scaling groups for which you specified an expected number of instances. Valid values:</p>
         * <ul>
         * <li>true: triggers the scaling activity in a synchronous manner. A scaling activity is triggered at the time when the scaling rule is executed.</li>
         * <li>false: does not trigger the scaling activity in a synchronous manner. After you change the expected number of instances for the scaling group, Auto Scaling checks whether the total number of instances in the scaling group matches the new expected number and determines whether to trigger the scaling activity based on the check result.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about the expected number of instances feature, see <a href="https://help.aliyun.com/document_detail/146231.html">Expected number of instances</a>.</p>
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

        private LifecycleHookContext(Builder builder) {
            this.disableLifecycleHook = builder.disableLifecycleHook;
            this.ignoredLifecycleHookIds = builder.ignoredLifecycleHookIds;
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

        public static final class Builder {
            private Boolean disableLifecycleHook; 
            private java.util.List<String> ignoredLifecycleHookIds; 

            private Builder() {
            } 

            private Builder(LifecycleHookContext model) {
                this.disableLifecycleHook = model.disableLifecycleHook;
                this.ignoredLifecycleHookIds = model.ignoredLifecycleHookIds;
            } 

            /**
             * <p>Specifies whether to disable the Lifecycle Hook feature. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The IDs of the lifecycle hooks that you want to disable.</p>
             */
            public Builder ignoredLifecycleHookIds(java.util.List<String> ignoredLifecycleHookIds) {
                this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
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
             * <p>The name of the environment variable. The name must be 1 to 128 characters in length and can contain letters, underscores (_), and digits. The name cannot start with a digit. Specify the value in the <code>[0-9a-zA-Z]</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
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
             * <p>The arguments that correspond to the startup commands of the container. You can specify up to 10 arguments.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The container startup commands. You can specify up to 20 commands. Each command can contain up to 256 characters.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs that you want to allocate to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The information about the environment variables.</p>
             */
            public Builder environmentVars(java.util.List<EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The memory size that you want to allocate to the container. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The container name. If you specify ContainerOverrides, you must also specify Name. ContainerOverrides takes effect only when the container name specified by Name matches that specified in the scaling configuration.</p>
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

        private Overrides(Builder builder) {
            this.containerOverrides = builder.containerOverrides;
            this.cpu = builder.cpu;
            this.memory = builder.memory;
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

        public static final class Builder {
            private java.util.List<ContainerOverrides> containerOverrides; 
            private Float cpu; 
            private Float memory; 

            private Builder() {
            } 

            private Builder(Overrides model) {
                this.containerOverrides = model.containerOverrides;
                this.cpu = model.cpu;
                this.memory = model.memory;
            } 

            /**
             * <p>The list of parameters that you want to use to override specific configurations for containers.</p>
             */
            public Builder containerOverrides(java.util.List<ContainerOverrides> containerOverrides) {
                this.containerOverrides = containerOverrides;
                return this;
            }

            /**
             * <p>The number of vCPUs that you want to allocate to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory size that you want to allocate to the instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public Overrides build() {
                return new Overrides(this);
            } 

        } 

    }
}
