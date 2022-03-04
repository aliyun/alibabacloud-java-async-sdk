// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationResultsRequest</p>
 */
public class DescribeInvocationResultsRequest extends Request {
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
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("CommandId")
    private String commandId;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("InvokeRecordStatus")
    private String invokeRecordStatus;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    @Query
    @NameInMap("InvokeId")
    private String invokeId;

    @Query
    @NameInMap("IncludeHistory")
    private Boolean includeHistory;

    private DescribeInvocationResultsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.commandId = builder.commandId;
        this.pageSize = builder.pageSize;
        this.invokeRecordStatus = builder.invokeRecordStatus;
        this.pageNumber = builder.pageNumber;
        this.contentEncoding = builder.contentEncoding;
        this.invokeId = builder.invokeId;
        this.includeHistory = builder.includeHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationResultsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return invokeRecordStatus
     */
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return includeHistory
     */
    public Boolean getIncludeHistory() {
        return this.includeHistory;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationResultsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String instanceId; 
        private String commandId; 
        private Long pageSize; 
        private String invokeRecordStatus; 
        private Long pageNumber; 
        private String contentEncoding; 
        private String invokeId; 
        private Boolean includeHistory; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationResultsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.commandId = request.commandId;
            this.pageSize = request.pageSize;
            this.invokeRecordStatus = request.invokeRecordStatus;
            this.pageNumber = request.pageNumber;
            this.contentEncoding = request.contentEncoding;
            this.invokeId = request.invokeId;
            this.includeHistory = request.includeHistory;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the command.
         * <p>
         * 
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
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
         * The command execution status. Valid values:
         * <p>
         * -Running: Running.
         * -Finished: completed.
         * -Failed: Failed.
         * -Stopped: Stopped.
         * 
         * > to improve compatibility, we recommend that you use the invocationstatus" parameter instead of this parameter.
         */
        public Builder invokeRecordStatus(String invokeRecordStatus) {
            this.putQueryParameter("InvokeRecordStatus", invokeRecordStatus);
            this.invokeRecordStatus = invokeRecordStatus;
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
         * Specifies the encoding method of the "Output" field in the returned data. Valid values:
         * <p>
         * -PlainText: returns the original command content and output information.
         * -Base64: returns the base64-encoded command content and output information.
         * 
         * The default value is base64.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * The ID of the command execution. You can call the [DescribeInvocations](~~ 64840 ~~) operation to query InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * Specifies whether to return the execution history of the command cycle. Valid values:
         * <p>
         * 
         * -true: returns the execution result of the command cycle. If this parameter is set to true, the value of the "InvokeId" parameter cannot be empty and must be the execution ID of the executed command periodically.
         * -false: indicates that no return is returned.
         * 
         * Default value: false.
         */
        public Builder includeHistory(Boolean includeHistory) {
            this.putQueryParameter("IncludeHistory", includeHistory);
            this.includeHistory = includeHistory;
            return this;
        }

        @Override
        public DescribeInvocationResultsRequest build() {
            return new DescribeInvocationResultsRequest(this);
        } 

    } 

}
