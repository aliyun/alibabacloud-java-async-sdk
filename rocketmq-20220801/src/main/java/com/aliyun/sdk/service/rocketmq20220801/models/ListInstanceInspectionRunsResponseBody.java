// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListInstanceInspectionRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceInspectionRunsResponseBody</p>
 */
public class ListInstanceInspectionRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListInstanceInspectionRunsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceInspectionRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListInstanceInspectionRunsResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.total = model.total;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListInstanceInspectionRunsResponseBody build() {
            return new ListInstanceInspectionRunsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceInspectionRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionRunsResponseBody</p>
     */
    public static class AiSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("text")
        @com.aliyun.core.annotation.Validation(maxLength = 200)
        private String text;

        private AiSummary(Builder builder) {
            this.status = builder.status;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiSummary create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String status; 
            private String text; 

            private Builder() {
            } 

            private Builder(AiSummary model) {
                this.status = model.status;
                this.text = model.text;
            } 

            /**
             * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>仅生成成功时返回，最多 200 字，不由前端拼接或截取。</p>
             * 
             * <strong>example:</strong>
             * <p>本次巡检未发现风险，实例运行正常。</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public AiSummary build() {
                return new AiSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionRunsResponseBody</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Notification(Builder builder) {
            this.eventId = builder.eventId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eventId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Notification model) {
                this.eventId = model.eventId;
                this.status = model.status;
            } 

            /**
             * eventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionRunsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("infoCount")
        private Integer infoCount;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("riskCount")
        private Integer riskCount;

        private Summary(Builder builder) {
            this.infoCount = builder.infoCount;
            this.result = builder.result;
            this.riskCount = builder.riskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Integer getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public static final class Builder {
            private Integer infoCount; 
            private String result; 
            private Integer riskCount; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.infoCount = model.infoCount;
                this.result = model.result;
                this.riskCount = model.riskCount;
            } 

            /**
             * infoCount.
             */
            public Builder infoCount(Integer infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * riskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionRunsResponseBody</p>
     */
    public static class TimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private TimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(TimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceInspectionRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceInspectionRunsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiSummary")
        private AiSummary aiSummary;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("notification")
        private Notification notification;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("reportFinishedAt")
        private String reportFinishedAt;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("reportStatus")
        private String reportStatus;

        @com.aliyun.core.annotation.NameInMap("requestedAt")
        private String requestedAt;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("summary")
        private Summary summary;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private TimeRange timeRange;

        @com.aliyun.core.annotation.NameInMap("triggerSource")
        private String triggerSource;

        private Data(Builder builder) {
            this.aiSummary = builder.aiSummary;
            this.finishedAt = builder.finishedAt;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.notification = builder.notification;
            this.regionId = builder.regionId;
            this.reportFinishedAt = builder.reportFinishedAt;
            this.reportId = builder.reportId;
            this.reportStatus = builder.reportStatus;
            this.requestedAt = builder.requestedAt;
            this.runId = builder.runId;
            this.status = builder.status;
            this.summary = builder.summary;
            this.timeRange = builder.timeRange;
            this.triggerSource = builder.triggerSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aiSummary
         */
        public AiSummary getAiSummary() {
            return this.aiSummary;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
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

        /**
         * @return notification
         */
        public Notification getNotification() {
            return this.notification;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reportFinishedAt
         */
        public String getReportFinishedAt() {
            return this.reportFinishedAt;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        /**
         * @return requestedAt
         */
        public String getRequestedAt() {
            return this.requestedAt;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        /**
         * @return timeRange
         */
        public TimeRange getTimeRange() {
            return this.timeRange;
        }

        /**
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public static final class Builder {
            private AiSummary aiSummary; 
            private String finishedAt; 
            private String instanceId; 
            private String instanceName; 
            private Notification notification; 
            private String regionId; 
            private String reportFinishedAt; 
            private String reportId; 
            private String reportStatus; 
            private String requestedAt; 
            private String runId; 
            private String status; 
            private Summary summary; 
            private TimeRange timeRange; 
            private String triggerSource; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aiSummary = model.aiSummary;
                this.finishedAt = model.finishedAt;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.notification = model.notification;
                this.regionId = model.regionId;
                this.reportFinishedAt = model.reportFinishedAt;
                this.reportId = model.reportId;
                this.reportStatus = model.reportStatus;
                this.requestedAt = model.requestedAt;
                this.runId = model.runId;
                this.status = model.status;
                this.summary = model.summary;
                this.timeRange = model.timeRange;
                this.triggerSource = model.triggerSource;
            } 

            /**
             * <p>每次巡检结果由 LLM 总结；包含生成状态及成功后的原文，未生成时为空。</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder aiSummary(AiSummary aiSummary) {
                this.aiSummary = aiSummary;
                return this;
            }

            /**
             * finishedAt.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * notification.
             */
            public Builder notification(Notification notification) {
                this.notification = notification;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * reportFinishedAt.
             */
            public Builder reportFinishedAt(String reportFinishedAt) {
                this.reportFinishedAt = reportFinishedAt;
                return this;
            }

            /**
             * reportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * reportStatus.
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * requestedAt.
             */
            public Builder requestedAt(String requestedAt) {
                this.requestedAt = requestedAt;
                return this;
            }

            /**
             * runId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(TimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            /**
             * triggerSource.
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
