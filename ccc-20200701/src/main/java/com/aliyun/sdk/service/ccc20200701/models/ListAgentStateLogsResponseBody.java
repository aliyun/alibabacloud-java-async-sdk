// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListAgentStateLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentStateLogsResponseBody</p>
 */
public class ListAgentStateLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAgentStateLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentStateLogsResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAgentStateLogsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>943D8EF3-3321-471F-A104-51C96FCA94D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentStateLogsResponseBody build() {
            return new ListAgentStateLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentStateLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentStateLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("OutboundScenario")
        private Boolean outboundScenario;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StateCode")
        private String stateCode;

        @com.aliyun.core.annotation.NameInMap("WorkMode")
        private String workMode;

        private Data(Builder builder) {
            this.breakCode = builder.breakCode;
            this.duration = builder.duration;
            this.outboundScenario = builder.outboundScenario;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.stateCode = builder.stateCode;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return breakCode
         */
        public String getBreakCode() {
            return this.breakCode;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return outboundScenario
         */
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateCode
         */
        public String getStateCode() {
            return this.stateCode;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String breakCode; 
            private Long duration; 
            private Boolean outboundScenario; 
            private Long startTime; 
            private String state; 
            private String stateCode; 
            private String workMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.breakCode = model.breakCode;
                this.duration = model.duration;
                this.outboundScenario = model.outboundScenario;
                this.startTime = model.startTime;
                this.state = model.state;
                this.stateCode = model.stateCode;
                this.workMode = model.workMode;
            } 

            /**
             * <p>Break code.</p>
             * 
             * <strong>example:</strong>
             * <p>会议</p>
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * <p>Duration of the status, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether the agent is in outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * <p>Start Time of the status, in UNIX timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620259200000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Status code.</p>
             * 
             * <strong>example:</strong>
             * <p>Break</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Sub-status, which provides additional details for the status code. In certain scenarios, an agent\&quot;s status is jointly identified by State and StateCode. For example, in a monitoring scenario, the State is Talking and the StateCode is Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_IN_BREAK</p>
             */
            public Builder stateCode(String stateCode) {
                this.stateCode = stateCode;
                return this;
            }

            /**
             * <p>Work mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ON_SITE</p>
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
