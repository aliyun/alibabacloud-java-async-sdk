// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationsRequest</p>
 */
public class DescribeInvocationsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InvokeId")
    private String invokeId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CommandId")
    private String commandId;

    @Query
    @NameInMap("CommandName")
    private String commandName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("CommandType")
    private String commandType;

    @Query
    @NameInMap("Timed")
    private Boolean timed;

    @Query
    @NameInMap("RepeatMode")
    private String repeatMode;

    @Query
    @NameInMap("IncludeOutput")
    private Boolean includeOutput;

    @Query
    @NameInMap("InvokeStatus")
    private String invokeStatus;

    private DescribeInvocationsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.invokeId = builder.invokeId;
        this.regionId = builder.regionId;
        this.commandId = builder.commandId;
        this.commandName = builder.commandName;
        this.instanceId = builder.instanceId;
        this.contentEncoding = builder.contentEncoding;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.commandType = builder.commandType;
        this.timed = builder.timed;
        this.repeatMode = builder.repeatMode;
        this.includeOutput = builder.includeOutput;
        this.invokeStatus = builder.invokeStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationsRequest create() {
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
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return commandName
     */
    public String getCommandName() {
        return this.commandName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return commandType
     */
    public String getCommandType() {
        return this.commandType;
    }

    /**
     * @return timed
     */
    public Boolean getTimed() {
        return this.timed;
    }

    /**
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return includeOutput
     */
    public Boolean getIncludeOutput() {
        return this.includeOutput;
    }

    /**
     * @return invokeStatus
     */
    public String getInvokeStatus() {
        return this.invokeStatus;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String invokeId; 
        private String regionId; 
        private String commandId; 
        private String commandName; 
        private String instanceId; 
        private String contentEncoding; 
        private Long pageNumber; 
        private Long pageSize; 
        private String commandType; 
        private Boolean timed; 
        private String repeatMode; 
        private Boolean includeOutput; 
        private String invokeStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationsRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.invokeId = response.invokeId;
            this.regionId = response.regionId;
            this.commandId = response.commandId;
            this.commandName = response.commandName;
            this.instanceId = response.instanceId;
            this.contentEncoding = response.contentEncoding;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.commandType = response.commandType;
            this.timed = response.timed;
            this.repeatMode = response.repeatMode;
            this.includeOutput = response.includeOutput;
            this.invokeStatus = response.invokeStatus;
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
         * The ID of the command execution.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
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
         * The ID of the command. You can call the [DescribeCommands](~~ 64843 ~~) operation to query all available CommandId.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * The name of the command.
         */
        public Builder commandName(String commandName) {
            this.putQueryParameter("CommandName", commandName);
            this.commandName = commandName;
            return this;
        }

        /**
         * The ID of the instance. When you specify this parameter, all command execution records of the instance are queried.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies the encoding method of the "CommandContent" and "Output" fields in the returned data. Valid values:
         * <p>
         * 
         * -PlainText: returns the original command content and output information.
         * -Base64: returns the base64-encoded command content and output information.
         * 
         * Default value: Base64
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * The current page number.
         * <p>
         * 
         * Start value: 1
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 50
         * 
         * Default value: 10
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the command.
         */
        public Builder commandType(String commandType) {
            this.putQueryParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * Whether the query command will be automatically executed in the future. Valid values:
         * <p>
         * 
         * -true: query call "runcommand" or "invokecommand" when executing a command, "repeatmod" parameters for "period", "nextrebootony" or "everyreboot", and is not canceled the incomplete state command or not stop the incomplete state command.
         * -false: query the following two-state command:
         * -Call "runcommand" or "invokecommand" when executing a command, "repeatmod" parameters for "once ".
         * -Has been canceled, quilt stop or has completed execution of the command.
         * 
         * Default value: false
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        /**
         * Command execution. Valid values:
         * <p>
         * 
         * -Once: immediately execute command.
         * -Period: timing execute command.
         * -NextRebootOnly: When the instance next launch, automatic execute command.
         * -EveryReboot: instance every time start automatically execute command.
         * 
         * Default: empty, represents the query all.
         */
        public Builder repeatMode(String repeatMode) {
            this.putQueryParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * Indicates whether to return the output information of the command run in the result.
         * <p>
         * 
         * -true: returns. At this point you specify at least parameter "invokeid" or "instanceid ".
         * -false: not returned.
         * 
         * Default value: false
         */
        public Builder includeOutput(Boolean includeOutput) {
            this.putQueryParameter("IncludeOutput", includeOutput);
            this.includeOutput = includeOutput;
            return this;
        }

        /**
         * Of command execution total execution status. The total execution status depends on the co-execution status of one or more instances in the execution process. Valid values:
         * <p>
         * 
         * -Running:
         * -Cycle: Is not manually stop cycle before the command execution status has been to in progress.
         * -Single execution: once with the ongoing command process, overall implementation status to in progress.
         * -Finished:
         * -Cycle: the command process can"t be to completion.
         * -Single execution: all instances all completed execution. Or manually stop part instance command process, the remaining instance all execution completed.
         * -Failed:
         * -Cycle: the command process can"t be execution failed.
         * -Single execution: all instances all execution failed.
         * -PartialFailed:
         * -Cycle: the command process can"t be partially failed.
         * -Single execution: part instance has failed command process, the total execution status for partially failed.
         * -Stopped: Stop command.
         * 
         * Default value: Running
         */
        public Builder invokeStatus(String invokeStatus) {
            this.putQueryParameter("InvokeStatus", invokeStatus);
            this.invokeStatus = invokeStatus;
            return this;
        }

        @Override
        public DescribeInvocationsRequest build() {
            return new DescribeInvocationsRequest(this);
        } 

    } 

}
