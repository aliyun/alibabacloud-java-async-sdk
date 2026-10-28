// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetQuotaAlarmResponseBody model) {
            this.quotaAlarm = model.quotaAlarm;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the quota alert.</p>
         */
        public Builder quotaAlarm(QuotaAlarm quotaAlarm) {
            this.quotaAlarm = quotaAlarm;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>81B9D511-F3DD-43B1-9A81-1795DDB52ADF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaAlarmResponseBody build() {
            return new GetQuotaAlarmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaAlarmResponseBody</p>
     */
    public static class QuotaAlarm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private String alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List<String> notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyTarget")
        private String notifyTarget;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaDimension")
        private java.util.Map<String, ?> quotaDimension;

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
        public java.util.List<String> getNotifyChannels() {
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
        public java.util.Map<String, ?> getQuotaDimension() {
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
            private java.util.List<String> notifyChannels; 
            private String notifyTarget; 
            private String productCode; 
            private String quotaActionCode; 
            private java.util.Map<String, ?> quotaDimension; 
            private Float quotaUsage; 
            private Float quotaValue; 
            private Float threshold; 
            private Float thresholdPercent; 
            private String thresholdType; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(QuotaAlarm model) {
                this.alarmId = model.alarmId;
                this.alarmName = model.alarmName;
                this.createTime = model.createTime;
                this.notifyChannels = model.notifyChannels;
                this.notifyTarget = model.notifyTarget;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaDimension = model.quotaDimension;
                this.quotaUsage = model.quotaUsage;
                this.quotaValue = model.quotaValue;
                this.threshold = model.threshold;
                this.thresholdPercent = model.thresholdPercent;
                this.thresholdType = model.thresholdType;
                this.webhook = model.webhook;
            } 

            /**
             * <p>The ID of the quota alert.</p>
             * 
             * <strong>example:</strong>
             * <p>78d7e436-4b25-4897-84b5-d7b656bb****</p>
             */
            public Builder alarmId(String alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>The name of the quota alert.</p>
             * 
             * <strong>example:</strong>
             * <p>q_security-groups alarm</p>
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * <p>The time when the quota alert was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-21T03:47:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The notification channels for the alert.</p>
             */
            public Builder notifyChannels(java.util.List<String> notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * <p>The notification recipient of the quota alert.</p>
             * 
             * <strong>example:</strong>
             * <p>accountContact</p>
             */
            public Builder notifyTarget(String notifyTarget) {
                this.notifyTarget = notifyTarget;
                return this;
            }

            /**
             * <p>The abbreviation of the cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>q_security-groups</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The quota dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder quotaDimension(java.util.Map<String, ?> quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * <p>The quota usage.</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder quotaUsage(Float quotaUsage) {
                this.quotaUsage = quotaUsage;
                return this;
            }

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>804</p>
             */
            public Builder quotaValue(Float quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * <p>The numeric value of the quota alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The percentage of the quota alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder thresholdPercent(Float thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            /**
             * <p>The Alarm Metric of the quota alerting. Valid values:</p>
             * <ul>
             * <li>used: Alerting on the used quota usage.</li>
             * <li>usable: Alerting on the remaining active quota.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>used</p>
             */
            public Builder thresholdType(String thresholdType) {
                this.thresholdType = thresholdType;
                return this;
            }

            /**
             * <p>The public URL to which Quota Center sends alert messages by using HTTP POST requests.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alert.aliyun.com/callback">https://alert.aliyun.com/callback</a></p>
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
