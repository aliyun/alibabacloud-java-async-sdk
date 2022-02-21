// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMonitorRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobMonitorRuleResponseBody</p>
 */
public class DescribeJobMonitorRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DtsJobId")
    private String dtsJobId;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("MonitorRules")
    private java.util.List < MonitorRules> monitorRules;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Topics")
    private java.util.List < String > topics;

    private DescribeJobMonitorRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.dtsJobId = builder.dtsJobId;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.monitorRules = builder.monitorRules;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topics = builder.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMonitorRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return monitorRules
     */
    public java.util.List < MonitorRules> getMonitorRules() {
        return this.monitorRules;
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

    /**
     * @return topics
     */
    public java.util.List < String > getTopics() {
        return this.topics;
    }

    public static final class Builder {
        private String code; 
        private String dtsJobId; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private java.util.List < MonitorRules> monitorRules; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < String > topics; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * MonitorRules.
         */
        public Builder monitorRules(java.util.List < MonitorRules> monitorRules) {
            this.monitorRules = monitorRules;
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

        /**
         * Topics.
         */
        public Builder topics(java.util.List < String > topics) {
            this.topics = topics;
            return this;
        }

        public DescribeJobMonitorRuleResponseBody build() {
            return new DescribeJobMonitorRuleResponseBody(this);
        } 

    } 

    public static class MonitorRules extends TeaModel {
        @NameInMap("DelayRuleTime")
        private Long delayRuleTime;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("State")
        private String state;

        @NameInMap("Type")
        private String type;

        private MonitorRules(Builder builder) {
            this.delayRuleTime = builder.delayRuleTime;
            this.phone = builder.phone;
            this.state = builder.state;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorRules create() {
            return builder().build();
        }

        /**
         * @return delayRuleTime
         */
        public Long getDelayRuleTime() {
            return this.delayRuleTime;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long delayRuleTime; 
            private String phone; 
            private String state; 
            private String type; 

            /**
             * DelayRuleTime.
             */
            public Builder delayRuleTime(Long delayRuleTime) {
                this.delayRuleTime = delayRuleTime;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MonitorRules build() {
                return new MonitorRules(this);
            } 

        } 

    }
}
