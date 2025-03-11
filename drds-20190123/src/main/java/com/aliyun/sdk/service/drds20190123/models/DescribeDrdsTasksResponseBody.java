// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsTasksResponseBody</p>
 */
public class DescribeDrdsTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tasks")
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
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CD412DF7-F21D-44CE-88FF-ED24917174A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates information about the tasks.</p>
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public DescribeDrdsTasksResponseBody build() {
            return new DescribeDrdsTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsTasksResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>Indicates the content of a task.</p>
             * 
             * <strong>example:</strong>
             * <p>upgrade_instance</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Indicates the ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>64148</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates the state of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
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
    /**
     * 
     * {@link DescribeDrdsTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Task")
        private java.util.List<Task> task;

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
        public java.util.List<Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List<Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List<Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
