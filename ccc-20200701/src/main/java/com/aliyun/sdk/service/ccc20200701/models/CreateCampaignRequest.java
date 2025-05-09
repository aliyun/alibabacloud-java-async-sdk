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
 * {@link CreateCampaignRequest} extends {@link RequestModel}
 *
 * <p>CreateCampaignRequest</p>
 */
public class CreateCampaignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallableTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callableTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseFileKey")
    private String caseFileKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseList")
    private java.util.List<CaseList> caseList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutingUntilTimeout")
    private Boolean executingUntilTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxAttemptCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxAttemptCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAttemptInterval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long minAttemptInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Simulation")
    private Boolean simulation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimulationParameters")
    private String simulationParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyParameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<CaseList> getCaseList() {
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
        private java.util.List<CaseList> caseList; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;beginTime&quot;:&quot;00:00:00&quot;,&quot;endTime&quot;:&quot;23:00:00&quot; }]</p>
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
        public Builder caseList(java.util.List<CaseList> caseList) {
            String caseListShrink = shrink(caseList, "CaseList", "json");
            this.putQueryParameter("CaseList", caseListShrink);
            this.caseList = caseList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c1f2bc75-422e-43c7-9c9d9d95633a</p>
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1634313600000</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxAttemptCount(Long maxAttemptCount) {
            this.putQueryParameter("MaxAttemptCount", maxAttemptCount);
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minAttemptInterval(Long minAttemptInterval) {
            this.putQueryParameter("MinAttemptInterval", minAttemptInterval);
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-campaign</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1634140800000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ratio&quot;:1}</p>
         */
        public Builder strategyParameters(String strategyParameters) {
            this.putQueryParameter("StrategyParameters", strategyParameters);
            this.strategyParameters = strategyParameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACING</p>
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

    /**
     * 
     * {@link CreateCampaignRequest} extends {@link TeaModel}
     *
     * <p>CreateCampaignRequest</p>
     */
    public static class CaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomVariables")
        private String customVariables;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
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

            private Builder() {
            } 

            private Builder(CaseList model) {
                this.customVariables = model.customVariables;
                this.phoneNumber = model.phoneNumber;
                this.referenceId = model.referenceId;
            } 

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
