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
    @com.aliyun.core.annotation.NameInMap("FlashSmsParameters")
    private String flashSmsParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstGroupId")
    private String instGroupId;

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
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private java.util.List<String> numberList;

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
        this.flashSmsParameters = builder.flashSmsParameters;
        this.instGroupId = builder.instGroupId;
        this.instanceId = builder.instanceId;
        this.maxAttemptCount = builder.maxAttemptCount;
        this.minAttemptInterval = builder.minAttemptInterval;
        this.name = builder.name;
        this.numberList = builder.numberList;
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
     * @return flashSmsParameters
     */
    public String getFlashSmsParameters() {
        return this.flashSmsParameters;
    }

    /**
     * @return instGroupId
     */
    public String getInstGroupId() {
        return this.instGroupId;
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
     * @return numberList
     */
    public java.util.List<String> getNumberList() {
        return this.numberList;
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
        private String flashSmsParameters; 
        private String instGroupId; 
        private String instanceId; 
        private Long maxAttemptCount; 
        private Long minAttemptInterval; 
        private String name; 
        private java.util.List<String> numberList; 
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
            this.flashSmsParameters = request.flashSmsParameters;
            this.instGroupId = request.instGroupId;
            this.instanceId = request.instanceId;
            this.maxAttemptCount = request.maxAttemptCount;
            this.minAttemptInterval = request.minAttemptInterval;
            this.name = request.name;
            this.numberList = request.numberList;
            this.queueId = request.queueId;
            this.simulation = request.simulation;
            this.simulationParameters = request.simulationParameters;
            this.startTime = request.startTime;
            this.strategyParameters = request.strategyParameters;
            this.strategyType = request.strategyType;
        } 

        /**
         * <p>The callable time window for the predictive outbound dialing activity, formatted as a JSON object containing two properties: beginTime and endTime. Example: [{&quot;beginTime&quot;:&quot;00:00:00&quot;,&quot;endTime&quot;:&quot;23:00:00&quot;}].</p>
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
         * <p>Predictive outbound dialing contact file, specified as the key of an OSS object. Obtain this key by calling the GetCaseFileUploadUrl API.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test/namelist.csv</p>
         */
        public Builder caseFileKey(String caseFileKey) {
            this.putQueryParameter("CaseFileKey", caseFileKey);
            this.caseFileKey = caseFileKey;
            return this;
        }

        /**
         * <p>List of predictive outbound dialing contacts. This parameter cannot be used together with CaseFileKey (import from file). You must choose either file import or list import.</p>
         */
        public Builder caseList(java.util.List<CaseList> caseList) {
            String caseListShrink = shrink(caseList, "CaseList", "json");
            this.putQueryParameter("CaseList", caseListShrink);
            this.caseList = caseList;
            return this;
        }

        /**
         * <p>The contact flow ID associated with the predictive outbound dialing activity.</p>
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
         * <p>The end time of the predictive outbound calling activity, formatted as a UNIX timestamp in milliseconds.</p>
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
         * <p>Whether to keep the activity in the executing state until it expires. The default value is false. If false, the activity automatically transitions to the completed state after all contacts have been called. If true, the activity remains in the executing state even after all contacts have been called, allowing you to append additional contacts and continue dialing until the activity expires or is manually stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder executingUntilTimeout(Boolean executingUntilTimeout) {
            this.putQueryParameter("ExecutingUntilTimeout", executingUntilTimeout);
            this.executingUntilTimeout = executingUntilTimeout;
            return this;
        }

        /**
         * <p>Flash SMS parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;applicationId&quot;:&quot;08e6b63a-<strong><strong>-</strong></strong>-****-689a288cdbb5&quot;,&quot;templateId&quot;:&quot;325&quot;}</p>
         */
        public Builder flashSmsParameters(String flashSmsParameters) {
            this.putQueryParameter("FlashSmsParameters", flashSmsParameters);
            this.flashSmsParameters = flashSmsParameters;
            return this;
        }

        /**
         * <p>Phone number collection ID</p>
         * 
         * <strong>example:</strong>
         * <p>0d368091-2c70-4d26-979a-6997ddc9c34f</p>
         */
        public Builder instGroupId(String instGroupId) {
            this.putQueryParameter("InstGroupId", instGroupId);
            this.instGroupId = instGroupId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
         * <p>The maximum number of attempts for the predictive outbound calling activity. This specifies how many times a number can be redialed if the initial call fails.</p>
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
         * <p>The minimum redial interval for the predictive outbound calling activity, which specifies the minimum time interval between redial attempts after a failed call, in minutes.</p>
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
         * <p>Name of the predictive outbound dialing activity.</p>
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
         * <p>List of caller numbers</p>
         */
        public Builder numberList(java.util.List<String> numberList) {
            String numberListShrink = shrink(numberList, "NumberList", "json");
            this.putQueryParameter("NumberList", numberListShrink);
            this.numberList = numberList;
            return this;
        }

        /**
         * <p>The skill group ID associated with the predictive outbound dialing activity.</p>
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
         * <p>Indicates whether this is a simulation activity used for testing. Regular customers do not need to concern themselves with this.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder simulation(Boolean simulation) {
            this.putQueryParameter("Simulation", simulation);
            this.simulation = simulation;
            return this;
        }

        /**
         * <p>Simulation parameters used for testing. Regular customers do not need to concern themselves with this.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder simulationParameters(String simulationParameters) {
            this.putQueryParameter("SimulationParameters", simulationParameters);
            this.simulationParameters = simulationParameters;
            return this;
        }

        /**
         * <p>The start time of the predictive outbound dialing activity, in Unix timestamp format with millisecond precision.</p>
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
         * <p>Strategy parameters for the predictive outbound dialing activity. For PID strategy, an example format is: {&quot;abandonRate&quot;:&quot;5&quot;,&quot;historicalConnectedRate&quot;:&quot;35&quot;}. For PACING strategy, an example format is: {&quot;ratio&quot;:1}. abandonRate represents the desired abandonment rate, historicalConnectedRate represents the historical reference connection rate, and ratio represents the fixed dialing ratio.</p>
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
         * <p>The strategy pattern for the predictive outbound calling activity.</p>
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
             * <p>Customer-defined custom variables in JSON object format. The object can contain up to 10 properties, each with a name and value defined by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;customer&quot;,&quot;客户标签&quot;:&quot;tag&quot;}</p>
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * <p>Contact phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1888888888</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>Business ID, an identifier from the Customer\&quot;s Operational System, used in integration scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
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
