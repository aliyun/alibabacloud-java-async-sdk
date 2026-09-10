// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetMemoriesResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoriesResponseBody</p>
 */
public class GetMemoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("relations")
    private java.util.List<Relations> relations;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    private GetMemoriesResponseBody(Builder builder) {
        this.relations = builder.relations;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relations
     */
    public java.util.List<Relations> getRelations() {
        return this.relations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private java.util.List<Relations> relations; 
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(GetMemoriesResponseBody model) {
            this.relations = model.relations;
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>A list of relations.</p>
         */
        public Builder relations(java.util.List<Relations> relations) {
            this.relations = relations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public GetMemoriesResponseBody build() {
            return new GetMemoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoriesResponseBody</p>
     */
    public static class Relations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("relationship")
        private String relationship;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private Relations(Builder builder) {
            this.destination = builder.destination;
            this.relationship = builder.relationship;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Relations create() {
            return builder().build();
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return relationship
         */
        public String getRelationship() {
            return this.relationship;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String destination; 
            private String relationship; 
            private String source; 

            private Builder() {
            } 

            private Builder(Relations model) {
                this.destination = model.destination;
                this.relationship = model.relationship;
                this.source = model.source;
            } 

            /**
             * <p>The destination of the relation.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>The type of the relation.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder relationship(String relationship) {
                this.relationship = relationship;
                return this;
            }

            /**
             * <p>The source of the relation.</p>
             * 
             * <strong>example:</strong>
             * <p>test_namespace/RegistryModule-test2153b9f3-0be6-455e-9efd-05fd31f62885/alicloud</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Relations build() {
                return new Relations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoriesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actorId")
        private String actorId;

        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Results(Builder builder) {
            this.actorId = builder.actorId;
            this.agentId = builder.agentId;
            this.appId = builder.appId;
            this.createdAt = builder.createdAt;
            this.hash = builder.hash;
            this.id = builder.id;
            this.memory = builder.memory;
            this.metadata = builder.metadata;
            this.role = builder.role;
            this.runId = builder.runId;
            this.score = builder.score;
            this.updatedAt = builder.updatedAt;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return actorId
         */
        public String getActorId() {
            return this.actorId;
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actorId; 
            private String agentId; 
            private String appId; 
            private String createdAt; 
            private String hash; 
            private String id; 
            private String memory; 
            private java.util.Map<String, ?> metadata; 
            private String role; 
            private String runId; 
            private Double score; 
            private String updatedAt; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.actorId = model.actorId;
                this.agentId = model.agentId;
                this.appId = model.appId;
                this.createdAt = model.createdAt;
                this.hash = model.hash;
                this.id = model.id;
                this.memory = model.memory;
                this.metadata = model.metadata;
                this.role = model.role;
                this.runId = model.runId;
                this.score = model.score;
                this.updatedAt = model.updatedAt;
                this.userId = model.userId;
            } 

            /**
             * <p>The actor ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test_session_001</p>
             */
            public Builder actorId(String actorId) {
                this.actorId = actorId;
                return this;
            }

            /**
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>980565235819266048</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user_001</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1747623093939</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The memory hash.</p>
             * 
             * <strong>example:</strong>
             * <p>73ad89f2d56c2f8615e5dd0cef7b4c41c074277c91fa0e31fc5b41802c0481f2</p>
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * <p>The memory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>019ca1e5-7307-7d50-b943-5e628326a8ed</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The memory content.</p>
             * 
             * <strong>example:</strong>
             * <p>My name is Zhang San and I live in Hangzhou.</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;<strong>strategy_type</strong>&quot;:&quot;Fact&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The role that sent the message.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>jr-965a0b00cb42a43b</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The similarity score.</p>
             * 
             * <strong>example:</strong>
             * <p>30.12</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1752825865045</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test_session_001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
