// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCommandAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateCommandAttributeRequest</p>
 */
public class UpdateCommandAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

    private UpdateCommandAttributeRequest(Builder builder) {
        super(builder);
        this.commandId = builder.commandId;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.timeout = builder.timeout;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCommandAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<UpdateCommandAttributeRequest, Builder> {
        private String commandId; 
        private String description; 
        private String name; 
        private String regionId; 
        private Long timeout; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCommandAttributeRequest request) {
            super(request);
            this.commandId = request.commandId;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.timeout = request.timeout;
            this.workingDir = request.workingDir;
        } 

        /**
         * The command ID. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
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
         * The name of the command. The name supports all character sets and can be up to 128 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The maximum timeout period for the command execution on the ECS instance. Unit: seconds. When a command that you created cannot be run, the command execution times out. When the execution times out, the command process is forcefully terminated and the PID of the command is canceled. Default value: 60.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The working directory of the command. The directory can be up to 200 characters in length.
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        @Override
        public UpdateCommandAttributeRequest build() {
            return new UpdateCommandAttributeRequest(this);
        } 

    } 

}
