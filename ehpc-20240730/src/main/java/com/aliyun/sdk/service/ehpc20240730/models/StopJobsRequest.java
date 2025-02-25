// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link StopJobsRequest} extends {@link RequestModel}
 *
 * <p>StopJobsRequest</p>
 */
public class StopJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private java.util.List<String> jobIds;

    private StopJobsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopJobsRequest create() {
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

    public static final class Builder extends Request.Builder<StopJobsRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> jobIds; 

        private Builder() {
            super();
        } 

        private Builder(StopJobsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobIds = request.jobIds;
        } 

        /**
         * <p>The cluster ID.</p>
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
         * <p>The IDs of the jobs that you want to stop.</p>
         */
        public Builder jobIds(java.util.List<String> jobIds) {
            String jobIdsShrink = shrink(jobIds, "JobIds", "json");
            this.putQueryParameter("JobIds", jobIdsShrink);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public StopJobsRequest build() {
            return new StopJobsRequest(this);
        } 

    } 

}
