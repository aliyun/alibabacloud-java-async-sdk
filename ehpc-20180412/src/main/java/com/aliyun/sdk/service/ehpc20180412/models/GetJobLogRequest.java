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
 * {@link GetJobLogRequest} extends {@link RequestModel}
 *
 * <p>GetJobLogRequest</p>
 */
public class GetJobLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecHost")
    private String execHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
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
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The node on which the job runs.</p>
         * <ul>
         * <li>If the job is completed, you do not need to specify the parameter.</li>
         * <li>If the job is running, you must specify the parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>compute000</p>
         */
        public Builder execHost(String execHost) {
            this.putQueryParameter("ExecHost", execHost);
            this.execHost = execHost;
            return this;
        }

        /**
         * <p>The ID of the job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.scheduler****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The position where logs start to be read.</p>
         * <p>Unit: bits</p>
         * <p>Default value: 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The maximum size of logs that you can read in a single request.</p>
         * <p>Unit: bits</p>
         * <p>Default value: 1024</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
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
