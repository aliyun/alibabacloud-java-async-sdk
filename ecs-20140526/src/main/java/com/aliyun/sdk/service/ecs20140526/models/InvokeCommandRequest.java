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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
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
         * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs. </p>
         * <blockquote>
         * <p>For public commands, you can run them by command name. For more information, see <a href="https://help.aliyun.com/document_detail/429635.html">View and run Cloud Assistant public commands</a>.</p>
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
         * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container on the instance.</p>
         * </li>
         * <li><p>If you specify this parameter, the command can only be run on Linux instances where the Cloud Assistant Agent version is 2.2.3.344 or later.</p>
         * <ul>
         * <li>For more information about how to view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install the Cloud Assistant Agent</a>.</li>
         * <li>For more information about how to upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable the upgrade of the Cloud Assistant Agent</a>.</li>
         * </ul>
         * </li>
         * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be run by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * <li><p>If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify an interpreter for the script content by using a command such as <code>#!/usr/bin/python</code> at the beginning of the script. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
         * <li><p>If you specify this parameter, Cloud Assistant runs the script in the specified container on the instance.</p>
         * </li>
         * <li><p>If you specify this parameter, the command can only be run on Linux instances where the Cloud Assistant Agent version is 2.2.3.344 or later.</p>
         * <ul>
         * <li>For more information about how to view the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/64921.html">Install the Cloud Assistant Agent</a>.</li>
         * <li>For more information about how to upgrade the Cloud Assistant Agent version, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable the upgrade of the Cloud Assistant Agent</a>.</li>
         * </ul>
         * </li>
         * <li><p>If you specify this parameter, the <code>Username</code> parameter specified in this operation and the <code>WorkingDir</code> parameter specified in <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> do not take effect. The command can only be run by the default user of the container in the default working directory of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * <li><p>If you specify this parameter, only shell scripts can be run in Linux containers. You cannot specify an interpreter for the script content by using a command such as <code>#!/usr/bin/python</code> at the beginning of the script. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
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
         * <p>The execution time of the scheduled command. Three scheduled execution modes are supported: execution at fixed intervals (based on rate expressions), one-time execution at a specified time, and clock-based scheduled execution (based on cron expressions).</p>
         * <ul>
         * <li><p>Execution at fixed intervals: runs the command at a specified interval based on a rate expression. The interval can be set in seconds (s), minutes (m), hours (h), or days (d). This mode is suitable for scenarios where tasks are run at fixed intervals. The format is <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to run the command every 5 minutes, use <code>rate(5m)</code>. The following limits apply to execution at fixed intervals:</p>
         * <ul>
         * <li>The specified interval must not exceed 7 days or be less than 60 seconds, and must be greater than the timeout period of the scheduled task.</li>
         * <li>The execution interval is based only on the fixed frequency and is independent of the actual time required to run the task. For example, if you set the command to run every 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task is completed.</li>
         * <li>The task is not run immediately upon creation. For example, if you set the command to run every 5 minutes, the command is not run immediately upon task creation, but starts 5 minutes after the task is created.</li>
         * </ul>
         * </li>
         * <li><p>One-time execution at a specified time: runs the command once at the specified time zone and time point. The format is <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>. If you do not specify a time zone, the UTC time zone is used by default. The time zone supports the following three formats:</p>
         * <ul>
         * <li>Time zone full name: for example, <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
         * <li>Time zone offset from Greenwich Mean Time: for example, <code>GMT+8:00</code> (East 8th zone) and <code>GMT-7:00</code> (West 7th zone). When you use the GMT format, leading zeros are not supported for the hour.</li>
         * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.</li>
         * </ul>
         * <p>For example, to run the command once at 13:15:30 on June 6, 2022 in the China/Shanghai time zone, use <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To run the command once at 13:15:30 on June 6, 2022 in the West 7th zone, use <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
         * </li>
         * <li><p>Clock-based scheduled execution (based on cron expressions): runs the command based on a cron expression. The format is <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, which is <code>&lt;cron expression&gt; &lt;time zone&gt;</code>. The scheduled task execution time is calculated and executed based on the cron expression in the specified time zone. If you do not specify a time zone, the internal system time zone of the instance that runs the scheduled task is used by default. For more information about cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
         * <ul>
         * <li>Time zone full name: for example, <code>Asia/Shanghai</code> (China/Shanghai time) and <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
         * <li>Time zone offset from Greenwich Mean Time: for example, <code>GMT+8:00</code> (East 8th zone) and <code>GMT-7:00</code> (West 7th zone). When you use the GMT format, leading zeros are not supported for the hour.</li>
         * <li>Time zone abbreviation: only UTC (Coordinated Universal Time) is supported.
         * For example, to run the command once at 10:15 every day in 2022 in the China/Shanghai time zone, use <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To run the command every half hour from 10:00 to 11:30 every day in 2022 in the East 8th zone, use <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To run the command every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in the UTC time zone, use <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
         * </ul>
         * <blockquote>
         * <p>The minimum specified time interval must be greater than or equal to the timeout period of the scheduled task and not less than 10 seconds.</p>
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
         * <p>The list of instance IDs on which the command is run. You can specify up to 100 instance IDs. Valid values of N: 1 to 100.</p>
         * <p>You can also apply for a quota increase in Quota Center. The quota name is the maximum number of instances supported for command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-bp185dy2o3o6n****&quot;]</p>
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
         * <p>The OSS data shipping configuration for the command execution output.</p>
         * <ul>
         * <li>Format: <code>oss://${BucketName}/${Prefix}</code>. <code>${BucketName}</code> is the name of the OSS bucket to which the data is shipped, and <code>${Prefix}</code> is the directory prefix to which the data is shipped.</li>
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
         * <p>The key-value pairs of custom parameters passed when the command is run if the custom parameter feature is enabled. The number of custom parameters ranges from 0 to 10.</p>
         * <ul>
         * <li>The key in the map cannot be an empty string and can be up to 64 characters in length.</li>
         * <li>The value in the map can be an empty string.</li>
         * <li>The total length of the custom parameters and the original command content cannot exceed 24 KB after Base64 encoding.</li>
         * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed, you can use an empty string instead.</li>
         * </ul>
         * <p>You can leave this parameter unspecified to disable custom parameters.</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <li>Once: runs the command immediately.</li>
         * <li>Period: runs the command on a schedule. If you set this parameter to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
         * <li>NextRebootOnly: automatically runs the command the next time the instance starts.</li>
         * <li>EveryReboot: automatically runs the command every time the instance starts.</li>
         * <li>DryRun: only prechecks the request. The command is not actually run. The check items include the request parameters, instance execution environment, and Cloud Assistant Agent running status.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>If you do not specify the <code>Frequency</code> parameter, the default value is <code>Once</code>.</li>
         * <li>If you specify the <code>Frequency</code> parameter, the value is processed as <code>Period</code> regardless of whether this parameter is set.</li>
         * </ul>
         * <p>Precautions:</p>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/64838.html">StopInvocation</a> operation to stop a pending or scheduled command.</li>
         * <li>If you set this parameter to <code>Period</code> or <code>EveryReboot</code>, you can call the <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation and set <code>IncludeHistory</code> to <code>true</code> to view the historical records of the scheduled command execution.</li>
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
         * <p>The ID of the resource group in which the command is run. When you specify this parameter:</p>
         * <ul>
         * <li><p>If the ECS instance specified by InstanceId belongs to a non-default resource group, the ECS instance must belong to this resource group.</p>
         * </li>
         * <li><p>You can specify this parameter to filter the corresponding command execution results by calling the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/64845.html">DescribeInvocationResults</a> operation.</p>
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
         * <p>The list of tags used to filter instances. You can run the command on instances with the same tag in batches without specifying InstanceId.</p>
         */
        public Builder resourceTag(java.util.List<ResourceTag> resourceTag) {
            this.putQueryParameter("ResourceTag", resourceTag);
            this.resourceTag = resourceTag;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The mode used when the task is stopped (manually stopped or interrupted due to execution timeout). Valid values:</p>
         * <ul>
         * <li>Process: stops the current script process.</li>
         * <li>ProcessTree: stops the current process tree, which includes the script process and all its child processes.</li>
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
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not take effect even if it is specified.</p>
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
         * <p>The timeout period for running the command. Unit: seconds.</p>
         * <ul>
         * <li><p>The value cannot be less than 10.</p>
         * </li>
         * <li><p>A timeout occurs when the command cannot be run due to process issues, missing modules, or a missing Cloud Assistant Agent. After a timeout, the command process is forcibly terminated.</p>
         * </li>
         * <li><p>If you do not specify this parameter, the timeout period specified when the command was created is used.</p>
         * </li>
         * <li><p>This value applies only to the current command execution and does not change the timeout period of the command itself.</p>
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
         * <p>The name of the user that runs the command on the ECS instance. The name can be up to 255 characters in length.</p>
         * <ul>
         * <li>For ECS instances that run Linux, the command is run by the root user by default.</li>
         * <li>For ECS instances that run Windows, the command is run by the System user by default.</li>
         * </ul>
         * <p>You can also specify another existing user on the instance to run the command. Running Cloud Assistant commands as a regular user is more secure. For more information, see <a href="https://help.aliyun.com/document_detail/203771.html">Configure a regular user to run Cloud Assistant commands</a>.</p>
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
         * <p>The name of the password for the user that executes the command on a Windows instance. The name can be up to 255 characters in length.</p>
         * <p>If you want to execute the command on a Windows instance as a non-default user (other than System), you must specify both <code>Username</code> and this parameter. To reduce the risk of password leakage, the plaintext password must be hosted in the parameter repository of System Operations Management. Here, you only pass the name of the password. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encrypt parameters</a> and <a href="https://help.aliyun.com/document_detail/203771.html">Settings for regular users to execute Cloud Assistant commands</a>.</p>
         * <blockquote>
         * <p>You do not need to pass this parameter when you run the command as the root user on a Linux instance or the System user on a Windows instance.</p>
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
         * <p>The directory in which the command is run on the ECS instance. The length cannot exceed 200 characters.</p>
         * <ul>
         * <li>If you do not specify this parameter, the running directory specified when the command was created is used.</li>
         * <li>This value applies only to the current command execution and does not change the running directory of the command itself.</li>
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
             * <li><p>This parameter conflicts with the InstanceId parameter and cannot be specified at the same time.</p>
             * </li>
             * <li><p>Valid values of N: 1 to 10. The value cannot be an empty string.</p>
             * </li>
             * <li><p>The number of instances under the tag cannot exceed the limit of InstanceId.N. If the number of instances exceeds the limit, control the number of instances by adding batch tags, such as batch: b1.</p>
             * </li>
             * <li><p>The value can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
             * <li>The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</li>
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
             * <p>The tag key for the command to execute. Valid values of N: 1 to 20. The value cannot be an empty string.</p>
             * <p>If you use a single tag to filter resources, the resource count under the tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources attached to all the specified tags cannot exceed 1,000. If the resource count exceeds 1,000, you must use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
             * <p>The value can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
             * <p>The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
