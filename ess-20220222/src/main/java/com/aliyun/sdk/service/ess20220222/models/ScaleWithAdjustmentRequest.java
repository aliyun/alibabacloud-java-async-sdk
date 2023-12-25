// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleWithAdjustmentRequest} extends {@link RequestModel}
 *
 * <p>ScaleWithAdjustmentRequest</p>
 */
public class ScaleWithAdjustmentRequest extends Request {
    @Query
    @NameInMap("AdjustmentType")
    @Validation(required = true)
    private String adjustmentType;

    @Query
    @NameInMap("AdjustmentValue")
    @Validation(required = true, maximum = 2147483647)
    private Integer adjustmentValue;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MinAdjustmentMagnitude")
    private Integer minAdjustmentMagnitude;

    @Query
    @NameInMap("Overrides")
    private Overrides overrides;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("SyncActivity")
    private Boolean syncActivity;

    private ScaleWithAdjustmentRequest(Builder builder) {
        super(builder);
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.clientToken = builder.clientToken;
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
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private String clientToken; 
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
            this.adjustmentType = request.adjustmentType;
            this.adjustmentValue = request.adjustmentValue;
            this.clientToken = request.clientToken;
            this.minAdjustmentMagnitude = request.minAdjustmentMagnitude;
            this.overrides = request.overrides;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.syncActivity = request.syncActivity;
        } 

        /**
         * The type of the scaling policy. Valid values:
         * <p>
         * 
         * *   QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.
         * *   PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.
         * *   TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * The number of instances in each adjustment. The number of ECS instances in each adjustment cannot exceed 1,000.
         * <p>
         * 
         * *   Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.
         * *   Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.
         * *   Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The minimum number of instances allowed in each adjustment. This parameter takes effect only if you set the `AdjustmentType` parameter to `PercentChangeInCapacity`.
         */
        public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
            this.putQueryParameter("MinAdjustmentMagnitude", minAdjustmentMagnitude);
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }

        /**
         * Overrides.
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
         * The ID of the scaling group.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * Specifies whether to trigger the scaling activity in a synchronous manner. This parameter takes effect only on scaling groups for which you specified an expected number of instances. Valid values:
         * <p>
         * 
         * *   true: triggers the scaling activity in a synchronous manner. The scaling activity is triggered at the time when the scaling rule is executed.
         * *   false: does not trigger the scaling activity in a synchronous manner. After you change the expected number of instances for the scaling group, Auto Scaling checks whether the total number of instances in the scaling group matches the new expected number of instances and determines whether to trigger the scaling activity based on the check result.
         * 
         * > For more information about the Expected Number of Instances feature, see [Expected number of instances](~~146231~~).
         * 
         * Default value: false.
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

    public static class EnvironmentVars extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class ContainerOverrides extends TeaModel {
        @NameInMap("Args")
        private java.util.List < String > args;

        @NameInMap("Commands")
        private java.util.List < String > commands;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("EnvironmentVars")
        private java.util.List < EnvironmentVars> environmentVars;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
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
        public java.util.List < String > getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
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
        public java.util.List < EnvironmentVars> getEnvironmentVars() {
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
            private java.util.List < String > args; 
            private java.util.List < String > commands; 
            private Float cpu; 
            private java.util.List < EnvironmentVars> environmentVars; 
            private Float memory; 
            private String name; 

            /**
             * Args.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * Commands.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * EnvironmentVars.
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Name.
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
    public static class Overrides extends TeaModel {
        @NameInMap("ContainerOverrides")
        private java.util.List < ContainerOverrides> containerOverrides;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("Memory")
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
        public java.util.List < ContainerOverrides> getContainerOverrides() {
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
            private java.util.List < ContainerOverrides> containerOverrides; 
            private Float cpu; 
            private Float memory; 

            /**
             * ContainerOverrides.
             */
            public Builder containerOverrides(java.util.List < ContainerOverrides> containerOverrides) {
                this.containerOverrides = containerOverrides;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Memory.
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
