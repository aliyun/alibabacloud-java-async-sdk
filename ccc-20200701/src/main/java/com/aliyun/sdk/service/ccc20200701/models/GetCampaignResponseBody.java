// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCampaignResponseBody} extends {@link TeaModel}
 *
 * <p>GetCampaignResponseBody</p>
 */
public class GetCampaignResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    private GetCampaignResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCampaignResponseBody create() {
        return builder().build();
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
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Long httpStatusCode; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCampaignResponseBody build() {
            return new GetCampaignResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActualEndTime")
        private Long actualEndTime;

        @NameInMap("ActualStartTime")
        private Long actualStartTime;

        @NameInMap("CampaignId")
        private String campaignId;

        @NameInMap("CasesAborted")
        private Long casesAborted;

        @NameInMap("CasesConnected")
        private Long casesConnected;

        @NameInMap("CasesUncompleted")
        private Long casesUncompleted;

        @NameInMap("CasesUncompletedAfterAttempted")
        private Long casesUncompletedAfterAttempted;

        @NameInMap("MaxAttemptCount")
        private Long maxAttemptCount;

        @NameInMap("MinAttemptInterval")
        private Long minAttemptInterval;

        @NameInMap("Name")
        private String name;

        @NameInMap("PlanedEndTime")
        private Long planedEndTime;

        @NameInMap("PlanedStartTime")
        private Long planedStartTime;

        @NameInMap("QueueId")
        private String queueId;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("Simulation")
        private Boolean simulation;

        @NameInMap("SimulationParameters")
        private String simulationParameters;

        @NameInMap("State")
        private String state;

        @NameInMap("StrategyParameters")
        private String strategyParameters;

        @NameInMap("StrategyType")
        private String strategyType;

        @NameInMap("TotalCases")
        private Long totalCases;

        private Data(Builder builder) {
            this.actualEndTime = builder.actualEndTime;
            this.actualStartTime = builder.actualStartTime;
            this.campaignId = builder.campaignId;
            this.casesAborted = builder.casesAborted;
            this.casesConnected = builder.casesConnected;
            this.casesUncompleted = builder.casesUncompleted;
            this.casesUncompletedAfterAttempted = builder.casesUncompletedAfterAttempted;
            this.maxAttemptCount = builder.maxAttemptCount;
            this.minAttemptInterval = builder.minAttemptInterval;
            this.name = builder.name;
            this.planedEndTime = builder.planedEndTime;
            this.planedStartTime = builder.planedStartTime;
            this.queueId = builder.queueId;
            this.queueName = builder.queueName;
            this.simulation = builder.simulation;
            this.simulationParameters = builder.simulationParameters;
            this.state = builder.state;
            this.strategyParameters = builder.strategyParameters;
            this.strategyType = builder.strategyType;
            this.totalCases = builder.totalCases;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actualEndTime
         */
        public Long getActualEndTime() {
            return this.actualEndTime;
        }

        /**
         * @return actualStartTime
         */
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        /**
         * @return campaignId
         */
        public String getCampaignId() {
            return this.campaignId;
        }

        /**
         * @return casesAborted
         */
        public Long getCasesAborted() {
            return this.casesAborted;
        }

        /**
         * @return casesConnected
         */
        public Long getCasesConnected() {
            return this.casesConnected;
        }

        /**
         * @return casesUncompleted
         */
        public Long getCasesUncompleted() {
            return this.casesUncompleted;
        }

        /**
         * @return casesUncompletedAfterAttempted
         */
        public Long getCasesUncompletedAfterAttempted() {
            return this.casesUncompletedAfterAttempted;
        }

        /**
         * @return maxAttemptCount
         */
        public Long getMaxAttemptCount() {
            return this.maxAttemptCount;
        }

        /**
         * @return minAttemptInterval
         */
        public Long getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return planedEndTime
         */
        public Long getPlanedEndTime() {
            return this.planedEndTime;
        }

        /**
         * @return planedStartTime
         */
        public Long getPlanedStartTime() {
            return this.planedStartTime;
        }

        /**
         * @return queueId
         */
        public String getQueueId() {
            return this.queueId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return simulation
         */
        public Boolean getSimulation() {
            return this.simulation;
        }

        /**
         * @return simulationParameters
         */
        public String getSimulationParameters() {
            return this.simulationParameters;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return strategyParameters
         */
        public String getStrategyParameters() {
            return this.strategyParameters;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return totalCases
         */
        public Long getTotalCases() {
            return this.totalCases;
        }

        public static final class Builder {
            private Long actualEndTime; 
            private Long actualStartTime; 
            private String campaignId; 
            private Long casesAborted; 
            private Long casesConnected; 
            private Long casesUncompleted; 
            private Long casesUncompletedAfterAttempted; 
            private Long maxAttemptCount; 
            private Long minAttemptInterval; 
            private String name; 
            private Long planedEndTime; 
            private Long planedStartTime; 
            private String queueId; 
            private String queueName; 
            private Boolean simulation; 
            private String simulationParameters; 
            private String state; 
            private String strategyParameters; 
            private String strategyType; 
            private Long totalCases; 

            /**
             * ActualEndTime.
             */
            public Builder actualEndTime(Long actualEndTime) {
                this.actualEndTime = actualEndTime;
                return this;
            }

            /**
             * ActualStartTime.
             */
            public Builder actualStartTime(Long actualStartTime) {
                this.actualStartTime = actualStartTime;
                return this;
            }

            /**
             * CampaignId.
             */
            public Builder campaignId(String campaignId) {
                this.campaignId = campaignId;
                return this;
            }

            /**
             * CasesAborted.
             */
            public Builder casesAborted(Long casesAborted) {
                this.casesAborted = casesAborted;
                return this;
            }

            /**
             * CasesConnected.
             */
            public Builder casesConnected(Long casesConnected) {
                this.casesConnected = casesConnected;
                return this;
            }

            /**
             * CasesUncompleted.
             */
            public Builder casesUncompleted(Long casesUncompleted) {
                this.casesUncompleted = casesUncompleted;
                return this;
            }

            /**
             * CasesUncompletedAfterAttempted.
             */
            public Builder casesUncompletedAfterAttempted(Long casesUncompletedAfterAttempted) {
                this.casesUncompletedAfterAttempted = casesUncompletedAfterAttempted;
                return this;
            }

            /**
             * MaxAttemptCount.
             */
            public Builder maxAttemptCount(Long maxAttemptCount) {
                this.maxAttemptCount = maxAttemptCount;
                return this;
            }

            /**
             * MinAttemptInterval.
             */
            public Builder minAttemptInterval(Long minAttemptInterval) {
                this.minAttemptInterval = minAttemptInterval;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PlanedEndTime.
             */
            public Builder planedEndTime(Long planedEndTime) {
                this.planedEndTime = planedEndTime;
                return this;
            }

            /**
             * PlanedStartTime.
             */
            public Builder planedStartTime(Long planedStartTime) {
                this.planedStartTime = planedStartTime;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * Simulation.
             */
            public Builder simulation(Boolean simulation) {
                this.simulation = simulation;
                return this;
            }

            /**
             * SimulationParameters.
             */
            public Builder simulationParameters(String simulationParameters) {
                this.simulationParameters = simulationParameters;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * StrategyParameters.
             */
            public Builder strategyParameters(String strategyParameters) {
                this.strategyParameters = strategyParameters;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * TotalCases.
             */
            public Builder totalCases(Long totalCases) {
                this.totalCases = totalCases;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
