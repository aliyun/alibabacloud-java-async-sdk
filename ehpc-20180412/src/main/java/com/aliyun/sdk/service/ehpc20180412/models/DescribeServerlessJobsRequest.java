// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerlessJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeServerlessJobsRequest</p>
 */
public class DescribeServerlessJobsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("JobIds")
    @Validation(required = true)
    private java.util.List < String > jobIds;

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
    public java.util.List < String > getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<DescribeServerlessJobsRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > jobIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServerlessJobsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobIds = request.jobIds;
        } 

        /**
         * The ID of the E-HPC cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The list of serverless job IDs or the subtask IDs (array jobs).
         * <p>
         * 
         * > 
         * 
         * *   If the serverless job is an array job, you can specify only the subtask ID. Specify the subtask ID in the format of \<array job ID>\_< subtask index>. For example, 10\_3 indicates the subtask whose index is 3 in the array job whose ID is 10.
         * 
         * *   You can specify only a single ID in one request.
         */
        public Builder jobIds(java.util.List < String > jobIds) {
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
