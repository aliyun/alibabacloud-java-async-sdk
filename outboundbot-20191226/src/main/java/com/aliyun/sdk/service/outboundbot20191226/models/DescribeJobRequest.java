// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobRequest</p>
 */
public class DescribeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithScript")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c8a2b7f2-ad1a-4865-b872-d0080d9802d9</p>
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
