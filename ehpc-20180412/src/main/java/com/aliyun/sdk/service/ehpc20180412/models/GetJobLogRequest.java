// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobLogRequest} extends {@link RequestModel}
 *
 * <p>GetJobLogRequest</p>
 */
public class GetJobLogRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ExecHost")
    private String execHost;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("Offset")
    private Long offset;

    @Query
    @NameInMap("Size")
    private Integer size;

    private GetJobLogRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.execHost = builder.execHost;
        this.jobId = builder.jobId;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobLogRequest create() {
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
     * @return execHost
     */
    public String getExecHost() {
        return this.execHost;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<GetJobLogRequest, Builder> {
        private String clusterId; 
        private String execHost; 
        private String jobId; 
        private Long offset; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(GetJobLogRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.execHost = request.execHost;
            this.jobId = request.jobId;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The node on which the job runs.
         * <p>
         * 
         * *   If the job is completed, you do not need to specify the parameter.
         * *   If the job is running, you must specify the parameter.
         */
        public Builder execHost(String execHost) {
            this.putQueryParameter("ExecHost", execHost);
            this.execHost = execHost;
            return this;
        }

        /**
         * The ID of the job.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The position where logs start to be read.
         * <p>
         * 
         * Unit: bits
         * 
         * Default value: 0
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The maximum size of logs that you can read in a single request.
         * <p>
         * 
         * Unit: bits
         * 
         * Default value: 1024
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public GetJobLogRequest build() {
            return new GetJobLogRequest(this);
        } 

    } 

}
