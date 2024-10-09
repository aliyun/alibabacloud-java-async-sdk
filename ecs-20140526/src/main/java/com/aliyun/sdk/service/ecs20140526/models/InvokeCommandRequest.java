// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InvokeCommandRequest} extends {@link RequestModel}
 *
 * <p>InvokeCommandRequest</p>
 */
public class InvokeCommandRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerId")
    private String containerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private String frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Launcher")
    private String launcher;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatMode")
    private String repeatMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTag")
    private java.util.List < ResourceTag> resourceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminationMode")
    private String terminationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timed")
    private Boolean timed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    private InvokeCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.commandId = builder.commandId;
        this.containerId = builder.containerId;
        this.containerName = builder.containerName;
        this.frequency = builder.frequency;
        this.instanceId = builder.instanceId;
        this.launcher = builder.launcher;
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
        this.terminationMode = builder.terminationMode;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return launcher
     */
    public String getLauncher() {
        return this.launcher;
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
     * @return terminationMode
     */
    public String getTerminationMode() {
        return this.terminationMode;
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
        private String clientToken; 
        private String commandId; 
        private String containerId; 
        private String containerName; 
        private String frequency; 
        private java.util.List < String > instanceId; 
        private String launcher; 
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
        private String terminationMode; 
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
            this.clientToken = request.clientToken;
            this.commandId = request.commandId;
            this.containerId = request.containerId;
            this.containerName = request.containerName;
            this.frequency = request.frequency;
            this.instanceId = request.instanceId;
            this.launcher = request.launcher;
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
            this.terminationMode = request.terminationMode;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs.</p>
         * <blockquote>
         * <p> Common Cloud Assistant commands can be run based on their names. For more information, see <a href="https://help.aliyun.com/document_detail/429635.html">View and run common Cloud Assistant commands</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-e996287206324975b5fbe1d****</p>
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>The ID of the container. Only 64-bit hexadecimal strings are supported. You can use container IDs that are prefixed with <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> to specify container runtimes.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
         * </li>
         * <li><p>If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
         * <ul>
         * <li>For information about how to query the version of Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
         * <li>For information about how to upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
         * </ul>
         * </li>
         * <li><p>If this parameter is specified, the <code>Username</code> parameter that is specified in a request to call this operation and the <code>WorkingDir</code> parameter that is specified in a request to call the <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * <li><p>If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * <p>The name of the container.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
         * </li>
         * <li><p>If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
         * <ul>
         * <li>For information about how to query the version of Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
         * <li>For information about how to upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
         * </ul>
         * </li>
         * <li><p>If this parameter is specified, the <code>Username</code> parameter that is specified in a request to call this operation and the <code>WorkingDir</code> parameter that is specified in a request to call the <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * <li><p>If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test-container</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>The schedule on which to run the command. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specific time, or run at specific times based on a cron expression.</p>
         * <ul>
         * <li><p>To run a command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: <code>rate(&lt;Execution interval value&gt;&lt;Execution interval unit&gt;)</code>. For example, specify <code>rate(5m)</code> to run the command every 5 minutes. When you specify an interval, take note of the following limits:</p>
         * <ul>
         * <li>The interval can be anywhere from 60 seconds to 7 days, but must be longer than the timeout period of the scheduled task.</li>
         * <li>The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. Each time the command is run, the system waits 3 minutes before the system runs the command again.</li>
         * <li>A task is not immediately executed after the task is created. For example, assume that you set the interval to 5 minutes for a task. The task begins to be executed 5 minutes after it is created.</li>
         * </ul>
         * </li>
         * <li><p>To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the <code>at(yyyy-MM-dd HH:mm:ss &lt;Time zone&gt;)</code> format, which indicates <code>at(Year-Month-Day Hour:Minute:Second &lt;Time zone&gt;)</code>. If you do not specify a time zone, the Coordinated Universal Time (UTC) time zone is used by default. You can specify a time zone in the following forms:</p>
         * <ul>
         * <li>The time zone name. Examples: <code>Asia/Shanghai</code> and <code>America/Los_Angeles</code>.</li>
         * <li>The time offset from GMT. Examples: <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
         * <li>The time zone abbreviation. Only UTC is supported.</li>
         * </ul>
         * <p>For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
         * </li>
         * <li><p>To run a command at specific times, use a cron expression to define the schedule. Specify a schedule in the <code>&lt;Cron expression&gt; &lt;Time zone&gt;</code> format. The cron expression is in the <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of the month&gt; &lt;month&gt; &lt;day of the week&gt; &lt;year (optional)&gt;</code> format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance on which you want to run the command is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. You can specify a time zone in the following forms:</p>
         * <ul>
         * <li>The time zone name. Examples: <code>Asia/Shanghai</code> and <code>America/Los_Angeles</code>.</li>
         * <li>The time offset from GMT. Examples: <code>GMT+8:00</code> (UTC+8) and <code>GMT-7:00</code> (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
         * <li>The time zone abbreviation. Only UTC is supported. For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the schedule to <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
         * </ul>
         * <p>**</p>
         * <p><strong>Note</strong> The minimum interval must be 10 seconds or more and cannot be shorter than the timeout period of scheduled executions.</p>
         * </li>
         * </ul>
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The IDs of instances on which you want to run the command. You can specify up to 100 instance IDs in each request. Valid values of N: 1 to 100.</p>
         * <p>You can apply for a quota increase in the Quota Center console. The quota name is Maximum number of instances supported for command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp185dy2o3o6n****</p>
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The launcher for script execution. The value cannot exceed 1 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
         */
        public Builder launcher(String launcher) {
            this.putQueryParameter("Launcher", launcher);
            this.launcher = launcher;
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
         * <p>The key-value pairs of custom parameters to be passed in when the custom parameter feature is enabled. Number of custom parameters: 0 to 10.</p>
         * <ul>
         * <li>Keys in a Map collection can be up to 64 characters in length, and cannot be empty strings.</li>
         * <li>Values in a Map collection can be empty strings.</li>
         * <li>The size of the Base64-encoded custom parameters and original command content cannot exceed 18 KB.</li>
         * <li>The custom parameter names specified in the value of Parameters must be included in the custom parameters specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</li>
         * </ul>
         * <p>If you want to disable the custom parameter feature, you can leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAIdyv******aRY&quot;}</p>
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID of the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The mode in which you want to run the command. Valid values:</p>
         * <ul>
         * <li>Once: runs the command immediately.</li>
         * <li>Period: runs the command based on a schedule. If you set this parameter to <code>Period</code>, you must also configure the <code>Frequency</code> parameter.</li>
         * <li>NextRebootOnly: runs the command the next time the instance is started.</li>
         * <li>EveryReboot: runs the command every time the instance is started.</li>
         * </ul>
         * <p>Default values:</p>
         * <ul>
         * <li>If you do not specify <code>Frequency</code>, the default value is <code>Once</code>.</li>
         * <li>If you specify <code>Frequency</code>, <code>Period</code> is used as the value of RepeatMode regardless of whether RepeatMode is set to Period.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> operation to stop the pending or scheduled executions of the command.</li>
         * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call the <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation with <code>IncludeHistory</code> set to true to query the results of historical scheduled executions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * <p>The ID of the resource group to which to assign the command executions. When you set this parameter, take note of the following items:</p>
         * <ul>
         * <li>The instances specified by InstanceId.N must belong to the specified resource group.</li>
         * <li>After the command is run, you can call the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation with ResourceGroupId set to query the execution results in the specified resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
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
         * <p>The tags of the instance. If you do not specify InstanceId.N, the command is run on the instances that have the specified tags.</p>
         */
        public Builder resourceTag(java.util.List < ResourceTag> resourceTag) {
            this.putQueryParameter("ResourceTag", resourceTag);
            this.resourceTag = resourceTag;
            return this;
        }

        /**
         * <p>The tags of the command.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies how to stop the command task when a command execution is manually stopped or times out. Valid values:</p>
         * <ul>
         * <li>Process: stops the process of the command.</li>
         * <li>ProcessTree: stops the process tree of the command. In this case, the process of the command and all subprocesses of the process are stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ProcessTree</p>
         */
        public Builder terminationMode(String terminationMode) {
            this.putQueryParameter("TerminationMode", terminationMode);
            this.terminationMode = terminationMode;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is no longer used and does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        /**
         * <p>The timeout period for the command execution. Unit: seconds.</p>
         * <ul>
         * <li>The timeout period cannot be less than 10 seconds.</li>
         * <li>A timeout error occurs if the command cannot be run because the process slows down or because a specific module or Cloud Assistant Agent does not exist. When the specified timeout period ends, the command process is forcefully terminated.</li>
         * <li>If you do not specify this parameter, the timeout period that is specified when the command is created is used.</li>
         * <li>This timeout period is applicable only to this execution. The timeout period of the command is not modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The username to use to run the command on the ECS instances. The username cannot exceed 255 characters in length.</p>
         * <ul>
         * <li>For Linux instances, the root username is used by default.</li>
         * <li>For Windows instances, the System username is used by default.</li>
         * </ul>
         * <p>You can also specify other usernames that already exist in the instances to run the command. For security purposes, we recommend that you run Cloud Assistant commands as a regular user. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Run Cloud Assistant commands as a regular user</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The name of the password to use to run the command on a Windows instance. The name cannot exceed 255 characters in length.</p>
         * <p>If you do not want to use the default System user to run the command on Windows instances, specify both WindowsPasswordName and <code>Username</code>. To mitigate the risk of password leaks, the password is stored in plaintext in CloudOps Orchestration Service (OOS) Parameter Store, and only the name of the password is passed in by using WindowsPasswordName. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Manage encryption parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Run Cloud Assistant commands as a regular user</a>.</p>
         * <blockquote>
         * <p> If you use the root username for Linux instances or the System username for Windows instances to run the command, you do not need to specify WindowsPasswordName.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>axtSecretPassword</p>
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

    /**
     * 
     * {@link InvokeCommandRequest} extends {@link TeaModel}
     *
     * <p>InvokeCommandRequest</p>
     */
    public static class ResourceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of tag N of the instance.</p>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>This parameter and InstanceId.N are mutually exclusive.</li>
             * <li>Valid values of N: 1 to 10. The tag key cannot be an empty string.</li>
             * <li>The number of instances that have the specified tags cannot exceed 100. If more than 100 instances have the specified tags, we recommend that you use batch tags such as batch: b1 to group the instances into batches of up to 100 instances.</li>
             * <li>The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the instance.</p>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>Valid values of N: 1 to 10.</li>
             * <li>The tag value can be an empty string.</li>
             * <li>The tag value can be up to 128 characters in length and cannot contain http:// or https://.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link InvokeCommandRequest} extends {@link TeaModel}
     *
     * <p>InvokeCommandRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of tag N to add to the command task. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
             * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the command task. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
