// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeToolExecutionHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeToolExecutionHistoryRequest</p>
 */
public class DescribeNodeToolExecutionHistoryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DcId")
    @Validation(required = true)
    private String dcId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private DescribeNodeToolExecutionHistoryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dcId = builder.dcId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeToolExecutionHistoryRequest create() {
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
     * @return dcId
     */
    public String getDcId() {
        return this.dcId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DescribeNodeToolExecutionHistoryRequest, Builder> {
        private String clusterId; 
        private String dcId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeToolExecutionHistoryRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.dcId = response.dcId;
            this.jobId = response.jobId;
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
         * DcId.
         */
        public Builder dcId(String dcId) {
            this.putQueryParameter("DcId", dcId);
            this.dcId = dcId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeNodeToolExecutionHistoryRequest build() {
            return new DescribeNodeToolExecutionHistoryRequest(this);
        } 

    } 

}
