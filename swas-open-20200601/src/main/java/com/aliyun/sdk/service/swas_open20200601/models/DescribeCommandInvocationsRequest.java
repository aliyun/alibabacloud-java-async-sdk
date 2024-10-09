// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>c-sh02yh0932w****</p>
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>The command name. If both CommandName and InstanceId are specified, CommandName does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder commandName(String commandName) {
            this.putQueryParameter("CommandName", commandName);
            this.commandName = commandName;
            return this;
        }

        /**
         * <p>The command type. Valid values:</p>
         * <ul>
         * <li>RunBatScript: batch command, applicable to Windows instances</li>
         * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances</li>
         * <li>RunShellScript: shell command, applicable to Linux instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RunPowerShellScript</p>
         */
        public Builder commandType(String commandType) {
            this.putQueryParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * <p>The ID of the simple application server.</p>
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
         * <p>The overall execution state of the command. The value of this parameter depends on the execution status of the command on all the involved instances. Valid values:</p>
         * <ul>
         * <li><p>Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
         * </li>
         * <li><p>Running: The command is being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.</p>
         * </li>
         * <li><p>Success: When the execution state on at least one instance is Success and the execution state on other instances is Stopped or Success, the overall execution state is Success.</p>
         * <ul>
         * <li>Command that is set to run immediately: The command execution is complete, and the exit code is 0.</li>
         * </ul>
         * </li>
         * <li><p>Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:</p>
         * <ul>
         * <li>Invalid: The command is invalid.</li>
         * <li>Aborted: The command fails to be sent.</li>
         * <li>Failed: The command execution is complete, and the exit code is not 0.</li>
         * <li>Timeout: The command execution times out.</li>
         * <li>Error: An error occurs when the command is being run.</li>
         * </ul>
         * </li>
         * <li><p>Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.</p>
         * </li>
         * <li><p>Stopped: The command task is stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:</p>
         * <ul>
         * <li>Cancelled: The command task is canceled.</li>
         * <li>Terminated: The command task is terminated.</li>
         * </ul>
         * </li>
         * <li><p>PartialFailed: The command execution succeeds on some instances and fails on other instances. When the execution state on some instances is Success and the execution state on other instances is Failed or Stopped, the overall execution state is PartialFailed.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> The value of the <code>InvokeStatus</code> response parameter is similar to the value of InvocationStatus. We recommend that you ignore InvokeStatus and check the value of InvocationStatus.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder invocationStatus(String invocationStatus) {
            this.putQueryParameter("InvocationStatus", invocationStatus);
            this.invocationStatus = invocationStatus;
            return this;
        }

        /**
         * <p>The execution ID of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz02p9545t6****</p>
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Maximum value: 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public DescribeCommandInvocationsRequest build() {
            return new DescribeCommandInvocationsRequest(this);
        } 

    } 

}
