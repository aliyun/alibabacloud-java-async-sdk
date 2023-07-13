// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopServerlessJobsRequest} extends {@link RequestModel}
 *
 * <p>StopServerlessJobsRequest</p>
 */
public class StopServerlessJobsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("JobIds")
    @Validation(required = true)
    private java.util.List < String > jobIds;

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
    public java.util.List < String > getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<StopServerlessJobsRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > jobIds; 

        private Builder() {
            super();
        } 

        private Builder(StopServerlessJobsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobIds = request.jobIds;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * JobIds.
         */
        public Builder jobIds(java.util.List < String > jobIds) {
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
