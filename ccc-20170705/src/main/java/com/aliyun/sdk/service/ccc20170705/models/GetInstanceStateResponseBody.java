// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceStateResponseBody</p>
 */
public class GetInstanceStateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RealTimeInstanceState")
    private RealTimeInstanceState realTimeInstanceState;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class AgentStateCount extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("State")
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
    public static class AgentStateDistributions extends TeaModel {
        @NameInMap("AgentStateCount")
        private java.util.List < AgentStateCount> agentStateCount;

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
        public java.util.List < AgentStateCount> getAgentStateCount() {
            return this.agentStateCount;
        }

        public static final class Builder {
            private java.util.List < AgentStateCount> agentStateCount; 

            /**
             * AgentStateCount.
             */
            public Builder agentStateCount(java.util.List < AgentStateCount> agentStateCount) {
                this.agentStateCount = agentStateCount;
                return this;
            }

            public AgentStateDistributions build() {
                return new AgentStateDistributions(this);
            } 

        } 

    }
    public static class RealTimeInstanceState extends TeaModel {
        @NameInMap("AgentStateDistributions")
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
