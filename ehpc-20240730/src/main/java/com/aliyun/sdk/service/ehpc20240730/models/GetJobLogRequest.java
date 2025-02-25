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
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private String offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    private GetJobLogRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobId = builder.jobId;
        this.logType = builder.logType;
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return offset
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<GetJobLogRequest, Builder> {
        private String clusterId; 
        private String jobId; 
        private String logType; 
        private String offset; 
        private String size; 

        private Builder() {
            super();
        } 

        private Builder(GetJobLogRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobId = request.jobId;
            this.logType = request.logType;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * <p>The cluster ID.</p>
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
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.manager</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The log type. Valid values:</p>
         * <ul>
         * <li>stdout: standard output logs.</li>
         * <li>stderr: error output logs.</li>
         * <li>all: all logs.</li>
         * </ul>
         * <p>Default value: all.</p>
         * 
         * <strong>example:</strong>
         * <p>stdout</p>
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * <p>The position where logs start to be read.</p>
         * <p>Unit: bytes.</p>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(String offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The maximum size of logs that you can read in a single request.</p>
         * <p>Unit: bytes.</p>
         * <p>Default value: 10240.</p>
         * 
         * <strong>example:</strong>
         * <p>20480</p>
         */
        public Builder size(String size) {
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
