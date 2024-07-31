// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommandInvocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommandInvocationsRequest</p>
 */
public class DescribeCommandInvocationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandName")
    private String commandName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandType")
    private String commandType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvocationStatus")
    private String invocationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeCommandInvocationsRequest(Builder builder) {
        super(builder);
        this.commandId = builder.commandId;
        this.commandName = builder.commandName;
        this.commandType = builder.commandType;
        this.instanceId = builder.instanceId;
        this.invocationStatus = builder.invocationStatus;
        this.invokeId = builder.invokeId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommandInvocationsRequest create() {
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
     * @return commandName
     */
    public String getCommandName() {
        return this.commandName;
    }

    /**
     * @return commandType
     */
    public String getCommandType() {
        return this.commandType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return invocationStatus
     */
    public String getInvocationStatus() {
        return this.invocationStatus;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCommandInvocationsRequest, Builder> {
        private String commandId; 
        private String commandName; 
        private String commandType; 
        private String instanceId; 
        private String invocationStatus; 
        private String invokeId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommandInvocationsRequest request) {
            super(request);
            this.commandId = request.commandId;
            this.commandName = request.commandName;
            this.commandType = request.commandType;
            this.instanceId = request.instanceId;
            this.invocationStatus = request.invocationStatus;
            this.invokeId = request.invokeId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
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
         * The command name. If both CommandName and InstanceId are specified, CommandName does not take effect.
         */
        public Builder commandName(String commandName) {
            this.putQueryParameter("CommandName", commandName);
            this.commandName = commandName;
            return this;
        }

        /**
         * The command type. Valid values:
         * <p>
         * 
         * *   RunBatScript: batch command, applicable to Windows instances
         * *   RunPowerShellScript: PowerShell command, applicable to Windows instances
         * *   RunShellScript: shell command, applicable to Linux instances
         */
        public Builder commandType(String commandType) {
            this.putQueryParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The overall execution state of the command. The value of this parameter depends on the execution status of the command on all the involved instances. Valid values:
         * <p>
         * 
         * *   Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.
         * 
         * *   Running: The command is being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.
         * 
         * *   Success: When the execution state on at least one instance is Success and the execution state on other instances is Stopped or Success, the overall execution state is Success.
         * 
         *     *   Command that is set to run immediately: The command execution is complete, and the exit code is 0.
         * 
         * *   Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:
         * 
         *     *   Invalid: The command is invalid.
         *     *   Aborted: The command fails to be sent.
         *     *   Failed: The command execution is complete, and the exit code is not 0.
         *     *   Timeout: The command execution times out.
         *     *   Error: An error occurs when the command is being run.
         * 
         * *   Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.
         * 
         * *   Stopped: The command task is stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:
         * 
         *     *   Cancelled: The command task is canceled.
         *     *   Terminated: The command task is terminated.
         * 
         * *   PartialFailed: The command execution succeeds on some instances and fails on other instances. When the execution state on some instances is Success and the execution state on other instances is Failed or Stopped, the overall execution state is PartialFailed.
         * 
         * >  The value of the `InvokeStatus` response parameter is similar to the value of InvocationStatus. We recommend that you ignore InvokeStatus and check the value of InvocationStatus.
         */
        public Builder invocationStatus(String invocationStatus) {
            this.putQueryParameter("InvocationStatus", invocationStatus);
            this.invocationStatus = invocationStatus;
            return this;
        }

        /**
         * The execution ID of the command.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * The page number. Pages start from 1. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Maximum value: 50.
         * 
         * Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public DescribeCommandInvocationsRequest build() {
            return new DescribeCommandInvocationsRequest(this);
        } 

    } 

}
