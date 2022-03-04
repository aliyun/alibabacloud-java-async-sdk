// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCommandRequest} extends {@link RequestModel}
 *
 * <p>ModifyCommandRequest</p>
 */
public class ModifyCommandRequest extends Request {
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
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("CommandContent")
    private String commandContent;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("CommandId")
    @Validation(required = true)
    private String commandId;

    @Query
    @NameInMap("Name")
    private String name;

    private ModifyCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.commandContent = builder.commandContent;
        this.workingDir = builder.workingDir;
        this.timeout = builder.timeout;
        this.commandId = builder.commandId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCommandRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModifyCommandRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String description; 
        private String commandContent; 
        private String workingDir; 
        private Long timeout; 
        private String commandId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCommandRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.commandContent = request.commandContent;
            this.workingDir = request.workingDir;
            this.timeout = request.timeout;
            this.commandId = request.commandId;
            this.name = request.name;
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
         * The ID of the Alibaba Cloud account (primary account).
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
         * The description of the command. The full character set is supported and cannot exceed 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The content of the command. The command content can be plaintext or base64-encoded content. Note:
         * <p>
         * 
         * -The size of the command content after Base64 encoding cannot exceed 16KB.
         * -If your command content is Base64-encoded, you must set "ContentEncoding = Base64 ".
         * -Specify the parameter "EnableParameter = true" to enable custom parameters in the command content:
         * -Define custom parameters in the format of "{}} ". Spaces and line breaks before and after the parameter names in "{}}" are ignored.
         * -The number of custom parameters cannot exceed 20.
         * -Custom parameter names can be combined a-zA-Z0-9-_. Other characters are not supported. Parameter names are case insensitive.
         * -A single custom parameter name cannot exceed 64 bytes.
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * The execution path.
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        /**
         * The maximum timeout period for a command to be executed on an ECS instance. Unit: seconds. When the command you created cannot be run and completed within the specified time, a timeout occurs. After a timeout, the command process is forcibly terminated, that is, the PID of the command is canceled.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
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
         * The name of the command. The full character set is supported and cannot exceed 128 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModifyCommandRequest build() {
            return new ModifyCommandRequest(this);
        } 

    } 

}
