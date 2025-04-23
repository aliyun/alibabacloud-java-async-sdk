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
 * {@link StopServerlessJobsRequest} extends {@link RequestModel}
 *
 * <p>StopServerlessJobsRequest</p>
 */
public class StopServerlessJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> jobIds;

    private StopServerlessJobsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopServerlessJobsRequest create() {
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

    public static final class Builder extends Request.Builder<StopServerlessJobsRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> jobIds; 

        private Builder() {
            super();
        } 

        private Builder(StopServerlessJobsRequest request) {
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
         * <p>The serverless job IDs or subtask IDs (array jobs).</p>
         * <ul>
         * <li>If you specify the job ID of an array job, all subtasks under the array job are stopped.</li>
         * <li>If you specify the ID of a subtask of an array job, only the subtask is stopped.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder jobIds(java.util.List<String> jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public StopServerlessJobsRequest build() {
            return new StopServerlessJobsRequest(this);
        } 

    } 

}
