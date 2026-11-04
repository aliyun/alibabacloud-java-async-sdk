// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetInstanceStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceStateResponseBody</p>
 */
public class GetInstanceStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RealTimeInstanceState")
    private RealTimeInstanceState realTimeInstanceState;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceStateResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.realTimeInstanceState = builder.realTimeInstanceState;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceStateResponseBody create() {
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
     * @return realTimeInstanceState
     */
    public RealTimeInstanceState getRealTimeInstanceState() {
        return this.realTimeInstanceState;
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
        private Integer httpStatusCode; 
        private String message; 
        private RealTimeInstanceState realTimeInstanceState; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceStateResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.realTimeInstanceState = model.realTimeInstanceState;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * RealTimeInstanceState.
         */
        public Builder realTimeInstanceState(RealTimeInstanceState realTimeInstanceState) {
            this.realTimeInstanceState = realTimeInstanceState;
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

        public GetInstanceStateResponseBody build() {
            return new GetInstanceStateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceStateResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceStateResponseBody</p>
     */
    public static class AgentStateCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private AgentStateCount(Builder builder) {
            this.count = builder.count;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStateCount create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long count; 
            private String state; 

            private Builder() {
            } 

            private Builder(AgentStateCount model) {
                this.count = model.count;
                this.state = model.state;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AgentStateCount build() {
                return new AgentStateCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceStateResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceStateResponseBody</p>
     */
    public static class AgentStateDistributions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStateCount")
        private java.util.List<AgentStateCount> agentStateCount;

        private AgentStateDistributions(Builder builder) {
            this.agentStateCount = builder.agentStateCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStateDistributions create() {
            return builder().build();
        }

        /**
         * @return agentStateCount
         */
        public java.util.List<AgentStateCount> getAgentStateCount() {
            return this.agentStateCount;
        }

        public static final class Builder {
            private java.util.List<AgentStateCount> agentStateCount; 

            private Builder() {
            } 

            private Builder(AgentStateDistributions model) {
                this.agentStateCount = model.agentStateCount;
            } 

            /**
             * AgentStateCount.
             */
            public Builder agentStateCount(java.util.List<AgentStateCount> agentStateCount) {
                this.agentStateCount = agentStateCount;
                return this;
            }

            public AgentStateDistributions build() {
                return new AgentStateDistributions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceStateResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceStateResponseBody</p>
     */
    public static class RealTimeInstanceState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStateDistributions")
        private AgentStateDistributions agentStateDistributions;

        private RealTimeInstanceState(Builder builder) {
            this.agentStateDistributions = builder.agentStateDistributions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeInstanceState create() {
            return builder().build();
        }

        /**
         * @return agentStateDistributions
         */
        public AgentStateDistributions getAgentStateDistributions() {
            return this.agentStateDistributions;
        }

        public static final class Builder {
            private AgentStateDistributions agentStateDistributions; 

            private Builder() {
            } 

            private Builder(RealTimeInstanceState model) {
                this.agentStateDistributions = model.agentStateDistributions;
            } 

            /**
             * AgentStateDistributions.
             */
            public Builder agentStateDistributions(AgentStateDistributions agentStateDistributions) {
                this.agentStateDistributions = agentStateDistributions;
                return this;
            }

            public RealTimeInstanceState build() {
                return new RealTimeInstanceState(this);
            } 

        } 

    }
}
