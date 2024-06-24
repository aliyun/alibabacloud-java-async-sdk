// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaAlarmResponseBody</p>
 */
public class GetQuotaAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QuotaAlarm")
    private QuotaAlarm quotaAlarm;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetQuotaAlarmResponseBody(Builder builder) {
        this.quotaAlarm = builder.quotaAlarm;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaAlarmResponseBody create() {
        return builder().build();
    }

    /**
     * @return quotaAlarm
     */
    public QuotaAlarm getQuotaAlarm() {
        return this.quotaAlarm;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QuotaAlarm quotaAlarm; 
        private String requestId; 

        /**
         * The details of the quota alert.
         */
        public Builder quotaAlarm(QuotaAlarm quotaAlarm) {
            this.quotaAlarm = quotaAlarm;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaAlarmResponseBody build() {
            return new GetQuotaAlarmResponseBody(this);
        } 

    } 

    public static class QuotaAlarm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private String alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyTarget")
        private String notifyTarget;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaDimension")
        private java.util.Map < String, ? > quotaDimension;

        @com.aliyun.core.annotation.NameInMap("QuotaUsage")
        private Float quotaUsage;

        @com.aliyun.core.annotation.NameInMap("QuotaValue")
        private Float quotaValue;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
        private Float thresholdPercent;

        @com.aliyun.core.annotation.NameInMap("ThresholdType")
        private String thresholdType;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private QuotaAlarm(Builder builder) {
            this.alarmId = builder.alarmId;
            this.alarmName = builder.alarmName;
            this.createTime = builder.createTime;
            this.notifyChannels = builder.notifyChannels;
            this.notifyTarget = builder.notifyTarget;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaDimension = builder.quotaDimension;
            this.quotaUsage = builder.quotaUsage;
            this.quotaValue = builder.quotaValue;
            this.threshold = builder.threshold;
            this.thresholdPercent = builder.thresholdPercent;
            this.thresholdType = builder.thresholdType;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaAlarm create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public String getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmName
         */
        public String getAlarmName() {
            return this.alarmName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return notifyChannels
         */
        public java.util.List < String > getNotifyChannels() {
            return this.notifyChannels;
        }

        /**
         * @return notifyTarget
         */
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaActionCode
         */
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        /**
         * @return quotaDimension
         */
        public java.util.Map < String, ? > getQuotaDimension() {
            return this.quotaDimension;
        }

        /**
         * @return quotaUsage
         */
        public Float getQuotaUsage() {
            return this.quotaUsage;
        }

        /**
         * @return quotaValue
         */
        public Float getQuotaValue() {
            return this.quotaValue;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return thresholdPercent
         */
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

        /**
         * @return thresholdType
         */
        public String getThresholdType() {
            return this.thresholdType;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String alarmId; 
            private String alarmName; 
            private String createTime; 
            private java.util.List < String > notifyChannels; 
            private String notifyTarget; 
            private String productCode; 
            private String quotaActionCode; 
            private java.util.Map < String, ? > quotaDimension; 
            private Float quotaUsage; 
            private Float quotaValue; 
            private Float threshold; 
            private Float thresholdPercent; 
            private String thresholdType; 
            private String webhook; 

            /**
             * The ID of the quota alert.
             */
            public Builder alarmId(String alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * The name of the quota alert.
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * The time when the quota alert was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The alert notification methods.
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * The alert contact.
             */
            public Builder notifyTarget(String notifyTarget) {
                this.notifyTarget = notifyTarget;
                return this;
            }

            /**
             * The abbreviation of the cloud service name.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The ID of the quota.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * The quota dimension.
             */
            public Builder quotaDimension(java.util.Map < String, ? > quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * The used quota.
             */
            public Builder quotaUsage(Float quotaUsage) {
                this.quotaUsage = quotaUsage;
                return this;
            }

            /**
             * The quota value.
             */
            public Builder quotaValue(Float quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * The numeric value of the alert threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The percentage of the alert threshold.
             */
            public Builder thresholdPercent(Float thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            /**
             * The type of the quota alert. Valid values:
             * <p>
             * 
             * *   used: The alert is created for the used quota.
             * *   usable: The alert is created for the available quota.
             */
            public Builder thresholdType(String thresholdType) {
                this.thresholdType = thresholdType;
                return this;
            }

            /**
             * The webhook URL. Quota Center sends alert notifications to the specified URL by using HTTP POST requests.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public QuotaAlarm build() {
                return new QuotaAlarm(this);
            } 

        } 

    }
}
