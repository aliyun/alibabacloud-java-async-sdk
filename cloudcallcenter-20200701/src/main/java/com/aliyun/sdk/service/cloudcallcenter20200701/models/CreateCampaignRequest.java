// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCampaignRequest} extends {@link RequestModel}
 *
 * <p>CreateCampaignRequest</p>
 */
public class CreateCampaignRequest extends Request {
    @Query
    @NameInMap("CallableTime")
    private String callableTime;

    @Query
    @NameInMap("CaseFileKey")
    private String caseFileKey;

    @Query
    @NameInMap("CaseList")
    private java.util.List < CaseList> caseList;

    @Query
    @NameInMap("ContactFlowId")
    private String contactFlowId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("ExecutingUntilTimeout")
    private Boolean executingUntilTimeout;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MaxAttemptCount")
    private Long maxAttemptCount;

    @Query
    @NameInMap("MinAttemptInterval")
    private Long minAttemptInterval;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("QueueId")
    private String queueId;

    @Query
    @NameInMap("Simulation")
    private Boolean simulation;

    @Query
    @NameInMap("SimulationParameters")
    private String simulationParameters;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("StrategyParameters")
    private String strategyParameters;

    @Query
    @NameInMap("StrategyType")
    private String strategyType;

    private CreateCampaignRequest(Builder builder) {
        super(builder);
        this.callableTime = builder.callableTime;
        this.caseFileKey = builder.caseFileKey;
        this.caseList = builder.caseList;
        this.contactFlowId = builder.contactFlowId;
        this.endTime = builder.endTime;
        this.executingUntilTimeout = builder.executingUntilTimeout;
        this.instanceId = builder.instanceId;
        this.maxAttemptCount = builder.maxAttemptCount;
        this.minAttemptInterval = builder.minAttemptInterval;
        this.name = builder.name;
        this.queueId = builder.queueId;
        this.simulation = builder.simulation;
        this.simulationParameters = builder.simulationParameters;
        this.startTime = builder.startTime;
        this.strategyParameters = builder.strategyParameters;
        this.strategyType = builder.strategyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCampaignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callableTime
     */
    public String getCallableTime() {
        return this.callableTime;
    }

    /**
     * @return caseFileKey
     */
    public String getCaseFileKey() {
        return this.caseFileKey;
    }

    /**
     * @return caseList
     */
    public java.util.List < CaseList> getCaseList() {
        return this.caseList;
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return executingUntilTimeout
     */
    public Boolean getExecutingUntilTimeout() {
        return this.executingUntilTimeout;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
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

    public static final class Builder extends Request.Builder<CreateCampaignRequest, Builder> {
        private String callableTime; 
        private String caseFileKey; 
        private java.util.List < CaseList> caseList; 
        private String contactFlowId; 
        private String endTime; 
        private Boolean executingUntilTimeout; 
        private String instanceId; 
        private Long maxAttemptCount; 
        private Long minAttemptInterval; 
        private String name; 
        private String queueId; 
        private Boolean simulation; 
        private String simulationParameters; 
        private String startTime; 
        private String strategyParameters; 
        private String strategyType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCampaignRequest request) {
            super(request);
            this.callableTime = request.callableTime;
            this.caseFileKey = request.caseFileKey;
            this.caseList = request.caseList;
            this.contactFlowId = request.contactFlowId;
            this.endTime = request.endTime;
            this.executingUntilTimeout = request.executingUntilTimeout;
            this.instanceId = request.instanceId;
            this.maxAttemptCount = request.maxAttemptCount;
            this.minAttemptInterval = request.minAttemptInterval;
            this.name = request.name;
            this.queueId = request.queueId;
            this.simulation = request.simulation;
            this.simulationParameters = request.simulationParameters;
            this.startTime = request.startTime;
            this.strategyParameters = request.strategyParameters;
            this.strategyType = request.strategyType;
        } 

        /**
         * CallableTime.
         */
        public Builder callableTime(String callableTime) {
            this.putQueryParameter("CallableTime", callableTime);
            this.callableTime = callableTime;
            return this;
        }

        /**
         * CaseFileKey.
         */
        public Builder caseFileKey(String caseFileKey) {
            this.putQueryParameter("CaseFileKey", caseFileKey);
            this.caseFileKey = caseFileKey;
            return this;
        }

        /**
         * CaseList.
         */
        public Builder caseList(java.util.List < CaseList> caseList) {
            String caseListShrink = shrink(caseList, "CaseList", "json");
            this.putQueryParameter("CaseList", caseListShrink);
            this.caseList = caseList;
            return this;
        }

        /**
         * ContactFlowId.
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecutingUntilTimeout.
         */
        public Builder executingUntilTimeout(Boolean executingUntilTimeout) {
            this.putQueryParameter("ExecutingUntilTimeout", executingUntilTimeout);
            this.executingUntilTimeout = executingUntilTimeout;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxAttemptCount.
         */
        public Builder maxAttemptCount(Long maxAttemptCount) {
            this.putQueryParameter("MaxAttemptCount", maxAttemptCount);
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }

        /**
         * MinAttemptInterval.
         */
        public Builder minAttemptInterval(Long minAttemptInterval) {
            this.putQueryParameter("MinAttemptInterval", minAttemptInterval);
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * QueueId.
         */
        public Builder queueId(String queueId) {
            this.putQueryParameter("QueueId", queueId);
            this.queueId = queueId;
            return this;
        }

        /**
         * Simulation.
         */
        public Builder simulation(Boolean simulation) {
            this.putQueryParameter("Simulation", simulation);
            this.simulation = simulation;
            return this;
        }

        /**
         * SimulationParameters.
         */
        public Builder simulationParameters(String simulationParameters) {
            this.putQueryParameter("SimulationParameters", simulationParameters);
            this.simulationParameters = simulationParameters;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StrategyParameters.
         */
        public Builder strategyParameters(String strategyParameters) {
            this.putQueryParameter("StrategyParameters", strategyParameters);
            this.strategyParameters = strategyParameters;
            return this;
        }

        /**
         * StrategyType.
         */
        public Builder strategyType(String strategyType) {
            this.putQueryParameter("StrategyType", strategyType);
            this.strategyType = strategyType;
            return this;
        }

        @Override
        public CreateCampaignRequest build() {
            return new CreateCampaignRequest(this);
        } 

    } 

    public static class CaseList extends TeaModel {
        @NameInMap("CustomVariables")
        private String customVariables;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("ReferenceId")
        private String referenceId;

        private CaseList(Builder builder) {
            this.customVariables = builder.customVariables;
            this.phoneNumber = builder.phoneNumber;
            this.referenceId = builder.referenceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaseList create() {
            return builder().build();
        }

        /**
         * @return customVariables
         */
        public String getCustomVariables() {
            return this.customVariables;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        public static final class Builder {
            private String customVariables; 
            private String phoneNumber; 
            private String referenceId; 

            /**
             * CustomVariables.
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * ReferenceId.
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            public CaseList build() {
                return new CaseList(this);
            } 

        } 

    }
}
