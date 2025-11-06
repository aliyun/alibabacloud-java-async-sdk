// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link ListInstanceAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceAlarmResponseBody</p>
 */
public class ListInstanceAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListInstanceAlarmResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceAlarmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListInstanceAlarmResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInstanceAlarmResponseBody build() {
            return new ListInstanceAlarmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceAlarmResponseBody</p>
     */
    public static class AlarmDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertState")
        private String alertState;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private String contactGroups;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @com.aliyun.core.annotation.NameInMap("EnableState")
        private Boolean enableState;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("MailSubject")
        private String mailSubject;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private String resources;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private String silenceTime;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private String times;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private AlarmDetail(Builder builder) {
            this.alertState = builder.alertState;
            this.comparisonOperator = builder.comparisonOperator;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.effectiveInterval = builder.effectiveInterval;
            this.enableState = builder.enableState;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.mailSubject = builder.mailSubject;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.noEffectiveInterval = builder.noEffectiveInterval;
            this.period = builder.period;
            this.resources = builder.resources;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.silenceTime = builder.silenceTime;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmDetail create() {
            return builder().build();
        }

        /**
         * @return alertState
         */
        public String getAlertState() {
            return this.alertState;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return contactGroups
         */
        public String getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return effectiveInterval
         */
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        /**
         * @return enableState
         */
        public Boolean getEnableState() {
            return this.enableState;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return mailSubject
         */
        public String getMailSubject() {
            return this.mailSubject;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return noEffectiveInterval
         */
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return resources
         */
        public String getResources() {
            return this.resources;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return silenceTime
         */
        public String getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public String getTimes() {
            return this.times;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String alertState; 
            private String comparisonOperator; 
            private String contactGroups; 
            private String dimensions; 
            private String effectiveInterval; 
            private Boolean enableState; 
            private String groupId; 
            private String groupName; 
            private String mailSubject; 
            private String metricName; 
            private String namespace; 
            private String noEffectiveInterval; 
            private String period; 
            private String resources; 
            private String ruleId; 
            private String ruleName; 
            private String silenceTime; 
            private String statistics; 
            private String threshold; 
            private String times; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(AlarmDetail model) {
                this.alertState = model.alertState;
                this.comparisonOperator = model.comparisonOperator;
                this.contactGroups = model.contactGroups;
                this.dimensions = model.dimensions;
                this.effectiveInterval = model.effectiveInterval;
                this.enableState = model.enableState;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.mailSubject = model.mailSubject;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.noEffectiveInterval = model.noEffectiveInterval;
                this.period = model.period;
                this.resources = model.resources;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.silenceTime = model.silenceTime;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
                this.webhook = model.webhook;
            } 

            /**
             * AlertState.
             */
            public Builder alertState(String alertState) {
                this.alertState = alertState;
                return this;
            }

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * EffectiveInterval.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * EnableState.
             */
            public Builder enableState(Boolean enableState) {
                this.enableState = enableState;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * MailSubject.
             */
            public Builder mailSubject(String mailSubject) {
                this.mailSubject = mailSubject;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * NoEffectiveInterval.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SilenceTime.
             */
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(String times) {
                this.times = times;
                return this;
            }

            /**
             * Webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public AlarmDetail build() {
                return new AlarmDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceAlarmResponseBody</p>
     */
    public static class AlarmDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmDetail")
        private java.util.List<AlarmDetail> alarmDetail;

        private AlarmDetails(Builder builder) {
            this.alarmDetail = builder.alarmDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmDetails create() {
            return builder().build();
        }

        /**
         * @return alarmDetail
         */
        public java.util.List<AlarmDetail> getAlarmDetail() {
            return this.alarmDetail;
        }

        public static final class Builder {
            private java.util.List<AlarmDetail> alarmDetail; 

            private Builder() {
            } 

            private Builder(AlarmDetails model) {
                this.alarmDetail = model.alarmDetail;
            } 

            /**
             * AlarmDetail.
             */
            public Builder alarmDetail(java.util.List<AlarmDetail> alarmDetail) {
                this.alarmDetail = alarmDetail;
                return this;
            }

            public AlarmDetails build() {
                return new AlarmDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceAlarmResponseBody</p>
     */
    public static class AlarmVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("AlarmDetails")
        private AlarmDetails alarmDetails;

        @com.aliyun.core.annotation.NameInMap("HasConfigAlarm")
        private Boolean hasConfigAlarm;

        private AlarmVO(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.alarmDetails = builder.alarmDetails;
            this.hasConfigAlarm = builder.hasConfigAlarm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmVO create() {
            return builder().build();
        }

        /**
         * @return alarmCount
         */
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        /**
         * @return alarmDetails
         */
        public AlarmDetails getAlarmDetails() {
            return this.alarmDetails;
        }

        /**
         * @return hasConfigAlarm
         */
        public Boolean getHasConfigAlarm() {
            return this.hasConfigAlarm;
        }

        public static final class Builder {
            private Integer alarmCount; 
            private AlarmDetails alarmDetails; 
            private Boolean hasConfigAlarm; 

            private Builder() {
            } 

            private Builder(AlarmVO model) {
                this.alarmCount = model.alarmCount;
                this.alarmDetails = model.alarmDetails;
                this.hasConfigAlarm = model.hasConfigAlarm;
            } 

            /**
             * AlarmCount.
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * AlarmDetails.
             */
            public Builder alarmDetails(AlarmDetails alarmDetails) {
                this.alarmDetails = alarmDetails;
                return this;
            }

            /**
             * HasConfigAlarm.
             */
            public Builder hasConfigAlarm(Boolean hasConfigAlarm) {
                this.hasConfigAlarm = hasConfigAlarm;
                return this;
            }

            public AlarmVO build() {
                return new AlarmVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceAlarmResponseBody</p>
     */
    public static class CommodityInstanceAlarmVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmVO")
        private AlarmVO alarmVO;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private CommodityInstanceAlarmVO(Builder builder) {
            this.alarmVO = builder.alarmVO;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityInstanceAlarmVO create() {
            return builder().build();
        }

        /**
         * @return alarmVO
         */
        public AlarmVO getAlarmVO() {
            return this.alarmVO;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private AlarmVO alarmVO; 
            private String instanceId; 
            private String instanceName; 

            private Builder() {
            } 

            private Builder(CommodityInstanceAlarmVO model) {
                this.alarmVO = model.alarmVO;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
            } 

            /**
             * AlarmVO.
             */
            public Builder alarmVO(AlarmVO alarmVO) {
                this.alarmVO = alarmVO;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public CommodityInstanceAlarmVO build() {
                return new CommodityInstanceAlarmVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceAlarmResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityInstanceAlarmVO")
        private java.util.List<CommodityInstanceAlarmVO> commodityInstanceAlarmVO;

        private VoList(Builder builder) {
            this.commodityInstanceAlarmVO = builder.commodityInstanceAlarmVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return commodityInstanceAlarmVO
         */
        public java.util.List<CommodityInstanceAlarmVO> getCommodityInstanceAlarmVO() {
            return this.commodityInstanceAlarmVO;
        }

        public static final class Builder {
            private java.util.List<CommodityInstanceAlarmVO> commodityInstanceAlarmVO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.commodityInstanceAlarmVO = model.commodityInstanceAlarmVO;
            } 

            /**
             * CommodityInstanceAlarmVO.
             */
            public Builder commodityInstanceAlarmVO(java.util.List<CommodityInstanceAlarmVO> commodityInstanceAlarmVO) {
                this.commodityInstanceAlarmVO = commodityInstanceAlarmVO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceAlarmResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("VoList")
        private VoList voList;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.voList = builder.voList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voList
         */
        public VoList getVoList() {
            return this.voList;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 
            private VoList voList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.voList = model.voList;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
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

            /**
             * VoList.
             */
            public Builder voList(VoList voList) {
                this.voList = voList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
