// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeCommandRequest} extends {@link RequestModel}
 *
 * <p>InvokeCommandRequest</p>
 */
public class InvokeCommandRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("CommandId")
    @Validation(required = true)
    private String commandId;

    @Query
    @NameInMap("ContainerId")
    private String containerId;

    @Query
    @NameInMap("ContainerName")
    private String containerName;

    @Query
    @NameInMap("Frequency")
    private String frequency;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepeatMode")
    private String repeatMode;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Timed")
    private Boolean timed;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    private InvokeCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.commandId = builder.commandId;
        this.containerId = builder.containerId;
        this.containerName = builder.containerName;
        this.frequency = builder.frequency;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.repeatMode = builder.repeatMode;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.timed = builder.timed;
        this.timeout = builder.timeout;
        this.username = builder.username;
        this.windowsPasswordName = builder.windowsPasswordName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timed
     */
    public Boolean getTimed() {
        return this.timed;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return windowsPasswordName
     */
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public static final class Builder extends Request.Builder<InvokeCommandRequest, Builder> {
        private String sourceRegionId; 
        private String commandId; 
        private String containerId; 
        private String containerName; 
        private String frequency; 
        private java.util.List < String > instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private String repeatMode; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private Boolean timed; 
        private Long timeout; 
        private String username; 
        private String windowsPasswordName; 

        private Builder() {
            super();
        } 

        private Builder(InvokeCommandRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.commandId = request.commandId;
            this.containerId = request.containerId;
            this.containerName = request.containerName;
            this.frequency = request.frequency;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.repeatMode = request.repeatMode;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.timed = request.timed;
            this.timeout = request.timeout;
            this.username = request.username;
            this.windowsPasswordName = request.windowsPasswordName;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The ID of the command. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.
         * <p>
         * 
         * > Common Cloud Assistant commands can be run based on their names. For more information, see [View and run common Cloud Assistant commands](~~429635~~).
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * The ID of the container. Only 64-bit hexadecimal strings are supported. Container IDs that are prefixed with `docker://`, `containerd://`, or `cri-o://` are allowed to specify container runtimes.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   If this parameter is specified, Cloud Assistant runs scripts in the specified container of the instance.
         * 
         * *   If this parameter is specified, scripts can be run only on Linux instances on which Cloud Assistant client versions not earlier than 2.2.3.344 are installed.
         * 
         *     *   For information about how to view the version of the Cloud Assistant client, see [Install the Cloud Assistant client](~~64921~~).
         *     *   For information about how to upgrade the version of the Cloud Assistant client, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).
         * 
         * *   If this parameter is specified, the `Username` parameter specified in a request to this operation and the `WorkingDir` parameter specified in a request to the [CreateCommand](~~64844~~) operation do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         * 
         * *   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * The name of the container.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   If this parameter is specified, Cloud Assistant runs scripts in the specified container of the instance.
         * 
         * *   If this parameter is specified, scripts can be run only on Linux instances on which Cloud Assistant client versions not earlier than 2.2.3.344 are installed.
         * 
         *     *   For information about how to view the version of the Cloud Assistant client, see [Install the Cloud Assistant client](~~64921~~).
         *     *   For information about how to upgrade the version of the Cloud Assistant client, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).
         * 
         * *   If this parameter is specified, the `Username` parameter specified in a request to this operation and the `WorkingDir` parameter specified in a request to the [CreateCommand](~~64844~~) operation do not take effect. You can run the command in the default working directory of the container only by using the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         * 
         * *   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * The schedule on which to run the command. You must specify this parameter when you set `Timed` to `true`. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specified time, or run at designated times based on a cron expression.
         * <p>
         * 
         * *   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is applicable when tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value><Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. Take note of the following limits when you set an interval:
         * 
         *     *   The specified interval can be anywhere from 60 seconds to 7 days and must be longer than the timeout period of the scheduled task.
         *     *   The interval is the amount of time elapsed between two consecutive executions. The interval is irrelevant to the amount of time required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before it runs the command again.
         *     *   A task is not executed immediately after it is created. For example, assume that you set the interval to 5 minutes and create a task to run the command. The task begins to run 5 minutes after it is created.
         * 
         * *   To run a command only once at a specified time, specify a point in time and a time zone. Specify the point in time in the following format: `at(yyyy-MM-dd HH:mm:ss <Time zone>)`, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the default time zone is UTC. You can specify the time zone in the following forms:
         * 
         *     *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.
         *     *   The time zone abbreviation. Only UTC is supported.
         * 
         *     For example, to specify a command to run only once at 13:15:30 on June 06, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To specify a command to run only once at 13:15:30 on June 06, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.
         * 
         * *   To run a command at designated times, specify a cron expression. Specify the time in the following format: `<Cron expression> <Time zone>`, where the cron expression is in the format of `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>`. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which to run the command is used by default. For more information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following forms:
         * 
         *     *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not pad leading zeros to the hour value.
         *     *   The time zone abbreviation. Only UTC is supported.
         * 
         *     For example, to specify a command to run at 10:15:00 every day in 2022 (Shanghai time), set the time to `0 15 10 ? * * 2022 Asia/Shanghai`. To specify a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the time to `0 0/30 10-11 * * ? 2022 GMT +8:00`. To specify a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years since 2022 (UTC), set the time to `0 0/5 14 * 10 ? 2022/2 UTC`.
         * 
         *     **
         * 
         *     **Note**The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The ID of instance N on which to run the command. You can specify up to 50 instance IDs in each request. Valid values of N: 1 to 50.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The key-value pairs of custom parameters to pass in when the custom parameter feature is enabled. Number of custom parameters: 0 to 10.
         * <p>
         * 
         * *   Each key in a Map collection cannot be an empty string and can be up to 64 characters in length.
         * *   Values in a Map collection can be empty strings.
         * *   The size of the command (including custom parameters and original command content) after Base64 encoding cannot exceed 18 KB.
         * *   The custom parameter names specified in the value of Parameters must all be included in the custom parameter names specified when you created the command. You can use empty strings to represent the parameters that are not passed in.
         * 
         * You can leave this parameter empty to disable the custom parameter feature.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID of the command. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies how to run the command. Valid values:
         * <p>
         * 
         * *   Once: immediately runs the command.
         * *   Period: runs the command on a schedule. If you set this parameter to `Period`, you must set `Timed` to true and specify `Frequency`.
         * *   NextRebootOnly: automatically runs the command the next time the instance starts.
         * *   EveryReboot: automatically runs the command every time the instance starts.
         * 
         * Default value:
         * 
         * *   When `Timed` is set to false and `Frequency` is not specified, the default value of RepeatMode is `Once`.
         * *   When `Timed` is set to true and `Frequency` is specified, `Period` is used as the value of RepeatMode regardless of whether RepeatMode is specified.
         * 
         * Take note of the following items:
         * 
         * *   When this parameter is set to `Period`, `NextRebootOnly`, or `EveryReboot`, you can call the [StopInvocation](~~64838~~) operation to stop the pending or scheduled execution of the command.
         * *   When this parameter is set to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation and set `IncludeHistory` to true to view the results of historical scheduled executions.
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the command executions. When you set this parameter, take note of the following items:
         * <p>
         * 
         * *   The instances specified by the InstanceId.N parameter must belong to the specified resource group.
         * *   You can set this parameter to call the [DescribeInvocations](~~64840~~) or [DescribeInvocationResults](~~64845~~) operation to query execution results in the specified resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The tags of the command.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to run the command on a schedule. Valid values:
         * <p>
         * 
         * *   true: runs the command on the schedule specified by `Frequency`. The results of each execution of a command do not affect the next execution of the command.
         * *   false: runs the command only once.
         * 
         * Default value: false.
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        /**
         * The timeout period for the command execution. Unit: seconds.
         * <p>
         * 
         * *   The timeout period cannot be less than 10 seconds.
         * *   A timeout error occurs when a command cannot be run because the process slows down or because a specific module or the Cloud Assistant client does not exist. When an execution times out, the command process is forcefully terminated.
         * *   If this parameter is not specified, the timeout period specified when the command is created prevails and
         * *   is used only as the timeout period for this execution. The timeout period of the command is not modified.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The username to use to run the command on instances.
         * <p>
         * 
         * *   For Linux instances, the root username is used.
         * *   For Windows instances, the System username is used.
         * 
         * You can also specify other usernames that already exist in the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Run Cloud Assistant commands as a regular user](~~203771~~).
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The name of the password to use to run the command on Windows instances.
         * <p>
         * 
         * If you do not want to use the default System username to run the command on Windows instances, you must specify both the WindowsPasswordName and `Username` parameters. The password is hosted in plaintext in the parameter repository of Operation Orchestration Service (OOS) to mitigate the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter. For more information, see [Encrypt parameters](~~186828~~) and [Configure a regular user to run Cloud Assistant commands](~~203771~~).
         * 
         * > If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify the WindowsPasswordName parameter.
         */
        public Builder windowsPasswordName(String windowsPasswordName) {
            this.putQueryParameter("WindowsPasswordName", windowsPasswordName);
            this.windowsPasswordName = windowsPasswordName;
            return this;
        }

        @Override
        public InvokeCommandRequest build() {
            return new InvokeCommandRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The key of tag N of the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.
             * <p>
             * 
             * If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
             * 
             * The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N of the command. Valid values of N: 1 to 20. The tag value can be an empty string.
             * <p>
             * 
             * It can be up to 128 characters in length and cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
