// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link AttachRCInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>AttachRCInstancesResponseBody</p>
 */
public class AttachRCInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Responses")
    private java.util.List<Responses> responses;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private AttachRCInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.responses = builder.responses;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachRCInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responses
     */
    public java.util.List<Responses> getResponses() {
        return this.responses;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Responses> responses; 
        private String taskId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder responses(java.util.List<Responses> responses) {
            this.responses = responses;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>178968983</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public AttachRCInstancesResponseBody build() {
            return new AttachRCInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AttachRCInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>AttachRCInstancesResponseBody</p>
     */
    public static class Responses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Responses(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Responses create() {
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
             * <p>The HTTP status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-e2g521l55k038cr8****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The message returned.</p>
             * <blockquote>
             * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Responses build() {
                return new Responses(this);
            } 

        } 

    }
}
