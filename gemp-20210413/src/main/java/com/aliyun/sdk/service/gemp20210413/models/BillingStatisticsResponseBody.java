// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BillingStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>BillingStatisticsResponseBody</p>
 */
public class BillingStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private BillingStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public BillingStatisticsResponseBody build() {
            return new BillingStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appUserCount")
        private Long appUserCount;

        @com.aliyun.core.annotation.NameInMap("appUserCountFree")
        private Long appUserCountFree;

        @com.aliyun.core.annotation.NameInMap("emailSend")
        private Long emailSend;

        @com.aliyun.core.annotation.NameInMap("emailSendFree")
        private Long emailSendFree;

        @com.aliyun.core.annotation.NameInMap("escalationPlanCount")
        private Long escalationPlanCount;

        @com.aliyun.core.annotation.NameInMap("escalationPlanCountFree")
        private Long escalationPlanCountFree;

        @com.aliyun.core.annotation.NameInMap("eventReportApi")
        private Long eventReportApi;

        @com.aliyun.core.annotation.NameInMap("eventReportApiFree")
        private Long eventReportApiFree;

        @com.aliyun.core.annotation.NameInMap("hasScheduleServiceGroupCount")
        private Long hasScheduleServiceGroupCount;

        @com.aliyun.core.annotation.NameInMap("hasScheduleServiceGroupCountFree")
        private Long hasScheduleServiceGroupCountFree;

        @com.aliyun.core.annotation.NameInMap("imMsgSend")
        private Long imMsgSend;

        @com.aliyun.core.annotation.NameInMap("imMsgSendFree")
        private Long imMsgSendFree;

        @com.aliyun.core.annotation.NameInMap("ruleCount")
        private Long ruleCount;

        @com.aliyun.core.annotation.NameInMap("ruleCountFree")
        private Long ruleCountFree;

        @com.aliyun.core.annotation.NameInMap("smsSend")
        private Long smsSend;

        @com.aliyun.core.annotation.NameInMap("smsSendFree")
        private Long smsSendFree;

        @com.aliyun.core.annotation.NameInMap("subscriptionNotifyCount")
        private Long subscriptionNotifyCount;

        @com.aliyun.core.annotation.NameInMap("subscriptionNotifyCountFree")
        private Long subscriptionNotifyCountFree;

        @com.aliyun.core.annotation.NameInMap("type")
        private Boolean type;

        @com.aliyun.core.annotation.NameInMap("voiceSend")
        private Long voiceSend;

        @com.aliyun.core.annotation.NameInMap("voiceSendFree")
        private Long voiceSendFree;

