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
 * {@link GetRealtimeCampaignStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeCampaignStatsResponseBody</p>
 */
public class GetRealtimeCampaignStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRealtimeCampaignStatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeCampaignStatsResponseBody create() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRealtimeCampaignStatsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
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
        public Builder data(Data data) {
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
         * <p>42970829-E2C8-515A-8F42-5A6B59F852A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRealtimeCampaignStatsResponseBody build() {
            return new GetRealtimeCampaignStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRealtimeCampaignStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRealtimeCampaignStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakingAgents")
        private Long breakingAgents;

        @com.aliyun.core.annotation.NameInMap("Caps")
        private Long caps;

        @com.aliyun.core.annotation.NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioBreakingAgents")
        private Long outboundScenarioBreakingAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioReadyAgents")
        private Long outboundScenarioReadyAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioTalkingAgents")
        private Long outboundScenarioTalkingAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioWorkingAgents")
        private Long outboundScenarioWorkingAgents;

        @com.aliyun.core.annotation.NameInMap("ReadyAgents")
        private Long readyAgents;

        @com.aliyun.core.annotation.NameInMap("TalkingAgents")
        private Long talkingAgents;

        @com.aliyun.core.annotation.NameInMap("TotalAgents")
        private Long totalAgents;

        @com.aliyun.core.annotation.NameInMap("WorkingAgents")
        private Long workingAgents;

        private Data(Builder builder) {
            this.breakingAgents = builder.breakingAgents;
            this.caps = builder.caps;
            this.loggedInAgents = builder.loggedInAgents;
            this.outboundScenarioBreakingAgents = builder.outboundScenarioBreakingAgents;
            this.outboundScenarioReadyAgents = builder.outboundScenarioReadyAgents;
            this.outboundScenarioTalkingAgents = builder.outboundScenarioTalkingAgents;
            this.outboundScenarioWorkingAgents = builder.outboundScenarioWorkingAgents;
            this.readyAgents = builder.readyAgents;
            this.talkingAgents = builder.talkingAgents;
            this.totalAgents = builder.totalAgents;
            this.workingAgents = builder.workingAgents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return breakingAgents
         */
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        /**
         * @return caps
         */
        public Long getCaps() {
            return this.caps;
        }

        /**
         * @return loggedInAgents
         */
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        /**
         * @return outboundScenarioBreakingAgents
         */
        public Long getOutboundScenarioBreakingAgents() {
            return this.outboundScenarioBreakingAgents;
        }

        /**
         * @return outboundScenarioReadyAgents
         */
        public Long getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
        }

        /**
         * @return outboundScenarioTalkingAgents
         */
        public Long getOutboundScenarioTalkingAgents() {
            return this.outboundScenarioTalkingAgents;
        }

        /**
         * @return outboundScenarioWorkingAgents
         */
        public Long getOutboundScenarioWorkingAgents() {
            return this.outboundScenarioWorkingAgents;
        }

        /**
         * @return readyAgents
         */
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        /**
         * @return talkingAgents
         */
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        /**
         * @return totalAgents
         */
        public Long getTotalAgents() {
            return this.totalAgents;
        }

        /**
         * @return workingAgents
         */
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

        public static final class Builder {
            private Long breakingAgents; 
            private Long caps; 
            private Long loggedInAgents; 
            private Long outboundScenarioBreakingAgents; 
            private Long outboundScenarioReadyAgents; 
            private Long outboundScenarioTalkingAgents; 
            private Long outboundScenarioWorkingAgents; 
            private Long readyAgents; 
            private Long talkingAgents; 
            private Long totalAgents; 
            private Long workingAgents; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.breakingAgents = model.breakingAgents;
                this.caps = model.caps;
                this.loggedInAgents = model.loggedInAgents;
                this.outboundScenarioBreakingAgents = model.outboundScenarioBreakingAgents;
                this.outboundScenarioReadyAgents = model.outboundScenarioReadyAgents;
                this.outboundScenarioTalkingAgents = model.outboundScenarioTalkingAgents;
                this.outboundScenarioWorkingAgents = model.outboundScenarioWorkingAgents;
                this.readyAgents = model.readyAgents;
                this.talkingAgents = model.talkingAgents;
                this.totalAgents = model.totalAgents;
                this.workingAgents = model.workingAgents;
            } 

            /**
             * <p>Number of agents on break.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder breakingAgents(Long breakingAgents) {
                this.breakingAgents = breakingAgents;
                return this;
            }

            /**
             * <p>The number of concurrent calls per second. &quot;Concurrent&quot; means calls happening simultaneously.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder caps(Long caps) {
                this.caps = caps;
                return this;
            }

            /**
             * <p>Number of logged-in agents.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder loggedInAgents(Long loggedInAgents) {
                this.loggedInAgents = loggedInAgents;
                return this;
            }

            /**
             * <p>The number of agents in outbound-only mode who are on a break.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outboundScenarioBreakingAgents(Long outboundScenarioBreakingAgents) {
                this.outboundScenarioBreakingAgents = outboundScenarioBreakingAgents;
                return this;
            }

            /**
             * <p>The number of agents in outbound-only mode who are idle.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
                this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
                return this;
            }

            /**
             * <p>Number of agents in a call under outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outboundScenarioTalkingAgents(Long outboundScenarioTalkingAgents) {
                this.outboundScenarioTalkingAgents = outboundScenarioTalkingAgents;
                return this;
            }

            /**
             * <p>Number of agents in post-processing status under outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outboundScenarioWorkingAgents(Long outboundScenarioWorkingAgents) {
                this.outboundScenarioWorkingAgents = outboundScenarioWorkingAgents;
                return this;
            }

            /**
             * <p>Number of idle agents.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder readyAgents(Long readyAgents) {
                this.readyAgents = readyAgents;
                return this;
            }

            /**
             * <p>Number of agents in a call.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder talkingAgents(Long talkingAgents) {
                this.talkingAgents = talkingAgents;
                return this;
            }

            /**
             * <p>Total number of agents.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalAgents(Long totalAgents) {
                this.totalAgents = totalAgents;
                return this;
            }

            /**
             * <p>Number of agents in post-processing.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder workingAgents(Long workingAgents) {
                this.workingAgents = workingAgents;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
