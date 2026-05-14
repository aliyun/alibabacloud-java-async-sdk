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
 * {@link ClinkStatIbResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkStatIbResponseBody</p>
 */
public class ClinkStatIbResponseBody extends TeaModel {
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

    private ClinkStatIbResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkStatIbResponseBody create() {
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

        private Builder(ClinkStatIbResponseBody model) {
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

        public ClinkStatIbResponseBody build() {
            return new ClinkStatIbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkStatIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkStatIbResponseBody</p>
     */
    public static class StatIb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnsweredAgentCount")
        private Long answeredAgentCount;

        @com.aliyun.core.annotation.NameInMap("AvgAnsweredAgentCount")
        private Long avgAnsweredAgentCount;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Hotline")
        private String hotline;

        @com.aliyun.core.annotation.NameInMap("HotlineName")
        private String hotlineName;

        @com.aliyun.core.annotation.NameInMap("IbAgentCount")
        private Long ibAgentCount;

        @com.aliyun.core.annotation.NameInMap("IbAnsweredCount")
        private Long ibAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbAnsweredQueueDuration")
        private Long ibAnsweredQueueDuration;

        @com.aliyun.core.annotation.NameInMap("IbAnsweredRate")
        private Double ibAnsweredRate;

        @com.aliyun.core.annotation.NameInMap("IbAvgAnsweredQueueDuration")
        private Long ibAvgAnsweredQueueDuration;

        @com.aliyun.core.annotation.NameInMap("IbAvgBridgeDuration")
        private Long ibAvgBridgeDuration;

        @com.aliyun.core.annotation.NameInMap("IbAvgDuration")
        private Long ibAvgDuration;

        @com.aliyun.core.annotation.NameInMap("IbAvgQueueDuration")
        private Long ibAvgQueueDuration;

        @com.aliyun.core.annotation.NameInMap("IbBotAnsweredCount")
        private Long ibBotAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbBotUnansweredCount")
        private Long ibBotUnansweredCount;

        @com.aliyun.core.annotation.NameInMap("IbBridgeDuration")
        private Long ibBridgeDuration;

        @com.aliyun.core.annotation.NameInMap("IbDirectAgentCount")
        private Long ibDirectAgentCount;

        @com.aliyun.core.annotation.NameInMap("IbDirectQueueCount")
        private Long ibDirectQueueCount;

        @com.aliyun.core.annotation.NameInMap("IbDirectTelCount")
        private Long ibDirectTelCount;

        @com.aliyun.core.annotation.NameInMap("IbIvrAnsweredCount")
        private Long ibIvrAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbIvrCount")
        private Long ibIvrCount;

        @com.aliyun.core.annotation.NameInMap("IbIvrNoQueueCount")
        private Long ibIvrNoQueueCount;

        @com.aliyun.core.annotation.NameInMap("IbIvrQueueCount")
        private Long ibIvrQueueCount;

        @com.aliyun.core.annotation.NameInMap("IbIvrQuickUnlinkCount")
        private Long ibIvrQuickUnlinkCount;

        @com.aliyun.core.annotation.NameInMap("IbIvrSystemAnsweredCount")
        private Long ibIvrSystemAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbIvrUnAnsweredCount")
        private Long ibIvrUnAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbNoIvrCount")
        private Long ibNoIvrCount;

        @com.aliyun.core.annotation.NameInMap("IbQueueCount")
        private Long ibQueueCount;

        @com.aliyun.core.annotation.NameInMap("IbQueueDuration")
        private Long ibQueueDuration;

        @com.aliyun.core.annotation.NameInMap("IbRestrictCount")
        private Long ibRestrictCount;

        @com.aliyun.core.annotation.NameInMap("IbRingingRangeCount")
        private Long ibRingingRangeCount;

        @com.aliyun.core.annotation.NameInMap("IbRingingRangeRate")
        private Double ibRingingRangeRate;

        @com.aliyun.core.annotation.NameInMap("IbSystemAnsweredCount")
        private Long ibSystemAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbSystemUnAnsweredCount")
        private Long ibSystemUnAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbTotalCount")
        private Long ibTotalCount;

        @com.aliyun.core.annotation.NameInMap("IbUnansweredCount")
        private Long ibUnansweredCount;

        @com.aliyun.core.annotation.NameInMap("IbVipCount")
        private Long ibVipCount;

        @com.aliyun.core.annotation.NameInMap("IbWebCount")
        private Long ibWebCount;

        @com.aliyun.core.annotation.NameInMap("IbtotalDuration")
        private Long ibtotalDuration;

        @com.aliyun.core.annotation.NameInMap("IvrDirectTelAnsweredCount")
        private Long ivrDirectTelAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IvrDirectTelCount")
        private Long ivrDirectTelCount;

        @com.aliyun.core.annotation.NameInMap("IvrDirectTelSysAnsweredCount")
        private Long ivrDirectTelSysAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IvrDirectTelUnansweredCount")
        private Long ivrDirectTelUnansweredCount;

        @com.aliyun.core.annotation.NameInMap("QuickUnlinkCount")
        private Long quickUnlinkCount;

        @com.aliyun.core.annotation.NameInMap("RepeatHotlineCount")
        private Long repeatHotlineCount;

        private StatIb(Builder builder) {
            this.answeredAgentCount = builder.answeredAgentCount;
            this.avgAnsweredAgentCount = builder.avgAnsweredAgentCount;
            this.date = builder.date;
            this.hotline = builder.hotline;
            this.hotlineName = builder.hotlineName;
            this.ibAgentCount = builder.ibAgentCount;
            this.ibAnsweredCount = builder.ibAnsweredCount;
            this.ibAnsweredQueueDuration = builder.ibAnsweredQueueDuration;
            this.ibAnsweredRate = builder.ibAnsweredRate;
            this.ibAvgAnsweredQueueDuration = builder.ibAvgAnsweredQueueDuration;
            this.ibAvgBridgeDuration = builder.ibAvgBridgeDuration;
            this.ibAvgDuration = builder.ibAvgDuration;
            this.ibAvgQueueDuration = builder.ibAvgQueueDuration;
            this.ibBotAnsweredCount = builder.ibBotAnsweredCount;
            this.ibBotUnansweredCount = builder.ibBotUnansweredCount;
            this.ibBridgeDuration = builder.ibBridgeDuration;
            this.ibDirectAgentCount = builder.ibDirectAgentCount;
            this.ibDirectQueueCount = builder.ibDirectQueueCount;
            this.ibDirectTelCount = builder.ibDirectTelCount;
            this.ibIvrAnsweredCount = builder.ibIvrAnsweredCount;
            this.ibIvrCount = builder.ibIvrCount;
            this.ibIvrNoQueueCount = builder.ibIvrNoQueueCount;
            this.ibIvrQueueCount = builder.ibIvrQueueCount;
            this.ibIvrQuickUnlinkCount = builder.ibIvrQuickUnlinkCount;
            this.ibIvrSystemAnsweredCount = builder.ibIvrSystemAnsweredCount;
            this.ibIvrUnAnsweredCount = builder.ibIvrUnAnsweredCount;
            this.ibNoIvrCount = builder.ibNoIvrCount;
            this.ibQueueCount = builder.ibQueueCount;
            this.ibQueueDuration = builder.ibQueueDuration;
            this.ibRestrictCount = builder.ibRestrictCount;
            this.ibRingingRangeCount = builder.ibRingingRangeCount;
            this.ibRingingRangeRate = builder.ibRingingRangeRate;
            this.ibSystemAnsweredCount = builder.ibSystemAnsweredCount;
            this.ibSystemUnAnsweredCount = builder.ibSystemUnAnsweredCount;
            this.ibTotalCount = builder.ibTotalCount;
            this.ibUnansweredCount = builder.ibUnansweredCount;
            this.ibVipCount = builder.ibVipCount;
            this.ibWebCount = builder.ibWebCount;
            this.ibtotalDuration = builder.ibtotalDuration;
            this.ivrDirectTelAnsweredCount = builder.ivrDirectTelAnsweredCount;
            this.ivrDirectTelCount = builder.ivrDirectTelCount;
            this.ivrDirectTelSysAnsweredCount = builder.ivrDirectTelSysAnsweredCount;
            this.ivrDirectTelUnansweredCount = builder.ivrDirectTelUnansweredCount;
            this.quickUnlinkCount = builder.quickUnlinkCount;
            this.repeatHotlineCount = builder.repeatHotlineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatIb create() {
            return builder().build();
        }

        /**
         * @return answeredAgentCount
         */
        public Long getAnsweredAgentCount() {
            return this.answeredAgentCount;
        }

        /**
         * @return avgAnsweredAgentCount
         */
        public Long getAvgAnsweredAgentCount() {
            return this.avgAnsweredAgentCount;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return hotline
         */
        public String getHotline() {
            return this.hotline;
        }

        /**
         * @return hotlineName
         */
        public String getHotlineName() {
            return this.hotlineName;
        }

        /**
         * @return ibAgentCount
         */
        public Long getIbAgentCount() {
            return this.ibAgentCount;
        }

        /**
         * @return ibAnsweredCount
         */
        public Long getIbAnsweredCount() {
            return this.ibAnsweredCount;
        }

        /**
         * @return ibAnsweredQueueDuration
         */
        public Long getIbAnsweredQueueDuration() {
            return this.ibAnsweredQueueDuration;
        }

        /**
         * @return ibAnsweredRate
         */
        public Double getIbAnsweredRate() {
            return this.ibAnsweredRate;
        }

        /**
         * @return ibAvgAnsweredQueueDuration
         */
        public Long getIbAvgAnsweredQueueDuration() {
            return this.ibAvgAnsweredQueueDuration;
        }

        /**
         * @return ibAvgBridgeDuration
         */
        public Long getIbAvgBridgeDuration() {
            return this.ibAvgBridgeDuration;
        }

        /**
         * @return ibAvgDuration
         */
        public Long getIbAvgDuration() {
            return this.ibAvgDuration;
        }

        /**
         * @return ibAvgQueueDuration
         */
        public Long getIbAvgQueueDuration() {
            return this.ibAvgQueueDuration;
        }

        /**
         * @return ibBotAnsweredCount
         */
        public Long getIbBotAnsweredCount() {
            return this.ibBotAnsweredCount;
        }

        /**
         * @return ibBotUnansweredCount
         */
        public Long getIbBotUnansweredCount() {
            return this.ibBotUnansweredCount;
        }

        /**
         * @return ibBridgeDuration
         */
        public Long getIbBridgeDuration() {
            return this.ibBridgeDuration;
        }

        /**
         * @return ibDirectAgentCount
         */
        public Long getIbDirectAgentCount() {
            return this.ibDirectAgentCount;
        }

        /**
         * @return ibDirectQueueCount
         */
        public Long getIbDirectQueueCount() {
            return this.ibDirectQueueCount;
        }

        /**
         * @return ibDirectTelCount
         */
        public Long getIbDirectTelCount() {
            return this.ibDirectTelCount;
        }

        /**
         * @return ibIvrAnsweredCount
         */
        public Long getIbIvrAnsweredCount() {
            return this.ibIvrAnsweredCount;
        }

        /**
         * @return ibIvrCount
         */
        public Long getIbIvrCount() {
            return this.ibIvrCount;
        }

        /**
         * @return ibIvrNoQueueCount
         */
        public Long getIbIvrNoQueueCount() {
            return this.ibIvrNoQueueCount;
        }

        /**
         * @return ibIvrQueueCount
         */
        public Long getIbIvrQueueCount() {
            return this.ibIvrQueueCount;
        }

        /**
         * @return ibIvrQuickUnlinkCount
         */
        public Long getIbIvrQuickUnlinkCount() {
            return this.ibIvrQuickUnlinkCount;
        }

        /**
         * @return ibIvrSystemAnsweredCount
         */
        public Long getIbIvrSystemAnsweredCount() {
            return this.ibIvrSystemAnsweredCount;
        }

        /**
         * @return ibIvrUnAnsweredCount
         */
        public Long getIbIvrUnAnsweredCount() {
            return this.ibIvrUnAnsweredCount;
        }

        /**
         * @return ibNoIvrCount
         */
        public Long getIbNoIvrCount() {
            return this.ibNoIvrCount;
        }

        /**
         * @return ibQueueCount
         */
        public Long getIbQueueCount() {
            return this.ibQueueCount;
        }

        /**
         * @return ibQueueDuration
         */
        public Long getIbQueueDuration() {
            return this.ibQueueDuration;
        }

        /**
         * @return ibRestrictCount
         */
        public Long getIbRestrictCount() {
            return this.ibRestrictCount;
        }

        /**
         * @return ibRingingRangeCount
         */
        public Long getIbRingingRangeCount() {
            return this.ibRingingRangeCount;
        }

        /**
         * @return ibRingingRangeRate
         */
        public Double getIbRingingRangeRate() {
            return this.ibRingingRangeRate;
        }

        /**
         * @return ibSystemAnsweredCount
         */
        public Long getIbSystemAnsweredCount() {
            return this.ibSystemAnsweredCount;
        }

        /**
         * @return ibSystemUnAnsweredCount
         */
        public Long getIbSystemUnAnsweredCount() {
            return this.ibSystemUnAnsweredCount;
        }

        /**
         * @return ibTotalCount
         */
        public Long getIbTotalCount() {
            return this.ibTotalCount;
        }

        /**
         * @return ibUnansweredCount
         */
        public Long getIbUnansweredCount() {
            return this.ibUnansweredCount;
        }

        /**
         * @return ibVipCount
         */
        public Long getIbVipCount() {
            return this.ibVipCount;
        }

        /**
         * @return ibWebCount
         */
        public Long getIbWebCount() {
            return this.ibWebCount;
        }

        /**
         * @return ibtotalDuration
         */
        public Long getIbtotalDuration() {
            return this.ibtotalDuration;
        }

        /**
         * @return ivrDirectTelAnsweredCount
         */
        public Long getIvrDirectTelAnsweredCount() {
            return this.ivrDirectTelAnsweredCount;
        }

        /**
         * @return ivrDirectTelCount
         */
        public Long getIvrDirectTelCount() {
            return this.ivrDirectTelCount;
        }

        /**
         * @return ivrDirectTelSysAnsweredCount
         */
        public Long getIvrDirectTelSysAnsweredCount() {
            return this.ivrDirectTelSysAnsweredCount;
        }

        /**
         * @return ivrDirectTelUnansweredCount
         */
        public Long getIvrDirectTelUnansweredCount() {
            return this.ivrDirectTelUnansweredCount;
        }

        /**
         * @return quickUnlinkCount
         */
        public Long getQuickUnlinkCount() {
            return this.quickUnlinkCount;
        }

        /**
         * @return repeatHotlineCount
         */
        public Long getRepeatHotlineCount() {
            return this.repeatHotlineCount;
        }

        public static final class Builder {
            private Long answeredAgentCount; 
            private Long avgAnsweredAgentCount; 
            private String date; 
            private String hotline; 
            private String hotlineName; 
            private Long ibAgentCount; 
            private Long ibAnsweredCount; 
            private Long ibAnsweredQueueDuration; 
            private Double ibAnsweredRate; 
            private Long ibAvgAnsweredQueueDuration; 
            private Long ibAvgBridgeDuration; 
            private Long ibAvgDuration; 
            private Long ibAvgQueueDuration; 
            private Long ibBotAnsweredCount; 
            private Long ibBotUnansweredCount; 
            private Long ibBridgeDuration; 
            private Long ibDirectAgentCount; 
            private Long ibDirectQueueCount; 
            private Long ibDirectTelCount; 
            private Long ibIvrAnsweredCount; 
            private Long ibIvrCount; 
            private Long ibIvrNoQueueCount; 
            private Long ibIvrQueueCount; 
            private Long ibIvrQuickUnlinkCount; 
            private Long ibIvrSystemAnsweredCount; 
            private Long ibIvrUnAnsweredCount; 
            private Long ibNoIvrCount; 
            private Long ibQueueCount; 
            private Long ibQueueDuration; 
            private Long ibRestrictCount; 
            private Long ibRingingRangeCount; 
            private Double ibRingingRangeRate; 
            private Long ibSystemAnsweredCount; 
            private Long ibSystemUnAnsweredCount; 
            private Long ibTotalCount; 
            private Long ibUnansweredCount; 
            private Long ibVipCount; 
            private Long ibWebCount; 
            private Long ibtotalDuration; 
            private Long ivrDirectTelAnsweredCount; 
            private Long ivrDirectTelCount; 
            private Long ivrDirectTelSysAnsweredCount; 
            private Long ivrDirectTelUnansweredCount; 
            private Long quickUnlinkCount; 
            private Long repeatHotlineCount; 

            private Builder() {
            } 

            private Builder(StatIb model) {
                this.answeredAgentCount = model.answeredAgentCount;
                this.avgAnsweredAgentCount = model.avgAnsweredAgentCount;
                this.date = model.date;
                this.hotline = model.hotline;
                this.hotlineName = model.hotlineName;
                this.ibAgentCount = model.ibAgentCount;
                this.ibAnsweredCount = model.ibAnsweredCount;
                this.ibAnsweredQueueDuration = model.ibAnsweredQueueDuration;
                this.ibAnsweredRate = model.ibAnsweredRate;
                this.ibAvgAnsweredQueueDuration = model.ibAvgAnsweredQueueDuration;
                this.ibAvgBridgeDuration = model.ibAvgBridgeDuration;
                this.ibAvgDuration = model.ibAvgDuration;
                this.ibAvgQueueDuration = model.ibAvgQueueDuration;
                this.ibBotAnsweredCount = model.ibBotAnsweredCount;
                this.ibBotUnansweredCount = model.ibBotUnansweredCount;
                this.ibBridgeDuration = model.ibBridgeDuration;
                this.ibDirectAgentCount = model.ibDirectAgentCount;
                this.ibDirectQueueCount = model.ibDirectQueueCount;
                this.ibDirectTelCount = model.ibDirectTelCount;
                this.ibIvrAnsweredCount = model.ibIvrAnsweredCount;
                this.ibIvrCount = model.ibIvrCount;
                this.ibIvrNoQueueCount = model.ibIvrNoQueueCount;
                this.ibIvrQueueCount = model.ibIvrQueueCount;
                this.ibIvrQuickUnlinkCount = model.ibIvrQuickUnlinkCount;
                this.ibIvrSystemAnsweredCount = model.ibIvrSystemAnsweredCount;
                this.ibIvrUnAnsweredCount = model.ibIvrUnAnsweredCount;
                this.ibNoIvrCount = model.ibNoIvrCount;
                this.ibQueueCount = model.ibQueueCount;
                this.ibQueueDuration = model.ibQueueDuration;
                this.ibRestrictCount = model.ibRestrictCount;
                this.ibRingingRangeCount = model.ibRingingRangeCount;
                this.ibRingingRangeRate = model.ibRingingRangeRate;
                this.ibSystemAnsweredCount = model.ibSystemAnsweredCount;
                this.ibSystemUnAnsweredCount = model.ibSystemUnAnsweredCount;
                this.ibTotalCount = model.ibTotalCount;
                this.ibUnansweredCount = model.ibUnansweredCount;
                this.ibVipCount = model.ibVipCount;
                this.ibWebCount = model.ibWebCount;
                this.ibtotalDuration = model.ibtotalDuration;
                this.ivrDirectTelAnsweredCount = model.ivrDirectTelAnsweredCount;
                this.ivrDirectTelCount = model.ivrDirectTelCount;
                this.ivrDirectTelSysAnsweredCount = model.ivrDirectTelSysAnsweredCount;
                this.ivrDirectTelUnansweredCount = model.ivrDirectTelUnansweredCount;
                this.quickUnlinkCount = model.quickUnlinkCount;
                this.repeatHotlineCount = model.repeatHotlineCount;
            } 

            /**
             * <p>接听电话座席数</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder answeredAgentCount(Long answeredAgentCount) {
                this.answeredAgentCount = answeredAgentCount;
                return this;
            }

            /**
             * <p>人均接听量</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder avgAnsweredAgentCount(Long avgAnsweredAgentCount) {
                this.avgAnsweredAgentCount = avgAnsweredAgentCount;
                return this;
            }

            /**
             * <p>日期（统计方式2为同步日期；统计方式3为分时信息，例 0-1时）</p>
             * 
             * <strong>example:</strong>
             * <p>20240203</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>热线号码</p>
             * 
             * <strong>example:</strong>
             * <p>Hotline</p>
             */
            public Builder hotline(String hotline) {
                this.hotline = hotline;
                return this;
            }

            /**
             * <p>热线别名</p>
             * 
             * <strong>example:</strong>
             * <p>HotlineName</p>
             */
            public Builder hotlineName(String hotlineName) {
                this.hotlineName = hotlineName;
                return this;
            }

            /**
             * <p>呼叫座席来电总数</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder ibAgentCount(Long ibAgentCount) {
                this.ibAgentCount = ibAgentCount;
                return this;
            }

            /**
             * <p>人工接听数</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder ibAnsweredCount(Long ibAnsweredCount) {
                this.ibAnsweredCount = ibAnsweredCount;
                return this;
            }

            /**
             * <p>人工接听排队总时长</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder ibAnsweredQueueDuration(Long ibAnsweredQueueDuration) {
                this.ibAnsweredQueueDuration = ibAnsweredQueueDuration;
                return this;
            }

            /**
             * <p>呼入人工接听率</p>
             * 
             * <strong>example:</strong>
             * <p>0.28</p>
             */
            public Builder ibAnsweredRate(Double ibAnsweredRate) {
                this.ibAnsweredRate = ibAnsweredRate;
                return this;
            }

            /**
             * <p>人工接听平均排队时长</p>
             * 
             * <strong>example:</strong>
             * <p>93</p>
             */
            public Builder ibAvgAnsweredQueueDuration(Long ibAvgAnsweredQueueDuration) {
                this.ibAvgAnsweredQueueDuration = ibAvgAnsweredQueueDuration;
                return this;
            }

            /**
             * <p>呼入平均通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder ibAvgBridgeDuration(Long ibAvgBridgeDuration) {
                this.ibAvgBridgeDuration = ibAvgBridgeDuration;
                return this;
            }

            /**
             * <p>呼入平均时长</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder ibAvgDuration(Long ibAvgDuration) {
                this.ibAvgDuration = ibAvgDuration;
                return this;
            }

            /**
             * <p>进入队列平均排队时长</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder ibAvgQueueDuration(Long ibAvgQueueDuration) {
                this.ibAvgQueueDuration = ibAvgQueueDuration;
                return this;
            }

            /**
             * <p>机器人应答数</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder ibBotAnsweredCount(Long ibBotAnsweredCount) {
                this.ibBotAnsweredCount = ibBotAnsweredCount;
                return this;
            }

            /**
             * <p>机器人未应答数</p>
             * 
             * <strong>example:</strong>
             * <p>79</p>
             */
            public Builder ibBotUnansweredCount(Long ibBotUnansweredCount) {
                this.ibBotUnansweredCount = ibBotUnansweredCount;
                return this;
            }

            /**
             * <p>呼入通话总时长（客户侧）</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder ibBridgeDuration(Long ibBridgeDuration) {
                this.ibBridgeDuration = ibBridgeDuration;
                return this;
            }

            /**
             * <p>直转座席数</p>
             * 
             * <strong>example:</strong>
             * <p>61</p>
             */
            public Builder ibDirectAgentCount(Long ibDirectAgentCount) {
                this.ibDirectAgentCount = ibDirectAgentCount;
                return this;
            }

            /**
             * <p>直转队列数</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder ibDirectQueueCount(Long ibDirectQueueCount) {
                this.ibDirectQueueCount = ibDirectQueueCount;
                return this;
            }

            /**
             * <p>直转电话/IP话机数</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder ibDirectTelCount(Long ibDirectTelCount) {
                this.ibDirectTelCount = ibDirectTelCount;
                return this;
            }

            /**
             * <p>进入IVR人工接听数</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder ibIvrAnsweredCount(Long ibIvrAnsweredCount) {
                this.ibIvrAnsweredCount = ibIvrAnsweredCount;
                return this;
            }

            /**
             * <p>进入IVR数</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder ibIvrCount(Long ibIvrCount) {
                this.ibIvrCount = ibIvrCount;
                return this;
            }

            /**
             * <p>进入IVR未转队列数</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder ibIvrNoQueueCount(Long ibIvrNoQueueCount) {
                this.ibIvrNoQueueCount = ibIvrNoQueueCount;
                return this;
            }

            /**
             * <p>进入IVR转队列数</p>
             * 
             * <strong>example:</strong>
             * <p>94</p>
             */
            public Builder ibIvrQueueCount(Long ibIvrQueueCount) {
                this.ibIvrQueueCount = ibIvrQueueCount;
                return this;
            }

            /**
             * <p>进入IVR客户速挂</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder ibIvrQuickUnlinkCount(Long ibIvrQuickUnlinkCount) {
                this.ibIvrQuickUnlinkCount = ibIvrQuickUnlinkCount;
                return this;
            }

            /**
             * <p>进入IVR系统应答数</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ibIvrSystemAnsweredCount(Long ibIvrSystemAnsweredCount) {
                this.ibIvrSystemAnsweredCount = ibIvrSystemAnsweredCount;
                return this;
            }

            /**
             * <p>进入IVR人工未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder ibIvrUnAnsweredCount(Long ibIvrUnAnsweredCount) {
                this.ibIvrUnAnsweredCount = ibIvrUnAnsweredCount;
                return this;
            }

            /**
             * <p>未进入IVR数</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ibNoIvrCount(Long ibNoIvrCount) {
                this.ibNoIvrCount = ibNoIvrCount;
                return this;
            }

            /**
             * <p>进入队列来电通数</p>
             * 
             * <strong>example:</strong>
             * <p>91</p>
             */
            public Builder ibQueueCount(Long ibQueueCount) {
                this.ibQueueCount = ibQueueCount;
                return this;
            }

            /**
             * <p>进入队列排队总时长</p>
             * 
             * <strong>example:</strong>
             * <p>79</p>
             */
            public Builder ibQueueDuration(Long ibQueueDuration) {
                this.ibQueueDuration = ibQueueDuration;
                return this;
            }

            /**
             * <p>黑名单来电数</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder ibRestrictCount(Long ibRestrictCount) {
                this.ibRestrictCount = ibRestrictCount;
                return this;
            }

            /**
             * <p>X秒接听数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ibRingingRangeCount(Long ibRingingRangeCount) {
                this.ibRingingRangeCount = ibRingingRangeCount;
                return this;
            }

            /**
             * <p>X秒接听率</p>
             * 
             * <strong>example:</strong>
             * <p>0.43</p>
             */
            public Builder ibRingingRangeRate(Double ibRingingRangeRate) {
                this.ibRingingRangeRate = ibRingingRangeRate;
                return this;
            }

            /**
             * <p>系统应答数</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder ibSystemAnsweredCount(Long ibSystemAnsweredCount) {
                this.ibSystemAnsweredCount = ibSystemAnsweredCount;
                return this;
            }

            /**
             * <p>系统未应答数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ibSystemUnAnsweredCount(Long ibSystemUnAnsweredCount) {
                this.ibSystemUnAnsweredCount = ibSystemUnAnsweredCount;
                return this;
            }

            /**
             * <p>来电总通数</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder ibTotalCount(Long ibTotalCount) {
                this.ibTotalCount = ibTotalCount;
                return this;
            }

            /**
             * <p>人工未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder ibUnansweredCount(Long ibUnansweredCount) {
                this.ibUnansweredCount = ibUnansweredCount;
                return this;
            }

            /**
             * <p>VIP呼入数</p>
             * 
             * <strong>example:</strong>
             * <p>77</p>
             */
            public Builder ibVipCount(Long ibVipCount) {
                this.ibVipCount = ibVipCount;
                return this;
            }

            /**
             * <p>网上400呼入数</p>
             * 
             * <strong>example:</strong>
             * <p>53</p>
             */
            public Builder ibWebCount(Long ibWebCount) {
                this.ibWebCount = ibWebCount;
                return this;
            }

            /**
             * <p>呼入总时长</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder ibtotalDuration(Long ibtotalDuration) {
                this.ibtotalDuration = ibtotalDuration;
                return this;
            }

            /**
             * <p>进入IVR直转电话/IP话机人工接听数</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder ivrDirectTelAnsweredCount(Long ivrDirectTelAnsweredCount) {
                this.ivrDirectTelAnsweredCount = ivrDirectTelAnsweredCount;
                return this;
            }

            /**
             * <p>进入IVR直转电话/IP话机数</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder ivrDirectTelCount(Long ivrDirectTelCount) {
                this.ivrDirectTelCount = ivrDirectTelCount;
                return this;
            }

            /**
             * <p>进入IVR直转电话/IP话机系统应答数</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ivrDirectTelSysAnsweredCount(Long ivrDirectTelSysAnsweredCount) {
                this.ivrDirectTelSysAnsweredCount = ivrDirectTelSysAnsweredCount;
                return this;
            }

            /**
             * <p>进入IVR直转电话/IP话机人工未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder ivrDirectTelUnansweredCount(Long ivrDirectTelUnansweredCount) {
                this.ivrDirectTelUnansweredCount = ivrDirectTelUnansweredCount;
                return this;
            }

            /**
             * <p>客户速挂数</p>
             * 
             * <strong>example:</strong>
             * <p>67</p>
             */
            public Builder quickUnlinkCount(Long quickUnlinkCount) {
                this.quickUnlinkCount = quickUnlinkCount;
                return this;
            }

            /**
             * <p>热线重复来电数</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder repeatHotlineCount(Long repeatHotlineCount) {
                this.repeatHotlineCount = repeatHotlineCount;
                return this;
            }

            public StatIb build() {
                return new StatIb(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkStatIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkStatIbResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("StatIb")
        private java.util.List<StatIb> statIb;

        private Data(Builder builder) {
            this.clinkRequestId = builder.clinkRequestId;
            this.statIb = builder.statIb;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return statIb
         */
        public java.util.List<StatIb> getStatIb() {
            return this.statIb;
        }

        public static final class Builder {
            private String clinkRequestId; 
            private java.util.List<StatIb> statIb; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clinkRequestId = model.clinkRequestId;
                this.statIb = model.statIb;
            } 

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * <p>报表数据（注：时长字段单位均为秒）</p>
             */
            public Builder statIb(java.util.List<StatIb> statIb) {
                this.statIb = statIb;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
