// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>AttachInstancesResponseBody</p>
 */
public class AttachInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private AttachInstancesResponseBody(Builder builder) {
        this.list = builder.list;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private String taskId; 

        /**
         * The details of the added nodes.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public AttachInstancesResponseBody build() {
            return new AttachInstancesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private List(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String instanceId; 
            private String message; 

            /**
             * The code that indicates the task result.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the ECS instance is successfully added to the ACK cluster.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
