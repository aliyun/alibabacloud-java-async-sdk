// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCommandRequest} extends {@link RequestModel}
 *
 * <p>RunCommandRequest</p>
 */
public class RunCommandRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("CommandContent")
    @Validation(required = true)
    private String commandContent;

    @Query
    @NameInMap("ContainerId")
    private String containerId;

    @Query
    @NameInMap("ContainerName")
    private String containerName;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableParameter")
    private Boolean enableParameter;

    @Query
    @NameInMap("Frequency")
    private String frequency;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("KeepCommand")
    private Boolean keepCommand;

    @Query
    @NameInMap("Name")
    private String name;

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
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    private RunCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.commandContent = builder.commandContent;
        this.containerId = builder.containerId;
        this.containerName = builder.containerName;
        this.contentEncoding = builder.contentEncoding;
        this.description = builder.description;
        this.enableParameter = builder.enableParameter;
        this.frequency = builder.frequency;
        this.instanceId = builder.instanceId;
        this.keepCommand = builder.keepCommand;
        this.name = builder.name;
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
        this.type = builder.type;
        this.username = builder.username;
        this.windowsPasswordName = builder.windowsPasswordName;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommandRequest create() {
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
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
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
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
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
     * @return keepCommand
     */
    public Boolean getKeepCommand() {
        return this.keepCommand;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return type
     */
    public String getType() {
        return this.type;
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

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<RunCommandRequest, Builder> {
        private String sourceRegionId; 
        private String commandContent; 
        private String containerId; 
        private String containerName; 
        private String contentEncoding; 
        private String description; 
        private Boolean enableParameter; 
        private String frequency; 
        private java.util.List < String > instanceId; 
        private Boolean keepCommand; 
        private String name; 
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
        private String type; 
        private String username; 
        private String windowsPasswordName; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(RunCommandRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.commandContent = request.commandContent;
            this.containerId = request.containerId;
            this.containerName = request.containerName;
            this.contentEncoding = request.contentEncoding;
            this.description = request.description;
            this.enableParameter = request.enableParameter;
            this.frequency = request.frequency;
            this.instanceId = request.instanceId;
            this.keepCommand = request.keepCommand;
            this.name = request.name;
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
            this.type = request.type;
            this.username = request.username;
            this.windowsPasswordName = request.windowsPasswordName;
            this.workingDir = request.workingDir;
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
         * The content of the command. The command content can be plaintext or Base64-encoded. Take note of the following items:
         * <p>
         * 
         * *   If you want to retain the command, make sure that the Base64-encoded command content does not exceed 18 KB in size. If you do not want to retain the command, make sure that the Base64-encoded command content does not exceed 24 KB in size. You can use the `KeepCommand` parameter to specify whether to retain the command.
         * 
         * *   If the command content is Base64-encoded, set the `ContentEncoding` parameter to Base64.
         * 
         * *   If you set the `EnableParameter` parameter to true, the custom parameter feature is enabled and you can specify custom parameters based on the following rules:
         * 
         *     *   Specify custom parameters in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.
         *     *   You can specify up to 20 custom parameters.
         *     *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is not case-sensitive.
         *     *   Each custom parameter name cannot exceed 64 bytes in length.
         * 
         * *   You can specify built-in environment parameters as custom parameters. Then, Cloud Assistant automatically specifies the parameters when you run the command. You can specify the following built-in environment parameters:
         * 
         *     *   `{{ACS::RegionId}}`: the ID of the region.
         * 
         *     *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.
         * 
         *     *   `{{ACS::InstanceId}}`: the ID of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         * 
         *     *   `{{ACS::InstanceName}}`: the name of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceName}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:
         * 
         *         *   Linux: 2.2.3.344
         *         *   Windows: 2.1.3.344
         * 
         *     *   `{{ACS::InvokeId}}`: the ID of the command task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         * 
         *     *   `{{ACS::CommandId}}`: the ID of the command. If you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following versions:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * The ID of the container. Only 64-bit hexadecimal strings are supported. Container IDs that are prefixed with `docker://`, `containerd://`, or `cri-o://` can specify container runtimes.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   If you specify this parameter, Cloud Assistant runs scripts in the specified container of the instance.
         * *   If you specify this parameter, scripts can be run only on Linux instances on which the Cloud Assistant client of version 2.2.3.344 or later is installed.
         * *   If you specify this parameter, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         * *   If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify a script interpreter by adding a command in a format that is similar to `#!/usr/bin/python` at the beginning of a script. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
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
         * *   If you specify this parameter, Cloud Assistant runs scripts in the specified container of the instance.
         * *   If you specify this parameter, scripts can be run only on Linux instances on which the Cloud Assistant client of version 2.2.3.344 or later is installed.
         * *   If you specify this parameter, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         * *   If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify a script interpreter by adding a command in a format that is similar to `#!/usr/bin/python` at the beginning of a script. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * The encoding mode of the command content that is specified by the `CommandContent` parameter. The valid values are not case-sensitive. Valid values:
         * <p>
         * 
         * *   PlainText: The command content is not encoded.
         * *   Base64: The command content is encoded in Base64.
         * 
         * Default value: PlainText. If an invalid value is specified for this parameter, PlainText is used.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * The description of the command. The description supports all character sets and can be up to 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to include custom parameters in the command.
         * <p>
         * 
         * Default value: false
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putQueryParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * The schedule based on which the command is run. When you set the `Timed` parameter to `true`, you must specify this parameter. You can run a command at a fixed interval based on a rate expression, run the command only once at a specific time, or run the command at specific times based on a cron expression.
         * <p>
         * 
         * *   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value><Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. When you specify an interval, take note of the following limits:
         * 
         *     *   The specified interval can range from 60 seconds to 7 days and must be longer than the timeout period of the scheduled task.
         *     *   The interval is the amount of time that elapsed between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, you set the interval to 5 minutes, and the amount of time that is required to run the command once is 2 minutes. Each time the command is run, the system waits 3 minutes before the system reruns the command.
         *     *   A task is not immediately run after it is created. For example, you set the interval to 5 minutes and create a task to run the command. The task runs 5 minutes after it is created.
         * 
         * *   To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the `at(yyyy-MM-dd HH:mm:ss <Time zone>)` format, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the default time zone UTC is used. You can specify the time zone in the following formats:
         * 
         *     *   The name of the time zone. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.
         *     *   The abbreviation of the time zone. Only UTC is supported.
         * 
         *     For example, to specify a command that runs only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To specify a command that runs only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.
         * 
         * *   To run a command at specific times, specify a cron expression. Specify the time in the `<Cron expression> <Time zone>` format. The cron expression is in the `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>` format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used. For more information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following formats:
         * 
         *     *   The name of the time zone. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.
         *     *   The abbreviation of the time zone. Only UTC is supported.
         * 
         *     For example, to specify a command that runs at 10:15:00 every day in 2022 (Shanghai time), set the time to `0 15 10 ? * * 2022 Asia/Shanghai`. To specify a command that runs every 30 minutes from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the time to `0 0/30 10-11 * * ? 2022 GMT +8:00`. To specify a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years starting from 2022 (UTC), set the time to `0 0/5 14 * 10 ? 2022/2 UTC`.
         * 
         *     **
         * 
         *     **Note**The interval must be at least 10 seconds and cannot be shorter than the timeout period of scheduled executions.
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The ID of instance N on which you want to run the command. Valid values of N: 1 to 50.
         * <p>
         * 
         * If one of the specified instances does not meet the conditions for running the command, the call fails. To ensure that the call is successful, specify only the IDs of instances that meet the conditions.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to retain the command after the command is run. Valid values:
         * <p>
         * 
         * *   true: retains the command. You can call the InvokeCommand operation to rerun the command. The retained command counts against the quota of Cloud Assistant commands.
         * *   false: does not retain the command. The command is automatically deleted after it is run and does not count against the quota of Cloud Assistant commands.
         * 
         * Default value: false
         */
        public Builder keepCommand(Boolean keepCommand) {
            this.putQueryParameter("KeepCommand", keepCommand);
            this.keepCommand = keepCommand;
            return this;
        }

        /**
         * The name of the command. The name supports all character sets and can be up to 128 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The key-value pairs of the custom parameters that are passed in when the command includes custom parameters. For example, the command content is `echo {{name}}`, and you can use the `Parameter` parameter to pass in the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the `echo Jack` command is run.
         * <p>
         * 
         * You can specify up to 10 custom parameters. Take note of the following items:
         * 
         * *   The key cannot be an empty string. It can be up to 64 characters in length.
         * *   The value can be an empty string.
         * *   If you want to retain the command, make sure that the size of the command after Base64 encoding, including custom parameters and original command content, does not exceed 18 KB. If you do not want to retain the command, make sure that the size of the command after Base64-encoding does not exceed 24 KB. You can use the `KeepCommand` parameter to specify whether to retain the command.
         * *   The custom parameter names that are specified by the Parameters parameter must be included in the custom parameter names that you specify when you created the command. You can use empty strings to represent the parameters that are not passed in.
         * 
         * By default, this parameter is left empty. If you want to disable the custom parameter feature, you can leave this parameter empty.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies the mode in which you want to run the command. Valid values:
         * <p>
         * 
         * *   Once: immediately runs the command.
         * *   Period: runs the command based on a schedule. If you set this parameter to `Period`, you must set the `Timed` parameter to true and specify the `Frequency` parameter.
         * *   NextRebootOnly: automatically runs the command the next time the instance is started.
         * *   EveryReboot: automatically runs the command every time the instance is started.
         * 
         * Default value:
         * 
         * *   If you set the `Timed` parameter to false and do not specify the `Frequency` parameter, the default value of the RepeatMode parameter is `Once`.
         * *   If you set the `Timed` parameter to true and specify the `Frequency` parameter, `Period` is used as the value of the RepeatMode parameter regardless of whether you specify the RepeatMode parameter.
         * 
         * Take note of the following items:
         * 
         * *   If you set this parameter to `Period`, `NextRebootOnly`, or `EveryReboot`, you can call the [StopInvocation](~~64838~~) operation to stop the pending or scheduled execution of the command.
         * *   If you set this parameter to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation and set the `IncludeHistory` parameter to true to view the results of previous scheduled executions.
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * The ID of the resource group to which you want to assign the command executions. When you specify this parameter, take note of the following items:
         * <p>
         * 
         * *   The instances that are specified by the InstanceId parameter must belong to the specified resource group.
         * *   You can specify this parameter to call the [DescribeInvocations](~~64840~~) or [DescribeInvocationResults](~~64845~~) operation to query execution results in the specified resource group.
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
         * The tags that you want to add to the command.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to run the command based on a schedule. Valid values:
         * <p>
         * 
         * *   true: runs the command based on the schedule that is specified by the `Frequency` parameter. The results of a command execution do not affect the next command execution.
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
         * A timeout error occurs when a command cannot be run because the command process slows down or because a specific module or the Cloud Assistant client does not exist. When an execution times out, the command process is forcibly terminated.
         * 
         * Default value: 60.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The language type of the command. Valid values:
         * <p>
         * 
         * *   RunBatScript: batch command, applicable to Windows instances
         * *   RunPowerShellScript: PowerShell command, applicable to Windows instances
         * *   RunShellScript: shell command, applicable to Linux instances
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The username that you use to run the command on instances.
         * <p>
         * 
         * *   For Linux instances, the root username is used.
         * *   For Windows instances, the System username is used.
         * 
         * You can also specify other usernames that already exist on the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Run Cloud Assistant commands as a regular user](~~203771~~).
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The name of the password that you use to run the command on Windows instances.
         * <p>
         * 
         * If you do not want to use the default username System to run the command on Windows instances, you must specify the WindowsPasswordName and `Username` parameters. The password is stored in plaintext in the parameter repository of Operation Orchestration Service (OOS) to reduce the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter. For more information, see [Encrypt parameters](~~186828~~) and [Configure a regular user to run Cloud Assistant commands](~~203771~~).
         * 
         * > If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify the WindowsPasswordName parameter.
         */
        public Builder windowsPasswordName(String windowsPasswordName) {
            this.putQueryParameter("WindowsPasswordName", windowsPasswordName);
            this.windowsPasswordName = windowsPasswordName;
            return this;
        }

        /**
         * The working directory of the command on the instance.
         * <p>
         * 
         * Default values:
         * 
         * *   For Linux instances, the default value is `/root`, which is the home directory of the administrator (the root user).
         * *   For Windows instances, the default value is the directory where the Cloud Assistant client process resides. Example: `C:\Windows\System32`.
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        @Override
        public RunCommandRequest build() {
            return new RunCommandRequest(this);
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
             * The key of tag N of the command. You can specify up to 20 tag keys for the command. The tag key cannot be an empty string.
             * <p>
             * 
             * If you specify a tag to query resources, up to 1,000 resources that have the specified tag can be displayed in the response. If you specify multiple tags to query resources, up to 1,000 resources that have all specified tags can be displayed in the response. To query more than 1,000 resources that have the specified tags, call the [ListTagResources](~~110425~~) operation.
             * 
             * The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N of the command. You can specify up to 20 tag values for the command. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.
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
