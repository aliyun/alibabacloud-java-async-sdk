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
 * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRefreshesResponseBody</p>
 */
public class DescribeInstanceRefreshesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRefreshTasks")
    private java.util.List<InstanceRefreshTasks> instanceRefreshTasks;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceRefreshesResponseBody(Builder builder) {
        this.instanceRefreshTasks = builder.instanceRefreshTasks;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRefreshesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceRefreshTasks
     */
    public java.util.List<InstanceRefreshTasks> getInstanceRefreshTasks() {
        return this.instanceRefreshTasks;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<InstanceRefreshTasks> instanceRefreshTasks; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeInstanceRefreshesResponseBody model) {
            this.instanceRefreshTasks = model.instanceRefreshTasks;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The instance refresh tasks.</p>
         */
        public Builder instanceRefreshTasks(java.util.List<InstanceRefreshTasks> instanceRefreshTasks) {
            this.instanceRefreshTasks = instanceRefreshTasks;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instance refresh tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceRefreshesResponseBody build() {
            return new DescribeInstanceRefreshesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
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
             * Percentage.
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
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
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
             * FieldRefFieldPath.
             */
            public Builder fieldRefFieldPath(String fieldRefFieldPath) {
                this.fieldRefFieldPath = fieldRefFieldPath;
                return this;
            }

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
    /**
     * 
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
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
             * Args.
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * Commands.
             */
            public Builder commands(java.util.List<String> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * EnvironmentVars.
             */
            public Builder environmentVars(java.util.List<EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * Name.
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
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
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
             * InstanceType.
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
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
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
             * Containers.
             */
            public Builder containers(java.util.List<Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>The ID of the image file that provides the image resource for Auto Scaling to create instances.</p>
             * 
             * <strong>example:</strong>
             * <p>m-uf6g5noisr****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * LaunchTemplateId.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * LaunchTemplateOverrides.
             */
            public Builder launchTemplateOverrides(java.util.List<LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
                return this;
            }

            /**
             * LaunchTemplateVersion.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The ID of the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-wz91ibkhfor****</p>
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
    /**
     * 
     * {@link DescribeInstanceRefreshesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRefreshesResponseBody</p>
     */
    public static class InstanceRefreshTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckpointPauseTime")
        private Integer checkpointPauseTime;

        @com.aliyun.core.annotation.NameInMap("Checkpoints")
        private java.util.List<Checkpoints> checkpoints;

        @com.aliyun.core.annotation.NameInMap("DesiredConfiguration")
        private DesiredConfiguration desiredConfiguration;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FinishedUpdateCapacity")
        private Integer finishedUpdateCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceRefreshTaskId")
        private String instanceRefreshTaskId;

        @com.aliyun.core.annotation.NameInMap("MaxHealthyPercentage")
        private Integer maxHealthyPercentage;

        @com.aliyun.core.annotation.NameInMap("MinHealthyPercentage")
        private Integer minHealthyPercentage;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("SkipMatching")
        private Boolean skipMatching;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalNeedUpdateCapacity")
        private Integer totalNeedUpdateCapacity;

        private InstanceRefreshTasks(Builder builder) {
            this.checkpointPauseTime = builder.checkpointPauseTime;
            this.checkpoints = builder.checkpoints;
            this.desiredConfiguration = builder.desiredConfiguration;
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.finishedUpdateCapacity = builder.finishedUpdateCapacity;
            this.instanceRefreshTaskId = builder.instanceRefreshTaskId;
            this.maxHealthyPercentage = builder.maxHealthyPercentage;
            this.minHealthyPercentage = builder.minHealthyPercentage;
            this.regionId = builder.regionId;
            this.scalingGroupId = builder.scalingGroupId;
            this.skipMatching = builder.skipMatching;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalNeedUpdateCapacity = builder.totalNeedUpdateCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRefreshTasks create() {
            return builder().build();
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
         * @return desiredConfiguration
         */
        public DesiredConfiguration getDesiredConfiguration() {
            return this.desiredConfiguration;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return finishedUpdateCapacity
         */
        public Integer getFinishedUpdateCapacity() {
            return this.finishedUpdateCapacity;
        }

        /**
         * @return instanceRefreshTaskId
         */
        public String getInstanceRefreshTaskId() {
            return this.instanceRefreshTaskId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalNeedUpdateCapacity
         */
        public Integer getTotalNeedUpdateCapacity() {
            return this.totalNeedUpdateCapacity;
        }

        public static final class Builder {
            private Integer checkpointPauseTime; 
            private java.util.List<Checkpoints> checkpoints; 
            private DesiredConfiguration desiredConfiguration; 
            private String detail; 
            private String endTime; 
            private Integer finishedUpdateCapacity; 
            private String instanceRefreshTaskId; 
            private Integer maxHealthyPercentage; 
            private Integer minHealthyPercentage; 
            private String regionId; 
            private String scalingGroupId; 
            private Boolean skipMatching; 
            private String startTime; 
            private String status; 
            private Integer totalNeedUpdateCapacity; 

            private Builder() {
            } 

            private Builder(InstanceRefreshTasks model) {
                this.checkpointPauseTime = model.checkpointPauseTime;
                this.checkpoints = model.checkpoints;
                this.desiredConfiguration = model.desiredConfiguration;
                this.detail = model.detail;
                this.endTime = model.endTime;
                this.finishedUpdateCapacity = model.finishedUpdateCapacity;
                this.instanceRefreshTaskId = model.instanceRefreshTaskId;
                this.maxHealthyPercentage = model.maxHealthyPercentage;
                this.minHealthyPercentage = model.minHealthyPercentage;
                this.regionId = model.regionId;
                this.scalingGroupId = model.scalingGroupId;
                this.skipMatching = model.skipMatching;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalNeedUpdateCapacity = model.totalNeedUpdateCapacity;
            } 

            /**
             * CheckpointPauseTime.
             */
            public Builder checkpointPauseTime(Integer checkpointPauseTime) {
                this.checkpointPauseTime = checkpointPauseTime;
                return this;
            }

            /**
             * Checkpoints.
             */
            public Builder checkpoints(java.util.List<Checkpoints> checkpoints) {
                this.checkpoints = checkpoints;
                return this;
            }

            /**
             * <p>The desired configurations of the instance refresh task.</p>
             */
            public Builder desiredConfiguration(DesiredConfiguration desiredConfiguration) {
                this.desiredConfiguration = desiredConfiguration;
                return this;
            }

            /**
             * <p>The reason why the instance refresh task failed to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task exceeded its maximum run time of one week. So the task failed.</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The end time of the instance refresh task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-22T02:09:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The refreshed number of instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder finishedUpdateCapacity(Integer finishedUpdateCapacity) {
                this.finishedUpdateCapacity = finishedUpdateCapacity;
                return this;
            }

            /**
             * <p>The ID of the instance refresh task.</p>
             * 
             * <strong>example:</strong>
             * <p>ir-1adfa123****</p>
             */
            public Builder instanceRefreshTaskId(String instanceRefreshTaskId) {
                this.instanceRefreshTaskId = instanceRefreshTaskId;
                return this;
            }

            /**
             * <p>The ratio by which the number of instances in the scaling group can exceed the upper limit for the number of instances in the scaling group during instance refresh.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder maxHealthyPercentage(Integer maxHealthyPercentage) {
                this.maxHealthyPercentage = maxHealthyPercentage;
                return this;
            }

            /**
             * <p>The ratio of the number of instances that provide services to the total number of instances in the scaling group during instance refresh.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder minHealthyPercentage(Integer minHealthyPercentage) {
                this.minHealthyPercentage = minHealthyPercentage;
                return this;
            }

            /**
             * <p>The region ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp16pbfcr8j9*****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>Indicates whether instances that match the desired scaling configuration are skipped.</p>
             * <blockquote>
             * <p> The system determines the match based on the ID of the desired scaling configuration rather than individual configuration items.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Instances that match the desired scaling configuration are skipped. When you initiate an instance refresh task, the system checks the configurations of all instances. The refresh operation is skipped for instances created based on the desired scaling configuration.</li>
             * <li>false: Instances that match the desired scaling configuration are not skipped. When an instance refresh task is initiated, all instances in the scaling group at the time of initiation are refreshed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipMatching(Boolean skipMatching) {
                this.skipMatching = skipMatching;
                return this;
            }

            /**
             * <p>The start time of the instance refresh task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-22T01:09:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the instance refresh task. Valid values:</p>
             * <ul>
             * <li>Pending: The instance refresh task is created and is waiting to be scheduled.</li>
             * <li>InProgress: The instance refresh task is being executed.</li>
             * <li>Paused: The instance refresh task is suspended.</li>
             * <li>Failed: The instance refresh task failed to be executed.</li>
             * <li>Successful: The instance refresh task is successful.</li>
             * <li>Cancelling: The instance refresh task is being canceled.</li>
             * <li>Cancelled: The instance refresh task is canceled.</li>
             * <li>RollbackInProgress: The instance refresh task is being rolled back.</li>
             * <li>RollbackSuccessful: The instance refresh task is rolled back.</li>
             * <li>RollbackFailed: The instance refresh task fails to be rolled back.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InProgress</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of instances whose configurations are refreshed.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalNeedUpdateCapacity(Integer totalNeedUpdateCapacity) {
                this.totalNeedUpdateCapacity = totalNeedUpdateCapacity;
                return this;
            }

            public InstanceRefreshTasks build() {
                return new InstanceRefreshTasks(this);
            } 

        } 

    }
}
