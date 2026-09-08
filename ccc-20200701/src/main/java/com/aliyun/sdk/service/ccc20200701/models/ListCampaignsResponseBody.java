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
 * {@link ListCampaignsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCampaignsResponseBody</p>
 */
public class ListCampaignsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCampaignsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCampaignsResponseBody create() {
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
    public Long getHttpStatusCode() {
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
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCampaignsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CCEF32F-8614-535F-A1D9-D85B8C0DC4F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCampaignsResponseBody build() {
            return new ListCampaignsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCampaignsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCampaignsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualEndTime")
        private Long actualEndTime;

        @com.aliyun.core.annotation.NameInMap("ActualStartTime")
        private Long actualStartTime;

        @com.aliyun.core.annotation.NameInMap("CampaignId")
        private String campaignId;

        @com.aliyun.core.annotation.NameInMap("CasesAborted")
        private Long casesAborted;

        @com.aliyun.core.annotation.NameInMap("CasesConnected")
        private Long casesConnected;

        @com.aliyun.core.annotation.NameInMap("CasesUncompleted")
        private Long casesUncompleted;

        @com.aliyun.core.annotation.NameInMap("CompletionRate")
        private Float completionRate;

        @com.aliyun.core.annotation.NameInMap("ContactFlowId")
        private String contactFlowId;

        @com.aliyun.core.annotation.NameInMap("MaxAttemptCount")
        private Long maxAttemptCount;

        @com.aliyun.core.annotation.NameInMap("MinAttemptInterval")
        private Long minAttemptInterval;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PlanedEndTime")
        private Long planedEndTime;

        @com.aliyun.core.annotation.NameInMap("PlanedStartTime")
        private Long planedStartTime;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private String queueId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("Simulation")
        private Boolean simulation;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StrategyParameters")
        private String strategyParameters;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        @com.aliyun.core.annotation.NameInMap("TotalCases")
        private Long totalCases;

        private List(Builder builder) {
            this.actualEndTime = builder.actualEndTime;
            this.actualStartTime = builder.actualStartTime;
            this.campaignId = builder.campaignId;
            this.casesAborted = builder.casesAborted;
            this.casesConnected = builder.casesConnected;
            this.casesUncompleted = builder.casesUncompleted;
            this.completionRate = builder.completionRate;
            this.contactFlowId = builder.contactFlowId;
            this.maxAttemptCount = builder.maxAttemptCount;
            this.minAttemptInterval = builder.minAttemptInterval;
            this.name = builder.name;
            this.planedEndTime = builder.planedEndTime;
            this.planedStartTime = builder.planedStartTime;
            this.queueId = builder.queueId;
            this.queueName = builder.queueName;
            this.simulation = builder.simulation;
            this.state = builder.state;
            this.strategyParameters = builder.strategyParameters;
            this.strategyType = builder.strategyType;
            this.totalCases = builder.totalCases;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
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
         * @return completionRate
         */
        public Float getCompletionRate() {
            return this.completionRate;
        }

        /**
         * @return contactFlowId
         */
        public String getContactFlowId() {
            return this.contactFlowId;
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
            private Float completionRate; 
            private String contactFlowId; 
            private Long maxAttemptCount; 
            private Long minAttemptInterval; 
            private String name; 
            private Long planedEndTime; 
            private Long planedStartTime; 
            private String queueId; 
            private String queueName; 
            private Boolean simulation; 
            private String state; 
            private String strategyParameters; 
            private String strategyType; 
            private Long totalCases; 

            private Builder() {
            } 

            private Builder(List model) {
                this.actualEndTime = model.actualEndTime;
                this.actualStartTime = model.actualStartTime;
                this.campaignId = model.campaignId;
                this.casesAborted = model.casesAborted;
                this.casesConnected = model.casesConnected;
                this.casesUncompleted = model.casesUncompleted;
                this.completionRate = model.completionRate;
                this.contactFlowId = model.contactFlowId;
                this.maxAttemptCount = model.maxAttemptCount;
                this.minAttemptInterval = model.minAttemptInterval;
                this.name = model.name;
                this.planedEndTime = model.planedEndTime;
                this.planedStartTime = model.planedStartTime;
                this.queueId = model.queueId;
                this.queueName = model.queueName;
                this.simulation = model.simulation;
                this.state = model.state;
                this.strategyParameters = model.strategyParameters;
                this.strategyType = model.strategyType;
                this.totalCases = model.totalCases;
            } 

            /**
             * <p>The actual end time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634008800000</p>
             */
            public Builder actualEndTime(Long actualEndTime) {
                this.actualEndTime = actualEndTime;
                return this;
            }

            /**
             * <p>The actual start time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634000460000</p>
             */
            public Builder actualStartTime(Long actualStartTime) {
                this.actualStartTime = actualStartTime;
                return this;
            }

            /**
             * <p>The ID of the predictive dialing campaign.</p>
             * 
             * <strong>example:</strong>
             * <p>6badb397-a8b5-40b6-21019d382a09</p>
             */
            public Builder campaignId(String campaignId) {
                this.campaignId = campaignId;
                return this;
            }

            /**
             * <p>The number of aborted cases in the predictive dialing campaign. An aborted case indicates that the call to the contact was canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder casesAborted(Long casesAborted) {
                this.casesAborted = casesAborted;
                return this;
            }

            /**
             * <p>The number of connected cases in the predictive dialing campaign.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder casesConnected(Long casesConnected) {
                this.casesConnected = casesConnected;
                return this;
            }

            /**
             * <p>The number of uncompleted cases in the predictive dialing campaign. An uncompleted case indicates that the call was not connected and the maximum number of retry attempts was not reached.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder casesUncompleted(Long casesUncompleted) {
                this.casesUncompleted = casesUncompleted;
                return this;
            }

            /**
             * <p>The completion rate. This parameter is deprecated. You can calculate the completion rate by using the formula (TotalCases - CasesUnCompleted) / TotalCases.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder completionRate(Float completionRate) {
                this.completionRate = completionRate;
                return this;
            }

            /**
             * <p>The ID of the IVR contact flow associated with the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>a3fb6c62-9b49-4942-ae5b-cf2abd4123ek</p>
             */
            public Builder contactFlowId(String contactFlowId) {
                this.contactFlowId = contactFlowId;
                return this;
            }

            /**
             * <p>The maximum number of attempts for the predictive dialing campaign. This value specifies the maximum number of redial attempts when a call to a number fails.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxAttemptCount(Long maxAttemptCount) {
                this.maxAttemptCount = maxAttemptCount;
                return this;
            }

            /**
             * <p>The minimum redial interval for the predictive dialing campaign. This value specifies the minimum interval between redial attempts after a failure. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minAttemptInterval(Long minAttemptInterval) {
                this.minAttemptInterval = minAttemptInterval;
                return this;
            }

            /**
             * <p>The name of the predictive dialing campaign.</p>
             * 
             * <strong>example:</strong>
             * <p>test-campaign</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The planned end time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634054400000</p>
             */
            public Builder planedEndTime(Long planedEndTime) {
                this.planedEndTime = planedEndTime;
                return this;
            }

            /**
             * <p>The planned start time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1633968000000</p>
             */
            public Builder planedStartTime(Long planedStartTime) {
                this.planedStartTime = planedStartTime;
                return this;
            }

            /**
             * <p>The ID of the associated skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * <p>The name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>测试技能组</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>Indicates whether the campaign is a simulated campaign.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder simulation(Boolean simulation) {
                this.simulation = simulation;
                return this;
            }

            /**
             * <p>The state of the predictive dialing campaign.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The strategy parameters of the predictive dialing campaign. Example for the PID strategy: {&quot;abandonRate&quot;:&quot;5&quot;,&quot;historicalConnectedRate&quot;:&quot;35&quot;}. Example for the PACING strategy: {&quot;ratio&quot;:1}. abandonRate specifies the expected call abandon rate. historicalConnectedRate specifies the historical reference connection rate. ratio specifies the fixed dialing ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ratio&quot;:1}</p>
             */
            public Builder strategyParameters(String strategyParameters) {
                this.strategyParameters = strategyParameters;
                return this;
            }

            /**
             * <p>The strategy mode of the predictive dialing campaign.</p>
             * 
             * <strong>example:</strong>
             * <p>PACING</p>
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * <p>The total number of phone numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCases(Long totalCases) {
                this.totalCases = totalCases;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCampaignsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCampaignsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of predictive dialing campaigns.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
