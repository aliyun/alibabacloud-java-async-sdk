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
 * {@link ListQuotaAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaAlarmsResponseBody</p>
 */
public class ListQuotaAlarmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QuotaAlarms")
    private java.util.List<QuotaAlarms> quotaAlarms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListQuotaAlarmsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quotaAlarms = builder.quotaAlarms;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaAlarmsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return quotaAlarms
     */
    public java.util.List<QuotaAlarms> getQuotaAlarms() {
        return this.quotaAlarms;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<QuotaAlarms> quotaAlarms; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListQuotaAlarmsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.quotaAlarms = model.quotaAlarms;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of records returned for the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <blockquote>
         * <p>If this parameter is empty, all results have been returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The details of the quota usage alerts.</p>
         */
        public Builder quotaAlarms(java.util.List<QuotaAlarms> quotaAlarms) {
            this.quotaAlarms = quotaAlarms;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87F3B755-3BD2-4C76-B36A-93247002918C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of quota usage alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaAlarmsResponseBody build() {
            return new ListQuotaAlarmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaAlarmsResponseBody</p>
     */
    public static class QuotaAlarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private String alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExceedThreshold")
        private Boolean exceedThreshold;

        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List<String> notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyTarget")
        private String notifyTarget;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaDimensions")
        private java.util.Map<String, ?> quotaDimensions;

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

        @com.aliyun.core.annotation.NameInMap("WebHook")
        private String webHook;

        private QuotaAlarms(Builder builder) {
            this.alarmId = builder.alarmId;
            this.alarmName = builder.alarmName;
            this.createTime = builder.createTime;
            this.exceedThreshold = builder.exceedThreshold;
            this.notifyChannels = builder.notifyChannels;
            this.notifyTarget = builder.notifyTarget;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaDimensions = builder.quotaDimensions;
            this.quotaUsage = builder.quotaUsage;
            this.quotaValue = builder.quotaValue;
            this.threshold = builder.threshold;
            this.thresholdPercent = builder.thresholdPercent;
            this.thresholdType = builder.thresholdType;
            this.webHook = builder.webHook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaAlarms create() {
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
         * @return exceedThreshold
         */
        public Boolean getExceedThreshold() {
            return this.exceedThreshold;
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
         * @return quotaDimensions
         */
        public java.util.Map<String, ?> getQuotaDimensions() {
            return this.quotaDimensions;
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
         * @return webHook
         */
        public String getWebHook() {
            return this.webHook;
        }

        public static final class Builder {
            private String alarmId; 
            private String alarmName; 
            private String createTime; 
            private Boolean exceedThreshold; 
            private java.util.List<String> notifyChannels; 
            private String notifyTarget; 
            private String productCode; 
            private String quotaActionCode; 
            private java.util.Map<String, ?> quotaDimensions; 
            private Float quotaUsage; 
            private Float quotaValue; 
            private Float threshold; 
            private Float thresholdPercent; 
            private String thresholdType; 
            private String webHook; 

            private Builder() {
            } 

            private Builder(QuotaAlarms model) {
                this.alarmId = model.alarmId;
                this.alarmName = model.alarmName;
                this.createTime = model.createTime;
                this.exceedThreshold = model.exceedThreshold;
                this.notifyChannels = model.notifyChannels;
                this.notifyTarget = model.notifyTarget;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaDimensions = model.quotaDimensions;
                this.quotaUsage = model.quotaUsage;
                this.quotaValue = model.quotaValue;
                this.threshold = model.threshold;
                this.thresholdPercent = model.thresholdPercent;
                this.thresholdType = model.thresholdType;
                this.webHook = model.webHook;
            } 

            /**
             * <p>The alert ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a2efa7fc-832f-47bb-8054-39e28012****</p>
             */
            public Builder alarmId(String alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>The alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>q_hvnoqv alarm</p>
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * <p>The time when the quota usage alert was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-27T07:23:34Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the quota usage exceeds the alert threshold. Valid values:</p>
             * <ul>
             * <li><p>false</p>
             * </li>
             * <li><p>true</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder exceedThreshold(Boolean exceedThreshold) {
                this.exceedThreshold = exceedThreshold;
                return this;
            }

            /**
             * <p>The notification channels of the quota alert.</p>
             */
            public Builder notifyChannels(java.util.List<String> notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * <p>The notification object of the alert.</p>
             * <blockquote>
             * <p>The value can only be accountContact, which specifies the contacts of the account.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>accountContact</p>
             */
            public Builder notifyTarget(String notifyTarget) {
                this.notifyTarget = notifyTarget;
                return this;
            }

            /**
             * <p>The abbreviation of the Alibaba Cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>config</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>q_hvnoqv</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The quota dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder quotaDimensions(java.util.Map<String, ?> quotaDimensions) {
                this.quotaDimensions = quotaDimensions;
                return this;
            }

            /**
             * <p>The used quota.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder quotaUsage(Float quotaUsage) {
                this.quotaUsage = quotaUsage;
                return this;
            }

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder quotaValue(Float quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * <p>The numeric value of the alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>160</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The percentage of the alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder thresholdPercent(Float thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            /**
             * <p>The type of the quota alert. Valid values:</p>
             * <ul>
             * <li><p>used: an alert for the used quota.</p>
             * </li>
             * <li><p>usable: an alert for the available quota.</p>
             * </li>
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
             * <p>The webhook URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/webhook">https://www.aliyun.com/webhook</a></p>
             */
            public Builder webHook(String webHook) {
                this.webHook = webHook;
                return this;
            }

            public QuotaAlarms build() {
                return new QuotaAlarms(this);
            } 

        } 

    }
}
