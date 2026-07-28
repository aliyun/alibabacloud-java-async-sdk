// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link ChatAiAgentRequest} extends {@link RequestModel}
 *
 * <p>ChatAiAgentRequest</p>
 */
public class ChatAiAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hitlDecisions")
    private java.util.List<HitlDecisions> hitlDecisions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refs")
    private Refs refs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userMessage")
    private String userMessage;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ChatAiAgentRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.hitlDecisions = builder.hitlDecisions;
        this.refs = builder.refs;
        this.sessionId = builder.sessionId;
        this.userMessage = builder.userMessage;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatAiAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return hitlDecisions
     */
    public java.util.List<HitlDecisions> getHitlDecisions() {
        return this.hitlDecisions;
    }

    /**
     * @return refs
     */
    public Refs getRefs() {
        return this.refs;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return userMessage
     */
    public String getUserMessage() {
        return this.userMessage;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ChatAiAgentRequest, Builder> {
        private String namespace; 
        private java.util.List<HitlDecisions> hitlDecisions; 
        private Refs refs; 
        private String sessionId; 
        private String userMessage; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ChatAiAgentRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.hitlDecisions = request.hitlDecisions;
            this.refs = request.refs;
            this.sessionId = request.sessionId;
            this.userMessage = request.userMessage;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-flink-bigdata-default</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * hitlDecisions.
         */
        public Builder hitlDecisions(java.util.List<HitlDecisions> hitlDecisions) {
            this.putBodyParameter("hitlDecisions", hitlDecisions);
            this.hitlDecisions = hitlDecisions;
            return this;
        }

        /**
         * refs.
         */
        public Builder refs(Refs refs) {
            this.putBodyParameter("refs", refs);
            this.refs = refs;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * userMessage.
         */
        public Builder userMessage(String userMessage) {
            this.putBodyParameter("userMessage", userMessage);
            this.userMessage = userMessage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>710d6a64d8****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ChatAiAgentRequest build() {
            return new ChatAiAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChatAiAgentRequest} extends {@link TeaModel}
     *
     * <p>ChatAiAgentRequest</p>
     */
    public static class HitlDecisions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("decision")
        private String decision;

        @com.aliyun.core.annotation.NameInMap("hitlId")
        private String hitlId;

        private HitlDecisions(Builder builder) {
            this.decision = builder.decision;
            this.hitlId = builder.hitlId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitlDecisions create() {
            return builder().build();
        }

        /**
         * @return decision
         */
        public String getDecision() {
            return this.decision;
        }

        /**
         * @return hitlId
         */
        public String getHitlId() {
            return this.hitlId;
        }

        public static final class Builder {
            private String decision; 
            private String hitlId; 

            private Builder() {
            } 

            private Builder(HitlDecisions model) {
                this.decision = model.decision;
                this.hitlId = model.hitlId;
            } 

            /**
             * decision.
             */
            public Builder decision(String decision) {
                this.decision = decision;
                return this;
            }

            /**
             * hitlId.
             */
            public Builder hitlId(String hitlId) {
                this.hitlId = hitlId;
                return this;
            }

            public HitlDecisions build() {
                return new HitlDecisions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatAiAgentRequest} extends {@link TeaModel}
     *
     * <p>ChatAiAgentRequest</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploymentId")
        private String deploymentId;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        private Jobs(Builder builder) {
            this.deploymentId = builder.deploymentId;
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return deploymentId
         */
        public String getDeploymentId() {
            return this.deploymentId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        public static final class Builder {
            private String deploymentId; 
            private String jobId; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.deploymentId = model.deploymentId;
                this.jobId = model.jobId;
            } 

            /**
             * <p>Deployment ID</p>
             * 
             * <strong>example:</strong>
             * <p>2a63abb7-7ae7-4902-9970-fe5cff4bd7c1</p>
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * <p>Job ID</p>
             * 
             * <strong>example:</strong>
             * <p>ccb853c3-1d5a-438d-bf98-346815ad875a</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatAiAgentRequest} extends {@link TeaModel}
     *
     * <p>ChatAiAgentRequest</p>
     */
    public static class Refs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobs")
        private java.util.List<Jobs> jobs;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<String> skills;

        private Refs(Builder builder) {
            this.jobs = builder.jobs;
            this.skills = builder.skills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Refs create() {
            return builder().build();
        }

        /**
         * @return jobs
         */
        public java.util.List<Jobs> getJobs() {
            return this.jobs;
        }

        /**
         * @return skills
         */
        public java.util.List<String> getSkills() {
            return this.skills;
        }

        public static final class Builder {
            private java.util.List<Jobs> jobs; 
            private java.util.List<String> skills; 

            private Builder() {
            } 

            private Builder(Refs model) {
                this.jobs = model.jobs;
                this.skills = model.skills;
            } 

            /**
             * jobs.
             */
            public Builder jobs(java.util.List<Jobs> jobs) {
                this.jobs = jobs;
                return this;
            }

            /**
             * skills.
             */
            public Builder skills(java.util.List<String> skills) {
                this.skills = skills;
                return this;
            }

            public Refs build() {
                return new Refs(this);
            } 

        } 

    }
}
