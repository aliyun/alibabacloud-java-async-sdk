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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Timed")
    private Boolean timed;

    @Query
    @NameInMap("Frequency")
    private String frequency;

    @Query
    @NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("CommandId")
    @Validation(required = true)
    private String commandId;

    @Query
    @NameInMap("RepeatMode")
    private String repeatMode;

    @Query
    @NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    private InvokeCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.timed = builder.timed;
        this.frequency = builder.frequency;
        this.parameters = builder.parameters;
        this.username = builder.username;
        this.instanceId = builder.instanceId;
        this.commandId = builder.commandId;
        this.repeatMode = builder.repeatMode;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timed
     */
    public Boolean getTimed() {
        return this.timed;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return windowsPasswordName
     */
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public static final class Builder extends Request.Builder<InvokeCommandRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private Boolean timed; 
        private String frequency; 
        private java.util.Map < String, ? > parameters; 
        private String username; 
        private java.util.List < String > instanceId; 
        private String commandId; 
        private String repeatMode; 
        private String windowsPasswordName; 

        private Builder() {
            super();
        } 

        private Builder(InvokeCommandRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.timed = request.timed;
            this.frequency = request.frequency;
            this.parameters = request.parameters;
            this.username = request.username;
            this.instanceId = request.instanceId;
            this.commandId = request.commandId;
            this.repeatMode = request.repeatMode;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Indicates whether the command is executed periodically.
         * <p>
         * 
         * Default value: false.
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        /**
         * The execution cycle of a periodic command. The interval between two periodic commands cannot be less than 10 seconds. When the value of "Timed" is "true", "ence" is required.
         * <p>
         * 
         * The value of this parameter follows the Cron expression. For more information, see [set scheduled execution commands](~~ 64769 ~~).
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The key-value pair of the custom parameter that is passed in when the custom parameter function is enabled. The number of custom parameters ranges from 0 to 10.
         * <p>
         * 
         * The key of-Map cannot be an empty string. It can be up to 64 characters in length.
         * The value of-Map can be an empty string.
         * -After the custom parameters and the original command content are encoded in Base64, the total length cannot exceed 16kB.
         * -The set of custom parameter names must be a subset of the parameter set defined when the command is created. For parameters that are not specified, you can use an empty string instead.
         * 
         * You can disable custom parameters by canceling this parameter.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The name of the user who runs the command on the ECS instance.
         * <p>
         * 
         * -Linux ECS instances run commands as root users by default.
         * -Windows the ECS instance of the System. By default, the System user runs the command.
         * 
         * You can also specify other users that already exist in the instance to run commands. It is more secure for ordinary users to run cloud assistant commands. For more information, see [set common users to run cloud assistant commands](~~ 203771 ~~).
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The list of instances to run the command. You can specify a maximum of 50 instance IDs. Valid values of N: 1 to 50.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the command. You can call the [DescribeCommands](~~ 64843 ~~) operation to query all available CommandId.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * Set the command execution method. Valid values:
         * <p>
         * 
         * -Once: run the command immediately.
         * -Period: run the command regularly. When this parameter is set to **, you must specify both the "** = true" parameter and the "ence" parameter.
         * -NextRebootOnly: When the instance starts next time, the command is automatically executed.
         * -EveryReboot: The command is automatically executed each time the instance is started.
         * 
         * Default value:
         * 
         * -If you do not specify the value of the "1" = true" parameter and the "ence" parameter, the default value is "Once ".
         * -If you specify the "1" = true" parameter value and the "ence" parameter, the parameter is processed as "1" regardless of whether the parameter value has been set.
         * 
         * Note:
         * 
         * -When this parameter is set to "1", "n"bootonly", or "EveryReboot", you can call [StopInvocation](~~ 64838 ~~) to stop the pending or periodic commands.
         * -If this parameter is set to "1" or "EveryReboot", you can call [DescribeInvocationResults](~~ 64845 ~~) and specify IncludeHistory = true to view the execution history of the command cycle.
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * The password of the user who runs the command in the Windows instance.
         * <p>
         * 
         * If you want to run a command in a Windows instance as a non-default user (System), you must specify "Username" and this parameter at the same time. To reduce the risk of password leakage, you must host the password in plaintext in the parameter repository of o & m orchestration service. Only the password name is specified here. For more information, see [encryption parameters](~~ 186828 ~~) and [set common users to run cloud assistant commands](~~ 203771 ~~).
         * 
         * > this parameter is not required when you use the root user of a Linux instance or the System user of a Windows instance to run commands.
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

}