        private Data(Builder builder) {
            this.appUserCount = builder.appUserCount;
            this.appUserCountFree = builder.appUserCountFree;
            this.emailSend = builder.emailSend;
            this.emailSendFree = builder.emailSendFree;
            this.escalationPlanCount = builder.escalationPlanCount;
            this.escalationPlanCountFree = builder.escalationPlanCountFree;
            this.eventReportApi = builder.eventReportApi;
            this.eventReportApiFree = builder.eventReportApiFree;
            this.hasScheduleServiceGroupCount = builder.hasScheduleServiceGroupCount;
            this.hasScheduleServiceGroupCountFree = builder.hasScheduleServiceGroupCountFree;
            this.imMsgSend = builder.imMsgSend;
            this.imMsgSendFree = builder.imMsgSendFree;
            this.ruleCount = builder.ruleCount;
            this.ruleCountFree = builder.ruleCountFree;
            this.smsSend = builder.smsSend;
            this.smsSendFree = builder.smsSendFree;
            this.subscriptionNotifyCount = builder.subscriptionNotifyCount;
            this.subscriptionNotifyCountFree = builder.subscriptionNotifyCountFree;
            this.type = builder.type;
            this.voiceSend = builder.voiceSend;
            this.voiceSendFree = builder.voiceSendFree;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appUserCount
         */
        public Long getAppUserCount() {
            return this.appUserCount;
        }

        /**
         * @return appUserCountFree
         */
        public Long getAppUserCountFree() {
            return this.appUserCountFree;
        }

        /**
         * @return emailSend
         */
        public Long getEmailSend() {
            return this.emailSend;
        }

        /**
         * @return emailSendFree
         */
        public Long getEmailSendFree() {
            return this.emailSendFree;
        }

        /**
         * @return escalationPlanCount
         */
        public Long getEscalationPlanCount() {
            return this.escalationPlanCount;
        }

        /**
         * @return escalationPlanCountFree
         */
        public Long getEscalationPlanCountFree() {
            return this.escalationPlanCountFree;
        }

        /**
         * @return eventReportApi
         */
        public Long getEventReportApi() {
            return this.eventReportApi;
        }

        /**
         * @return eventReportApiFree
         */
        public Long getEventReportApiFree() {
            return this.eventReportApiFree;
        }

        /**
         * @return hasScheduleServiceGroupCount
         */
        public Long getHasScheduleServiceGroupCount() {
            return this.hasScheduleServiceGroupCount;
        }

        /**
         * @return hasScheduleServiceGroupCountFree
         */
        public Long getHasScheduleServiceGroupCountFree() {
            return this.hasScheduleServiceGroupCountFree;
        }

        /**
         * @return imMsgSend
         */
        public Long getImMsgSend() {
            return this.imMsgSend;
        }

        /**
         * @return imMsgSendFree
         */
        public Long getImMsgSendFree() {
            return this.imMsgSendFree;
        }

        /**
         * @return ruleCount
         */
        public Long getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return ruleCountFree
         */
        public Long getRuleCountFree() {
            return this.ruleCountFree;
        }

        /**
         * @return smsSend
         */
        public Long getSmsSend() {
            return this.smsSend;
        }

        /**
         * @return smsSendFree
         */
        public Long getSmsSendFree() {
            return this.smsSendFree;
        }

        /**
         * @return subscriptionNotifyCount
         */
        public Long getSubscriptionNotifyCount() {
            return this.subscriptionNotifyCount;
        }

        /**
         * @return subscriptionNotifyCountFree
         */
        public Long getSubscriptionNotifyCountFree() {
            return this.subscriptionNotifyCountFree;
        }

        /**
         * @return type
         */
        public Boolean getType() {
            return this.type;
        }

        /**
         * @return voiceSend
         */
        public Long getVoiceSend() {
            return this.voiceSend;
        }

        /**
         * @return voiceSendFree
         */
        public Long getVoiceSendFree() {
            return this.voiceSendFree;
        }

        public static final class Builder {
            private Long appUserCount; 
            private Long appUserCountFree; 
            private Long emailSend; 
            private Long emailSendFree; 
            private Long escalationPlanCount; 
            private Long escalationPlanCountFree; 
            private Long eventReportApi; 
            private Long eventReportApiFree; 
            private Long hasScheduleServiceGroupCount; 
            private Long hasScheduleServiceGroupCountFree; 
            private Long imMsgSend; 
            private Long imMsgSendFree; 
            private Long ruleCount; 
            private Long ruleCountFree; 
            private Long smsSend; 
            private Long smsSendFree; 
            private Long subscriptionNotifyCount; 
            private Long subscriptionNotifyCountFree; 
            private Boolean type; 
            private Long voiceSend; 
            private Long voiceSendFree; 

            /**
             * appUserCount.
             */
            public Builder appUserCount(Long appUserCount) {
                this.appUserCount = appUserCount;
                return this;
            }

            /**
             * appUserCountFree.
             */
            public Builder appUserCountFree(Long appUserCountFree) {
                this.appUserCountFree = appUserCountFree;
                return this;
            }

            /**
             * emailSend.
             */
            public Builder emailSend(Long emailSend) {
                this.emailSend = emailSend;
                return this;
            }

            /**
             * emailSendFree.
             */
            public Builder emailSendFree(Long emailSendFree) {
                this.emailSendFree = emailSendFree;
                return this;
            }

            /**
             * escalationPlanCount.
             */
            public Builder escalationPlanCount(Long escalationPlanCount) {
                this.escalationPlanCount = escalationPlanCount;
                return this;
            }

            /**
             * escalationPlanCountFree.
             */
            public Builder escalationPlanCountFree(Long escalationPlanCountFree) {
                this.escalationPlanCountFree = escalationPlanCountFree;
                return this;
            }

            /**
             * eventReportApi.
             */
            public Builder eventReportApi(Long eventReportApi) {
                this.eventReportApi = eventReportApi;
                return this;
            }

            /**
             * eventReportApiFree.
             */
            public Builder eventReportApiFree(Long eventReportApiFree) {
                this.eventReportApiFree = eventReportApiFree;
                return this;
            }

            /**
             * hasScheduleServiceGroupCount.
             */
            public Builder hasScheduleServiceGroupCount(Long hasScheduleServiceGroupCount) {
                this.hasScheduleServiceGroupCount = hasScheduleServiceGroupCount;
                return this;
            }

            /**
             * hasScheduleServiceGroupCountFree.
             */
            public Builder hasScheduleServiceGroupCountFree(Long hasScheduleServiceGroupCountFree) {
                this.hasScheduleServiceGroupCountFree = hasScheduleServiceGroupCountFree;
                return this;
            }

            /**
             * imMsgSend.
             */
            public Builder imMsgSend(Long imMsgSend) {
                this.imMsgSend = imMsgSend;
                return this;
            }

            /**
             * imMsgSendFree.
             */
            public Builder imMsgSendFree(Long imMsgSendFree) {
                this.imMsgSendFree = imMsgSendFree;
                return this;
            }

            /**
             * ruleCount.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * ruleCountFree.
             */
            public Builder ruleCountFree(Long ruleCountFree) {
                this.ruleCountFree = ruleCountFree;
                return this;
            }

            /**
             * smsSend.
             */
            public Builder smsSend(Long smsSend) {
                this.smsSend = smsSend;
                return this;
            }

            /**
             * smsSendFree.
             */
            public Builder smsSendFree(Long smsSendFree) {
                this.smsSendFree = smsSendFree;
                return this;
            }

            /**
             * subscriptionNotifyCount.
             */
            public Builder subscriptionNotifyCount(Long subscriptionNotifyCount) {
                this.subscriptionNotifyCount = subscriptionNotifyCount;
                return this;
            }

            /**
             * subscriptionNotifyCountFree.
             */
            public Builder subscriptionNotifyCountFree(Long subscriptionNotifyCountFree) {
                this.subscriptionNotifyCountFree = subscriptionNotifyCountFree;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Boolean type) {
                this.type = type;
                return this;
            }

            /**
             * voiceSend.
             */
            public Builder voiceSend(Long voiceSend) {
                this.voiceSend = voiceSend;
                return this;
            }

            /**
             * voiceSendFree.
             */
            public Builder voiceSendFree(Long voiceSendFree) {
                this.voiceSendFree = voiceSendFree;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
