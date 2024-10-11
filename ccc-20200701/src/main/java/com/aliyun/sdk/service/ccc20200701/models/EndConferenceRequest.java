// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EndConferenceRequest} extends {@link RequestModel}
 *
 * <p>EndConferenceRequest</p>
 */
public class EndConferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private EndConferenceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndConferenceRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<EndConferenceRequest, Builder> {
        private String instanceId; 
        private String jobId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(EndConferenceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
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
         * <p>job-6538214103685****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public EndConferenceRequest build() {
            return new EndConferenceRequest(this);
        } 

    } 

}
