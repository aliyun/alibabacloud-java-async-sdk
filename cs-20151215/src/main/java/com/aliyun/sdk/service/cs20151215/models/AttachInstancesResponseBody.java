// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>AttachInstancesResponseBody</p>
 */
public class AttachInstancesResponseBody extends TeaModel {
    @NameInMap("list")
    private java.util.List < List> list;

    @NameInMap("task_id")
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
         * 节点信息列表。
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * 任务ID。
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
        @NameInMap("code")
        private String code;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("message")
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
             * 状态码。
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 实例ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 添加结果描述。
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
