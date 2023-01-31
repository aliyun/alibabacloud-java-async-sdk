// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsRequest} extends {@link RequestModel}
 *
 * <p>ListJobsRequest</p>
 */
public class ListJobsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private java.util.List < String > jobId;

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public java.util.List < String > getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > jobId; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
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
         * JobId.
         */
        public Builder jobId(java.util.List < String > jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public ListJobsRequest build() {
            return new ListJobsRequest(this);
        } 

    } 

}
