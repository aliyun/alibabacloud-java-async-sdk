// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetAliYunSafeCenterResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAliYunSafeCenterResultResponseBody</p>
 */
public class GetAliYunSafeCenterResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAliYunSafeCenterResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliYunSafeCenterResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAliYunSafeCenterResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>200: Success. Other values (500, 400, etc.): Error codes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3C107939-59BD-5EB9-B250-39559C830A85</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current API call is successful. Valid values: True/False. This does not indicate the success of subsequent business operations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAliYunSafeCenterResultResponseBody build() {
            return new GetAliYunSafeCenterResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAliYunSafeCenterResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private Boolean agentStatus;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceStatus")
        private Boolean ecsInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<Long> instanceIds;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SwasInstanceStatus")
        private Boolean swasInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Boolean taskStatus;

        private Data(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.ecsInstanceStatus = builder.ecsInstanceStatus;
            this.instanceIds = builder.instanceIds;
            this.requestId = builder.requestId;
            this.swasInstanceStatus = builder.swasInstanceStatus;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public Boolean getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return ecsInstanceStatus
         */
        public Boolean getEcsInstanceStatus() {
            return this.ecsInstanceStatus;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<Long> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return swasInstanceStatus
         */
        public Boolean getSwasInstanceStatus() {
            return this.swasInstanceStatus;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public Boolean getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private Boolean agentStatus; 
            private Boolean ecsInstanceStatus; 
            private java.util.List<Long> instanceIds; 
            private String requestId; 
            private Boolean swasInstanceStatus; 
            private Long taskId; 
            private Boolean taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentStatus = model.agentStatus;
                this.ecsInstanceStatus = model.ecsInstanceStatus;
                this.instanceIds = model.instanceIds;
                this.requestId = model.requestId;
                this.swasInstanceStatus = model.swasInstanceStatus;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The status of the Security Center Agent.</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder agentStatus(Boolean agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>The running status of the ECS instance.</p>
             * <ul>
             * <li><strong>true</strong>: Running.</li>
             * <li><strong>false</strong>: Not running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ecsInstanceStatus(Boolean ecsInstanceStatus) {
                this.ecsInstanceStatus = ecsInstanceStatus;
                return this;
            }

            /**
             * <p>The list of instance IDs of identical security alert events in Security Center.</p>
             */
            public Builder instanceIds(java.util.List<Long> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8169D779-3391-541F-936B-11F4EC09AD0D</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The running status of the simple application server.</p>
             * <ul>
             * <li><strong>true</strong>: Running.</li>
             * <li><strong>false</strong>: Not running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder swasInstanceStatus(Boolean swasInstanceStatus) {
                this.swasInstanceStatus = swasInstanceStatus;
                return this;
            }

            /**
             * <p>The task ID for querying security alerting events triggered by the same rule or alerting type.</p>
             * 
             * <strong>example:</strong>
             * <p>12313123</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Indicates whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty.</p>
             * <ul>
             * <li><strong>true</strong>: Empty.</li>
             * <li><strong>false</strong>: Not empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder taskStatus(Boolean taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
