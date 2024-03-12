// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    @Query
    @NameInMap("CommandType")
    private String commandType;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("DesktopIds")
    private java.util.List < String > desktopIds;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("IncludeOutput")
    private Boolean includeOutput;

    @Query
    @NameInMap("InvokeId")
    private String invokeId;

    @Query
    @NameInMap("InvokeStatus")
    private String invokeStatus;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 50)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeInvocationsRequest(Builder builder) {
        super(builder);
        this.commandType = builder.commandType;
        this.contentEncoding = builder.contentEncoding;
        this.desktopId = builder.desktopId;
        this.desktopIds = builder.desktopIds;
        this.endUserId = builder.endUserId;
        this.includeOutput = builder.includeOutput;
        this.invokeId = builder.invokeId;
        this.invokeStatus = builder.invokeStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
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
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopIds
     */
    public java.util.List < String > getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return includeOutput
     */
    public Boolean getIncludeOutput() {
        return this.includeOutput;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return invokeStatus
     */
    public String getInvokeStatus() {
        return this.invokeStatus;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationsRequest, Builder> {
        private String commandType; 
        private String contentEncoding; 
        private String desktopId; 
        private java.util.List < String > desktopIds; 
        private String endUserId; 
        private Boolean includeOutput; 
        private String invokeId; 
        private String invokeStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationsRequest request) {
            super(request);
            this.commandType = request.commandType;
            this.contentEncoding = request.contentEncoding;
            this.desktopId = request.desktopId;
            this.desktopIds = request.desktopIds;
            this.endUserId = request.endUserId;
            this.includeOutput = request.includeOutput;
            this.invokeId = request.invokeId;
            this.invokeStatus = request.invokeStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * The type of the command. Valid values:
         * <p>
         * 
         * *   RunBatScript
         * *   RunPowerShellScript
         */
        public Builder commandType(String commandType) {
            this.putQueryParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * The encoding method of the command content and output. Valid values:
         * <p>
         * 
         * *   PlainText
         * *   Base64
         * 
         * Default value: Base64.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * The ID of the cloud desktop. If you specify a cloud desktop, all the execution records of Cloud Assistant commands on the cloud desktop are queried.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The IDs of the cloud desktops.
         */
        public Builder desktopIds(java.util.List < String > desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * The ID of the end user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * Specifies whether to return command outputs in the response. Valid values:
         * <p>
         * 
         * *   true: returns command outputs.
         * *   false: does not return command outputs.
         * 
         * Default value: false.
         */
        public Builder includeOutput(Boolean includeOutput) {
            this.putQueryParameter("IncludeOutput", includeOutput);
            this.includeOutput = includeOutput;
            return this;
        }

        /**
         * The ID of the execution.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * The overall execution status of a command. The overall execution status is determined by the execution status of the command on one or more cloud desktops. Valid values:
         * <p>
         * 
         * *   Running: The execution is in progress on one or more cloud desktops.
         * *   Finished: The execution is finished on all cloud desktops, or the execution is manually stopped on some cloud desktops and the execution is finished on others.
         * *   Failed: The execution failed on all cloud desktops.
         * *   PartialFailed: The execution failed on some cloud desktops.
         * *   Stopped: The execution is stopped.
         * 
         * Default value: Running.
         */
        public Builder invokeStatus(String invokeStatus) {
            this.putQueryParameter("InvokeStatus", invokeStatus);
            this.invokeStatus = invokeStatus;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * *   Valid values: 1 to 50.
         * *   Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The query token. Set the value to the NextToken value that is returned from the last call to the previous DescribeInvocations operation.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeInvocationsRequest build() {
            return new DescribeInvocationsRequest(this);
        } 

    } 

}
