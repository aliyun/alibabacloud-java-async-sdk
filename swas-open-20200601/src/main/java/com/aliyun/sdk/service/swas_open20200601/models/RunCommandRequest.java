// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableParameter")
    private Boolean enableParameter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkingUser")
    private String workingUser;

    private RunCommandRequest(Builder builder) {
        super(builder);
        this.commandContent = builder.commandContent;
        this.enableParameter = builder.enableParameter;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.timeout = builder.timeout;
        this.type = builder.type;
        this.windowsPasswordName = builder.windowsPasswordName;
        this.workingDir = builder.workingDir;
        this.workingUser = builder.workingUser;
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
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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

    /**
     * @return workingUser
     */
    public String getWorkingUser() {
        return this.workingUser;
    }

    public static final class Builder extends Request.Builder<RunCommandRequest, Builder> {
        private String commandContent; 
        private Boolean enableParameter; 
        private String instanceId; 
        private String name; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private Integer timeout; 
        private String type; 
        private String windowsPasswordName; 
        private String workingDir; 
        private String workingUser; 

        private Builder() {
            super();
        } 

        private Builder(RunCommandRequest request) {
            super(request);
            this.commandContent = request.commandContent;
            this.enableParameter = request.enableParameter;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.timeout = request.timeout;
            this.type = request.type;
            this.windowsPasswordName = request.windowsPasswordName;
            this.workingDir = request.workingDir;
            this.workingUser = request.workingUser;
        } 

        /**
         * <p>The content of the command. Take note of the following items:</p>
         * <ul>
         * <li>If you set <code>EnableParameter</code> to true, the custom parameter feature is enabled in the command content and you can configure custom parameters based on the following rules:</li>
         * <li>Define custom parameters in the {{}} format. Within <code>{{}}</code>, the spaces and line feeds before and after the parameter names are ignored.</li>
         * <li>The number of custom parameters cannot be greater than 20.</li>
         * <li>A custom parameter name can contain only letters, digits, underscores (_), and hyphens (-). The name is case-insensitive.</li>
         * <li>Each custom parameter name cannot exceed 64 bytes in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ifconfig -s</p>
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * <p>Specifies whether to enable the custom parameter feature.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putQueryParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * <p>The ID of the simple application server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ace0706b2ac4454d984295a94213****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the command.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The custom parameters in the key-value pair format that are to be passed in when the command includes custom parameters. For example, if the command content is <code>echo {{name}}</code>, you can use <code>Parameters</code> to pass in the <code>{&quot;name&quot;:&quot;Jack&quot;}</code> key-value pair. The <code>name</code> key of the custom parameter is automatically replaced with the paired Jack value to generate a new command. As a result, the <code>echo Jack</code> command is executed.</p>
         * <p>Number of custom parameters ranges from 0 to 20. Take note of the following items:</p>
         * <ul>
         * <li>The key cannot be an empty string. It can be up to 64 characters in length.</li>
         * <li>The value can be an empty string.</li>
         * <li>After custom parameters and original command content are encoded in Base64, the command cannot exceed 16 KB in size.</li>
         * <li>The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</li>
         * </ul>
         * <p>This parameter is empty by default, which indicates to disable the custom parameter feature.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAIdyvdIqaRY****&quot;}</p>
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
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
         * <p>The timeout period of the command on the server.</p>
         * <p>If a command execution task times out, Command Assistant forcibly terminates the task process. Valid values: 10 to 86400. Unit: seconds. The period of 86400 seconds is equal to 24 hours.</p>
         * <p>Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The language type of the command. Valid values:</p>
         * <ul>
         * <li>RunBatScript: batch commands (applicable to Windows servers).</li>
         * <li>RunPowerShellScript: PowerShell commands (applicable to Windows servers).</li>
         * <li>RunShellScript: shell commands (applicable to Linux servers).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The name of the password to be used to run the command on a Windows server.</p>
         * <p>If you want to use a username other than the default &quot;system&quot; username to run the command on a Windows server, you must specify both the WindowsPasswordName and WorkingUser parameters. To mitigate the risk of password leaks, the password is stored in plaintext in Operation Orchestration Service (OOS) Parameter Store, and only the name of the password is passed in by using WindowsPasswordName.</p>
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
         * <p>The execution path of the command. Custom paths are supported. Default execution paths vary based on the operating systems of the servers.</p>
         * <ul>
         * <li>For Linux servers, the default path is /root of the root user.</li>
         * <li>For Windows servers, the default path is C:\Windows\system32.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/home/</p>
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        /**
         * <p>A user of the server who runs the command. We recommend that you run the command as a regular user to reduce security risks. Default values:</p>
         * <ul>
         * <li>For Linux servers, the default value is root.</li>
         * <li>For Windows servers, the default value is system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder workingUser(String workingUser) {
            this.putQueryParameter("WorkingUser", workingUser);
            this.workingUser = workingUser;
            return this;
        }

        @Override
        public RunCommandRequest build() {
            return new RunCommandRequest(this);
        } 

    } 

}
