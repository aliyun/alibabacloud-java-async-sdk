// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link RunCommandRequest} extends {@link RequestModel}
 *
 * <p>RunCommandRequest</p>
 */
public class RunCommandRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    private String commandContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableParameter")
    private Boolean enableParameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private String frequency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Launcher")
    private String launcher;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIdList")
    private java.util.List<String> nodeIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RepeatMode")
    private String repeatMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminationMode")
    private String terminationMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

    private RunCommandRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.commandContent = builder.commandContent;
        this.commandId = builder.commandId;
        this.contentEncoding = builder.contentEncoding;
        this.description = builder.description;
        this.enableParameter = builder.enableParameter;
        this.frequency = builder.frequency;
        this.launcher = builder.launcher;
        this.name = builder.name;
        this.nodeIdList = builder.nodeIdList;
        this.parameters = builder.parameters;
        this.repeatMode = builder.repeatMode;
        this.terminationMode = builder.terminationMode;
        this.timeout = builder.timeout;
        this.username = builder.username;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
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
     * @return launcher
     */
    public String getLauncher() {
        return this.launcher;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeIdList
     */
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return terminationMode
     */
    public String getTerminationMode() {
        return this.terminationMode;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<RunCommandRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String commandContent; 
        private String commandId; 
        private String contentEncoding; 
        private String description; 
        private Boolean enableParameter; 
        private String frequency; 
        private String launcher; 
        private String name; 
        private java.util.List<String> nodeIdList; 
        private java.util.Map<String, ?> parameters; 
        private String repeatMode; 
        private String terminationMode; 
        private Integer timeout; 
        private String username; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(RunCommandRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.commandContent = request.commandContent;
            this.commandId = request.commandId;
            this.contentEncoding = request.contentEncoding;
            this.description = request.description;
            this.enableParameter = request.enableParameter;
            this.frequency = request.frequency;
            this.launcher = request.launcher;
            this.name = request.name;
            this.nodeIdList = request.nodeIdList;
            this.parameters = request.parameters;
            this.repeatMode = request.repeatMode;
            this.terminationMode = request.terminationMode;
            this.timeout = request.timeout;
            this.username = request.username;
            this.workingDir = request.workingDir;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The command content. Take note of the following items:</p>
         * <ul>
         * <li>Specify <code>EnableParameter=true</code> to enable the custom parameter feature in the command content.</li>
         * <li>Define custom parameters by enclosing them in <code>{{}}</code>. Spaces and line breaks before and after the parameter names within <code>{{}}</code> are ignored.</li>
         * <li>You can define up to 20 custom parameters.</li>
         * <li>Custom parameter names can contain only letters, digits, hyphens (-), and underscores (_). Parameter names are not case-sensitive.</li>
         * <li>A single custom parameter name cannot exceed 64 bytes in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyAxMjM=</p>
         */
        public Builder commandContent(String commandContent) {
            this.putBodyParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * <p>The command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-e996287206324975b5fbe1d***</p>
         */
        public Builder commandId(String commandId) {
            this.putBodyParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>The encoding format of the script content. Valid values:</p>
         * <ul>
         * <li>PlainText: The content is not encoded and is transmitted in plaintext.</li>
         * <li>Base64: The content is Base64-encoded.</li>
         * </ul>
         * <p>Default value: PlainText. If you specify an invalid value, the value is processed as PlainText.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putBodyParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>The command description.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the command contains custom parameters.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putBodyParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * <p>The scheduled execution time of the command. Three scheduled execution modes are supported: execution at fixed intervals (based on rate expressions), one-time execution at a specified time, and clock-based scheduled execution (based on cron expressions).</p>
         * <ul>
         * <li><p>Execution at fixed intervals: Executes the command at the specified interval based on a rate expression. The interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This mode is suitable for scenarios where tasks are executed at fixed intervals. The format is rate(<interval value><interval unit>). For example, to execute the command every 5 minutes, use rate(5m). Limits on execution at fixed intervals: </p>
         * <ul>
         * <li>The interval cannot exceed 7 days or be less than 60 seconds, and must be greater than the timeout period of the scheduled task. </li>
         * <li>The execution interval is based only on the fixed frequency and is independent of the actual time required to execute the task. For example, if you set the interval to 5 minutes and the task takes 2 minutes to complete, the next execution starts 3 minutes after the task is completed. </li>
         * <li>The task is not executed immediately upon creation. For example, if you set the interval to 5 minutes, the command is not executed immediately when the task is created. Instead, the first execution starts 5 minutes after the task is created.</li>
         * </ul>
         * </li>
         * <li><p>One-time execution at a specified time: Executes the command once at the specified time zone and time point. The format is at(yyyy-MM-dd HH:mm:ss <time zone>). If you do not specify a time zone, the UTC time zone is used by default. The time zone can be in one of the following formats: Full name of the time zone, such as Asia/Shanghai and America/Los_Angeles. Offset from Greenwich Mean Time (GMT), such as GMT+8:00 and GMT-7:00. When you use the GMT format, leading zeros are not supported for the hour. Time zone abbreviation: Only UTC is supported.
         * For example, to execute the command once at 13:15:30 on June 6, 2022 in the Asia/Shanghai time zone, use at(2022-06-06 13:15:30 Asia/Shanghai). To execute the command once at 13:15:30 on June 6, 2022 in the GMT-7:00 time zone, use at(2022-06-06 13:15:30 GMT-7:00).</p>
         * </li>
         * <li><p>Clock-based scheduled execution (based on cron expressions): Executes the command based on a cron expression. The format is <seconds> <minutes> <hours> <day of month> <month> <day of week> &lt;year (optional)&gt; <time zone>, which is <cron expression> <time zone>. The execution time is calculated based on the cron expression in the specified time zone. If you do not specify a time zone, the system time zone of the instance is used by default. For more information about cron expressions, see Cron expressions. The time zone can be in one of the following formats: </p>
         * <ul>
         * <li>Full name of the time zone, such as Asia/Shanghai and America/Los_Angeles. </li>
         * <li>Offset from GMT, such as GMT+8:00 and GMT-7:00. When you use the GMT format, leading zeros are not supported for the hour. </li>
         * <li>Time zone abbreviation: Only UTC is supported.</li>
         * </ul>
         * <p>  For example, to execute the command once at 10:15 every day in 2022 in the Asia/Shanghai time zone, use 0 15 10 ? * * 2022 Asia/Shanghai. To execute the command every 30 minutes from 10:00 to 11:30 every day in 2022 in the GMT+8:00 time zone, use 0 0/30 10-11 * * ? 2022 GMT+8:00. To execute the command every 5 minutes from 14:00 to 14:55 every day in October every two years starting from 2022 in the UTC time zone, use 0 0/5 14 * 10 ? 2022/2 UTC.</p>
         * </li>
         * </ul>
         */
        public Builder frequency(String frequency) {
            this.putBodyParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The launcher for script execution. The size cannot exceed 1 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
         */
        public Builder launcher(String launcher) {
            this.putBodyParameter("Launcher", launcher);
            this.launcher = launcher;
            return this;
        }

        /**
         * <p>The command name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of nodes. The node IDs must belong to created Lingjun nodes. You can call the ListClusterNodes or ListFreeNodes operation to query the node IDs.</p>
         */
        public Builder nodeIdList(java.util.List<String> nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * <p>The key-value pairs of the custom parameters that are passed when the command is executed, if the command contains custom parameters. For example, if the command content is <code>echo {{name}}</code>, you can pass the key-value pair <code>{&quot;name&quot;:&quot;Jack&quot;}</code> by using the <code>Parameter</code> parameter. The custom parameter automatically replaces the variable <code>name</code>, generating a new command <code>echo Jack</code> to be executed.</p>
         * <p>The number of custom parameters ranges from 0 to 10. Take note of the following items:</p>
         * <ul>
         * <li>The key cannot be an empty string and can contain up to 64 characters.</li>
         * <li>The value can be an empty string.</li>
         * <li>After the custom parameters and the original command content are Base64-encoded, if the command is saved, the size of the Base64-encoded command content cannot exceed 18 KB. If the command is not saved, the size cannot exceed 24 KB. You can use <code>KeepCommand</code> to specify whether to retain the command.</li>
         * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed, you can use empty strings.</li>
         * </ul>
         * <p>Default value: empty, which indicates that this parameter is not specified and the custom parameter feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI***********&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The execution mode of the command. Valid values:</p>
         * <ul>
         * <li>Once: Executes the command immediately.</li>
         * <li>Period: Executes the command on a schedule. If you set this parameter to <code>Period</code>, you must also specify the <code>Frequency</code> parameter.</li>
         * <li>NextRebootOnly: Automatically executes the command the next time the instance starts.</li>
         * <li>EveryReboot: Automatically executes the command every time the instance starts.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>If you do not specify the <code>Frequency</code> parameter, the default value is <code>Once</code>.</li>
         * <li>If you specify the <code>Frequency</code> parameter, the value is processed as <code>Period</code> regardless of whether this parameter is specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        public Builder repeatMode(String repeatMode) {
            this.putBodyParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * <p>The mode used when the task is stopped manually or interrupted due to execution timeout. Valid values:</p>
         * <p>Process: Stops the current script process.
         * ProcessTree: Stops the current process tree, which includes the script process and all its child processes.</p>
         * 
         * <strong>example:</strong>
         * <p>ProcessTree</p>
         */
        public Builder terminationMode(String terminationMode) {
            this.putBodyParameter("TerminationMode", terminationMode);
            this.terminationMode = terminationMode;
            return this;
        }

        /**
         * <p>The timeout period for executing the command, in seconds. A timeout occurs when the command cannot be executed due to process issues, missing modules, or a missing Cloud Assistant Agent. After a timeout, the command process is forcibly terminated. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The name of the user that is used to execute the command on the instance. The name cannot exceed 255 characters in length.
         * For Linux instances, the command is executed by the root user by default.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The custom execution path of the command. Default paths:</p>
         * <p>Linux instances: The default execution path is the /home directory of the root user.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/user</p>
         */
        public Builder workingDir(String workingDir) {
            this.putBodyParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        @Override
        public RunCommandRequest build() {
            return new RunCommandRequest(this);
        } 

    } 

}
