// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobRequest</p>
 */
public class DescribeJobRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("WithScript")
    private Boolean withScript;

    private DescribeJobRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.withScript = builder.withScript;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobRequest create() {
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
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return withScript
     */
    public Boolean getWithScript() {
        return this.withScript;
    }

    public static final class Builder extends Request.Builder<DescribeJobRequest, Builder> {
        private String instanceId; 
        private String jobId; 
        private Boolean withScript; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.withScript = request.withScript;
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
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * WithScript.
         */
        public Builder withScript(Boolean withScript) {
            this.putQueryParameter("WithScript", withScript);
            this.withScript = withScript;
            return this;
        }

        @Override
        public DescribeJobRequest build() {
            return new DescribeJobRequest(this);
        } 

    } 

}
