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
         * <p>The client token to ensure the idempotency of the request. Use your client to generate the token that is unique among requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see &quot;How to ensure idempotence&quot;.</p>
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
         * <p>The command content. Take note of the following:</p>
         * <ul>
         * <li>When <code>EnableParameter</code> is set to true, you can use custom parameters in the command.</li>
         * <li>Define custom parameters in the {{}} format. Within <code>{{}}</code>, the spaces and line feeds before and after the parameter names are ignored.</li>
         * <li>You can specify up to 20 custom parameters.</li>
         * <li>A custom parameter name can contain only letters, digits, underscores (_), and hyphens (-). The name is not case-sensitive.</li>
         * <li>Each custom parameter name is up to 64 bytes in length.</li>
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
         * <p>The ID of the command.</p>
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
         * <p>The encoding mode of the command content. Valid values:</p>
         * <ul>
         * <li>PlainText</li>
         * <li>Base64</li>
         * </ul>
         * <p>Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.</p>
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
         * <p>Specifies whether to use custom parameters in the command.</p>
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
         * <p>The schedule to run the command. Supported schedule types: at a fixed interval based on a rate expression, run only once at a specific time, or run at specific times based on a cron expression.</p>
         * <ul>
         * <li><p>To run the command at a fixed interval, use a rate expression to specify the interval. The interval can be in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Format: rate(&lt;Execution interval value&gt; &lt;Execution interval unit&gt;). For example, rate(5m) means to run the command every 5 minutes. When you specify an interval, take note of the following limits:</p>
         * <ul>
         * <li>The interval can be anywhere from 60 seconds to 7 days, but must be longer than the timeout period of the scheduled task.</li>
         * <li>The interval is the time between two consecutive executions, irrelevant of the time required to run the command. For example, assume that you set the interval to 5 minutes and that it takes 2 minutes to run the command each time. The system waits 3 minutes before running the command again.</li>
         * <li>The command is not immediately executed after the task is created. For example, assume that you set the interval to 5 minutes. The task begins to be executed 5 minutes after it is created.</li>
         * </ul>
         * </li>
         * <li><p>To run a command only once at a specific point in time, specify a point in time and a time zone. Format: at(yyyy-MM-dd HH:mm:ss &lt;Time zone&gt;). If you do not specify a time zone, the Coordinated Universal Time (UTC) time zone is used by default. The time zone name supports the following formats: Full name, such as Asia/Shanghai and America/Los_Angeles. The time offset from GMT. Examples: GMT+8:00 (UTC+8) and GMT-7:00 (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value. The time zone abbreviation. Only UTC is supported. For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to at(2022-06-06 13:15:30 Asia/Shanghai). To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to at(2022-06-06 13:15:30 GMT-7:00).</p>
         * </li>
         * <li><p>To run a command at designated points in time, use a cron expression to define the schedule. Format: &lt;Cron expression&gt; &lt;Time zone&gt;. Example: &lt;Seconds&gt; &lt;Minutes&gt; &lt;Hours&gt; &lt;Day of the month&gt; &lt;Month&gt; &lt;Day of the week&gt; &lt;Year (optional)&gt; &lt;Time zone&gt;. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zone of the instance is used by default. For more information, see Cron expressions. The time zone name supports the following formats:</p>
         * <ul>
         * <li>Full name, such as Asia/Shanghai and America/Los_Angeles.</li>
         * <li>The time offset from GMT. Examples: GMT+8:00 (UTC+8) and GMT-7:00 (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.</li>
         * <li>The time zone abbreviation. Only UTC is supported.</li>
         * </ul>
         * <p>For example, if you specify a command to run at 10:15:00 every day in 2022 in China/Shanghai time, set the time to 0 15 10 ? * * 2022 Asia/Shanghai. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to 0 0/30 10-11 * * ? 2022 GMT+8:00. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to 0 0/5 14 * 10 ? 2022/2 UTC.</p>
         * </li>
         * </ul>
         */
        public Builder frequency(String frequency) {
            this.putBodyParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The launcher for script execution. Cannot exceed 1 KB.</p>
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
         * <p>The node list.</p>
         */
        public Builder nodeIdList(java.util.List<String> nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * <p>The key-value pairs of custom parameters to pass in when the command includes custom parameters. For example, the command content is <code>echo {{name}}</code>. You can use <code>Parameters</code> to pass in the <code>{&quot;name&quot;:&quot;Jack&quot;}</code> key-value pair. The <code>name</code> key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the <code>echo Jack</code> command is run.</p>
         * <p>You can specify 0 to 10 custom parameters. Take note of the following:</p>
         * <ul>
         * <li>The key of a custom parameter can be up to 64 characters in length, and cannot be an empty string.</li>
         * <li>The value of a custom parameter can be an empty string.</li>
         * <li>If you want to retain a command, make sure that the command after Base64 encoding, including custom parameters and original command content, does not exceed 18 KB in size. If you do not want to retain the command, make sure that the command after Base64 encoding does not exceed 24 KB in size. You can set <code>KeepCommand</code> to specify whether to retain the command.</li>
         * <li>The specified custom parameter names must be included in the custom parameter names that you specify when you create the command. You can use empty strings to represent the parameters that are not passed in.</li>
         * </ul>
         * <p>This parameter is left empty by default, which indicates that the custom parameter feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAIdyvdIqaRY****&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The mode to run the command. Valid values:</p>
         * <ul>
         * <li>Once: runs the command immediately.</li>
         * <li>Period: runs the command based on a schedule. When set to <code>Period</code>, <code>Frequency</code> is required.</li>
         * <li>NextRebootOnly: runs the command the next time the instances is started.</li>
         * <li>EveryReboot: runs the command every time the instance is started.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>If you do not specify <code>Frequency</code>, the default value is <code>Once</code>.</li>
         * <li>If you specify <code>Frequency</code>, RepeatMode is set to <code>Period</code> regardless of whether a value is already specified.</li>
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
         * <p>Indicates how the command task is stopped when a command execution is manually stopped or times out. Valid values:</p>
         * <p>Process: The process of the command is stopped. ProcessTree: The process tree of the command is stopped. In this case, the process of the command and all subprocesses are stopped.</p>
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
         * <p>The timeout period for the command. Unit: seconds. A timeout error occurs if the command cannot be run because the process slows down or because a specific module or Cloud Assistant Agent does not exist. When the specified timeout period ends, the command process is forcefully terminated. Default value: 60.</p>
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
         * <p>The username that you use to run the command. The name can be up to 255 characters in length. For Linux instances, the root user is used by default.</p>
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
         * <p>The working path of the command. You can specify a custom path. Default path:</p>
         * <p>Linux instances: By default, the path is in the /home directory of the root user.</p>
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
