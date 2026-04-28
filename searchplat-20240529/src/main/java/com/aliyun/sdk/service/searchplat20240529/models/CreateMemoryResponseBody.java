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
 * {@link CreateMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMemoryResponseBody</p>
 */
public class CreateMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreateMemoryResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryResponseBody create() {
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

        private Builder(CreateMemoryResponseBody model) {
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

        public CreateMemoryResponseBody build() {
            return new CreateMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryResponseBody</p>
     */
    public static class Memory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        private Memory(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String taskId; 

            private Builder() {
            } 

            private Builder(Memory model) {
                this.taskId = model.taskId;
            } 

            /**
             * task_id.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryResponseBody</p>
     */
    public static class Skill extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        private Skill(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skill create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String taskId; 

            private Builder() {
            } 

            private Builder(Skill model) {
                this.taskId = model.taskId;
            } 

            /**
             * task_id.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Skill build() {
                return new Skill(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryResponseBody</p>
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
