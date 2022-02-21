// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodeToolExecutionHistoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteNodeToolExecutionHistoryRequest</p>
 */
public class DeleteNodeToolExecutionHistoryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DataCenterId")
    @Validation(required = true)
    private String dataCenterId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private DeleteNodeToolExecutionHistoryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dataCenterId = builder.dataCenterId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNodeToolExecutionHistoryRequest create() {
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
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DeleteNodeToolExecutionHistoryRequest, Builder> {
        private String clusterId; 
        private String dataCenterId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNodeToolExecutionHistoryRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.dataCenterId = response.dataCenterId;
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
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.putQueryParameter("DataCenterId", dataCenterId);
            this.dataCenterId = dataCenterId;
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
        public DeleteNodeToolExecutionHistoryRequest build() {
            return new DeleteNodeToolExecutionHistoryRequest(this);
        } 

    } 

}
