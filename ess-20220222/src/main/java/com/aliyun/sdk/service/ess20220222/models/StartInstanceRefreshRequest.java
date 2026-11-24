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
 * {@link StartInstanceRefreshRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRefreshRequest</p>
 */
public class StartInstanceRefreshRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckpointPauseTime")
    private Integer checkpointPauseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Checkpoints")
    private java.util.List<Checkpoints> checkpoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesiredConfiguration")
    private DesiredConfiguration desiredConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxHealthyPercentage")
    private Integer maxHealthyPercentage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinHealthyPercentage")
    private Integer minHealthyPercentage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipMatching")
    private Boolean skipMatching;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    private String strategy;

    private StartInstanceRefreshRequest(Builder builder) {
        super(builder);
        this.checkpointPauseTime = builder.checkpointPauseTime;
        this.checkpoints = builder.checkpoints;
        this.clientToken = builder.clientToken;
        this.desiredConfiguration = builder.desiredConfiguration;
        this.maxHealthyPercentage = builder.maxHealthyPercentage;
        this.minHealthyPercentage = builder.minHealthyPercentage;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.skipMatching = builder.skipMatching;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRefreshRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkpointPauseTime
     */
    public Integer getCheckpointPauseTime() {
        return this.checkpointPauseTime;
    }

    /**
     * @return checkpoints
     */
    public java.util.List<Checkpoints> getCheckpoints() {
        return this.checkpoints;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return desiredConfiguration
     */
    public DesiredConfiguration getDesiredConfiguration() {
        return this.desiredConfiguration;
    }

    /**
     * @return maxHealthyPercentage
     */
    public Integer getMaxHealthyPercentage() {
        return this.maxHealthyPercentage;
    }

    /**
     * @return minHealthyPercentage
     */
    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return skipMatching
     */
    public Boolean getSkipMatching() {
        return this.skipMatching;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<StartInstanceRefreshRequest, Builder> {
        private Integer checkpointPauseTime; 
        private java.util.List<Checkpoints> checkpoints; 
        private String clientToken; 
        private DesiredConfiguration desiredConfiguration; 
        private Integer maxHealthyPercentage; 
        private Integer minHealthyPercentage; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private Boolean skipMatching; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRefreshRequest request) {
            super(request);
            this.checkpointPauseTime = request.checkpointPauseTime;
            this.checkpoints = request.checkpoints;
            this.clientToken = request.clientToken;
            this.desiredConfiguration = request.desiredConfiguration;
            this.maxHealthyPercentage = request.maxHealthyPercentage;
            this.minHealthyPercentage = request.minHealthyPercentage;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.skipMatching = request.skipMatching;
            this.strategy = request.strategy;
        } 

        /**
         * <p>The pause duration when a checkpoint of the refresh task is reached.</p>
         * <ul>
         * <li>Unit: minutes.</li>
         * <li>Valid values: 1 to 2880.</li>
         * <li>Default value: 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder checkpointPauseTime(Integer checkpointPauseTime) {
            this.putQueryParameter("CheckpointPauseTime", checkpointPauseTime);
            this.checkpointPauseTime = checkpointPauseTime;
            return this;
        }

        /**
         * <p>The checkpoints for the refresh task. This parameter specifies that the task is automatically paused for the duration specified by CheckpointPauseTime in minutes when the percentage of new instances reaches the specified value during the instance refresh.</p>
         */
        public Builder checkpoints(java.util.List<Checkpoints> checkpoints) {
            this.putQueryParameter("Checkpoints", checkpoints);
            this.checkpoints = checkpoints;
            return this;
        }

        /**
         * <p>Ensures the idempotence of the request. You can generate the value on the client to ensure that the value is unique across different requests. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
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
         * <p>The desired configuration for the instance refresh.</p>
         * <blockquote>
         * <ul>
         * <li>ScalingConfigurationId, ImageId, LaunchTemplateId, and Containers cannot be specified at the same time. If this parameter is left empty, the instances are refreshed based on the active configuration of the scaling group.</li>
         * <li>After the instance refresh task is successfully executed, the active scaling configuration of the scaling group is updated to this configuration.</li>
         * </ul>
         * </blockquote>
         */
        public Builder desiredConfiguration(DesiredConfiguration desiredConfiguration) {
            this.putQueryParameter("DesiredConfiguration", desiredConfiguration);
            this.desiredConfiguration = desiredConfiguration;
            return this;
        }

        /**
         * <p>The maximum percentage by which the number of instances in the scaling group can exceed the scaling group capacity during the instance refresh. Valid values: 100 to 200.
         * Default value: 120.</p>
         * <blockquote>
         * <p>If both MinHealthyPercentage and MaxHealthyPercentage are set to 100, one instance is refreshed at a time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxHealthyPercentage(Integer maxHealthyPercentage) {
            this.putQueryParameter("MaxHealthyPercentage", maxHealthyPercentage);
            this.maxHealthyPercentage = maxHealthyPercentage;
            return this;
        }

        /**
         * <p>The minimum percentage of the scaling group capacity that must remain in service during the instance refresh. Valid values: 0 to 100.
         * Default value: 80.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder minHealthyPercentage(Integer minHealthyPercentage) {
            this.putQueryParameter("MinHealthyPercentage", minHealthyPercentage);
            this.minHealthyPercentage = minHealthyPercentage;
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
         * <p>The region ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to skip instances that match the desired configuration.</p>
         * <blockquote>
         * <p>The system determines whether an instance matches the desired configuration based on the ID of the desired scaling configuration, without comparing specific configuration items.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: skips the instances. When the instance refresh task is started, the system checks the configuration of each instance. Instances that are already created with the desired configuration are not refreshed.</li>
         * <li>false: does not skip the instances. After the instance refresh task is started, all instances in the scaling group are refreshed.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder skipMatching(Boolean skipMatching) {
            this.putQueryParameter("SkipMatching", skipMatching);
            this.skipMatching = skipMatching;
            return this;
        }

        /**
         * <p>The execution strategy for the instance refresh task. Valid values:</p>
         * <ul>
         * <li><p>Rolling: refreshes instances by creating new instances and releasing old instances.</p>
         * </li>
         * <li><p>ReplaceSystemDisk: updates the system cloud disks of existing instances by specifying DesiredConfiguration.image.</p>
         * </li>
         * </ul>
         * <p>Default value: Rolling.</p>
         * 
         * <strong>example:</strong>
         * <p>Rolling</p>
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public StartInstanceRefreshRequest build() {
            return new StartInstanceRefreshRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartInstanceRefreshRequest} extends {@link TeaModel}
     *
     * <p>StartInstanceRefreshRequest</p>
     */
    public static class Checkpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        private Checkpoints(Builder builder) {
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checkpoints create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private Integer percentage; 

            private Builder() {
            } 

            private Builder(Checkpoints model) {
                this.percentage = model.percentage;
            } 

            /**
             * <p>The percentage of new instances out of the total instances in the scaling group. When this percentage is reached, the task is automatically paused. Valid values: 1 to 100. Unit: %.</p>
             * <blockquote>
             * <p>The values must be set in ascending order, and the last percentage must be 100.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            public Checkpoints build() {
                return new Checkpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartInstanceRefreshRequest} extends {@link TeaModel}
     *
     * <p>StartInstanceRefreshRequest</p>
     */
    public static class EnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRefFieldPath")
        private String fieldRefFieldPath;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EnvironmentVars(Builder builder) {
            this.fieldRefFieldPath = builder.fieldRefFieldPath;
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
         * @return fieldRefFieldPath
         */
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
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
            private String fieldRefFieldPath; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(EnvironmentVars model) {
                this.fieldRefFieldPath = model.fieldRefFieldPath;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fieldPath</p>
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
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
             * <p>The value of the environment variable. The value must be 0 to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/bin</p>
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
     * {@link StartInstanceRefreshRequest} extends {@link TeaModel}
     *
     * <p>StartInstanceRefreshRequest</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List<String> args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<String> commands;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List<EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Containers(Builder builder) {
            this.args = builder.args;
            this.commands = builder.commands;
            this.environmentVars = builder.environmentVars;
            this.image = builder.image;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
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
         * @return environmentVars
         */
        public java.util.List<EnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
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
            private java.util.List<EnvironmentVars> environmentVars; 
            private String image; 
            private String name; 

            private Builder() {
            } 

            private Builder(Containers model) {
                this.args = model.args;
                this.commands = model.commands;
                this.environmentVars = model.environmentVars;
                this.image = model.image;
                this.name = model.name;
            } 

            /**
             * <p>The arguments for the container startup commands. You can specify up to 10 arguments.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands for the container. You can specify up to 20 commands. Each command can contain up to 256 characters.</p>
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The environment variables.</p>
             */
            public Builder environmentVars(java.util.List<EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The custom name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartInstanceRefreshRequest} extends {@link TeaModel}
     *
     * <p>StartInstanceRefreshRequest</p>
     */
    public static class LaunchTemplateOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private LaunchTemplateOverrides(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateOverrides create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            private Builder() {
            } 

            private Builder(LaunchTemplateOverrides model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>This parameter is used to specify the instance type, which overrides the instance type in the launch template.</p>
             * <blockquote>
             * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.2xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public LaunchTemplateOverrides build() {
                return new LaunchTemplateOverrides(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartInstanceRefreshRequest} extends {@link TeaModel}
     *
     * <p>StartInstanceRefreshRequest</p>
     */
    public static class DesiredConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Containers")
        private java.util.List<Containers> containers;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateOverrides")
        private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        private DesiredConfiguration(Builder builder) {
            this.containers = builder.containers;
            this.imageId = builder.imageId;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateOverrides = builder.launchTemplateOverrides;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.scalingConfigurationId = builder.scalingConfigurationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesiredConfiguration create() {
            return builder().build();
        }

        /**
         * @return containers
         */
        public java.util.List<Containers> getContainers() {
            return this.containers;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateOverrides
         */
        public java.util.List<LaunchTemplateOverrides> getLaunchTemplateOverrides() {
            return this.launchTemplateOverrides;
        }

        /**
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return scalingConfigurationId
         */
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public static final class Builder {
            private java.util.List<Containers> containers; 
            private String imageId; 
            private String launchTemplateId; 
            private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides; 
            private String launchTemplateVersion; 
            private String scalingConfigurationId; 

            private Builder() {
            } 

            private Builder(DesiredConfiguration model) {
                this.containers = model.containers;
                this.imageId = model.imageId;
                this.launchTemplateId = model.launchTemplateId;
                this.launchTemplateOverrides = model.launchTemplateOverrides;
                this.launchTemplateVersion = model.launchTemplateVersion;
                this.scalingConfigurationId = model.scalingConfigurationId;
            } 

            /**
             * <p>The list of containers included in the instance.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for Elastic Container Instance (ECI) scaling groups.</li>
             * <li>Only the container configurations whose Container.Name matches the container names in the current scaling configuration are refreshed.</li>
             * </ul>
             * </blockquote>
             */
            public Builder containers(java.util.List<Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * <blockquote>
             * <ul>
             * <li>After the instance refresh task is successfully executed, the image configuration in the active configuration of the scaling group is updated to this image.</li>
             * <li>This parameter is not supported if the source of the active configuration of the scaling group is a launch template.</li>
             * <li>Images that contain data cloud disks are not supported.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>m-2ze8cqacj7opnf***</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the launch template. This parameter is used to specify that the scaling group obtains launch configurations from the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-2ze2qli30u***</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The instance type overrides for the launch template.</p>
             */
            public Builder launchTemplateOverrides(java.util.List<LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
                return this;
            }

            /**
             * <p>The version of the launch template. Valid values:</p>
             * <ul>
             * <li>A specific template version number.</li>
             * <li>Default: always uses the default version of the template.</li>
             * <li>Latest: always uses the latest version of the template.</li>
             * </ul>
             * <blockquote>
             * <p>If the version is set to Default or Latest, the instance refresh task cannot be rolled back.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The ID of the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-2zed7lqn4ts4****</p>
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            public DesiredConfiguration build() {
                return new DesiredConfiguration(this);
            } 

        } 

    }
}
