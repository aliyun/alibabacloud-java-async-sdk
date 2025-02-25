// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsTasksResponseBody</p>
 */
public class DescribeDrdsTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tasks")
    private Tasks tasks;

    private DescribeDrdsTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private Tasks tasks; 

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Indicates information about the tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public DescribeDrdsTasksResponseBody build() {
            return new DescribeDrdsTasksResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Id")
        private Long id;

        @NameInMap("State")
        private String state;

        private Task(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String content; 
            private Long id; 
            private String state; 

            /**
             * Indicates the content of a task.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Indicates the ID of the task.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates the state of the task.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("Task")
        private java.util.List < Task> task;

        private Tasks(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List < Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List < Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List < Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
