// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link TokenUsageDetailDTO} extends {@link TeaModel}
 *
 * <p>TokenUsageDetailDTO</p>
 */
public class TokenUsageDetailDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizObjects")
    private java.util.List<BizObjects> bizObjects;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("OccurredAt")
    private Long occurredAt;

    @com.aliyun.core.annotation.NameInMap("ScopeConfig")
    private ScopeConfig scopeConfig;

    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private String scopeType;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalJobs")
    private Integer totalJobs;

    @com.aliyun.core.annotation.NameInMap("TotalTokens")
    private Long totalTokens;

    @com.aliyun.core.annotation.NameInMap("TriggerSource")
    private String triggerSource;

    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private TokenUsageDetailDTO(Builder builder) {
        this.bizObjects = builder.bizObjects;
        this.namespace = builder.namespace;
        this.occurredAt = builder.occurredAt;
        this.scopeConfig = builder.scopeConfig;
        this.scopeType = builder.scopeType;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
        this.totalJobs = builder.totalJobs;
        this.totalTokens = builder.totalTokens;
        this.triggerSource = builder.triggerSource;
        this.usageType = builder.usageType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TokenUsageDetailDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizObjects
     */
    public java.util.List<BizObjects> getBizObjects() {
        return this.bizObjects;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return occurredAt
     */
    public Long getOccurredAt() {
        return this.occurredAt;
    }

    /**
     * @return scopeConfig
     */
    public ScopeConfig getScopeConfig() {
        return this.scopeConfig;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalJobs
     */
    public Integer getTotalJobs() {
        return this.totalJobs;
    }

    /**
     * @return totalTokens
     */
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * @return triggerSource
     */
    public String getTriggerSource() {
        return this.triggerSource;
    }

    /**
     * @return usageType
     */
    public String getUsageType() {
        return this.usageType;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private java.util.List<BizObjects> bizObjects; 
        private String namespace; 
        private Long occurredAt; 
        private ScopeConfig scopeConfig; 
        private String scopeType; 
        private String sessionId; 
        private String status; 
        private Integer totalJobs; 
        private Long totalTokens; 
        private String triggerSource; 
        private String usageType; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(TokenUsageDetailDTO model) {
            this.bizObjects = model.bizObjects;
            this.namespace = model.namespace;
            this.occurredAt = model.occurredAt;
            this.scopeConfig = model.scopeConfig;
            this.scopeType = model.scopeType;
            this.sessionId = model.sessionId;
            this.status = model.status;
            this.totalJobs = model.totalJobs;
            this.totalTokens = model.totalTokens;
            this.triggerSource = model.triggerSource;
            this.usageType = model.usageType;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The associated items of the intelligent assistant, such as jobs and deployments.</p>
         */
        public Builder bizObjects(java.util.List<BizObjects> bizObjects) {
            this.bizObjects = bizObjects;
            return this;
        }

        /**
         * <p>namespace</p>
         * 
         * <strong>example:</strong>
         * <p>test-default</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The time when the request is initiated, in epoch milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790651783392</p>
         */
        public Builder occurredAt(Long occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }

        /**
         * <p>The inspection configuration.</p>
         */
        public Builder scopeConfig(ScopeConfig scopeConfig) {
            this.scopeConfig = scopeConfig;
            return this;
        }

        /**
         * <p>The inspection type.</p>
         * 
         * <strong>example:</strong>
         * <p>TAG</p>
         */
        public Builder scopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }

        /**
         * <p>The session ID shared across multiple requests in the same session.</p>
         * 
         * <strong>example:</strong>
         * <p>conv_1790651642778_azcvjyh</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The request status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of jobs covered by the inspection.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }

        /**
         * <p>The number of tokens consumed by this request.</p>
         * 
         * <strong>example:</strong>
         * <p>1287</p>
         */
        public Builder totalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        /**
         * <p>The request trigger type, such as cron or manual.</p>
         * 
         * <strong>example:</strong>
         * <p>CRON</p>
         */
        public Builder triggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }

        /**
         * <p>The token consumption scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>ai_assistant</p>
         */
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            return this;
        }

        /**
         * <p>workspace</p>
         * 
         * <strong>example:</strong>
         * <p>c278e83dff5b41</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public TokenUsageDetailDTO build() {
            return new TokenUsageDetailDTO(this);
        } 

    } 

    /**
     * 
     * {@link TokenUsageDetailDTO} extends {@link TeaModel}
     *
     * <p>TokenUsageDetailDTO</p>
     */
    public static class BizObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BizObjects(Builder builder) {
            this.id = builder.id;
            this.kind = builder.kind;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizObjects create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String kind; 
            private String name; 

            private Builder() {
            } 

            private Builder(BizObjects model) {
                this.id = model.id;
                this.kind = model.kind;
                this.name = model.name;
            } 

            /**
             * <p>The ID of the associated item.</p>
             * 
             * <strong>example:</strong>
             * <p>4c9102f7-51d2-4494-9ea2-468e3c407ad8</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the associated item.</p>
             * 
             * <strong>example:</strong>
             * <p>deployment</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The name of the associated item.</p>
             * 
             * <strong>example:</strong>
             * <p>deployemnt-draft</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BizObjects build() {
                return new BizObjects(this);
            } 

        } 

    }
    /**
     * 
     * {@link TokenUsageDetailDTO} extends {@link TeaModel}
     *
     * <p>TokenUsageDetailDTO</p>
     */
    public static class ScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentIds")
        private java.util.List<String> deploymentIds;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, java.util.List<String>> tags;

        private ScopeConfig(Builder builder) {
            this.deploymentIds = builder.deploymentIds;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeConfig create() {
            return builder().build();
        }

        /**
         * @return deploymentIds
         */
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> deploymentIds; 
            private java.util.Map<String, java.util.List<String>> tags; 

            private Builder() {
            } 

            private Builder(ScopeConfig model) {
                this.deploymentIds = model.deploymentIds;
                this.tags = model.tags;
            } 

            /**
             * <p>The list of deployments selected for inspection.</p>
             */
            public Builder deploymentIds(java.util.List<String> deploymentIds) {
                this.deploymentIds = deploymentIds;
                return this;
            }

            /**
             * <p>The tag configuration selected for inspection.</p>
             */
            public Builder tags(java.util.Map<String, java.util.List<String>> tags) {
                this.tags = tags;
                return this;
            }

            public ScopeConfig build() {
                return new ScopeConfig(this);
            } 

        } 

    }
}
