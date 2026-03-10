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
 * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMemoriesResponseBody</p>
 */
public class SearchMemoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("relations")
    private java.util.List<Relations> relations;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    private SearchMemoriesResponseBody(Builder builder) {
        this.relations = builder.relations;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMemoriesResponseBody create() {
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

        private Builder(SearchMemoriesResponseBody model) {
            this.relations = model.relations;
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * relations.
         */
        public Builder relations(java.util.List<Relations> relations) {
            this.relations = relations;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public SearchMemoriesResponseBody build() {
            return new SearchMemoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
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
             * destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * relationship.
             */
            public Builder relationship(String relationship) {
                this.relationship = relationship;
                return this;
            }

            /**
             * source.
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
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actorId")
        private String actorId;

        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private String metadata;

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
        public String getMetadata() {
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
            private String createdAt; 
            private String hash; 
            private String id; 
            private String memory; 
            private String metadata; 
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
             * actorId.
             */
            public Builder actorId(String actorId) {
                this.actorId = actorId;
                return this;
            }

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * hash.
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * runId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * userId.
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
