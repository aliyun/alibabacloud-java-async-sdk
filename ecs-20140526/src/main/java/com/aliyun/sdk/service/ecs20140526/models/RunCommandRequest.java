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
    @NameInMap("ClientToken")
    private String clientToken;

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
    @NameInMap("ResourceTag")
    private java.util.List < ResourceTag> resourceTag;

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
        this.clientToken = builder.clientToken;
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
        this.resourceTag = builder.resourceTag;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return resourceTag
     */
    public java.util.List < ResourceTag> getResourceTag() {
        return this.resourceTag;
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
        private String clientToken; 
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
        private java.util.List < ResourceTag> resourceTag; 
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
            this.clientToken = request.clientToken;
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
            this.resourceTag = request.resourceTag;
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The content of the command. The command content can be plaintext or Base64-encoded. Take note of the following items:
         * <p>
         * 
         * *   If you want to retain the command, make sure that the Base64-encoded command content does not exceed 18 KB in size. If you do not want to retain the command, make sure that the Base64-encoded command content does not exceed 24 KB in size. You can set `KeepCommand` to specify whether to retain the command.
         * 
         * *   If the command content is Base64-encoded, set `ContentEncoding` to Base64.
         * 
         * *   If you set `EnableParameter` to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:
         * 
         *     *   Specify custom parameters in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.
         *     *   You can specify up to 20 custom parameters.
         *     *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.
         *     *   Each custom parameter name cannot exceed 64 bytes in length.
         * 
         * *   You can specify built-in environment parameters as custom parameters. Then, when you run the command, the parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:
         * 
         *     *   `{{ACS::RegionId}}`: the region ID.
         * 
         *     *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.
         * 
         *     *   `{{ACS::InstanceId}}`: the instance ID. When the command is run on multiple instances, if you want to specify `{{ACS::InstanceId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         * 
         *     *   `{{ACS::InstanceName}}`: the instance name. When the command is run on multiple instances, if you want to specify `{{ACS::InstanceName}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:
         * 
         *         *   Linux: 2.2.3.344
         *         *   Windows: 2.1.3.344
         * 
         *     *   `{{ACS::InvokeId}}`: the task ID. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         * 
         *     *   `{{ACS::CommandId}}`: the command ID. If you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant Agent is not earlier than the following ones:
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
         * *   If this parameter is specified, Cloud Assistant runs scripts in the specified container of the instance.
         * *   If this parameter is specified, scripts can run only on Linux instances on which Cloud Assistant Agent is installed. The version of Cloud Assistant Agent must be 2.2.3.344 or later.
         * *   If this parameter is specified, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
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
         * *   If this parameter is specified, scripts can run only on Linux instances on which Cloud Assistant Agent is stalled. The version of Cloud Assistant Agent must be 2.2.3.344 or later.
         * *   If this parameter is specified, the specified `Username` and `WorkingDir` parameters do not take effect. You can run the command in the default working directory of the container by using only the default user of the container. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         * *   If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to `#!/usr/bin/python` at the beginning of a script to specify a script interpreter. For more information, see [Use Cloud Assistant to run commands in containers](~~456641~~).
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * The encoding mode of command content (`CommandContent`). The valid values are case-insensitive. Valid values:
         * <p>
         * 
         * *   PlainText: The command content is not encoded.
         * *   Base64: The command content is encoded in Base64.
         * 
         * Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.
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
         * Default value: false.
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putQueryParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * The schedule on which to run the command. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specified time, or run at designated times based on a cron expression.
         * <p>
         * 
         * *   To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value> <Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. When you specify an interval, take note of the following limits:
         * 
         *     *   The interval can be anywhere from 60 seconds to 7 days, but must be longer than the timeout period of the scheduled task.
         *     *   The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before it runs the command again.
         *     *   A task is not executed immediately after the task is created. For example, assume that you set the interval to 5 minutes for a task. The task begins to be executed 5 minutes after it is created.
         * 
         * *   To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the `at(yyyy-MM-dd HH:mm:ss <Time zone>)` format, which indicates `at(Year-Month-Day Hour:Minute:Second <Time zone>)`. If you do not specify a time zone, the UTC time zone is used by default. You can specify the time zone in the following forms:
         * 
         *     *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         * 
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.
         * 
         *     *   The time zone abbreviation. Only UTC is supported.
         * 
         *         For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.
         * 
         * *   To run a command at specific times, use a cron expression to define the schedule. Specify a schedule in the `<Cron expression> <Time zone>` format. The cron expression is in the `<seconds> <minutes> <hours> <day of the month> <month> <day of the week> <year (optional)>` format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used by default. For more information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following forms:
         * 
         *     *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         * 
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, do not add leading zeros to the hour value.
         * 
         *     *   The time zone abbreviation. Only UTC is supported.
         * 
         *         For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the schedule to `0 15 10 ? * * 2022 Asia/Shanghai`. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to `0 0/30 10-11 * ? 2022 GMT +8:00`. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to `0 0/5 14 * 10 ? 2022/2 UTC`.
         * 
         *         **
         * 
         *         **Note** The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The ID of instance N on which to run the command. Valid values of N: 1 to 50.
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
         * Default value: false.
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
         * The key-value pairs of the custom parameters that are passed in when the command that can include custom parameters is run. For example, assume that the command content is `echo {{name}}`. The `Parameter` parameter can be used to pass in the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the `echo Jack` command is run.
         * <p>
         * 
         * You can specify up to 10 custom parameters. Take note of the following items:
         * 
         * *   The key cannot be an empty string. It can be up to 64 characters in length.
         * *   The value can be an empty string.
         * *   If you want to retain the command, make sure that the command after Base64 encoding, including custom parameters and original command content, does not exceed 18 KB in size. If you do not want to retain the command, make sure that the command after Base64-encoding does not exceed 24 KB in size. You can set `KeepCommand` to specify whether to retain the command.
         * *   The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.
         * 
         * This parameter is empty by default. You can leave this parameter empty to disable the custom parameter feature.
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
         * *   Period: runs the command on a schedule. If you set this parameter to `Period`, you must specify `Frequency`.
         * *   NextRebootOnly: runs the command the next time the instance is started.
         * *   EveryReboot: runs the command every time the instance is started.
         * 
         * Default values:
         * 
         * *   If you do not specify `Frequency`, the default value is `Once`.
         * *   If you specify `Frequency`, `Period` is used as the value of RepeatMode regardless of whether RepeatMode is set to Period.
         * 
         * Take note of the following items:
         * 
         * *   You can all the [StopInvocation](~~64838~~) operation to stop the pending or scheduled executions of the command.
         * *   If you set this parameter to `Period` or `EveryReboot`, you can call the [DescribeInvocationResults](~~64845~~) operation with `IncludeHistory` set to true to query the results of historical scheduled executions.
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
         * *   The instances specified by InstanceId.N must belong to the specified resource group.
         * *   After the command is run, you can set this parameter to call the [DescribeInvocations](~~64840~~) or [DescribeInvocationResults](~~64845~~) operation to query the execution results in the specified resource group.
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
         * ResourceTag.
         */
        public Builder resourceTag(java.util.List < ResourceTag> resourceTag) {
            this.putQueryParameter("ResourceTag", resourceTag);
            this.resourceTag = resourceTag;
            return this;
        }

        /**
         * The description of the command. The description supports all character sets and can be up to 512 characters in length.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * >  This parameter is no longer used and does not take effect.
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
         * A timeout error occurs if the command cannot be run because the process slows down or because a specific module or Cloud Assistant Agent does not exist. When an execution times out, the command process is forcefully terminated.
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
         * *   RunBatScript: batch command, applicable to Windows instances.
         * *   RunPowerShellScript: PowerShell command, applicable to Windows instances.
         * *   RunShellScript: shell command, applicable to Linux instances.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The username to use to run the command on instances. The username cannot exceed 255 characters in length.
         * <p>
         * 
         * *   For Linux instances, the root username is used by default.
         * *   For Windows instances, the System username is used by default.
         * 
         * You can also specify other usernames that already exist in the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](~~203771~~).
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The name of the password to use to run the command on Windows instances. The name cannot exceed 255 characters in length.
         * <p>
         * 
         * If you do not want to use the default System user to run the command on Windows instances, specify both WindowsPasswordName and `Username`. To mitigate the risk of password leaks, the password is stored in plaintext in Operation Orchestration Service (OOS) Parameter Store, and only the name of the password is passed in by using WindowsPasswordName. For more information, see [Encrypt parameters](~~186828~~) and [Configure a regular user to run Cloud Assistant commands](~~203771~~).
         * 
         * >  If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify WindowsPasswordName.
         */
        public Builder windowsPasswordName(String windowsPasswordName) {
            this.putQueryParameter("WindowsPasswordName", windowsPasswordName);
            this.windowsPasswordName = windowsPasswordName;
            return this;
        }

        /**
         * The working directory of the command on the instance. The value can be up to 200 characters in length.
         * <p>
         * 
         * Default values:
         * 
         * *   For Linux instances, the default value is `/root`, which is the home directory of the administrator (the root user).
         * *   For Windows instances, the default value is the directory where the Cloud Assistant Agent process resides, such as `C:\Windows\System32`.
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

    public static class ResourceTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ResourceTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTag create() {
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

            public ResourceTag build() {
                return new ResourceTag(this);
            } 

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
             * The key of tag N to add to the command task. Valid values of N: 1 to 20. The tag key cannot be an empty string.
             * <p>
             * 
             * If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags, call [ListTagResources](~~110425~~).
             * 
             * The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the command task. Valid values of N: 1 to 20. The tag value can be an empty string.
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
