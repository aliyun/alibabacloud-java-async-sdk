// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCampaignsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCampaignsResponseBody</p>
 */
public class ListCampaignsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public ListCampaignsResponseBody build() {
            return new ListCampaignsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
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

        @NameInMap("State")
        private String state;

        @NameInMap("StrategyParameters")
        private String strategyParameters;

        @NameInMap("StrategyType")
        private String strategyType;

        @NameInMap("TotalCases")
        private Long totalCases;

        private List(Builder builder) {
            this.actualEndTime = builder.actualEndTime;
            this.actualStartTime = builder.actualStartTime;
            this.campaignId = builder.campaignId;
            this.casesAborted = builder.casesAborted;
            this.casesConnected = builder.casesConnected;
            this.casesUncompleted = builder.casesUncompleted;
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
             * id
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
             * state
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
