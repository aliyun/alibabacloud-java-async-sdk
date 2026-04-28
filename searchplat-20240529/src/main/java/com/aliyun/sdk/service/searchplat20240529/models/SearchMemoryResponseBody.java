// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link SearchMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMemoryResponseBody</p>
 */
public class SearchMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private SearchMemoryResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private String status; 

        private Builder() {
        } 

        private Builder(SearchMemoryResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SearchMemoryResponseBody build() {
            return new SearchMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoryResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agent_id")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("memory_id")
        private String memoryId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private Results(Builder builder) {
            this.agentId = builder.agentId;
            this.memory = builder.memory;
            this.memoryId = builder.memoryId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String memory; 
            private String memoryId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.agentId = model.agentId;
                this.memory = model.memory;
                this.memoryId = model.memoryId;
                this.userId = model.userId;
            } 

            /**
             * agent_id.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
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
             * memory_id.
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            /**
             * user_id.
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
    /**
     * 
     * {@link SearchMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoryResponseBody</p>
     */
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Memory(Builder builder) {
            this.results = builder.results;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Results> results; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Memory model) {
                this.results = model.results;
                this.total = model.total;
            } 

            /**
             * results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoryResponseBody</p>
     */
    public static class SkillResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agent_id")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("skill_id")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private SkillResults(Builder builder) {
            this.agentId = builder.agentId;
            this.description = builder.description;
            this.name = builder.name;
            this.skillId = builder.skillId;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillResults create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agentId; 
            private String description; 
            private String name; 
            private String skillId; 
            private String userId; 
            private String version; 

            private Builder() {
            } 

            private Builder(SkillResults model) {
                this.agentId = model.agentId;
                this.description = model.description;
                this.name = model.name;
                this.skillId = model.skillId;
                this.userId = model.userId;
                this.version = model.version;
            } 

            /**
             * agent_id.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * skill_id.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SkillResults build() {
                return new SkillResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoryResponseBody</p>
     */
    public static class Skill extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List<SkillResults> results;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Skill(Builder builder) {
            this.results = builder.results;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skill create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List<SkillResults> getResults() {
            return this.results;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<SkillResults> results; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Skill model) {
                this.results = model.results;
                this.total = model.total;
            } 

            /**
             * results.
             */
            public Builder results(java.util.List<SkillResults> results) {
                this.results = results;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Skill build() {
                return new Skill(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoryResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memory")
        private Memory memory;

        @com.aliyun.core.annotation.NameInMap("skill")
        private Skill skill;

        private Result(Builder builder) {
            this.memory = builder.memory;
            this.skill = builder.skill;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return memory
         */
        public Memory getMemory() {
            return this.memory;
        }

        /**
         * @return skill
         */
        public Skill getSkill() {
            return this.skill;
        }

        public static final class Builder {
            private Memory memory; 
            private Skill skill; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.memory = model.memory;
                this.skill = model.skill;
            } 

            /**
             * memory.
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * skill.
             */
            public Builder skill(Skill skill) {
                this.skill = skill;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
