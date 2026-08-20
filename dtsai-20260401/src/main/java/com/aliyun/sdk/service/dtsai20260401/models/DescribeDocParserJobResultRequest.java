// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link DescribeDocParserJobResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocParserJobResultRequest</p>
 */
public class DescribeDocParserJobResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    private DescribeDocParserJobResultRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.jobId = builder.jobId;
        this.regionId = builder.regionId;
        this.resultType = builder.resultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocParserJobResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    public static final class Builder extends Request.Builder<DescribeDocParserJobResultRequest, Builder> {
        private String agentName; 
        private String jobId; 
        private String regionId; 
        private String resultType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDocParserJobResultRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.jobId = request.jobId;
            this.regionId = request.regionId;
            this.resultType = request.resultType;
        } 

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job_abc123</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResultType.
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        @Override
        public DescribeDocParserJobResultRequest build() {
            return new DescribeDocParserJobResultRequest(this);
        } 

    } 

}
