// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInvocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationsRequest</p>
 */
public class DescribeInvocationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandType")
    private String commandType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIds")
    private java.util.List<String> desktopIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeInvokeDesktops")
    private Boolean includeInvokeDesktops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeOutput")
    private Boolean includeOutput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeStatus")
    private String invokeStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeInvocationsRequest(Builder builder) {
        super(builder);
        this.commandType = builder.commandType;
        this.contentEncoding = builder.contentEncoding;
        this.desktopId = builder.desktopId;
        this.desktopIds = builder.desktopIds;
        this.endUserId = builder.endUserId;
        this.includeInvokeDesktops = builder.includeInvokeDesktops;
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
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return includeInvokeDesktops
     */
    public Boolean getIncludeInvokeDesktops() {
        return this.includeInvokeDesktops;
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
        private java.util.List<String> desktopIds; 
        private String endUserId; 
        private Boolean includeInvokeDesktops; 
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
            this.includeInvokeDesktops = request.includeInvokeDesktops;
            this.includeOutput = request.includeOutput;
            this.invokeId = request.invokeId;
            this.invokeStatus = request.invokeStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The command type of the O&amp;M script.</p>
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
         * <p>The encoding method of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>The cloud desktop ID. If you specify a cloud desktop, all script execution records of the cloud desktop are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The list of cloud desktop IDs.</p>
         * <blockquote>
         * <p>The <code>DesktopId</code> parameter will be deprecated. Use this parameter to pass the list of cloud desktop IDs.</p>
         * </blockquote>
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>Specifies whether to return the execution results of all cloud desktops when the remote command is executed on multiple cloud desktops.</p>
         */
        public Builder includeInvokeDesktops(Boolean includeInvokeDesktops) {
            this.putQueryParameter("IncludeInvokeDesktops", includeInvokeDesktops);
            this.includeInvokeDesktops = includeInvokeDesktops;
            return this;
        }

        /**
         * <p>Specifies whether to return the output information of the script execution in the results.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeOutput(Boolean includeOutput) {
            this.putQueryParameter("IncludeOutput", includeOutput);
            this.includeOutput = includeOutput;
            return this;
        }

        /**
         * <p>The execution ID of the script process. Obtained from the response of <a href="~~RunCommand~~">RunCommand</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The overall execution status of the script. The overall execution status depends on the combined execution status of one or more cloud desktops in the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder invokeStatus(String invokeStatus) {
            this.putQueryParameter("InvokeStatus", invokeStatus);
            this.invokeStatus = invokeStatus;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query.    </p>
         * <ul>
         * <li>Maximum value: 50.</li>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
        public DescribeInvocationsRequest build() {
            return new DescribeInvocationsRequest(this);
        } 

    } 

}
