// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ClaimCallRequest} extends {@link RequestModel}
 *
 * <p>ClaimCallRequest</p>
 */
public class ClaimCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CandidateUserListJson")
    private String candidateUserListJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ClaimCallRequest(Builder builder) {
        super(builder);
        this.candidateUserListJson = builder.candidateUserListJson;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.skillGroupId = builder.skillGroupId;
        this.tags = builder.tags;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClaimCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return candidateUserListJson
     */
    public String getCandidateUserListJson() {
        return this.candidateUserListJson;
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
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ClaimCallRequest, Builder> {
        private String candidateUserListJson; 
        private String instanceId; 
        private String jobId; 
        private String skillGroupId; 
        private String tags; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ClaimCallRequest request) {
            super(request);
            this.candidateUserListJson = request.candidateUserListJson;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.skillGroupId = request.skillGroupId;
            this.tags = request.tags;
            this.userId = request.userId;
        } 

        /**
         * <p>A JSON string that lists the agents and their corresponding skill groups eligible to claim the call.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         * {
         * &quot;f0&quot;: &quot;zeren001@report-test-2&quot;,
         * &quot;f1&quot;: &quot;desktop-voip-box@report-test-2&quot;
         * }
         * ]</p>
         */
        public Builder candidateUserListJson(String candidateUserListJson) {
            this.putQueryParameter("CandidateUserListJson", candidateUserListJson);
            this.candidateUserListJson = candidateUserListJson;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the call.</p>
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
         * <p>The ID of the skill group that the call is assigned to.</p>
         * 
         * <strong>example:</strong>
         * <p>test_sg_****@ccc-test</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>A unique business identifier for scheduling purposes. Subsequent event notifications include this identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>tags</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the agent claiming the call.</p>
         * 
         * <strong>example:</strong>
         * <p>invoker@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ClaimCallRequest build() {
            return new ClaimCallRequest(this);
        } 

    } 

}
