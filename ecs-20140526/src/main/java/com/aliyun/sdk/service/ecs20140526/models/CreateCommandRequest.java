// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommandRequest} extends {@link RequestModel}
 *
 * <p>CreateCommandRequest</p>
 */
public class CreateCommandRequest extends Request {
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
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("EnableParameter")
    private Boolean enableParameter;

    @Query
    @NameInMap("CommandContent")
    @Validation(required = true)
    private String commandContent;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.timeout = builder.timeout;
        this.enableParameter = builder.enableParameter;
        this.commandContent = builder.commandContent;
        this.workingDir = builder.workingDir;
        this.description = builder.description;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommandRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCommandRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String name; 
        private Long timeout; 
        private Boolean enableParameter; 
        private String commandContent; 
        private String workingDir; 
        private String description; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommandRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.name = request.name;
            this.timeout = request.timeout;
            this.enableParameter = request.enableParameter;
            this.commandContent = request.commandContent;
            this.workingDir = request.workingDir;
            this.description = request.description;
            this.type = request.type;
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
         * The ID of the resource master account, that is, the UID.
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
         * The name of the command. The full character set is supported. A maximum of 128 characters are allowed.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The maximum timeout period for a command to be executed on an ECS instance. Unit: seconds. A timeout occurs when the command you created cannot be run for some reason. After a timeout, the command process is forcibly terminated, that is, the PID of the command is canceled.
         * <p>
         * 
         * Default value: 60.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * Indicates whether the created Command uses custom parameters.
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
         * The base64-encoded content of the command.
         * <p>
         * 
         * -The value of this parameter must be base64-encoded before transmission. The size of the script cannot exceed 16kB after base64-encoded.
         * -You can use custom parameters to specify the parameter "EnableParameter = true:
         * -Custom parameters are defined in the format of "} ". Spaces and line breaks before and after parameter names in "}" are ignored.
         * -The number of custom parameters cannot exceed 20.
         * -Custom parameter names can be combined a-zA-Z0-9-_. Other characters are not supported. Parameter names are case insensitive.
         * -A single parameter name cannot exceed 64 bytes.
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * The directory where the command you created runs in the ECS instance.
         * <p>
         * 
         * Default value:
         * -Linux instance: the root user of the administrator is in the home directory, specifically the/root" directory.
         * -Windows instance: The Directory of the cloud assistant client process, for example, "C:WindowsSystem32 ".
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        /**
         * The description of the command. The full character set is supported. A maximum of 512 characters are allowed.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The type of the command. Valid values:
         * <p>
         * 
         * -RunBatScript: Creates a Bat script that runs in the Windows instance.
         * -RunPowerShellScript: Creates a Windows script that runs in the PowerShell instance.
         * -RunShellScript: Creates a Shell script that runs on a Linux instance.
         * 
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCommandRequest build() {
            return new CreateCommandRequest(this);
        } 

    } 

}
