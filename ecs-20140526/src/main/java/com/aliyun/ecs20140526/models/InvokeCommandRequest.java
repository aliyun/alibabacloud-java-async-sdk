// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("CommandId")
    private String commandId;

    @Query
    @NameInMap("RegionId")
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
    @NameInMap("RepeatMode")
    private String repeatMode;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    @Query
    @NameInMap("Username")
    private String username;

    private InvokeCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.commandId = builder.commandId;
        this.regionId = builder.regionId;
        this.timed = builder.timed;
        this.frequency = builder.frequency;
        this.parameters = builder.parameters;
        this.repeatMode = builder.repeatMode;
        this.instanceId = builder.instanceId;
        this.windowsPasswordName = builder.windowsPasswordName;
        this.username = builder.username;
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
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
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
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return windowsPasswordName
     */
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<InvokeCommandRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String commandId; 
        private String regionId; 
        private Boolean timed; 
        private String frequency; 
        private java.util.Map < String, ? > parameters; 
        private String repeatMode; 
        private java.util.List < String > instanceId; 
        private String windowsPasswordName; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(InvokeCommandRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.commandId = response.commandId;
            this.regionId = response.regionId;
            this.timed = response.timed;
            this.frequency = response.frequency;
            this.parameters = response.parameters;
            this.repeatMode = response.repeatMode;
            this.instanceId = response.instanceId;
            this.windowsPasswordName = response.windowsPasswordName;
            this.username = response.username;
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
         * The ID of the command. You can call the [DescribeCommands](~~ 64843 ~~) operation to query all available CommandId.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
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
         * Whether the command for the cycle.
         * <p>
         * 
         * Default value: false
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        /**
         * Cycle Command implementation cycle of, twice cycle command time interval cannot be under 10 miao. When the parameter "timed" value of "true" when "frequency" required parameters.
         * <p>
         * 
         * The parameters follow Cron expression, see [set scheduled command](~~ 64769 ~~).
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * Enable custom parameter function when, when executing a command incoming custom parameter key-value pairs. Custom parameter number range: 0~10
         * <p>
         * 
         * -Map Key not allowed for an empty string, supports a maximum of 64 characters.
         * -Map value of allows an empty string.
         * -Custom parameters with the original command content in Base64 after the encoding comprehensive length cannot exceed 16KB.
         * -Set the custom parameter name collection must For create command defined when the parameter set subset. For not the incoming parameters, you can use an empty string instead.
         * 
         * You can cancel Setting this parameter to disable custom parameter.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * Set of command execution. Valid values:
         * <p>
         * 
         * -Once: immediately execute command.
         * -Period: timing execute command. When the parameter value for "period" when, must also be specified "timed = true" parameter values, and "frequency" parameters.
         * -NextRebootOnly: When the instance next launch, automatic execute command.
         * -EveryReboot: instance every time start automatically execute command.
         * 
         * Default value:
         * 
         * -When do not specify "timed = true" parameter values, and "frequency" parameters, the default value is "once ".
         * -When specified "timed = true" parameter values, and "frequency" parameters, whether or not you have set up the parameter value, will be in accordance with "period" processing.
         * 
         * Note:
         * 
         * -When the parameters "period", "nextrebootonly" or "everyreboot" when you can call [StopInvocation](~~ 64838 ~~) stop the pending command or cycle commands.
         * -When the parameters "period" or "everyreboot" when you can call [DescribeInvocationResults](~~ 64845 ~~), and then specify the IncludeHistory = true view command cycle of the historical record.
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * Need to perform command list of instances of the, the most multi-can specify 50 instance ID. N value range: 1~50
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * In Windows instance execute a command in a password of the user name.
         * <p>
         * 
         * When you want to non-default user (System) in Windows instance when executing a command requires incoming "username" and this parameter. To reduce password leak risk, will need password in plaintext managed in operations orchestration service parameters in the warehouse, here only incoming password name. More information, please see [encryption parameters](~~ 186828 ~~) and [settings ordinary user perform cloud assistant command](~~ 203771 ~~).
         * 
         * > When you use Linux instance root user or Windows instance for the System user when executing a command, don"t need to pass the parameter.
         */
        public Builder windowsPasswordName(String windowsPasswordName) {
            this.putQueryParameter("WindowsPasswordName", windowsPasswordName);
            this.windowsPasswordName = windowsPasswordName;
            return this;
        }

        /**
         * In ECS instance execute a command in a user name.
         * <p>
         * 
         * -Linux system ECS instance, default root user execute command.
         * -Windows System ECS instance, default to System user execute command.
         * 
         * You can also specify the instance already exists in other users of the Execute command to ordinary users perform cloud assistant command more secure. More information, please see [settings ordinary user perform cloud assistant command](~~ 203771 ~~).
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public InvokeCommandRequest build() {
            return new InvokeCommandRequest(this);
        } 

    } 

}
