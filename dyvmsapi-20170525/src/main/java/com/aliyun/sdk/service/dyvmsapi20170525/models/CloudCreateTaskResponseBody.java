// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudCreateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CloudCreateTaskResponseBody</p>
 */
public class CloudCreateTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudCreateTaskResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudCreateTaskResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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

        public CloudCreateTaskResponseBody build() {
            return new CloudCreateTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudCreateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudCreateTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentTimeout")
        private String agentTimeout;

        @com.aliyun.core.annotation.NameInMap("AnswerRate")
        private String answerRate;

        @com.aliyun.core.annotation.NameInMap("AutoComplete")
        private Long autoComplete;

        @com.aliyun.core.annotation.NameInMap("AutoStart")
        private String autoStart;

        @com.aliyun.core.annotation.NameInMap("AutoStartDay")
        private String autoStartDay;

        @com.aliyun.core.annotation.NameInMap("AutoStartTime")
        private String autoStartTime;

        @com.aliyun.core.annotation.NameInMap("AutoStop")
        private String autoStop;

        @com.aliyun.core.annotation.NameInMap("AutoStopDay")
        private String autoStopDay;

        @com.aliyun.core.annotation.NameInMap("AutoStopTime")
        private String autoStopTime;

        @com.aliyun.core.annotation.NameInMap("Cnos")
        private String cnos;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private String concurrency;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomerClids")
        private String customerClids;

        @com.aliyun.core.annotation.NameInMap("CustomerMoh")
        private String customerMoh;

        @com.aliyun.core.annotation.NameInMap("CustomerTimeout")
        private String customerTimeout;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsRandom")
        private String isRandom;

        @com.aliyun.core.annotation.NameInMap("IvrId")
        private String ivrId;

        @com.aliyun.core.annotation.NameInMap("MaxWaitTime")
        private String maxWaitTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverTime")
        private String overTime;

        @com.aliyun.core.annotation.NameInMap("PredictAdjust")
        private String predictAdjust;

        @com.aliyun.core.annotation.NameInMap("Quotiety")
        private String quotiety;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserFields")
        private String userFields;

        @com.aliyun.core.annotation.NameInMap("Wrapup")
        private String wrapup;

        private Data(Builder builder) {
            this.agentTimeout = builder.agentTimeout;
            this.answerRate = builder.answerRate;
            this.autoComplete = builder.autoComplete;
            this.autoStart = builder.autoStart;
            this.autoStartDay = builder.autoStartDay;
            this.autoStartTime = builder.autoStartTime;
            this.autoStop = builder.autoStop;
            this.autoStopDay = builder.autoStopDay;
            this.autoStopTime = builder.autoStopTime;
            this.cnos = builder.cnos;
            this.concurrency = builder.concurrency;
            this.createTime = builder.createTime;
            this.customerClids = builder.customerClids;
            this.customerMoh = builder.customerMoh;
            this.customerTimeout = builder.customerTimeout;
            this.description = builder.description;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.isRandom = builder.isRandom;
            this.ivrId = builder.ivrId;
            this.maxWaitTime = builder.maxWaitTime;
            this.name = builder.name;
            this.overTime = builder.overTime;
            this.predictAdjust = builder.predictAdjust;
            this.quotiety = builder.quotiety;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
            this.userFields = builder.userFields;
            this.wrapup = builder.wrapup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentTimeout
         */
        public String getAgentTimeout() {
            return this.agentTimeout;
        }

        /**
         * @return answerRate
         */
        public String getAnswerRate() {
            return this.answerRate;
        }

        /**
         * @return autoComplete
         */
        public Long getAutoComplete() {
            return this.autoComplete;
        }

        /**
         * @return autoStart
         */
        public String getAutoStart() {
            return this.autoStart;
        }

        /**
         * @return autoStartDay
         */
        public String getAutoStartDay() {
            return this.autoStartDay;
        }

        /**
         * @return autoStartTime
         */
        public String getAutoStartTime() {
            return this.autoStartTime;
        }

        /**
         * @return autoStop
         */
        public String getAutoStop() {
            return this.autoStop;
        }

        /**
         * @return autoStopDay
         */
        public String getAutoStopDay() {
            return this.autoStopDay;
        }

        /**
         * @return autoStopTime
         */
        public String getAutoStopTime() {
            return this.autoStopTime;
        }

        /**
         * @return cnos
         */
        public String getCnos() {
            return this.cnos;
        }

        /**
         * @return concurrency
         */
        public String getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customerClids
         */
        public String getCustomerClids() {
            return this.customerClids;
        }

        /**
         * @return customerMoh
         */
        public String getCustomerMoh() {
            return this.customerMoh;
        }

        /**
         * @return customerTimeout
         */
        public String getCustomerTimeout() {
            return this.customerTimeout;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isRandom
         */
        public String getIsRandom() {
            return this.isRandom;
        }

        /**
         * @return ivrId
         */
        public String getIvrId() {
            return this.ivrId;
        }

        /**
         * @return maxWaitTime
         */
        public String getMaxWaitTime() {
            return this.maxWaitTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overTime
         */
        public String getOverTime() {
            return this.overTime;
        }

        /**
         * @return predictAdjust
         */
        public String getPredictAdjust() {
            return this.predictAdjust;
        }

        /**
         * @return quotiety
         */
        public String getQuotiety() {
            return this.quotiety;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userFields
         */
        public String getUserFields() {
            return this.userFields;
        }

        /**
         * @return wrapup
         */
        public String getWrapup() {
            return this.wrapup;
        }

        public static final class Builder {
            private String agentTimeout; 
            private String answerRate; 
            private Long autoComplete; 
            private String autoStart; 
            private String autoStartDay; 
            private String autoStartTime; 
            private String autoStop; 
            private String autoStopDay; 
            private String autoStopTime; 
            private String cnos; 
            private String concurrency; 
            private String createTime; 
            private String customerClids; 
            private String customerMoh; 
            private String customerTimeout; 
            private String description; 
            private String enterpriseId; 
            private String id; 
            private String isRandom; 
            private String ivrId; 
            private String maxWaitTime; 
            private String name; 
            private String overTime; 
            private String predictAdjust; 
            private String quotiety; 
            private String startTime; 
            private String status; 
            private String type; 
            private String userFields; 
            private String wrapup; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentTimeout = model.agentTimeout;
                this.answerRate = model.answerRate;
                this.autoComplete = model.autoComplete;
                this.autoStart = model.autoStart;
                this.autoStartDay = model.autoStartDay;
                this.autoStartTime = model.autoStartTime;
                this.autoStop = model.autoStop;
                this.autoStopDay = model.autoStopDay;
                this.autoStopTime = model.autoStopTime;
                this.cnos = model.cnos;
                this.concurrency = model.concurrency;
                this.createTime = model.createTime;
                this.customerClids = model.customerClids;
                this.customerMoh = model.customerMoh;
                this.customerTimeout = model.customerTimeout;
                this.description = model.description;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.isRandom = model.isRandom;
                this.ivrId = model.ivrId;
                this.maxWaitTime = model.maxWaitTime;
                this.name = model.name;
                this.overTime = model.overTime;
                this.predictAdjust = model.predictAdjust;
                this.quotiety = model.quotiety;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
                this.userFields = model.userFields;
                this.wrapup = model.wrapup;
            } 

            /**
             * AgentTimeout.
             */
            public Builder agentTimeout(String agentTimeout) {
                this.agentTimeout = agentTimeout;
                return this;
            }

            /**
             * AnswerRate.
             */
            public Builder answerRate(String answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * AutoComplete.
             */
            public Builder autoComplete(Long autoComplete) {
                this.autoComplete = autoComplete;
                return this;
            }

            /**
             * AutoStart.
             */
            public Builder autoStart(String autoStart) {
                this.autoStart = autoStart;
                return this;
            }

            /**
             * AutoStartDay.
             */
            public Builder autoStartDay(String autoStartDay) {
                this.autoStartDay = autoStartDay;
                return this;
            }

            /**
             * AutoStartTime.
             */
            public Builder autoStartTime(String autoStartTime) {
                this.autoStartTime = autoStartTime;
                return this;
            }

            /**
             * AutoStop.
             */
            public Builder autoStop(String autoStop) {
                this.autoStop = autoStop;
                return this;
            }

            /**
             * AutoStopDay.
             */
            public Builder autoStopDay(String autoStopDay) {
                this.autoStopDay = autoStopDay;
                return this;
            }

            /**
             * AutoStopTime.
             */
            public Builder autoStopTime(String autoStopTime) {
                this.autoStopTime = autoStopTime;
                return this;
            }

            /**
             * Cnos.
             */
            public Builder cnos(String cnos) {
                this.cnos = cnos;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(String concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomerClids.
             */
            public Builder customerClids(String customerClids) {
                this.customerClids = customerClids;
                return this;
            }

            /**
             * CustomerMoh.
             */
            public Builder customerMoh(String customerMoh) {
                this.customerMoh = customerMoh;
                return this;
            }

            /**
             * CustomerTimeout.
             */
            public Builder customerTimeout(String customerTimeout) {
                this.customerTimeout = customerTimeout;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnterpriseId.
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsRandom.
             */
            public Builder isRandom(String isRandom) {
                this.isRandom = isRandom;
                return this;
            }

            /**
             * IvrId.
             */
            public Builder ivrId(String ivrId) {
                this.ivrId = ivrId;
                return this;
            }

            /**
             * MaxWaitTime.
             */
            public Builder maxWaitTime(String maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
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
             * OverTime.
             */
            public Builder overTime(String overTime) {
                this.overTime = overTime;
                return this;
            }

            /**
             * PredictAdjust.
             */
            public Builder predictAdjust(String predictAdjust) {
                this.predictAdjust = predictAdjust;
                return this;
            }

            /**
             * Quotiety.
             */
            public Builder quotiety(String quotiety) {
                this.quotiety = quotiety;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserFields.
             */
            public Builder userFields(String userFields) {
                this.userFields = userFields;
                return this;
            }

            /**
             * Wrapup.
             */
            public Builder wrapup(String wrapup) {
                this.wrapup = wrapup;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
