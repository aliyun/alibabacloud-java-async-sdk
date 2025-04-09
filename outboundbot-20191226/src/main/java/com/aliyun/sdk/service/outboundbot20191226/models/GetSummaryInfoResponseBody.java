// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetSummaryInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSummaryInfoResponseBody</p>
 */
public class GetSummaryInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentBotInstanceSummaryList")
    private java.util.List<AgentBotInstanceSummaryList> agentBotInstanceSummaryList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSummaryInfoResponseBody(Builder builder) {
        this.agentBotInstanceSummaryList = builder.agentBotInstanceSummaryList;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSummaryInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentBotInstanceSummaryList
     */
    public java.util.List<AgentBotInstanceSummaryList> getAgentBotInstanceSummaryList() {
        return this.agentBotInstanceSummaryList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<AgentBotInstanceSummaryList> agentBotInstanceSummaryList; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSummaryInfoResponseBody model) {
            this.agentBotInstanceSummaryList = model.agentBotInstanceSummaryList;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AgentBotInstanceSummaryList.
         */
        public Builder agentBotInstanceSummaryList(java.util.List<AgentBotInstanceSummaryList> agentBotInstanceSummaryList) {
            this.agentBotInstanceSummaryList = agentBotInstanceSummaryList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSummaryInfoResponseBody build() {
            return new GetSummaryInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSummaryInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetSummaryInfoResponseBody</p>
     */
    public static class AgentBotInstanceSummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TotalCallCount")
        private Long totalCallCount;

        @com.aliyun.core.annotation.NameInMap("TotalCallTime")
        private Long totalCallTime;

        @com.aliyun.core.annotation.NameInMap("UsedRecordingStorageSpace")
        private Integer usedRecordingStorageSpace;

        private AgentBotInstanceSummaryList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.totalCallCount = builder.totalCallCount;
            this.totalCallTime = builder.totalCallTime;
            this.usedRecordingStorageSpace = builder.usedRecordingStorageSpace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentBotInstanceSummaryList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return totalCallCount
         */
        public Long getTotalCallCount() {
            return this.totalCallCount;
        }

        /**
         * @return totalCallTime
         */
        public Long getTotalCallTime() {
            return this.totalCallTime;
        }

        /**
         * @return usedRecordingStorageSpace
         */
        public Integer getUsedRecordingStorageSpace() {
            return this.usedRecordingStorageSpace;
        }

        public static final class Builder {
            private String instanceId; 
            private Long totalCallCount; 
            private Long totalCallTime; 
            private Integer usedRecordingStorageSpace; 

            private Builder() {
            } 

            private Builder(AgentBotInstanceSummaryList model) {
                this.instanceId = model.instanceId;
                this.totalCallCount = model.totalCallCount;
                this.totalCallTime = model.totalCallTime;
                this.usedRecordingStorageSpace = model.usedRecordingStorageSpace;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TotalCallCount.
             */
            public Builder totalCallCount(Long totalCallCount) {
                this.totalCallCount = totalCallCount;
                return this;
            }

            /**
             * TotalCallTime.
             */
            public Builder totalCallTime(Long totalCallTime) {
                this.totalCallTime = totalCallTime;
                return this;
            }

            /**
             * UsedRecordingStorageSpace.
             */
            public Builder usedRecordingStorageSpace(Integer usedRecordingStorageSpace) {
                this.usedRecordingStorageSpace = usedRecordingStorageSpace;
                return this;
            }

            public AgentBotInstanceSummaryList build() {
                return new AgentBotInstanceSummaryList(this);
            } 

        } 

    }
}
