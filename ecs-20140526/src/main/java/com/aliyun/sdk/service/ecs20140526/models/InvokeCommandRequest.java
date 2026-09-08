// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    private java.util.List<String> instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Launcher")
    private String launcher;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssOutputDelivery")
    private String ossOutputDelivery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

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
    private java.util.List<ResourceTag> resourceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

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
        this.ossOutputDelivery = builder.ossOutputDelivery;
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
        this.workingDir = builder.workingDir;
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
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return launcher
     */
    public String getLauncher() {
        return this.launcher;
    }

    /**
     * @return ossOutputDelivery
     */
    public String getOssOutputDelivery() {
        return this.ossOutputDelivery;
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
    public java.util.Map<String, ?> getParameters() {
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
    public java.util.List<ResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
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

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<InvokeCommandRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String commandId; 
        private String containerId; 
        private String containerName; 
        private String frequency; 
        private java.util.List<String> instanceId; 
        private String launcher; 
        private String ossOutputDelivery; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.Map<String, ?> parameters; 
        private String regionId; 
        private String repeatMode; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<ResourceTag> resourceTag; 
        private java.util.List<Tag> tag; 
        private String terminationMode; 
        private Boolean timed; 
        private Long timeout; 
        private String username; 
        private String windowsPasswordName; 
        private String workingDir; 

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
            this.ossOutputDelivery = request.ossOutputDelivery;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The command ID. You can call <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> to query all available command IDs. </p>
         * <blockquote>
         * <p>You can run public commands by specifying the command name. For more information, see <a href="https://help.aliyun.com/document_detail/429635.html">View and run Cloud Assistant public commands</a>.</p>
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
         * <p>The container ID. Only 64-bit hexadecimal strings are supported. You can use the <code>docker://</code>, <code>containerd://</code>, or <code>cri-o://</code> prefix to specify the container runtime.</p>
         * <p>Precautions:</p>
         * <ul>
         * <li><p>If you specify this parameter, Cloud Assistant executes the script in the specified container of the instance.</p>
         * </li>
         * <li><p>If you specify this parameter, the command can only run on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</p>
         * <ul>
         * <li>To view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
         * <li>To upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
         * </ul>
         * </li>
         * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be executed by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * <li><p>If you specify this parameter, only Shell scripts can be executed in Linux containers. You cannot use a format such as <code>#!/usr/bin/python</code> at the beginning of the script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
         * <p>The container name.</p>
         * <p>Precautions:</p>
         * <ul>
         * <li><p>If you specify this parameter, Cloud Assistant executes the script in the specified container of the instance.</p>
         * </li>
         * <li><p>If you specify this parameter, the command can only run on Linux instances with Cloud Assistant Agent version 2.2.3.344 or later.</p>
         * <ul>
         * <li>To view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
         * <li>To upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
         * </ul>
         * </li>
         * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be executed by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * <li><p>If you specify this parameter, only Shell scripts can be executed in Linux containers. You cannot use a format such as <code>#!/usr/bin/python</code> at the beginning of the script to specify an interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
         * <p>The schedule on which the command is executed. Three types of scheduled execution are supported: fixed interval (based on a Rate expression), one-time execution at a specified time, and clock-based scheduling (based on a Cron expression).</p>
         * <ul>
         * <li><p>Fixed interval execution: Based on a Rate expression, the command is executed at a set interval. The interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This is suitable for scenarios that require execution at fixed intervals. Format: <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to execute every 5 minutes, use <code>rate(5m)</code>. Fixed interval execution has the following limits:</p>
         * <ul>
         * <li>The interval must not exceed 7 days or be less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
         * <li>The execution interval is based on a fixed frequency and is unrelated to the actual execution time of the task. For example, if the command is set to execute every 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task completes.</li>
         * <li>The task is not executed immediately upon creation. For example, if the command is set to execute every 5 minutes, the first execution starts 5 minutes after the task is created.</li>
         * </ul>
         * </li>
         * <li><p>One-time execution at a specified time: The command is executed once at the specified time zone and time. Format: <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>. If no time zone is specified, UTC is used by default. The time zone supports the following three formats:</p>
         * <ul>
         * <li>Full time zone name: For example, <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
         * <li>Time zone offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using GMT format, leading zeros are not supported in the hour field.</li>
         * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
         * </ul>
         * <p>For example, to execute once at 13:15:30 on June 6, 2022 in China/Shanghai time, use: <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To execute once at 13:15:30 on June 6, 2022 in the West 7th time zone, use: <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
         * </li>
         * <li><p>Clock-based scheduling (based on a Cron expression): Based on a Cron expression, the command is executed according to the scheduled task settings. Format: <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, that is, <code>&lt;Cron expression&gt; &lt;time zone&gt;</code>. The scheduled task execution time is calculated based on the Cron expression in the specified time zone. If no time zone is specified, the system time zone of the instance running the scheduled task is used. For more information about Cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
         * <ul>
         * <li>Full time zone name: For example, <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
         * <li>Time zone offset from Greenwich Mean Time: For example, <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using GMT format, leading zeros are not supported in the hour field.</li>
         * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.
         * For example, to execute once at 10:15 every day in 2022 in China/Shanghai time, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To execute every 30 minutes from 10:00 to 11:30 every day in 2022 in the East 8th time zone, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To execute every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in UTC, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
         * </ul>
         * <blockquote>
         * <p>The minimum interval must be greater than or equal to the timeout period of the scheduled task and no less than 10 seconds.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The list of instances on which to execute the command. You can specify up to 100 instance IDs. Valid values of N: 1 to 100.</p>
         * <p>You can also apply for a quota increase in Quota Center (quota name: Maximum number of instances supported for command execution).</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp185dy2o3o6n****</p>
         */
        public Builder instanceId(java.util.List<String> instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The bootstrap program for script execution. The length cannot exceed 1 KB.</p>
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
         * <p>The OSS delivery configuration for command execution output.</p>
         * <ul>
         * <li>Format: oss://${BucketName}/${Prefix}, where ${BucketName} is the name of the OSS bucket to deliver to, and ${Prefix} is the directory prefix to deliver to.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://testBucket/testPrefix</p>
         */
        public Builder ossOutputDelivery(String ossOutputDelivery) {
            this.putQueryParameter("OssOutputDelivery", ossOutputDelivery);
            this.ossOutputDelivery = ossOutputDelivery;
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
         * <p>The key-value pairs of custom parameters to pass in when executing the command with the custom parameter feature enabled. The number of custom parameters ranges from 0 to 10.</p>
         * <ul>
         * <li>Map keys cannot be empty strings and can contain up to 64 characters.</li>
         * <li>Map values can be empty strings.</li>
         * <li>After Base64 encoding, the total length of custom parameters and the original command content cannot exceed 24 KB.</li>
         * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed in, you can use an empty string as a substitute.</li>
         * </ul>
         * <p>You can disable custom parameters by not setting this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI************&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The execution mode of the command. Valid values:</p>
         * <ul>
         * <li>Once: immediately executes the command.</li>
         * <li>Period: executes the command on a schedule. If you set this parameter to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
         * <li>NextRebootOnly: automatically executes the command the next time the instance starts.</li>
         * <li>EveryReboot: automatically executes the command every time the instance starts.</li>
         * <li>DryRun: only performs a dry run of the request. The command is not actually executed. The dry run checks request parameters, the instance execution environment, and the Cloud Assistant Agent running status.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>If you do not specify the <code>Frequency</code> parameter, the default value is <code>Once</code>.</li>
         * <li>If you specify the <code>Frequency</code> parameter, the command is executed as <code>Period</code> regardless of whether this parameter is set.</li>
         * </ul>
         * <p>Precautions:</p>
         * <ul>
         * <li>You can call <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> to stop a pending or scheduled command.</li>
         * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> and specify <code>IncludeHistory=true</code> to view the execution history of the scheduled command.</li>
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
         * <p>The ID of the resource group for the command execution. When you specify this parameter:</p>
         * <ul>
         * <li><p>The ECS instance specified by InstanceId must belong to this resource group if the instance is not in the default resource group.</p>
         * </li>
         * <li><p>You can filter command execution results by specifying this parameter (by calling <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a>).</p>
         * </li>
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
         * <p>The tags used to filter instances. You can run commands in batches on instances with the same tag without specifying InstanceId.</p>
         */
        public Builder resourceTag(java.util.List<ResourceTag> resourceTag) {
            this.putQueryParameter("ResourceTag", resourceTag);
            this.resourceTag = resourceTag;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The mode for stopping the task (manual stop or timeout interruption). Valid values:</p>
         * <ul>
         * <li>Process: stops the current script process.</li>
         * <li>ProcessTree: stops the current process tree (the collection of the script process and all child processes it created).</li>
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
         * <p>This parameter is deprecated and has no effect if specified.</p>
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
         * <li><p>The value cannot be less than 10 seconds.</p>
         * </li>
         * <li><p>If the command cannot run due to process issues, missing modules, or missing Cloud Assistant Agent, a timeout occurs. When a timeout occurs, the command process is forcefully terminated.</p>
         * </li>
         * <li><p>If this value is not set, the timeout period specified when the command was created is used.</p>
         * </li>
         * <li><p>This value only applies as the timeout period for this command execution and does not change the timeout period of the command itself.</p>
         * </li>
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
         * <p>The username used to execute the command on the ECS instance. The length cannot exceed 255 characters.</p>
         * <ul>
         * <li>For Linux instances, the command is executed as the root user by default.</li>
         * <li>For Windows instances, the command is executed as the System user by default.</li>
         * </ul>
         * <p>You can also specify another existing user on the instance to execute the command. Executing Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to run Cloud Assistant commands</a>.</p>
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
         * <p>The name of the password for the user who executes the command on a Windows instance. The length cannot exceed 255 characters.</p>
         * <p>When you want to execute a command as a non-default user (System) on a Windows instance, you must specify both <code>Username</code> and this parameter. To reduce the risk of password leaks, the plaintext password must be stored in the parameter repository of CloudOps Orchestration Service. Only the password name is passed in here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encryption parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Settings for a regular user to run Cloud Assistant commands</a>.</p>
         * <blockquote>
         * <p>This parameter is not required when you execute a command as the root user on a Linux instance or the System user on a Windows instance.</p>
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

        /**
         * <p>The directory in which the command is executed on the ECS instance. The length cannot exceed 200 characters.</p>
         * <ul>
         * <li>If this value is not set, the working directory specified when the command was created is used.</li>
         * <li>This value only applies as the working directory for this command execution and does not change the working directory of the command itself.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/home/user</p>
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
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

            private Builder() {
            } 

            private Builder(ResourceTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key used to filter instances.</p>
             * <p>Precautions:</p>
             * <ul>
             * <li><p>This parameter conflicts with the InstanceId parameter. You cannot specify both parameters at the same time.</p>
             * </li>
             * <li><p>Valid values of N: 1 to 10. The tag key cannot be an empty string once specified.</p>
             * </li>
             * <li><p>The number of instances with the tag cannot exceed the limit of InstanceId.N. If the number of instances exceeds the limit, control the number of instances by adding batch tags, such as batch: b1.</p>
             * </li>
             * <li><p>The tag key can be up to 64 characters in length and cannot start with aliyun or acs:, or contain http:// or https://.</p>
             * </li>
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
             * <p>The tag value used to filter instances.</p>
             * <p>Precautions:</p>
             * <ul>
             * <li>Valid values of N: 1 to 10.</li>
             * <li>The value can be an empty string.</li>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the command execution. Valid values of N: 1 to 20. The tag key cannot be an empty string once specified.</p>
             * <p>If you use a single tag to filter resources, the resource count with this tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count with all specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, execute the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the command execution. Valid values of N: 1 to 20. The value can be an empty string.</p>
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
