// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InvokeId")
    private String invokeId;

    @Query
    @NameInMap("CommandId")
    private String commandId;

    @Query
    @NameInMap("CommandName")
    private String commandName;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("RepeatMode")
    private String repeatMode;

    @Query
    @NameInMap("IncludeOutput")
    private Boolean includeOutput;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("CommandType")
    private String commandType;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InvokeStatus")
    private String invokeStatus;

    @Query
    @NameInMap("Timed")
    private Boolean timed;

    private DescribeInvocationsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.invokeId = builder.invokeId;
        this.commandId = builder.commandId;
        this.commandName = builder.commandName;
        this.pageNumber = builder.pageNumber;
        this.repeatMode = builder.repeatMode;
        this.includeOutput = builder.includeOutput;
        this.pageSize = builder.pageSize;
        this.commandType = builder.commandType;
        this.contentEncoding = builder.contentEncoding;
        this.instanceId = builder.instanceId;
        this.invokeStatus = builder.invokeStatus;
        this.timed = builder.timed;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return invokeStatus
     */
    public String getInvokeStatus() {
        return this.invokeStatus;
    }

    /**
     * @return timed
     */
    public Boolean getTimed() {
        return this.timed;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String invokeId; 
        private String commandId; 
        private String commandName; 
        private Long pageNumber; 
        private String repeatMode; 
        private Boolean includeOutput; 
        private Long pageSize; 
        private String commandType; 
        private String contentEncoding; 
        private String instanceId; 
        private String invokeStatus; 
        private Boolean timed; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.invokeId = request.invokeId;
            this.commandId = request.commandId;
            this.commandName = request.commandName;
            this.pageNumber = request.pageNumber;
            this.repeatMode = request.repeatMode;
            this.includeOutput = request.includeOutput;
            this.pageSize = request.pageSize;
            this.commandType = request.commandType;
            this.contentEncoding = request.contentEncoding;
            this.instanceId = request.instanceId;
            this.invokeStatus = request.invokeStatus;
            this.timed = request.timed;
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
         * The ID of the command execution.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
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
         * The current page number.
         * <p>
         * 
         * The start value is 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The command execution method. Valid values:
         * <p>
         * 
         * -Once: run the command immediately.
         * -Period: run the command regularly.
         * -NextRebootOnly: When the instance starts next time, the command is automatically executed.
         * -EveryReboot: The command is automatically executed each time the instance is started.
         * 
         * The default value is null, indicating all queries.
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
         * -true: returns. You must specify at least the "InvokeId" or "InstanceId" parameters ".
         * -false: does not return.
         * 
         * Default value: false.
         */
        public Builder includeOutput(Boolean includeOutput) {
            this.putQueryParameter("IncludeOutput", includeOutput);
            this.includeOutput = includeOutput;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 50.
         * 
         * Default value: 10.
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
         * Specifies the encoding method of the "CommandContent" and "Output" fields in the returned data. Valid values:
         * <p>
         * 
         * -PlainText: returns the original command content and output information.
         * -Base64: returns the base64-encoded command content and output information.
         * 
         * The default value is Base64.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
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
         * The total invocation status of the command. The total execution status depends on the co-execution status of one or more instances in the execution process. Valid values:
         * <p>
         * 
         * -Running:
         * -Periodic invocation: the invocation status remains in progress until the periodic invocation command is manually stopped.
         * -Single execution: Once a command process is in progress, the overall execution status is in progress.
         * -Finished:
         * -Periodic execution: the command process cannot be executed.
         * -Single execution: all instances are executed. Alternatively, you can manually stop the command processes of some instances, and all other instances are executed.
         * -Failed:
         * -Periodic execution: the command process cannot fail to be executed.
         * -Single execution: all instances fail to be executed.
         * -PartialFailed:
         * -Periodic execution: the command process cannot be partially failed.
         * -Single execution: if some instances have failed command execution processes, the total execution status is partially failed.
         * -Stopped: stop the command.
         * 
         * Default value: Running.
         */
        public Builder invokeStatus(String invokeStatus) {
            this.putQueryParameter("InvokeStatus", invokeStatus);
            this.invokeStatus = invokeStatus;
            return this;
        }

        /**
         * Whether the query command will be automatically executed in the future. Valid values:
         * <p>
         * 
         * -true: when the "RunCommand" or "InvokeCommand" command is called, the value of the "RepeatMod" parameter is "1", "n"bootone", or "EveryReboot", and the command is in the uncompleted state or unstopped state.
         * -false: the command to query the following two statuses:
         * -When "RunCommand" or "InvokeCommand" is called to execute a command, the value of "RepeatMod" is "Once ".
         * -Canceled, stopped, or completed commands.
         * 
         * Default value: false.
         */
        public Builder timed(Boolean timed) {
            this.putQueryParameter("Timed", timed);
            this.timed = timed;
            return this;
        }

        @Override
        public DescribeInvocationsRequest build() {
            return new DescribeInvocationsRequest(this);
        } 

    } 

}
