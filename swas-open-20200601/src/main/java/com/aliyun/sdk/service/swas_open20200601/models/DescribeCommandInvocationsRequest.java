// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommandInvocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommandInvocationsRequest</p>
 */
public class DescribeCommandInvocationsRequest extends Request {
    @Query
    @NameInMap("CommandId")
    private String commandId;

    @Query
    @NameInMap("CommandName")
    private String commandName;

    @Query
    @NameInMap("CommandType")
    private String commandType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InvocationStatus")
    private String invocationStatus;

    @Query
    @NameInMap("InvokeId")
    private String invokeId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * CommandId.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * CommandName.
         */
        public Builder commandName(String commandName) {
            this.putQueryParameter("CommandName", commandName);
            this.commandName = commandName;
            return this;
        }

        /**
         * CommandType.
         */
        public Builder commandType(String commandType) {
            this.putQueryParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InvocationStatus.
         */
        public Builder invocationStatus(String invocationStatus) {
            this.putQueryParameter("InvocationStatus", invocationStatus);
            this.invocationStatus = invocationStatus;
            return this;
        }

        /**
         * InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
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
