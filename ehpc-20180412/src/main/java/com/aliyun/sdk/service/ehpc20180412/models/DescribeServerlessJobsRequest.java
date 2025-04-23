// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link DescribeServerlessJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeServerlessJobsRequest</p>
 */
public class DescribeServerlessJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> jobIds;

    private DescribeServerlessJobsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServerlessJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobIds
     */
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<DescribeServerlessJobsRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> jobIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServerlessJobsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobIds = request.jobIds;
        } 

        /**
         * <p>The ID of the E-HPC cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The list of serverless job IDs or the subtask IDs (array jobs).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the serverless job is an array job, you can specify only the subtask ID. Specify the subtask ID in the format of &lt;array job ID&gt;_&lt; subtask index&gt;. For example, 10_3 indicates the subtask whose index is 3 in the array job whose ID is 10.</p>
         * </li>
         * <li><p>You can specify only a single ID in one request.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder jobIds(java.util.List<String> jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public DescribeServerlessJobsRequest build() {
            return new DescribeServerlessJobsRequest(this);
        } 

    } 

}
