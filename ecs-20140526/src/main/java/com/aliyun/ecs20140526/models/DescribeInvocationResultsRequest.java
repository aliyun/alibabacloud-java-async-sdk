// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("CommandId")
    private String commandId;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("InvokeId")
    private String invokeId;

    @Query
    @NameInMap("InvokeRecordStatus")
    private String invokeRecordStatus;

    @Query
    @NameInMap("IncludeHistory")
    private Boolean includeHistory;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    private DescribeInvocationResultsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.commandId = builder.commandId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.invokeId = builder.invokeId;
        this.invokeRecordStatus = builder.invokeRecordStatus;
        this.includeHistory = builder.includeHistory;
        this.contentEncoding = builder.contentEncoding;
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
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return invokeRecordStatus
     */
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
    }

    /**
     * @return includeHistory
     */
    public Boolean getIncludeHistory() {
        return this.includeHistory;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationResultsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String instanceId; 
        private String commandId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String invokeId; 
        private String invokeRecordStatus; 
        private Boolean includeHistory; 
        private String contentEncoding; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationResultsRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.instanceId = response.instanceId;
            this.commandId = response.commandId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.invokeId = response.invokeId;
            this.invokeRecordStatus = response.invokeRecordStatus;
            this.includeHistory = response.includeHistory;
            this.contentEncoding = response.contentEncoding;
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
         * The current page number. Start value: 1.
         * <p>
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
         * The ID of the command execution. You can call the [DescribeInvocations](~~ 64840 ~~) operation to query InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * The command execution status. Valid values:
         * <p>
         * -Running: Running
         * -Finished: Completed
         * -Failed: Failed.
         * -Stopped: Stopped
         * 
         * > to improve compatibility, we recommend that you use the invocationstatus" parameter instead of this parameter.
         */
        public Builder invokeRecordStatus(String invokeRecordStatus) {
            this.putQueryParameter("InvokeRecordStatus", invokeRecordStatus);
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }

        /**
         * Whether to return command cycle of the historical record. Valid values:
         * <p>
         * 
         * -true: represents the return command cycle results. When value is true, parameter "invokeid" value cannot be empty, and must be a cycle command execution ID.
         * -false: said not returned.
         * 
         * Default value: false
         */
        public Builder includeHistory(Boolean includeHistory) {
            this.putQueryParameter("IncludeHistory", includeHistory);
            this.includeHistory = includeHistory;
            return this;
        }

        /**
         * Set the return data in "output" field way of coding, value range:
         * <p>
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

        @Override
        public DescribeInvocationResultsRequest build() {
            return new DescribeInvocationResultsRequest(this);
        } 

    } 

}
